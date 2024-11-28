@Test public void testConcurrentOperations() throws InterruptedException {
  ActionQueue aq=new ActionQueue();
  String[] hosts=new String[]{"h0","h1","h2","h3","h4","h5","h6","h7","h8","h9"};
  ActionQueueOperation[] enqueOperators=new ActionQueueOperation[threadCount];
  ActionQueueOperation[] dequeOperators=new ActionQueueOperation[threadCount];
  ActionQueueOperation[] dequeAllOperators=new ActionQueueOperation[threadCount];
  for (int i=0; i < threadCount; i++) {
    dequeOperators[i]=new ActionQueueOperation(aq,hosts,ActionQueueOperation.OpType.DEQUEUE);
    Thread t=new Thread(dequeOperators[i]);
    t.start();
  }
  for (int i=0; i < threadCount; i++) {
    enqueOperators[i]=new ActionQueueOperation(aq,hosts,ActionQueueOperation.OpType.ENQUEUE);
    Thread t=new Thread(enqueOperators[i]);
    t.start();
  }
  for (int i=0; i < threadCount; i++) {
    dequeAllOperators[i]=new ActionQueueOperation(aq,hosts,ActionQueueOperation.OpType.DEQUEUEALL);
    Thread t=new Thread(dequeAllOperators[i]);
    t.start();
  }
  Thread.sleep(100);
  for (int i=0; i < threadCount; i++) {
    enqueOperators[i].stop();
  }
  boolean allDequeued=false;
  while (!allDequeued) {
    Thread.sleep(10);
    allDequeued=true;
    for (    String host : hosts) {
      if (aq.size(host) > 0) {
        allDequeued=false;
        break;
      }
    }
  }
  for (int i=0; i < threadCount; i++) {
    dequeOperators[i].stop();
    dequeAllOperators[i].stop();
  }
  for (int h=0; h < hosts.length; h++) {
    long opsEnqueued=0;
    long opsDequeued=0;
    for (int i=0; i < threadCount; i++) {
      opsEnqueued+=enqueOperators[i].getOpCounts()[h];
      opsDequeued+=dequeOperators[i].getOpCounts()[h];
      opsDequeued+=dequeAllOperators[i].getOpCounts()[h];
    }
    assertTrue(opsEnqueued != 0);
    assertEquals(0,aq.size(hosts[h]));
    LOG.info("Host: " + hosts[h] + ", opsEnqueued: "+ opsEnqueued+ ", opsDequeued: "+ opsDequeued);
// --> Flaky assertion: possible message: expected:<35608> but was:<35622>; expected:<127882> but was:<127884>; expected:<85574> but was:<85575>; expected:<94565> but was:<94570>; expected:<58462> but was:<58463>; expected:<83502> but was:<83503>; expected:<80679> but was:<80680>; expected:<64441> but was:<64443>; expected:<59678> but was:<59679>; expected:<22151> but was:<22152>; expected:<44885> but was:<44886>; expected:<27656> but was:<27657>; expected:<4418> but was:<4420>; expected:<61656> but was:<61658>; expected:<20498> but was:<20499>; expected:<73712> but was:<73714>; expected:<22374> but was:<22375>; expected:<95226> but was:<95255>; expected:<71474> but was:<71477>; expected:<93185> but was:<93186>; expected:<15994> but was:<15996>; expected:<70544> but was:<70545>; expected:<106612> but was:<106610>; expected:<228388> but was:<228389>; expected:<47350> but was:<47352>; expected:<16217> but was:<16216>; expected:<36448> but was:<36449>; expected:<61795> but was:<61887>; expected:<89114> but was:<89117>; expected:<109879> but was:<109880>; expected:<54851> but was:<54853>; expected:<117977> but was:<117978>; expected:<23002> but was:<23005>; expected:<23181> but was:<23182>; expected:<70777> but was:<70779>; expected:<35201> but was:<35202>; expected:<19098> but was:<19099>; expected:<46643> but was:<46719>; expected:<20402> but was:<20408>; expected:<44832> but was:<44836>; expected:<79092> but was:<79093>; expected:<109075> but was:<109077>; expected:<39816> but was:<39817>; expected:<87923> but was:<87924>; expected:<32553> but was:<32633>; expected:<81642> but was:<81644>; expected:<3394> but was:<3659>; expected:<104463> but was:<104464>; expected:<27214> but was:<27217>; expected:<70037> but was:<70042>; expected:<49735> but was:<49736>; expected:<35821> but was:<35823>;       assertEquals(opsDequeued, opsEnqueued);
  }
}
