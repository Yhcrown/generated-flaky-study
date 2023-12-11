package flaky; 

import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTest{
    public static boolean debug = false;

	@Test
    public void test040_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        workload1.started();
        int int4 = workload1.getParallelUnits();
        long long5 = workload1.getExecutionTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1700471358476L) + "'", long5 == (-1700471358476L));
    }
	@Test
    public void test079_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        workload1.started();
        long long3 = workload1.getStarted();
        net.engio.pips.lab.workload.Workload.DurationSpecification durationSpecification4 = workload1.new DurationSpecification();
        net.engio.pips.lab.workload.Workload workload6 = durationSpecification4.repetitions((int) '#');
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700471362522L + "'", long3 == 1700471362522L);
        org.junit.Assert.assertNotNull(workload6);
    }
	@Test
    public void test096_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        workload1.started();
        long long3 = workload1.getStarted();
        net.engio.pips.lab.workload.Workload.DurationSpecification durationSpecification4 = workload1.new DurationSpecification();
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.engio.pips.lab.workload.Workload workload7 = durationSpecification4.lasts((int) 'a', timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal timeout condition:97null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700471364497L + "'", long3 == 1700471364497L);
    }
	@Test
    public void test105_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        net.engio.pips.lab.workload.ExecutionHandler executionHandler0 = null;
        net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper executionHandlerWrapper1 = new net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper(executionHandler0);
        net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper executionHandlerWrapper2 = new net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper(executionHandler0);
        net.engio.pips.lab.Benchmark benchmark4 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList5 = benchmark4.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter6 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter7 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter8 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray9 = new net.engio.pips.reports.IReporter[] { cSVFileExporter6, cSVFileExporter7, cSVFileExporter8 };
        benchmark4.generateReports(iReporterArray9);
        net.engio.pips.lab.ExecutionContext executionContext11 = new net.engio.pips.lab.ExecutionContext(benchmark4);
        net.engio.pips.lab.LabException.ErrorCode errorCode13 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10, errorCode13, 1.0f, '4' };
        net.engio.pips.lab.ExecutionContext executionContext17 = executionContext11.bindAll(objArray16);
        java.util.Collection<org.jfree.data.xy.AbstractIntervalXYDataset> abstractIntervalXYDatasetCollection19 = executionContext17.getMatching("run 1 times");
        net.engio.pips.lab.ExecutionContext executionContext20 = executionContext17.getChild();
        executionHandlerWrapper2.handle(executionContext17);
        executionContext17.finished();
        executionContext17.started();
        net.engio.pips.lab.workload.Workload workload26 = new net.engio.pips.lab.workload.Workload("");
        workload26.started();
        long long28 = workload26.getStarted();
        net.engio.pips.lab.workload.Workload.DurationSpecification durationSpecification29 = workload26.new DurationSpecification();
        net.engio.pips.lab.ExecutionContext executionContext30 = executionContext17.bind("Base path", (java.lang.Object) workload26);
        boolean boolean31 = executionContext17.isFinished();
        org.junit.Assert.assertNotNull(iDataCollectorList5);
        org.junit.Assert.assertNotNull(iReporterArray9);
        org.junit.Assert.assertTrue("'" + errorCode13 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode13.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext17);
        org.junit.Assert.assertNotNull(abstractIntervalXYDatasetCollection19);
        org.junit.Assert.assertNotNull(executionContext20);
         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1700471365373L + "'", long28 == 1700471365373L);
        org.junit.Assert.assertNotNull(executionContext30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }
	@Test
    public void test122_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList2 = benchmark1.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter3 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter4 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter5 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray6 = new net.engio.pips.reports.IReporter[] { cSVFileExporter3, cSVFileExporter4, cSVFileExporter5 };
        benchmark1.generateReports(iReporterArray6);
        net.engio.pips.lab.ExecutionContext executionContext8 = new net.engio.pips.lab.ExecutionContext(benchmark1);
        net.engio.pips.lab.LabException.ErrorCode errorCode10 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        java.lang.Object[] objArray13 = new java.lang.Object[] { 10, errorCode10, 1.0f, '4' };
        net.engio.pips.lab.ExecutionContext executionContext14 = executionContext8.bindAll(objArray13);
        net.engio.pips.lab.ExecutionContext executionContext15 = executionContext14.getChild();
        executionContext14.finished();
        net.engio.pips.lab.ExecutionContext executionContext17 = executionContext14.getChild();
        long long18 = executionContext14.getExecutionTime();
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(executionContext15);
        org.junit.Assert.assertNotNull(executionContext17);
         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1700471367115L + "'", long18 == 1700471367115L);
    }
	@Test
    public void test152_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        net.engio.pips.lab.workload.ExecutionHandler executionHandler0 = null;
        net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper executionHandlerWrapper1 = new net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper(executionHandler0);
        net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper executionHandlerWrapper2 = new net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper(executionHandler0);
        net.engio.pips.lab.Benchmark benchmark4 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList5 = benchmark4.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter6 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter7 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter8 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray9 = new net.engio.pips.reports.IReporter[] { cSVFileExporter6, cSVFileExporter7, cSVFileExporter8 };
        benchmark4.generateReports(iReporterArray9);
        net.engio.pips.lab.ExecutionContext executionContext11 = new net.engio.pips.lab.ExecutionContext(benchmark4);
        net.engio.pips.lab.LabException.ErrorCode errorCode13 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10, errorCode13, 1.0f, '4' };
        net.engio.pips.lab.ExecutionContext executionContext17 = executionContext11.bindAll(objArray16);
        java.util.Collection<org.jfree.data.xy.AbstractIntervalXYDataset> abstractIntervalXYDatasetCollection19 = executionContext17.getMatching("run 1 times");
        net.engio.pips.lab.ExecutionContext executionContext20 = executionContext17.getChild();
        executionHandlerWrapper2.handle(executionContext17);
        executionContext17.finished();
        executionContext17.started();
        net.engio.pips.lab.workload.Workload workload26 = new net.engio.pips.lab.workload.Workload("");
        workload26.started();
        long long28 = workload26.getStarted();
        net.engio.pips.lab.workload.Workload.DurationSpecification durationSpecification29 = workload26.new DurationSpecification();
        net.engio.pips.lab.ExecutionContext executionContext30 = executionContext17.bind("Base path", (java.lang.Object) workload26);
        java.lang.Object obj31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.util.Collection<net.engio.pips.data.IDataCollector>> iDataCollectorCollectionCollection32 = executionContext30.getAll(obj31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iDataCollectorList5);
        org.junit.Assert.assertNotNull(iReporterArray9);
        org.junit.Assert.assertTrue("'" + errorCode13 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode13.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext17);
        org.junit.Assert.assertNotNull(abstractIntervalXYDatasetCollection19);
        org.junit.Assert.assertNotNull(executionContext20);
         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1700471368212L + "'", long28 == 1700471368212L);
        org.junit.Assert.assertNotNull(executionContext30);
    }
	@Test
    public void test165_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        net.engio.pips.lab.Executions executions0 = new net.engio.pips.lab.Executions();
        java.util.Collection<java.lang.Object[]> objArrayCollection2 = executions0.getMatching("Sample interval");
        net.engio.pips.lab.Benchmark benchmark4 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList5 = benchmark4.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter6 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter7 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter8 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray9 = new net.engio.pips.reports.IReporter[] { cSVFileExporter6, cSVFileExporter7, cSVFileExporter8 };
        benchmark4.generateReports(iReporterArray9);
        net.engio.pips.lab.ExecutionContext executionContext11 = new net.engio.pips.lab.ExecutionContext(benchmark4);
        executionContext11.finished();
        long long13 = executionContext11.getExecutionTime();
        java.util.Collection<java.io.Flushable> flushableCollection14 = executions0.getAll((java.lang.Object) long13);
        java.util.Collection<net.engio.pips.lab.Executions> executionsCollection16 = executions0.getMatching("hi!");
        net.engio.pips.lab.workload.Workload workload18 = new net.engio.pips.lab.workload.Workload("");
        boolean boolean19 = workload18.hasTasksToRun();
        net.engio.pips.lab.workload.Workload workload21 = workload18.setDelay((long) '#');
        java.util.Collection<java.lang.CharSequence> charSequenceCollection22 = executions0.getAll((java.lang.Object) '#');
        org.junit.Assert.assertNotNull(objArrayCollection2);
        org.junit.Assert.assertNotNull(iDataCollectorList5);
        org.junit.Assert.assertNotNull(iReporterArray9);
         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1700471368650L + "'", long13 == 1700471368650L);
        org.junit.Assert.assertNotNull(flushableCollection14);
        org.junit.Assert.assertNotNull(executionsCollection16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(workload21);
        org.junit.Assert.assertNotNull(charSequenceCollection22);
    }
	@Test
    public void test212_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        workload1.started();
        long long3 = workload1.getStarted();
        net.engio.pips.lab.workload.Workload.DurationSpecification durationSpecification4 = workload1.new DurationSpecification();
        net.engio.pips.lab.workload.Workload workload6 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition7 = new net.engio.pips.lab.workload.StartCondition(workload6);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory8 = null;
        net.engio.pips.lab.workload.Workload workload9 = workload6.setITaskFactory(iTaskFactory8);
        net.engio.pips.lab.workload.StartCondition startCondition10 = workload9.getStartCondition();
        net.engio.pips.lab.workload.Duration duration11 = workload9.getDuration();
        int int12 = workload9.getParallelUnits();
        net.engio.pips.lab.workload.ExecutionEvent executionEvent13 = net.engio.pips.lab.workload.ExecutionEvent.TaskInitialization;
        net.engio.pips.lab.workload.ExecutionHandler executionHandler14 = workload9.getHandler(executionEvent13);
        net.engio.pips.lab.workload.Workload workload16 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition17 = new net.engio.pips.lab.workload.StartCondition(workload16);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory18 = null;
        net.engio.pips.lab.workload.Workload workload19 = workload16.setITaskFactory(iTaskFactory18);
        net.engio.pips.lab.workload.ExecutionEvent executionEvent20 = net.engio.pips.lab.workload.ExecutionEvent.WorkloadCompletion;
        net.engio.pips.lab.workload.ExecutionHandler executionHandler21 = workload16.getHandler(executionEvent20);
        net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper executionHandlerWrapper22 = new net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper(executionHandler21);
        net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper executionHandlerWrapper23 = new net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper(executionHandler21);
        net.engio.pips.lab.workload.Workload workload24 = workload1.handle(executionEvent13, executionHandler21);
        net.engio.pips.lab.workload.ExecutionEvent executionEvent25 = net.engio.pips.lab.workload.ExecutionEvent.WorkloadInitialization;
        net.engio.pips.lab.workload.ExecutionHandler executionHandler26 = workload1.getHandler(executionEvent25);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700471371341L + "'", long3 == 1700471371341L);
        org.junit.Assert.assertNotNull(workload9);
        org.junit.Assert.assertNull(startCondition10);
        org.junit.Assert.assertNull(duration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + executionEvent13 + "' != '" + net.engio.pips.lab.workload.ExecutionEvent.TaskInitialization + "'", executionEvent13.equals(net.engio.pips.lab.workload.ExecutionEvent.TaskInitialization));
        org.junit.Assert.assertNotNull(executionHandler14);
        org.junit.Assert.assertNotNull(workload19);
        org.junit.Assert.assertTrue("'" + executionEvent20 + "' != '" + net.engio.pips.lab.workload.ExecutionEvent.WorkloadCompletion + "'", executionEvent20.equals(net.engio.pips.lab.workload.ExecutionEvent.WorkloadCompletion));
        org.junit.Assert.assertNotNull(executionHandler21);
        org.junit.Assert.assertNotNull(workload24);
        org.junit.Assert.assertTrue("'" + executionEvent25 + "' != '" + net.engio.pips.lab.workload.ExecutionEvent.WorkloadInitialization + "'", executionEvent25.equals(net.engio.pips.lab.workload.ExecutionEvent.WorkloadInitialization));
        org.junit.Assert.assertNotNull(executionHandler26);
    }
	@Test
    public void test229_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        long long5 = workload4.getStarted();
        net.engio.pips.lab.workload.StartCondition startCondition6 = workload4.getStartCondition();
        net.engio.pips.lab.workload.Workload.StartSpecification startSpecification7 = workload4.starts();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        net.engio.pips.lab.workload.Workload workload10 = startSpecification7.after((int) (short) -1, timeUnit9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        net.engio.pips.lab.workload.Workload workload13 = startSpecification7.after(100, timeUnit12);
        net.engio.pips.lab.workload.Workload workload15 = new net.engio.pips.lab.workload.Workload("");
        workload15.started();
        long long17 = workload15.getStarted();
        net.engio.pips.lab.workload.Workload.DurationSpecification durationSpecification18 = workload15.new DurationSpecification();
        net.engio.pips.lab.workload.Workload workload20 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition21 = new net.engio.pips.lab.workload.StartCondition(workload20);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory22 = null;
        net.engio.pips.lab.workload.Workload workload23 = workload20.setITaskFactory(iTaskFactory22);
        net.engio.pips.lab.workload.StartCondition startCondition24 = workload23.getStartCondition();
        net.engio.pips.lab.workload.Duration duration25 = workload23.getDuration();
        int int26 = workload23.getParallelUnits();
        net.engio.pips.lab.workload.ExecutionEvent executionEvent27 = net.engio.pips.lab.workload.ExecutionEvent.TaskInitialization;
        net.engio.pips.lab.workload.ExecutionHandler executionHandler28 = workload23.getHandler(executionEvent27);
        net.engio.pips.lab.workload.Workload workload30 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition31 = new net.engio.pips.lab.workload.StartCondition(workload30);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory32 = null;
        net.engio.pips.lab.workload.Workload workload33 = workload30.setITaskFactory(iTaskFactory32);
        net.engio.pips.lab.workload.ExecutionEvent executionEvent34 = net.engio.pips.lab.workload.ExecutionEvent.WorkloadCompletion;
        net.engio.pips.lab.workload.ExecutionHandler executionHandler35 = workload30.getHandler(executionEvent34);
        net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper executionHandlerWrapper36 = new net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper(executionHandler35);
        net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper executionHandlerWrapper37 = new net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper(executionHandler35);
        net.engio.pips.lab.workload.Workload workload38 = workload15.handle(executionEvent27, executionHandler35);
        net.engio.pips.lab.workload.Workload workload40 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition41 = new net.engio.pips.lab.workload.StartCondition(workload40);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory42 = null;
        net.engio.pips.lab.workload.Workload workload43 = workload40.setITaskFactory(iTaskFactory42);
        net.engio.pips.lab.workload.StartCondition startCondition44 = workload43.getStartCondition();
        net.engio.pips.lab.workload.Duration duration45 = workload43.getDuration();
        int int46 = workload43.getParallelUnits();
        net.engio.pips.lab.workload.ExecutionEvent executionEvent47 = net.engio.pips.lab.workload.ExecutionEvent.TaskInitialization;
        net.engio.pips.lab.workload.ExecutionHandler executionHandler48 = workload43.getHandler(executionEvent47);
        net.engio.pips.lab.workload.Workload workload49 = workload13.handle(executionEvent27, executionHandler48);
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(startCondition6);
        org.junit.Assert.assertNotNull(startSpecification7);
        org.junit.Assert.assertNotNull(workload10);
        org.junit.Assert.assertNotNull(workload13);
         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1700471371650L + "'", long17 == 1700471371650L);
        org.junit.Assert.assertNotNull(workload23);
        org.junit.Assert.assertNull(startCondition24);
        org.junit.Assert.assertNull(duration25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + executionEvent27 + "' != '" + net.engio.pips.lab.workload.ExecutionEvent.TaskInitialization + "'", executionEvent27.equals(net.engio.pips.lab.workload.ExecutionEvent.TaskInitialization));
        org.junit.Assert.assertNotNull(executionHandler28);
        org.junit.Assert.assertNotNull(workload33);
        org.junit.Assert.assertTrue("'" + executionEvent34 + "' != '" + net.engio.pips.lab.workload.ExecutionEvent.WorkloadCompletion + "'", executionEvent34.equals(net.engio.pips.lab.workload.ExecutionEvent.WorkloadCompletion));
        org.junit.Assert.assertNotNull(executionHandler35);
        org.junit.Assert.assertNotNull(workload38);
        org.junit.Assert.assertNotNull(workload43);
        org.junit.Assert.assertNull(startCondition44);
        org.junit.Assert.assertNull(duration45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + executionEvent47 + "' != '" + net.engio.pips.lab.workload.ExecutionEvent.TaskInitialization + "'", executionEvent47.equals(net.engio.pips.lab.workload.ExecutionEvent.TaskInitialization));
        org.junit.Assert.assertNotNull(executionHandler48);
        org.junit.Assert.assertNotNull(workload49);
    }
	@Test
    public void test236_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        net.engio.pips.lab.workload.ExecutionHandler executionHandler0 = null;
        net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper executionHandlerWrapper1 = new net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper(executionHandler0);
        net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper executionHandlerWrapper2 = new net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper(executionHandler0);
        net.engio.pips.lab.Benchmark benchmark4 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList5 = benchmark4.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter6 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter7 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter8 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray9 = new net.engio.pips.reports.IReporter[] { cSVFileExporter6, cSVFileExporter7, cSVFileExporter8 };
        benchmark4.generateReports(iReporterArray9);
        net.engio.pips.lab.ExecutionContext executionContext11 = new net.engio.pips.lab.ExecutionContext(benchmark4);
        net.engio.pips.lab.LabException.ErrorCode errorCode13 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10, errorCode13, 1.0f, '4' };
        net.engio.pips.lab.ExecutionContext executionContext17 = executionContext11.bindAll(objArray16);
        java.util.Collection<org.jfree.data.xy.AbstractIntervalXYDataset> abstractIntervalXYDatasetCollection19 = executionContext17.getMatching("run 1 times");
        net.engio.pips.lab.ExecutionContext executionContext20 = executionContext17.getChild();
        executionHandlerWrapper2.handle(executionContext17);
        executionContext17.finished();
        executionContext17.started();
        net.engio.pips.lab.workload.Workload workload26 = new net.engio.pips.lab.workload.Workload("");
        workload26.started();
        long long28 = workload26.getStarted();
        net.engio.pips.lab.workload.Workload.DurationSpecification durationSpecification29 = workload26.new DurationSpecification();
        net.engio.pips.lab.ExecutionContext executionContext30 = executionContext17.bind("Base path", (java.lang.Object) workload26);
        executionContext17.started();
        org.junit.Assert.assertNotNull(iDataCollectorList5);
        org.junit.Assert.assertNotNull(iReporterArray9);
        org.junit.Assert.assertTrue("'" + errorCode13 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode13.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext17);
        org.junit.Assert.assertNotNull(abstractIntervalXYDatasetCollection19);
        org.junit.Assert.assertNotNull(executionContext20);
         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1700471371818L + "'", long28 == 1700471371818L);
        org.junit.Assert.assertNotNull(executionContext30);
    }
	@Test
    public void test238_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        net.engio.pips.lab.workload.ExecutionHandler executionHandler0 = null;
        net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper executionHandlerWrapper1 = new net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper(executionHandler0);
        net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper executionHandlerWrapper2 = new net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper(executionHandler0);
        net.engio.pips.lab.Benchmark benchmark4 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList5 = benchmark4.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter6 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter7 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter8 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray9 = new net.engio.pips.reports.IReporter[] { cSVFileExporter6, cSVFileExporter7, cSVFileExporter8 };
        benchmark4.generateReports(iReporterArray9);
        net.engio.pips.lab.ExecutionContext executionContext11 = new net.engio.pips.lab.ExecutionContext(benchmark4);
        net.engio.pips.lab.LabException.ErrorCode errorCode13 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10, errorCode13, 1.0f, '4' };
        net.engio.pips.lab.ExecutionContext executionContext17 = executionContext11.bindAll(objArray16);
        java.util.Collection<org.jfree.data.xy.AbstractIntervalXYDataset> abstractIntervalXYDatasetCollection19 = executionContext17.getMatching("run 1 times");
        net.engio.pips.lab.ExecutionContext executionContext20 = executionContext17.getChild();
        executionHandlerWrapper2.handle(executionContext17);
        executionContext17.finished();
        executionContext17.started();
        net.engio.pips.lab.workload.Workload workload26 = new net.engio.pips.lab.workload.Workload("");
        workload26.started();
        long long28 = workload26.getStarted();
        net.engio.pips.lab.workload.Workload.DurationSpecification durationSpecification29 = workload26.new DurationSpecification();
        net.engio.pips.lab.ExecutionContext executionContext30 = executionContext17.bind("Base path", (java.lang.Object) workload26);
        net.engio.pips.lab.Benchmark benchmark32 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList33 = benchmark32.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter34 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter35 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter36 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray37 = new net.engio.pips.reports.IReporter[] { cSVFileExporter34, cSVFileExporter35, cSVFileExporter36 };
        benchmark32.generateReports(iReporterArray37);
        net.engio.pips.lab.ExecutionContext executionContext39 = new net.engio.pips.lab.ExecutionContext(benchmark32);
        net.engio.pips.lab.Benchmark benchmark42 = new net.engio.pips.lab.Benchmark("hi!");
        net.engio.pips.data.DataCollectorManager dataCollectorManager43 = benchmark42.getCollectorManager();
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList45 = benchmark42.getCollectors("hi!");
        net.engio.pips.lab.Benchmark benchmark46 = benchmark32.setProperty("", (java.lang.Object) benchmark42);
        java.io.OutputStream outputStream47 = benchmark46.getLogStream();
        net.engio.pips.lab.Benchmark benchmark49 = benchmark46.setBasePath("Unknown startcondition");
        net.engio.pips.lab.workload.Workload workload51 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition52 = new net.engio.pips.lab.workload.StartCondition(workload51);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory53 = null;
        net.engio.pips.lab.workload.Workload workload54 = workload51.setITaskFactory(iTaskFactory53);
        net.engio.pips.lab.workload.StartCondition startCondition55 = workload54.getStartCondition();
        net.engio.pips.lab.workload.Duration duration56 = workload54.getDuration();
        boolean boolean57 = workload54.isFinished();
        net.engio.pips.lab.workload.Workload[] workloadArray58 = new net.engio.pips.lab.workload.Workload[] { workload54 };
        net.engio.pips.lab.Benchmark benchmark59 = benchmark49.addWorkload(workloadArray58);
        net.engio.pips.lab.ExecutionContext executionContext60 = executionContext17.bindAll((java.lang.Object[]) workloadArray58);
        org.junit.Assert.assertNotNull(iDataCollectorList5);
        org.junit.Assert.assertNotNull(iReporterArray9);
        org.junit.Assert.assertTrue("'" + errorCode13 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode13.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext17);
        org.junit.Assert.assertNotNull(abstractIntervalXYDatasetCollection19);
        org.junit.Assert.assertNotNull(executionContext20);
         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1700471371874L + "'", long28 == 1700471371874L);
        org.junit.Assert.assertNotNull(executionContext30);
        org.junit.Assert.assertNotNull(iDataCollectorList33);
        org.junit.Assert.assertNotNull(iReporterArray37);
        org.junit.Assert.assertNotNull(dataCollectorManager43);
        org.junit.Assert.assertNotNull(iDataCollectorList45);
        org.junit.Assert.assertNotNull(benchmark46);
        org.junit.Assert.assertNotNull(outputStream47);
        org.junit.Assert.assertNotNull(benchmark49);
        org.junit.Assert.assertNotNull(workload54);
        org.junit.Assert.assertNull(startCondition55);
        org.junit.Assert.assertNull(duration56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(workloadArray58);
        org.junit.Assert.assertNotNull(benchmark59);
        org.junit.Assert.assertNotNull(executionContext60);
    }
	@Test
    public void test243_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        net.engio.pips.lab.workload.ExecutionEvent executionEvent5 = net.engio.pips.lab.workload.ExecutionEvent.WorkloadCompletion;
        net.engio.pips.lab.workload.ExecutionHandler executionHandler6 = workload1.getHandler(executionEvent5);
        workload1.started();
        java.lang.String str8 = workload1.toString();
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + executionEvent5 + "' != '" + net.engio.pips.lab.workload.ExecutionEvent.WorkloadCompletion + "'", executionEvent5.equals(net.engio.pips.lab.workload.ExecutionEvent.WorkloadCompletion));
        org.junit.Assert.assertNotNull(executionHandler6);
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(-1700471372132ms)->Parallel tasks:1,null,null\n" + "'", str8, "(-1700471372132ms)->Parallel tasks:1,null,null\n");
    }
	@Test
    public void test247_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        workload1.started();
        long long3 = workload1.getStarted();
        boolean boolean4 = workload1.hasDelay();
        net.engio.pips.lab.workload.Duration duration5 = new net.engio.pips.lab.workload.Duration(workload1);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700471372162L + "'", long3 == 1700471372162L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }
}