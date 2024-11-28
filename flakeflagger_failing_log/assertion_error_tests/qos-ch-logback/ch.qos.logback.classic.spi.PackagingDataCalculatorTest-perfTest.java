@Test public void perfTest(){
  int len=1000;
  loop(len,false);
  loop(len,true);
  double d0=loop(len,false);
  System.out.println("without packaging info " + d0 + " microseconds");
  double d1=loop(len,true);
  System.out.println("with    packaging info " + d1 + " microseconds");
  int slackFactor=8;
  if (!SystemInfo.getJavaVendor().contains("Sun")) {
    slackFactor=10;
  }
// --> Flaky assertion: possible message: computing class packaging data (614.398687) should have been less than 10 times the time it takes to process an exception 569.6274599999999;     assertTrue("computing class packaging data (" + d1
}
