import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository0 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.String> strMap2 = tagH2Repository0.selectTagsByMetricId("\000\000\000\000\000\000\000d");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories0 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository1 = h2Repositories0.getPointRepository();
        com.inspiring.pugtsdb.rollup.schedule.RollUpScheduler rollUpScheduler2 = new com.inspiring.pugtsdb.rollup.schedule.RollUpScheduler((com.inspiring.pugtsdb.repository.Repositories) h2Repositories0);
        com.inspiring.pugtsdb.repository.PointRepository pointRepository3 = h2Repositories0.getPointRepository();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        pointRepository3.deleteRawPointsByNameBeforeTime("Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}", (long) (byte) 10);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories0 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.rollup.schedule.RollUpScheduler rollUpScheduler1 = new com.inspiring.pugtsdb.rollup.schedule.RollUpScheduler((com.inspiring.pugtsdb.repository.Repositories) h2Repositories0);
        com.inspiring.pugtsdb.rollup.aggregation.BooleanAndAggregation booleanAndAggregation3 = new com.inspiring.pugtsdb.rollup.aggregation.BooleanAndAggregation();
        java.lang.String str4 = booleanAndAggregation3.getName();
        com.inspiring.pugtsdb.time.Granularity granularity5 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        com.inspiring.pugtsdb.time.Granularity[] granularityArray6 = new com.inspiring.pugtsdb.time.Granularity[] { granularity5 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rollUpScheduler1.registerRollUps("min", (com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Boolean>) booleanAndAggregation3, granularityArray6);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.inspiring.pugtsdb.repository.rocks.bean.PointId pointId6 = com.inspiring.pugtsdb.repository.rocks.bean.PointId.from(byteArray5);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository0 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository1 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList2 = metricH2Repository1.selectMetricNames();
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories0 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository1 = h2Repositories0.getPointRepository();
        com.inspiring.pugtsdb.repository.TagRepository tagRepository2 = h2Repositories0.getTagRepository();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.String> strMap4 = tagRepository2.selectTagsByMetricId("Interval{fromTime=-1457230920579, untilTime=-1457227320579}");
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories0 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository1 = h2Repositories0.getPointRepository();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        pointRepository1.deleteRawPointsByNameBeforeTime("and", (long) 1228498187);
    }
}

