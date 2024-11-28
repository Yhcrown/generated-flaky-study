/** 
 * This test should work when running at least on dual-core. It assumes that (P1(r1) + P2(r1) + P3(r1)) + (P1(r2) + P2(r2) + P3(r2)) > Parallel(P1(r1) + P2(r1) + P3(r1) | P1(r2) + P2(r2) + P3(r2))
 */
@Test public void preProcessingInParallelIsFaster() throws Exception {
  final int availableProcessors=Runtime.getRuntime().availableProcessors();
  LOG.info("availableProcessors: {}",availableProcessors);
  if (availableProcessors > 1) {
    final StopWatch watch=new StopWatch();
    final WroConfiguration config=Context.get().getConfig();
    initExecutor(createSlowPreProcessor(100),createSlowPreProcessor(100),createSlowPreProcessor(100));
    final List<Resource> resources=createResources(Resource.create("r1",ResourceType.JS),Resource.create("r2",ResourceType.JS));
    config.setParallelPreprocessing(true);
    victim.processAndMerge(resources,true);
    watch.start("parallel preProcessing");
    config.setParallelPreprocessing(true);
    victim.processAndMerge(resources,true);
    watch.stop();
    final long parallelExecution=watch.getLastTaskTimeMillis();
    config.setParallelPreprocessing(false);
    watch.start("sequential preProcessing");
    victim.processAndMerge(resources,true);
    watch.stop();
    final long sequentialExecution=watch.getLastTaskTimeMillis();
    final String message="Processing details: \n" + watch.prettyPrint();
    LOG.debug(message);
    final double delta=parallelExecution * 0.8;
// --> Flaky assertion: possible message: -556  > 302 + 241.60000000000002; -729  > 302 + 241.60000000000002; -650  > 303 + 242.4; -301  > 302 + 241.60000000000002; -314  > 303 + 242.4; 67  > 302 + 241.60000000000002; -403  > 302 + 241.60000000000002; -334  > 302 + 241.60000000000002; -228  > 302 + 241.60000000000002; 603  > 336 + 268.8; -318  > 302 + 241.60000000000002; 59  > 302 + 241.60000000000002; -164  > 302 + 241.60000000000002; 133  > 302 + 241.60000000000002; -89  > 302 + 241.60000000000002; 120  > 302 + 241.60000000000002; -721  > 303 + 242.4; 139  > 318 + 254.4; -583  > 302 + 241.60000000000002; 2  > 302 + 241.60000000000002; 604  > 336 + 268.8; -87  > 302 + 241.60000000000002; -911  > 303 + 242.4; -46  > 302 + 241.60000000000002; -144  > 302 + 241.60000000000002; -218  > 302 + 241.60000000000002; -193  > 303 + 242.4; 117  > 316 + 252.8; -145  > 302 + 241.60000000000002; -208  > 312 + 249.60000000000002; -50  > 301 + 240.8; -304  > 301 + 240.8; 153  > 302 + 241.60000000000002; -290  > 302 + 241.60000000000002; -380  > 302 + 241.60000000000002; 20  > 302 + 241.60000000000002; 172  > 303 + 242.4; 177  > 302 + 241.60000000000002; -68  > 301 + 240.8; -653  > 302 + 241.60000000000002; 137  > 302 + 241.60000000000002; -339  > 302 + 241.60000000000002; -380  > 301 + 240.8; 57  > 302 + 241.60000000000002; 187  > 303 + 242.4; -340  > 302 + 241.60000000000002; -764  > 301 + 240.8; -167  > 302 + 241.60000000000002; -369  > 302 + 241.60000000000002; 186  > 302 + 241.60000000000002; 79  > 302 + 241.60000000000002; -515  > 302 + 241.60000000000002; -613  > 302 + 241.60000000000002; 118  > 302 + 241.60000000000002; 603  > 861 + 688.8000000000001; -87  > 301 + 240.8; 166  > 302 + 241.60000000000002; -108  > 302 + 241.60000000000002;       Assert.assertTrue(String.format("%s  > %s + %s", sequentialExecution, parallelExecution, delta),
  }
}
