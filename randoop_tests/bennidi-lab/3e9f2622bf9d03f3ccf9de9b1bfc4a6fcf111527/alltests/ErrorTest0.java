import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str2 = benchmark1.getReportBaseDir();
        java.lang.String str3 = benchmark1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = benchmark1.getTimeoutInSeconds();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        net.engio.pips.data.utils.ExecutionTimer executionTimer27 = executionContext14.createExecutionTimer("Timeout in seconds");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        net.engio.pips.lab.workload.Duration duration1 = new net.engio.pips.lab.workload.Duration((int) (byte) 1);
        java.lang.String str2 = duration1.toString();
        boolean boolean3 = duration1.isTimeBased();
        net.engio.pips.lab.workload.Workload workload4 = duration1.getDependingOn();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long5 = duration1.inMillisecs();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        net.engio.pips.lab.workload.ExecutionEvent executionEvent3 = benchmark1.getProperty("Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList5 = benchmark1.getCollectors("Title");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = benchmark1.getTimeoutInSeconds();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation2 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup3 = seriesGroup1.setYAxisOrientation(orientation2);
        net.engio.pips.lab.Benchmark benchmark5 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str6 = benchmark5.getReportBaseDir();
        java.lang.String str7 = benchmark5.toString();
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection8 = seriesGroup1.createDataSet(benchmark5);
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList10 = benchmark5.getCollectors("run 1 times");
        java.lang.String str11 = benchmark5.getReportBaseDir();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = benchmark5.getTimeoutInSeconds();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList2 = benchmark1.getCollectors();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter3 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter4 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.CSVFileExporter cSVFileExporter5 = new net.engio.pips.reports.CSVFileExporter();
        net.engio.pips.reports.IReporter[] iReporterArray6 = new net.engio.pips.reports.IReporter[] { cSVFileExporter3, cSVFileExporter4, cSVFileExporter5 };
        benchmark1.generateReports(iReporterArray6);
        net.engio.pips.lab.ExecutionContext executionContext8 = new net.engio.pips.lab.ExecutionContext(benchmark1);
        executionContext8.finished();
        long long10 = executionContext8.getExecutionTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        net.engio.pips.data.utils.ExecutionTimer executionTimer12 = executionContext8.createExecutionTimer("run 1 times");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("hi!");
        net.engio.pips.lab.workload.ExecutionEvent executionEvent3 = benchmark1.getProperty("Experiment hi! with 0 workloads\n\nand additional parameters:\n");
        java.lang.String str4 = benchmark1.toString();
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList5 = benchmark1.getCollectors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = benchmark1.getTimeoutInSeconds();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        net.engio.pips.lab.workload.Duration duration1 = new net.engio.pips.lab.workload.Duration((int) (byte) 1);
        java.lang.String str2 = duration1.toString();
        java.lang.String str3 = duration1.toString();
        boolean boolean4 = duration1.isRepetitive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long5 = duration1.inMillisecs();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        net.engio.pips.lab.Benchmark benchmark1 = new net.engio.pips.lab.Benchmark("Sample interval");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = benchmark1.getTimeoutInSeconds();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        net.engio.pips.lab.Benchmark benchmark29 = benchmark13.setSampleInterval((int) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeriesCollection16 and timeSeriesCollection27", timeSeriesCollection16.equals(timeSeriesCollection27) ? timeSeriesCollection16.hashCode() == timeSeriesCollection27.hashCode() : true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        net.engio.pips.reports.SeriesGroup seriesGroup1 = new net.engio.pips.reports.SeriesGroup("Timeout in seconds");
        net.engio.pips.reports.SeriesGroup.Orientation orientation2 = net.engio.pips.reports.SeriesGroup.Orientation.Right;
        net.engio.pips.reports.SeriesGroup seriesGroup3 = seriesGroup1.setYAxisOrientation(orientation2);
        net.engio.pips.lab.Benchmark benchmark5 = new net.engio.pips.lab.Benchmark("hi!");
        java.lang.String str6 = benchmark5.getReportBaseDir();
        java.lang.String str7 = benchmark5.toString();
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection8 = seriesGroup1.createDataSet(benchmark5);
        java.util.List<net.engio.pips.data.IDataCollector> iDataCollectorList10 = benchmark5.getCollectors("run 1 times");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = benchmark5.getTimeoutInSeconds();
    }
}

