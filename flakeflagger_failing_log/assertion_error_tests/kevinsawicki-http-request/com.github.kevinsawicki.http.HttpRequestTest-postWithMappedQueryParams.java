/** 
 * Verify POST with query parameters
 * @throws Exception
 */
@Test public void postWithMappedQueryParams() throws Exception {
  Map<String,String> inputParams=new HashMap<String,String>();
  inputParams.put("name","user");
  inputParams.put("number","100");
  final Map<String,String> outputParams=new HashMap<String,String>();
  final AtomicReference<String> method=new AtomicReference<String>();
  handler=new RequestHandler(){
    @Override public void handle(    Request request,    HttpServletResponse response){
      method.set(request.getMethod());
      outputParams.put("name",request.getParameter("name"));
      outputParams.put("number",request.getParameter("number"));
      response.setStatus(HTTP_OK);
    }
  }
;
  HttpRequest request=post(url,inputParams,false);
  assertTrue(request.ok());
  assertEquals("POST",method.get());
// --> Flaky assertion: possible message: expected:<user> but was:<null>;     assertEquals("user", outputParams.get("name"));
  assertEquals("100",outputParams.get("number"));
}
