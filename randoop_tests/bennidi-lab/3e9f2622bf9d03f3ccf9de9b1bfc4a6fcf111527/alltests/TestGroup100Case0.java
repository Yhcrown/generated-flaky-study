import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestGroup100Case0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test001");
        java.lang.String str0 = net.engio.pips.lab.Benchmark.Properties.TimeoutInSeconds;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Timeout in seconds" + "'", str0, "Timeout in seconds");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        net.engio.pips.lab.Benchmark.Properties properties0 = new net.engio.pips.lab.Benchmark.Properties();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.lang.String str0 = net.engio.pips.lab.Benchmark.Properties.BasePath;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Base path" + "'", str0, "Base path");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.engio.pips.lab.workload.Duration duration2 = new net.engio.pips.lab.workload.Duration((int) (byte) 100, timeUnit1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal timeout condition:100null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        net.engio.pips.lab.LabException.ErrorCode errorCode0 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        org.junit.Assert.assertTrue("'" + errorCode0 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode0.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        net.engio.pips.lab.workload.Workload workload0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.engio.pips.lab.workload.Workload.DurationSpecification durationSpecification1 = workload0.new DurationSpecification();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to net.engio.pips.lab.workload.Workload$DurationSpecification with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        net.engio.pips.lab.LabException.ErrorCode errorCode0 = net.engio.pips.lab.LabException.ErrorCode.WLWithoutDuration;
        org.junit.Assert.assertTrue("'" + errorCode0 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithoutDuration + "'", errorCode0.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithoutDuration));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList2 = benchmark1.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter3 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter4 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter5 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray6 = new net.engio.pips.reports.IReporter[] { cSVFileExporter3, cSVFileExporter4, cSVFileExporter5 };
        benchmark1.generateReports(iReporterArray6);
        java.lang.Class<?> wildcardClass8 = benchmark1.getClass();
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        net.engio.pips.lab.workload.Workload workload0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.engio.pips.lab.workload.Workload.StartSpecification startSpecification1 = workload0.new StartSpecification();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to net.engio.pips.lab.workload.Workload$StartSpecification with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList2 = benchmark1.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter3 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter4 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter5 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray6 = new net.engio.pips.reports.IReporter[] { cSVFileExporter3, cSVFileExporter4, cSVFileExporter5 };
        benchmark1.generateReports(iReporterArray6);
        net.engio.pips.lab.ExecutionContext executionContext8 = new net.engio.pips.lab.ExecutionContext(benchmark1);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.engio.pips.lab.ExecutionContext executionContext10 = executionContext8.bindAll(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        java.lang.String str0 = net.engio.pips.lab.Benchmark.Properties.SampleInterval;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Sample interval" + "'", str0, "Sample interval");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        net.engio.pips.lab.common.ValueGenerator<net.engio.pips.lab.Benchmark> benchmarkValueGenerator0 = null;
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange2 = new net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark>(benchmarkValueGenerator0, (int) (short) 0);
        net.engio.pips.lab.Benchmark benchmark4 = benchmarkRange2.getElement(100);
        // The following exception was thrown during execution in test generation
        try {
            net.engio.pips.lab.Benchmark benchmark5 = benchmarkRange2.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(benchmark4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.lang.String str0 = net.engio.pips.lab.Benchmark.Properties.ReportBaseDir;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Report base dir" + "'", str0, "Report base dir");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList2 = benchmark1.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter3 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter4 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter5 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray6 = new net.engio.pips.reports.IReporter[] { cSVFileExporter3, cSVFileExporter4, cSVFileExporter5 };
        benchmark1.generateReports(iReporterArray6);
        net.engio.pips.lab.ExecutionContext executionContext8 = new net.engio.pips.lab.ExecutionContext(benchmark1);
        java.util.Collection<net.engio.pips.data.IDataCollector> iDataCollectorCollection10 = benchmark1.getProperty("hi!");
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertNull(iDataCollectorCollection10);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        net.engio.pips.lab.LabException.ErrorCode errorCode0 = net.engio.pips.lab.LabException.ErrorCode.WLWithoutStart;
        org.junit.Assert.assertTrue("'" + errorCode0 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithoutStart + "'", errorCode0.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithoutStart));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        net.engio.pips.lab.common.ValueGenerator<net.engio.pips.lab.Benchmark> benchmarkValueGenerator0 = null;
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange2 = new net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark>(benchmarkValueGenerator0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            net.engio.pips.lab.Benchmark benchmark3 = benchmarkRange2.getRandomElement();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        net.engio.pips.lab.LabException.ErrorCode errorCode0 = net.engio.pips.lab.LabException.ErrorCode.WLWithoutFactory;
        java.lang.Class<?> wildcardClass1 = errorCode0.getClass();
        org.junit.Assert.assertTrue("'" + errorCode0 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithoutFactory + "'", errorCode0.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithoutFactory));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        net.engio.pips.lab.common.ValueGenerator<net.engio.pips.lab.Benchmark> benchmarkValueGenerator0 = null;
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange2 = new net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark>(benchmarkValueGenerator0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange3 = benchmarkRange2.startWithRandomIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.lang.String str0 = net.engio.pips.lab.Benchmark.Properties.Title;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Title" + "'", str0, "Title");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        net.engio.pips.lab.Laboratory laboratory0 = new net.engio.pips.lab.Laboratory();
        net.engio.pips.lab.Benchmark benchmark2 = new net.engio.pips.lab.Benchmark("hi!");
        net.engio.pips.data.DataCollectorManager dataCollectorManager3 = benchmark2.getCollectorManager();
        net.engio.pips.lab.Benchmark benchmark5 = new net.engio.pips.lab.Benchmark("hi!");
        net.engio.pips.data.DataCollectorManager dataCollectorManager6 = benchmark5.getCollectorManager();
        net.engio.pips.reports.SeriesGroup seriesGroup8 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation9 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup10 = seriesGroup8.setYAxisOrientation(orientation9);
        net.engio.pips.lab.Benchmark benchmark12 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str13 = benchmark12.getReportBaseDir();
        java.lang.String str14 = benchmark12.toString();
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection15 = seriesGroup8.createDataSet(benchmark12);
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList17 = benchmark12.getCollectors("run 1 times");
        net.engio.pips.lab.Benchmark[] benchmarkArray18 = new net.engio.pips.lab.Benchmark[] { benchmark2, benchmark5, benchmark12 };
        // The following exception was thrown during execution in test generation
        try {
            laboratory0.run(benchmarkArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataCollectorManager3);
        org.junit.Assert.assertNotNull(dataCollectorManager6);
        org.junit.Assert.assertTrue("'" + orientation9 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation9.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str14, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(timeSeriesCollection15);
        org.junit.Assert.assertNotNull(iDataCollectorList17);
        org.junit.Assert.assertNotNull(benchmarkArray18);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
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
        net.engio.pips.reports.SeriesGroup seriesGroup18 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation19 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup20 = seriesGroup18.setYAxisOrientation(orientation19);
        net.engio.pips.reports.SeriesGroup.Orientation orientation21 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup22 = seriesGroup18.setYAxisOrientation(orientation21);
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList23 = executionContext14.get((java.lang.Object) seriesGroup22);
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection25 = executionContext14.getMatching("Sample interval");
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(executionContext15);
        org.junit.Assert.assertTrue("'" + orientation19 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation19.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup20);
        org.junit.Assert.assertTrue("'" + orientation21 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation21.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup22);
        org.junit.Assert.assertNull(iDataCollectorList23);
        org.junit.Assert.assertNotNull(strComparableCollection25);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("run 1 times");
        net.engio.pips.lab.Executions executions2 = benchmark1.getExecutions();
        org.junit.Assert.assertNull(executions2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.engio.pips.lab.workload.Duration duration2 = new net.engio.pips.lab.workload.Duration(10, timeUnit1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal timeout condition:10null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation2 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup3 = seriesGroup1.setYAxisOrientation(orientation2);
        net.engio.pips.reports.SeriesGroup.Orientation orientation4 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup5 = seriesGroup1.setYAxisOrientation(orientation4);
        net.engio.pips.lab.Benchmark benchmark7 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList8 = benchmark7.getCollectors();
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList10 = benchmark7.getCollectors("");
        net.engio.pips.reports.SeriesGroup seriesGroup11 = seriesGroup5.addCollectors(iDataCollectorList10);
        int int12 = seriesGroup5.getSize();
        org.junit.Assert.assertTrue("'" + orientation2 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation2.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup3);
        org.junit.Assert.assertTrue("'" + orientation4 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation4.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup5);
        org.junit.Assert.assertNotNull(iDataCollectorList8);
        org.junit.Assert.assertNotNull(iDataCollectorList10);
        org.junit.Assert.assertNotNull(seriesGroup11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList2 = benchmark1.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter3 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter4 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter5 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray6 = new net.engio.pips.reports.IReporter[] { cSVFileExporter3, cSVFileExporter4, cSVFileExporter5 };
        benchmark1.generateReports(iReporterArray6);
        net.engio.pips.lab.ExecutionContext executionContext8 = new net.engio.pips.lab.ExecutionContext(benchmark1);
        // The following exception was thrown during execution in test generation
        try {
            net.engio.pips.reports.SeriesGroup.Orientation orientation10 = benchmark1.getProperty("Report base dir");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.String to net.engio.pips.reports.SeriesGroup$Orientation");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("Experiment hi! with 0 workloads\n\nand additional parameters:\n");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        net.engio.pips.lab.common.ValueGenerator<net.engio.pips.lab.Benchmark> benchmarkValueGenerator0 = null;
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange2 = new net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark>(benchmarkValueGenerator0, (int) (short) 0);
        net.engio.pips.lab.Benchmark benchmark4 = benchmarkRange2.getElement(100);
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange5 = benchmarkRange2.shuffle();
        // The following exception was thrown during execution in test generation
        try {
            net.engio.pips.lab.Benchmark benchmark6 = benchmarkRange5.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(benchmark4);
        org.junit.Assert.assertNotNull(benchmarkRange5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str2 = benchmark1.getReportBaseDir();
        java.lang.String str3 = benchmark1.toString();
        net.engio.pips.lab.Benchmark benchmark5 = benchmark1.setBasePath("hi!");
        net.engio.pips.data.DataCollectorManager dataCollectorManager6 = benchmark1.getCollectorManager();
        net.engio.pips.lab.Benchmark benchmark8 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList9 = benchmark8.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter10 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter11 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter12 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray13 = new net.engio.pips.reports.IReporter[] { cSVFileExporter10, cSVFileExporter11, cSVFileExporter12 };
        benchmark8.generateReports(iReporterArray13);
        net.engio.pips.lab.ExecutionContext executionContext15 = new net.engio.pips.lab.ExecutionContext(benchmark8);
        net.engio.pips.lab.LabException.ErrorCode errorCode17 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10, errorCode17, 1.0f, '4' };
        net.engio.pips.lab.ExecutionContext executionContext21 = executionContext15.bindAll(objArray20);
        java.util.Collection<org.jfree.data.xy.AbstractIntervalXYDataset> abstractIntervalXYDatasetCollection23 = executionContext21.getMatching("run 1 times");
        net.engio.pips.lab.ExecutionContext executionContext24 = executionContext21.getChild();
        net.engio.pips.data.DataCollectorManager dataCollectorManager26 = executionContext21.get((java.lang.Object) 0.0d);
        net.engio.pips.lab.Benchmark benchmark28 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList29 = benchmark28.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter30 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter31 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter32 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray33 = new net.engio.pips.reports.IReporter[] { cSVFileExporter30, cSVFileExporter31, cSVFileExporter32 };
        benchmark28.generateReports(iReporterArray33);
        net.engio.pips.lab.ExecutionContext executionContext35 = executionContext21.bindAll((java.lang.Object[]) iReporterArray33);
        benchmark1.generateReports(iReporterArray33);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str3, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(benchmark5);
        org.junit.Assert.assertNotNull(dataCollectorManager6);
        org.junit.Assert.assertNotNull(iDataCollectorList9);
        org.junit.Assert.assertNotNull(iReporterArray13);
        org.junit.Assert.assertTrue("'" + errorCode17 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode17.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext21);
        org.junit.Assert.assertNotNull(abstractIntervalXYDatasetCollection23);
        org.junit.Assert.assertNotNull(executionContext24);
        org.junit.Assert.assertNull(dataCollectorManager26);
        org.junit.Assert.assertNotNull(iDataCollectorList29);
        org.junit.Assert.assertNotNull(iReporterArray33);
        org.junit.Assert.assertNotNull(executionContext35);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        net.engio.pips.lab.common.ValueGenerator<java.lang.Iterable<net.engio.pips.data.IDataCollector>> iDataCollectorIterableValueGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.engio.pips.lab.common.Range<java.lang.Iterable<net.engio.pips.data.IDataCollector>> iDataCollectorIterableRange2 = new net.engio.pips.lab.common.Range<java.lang.Iterable<net.engio.pips.data.IDataCollector>>(iDataCollectorIterableValueGenerator0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.Workload workload4 = workload1.setParallelTasks((int) '4');
        org.junit.Assert.assertNotNull(workload4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
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
        java.util.Collection<org.jfree.data.xy.AbstractIntervalXYDataset> abstractIntervalXYDatasetCollection16 = executionContext14.getMatching("run 1 times");
        executionContext14.started();
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.engio.pips.lab.ExecutionContext executionContext19 = executionContext14.bind(obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(abstractIntervalXYDatasetCollection16);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList2 = benchmark1.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter3 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter4 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter5 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray6 = new net.engio.pips.reports.IReporter[] { cSVFileExporter3, cSVFileExporter4, cSVFileExporter5 };
        benchmark1.generateReports(iReporterArray6);
        net.engio.pips.lab.ExecutionContext executionContext8 = new net.engio.pips.lab.ExecutionContext(benchmark1);
        net.engio.pips.lab.Laboratory laboratory10 = executionContext8.get((java.lang.Object) 'a');
        boolean boolean11 = executionContext8.isFinished();
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertNull(laboratory10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        net.engio.pips.lab.common.ValueGenerator<net.engio.pips.lab.Benchmark> benchmarkValueGenerator0 = null;
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange2 = new net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark>(benchmarkValueGenerator0, (int) (short) 0);
        net.engio.pips.lab.Benchmark benchmark4 = benchmarkRange2.getElement(100);
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange5 = benchmarkRange2.shuffle();
        boolean boolean6 = benchmarkRange5.hasNext();
        org.junit.Assert.assertNull(benchmark4);
        org.junit.Assert.assertNotNull(benchmarkRange5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str2 = benchmark1.getReportBaseDir();
        java.io.OutputStream outputStream4 = benchmark1.getProperty("Base path");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(outputStream4);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        net.engio.pips.lab.workload.Workload workload0 = null;
        net.engio.pips.lab.workload.StartCondition startCondition1 = new net.engio.pips.lab.workload.StartCondition(workload0);
        java.lang.String str2 = startCondition1.toString();
        java.lang.String str3 = startCondition1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Unknown startcondition" + "'", str2, "Unknown startcondition");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Unknown startcondition" + "'", str3, "Unknown startcondition");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        net.engio.pips.reports.SeriesGroup.Orientation orientation0 = net.engio.pips.reports.SeriesGroup.Orientation.Left;
        org.junit.Assert.assertTrue("'" + orientation0 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Left + "'", orientation0.equals(net.engio.pips.reports.SeriesGroup.Orientation.Left));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str2 = benchmark1.getReportBaseDir();
        java.lang.String str3 = benchmark1.toString();
        net.engio.pips.lab.Benchmark benchmark5 = benchmark1.setBasePath("hi!");
        net.engio.pips.data.DataCollectorManager dataCollectorManager6 = benchmark1.getCollectorManager();
        boolean boolean8 = benchmark1.isDefined("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str3, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(benchmark5);
        org.junit.Assert.assertNotNull(dataCollectorManager6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        net.engio.pips.reports.ChartGenerator chartGenerator0 = new net.engio.pips.reports.ChartGenerator();
        net.engio.pips.reports.ChartGenerator chartGenerator2 = chartGenerator0.setXAxisLabel("Sample interval");
        net.engio.pips.reports.ChartGenerator chartGenerator4 = chartGenerator2.setPixelPerDatapoint(0);
        org.junit.Assert.assertNotNull(chartGenerator2);
        org.junit.Assert.assertNotNull(chartGenerator4);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        boolean boolean2 = workload1.isFinished();
        boolean boolean3 = workload1.isFinished();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        workload1.started();
        int int4 = workload1.getParallelUnits();
        long long5 = workload1.getExecutionTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1700471358476L) + "'", long5 == (-1700471358476L));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
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
        org.jfree.data.xy.AbstractIntervalXYDataset abstractIntervalXYDataset17 = executionContext15.get((java.lang.Object) (short) 0);
        net.engio.pips.reports.SeriesGroup.Orientation orientation19 = executionContext15.get("Unknown startcondition");
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(executionContext15);
        org.junit.Assert.assertNull(abstractIntervalXYDataset17);
        org.junit.Assert.assertNull(orientation19);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition((int) (byte) 100, timeUnit1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str2 = benchmark1.getReportBaseDir();
        java.lang.String str3 = benchmark1.toString();
        net.engio.pips.lab.Benchmark benchmark5 = benchmark1.setBasePath("hi!");
        java.lang.Class<?> wildcardClass7 = benchmark1.getProperty("Sample interval");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str3, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(benchmark5);
        org.junit.Assert.assertNull(wildcardClass7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        net.engio.pips.reports.ChartGenerator chartGenerator0 = new net.engio.pips.reports.ChartGenerator();
        net.engio.pips.reports.ChartGenerator chartGenerator2 = chartGenerator0.setXAxisLabel("Sample interval");
        net.engio.pips.lab.Benchmark benchmark4 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList5 = benchmark4.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter6 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter7 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter8 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray9 = new net.engio.pips.reports.IReporter[] { cSVFileExporter6, cSVFileExporter7, cSVFileExporter8 };
        benchmark4.generateReports(iReporterArray9);
        net.engio.pips.lab.ExecutionContext executionContext11 = new net.engio.pips.lab.ExecutionContext(benchmark4);
        net.engio.pips.lab.Benchmark benchmark13 = benchmark4.setBasePath("Sample interval");
        // The following exception was thrown during execution in test generation
        try {
            chartGenerator2.generate(benchmark13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chartGenerator2);
        org.junit.Assert.assertNotNull(iDataCollectorList5);
        org.junit.Assert.assertNotNull(iReporterArray9);
        org.junit.Assert.assertNotNull(benchmark13);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.engio.pips.lab.workload.Duration duration2 = new net.engio.pips.lab.workload.Duration(0, timeUnit1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal timeout condition:0null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
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
        net.engio.pips.reports.SeriesGroup seriesGroup18 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation19 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup20 = seriesGroup18.setYAxisOrientation(orientation19);
        net.engio.pips.reports.SeriesGroup.Orientation orientation21 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup22 = seriesGroup18.setYAxisOrientation(orientation21);
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList23 = executionContext14.get((java.lang.Object) seriesGroup22);
        net.engio.pips.reports.SeriesGroup seriesGroup25 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation26 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup27 = seriesGroup25.setYAxisOrientation(orientation26);
        net.engio.pips.reports.SeriesGroup seriesGroup28 = seriesGroup22.setYAxisOrientation(orientation26);
        net.engio.pips.data.IDataCollector iDataCollector29 = null;
        net.engio.pips.reports.SeriesGroup seriesGroup30 = seriesGroup22.addCollector(iDataCollector29);
        net.engio.pips.reports.SeriesGroup.Orientation orientation31 = seriesGroup22.getOrientation();
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(executionContext15);
        org.junit.Assert.assertTrue("'" + orientation19 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation19.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup20);
        org.junit.Assert.assertTrue("'" + orientation21 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation21.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup22);
        org.junit.Assert.assertNull(iDataCollectorList23);
        org.junit.Assert.assertTrue("'" + orientation26 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation26.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup27);
        org.junit.Assert.assertNotNull(seriesGroup28);
        org.junit.Assert.assertNotNull(seriesGroup30);
        org.junit.Assert.assertTrue("'" + orientation31 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation31.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList2 = benchmark1.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter3 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter4 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter5 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray6 = new net.engio.pips.reports.IReporter[] { cSVFileExporter3, cSVFileExporter4, cSVFileExporter5 };
        benchmark1.generateReports(iReporterArray6);
        net.engio.pips.lab.ExecutionContext executionContext8 = new net.engio.pips.lab.ExecutionContext(benchmark1);
        net.engio.pips.lab.Laboratory laboratory10 = executionContext8.get((java.lang.Object) 'a');
        java.lang.Object[] objArray12 = executionContext8.get("Base path");
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertNull(laboratory10);
        org.junit.Assert.assertNull(objArray12);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        net.engio.pips.lab.workload.StartCondition startCondition5 = workload4.getStartCondition();
        net.engio.pips.lab.workload.Duration duration6 = workload4.getDuration();
        boolean boolean7 = workload4.isFinished();
        long long8 = workload4.getExecutionTime();
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertNull(startCondition5);
        org.junit.Assert.assertNull(duration6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        net.engio.pips.reports.ChartGenerator chartGenerator0 = new net.engio.pips.reports.ChartGenerator();
        net.engio.pips.reports.ChartGenerator chartGenerator2 = chartGenerator0.setXAxisLabel("Sample interval");
        net.engio.pips.reports.ChartGenerator chartGenerator4 = chartGenerator2.setTitle("Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        net.engio.pips.lab.Benchmark benchmark6 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList7 = benchmark6.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter8 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter9 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter10 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray11 = new net.engio.pips.reports.IReporter[] { cSVFileExporter8, cSVFileExporter9, cSVFileExporter10 };
        benchmark6.generateReports(iReporterArray11);
        net.engio.pips.lab.ExecutionContext executionContext13 = new net.engio.pips.lab.ExecutionContext(benchmark6);
        net.engio.pips.lab.Benchmark benchmark16 = new net.engio.pips.lab.Benchmark("hi!");
        net.engio.pips.data.DataCollectorManager dataCollectorManager17 = benchmark16.getCollectorManager();
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList19 = benchmark16.getCollectors("hi!");
        net.engio.pips.lab.Benchmark benchmark20 = benchmark6.setProperty("", (java.lang.Object) benchmark16);
        // The following exception was thrown during execution in test generation
        try {
            chartGenerator2.generate(benchmark16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chartGenerator2);
        org.junit.Assert.assertNotNull(chartGenerator4);
        org.junit.Assert.assertNotNull(iDataCollectorList7);
        org.junit.Assert.assertNotNull(iReporterArray11);
        org.junit.Assert.assertNotNull(dataCollectorManager17);
        org.junit.Assert.assertNotNull(iDataCollectorList19);
        org.junit.Assert.assertNotNull(benchmark20);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        java.lang.String str0 = net.engio.pips.lab.Benchmark.Properties.LogStream;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Log stream" + "'", str0, "Log stream");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
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
        org.jfree.data.xy.AbstractIntervalXYDataset abstractIntervalXYDataset17 = executionContext15.get((java.lang.Object) (short) 0);
        boolean boolean19 = executionContext15.containsKey("Sample interval");
        executionContext15.started();
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(executionContext15);
        org.junit.Assert.assertNull(abstractIntervalXYDataset17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
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
        java.util.Collection<org.jfree.data.xy.AbstractIntervalXYDataset> abstractIntervalXYDatasetCollection16 = executionContext14.getMatching("run 1 times");
        net.engio.pips.lab.ExecutionContext executionContext17 = executionContext14.getChild();
        net.engio.pips.data.DataCollectorManager dataCollectorManager19 = executionContext14.get((java.lang.Object) 0.0d);
        net.engio.pips.lab.Benchmark benchmark21 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList22 = benchmark21.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter23 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter24 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter25 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray26 = new net.engio.pips.reports.IReporter[] { cSVFileExporter23, cSVFileExporter24, cSVFileExporter25 };
        benchmark21.generateReports(iReporterArray26);
        net.engio.pips.lab.ExecutionContext executionContext28 = executionContext14.bindAll((java.lang.Object[]) iReporterArray26);
        boolean boolean29 = executionContext14.isFinished();
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(abstractIntervalXYDatasetCollection16);
        org.junit.Assert.assertNotNull(executionContext17);
        org.junit.Assert.assertNull(dataCollectorManager19);
        org.junit.Assert.assertNotNull(iDataCollectorList22);
        org.junit.Assert.assertNotNull(iReporterArray26);
        org.junit.Assert.assertNotNull(executionContext28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
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
        net.engio.pips.lab.Benchmark benchmark23 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList24 = benchmark23.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter25 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter26 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter27 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray28 = new net.engio.pips.reports.IReporter[] { cSVFileExporter25, cSVFileExporter26, cSVFileExporter27 };
        benchmark23.generateReports(iReporterArray28);
        net.engio.pips.lab.ExecutionContext executionContext30 = new net.engio.pips.lab.ExecutionContext(benchmark23);
        net.engio.pips.lab.LabException.ErrorCode errorCode32 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 10, errorCode32, 1.0f, '4' };
        net.engio.pips.lab.ExecutionContext executionContext36 = executionContext30.bindAll(objArray35);
        net.engio.pips.lab.ExecutionContext executionContext37 = executionContext36.getChild();
        executionContext36.finished();
        net.engio.pips.reports.SeriesGroup seriesGroup40 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation41 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup42 = seriesGroup40.setYAxisOrientation(orientation41);
        net.engio.pips.reports.SeriesGroup.Orientation orientation43 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup44 = seriesGroup40.setYAxisOrientation(orientation43);
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList45 = executionContext36.get((java.lang.Object) seriesGroup44);
        // The following exception was thrown during execution in test generation
        try {
            net.engio.pips.lab.ExecutionContext executionContext46 = executionContext17.get((java.lang.Object) iDataCollectorList45);
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
        org.junit.Assert.assertNotNull(iDataCollectorList24);
        org.junit.Assert.assertNotNull(iReporterArray28);
        org.junit.Assert.assertTrue("'" + errorCode32 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode32.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext36);
        org.junit.Assert.assertNotNull(executionContext37);
        org.junit.Assert.assertTrue("'" + orientation41 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation41.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup42);
        org.junit.Assert.assertTrue("'" + orientation43 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation43.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup44);
        org.junit.Assert.assertNull(iDataCollectorList45);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
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
        java.util.Collection<org.jfree.data.xy.AbstractIntervalXYDataset> abstractIntervalXYDatasetCollection16 = executionContext14.getMatching("run 1 times");
        net.engio.pips.lab.ExecutionContext executionContext17 = executionContext14.getChild();
        net.engio.pips.data.DataCollectorManager dataCollectorManager19 = executionContext14.get((java.lang.Object) 0.0d);
        net.engio.pips.lab.Benchmark benchmark21 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList22 = benchmark21.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter23 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter24 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter25 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray26 = new net.engio.pips.reports.IReporter[] { cSVFileExporter23, cSVFileExporter24, cSVFileExporter25 };
        benchmark21.generateReports(iReporterArray26);
        net.engio.pips.lab.ExecutionContext executionContext28 = executionContext14.bindAll((java.lang.Object[]) iReporterArray26);
        java.util.Collection<net.engio.pips.lab.workload.ExecutionHandler> executionHandlerCollection30 = executionContext14.getMatching("run 1 times");
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(abstractIntervalXYDatasetCollection16);
        org.junit.Assert.assertNotNull(executionContext17);
        org.junit.Assert.assertNull(dataCollectorManager19);
        org.junit.Assert.assertNotNull(iDataCollectorList22);
        org.junit.Assert.assertNotNull(iReporterArray26);
        org.junit.Assert.assertNotNull(executionContext28);
        org.junit.Assert.assertNotNull(executionHandlerCollection30);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation2 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup3 = seriesGroup1.setYAxisOrientation(orientation2);
        net.engio.pips.reports.SeriesGroup.Orientation orientation4 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup5 = seriesGroup1.setYAxisOrientation(orientation4);
        net.engio.pips.lab.Benchmark benchmark7 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList8 = benchmark7.getCollectors();
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList10 = benchmark7.getCollectors("");
        net.engio.pips.reports.SeriesGroup seriesGroup11 = seriesGroup5.addCollectors(iDataCollectorList10);
        net.engio.pips.data.IDataCollector iDataCollector12 = null;
        net.engio.pips.reports.SeriesGroup seriesGroup13 = seriesGroup11.addCollector(iDataCollector12);
        org.junit.Assert.assertTrue("'" + orientation2 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation2.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup3);
        org.junit.Assert.assertTrue("'" + orientation4 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation4.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup5);
        org.junit.Assert.assertNotNull(iDataCollectorList8);
        org.junit.Assert.assertNotNull(iDataCollectorList10);
        org.junit.Assert.assertNotNull(seriesGroup11);
        org.junit.Assert.assertNotNull(seriesGroup13);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
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
        java.util.Collection<org.jfree.data.xy.AbstractIntervalXYDataset> abstractIntervalXYDatasetCollection16 = executionContext14.getMatching("run 1 times");
        net.engio.pips.lab.ExecutionContext executionContext17 = executionContext14.getChild();
        net.engio.pips.data.DataCollectorManager dataCollectorManager19 = executionContext14.get((java.lang.Object) 0.0d);
        net.engio.pips.lab.Benchmark benchmark21 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList22 = benchmark21.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter23 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter24 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter25 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray26 = new net.engio.pips.reports.IReporter[] { cSVFileExporter23, cSVFileExporter24, cSVFileExporter25 };
        benchmark21.generateReports(iReporterArray26);
        net.engio.pips.lab.ExecutionContext executionContext28 = executionContext14.bindAll((java.lang.Object[]) iReporterArray26);
        net.engio.pips.lab.workload.Workload.StartSpecification startSpecification30 = executionContext28.get("Log stream");
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(abstractIntervalXYDatasetCollection16);
        org.junit.Assert.assertNotNull(executionContext17);
        org.junit.Assert.assertNull(dataCollectorManager19);
        org.junit.Assert.assertNotNull(iDataCollectorList22);
        org.junit.Assert.assertNotNull(iReporterArray26);
        org.junit.Assert.assertNotNull(executionContext28);
        org.junit.Assert.assertNull(startSpecification30);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation2 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup3 = seriesGroup1.setYAxisOrientation(orientation2);
        net.engio.pips.data.IDataCollector iDataCollector4 = null;
        net.engio.pips.reports.SeriesGroup seriesGroup5 = seriesGroup3.addCollector(iDataCollector4);
        org.junit.Assert.assertTrue("'" + orientation2 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation2.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup3);
        org.junit.Assert.assertNotNull(seriesGroup5);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        net.engio.pips.lab.common.ValueGenerator<net.engio.pips.lab.Benchmark> benchmarkValueGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange2 = new net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark>(benchmarkValueGenerator0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList2 = benchmark1.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter3 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter4 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter5 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray6 = new net.engio.pips.reports.IReporter[] { cSVFileExporter3, cSVFileExporter4, cSVFileExporter5 };
        benchmark1.generateReports(iReporterArray6);
        net.engio.pips.lab.ExecutionContext executionContext8 = new net.engio.pips.lab.ExecutionContext(benchmark1);
        executionContext8.finished();
        executionContext8.finished();
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.Workload workload4 = workload1.setParallelTasks((int) (byte) -1);
        net.engio.pips.lab.workload.Workload.DurationSpecification durationSpecification5 = workload4.new DurationSpecification();
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.engio.pips.lab.workload.Workload workload8 = durationSpecification5.lasts(100, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal timeout condition:100null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(workload4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
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
        java.util.Collection<org.jfree.data.xy.AbstractIntervalXYDataset> abstractIntervalXYDatasetCollection16 = executionContext14.getMatching("run 1 times");
        java.util.Collection<net.engio.pips.lab.workload.Duration> durationCollection18 = executionContext14.getMatching("Timeout in seconds");
        boolean boolean20 = executionContext14.containsKey("Log stream");
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(abstractIntervalXYDatasetCollection16);
        org.junit.Assert.assertNotNull(durationCollection18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("Title");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        net.engio.pips.data.DataCollectorManager dataCollectorManager2 = benchmark1.getCollectorManager();
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList4 = benchmark1.getCollectors("hi!");
        net.engio.pips.lab.Benchmark benchmark6 = benchmark1.setSampleInterval(100);
        org.junit.Assert.assertNotNull(dataCollectorManager2);
        org.junit.Assert.assertNotNull(iDataCollectorList4);
        org.junit.Assert.assertNotNull(benchmark6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
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
        net.engio.pips.reports.SeriesGroup seriesGroup18 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation19 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup20 = seriesGroup18.setYAxisOrientation(orientation19);
        net.engio.pips.reports.SeriesGroup.Orientation orientation21 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup22 = seriesGroup18.setYAxisOrientation(orientation21);
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList23 = executionContext14.get((java.lang.Object) seriesGroup22);
        java.lang.String str24 = seriesGroup22.getLabel();
        int int25 = seriesGroup22.getSize();
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(executionContext15);
        org.junit.Assert.assertTrue("'" + orientation19 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation19.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup20);
        org.junit.Assert.assertTrue("'" + orientation21 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation21.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup22);
        org.junit.Assert.assertNull(iDataCollectorList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Timeout in seconds" + "'", str24, "Timeout in seconds");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup seriesGroup3 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation4 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup5 = seriesGroup3.setYAxisOrientation(orientation4);
        net.engio.pips.reports.SeriesGroup seriesGroup6 = seriesGroup1.setYAxisOrientation(orientation4);
        java.lang.String str7 = seriesGroup6.getyAxis();
        net.engio.pips.reports.SeriesGroup seriesGroup9 = seriesGroup6.setyAxis("Base path");
        org.junit.Assert.assertTrue("'" + orientation4 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation4.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup5);
        org.junit.Assert.assertNotNull(seriesGroup6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(seriesGroup9);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        net.engio.pips.reports.ChartGenerator chartGenerator0 = new net.engio.pips.reports.ChartGenerator();
        net.engio.pips.reports.ChartGenerator chartGenerator2 = chartGenerator0.setPixelPerDatapoint((int) (byte) 10);
        net.engio.pips.reports.ChartGenerator chartGenerator4 = chartGenerator2.setFileName("Log stream");
        java.lang.Class<?> wildcardClass5 = chartGenerator2.getClass();
        org.junit.Assert.assertNotNull(chartGenerator2);
        org.junit.Assert.assertNotNull(chartGenerator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        net.engio.pips.reports.ChartGenerator chartGenerator0 = new net.engio.pips.reports.ChartGenerator();
        net.engio.pips.reports.ChartGenerator chartGenerator2 = chartGenerator0.setXAxisLabel("Sample interval");
        net.engio.pips.reports.ChartGenerator chartGenerator4 = chartGenerator2.setFileName("Base path");
        net.engio.pips.reports.ChartGenerator chartGenerator6 = chartGenerator4.setXAxisLabel("Title");
        net.engio.pips.reports.ChartGenerator chartGenerator8 = chartGenerator6.setTitle("Title");
        org.junit.Assert.assertNotNull(chartGenerator2);
        org.junit.Assert.assertNotNull(chartGenerator4);
        org.junit.Assert.assertNotNull(chartGenerator6);
        org.junit.Assert.assertNotNull(chartGenerator8);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        net.engio.pips.lab.workload.ExecutionEvent executionEvent0 = net.engio.pips.lab.workload.ExecutionEvent.TaskCompletion;
        org.junit.Assert.assertTrue("'" + executionEvent0 + "' != '" + net.engio.pips.lab.workload.ExecutionEvent.TaskCompletion + "'", executionEvent0.equals(net.engio.pips.lab.workload.ExecutionEvent.TaskCompletion));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        java.lang.Class<?> wildcardClass2 = workload1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup seriesGroup3 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation4 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup5 = seriesGroup3.setYAxisOrientation(orientation4);
        net.engio.pips.reports.SeriesGroup seriesGroup6 = seriesGroup1.setYAxisOrientation(orientation4);
        java.lang.String str7 = seriesGroup6.getyAxis();
        int int8 = seriesGroup6.getSize();
        org.junit.Assert.assertTrue("'" + orientation4 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation4.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup5);
        org.junit.Assert.assertNotNull(seriesGroup6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation2 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup3 = seriesGroup1.setYAxisOrientation(orientation2);
        net.engio.pips.lab.Benchmark benchmark5 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str6 = benchmark5.getReportBaseDir();
        java.lang.String str7 = benchmark5.toString();
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection8 = seriesGroup1.createDataSet(benchmark5);
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList10 = benchmark5.getCollectors("run 1 times");
        java.lang.String str11 = benchmark5.getReportBaseDir();
        org.junit.Assert.assertTrue("'" + orientation2 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation2.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str7, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(timeSeriesCollection8);
        org.junit.Assert.assertNotNull(iDataCollectorList10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.engio.pips.lab.workload.Duration duration2 = new net.engio.pips.lab.workload.Duration((int) '#', timeUnit1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal timeout condition:35null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        net.engio.pips.lab.common.ValueGenerator<net.engio.pips.lab.Benchmark> benchmarkValueGenerator0 = null;
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange2 = new net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark>(benchmarkValueGenerator0, (int) (short) 0);
        net.engio.pips.lab.Benchmark benchmark4 = benchmarkRange2.getElement(100);
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange5 = benchmarkRange2.shuffle();
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange6 = benchmarkRange2.clone();
        org.junit.Assert.assertNull(benchmark4);
        org.junit.Assert.assertNotNull(benchmarkRange5);
        org.junit.Assert.assertNotNull(benchmarkRange6);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList2 = benchmark1.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter3 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter4 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter5 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray6 = new net.engio.pips.reports.IReporter[] { cSVFileExporter3, cSVFileExporter4, cSVFileExporter5 };
        benchmark1.generateReports(iReporterArray6);
        net.engio.pips.lab.ExecutionContext executionContext8 = new net.engio.pips.lab.ExecutionContext(benchmark1);
        boolean boolean10 = benchmark1.isDefined("Log stream");
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
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
        net.engio.pips.lab.Benchmark benchmark16 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList17 = benchmark16.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter18 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter19 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter20 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray21 = new net.engio.pips.reports.IReporter[] { cSVFileExporter18, cSVFileExporter19, cSVFileExporter20 };
        benchmark16.generateReports(iReporterArray21);
        java.util.Collection<java.lang.Cloneable> cloneableCollection23 = executionContext8.getAll((java.lang.Object) iReporterArray21);
        net.engio.pips.data.DataCollector<net.engio.pips.data.DataCollectorManager> dataCollectorManagerDataCollector25 = executionContext8.createLocalCollector("Sample interval");
        net.engio.pips.lab.Benchmark benchmark27 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList28 = benchmark27.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter29 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter30 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter31 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray32 = new net.engio.pips.reports.IReporter[] { cSVFileExporter29, cSVFileExporter30, cSVFileExporter31 };
        benchmark27.generateReports(iReporterArray32);
        net.engio.pips.lab.ExecutionContext executionContext34 = new net.engio.pips.lab.ExecutionContext(benchmark27);
        net.engio.pips.lab.LabException.ErrorCode errorCode36 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        java.lang.Object[] objArray39 = new java.lang.Object[] { 10, errorCode36, 1.0f, '4' };
        net.engio.pips.lab.ExecutionContext executionContext40 = executionContext34.bindAll(objArray39);
        net.engio.pips.lab.Benchmark benchmark42 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList43 = benchmark42.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter44 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter45 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter46 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray47 = new net.engio.pips.reports.IReporter[] { cSVFileExporter44, cSVFileExporter45, cSVFileExporter46 };
        benchmark42.generateReports(iReporterArray47);
        java.util.Collection<java.lang.Cloneable> cloneableCollection49 = executionContext34.getAll((java.lang.Object) iReporterArray47);
        net.engio.pips.data.DataCollector<net.engio.pips.data.DataCollectorManager> dataCollectorManagerDataCollector51 = executionContext34.createLocalCollector("Sample interval");
        net.engio.pips.data.DataProcessor<net.engio.pips.data.DataCollectorManager, net.engio.pips.data.DataCollectorManager> dataCollectorManagerDataProcessor52 = dataCollectorManagerDataCollector25.add((net.engio.pips.data.IDataProcessor<net.engio.pips.data.DataCollectorManager, net.engio.pips.data.DataCollectorManager>) dataCollectorManagerDataCollector51);
        net.engio.pips.data.IDataProcessor[] iDataProcessorArray54 = new net.engio.pips.data.IDataProcessor[0];
        @SuppressWarnings("unchecked")
        net.engio.pips.data.IDataProcessor<net.engio.pips.data.DataCollectorManager, ?>[] dataCollectorManagerIDataProcessorArray55 = (net.engio.pips.data.IDataProcessor<net.engio.pips.data.DataCollectorManager, ?>[]) iDataProcessorArray54;
        net.engio.pips.data.IDataProcessor<net.engio.pips.data.DataCollectorManager, net.engio.pips.data.DataCollectorManager> dataCollectorManagerIDataProcessor56 = dataCollectorManagerDataProcessor52.connectTo(dataCollectorManagerIDataProcessorArray55);
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(iDataCollectorList17);
        org.junit.Assert.assertNotNull(iReporterArray21);
        org.junit.Assert.assertNotNull(cloneableCollection23);
        org.junit.Assert.assertNotNull(dataCollectorManagerDataCollector25);
        org.junit.Assert.assertNotNull(iDataCollectorList28);
        org.junit.Assert.assertNotNull(iReporterArray32);
        org.junit.Assert.assertTrue("'" + errorCode36 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode36.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext40);
        org.junit.Assert.assertNotNull(iDataCollectorList43);
        org.junit.Assert.assertNotNull(iReporterArray47);
        org.junit.Assert.assertNotNull(cloneableCollection49);
        org.junit.Assert.assertNotNull(dataCollectorManagerDataCollector51);
        org.junit.Assert.assertNotNull(dataCollectorManagerDataProcessor52);
        org.junit.Assert.assertNotNull(iDataProcessorArray54);
        org.junit.Assert.assertNotNull(dataCollectorManagerIDataProcessorArray55);
        org.junit.Assert.assertNotNull(dataCollectorManagerIDataProcessor56);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        net.engio.pips.lab.common.ValueGenerator<net.engio.pips.lab.Benchmark> benchmarkValueGenerator0 = null;
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange2 = new net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark>(benchmarkValueGenerator0, (int) (short) 0);
        net.engio.pips.lab.Benchmark benchmark4 = benchmarkRange2.getElement(100);
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange5 = benchmarkRange2.shuffle();
        net.engio.pips.lab.Benchmark benchmark7 = benchmarkRange5.getElement((int) (short) 100);
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange8 = benchmarkRange5.clone();
        // The following exception was thrown during execution in test generation
        try {
            net.engio.pips.lab.Benchmark benchmark9 = benchmarkRange8.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(benchmark4);
        org.junit.Assert.assertNotNull(benchmarkRange5);
        org.junit.Assert.assertNull(benchmark7);
        org.junit.Assert.assertNotNull(benchmarkRange8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        boolean boolean2 = workload1.isFinished();
        int int3 = workload1.getParallelUnits();
        java.lang.String str4 = workload1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0ms)->Parallel tasks:1,null,null\n" + "'", str4, "(0ms)->Parallel tasks:1,null,null\n");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.data.IDataCollector iDataCollector2 = null;
        net.engio.pips.reports.SeriesGroup seriesGroup3 = seriesGroup1.addCollector(iDataCollector2);
        net.engio.pips.reports.SeriesGroup seriesGroup5 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation6 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup7 = seriesGroup5.setYAxisOrientation(orientation6);
        net.engio.pips.reports.SeriesGroup seriesGroup8 = seriesGroup3.setYAxisOrientation(orientation6);
        net.engio.pips.reports.SeriesGroup seriesGroup10 = seriesGroup8.setyAxis("Base path");
        net.engio.pips.reports.SeriesGroup seriesGroup12 = seriesGroup8.setyAxis("Title");
        org.junit.Assert.assertNotNull(seriesGroup3);
        org.junit.Assert.assertTrue("'" + orientation6 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation6.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup7);
        org.junit.Assert.assertNotNull(seriesGroup8);
        org.junit.Assert.assertNotNull(seriesGroup10);
        org.junit.Assert.assertNotNull(seriesGroup12);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        workload1.started();
        long long3 = workload1.getStarted();
        net.engio.pips.lab.workload.Workload.DurationSpecification durationSpecification4 = workload1.new DurationSpecification();
        net.engio.pips.lab.workload.Workload workload6 = durationSpecification4.repetitions((int) '#');
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700471362522L + "'", long3 == 1700471362522L);
        org.junit.Assert.assertNotNull(workload6);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        net.engio.pips.reports.TimeSeriesCollector timeSeriesCollector1 = new net.engio.pips.reports.TimeSeriesCollector("Report base dir");
        // The following exception was thrown during execution in test generation
        try {
            timeSeriesCollector1.generateChart("run 1 times", "run 1 times", "run 1 times", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (0) and height (1024) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
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
        boolean boolean23 = executionContext17.containsKey("Report base dir");
        net.engio.pips.data.DataCollector<net.engio.pips.data.IDataProcessor<net.engio.pips.data.DataCollectorManager, ?>[]> dataCollectorManagerIDataProcessorArrayDataCollector25 = executionContext17.createLocalCollector("");
        org.junit.Assert.assertNotNull(iDataCollectorList5);
        org.junit.Assert.assertNotNull(iReporterArray9);
        org.junit.Assert.assertTrue("'" + errorCode13 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode13.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext17);
        org.junit.Assert.assertNotNull(abstractIntervalXYDatasetCollection19);
        org.junit.Assert.assertNotNull(executionContext20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dataCollectorManagerIDataProcessorArrayDataCollector25);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        net.engio.pips.lab.workload.ExecutionHandler executionHandler0 = null;
        net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper executionHandlerWrapper1 = new net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper(executionHandler0);
        net.engio.pips.lab.Benchmark benchmark3 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList4 = benchmark3.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter5 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter6 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter7 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray8 = new net.engio.pips.reports.IReporter[] { cSVFileExporter5, cSVFileExporter6, cSVFileExporter7 };
        benchmark3.generateReports(iReporterArray8);
        net.engio.pips.lab.ExecutionContext executionContext10 = new net.engio.pips.lab.ExecutionContext(benchmark3);
        net.engio.pips.lab.LabException.ErrorCode errorCode12 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        java.lang.Object[] objArray15 = new java.lang.Object[] { 10, errorCode12, 1.0f, '4' };
        net.engio.pips.lab.ExecutionContext executionContext16 = executionContext10.bindAll(objArray15);
        executionHandlerWrapper1.handle(executionContext16);
        org.junit.Assert.assertNotNull(iDataCollectorList4);
        org.junit.Assert.assertNotNull(iReporterArray8);
        org.junit.Assert.assertTrue("'" + errorCode12 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode12.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext16);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.data.IDataCollector iDataCollector2 = null;
        net.engio.pips.reports.SeriesGroup seriesGroup3 = seriesGroup1.addCollector(iDataCollector2);
        net.engio.pips.reports.SeriesGroup seriesGroup5 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation6 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup7 = seriesGroup5.setYAxisOrientation(orientation6);
        net.engio.pips.reports.SeriesGroup seriesGroup8 = seriesGroup3.setYAxisOrientation(orientation6);
        net.engio.pips.lab.Benchmark benchmark10 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList11 = benchmark10.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter12 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter13 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter14 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray15 = new net.engio.pips.reports.IReporter[] { cSVFileExporter12, cSVFileExporter13, cSVFileExporter14 };
        benchmark10.generateReports(iReporterArray15);
        net.engio.pips.lab.ExecutionContext executionContext17 = new net.engio.pips.lab.ExecutionContext(benchmark10);
        net.engio.pips.lab.LabException.ErrorCode errorCode19 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 10, errorCode19, 1.0f, '4' };
        net.engio.pips.lab.ExecutionContext executionContext23 = executionContext17.bindAll(objArray22);
        java.util.Collection<org.jfree.data.xy.AbstractIntervalXYDataset> abstractIntervalXYDatasetCollection25 = executionContext23.getMatching("run 1 times");
        net.engio.pips.lab.Laboratory laboratory27 = executionContext23.get((java.lang.Object) 'a');
        executionContext23.started();
        net.engio.pips.lab.Benchmark benchmark31 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList32 = benchmark31.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter33 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter34 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter35 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray36 = new net.engio.pips.reports.IReporter[] { cSVFileExporter33, cSVFileExporter34, cSVFileExporter35 };
        benchmark31.generateReports(iReporterArray36);
        net.engio.pips.lab.ExecutionContext executionContext38 = new net.engio.pips.lab.ExecutionContext(benchmark31);
        net.engio.pips.lab.LabException.ErrorCode errorCode40 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        java.lang.Object[] objArray43 = new java.lang.Object[] { 10, errorCode40, 1.0f, '4' };
        net.engio.pips.lab.ExecutionContext executionContext44 = executionContext38.bindAll(objArray43);
        net.engio.pips.lab.ExecutionContext executionContext45 = executionContext44.getChild();
        executionContext44.finished();
        net.engio.pips.reports.SeriesGroup seriesGroup48 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation49 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup50 = seriesGroup48.setYAxisOrientation(orientation49);
        net.engio.pips.reports.SeriesGroup.Orientation orientation51 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup52 = seriesGroup48.setYAxisOrientation(orientation51);
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList53 = executionContext44.get((java.lang.Object) seriesGroup52);
        net.engio.pips.reports.SeriesGroup seriesGroup55 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation56 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup57 = seriesGroup55.setYAxisOrientation(orientation56);
        net.engio.pips.reports.SeriesGroup seriesGroup58 = seriesGroup52.setYAxisOrientation(orientation56);
        java.lang.String str59 = seriesGroup52.getyAxis();
        net.engio.pips.lab.Benchmark benchmark61 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList62 = benchmark61.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter63 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter64 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter65 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray66 = new net.engio.pips.reports.IReporter[] { cSVFileExporter63, cSVFileExporter64, cSVFileExporter65 };
        benchmark61.generateReports(iReporterArray66);
        net.engio.pips.lab.ExecutionContext executionContext68 = new net.engio.pips.lab.ExecutionContext(benchmark61);
        net.engio.pips.lab.LabException.ErrorCode errorCode70 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        java.lang.Object[] objArray73 = new java.lang.Object[] { 10, errorCode70, 1.0f, '4' };
        net.engio.pips.lab.ExecutionContext executionContext74 = executionContext68.bindAll(objArray73);
        net.engio.pips.lab.ExecutionContext executionContext75 = executionContext74.getChild();
        executionContext74.finished();
        net.engio.pips.reports.SeriesGroup seriesGroup78 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation79 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup80 = seriesGroup78.setYAxisOrientation(orientation79);
        net.engio.pips.reports.SeriesGroup.Orientation orientation81 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup82 = seriesGroup78.setYAxisOrientation(orientation81);
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList83 = executionContext74.get((java.lang.Object) seriesGroup82);
        net.engio.pips.reports.SeriesGroup seriesGroup85 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation86 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup87 = seriesGroup85.setYAxisOrientation(orientation86);
        net.engio.pips.reports.SeriesGroup seriesGroup88 = seriesGroup82.setYAxisOrientation(orientation86);
        net.engio.pips.reports.SeriesGroup seriesGroup89 = seriesGroup52.setYAxisOrientation(orientation86);
        net.engio.pips.lab.ExecutionContext executionContext90 = executionContext23.bind("hi!", (java.lang.Object) orientation86);
        net.engio.pips.reports.SeriesGroup seriesGroup91 = seriesGroup8.setYAxisOrientation(orientation86);
        org.junit.Assert.assertNotNull(seriesGroup3);
        org.junit.Assert.assertTrue("'" + orientation6 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation6.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup7);
        org.junit.Assert.assertNotNull(seriesGroup8);
        org.junit.Assert.assertNotNull(iDataCollectorList11);
        org.junit.Assert.assertNotNull(iReporterArray15);
        org.junit.Assert.assertTrue("'" + errorCode19 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode19.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext23);
        org.junit.Assert.assertNotNull(abstractIntervalXYDatasetCollection25);
        org.junit.Assert.assertNull(laboratory27);
        org.junit.Assert.assertNotNull(iDataCollectorList32);
        org.junit.Assert.assertNotNull(iReporterArray36);
        org.junit.Assert.assertTrue("'" + errorCode40 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode40.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext44);
        org.junit.Assert.assertNotNull(executionContext45);
        org.junit.Assert.assertTrue("'" + orientation49 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation49.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup50);
        org.junit.Assert.assertTrue("'" + orientation51 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation51.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup52);
        org.junit.Assert.assertNull(iDataCollectorList53);
        org.junit.Assert.assertTrue("'" + orientation56 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation56.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup57);
        org.junit.Assert.assertNotNull(seriesGroup58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(iDataCollectorList62);
        org.junit.Assert.assertNotNull(iReporterArray66);
        org.junit.Assert.assertTrue("'" + errorCode70 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode70.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext74);
        org.junit.Assert.assertNotNull(executionContext75);
        org.junit.Assert.assertTrue("'" + orientation79 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation79.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup80);
        org.junit.Assert.assertTrue("'" + orientation81 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation81.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup82);
        org.junit.Assert.assertNull(iDataCollectorList83);
        org.junit.Assert.assertTrue("'" + orientation86 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation86.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup87);
        org.junit.Assert.assertNotNull(seriesGroup88);
        org.junit.Assert.assertNotNull(seriesGroup89);
        org.junit.Assert.assertNotNull(executionContext90);
        org.junit.Assert.assertNotNull(seriesGroup91);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList2 = benchmark1.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter3 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter4 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter5 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray6 = new net.engio.pips.reports.IReporter[] { cSVFileExporter3, cSVFileExporter4, cSVFileExporter5 };
        benchmark1.generateReports(iReporterArray6);
        net.engio.pips.lab.ExecutionContext executionContext8 = new net.engio.pips.lab.ExecutionContext(benchmark1);
        net.engio.pips.lab.Benchmark benchmark11 = new net.engio.pips.lab.Benchmark("hi!");
        net.engio.pips.data.DataCollectorManager dataCollectorManager12 = benchmark11.getCollectorManager();
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList14 = benchmark11.getCollectors("hi!");
        net.engio.pips.lab.Benchmark benchmark15 = benchmark1.setProperty("", (java.lang.Object) benchmark11);
        java.io.OutputStream outputStream16 = benchmark15.getLogStream();
        net.engio.pips.lab.Benchmark benchmark18 = benchmark15.setBasePath("Unknown startcondition");
        net.engio.pips.lab.workload.Workload workload20 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition21 = new net.engio.pips.lab.workload.StartCondition(workload20);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory22 = null;
        net.engio.pips.lab.workload.Workload workload23 = workload20.setITaskFactory(iTaskFactory22);
        net.engio.pips.lab.workload.StartCondition startCondition24 = workload23.getStartCondition();
        net.engio.pips.lab.workload.Duration duration25 = workload23.getDuration();
        boolean boolean26 = workload23.isFinished();
        net.engio.pips.lab.workload.Workload[] workloadArray27 = new net.engio.pips.lab.workload.Workload[] { workload23 };
        net.engio.pips.lab.Benchmark benchmark28 = benchmark18.addWorkload(workloadArray27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement30 = benchmark18.getProperty("Report base dir");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Cannot cast java.lang.String to java.lang.reflect.AnnotatedElement");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertNotNull(dataCollectorManager12);
        org.junit.Assert.assertNotNull(iDataCollectorList14);
        org.junit.Assert.assertNotNull(benchmark15);
        org.junit.Assert.assertNotNull(outputStream16);
        org.junit.Assert.assertNotNull(benchmark18);
        org.junit.Assert.assertNotNull(workload23);
        org.junit.Assert.assertNull(startCondition24);
        org.junit.Assert.assertNull(duration25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(workloadArray27);
        org.junit.Assert.assertNotNull(benchmark28);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
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
        java.util.Collection<org.jfree.data.xy.AbstractIntervalXYDataset> abstractIntervalXYDatasetCollection16 = executionContext14.getMatching("run 1 times");
        java.util.Collection<net.engio.pips.lab.workload.Duration> durationCollection18 = executionContext14.getMatching("Timeout in seconds");
        executionContext14.finished();
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(abstractIntervalXYDatasetCollection16);
        org.junit.Assert.assertNotNull(durationCollection18);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        long long5 = workload4.getStarted();
        net.engio.pips.lab.workload.StartCondition startCondition6 = workload4.getStartCondition();
        net.engio.pips.lab.workload.Workload.StartSpecification startSpecification7 = workload4.starts();
        net.engio.pips.lab.workload.Workload workload9 = workload4.setDelay(0L);
        workload9.started();
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(startCondition6);
        org.junit.Assert.assertNotNull(startSpecification7);
        org.junit.Assert.assertNotNull(workload9);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        net.engio.pips.lab.workload.Duration duration1 = new net.engio.pips.lab.workload.Duration((int) (byte) 1);
        java.lang.String str2 = duration1.toString();
        java.lang.String str3 = duration1.toString();
        int int4 = duration1.getRepetitions();
        int int5 = duration1.getRepetitions();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "run 1 times" + "'", str2, "run 1 times");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "run 1 times" + "'", str3, "run 1 times");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        net.engio.pips.reports.CSVFileExporter cSVFileExporter0 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.lab.Benchmark benchmark2 = new net.engio.pips.lab.Benchmark("hi!");
        net.engio.pips.lab.workload.ExecutionEvent executionEvent4 = benchmark2.getProperty("Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList6 = benchmark2.getCollectors("Title");
        cSVFileExporter0.generate(benchmark2);
        net.engio.pips.data.DataCollectorManager dataCollectorManager8 = benchmark2.getCollectorManager();
        org.junit.Assert.assertNull(executionEvent4);
        org.junit.Assert.assertNotNull(iDataCollectorList6);
        org.junit.Assert.assertNotNull(dataCollectorManager8);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList2 = benchmark1.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter3 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter4 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter5 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray6 = new net.engio.pips.reports.IReporter[] { cSVFileExporter3, cSVFileExporter4, cSVFileExporter5 };
        benchmark1.generateReports(iReporterArray6);
        net.engio.pips.lab.ExecutionContext executionContext8 = new net.engio.pips.lab.ExecutionContext(benchmark1);
        net.engio.pips.lab.Benchmark benchmark11 = new net.engio.pips.lab.Benchmark("hi!");
        net.engio.pips.data.DataCollectorManager dataCollectorManager12 = benchmark11.getCollectorManager();
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList14 = benchmark11.getCollectors("hi!");
        net.engio.pips.lab.Benchmark benchmark15 = benchmark1.setProperty("", (java.lang.Object) benchmark11);
        java.io.OutputStream outputStream16 = benchmark15.getLogStream();
        net.engio.pips.lab.Benchmark benchmark18 = benchmark15.setBasePath("Unknown startcondition");
        net.engio.pips.reports.SeriesGroup seriesGroup20 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation21 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup22 = seriesGroup20.setYAxisOrientation(orientation21);
        net.engio.pips.lab.Benchmark benchmark24 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str25 = benchmark24.getReportBaseDir();
        java.lang.String str26 = benchmark24.toString();
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection27 = seriesGroup20.createDataSet(benchmark24);
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList29 = benchmark24.getCollectors("run 1 times");
        net.engio.pips.lab.Benchmark benchmark31 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str32 = benchmark31.getReportBaseDir();
        java.lang.String str33 = benchmark31.toString();
        net.engio.pips.lab.Benchmark benchmark35 = benchmark31.setBasePath("hi!");
        java.io.OutputStream outputStream36 = benchmark31.getLogStream();
        net.engio.pips.lab.Benchmark benchmark37 = benchmark24.setLogStream(outputStream36);
        net.engio.pips.lab.Benchmark benchmark38 = benchmark15.setLogStream(outputStream36);
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertNotNull(dataCollectorManager12);
        org.junit.Assert.assertNotNull(iDataCollectorList14);
        org.junit.Assert.assertNotNull(benchmark15);
        org.junit.Assert.assertNotNull(outputStream16);
        org.junit.Assert.assertNotNull(benchmark18);
        org.junit.Assert.assertTrue("'" + orientation21 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation21.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str26, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(timeSeriesCollection27);
        org.junit.Assert.assertNotNull(iDataCollectorList29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str33, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(benchmark35);
        org.junit.Assert.assertNotNull(outputStream36);
        org.junit.Assert.assertNotNull(benchmark37);
        org.junit.Assert.assertNotNull(benchmark38);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        long long5 = workload4.getStarted();
        boolean boolean6 = workload4.isFinished();
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.data.IDataCollector iDataCollector2 = null;
        net.engio.pips.reports.SeriesGroup seriesGroup3 = seriesGroup1.addCollector(iDataCollector2);
        net.engio.pips.reports.SeriesGroup seriesGroup5 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation6 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup7 = seriesGroup5.setYAxisOrientation(orientation6);
        net.engio.pips.reports.SeriesGroup seriesGroup8 = seriesGroup3.setYAxisOrientation(orientation6);
        net.engio.pips.reports.SeriesGroup seriesGroup10 = seriesGroup8.setyAxis("Base path");
        int int11 = seriesGroup8.getSize();
        org.junit.Assert.assertNotNull(seriesGroup3);
        org.junit.Assert.assertTrue("'" + orientation6 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation6.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup7);
        org.junit.Assert.assertNotNull(seriesGroup8);
        org.junit.Assert.assertNotNull(seriesGroup10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        net.engio.pips.reports.ChartGenerator chartGenerator0 = new net.engio.pips.reports.ChartGenerator();
        net.engio.pips.reports.ChartGenerator chartGenerator2 = chartGenerator0.setPixelPerDatapoint((int) (byte) 10);
        net.engio.pips.lab.Benchmark benchmark4 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str5 = benchmark4.getReportBaseDir();
        java.lang.String str6 = benchmark4.toString();
        net.engio.pips.lab.Benchmark benchmark8 = benchmark4.setBasePath("hi!");
        // The following exception was thrown during execution in test generation
        try {
            chartGenerator2.generate(benchmark8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chartGenerator2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str6, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(benchmark8);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        boolean boolean2 = workload1.isFinished();
        int int3 = workload1.getParallelUnits();
        java.lang.String str4 = workload1.getName();
        long long5 = workload1.getExecutionTime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        long long5 = workload4.getStarted();
        net.engio.pips.lab.workload.StartCondition startCondition6 = workload4.getStartCondition();
        net.engio.pips.lab.workload.Workload.StartSpecification startSpecification7 = workload4.starts();
        net.engio.pips.lab.workload.Workload workload9 = workload4.setDelay(0L);
        net.engio.pips.lab.workload.StartCondition startCondition10 = new net.engio.pips.lab.workload.StartCondition(workload9);
        boolean boolean11 = startCondition10.isDependent();
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(startCondition6);
        org.junit.Assert.assertNotNull(startSpecification7);
        org.junit.Assert.assertNotNull(workload9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        net.engio.pips.reports.TimeSeriesCollector timeSeriesCollector1 = new net.engio.pips.reports.TimeSeriesCollector("Report base dir");
        net.engio.pips.reports.TimeSeriesConsumer timeSeriesConsumer4 = timeSeriesCollector1.makeSeries("Timeout in seconds", "Log stream");
        // The following exception was thrown during execution in test generation
        try {
            timeSeriesCollector1.generateChart("Title", "Report base dir", "Log stream", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (0) and height (1024) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeriesConsumer4);
    }

    @Test
    public void test096() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700471364497L + "'", long3 == 1700471364497L);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        net.engio.pips.lab.workload.ExecutionEvent executionEvent3 = benchmark1.getProperty("Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        java.lang.String str4 = benchmark1.toString();
        net.engio.pips.lab.Executions executions5 = new net.engio.pips.lab.Executions();
        benchmark1.setExecutions(executions5);
        org.junit.Assert.assertNull(executionEvent3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str4, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        long long5 = workload4.getStarted();
        net.engio.pips.lab.workload.StartCondition startCondition6 = workload4.getStartCondition();
        net.engio.pips.lab.workload.Workload.StartSpecification startSpecification7 = workload4.starts();
        net.engio.pips.lab.workload.Workload workload8 = startSpecification7.immediately();
        boolean boolean9 = workload8.hasTasksToRun();
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(startCondition6);
        org.junit.Assert.assertNotNull(startSpecification7);
        org.junit.Assert.assertNotNull(workload8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        net.engio.pips.lab.Laboratory laboratory0 = new net.engio.pips.lab.Laboratory();
        net.engio.pips.lab.Benchmark benchmark2 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList3 = benchmark2.getCollectors();
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList5 = benchmark2.getCollectors("");
        // The following exception was thrown during execution in test generation
        try {
            laboratory0.measure(benchmark2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iDataCollectorList3);
        org.junit.Assert.assertNotNull(iDataCollectorList5);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        boolean boolean2 = workload1.hasTasksToRun();
        net.engio.pips.lab.workload.Workload workload4 = workload1.setDelay((long) '#');
        java.lang.String str5 = workload1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(0ms)->Parallel tasks:1,null,null\n" + "'", str5, "(0ms)->Parallel tasks:1,null,null\n");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str2 = benchmark1.getReportBaseDir();
        java.lang.String str3 = benchmark1.toString();
        net.engio.pips.lab.Benchmark benchmark5 = benchmark1.setBasePath("hi!");
        net.engio.pips.lab.Benchmark benchmark7 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList8 = benchmark7.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter9 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter10 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter11 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray12 = new net.engio.pips.reports.IReporter[] { cSVFileExporter9, cSVFileExporter10, cSVFileExporter11 };
        benchmark7.generateReports(iReporterArray12);
        net.engio.pips.lab.ExecutionContext executionContext14 = new net.engio.pips.lab.ExecutionContext(benchmark7);
        net.engio.pips.lab.LabException.ErrorCode errorCode16 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 10, errorCode16, 1.0f, '4' };
        net.engio.pips.lab.ExecutionContext executionContext20 = executionContext14.bindAll(objArray19);
        net.engio.pips.lab.Benchmark benchmark22 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList23 = benchmark22.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter24 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter25 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter26 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray27 = new net.engio.pips.reports.IReporter[] { cSVFileExporter24, cSVFileExporter25, cSVFileExporter26 };
        benchmark22.generateReports(iReporterArray27);
        java.util.Collection<java.lang.Cloneable> cloneableCollection29 = executionContext14.getAll((java.lang.Object) iReporterArray27);
        net.engio.pips.data.DataCollector<net.engio.pips.data.DataCollectorManager> dataCollectorManagerDataCollector31 = executionContext14.createLocalCollector("Sample interval");
        net.engio.pips.lab.Benchmark benchmark33 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList34 = benchmark33.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter35 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter36 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter37 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray38 = new net.engio.pips.reports.IReporter[] { cSVFileExporter35, cSVFileExporter36, cSVFileExporter37 };
        benchmark33.generateReports(iReporterArray38);
        net.engio.pips.lab.ExecutionContext executionContext40 = new net.engio.pips.lab.ExecutionContext(benchmark33);
        net.engio.pips.lab.LabException.ErrorCode errorCode42 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        java.lang.Object[] objArray45 = new java.lang.Object[] { 10, errorCode42, 1.0f, '4' };
        net.engio.pips.lab.ExecutionContext executionContext46 = executionContext40.bindAll(objArray45);
        net.engio.pips.lab.Benchmark benchmark48 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList49 = benchmark48.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter50 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter51 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter52 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray53 = new net.engio.pips.reports.IReporter[] { cSVFileExporter50, cSVFileExporter51, cSVFileExporter52 };
        benchmark48.generateReports(iReporterArray53);
        java.util.Collection<java.lang.Cloneable> cloneableCollection55 = executionContext40.getAll((java.lang.Object) iReporterArray53);
        net.engio.pips.data.DataCollector<net.engio.pips.data.DataCollectorManager> dataCollectorManagerDataCollector57 = executionContext40.createLocalCollector("Sample interval");
        net.engio.pips.data.DataProcessor<net.engio.pips.data.DataCollectorManager, net.engio.pips.data.DataCollectorManager> dataCollectorManagerDataProcessor58 = dataCollectorManagerDataCollector31.add((net.engio.pips.data.IDataProcessor<net.engio.pips.data.DataCollectorManager, net.engio.pips.data.DataCollectorManager>) dataCollectorManagerDataCollector57);
        net.engio.pips.data.IDataCollector<net.engio.pips.data.DataCollectorManager> dataCollectorManagerIDataCollector59 = benchmark1.addCollector((net.engio.pips.data.IDataCollector<net.engio.pips.data.DataCollectorManager>) dataCollectorManagerDataCollector57);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str3, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(benchmark5);
        org.junit.Assert.assertNotNull(iDataCollectorList8);
        org.junit.Assert.assertNotNull(iReporterArray12);
        org.junit.Assert.assertTrue("'" + errorCode16 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode16.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext20);
        org.junit.Assert.assertNotNull(iDataCollectorList23);
        org.junit.Assert.assertNotNull(iReporterArray27);
        org.junit.Assert.assertNotNull(cloneableCollection29);
        org.junit.Assert.assertNotNull(dataCollectorManagerDataCollector31);
        org.junit.Assert.assertNotNull(iDataCollectorList34);
        org.junit.Assert.assertNotNull(iReporterArray38);
        org.junit.Assert.assertTrue("'" + errorCode42 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode42.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext46);
        org.junit.Assert.assertNotNull(iDataCollectorList49);
        org.junit.Assert.assertNotNull(iReporterArray53);
        org.junit.Assert.assertNotNull(cloneableCollection55);
        org.junit.Assert.assertNotNull(dataCollectorManagerDataCollector57);
        org.junit.Assert.assertNotNull(dataCollectorManagerDataProcessor58);
        org.junit.Assert.assertNotNull(dataCollectorManagerIDataCollector59);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        net.engio.pips.reports.CSVFileExporter cSVFileExporter0 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.lab.Benchmark benchmark2 = new net.engio.pips.lab.Benchmark("hi!");
        net.engio.pips.lab.workload.ExecutionEvent executionEvent4 = benchmark2.getProperty("Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList6 = benchmark2.getCollectors("Title");
        cSVFileExporter0.generate(benchmark2);
        net.engio.pips.lab.Benchmark benchmark8 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFileExporter0.generate(benchmark8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(executionEvent4);
        org.junit.Assert.assertNotNull(iDataCollectorList6);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        workload1.finished();
        net.engio.pips.lab.workload.Workload.StartSpecification startSpecification3 = workload1.starts();
        net.engio.pips.lab.workload.Workload workload4 = startSpecification3.immediately();
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory5 = workload4.getITaskFactory();
        org.junit.Assert.assertNotNull(startSpecification3);
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertNull(iTaskFactory5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        long long5 = workload4.getStarted();
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory6 = workload4.getITaskFactory();
        net.engio.pips.lab.workload.Duration duration7 = workload4.getDuration();
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory8 = null;
        net.engio.pips.lab.workload.Workload workload9 = workload4.setITaskFactory(iTaskFactory8);
        boolean boolean10 = workload4.hasDelay();
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(iTaskFactory6);
        org.junit.Assert.assertNull(duration7);
        org.junit.Assert.assertNotNull(workload9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test105() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1700471365373L + "'", long28 == 1700471365373L);
        org.junit.Assert.assertNotNull(executionContext30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        net.engio.pips.lab.common.ValueGenerator<net.engio.pips.lab.Benchmark> benchmarkValueGenerator0 = null;
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange2 = new net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark>(benchmarkValueGenerator0, (int) (short) 0);
        net.engio.pips.lab.Benchmark benchmark4 = benchmarkRange2.getElement(100);
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange5 = benchmarkRange2.shuffle();
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange6 = benchmarkRange2.shuffle();
        // The following exception was thrown during execution in test generation
        try {
            net.engio.pips.lab.Benchmark benchmark7 = benchmarkRange2.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(benchmark4);
        org.junit.Assert.assertNotNull(benchmarkRange5);
        org.junit.Assert.assertNotNull(benchmarkRange6);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        net.engio.pips.lab.Executions executions0 = new net.engio.pips.lab.Executions();
        java.util.Collection<java.util.List<net.engio.pips.data.IDataCollector>> iDataCollectorListCollection2 = executions0.getAll("Log stream");
        net.engio.pips.lab.ExecutionContext executionContext3 = null;
        boolean boolean4 = executions0.add(executionContext3);
        org.junit.Assert.assertNotNull(iDataCollectorListCollection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
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
        net.engio.pips.lab.Benchmark benchmark16 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList17 = benchmark16.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter18 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter19 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter20 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray21 = new net.engio.pips.reports.IReporter[] { cSVFileExporter18, cSVFileExporter19, cSVFileExporter20 };
        benchmark16.generateReports(iReporterArray21);
        java.util.Collection<java.lang.Cloneable> cloneableCollection23 = executionContext8.getAll((java.lang.Object) iReporterArray21);
        net.engio.pips.data.DataCollector<net.engio.pips.data.DataCollectorManager> dataCollectorManagerDataCollector25 = executionContext8.createLocalCollector("Sample interval");
        net.engio.pips.lab.Benchmark benchmark27 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList28 = benchmark27.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter29 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter30 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter31 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray32 = new net.engio.pips.reports.IReporter[] { cSVFileExporter29, cSVFileExporter30, cSVFileExporter31 };
        benchmark27.generateReports(iReporterArray32);
        net.engio.pips.lab.ExecutionContext executionContext34 = new net.engio.pips.lab.ExecutionContext(benchmark27);
        net.engio.pips.lab.LabException.ErrorCode errorCode36 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        java.lang.Object[] objArray39 = new java.lang.Object[] { 10, errorCode36, 1.0f, '4' };
        net.engio.pips.lab.ExecutionContext executionContext40 = executionContext34.bindAll(objArray39);
        net.engio.pips.lab.Benchmark benchmark42 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList43 = benchmark42.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter44 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter45 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter46 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray47 = new net.engio.pips.reports.IReporter[] { cSVFileExporter44, cSVFileExporter45, cSVFileExporter46 };
        benchmark42.generateReports(iReporterArray47);
        java.util.Collection<java.lang.Cloneable> cloneableCollection49 = executionContext34.getAll((java.lang.Object) iReporterArray47);
        net.engio.pips.data.DataCollector<net.engio.pips.data.DataCollectorManager> dataCollectorManagerDataCollector51 = executionContext34.createLocalCollector("Sample interval");
        net.engio.pips.lab.Benchmark benchmark53 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList54 = benchmark53.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter55 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter56 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter57 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray58 = new net.engio.pips.reports.IReporter[] { cSVFileExporter55, cSVFileExporter56, cSVFileExporter57 };
        benchmark53.generateReports(iReporterArray58);
        net.engio.pips.lab.ExecutionContext executionContext60 = new net.engio.pips.lab.ExecutionContext(benchmark53);
        net.engio.pips.lab.LabException.ErrorCode errorCode62 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        java.lang.Object[] objArray65 = new java.lang.Object[] { 10, errorCode62, 1.0f, '4' };
        net.engio.pips.lab.ExecutionContext executionContext66 = executionContext60.bindAll(objArray65);
        net.engio.pips.lab.Benchmark benchmark68 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList69 = benchmark68.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter70 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter71 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter72 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray73 = new net.engio.pips.reports.IReporter[] { cSVFileExporter70, cSVFileExporter71, cSVFileExporter72 };
        benchmark68.generateReports(iReporterArray73);
        java.util.Collection<java.lang.Cloneable> cloneableCollection75 = executionContext60.getAll((java.lang.Object) iReporterArray73);
        net.engio.pips.data.DataCollector<net.engio.pips.data.DataCollectorManager> dataCollectorManagerDataCollector77 = executionContext60.createLocalCollector("Sample interval");
        net.engio.pips.data.DataProcessor<net.engio.pips.data.DataCollectorManager, net.engio.pips.data.DataCollectorManager> dataCollectorManagerDataProcessor78 = dataCollectorManagerDataCollector51.add((net.engio.pips.data.IDataProcessor<net.engio.pips.data.DataCollectorManager, net.engio.pips.data.DataCollectorManager>) dataCollectorManagerDataCollector77);
        net.engio.pips.data.IDataProcessor<net.engio.pips.data.DataCollectorManager, ?> dataCollectorManagerIDataProcessor79 = null;
        net.engio.pips.data.IDataProcessor[] iDataProcessorArray81 = new net.engio.pips.data.IDataProcessor[1];
        @SuppressWarnings("unchecked")
        net.engio.pips.data.IDataProcessor<net.engio.pips.data.DataCollectorManager, ?>[] dataCollectorManagerIDataProcessorArray82 = (net.engio.pips.data.IDataProcessor<net.engio.pips.data.DataCollectorManager, ?>[]) iDataProcessorArray81;
        dataCollectorManagerIDataProcessorArray82[0] = dataCollectorManagerIDataProcessor79;
        net.engio.pips.data.IDataProcessor<net.engio.pips.data.DataCollectorManager, net.engio.pips.data.DataCollectorManager> dataCollectorManagerIDataProcessor85 = dataCollectorManagerDataCollector51.connectTo(dataCollectorManagerIDataProcessorArray82);
        net.engio.pips.lab.Benchmark benchmark87 = new net.engio.pips.lab.Benchmark("hi!");
        net.engio.pips.data.DataCollectorManager dataCollectorManager88 = benchmark87.getCollectorManager();
        dataCollectorManagerDataCollector51.receive(dataCollectorManager88);
        net.engio.pips.data.DataProcessor<net.engio.pips.data.DataCollectorManager, net.engio.pips.data.DataCollectorManager> dataCollectorManagerDataProcessor90 = dataCollectorManagerDataCollector25.add((net.engio.pips.data.IDataProcessor<net.engio.pips.data.DataCollectorManager, net.engio.pips.data.DataCollectorManager>) dataCollectorManagerDataCollector51);
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(iDataCollectorList17);
        org.junit.Assert.assertNotNull(iReporterArray21);
        org.junit.Assert.assertNotNull(cloneableCollection23);
        org.junit.Assert.assertNotNull(dataCollectorManagerDataCollector25);
        org.junit.Assert.assertNotNull(iDataCollectorList28);
        org.junit.Assert.assertNotNull(iReporterArray32);
        org.junit.Assert.assertTrue("'" + errorCode36 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode36.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext40);
        org.junit.Assert.assertNotNull(iDataCollectorList43);
        org.junit.Assert.assertNotNull(iReporterArray47);
        org.junit.Assert.assertNotNull(cloneableCollection49);
        org.junit.Assert.assertNotNull(dataCollectorManagerDataCollector51);
        org.junit.Assert.assertNotNull(iDataCollectorList54);
        org.junit.Assert.assertNotNull(iReporterArray58);
        org.junit.Assert.assertTrue("'" + errorCode62 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode62.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext66);
        org.junit.Assert.assertNotNull(iDataCollectorList69);
        org.junit.Assert.assertNotNull(iReporterArray73);
        org.junit.Assert.assertNotNull(cloneableCollection75);
        org.junit.Assert.assertNotNull(dataCollectorManagerDataCollector77);
        org.junit.Assert.assertNotNull(dataCollectorManagerDataProcessor78);
        org.junit.Assert.assertNotNull(iDataProcessorArray81);
        org.junit.Assert.assertNotNull(dataCollectorManagerIDataProcessorArray82);
        org.junit.Assert.assertNotNull(dataCollectorManagerIDataProcessor85);
        org.junit.Assert.assertNotNull(dataCollectorManager88);
        org.junit.Assert.assertNotNull(dataCollectorManagerDataProcessor90);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
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
        java.util.Collection<net.engio.pips.reports.IReporter> iReporterCollection17 = executionContext14.getAll("Log stream");
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(executionContext15);
        org.junit.Assert.assertNotNull(iReporterCollection17);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        long long5 = workload4.getStarted();
        net.engio.pips.lab.workload.StartCondition startCondition6 = workload4.getStartCondition();
        net.engio.pips.lab.workload.StartCondition startCondition7 = new net.engio.pips.lab.workload.StartCondition(workload4);
        net.engio.pips.lab.workload.ExecutionEvent executionEvent8 = null;
        net.engio.pips.lab.workload.Workload workload10 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition11 = new net.engio.pips.lab.workload.StartCondition(workload10);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory12 = null;
        net.engio.pips.lab.workload.Workload workload13 = workload10.setITaskFactory(iTaskFactory12);
        net.engio.pips.lab.workload.ExecutionEvent executionEvent14 = net.engio.pips.lab.workload.ExecutionEvent.WorkloadCompletion;
        net.engio.pips.lab.workload.ExecutionHandler executionHandler15 = workload10.getHandler(executionEvent14);
        net.engio.pips.lab.workload.Workload workload16 = workload4.handle(executionEvent8, executionHandler15);
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(startCondition6);
        org.junit.Assert.assertNotNull(workload13);
        org.junit.Assert.assertTrue("'" + executionEvent14 + "' != '" + net.engio.pips.lab.workload.ExecutionEvent.WorkloadCompletion + "'", executionEvent14.equals(net.engio.pips.lab.workload.ExecutionEvent.WorkloadCompletion));
        org.junit.Assert.assertNotNull(executionHandler15);
        org.junit.Assert.assertNotNull(workload16);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        net.engio.pips.lab.Executions executions0 = new net.engio.pips.lab.Executions();
        java.util.Collection<java.util.List<net.engio.pips.data.IDataCollector>> iDataCollectorListCollection2 = executions0.getAll("Log stream");
        net.engio.pips.reports.TimeSeriesCollector timeSeriesCollector4 = new net.engio.pips.reports.TimeSeriesCollector("Report base dir");
        java.util.Collection<net.engio.pips.lab.workload.Workload.StartSpecification> startSpecificationCollection5 = executions0.getAll((java.lang.Object) timeSeriesCollector4);
        org.junit.Assert.assertNotNull(iDataCollectorListCollection2);
        org.junit.Assert.assertNotNull(startSpecificationCollection5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        net.engio.pips.lab.workload.Workload workload0 = null;
        net.engio.pips.lab.workload.StartCondition startCondition1 = new net.engio.pips.lab.workload.StartCondition(workload0);
        java.lang.String str2 = startCondition1.toString();
        boolean boolean3 = startCondition1.isDependent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Unknown startcondition" + "'", str2, "Unknown startcondition");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Unknown startcondition");
        java.lang.String str2 = seriesGroup1.getyAxis();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        long long5 = workload4.getStarted();
        net.engio.pips.lab.workload.StartCondition startCondition6 = workload4.getStartCondition();
        net.engio.pips.lab.workload.Workload.StartSpecification startSpecification7 = workload4.starts();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        net.engio.pips.lab.workload.Workload workload10 = startSpecification7.after((int) (byte) 10, timeUnit9);
        boolean boolean11 = workload10.isFinished();
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(startCondition6);
        org.junit.Assert.assertNotNull(startSpecification7);
        org.junit.Assert.assertNotNull(workload10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.data.IDataCollector iDataCollector2 = null;
        net.engio.pips.reports.SeriesGroup seriesGroup3 = seriesGroup1.addCollector(iDataCollector2);
        net.engio.pips.reports.SeriesGroup seriesGroup5 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation6 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup7 = seriesGroup5.setYAxisOrientation(orientation6);
        net.engio.pips.reports.SeriesGroup seriesGroup8 = seriesGroup3.setYAxisOrientation(orientation6);
        net.engio.pips.reports.SeriesGroup seriesGroup10 = seriesGroup8.setyAxis("Base path");
        java.lang.String str11 = seriesGroup8.getLabel();
        org.junit.Assert.assertNotNull(seriesGroup3);
        org.junit.Assert.assertTrue("'" + orientation6 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation6.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup7);
        org.junit.Assert.assertNotNull(seriesGroup8);
        org.junit.Assert.assertNotNull(seriesGroup10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Timeout in seconds" + "'", str11, "Timeout in seconds");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        workload1.started();
        net.engio.pips.lab.workload.Workload.StartSpecification startSpecification4 = workload1.starts();
        org.junit.Assert.assertNotNull(startSpecification4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
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
        boolean boolean23 = executionContext17.containsKey("Report base dir");
        net.engio.pips.reports.ChartGenerator chartGenerator24 = new net.engio.pips.reports.ChartGenerator();
        net.engio.pips.reports.ChartGenerator chartGenerator26 = chartGenerator24.setXAxisLabel("Sample interval");
        net.engio.pips.reports.ChartGenerator chartGenerator28 = chartGenerator26.setTitle("Report base dir");
        net.engio.pips.reports.SeriesGroup seriesGroup30 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.data.IDataCollector iDataCollector31 = null;
        net.engio.pips.reports.SeriesGroup seriesGroup32 = seriesGroup30.addCollector(iDataCollector31);
        net.engio.pips.reports.SeriesGroup seriesGroup34 = seriesGroup32.setyAxis("Base path");
        net.engio.pips.data.IDataCollector iDataCollector35 = null;
        net.engio.pips.reports.SeriesGroup seriesGroup36 = seriesGroup34.addCollector(iDataCollector35);
        net.engio.pips.reports.ChartGenerator chartGenerator37 = chartGenerator28.draw(seriesGroup36);
        net.engio.pips.reports.SeriesGroup seriesGroup39 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.data.IDataCollector iDataCollector40 = null;
        net.engio.pips.reports.SeriesGroup seriesGroup41 = seriesGroup39.addCollector(iDataCollector40);
        net.engio.pips.reports.SeriesGroup seriesGroup43 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation44 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup45 = seriesGroup43.setYAxisOrientation(orientation44);
        net.engio.pips.reports.SeriesGroup seriesGroup46 = seriesGroup41.setYAxisOrientation(orientation44);
        net.engio.pips.reports.ChartGenerator chartGenerator47 = chartGenerator37.draw(seriesGroup41);
        java.io.ObjectInputValidation objectInputValidation48 = executionContext17.get((java.lang.Object) chartGenerator37);
        org.junit.Assert.assertNotNull(iDataCollectorList5);
        org.junit.Assert.assertNotNull(iReporterArray9);
        org.junit.Assert.assertTrue("'" + errorCode13 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode13.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext17);
        org.junit.Assert.assertNotNull(abstractIntervalXYDatasetCollection19);
        org.junit.Assert.assertNotNull(executionContext20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(chartGenerator26);
        org.junit.Assert.assertNotNull(chartGenerator28);
        org.junit.Assert.assertNotNull(seriesGroup32);
        org.junit.Assert.assertNotNull(seriesGroup34);
        org.junit.Assert.assertNotNull(seriesGroup36);
        org.junit.Assert.assertNotNull(chartGenerator37);
        org.junit.Assert.assertNotNull(seriesGroup41);
        org.junit.Assert.assertTrue("'" + orientation44 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation44.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup45);
        org.junit.Assert.assertNotNull(seriesGroup46);
        org.junit.Assert.assertNotNull(chartGenerator47);
        org.junit.Assert.assertNull(objectInputValidation48);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.data.IDataCollector iDataCollector2 = null;
        net.engio.pips.reports.SeriesGroup seriesGroup3 = seriesGroup1.addCollector(iDataCollector2);
        net.engio.pips.reports.SeriesGroup.Orientation orientation4 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup5 = seriesGroup1.setYAxisOrientation(orientation4);
        org.junit.Assert.assertNotNull(seriesGroup3);
        org.junit.Assert.assertTrue("'" + orientation4 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation4.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup5);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.data.IDataCollector iDataCollector2 = null;
        net.engio.pips.reports.SeriesGroup seriesGroup3 = seriesGroup1.addCollector(iDataCollector2);
        net.engio.pips.reports.SeriesGroup seriesGroup5 = seriesGroup3.setyAxis("Base path");
        net.engio.pips.data.IDataCollector iDataCollector6 = null;
        net.engio.pips.reports.SeriesGroup seriesGroup7 = seriesGroup5.addCollector(iDataCollector6);
        net.engio.pips.reports.SeriesGroup seriesGroup9 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation10 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup11 = seriesGroup9.setYAxisOrientation(orientation10);
        net.engio.pips.lab.Benchmark benchmark13 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str14 = benchmark13.getReportBaseDir();
        java.lang.String str15 = benchmark13.toString();
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection16 = seriesGroup9.createDataSet(benchmark13);
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList18 = benchmark13.getCollectors("run 1 times");
        net.engio.pips.lab.Benchmark benchmark20 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str21 = benchmark20.getReportBaseDir();
        java.lang.String str22 = benchmark20.toString();
        net.engio.pips.lab.Benchmark benchmark24 = benchmark20.setBasePath("hi!");
        java.io.OutputStream outputStream25 = benchmark20.getLogStream();
        net.engio.pips.lab.Benchmark benchmark26 = benchmark13.setLogStream(outputStream25);
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection27 = seriesGroup5.createDataSet(benchmark13);
        org.junit.Assert.assertNotNull(seriesGroup3);
        org.junit.Assert.assertNotNull(seriesGroup5);
        org.junit.Assert.assertNotNull(seriesGroup7);
        org.junit.Assert.assertTrue("'" + orientation10 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation10.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str15, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(timeSeriesCollection16);
        org.junit.Assert.assertNotNull(iDataCollectorList18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str22, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(benchmark24);
        org.junit.Assert.assertNotNull(outputStream25);
        org.junit.Assert.assertNotNull(benchmark26);
        org.junit.Assert.assertNotNull(timeSeriesCollection27);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
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
        net.engio.pips.reports.SeriesGroup seriesGroup18 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation19 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup20 = seriesGroup18.setYAxisOrientation(orientation19);
        net.engio.pips.reports.SeriesGroup.Orientation orientation21 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup22 = seriesGroup18.setYAxisOrientation(orientation21);
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList23 = executionContext14.get((java.lang.Object) seriesGroup22);
        net.engio.pips.reports.SeriesGroup seriesGroup25 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation26 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup27 = seriesGroup25.setYAxisOrientation(orientation26);
        net.engio.pips.reports.SeriesGroup seriesGroup28 = seriesGroup22.setYAxisOrientation(orientation26);
        net.engio.pips.data.IDataCollector iDataCollector29 = null;
        net.engio.pips.reports.SeriesGroup seriesGroup30 = seriesGroup22.addCollector(iDataCollector29);
        net.engio.pips.reports.SeriesGroup seriesGroup32 = seriesGroup30.setyAxis("Timeout in seconds");
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(executionContext15);
        org.junit.Assert.assertTrue("'" + orientation19 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation19.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup20);
        org.junit.Assert.assertTrue("'" + orientation21 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation21.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup22);
        org.junit.Assert.assertNull(iDataCollectorList23);
        org.junit.Assert.assertTrue("'" + orientation26 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation26.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup27);
        org.junit.Assert.assertNotNull(seriesGroup28);
        org.junit.Assert.assertNotNull(seriesGroup30);
        org.junit.Assert.assertNotNull(seriesGroup32);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        net.engio.pips.lab.LabException.ErrorCode errorCode1 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration;
        net.engio.pips.lab.LabException labException2 = new net.engio.pips.lab.LabException("Base path", errorCode1);
        java.lang.String str3 = labException2.toString();
        org.junit.Assert.assertTrue("'" + errorCode1 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration + "'", errorCode1.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "net.engio.pips.lab.LabException: Base path" + "'", str3, "net.engio.pips.lab.LabException: Base path");
    }

    @Test
    public void test122() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1700471367115L + "'", long18 == 1700471367115L);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
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
        java.util.Collection<org.jfree.data.xy.AbstractIntervalXYDataset> abstractIntervalXYDatasetCollection16 = executionContext14.getMatching("run 1 times");
        java.util.Collection<net.engio.pips.lab.workload.Duration> durationCollection18 = executionContext14.getMatching("Timeout in seconds");
        java.util.Collection<java.lang.Throwable> throwableCollection20 = executionContext14.getAll("Log stream");
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(abstractIntervalXYDatasetCollection16);
        org.junit.Assert.assertNotNull(durationCollection18);
        org.junit.Assert.assertNotNull(throwableCollection20);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        net.engio.pips.lab.workload.Workload workload6 = workload4.setDelay((long) '4');
        net.engio.pips.lab.workload.Workload.StartSpecification startSpecification7 = workload6.starts();
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertNotNull(workload6);
        org.junit.Assert.assertNotNull(startSpecification7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        net.engio.pips.reports.ChartGenerator chartGenerator0 = new net.engio.pips.reports.ChartGenerator();
        net.engio.pips.reports.ChartGenerator chartGenerator2 = chartGenerator0.setXAxisLabel("Sample interval");
        net.engio.pips.reports.ChartGenerator chartGenerator4 = chartGenerator2.setFileName("Base path");
        net.engio.pips.reports.ChartGenerator chartGenerator5 = new net.engio.pips.reports.ChartGenerator();
        net.engio.pips.reports.ChartGenerator chartGenerator7 = chartGenerator5.setXAxisLabel("Sample interval");
        net.engio.pips.reports.ChartGenerator chartGenerator9 = chartGenerator7.setTitle("Report base dir");
        net.engio.pips.reports.SeriesGroup seriesGroup11 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.data.IDataCollector iDataCollector12 = null;
        net.engio.pips.reports.SeriesGroup seriesGroup13 = seriesGroup11.addCollector(iDataCollector12);
        net.engio.pips.reports.SeriesGroup seriesGroup15 = seriesGroup13.setyAxis("Base path");
        net.engio.pips.data.IDataCollector iDataCollector16 = null;
        net.engio.pips.reports.SeriesGroup seriesGroup17 = seriesGroup15.addCollector(iDataCollector16);
        net.engio.pips.reports.ChartGenerator chartGenerator18 = chartGenerator9.draw(seriesGroup17);
        net.engio.pips.reports.ChartGenerator chartGenerator19 = chartGenerator2.draw(seriesGroup17);
        net.engio.pips.lab.Benchmark benchmark21 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList22 = benchmark21.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter23 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter24 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter25 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray26 = new net.engio.pips.reports.IReporter[] { cSVFileExporter23, cSVFileExporter24, cSVFileExporter25 };
        benchmark21.generateReports(iReporterArray26);
        net.engio.pips.lab.ExecutionContext executionContext28 = new net.engio.pips.lab.ExecutionContext(benchmark21);
        net.engio.pips.lab.Benchmark benchmark31 = new net.engio.pips.lab.Benchmark("hi!");
        net.engio.pips.data.DataCollectorManager dataCollectorManager32 = benchmark31.getCollectorManager();
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList34 = benchmark31.getCollectors("hi!");
        net.engio.pips.lab.Benchmark benchmark35 = benchmark21.setProperty("", (java.lang.Object) benchmark31);
        net.engio.pips.lab.Benchmark benchmark37 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList38 = benchmark37.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter39 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter40 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter41 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray42 = new net.engio.pips.reports.IReporter[] { cSVFileExporter39, cSVFileExporter40, cSVFileExporter41 };
        benchmark37.generateReports(iReporterArray42);
        benchmark21.generateReports(iReporterArray42);
        java.io.OutputStream outputStream45 = benchmark21.getLogStream();
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection46 = seriesGroup17.createDataSet(benchmark21);
        org.junit.Assert.assertNotNull(chartGenerator2);
        org.junit.Assert.assertNotNull(chartGenerator4);
        org.junit.Assert.assertNotNull(chartGenerator7);
        org.junit.Assert.assertNotNull(chartGenerator9);
        org.junit.Assert.assertNotNull(seriesGroup13);
        org.junit.Assert.assertNotNull(seriesGroup15);
        org.junit.Assert.assertNotNull(seriesGroup17);
        org.junit.Assert.assertNotNull(chartGenerator18);
        org.junit.Assert.assertNotNull(chartGenerator19);
        org.junit.Assert.assertNotNull(iDataCollectorList22);
        org.junit.Assert.assertNotNull(iReporterArray26);
        org.junit.Assert.assertNotNull(dataCollectorManager32);
        org.junit.Assert.assertNotNull(iDataCollectorList34);
        org.junit.Assert.assertNotNull(benchmark35);
        org.junit.Assert.assertNotNull(iDataCollectorList38);
        org.junit.Assert.assertNotNull(iReporterArray42);
        org.junit.Assert.assertNotNull(outputStream45);
        org.junit.Assert.assertNotNull(timeSeriesCollection46);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        workload1.started();
        int int4 = workload1.getParallelUnits();
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory5 = null;
        net.engio.pips.lab.workload.Workload workload6 = workload1.setITaskFactory(iTaskFactory5);
        long long7 = workload6.getDelay();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(workload6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
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
        org.jfree.data.xy.AbstractIntervalXYDataset abstractIntervalXYDataset17 = executionContext15.get((java.lang.Object) (short) 0);
        boolean boolean18 = executionContext15.isFinished();
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(executionContext15);
        org.junit.Assert.assertNull(abstractIntervalXYDataset17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        net.engio.pips.lab.workload.Workload workload0 = null;
        net.engio.pips.lab.workload.StartCondition startCondition1 = new net.engio.pips.lab.workload.StartCondition(workload0);
        boolean boolean2 = startCondition1.isTimebased();
        boolean boolean3 = startCondition1.isImmediately();
        boolean boolean4 = startCondition1.isTimebased();
        boolean boolean5 = startCondition1.isDependent();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
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
        java.util.Collection<org.jfree.data.xy.AbstractIntervalXYDataset> abstractIntervalXYDatasetCollection16 = executionContext14.getMatching("run 1 times");
        executionContext14.started();
        net.engio.pips.lab.ExecutionContext executionContext18 = executionContext14.getChild();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = executionContext18.getProperties();
        net.engio.pips.reports.ChartGenerator chartGenerator20 = new net.engio.pips.reports.ChartGenerator();
        net.engio.pips.reports.ChartGenerator chartGenerator22 = chartGenerator20.setPixelPerDatapoint((int) (byte) 10);
        net.engio.pips.reports.ChartGenerator chartGenerator24 = chartGenerator20.setFileName("Sample interval");
        net.engio.pips.data.DataCollector<net.engio.pips.data.DataCollectorManager> dataCollectorManagerDataCollector25 = executionContext18.get((java.lang.Object) chartGenerator24);
        java.util.Collection<org.jfree.data.xy.AbstractIntervalXYDataset> abstractIntervalXYDatasetCollection27 = executionContext18.getAll("Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(abstractIntervalXYDatasetCollection16);
        org.junit.Assert.assertNotNull(executionContext18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(chartGenerator22);
        org.junit.Assert.assertNotNull(chartGenerator24);
        org.junit.Assert.assertNull(dataCollectorManagerDataCollector25);
        org.junit.Assert.assertNotNull(abstractIntervalXYDatasetCollection27);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("Log stream");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        net.engio.pips.lab.ExecutionContext executionContext2 = benchmark1.getClobalContext();
        executionContext2.finished();
        org.junit.Assert.assertNotNull(executionContext2);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.data.IDataCollector iDataCollector2 = null;
        net.engio.pips.reports.SeriesGroup seriesGroup3 = seriesGroup1.addCollector(iDataCollector2);
        net.engio.pips.lab.Benchmark benchmark5 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList6 = benchmark5.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter7 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter8 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter9 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray10 = new net.engio.pips.reports.IReporter[] { cSVFileExporter7, cSVFileExporter8, cSVFileExporter9 };
        benchmark5.generateReports(iReporterArray10);
        net.engio.pips.lab.ExecutionContext executionContext12 = new net.engio.pips.lab.ExecutionContext(benchmark5);
        net.engio.pips.lab.Benchmark benchmark15 = new net.engio.pips.lab.Benchmark("hi!");
        net.engio.pips.data.DataCollectorManager dataCollectorManager16 = benchmark15.getCollectorManager();
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList18 = benchmark15.getCollectors("hi!");
        net.engio.pips.lab.Benchmark benchmark19 = benchmark5.setProperty("", (java.lang.Object) benchmark15);
        java.io.OutputStream outputStream20 = benchmark19.getLogStream();
        net.engio.pips.lab.Benchmark benchmark22 = benchmark19.setBasePath("Unknown startcondition");
        net.engio.pips.lab.workload.Workload workload24 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition25 = new net.engio.pips.lab.workload.StartCondition(workload24);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory26 = null;
        net.engio.pips.lab.workload.Workload workload27 = workload24.setITaskFactory(iTaskFactory26);
        net.engio.pips.lab.workload.StartCondition startCondition28 = workload27.getStartCondition();
        net.engio.pips.lab.workload.Duration duration29 = workload27.getDuration();
        boolean boolean30 = workload27.isFinished();
        net.engio.pips.lab.workload.Workload[] workloadArray31 = new net.engio.pips.lab.workload.Workload[] { workload27 };
        net.engio.pips.lab.Benchmark benchmark32 = benchmark22.addWorkload(workloadArray31);
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection33 = seriesGroup3.createDataSet(benchmark32);
        org.junit.Assert.assertNotNull(seriesGroup3);
        org.junit.Assert.assertNotNull(iDataCollectorList6);
        org.junit.Assert.assertNotNull(iReporterArray10);
        org.junit.Assert.assertNotNull(dataCollectorManager16);
        org.junit.Assert.assertNotNull(iDataCollectorList18);
        org.junit.Assert.assertNotNull(benchmark19);
        org.junit.Assert.assertNotNull(outputStream20);
        org.junit.Assert.assertNotNull(benchmark22);
        org.junit.Assert.assertNotNull(workload27);
        org.junit.Assert.assertNull(startCondition28);
        org.junit.Assert.assertNull(duration29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(workloadArray31);
        org.junit.Assert.assertNotNull(benchmark32);
        org.junit.Assert.assertNotNull(timeSeriesCollection33);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        net.engio.pips.reports.ChartGenerator chartGenerator0 = new net.engio.pips.reports.ChartGenerator();
        net.engio.pips.reports.ChartGenerator chartGenerator2 = chartGenerator0.setPixelPerDatapoint((int) (byte) 10);
        net.engio.pips.reports.ChartGenerator chartGenerator4 = chartGenerator2.setPixelPerDatapoint((int) '4');
        net.engio.pips.reports.ChartGenerator chartGenerator6 = chartGenerator4.setTitle("");
        org.junit.Assert.assertNotNull(chartGenerator2);
        org.junit.Assert.assertNotNull(chartGenerator4);
        org.junit.Assert.assertNotNull(chartGenerator6);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        boolean boolean2 = workload1.hasTasksToRun();
        java.lang.String str3 = workload1.getName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        net.engio.pips.reports.ChartGenerator chartGenerator0 = new net.engio.pips.reports.ChartGenerator();
        net.engio.pips.reports.ChartGenerator chartGenerator2 = chartGenerator0.setXAxisLabel("Sample interval");
        net.engio.pips.reports.ChartGenerator chartGenerator4 = chartGenerator2.setTitle("Report base dir");
        net.engio.pips.reports.ChartGenerator chartGenerator6 = chartGenerator4.setTitle("");
        net.engio.pips.lab.Benchmark benchmark8 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str9 = benchmark8.getReportBaseDir();
        java.lang.String str10 = benchmark8.toString();
        net.engio.pips.lab.Benchmark benchmark12 = benchmark8.setBasePath("hi!");
        net.engio.pips.data.DataCollectorManager dataCollectorManager13 = benchmark8.getCollectorManager();
        // The following exception was thrown during execution in test generation
        try {
            chartGenerator6.generate(benchmark8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chartGenerator2);
        org.junit.Assert.assertNotNull(chartGenerator4);
        org.junit.Assert.assertNotNull(chartGenerator6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str10, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(benchmark12);
        org.junit.Assert.assertNotNull(dataCollectorManager13);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        net.engio.pips.lab.LabException.ErrorCode errorCode3 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration;
        net.engio.pips.lab.LabException labException4 = new net.engio.pips.lab.LabException("Base path", errorCode3);
        net.engio.pips.lab.LabException.ErrorCode errorCode5 = net.engio.pips.lab.LabException.ErrorCode.WLWithoutFactory;
        net.engio.pips.lab.LabException labException6 = new net.engio.pips.lab.LabException("Experiment hi! with 0 workloads\n\nand additional parameters:\n", (java.lang.Throwable) labException4, errorCode5);
        net.engio.pips.lab.LabException.ErrorCode errorCode7 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration;
        net.engio.pips.lab.LabException labException8 = new net.engio.pips.lab.LabException("(0ms)->Parallel tasks:1,null,null\n", (java.lang.Throwable) labException4, errorCode7);
        java.lang.Throwable[] throwableArray9 = labException8.getSuppressed();
        org.junit.Assert.assertTrue("'" + errorCode3 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration + "'", errorCode3.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration));
        org.junit.Assert.assertTrue("'" + errorCode5 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithoutFactory + "'", errorCode5.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithoutFactory));
        org.junit.Assert.assertTrue("'" + errorCode7 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration + "'", errorCode7.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration));
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        workload1.finished();
        net.engio.pips.lab.workload.Workload.StartSpecification startSpecification3 = workload1.starts();
        net.engio.pips.lab.workload.Workload workload4 = startSpecification3.immediately();
        net.engio.pips.lab.workload.Workload.StartSpecification startSpecification5 = workload4.new StartSpecification();
        net.engio.pips.lab.workload.StartCondition startCondition6 = new net.engio.pips.lab.workload.StartCondition(workload4);
        org.junit.Assert.assertNotNull(startSpecification3);
        org.junit.Assert.assertNotNull(workload4);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        net.engio.pips.lab.LabException.ErrorCode errorCode2 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration;
        net.engio.pips.lab.LabException labException3 = new net.engio.pips.lab.LabException("Base path", errorCode2);
        net.engio.pips.lab.LabException.ErrorCode errorCode4 = net.engio.pips.lab.LabException.ErrorCode.WLWithoutFactory;
        net.engio.pips.lab.LabException labException5 = new net.engio.pips.lab.LabException("Experiment hi! with 0 workloads\n\nand additional parameters:\n", (java.lang.Throwable) labException3, errorCode4);
        net.engio.pips.lab.LabException.ErrorCode errorCode6 = labException5.getCode();
        org.junit.Assert.assertTrue("'" + errorCode2 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration + "'", errorCode2.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration));
        org.junit.Assert.assertTrue("'" + errorCode4 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithoutFactory + "'", errorCode4.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithoutFactory));
        org.junit.Assert.assertTrue("'" + errorCode6 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithoutFactory + "'", errorCode6.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithoutFactory));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        net.engio.pips.lab.workload.Duration duration1 = new net.engio.pips.lab.workload.Duration((int) (short) 10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
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
        java.util.Collection<org.jfree.data.xy.AbstractIntervalXYDataset> abstractIntervalXYDatasetCollection16 = executionContext14.getMatching("run 1 times");
        net.engio.pips.lab.ExecutionContext executionContext17 = executionContext14.getChild();
        net.engio.pips.lab.Benchmark benchmark19 = new net.engio.pips.lab.Benchmark("hi!");
        net.engio.pips.data.DataCollectorManager dataCollectorManager20 = benchmark19.getCollectorManager();
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList22 = benchmark19.getCollectors("hi!");
        java.lang.reflect.Type type23 = executionContext17.get((java.lang.Object) "hi!");
        net.engio.pips.lab.ExecutionContext executionContext24 = executionContext17.getChild();
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(abstractIntervalXYDatasetCollection16);
        org.junit.Assert.assertNotNull(executionContext17);
        org.junit.Assert.assertNotNull(dataCollectorManager20);
        org.junit.Assert.assertNotNull(iDataCollectorList22);
        org.junit.Assert.assertNull(type23);
        org.junit.Assert.assertNotNull(executionContext24);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        net.engio.pips.lab.workload.Duration duration1 = new net.engio.pips.lab.workload.Duration((int) (byte) 1);
        java.lang.String str2 = duration1.toString();
        boolean boolean3 = duration1.isTimeBased();
        net.engio.pips.lab.workload.Workload workload4 = duration1.getDependingOn();
        boolean boolean5 = duration1.isTimeBased();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "run 1 times" + "'", str2, "run 1 times");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(workload4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        net.engio.pips.reports.TimeSeriesCollector timeSeriesCollector1 = new net.engio.pips.reports.TimeSeriesCollector("net.engio.pips.lab.LabException: Base path");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList2 = benchmark1.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter3 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter4 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter5 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray6 = new net.engio.pips.reports.IReporter[] { cSVFileExporter3, cSVFileExporter4, cSVFileExporter5 };
        benchmark1.generateReports(iReporterArray6);
        net.engio.pips.lab.ExecutionContext executionContext8 = new net.engio.pips.lab.ExecutionContext(benchmark1);
        net.engio.pips.lab.Benchmark benchmark11 = new net.engio.pips.lab.Benchmark("hi!");
        net.engio.pips.data.DataCollectorManager dataCollectorManager12 = benchmark11.getCollectorManager();
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList14 = benchmark11.getCollectors("hi!");
        net.engio.pips.lab.Benchmark benchmark15 = benchmark1.setProperty("", (java.lang.Object) benchmark11);
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList17 = benchmark15.getCollectors("");
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertNotNull(dataCollectorManager12);
        org.junit.Assert.assertNotNull(iDataCollectorList14);
        org.junit.Assert.assertNotNull(benchmark15);
        org.junit.Assert.assertNotNull(iDataCollectorList17);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
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
        java.util.Collection<net.engio.pips.reports.SeriesGroup> seriesGroupCollection24 = executionContext17.getAll("Timeout in seconds");
        org.junit.Assert.assertNotNull(iDataCollectorList5);
        org.junit.Assert.assertNotNull(iReporterArray9);
        org.junit.Assert.assertTrue("'" + errorCode13 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode13.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext17);
        org.junit.Assert.assertNotNull(abstractIntervalXYDatasetCollection19);
        org.junit.Assert.assertNotNull(executionContext20);
        org.junit.Assert.assertNotNull(seriesGroupCollection24);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.engio.pips.lab.workload.Duration duration2 = new net.engio.pips.lab.workload.Duration((-1), timeUnit1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal timeout condition:-1null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        net.engio.pips.reports.TimeSeriesCollector timeSeriesCollector1 = new net.engio.pips.reports.TimeSeriesCollector("Report base dir");
        net.engio.pips.reports.TimeSeriesConsumer timeSeriesConsumer4 = timeSeriesCollector1.makeSeries("Timeout in seconds", "Log stream");
        net.engio.pips.reports.TimeSeriesConsumer timeSeriesConsumer7 = timeSeriesCollector1.makeSeries("", "");
        org.junit.Assert.assertNotNull(timeSeriesConsumer4);
        org.junit.Assert.assertNotNull(timeSeriesConsumer7);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        net.engio.pips.data.IDataProcessor iDataProcessor0 = net.engio.pips.data.IDataProcessor.Void;
        org.junit.Assert.assertNotNull(iDataProcessor0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList2 = benchmark1.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter3 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter4 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter5 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray6 = new net.engio.pips.reports.IReporter[] { cSVFileExporter3, cSVFileExporter4, cSVFileExporter5 };
        benchmark1.generateReports(iReporterArray6);
        net.engio.pips.lab.ExecutionContext executionContext8 = new net.engio.pips.lab.ExecutionContext(benchmark1);
        boolean boolean10 = benchmark1.isDefined("Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        long long5 = workload4.getStarted();
        net.engio.pips.lab.workload.StartCondition startCondition6 = workload4.getStartCondition();
        net.engio.pips.lab.workload.StartCondition startCondition7 = new net.engio.pips.lab.workload.StartCondition(workload4);
        net.engio.pips.lab.workload.Workload.DurationSpecification durationSpecification8 = workload4.duration();
        net.engio.pips.lab.workload.ExecutionEvent executionEvent9 = null;
        net.engio.pips.lab.workload.ExecutionHandler executionHandler10 = workload4.getHandler(executionEvent9);
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(startCondition6);
        org.junit.Assert.assertNotNull(durationSpecification8);
        org.junit.Assert.assertNotNull(executionHandler10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        net.engio.pips.lab.common.ValueGenerator<net.engio.pips.lab.Benchmark> benchmarkValueGenerator0 = null;
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange2 = new net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark>(benchmarkValueGenerator0, (int) (short) 0);
        net.engio.pips.lab.Benchmark benchmark4 = benchmarkRange2.getElement(100);
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange5 = benchmarkRange2.shuffle();
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange6 = benchmarkRange5.clone();
        // The following exception was thrown during execution in test generation
        try {
            net.engio.pips.lab.Benchmark benchmark7 = benchmarkRange6.getRandomElement();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(benchmark4);
        org.junit.Assert.assertNotNull(benchmarkRange5);
        org.junit.Assert.assertNotNull(benchmarkRange6);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList2 = benchmark1.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter3 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter4 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter5 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray6 = new net.engio.pips.reports.IReporter[] { cSVFileExporter3, cSVFileExporter4, cSVFileExporter5 };
        benchmark1.generateReports(iReporterArray6);
        net.engio.pips.lab.ExecutionContext executionContext8 = new net.engio.pips.lab.ExecutionContext(benchmark1);
        net.engio.pips.lab.Laboratory laboratory10 = executionContext8.get((java.lang.Object) 'a');
        net.engio.pips.lab.Benchmark benchmark13 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList14 = benchmark13.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter15 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter16 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter17 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray18 = new net.engio.pips.reports.IReporter[] { cSVFileExporter15, cSVFileExporter16, cSVFileExporter17 };
        benchmark13.generateReports(iReporterArray18);
        net.engio.pips.lab.ExecutionContext executionContext20 = new net.engio.pips.lab.ExecutionContext(benchmark13);
        net.engio.pips.lab.LabException.ErrorCode errorCode22 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 10, errorCode22, 1.0f, '4' };
        net.engio.pips.lab.ExecutionContext executionContext26 = executionContext20.bindAll(objArray25);
        net.engio.pips.lab.ExecutionContext executionContext27 = executionContext26.getChild();
        executionContext26.finished();
        net.engio.pips.reports.SeriesGroup seriesGroup30 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation31 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup32 = seriesGroup30.setYAxisOrientation(orientation31);
        net.engio.pips.reports.SeriesGroup.Orientation orientation33 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup34 = seriesGroup30.setYAxisOrientation(orientation33);
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList35 = executionContext26.get((java.lang.Object) seriesGroup34);
        net.engio.pips.reports.SeriesGroup seriesGroup37 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation38 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup39 = seriesGroup37.setYAxisOrientation(orientation38);
        net.engio.pips.reports.SeriesGroup seriesGroup40 = seriesGroup34.setYAxisOrientation(orientation38);
        java.lang.String str41 = seriesGroup34.getyAxis();
        net.engio.pips.lab.ExecutionContext executionContext42 = executionContext8.bind("Timeout in seconds", (java.lang.Object) seriesGroup34);
        java.io.Flushable flushable44 = executionContext8.get((java.lang.Object) (short) -1);
        net.engio.pips.lab.workload.Duration duration46 = new net.engio.pips.lab.workload.Duration((int) (byte) 1);
        java.lang.String str47 = duration46.toString();
        java.lang.String str48 = duration46.toString();
        boolean boolean49 = duration46.isRepetitive();
        boolean boolean50 = duration46.isTimeBased();
        net.engio.pips.lab.ExecutionContext executionContext51 = executionContext8.bind((java.lang.Object) duration46);
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertNull(laboratory10);
        org.junit.Assert.assertNotNull(iDataCollectorList14);
        org.junit.Assert.assertNotNull(iReporterArray18);
        org.junit.Assert.assertTrue("'" + errorCode22 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode22.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext26);
        org.junit.Assert.assertNotNull(executionContext27);
        org.junit.Assert.assertTrue("'" + orientation31 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation31.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup32);
        org.junit.Assert.assertTrue("'" + orientation33 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation33.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup34);
        org.junit.Assert.assertNull(iDataCollectorList35);
        org.junit.Assert.assertTrue("'" + orientation38 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation38.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup39);
        org.junit.Assert.assertNotNull(seriesGroup40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(executionContext42);
        org.junit.Assert.assertNull(flushable44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "run 1 times" + "'", str47, "run 1 times");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "run 1 times" + "'", str48, "run 1 times");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(executionContext51);
    }

    @Test
    public void test152() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1700471368212L + "'", long28 == 1700471368212L);
        org.junit.Assert.assertNotNull(executionContext30);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        net.engio.pips.lab.workload.Duration duration1 = new net.engio.pips.lab.workload.Duration((int) (byte) 1);
        net.engio.pips.lab.workload.Workload workload2 = duration1.getDependingOn();
        boolean boolean3 = duration1.isTimeBased();
        org.junit.Assert.assertNull(workload2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
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
        java.util.Collection<org.jfree.data.xy.AbstractIntervalXYDataset> abstractIntervalXYDatasetCollection16 = executionContext14.getMatching("run 1 times");
        net.engio.pips.lab.Laboratory laboratory18 = executionContext14.get((java.lang.Object) 'a');
        executionContext14.started();
        net.engio.pips.lab.Benchmark benchmark22 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList23 = benchmark22.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter24 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter25 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter26 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray27 = new net.engio.pips.reports.IReporter[] { cSVFileExporter24, cSVFileExporter25, cSVFileExporter26 };
        benchmark22.generateReports(iReporterArray27);
        net.engio.pips.lab.ExecutionContext executionContext29 = new net.engio.pips.lab.ExecutionContext(benchmark22);
        net.engio.pips.lab.LabException.ErrorCode errorCode31 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        java.lang.Object[] objArray34 = new java.lang.Object[] { 10, errorCode31, 1.0f, '4' };
        net.engio.pips.lab.ExecutionContext executionContext35 = executionContext29.bindAll(objArray34);
        net.engio.pips.lab.ExecutionContext executionContext36 = executionContext35.getChild();
        executionContext35.finished();
        net.engio.pips.reports.SeriesGroup seriesGroup39 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation40 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup41 = seriesGroup39.setYAxisOrientation(orientation40);
        net.engio.pips.reports.SeriesGroup.Orientation orientation42 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup43 = seriesGroup39.setYAxisOrientation(orientation42);
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList44 = executionContext35.get((java.lang.Object) seriesGroup43);
        net.engio.pips.reports.SeriesGroup seriesGroup46 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation47 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup48 = seriesGroup46.setYAxisOrientation(orientation47);
        net.engio.pips.reports.SeriesGroup seriesGroup49 = seriesGroup43.setYAxisOrientation(orientation47);
        java.lang.String str50 = seriesGroup43.getyAxis();
        net.engio.pips.lab.Benchmark benchmark52 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList53 = benchmark52.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter54 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter55 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter56 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray57 = new net.engio.pips.reports.IReporter[] { cSVFileExporter54, cSVFileExporter55, cSVFileExporter56 };
        benchmark52.generateReports(iReporterArray57);
        net.engio.pips.lab.ExecutionContext executionContext59 = new net.engio.pips.lab.ExecutionContext(benchmark52);
        net.engio.pips.lab.LabException.ErrorCode errorCode61 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        java.lang.Object[] objArray64 = new java.lang.Object[] { 10, errorCode61, 1.0f, '4' };
        net.engio.pips.lab.ExecutionContext executionContext65 = executionContext59.bindAll(objArray64);
        net.engio.pips.lab.ExecutionContext executionContext66 = executionContext65.getChild();
        executionContext65.finished();
        net.engio.pips.reports.SeriesGroup seriesGroup69 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation70 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup71 = seriesGroup69.setYAxisOrientation(orientation70);
        net.engio.pips.reports.SeriesGroup.Orientation orientation72 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup73 = seriesGroup69.setYAxisOrientation(orientation72);
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList74 = executionContext65.get((java.lang.Object) seriesGroup73);
        net.engio.pips.reports.SeriesGroup seriesGroup76 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation77 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup78 = seriesGroup76.setYAxisOrientation(orientation77);
        net.engio.pips.reports.SeriesGroup seriesGroup79 = seriesGroup73.setYAxisOrientation(orientation77);
        net.engio.pips.reports.SeriesGroup seriesGroup80 = seriesGroup43.setYAxisOrientation(orientation77);
        net.engio.pips.lab.ExecutionContext executionContext81 = executionContext14.bind("hi!", (java.lang.Object) orientation77);
        executionContext81.started();
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(abstractIntervalXYDatasetCollection16);
        org.junit.Assert.assertNull(laboratory18);
        org.junit.Assert.assertNotNull(iDataCollectorList23);
        org.junit.Assert.assertNotNull(iReporterArray27);
        org.junit.Assert.assertTrue("'" + errorCode31 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode31.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext35);
        org.junit.Assert.assertNotNull(executionContext36);
        org.junit.Assert.assertTrue("'" + orientation40 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation40.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup41);
        org.junit.Assert.assertTrue("'" + orientation42 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation42.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup43);
        org.junit.Assert.assertNull(iDataCollectorList44);
        org.junit.Assert.assertTrue("'" + orientation47 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation47.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup48);
        org.junit.Assert.assertNotNull(seriesGroup49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(iDataCollectorList53);
        org.junit.Assert.assertNotNull(iReporterArray57);
        org.junit.Assert.assertTrue("'" + errorCode61 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode61.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext65);
        org.junit.Assert.assertNotNull(executionContext66);
        org.junit.Assert.assertTrue("'" + orientation70 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation70.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup71);
        org.junit.Assert.assertTrue("'" + orientation72 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation72.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup73);
        org.junit.Assert.assertNull(iDataCollectorList74);
        org.junit.Assert.assertTrue("'" + orientation77 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation77.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup78);
        org.junit.Assert.assertNotNull(seriesGroup79);
        org.junit.Assert.assertNotNull(seriesGroup80);
        org.junit.Assert.assertNotNull(executionContext81);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        java.lang.String str2 = seriesGroup1.getLabel();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Timeout in seconds" + "'", str2, "Timeout in seconds");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        net.engio.pips.lab.common.ValueGenerator<net.engio.pips.lab.Benchmark> benchmarkValueGenerator0 = null;
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange2 = new net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark>(benchmarkValueGenerator0, (int) (short) 0);
        net.engio.pips.lab.Benchmark benchmark4 = benchmarkRange2.getElement(100);
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange5 = benchmarkRange2.shuffle();
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange6 = benchmarkRange5.clone();
        net.engio.pips.lab.Benchmark benchmark8 = benchmarkRange6.getElement(0);
        boolean boolean9 = benchmarkRange6.hasNext();
        org.junit.Assert.assertNull(benchmark4);
        org.junit.Assert.assertNotNull(benchmarkRange5);
        org.junit.Assert.assertNotNull(benchmarkRange6);
        org.junit.Assert.assertNull(benchmark8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("run 1 times");
        java.lang.String str2 = benchmark1.getReportBaseDir();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        long long5 = workload4.getStarted();
        net.engio.pips.lab.workload.StartCondition startCondition6 = new net.engio.pips.lab.workload.StartCondition(workload4);
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList2 = benchmark1.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter3 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter4 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter5 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray6 = new net.engio.pips.reports.IReporter[] { cSVFileExporter3, cSVFileExporter4, cSVFileExporter5 };
        benchmark1.generateReports(iReporterArray6);
        net.engio.pips.lab.ExecutionContext executionContext8 = new net.engio.pips.lab.ExecutionContext(benchmark1);
        net.engio.pips.lab.Benchmark benchmark11 = new net.engio.pips.lab.Benchmark("hi!");
        net.engio.pips.data.DataCollectorManager dataCollectorManager12 = benchmark11.getCollectorManager();
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList14 = benchmark11.getCollectors("hi!");
        net.engio.pips.lab.Benchmark benchmark15 = benchmark1.setProperty("", (java.lang.Object) benchmark11);
        java.io.OutputStream outputStream16 = benchmark15.getLogStream();
        net.engio.pips.lab.Benchmark benchmark18 = benchmark15.setBasePath("Unknown startcondition");
        net.engio.pips.lab.workload.Workload workload20 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition21 = new net.engio.pips.lab.workload.StartCondition(workload20);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory22 = null;
        net.engio.pips.lab.workload.Workload workload23 = workload20.setITaskFactory(iTaskFactory22);
        net.engio.pips.lab.workload.StartCondition startCondition24 = workload23.getStartCondition();
        net.engio.pips.lab.workload.Duration duration25 = workload23.getDuration();
        boolean boolean26 = workload23.isFinished();
        net.engio.pips.lab.workload.Workload[] workloadArray27 = new net.engio.pips.lab.workload.Workload[] { workload23 };
        net.engio.pips.lab.Benchmark benchmark28 = benchmark18.addWorkload(workloadArray27);
        java.io.OutputStream outputStream29 = benchmark28.getLogStream();
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertNotNull(dataCollectorManager12);
        org.junit.Assert.assertNotNull(iDataCollectorList14);
        org.junit.Assert.assertNotNull(benchmark15);
        org.junit.Assert.assertNotNull(outputStream16);
        org.junit.Assert.assertNotNull(benchmark18);
        org.junit.Assert.assertNotNull(workload23);
        org.junit.Assert.assertNull(startCondition24);
        org.junit.Assert.assertNull(duration25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(workloadArray27);
        org.junit.Assert.assertNotNull(benchmark28);
        org.junit.Assert.assertNotNull(outputStream29);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        net.engio.pips.lab.workload.Workload workload6 = workload4.setDelay(10L);
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertNotNull(workload6);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        net.engio.pips.lab.ExecutionContext executionContext2 = benchmark1.getClobalContext();
        net.engio.pips.lab.ExecutionContext executionContext3 = new net.engio.pips.lab.ExecutionContext(benchmark1);
        java.lang.String str4 = benchmark1.getTitle();
        org.junit.Assert.assertNotNull(executionContext2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str2 = benchmark1.getReportBaseDir();
        java.lang.String str3 = benchmark1.toString();
        net.engio.pips.lab.Benchmark benchmark5 = benchmark1.setSampleInterval((int) (byte) 10);
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList7 = benchmark1.getCollectors("Unknown startcondition");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str3, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(benchmark5);
        org.junit.Assert.assertNotNull(iDataCollectorList7);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        net.engio.pips.lab.workload.Duration duration1 = new net.engio.pips.lab.workload.Duration((int) (short) 100);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        net.engio.pips.lab.workload.ExecutionHandler executionHandler0 = null;
        net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper executionHandlerWrapper1 = new net.engio.pips.lab.workload.Workload.ExecutionHandlerWrapper(executionHandler0);
        net.engio.pips.lab.Benchmark benchmark3 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList4 = benchmark3.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter5 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter6 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter7 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray8 = new net.engio.pips.reports.IReporter[] { cSVFileExporter5, cSVFileExporter6, cSVFileExporter7 };
        benchmark3.generateReports(iReporterArray8);
        net.engio.pips.lab.ExecutionContext executionContext10 = new net.engio.pips.lab.ExecutionContext(benchmark3);
        net.engio.pips.lab.LabException.ErrorCode errorCode12 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        java.lang.Object[] objArray15 = new java.lang.Object[] { 10, errorCode12, 1.0f, '4' };
        net.engio.pips.lab.ExecutionContext executionContext16 = executionContext10.bindAll(objArray15);
        java.util.Collection<org.jfree.data.xy.AbstractIntervalXYDataset> abstractIntervalXYDatasetCollection18 = executionContext16.getMatching("run 1 times");
        net.engio.pips.lab.Laboratory laboratory20 = executionContext16.get((java.lang.Object) 'a');
        executionContext16.started();
        java.util.Collection<org.jfree.data.xy.XYDomainInfo> xYDomainInfoCollection23 = executionContext16.getMatching("");
        executionHandlerWrapper1.handle(executionContext16);
        org.junit.Assert.assertNotNull(iDataCollectorList4);
        org.junit.Assert.assertNotNull(iReporterArray8);
        org.junit.Assert.assertTrue("'" + errorCode12 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode12.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext16);
        org.junit.Assert.assertNotNull(abstractIntervalXYDatasetCollection18);
        org.junit.Assert.assertNull(laboratory20);
        org.junit.Assert.assertNotNull(xYDomainInfoCollection23);
    }

    @Test
    public void test165() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1700471368650L + "'", long13 == 1700471368650L);
        org.junit.Assert.assertNotNull(flushableCollection14);
        org.junit.Assert.assertNotNull(executionsCollection16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(workload21);
        org.junit.Assert.assertNotNull(charSequenceCollection22);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition((int) (byte) 10, timeUnit1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        net.engio.pips.lab.workload.Duration duration1 = new net.engio.pips.lab.workload.Duration((int) (byte) 1);
        net.engio.pips.lab.workload.Workload workload2 = duration1.getDependingOn();
        java.lang.String str3 = duration1.toString();
        org.junit.Assert.assertNull(workload2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "run 1 times" + "'", str3, "run 1 times");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        long long5 = workload4.getStarted();
        net.engio.pips.lab.workload.StartCondition startCondition6 = workload4.getStartCondition();
        net.engio.pips.lab.workload.Workload.StartSpecification startSpecification7 = workload4.starts();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        net.engio.pips.lab.workload.Workload workload10 = startSpecification7.after((int) (short) -1, timeUnit9);
        long long11 = workload10.getStarted();
        long long12 = workload10.getDelay();
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(startCondition6);
        org.junit.Assert.assertNotNull(startSpecification7);
        org.junit.Assert.assertNotNull(workload10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        net.engio.pips.lab.workload.Duration duration1 = new net.engio.pips.lab.workload.Duration((int) (byte) 1);
        java.lang.String str2 = duration1.toString();
        boolean boolean3 = duration1.isTimeBased();
        net.engio.pips.lab.workload.Workload workload4 = duration1.getDependingOn();
        java.lang.String str5 = duration1.toString();
        boolean boolean6 = duration1.isDependent();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "run 1 times" + "'", str2, "run 1 times");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(workload4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "run 1 times" + "'", str5, "run 1 times");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation2 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup3 = seriesGroup1.setYAxisOrientation(orientation2);
        net.engio.pips.lab.Benchmark benchmark5 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str6 = benchmark5.getReportBaseDir();
        java.lang.String str7 = benchmark5.toString();
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection8 = seriesGroup1.createDataSet(benchmark5);
        net.engio.pips.lab.ExecutionContext executionContext9 = new net.engio.pips.lab.ExecutionContext(benchmark5);
        net.engio.pips.lab.Executions executions10 = benchmark5.getExecutions();
        org.junit.Assert.assertTrue("'" + orientation2 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation2.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str7, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(timeSeriesCollection8);
        org.junit.Assert.assertNull(executions10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        net.engio.pips.lab.workload.Duration duration1 = new net.engio.pips.lab.workload.Duration((int) (byte) 1);
        java.lang.String str2 = duration1.toString();
        java.lang.String str3 = duration1.toString();
        boolean boolean4 = duration1.isRepetitive();
        int int5 = duration1.getRepetitions();
        boolean boolean6 = duration1.isDependent();
        boolean boolean7 = duration1.isTimeBased();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "run 1 times" + "'", str2, "run 1 times");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "run 1 times" + "'", str3, "run 1 times");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        net.engio.pips.lab.common.ValueGenerator<net.engio.pips.lab.Benchmark> benchmarkValueGenerator0 = null;
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange2 = new net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark>(benchmarkValueGenerator0, (int) (short) 0);
        net.engio.pips.lab.Benchmark benchmark4 = benchmarkRange2.getElement(100);
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange5 = benchmarkRange2.shuffle();
        net.engio.pips.lab.Benchmark benchmark7 = benchmarkRange5.getElement((int) (short) 100);
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange8 = benchmarkRange5.clone();
        // The following exception was thrown during execution in test generation
        try {
            net.engio.pips.lab.Benchmark benchmark9 = benchmarkRange5.getRandomElement();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(benchmark4);
        org.junit.Assert.assertNotNull(benchmarkRange5);
        org.junit.Assert.assertNull(benchmark7);
        org.junit.Assert.assertNotNull(benchmarkRange8);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        long long5 = workload4.getDelay();
        boolean boolean6 = workload4.hasDelay();
        java.lang.String str7 = workload4.toString();
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(0ms)->Parallel tasks:1,null,null\n" + "'", str7, "(0ms)->Parallel tasks:1,null,null\n");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        net.engio.pips.lab.workload.Duration duration1 = new net.engio.pips.lab.workload.Duration((int) (byte) 10);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
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
        long long18 = executionContext17.getExecutionTime();
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(executionContext15);
        org.junit.Assert.assertNotNull(executionContext17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        net.engio.pips.lab.common.ValueGenerator<net.engio.pips.lab.Benchmark> benchmarkValueGenerator0 = null;
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange2 = new net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark>(benchmarkValueGenerator0, (int) (short) 0);
        net.engio.pips.lab.Benchmark benchmark4 = benchmarkRange2.getElement(100);
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange5 = benchmarkRange2.shuffle();
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange6 = benchmarkRange2.shuffle();
        net.engio.pips.lab.Benchmark benchmark8 = benchmarkRange6.getElement((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            net.engio.pips.lab.Benchmark benchmark9 = benchmarkRange6.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(benchmark4);
        org.junit.Assert.assertNotNull(benchmarkRange5);
        org.junit.Assert.assertNotNull(benchmarkRange6);
        org.junit.Assert.assertNull(benchmark8);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList2 = benchmark1.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter3 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter4 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter5 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray6 = new net.engio.pips.reports.IReporter[] { cSVFileExporter3, cSVFileExporter4, cSVFileExporter5 };
        benchmark1.generateReports(iReporterArray6);
        net.engio.pips.lab.ExecutionContext executionContext8 = new net.engio.pips.lab.ExecutionContext(benchmark1);
        net.engio.pips.lab.Benchmark benchmark11 = new net.engio.pips.lab.Benchmark("hi!");
        net.engio.pips.data.DataCollectorManager dataCollectorManager12 = benchmark11.getCollectorManager();
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList14 = benchmark11.getCollectors("hi!");
        net.engio.pips.lab.Benchmark benchmark15 = benchmark1.setProperty("", (java.lang.Object) benchmark11);
        net.engio.pips.lab.Benchmark benchmark17 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList18 = benchmark17.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter19 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter20 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter21 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray22 = new net.engio.pips.reports.IReporter[] { cSVFileExporter19, cSVFileExporter20, cSVFileExporter21 };
        benchmark17.generateReports(iReporterArray22);
        benchmark1.generateReports(iReporterArray22);
        java.io.OutputStream outputStream25 = benchmark1.getLogStream();
        net.engio.pips.lab.ExecutionContext executionContext26 = new net.engio.pips.lab.ExecutionContext(benchmark1);
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertNotNull(dataCollectorManager12);
        org.junit.Assert.assertNotNull(iDataCollectorList14);
        org.junit.Assert.assertNotNull(benchmark15);
        org.junit.Assert.assertNotNull(iDataCollectorList18);
        org.junit.Assert.assertNotNull(iReporterArray22);
        org.junit.Assert.assertNotNull(outputStream25);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        net.engio.pips.reports.ChartGenerator chartGenerator0 = new net.engio.pips.reports.ChartGenerator();
        net.engio.pips.reports.ChartGenerator chartGenerator2 = chartGenerator0.setPixelPerDatapoint((int) (byte) 10);
        net.engio.pips.reports.SeriesGroup seriesGroup4 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.data.IDataCollector iDataCollector5 = null;
        net.engio.pips.reports.SeriesGroup seriesGroup6 = seriesGroup4.addCollector(iDataCollector5);
        net.engio.pips.reports.ChartGenerator chartGenerator7 = chartGenerator0.draw(seriesGroup4);
        net.engio.pips.reports.ChartGenerator chartGenerator9 = chartGenerator7.setXAxisLabel("hi!");
        org.junit.Assert.assertNotNull(chartGenerator2);
        org.junit.Assert.assertNotNull(seriesGroup6);
        org.junit.Assert.assertNotNull(chartGenerator7);
        org.junit.Assert.assertNotNull(chartGenerator9);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        net.engio.pips.lab.Laboratory laboratory0 = new net.engio.pips.lab.Laboratory();
        net.engio.pips.lab.Benchmark benchmark2 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str3 = benchmark2.getReportBaseDir();
        java.lang.String str4 = benchmark2.toString();
        net.engio.pips.lab.Benchmark benchmark6 = benchmark2.setBasePath("hi!");
        net.engio.pips.reports.SeriesGroup seriesGroup8 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation9 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup10 = seriesGroup8.setYAxisOrientation(orientation9);
        net.engio.pips.lab.Benchmark benchmark12 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str13 = benchmark12.getReportBaseDir();
        java.lang.String str14 = benchmark12.toString();
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection15 = seriesGroup8.createDataSet(benchmark12);
        net.engio.pips.lab.Benchmark benchmark17 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList18 = benchmark17.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter19 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter20 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter21 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray22 = new net.engio.pips.reports.IReporter[] { cSVFileExporter19, cSVFileExporter20, cSVFileExporter21 };
        benchmark17.generateReports(iReporterArray22);
        net.engio.pips.lab.ExecutionContext executionContext24 = new net.engio.pips.lab.ExecutionContext(benchmark17);
        net.engio.pips.lab.Benchmark benchmark27 = new net.engio.pips.lab.Benchmark("hi!");
        net.engio.pips.data.DataCollectorManager dataCollectorManager28 = benchmark27.getCollectorManager();
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList30 = benchmark27.getCollectors("hi!");
        net.engio.pips.lab.Benchmark benchmark31 = benchmark17.setProperty("", (java.lang.Object) benchmark27);
        java.io.OutputStream outputStream32 = benchmark31.getLogStream();
        net.engio.pips.lab.Benchmark benchmark34 = benchmark31.setBasePath("Unknown startcondition");
        net.engio.pips.lab.Benchmark benchmark36 = new net.engio.pips.lab.Benchmark("run 1 times");
        java.lang.String str37 = benchmark36.getReportBaseDir();
        net.engio.pips.lab.Benchmark benchmark39 = new net.engio.pips.lab.Benchmark("run 1 times");
        net.engio.pips.lab.Executions executions40 = benchmark39.getExecutions();
        net.engio.pips.lab.Benchmark benchmark42 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str43 = benchmark42.getReportBaseDir();
        java.lang.String str44 = benchmark42.toString();
        net.engio.pips.lab.Benchmark benchmark46 = benchmark42.setBasePath("hi!");
        net.engio.pips.data.DataCollectorManager dataCollectorManager47 = benchmark42.getCollectorManager();
        boolean boolean49 = benchmark42.isDefined("hi!");
        net.engio.pips.lab.Benchmark[] benchmarkArray50 = new net.engio.pips.lab.Benchmark[] { benchmark6, benchmark12, benchmark34, benchmark36, benchmark39, benchmark42 };
        // The following exception was thrown during execution in test generation
        try {
            laboratory0.run(benchmarkArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str4, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(benchmark6);
        org.junit.Assert.assertTrue("'" + orientation9 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation9.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str14, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(timeSeriesCollection15);
        org.junit.Assert.assertNotNull(iDataCollectorList18);
        org.junit.Assert.assertNotNull(iReporterArray22);
        org.junit.Assert.assertNotNull(dataCollectorManager28);
        org.junit.Assert.assertNotNull(iDataCollectorList30);
        org.junit.Assert.assertNotNull(benchmark31);
        org.junit.Assert.assertNotNull(outputStream32);
        org.junit.Assert.assertNotNull(benchmark34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(executions40);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str44, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(benchmark46);
        org.junit.Assert.assertNotNull(dataCollectorManager47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(benchmarkArray50);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
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
        net.engio.pips.lab.Benchmark benchmark16 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList17 = benchmark16.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter18 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter19 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter20 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray21 = new net.engio.pips.reports.IReporter[] { cSVFileExporter18, cSVFileExporter19, cSVFileExporter20 };
        benchmark16.generateReports(iReporterArray21);
        java.util.Collection<java.lang.Cloneable> cloneableCollection23 = executionContext8.getAll((java.lang.Object) iReporterArray21);
        net.engio.pips.lab.LabException.ErrorCode errorCode26 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration;
        net.engio.pips.lab.LabException labException27 = new net.engio.pips.lab.LabException("Base path", errorCode26);
        net.engio.pips.lab.LabException.ErrorCode errorCode28 = net.engio.pips.lab.LabException.ErrorCode.WLWithoutFactory;
        net.engio.pips.lab.LabException labException29 = new net.engio.pips.lab.LabException("Experiment hi! with 0 workloads\n\nand additional parameters:\n", (java.lang.Throwable) labException27, errorCode28);
        java.lang.Throwable[] throwableArray30 = labException29.getSuppressed();
        net.engio.pips.lab.ExecutionContext executionContext31 = executionContext8.bindAll((java.lang.Object[]) throwableArray30);
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(iDataCollectorList17);
        org.junit.Assert.assertNotNull(iReporterArray21);
        org.junit.Assert.assertNotNull(cloneableCollection23);
        org.junit.Assert.assertTrue("'" + errorCode26 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration + "'", errorCode26.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration));
        org.junit.Assert.assertTrue("'" + errorCode28 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithoutFactory + "'", errorCode28.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithoutFactory));
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(executionContext31);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation2 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup3 = seriesGroup1.setYAxisOrientation(orientation2);
        java.lang.String str4 = seriesGroup3.getLabel();
        net.engio.pips.reports.SeriesGroup seriesGroup6 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation7 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup8 = seriesGroup6.setYAxisOrientation(orientation7);
        net.engio.pips.lab.Benchmark benchmark10 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str11 = benchmark10.getReportBaseDir();
        java.lang.String str12 = benchmark10.toString();
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection13 = seriesGroup6.createDataSet(benchmark10);
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList15 = benchmark10.getCollectors("run 1 times");
        net.engio.pips.lab.Benchmark benchmark17 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str18 = benchmark17.getReportBaseDir();
        java.lang.String str19 = benchmark17.toString();
        net.engio.pips.lab.Benchmark benchmark21 = benchmark17.setBasePath("hi!");
        java.io.OutputStream outputStream22 = benchmark17.getLogStream();
        net.engio.pips.lab.Benchmark benchmark23 = benchmark10.setLogStream(outputStream22);
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection24 = seriesGroup3.createDataSet(benchmark23);
        org.junit.Assert.assertTrue("'" + orientation2 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation2.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Timeout in seconds" + "'", str4, "Timeout in seconds");
        org.junit.Assert.assertTrue("'" + orientation7 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation7.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str12, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(timeSeriesCollection13);
        org.junit.Assert.assertNotNull(iDataCollectorList15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str19, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(benchmark21);
        org.junit.Assert.assertNotNull(outputStream22);
        org.junit.Assert.assertNotNull(benchmark23);
        org.junit.Assert.assertNotNull(timeSeriesCollection24);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
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
        java.util.concurrent.TimeUnit timeUnit15 = null;
        net.engio.pips.lab.workload.Workload workload16 = startSpecification7.after((int) '#', timeUnit15);
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(startCondition6);
        org.junit.Assert.assertNotNull(startSpecification7);
        org.junit.Assert.assertNotNull(workload10);
        org.junit.Assert.assertNotNull(workload13);
        org.junit.Assert.assertNotNull(workload16);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        net.engio.pips.lab.workload.StartCondition startCondition5 = workload4.getStartCondition();
        net.engio.pips.lab.workload.Duration duration6 = workload4.getDuration();
        boolean boolean7 = workload4.isFinished();
        boolean boolean8 = workload4.hasDelay();
        net.engio.pips.lab.workload.StartCondition startCondition9 = new net.engio.pips.lab.workload.StartCondition(workload4);
        net.engio.pips.lab.workload.Duration duration10 = workload4.getDuration();
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertNull(startCondition5);
        org.junit.Assert.assertNull(duration6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(duration10);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
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
        net.engio.pips.lab.Benchmark benchmark16 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList17 = benchmark16.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter18 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter19 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter20 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray21 = new net.engio.pips.reports.IReporter[] { cSVFileExporter18, cSVFileExporter19, cSVFileExporter20 };
        benchmark16.generateReports(iReporterArray21);
        java.util.Collection<java.lang.Cloneable> cloneableCollection23 = executionContext8.getAll((java.lang.Object) iReporterArray21);
        net.engio.pips.data.DataCollector<net.engio.pips.data.DataCollectorManager> dataCollectorManagerDataCollector25 = executionContext8.createLocalCollector("Sample interval");
        net.engio.pips.lab.Benchmark benchmark27 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str28 = benchmark27.getReportBaseDir();
        java.lang.String str29 = benchmark27.toString();
        net.engio.pips.lab.Benchmark benchmark31 = benchmark27.setBasePath("hi!");
        java.io.OutputStream outputStream32 = benchmark27.getLogStream();
        net.engio.pips.data.DataCollectorManager dataCollectorManager33 = benchmark27.getCollectorManager();
        dataCollectorManagerDataCollector25.receive(dataCollectorManager33);
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(iDataCollectorList17);
        org.junit.Assert.assertNotNull(iReporterArray21);
        org.junit.Assert.assertNotNull(cloneableCollection23);
        org.junit.Assert.assertNotNull(dataCollectorManagerDataCollector25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str29, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(benchmark31);
        org.junit.Assert.assertNotNull(outputStream32);
        org.junit.Assert.assertNotNull(dataCollectorManager33);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        net.engio.pips.lab.common.ValueGenerator<net.engio.pips.lab.Benchmark> benchmarkValueGenerator0 = null;
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange2 = new net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark>(benchmarkValueGenerator0, (int) (short) 0);
        net.engio.pips.lab.Benchmark benchmark4 = benchmarkRange2.getElement(100);
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange5 = benchmarkRange2.shuffle();
        net.engio.pips.lab.Benchmark benchmark7 = benchmarkRange5.getElement((int) (short) 100);
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange8 = benchmarkRange5.clone();
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange9 = benchmarkRange5.shuffle();
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange10 = benchmarkRange5.shuffle();
        org.junit.Assert.assertNull(benchmark4);
        org.junit.Assert.assertNotNull(benchmarkRange5);
        org.junit.Assert.assertNull(benchmark7);
        org.junit.Assert.assertNotNull(benchmarkRange8);
        org.junit.Assert.assertNotNull(benchmarkRange9);
        org.junit.Assert.assertNotNull(benchmarkRange10);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        long long5 = workload4.getStarted();
        net.engio.pips.lab.workload.StartCondition startCondition6 = workload4.getStartCondition();
        net.engio.pips.lab.workload.Workload.StartSpecification startSpecification7 = workload4.starts();
        net.engio.pips.lab.workload.Workload workload9 = workload4.setDelay(0L);
        boolean boolean10 = workload9.hasDelay();
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(startCondition6);
        org.junit.Assert.assertNotNull(startSpecification7);
        org.junit.Assert.assertNotNull(workload9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        net.engio.pips.reports.ChartGenerator chartGenerator0 = new net.engio.pips.reports.ChartGenerator();
        net.engio.pips.reports.ChartGenerator chartGenerator2 = chartGenerator0.setPixelPerDatapoint((int) (byte) 10);
        net.engio.pips.reports.SeriesGroup seriesGroup4 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.data.IDataCollector iDataCollector5 = null;
        net.engio.pips.reports.SeriesGroup seriesGroup6 = seriesGroup4.addCollector(iDataCollector5);
        net.engio.pips.reports.ChartGenerator chartGenerator7 = chartGenerator0.draw(seriesGroup4);
        net.engio.pips.lab.Benchmark benchmark9 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList10 = benchmark9.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter11 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter12 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter13 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray14 = new net.engio.pips.reports.IReporter[] { cSVFileExporter11, cSVFileExporter12, cSVFileExporter13 };
        benchmark9.generateReports(iReporterArray14);
        net.engio.pips.lab.ExecutionContext executionContext16 = new net.engio.pips.lab.ExecutionContext(benchmark9);
        net.engio.pips.lab.Benchmark benchmark19 = new net.engio.pips.lab.Benchmark("hi!");
        net.engio.pips.data.DataCollectorManager dataCollectorManager20 = benchmark19.getCollectorManager();
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList22 = benchmark19.getCollectors("hi!");
        net.engio.pips.lab.Benchmark benchmark23 = benchmark9.setProperty("", (java.lang.Object) benchmark19);
        net.engio.pips.lab.Benchmark benchmark25 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList26 = benchmark25.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter27 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter28 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter29 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray30 = new net.engio.pips.reports.IReporter[] { cSVFileExporter27, cSVFileExporter28, cSVFileExporter29 };
        benchmark25.generateReports(iReporterArray30);
        benchmark9.generateReports(iReporterArray30);
        java.io.OutputStream outputStream33 = benchmark9.getLogStream();
        chartGenerator0.generate(benchmark9);
        org.junit.Assert.assertNotNull(chartGenerator2);
        org.junit.Assert.assertNotNull(seriesGroup6);
        org.junit.Assert.assertNotNull(chartGenerator7);
        org.junit.Assert.assertNotNull(iDataCollectorList10);
        org.junit.Assert.assertNotNull(iReporterArray14);
        org.junit.Assert.assertNotNull(dataCollectorManager20);
        org.junit.Assert.assertNotNull(iDataCollectorList22);
        org.junit.Assert.assertNotNull(benchmark23);
        org.junit.Assert.assertNotNull(iDataCollectorList26);
        org.junit.Assert.assertNotNull(iReporterArray30);
        org.junit.Assert.assertNotNull(outputStream33);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        net.engio.pips.lab.workload.Duration duration1 = new net.engio.pips.lab.workload.Duration((int) (byte) 1);
        java.lang.String str2 = duration1.toString();
        boolean boolean3 = duration1.isTimeBased();
        net.engio.pips.lab.workload.Workload workload4 = duration1.getDependingOn();
        boolean boolean5 = duration1.isRepetitive();
        java.lang.String str6 = duration1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "run 1 times" + "'", str2, "run 1 times");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(workload4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "run 1 times" + "'", str6, "run 1 times");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation2 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup3 = seriesGroup1.setYAxisOrientation(orientation2);
        net.engio.pips.reports.SeriesGroup.Orientation orientation4 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup5 = seriesGroup1.setYAxisOrientation(orientation4);
        net.engio.pips.lab.Benchmark benchmark7 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList8 = benchmark7.getCollectors();
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList10 = benchmark7.getCollectors("");
        net.engio.pips.reports.SeriesGroup seriesGroup11 = seriesGroup5.addCollectors(iDataCollectorList10);
        net.engio.pips.lab.Benchmark benchmark13 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList14 = benchmark13.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter15 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter16 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter17 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray18 = new net.engio.pips.reports.IReporter[] { cSVFileExporter15, cSVFileExporter16, cSVFileExporter17 };
        benchmark13.generateReports(iReporterArray18);
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection20 = seriesGroup11.createDataSet(benchmark13);
        org.junit.Assert.assertTrue("'" + orientation2 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation2.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup3);
        org.junit.Assert.assertTrue("'" + orientation4 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation4.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup5);
        org.junit.Assert.assertNotNull(iDataCollectorList8);
        org.junit.Assert.assertNotNull(iDataCollectorList10);
        org.junit.Assert.assertNotNull(seriesGroup11);
        org.junit.Assert.assertNotNull(iDataCollectorList14);
        org.junit.Assert.assertNotNull(iReporterArray18);
        org.junit.Assert.assertNotNull(timeSeriesCollection20);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str2 = benchmark1.getReportBaseDir();
        java.lang.String str3 = benchmark1.toString();
        net.engio.pips.lab.Benchmark benchmark5 = benchmark1.setBasePath("hi!");
        net.engio.pips.lab.Executions executions6 = null;
        benchmark1.setExecutions(executions6);
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList9 = benchmark1.getCollectors("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str3, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(benchmark5);
        org.junit.Assert.assertNotNull(iDataCollectorList9);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        long long5 = workload4.getStarted();
        net.engio.pips.lab.workload.StartCondition startCondition6 = workload4.getStartCondition();
        net.engio.pips.lab.workload.Workload.StartSpecification startSpecification7 = workload4.starts();
        net.engio.pips.lab.workload.Workload workload8 = startSpecification7.immediately();
        net.engio.pips.lab.workload.Workload workload10 = workload8.setParallelTasks((int) 'a');
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(startCondition6);
        org.junit.Assert.assertNotNull(startSpecification7);
        org.junit.Assert.assertNotNull(workload8);
        org.junit.Assert.assertNotNull(workload10);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
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
        workload13.finished();
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(startCondition6);
        org.junit.Assert.assertNotNull(startSpecification7);
        org.junit.Assert.assertNotNull(workload10);
        org.junit.Assert.assertNotNull(workload13);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList2 = benchmark1.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter3 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter4 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter5 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray6 = new net.engio.pips.reports.IReporter[] { cSVFileExporter3, cSVFileExporter4, cSVFileExporter5 };
        benchmark1.generateReports(iReporterArray6);
        net.engio.pips.lab.ExecutionContext executionContext8 = new net.engio.pips.lab.ExecutionContext(benchmark1);
        net.engio.pips.lab.Laboratory laboratory10 = executionContext8.get((java.lang.Object) 'a');
        net.engio.pips.lab.Benchmark benchmark13 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList14 = benchmark13.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter15 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter16 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter17 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray18 = new net.engio.pips.reports.IReporter[] { cSVFileExporter15, cSVFileExporter16, cSVFileExporter17 };
        benchmark13.generateReports(iReporterArray18);
        net.engio.pips.lab.ExecutionContext executionContext20 = new net.engio.pips.lab.ExecutionContext(benchmark13);
        net.engio.pips.lab.LabException.ErrorCode errorCode22 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 10, errorCode22, 1.0f, '4' };
        net.engio.pips.lab.ExecutionContext executionContext26 = executionContext20.bindAll(objArray25);
        net.engio.pips.lab.ExecutionContext executionContext27 = executionContext26.getChild();
        executionContext26.finished();
        net.engio.pips.reports.SeriesGroup seriesGroup30 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation31 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup32 = seriesGroup30.setYAxisOrientation(orientation31);
        net.engio.pips.reports.SeriesGroup.Orientation orientation33 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup34 = seriesGroup30.setYAxisOrientation(orientation33);
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList35 = executionContext26.get((java.lang.Object) seriesGroup34);
        net.engio.pips.reports.SeriesGroup seriesGroup37 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation38 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup39 = seriesGroup37.setYAxisOrientation(orientation38);
        net.engio.pips.reports.SeriesGroup seriesGroup40 = seriesGroup34.setYAxisOrientation(orientation38);
        java.lang.String str41 = seriesGroup34.getyAxis();
        net.engio.pips.lab.ExecutionContext executionContext42 = executionContext8.bind("Timeout in seconds", (java.lang.Object) seriesGroup34);
        executionContext8.started();
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertNull(laboratory10);
        org.junit.Assert.assertNotNull(iDataCollectorList14);
        org.junit.Assert.assertNotNull(iReporterArray18);
        org.junit.Assert.assertTrue("'" + errorCode22 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode22.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext26);
        org.junit.Assert.assertNotNull(executionContext27);
        org.junit.Assert.assertTrue("'" + orientation31 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation31.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup32);
        org.junit.Assert.assertTrue("'" + orientation33 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation33.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup34);
        org.junit.Assert.assertNull(iDataCollectorList35);
        org.junit.Assert.assertTrue("'" + orientation38 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation38.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup39);
        org.junit.Assert.assertNotNull(seriesGroup40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(executionContext42);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        net.engio.pips.lab.workload.ExecutionEvent executionEvent3 = benchmark1.getProperty("Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        java.lang.String str4 = benchmark1.toString();
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList5 = benchmark1.getCollectors();
        net.engio.pips.reports.ChartGenerator chartGenerator6 = new net.engio.pips.reports.ChartGenerator();
        net.engio.pips.reports.ChartGenerator chartGenerator8 = chartGenerator6.setXAxisLabel("Sample interval");
        net.engio.pips.reports.ChartGenerator chartGenerator10 = chartGenerator8.setTitle("Report base dir");
        net.engio.pips.reports.SeriesGroup seriesGroup12 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.data.IDataCollector iDataCollector13 = null;
        net.engio.pips.reports.SeriesGroup seriesGroup14 = seriesGroup12.addCollector(iDataCollector13);
        net.engio.pips.reports.SeriesGroup seriesGroup16 = seriesGroup14.setyAxis("Base path");
        net.engio.pips.data.IDataCollector iDataCollector17 = null;
        net.engio.pips.reports.SeriesGroup seriesGroup18 = seriesGroup16.addCollector(iDataCollector17);
        net.engio.pips.reports.ChartGenerator chartGenerator19 = chartGenerator10.draw(seriesGroup18);
        net.engio.pips.reports.SeriesGroup seriesGroup21 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.data.IDataCollector iDataCollector22 = null;
        net.engio.pips.reports.SeriesGroup seriesGroup23 = seriesGroup21.addCollector(iDataCollector22);
        net.engio.pips.reports.SeriesGroup seriesGroup25 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation26 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup27 = seriesGroup25.setYAxisOrientation(orientation26);
        net.engio.pips.reports.SeriesGroup seriesGroup28 = seriesGroup23.setYAxisOrientation(orientation26);
        net.engio.pips.reports.ChartGenerator chartGenerator29 = chartGenerator19.draw(seriesGroup23);
        net.engio.pips.lab.Benchmark benchmark30 = benchmark1.addReporter((net.engio.pips.reports.IReporter) chartGenerator19);
        org.junit.Assert.assertNull(executionEvent3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str4, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(iDataCollectorList5);
        org.junit.Assert.assertNotNull(chartGenerator8);
        org.junit.Assert.assertNotNull(chartGenerator10);
        org.junit.Assert.assertNotNull(seriesGroup14);
        org.junit.Assert.assertNotNull(seriesGroup16);
        org.junit.Assert.assertNotNull(seriesGroup18);
        org.junit.Assert.assertNotNull(chartGenerator19);
        org.junit.Assert.assertNotNull(seriesGroup23);
        org.junit.Assert.assertTrue("'" + orientation26 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation26.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup27);
        org.junit.Assert.assertNotNull(seriesGroup28);
        org.junit.Assert.assertNotNull(chartGenerator29);
        org.junit.Assert.assertNotNull(benchmark30);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        net.engio.pips.lab.Benchmark benchmark0 = null;
        net.engio.pips.lab.ExecutionContext executionContext1 = new net.engio.pips.lab.ExecutionContext(benchmark0);
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = executionContext1.getProperties();
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
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
        net.engio.pips.lab.Benchmark benchmark16 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str17 = benchmark16.getReportBaseDir();
        java.lang.String str18 = benchmark16.toString();
        net.engio.pips.lab.Benchmark benchmark20 = benchmark16.setBasePath("hi!");
        java.util.List<net.engio.pips.lab.workload.Workload> workloadList21 = benchmark16.getWorkloads();
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList22 = benchmark16.getCollectors();
        net.engio.pips.lab.ExecutionContext executionContext23 = executionContext8.bind((java.lang.Object) iDataCollectorList22);
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = executionContext8.getProperties();
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str18, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(benchmark20);
        org.junit.Assert.assertNotNull(workloadList21);
        org.junit.Assert.assertNotNull(iDataCollectorList22);
        org.junit.Assert.assertNotNull(executionContext23);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        net.engio.pips.lab.workload.Duration duration1 = new net.engio.pips.lab.workload.Duration((int) (short) 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation2 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup3 = seriesGroup1.setYAxisOrientation(orientation2);
        net.engio.pips.lab.Benchmark benchmark5 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str6 = benchmark5.getReportBaseDir();
        java.lang.String str7 = benchmark5.toString();
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection8 = seriesGroup1.createDataSet(benchmark5);
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList10 = benchmark5.getCollectors("run 1 times");
        net.engio.pips.lab.Benchmark benchmark12 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str13 = benchmark12.getReportBaseDir();
        java.lang.String str14 = benchmark12.toString();
        net.engio.pips.lab.Benchmark benchmark16 = benchmark12.setBasePath("hi!");
        java.io.OutputStream outputStream17 = benchmark12.getLogStream();
        net.engio.pips.lab.Benchmark benchmark18 = benchmark5.setLogStream(outputStream17);
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList20 = benchmark5.getCollectors("");
        org.junit.Assert.assertTrue("'" + orientation2 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation2.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str7, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(timeSeriesCollection8);
        org.junit.Assert.assertNotNull(iDataCollectorList10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str14, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(benchmark16);
        org.junit.Assert.assertNotNull(outputStream17);
        org.junit.Assert.assertNotNull(benchmark18);
        org.junit.Assert.assertNotNull(iDataCollectorList20);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup seriesGroup3 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation4 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup5 = seriesGroup3.setYAxisOrientation(orientation4);
        net.engio.pips.reports.SeriesGroup seriesGroup6 = seriesGroup1.setYAxisOrientation(orientation4);
        java.lang.String str7 = seriesGroup6.getyAxis();
        net.engio.pips.reports.SeriesGroup.Orientation orientation8 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup9 = seriesGroup6.setYAxisOrientation(orientation8);
        net.engio.pips.reports.SeriesGroup.Orientation orientation10 = seriesGroup9.getOrientation();
        org.junit.Assert.assertTrue("'" + orientation4 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation4.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup5);
        org.junit.Assert.assertNotNull(seriesGroup6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + orientation8 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation8.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup9);
        org.junit.Assert.assertTrue("'" + orientation10 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation10.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        long long5 = workload4.getStarted();
        net.engio.pips.lab.workload.StartCondition startCondition6 = workload4.getStartCondition();
        net.engio.pips.lab.workload.StartCondition startCondition7 = new net.engio.pips.lab.workload.StartCondition(workload4);
        net.engio.pips.lab.workload.Workload.DurationSpecification durationSpecification8 = workload4.duration();
        net.engio.pips.lab.workload.Workload workload10 = durationSpecification8.repetitions(100);
        workload10.finished();
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(startCondition6);
        org.junit.Assert.assertNotNull(durationSpecification8);
        org.junit.Assert.assertNotNull(workload10);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        net.engio.pips.lab.workload.StartCondition startCondition0 = new net.engio.pips.lab.workload.StartCondition();
        net.engio.pips.lab.workload.Workload workload1 = startCondition0.getPreceedingWorkload();
        org.junit.Assert.assertNull(workload1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
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
        java.util.Collection<org.jfree.data.xy.AbstractIntervalXYDataset> abstractIntervalXYDatasetCollection16 = executionContext14.getMatching("run 1 times");
        executionContext14.started();
        net.engio.pips.lab.ExecutionContext executionContext18 = executionContext14.getChild();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = executionContext18.getProperties();
        net.engio.pips.lab.Benchmark benchmark21 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList22 = benchmark21.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter23 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter24 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter25 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray26 = new net.engio.pips.reports.IReporter[] { cSVFileExporter23, cSVFileExporter24, cSVFileExporter25 };
        benchmark21.generateReports(iReporterArray26);
        net.engio.pips.lab.ExecutionContext executionContext28 = new net.engio.pips.lab.ExecutionContext(benchmark21);
        net.engio.pips.lab.LabException.ErrorCode errorCode30 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        java.lang.Object[] objArray33 = new java.lang.Object[] { 10, errorCode30, 1.0f, '4' };
        net.engio.pips.lab.ExecutionContext executionContext34 = executionContext28.bindAll(objArray33);
        net.engio.pips.lab.ExecutionContext executionContext35 = executionContext34.getChild();
        org.jfree.data.xy.AbstractIntervalXYDataset abstractIntervalXYDataset37 = executionContext35.get((java.lang.Object) (short) 0);
        net.engio.pips.reports.SeriesGroup.Orientation orientation39 = executionContext35.get("Timeout in seconds");
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = executionContext35.getProperties();
        net.engio.pips.lab.ExecutionContext executionContext41 = executionContext18.bindAll(strMap40);
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(abstractIntervalXYDatasetCollection16);
        org.junit.Assert.assertNotNull(executionContext18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(iDataCollectorList22);
        org.junit.Assert.assertNotNull(iReporterArray26);
        org.junit.Assert.assertTrue("'" + errorCode30 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode30.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext34);
        org.junit.Assert.assertNotNull(executionContext35);
        org.junit.Assert.assertNull(abstractIntervalXYDataset37);
        org.junit.Assert.assertNull(orientation39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(executionContext41);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.Workload workload4 = workload1.setParallelTasks((int) (byte) -1);
        workload4.finished();
        org.junit.Assert.assertNotNull(workload4);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        net.engio.pips.lab.common.ValueGenerator<net.engio.pips.lab.Benchmark> benchmarkValueGenerator0 = null;
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange2 = new net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark>(benchmarkValueGenerator0, (int) (short) 0);
        net.engio.pips.lab.Benchmark benchmark4 = benchmarkRange2.getElement(100);
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange5 = benchmarkRange2.shuffle();
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange6 = benchmarkRange5.clone();
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange7 = benchmarkRange6.shuffle();
        org.junit.Assert.assertNull(benchmark4);
        org.junit.Assert.assertNotNull(benchmarkRange5);
        org.junit.Assert.assertNotNull(benchmarkRange6);
        org.junit.Assert.assertNotNull(benchmarkRange7);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
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
        net.engio.pips.lab.Benchmark benchmark16 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList17 = benchmark16.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter18 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter19 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter20 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray21 = new net.engio.pips.reports.IReporter[] { cSVFileExporter18, cSVFileExporter19, cSVFileExporter20 };
        benchmark16.generateReports(iReporterArray21);
        java.util.Collection<java.lang.Cloneable> cloneableCollection23 = executionContext8.getAll((java.lang.Object) iReporterArray21);
        net.engio.pips.data.DataCollector<net.engio.pips.data.DataCollectorManager> dataCollectorManagerDataCollector25 = executionContext8.createLocalCollector("Sample interval");
        net.engio.pips.lab.Benchmark benchmark27 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList28 = benchmark27.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter29 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter30 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter31 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray32 = new net.engio.pips.reports.IReporter[] { cSVFileExporter29, cSVFileExporter30, cSVFileExporter31 };
        benchmark27.generateReports(iReporterArray32);
        net.engio.pips.lab.ExecutionContext executionContext34 = new net.engio.pips.lab.ExecutionContext(benchmark27);
        net.engio.pips.lab.LabException.ErrorCode errorCode36 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        java.lang.Object[] objArray39 = new java.lang.Object[] { 10, errorCode36, 1.0f, '4' };
        net.engio.pips.lab.ExecutionContext executionContext40 = executionContext34.bindAll(objArray39);
        net.engio.pips.lab.Benchmark benchmark42 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList43 = benchmark42.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter44 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter45 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter46 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray47 = new net.engio.pips.reports.IReporter[] { cSVFileExporter44, cSVFileExporter45, cSVFileExporter46 };
        benchmark42.generateReports(iReporterArray47);
        java.util.Collection<java.lang.Cloneable> cloneableCollection49 = executionContext34.getAll((java.lang.Object) iReporterArray47);
        net.engio.pips.data.DataCollector<net.engio.pips.data.DataCollectorManager> dataCollectorManagerDataCollector51 = executionContext34.createLocalCollector("Sample interval");
        net.engio.pips.data.DataProcessor<net.engio.pips.data.DataCollectorManager, net.engio.pips.data.DataCollectorManager> dataCollectorManagerDataProcessor52 = dataCollectorManagerDataCollector25.add((net.engio.pips.data.IDataProcessor<net.engio.pips.data.DataCollectorManager, net.engio.pips.data.DataCollectorManager>) dataCollectorManagerDataCollector51);
        net.engio.pips.data.IDataProcessor<net.engio.pips.data.DataCollectorManager, ?> dataCollectorManagerIDataProcessor53 = null;
        net.engio.pips.data.IDataProcessor[] iDataProcessorArray55 = new net.engio.pips.data.IDataProcessor[1];
        @SuppressWarnings("unchecked")
        net.engio.pips.data.IDataProcessor<net.engio.pips.data.DataCollectorManager, ?>[] dataCollectorManagerIDataProcessorArray56 = (net.engio.pips.data.IDataProcessor<net.engio.pips.data.DataCollectorManager, ?>[]) iDataProcessorArray55;
        dataCollectorManagerIDataProcessorArray56[0] = dataCollectorManagerIDataProcessor53;
        net.engio.pips.data.IDataProcessor<net.engio.pips.data.DataCollectorManager, net.engio.pips.data.DataCollectorManager> dataCollectorManagerIDataProcessor59 = dataCollectorManagerDataCollector25.connectTo(dataCollectorManagerIDataProcessorArray56);
        net.engio.pips.lab.Benchmark benchmark61 = new net.engio.pips.lab.Benchmark("hi!");
        net.engio.pips.data.DataCollectorManager dataCollectorManager62 = benchmark61.getCollectorManager();
        dataCollectorManagerDataCollector25.receive(dataCollectorManager62);
        net.engio.pips.data.IDataProcessor iDataProcessor64 = net.engio.pips.data.IDataProcessor.Void;
        net.engio.pips.data.IDataProcessor[] iDataProcessorArray66 = new net.engio.pips.data.IDataProcessor[1];
        @SuppressWarnings("unchecked")
        net.engio.pips.data.IDataProcessor<net.engio.pips.data.DataCollectorManager, ?>[] dataCollectorManagerIDataProcessorArray67 = (net.engio.pips.data.IDataProcessor<net.engio.pips.data.DataCollectorManager, ?>[]) iDataProcessorArray66;
        dataCollectorManagerIDataProcessorArray67[0] = iDataProcessor64;
        net.engio.pips.data.IDataProcessor<net.engio.pips.data.DataCollectorManager, net.engio.pips.data.DataCollectorManager> dataCollectorManagerIDataProcessor70 = dataCollectorManagerDataCollector25.connectTo(dataCollectorManagerIDataProcessorArray67);
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(iDataCollectorList17);
        org.junit.Assert.assertNotNull(iReporterArray21);
        org.junit.Assert.assertNotNull(cloneableCollection23);
        org.junit.Assert.assertNotNull(dataCollectorManagerDataCollector25);
        org.junit.Assert.assertNotNull(iDataCollectorList28);
        org.junit.Assert.assertNotNull(iReporterArray32);
        org.junit.Assert.assertTrue("'" + errorCode36 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode36.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext40);
        org.junit.Assert.assertNotNull(iDataCollectorList43);
        org.junit.Assert.assertNotNull(iReporterArray47);
        org.junit.Assert.assertNotNull(cloneableCollection49);
        org.junit.Assert.assertNotNull(dataCollectorManagerDataCollector51);
        org.junit.Assert.assertNotNull(dataCollectorManagerDataProcessor52);
        org.junit.Assert.assertNotNull(iDataProcessorArray55);
        org.junit.Assert.assertNotNull(dataCollectorManagerIDataProcessorArray56);
        org.junit.Assert.assertNotNull(dataCollectorManagerIDataProcessor59);
        org.junit.Assert.assertNotNull(dataCollectorManager62);
        org.junit.Assert.assertNotNull(iDataProcessor64);
        org.junit.Assert.assertNotNull(iDataProcessorArray66);
        org.junit.Assert.assertNotNull(dataCollectorManagerIDataProcessorArray67);
        org.junit.Assert.assertNotNull(dataCollectorManagerIDataProcessor70);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        net.engio.pips.lab.workload.ExecutionEvent executionEvent5 = net.engio.pips.lab.workload.ExecutionEvent.WorkloadCompletion;
        net.engio.pips.lab.workload.ExecutionHandler executionHandler6 = workload1.getHandler(executionEvent5);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory7 = workload1.getITaskFactory();
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + executionEvent5 + "' != '" + net.engio.pips.lab.workload.ExecutionEvent.WorkloadCompletion + "'", executionEvent5.equals(net.engio.pips.lab.workload.ExecutionEvent.WorkloadCompletion));
        org.junit.Assert.assertNotNull(executionHandler6);
        org.junit.Assert.assertNull(iTaskFactory7);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
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
        org.jfree.data.xy.AbstractIntervalXYDataset abstractIntervalXYDataset17 = executionContext15.get((java.lang.Object) (short) 0);
        long long18 = executionContext15.getExecutionTime();
        java.lang.Iterable<net.engio.pips.data.IDataCollector> iDataCollectorIterable20 = executionContext15.get((java.lang.Object) 1700471368155L);
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(executionContext15);
        org.junit.Assert.assertNull(abstractIntervalXYDataset17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(iDataCollectorIterable20);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        workload1.started();
        int int4 = workload1.getParallelUnits();
        java.lang.String str5 = workload1.getName();
        net.engio.pips.lab.workload.Workload.StartSpecification startSpecification6 = workload1.new StartSpecification();
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory7 = workload1.getITaskFactory();
        net.engio.pips.lab.workload.StartCondition startCondition8 = workload1.getStartCondition();
        net.engio.pips.lab.workload.Workload.StartSpecification startSpecification9 = workload1.new StartSpecification();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(iTaskFactory7);
        org.junit.Assert.assertNull(startCondition8);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Log stream");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
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
        java.util.Collection<org.jfree.data.xy.AbstractIntervalXYDataset> abstractIntervalXYDatasetCollection16 = executionContext14.getMatching("run 1 times");
        executionContext14.started();
        net.engio.pips.lab.ExecutionContext executionContext18 = executionContext14.getChild();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = executionContext18.getProperties();
        boolean boolean21 = executionContext18.containsKey("Base path");
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(abstractIntervalXYDatasetCollection16);
        org.junit.Assert.assertNotNull(executionContext18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.Workload workload4 = workload1.setParallelTasks((int) (byte) -1);
        net.engio.pips.lab.workload.Workload.DurationSpecification durationSpecification5 = workload4.new DurationSpecification();
        net.engio.pips.lab.workload.Workload workload7 = durationSpecification5.repetitions((int) 'a');
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertNotNull(workload7);
    }

    @Test
    public void test212() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700471371341L + "'", long3 == 1700471371341L);
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
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
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
        net.engio.pips.lab.ExecutionContext executionContext16 = executionContext14.getChild();
        net.engio.pips.lab.Benchmark benchmark18 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList19 = benchmark18.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter20 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter21 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter22 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray23 = new net.engio.pips.reports.IReporter[] { cSVFileExporter20, cSVFileExporter21, cSVFileExporter22 };
        benchmark18.generateReports(iReporterArray23);
        net.engio.pips.lab.ExecutionContext executionContext25 = new net.engio.pips.lab.ExecutionContext(benchmark18);
        net.engio.pips.lab.LabException.ErrorCode errorCode27 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        java.lang.Object[] objArray30 = new java.lang.Object[] { 10, errorCode27, 1.0f, '4' };
        net.engio.pips.lab.ExecutionContext executionContext31 = executionContext25.bindAll(objArray30);
        net.engio.pips.lab.Benchmark benchmark33 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList34 = benchmark33.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter35 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter36 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter37 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray38 = new net.engio.pips.reports.IReporter[] { cSVFileExporter35, cSVFileExporter36, cSVFileExporter37 };
        benchmark33.generateReports(iReporterArray38);
        java.util.Collection<java.lang.Cloneable> cloneableCollection40 = executionContext25.getAll((java.lang.Object) iReporterArray38);
        net.engio.pips.data.DataCollector<net.engio.pips.data.DataCollectorManager> dataCollectorManagerDataCollector42 = executionContext25.createLocalCollector("Sample interval");
        net.engio.pips.lab.Benchmark benchmark44 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList45 = benchmark44.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter46 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter47 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter48 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray49 = new net.engio.pips.reports.IReporter[] { cSVFileExporter46, cSVFileExporter47, cSVFileExporter48 };
        benchmark44.generateReports(iReporterArray49);
        net.engio.pips.lab.ExecutionContext executionContext51 = new net.engio.pips.lab.ExecutionContext(benchmark44);
        net.engio.pips.lab.LabException.ErrorCode errorCode53 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        java.lang.Object[] objArray56 = new java.lang.Object[] { 10, errorCode53, 1.0f, '4' };
        net.engio.pips.lab.ExecutionContext executionContext57 = executionContext51.bindAll(objArray56);
        net.engio.pips.lab.Benchmark benchmark59 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList60 = benchmark59.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter61 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter62 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter63 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray64 = new net.engio.pips.reports.IReporter[] { cSVFileExporter61, cSVFileExporter62, cSVFileExporter63 };
        benchmark59.generateReports(iReporterArray64);
        java.util.Collection<java.lang.Cloneable> cloneableCollection66 = executionContext51.getAll((java.lang.Object) iReporterArray64);
        net.engio.pips.data.DataCollector<net.engio.pips.data.DataCollectorManager> dataCollectorManagerDataCollector68 = executionContext51.createLocalCollector("Sample interval");
        net.engio.pips.data.DataProcessor<net.engio.pips.data.DataCollectorManager, net.engio.pips.data.DataCollectorManager> dataCollectorManagerDataProcessor69 = dataCollectorManagerDataCollector42.add((net.engio.pips.data.IDataProcessor<net.engio.pips.data.DataCollectorManager, net.engio.pips.data.DataCollectorManager>) dataCollectorManagerDataCollector68);
        net.engio.pips.data.IDataProcessor<net.engio.pips.data.DataCollectorManager, ?> dataCollectorManagerIDataProcessor70 = null;
        net.engio.pips.data.IDataProcessor[] iDataProcessorArray72 = new net.engio.pips.data.IDataProcessor[1];
        @SuppressWarnings("unchecked")
        net.engio.pips.data.IDataProcessor<net.engio.pips.data.DataCollectorManager, ?>[] dataCollectorManagerIDataProcessorArray73 = (net.engio.pips.data.IDataProcessor<net.engio.pips.data.DataCollectorManager, ?>[]) iDataProcessorArray72;
        dataCollectorManagerIDataProcessorArray73[0] = dataCollectorManagerIDataProcessor70;
        net.engio.pips.data.IDataProcessor<net.engio.pips.data.DataCollectorManager, net.engio.pips.data.DataCollectorManager> dataCollectorManagerIDataProcessor76 = dataCollectorManagerDataCollector42.connectTo(dataCollectorManagerIDataProcessorArray73);
        // The following exception was thrown during execution in test generation
        try {
            net.engio.pips.lab.ExecutionContext executionContext77 = executionContext16.bindAll((java.lang.Object[]) dataCollectorManagerIDataProcessorArray73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(executionContext15);
        org.junit.Assert.assertNotNull(executionContext16);
        org.junit.Assert.assertNotNull(iDataCollectorList19);
        org.junit.Assert.assertNotNull(iReporterArray23);
        org.junit.Assert.assertTrue("'" + errorCode27 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode27.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext31);
        org.junit.Assert.assertNotNull(iDataCollectorList34);
        org.junit.Assert.assertNotNull(iReporterArray38);
        org.junit.Assert.assertNotNull(cloneableCollection40);
        org.junit.Assert.assertNotNull(dataCollectorManagerDataCollector42);
        org.junit.Assert.assertNotNull(iDataCollectorList45);
        org.junit.Assert.assertNotNull(iReporterArray49);
        org.junit.Assert.assertTrue("'" + errorCode53 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode53.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext57);
        org.junit.Assert.assertNotNull(iDataCollectorList60);
        org.junit.Assert.assertNotNull(iReporterArray64);
        org.junit.Assert.assertNotNull(cloneableCollection66);
        org.junit.Assert.assertNotNull(dataCollectorManagerDataCollector68);
        org.junit.Assert.assertNotNull(dataCollectorManagerDataProcessor69);
        org.junit.Assert.assertNotNull(iDataProcessorArray72);
        org.junit.Assert.assertNotNull(dataCollectorManagerIDataProcessorArray73);
        org.junit.Assert.assertNotNull(dataCollectorManagerIDataProcessor76);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str2 = benchmark1.getReportBaseDir();
        java.lang.String str3 = benchmark1.toString();
        net.engio.pips.reports.ChartGenerator chartGenerator4 = new net.engio.pips.reports.ChartGenerator();
        net.engio.pips.reports.ChartGenerator chartGenerator6 = chartGenerator4.setPixelPerDatapoint((int) (byte) 10);
        net.engio.pips.reports.ChartGenerator chartGenerator8 = chartGenerator6.setFileName("Log stream");
        net.engio.pips.lab.Benchmark benchmark9 = benchmark1.addReporter((net.engio.pips.reports.IReporter) chartGenerator8);
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList11 = benchmark1.getCollectors("Title");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str3, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(chartGenerator6);
        org.junit.Assert.assertNotNull(chartGenerator8);
        org.junit.Assert.assertNotNull(benchmark9);
        org.junit.Assert.assertNotNull(iDataCollectorList11);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        net.engio.pips.reports.CSVFileExporter cSVFileExporter0 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.lab.Benchmark benchmark2 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str3 = benchmark2.getReportBaseDir();
        java.lang.String str4 = benchmark2.toString();
        cSVFileExporter0.generate(benchmark2);
        net.engio.pips.lab.ExecutionContext executionContext6 = new net.engio.pips.lab.ExecutionContext(benchmark2);
        net.engio.pips.lab.workload.Workload workload8 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition9 = new net.engio.pips.lab.workload.StartCondition(workload8);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory10 = null;
        net.engio.pips.lab.workload.Workload workload11 = workload8.setITaskFactory(iTaskFactory10);
        long long12 = workload11.getStarted();
        net.engio.pips.lab.workload.StartCondition startCondition13 = workload11.getStartCondition();
        net.engio.pips.lab.workload.StartCondition startCondition14 = new net.engio.pips.lab.workload.StartCondition(workload11);
        net.engio.pips.lab.workload.Workload.DurationSpecification durationSpecification15 = workload11.duration();
        net.engio.pips.lab.workload.Workload workload17 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition18 = new net.engio.pips.lab.workload.StartCondition(workload17);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory19 = null;
        net.engio.pips.lab.workload.Workload workload20 = workload17.setITaskFactory(iTaskFactory19);
        net.engio.pips.lab.workload.StartCondition startCondition21 = workload20.getStartCondition();
        net.engio.pips.lab.workload.Duration duration22 = workload20.getDuration();
        boolean boolean23 = workload20.isFinished();
        boolean boolean24 = workload20.hasDelay();
        net.engio.pips.lab.workload.StartCondition startCondition25 = new net.engio.pips.lab.workload.StartCondition(workload20);
        net.engio.pips.lab.workload.Workload[] workloadArray26 = new net.engio.pips.lab.workload.Workload[] { workload11, workload20 };
        net.engio.pips.lab.Benchmark benchmark27 = benchmark2.addWorkload(workloadArray26);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str4, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(workload11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(startCondition13);
        org.junit.Assert.assertNotNull(durationSpecification15);
        org.junit.Assert.assertNotNull(workload20);
        org.junit.Assert.assertNull(startCondition21);
        org.junit.Assert.assertNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(workloadArray26);
        org.junit.Assert.assertNotNull(benchmark27);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        net.engio.pips.reports.CSVFileExporter cSVFileExporter0 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.lab.Benchmark benchmark2 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str3 = benchmark2.getReportBaseDir();
        java.lang.String str4 = benchmark2.toString();
        net.engio.pips.lab.Benchmark benchmark6 = benchmark2.setBasePath("hi!");
        java.util.List<net.engio.pips.lab.workload.Workload> workloadList7 = benchmark2.getWorkloads();
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList8 = benchmark2.getCollectors();
        cSVFileExporter0.generate(benchmark2);
        net.engio.pips.reports.ChartGenerator chartGenerator10 = new net.engio.pips.reports.ChartGenerator();
        net.engio.pips.reports.ChartGenerator chartGenerator12 = chartGenerator10.setPixelPerDatapoint((int) (byte) 10);
        net.engio.pips.reports.ChartGenerator chartGenerator14 = chartGenerator10.setFileName("Sample interval");
        net.engio.pips.lab.Benchmark benchmark15 = benchmark2.addReporter((net.engio.pips.reports.IReporter) chartGenerator10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str4, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(benchmark6);
        org.junit.Assert.assertNotNull(workloadList7);
        org.junit.Assert.assertNotNull(iDataCollectorList8);
        org.junit.Assert.assertNotNull(chartGenerator12);
        org.junit.Assert.assertNotNull(chartGenerator14);
        org.junit.Assert.assertNotNull(benchmark15);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        long long5 = workload4.getStarted();
        net.engio.pips.lab.workload.StartCondition startCondition6 = workload4.getStartCondition();
        net.engio.pips.lab.workload.StartCondition startCondition7 = new net.engio.pips.lab.workload.StartCondition(workload4);
        net.engio.pips.lab.workload.Workload workload8 = startCondition7.getPreceedingWorkload();
        net.engio.pips.lab.workload.Workload.StartSpecification startSpecification9 = workload8.new StartSpecification();
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(startCondition6);
        org.junit.Assert.assertNotNull(workload8);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("Sample interval");
        java.lang.Throwable throwable3 = benchmark1.getProperty("Sample interval");
        org.junit.Assert.assertNull(throwable3);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        long long5 = workload4.getStarted();
        net.engio.pips.lab.workload.StartCondition startCondition6 = workload4.getStartCondition();
        net.engio.pips.lab.workload.Workload.StartSpecification startSpecification7 = workload4.starts();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        net.engio.pips.lab.workload.Workload workload10 = startSpecification7.after((int) '#', timeUnit9);
        boolean boolean11 = workload10.hasDelay();
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(startCondition6);
        org.junit.Assert.assertNotNull(startSpecification7);
        org.junit.Assert.assertNotNull(workload10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        net.engio.pips.lab.Executions executions0 = new net.engio.pips.lab.Executions();
        java.util.Collection<java.util.List<net.engio.pips.data.IDataCollector>> iDataCollectorListCollection2 = executions0.getAll("Log stream");
        java.util.Collection<net.engio.pips.lab.workload.Workload[]> workloadArrayCollection4 = executions0.getMatching("Report base dir");
        org.junit.Assert.assertNotNull(iDataCollectorListCollection2);
        org.junit.Assert.assertNotNull(workloadArrayCollection4);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        long long5 = workload4.getStarted();
        net.engio.pips.lab.workload.StartCondition startCondition6 = workload4.getStartCondition();
        net.engio.pips.lab.workload.Workload.StartSpecification startSpecification7 = workload4.starts();
        net.engio.pips.lab.workload.Workload workload9 = workload4.setDelay(0L);
        net.engio.pips.lab.workload.StartCondition startCondition10 = new net.engio.pips.lab.workload.StartCondition(workload9);
        boolean boolean11 = startCondition10.isTimebased();
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(startCondition6);
        org.junit.Assert.assertNotNull(startSpecification7);
        org.junit.Assert.assertNotNull(workload9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        net.engio.pips.lab.common.ValueGenerator<net.engio.pips.lab.Benchmark> benchmarkValueGenerator0 = null;
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange2 = new net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark>(benchmarkValueGenerator0, (int) (short) 0);
        net.engio.pips.lab.Benchmark benchmark4 = benchmarkRange2.getElement(100);
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange5 = benchmarkRange2.shuffle();
        boolean boolean6 = benchmarkRange2.hasNext();
        org.junit.Assert.assertNull(benchmark4);
        org.junit.Assert.assertNotNull(benchmarkRange5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        long long5 = workload4.getStarted();
        net.engio.pips.lab.workload.StartCondition startCondition6 = workload4.getStartCondition();
        net.engio.pips.lab.workload.Workload.StartSpecification startSpecification7 = workload4.starts();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        net.engio.pips.lab.workload.Workload workload10 = startSpecification7.after((int) '#', timeUnit9);
        workload10.finished();
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(startCondition6);
        org.junit.Assert.assertNotNull(startSpecification7);
        org.junit.Assert.assertNotNull(workload10);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        workload1.finished();
        net.engio.pips.lab.workload.Workload.StartSpecification startSpecification3 = workload1.starts();
        net.engio.pips.lab.workload.Workload workload4 = startSpecification3.immediately();
        net.engio.pips.lab.workload.Workload.StartSpecification startSpecification5 = workload4.new StartSpecification();
        boolean boolean6 = workload4.hasDelay();
        org.junit.Assert.assertNotNull(startSpecification3);
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation2 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup3 = seriesGroup1.setYAxisOrientation(orientation2);
        net.engio.pips.reports.SeriesGroup.Orientation orientation4 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup5 = seriesGroup1.setYAxisOrientation(orientation4);
        net.engio.pips.reports.SeriesGroup.Orientation orientation6 = seriesGroup5.getOrientation();
        org.junit.Assert.assertTrue("'" + orientation2 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation2.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup3);
        org.junit.Assert.assertTrue("'" + orientation4 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation4.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup5);
        org.junit.Assert.assertTrue("'" + orientation6 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation6.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        boolean boolean3 = workload1.hasDelay();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        boolean boolean2 = workload1.hasTasksToRun();
        net.engio.pips.lab.workload.Workload workload4 = workload1.setDelay((long) '#');
        net.engio.pips.lab.workload.ExecutionEvent executionEvent5 = net.engio.pips.lab.workload.ExecutionEvent.TaskInitialization;
        net.engio.pips.lab.workload.ExecutionHandler executionHandler6 = workload4.getHandler(executionEvent5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + executionEvent5 + "' != '" + net.engio.pips.lab.workload.ExecutionEvent.TaskInitialization + "'", executionEvent5.equals(net.engio.pips.lab.workload.ExecutionEvent.TaskInitialization));
        org.junit.Assert.assertNotNull(executionHandler6);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
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
        net.engio.pips.lab.Benchmark benchmark16 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList17 = benchmark16.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter18 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter19 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter20 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray21 = new net.engio.pips.reports.IReporter[] { cSVFileExporter18, cSVFileExporter19, cSVFileExporter20 };
        benchmark16.generateReports(iReporterArray21);
        java.util.Collection<java.lang.Cloneable> cloneableCollection23 = executionContext8.getAll((java.lang.Object) iReporterArray21);
        java.lang.Class<?> wildcardClass24 = executionContext8.getClass();
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(iDataCollectorList17);
        org.junit.Assert.assertNotNull(iReporterArray21);
        org.junit.Assert.assertNotNull(cloneableCollection23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test229() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1700471371650L + "'", long17 == 1700471371650L);
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
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
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
        net.engio.pips.lab.workload.Workload workload13 = startSpecification7.after(10, timeUnit12);
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(startCondition6);
        org.junit.Assert.assertNotNull(startSpecification7);
        org.junit.Assert.assertNotNull(workload10);
        org.junit.Assert.assertNotNull(workload13);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.data.IDataCollector iDataCollector2 = null;
        net.engio.pips.reports.SeriesGroup seriesGroup3 = seriesGroup1.addCollector(iDataCollector2);
        net.engio.pips.lab.Benchmark benchmark5 = new net.engio.pips.lab.Benchmark("hi!");
        net.engio.pips.data.DataCollectorManager dataCollectorManager6 = benchmark5.getCollectorManager();
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList8 = benchmark5.getCollectors("hi!");
        net.engio.pips.reports.SeriesGroup seriesGroup9 = seriesGroup3.addCollectors(iDataCollectorList8);
        org.junit.Assert.assertNotNull(seriesGroup3);
        org.junit.Assert.assertNotNull(dataCollectorManager6);
        org.junit.Assert.assertNotNull(iDataCollectorList8);
        org.junit.Assert.assertNotNull(seriesGroup9);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        net.engio.pips.lab.LabException.ErrorCode errorCode3 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration;
        net.engio.pips.lab.LabException labException4 = new net.engio.pips.lab.LabException("Base path", errorCode3);
        net.engio.pips.lab.LabException.ErrorCode errorCode5 = net.engio.pips.lab.LabException.ErrorCode.WLWithoutFactory;
        net.engio.pips.lab.LabException labException6 = new net.engio.pips.lab.LabException("Experiment hi! with 0 workloads\n\nand additional parameters:\n", (java.lang.Throwable) labException4, errorCode5);
        net.engio.pips.lab.LabException.ErrorCode errorCode7 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration;
        net.engio.pips.lab.LabException labException8 = new net.engio.pips.lab.LabException("(0ms)->Parallel tasks:1,null,null\n", (java.lang.Throwable) labException4, errorCode7);
        net.engio.pips.lab.LabException.ErrorCode errorCode11 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration;
        net.engio.pips.lab.LabException labException12 = new net.engio.pips.lab.LabException("Base path", errorCode11);
        net.engio.pips.lab.LabException.ErrorCode errorCode13 = net.engio.pips.lab.LabException.ErrorCode.WLWithoutFactory;
        net.engio.pips.lab.LabException labException14 = new net.engio.pips.lab.LabException("Experiment hi! with 0 workloads\n\nand additional parameters:\n", (java.lang.Throwable) labException12, errorCode13);
        java.lang.Throwable[] throwableArray15 = labException14.getSuppressed();
        labException8.addSuppressed((java.lang.Throwable) labException14);
        org.junit.Assert.assertTrue("'" + errorCode3 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration + "'", errorCode3.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration));
        org.junit.Assert.assertTrue("'" + errorCode5 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithoutFactory + "'", errorCode5.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithoutFactory));
        org.junit.Assert.assertTrue("'" + errorCode7 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration + "'", errorCode7.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration));
        org.junit.Assert.assertTrue("'" + errorCode11 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration + "'", errorCode11.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration));
        org.junit.Assert.assertTrue("'" + errorCode13 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithoutFactory + "'", errorCode13.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithoutFactory));
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        net.engio.pips.reports.CSVFileExporter cSVFileExporter0 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.lab.Benchmark benchmark2 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str3 = benchmark2.getReportBaseDir();
        java.lang.String str4 = benchmark2.toString();
        cSVFileExporter0.generate(benchmark2);
        net.engio.pips.lab.ExecutionContext executionContext6 = new net.engio.pips.lab.ExecutionContext(benchmark2);
        net.engio.pips.lab.Benchmark benchmark8 = benchmark2.setSampleInterval((int) (byte) 1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str4, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(benchmark8);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        net.engio.pips.reports.TimeSeriesCollector timeSeriesCollector1 = new net.engio.pips.reports.TimeSeriesCollector("Timeout in seconds");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        net.engio.pips.lab.workload.StartCondition startCondition5 = workload4.getStartCondition();
        net.engio.pips.lab.workload.Duration duration6 = workload4.getDuration();
        workload4.finished();
        boolean boolean8 = workload4.hasDelay();
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertNull(startCondition5);
        org.junit.Assert.assertNull(duration6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test236() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1700471371818L + "'", long28 == 1700471371818L);
        org.junit.Assert.assertNotNull(executionContext30);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        net.engio.pips.lab.LabException.ErrorCode errorCode3 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration;
        net.engio.pips.lab.LabException labException4 = new net.engio.pips.lab.LabException("Base path", errorCode3);
        net.engio.pips.lab.LabException.ErrorCode errorCode5 = net.engio.pips.lab.LabException.ErrorCode.WLWithoutFactory;
        net.engio.pips.lab.LabException labException6 = new net.engio.pips.lab.LabException("Experiment hi! with 0 workloads\n\nand additional parameters:\n", (java.lang.Throwable) labException4, errorCode5);
        net.engio.pips.lab.LabException.ErrorCode errorCode7 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration;
        net.engio.pips.lab.LabException labException8 = new net.engio.pips.lab.LabException("(0ms)->Parallel tasks:1,null,null\n", (java.lang.Throwable) labException4, errorCode7);
        java.lang.String str9 = labException4.toString();
        org.junit.Assert.assertTrue("'" + errorCode3 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration + "'", errorCode3.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration));
        org.junit.Assert.assertTrue("'" + errorCode5 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithoutFactory + "'", errorCode5.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithoutFactory));
        org.junit.Assert.assertTrue("'" + errorCode7 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration + "'", errorCode7.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInDuration));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "net.engio.pips.lab.LabException: Base path" + "'", str9, "net.engio.pips.lab.LabException: Base path");
    }

    @Test
    public void test238() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1700471371874L + "'", long28 == 1700471371874L);
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
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        net.engio.pips.lab.common.ValueGenerator<net.engio.pips.lab.Benchmark> benchmarkValueGenerator0 = null;
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange2 = new net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark>(benchmarkValueGenerator0, (int) (short) 0);
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange3 = benchmarkRange2.clone();
        org.junit.Assert.assertNotNull(benchmarkRange3);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        net.engio.pips.lab.workload.Duration duration1 = new net.engio.pips.lab.workload.Duration((int) (byte) 1);
        java.lang.String str2 = duration1.toString();
        java.lang.String str3 = duration1.toString();
        boolean boolean4 = duration1.isRepetitive();
        boolean boolean5 = duration1.isTimeBased();
        int int6 = duration1.getRepetitions();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "run 1 times" + "'", str2, "run 1 times");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "run 1 times" + "'", str3, "run 1 times");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        net.engio.pips.lab.workload.Duration duration1 = new net.engio.pips.lab.workload.Duration((int) (short) 1);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str2 = benchmark1.getReportBaseDir();
        java.lang.String str3 = benchmark1.toString();
        net.engio.pips.reports.ChartGenerator chartGenerator4 = new net.engio.pips.reports.ChartGenerator();
        net.engio.pips.reports.ChartGenerator chartGenerator6 = chartGenerator4.setPixelPerDatapoint((int) (byte) 10);
        net.engio.pips.reports.ChartGenerator chartGenerator8 = chartGenerator6.setFileName("Log stream");
        net.engio.pips.lab.Benchmark benchmark9 = benchmark1.addReporter((net.engio.pips.reports.IReporter) chartGenerator8);
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList10 = benchmark1.getCollectors();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str3, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(chartGenerator6);
        org.junit.Assert.assertNotNull(chartGenerator8);
        org.junit.Assert.assertNotNull(benchmark9);
        org.junit.Assert.assertNotNull(iDataCollectorList10);
    }

    @Test
    public void test243() throws Throwable {
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
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(-1700471372132ms)->Parallel tasks:1,null,null\n" + "'", str8, "(-1700471372132ms)->Parallel tasks:1,null,null\n");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation2 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup3 = seriesGroup1.setYAxisOrientation(orientation2);
        java.lang.String str4 = seriesGroup3.getLabel();
        java.lang.String str5 = seriesGroup3.getyAxis();
        org.junit.Assert.assertTrue("'" + orientation2 + "' != '" + net.engio.pips.reports.SeriesGroup.Orientation.Right + "'", orientation2.equals(net.engio.pips.reports.SeriesGroup.Orientation.Right));
        org.junit.Assert.assertNotNull(seriesGroup3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Timeout in seconds" + "'", str4, "Timeout in seconds");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.Workload workload4 = workload1.setParallelTasks((int) (byte) -1);
        workload4.started();
        org.junit.Assert.assertNotNull(workload4);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str2 = benchmark1.getReportBaseDir();
        java.lang.String str3 = benchmark1.toString();
        net.engio.pips.lab.Benchmark benchmark5 = benchmark1.setBasePath("hi!");
        net.engio.pips.data.DataCollectorManager dataCollectorManager6 = benchmark1.getCollectorManager();
        net.engio.pips.reports.ChartGenerator chartGenerator7 = new net.engio.pips.reports.ChartGenerator();
        net.engio.pips.reports.ChartGenerator chartGenerator9 = chartGenerator7.setXAxisLabel("Sample interval");
        net.engio.pips.reports.ChartGenerator chartGenerator11 = chartGenerator9.setTitle("Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        net.engio.pips.reports.ChartGenerator chartGenerator13 = chartGenerator9.setTitle("Base path");
        net.engio.pips.lab.Benchmark benchmark14 = benchmark1.addReporter((net.engio.pips.reports.IReporter) chartGenerator13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Experiment hi! with 0 workloads\n\nand additional parameters:\n" + "'", str3, "Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        org.junit.Assert.assertNotNull(benchmark5);
        org.junit.Assert.assertNotNull(dataCollectorManager6);
        org.junit.Assert.assertNotNull(chartGenerator9);
        org.junit.Assert.assertNotNull(chartGenerator11);
        org.junit.Assert.assertNotNull(chartGenerator13);
        org.junit.Assert.assertNotNull(benchmark14);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        workload1.started();
        long long3 = workload1.getStarted();
        boolean boolean4 = workload1.hasDelay();
        net.engio.pips.lab.workload.Duration duration5 = new net.engio.pips.lab.workload.Duration(workload1);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700471372162L + "'", long3 == 1700471372162L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        boolean boolean2 = workload1.isFinished();
        int int3 = workload1.getParallelUnits();
        java.lang.Class<?> wildcardClass4 = workload1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        boolean boolean3 = startCondition2.isTimebased();
        boolean boolean4 = startCondition2.isTimebased();
        boolean boolean5 = startCondition2.isDependent();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        long long5 = workload4.getStarted();
        net.engio.pips.lab.workload.StartCondition startCondition6 = workload4.getStartCondition();
        net.engio.pips.lab.workload.Workload.StartSpecification startSpecification7 = workload4.starts();
        net.engio.pips.lab.workload.Workload workload9 = workload4.setDelay(0L);
        net.engio.pips.lab.workload.StartCondition startCondition10 = new net.engio.pips.lab.workload.StartCondition(workload9);
        boolean boolean11 = workload9.hasDelay();
        net.engio.pips.lab.workload.Duration duration12 = new net.engio.pips.lab.workload.Duration(workload9);
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(startCondition6);
        org.junit.Assert.assertNotNull(startSpecification7);
        org.junit.Assert.assertNotNull(workload9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition((int) (byte) 1, timeUnit1);
        net.engio.pips.lab.workload.Workload workload3 = startCondition2.getPreceedingWorkload();
        org.junit.Assert.assertNull(workload3);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.data.IDataCollector iDataCollector2 = null;
        net.engio.pips.reports.SeriesGroup seriesGroup3 = seriesGroup1.addCollector(iDataCollector2);
        net.engio.pips.reports.SeriesGroup seriesGroup5 = seriesGroup1.setyAxis("Report base dir");
        org.junit.Assert.assertNotNull(seriesGroup3);
        org.junit.Assert.assertNotNull(seriesGroup5);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
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
        java.util.Collection<org.jfree.data.xy.AbstractIntervalXYDataset> abstractIntervalXYDatasetCollection16 = executionContext14.getMatching("run 1 times");
        net.engio.pips.lab.ExecutionContext executionContext17 = executionContext14.getChild();
        net.engio.pips.lab.Benchmark benchmark19 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList20 = benchmark19.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter21 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter22 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter23 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray24 = new net.engio.pips.reports.IReporter[] { cSVFileExporter21, cSVFileExporter22, cSVFileExporter23 };
        benchmark19.generateReports(iReporterArray24);
        net.engio.pips.lab.ExecutionContext executionContext26 = new net.engio.pips.lab.ExecutionContext(benchmark19);
        net.engio.pips.lab.LabException.ErrorCode errorCode28 = net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart;
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10, errorCode28, 1.0f, '4' };
        net.engio.pips.lab.ExecutionContext executionContext32 = executionContext26.bindAll(objArray31);
        net.engio.pips.lab.ExecutionContext executionContext33 = executionContext32.getChild();
        org.jfree.data.xy.AbstractIntervalXYDataset abstractIntervalXYDataset35 = executionContext33.get((java.lang.Object) (short) 0);
        net.engio.pips.reports.SeriesGroup.Orientation orientation37 = executionContext33.get("Timeout in seconds");
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = executionContext33.getProperties();
        net.engio.pips.lab.ExecutionContext executionContext39 = executionContext14.bindAll(strMap38);
        org.junit.Assert.assertNotNull(iDataCollectorList2);
        org.junit.Assert.assertNotNull(iReporterArray6);
        org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode10.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext14);
        org.junit.Assert.assertNotNull(abstractIntervalXYDatasetCollection16);
        org.junit.Assert.assertNotNull(executionContext17);
        org.junit.Assert.assertNotNull(iDataCollectorList20);
        org.junit.Assert.assertNotNull(iReporterArray24);
        org.junit.Assert.assertTrue("'" + errorCode28 + "' != '" + net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart + "'", errorCode28.equals(net.engio.pips.lab.LabException.ErrorCode.WLWithCycleInStart));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10, WLWithCycleInStart, 1.0, 4]");
        org.junit.Assert.assertNotNull(executionContext32);
        org.junit.Assert.assertNotNull(executionContext33);
        org.junit.Assert.assertNull(abstractIntervalXYDataset35);
        org.junit.Assert.assertNull(orientation37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(executionContext39);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition((int) (short) 10, timeUnit1);
        java.lang.String str3 = startCondition2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Unknown startcondition" + "'", str3, "Unknown startcondition");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        net.engio.pips.lab.common.ValueGenerator<net.engio.pips.lab.Benchmark> benchmarkValueGenerator0 = null;
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange2 = new net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark>(benchmarkValueGenerator0, (int) (short) 0);
        net.engio.pips.lab.Benchmark benchmark4 = benchmarkRange2.getElement(100);
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange5 = benchmarkRange2.shuffle();
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange6 = benchmarkRange2.shuffle();
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange7 = benchmarkRange2.clone();
        org.junit.Assert.assertNull(benchmark4);
        org.junit.Assert.assertNotNull(benchmarkRange5);
        org.junit.Assert.assertNotNull(benchmarkRange6);
        org.junit.Assert.assertNotNull(benchmarkRange7);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        net.engio.pips.lab.workload.Workload workload1 = new net.engio.pips.lab.workload.Workload("");
        net.engio.pips.lab.workload.StartCondition startCondition2 = new net.engio.pips.lab.workload.StartCondition(workload1);
        net.engio.pips.lab.workload.ITaskFactory iTaskFactory3 = null;
        net.engio.pips.lab.workload.Workload workload4 = workload1.setITaskFactory(iTaskFactory3);
        long long5 = workload4.getStarted();
        net.engio.pips.lab.workload.StartCondition startCondition6 = workload4.getStartCondition();
        net.engio.pips.lab.workload.StartCondition startCondition7 = new net.engio.pips.lab.workload.StartCondition(workload4);
        net.engio.pips.lab.workload.Workload.DurationSpecification durationSpecification8 = workload4.duration();
        net.engio.pips.lab.workload.StartCondition startCondition9 = new net.engio.pips.lab.workload.StartCondition(workload4);
        org.junit.Assert.assertNotNull(workload4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(startCondition6);
        org.junit.Assert.assertNotNull(durationSpecification8);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        net.engio.pips.lab.common.ValueGenerator<net.engio.pips.lab.Benchmark> benchmarkValueGenerator0 = null;
        net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark> benchmarkRange2 = new net.engio.pips.lab.common.Range<net.engio.pips.lab.Benchmark>(benchmarkValueGenerator0, (int) (short) 0);
        net.engio.pips.lab.Benchmark benchmark4 = benchmarkRange2.getElement(100);
        boolean boolean5 = benchmarkRange2.hasNext();
        org.junit.Assert.assertNull(benchmark4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }
}
