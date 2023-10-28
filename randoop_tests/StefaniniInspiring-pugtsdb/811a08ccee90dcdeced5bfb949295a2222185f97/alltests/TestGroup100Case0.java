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
        java.util.function.Supplier<com.esotericsoftware.kryo.Kryo> kryoSupplier0 = null;
        com.inspiring.pugtsdb.util.Serializer.setKryoSupplier(kryoSupplier0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        boolean boolean1 = com.inspiring.pugtsdb.util.Strings.isBlank((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository1 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(tagRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.sql.PugConnection pugConnection2 = metricH2Repository1.getConnection();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            long long4 = com.inspiring.pugtsdb.util.MurmurHash3.getLongLittleEndian(byteArray2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 104 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 0]");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        int int1 = com.inspiring.pugtsdb.util.MurmurHash3.fmix32((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-383449968) + "'", int1 == (-383449968));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        int int0 = com.inspiring.pugtsdb.metric.Metric.ID_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.time.temporal.ChronoUnit chronoUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.time.Interval.Builder builder2 = com.inspiring.pugtsdb.time.Interval.ofLast(0L, chronoUnit1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.ChronoUnit.getDuration()\" because \"unit\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        int int0 = com.inspiring.pugtsdb.metric.Metric.ID_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        com.inspiring.pugtsdb.repository.Repositories repositories0 = null;
        com.inspiring.pugtsdb.time.Retention retention1 = null;
        com.inspiring.pugtsdb.time.Retention retention2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger scheduledPointPurger3 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger(repositories0, retention1, retention2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.inspiring.pugtsdb.repository.Repositories.getPointRepository()\" because \"repositories\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastHours(1L);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromYearsAgo((long) (byte) 100);
        com.inspiring.pugtsdb.time.Interval interval5 = builder1.fromWeeksAgo((long) 10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(interval5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository1 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(tagRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.time.Granularity> granularityMetric3 = metricH2Repository1.selectMetricById("hi!");
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.exception.PugNotImplementedException; message: MetricH2Repository.selectMetricById(String id) not implemented yet");
        } catch (com.inspiring.pugtsdb.exception.PugNotImplementedException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        com.inspiring.pugtsdb.time.Granularity granularity1 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit2 = granularity1.getUnit();
        com.inspiring.pugtsdb.time.Interval.Builder builder3 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (short) 100, chronoUnit2);
        com.inspiring.pugtsdb.time.Interval interval5 = builder3.fromWeeksAgo((long) (byte) -1);
        long long6 = interval5.getUntilTime();
        org.junit.Assert.assertTrue("'" + granularity1 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity1.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit2 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit2.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(interval5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1699072674624L + "'", long6 == 1699072674624L);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        org.rocksdb.RocksDB rocksDB0 = null;
        org.rocksdb.ColumnFamilyOptions columnFamilyOptions1 = null;
        java.util.Map<java.lang.String, org.rocksdb.ColumnFamilyHandle> strMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository3 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository(rocksDB0, columnFamilyOptions1, strMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsatisfiedLinkError; message: Can't load library: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/librocksdbjni10267919761356952089.jnilib");
        } catch (java.lang.UnsatisfiedLinkError e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.PointRepository> pointRepositoryMetricPoints5 = pointH2Repository1.selectRawMetricPointsByIdBetweenTimestamp("hi!", (long) (short) 100, (long) 13);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric hi! points between 100 and 13 with statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"value\"                      FROM   metric                               INNER JOIN point                            ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository1 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(tagRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.metric.Metric<java.util.Map<java.lang.String, java.lang.String>> strMapMetric3 = metricH2Repository1.selectMetricById("");
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.exception.PugNotImplementedException; message: MetricH2Repository.selectMetricById(String id) not implemented yet");
        } catch (com.inspiring.pugtsdb.exception.PugNotImplementedException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository1 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(tagRepository0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList2 = metricH2Repository1.selectMetricNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.inspiring.pugtsdb.rollup.aggregation.BooleanAndAggregation booleanAndAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.BooleanAndAggregation();
        java.lang.String str1 = booleanAndAggregation0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aggregation{name='and'}" + "'", str1, "Aggregation{name='and'}");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.inspiring.pugtsdb.util.MurmurHash3 murmurHash3_0 = new com.inspiring.pugtsdb.util.MurmurHash3();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric7 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap6);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = doubleMetric7.getTags();
        boolean boolean9 = com.inspiring.pugtsdb.util.Collections.isNotEmpty(strMap8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.time.Granularity>> granularityMetricPointsList12 = pointH2Repository1.selectMetricsPointsByNameAndAggregationAndTagsBetweenTimestamp("-000871510803", "Aggregation{name='sum'}", granularity4, strMap8, (long) '4', (long) (-383449968));
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric -000871510803 points aggregated as Aggregation{name='sum'} between 52 and -383449968 with granularity 1mo tags {} and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1mo AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"aggregation\" = ?            AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\"              ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_HOUR;
        // The following exception was thrown during execution in test generation
        try {
            pointH2Repository1.deletePointsByNameAndAggregationBeforeTime("hi!", "", granularity4, 1699072674624L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_HOUR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_HOUR));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        boolean boolean1 = com.inspiring.pugtsdb.util.Strings.isBlank((java.lang.CharSequence) "Interval{fromTime=-1457230925766, untilTime=-1457227325766}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        int int0 = java.sql.Connection.TRANSACTION_SERIALIZABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.inspiring.pugtsdb.util.Strings strings0 = new com.inspiring.pugtsdb.util.Strings();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.MetricRepository> metricRepositoryMetricPoints7 = pointH2Repository1.selectMetricPointsByIdAndAggregationBetweenTimestamp("", "Aggregation{name='sum'}", granularity4, 100L, (long) 13);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric  points aggregated as Aggregation{name='sum'} between 100 and 13 with granularity 1mo and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1mo AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"aggregation\" = ?            AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        long long1 = com.inspiring.pugtsdb.util.MurmurHash3.fmix64((long) 13);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1747946240102026939L) + "'", long1 == (-1747946240102026939L));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.repository.Repository> repositoryMetric2 = null;
        com.inspiring.pugtsdb.bean.Point<com.inspiring.pugtsdb.repository.Repository> repositoryPoint3 = null;
        com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.repository.Repository> repositoryMetricPoint4 = new com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.repository.Repository>(repositoryMetric2, repositoryPoint3);
        // The following exception was thrown during execution in test generation
        try {
            pointH2Repository1.upsertMetricPoint(repositoryMetricPoint4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_HOUR;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.MetricH2Repository>> metricH2RepositoryMetricPointsList6 = pointH2Repository1.selectLastMetricsPointsByNameAndAggregation("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", "Aggregation{name='and'}", granularity4, (-1));
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric Interval{fromTime=-1457230925766, untilTime=-1457227325766} last -1 points aggregated as Aggregation{name='and'} with granularity 1h and statement  SELECT TOP ?                                       metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1h AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"aggregation\" = ?            ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\" DESC         ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_HOUR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_HOUR));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        // The following exception was thrown during execution in test generation
        try {
            pointH2Repository1.deleteRawPointsByNameBeforeTime("hi!", (-1747946240102026939L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.repository.rocks.bean.PointId pointId1 = com.inspiring.pugtsdb.repository.rocks.bean.PointId.from("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 13, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit5 = granularity4.getUnit();
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryMetricPoints7 = pointH2Repository1.selectLastMetricPointsByIdAndAggregation("Aggregation{name='or'}", "Aggregation{name='and'}", granularity4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric Aggregation{name='or'} last -1 points aggregated as Aggregation{name='and'} with granularity 1y and statement  SELECT TOP ?                                       metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1y AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"aggregation\" = ?            ORDER BY metric.\"id\",                              point.\"timestamp\" DESC          ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.inspiring.pugtsdb.util.Collections collections0 = new com.inspiring.pugtsdb.util.Collections();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.time.Granularity granularity3 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric6 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = doubleMetric6.getTags();
        java.lang.String str8 = doubleMetric6.getId();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = doubleMetric6.getTags();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.BooleanAndAggregation>> booleanAndAggregationMetricPointsList12 = pointH2Repository1.selectMetricsPointsByNameAndTagsBetweenTimestamp("Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}", granularity3, strMap9, (long) (short) 100, (-1L));
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}} points between 100 and -1 with granularity 1y tags {} and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1y AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\"              ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity3 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity3.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-000871510803" + "'", str8, "-000871510803");
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        int int0 = java.sql.Connection.TRANSACTION_REPEATABLE_READ;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit5 = granularity4.getUnit();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric8 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = doubleMetric8.getTags();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.BooleanOrAggregation>> booleanOrAggregationMetricPointsList11 = pointH2Repository1.selectLastMetricsPointsByNameAndAggregationAndTags("Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}", "hi!", granularity4, strMap9, 13);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}} last 13 points aggregated as hi! with granularity 1y tags {} and statement  SELECT TOP ?                                       metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1y AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"aggregation\" = ?            ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\" DESC         ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_SECOND;
        // The following exception was thrown during execution in test generation
        try {
            pointH2Repository1.deletePointsByNameAndAggregationBeforeTime("Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}", "Tag{name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', value='Aggregation{name='sum'}'}", granularity4, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_SECOND + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_SECOND));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastWeeks((long) (short) 1);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.from(0L);
        com.inspiring.pugtsdb.time.Interval interval4 = builder1.fromNow();
        long long5 = interval4.getFromTime();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(interval4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1697863075389L + "'", long5 == 1697863075389L);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.sql.PugConnection pugConnection2 = pointH2Repository1.getConnection();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.time.Granularity granularity3 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit4 = granularity3.getUnit();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric7 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap6);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = doubleMetric7.getTags();
        boolean boolean9 = com.inspiring.pugtsdb.util.Collections.isNotEmpty(strMap8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.exception.PugException>> pugExceptionMetricPointsList12 = pointH2Repository1.selectMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", granularity3, strMap8, (-1L), (long) '4');
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric Aggregation{name='sum'} points between -1 and 52 with granularity 1y tags {} and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1y AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\"              ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity3 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity3.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit4 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit4.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository1 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(tagRepository0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList2 = metricH2Repository1.selectMetricNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        com.inspiring.pugtsdb.rollup.aggregation.Aggregation<com.inspiring.pugtsdb.time.Interval> intervalAggregation1 = null;
        com.inspiring.pugtsdb.time.Granularity granularity2 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity3 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        com.inspiring.pugtsdb.repository.Repositories repositories4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.rollup.RollUp<com.inspiring.pugtsdb.time.Interval> intervalRollUp5 = new com.inspiring.pugtsdb.rollup.RollUp<com.inspiring.pugtsdb.time.Interval>("Aggregation{name='and'}", intervalAggregation1, granularity2, granularity3, repositories4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.inspiring.pugtsdb.repository.Repositories.getPointRepository()\" because \"repositories\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity2 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity2.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity3 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity3.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository3 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository3);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric5 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints6 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric5);
        com.inspiring.pugtsdb.time.Granularity granularity7 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit8 = granularity7.getUnit();
        pointH2Repository4.upsertMetricPoints(constantDescMetricPoints6, granularity7);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric13 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = doubleMetric13.getTags();
        java.lang.String str15 = doubleMetric13.getId();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = doubleMetric13.getTags();
        com.inspiring.pugtsdb.metric.BooleanMetric booleanMetric17 = new com.inspiring.pugtsdb.metric.BooleanMetric("Aggregation{name='and'}", strMap16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.MetricRepository>> metricRepositoryMetricPointsList19 = pointH2Repository1.selectLastMetricsPointsByNameAndTags("", granularity7, strMap16, (int) ' ');
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric  last 32 points with granularity 1y tags {} and statement  SELECT TOP ?                                       metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1y AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\" DESC         ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity7 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity7.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit8 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit8.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-000871510803" + "'", str15, "-000871510803");
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.until((long) 0);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromMinutesAgo((long) (-383449968));
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.inspiring.pugtsdb.util.MurmurHash3.murmurhash3_x86_32((java.lang.CharSequence) "Aggregation{name='and'}", (int) (short) 100, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        int int1 = com.inspiring.pugtsdb.util.MurmurHash3.fmix32((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-383449968) + "'", int1 == (-383449968));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric2 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints3 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric2);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit5 = granularity4.getUnit();
        pointH2Repository1.upsertMetricPoints(constantDescMetricPoints3, granularity4);
        com.inspiring.pugtsdb.time.Granularity granularity8 = com.inspiring.pugtsdb.time.Granularity.ONE_SECOND;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric11 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap10);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = doubleMetric11.getTags();
        boolean boolean13 = com.inspiring.pugtsdb.util.Collections.isNotEmpty(strMap12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.PointH2Repository>> pointH2RepositoryMetricPointsList15 = pointH2Repository1.selectLastMetricsPointsByNameAndTags("-000871510803", granularity8, strMap12, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric -000871510803 last -1 points with granularity 1s tags {} and statement  SELECT TOP ?                                       metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1s AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\" DESC         ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity8 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_SECOND + "'", granularity8.equals(com.inspiring.pugtsdb.time.Granularity.ONE_SECOND));
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric2 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints3 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric2);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit5 = granularity4.getUnit();
        pointH2Repository1.upsertMetricPoints(constantDescMetricPoints3, granularity4);
        byte[] byteArray10 = com.inspiring.pugtsdb.util.Bytes.fromBoolean((java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            constantDescMetricPoints3.put("Aggregation{name='and'}", (long) 100, byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.inspiring.pugtsdb.metric.Metric.valueFromBytes(byte[])\" because \"this.metric\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        java.lang.String str0 = com.inspiring.pugtsdb.repository.rocks.RocksRepository.POINT_COLUMN_FAMILY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "point" + "'", str0, "point");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastWeeks(10L);
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric2 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints3 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric2);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit5 = granularity4.getUnit();
        pointH2Repository1.upsertMetricPoints(constantDescMetricPoints3, granularity4);
        // The following exception was thrown during execution in test generation
        try {
            pointH2Repository1.deleteRawPointsByNameBeforeTime("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.repository.rocks.bean.PointId pointId2 = com.inspiring.pugtsdb.repository.rocks.bean.PointId.of("max", "Tag{name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', value='Aggregation{name='sum'}'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Tag{name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', value='Aggregation{name='sum'}'}\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        int int0 = java.sql.Connection.TRANSACTION_READ_UNCOMMITTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit5 = granularity4.getUnit();
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.Constable> constableMetricPoints7 = pointH2Repository1.selectLastMetricPointsByIdAndAggregation("and", "", granularity4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric and last 10 points aggregated as  with granularity 1y and statement  SELECT TOP ?                                       metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1y AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"aggregation\" = ?            ORDER BY metric.\"id\",                              point.\"timestamp\" DESC          ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric2 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints3 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric2);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit5 = granularity4.getUnit();
        pointH2Repository1.upsertMetricPoints(constantDescMetricPoints3, granularity4);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric10 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap9);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = doubleMetric10.getTags();
        java.lang.String str12 = doubleMetric10.getId();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = doubleMetric10.getTags();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.MetricRepository>> metricRepositoryMetricPointsList16 = pointH2Repository1.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap13, (long) (byte) 0, (-1747946240102026939L));
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric Aggregation{name='sum'} points between 0 and -1747946240102026939 with tags {} and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"value\"                      FROM   metric                               INNER JOIN point                            ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-000871510803" + "'", str12, "-000871510803");
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        com.inspiring.pugtsdb.time.Granularity granularity0 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit1 = granularity0.getUnit();
        java.lang.Class<?> wildcardClass2 = granularity0.getClass();
        org.junit.Assert.assertTrue("'" + granularity0 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity0.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit1 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit1.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric2 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints3 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric2);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit5 = granularity4.getUnit();
        pointH2Repository1.upsertMetricPoints(constantDescMetricPoints3, granularity4);
        com.inspiring.pugtsdb.time.Granularity granularity8 = com.inspiring.pugtsdb.time.Granularity.ONE_SECOND;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<java.lang.reflect.Type> typeMetricPoints10 = pointH2Repository1.selectLastMetricPointsById("", granularity8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric  last points with granularity 100 and statement 1s");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity8 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_SECOND + "'", granularity8.equals(com.inspiring.pugtsdb.time.Granularity.ONE_SECOND));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.PugTSDBOverH2 pugTSDBOverH2_3 = new com.inspiring.pugtsdb.PugTSDBOverH2("Tag{name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', value='Aggregation{name='sum'}'}", "point", "Aggregation{name='sum'}");
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot create database");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.repository.rocks.bean.PointId pointId1 = com.inspiring.pugtsdb.repository.rocks.bean.PointId.from("point");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 13, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository1 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(tagRepository0);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric4 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap3);
        // The following exception was thrown during execution in test generation
        try {
            metricH2Repository1.insertMetric((com.inspiring.pugtsdb.metric.Metric<java.lang.Double>) doubleMetric4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric2 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints3 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric2);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit5 = granularity4.getUnit();
        pointH2Repository1.upsertMetricPoints(constantDescMetricPoints3, granularity4);
        com.inspiring.pugtsdb.time.Granularity granularity9 = com.inspiring.pugtsdb.time.Granularity.ONE_SECOND;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.BooleanAndAggregation> booleanAndAggregationMetricPoints11 = pointH2Repository1.selectLastMetricPointsByIdAndAggregation("min", "-000871510803", granularity9, (int) '#');
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric min last 35 points aggregated as -000871510803 with granularity 1s and statement  SELECT TOP ?                                       metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1s AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"aggregation\" = ?            ORDER BY metric.\"id\",                              point.\"timestamp\" DESC          ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity9 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_SECOND + "'", granularity9.equals(com.inspiring.pugtsdb.time.Granularity.ONE_SECOND));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        com.inspiring.pugtsdb.time.Granularity granularity2 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit3 = granularity2.getUnit();
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_HOUR;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>> h2RepositoriesMetricPointsList5 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repositories> h2RepositoriesRollUpEvent6 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repositories>("", "hi!", granularity2, granularity4, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>) h2RepositoriesMetricPointsList5);
        boolean boolean7 = com.inspiring.pugtsdb.util.Collections.isEmpty((java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>) h2RepositoriesMetricPointsList5);
        org.junit.Assert.assertTrue("'" + granularity2 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity2.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit3 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit3.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_HOUR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_HOUR));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.inspiring.pugtsdb.repository.rocks.RocksRepositories rocksRepositories0 = null;
        com.inspiring.pugtsdb.time.Retention retention1 = null;
        com.inspiring.pugtsdb.time.Retention retention2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.rollup.schedule.ScheduledRocksPointPurger scheduledRocksPointPurger3 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledRocksPointPurger(rocksRepositories0, retention1, retention2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.inspiring.pugtsdb.repository.Repositories.getPointRepository()\" because \"repositories\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        byte[] byteArray1 = com.inspiring.pugtsdb.util.Bytes.fromUtf8String("-000871510803");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[45, 48, 48, 48, 56, 55, 49, 53, 49, 48, 56, 48, 51]");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.repository.Repository> repositoryMetric2 = null;
        com.inspiring.pugtsdb.bean.Point<com.inspiring.pugtsdb.repository.Repository> repositoryPoint3 = null;
        com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.repository.Repository> repositoryMetricPoint4 = new com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.repository.Repository>(repositoryMetric2, repositoryPoint3);
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.repository.Repository> repositoryMetric5 = repositoryMetricPoint4.getMetric();
        // The following exception was thrown during execution in test generation
        try {
            pointH2Repository1.upsertMetricPoint(repositoryMetricPoint4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(repositoryMetric5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.inspiring.pugtsdb.rollup.aggregation.DoubleSumAggregation doubleSumAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.DoubleSumAggregation();
        java.lang.String str1 = doubleSumAggregation0.toString();
        java.lang.String str2 = doubleSumAggregation0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aggregation{name='sum'}" + "'", str1, "Aggregation{name='sum'}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aggregation{name='sum'}" + "'", str2, "Aggregation{name='sum'}");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        byte[] byteArray1 = com.inspiring.pugtsdb.util.Bytes.fromBoolean((java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long2 = com.inspiring.pugtsdb.util.Bytes.toLong(byteArray1);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.exception.PugConversionException; message: Cannot convert bytes [0] to Long: Expected a length of 8, got 1");
        } catch (com.inspiring.pugtsdb.exception.PugConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        // The following exception was thrown during execution in test generation
        try {
            pointH2Repository1.deleteRawPointsByNameBeforeTime("Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}", (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.repository.rocks.bean.PointId pointId1 = com.inspiring.pugtsdb.repository.rocks.bean.PointId.from("max");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 13, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        int int0 = com.inspiring.pugtsdb.metric.Metric.ID_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        java.time.Instant instant0 = null;
        java.time.temporal.ChronoUnit chronoUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = com.inspiring.pugtsdb.util.Temporals.truncate(instant0, chronoUnit1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.ChronoUnit.ordinal()\" because \"unit\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.inspiring.pugtsdb.rollup.aggregation.DoubleMaxAggregation doubleMaxAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.DoubleMaxAggregation();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.time.Granularity granularity3 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.bean.Point<java.lang.Cloneable>> cloneablePointMetricPoints5 = pointH2Repository1.selectLastMetricPointsById("point", granularity3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric point last points with granularity 1 and statement 1mo");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity3 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity3.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric2 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = doubleMetric2.getTags();
        java.lang.String str4 = doubleMetric2.getId();
        java.lang.String str5 = doubleMetric2.toString();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = doubleMetric2.getTags();
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-000871510803" + "'", str4, "-000871510803");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}" + "'", str5, "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}");
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        boolean boolean1 = com.inspiring.pugtsdb.util.Strings.isNotBlank((java.lang.CharSequence) "Aggregation{name='and'}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.until((long) (-383449968));
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.lang.String str2 = com.inspiring.pugtsdb.util.Strings.repeat("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}" + "'", str2, "Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool0 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        java.lang.Runnable runnable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduledThreadPool0.execute(runnable1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        int int0 = java.sql.Connection.TRANSACTION_READ_COMMITTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        int int1 = com.inspiring.pugtsdb.util.MurmurHash3.fmix32(8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1228498187 + "'", int1 == 1228498187);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository4 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository5 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository4);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric6 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints7 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric6);
        com.inspiring.pugtsdb.time.Granularity granularity8 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit9 = granularity8.getUnit();
        pointH2Repository5.upsertMetricPoints(constantDescMetricPoints7, granularity8);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.util.Collections> collectionsMetricPoints13 = pointH2Repository1.selectMetricPointsByIdAndAggregationBetweenTimestamp("Metric{id=-001077942221, type='com.inspiring.pugtsdb.metric.BooleanMetric', name='Aggregation{name='and'}', tags={}}", "Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}", granularity8, (long) (short) 100, 1L);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric Metric{id=-001077942221, type='com.inspiring.pugtsdb.metric.BooleanMetric', name='Aggregation{name='and'}', tags={}} points aggregated as Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766} between 100 and 1 with granularity 1y and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1y AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"aggregation\" = ?            AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity8 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity8.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit9 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit9.equals(java.time.temporal.ChronoUnit.YEARS));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        boolean boolean1 = com.inspiring.pugtsdb.util.Strings.isBlank((java.lang.CharSequence) "Aggregation{name='sum'}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        com.inspiring.pugtsdb.rollup.aggregation.DoubleSumAggregation doubleSumAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.DoubleSumAggregation();
        java.lang.String str1 = doubleSumAggregation0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "sum" + "'", str1, "sum");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastHours(1L);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromYearsAgo((long) (byte) 100);
        com.inspiring.pugtsdb.time.Interval interval5 = builder1.fromHoursAgo((long) 100);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(interval5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastWeeks((long) 8);
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) 'a');
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.inspiring.pugtsdb.rollup.aggregation.LongMaxAggregation longMaxAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.LongMaxAggregation();
        java.lang.String str1 = longMaxAggregation0.getName();
        java.lang.String str2 = longMaxAggregation0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "max" + "'", str1, "max");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "max" + "'", str2, "max");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.inspiring.pugtsdb.rollup.aggregation.LongMinAggregation longMinAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.LongMinAggregation();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.time.Granularity granularity3 = com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE;
        com.inspiring.pugtsdb.bean.Tag tag6 = new com.inspiring.pugtsdb.bean.Tag("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", "Aggregation{name='sum'}");
        com.inspiring.pugtsdb.bean.Tag[] tagArray7 = new com.inspiring.pugtsdb.bean.Tag[] { tag6 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList8 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList8, tagArray7);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.time.Granularity>> granularityMetricPointsList12 = pointH2Repository1.selectLastMetricsPointsByNameAndTags("sum", granularity3, strMap10, 4);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric sum last 4 points with granularity 1m tags {Interval{fromTime=-1457230925766, untilTime=-1457227325766}=Aggregation{name='sum'}} and statement  SELECT TOP ?                                       metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1m AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  INNER JOIN metric_tag AS t0              ON     metric.\"id\" = t0.\"metric_id\"  AND    t0.\"tag_name\" = ?               AND    t0.\"tag_value\" = ?              ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\" DESC         ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity3 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE + "'", granularity3.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE));
        org.junit.Assert.assertNotNull(tagArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.TagRepository tagRepository1 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository2 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, tagRepository1);
        com.inspiring.pugtsdb.time.Granularity granularity5 = com.inspiring.pugtsdb.time.Granularity.ONE_SECOND;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>> h2RepositoriesMetricPointsListMetricPoints7 = pointH2Repository2.selectLastMetricPointsByIdAndAggregation("and", "max", granularity5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric and last 10 points aggregated as max with granularity 1s and statement  SELECT TOP ?                                       metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1s AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"aggregation\" = ?            ORDER BY metric.\"id\",                              point.\"timestamp\" DESC          ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity5 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_SECOND + "'", granularity5.equals(com.inspiring.pugtsdb.time.Granularity.ONE_SECOND));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        boolean boolean1 = com.inspiring.pugtsdb.util.GlobPattern.isGlob("and");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.TagRepository tagRepository1 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository2 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, tagRepository1);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository5 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository6 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository5);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric7 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints8 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric7);
        com.inspiring.pugtsdb.time.Granularity granularity9 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit10 = granularity9.getUnit();
        pointH2Repository6.upsertMetricPoints(constantDescMetricPoints8, granularity9);
        java.lang.String str12 = granularity9.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long13 = pointH2Repository2.selectMaxPointTimestampByNameAndAggregation("Aggregation{name='or'}", "Interval{fromTime=-1457230925766, untilTime=-1457227325766}", granularity9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity9 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity9.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit10 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit10.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1y" + "'", str12, "1y");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastYears((long) ' ');
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        java.lang.Throwable throwable4 = null;
        com.inspiring.pugtsdb.exception.PugException pugException5 = new com.inspiring.pugtsdb.exception.PugException("", throwable4);
        com.inspiring.pugtsdb.sql.PugSQLException pugSQLException6 = new com.inspiring.pugtsdb.sql.PugSQLException("-000871510803", throwable4);
        com.inspiring.pugtsdb.exception.PugException pugException7 = new com.inspiring.pugtsdb.exception.PugException("min", (java.lang.Throwable) pugSQLException6);
        java.lang.Throwable[] throwableArray8 = pugException7.getSuppressed();
        com.inspiring.pugtsdb.bean.Point<java.lang.Cloneable> cloneablePoint9 = new com.inspiring.pugtsdb.bean.Point<java.lang.Cloneable>((long) (byte) -1, (java.lang.Cloneable) throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.time.Granularity granularity3 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit4 = granularity3.getUnit();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric8 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = doubleMetric8.getTags();
        java.lang.String str10 = doubleMetric8.getId();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = doubleMetric8.getTags();
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric12 = new com.inspiring.pugtsdb.metric.DoubleMetric("Aggregation{name='sum'}", strMap11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.bean.Tag>> tagMetricPointsList15 = pointH2Repository1.selectMetricsPointsByNameAndTagsBetweenTimestamp("point", granularity3, strMap11, 1697863075389L, 0L);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric point points between 1697863075389 and 0 with granularity 1y tags {} and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1y AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\"              ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity3 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity3.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit4 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit4.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-000871510803" + "'", str10, "-000871510803");
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric2 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints3 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric2);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit5 = granularity4.getUnit();
        pointH2Repository1.upsertMetricPoints(constantDescMetricPoints3, granularity4);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric7 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints8 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric7);
        constantDescMetricPoints8.put("Aggregation{name='sum'}", (long) 8, (java.lang.constant.ConstantDesc) 1);
        java.lang.String str13 = constantDescMetricPoints8.toString();
        com.inspiring.pugtsdb.time.Granularity granularity14 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        // The following exception was thrown during execution in test generation
        try {
            pointH2Repository1.upsertMetricPoints(constantDescMetricPoints8, granularity14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "MetricPoints{metric=null, points={Aggregation{name='sum'}={8=1}}}" + "'", str13, "MetricPoints{metric=null, points={Aggregation{name='sum'}={8=1}}}");
        org.junit.Assert.assertTrue("'" + granularity14 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity14.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastWeeks((long) (short) 1);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.from(0L);
        com.inspiring.pugtsdb.time.Interval interval4 = builder1.fromNow();
        java.lang.String str5 = interval4.toString();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(interval4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Interval{fromTime=1697863077108, untilTime=1698467877108}" + "'", str5, "Interval{fromTime=1697863077108, untilTime=1698467877108}");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.inspiring.pugtsdb.rollup.aggregation.BooleanOrAggregation booleanOrAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.BooleanOrAggregation();
        java.lang.String str1 = booleanOrAggregation0.toString();
        java.lang.String str2 = booleanOrAggregation0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aggregation{name='or'}" + "'", str1, "Aggregation{name='or'}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "or" + "'", str2, "or");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastSeconds((long) (byte) 100);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromYearsAgo((long) 4);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.inspiring.pugtsdb.exception.PugNotImplementedException pugNotImplementedException2 = new com.inspiring.pugtsdb.exception.PugNotImplementedException("hi!");
        java.lang.Throwable[] throwableArray3 = pugNotImplementedException2.getSuppressed();
        com.inspiring.pugtsdb.bean.Point<java.lang.Cloneable> cloneablePoint4 = new com.inspiring.pugtsdb.bean.Point<java.lang.Cloneable>(100L, (java.lang.Cloneable) throwableArray3);
        long long5 = cloneablePoint4.getTimestamp();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.TagRepository tagRepository1 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository2 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, tagRepository1);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit5 = granularity4.getUnit();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList6 = pointH2Repository2.selectAggregationNames("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", granularity4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.inspiring.pugtsdb.bean.Tag tag2 = new com.inspiring.pugtsdb.bean.Tag("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", "Aggregation{name='sum'}");
        com.inspiring.pugtsdb.bean.Tag[] tagArray3 = new com.inspiring.pugtsdb.bean.Tag[] { tag2 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList4 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList4, tagArray3);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList4);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList4);
        org.junit.Assert.assertNotNull(tagArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool0 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        boolean boolean1 = scheduledThreadPool0.isShutdown();
        boolean boolean2 = scheduledThreadPool0.isShutdown();
        scheduledThreadPool0.shutdown();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths(1L);
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.inspiring.pugtsdb.time.Granularity granularity2 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit3 = granularity2.getUnit();
        com.inspiring.pugtsdb.time.Interval.Builder builder4 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (short) 100, chronoUnit3);
        com.inspiring.pugtsdb.rollup.schedule.ChronoTrigger chronoTrigger5 = new com.inspiring.pugtsdb.rollup.schedule.ChronoTrigger(0L, chronoUnit3);
        boolean boolean6 = chronoTrigger5.runNow();
        org.junit.Assert.assertTrue("'" + granularity2 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity2.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit3 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit3.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastHours(1L);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromMonthsAgo((long) 13);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.TagRepository tagRepository1 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository2 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, tagRepository1);
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.repository.Repository> repositoryMetric3 = null;
        com.inspiring.pugtsdb.bean.Point<com.inspiring.pugtsdb.repository.Repository> repositoryPoint4 = null;
        com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.repository.Repository> repositoryMetricPoint5 = new com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.repository.Repository>(repositoryMetric3, repositoryPoint4);
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.repository.Repository> repositoryMetric6 = repositoryMetricPoint5.getMetric();
        com.inspiring.pugtsdb.bean.Point<com.inspiring.pugtsdb.repository.Repository> repositoryPoint7 = repositoryMetricPoint5.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            pointH2Repository2.upsertMetricPoint(repositoryMetricPoint5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(repositoryMetric6);
        org.junit.Assert.assertNull(repositoryPoint7);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths(0L);
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.PugTSDBOverH2 pugTSDBOverH2_3 = new com.inspiring.pugtsdb.PugTSDBOverH2("hi!", "-000871510803", "Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}");
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot create database");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.inspiring.pugtsdb.rollup.aggregation.Aggregation<com.inspiring.pugtsdb.util.Collections> collectionsAggregation1 = null;
        com.inspiring.pugtsdb.time.Granularity granularity2 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit3 = granularity2.getUnit();
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_SECOND;
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories5 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository6 = h2Repositories5.getPointRepository();
        com.inspiring.pugtsdb.rollup.schedule.RollUpScheduler rollUpScheduler7 = new com.inspiring.pugtsdb.rollup.schedule.RollUpScheduler((com.inspiring.pugtsdb.repository.Repositories) h2Repositories5);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.rollup.RollUp<com.inspiring.pugtsdb.util.Collections> collectionsRollUp8 = new com.inspiring.pugtsdb.rollup.RollUp<com.inspiring.pugtsdb.util.Collections>("point", collectionsAggregation1, granularity2, granularity4, (com.inspiring.pugtsdb.repository.Repositories) h2Repositories5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.inspiring.pugtsdb.rollup.aggregation.Aggregation.getName()\" because \"aggregation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity2 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity2.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit3 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit3.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_SECOND + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_SECOND));
        org.junit.Assert.assertNotNull(pointRepository6);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.time.Granularity granularity3 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit4 = granularity3.getUnit();
        long long5 = granularity3.getValue();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric8 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = doubleMetric8.getTags();
        java.lang.String str10 = doubleMetric8.getId();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = doubleMetric8.getTags();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.repository.Repository>>> repositoryMetricPointMetricPointsList13 = pointH2Repository1.selectLastMetricsPointsByNameAndTags("-000871510803", granularity3, strMap11, (-383449968));
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric -000871510803 last -383449968 points with granularity 1y tags {} and statement  SELECT TOP ?                                       metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1y AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\" DESC         ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity3 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity3.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit4 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit4.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-000871510803" + "'", str10, "-000871510803");
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        int int1 = com.inspiring.pugtsdb.util.MurmurHash3.fmix32(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 614249093 + "'", int1 == 614249093);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric2 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap1);
        byte[] byteArray4 = com.inspiring.pugtsdb.util.Bytes.fromUtf8String("Tag{name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', value='Aggregation{name='sum'}'}");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double5 = doubleMetric2.valueFromBytes(byteArray4);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.exception.PugConversionException; message: Cannot convert bytes [84, 97, 103, 123, 110, 97, 109, 101, 61, 39, 73, 110, 116, 101, 114, 118, 97, 108, 123, 102, 114, 111, 109, 84, 105, 109, 101, 61, 45, 49, 52, 53, 55, 50, 51, 48, 57, 50, 53, 55, 54, 54, 44, 32, 117, 110, 116, 105, 108, 84, 105, 109, 101, 61, 45, 49, 52, 53, 55, 50, 50, 55, 51, 50, 53, 55, 54, 54, 125, 39, 44, 32, 118, 97, 108, 117, 101, 61, 39, 65, 103, 103, 114, 101, 103, 97, 116, 105, 111, 110, 123, 110, 97, 109, 101, 61, 39, 115, 117, 109, 39, 125, 39, 125] to Long: Expected a length of 8, got 104");
        } catch (com.inspiring.pugtsdb.exception.PugConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[84, 97, 103, 123, 110, 97, 109, 101, 61, 39, 73, 110, 116, 101, 114, 118, 97, 108, 123, 102, 114, 111, 109, 84, 105, 109, 101, 61, 45, 49, 52, 53, 55, 50, 51, 48, 57, 50, 53, 55, 54, 54, 44, 32, 117, 110, 116, 105, 108, 84, 105, 109, 101, 61, 45, 49, 52, 53, 55, 50, 50, 55, 51, 50, 53, 55, 54, 54, 125, 39, 44, 32, 118, 97, 108, 117, 101, 61, 39, 65, 103, 103, 114, 101, 103, 97, 116, 105, 111, 110, 123, 110, 97, 109, 101, 61, 39, 115, 117, 109, 39, 125, 39, 125]");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit5 = granularity4.getUnit();
        long long6 = granularity4.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.time.Interval.Builder>> builderMetricPointsList8 = pointH2Repository1.selectLastMetricsPointsByNameAndAggregation("hi!", "Interval{fromTime=1697863077108, untilTime=1698467877108}", granularity4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric hi! last 32 points aggregated as Interval{fromTime=1697863077108, untilTime=1698467877108} with granularity 1y and statement  SELECT TOP ?                                       metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1y AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"aggregation\" = ?            ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\" DESC         ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.until((long) 0);
        com.inspiring.pugtsdb.time.Interval interval2 = builder1.fromNow();
        com.inspiring.pugtsdb.time.Interval interval4 = builder1.fromMonthsAgo((long) '#');
        com.inspiring.pugtsdb.time.Interval interval5 = builder1.fromNow();
        java.time.temporal.ChronoUnit chronoUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.time.Interval interval7 = builder1.fromNowTruncatedTo(chronoUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.ChronoUnit.ordinal()\" because \"unit\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval5);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.time.ZonedDateTime zonedDateTime0 = null;
        com.inspiring.pugtsdb.time.Granularity granularity3 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit4 = granularity3.getUnit();
        com.inspiring.pugtsdb.time.Interval.Builder builder5 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (short) 100, chronoUnit4);
        long long6 = com.inspiring.pugtsdb.util.Temporals.truncate((-1L), chronoUnit4);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime7 = com.inspiring.pugtsdb.util.Temporals.truncate(zonedDateTime0, chronoUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.ZonedDateTime.truncatedTo(java.time.temporal.TemporalUnit)\" because \"time\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity3 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity3.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit4 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit4.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-31514400000L) + "'", long6 == (-31514400000L));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.TagRepository tagRepository1 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository2 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, tagRepository1);
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories4 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository5 = h2Repositories4.getPointRepository();
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric6 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints7 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric6);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository8 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository9 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository8);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric10 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints11 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric10);
        com.inspiring.pugtsdb.time.Granularity granularity12 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit13 = granularity12.getUnit();
        pointH2Repository9.upsertMetricPoints(constantDescMetricPoints11, granularity12);
        pointRepository5.upsertMetricPoints(constantDescMetricPoints7, granularity12);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric19 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap18);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = doubleMetric19.getTags();
        java.lang.String str21 = doubleMetric19.getId();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = doubleMetric19.getTags();
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric23 = new com.inspiring.pugtsdb.metric.DoubleMetric("Aggregation{name='sum'}", strMap22);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.AbstractList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>>> metricPointsListMetricPointsList25 = pointH2Repository2.selectLastMetricsPointsByNameAndTags("hi!", granularity12, strMap22, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric hi! last 10 points with granularity 1y tags {} and statement  SELECT TOP ?                                       metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1y AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\" DESC         ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pointRepository5);
        org.junit.Assert.assertTrue("'" + granularity12 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity12.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit13 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit13.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-000871510803" + "'", str21, "-000871510803");
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        byte[] byteArray1 = com.inspiring.pugtsdb.util.Bytes.fromBoolean((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric2 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints3 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric2);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit5 = granularity4.getUnit();
        pointH2Repository1.upsertMetricPoints(constantDescMetricPoints3, granularity4);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<java.lang.reflect.AnnotatedElement> annotatedElementMetricPoints10 = pointH2Repository1.selectRawMetricPointsByIdBetweenTimestamp("Tag{name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', value='Aggregation{name='sum'}'}", (long) (short) -1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric Tag{name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', value='Aggregation{name='sum'}'} points between -1 and 100 with statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"value\"                      FROM   metric                               INNER JOIN point                            ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        int int1 = com.inspiring.pugtsdb.util.MurmurHash3.fmix32((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_HOUR;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.metric.Metric<java.lang.Double>>> doubleMetricMetricPointsList6 = pointH2Repository1.selectLastMetricsPointsByNameAndAggregation("Metric{id=-001077942221, type='com.inspiring.pugtsdb.metric.BooleanMetric', name='Aggregation{name='and'}', tags={}}", "Metric{id=-001077942221, type='com.inspiring.pugtsdb.metric.BooleanMetric', name='Aggregation{name='and'}', tags={}}", granularity4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric Metric{id=-001077942221, type='com.inspiring.pugtsdb.metric.BooleanMetric', name='Aggregation{name='and'}', tags={}} last 100 points aggregated as Metric{id=-001077942221, type='com.inspiring.pugtsdb.metric.BooleanMetric', name='Aggregation{name='and'}', tags={}} with granularity 1h and statement  SELECT TOP ?                                       metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1h AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"aggregation\" = ?            ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\" DESC         ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_HOUR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_HOUR));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.inspiring.pugtsdb.bean.Tag tag2 = new com.inspiring.pugtsdb.bean.Tag("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", "Aggregation{name='sum'}");
        com.inspiring.pugtsdb.bean.Tag[] tagArray3 = new com.inspiring.pugtsdb.bean.Tag[] { tag2 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList4 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList4, tagArray3);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList4);
        boolean boolean7 = com.inspiring.pugtsdb.util.Collections.isNotEmpty(strMap6);
        org.junit.Assert.assertNotNull(tagArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastHours(10L);
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository1 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(tagRepository0);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric5 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = doubleMetric5.getTags();
        java.lang.String str7 = doubleMetric5.getId();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = doubleMetric5.getTags();
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric9 = new com.inspiring.pugtsdb.metric.DoubleMetric("Aggregation{name='sum'}", strMap8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = metricH2Repository1.existsMetric((com.inspiring.pugtsdb.metric.Metric<java.lang.Double>) doubleMetric9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-000871510803" + "'", str7, "-000871510803");
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastDays((long) 100);
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.TagRepository tagRepository1 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository2 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, tagRepository1);
        com.inspiring.pugtsdb.time.Granularity granularity7 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit8 = granularity7.getUnit();
        com.inspiring.pugtsdb.time.Granularity granularity9 = com.inspiring.pugtsdb.time.Granularity.ONE_HOUR;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>> h2RepositoriesMetricPointsList10 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repositories> h2RepositoriesRollUpEvent11 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repositories>("", "hi!", granularity7, granularity9, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>) h2RepositoriesMetricPointsList10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric14 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap13);
        java.lang.String str15 = doubleMetric14.toString();
        byte[] byteArray17 = doubleMetric14.valueToBytes((java.lang.Double) 0.0d);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = doubleMetric14.getTags();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.util.Collections>> collectionsMetricPointsList20 = pointH2Repository2.selectLastMetricsPointsByNameAndAggregationAndTags("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", "min", granularity9, strMap18, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric Interval{fromTime=-1457230925766, untilTime=-1457227325766} last 100 points aggregated as min with granularity 1h tags {} and statement  SELECT TOP ?                                       metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1h AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"aggregation\" = ?            ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\" DESC         ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity7 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity7.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit8 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit8.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity9 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_HOUR + "'", granularity9.equals(com.inspiring.pugtsdb.time.Granularity.ONE_HOUR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}" + "'", str15, "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool0 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        boolean boolean1 = scheduledThreadPool0.isShutdown();
        boolean boolean2 = scheduledThreadPool0.isShutdown();
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<?> wildcardFuture4 = scheduledThreadPool0.submit(runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        com.inspiring.pugtsdb.exception.PugNotImplementedException pugNotImplementedException1 = new com.inspiring.pugtsdb.exception.PugNotImplementedException("Metric{id=-001077942221, type='com.inspiring.pugtsdb.metric.BooleanMetric', name='Aggregation{name='and'}', tags={}}");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository1 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(tagRepository0);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric4 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = doubleMetric4.getTags();
        java.lang.String str6 = doubleMetric4.getId();
        java.lang.String str7 = doubleMetric4.toString();
        java.lang.String str8 = doubleMetric4.toString();
        // The following exception was thrown during execution in test generation
        try {
            metricH2Repository1.insertMetric((com.inspiring.pugtsdb.metric.Metric<java.lang.Double>) doubleMetric4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-000871510803" + "'", str6, "-000871510803");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}" + "'", str7, "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}" + "'", str8, "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric2 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints3 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric2);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit5 = granularity4.getUnit();
        pointH2Repository1.upsertMetricPoints(constantDescMetricPoints3, granularity4);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository9 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository10 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository9);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric11 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints12 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric11);
        com.inspiring.pugtsdb.time.Granularity granularity13 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit14 = granularity13.getUnit();
        pointH2Repository10.upsertMetricPoints(constantDescMetricPoints12, granularity13);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric18 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap17);
        java.lang.String str19 = doubleMetric18.toString();
        byte[] byteArray21 = doubleMetric18.valueToBytes((java.lang.Double) 0.0d);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = doubleMetric18.getTags();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.DoubleSumAggregation>> doubleSumAggregationMetricPointsList24 = pointH2Repository1.selectLastMetricsPointsByNameAndAggregationAndTags("MetricPoints{metric=null, points={Aggregation{name='sum'}={8=1}}}", "or", granularity13, strMap22, (-1));
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric MetricPoints{metric=null, points={Aggregation{name='sum'}={8=1}}} last -1 points aggregated as or with granularity 1y tags {} and statement  SELECT TOP ?                                       metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1y AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"aggregation\" = ?            ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\" DESC         ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity13 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity13.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit14 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit14.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}" + "'", str19, "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastSeconds(10L);
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.inspiring.pugtsdb.util.MurmurHash3.LongPair longPair0 = new com.inspiring.pugtsdb.util.MurmurHash3.LongPair();
        longPair0.val2 = (-383449968);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.TagRepository tagRepository1 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository2 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, tagRepository1);
        com.inspiring.pugtsdb.time.Granularity granularity5 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric9 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = doubleMetric9.getTags();
        java.lang.String str11 = doubleMetric9.getId();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = doubleMetric9.getTags();
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric13 = new com.inspiring.pugtsdb.metric.DoubleMetric("Aggregation{name='sum'}", strMap12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.bean.Tag>> tagMetricPointsList16 = pointH2Repository2.selectMetricsPointsByNameAndAggregationAndTagsBetweenTimestamp("Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}", "Aggregation{name='min'}", granularity5, strMap12, (long) 100, (long) 614249093);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766} points aggregated as Aggregation{name='min'} between 100 and 614249093 with granularity null tags {} and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_null AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"aggregation\" = ?            AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\"              ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-000871510803" + "'", str11, "-000871510803");
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.inspiring.pugtsdb.rollup.aggregation.DoubleMinAggregation doubleMinAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.DoubleMinAggregation();
        java.lang.String str1 = doubleMinAggregation0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "min" + "'", str1, "min");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        java.lang.Throwable throwable4 = null;
        com.inspiring.pugtsdb.exception.PugException pugException5 = new com.inspiring.pugtsdb.exception.PugException("", throwable4);
        com.inspiring.pugtsdb.sql.PugSQLException pugSQLException6 = new com.inspiring.pugtsdb.sql.PugSQLException("-000871510803", throwable4);
        com.inspiring.pugtsdb.exception.PugException pugException7 = new com.inspiring.pugtsdb.exception.PugException("min", (java.lang.Throwable) pugSQLException6);
        java.lang.Throwable[] throwableArray8 = pugException7.getSuppressed();
        com.inspiring.pugtsdb.exception.PugException pugException9 = new com.inspiring.pugtsdb.exception.PugException("Metric{id=-001077942221, type='com.inspiring.pugtsdb.metric.BooleanMetric', name='Aggregation{name='and'}', tags={}}", (java.lang.Throwable) pugException7);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric2 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints3 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric2);
        constantDescMetricPoints3.put("Aggregation{name='sum'}", (long) 8, (java.lang.constant.ConstantDesc) 1);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository8 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository9 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository8);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric10 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints11 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric10);
        com.inspiring.pugtsdb.time.Granularity granularity12 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit13 = granularity12.getUnit();
        pointH2Repository9.upsertMetricPoints(constantDescMetricPoints11, granularity12);
        java.lang.String str15 = granularity12.toString();
        // The following exception was thrown during execution in test generation
        try {
            pointH2Repository1.upsertMetricPoints(constantDescMetricPoints3, granularity12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity12 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity12.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit13 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit13.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1y" + "'", str15, "1y");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository1 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(tagRepository0);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric4 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap3);
        java.lang.String str5 = doubleMetric4.toString();
        // The following exception was thrown during execution in test generation
        try {
            metricH2Repository1.insertMetric((com.inspiring.pugtsdb.metric.Metric<java.lang.Double>) doubleMetric4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}" + "'", str5, "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.TagRepository tagRepository1 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository2 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, tagRepository1);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric7 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap6);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = doubleMetric7.getTags();
        java.lang.String str9 = doubleMetric7.getId();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = doubleMetric7.getTags();
        com.inspiring.pugtsdb.metric.BooleanMetric booleanMetric11 = new com.inspiring.pugtsdb.metric.BooleanMetric("Aggregation{name='and'}", strMap10);
        boolean boolean12 = com.inspiring.pugtsdb.util.Collections.isEmpty(strMap10);
        java.util.List<java.lang.String> strList13 = com.inspiring.pugtsdb.bean.Tag.fromMapToStringList(strMap10);
        boolean boolean14 = com.inspiring.pugtsdb.util.Collections.isEmpty(strMap10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.lang.reflect.GenericDeclaration>> genericDeclarationMetricPointsList17 = pointH2Repository2.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("", strMap10, (long) 8, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric  points between 8 and 0 with tags {} and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"value\"                      FROM   metric                               INNER JOIN point                            ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-000871510803" + "'", str9, "-000871510803");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool0 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        boolean boolean1 = scheduledThreadPool0.isShutdown();
        boolean boolean2 = scheduledThreadPool0.isShutdown();
        java.lang.Runnable runnable3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture7 = scheduledThreadPool0.scheduleWithFixedDelay(runnable3, (long) (-383449968), (long) (byte) 100, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        com.inspiring.pugtsdb.bean.Tag tag2 = new com.inspiring.pugtsdb.bean.Tag("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", "Aggregation{name='sum'}");
        java.lang.String str3 = tag2.getName();
        java.lang.String str4 = tag2.toString();
        java.lang.String str5 = tag2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Interval{fromTime=-1457230925766, untilTime=-1457227325766}" + "'", str3, "Interval{fromTime=-1457230925766, untilTime=-1457227325766}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tag{name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', value='Aggregation{name='sum'}'}" + "'", str4, "Tag{name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', value='Aggregation{name='sum'}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Aggregation{name='sum'}" + "'", str5, "Aggregation{name='sum'}");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.TagRepository tagRepository1 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository2 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, tagRepository1);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric6 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = doubleMetric6.getTags();
        java.lang.String str8 = doubleMetric6.getId();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = doubleMetric6.getTags();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = doubleMetric6.getTags();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList13 = pointH2Repository2.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("\000\000\000\000\000\000\000\000", strMap10, (-1747946240102026939L), 1699072674624L);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric ???????? points between -1747946240102026939 and 1699072674624 with tags {} and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"value\"                      FROM   metric                               INNER JOIN point                            ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-000871510803" + "'", str8, "-000871510803");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        byte[] byteArray1 = com.inspiring.pugtsdb.util.Bytes.fromLong((java.lang.Long) 100L);
        java.lang.String str2 = com.inspiring.pugtsdb.util.Bytes.toUtf8String(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000\000\000\000\000\000d" + "'", str2, "\000\000\000\000\000\000\000d");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.inspiring.pugtsdb.time.Granularity granularity3 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit4 = granularity3.getUnit();
        com.inspiring.pugtsdb.time.Interval.Builder builder5 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (short) 100, chronoUnit4);
        long long6 = com.inspiring.pugtsdb.util.Temporals.truncate((-1L), chronoUnit4);
        com.inspiring.pugtsdb.rollup.schedule.ChronoTrigger chronoTrigger7 = new com.inspiring.pugtsdb.rollup.schedule.ChronoTrigger((long) '4', chronoUnit4);
        boolean boolean8 = chronoTrigger7.runNow();
        org.junit.Assert.assertTrue("'" + granularity3 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity3.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit4 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit4.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-31514400000L) + "'", long6 == (-31514400000L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric2 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = doubleMetric2.getTags();
        java.lang.String str4 = doubleMetric2.getId();
        java.lang.String str5 = doubleMetric2.getName();
        byte[] byteArray6 = null;
        java.lang.Double double7 = doubleMetric2.valueFromBytes(byteArray6);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-000871510803" + "'", str4, "-000871510803");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Interval{fromTime=-1457230925766, untilTime=-1457227325766}" + "'", str5, "Interval{fromTime=-1457230925766, untilTime=-1457227325766}");
        org.junit.Assert.assertNull(double7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories0 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository1 = h2Repositories0.getPointRepository();
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric2 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints3 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric2);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository4 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository5 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository4);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric6 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints7 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric6);
        com.inspiring.pugtsdb.time.Granularity granularity8 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit9 = granularity8.getUnit();
        pointH2Repository5.upsertMetricPoints(constantDescMetricPoints7, granularity8);
        pointRepository1.upsertMetricPoints(constantDescMetricPoints3, granularity8);
        com.inspiring.pugtsdb.time.Granularity granularity14 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<java.time.temporal.TemporalUnit> temporalUnitMetricPoints16 = pointRepository1.selectLastMetricPointsByIdAndAggregation("", "\000\000\000\000\000\000\000d", granularity14, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric  last 10 points aggregated as ???????d with granularity 1mo and statement  SELECT TOP ?                                       metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1mo AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"aggregation\" = ?            ORDER BY metric.\"id\",                              point.\"timestamp\" DESC          ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pointRepository1);
        org.junit.Assert.assertTrue("'" + granularity8 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity8.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit9 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit9.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity14 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity14.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastHours((long) (byte) -1);
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.inspiring.pugtsdb.time.Retention retention3 = null;
        com.inspiring.pugtsdb.time.Retention retention4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.PugTSDBOverH2 pugTSDBOverH2_5 = new com.inspiring.pugtsdb.PugTSDBOverH2("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", "Interval{fromTime=1697863077108, untilTime=1698467877108}", "1y", retention3, retention4);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot create database");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastYears((long) (short) 10);
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        com.inspiring.pugtsdb.time.Granularity granularity2 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit3 = granularity2.getUnit();
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_HOUR;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>> h2RepositoriesMetricPointsList5 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repositories> h2RepositoriesRollUpEvent6 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repositories>("", "hi!", granularity2, granularity4, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>) h2RepositoriesMetricPointsList5);
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>> h2RepositoriesMetricPointsList7 = h2RepositoriesRollUpEvent6.getMetricsPoints();
        com.inspiring.pugtsdb.time.Granularity granularity8 = h2RepositoriesRollUpEvent6.getSourceGranularity();
        com.inspiring.pugtsdb.time.Granularity granularity9 = h2RepositoriesRollUpEvent6.getSourceGranularity();
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>> h2RepositoriesMetricPointsList10 = h2RepositoriesRollUpEvent6.getMetricsPoints();
        com.inspiring.pugtsdb.time.Granularity granularity11 = h2RepositoriesRollUpEvent6.getTargetGranularity();
        org.junit.Assert.assertTrue("'" + granularity2 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity2.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit3 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit3.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_HOUR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_HOUR));
        org.junit.Assert.assertNotNull(h2RepositoriesMetricPointsList7);
        org.junit.Assert.assertTrue("'" + granularity8 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity8.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity9 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity9.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertNotNull(h2RepositoriesMetricPointsList10);
        org.junit.Assert.assertTrue("'" + granularity11 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_HOUR + "'", granularity11.equals(com.inspiring.pugtsdb.time.Granularity.ONE_HOUR));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        java.lang.String str2 = com.inspiring.pugtsdb.util.Strings.format((double) 1228498187, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000000000000000000001228498187" + "'", str2, "00000000000000000000000001228498187");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastWeeks((long) (short) 1);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.from(0L);
        com.inspiring.pugtsdb.time.Interval interval5 = builder1.fromMonthsAgo((long) (short) 1);
        long long6 = interval5.getFromTime();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(interval5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1695233332288L + "'", long6 == 1695233332288L);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository1 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(tagRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.rollup.schedule.RollUpScheduler> rollUpSchedulerMetric3 = metricH2Repository1.selectMetricById("max");
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.exception.PugNotImplementedException; message: MetricH2Repository.selectMetricById(String id) not implemented yet");
        } catch (com.inspiring.pugtsdb.exception.PugNotImplementedException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.inspiring.pugtsdb.rollup.aggregation.BooleanOrAggregation booleanOrAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.BooleanOrAggregation();
        java.lang.String str1 = booleanOrAggregation0.toString();
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true };
        java.util.ArrayList<java.lang.Boolean> booleanList5 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList5, booleanArray4);
        java.lang.Boolean boolean7 = booleanOrAggregation0.aggregate((java.util.List<java.lang.Boolean>) booleanList5);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aggregation{name='or'}" + "'", str1, "Aggregation{name='or'}");
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.inspiring.pugtsdb.rollup.aggregation.DoubleAvgAggregation doubleAvgAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.DoubleAvgAggregation();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.inspiring.pugtsdb.rollup.aggregation.Aggregation<com.inspiring.pugtsdb.repository.Repository> repositoryAggregation1 = null;
        com.inspiring.pugtsdb.repository.TagRepository tagRepository2 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository3 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository2);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric4 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints5 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric4);
        com.inspiring.pugtsdb.time.Granularity granularity6 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit7 = granularity6.getUnit();
        pointH2Repository3.upsertMetricPoints(constantDescMetricPoints5, granularity6);
        com.inspiring.pugtsdb.time.Granularity granularity11 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit12 = granularity11.getUnit();
        com.inspiring.pugtsdb.time.Granularity granularity13 = com.inspiring.pugtsdb.time.Granularity.ONE_HOUR;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>> h2RepositoriesMetricPointsList14 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repositories> h2RepositoriesRollUpEvent15 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repositories>("", "hi!", granularity11, granularity13, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>) h2RepositoriesMetricPointsList14);
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>> h2RepositoriesMetricPointsList16 = h2RepositoriesRollUpEvent15.getMetricsPoints();
        com.inspiring.pugtsdb.time.Granularity granularity17 = h2RepositoriesRollUpEvent15.getSourceGranularity();
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories18 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository19 = h2Repositories18.getPointRepository();
        com.inspiring.pugtsdb.repository.TagRepository tagRepository20 = h2Repositories18.getTagRepository();
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.rollup.RollUp<com.inspiring.pugtsdb.repository.Repository> repositoryRollUp21 = new com.inspiring.pugtsdb.rollup.RollUp<com.inspiring.pugtsdb.repository.Repository>("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", repositoryAggregation1, granularity6, granularity17, (com.inspiring.pugtsdb.repository.Repositories) h2Repositories18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.inspiring.pugtsdb.rollup.aggregation.Aggregation.getName()\" because \"aggregation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity6 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity6.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit7 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit7.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity11 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity11.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit12 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit12.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity13 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_HOUR + "'", granularity13.equals(com.inspiring.pugtsdb.time.Granularity.ONE_HOUR));
        org.junit.Assert.assertNotNull(h2RepositoriesMetricPointsList16);
        org.junit.Assert.assertTrue("'" + granularity17 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity17.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertNotNull(pointRepository19);
        org.junit.Assert.assertNotNull(tagRepository20);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric2 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = doubleMetric2.getTags();
        java.lang.String str4 = doubleMetric2.getId();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = doubleMetric2.getTags();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = doubleMetric2.getTags();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = doubleMetric2.getTags();
        java.lang.String str8 = doubleMetric2.toString();
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-000871510803" + "'", str4, "-000871510803");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}" + "'", str8, "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.TagRepository tagRepository1 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository2 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, tagRepository1);
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories3 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository4 = h2Repositories3.getPointRepository();
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric5 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints6 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric5);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository7 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository8 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository7);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric9 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints10 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric9);
        com.inspiring.pugtsdb.time.Granularity granularity11 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit12 = granularity11.getUnit();
        pointH2Repository8.upsertMetricPoints(constantDescMetricPoints10, granularity11);
        pointRepository4.upsertMetricPoints(constantDescMetricPoints6, granularity11);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository15 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository16 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository15);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric17 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints18 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric17);
        com.inspiring.pugtsdb.time.Granularity granularity19 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit20 = granularity19.getUnit();
        pointH2Repository16.upsertMetricPoints(constantDescMetricPoints18, granularity19);
        java.lang.String str22 = granularity19.toString();
        pointH2Repository2.upsertMetricPoints(constantDescMetricPoints6, granularity19);
        com.inspiring.pugtsdb.time.Granularity granularity26 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit27 = granularity26.getUnit();
        long long28 = granularity26.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.schedule.RollUpScheduler>> rollUpSchedulerMetricPointsList31 = pointH2Repository2.selectMetricsPointsByNameAndAggregationBetweenTimestamp("", "or", granularity26, (long) (-1), (long) '#');
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric  points aggregated as or between -1 and 35 with granularity 1y and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1y AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"aggregation\" = ?            AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\"              ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pointRepository4);
        org.junit.Assert.assertTrue("'" + granularity11 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity11.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit12 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit12.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity19 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity19.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit20 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit20.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1y" + "'", str22, "1y");
        org.junit.Assert.assertTrue("'" + granularity26 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity26.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit27 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit27.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric2 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = doubleMetric2.getTags();
        java.lang.String str4 = doubleMetric2.getId();
        byte[] byteArray6 = doubleMetric2.valueToBytes((java.lang.Double) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.repository.rocks.bean.PointId pointId7 = com.inspiring.pugtsdb.repository.rocks.bean.PointId.from(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because the return value of \"com.inspiring.pugtsdb.util.Serializer.getKryoSupplier()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-000871510803" + "'", str4, "-000871510803");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[64, 89, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.inspiring.pugtsdb.time.Granularity granularity5 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit6 = granularity5.getUnit();
        com.inspiring.pugtsdb.time.Interval.Builder builder7 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (short) 100, chronoUnit6);
        long long8 = com.inspiring.pugtsdb.util.Temporals.truncate((-1L), chronoUnit6);
        com.inspiring.pugtsdb.rollup.schedule.ChronoTrigger chronoTrigger9 = new com.inspiring.pugtsdb.rollup.schedule.ChronoTrigger((long) '4', chronoUnit6);
        com.inspiring.pugtsdb.rollup.schedule.ChronoTrigger chronoTrigger10 = new com.inspiring.pugtsdb.rollup.schedule.ChronoTrigger((-1747946240102026939L), chronoUnit6);
        com.inspiring.pugtsdb.time.Interval.Builder builder11 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (short) 10, chronoUnit6);
        org.junit.Assert.assertTrue("'" + granularity5 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity5.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit6 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit6.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-31514400000L) + "'", long8 == (-31514400000L));
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories0 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.rollup.schedule.RollUpScheduler rollUpScheduler1 = new com.inspiring.pugtsdb.rollup.schedule.RollUpScheduler((com.inspiring.pugtsdb.repository.Repositories) h2Repositories0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric3 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = doubleMetric3.getTags();
        java.lang.String str5 = doubleMetric3.getId();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = doubleMetric3.getTags();
        com.inspiring.pugtsdb.metric.BooleanMetric booleanMetric7 = new com.inspiring.pugtsdb.metric.BooleanMetric("Aggregation{name='and'}", strMap6);
        java.lang.String str8 = booleanMetric7.toString();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric11 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap10);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = doubleMetric11.getTags();
        java.lang.String str13 = doubleMetric11.getId();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = doubleMetric11.getTags();
        byte[] byteArray16 = doubleMetric11.valueToBytes((java.lang.Double) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean17 = booleanMetric7.valueFromBytes(byteArray16);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.exception.PugConversionException; message: Cannot convert bytes [63, -16, 0, 0, 0, 0, 0, 0] to Boolean: Expected a length of 1, got 8");
        } catch (com.inspiring.pugtsdb.exception.PugConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-000871510803" + "'", str5, "-000871510803");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Metric{id=-001077942221, type='com.inspiring.pugtsdb.metric.BooleanMetric', name='Aggregation{name='and'}', tags={}}" + "'", str8, "Metric{id=-001077942221, type='com.inspiring.pugtsdb.metric.BooleanMetric', name='Aggregation{name='and'}', tags={}}");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-000871510803" + "'", str13, "-000871510803");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[63, -16, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.inspiring.pugtsdb.rollup.aggregation.LongAvgAggregation longAvgAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.LongAvgAggregation();
        java.lang.String str1 = longAvgAggregation0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "avg" + "'", str1, "avg");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.inspiring.pugtsdb.time.Granularity granularity1 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit2 = granularity1.getUnit();
        com.inspiring.pugtsdb.bean.Point<java.time.temporal.ChronoUnit> chronoUnitPoint3 = com.inspiring.pugtsdb.bean.Point.of((-1L), chronoUnit2);
        org.junit.Assert.assertTrue("'" + granularity1 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity1.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit2 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit2.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(chronoUnitPoint3);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool0 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = scheduledThreadPool0.awaitTermination(1697863075389L, timeUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.TimeUnit.toNanos(long)\" because \"unit\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>> h2RepositoriesMetricPointsList0 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>();
        boolean boolean1 = com.inspiring.pugtsdb.util.Collections.isEmpty((java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>) h2RepositoriesMetricPointsList0);
        boolean boolean2 = com.inspiring.pugtsdb.util.Collections.isNotEmpty((java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>) h2RepositoriesMetricPointsList0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.inspiring.pugtsdb.time.Granularity granularity5 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit6 = granularity5.getUnit();
        com.inspiring.pugtsdb.time.Interval.Builder builder7 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (short) 100, chronoUnit6);
        long long8 = com.inspiring.pugtsdb.util.Temporals.truncate((-1L), chronoUnit6);
        com.inspiring.pugtsdb.rollup.schedule.ChronoTrigger chronoTrigger9 = new com.inspiring.pugtsdb.rollup.schedule.ChronoTrigger((long) '4', chronoUnit6);
        com.inspiring.pugtsdb.rollup.schedule.ChronoTrigger chronoTrigger10 = new com.inspiring.pugtsdb.rollup.schedule.ChronoTrigger((-1747946240102026939L), chronoUnit6);
        com.inspiring.pugtsdb.rollup.schedule.ChronoTrigger chronoTrigger11 = new com.inspiring.pugtsdb.rollup.schedule.ChronoTrigger(10L, chronoUnit6);
        org.junit.Assert.assertTrue("'" + granularity5 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity5.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit6 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit6.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-31514400000L) + "'", long8 == (-31514400000L));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        java.util.function.Supplier<com.esotericsoftware.kryo.Kryo> kryoSupplier0 = com.inspiring.pugtsdb.util.Serializer.getKryoSupplier();
        org.junit.Assert.assertNull(kryoSupplier0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        byte[] byteArray1 = com.inspiring.pugtsdb.util.Bytes.fromLong((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1, -1, -1, -1, -1, -1, -1, -1]");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.TagRepository tagRepository1 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository2 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, tagRepository1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.Repository>> repositoryMetricPointsList6 = pointH2Repository2.selectRawMetricsPointsByNameBetweenTimestamp("\000\000\000\000\000\000\000\000", (long) 8, (long) 10);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric ???????? points between 8 and 10 with statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"value\"                      FROM   metric                               INNER JOIN point                            ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        int int1 = com.inspiring.pugtsdb.util.MurmurHash3.fmix32(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 821347078 + "'", int1 == 821347078);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric2 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = doubleMetric2.getTags();
        java.lang.String str4 = doubleMetric2.getId();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = doubleMetric2.getTags();
        java.lang.String str6 = doubleMetric2.toString();
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-000871510803" + "'", str4, "-000871510803");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}" + "'", str6, "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.inspiring.pugtsdb.time.Granularity granularity2 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit3 = granularity2.getUnit();
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_HOUR;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>> h2RepositoriesMetricPointsList5 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repositories> h2RepositoriesRollUpEvent6 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repositories>("", "hi!", granularity2, granularity4, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>) h2RepositoriesMetricPointsList5);
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>> h2RepositoriesMetricPointsList7 = h2RepositoriesRollUpEvent6.getMetricsPoints();
        com.inspiring.pugtsdb.time.Granularity granularity8 = h2RepositoriesRollUpEvent6.getSourceGranularity();
        java.lang.String str9 = h2RepositoriesRollUpEvent6.getMetricName();
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>> h2RepositoriesMetricPointsList10 = h2RepositoriesRollUpEvent6.getMetricsPoints();
        org.junit.Assert.assertTrue("'" + granularity2 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity2.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit3 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit3.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_HOUR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_HOUR));
        org.junit.Assert.assertNotNull(h2RepositoriesMetricPointsList7);
        org.junit.Assert.assertTrue("'" + granularity8 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity8.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(h2RepositoriesMetricPointsList10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.until((long) (short) 100);
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.inspiring.pugtsdb.exception.PugNotImplementedException pugNotImplementedException2 = new com.inspiring.pugtsdb.exception.PugNotImplementedException("Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}");
        java.lang.Throwable throwable6 = null;
        com.inspiring.pugtsdb.exception.PugException pugException7 = new com.inspiring.pugtsdb.exception.PugException("", throwable6);
        com.inspiring.pugtsdb.sql.PugSQLException pugSQLException8 = new com.inspiring.pugtsdb.sql.PugSQLException("-000871510803", throwable6);
        com.inspiring.pugtsdb.exception.PugException pugException9 = new com.inspiring.pugtsdb.exception.PugException("min", (java.lang.Throwable) pugSQLException8);
        java.lang.Throwable[] throwableArray10 = pugException9.getSuppressed();
        pugNotImplementedException2.addSuppressed((java.lang.Throwable) pugException9);
        com.inspiring.pugtsdb.sql.PugSQLException pugSQLException12 = new com.inspiring.pugtsdb.sql.PugSQLException("00000000000000000000000001228498187", (java.lang.Throwable) pugException9);
        java.lang.String str13 = pugException9.toString();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.inspiring.pugtsdb.exception.PugException: min" + "'", str13, "com.inspiring.pugtsdb.exception.PugException: min");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        // The following exception was thrown during execution in test generation
        try {
            rocksRepository0.compactDB();
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.exception.PugException; message: Cannot compact database");
        } catch (com.inspiring.pugtsdb.exception.PugException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.inspiring.pugtsdb.bean.Tag tag3 = new com.inspiring.pugtsdb.bean.Tag("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", "Aggregation{name='sum'}");
        com.inspiring.pugtsdb.bean.Tag tag6 = new com.inspiring.pugtsdb.bean.Tag("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", "Aggregation{name='sum'}");
        java.lang.String str7 = tag6.getName();
        com.inspiring.pugtsdb.bean.Tag[] tagArray8 = new com.inspiring.pugtsdb.bean.Tag[] { tag3, tag6 };
        java.util.Map<java.lang.String, java.lang.String> strMap9 = com.inspiring.pugtsdb.bean.Tag.toMap(tagArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric10 = new com.inspiring.pugtsdb.metric.DoubleMetric("", strMap9);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.exception.PugIllegalArgumentException; message: Metric name cannot be blank");
        } catch (com.inspiring.pugtsdb.exception.PugIllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Interval{fromTime=-1457230925766, untilTime=-1457227325766}" + "'", str7, "Interval{fromTime=-1457230925766, untilTime=-1457227325766}");
        org.junit.Assert.assertNotNull(tagArray8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.inspiring.pugtsdb.bean.Tag tag2 = new com.inspiring.pugtsdb.bean.Tag("\000\000\000\000\000\000\000\000", "\000\000\000\000\000\000\000\000");
        com.inspiring.pugtsdb.bean.Tag tag5 = new com.inspiring.pugtsdb.bean.Tag("\000\000\000\000\000\000\000\000", "\000\000\000\000\000\000\000\000");
        com.inspiring.pugtsdb.bean.Tag[] tagArray6 = new com.inspiring.pugtsdb.bean.Tag[] { tag2, tag5 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList7 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList7, tagArray6);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList7);
        boolean boolean10 = com.inspiring.pugtsdb.util.Collections.isNotEmpty(strMap9);
        java.util.List<java.lang.String> strList11 = com.inspiring.pugtsdb.bean.Tag.fromMapToStringList(strMap9);
        org.junit.Assert.assertNotNull(tagArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        int int0 = com.inspiring.pugtsdb.metric.Metric.ID_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastWeeks((long) (short) 1);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromSecondsAgo((long) '#');
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastWeeks((long) (short) 1);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromMonthsAgo((-1L));
        com.inspiring.pugtsdb.time.Interval interval5 = builder1.from(1L);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(interval5);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection1 = rocksRepository0.getConnection();
        java.sql.PreparedStatement preparedStatement3 = pugConnection1.prepareStatement("Aggregation{name='and'}");
        java.sql.ShardingKey shardingKey4 = null;
        // The following exception was thrown during execution in test generation
        try {
            pugConnection1.setShardingKey(shardingKey4);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLFeatureNotSupportedException; message: setShardingKey not implemented");
        } catch (java.sql.SQLFeatureNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pugConnection1);
        org.junit.Assert.assertNull(preparedStatement3);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.TagRepository tagRepository1 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository2 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, tagRepository1);
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories3 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository4 = h2Repositories3.getPointRepository();
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric5 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints6 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric5);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository7 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository8 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository7);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric9 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints10 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric9);
        com.inspiring.pugtsdb.time.Granularity granularity11 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit12 = granularity11.getUnit();
        pointH2Repository8.upsertMetricPoints(constantDescMetricPoints10, granularity11);
        pointRepository4.upsertMetricPoints(constantDescMetricPoints6, granularity11);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository15 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository16 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository15);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric17 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints18 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric17);
        com.inspiring.pugtsdb.time.Granularity granularity19 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit20 = granularity19.getUnit();
        pointH2Repository16.upsertMetricPoints(constantDescMetricPoints18, granularity19);
        java.lang.String str22 = granularity19.toString();
        pointH2Repository2.upsertMetricPoints(constantDescMetricPoints6, granularity19);
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier26 = null;
        com.inspiring.pugtsdb.repository.TagRepository tagRepository27 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository28 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier26, tagRepository27);
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories29 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository30 = h2Repositories29.getPointRepository();
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric31 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints32 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric31);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository33 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository34 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository33);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric35 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints36 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric35);
        com.inspiring.pugtsdb.time.Granularity granularity37 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit38 = granularity37.getUnit();
        pointH2Repository34.upsertMetricPoints(constantDescMetricPoints36, granularity37);
        pointRepository30.upsertMetricPoints(constantDescMetricPoints32, granularity37);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository41 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository42 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository41);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric43 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints44 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric43);
        com.inspiring.pugtsdb.time.Granularity granularity45 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit46 = granularity45.getUnit();
        pointH2Repository42.upsertMetricPoints(constantDescMetricPoints44, granularity45);
        java.lang.String str48 = granularity45.toString();
        pointH2Repository28.upsertMetricPoints(constantDescMetricPoints32, granularity45);
        com.inspiring.pugtsdb.bean.Tag tag52 = new com.inspiring.pugtsdb.bean.Tag("\000\000\000\000\000\000\000\000", "\000\000\000\000\000\000\000\000");
        com.inspiring.pugtsdb.bean.Tag tag55 = new com.inspiring.pugtsdb.bean.Tag("\000\000\000\000\000\000\000\000", "\000\000\000\000\000\000\000\000");
        com.inspiring.pugtsdb.bean.Tag[] tagArray56 = new com.inspiring.pugtsdb.bean.Tag[] { tag52, tag55 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList57 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList57, tagArray56);
        java.util.Map<java.lang.String, java.lang.String> strMap59 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList57);
        boolean boolean60 = com.inspiring.pugtsdb.util.Collections.isNotEmpty(strMap59);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>>> wildcardClassMetricPointsList63 = pointH2Repository2.selectMetricsPointsByNameAndAggregationAndTagsBetweenTimestamp("MetricPoints{metric=null, points={Aggregation{name='sum'}={8=1}}}", "Interval{fromTime=1697863077108, untilTime=1698467877108}", granularity45, strMap59, (long) 1228498187, (long) 13);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric MetricPoints{metric=null, points={Aggregation{name='sum'}={8=1}}} points aggregated as Interval{fromTime=1697863077108, untilTime=1698467877108} between 1228498187 and 13 with granularity 1y tags {????????=????????} and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1y AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"aggregation\" = ?            AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              INNER JOIN metric_tag AS t0              ON     metric.\"id\" = t0.\"metric_id\"  AND    t0.\"tag_name\" = ?               AND    t0.\"tag_value\" = ?              ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\"              ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pointRepository4);
        org.junit.Assert.assertTrue("'" + granularity11 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity11.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit12 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit12.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity19 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity19.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit20 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit20.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1y" + "'", str22, "1y");
        org.junit.Assert.assertNotNull(pointRepository30);
        org.junit.Assert.assertTrue("'" + granularity37 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity37.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit38 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit38.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity45 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity45.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit46 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit46.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1y" + "'", str48, "1y");
        org.junit.Assert.assertNotNull(tagArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier4 = null;
        com.inspiring.pugtsdb.repository.TagRepository tagRepository5 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository6 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier4, tagRepository5);
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories7 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository8 = h2Repositories7.getPointRepository();
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric9 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints10 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric9);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository11 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository12 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository11);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric13 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints14 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric13);
        com.inspiring.pugtsdb.time.Granularity granularity15 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit16 = granularity15.getUnit();
        pointH2Repository12.upsertMetricPoints(constantDescMetricPoints14, granularity15);
        pointRepository8.upsertMetricPoints(constantDescMetricPoints10, granularity15);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository19 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository20 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository19);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric21 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints22 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric21);
        com.inspiring.pugtsdb.time.Granularity granularity23 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit24 = granularity23.getUnit();
        pointH2Repository20.upsertMetricPoints(constantDescMetricPoints22, granularity23);
        java.lang.String str26 = granularity23.toString();
        pointH2Repository6.upsertMetricPoints(constantDescMetricPoints10, granularity23);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<java.sql.Wrapper> wrapperMetricPoints30 = pointH2Repository1.selectMetricPointsByIdAndAggregationBetweenTimestamp("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", "\000\000\000\000\000\000\000d", granularity23, 1699072674624L, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric Interval{fromTime=-1457230925766, untilTime=-1457227325766} points aggregated as ???????d between 1699072674624 and 10 with granularity 1y and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1y AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"aggregation\" = ?            AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pointRepository8);
        org.junit.Assert.assertTrue("'" + granularity15 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity15.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit16 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit16.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity23 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity23.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit24 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit24.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1y" + "'", str26, "1y");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        boolean boolean1 = com.inspiring.pugtsdb.util.GlobPattern.isGlob("min");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories0 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository1 = h2Repositories0.getPointRepository();
        com.inspiring.pugtsdb.rollup.schedule.RollUpScheduler rollUpScheduler2 = new com.inspiring.pugtsdb.rollup.schedule.RollUpScheduler((com.inspiring.pugtsdb.repository.Repositories) h2Repositories0);
        com.inspiring.pugtsdb.repository.PointRepository pointRepository3 = h2Repositories0.getPointRepository();
        com.inspiring.pugtsdb.bean.Tag tag7 = new com.inspiring.pugtsdb.bean.Tag("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", "Aggregation{name='sum'}");
        com.inspiring.pugtsdb.bean.Tag tag10 = new com.inspiring.pugtsdb.bean.Tag("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", "Aggregation{name='sum'}");
        java.lang.String str11 = tag10.getName();
        com.inspiring.pugtsdb.bean.Tag[] tagArray12 = new com.inspiring.pugtsdb.bean.Tag[] { tag7, tag10 };
        java.util.Map<java.lang.String, java.lang.String> strMap13 = com.inspiring.pugtsdb.bean.Tag.toMap(tagArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.MetricH2Repository>> metricH2RepositoryMetricPointsList16 = pointRepository3.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("hi!", strMap13, (long) (byte) 0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric hi! points between 0 and -1 with tags {Interval{fromTime=-1457230925766, untilTime=-1457227325766}=Aggregation{name='sum'}} and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"value\"                      FROM   metric                               INNER JOIN point                            ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              INNER JOIN metric_tag AS t0              ON     metric.\"id\" = t0.\"metric_id\"  AND    t0.\"tag_name\" = ?               AND    t0.\"tag_value\" = ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pointRepository1);
        org.junit.Assert.assertNotNull(pointRepository3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Interval{fromTime=-1457230925766, untilTime=-1457227325766}" + "'", str11, "Interval{fromTime=-1457230925766, untilTime=-1457227325766}");
        org.junit.Assert.assertNotNull(tagArray12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories0 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository1 = h2Repositories0.getPointRepository();
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric2 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints3 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric2);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository4 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository5 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository4);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric6 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints7 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric6);
        com.inspiring.pugtsdb.time.Granularity granularity8 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit9 = granularity8.getUnit();
        pointH2Repository5.upsertMetricPoints(constantDescMetricPoints7, granularity8);
        pointRepository1.upsertMetricPoints(constantDescMetricPoints3, granularity8);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository14 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository15 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository14);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric16 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints17 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric16);
        com.inspiring.pugtsdb.time.Granularity granularity18 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit19 = granularity18.getUnit();
        pointH2Repository15.upsertMetricPoints(constantDescMetricPoints17, granularity18);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.function.Supplier<com.esotericsoftware.kryo.Kryo>>> kryoSupplierMetricPointsList22 = pointRepository1.selectLastMetricsPointsByNameAndAggregation("Aggregation{name='min'}", "", granularity18, (int) '4');
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric Aggregation{name='min'} last 52 points aggregated as  with granularity 1y and statement  SELECT TOP ?                                       metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1y AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"aggregation\" = ?            ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\" DESC         ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pointRepository1);
        org.junit.Assert.assertTrue("'" + granularity8 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity8.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit9 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit9.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity18 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity18.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit19 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit19.equals(java.time.temporal.ChronoUnit.YEARS));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection1 = rocksRepository0.getConnection();
        java.sql.ShardingKey shardingKey2 = null;
        java.sql.ShardingKey shardingKey3 = null;
        // The following exception was thrown during execution in test generation
        try {
            pugConnection1.setShardingKey(shardingKey2, shardingKey3);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLFeatureNotSupportedException; message: setShardingKey not implemented");
        } catch (java.sql.SQLFeatureNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pugConnection1);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.inspiring.pugtsdb.repository.rocks.bean.PointId pointId2 = com.inspiring.pugtsdb.repository.rocks.bean.PointId.of("Aggregation{name='sum'}", "00000000000000000000000001228498187");
        pointId2.metricId = "Aggregation{name='sum'}";
        org.junit.Assert.assertNotNull(pointId2);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.inspiring.pugtsdb.exception.PugNotImplementedException pugNotImplementedException2 = new com.inspiring.pugtsdb.exception.PugNotImplementedException("hi!");
        java.lang.Throwable[] throwableArray3 = pugNotImplementedException2.getSuppressed();
        com.inspiring.pugtsdb.bean.Point<java.lang.Cloneable> cloneablePoint4 = new com.inspiring.pugtsdb.bean.Point<java.lang.Cloneable>(100L, (java.lang.Cloneable) throwableArray3);
        java.lang.String str5 = cloneablePoint4.toString();
        long long6 = cloneablePoint4.getTimestamp();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.inspiring.pugtsdb.util.MurmurHash3.murmurhash3_x86_32((java.lang.CharSequence) "Interval{fromTime=1697863077108, untilTime=1698467877108}", 821347078, 1228498187, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 821347078");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit5 = granularity4.getUnit();
        long long6 = granularity4.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionMetricPoints9 = pointH2Repository1.selectMetricPointsByIdAndAggregationBetweenTimestamp("Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}", "or", granularity4, 1697863075389L, 1697863075389L);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}} points aggregated as or between 1697863075389 and 1697863075389 with granularity 1y and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1y AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"aggregation\" = ?            AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool0 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        boolean boolean1 = scheduledThreadPool0.isShutdown();
        java.lang.Runnable runnable2 = null;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture6 = scheduledThreadPool0.scheduleAtFixedRate(runnable2, 10L, 1697863075389L, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastWeeks((long) (short) 1);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromMonthsAgo((-1L));
        com.inspiring.pugtsdb.time.Interval interval4 = builder1.fromNow();
        java.lang.String str5 = interval4.toString();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(interval4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Interval{fromTime=1697863079242, untilTime=1698467879242}" + "'", str5, "Interval{fromTime=1697863079242, untilTime=1698467879242}");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool0 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        boolean boolean1 = scheduledThreadPool0.isTerminated();
        boolean boolean2 = scheduledThreadPool0.isShutdown();
        java.lang.Runnable runnable3 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture7 = scheduledThreadPool0.scheduleAtFixedRate(runnable3, (long) ' ', (long) (byte) 1, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.time.Granularity granularity6 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit7 = granularity6.getUnit();
        com.inspiring.pugtsdb.time.Granularity granularity8 = com.inspiring.pugtsdb.time.Granularity.ONE_HOUR;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>> h2RepositoriesMetricPointsList9 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repositories> h2RepositoriesRollUpEvent10 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repositories>("", "hi!", granularity6, granularity8, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>) h2RepositoriesMetricPointsList9);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.util.MurmurHash3> murmurHash3MetricPoints13 = pointH2Repository1.selectMetricPointsByIdAndAggregationBetweenTimestamp("Aggregation{name='and'}", "point", granularity8, (long) 614249093, (long) '4');
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric Aggregation{name='and'} points aggregated as point between 614249093 and 52 with granularity 1h and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1h AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"aggregation\" = ?            AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity6 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity6.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit7 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit7.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity8 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_HOUR + "'", granularity8.equals(com.inspiring.pugtsdb.time.Granularity.ONE_HOUR));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection1 = rocksRepository0.getConnection();
        java.sql.PreparedStatement preparedStatement3 = pugConnection1.prepareStatement("Aggregation{name='and'}");
        java.sql.SQLWarning sQLWarning4 = pugConnection1.getWarnings();
        java.sql.CallableStatement callableStatement6 = pugConnection1.prepareCall("Aggregation{name='or'}");
        pugConnection1.setCatalog("and");
        org.junit.Assert.assertNotNull(pugConnection1);
        org.junit.Assert.assertNull(preparedStatement3);
        org.junit.Assert.assertNull(sQLWarning4);
        org.junit.Assert.assertNull(callableStatement6);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.inspiring.pugtsdb.bean.Tag tag2 = new com.inspiring.pugtsdb.bean.Tag("Interval{fromTime=1697863077108, untilTime=1698467877108}", "-000871510803");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric2 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = doubleMetric2.getTags();
        java.lang.String str4 = doubleMetric2.toString();
        java.lang.String str5 = doubleMetric2.toString();
        java.lang.String str6 = doubleMetric2.getId();
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}" + "'", str4, "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}" + "'", str5, "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-000871510803" + "'", str6, "-000871510803");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        java.lang.String str0 = com.inspiring.pugtsdb.repository.rocks.RocksRepository.METRIC_COLUMN_FAMILY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "metric" + "'", str0, "metric");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories0 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository1 = h2Repositories0.getPointRepository();
        com.inspiring.pugtsdb.rollup.schedule.RollUpScheduler rollUpScheduler2 = new com.inspiring.pugtsdb.rollup.schedule.RollUpScheduler((com.inspiring.pugtsdb.repository.Repositories) h2Repositories0);
        com.inspiring.pugtsdb.repository.PointRepository pointRepository3 = h2Repositories0.getPointRepository();
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories5 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository6 = h2Repositories5.getPointRepository();
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric7 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints8 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric7);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository9 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository10 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository9);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric11 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints12 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric11);
        com.inspiring.pugtsdb.time.Granularity granularity13 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit14 = granularity13.getUnit();
        pointH2Repository10.upsertMetricPoints(constantDescMetricPoints12, granularity13);
        pointRepository6.upsertMetricPoints(constantDescMetricPoints8, granularity13);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric19 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap18);
        java.lang.String str20 = doubleMetric19.toString();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = doubleMetric19.getTags();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.exception.PugNotImplementedException>> pugNotImplementedExceptionMetricPointsList24 = pointRepository3.selectMetricsPointsByNameAndTagsBetweenTimestamp("hi!", granularity13, strMap21, (long) (short) 100, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric hi! points between 100 and 1 with granularity 1y tags {} and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1y AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\"              ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pointRepository1);
        org.junit.Assert.assertNotNull(pointRepository3);
        org.junit.Assert.assertNotNull(pointRepository6);
        org.junit.Assert.assertTrue("'" + granularity13 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity13.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit14 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit14.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}" + "'", str20, "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}");
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories0 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository1 = h2Repositories0.getPointRepository();
        com.inspiring.pugtsdb.rollup.schedule.RollUpScheduler rollUpScheduler2 = new com.inspiring.pugtsdb.rollup.schedule.RollUpScheduler((com.inspiring.pugtsdb.repository.Repositories) h2Repositories0);
        com.inspiring.pugtsdb.repository.PointRepository pointRepository3 = h2Repositories0.getPointRepository();
        com.inspiring.pugtsdb.time.Granularity granularity6 = com.inspiring.pugtsdb.time.Granularity.ONE_HOUR;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.bean.Tag[]>> tagArrayMetricPointsList8 = pointRepository3.selectLastMetricsPointsByNameAndAggregation("Tag{name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', value='Aggregation{name='sum'}'}", "or", granularity6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric Tag{name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', value='Aggregation{name='sum'}'} last 100 points aggregated as or with granularity 1h and statement  SELECT TOP ?                                       metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1h AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"aggregation\" = ?            ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\" DESC         ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pointRepository1);
        org.junit.Assert.assertNotNull(pointRepository3);
        org.junit.Assert.assertTrue("'" + granularity6 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_HOUR + "'", granularity6.equals(com.inspiring.pugtsdb.time.Granularity.ONE_HOUR));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        int int0 = com.inspiring.pugtsdb.metric.Metric.ID_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastHours(1L);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromYearsAgo((long) (byte) 100);
        java.lang.String str4 = interval3.toString();
        long long5 = interval3.getFromTime();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Interval{fromTime=-1457230920579, untilTime=-1457227320579}" + "'", str4, "Interval{fromTime=-1457230920579, untilTime=-1457227320579}");
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1457230920579L) + "'", long5 == (-1457230920579L));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastSeconds((long) 'a');
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric2 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = doubleMetric2.getTags();
        java.lang.String str4 = doubleMetric2.toString();
        java.lang.String str5 = doubleMetric2.toString();
        byte[] byteArray7 = doubleMetric2.valueToBytes((java.lang.Double) 10.0d);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}" + "'", str4, "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}" + "'", str5, "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[64, 36, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.inspiring.pugtsdb.time.Granularity granularity3 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit4 = granularity3.getUnit();
        com.inspiring.pugtsdb.time.Interval.Builder builder5 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (short) 100, chronoUnit4);
        long long6 = com.inspiring.pugtsdb.util.Temporals.truncate((-1L), chronoUnit4);
        com.inspiring.pugtsdb.rollup.schedule.ChronoTrigger chronoTrigger7 = new com.inspiring.pugtsdb.rollup.schedule.ChronoTrigger((long) 100, chronoUnit4);
        boolean boolean8 = chronoTrigger7.runNow();
        org.junit.Assert.assertTrue("'" + granularity3 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity3.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit4 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit4.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-31514400000L) + "'", long6 == (-31514400000L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection1 = rocksRepository0.getConnection();
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool2 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        boolean boolean3 = scheduledThreadPool2.isShutdown();
        pugConnection1.setNetworkTimeout((java.util.concurrent.Executor) scheduledThreadPool2, (int) (byte) 10);
        java.sql.CallableStatement callableStatement7 = pugConnection1.prepareCall("Aggregation{name='min'}");
        org.junit.Assert.assertNotNull(pugConnection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(callableStatement7);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        java.util.function.Supplier<com.esotericsoftware.kryo.Kryo> kryoSupplier0 = com.inspiring.pugtsdb.util.Serializer.defaultKryoSupplier();
        com.inspiring.pugtsdb.util.Serializer.setKryoSupplier(kryoSupplier0);
        org.junit.Assert.assertNotNull(kryoSupplier0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository1 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository(pugConnectionSupplier0);
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository2 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository1);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric6 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = doubleMetric6.getTags();
        java.lang.String str8 = doubleMetric6.getId();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = doubleMetric6.getTags();
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric10 = new com.inspiring.pugtsdb.metric.DoubleMetric("Aggregation{name='sum'}", strMap9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = metricH2Repository2.notExistsMetric((com.inspiring.pugtsdb.metric.Metric<java.lang.Double>) doubleMetric10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-000871510803" + "'", str8, "-000871510803");
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastWeeks((long) (short) 1);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.from(0L);
        com.inspiring.pugtsdb.time.Interval interval5 = builder1.fromSecondsAgo((long) (-383449968));
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.time.Interval interval7 = builder1.fromMonthsAgo(4636737291354636288L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Exceeds capacity of Duration: 12193441344990689359822848000000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(interval5);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool0 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        boolean boolean1 = scheduledThreadPool0.isTerminated();
        boolean boolean2 = scheduledThreadPool0.isShutdown();
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scheduledThreadPool0.execute(runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.repository.Repository> repositoryMetric0 = null;
        com.inspiring.pugtsdb.bean.Point<com.inspiring.pugtsdb.repository.Repository> repositoryPoint1 = null;
        com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.repository.Repository> repositoryMetricPoint2 = new com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.repository.Repository>(repositoryMetric0, repositoryPoint1);
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.repository.Repository> repositoryMetric3 = repositoryMetricPoint2.getMetric();
        com.inspiring.pugtsdb.bean.Point<com.inspiring.pugtsdb.repository.Repository> repositoryPoint4 = repositoryMetricPoint2.getPoint();
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.repository.Repository> repositoryMetric5 = repositoryMetricPoint2.getMetric();
        org.junit.Assert.assertNull(repositoryMetric3);
        org.junit.Assert.assertNull(repositoryPoint4);
        org.junit.Assert.assertNull(repositoryMetric5);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric3 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = doubleMetric3.getTags();
        java.lang.String str5 = doubleMetric3.getId();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = doubleMetric3.getTags();
        com.inspiring.pugtsdb.metric.BooleanMetric booleanMetric7 = new com.inspiring.pugtsdb.metric.BooleanMetric("Aggregation{name='and'}", strMap6);
        java.lang.String str8 = booleanMetric7.getId();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-000871510803" + "'", str5, "-000871510803");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-001077942221" + "'", str8, "-001077942221");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection1 = rocksRepository0.getConnection();
        java.sql.Clob clob2 = pugConnection1.createClob();
        boolean boolean3 = pugConnection1.getAutoCommit();
        org.junit.Assert.assertNotNull(pugConnection1);
        org.junit.Assert.assertNull(clob2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.inspiring.pugtsdb.time.Granularity granularity1 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit2 = granularity1.getUnit();
        com.inspiring.pugtsdb.time.Interval.Builder builder3 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (short) 100, chronoUnit2);
        com.inspiring.pugtsdb.time.Interval interval5 = builder3.fromWeeksAgo((long) (byte) -1);
        long long6 = interval5.getFromTime();
        org.junit.Assert.assertTrue("'" + granularity1 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity1.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit2 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit2.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(interval5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1456622520358L) + "'", long6 == (-1456622520358L));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection1 = rocksRepository0.getConnection();
        java.lang.String str3 = pugConnection1.nativeSQL("MetricPoints{metric=null, points={Aggregation{name='sum'}={8=1}}}");
        java.sql.ShardingKey shardingKey4 = null;
        // The following exception was thrown during execution in test generation
        try {
            pugConnection1.setShardingKey(shardingKey4);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLFeatureNotSupportedException; message: setShardingKey not implemented");
        } catch (java.sql.SQLFeatureNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pugConnection1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric2 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints3 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric2);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit5 = granularity4.getUnit();
        pointH2Repository1.upsertMetricPoints(constantDescMetricPoints3, granularity4);
        // The following exception was thrown during execution in test generation
        try {
            pointH2Repository1.deleteRawPointsByNameBeforeTime("Aggregation{name='sum'}", 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.inspiring.pugtsdb.time.Interval interval2 = new com.inspiring.pugtsdb.time.Interval((long) (byte) 100, 10L);
        long long3 = interval2.getUntilTime();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool0 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        boolean boolean1 = scheduledThreadPool0.isShutdown();
        boolean boolean2 = scheduledThreadPool0.isShutdown();
        boolean boolean3 = scheduledThreadPool0.isTerminated();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.inspiring.pugtsdb.exception.PugNotImplementedException pugNotImplementedException1 = new com.inspiring.pugtsdb.exception.PugNotImplementedException("Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}");
        java.lang.Throwable throwable5 = null;
        com.inspiring.pugtsdb.exception.PugException pugException6 = new com.inspiring.pugtsdb.exception.PugException("", throwable5);
        com.inspiring.pugtsdb.sql.PugSQLException pugSQLException7 = new com.inspiring.pugtsdb.sql.PugSQLException("-000871510803", throwable5);
        com.inspiring.pugtsdb.exception.PugException pugException8 = new com.inspiring.pugtsdb.exception.PugException("min", (java.lang.Throwable) pugSQLException7);
        java.lang.Throwable[] throwableArray9 = pugException8.getSuppressed();
        pugNotImplementedException1.addSuppressed((java.lang.Throwable) pugException8);
        java.lang.Throwable[] throwableArray11 = pugException8.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric2 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints3 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric2);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit5 = granularity4.getUnit();
        pointH2Repository1.upsertMetricPoints(constantDescMetricPoints3, granularity4);
        com.inspiring.pugtsdb.time.Interval.Builder builder7 = com.inspiring.pugtsdb.time.Interval.ofLast(granularity4);
        com.inspiring.pugtsdb.time.Interval interval9 = builder7.fromMinutesAgo((long) 13);
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(interval9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection1 = rocksRepository0.getConnection();
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool2 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        boolean boolean3 = scheduledThreadPool2.isShutdown();
        pugConnection1.setNetworkTimeout((java.util.concurrent.Executor) scheduledThreadPool2, (int) (byte) 10);
        java.util.List<java.lang.Runnable> runnableList6 = scheduledThreadPool2.shutdownNow();
        java.lang.Runnable runnable7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        com.inspiring.pugtsdb.time.Granularity granularity14 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit15 = granularity14.getUnit();
        com.inspiring.pugtsdb.time.Interval.Builder builder16 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (short) 100, chronoUnit15);
        long long17 = com.inspiring.pugtsdb.util.Temporals.truncate((-1L), chronoUnit15);
        com.inspiring.pugtsdb.rollup.schedule.ChronoTrigger chronoTrigger18 = new com.inspiring.pugtsdb.rollup.schedule.ChronoTrigger((long) 100, chronoUnit15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture19 = scheduledThreadPool2.scheduleAtFixedRate(runnable7, (long) '#', timeUnit9, (long) (short) -1, chronoUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.TimeUnit.toNanos(long)\" because \"initialDelayUnit\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pugConnection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(runnableList6);
        org.junit.Assert.assertTrue("'" + granularity14 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity14.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit15 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit15.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-31514400000L) + "'", long17 == (-31514400000L));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.inspiring.pugtsdb.repository.rocks.RocksRepositories rocksRepositories0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepositories();
        com.inspiring.pugtsdb.repository.MetricRepository metricRepository1 = rocksRepositories0.getMetricRepository();
        org.junit.Assert.assertNotNull(metricRepository1);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.inspiring.pugtsdb.util.Temporals temporals0 = new com.inspiring.pugtsdb.util.Temporals();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric2 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = doubleMetric2.getTags();
        java.lang.String str4 = doubleMetric2.getId();
        byte[] byteArray6 = doubleMetric2.valueToBytes((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-000871510803" + "'", str4, "-000871510803");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.inspiring.pugtsdb.rollup.aggregation.StringMaxAggregation stringMaxAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.StringMaxAggregation();
        java.lang.String str1 = stringMaxAggregation0.toString();
        java.lang.String[] strArray34 = new java.lang.String[] { "Aggregation{name='min'}", "Interval{fromTime=1697863079242, untilTime=1698467879242}", "\000\000\000\000\000\000\000d", "com.inspiring.pugtsdb.exception.PugException: min", "Interval{fromTime=1697863077108, untilTime=1698467877108}", "Aggregation{name='or'}", "00000000000000000000000001228498187", "min", "Aggregation{name='min'}", "Aggregation{name='or'}", "and", "min", "Aggregation{name='and'}", "Interval{fromTime=-1457230925766, untilTime=-1457227325766}", "Interval{fromTime=-1457230925766, untilTime=-1457227325766}", "Aggregation{name='min'}", "-000871510803", "MetricPoints{metric=null, points={Aggregation{name='sum'}={8=1}}}", "-000871510803", "Aggregation{name='and'}", "Aggregation{name='sum'}", "and", "and", "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}", "avg", "point", "Aggregation{name='or'}", "Aggregation{name='and'}", "Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}", "Metric{id=0001778348576, type='com.inspiring.pugtsdb.metric.LongMetric', name='Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}', tags={}}", "and", "Aggregation{name='min'}" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.lang.String str37 = stringMaxAggregation0.aggregate((java.util.List<java.lang.String>) strList35);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aggregation{name='max'}" + "'", str1, "Aggregation{name='max'}");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "point" + "'", str37, "point");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories0 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository1 = h2Repositories0.getPointRepository();
        com.inspiring.pugtsdb.rollup.schedule.RollUpScheduler rollUpScheduler2 = new com.inspiring.pugtsdb.rollup.schedule.RollUpScheduler((com.inspiring.pugtsdb.repository.Repositories) h2Repositories0);
        com.inspiring.pugtsdb.repository.PointRepository pointRepository3 = h2Repositories0.getPointRepository();
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.DoubleMinAggregation> doubleMinAggregationMetricPoints7 = pointRepository3.selectRawMetricPointsByIdBetweenTimestamp("metric", (long) 1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric metric points between 1 and -1 with statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"value\"                      FROM   metric                               INNER JOIN point                            ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pointRepository1);
        org.junit.Assert.assertNotNull(pointRepository3);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric2 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints3 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric2);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit5 = granularity4.getUnit();
        pointH2Repository1.upsertMetricPoints(constantDescMetricPoints3, granularity4);
        com.inspiring.pugtsdb.time.Granularity granularity9 = com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE;
        com.inspiring.pugtsdb.bean.Tag tag12 = new com.inspiring.pugtsdb.bean.Tag("\000\000\000\000\000\000\000\000", "\000\000\000\000\000\000\000\000");
        com.inspiring.pugtsdb.bean.Tag tag15 = new com.inspiring.pugtsdb.bean.Tag("\000\000\000\000\000\000\000\000", "\000\000\000\000\000\000\000\000");
        com.inspiring.pugtsdb.bean.Tag[] tagArray16 = new com.inspiring.pugtsdb.bean.Tag[] { tag12, tag15 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList17 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList17, tagArray16);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.TagRepository>> tagRepositoryMetricPointsList21 = pointH2Repository1.selectLastMetricsPointsByNameAndAggregationAndTags("", "Metric{id=-001077942221, type='com.inspiring.pugtsdb.metric.BooleanMetric', name='Aggregation{name='and'}', tags={}}", granularity9, strMap19, 2);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric  last 2 points aggregated as Metric{id=-001077942221, type='com.inspiring.pugtsdb.metric.BooleanMetric', name='Aggregation{name='and'}', tags={}} with granularity 1m tags {????????=????????} and statement  SELECT TOP ?                                       metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1m AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"aggregation\" = ?            INNER JOIN metric_tag AS t0              ON     metric.\"id\" = t0.\"metric_id\"  AND    t0.\"tag_name\" = ?               AND    t0.\"tag_value\" = ?              ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\" DESC         ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity9 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE + "'", granularity9.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE));
        org.junit.Assert.assertNotNull(tagArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.inspiring.pugtsdb.time.Granularity granularity5 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit6 = granularity5.getUnit();
        com.inspiring.pugtsdb.time.Interval.Builder builder7 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (short) 100, chronoUnit6);
        long long8 = com.inspiring.pugtsdb.util.Temporals.truncate((-1L), chronoUnit6);
        com.inspiring.pugtsdb.rollup.schedule.ChronoTrigger chronoTrigger9 = new com.inspiring.pugtsdb.rollup.schedule.ChronoTrigger((long) '4', chronoUnit6);
        com.inspiring.pugtsdb.rollup.schedule.ChronoTrigger chronoTrigger10 = new com.inspiring.pugtsdb.rollup.schedule.ChronoTrigger((-1747946240102026939L), chronoUnit6);
        com.inspiring.pugtsdb.time.Interval.Builder builder11 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (short) 100, chronoUnit6);
        org.junit.Assert.assertTrue("'" + granularity5 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity5.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit6 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit6.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-31514400000L) + "'", long8 == (-31514400000L));
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastHours(1L);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromYearsAgo((long) (byte) 100);
        com.inspiring.pugtsdb.time.Interval interval5 = builder1.fromWeeksAgo(0L);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(interval5);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.inspiring.pugtsdb.bean.Tag tag3 = new com.inspiring.pugtsdb.bean.Tag("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", "Aggregation{name='sum'}");
        com.inspiring.pugtsdb.bean.Tag[] tagArray4 = new com.inspiring.pugtsdb.bean.Tag[] { tag3 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList5 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList5, tagArray4);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList5);
        com.inspiring.pugtsdb.metric.BooleanMetric booleanMetric8 = new com.inspiring.pugtsdb.metric.BooleanMetric("and", strMap7);
        boolean boolean9 = com.inspiring.pugtsdb.util.Collections.isNotEmpty(strMap7);
        org.junit.Assert.assertNotNull(tagArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.inspiring.pugtsdb.bean.Tag tag2 = new com.inspiring.pugtsdb.bean.Tag("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", "Aggregation{name='sum'}");
        java.lang.String str3 = tag2.getValue();
        java.lang.String str4 = tag2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aggregation{name='sum'}" + "'", str3, "Aggregation{name='sum'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tag{name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', value='Aggregation{name='sum'}'}" + "'", str4, "Tag{name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', value='Aggregation{name='sum'}'}");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.TagRepository tagRepository1 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository2 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, tagRepository1);
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories3 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository4 = h2Repositories3.getPointRepository();
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric5 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints6 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric5);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository7 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository8 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository7);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric9 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints10 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric9);
        com.inspiring.pugtsdb.time.Granularity granularity11 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit12 = granularity11.getUnit();
        pointH2Repository8.upsertMetricPoints(constantDescMetricPoints10, granularity11);
        pointRepository4.upsertMetricPoints(constantDescMetricPoints6, granularity11);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository15 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository16 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository15);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric17 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints18 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric17);
        com.inspiring.pugtsdb.time.Granularity granularity19 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit20 = granularity19.getUnit();
        pointH2Repository16.upsertMetricPoints(constantDescMetricPoints18, granularity19);
        java.lang.String str22 = granularity19.toString();
        pointH2Repository2.upsertMetricPoints(constantDescMetricPoints6, granularity19);
        com.inspiring.pugtsdb.time.Granularity granularity28 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit29 = granularity28.getUnit();
        com.inspiring.pugtsdb.time.Granularity granularity30 = com.inspiring.pugtsdb.time.Granularity.ONE_HOUR;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>> h2RepositoriesMetricPointsList31 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repositories> h2RepositoriesRollUpEvent32 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repositories>("", "hi!", granularity28, granularity30, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>) h2RepositoriesMetricPointsList31);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>>> wildcardClassMetricPointsList34 = pointH2Repository2.selectLastMetricsPointsByNameAndAggregation("00000000000000000000000001228498187", "Metric{id=-001077942221, type='com.inspiring.pugtsdb.metric.BooleanMetric', name='Aggregation{name='and'}', tags={}}", granularity30, (-1));
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric 00000000000000000000000001228498187 last -1 points aggregated as Metric{id=-001077942221, type='com.inspiring.pugtsdb.metric.BooleanMetric', name='Aggregation{name='and'}', tags={}} with granularity 1h and statement  SELECT TOP ?                                       metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1h AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"aggregation\" = ?            ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\" DESC         ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pointRepository4);
        org.junit.Assert.assertTrue("'" + granularity11 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity11.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit12 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit12.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity19 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity19.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit20 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit20.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1y" + "'", str22, "1y");
        org.junit.Assert.assertTrue("'" + granularity28 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity28.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit29 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit29.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity30 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_HOUR + "'", granularity30.equals(com.inspiring.pugtsdb.time.Granularity.ONE_HOUR));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories0 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository1 = h2Repositories0.getPointRepository();
        com.inspiring.pugtsdb.rollup.schedule.RollUpScheduler rollUpScheduler2 = new com.inspiring.pugtsdb.rollup.schedule.RollUpScheduler((com.inspiring.pugtsdb.repository.Repositories) h2Repositories0);
        rollUpScheduler2.close();
        rollUpScheduler2.close();
        com.inspiring.pugtsdb.rollup.aggregation.BooleanOrAggregation booleanOrAggregation6 = new com.inspiring.pugtsdb.rollup.aggregation.BooleanOrAggregation();
        java.lang.Boolean[] booleanArray9 = new java.lang.Boolean[] { true, false };
        java.util.ArrayList<java.lang.Boolean> booleanList10 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList10, booleanArray9);
        java.lang.Boolean boolean12 = booleanOrAggregation6.aggregate((java.util.List<java.lang.Boolean>) booleanList10);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository13 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository14 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository13);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric15 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints16 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric15);
        com.inspiring.pugtsdb.time.Granularity granularity17 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit18 = granularity17.getUnit();
        pointH2Repository14.upsertMetricPoints(constantDescMetricPoints16, granularity17);
        com.inspiring.pugtsdb.time.Interval.Builder builder20 = com.inspiring.pugtsdb.time.Interval.ofLast(granularity17);
        com.inspiring.pugtsdb.time.Granularity granularity21 = com.inspiring.pugtsdb.time.Granularity.ONE_HOUR;
        com.inspiring.pugtsdb.time.Granularity granularity22 = com.inspiring.pugtsdb.time.Granularity.ONE_HOUR;
        com.inspiring.pugtsdb.time.Granularity granularity25 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit26 = granularity25.getUnit();
        com.inspiring.pugtsdb.time.Granularity granularity27 = com.inspiring.pugtsdb.time.Granularity.ONE_HOUR;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>> h2RepositoriesMetricPointsList28 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repositories> h2RepositoriesRollUpEvent29 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repositories>("", "hi!", granularity25, granularity27, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>) h2RepositoriesMetricPointsList28);
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>> h2RepositoriesMetricPointsList30 = h2RepositoriesRollUpEvent29.getMetricsPoints();
        com.inspiring.pugtsdb.time.Granularity granularity31 = h2RepositoriesRollUpEvent29.getSourceGranularity();
        com.inspiring.pugtsdb.time.Granularity granularity32 = h2RepositoriesRollUpEvent29.getSourceGranularity();
        com.inspiring.pugtsdb.repository.TagRepository tagRepository33 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository34 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository33);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric35 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints36 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric35);
        com.inspiring.pugtsdb.time.Granularity granularity37 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit38 = granularity37.getUnit();
        pointH2Repository34.upsertMetricPoints(constantDescMetricPoints36, granularity37);
        com.inspiring.pugtsdb.time.Granularity[] granularityArray40 = new com.inspiring.pugtsdb.time.Granularity[] { granularity17, granularity21, granularity22, granularity32, granularity37 };
        // The following exception was thrown during execution in test generation
        try {
            rollUpScheduler2.registerRollUps("Aggregation{name='max'}", (com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Boolean>) booleanOrAggregation6, granularityArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pointRepository1);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertTrue("'" + granularity17 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity17.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit18 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit18.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + granularity21 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_HOUR + "'", granularity21.equals(com.inspiring.pugtsdb.time.Granularity.ONE_HOUR));
        org.junit.Assert.assertTrue("'" + granularity22 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_HOUR + "'", granularity22.equals(com.inspiring.pugtsdb.time.Granularity.ONE_HOUR));
        org.junit.Assert.assertTrue("'" + granularity25 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity25.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit26 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit26.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity27 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_HOUR + "'", granularity27.equals(com.inspiring.pugtsdb.time.Granularity.ONE_HOUR));
        org.junit.Assert.assertNotNull(h2RepositoriesMetricPointsList30);
        org.junit.Assert.assertTrue("'" + granularity31 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity31.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity32 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity32.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity37 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity37.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit38 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit38.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(granularityArray40);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository1 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository(pugConnectionSupplier0);
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository2 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository1);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric5 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap4);
        java.lang.String str6 = doubleMetric5.toString();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = doubleMetric5.getTags();
        // The following exception was thrown during execution in test generation
        try {
            metricH2Repository2.insertMetric((com.inspiring.pugtsdb.metric.Metric<java.lang.Double>) doubleMetric5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}" + "'", str6, "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}");
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean7 = com.inspiring.pugtsdb.util.Bytes.toBoolean(byteArray6);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.exception.PugConversionException; message: Cannot convert bytes [100, 1, 0, 100, 1, 1] to Boolean: Expected a length of 1, got 6");
        } catch (com.inspiring.pugtsdb.exception.PugConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 0, 100, 1, 1]");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.inspiring.pugtsdb.time.Retention retention3 = null;
        com.inspiring.pugtsdb.time.Granularity granularity7 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit8 = granularity7.getUnit();
        com.inspiring.pugtsdb.time.Interval.Builder builder9 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (short) 100, chronoUnit8);
        long long10 = com.inspiring.pugtsdb.util.Temporals.truncate((-1L), chronoUnit8);
        com.inspiring.pugtsdb.time.Retention retention11 = new com.inspiring.pugtsdb.time.Retention((-1457230920579L), chronoUnit8);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.PugTSDBOverH2 pugTSDBOverH2_12 = new com.inspiring.pugtsdb.PugTSDBOverH2("avg", "Tag{name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', value='Aggregation{name='sum'}'}", "min", retention3, retention11);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot create database");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity7 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity7.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit8 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit8.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-31514400000L) + "'", long10 == (-31514400000L));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository1 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository(pugConnectionSupplier0);
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository2 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap4 = tagH2Repository1.selectTagsByMetricId("and");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.inspiring.pugtsdb.time.Granularity granularity2 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit3 = granularity2.getUnit();
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_HOUR;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>> h2RepositoriesMetricPointsList5 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repositories> h2RepositoriesRollUpEvent6 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repositories>("", "hi!", granularity2, granularity4, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>) h2RepositoriesMetricPointsList5);
        boolean boolean7 = com.inspiring.pugtsdb.util.Collections.isNotEmpty((java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>) h2RepositoriesMetricPointsList5);
        org.junit.Assert.assertTrue("'" + granularity2 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity2.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit3 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit3.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_HOUR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_HOUR));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        com.inspiring.pugtsdb.bean.Tag tag2 = new com.inspiring.pugtsdb.bean.Tag("\000\000\000\000\000\000\000\000", "\000\000\000\000\000\000\000\000");
        java.lang.String str3 = tag2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\000\000\000\000\000\000\000" + "'", str3, "\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        boolean boolean1 = com.inspiring.pugtsdb.util.Strings.isNotBlank((java.lang.CharSequence) "Metric{id=-001077942221, type='com.inspiring.pugtsdb.metric.BooleanMetric', name='Aggregation{name='and'}', tags={}}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.TagRepository tagRepository1 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository2 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, tagRepository1);
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier4 = null;
        com.inspiring.pugtsdb.repository.TagRepository tagRepository5 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository6 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier4, tagRepository5);
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories7 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository8 = h2Repositories7.getPointRepository();
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric9 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints10 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric9);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository11 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository12 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository11);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric13 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints14 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric13);
        com.inspiring.pugtsdb.time.Granularity granularity15 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit16 = granularity15.getUnit();
        pointH2Repository12.upsertMetricPoints(constantDescMetricPoints14, granularity15);
        pointRepository8.upsertMetricPoints(constantDescMetricPoints10, granularity15);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository19 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository20 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository19);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric21 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints22 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric21);
        com.inspiring.pugtsdb.time.Granularity granularity23 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit24 = granularity23.getUnit();
        pointH2Repository20.upsertMetricPoints(constantDescMetricPoints22, granularity23);
        java.lang.String str26 = granularity23.toString();
        pointH2Repository6.upsertMetricPoints(constantDescMetricPoints10, granularity23);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<byte[]> byteArrayMetricPoints29 = pointH2Repository2.selectLastMetricPointsById("-001077942221", granularity23, 1);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric -001077942221 last points with granularity 1 and statement 1y");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pointRepository8);
        org.junit.Assert.assertTrue("'" + granularity15 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity15.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit16 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit16.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity23 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity23.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit24 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit24.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1y" + "'", str26, "1y");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric2 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints3 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric2);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit5 = granularity4.getUnit();
        pointH2Repository1.upsertMetricPoints(constantDescMetricPoints3, granularity4);
        java.lang.String str7 = granularity4.toString();
        com.inspiring.pugtsdb.time.Interval.Builder builder8 = com.inspiring.pugtsdb.time.Interval.ofLast(granularity4);
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1y" + "'", str7, "1y");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection1 = rocksRepository0.getConnection();
        java.sql.PreparedStatement preparedStatement3 = pugConnection1.prepareStatement("Aggregation{name='and'}");
        java.sql.SQLWarning sQLWarning4 = pugConnection1.getWarnings();
        java.sql.CallableStatement callableStatement6 = pugConnection1.prepareCall("Aggregation{name='or'}");
        java.sql.SQLWarning sQLWarning7 = pugConnection1.getWarnings();
        java.sql.CallableStatement callableStatement11 = pugConnection1.prepareCall("Metric{id=-001077942221, type='com.inspiring.pugtsdb.metric.BooleanMetric', name='Aggregation{name='and'}', tags={}}", 614249093, 1228498187);
        pugConnection1.rollback();
        org.junit.Assert.assertNotNull(pugConnection1);
        org.junit.Assert.assertNull(preparedStatement3);
        org.junit.Assert.assertNull(sQLWarning4);
        org.junit.Assert.assertNull(callableStatement6);
        org.junit.Assert.assertNull(sQLWarning7);
        org.junit.Assert.assertNull(callableStatement11);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection1 = rocksRepository0.getConnection();
        java.sql.PreparedStatement preparedStatement3 = pugConnection1.prepareStatement("Aggregation{name='and'}");
        java.sql.Statement statement4 = pugConnection1.createStatement();
        java.lang.String[] strArray12 = new java.lang.String[] { "MetricPoints{metric=null, points={Aggregation{name='sum'}={8=1}}}", "com.inspiring.pugtsdb.exception.PugException: min", "com.inspiring.pugtsdb.exception.PugException: min", "and", "Aggregation{name='min'}", "1y" };
        java.sql.PreparedStatement preparedStatement13 = pugConnection1.prepareStatement("00000000000000000000000001228498187", strArray12);
        int int14 = pugConnection1.getHoldability();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection15 = new com.inspiring.pugtsdb.sql.PugConnection((java.sql.Connection) pugConnection1);
        java.sql.Statement statement16 = pugConnection15.createStatement();
        org.junit.Assert.assertNotNull(pugConnection1);
        org.junit.Assert.assertNull(preparedStatement3);
        org.junit.Assert.assertNull(statement4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNull(preparedStatement13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(statement16);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric2 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints3 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric2);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit5 = granularity4.getUnit();
        pointH2Repository1.upsertMetricPoints(constantDescMetricPoints3, granularity4);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<java.lang.invoke.TypeDescriptor> typeDescriptorMetricPoints10 = pointH2Repository1.selectRawMetricPointsByIdBetweenTimestamp("Aggregation{name='or'}", 4636737291354636288L, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric Aggregation{name='or'} points between 4636737291354636288 and 100 with statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"value\"                      FROM   metric                               INNER JOIN point                            ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastWeeks((long) (short) 1);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromSecondsAgo(1L);
        com.inspiring.pugtsdb.time.Interval interval5 = builder1.fromSecondsAgo((-1L));
        com.inspiring.pugtsdb.time.Interval interval7 = builder1.fromWeeksAgo((long) (short) 100);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(interval7);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.repository.rocks.bean.PointId pointId2 = com.inspiring.pugtsdb.repository.rocks.bean.PointId.of("Aggregation{name='min'}", "and");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"and\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository1 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(tagRepository0);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric5 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = doubleMetric5.getTags();
        java.lang.String str7 = doubleMetric5.getId();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = doubleMetric5.getTags();
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric9 = new com.inspiring.pugtsdb.metric.DoubleMetric("Aggregation{name='sum'}", strMap8);
        // The following exception was thrown during execution in test generation
        try {
            metricH2Repository1.insertMetric((com.inspiring.pugtsdb.metric.Metric<java.lang.Double>) doubleMetric9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-000871510803" + "'", str7, "-000871510803");
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.repository.rocks.bean.PointId pointId1 = com.inspiring.pugtsdb.repository.rocks.bean.PointId.from("Metric{id=-001077942221, type='com.inspiring.pugtsdb.metric.BooleanMetric', name='Aggregation{name='and'}', tags={}}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1077942221, type='com.inspiring.pugtsdb.metric.BooleanMetric', name='Aggregation{name='and'}', tags={}}\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool0 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        boolean boolean1 = scheduledThreadPool0.isShutdown();
        java.lang.Runnable runnable2 = null;
        java.lang.Throwable throwable5 = null;
        com.inspiring.pugtsdb.exception.PugException pugException6 = new com.inspiring.pugtsdb.exception.PugException("", throwable5);
        com.inspiring.pugtsdb.sql.PugSQLException pugSQLException7 = new com.inspiring.pugtsdb.sql.PugSQLException("-000871510803", throwable5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<com.inspiring.pugtsdb.sql.PugSQLException> pugSQLExceptionFuture8 = scheduledThreadPool0.submit(runnable2, pugSQLException7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.inspiring.pugtsdb.util.GlobPattern globPattern0 = new com.inspiring.pugtsdb.util.GlobPattern();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection1 = rocksRepository0.getConnection();
        java.sql.PreparedStatement preparedStatement3 = pugConnection1.prepareStatement("Aggregation{name='and'}");
        java.sql.SQLWarning sQLWarning4 = pugConnection1.getWarnings();
        java.sql.CallableStatement callableStatement6 = pugConnection1.prepareCall("Aggregation{name='or'}");
        java.sql.SQLWarning sQLWarning7 = pugConnection1.getWarnings();
        java.sql.CallableStatement callableStatement11 = pugConnection1.prepareCall("Metric{id=-001077942221, type='com.inspiring.pugtsdb.metric.BooleanMetric', name='Aggregation{name='and'}', tags={}}", 614249093, 1228498187);
        pugConnection1.setSchema("or");
        org.junit.Assert.assertNotNull(pugConnection1);
        org.junit.Assert.assertNull(preparedStatement3);
        org.junit.Assert.assertNull(sQLWarning4);
        org.junit.Assert.assertNull(callableStatement6);
        org.junit.Assert.assertNull(sQLWarning7);
        org.junit.Assert.assertNull(callableStatement11);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric0 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints1 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric0);
        constantDescMetricPoints1.put("Aggregation{name='sum'}", (long) 8, (java.lang.constant.ConstantDesc) 1);
        java.lang.String str6 = constantDescMetricPoints1.toString();
        constantDescMetricPoints1.put("Interval{fromTime=1697863079242, untilTime=1698467879242}", (long) '#', (java.lang.constant.ConstantDesc) "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MetricPoints{metric=null, points={Aggregation{name='sum'}={8=1}}}" + "'", str6, "MetricPoints{metric=null, points={Aggregation{name='sum'}={8=1}}}");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.inspiring.pugtsdb.exception.PugNotImplementedException pugNotImplementedException1 = new com.inspiring.pugtsdb.exception.PugNotImplementedException("Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}");
        java.lang.Throwable throwable5 = null;
        com.inspiring.pugtsdb.exception.PugException pugException6 = new com.inspiring.pugtsdb.exception.PugException("", throwable5);
        com.inspiring.pugtsdb.sql.PugSQLException pugSQLException7 = new com.inspiring.pugtsdb.sql.PugSQLException("-000871510803", throwable5);
        com.inspiring.pugtsdb.exception.PugException pugException8 = new com.inspiring.pugtsdb.exception.PugException("min", (java.lang.Throwable) pugSQLException7);
        java.lang.Throwable[] throwableArray9 = pugException8.getSuppressed();
        pugNotImplementedException1.addSuppressed((java.lang.Throwable) pugException8);
        java.lang.String str11 = pugNotImplementedException1.toString();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.inspiring.pugtsdb.exception.PugNotImplementedException: Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}" + "'", str11, "com.inspiring.pugtsdb.exception.PugNotImplementedException: Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        com.inspiring.pugtsdb.time.Granularity granularity3 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit4 = granularity3.getUnit();
        com.inspiring.pugtsdb.time.Interval.Builder builder5 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (short) 100, chronoUnit4);
        long long6 = com.inspiring.pugtsdb.util.Temporals.truncate((-1L), chronoUnit4);
        com.inspiring.pugtsdb.time.Retention retention7 = new com.inspiring.pugtsdb.time.Retention((long) 1, chronoUnit4);
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList8 = retention7.getUnits();
        org.junit.Assert.assertTrue("'" + granularity3 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity3.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit4 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit4.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-31514400000L) + "'", long6 == (-31514400000L));
        org.junit.Assert.assertNotNull(temporalUnitList8);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories0 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository1 = h2Repositories0.getPointRepository();
        com.inspiring.pugtsdb.rollup.schedule.RollUpScheduler rollUpScheduler2 = new com.inspiring.pugtsdb.rollup.schedule.RollUpScheduler((com.inspiring.pugtsdb.repository.Repositories) h2Repositories0);
        com.inspiring.pugtsdb.repository.PointRepository pointRepository3 = h2Repositories0.getPointRepository();
        com.inspiring.pugtsdb.time.Granularity granularity8 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit9 = granularity8.getUnit();
        com.inspiring.pugtsdb.time.Granularity granularity10 = com.inspiring.pugtsdb.time.Granularity.ONE_HOUR;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>> h2RepositoriesMetricPointsList11 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repositories> h2RepositoriesRollUpEvent12 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repositories>("", "hi!", granularity8, granularity10, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>) h2RepositoriesMetricPointsList11);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<java.lang.AutoCloseable> autoCloseableMetricPoints15 = pointRepository3.selectMetricPointsByIdAndAggregationBetweenTimestamp("", "Interval{fromTime=-1457230920579, untilTime=-1457227320579}", granularity10, (long) ' ', (-1747946240102026939L));
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric  points aggregated as Interval{fromTime=-1457230920579, untilTime=-1457227320579} between 32 and -1747946240102026939 with granularity 1h and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1h AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"aggregation\" = ?            AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pointRepository1);
        org.junit.Assert.assertNotNull(pointRepository3);
        org.junit.Assert.assertTrue("'" + granularity8 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity8.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit9 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit9.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity10 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_HOUR + "'", granularity10.equals(com.inspiring.pugtsdb.time.Granularity.ONE_HOUR));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        com.inspiring.pugtsdb.time.Granularity granularity0 = com.inspiring.pugtsdb.time.Granularity.ONE_DAY;
        org.junit.Assert.assertTrue("'" + granularity0 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_DAY + "'", granularity0.equals(com.inspiring.pugtsdb.time.Granularity.ONE_DAY));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.TagRepository tagRepository1 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository2 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, tagRepository1);
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories3 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository4 = h2Repositories3.getPointRepository();
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric5 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints6 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric5);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository7 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository8 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository7);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric9 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints10 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric9);
        com.inspiring.pugtsdb.time.Granularity granularity11 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit12 = granularity11.getUnit();
        pointH2Repository8.upsertMetricPoints(constantDescMetricPoints10, granularity11);
        pointRepository4.upsertMetricPoints(constantDescMetricPoints6, granularity11);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository15 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository16 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository15);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric17 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints18 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric17);
        com.inspiring.pugtsdb.time.Granularity granularity19 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit20 = granularity19.getUnit();
        pointH2Repository16.upsertMetricPoints(constantDescMetricPoints18, granularity19);
        java.lang.String str22 = granularity19.toString();
        pointH2Repository2.upsertMetricPoints(constantDescMetricPoints6, granularity19);
        constantDescMetricPoints6.put("-001077942221", (long) (byte) 10, (java.lang.constant.ConstantDesc) 10);
        org.junit.Assert.assertNotNull(pointRepository4);
        org.junit.Assert.assertTrue("'" + granularity11 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity11.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit12 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit12.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity19 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity19.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit20 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit20.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1y" + "'", str22, "1y");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        com.inspiring.pugtsdb.time.Granularity granularity2 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit3 = granularity2.getUnit();
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_HOUR;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>> h2RepositoriesMetricPointsList5 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repositories> h2RepositoriesRollUpEvent6 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repositories>("", "hi!", granularity2, granularity4, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>) h2RepositoriesMetricPointsList5);
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>> h2RepositoriesMetricPointsList7 = h2RepositoriesRollUpEvent6.getMetricsPoints();
        java.lang.String str8 = h2RepositoriesRollUpEvent6.getMetricName();
        java.lang.String str9 = h2RepositoriesRollUpEvent6.getAggregationName();
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>> h2RepositoriesMetricPointsList10 = h2RepositoriesRollUpEvent6.getMetricsPoints();
        org.junit.Assert.assertTrue("'" + granularity2 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity2.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit3 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit3.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_HOUR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_HOUR));
        org.junit.Assert.assertNotNull(h2RepositoriesMetricPointsList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(h2RepositoriesMetricPointsList10);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        com.inspiring.pugtsdb.repository.TagRepository tagRepository0 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository1 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository0);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric2 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints3 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric2);
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit5 = granularity4.getUnit();
        pointH2Repository1.upsertMetricPoints(constantDescMetricPoints3, granularity4);
        com.inspiring.pugtsdb.time.Granularity granularity9 = com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE;
        com.inspiring.pugtsdb.time.Interval.Builder builder10 = com.inspiring.pugtsdb.time.Interval.ofLast(granularity9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.schedule.ChronoTrigger>> chronoTriggerMetricPointsList13 = pointH2Repository1.selectMetricsPointsByNameAndAggregationBetweenTimestamp("point", "Aggregation{name='max'}", granularity9, (long) 8, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric point points aggregated as Aggregation{name='max'} between 8 and 10 with granularity 1m and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1m AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"aggregation\" = ?            AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\"              ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity9 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE + "'", granularity9.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE));
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection1 = rocksRepository0.getConnection();
        java.sql.Clob clob2 = pugConnection1.createClob();
        java.lang.String str4 = pugConnection1.nativeSQL("Interval{fromTime=-1457230920579, untilTime=-1457227320579}");
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool5 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        boolean boolean6 = scheduledThreadPool5.isShutdown();
        boolean boolean7 = scheduledThreadPool5.isShutdown();
        pugConnection1.abort((java.util.concurrent.Executor) scheduledThreadPool5);
        org.junit.Assert.assertNotNull(pugConnection1);
        org.junit.Assert.assertNull(clob2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        boolean boolean2 = dummySqlConnection0.isValid((-383449968));
        java.sql.Statement statement6 = dummySqlConnection0.createStatement(8, (int) '4', 614249093);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(statement6);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        com.inspiring.pugtsdb.bean.Tag tag1 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        org.junit.Assert.assertNotNull(tag1);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        com.inspiring.pugtsdb.time.Granularity granularity2 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit3 = granularity2.getUnit();
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_HOUR;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>> h2RepositoriesMetricPointsList5 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repositories> h2RepositoriesRollUpEvent6 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repositories>("", "hi!", granularity2, granularity4, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>) h2RepositoriesMetricPointsList5);
        com.inspiring.pugtsdb.time.Interval.Builder builder7 = com.inspiring.pugtsdb.time.Interval.ofLast(granularity2);
        org.junit.Assert.assertTrue("'" + granularity2 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity2.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit3 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit3.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_HOUR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_HOUR));
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        com.inspiring.pugtsdb.repository.rocks.RocksRepositories rocksRepositories0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepositories();
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit5 = granularity4.getUnit();
        com.inspiring.pugtsdb.time.Interval.Builder builder6 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (short) 100, chronoUnit5);
        long long7 = com.inspiring.pugtsdb.util.Temporals.truncate((-1L), chronoUnit5);
        com.inspiring.pugtsdb.time.Retention retention8 = new com.inspiring.pugtsdb.time.Retention((long) 1, chronoUnit5);
        com.inspiring.pugtsdb.time.Granularity granularity12 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit13 = granularity12.getUnit();
        com.inspiring.pugtsdb.time.Interval.Builder builder14 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (short) 100, chronoUnit13);
        long long15 = com.inspiring.pugtsdb.util.Temporals.truncate((-1L), chronoUnit13);
        com.inspiring.pugtsdb.time.Retention retention16 = new com.inspiring.pugtsdb.time.Retention((long) 1, chronoUnit13);
        com.inspiring.pugtsdb.rollup.schedule.ScheduledRocksPointPurger scheduledRocksPointPurger17 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledRocksPointPurger(rocksRepositories0, retention8, retention16);
        long long18 = retention8.getValue();
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-31514400000L) + "'", long7 == (-31514400000L));
        org.junit.Assert.assertTrue("'" + granularity12 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity12.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit13 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit13.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-31514400000L) + "'", long15 == (-31514400000L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit5 = granularity4.getUnit();
        com.inspiring.pugtsdb.time.Interval.Builder builder6 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (short) 100, chronoUnit5);
        long long7 = com.inspiring.pugtsdb.util.Temporals.truncate((-1L), chronoUnit5);
        com.inspiring.pugtsdb.time.Retention retention8 = new com.inspiring.pugtsdb.time.Retention((-1457230920579L), chronoUnit5);
        com.inspiring.pugtsdb.time.Interval.Builder builder9 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (-1), chronoUnit5);
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-31514400000L) + "'", long7 == (-31514400000L));
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        java.sql.Savepoint savepoint1 = dummySqlConnection0.setSavepoint();
        org.junit.Assert.assertNull(savepoint1);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        com.inspiring.pugtsdb.time.Granularity granularity3 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit4 = granularity3.getUnit();
        com.inspiring.pugtsdb.time.Interval.Builder builder5 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (short) 100, chronoUnit4);
        long long6 = com.inspiring.pugtsdb.util.Temporals.truncate((-1L), chronoUnit4);
        com.inspiring.pugtsdb.time.Retention retention7 = new com.inspiring.pugtsdb.time.Retention((-1457230920579L), chronoUnit4);
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList8 = retention7.getUnits();
        org.junit.Assert.assertTrue("'" + granularity3 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity3.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit4 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit4.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-31514400000L) + "'", long6 == (-31514400000L));
        org.junit.Assert.assertNotNull(temporalUnitList8);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection1 = rocksRepository0.getConnection();
        java.sql.PreparedStatement preparedStatement3 = pugConnection1.prepareStatement("Aggregation{name='and'}");
        java.sql.SQLWarning sQLWarning4 = pugConnection1.getWarnings();
        java.sql.CallableStatement callableStatement6 = pugConnection1.prepareCall("Aggregation{name='or'}");
        java.sql.SQLWarning sQLWarning7 = pugConnection1.getWarnings();
        java.util.Map<java.lang.String, java.lang.Class<?>> strMap8 = pugConnection1.getTypeMap();
        java.sql.CallableStatement callableStatement13 = pugConnection1.prepareCall("", 0, (-383449968), (int) (byte) 10);
        org.junit.Assert.assertNotNull(pugConnection1);
        org.junit.Assert.assertNull(preparedStatement3);
        org.junit.Assert.assertNull(sQLWarning4);
        org.junit.Assert.assertNull(callableStatement6);
        org.junit.Assert.assertNull(sQLWarning7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(callableStatement13);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection1 = rocksRepository0.getConnection();
        java.sql.PreparedStatement preparedStatement3 = pugConnection1.prepareStatement("Aggregation{name='and'}");
        java.sql.SQLWarning sQLWarning4 = pugConnection1.getWarnings();
        java.sql.CallableStatement callableStatement6 = pugConnection1.prepareCall("Aggregation{name='or'}");
        java.sql.SQLWarning sQLWarning7 = pugConnection1.getWarnings();
        java.sql.CallableStatement callableStatement11 = pugConnection1.prepareCall("Metric{id=-001077942221, type='com.inspiring.pugtsdb.metric.BooleanMetric', name='Aggregation{name='and'}', tags={}}", 614249093, 1228498187);
        pugConnection1.setCatalog("min");
        org.junit.Assert.assertNotNull(pugConnection1);
        org.junit.Assert.assertNull(preparedStatement3);
        org.junit.Assert.assertNull(sQLWarning4);
        org.junit.Assert.assertNull(callableStatement6);
        org.junit.Assert.assertNull(sQLWarning7);
        org.junit.Assert.assertNull(callableStatement11);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        com.inspiring.pugtsdb.exception.PugNotImplementedException pugNotImplementedException2 = new com.inspiring.pugtsdb.exception.PugNotImplementedException("hi!");
        java.lang.Throwable throwable6 = null;
        com.inspiring.pugtsdb.exception.PugException pugException7 = new com.inspiring.pugtsdb.exception.PugException("", throwable6);
        com.inspiring.pugtsdb.sql.PugSQLException pugSQLException8 = new com.inspiring.pugtsdb.sql.PugSQLException("-000871510803", throwable6);
        com.inspiring.pugtsdb.exception.PugException pugException9 = new com.inspiring.pugtsdb.exception.PugException("min", (java.lang.Throwable) pugSQLException8);
        java.lang.Throwable[] throwableArray10 = pugException9.getSuppressed();
        pugNotImplementedException2.addSuppressed((java.lang.Throwable) pugException9);
        com.inspiring.pugtsdb.sql.PugSQLException pugSQLException12 = new com.inspiring.pugtsdb.sql.PugSQLException("Aggregation{name='min'}", (java.lang.Throwable) pugException9);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric3 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = doubleMetric3.getTags();
        java.lang.String str5 = doubleMetric3.getId();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = doubleMetric3.getTags();
        com.inspiring.pugtsdb.metric.BooleanMetric booleanMetric7 = new com.inspiring.pugtsdb.metric.BooleanMetric("Aggregation{name='and'}", strMap6);
        java.lang.String str8 = booleanMetric7.toString();
        byte[] byteArray10 = booleanMetric7.valueToBytes((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = booleanMetric7.getTags();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-000871510803" + "'", str5, "-000871510803");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Metric{id=-001077942221, type='com.inspiring.pugtsdb.metric.BooleanMetric', name='Aggregation{name='and'}', tags={}}" + "'", str8, "Metric{id=-001077942221, type='com.inspiring.pugtsdb.metric.BooleanMetric', name='Aggregation{name='and'}', tags={}}");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric3 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = doubleMetric3.getTags();
        java.lang.String str5 = doubleMetric3.getId();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = doubleMetric3.getTags();
        com.inspiring.pugtsdb.metric.LongMetric longMetric7 = new com.inspiring.pugtsdb.metric.LongMetric("min", strMap6);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-000871510803" + "'", str5, "-000871510803");
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.repository.rocks.bean.PointId pointId2 = com.inspiring.pugtsdb.repository.rocks.bean.PointId.of("Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}Interval{fromTime=-1457230925766, untilTime=-1457227325766}", "Interval{fromTime=-1457230925766, untilTime=-1457227325766}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Interval{fromTime=-1457230925766, untilTime=-1457227325766}\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection1 = rocksRepository0.getConnection();
        java.sql.Clob clob2 = pugConnection1.createClob();
        java.lang.String str4 = pugConnection1.nativeSQL("Interval{fromTime=-1457230920579, untilTime=-1457227320579}");
        java.util.Properties properties5 = null;
        pugConnection1.setClientInfo(properties5);
        org.junit.Assert.assertNotNull(pugConnection1);
        org.junit.Assert.assertNull(clob2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric3 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = doubleMetric3.getTags();
        boolean boolean5 = com.inspiring.pugtsdb.util.Collections.isNotEmpty(strMap4);
        com.inspiring.pugtsdb.metric.LongMetric longMetric6 = new com.inspiring.pugtsdb.metric.LongMetric("Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}", strMap4);
        java.lang.String str7 = longMetric6.toString();
        java.lang.String str8 = longMetric6.getId();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Metric{id=0001778348576, type='com.inspiring.pugtsdb.metric.LongMetric', name='Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}', tags={}}" + "'", str7, "Metric{id=0001778348576, type='com.inspiring.pugtsdb.metric.LongMetric', name='Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}', tags={}}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0001778348576" + "'", str8, "0001778348576");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        com.inspiring.pugtsdb.repository.rocks.RocksRepositories rocksRepositories0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepositories();
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit5 = granularity4.getUnit();
        com.inspiring.pugtsdb.time.Interval.Builder builder6 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (short) 100, chronoUnit5);
        long long7 = com.inspiring.pugtsdb.util.Temporals.truncate((-1L), chronoUnit5);
        com.inspiring.pugtsdb.time.Retention retention8 = new com.inspiring.pugtsdb.time.Retention((long) 1, chronoUnit5);
        com.inspiring.pugtsdb.time.Granularity granularity12 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit13 = granularity12.getUnit();
        com.inspiring.pugtsdb.time.Interval.Builder builder14 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (short) 100, chronoUnit13);
        long long15 = com.inspiring.pugtsdb.util.Temporals.truncate((-1L), chronoUnit13);
        com.inspiring.pugtsdb.time.Retention retention16 = new com.inspiring.pugtsdb.time.Retention((long) 1, chronoUnit13);
        com.inspiring.pugtsdb.rollup.schedule.ScheduledRocksPointPurger scheduledRocksPointPurger17 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledRocksPointPurger(rocksRepositories0, retention8, retention16);
        com.inspiring.pugtsdb.repository.MetricRepository metricRepository18 = rocksRepositories0.getMetricRepository();
        com.inspiring.pugtsdb.repository.TagRepository tagRepository19 = rocksRepositories0.getTagRepository();
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-31514400000L) + "'", long7 == (-31514400000L));
        org.junit.Assert.assertTrue("'" + granularity12 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity12.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit13 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit13.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-31514400000L) + "'", long15 == (-31514400000L));
        org.junit.Assert.assertNotNull(metricRepository18);
        org.junit.Assert.assertNull(tagRepository19);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        com.inspiring.pugtsdb.util.MurmurHash3.LongPair longPair0 = new com.inspiring.pugtsdb.util.MurmurHash3.LongPair();
        long long1 = longPair0.val2;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        byte[] byteArray1 = com.inspiring.pugtsdb.util.Bytes.fromDouble((java.lang.Double) 200.0d);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[64, 105, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.TagRepository tagRepository1 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository2 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, tagRepository1);
        com.inspiring.pugtsdb.time.Granularity granularity5 = null;
        com.inspiring.pugtsdb.bean.Tag tag8 = new com.inspiring.pugtsdb.bean.Tag("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", "Aggregation{name='sum'}");
        com.inspiring.pugtsdb.bean.Tag[] tagArray9 = new com.inspiring.pugtsdb.bean.Tag[] { tag8 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList10 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList10, tagArray9);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.metric.LongMetric>> longMetricMetricPointsList14 = pointH2Repository2.selectLastMetricsPointsByNameAndAggregationAndTags("0001778348576", "max", granularity5, strMap12, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric 0001778348576 last 10 points aggregated as max with granularity null tags {Interval{fromTime=-1457230925766, untilTime=-1457227325766}=Aggregation{name='sum'}} and statement  SELECT TOP ?                                       metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_null AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"aggregation\" = ?            INNER JOIN metric_tag AS t0              ON     metric.\"id\" = t0.\"metric_id\"  AND    t0.\"tag_name\" = ?               AND    t0.\"tag_value\" = ?              ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\" DESC         ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tagArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        com.inspiring.pugtsdb.rollup.aggregation.StringMinAggregation stringMinAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.StringMinAggregation();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric4 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = doubleMetric4.getTags();
        java.lang.String str6 = doubleMetric4.getId();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = doubleMetric4.getTags();
        com.inspiring.pugtsdb.metric.BooleanMetric booleanMetric8 = new com.inspiring.pugtsdb.metric.BooleanMetric("Aggregation{name='and'}", strMap7);
        java.util.List<java.lang.String> strList9 = com.inspiring.pugtsdb.bean.Tag.fromMapToStringList(strMap7);
        java.lang.String str10 = stringMinAggregation0.aggregate(strList9);
        java.lang.String str11 = stringMinAggregation0.toString();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-000871510803" + "'", str6, "-000871510803");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Aggregation{name='min'}" + "'", str11, "Aggregation{name='min'}");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.until((long) 100);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromMonthsAgo((long) (byte) 100);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        com.inspiring.pugtsdb.time.Interval interval2 = new com.inspiring.pugtsdb.time.Interval((long) (byte) -1, (long) ' ');
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric2 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = doubleMetric2.getTags();
        boolean boolean4 = com.inspiring.pugtsdb.util.Collections.isNotEmpty(strMap3);
        java.util.List<java.lang.String> strList5 = com.inspiring.pugtsdb.bean.Tag.fromMapToStringList(strMap3);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection1 = rocksRepository0.getConnection();
        java.sql.Clob clob2 = pugConnection1.createClob();
        java.lang.String str4 = pugConnection1.nativeSQL("Interval{fromTime=-1457230920579, untilTime=-1457227320579}");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository5 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection6 = rocksRepository5.getConnection();
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool7 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        boolean boolean8 = scheduledThreadPool7.isShutdown();
        pugConnection6.setNetworkTimeout((java.util.concurrent.Executor) scheduledThreadPool7, (int) (byte) 10);
        pugConnection1.abort((java.util.concurrent.Executor) scheduledThreadPool7);
        java.sql.Clob clob12 = pugConnection1.createClob();
        org.junit.Assert.assertNotNull(pugConnection1);
        org.junit.Assert.assertNull(clob2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(pugConnection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(clob12);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool0 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        boolean boolean1 = scheduledThreadPool0.isShutdown();
        com.inspiring.pugtsdb.repository.rocks.RocksRepositories rocksRepositories2 = new com.inspiring.pugtsdb.repository.rocks.RocksRepositories();
        com.inspiring.pugtsdb.time.Granularity granularity6 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit7 = granularity6.getUnit();
        com.inspiring.pugtsdb.time.Interval.Builder builder8 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (short) 100, chronoUnit7);
        long long9 = com.inspiring.pugtsdb.util.Temporals.truncate((-1L), chronoUnit7);
        com.inspiring.pugtsdb.time.Retention retention10 = new com.inspiring.pugtsdb.time.Retention((long) 1, chronoUnit7);
        com.inspiring.pugtsdb.time.Granularity granularity14 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit15 = granularity14.getUnit();
        com.inspiring.pugtsdb.time.Interval.Builder builder16 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (short) 100, chronoUnit15);
        long long17 = com.inspiring.pugtsdb.util.Temporals.truncate((-1L), chronoUnit15);
        com.inspiring.pugtsdb.time.Retention retention18 = new com.inspiring.pugtsdb.time.Retention((long) 1, chronoUnit15);
        com.inspiring.pugtsdb.rollup.schedule.ScheduledRocksPointPurger scheduledRocksPointPurger19 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledRocksPointPurger(rocksRepositories2, retention10, retention18);
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture23 = scheduledThreadPool0.scheduleAtFixedRate((java.lang.Runnable) scheduledRocksPointPurger19, (long) 4, (-1L), timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + granularity6 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity6.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit7 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit7.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-31514400000L) + "'", long9 == (-31514400000L));
        org.junit.Assert.assertTrue("'" + granularity14 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity14.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit15 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit15.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-31514400000L) + "'", long17 == (-31514400000L));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories0 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository1 = h2Repositories0.getPointRepository();
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric2 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints3 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric2);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository4 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository5 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository4);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric6 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints7 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric6);
        com.inspiring.pugtsdb.time.Granularity granularity8 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit9 = granularity8.getUnit();
        pointH2Repository5.upsertMetricPoints(constantDescMetricPoints7, granularity8);
        pointRepository1.upsertMetricPoints(constantDescMetricPoints3, granularity8);
        java.util.Map<java.lang.String, java.util.Map<java.lang.Long, java.lang.constant.ConstantDesc>> strMap12 = constantDescMetricPoints3.getPoints();
        byte[] byteArray16 = com.inspiring.pugtsdb.util.Bytes.fromUtf8String("Tag{name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', value='Aggregation{name='sum'}'}");
        // The following exception was thrown during execution in test generation
        try {
            constantDescMetricPoints3.put("Aggregation{name='sum'}", (long) 0, byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.inspiring.pugtsdb.metric.Metric.valueFromBytes(byte[])\" because \"this.metric\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pointRepository1);
        org.junit.Assert.assertTrue("'" + granularity8 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity8.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit9 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit9.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[84, 97, 103, 123, 110, 97, 109, 101, 61, 39, 73, 110, 116, 101, 114, 118, 97, 108, 123, 102, 114, 111, 109, 84, 105, 109, 101, 61, 45, 49, 52, 53, 55, 50, 51, 48, 57, 50, 53, 55, 54, 54, 44, 32, 117, 110, 116, 105, 108, 84, 105, 109, 101, 61, 45, 49, 52, 53, 55, 50, 50, 55, 51, 50, 53, 55, 54, 54, 125, 39, 44, 32, 118, 97, 108, 117, 101, 61, 39, 65, 103, 103, 114, 101, 103, 97, 116, 105, 111, 110, 123, 110, 97, 109, 101, 61, 39, 115, 117, 109, 39, 125, 39, 125]");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection1 = rocksRepository0.getConnection();
        java.sql.Clob clob2 = pugConnection1.createClob();
        java.lang.String str4 = pugConnection1.nativeSQL("Interval{fromTime=-1457230920579, untilTime=-1457227320579}");
        java.sql.Savepoint savepoint5 = pugConnection1.setSavepoint();
        org.junit.Assert.assertNotNull(pugConnection1);
        org.junit.Assert.assertNull(clob2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(savepoint5);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setSchema("avg");
        boolean boolean3 = dummySqlConnection0.isClosed();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric3 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = doubleMetric3.getTags();
        java.lang.String str5 = doubleMetric3.getId();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = doubleMetric3.getTags();
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric7 = new com.inspiring.pugtsdb.metric.DoubleMetric("Aggregation{name='sum'}", strMap6);
        java.lang.String str8 = doubleMetric7.getId();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-000871510803" + "'", str5, "-000871510803");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0000082216649" + "'", str8, "0000082216649");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection1 = rocksRepository0.getConnection();
        java.sql.PreparedStatement preparedStatement3 = pugConnection1.prepareStatement("Aggregation{name='and'}");
        java.sql.Statement statement4 = pugConnection1.createStatement();
        java.lang.String[] strArray12 = new java.lang.String[] { "MetricPoints{metric=null, points={Aggregation{name='sum'}={8=1}}}", "com.inspiring.pugtsdb.exception.PugException: min", "com.inspiring.pugtsdb.exception.PugException: min", "and", "Aggregation{name='min'}", "1y" };
        java.sql.PreparedStatement preparedStatement13 = pugConnection1.prepareStatement("00000000000000000000000001228498187", strArray12);
        int int14 = pugConnection1.getHoldability();
        pugConnection1.setSchema("");
        org.junit.Assert.assertNotNull(pugConnection1);
        org.junit.Assert.assertNull(preparedStatement3);
        org.junit.Assert.assertNull(statement4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNull(preparedStatement13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection1 = rocksRepository0.getConnection();
        java.sql.Clob clob2 = pugConnection1.createClob();
        java.lang.String str4 = pugConnection1.nativeSQL("Interval{fromTime=-1457230920579, untilTime=-1457227320579}");
        java.sql.ShardingKey shardingKey5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = pugConnection1.setShardingKeyIfValid(shardingKey5, 2);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLFeatureNotSupportedException; message: setShardingKeyIfValid not implemented");
        } catch (java.sql.SQLFeatureNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pugConnection1);
        org.junit.Assert.assertNull(clob2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection1 = rocksRepository0.getConnection();
        java.sql.PreparedStatement preparedStatement3 = pugConnection1.prepareStatement("Aggregation{name='and'}");
        java.sql.SQLWarning sQLWarning4 = pugConnection1.getWarnings();
        pugConnection1.setReadOnly(true);
        boolean boolean7 = pugConnection1.getAutoCommit();
        org.junit.Assert.assertNotNull(pugConnection1);
        org.junit.Assert.assertNull(preparedStatement3);
        org.junit.Assert.assertNull(sQLWarning4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        int int0 = java.sql.Connection.TRANSACTION_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        com.inspiring.pugtsdb.rollup.aggregation.BooleanAndAggregation booleanAndAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.BooleanAndAggregation();
        java.lang.String str1 = booleanAndAggregation0.getName();
        java.lang.String str2 = booleanAndAggregation0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "and" + "'", str1, "and");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aggregation{name='and'}" + "'", str2, "Aggregation{name='and'}");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection1 = rocksRepository0.getConnection();
        java.sql.PreparedStatement preparedStatement3 = pugConnection1.prepareStatement("Aggregation{name='and'}");
        java.sql.Statement statement4 = pugConnection1.createStatement();
        java.lang.String[] strArray12 = new java.lang.String[] { "MetricPoints{metric=null, points={Aggregation{name='sum'}={8=1}}}", "com.inspiring.pugtsdb.exception.PugException: min", "com.inspiring.pugtsdb.exception.PugException: min", "and", "Aggregation{name='min'}", "1y" };
        java.sql.PreparedStatement preparedStatement13 = pugConnection1.prepareStatement("00000000000000000000000001228498187", strArray12);
        int int14 = pugConnection1.getHoldability();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection15 = new com.inspiring.pugtsdb.sql.PugConnection((java.sql.Connection) pugConnection1);
        java.sql.NClob nClob16 = pugConnection15.createNClob();
        java.sql.CallableStatement callableStatement21 = pugConnection15.prepareCall("", (int) '4', 614249093, 0);
        java.util.Properties properties22 = pugConnection15.getClientInfo();
        org.junit.Assert.assertNotNull(pugConnection1);
        org.junit.Assert.assertNull(preparedStatement3);
        org.junit.Assert.assertNull(statement4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNull(preparedStatement13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(nClob16);
        org.junit.Assert.assertNull(callableStatement21);
        org.junit.Assert.assertNull(properties22);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection1 = rocksRepository0.getConnection();
        java.sql.Clob clob2 = pugConnection1.createClob();
        java.lang.String str4 = pugConnection1.nativeSQL("Interval{fromTime=-1457230920579, untilTime=-1457227320579}");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository5 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection6 = rocksRepository5.getConnection();
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool7 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        boolean boolean8 = scheduledThreadPool7.isShutdown();
        pugConnection6.setNetworkTimeout((java.util.concurrent.Executor) scheduledThreadPool7, (int) (byte) 10);
        pugConnection1.abort((java.util.concurrent.Executor) scheduledThreadPool7);
        java.sql.ShardingKey shardingKey12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = pugConnection1.setShardingKeyIfValid(shardingKey12, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.sql.SQLFeatureNotSupportedException; message: setShardingKeyIfValid not implemented");
        } catch (java.sql.SQLFeatureNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pugConnection1);
        org.junit.Assert.assertNull(clob2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(pugConnection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection1 = rocksRepository0.getConnection();
        java.sql.PreparedStatement preparedStatement3 = pugConnection1.prepareStatement("Aggregation{name='and'}");
        java.sql.Statement statement4 = pugConnection1.createStatement();
        java.lang.String[] strArray12 = new java.lang.String[] { "MetricPoints{metric=null, points={Aggregation{name='sum'}={8=1}}}", "com.inspiring.pugtsdb.exception.PugException: min", "com.inspiring.pugtsdb.exception.PugException: min", "and", "Aggregation{name='min'}", "1y" };
        java.sql.PreparedStatement preparedStatement13 = pugConnection1.prepareStatement("00000000000000000000000001228498187", strArray12);
        int int14 = pugConnection1.getHoldability();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection15 = new com.inspiring.pugtsdb.sql.PugConnection((java.sql.Connection) pugConnection1);
        java.util.Properties properties16 = pugConnection1.getClientInfo();
        org.junit.Assert.assertNotNull(pugConnection1);
        org.junit.Assert.assertNull(preparedStatement3);
        org.junit.Assert.assertNull(statement4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNull(preparedStatement13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(properties16);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories0 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository1 = h2Repositories0.getPointRepository();
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_SECOND;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Comparable<java.lang.String>> strComparableMetricPoints7 = pointRepository1.selectMetricPointsByIdAndAggregationBetweenTimestamp("hi!", "Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}}", granularity4, (-1457230920579L), 480226001100L);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric hi! points aggregated as Metric{id=-000871510803, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Interval{fromTime=-1457230925766, untilTime=-1457227325766}', tags={}} between -1457230920579 and 480226001100 with granularity 1s and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1s AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"aggregation\" = ?            AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pointRepository1);
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_SECOND + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_SECOND));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.TagRepository tagRepository1 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository2 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, tagRepository1);
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories3 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository4 = h2Repositories3.getPointRepository();
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric5 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints6 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric5);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository7 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository8 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository7);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric9 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints10 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric9);
        com.inspiring.pugtsdb.time.Granularity granularity11 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit12 = granularity11.getUnit();
        pointH2Repository8.upsertMetricPoints(constantDescMetricPoints10, granularity11);
        pointRepository4.upsertMetricPoints(constantDescMetricPoints6, granularity11);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository15 = null;
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository16 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(tagRepository15);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric17 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints18 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric17);
        com.inspiring.pugtsdb.time.Granularity granularity19 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit20 = granularity19.getUnit();
        pointH2Repository16.upsertMetricPoints(constantDescMetricPoints18, granularity19);
        java.lang.String str22 = granularity19.toString();
        pointH2Repository2.upsertMetricPoints(constantDescMetricPoints6, granularity19);
        com.inspiring.pugtsdb.metric.Metric<java.lang.constant.ConstantDesc> constantDescMetric24 = null;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc> constantDescMetricPoints25 = new com.inspiring.pugtsdb.bean.MetricPoints<java.lang.constant.ConstantDesc>(constantDescMetric24);
        constantDescMetricPoints25.put("Aggregation{name='sum'}", (long) 8, (java.lang.constant.ConstantDesc) 1);
        java.lang.String str30 = constantDescMetricPoints25.toString();
        com.inspiring.pugtsdb.time.Granularity granularity33 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit34 = granularity33.getUnit();
        com.inspiring.pugtsdb.time.Granularity granularity35 = com.inspiring.pugtsdb.time.Granularity.ONE_HOUR;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>> h2RepositoriesMetricPointsList36 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repositories> h2RepositoriesRollUpEvent37 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repositories>("", "hi!", granularity33, granularity35, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>>) h2RepositoriesMetricPointsList36);
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repositories>> h2RepositoriesMetricPointsList38 = h2RepositoriesRollUpEvent37.getMetricsPoints();
        com.inspiring.pugtsdb.time.Granularity granularity39 = h2RepositoriesRollUpEvent37.getSourceGranularity();
        // The following exception was thrown during execution in test generation
        try {
            pointH2Repository2.upsertMetricPoints(constantDescMetricPoints25, granularity39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.function.Supplier.get()\" because \"this.connectionSupplier\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pointRepository4);
        org.junit.Assert.assertTrue("'" + granularity11 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity11.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit12 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit12.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity19 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity19.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit20 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit20.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1y" + "'", str22, "1y");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "MetricPoints{metric=null, points={Aggregation{name='sum'}={8=1}}}" + "'", str30, "MetricPoints{metric=null, points={Aggregation{name='sum'}={8=1}}}");
        org.junit.Assert.assertTrue("'" + granularity33 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity33.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit34 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit34.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertTrue("'" + granularity35 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_HOUR + "'", granularity35.equals(com.inspiring.pugtsdb.time.Granularity.ONE_HOUR));
        org.junit.Assert.assertNotNull(h2RepositoriesMetricPointsList38);
        org.junit.Assert.assertTrue("'" + granularity39 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity39.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository0 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository1 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository0);
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository2 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository0);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        com.inspiring.pugtsdb.repository.rocks.bean.PointId pointId0 = new com.inspiring.pugtsdb.repository.rocks.bean.PointId();
        pointId0.metricId = "\000\000\000\000\000\000\000\000";
        pointId0.timestamp = 1695233332288L;
        java.lang.String str5 = pointId0.metricId;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\000\000\000\000\000\000\000" + "'", str5, "\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection1 = rocksRepository0.getConnection();
        java.sql.PreparedStatement preparedStatement3 = pugConnection1.prepareStatement("Aggregation{name='and'}");
        java.sql.Statement statement4 = pugConnection1.createStatement();
        java.lang.String[] strArray12 = new java.lang.String[] { "MetricPoints{metric=null, points={Aggregation{name='sum'}={8=1}}}", "com.inspiring.pugtsdb.exception.PugException: min", "com.inspiring.pugtsdb.exception.PugException: min", "and", "Aggregation{name='min'}", "1y" };
        java.sql.PreparedStatement preparedStatement13 = pugConnection1.prepareStatement("00000000000000000000000001228498187", strArray12);
        int int14 = pugConnection1.getHoldability();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection15 = new com.inspiring.pugtsdb.sql.PugConnection((java.sql.Connection) pugConnection1);
        pugConnection15.setReadOnly(true);
        org.junit.Assert.assertNotNull(pugConnection1);
        org.junit.Assert.assertNull(preparedStatement3);
        org.junit.Assert.assertNull(statement4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNull(preparedStatement13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        java.util.stream.Stream<com.inspiring.pugtsdb.bean.Tag> tagStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap1 = com.inspiring.pugtsdb.bean.Tag.toMap(tagStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.stream.Stream.collect(java.util.stream.Collector)\" because \"stream\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((-1L));
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setSchema("avg");
        int int3 = dummySqlConnection0.getTransactionIsolation();
        int int4 = dummySqlConnection0.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        com.inspiring.pugtsdb.rollup.aggregation.StringSumAggregation stringSumAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.StringSumAggregation();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric4 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = doubleMetric4.getTags();
        java.lang.String str6 = doubleMetric4.getId();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = doubleMetric4.getTags();
        com.inspiring.pugtsdb.metric.BooleanMetric booleanMetric8 = new com.inspiring.pugtsdb.metric.BooleanMetric("Aggregation{name='and'}", strMap7);
        java.util.List<java.lang.String> strList9 = com.inspiring.pugtsdb.bean.Tag.fromMapToStringList(strMap7);
        java.lang.String str10 = stringSumAggregation0.aggregate(strList9);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-000871510803" + "'", str6, "-000871510803");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.until((long) 0);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromMinutesAgo((long) 614249093);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastDays(1L);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromMonthsAgo(0L);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        com.inspiring.pugtsdb.repository.rocks.RocksRepositories rocksRepositories0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepositories();
        com.inspiring.pugtsdb.time.Granularity granularity4 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit5 = granularity4.getUnit();
        com.inspiring.pugtsdb.time.Interval.Builder builder6 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (short) 100, chronoUnit5);
        long long7 = com.inspiring.pugtsdb.util.Temporals.truncate((-1L), chronoUnit5);
        com.inspiring.pugtsdb.time.Retention retention8 = new com.inspiring.pugtsdb.time.Retention((long) 1, chronoUnit5);
        com.inspiring.pugtsdb.time.Granularity granularity12 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.time.temporal.ChronoUnit chronoUnit13 = granularity12.getUnit();
        com.inspiring.pugtsdb.time.Interval.Builder builder14 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (short) 100, chronoUnit13);
        long long15 = com.inspiring.pugtsdb.util.Temporals.truncate((-1L), chronoUnit13);
        com.inspiring.pugtsdb.time.Retention retention16 = new com.inspiring.pugtsdb.time.Retention((long) 1, chronoUnit13);
        com.inspiring.pugtsdb.rollup.schedule.ScheduledRocksPointPurger scheduledRocksPointPurger17 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledRocksPointPurger(rocksRepositories0, retention8, retention16);
        scheduledRocksPointPurger17.close();
        org.junit.Assert.assertTrue("'" + granularity4 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity4.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit5 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit5.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-31514400000L) + "'", long7 == (-31514400000L));
        org.junit.Assert.assertTrue("'" + granularity12 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity12.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + chronoUnit13 + "' != '" + java.time.temporal.ChronoUnit.YEARS + "'", chronoUnit13.equals(java.time.temporal.ChronoUnit.YEARS));
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-31514400000L) + "'", long15 == (-31514400000L));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
        com.inspiring.pugtsdb.sql.PugConnection pugConnection1 = rocksRepository0.getConnection();
        java.lang.Throwable throwable6 = null;
        com.inspiring.pugtsdb.exception.PugException pugException7 = new com.inspiring.pugtsdb.exception.PugException("", throwable6);
        com.inspiring.pugtsdb.sql.PugSQLException pugSQLException8 = new com.inspiring.pugtsdb.sql.PugSQLException("-000871510803", throwable6);
        com.inspiring.pugtsdb.exception.PugException pugException9 = new com.inspiring.pugtsdb.exception.PugException("min", (java.lang.Throwable) pugSQLException8);
        java.lang.Throwable[] throwableArray10 = pugException9.getSuppressed();
        java.sql.Array array11 = pugConnection1.createArrayOf("point", (java.lang.Object[]) throwableArray10);
        org.junit.Assert.assertNotNull(pugConnection1);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNull(array11);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        com.inspiring.pugtsdb.rollup.aggregation.StringMinAggregation stringMinAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.StringMinAggregation();
        java.lang.String str1 = stringMinAggregation0.getName();
        java.lang.String str2 = stringMinAggregation0.toString();
        com.inspiring.pugtsdb.rollup.aggregation.StringMinAggregation stringMinAggregation3 = new com.inspiring.pugtsdb.rollup.aggregation.StringMinAggregation();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric7 = new com.inspiring.pugtsdb.metric.DoubleMetric("Interval{fromTime=-1457230925766, untilTime=-1457227325766}", strMap6);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = doubleMetric7.getTags();
        java.lang.String str9 = doubleMetric7.getId();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = doubleMetric7.getTags();
        com.inspiring.pugtsdb.metric.BooleanMetric booleanMetric11 = new com.inspiring.pugtsdb.metric.BooleanMetric("Aggregation{name='and'}", strMap10);
        java.util.List<java.lang.String> strList12 = com.inspiring.pugtsdb.bean.Tag.fromMapToStringList(strMap10);
        java.lang.String str13 = stringMinAggregation3.aggregate(strList12);
        java.lang.String str14 = stringMinAggregation0.aggregate(strList12);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "min" + "'", str1, "min");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aggregation{name='min'}" + "'", str2, "Aggregation{name='min'}");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-000871510803" + "'", str9, "-000871510803");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }
}
