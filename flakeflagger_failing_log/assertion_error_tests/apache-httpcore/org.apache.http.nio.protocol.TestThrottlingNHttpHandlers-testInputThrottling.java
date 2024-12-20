@Test public void testInputThrottling() throws Exception {
  HttpRequestExecutionHandler requestExecutionHandler=new HttpRequestExecutionHandler(){
    public void initalizeContext(    final HttpContext context,    final Object attachment){
      context.setAttribute("queue",attachment);
    }
    public HttpRequest submitRequest(    final HttpContext context){
      @SuppressWarnings("unchecked") Queue<Job> queue=(Queue<Job>)context.getAttribute("queue");
      if (queue == null) {
        throw new IllegalStateException("Queue is null");
      }
      Job testjob=queue.poll();
      context.setAttribute("job",testjob);
      if (testjob != null) {
        String s=testjob.getPattern() + "x" + testjob.getCount();
        HttpEntityEnclosingRequest r=new BasicHttpEntityEnclosingRequest("POST",s);
        StringEntity entity=null;
        try {
          entity=new StringEntity(testjob.getExpected(),"US-ASCII");
          entity.setChunked(testjob.getCount() % 2 == 0);
        }
 catch (        UnsupportedEncodingException ignore) {
        }
        r.setEntity(entity);
        return r;
      }
 else {
        return null;
      }
    }
    public void handleResponse(    final HttpResponse response,    final HttpContext context){
      Job testjob=(Job)context.removeAttribute("job");
      if (testjob == null) {
        throw new IllegalStateException("TestJob is null");
      }
      int statusCode=response.getStatusLine().getStatusCode();
      String content=null;
      HttpEntity entity=response.getEntity();
      if (entity != null) {
        try {
          ByteArrayOutputStream outstream=new ByteArrayOutputStream();
          InputStream instream=entity.getContent();
          byte[] tmp=new byte[2048];
          int l;
          while ((l=instream.read(tmp)) != -1) {
            Thread.sleep(1);
            outstream.write(tmp,0,l);
          }
          ContentType contentType=ContentType.getOrDefault(entity);
          String charset=contentType.getCharset();
          if (charset == null) {
            charset=HTTP.DEFAULT_CONTENT_CHARSET;
          }
          content=new String(outstream.toByteArray(),charset);
        }
 catch (        InterruptedException ex) {
          content="Interrupted: " + ex.getMessage();
        }
catch (        IOException ex) {
          content="I/O exception: " + ex.getMessage();
        }
      }
      testjob.setResult(statusCode,content);
    }
    public void finalizeContext(    final HttpContext context){
      Job testjob=(Job)context.removeAttribute("job");
      if (testjob != null) {
        testjob.fail("Request failed");
      }
    }
  }
;
  int connNo=3;
  int reqNo=20;
  Job[] jobs=new Job[connNo * reqNo];
  for (int i=0; i < jobs.length; i++) {
    jobs[i]=new Job(10000);
  }
  Queue<Job> queue=new ConcurrentLinkedQueue<Job>();
  for (int i=0; i < jobs.length; i++) {
    queue.add(jobs[i]);
  }
  HttpProcessor serverHttpProc=new ImmutableHttpProcessor(new HttpResponseInterceptor[]{new ResponseDate(),new ResponseServer(),new ResponseContent(),new ResponseConnControl()});
  ThrottlingHttpServiceHandler serviceHandler=new ThrottlingHttpServiceHandler(serverHttpProc,new DefaultHttpResponseFactory(),new DefaultConnectionReuseStrategy(),this.execService,this.server.getParams());
  serviceHandler.setHandlerResolver(new SimpleHttpRequestHandlerResolver(new RequestHandler()));
  serviceHandler.setEventListener(new SimpleEventListener());
  HttpProcessor clientHttpProc=new ImmutableHttpProcessor(new HttpRequestInterceptor[]{new RequestContent(),new RequestTargetHost(),new RequestConnControl(),new RequestUserAgent(),new RequestExpectContinue()});
  ThrottlingHttpClientHandler clientHandler=new ThrottlingHttpClientHandler(clientHttpProc,requestExecutionHandler,new DefaultConnectionReuseStrategy(),this.execService,this.client.getParams());
  clientHandler.setEventListener(new SimpleEventListener());
  this.server.start(serviceHandler);
  this.client.start(clientHandler);
  ListenerEndpoint endpoint=this.server.getListenerEndpoint();
  endpoint.waitFor();
  InetSocketAddress serverAddress=(InetSocketAddress)endpoint.getAddress();
  Assert.assertEquals("Test server status",IOReactorStatus.ACTIVE,this.server.getStatus());
  Queue<SessionRequest> connRequests=new LinkedList<SessionRequest>();
  for (int i=0; i < connNo; i++) {
    SessionRequest sessionRequest=this.client.openConnection(new InetSocketAddress("localhost",serverAddress.getPort()),queue);
    connRequests.add(sessionRequest);
  }
  while (!connRequests.isEmpty()) {
    SessionRequest sessionRequest=connRequests.remove();
    sessionRequest.waitFor();
    if (sessionRequest.getException() != null) {
      throw sessionRequest.getException();
    }
// --> Flaky assertion: possible message: ;             Assert.assertNotNull(sessionRequest.getSession());
  }
  Assert.assertEquals("Test client status",IOReactorStatus.ACTIVE,this.client.getStatus());
  for (int i=0; i < jobs.length; i++) {
    Job testjob=jobs[i];
    testjob.waitFor();
    if (testjob.isSuccessful()) {
      Assert.assertEquals(HttpStatus.SC_OK,testjob.getStatusCode());
      Assert.assertEquals(testjob.getExpected(),testjob.getResult());
    }
 else {
      Assert.fail(testjob.getFailureMessage());
    }
  }
}
