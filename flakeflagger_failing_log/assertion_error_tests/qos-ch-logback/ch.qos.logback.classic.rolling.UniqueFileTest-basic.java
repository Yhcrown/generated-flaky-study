@Test public void basic() throws Exception {
  loadConfig(ClassicTestConstants.JORAN_INPUT_PREFIX + "unique.xml");
  CachingDateFormatter sdf=new CachingDateFormatter("yyyyMMdd'T'HHmmss");
  String timestamp=sdf.format(System.currentTimeMillis());
  sc.assertIsErrorFree();
  Logger root=lc.getLogger(Logger.ROOT_LOGGER_NAME);
  root.info("hello");
// --> Flaky assertion: possible message: File target/test-output/TS_20190911T222708log.txt does not exist; File target/test-output/TS_20190916T150902log.txt does not exist; File target/test-output/TS_20190914T100610log.txt does not exist; File target/test-output/TS_20190905T235823log.txt does not exist; File target/test-output/TS_20190915T155043log.txt does not exist; File target/test-output/TS_20190918T015453log.txt does not exist; File target/test-output/TS_20190828T231114log.txt does not exist; File target/test-output/TS_20190917T062540log.txt does not exist; File target/test-output/TS_20190913T201147log.txt does not exist; File target/test-output/TS_20190828T024943log.txt does not exist; File target/test-output/TS_20190906T060327log.txt does not exist; File target/test-output/TS_20190828T211136log.txt does not exist;     ScaffoldingForRollingTests.existenceCheck(CoreTestConstants.OUTPUT_DIR_PREFIX+"TS_"+timestamp+"log.txt");
}
