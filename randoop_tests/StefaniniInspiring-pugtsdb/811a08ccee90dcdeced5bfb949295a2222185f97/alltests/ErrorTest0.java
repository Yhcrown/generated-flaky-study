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
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository0 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.inspiring.pugtsdb.sql.PugConnection pugConnection1 = tagH2Repository0.getConnection();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository0 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository1 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.inspiring.pugtsdb.sql.PugConnection pugConnection2 = tagH2Repository0.getConnection();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository0 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.String> strMap2 = tagH2Repository0.selectTagsByMetricId("max");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository0 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository1 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.inspiring.pugtsdb.sql.PugConnection pugConnection2 = metricH2Repository1.getConnection();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository0 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository1 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository0);
        com.inspiring.pugtsdb.bean.Tag tag4 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str5 = tag4.getValue();
        com.inspiring.pugtsdb.bean.Tag tag7 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str8 = tag7.getValue();
        com.inspiring.pugtsdb.bean.Tag tag10 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str11 = tag10.toString();
        com.inspiring.pugtsdb.bean.Tag[] tagArray12 = new com.inspiring.pugtsdb.bean.Tag[] { tag4, tag7, tag10 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList13 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList13, tagArray12);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList13);
        com.inspiring.pugtsdb.metric.LongMetric longMetric16 = new com.inspiring.pugtsdb.metric.LongMetric("Aggregation{name='sum'}", strMap15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = metricH2Repository1.notExistsMetric((com.inspiring.pugtsdb.metric.Metric<java.lang.Long>) longMetric16);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository2 = pointRocksRepository1.getMetricRepository();
        com.inspiring.pugtsdb.bean.Tag tag5 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str6 = tag5.getValue();
        com.inspiring.pugtsdb.bean.Tag tag8 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str9 = tag8.getValue();
        com.inspiring.pugtsdb.bean.Tag tag11 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str12 = tag11.toString();
        com.inspiring.pugtsdb.bean.Tag[] tagArray13 = new com.inspiring.pugtsdb.bean.Tag[] { tag5, tag8, tag11 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList14 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList14, tagArray13);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList14);
        com.inspiring.pugtsdb.metric.LongMetric longMetric17 = new com.inspiring.pugtsdb.metric.LongMetric("Aggregation{name='sum'}", strMap16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = metricRocksRepository2.existsMetric((com.inspiring.pugtsdb.metric.Metric<java.lang.Long>) longMetric17);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository2 = pointRocksRepository1.getMetricRepository();
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository7 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository8 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository7);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository9 = pointRocksRepository8.getMetricRepository();
        com.inspiring.pugtsdb.time.Granularity granularity12 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>> wildcardClassMetricPoints14 = pointRocksRepository8.selectLastMetricPointsByIdAndAggregation("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "", granularity12, 1);
        com.inspiring.pugtsdb.time.Granularity granularity17 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity18 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList19 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent20 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity17, granularity18, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList19);
        com.inspiring.pugtsdb.time.Granularity granularity21 = h2RepositoryRollUpEvent20.getSourceGranularity();
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>>> h2RepositoryRollUpEventMetricPointsList22 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryRollUpEventRollUpEvent23 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>>("Aggregation{name", "100", granularity12, granularity21, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>>>) h2RepositoryRollUpEventMetricPointsList22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        pointRocksRepository1.deletePointsByNameAndAggregationBeforeTime("", "sum", granularity12, (long) (byte) 1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository2 = pointRocksRepository1.getMetricRepository();
        com.inspiring.pugtsdb.time.Granularity granularity5 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>> wildcardClassMetricPoints7 = pointRocksRepository1.selectLastMetricPointsByIdAndAggregation("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "", granularity5, 1);
        com.inspiring.pugtsdb.sql.PugConnection pugConnection8 = pointRocksRepository1.getConnection();
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository10 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository11 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository10);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository12 = pointRocksRepository11.getMetricRepository();
        com.inspiring.pugtsdb.time.Granularity granularity15 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>> wildcardClassMetricPoints17 = pointRocksRepository11.selectLastMetricPointsByIdAndAggregation("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "", granularity15, 1);
        long long18 = granularity15.getValue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList19 = pointRocksRepository1.selectAggregationNames("100", granularity15);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.bean.Tag tag4 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str5 = tag4.getValue();
        com.inspiring.pugtsdb.bean.Tag tag7 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str8 = tag7.getValue();
        com.inspiring.pugtsdb.bean.Tag tag10 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str11 = tag10.toString();
        com.inspiring.pugtsdb.bean.Tag[] tagArray12 = new com.inspiring.pugtsdb.bean.Tag[] { tag4, tag7, tag10 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList13 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList13, tagArray12);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList13);
        com.inspiring.pugtsdb.metric.LongMetric longMetric16 = new com.inspiring.pugtsdb.metric.LongMetric("Aggregation{name='sum'}", strMap15);
        byte[] byteArray18 = longMetric16.valueToBytes((java.lang.Long) 7233188113542599437L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = metricRocksRepository0.existsMetric((com.inspiring.pugtsdb.metric.Metric<java.lang.Long>) longMetric16);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository0 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository1 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList2 = metricH2Repository1.selectMetricNames();
    }
}

