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
        com.inspiring.pugtsdb.util.Temporals temporals0 = new com.inspiring.pugtsdb.util.Temporals();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        com.inspiring.pugtsdb.repository.Repositories repositories0 = null;
        com.inspiring.pugtsdb.time.Retention retention1 = null;
        com.inspiring.pugtsdb.time.Retention retention2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger scheduledPointPurger3 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger(repositories0, retention1, retention2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.PugTSDBOverRocks pugTSDBOverRocks1 = new com.inspiring.pugtsdb.PugTSDBOverRocks("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsatisfiedLinkError; message: /private/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/librocksdbjni765986192297211983.jnilib: dlopen(/private/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/librocksdbjni765986192297211983.jnilib, 0x0001): tried: '/private/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/librocksdbjni765986192297211983.jnilib' (mach-o file, but is an incompatible architecture (have 'x86_64', need 'arm64')), '/System/Volumes/Preboot/Cryptexes/OS/private/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/librocksdbjni765986192297211983.jnilib' (no such file), '/private/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/librocksdbjni765986192297211983.jnilib' (mach-o file, but is an incompatible architecture (have 'x86_64', need 'arm64'))");
        } catch (java.lang.UnsatisfiedLinkError e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.PugTSDBOverH2 pugTSDBOverH2_3 = new com.inspiring.pugtsdb.PugTSDBOverH2("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.exception.PugIllegalArgumentException; message: Database storage path cannot be null nor empty");
        } catch (com.inspiring.pugtsdb.exception.PugIllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        com.inspiring.pugtsdb.rollup.aggregation.DoubleSumAggregation doubleSumAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.DoubleSumAggregation();
        java.lang.String str1 = doubleSumAggregation0.toString();
        java.lang.String str2 = doubleSumAggregation0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aggregation{name='sum'}" + "'", str1, "Aggregation{name='sum'}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aggregation{name='sum'}" + "'", str2, "Aggregation{name='sum'}");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 100);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromDaysAgo((long) (short) 100);
        long long4 = interval3.getUntilTime();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1691829528911L + "'", long4 == 1691829528911L);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.time.Instant instant0 = null;
        java.time.temporal.ChronoUnit chronoUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = com.inspiring.pugtsdb.util.Temporals.truncate(instant0, chronoUnit1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.time.Granularity granularity1 = com.inspiring.pugtsdb.time.Granularity.fromString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant com.inspiring.pugtsdb.time.Granularity.hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        byte[] byteArray1 = com.inspiring.pugtsdb.util.Bytes.fromDouble((java.lang.Double) 10.0d);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[64, 36, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        com.inspiring.pugtsdb.rollup.aggregation.DoubleSumAggregation doubleSumAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.DoubleSumAggregation();
        java.lang.String str1 = doubleSumAggregation0.getName();
        java.lang.String str2 = doubleSumAggregation0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "sum" + "'", str1, "sum");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "sum" + "'", str2, "sum");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 10);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromWeeksAgo((long) ' ');
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList1 = com.inspiring.pugtsdb.bean.Tag.fromMapToStringList(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            long long4 = com.inspiring.pugtsdb.util.MurmurHash3.getLongLittleEndian(byteArray2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, -1]");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.metric.LongMetric longMetric2 = new com.inspiring.pugtsdb.metric.LongMetric("", strMap1);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.exception.PugIllegalArgumentException; message: Metric name cannot be blank");
        } catch (com.inspiring.pugtsdb.exception.PugIllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastYears((long) (byte) 1);
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.repository.rocks.bean.PointId pointId2 = com.inspiring.pugtsdb.repository.rocks.bean.PointId.of("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        boolean boolean1 = com.inspiring.pugtsdb.util.GlobPattern.isGlob("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        long long1 = com.inspiring.pugtsdb.util.MurmurHash3.fmix64((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7256831767414464289L + "'", long1 == 7256831767414464289L);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.time.temporal.ChronoUnit chronoUnit1 = null;
        com.inspiring.pugtsdb.time.Retention retention2 = new com.inspiring.pugtsdb.time.Retention((long) (byte) 10, chronoUnit1);
        java.time.temporal.Temporal temporal3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal4 = retention2.addTo(temporal3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.lang.String str2 = com.inspiring.pugtsdb.util.Strings.format((double) 100L, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 100);
        java.time.temporal.ChronoUnit chronoUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromNowTruncatedTo(chronoUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.time.temporal.ChronoUnit chronoUnit4 = null;
        com.inspiring.pugtsdb.time.Retention retention5 = new com.inspiring.pugtsdb.time.Retention((long) (byte) 10, chronoUnit4);
        java.time.temporal.ChronoUnit chronoUnit7 = null;
        com.inspiring.pugtsdb.time.Retention retention8 = new com.inspiring.pugtsdb.time.Retention((long) (byte) 10, chronoUnit7);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.PugTSDBOverH2 pugTSDBOverH2_9 = new com.inspiring.pugtsdb.PugTSDBOverH2("sum", "hi!", "sum", retention5, retention8);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot create database");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        java.util.stream.Stream<com.inspiring.pugtsdb.bean.Tag> tagStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap1 = com.inspiring.pugtsdb.bean.Tag.toMap(tagStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int6 = com.inspiring.pugtsdb.util.MurmurHash3.murmurhash3_x86_32(byteArray2, 10, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 100]");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool0 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        java.lang.Runnable runnable1 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        java.time.temporal.ChronoUnit chronoUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture6 = scheduledThreadPool0.scheduleAtFixedRate(runnable1, 10L, timeUnit3, (long) ' ', chronoUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository1 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository2 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository1);
        java.lang.Class<?> wildcardClass3 = tagH2Repository1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
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
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        byte[] byteArray1 = com.inspiring.pugtsdb.util.Bytes.fromDouble((java.lang.Double) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.repository.rocks.bean.PointId pointId2 = com.inspiring.pugtsdb.repository.rocks.bean.PointId.from(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 13");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[63, -16, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        int int0 = com.inspiring.pugtsdb.metric.Metric.ID_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.List<java.lang.Double>>> doubleListMetricPointsList9 = pointH2Repository4.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Point{timestamp=32, value=[0.0, 10.0]}", strMap6, (long) 1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 100);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromDaysAgo((long) (short) 100);
        com.inspiring.pugtsdb.time.Interval interval4 = builder1.fromNow();
        com.inspiring.pugtsdb.time.Interval interval6 = builder1.fromWeeksAgo((long) 1);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths(1691829528911L);
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        java.util.function.Supplier<com.esotericsoftware.kryo.Kryo> kryoSupplier0 = null;
        com.inspiring.pugtsdb.util.Serializer.setKryoSupplier(kryoSupplier0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        byte[] byteArray2 = com.inspiring.pugtsdb.util.Bytes.fromDouble((java.lang.Double) 1.0d);
        com.inspiring.pugtsdb.bean.Point<java.lang.Cloneable> cloneablePoint3 = com.inspiring.pugtsdb.bean.Point.of((long) (short) 0, (java.lang.Cloneable) byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[63, -16, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(cloneablePoint3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.inspiring.pugtsdb.util.Collections collections0 = new com.inspiring.pugtsdb.util.Collections();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        com.inspiring.pugtsdb.rollup.aggregation.DoubleSumAggregation doubleSumAggregation1 = new com.inspiring.pugtsdb.rollup.aggregation.DoubleSumAggregation();
        java.lang.Class<?> wildcardClass2 = doubleSumAggregation1.getClass();
        com.inspiring.pugtsdb.bean.Point<java.lang.Class<?>> wildcardClassPoint3 = com.inspiring.pugtsdb.bean.Point.of((long) 0, wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClassPoint3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.time.Granularity granularity7 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        // The following exception was thrown during execution in test generation
        try {
            pointH2Repository4.deletePointsByNameAndAggregationBeforeTime("Point{timestamp=32, value=[0.0, 10.0]}", "sum", granularity7, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity7 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity7.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.inspiring.pugtsdb.util.MurmurHash3.murmurhash3_x86_32((java.lang.CharSequence) "", (int) (short) -1, 13, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        int int0 = com.inspiring.pugtsdb.metric.Metric.ID_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.time.Granularity granularity6 = com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.TagRepository> tagRepositoryMetricPoints8 = pointH2Repository4.selectLastMetricPointsById("", granularity6, (-1));
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric  last points with granularity -1 and statement 30s");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity6 + "' != '" + com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE + "'", granularity6.equals(com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.time.Granularity granularity7 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        // The following exception was thrown during execution in test generation
        try {
            pointH2Repository4.deletePointsByNameAndAggregationBeforeTime("max", "Aggregation{name='sum'}", granularity7, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity7 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity7.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        int int0 = java.sql.Connection.TRANSACTION_READ_COMMITTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.MetricH2Repository> metricH2RepositoryMetricPoints8 = pointH2Repository4.selectRawMetricPointsByIdBetweenTimestamp("hi!", 100L, 0L);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric hi! points between 100 and 0 with statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"value\"                      FROM   metric                               INNER JOIN point                            ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.inspiring.pugtsdb.util.MurmurHash3 murmurHash3_0 = new com.inspiring.pugtsdb.util.MurmurHash3();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.time.Granularity granularity6 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>> doubleListMetricPoints8 = pointH2Repository4.selectLastMetricPointsById("", granularity6, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric  last points with granularity 1 and statement 1mo");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity6 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity6.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.inspiring.pugtsdb.util.MurmurHash3.murmurhash3_x86_32((java.lang.CharSequence) "sum", (int) (short) -1, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories1 = new com.inspiring.pugtsdb.repository.h2.H2Repositories(pugConnectionSupplier0);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository2 = h2Repositories1.getTagRepository();
        org.junit.Assert.assertNotNull(tagRepository2);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastSeconds((long) 100);
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.time.Granularity granularity6 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.lang.CharSequence>> charSequenceMetricPointsList10 = pointH2Repository4.selectMetricsPointsByNameAndTagsBetweenTimestamp("Point{timestamp=32, value=[0.0, 10.0]}", granularity6, strMap7, (long) 2, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity6 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity6.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.inspiring.pugtsdb.rollup.aggregation.DoubleAvgAggregation doubleAvgAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.DoubleAvgAggregation();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool0 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        java.lang.Runnable runnable1 = null;
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection2 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection2.setCatalog("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<com.inspiring.pugtsdb.util.DummySqlConnection> dummySqlConnectionFuture5 = scheduledThreadPool0.submit(runnable1, dummySqlConnection2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        com.inspiring.pugtsdb.rollup.aggregation.DoubleSumAggregation doubleSumAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.DoubleSumAggregation();
        java.lang.String str1 = doubleSumAggregation0.toString();
        java.lang.String str2 = doubleSumAggregation0.getName();
        java.lang.String str3 = doubleSumAggregation0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aggregation{name='sum'}" + "'", str1, "Aggregation{name='sum'}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "sum" + "'", str2, "sum");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "sum" + "'", str3, "sum");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.concurrent.ScheduledExecutorService>> scheduledExecutorServiceMetricPointsList8 = pointH2Repository4.selectRawMetricsPointsByNameBetweenTimestamp("Aggregation{name='max'}", (long) '#', (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric Aggregation{name='max'} points between 35 and 1 with statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"value\"                      FROM   metric                               INNER JOIN point                            ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        // The following exception was thrown during execution in test generation
        try {
            pointH2Repository4.deleteRawPointsByNameBeforeTime("sum", (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories1 = new com.inspiring.pugtsdb.repository.h2.H2Repositories(pugConnectionSupplier0);
        com.inspiring.pugtsdb.repository.MetricRepository metricRepository2 = h2Repositories1.getMetricRepository();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.metric.Metric<java.util.concurrent.ScheduledExecutorService>> scheduledExecutorServiceMetricList4 = metricRepository2.selectMetricsByName("100");
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metrics by name 100 with statement  SELECT \"id\",              \"name\",            \"type\"      FROM   metric        WHERE  \"name\" = ? ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRepository2);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.time.Granularity granularity7 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>> doubleAggregationMetricPointMetricPoints9 = pointH2Repository4.selectLastMetricPointsByIdAndAggregation("100", "Aggregation{name='max'}", granularity7, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric 100 last 1 points aggregated as Aggregation{name='max'} with granularity 1mo and statement  SELECT TOP ?                                       metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1mo AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"aggregation\" = ?            ORDER BY metric.\"id\",                              point.\"timestamp\" DESC          ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity7 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity7.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.time.temporal.TemporalAmount> temporalAmountAggregation1 = null;
        com.inspiring.pugtsdb.time.Granularity granularity2 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity5 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity6 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList7 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent8 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity5, granularity6, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList7);
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier9 = null;
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories10 = new com.inspiring.pugtsdb.repository.h2.H2Repositories(pugConnectionSupplier9);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.rollup.RollUp<java.time.temporal.TemporalAmount> temporalAmountRollUp11 = new com.inspiring.pugtsdb.rollup.RollUp<java.time.temporal.TemporalAmount>("sum", temporalAmountAggregation1, granularity2, granularity5, (com.inspiring.pugtsdb.repository.Repositories) h2Repositories10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity2 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity2.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity5 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity5.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity6 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity6.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.AbstractCollection<java.lang.Double>>> doubleCollectionMetricPointsList8 = pointH2Repository4.selectRawMetricsPointsByNameBetweenTimestamp("100", (long) '4', 1691829528911L);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric 100 points between 52 and 1691829528911 with statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"value\"                      FROM   metric                               INNER JOIN point                            ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.time.Granularity granularity7 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long8 = pointH2Repository4.selectMaxPointTimestampByNameAndAggregation("Aggregation{name='max'}", "", granularity7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity7 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity7.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryRollUpEventMetricPoints8 = pointH2Repository4.selectRawMetricPointsByIdBetweenTimestamp("Aggregation{name='max'}", 0L, 1437494990209L);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric Aggregation{name='max'} points between 0 and 1437494990209 with statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"value\"                      FROM   metric                               INNER JOIN point                            ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        int int3 = dummySqlConnection0.getTransactionIsolation();
        java.util.Map<java.lang.String, java.lang.Class<?>> strMap4 = dummySqlConnection0.getTypeMap();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.inspiring.pugtsdb.util.Bytes bytes0 = new com.inspiring.pugtsdb.util.Bytes();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository1 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository2 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            tagH2Repository1.upsertTags(strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories0 = new com.inspiring.pugtsdb.repository.h2.H2Repositories();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.sql.Connection>> connectionMetricPointsList8 = pointH2Repository4.selectRawMetricsPointsByNameBetweenTimestamp("Aggregation{name='sum'}", (long) 1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric Aggregation{name='sum'} points between 1 and 97 with statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"value\"                      FROM   metric                               INNER JOIN point                            ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.inspiring.pugtsdb.rollup.aggregation.BooleanOrAggregation booleanOrAggregation1 = new com.inspiring.pugtsdb.rollup.aggregation.BooleanOrAggregation();
        com.inspiring.pugtsdb.bean.Point<com.inspiring.pugtsdb.rollup.aggregation.BooleanOrAggregation> booleanOrAggregationPoint2 = com.inspiring.pugtsdb.bean.Point.of(100L, booleanOrAggregation1);
        org.junit.Assert.assertNotNull(booleanOrAggregationPoint2);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        int int0 = com.inspiring.pugtsdb.metric.Metric.ID_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        boolean boolean1 = com.inspiring.pugtsdb.util.Strings.isBlank((java.lang.CharSequence) "max");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            tagH2Repository2.upsertTags(strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.time.temporal.ChronoUnit chronoUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.time.Interval.Builder builder2 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (-1), chronoUnit1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.inspiring.pugtsdb.exception.PugIllegalArgumentException pugIllegalArgumentException2 = new com.inspiring.pugtsdb.exception.PugIllegalArgumentException("hi!");
        com.inspiring.pugtsdb.exception.PugIllegalArgumentException pugIllegalArgumentException4 = new com.inspiring.pugtsdb.exception.PugIllegalArgumentException("hi!");
        pugIllegalArgumentException2.addSuppressed((java.lang.Throwable) pugIllegalArgumentException4);
        com.inspiring.pugtsdb.exception.PugException pugException6 = new com.inspiring.pugtsdb.exception.PugException("Aggregation{name='sum'}", (java.lang.Throwable) pugIllegalArgumentException2);
        java.lang.String str7 = pugException6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}" + "'", str7, "com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        java.sql.Statement statement5 = dummySqlConnection0.createStatement((int) (short) 1, 1);
        java.sql.Clob clob6 = dummySqlConnection0.createClob();
        boolean boolean7 = dummySqlConnection0.getAutoCommit();
        org.junit.Assert.assertNull(statement5);
        org.junit.Assert.assertNull(clob6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastDays((long) 10);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromMinutesAgo(1437494990209L);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        java.util.function.Supplier<com.esotericsoftware.kryo.Kryo> kryoSupplier0 = com.inspiring.pugtsdb.util.Serializer.getKryoSupplier();
        org.junit.Assert.assertNull(kryoSupplier0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 10);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromMinutesAgo((long) (byte) 100);
        java.lang.String str4 = interval3.toString();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Interval{fromTime=1674166070495, untilTime=1700463530495}" + "'", str4, "Interval{fromTime=1674166070495, untilTime=1700463530495}");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool0 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        boolean boolean1 = scheduledThreadPool0.isTerminated();
        java.lang.Runnable runnable2 = null;
        byte[] byteArray4 = com.inspiring.pugtsdb.util.Bytes.fromDouble((java.lang.Double) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<byte[]> byteArrayFuture5 = scheduledThreadPool0.submit(runnable2, byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[63, -16, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        // The following exception was thrown during execution in test generation
        try {
            pointH2Repository4.deleteRawPointsByNameBeforeTime("sum", 7256831767414464289L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.inspiring.pugtsdb.rollup.aggregation.DoubleMaxAggregation doubleMaxAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.DoubleMaxAggregation();
        java.lang.String str1 = doubleMaxAggregation0.toString();
        java.lang.String str2 = doubleMaxAggregation0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aggregation{name='max'}" + "'", str1, "Aggregation{name='max'}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "max" + "'", str2, "max");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories1 = new com.inspiring.pugtsdb.repository.h2.H2Repositories(pugConnectionSupplier0);
        com.inspiring.pugtsdb.repository.MetricRepository metricRepository2 = h2Repositories1.getMetricRepository();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository3 = h2Repositories1.getPointRepository();
        com.inspiring.pugtsdb.time.Granularity granularity6 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.DoubleAvgAggregation> doubleAvgAggregationMetricPoints9 = pointRepository3.selectMetricPointsByIdAndAggregationBetweenTimestamp("Aggregation{name='sum'}", "sum", granularity6, 1L, (long) (-1));
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric Aggregation{name='sum'} points aggregated as sum between 1 and -1 with granularity 1y and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1y AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"aggregation\" = ?            AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRepository2);
        org.junit.Assert.assertNotNull(pointRepository3);
        org.junit.Assert.assertTrue("'" + granularity6 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity6.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 10);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromMinutesAgo((long) (byte) 100);
        com.inspiring.pugtsdb.time.Interval interval5 = builder1.fromYearsAgo(32L);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(interval5);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        java.sql.PreparedStatement preparedStatement5 = dummySqlConnection0.prepareStatement("Tag{name='Aggregation{name', value=''sum'}'}", 100, (int) '4', 2);
        org.junit.Assert.assertNull(preparedStatement5);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.inspiring.pugtsdb.rollup.aggregation.StringMaxAggregation stringMaxAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.StringMaxAggregation();
        java.lang.String str1 = stringMaxAggregation0.getName();
        java.lang.String str2 = stringMaxAggregation0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "max" + "'", str1, "max");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aggregation{name='max'}" + "'", str2, "Aggregation{name='max'}");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.repository.rocks.bean.PointId pointId1 = com.inspiring.pugtsdb.repository.rocks.bean.PointId.from("Interval{fromTime=1674166070495, untilTime=1700463530495}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Time=1674166070495, untilTime=1700463530495}\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        java.util.regex.Pattern pattern1 = com.inspiring.pugtsdb.util.GlobPattern.compile("Aggregation{name='sum'}");
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "\\QAggregation\\E(.*)");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository5 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.time.Granularity granularity10 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity11 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList12 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent13 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity10, granularity11, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.TagRepository>> tagRepositoryMetricPointsList16 = pointH2Repository5.selectLastMetricsPointsByNameAndAggregationAndTags("", "Interval{fromTime=1674166070495, untilTime=1700463530495}", granularity10, strMap14, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity10 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity10.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity11 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity11.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool0 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = scheduledThreadPool0.awaitTermination((long) ' ', timeUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 100);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromDaysAgo((long) (short) 100);
        com.inspiring.pugtsdb.time.Interval interval5 = builder1.fromMonthsAgo((long) 'a');
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(interval5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository5 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.time.Granularity granularity9 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity10 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList11 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent12 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity9, granularity10, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList11);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<java.util.List<java.lang.Double>> doubleListMetricPoints15 = pointH2Repository5.selectMetricPointsByIdBetweenTimestamp("hi!", granularity10, 0L, (long) 10);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric hi! points between 0 and 10 with granularity 1mo and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1mo AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\"              ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity9 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity9.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity10 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity10.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository5 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        // The following exception was thrown during execution in test generation
        try {
            pointH2Repository5.deleteRawPointsByNameBeforeTime("Point{timestamp=32, value=[0.0, 10.0]}", (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.time.Granularity granularity8 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity9 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList10 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent11 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity8, granularity9, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList10);
        com.inspiring.pugtsdb.time.Granularity granularity12 = h2RepositoryRollUpEvent11.getSourceGranularity();
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<java.util.AbstractCollection<java.lang.Double>> doubleCollectionMetricPoints15 = pointH2Repository4.selectMetricPointsByIdBetweenTimestamp("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", granularity12, (-1L), (long) 2);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'} points between -1 and 2 with granularity 1y and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1y AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\"              ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity8 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity8.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity9 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity9.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity12 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity12.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories1 = new com.inspiring.pugtsdb.repository.h2.H2Repositories(pugConnectionSupplier0);
        com.inspiring.pugtsdb.repository.PointRepository pointRepository2 = h2Repositories1.getPointRepository();
        com.inspiring.pugtsdb.time.Granularity granularity6 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity7 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList8 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent9 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity6, granularity7, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList8);
        com.inspiring.pugtsdb.time.Granularity granularity10 = h2RepositoryRollUpEvent9.getSourceGranularity();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>> doubleAggregationMetricPointsList13 = pointRepository2.selectLastMetricsPointsByNameAndTags("Tag{name='Aggregation{name', value=''sum'}'}", granularity10, strMap11, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pointRepository2);
        org.junit.Assert.assertTrue("'" + granularity6 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity6.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity7 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity7.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity10 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity10.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository5 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.time.Granularity granularity9 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity10 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList11 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent12 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity9, granularity10, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList11);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<java.util.List<java.lang.Double>> doubleListMetricPoints15 = pointH2Repository5.selectMetricPointsByIdBetweenTimestamp("hi!", granularity9, (long) 1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric hi! points between 1 and 10 with granularity 1y and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1y AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\"              ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity9 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity9.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity10 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity10.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection1 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection1.setCatalog("");
        int int4 = dummySqlConnection1.getTransactionIsolation();
        byte[] byteArray6 = com.inspiring.pugtsdb.util.Bytes.fromDouble((java.lang.Double) 1.0d);
        com.inspiring.pugtsdb.time.Interval.Builder builder8 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 100);
        com.inspiring.pugtsdb.time.Interval interval10 = builder8.fromDaysAgo((long) (short) 100);
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier11 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier12 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository13 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository14 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier12, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository13);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository15 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier11, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository13);
        java.lang.Object[] objArray16 = new java.lang.Object[] { dummySqlConnection1, 1.0d, builder8, tagH2Repository13 };
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.sql.PugSQLException pugSQLException17 = new com.inspiring.pugtsdb.sql.PugSQLException("sum", objArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.inspiring.pugtsdb.repository.h2.TagH2Repository cannot be cast to java.lang.Throwable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[63, -16, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastDays(1691829528911L);
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository5 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.time.Granularity granularity9 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity10 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList11 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent12 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity9, granularity10, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList11);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<java.util.concurrent.Executor> executorMetricPoints14 = pointH2Repository5.selectLastMetricPointsById("", granularity9, (int) ' ');
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric  last points with granularity 32 and statement 1y");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity9 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity9.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity10 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity10.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.inspiring.pugtsdb.repository.rocks.bean.PointId pointId2 = com.inspiring.pugtsdb.repository.rocks.bean.PointId.of("Aggregation{name='max'}", (java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(pointId2);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.time.temporal.ChronoUnit chronoUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.time.Interval.Builder builder2 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (byte) 1, chronoUnit1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationMetric0 = null;
        com.inspiring.pugtsdb.bean.Point<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationPoint1 = null;
        com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationMetricPoint2 = new com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>(doubleAggregationMetric0, doubleAggregationPoint1);
        java.lang.String str3 = doubleAggregationMetricPoint2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MetricPoint{metric=null, point=null}" + "'", str3, "MetricPoint{metric=null, point=null}");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.inspiring.pugtsdb.util.MurmurHash3.murmurhash3_x86_32((java.lang.CharSequence) "Aggregation{name='sum'}", (int) (short) -1, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        java.sql.Clob clob3 = dummySqlConnection0.createClob();
        dummySqlConnection0.setSchema("");
        java.sql.PreparedStatement preparedStatement9 = dummySqlConnection0.prepareStatement("", (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertNull(clob3);
        org.junit.Assert.assertNull(preparedStatement9);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        com.inspiring.pugtsdb.util.GlobPattern globPattern0 = new com.inspiring.pugtsdb.util.GlobPattern();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository5 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.time.Granularity granularity10 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity11 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList12 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent13 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity10, granularity11, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList12);
        // The following exception was thrown during execution in test generation
        try {
            pointH2Repository5.deletePointsByNameAndAggregationBeforeTime("Aggregation{name='or'}", "Aggregation{name='or'}", granularity11, 1691829528911L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity10 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity10.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity11 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity11.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.metric.Metric<java.lang.CharSequence>> charSequenceMetricList2 = metricRocksRepository0.selectMetricsByName("Tag{name='Aggregation{name', value=''sum'}'}");
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.exception.PugException; message: Cannot select metrics by name Tag{name='Aggregation{name', value=''sum'}'}");
        } catch (com.inspiring.pugtsdb.exception.PugException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        int int3 = dummySqlConnection0.getTransactionIsolation();
        int int4 = dummySqlConnection0.getTransactionIsolation();
        dummySqlConnection0.setTransactionIsolation(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.inspiring.pugtsdb.rollup.aggregation.BooleanAndAggregation booleanAndAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.BooleanAndAggregation();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        int int3 = dummySqlConnection0.getTransactionIsolation();
        java.sql.CallableStatement callableStatement8 = dummySqlConnection0.prepareCall("Aggregation{name='or'}", 1, (int) '#', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(callableStatement8);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.inspiring.pugtsdb.repository.rocks.RocksRepository rocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.RocksRepository();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        byte[] byteArray1 = com.inspiring.pugtsdb.util.Bytes.fromDouble((java.lang.Double) 5.0d);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = com.inspiring.pugtsdb.util.MurmurHash3.getLongLittleEndian(byteArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[64, 20, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 100);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromMinutesAgo((-1L));
        long long4 = interval3.getFromTime();
        long long5 = interval3.getFromTime();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1437494991460L + "'", long4 == 1437494991460L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1437494991460L + "'", long5 == 1437494991460L);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository7 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository8 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository7);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository9 = pointRocksRepository8.getMetricRepository();
        com.inspiring.pugtsdb.time.Granularity granularity14 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity15 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList16 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent17 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity14, granularity15, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList16);
        com.inspiring.pugtsdb.time.Granularity granularity18 = h2RepositoryRollUpEvent17.getSourceGranularity();
        com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>> doubleAggregationMetricPointMetricPoints21 = pointRocksRepository8.selectMetricPointsByIdAndAggregationBetweenTimestamp("100", "hi!", granularity18, (-1L), (long) 2);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.util.Bytes>> bytesMetricPointsList25 = pointH2Repository4.selectMetricsPointsByNameAndAggregationAndTagsBetweenTimestamp("sum", "Point{timestamp=32, value=[0.0, 10.0]}", granularity18, strMap22, (long) (byte) 0, 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRocksRepository9);
        org.junit.Assert.assertTrue("'" + granularity14 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity14.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity15 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity15.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity18 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity18.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertNull(doubleAggregationMetricPointMetricPoints21);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository2 = pointRocksRepository1.getMetricRepository();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList7 = pointRocksRepository1.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap4, (long) (short) 1, 10L);
        com.inspiring.pugtsdb.time.Granularity granularity9 = com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.List<java.lang.Double>>> doubleListMetricPointsList12 = pointRocksRepository1.selectLastMetricsPointsByNameAndTags("MetricPoint{metric=null, point=null}", granularity9, strMap10, (int) (byte) 10);
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationMetric13 = null;
        com.inspiring.pugtsdb.bean.Point<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationPoint14 = null;
        com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationMetricPoint15 = new com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>(doubleAggregationMetric13, doubleAggregationPoint14);
        // The following exception was thrown during execution in test generation
        try {
            pointRocksRepository1.upsertMetricPoint(doubleAggregationMetricPoint15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsatisfiedLinkError; message: org.rocksdb.WriteOptions.newWriteOptions()J");
        } catch (java.lang.UnsatisfiedLinkError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRocksRepository2);
        org.junit.Assert.assertNull(doubleListMetricPointsList7);
        org.junit.Assert.assertTrue("'" + granularity9 + "' != '" + com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE + "'", granularity9.equals(com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE));
        org.junit.Assert.assertNull(doubleListMetricPointsList12);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.time.Granularity granularity9 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity10 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList11 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent12 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity9, granularity10, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList11);
        // The following exception was thrown during execution in test generation
        try {
            pointH2Repository4.deletePointsByNameAndAggregationBeforeTime("sum", "Aggregation{name='avg'}", granularity10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity9 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity9.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity10 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity10.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        java.sql.Clob clob3 = dummySqlConnection0.createClob();
        dummySqlConnection0.setSchema("");
        java.lang.String str7 = dummySqlConnection0.nativeSQL("hi!");
        dummySqlConnection0.close();
        org.junit.Assert.assertNull(clob3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.time.temporal.ChronoUnit chronoUnit1 = null;
        com.inspiring.pugtsdb.time.Retention retention2 = new com.inspiring.pugtsdb.time.Retention((long) (byte) 10, chronoUnit1);
        java.time.temporal.TemporalUnit temporalUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = retention2.get(temporalUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository5 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.lang.reflect.GenericDeclaration>> genericDeclarationMetricPointsList10 = pointH2Repository5.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", strMap7, 0L, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        java.sql.Clob clob3 = dummySqlConnection0.createClob();
        java.sql.PreparedStatement preparedStatement7 = dummySqlConnection0.prepareStatement("Aggregation{name='max'}", (int) '4', (int) (short) -1);
        dummySqlConnection0.rollback();
        dummySqlConnection0.setClientInfo("", "Tag{name='Aggregation{name', value=''sum'}'}");
        java.util.Map<java.lang.String, java.lang.Class<?>> strMap12 = dummySqlConnection0.getTypeMap();
        org.junit.Assert.assertNull(clob3);
        org.junit.Assert.assertNull(preparedStatement7);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.util.regex.Pattern pattern1 = com.inspiring.pugtsdb.util.GlobPattern.compile("Interval{fromTime=1674166070495, untilTime=1700463530495}");
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "\\QInterval\\E(.*)");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        // The following exception was thrown during execution in test generation
        try {
            pointH2Repository4.deleteRawPointsByNameBeforeTime("Aggregation{name='sum'}", 7256831767414464289L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.time.Granularity granularity9 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity10 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList11 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent12 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity9, granularity10, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList11);
        com.inspiring.pugtsdb.time.Interval.Builder builder13 = com.inspiring.pugtsdb.time.Interval.ofLast(granularity10);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<java.lang.String> strMetricPoints15 = pointH2Repository4.selectLastMetricPointsByIdAndAggregation("100", "", granularity10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric 100 last 1 points aggregated as  with granularity 1mo and statement  SELECT TOP ?                                       metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1mo AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"aggregation\" = ?            ORDER BY metric.\"id\",                              point.\"timestamp\" DESC          ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity9 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity9.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity10 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity10.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.inspiring.pugtsdb.repository.rocks.bean.PointId pointId2 = com.inspiring.pugtsdb.repository.rocks.bean.PointId.of("Aggregation{name='sum'}", (java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(pointId2);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository5 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.time.Granularity granularity9 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity10 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList11 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent12 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity9, granularity10, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList13 = pointH2Repository5.selectAggregationNames("", granularity10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity9 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity9.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity10 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity10.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.time.Granularity granularity11 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity12 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList13 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent14 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity11, granularity12, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList13);
        com.inspiring.pugtsdb.time.Granularity granularity15 = h2RepositoryRollUpEvent14.getTargetGranularity();
        com.inspiring.pugtsdb.time.Granularity granularity18 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity19 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList20 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent21 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity18, granularity19, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList20);
        com.inspiring.pugtsdb.time.Granularity granularity22 = h2RepositoryRollUpEvent21.getTargetGranularity();
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>> doubleAggregationMetricPointsList23 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationRollUpEvent24 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "max", granularity15, granularity22, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>>) doubleAggregationMetricPointsList23);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<java.lang.RuntimeException> runtimeExceptionMetricPoints27 = pointH2Repository4.selectMetricPointsByIdAndAggregationBetweenTimestamp("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "Point{timestamp=32, value=[0.0, 10.0]}", granularity22, (long) '4', (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'} points aggregated as Point{timestamp=32, value=[0.0, 10.0]} between 52 and -1 with granularity 1mo and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1mo AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"aggregation\" = ?            AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity11 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity11.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity12 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity12.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity15 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity15.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity18 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity18.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity19 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity19.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity22 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity22.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            tagH2Repository2.upsertTags(strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        int int1 = dummySqlConnection0.getNetworkTimeout();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.inspiring.pugtsdb.rollup.aggregation.LongAvgAggregation longAvgAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.LongAvgAggregation();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.time.Granularity granularity8 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity9 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList10 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent11 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity8, granularity9, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList10);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<java.lang.reflect.Type> typeMetricPoints13 = pointH2Repository4.selectLastMetricPointsById("sum", granularity8, 1);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric sum last points with granularity 1 and statement 1y");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity8 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity8.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity9 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity9.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        byte[] byteArray1 = com.inspiring.pugtsdb.util.Bytes.fromUtf8String("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean2 = com.inspiring.pugtsdb.util.Bytes.toBoolean(byteArray1);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.exception.PugConversionException; message: Cannot convert bytes [104, 105, 33] to Boolean: Expected a length of 1, got 3");
        } catch (com.inspiring.pugtsdb.exception.PugConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[104, 105, 33]");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository2 = pointRocksRepository1.getMetricRepository();
        com.inspiring.pugtsdb.time.Granularity granularity7 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity8 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList9 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent10 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity7, granularity8, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList9);
        com.inspiring.pugtsdb.time.Granularity granularity11 = h2RepositoryRollUpEvent10.getSourceGranularity();
        com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>> doubleAggregationMetricPointMetricPoints14 = pointRocksRepository1.selectMetricPointsByIdAndAggregationBetweenTimestamp("100", "hi!", granularity11, (-1L), (long) 2);
        // The following exception was thrown during execution in test generation
        try {
            pointRocksRepository1.compactDB();
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.exception.PugException; message: Cannot compact database");
        } catch (com.inspiring.pugtsdb.exception.PugException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRocksRepository2);
        org.junit.Assert.assertTrue("'" + granularity7 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity7.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity8 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity8.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity11 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity11.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertNull(doubleAggregationMetricPointMetricPoints14);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastDays((long) '4');
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromDaysAgo(0L);
        com.inspiring.pugtsdb.time.Interval interval4 = builder1.fromNow();
        long long5 = interval4.getFromTime();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(interval4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1695976731791L + "'", long5 == 1695976731791L);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository7 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository8 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository7);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository9 = pointRocksRepository8.getMetricRepository();
        com.inspiring.pugtsdb.time.Granularity granularity14 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity15 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList16 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent17 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity14, granularity15, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList16);
        com.inspiring.pugtsdb.time.Granularity granularity18 = h2RepositoryRollUpEvent17.getSourceGranularity();
        com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>> doubleAggregationMetricPointMetricPoints21 = pointRocksRepository8.selectMetricPointsByIdAndAggregationBetweenTimestamp("100", "hi!", granularity18, (-1L), (long) 2);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.List<java.lang.Double>>> doubleListMetricPointsList24 = pointH2Repository4.selectLastMetricsPointsByNameAndAggregationAndTags("'sum'}", "hi!", granularity18, strMap22, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRocksRepository9);
        org.junit.Assert.assertTrue("'" + granularity14 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity14.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity15 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity15.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity18 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity18.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertNull(doubleAggregationMetricPointMetricPoints21);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        int int4 = com.inspiring.pugtsdb.util.MurmurHash3.murmurhash3_x86_32((java.lang.CharSequence) "Aggregation{name='avg'}", (int) (short) 10, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1325048386 + "'", int4 == 1325048386);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Object> objAggregation1 = null;
        com.inspiring.pugtsdb.time.Granularity granularity6 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity7 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList8 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent9 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity6, granularity7, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList8);
        com.inspiring.pugtsdb.time.Granularity granularity10 = h2RepositoryRollUpEvent9.getTargetGranularity();
        com.inspiring.pugtsdb.time.Granularity granularity13 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity14 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList15 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent16 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity13, granularity14, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList15);
        com.inspiring.pugtsdb.time.Granularity granularity17 = h2RepositoryRollUpEvent16.getTargetGranularity();
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>> doubleAggregationMetricPointsList18 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationRollUpEvent19 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "max", granularity10, granularity17, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>>) doubleAggregationMetricPointsList18);
        com.inspiring.pugtsdb.time.Granularity granularity22 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity23 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList24 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent25 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity22, granularity23, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList24);
        com.inspiring.pugtsdb.time.Granularity granularity26 = h2RepositoryRollUpEvent25.getTargetGranularity();
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier27 = null;
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories28 = new com.inspiring.pugtsdb.repository.h2.H2Repositories(pugConnectionSupplier27);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.rollup.RollUp<java.lang.Object> objRollUp29 = new com.inspiring.pugtsdb.rollup.RollUp<java.lang.Object>("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", objAggregation1, granularity17, granularity26, (com.inspiring.pugtsdb.repository.Repositories) h2Repositories28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity6 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity6.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity7 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity7.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity10 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity10.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity13 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity13.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity14 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity14.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity17 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity17.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity22 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity22.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity23 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity23.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity26 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity26.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.rollup.aggregation.DoubleAvgAggregation>> doubleAvgAggregationMetricList2 = metricRocksRepository0.selectMetricsByName("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}");
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.exception.PugException; message: Cannot select metrics by name com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}");
        } catch (com.inspiring.pugtsdb.exception.PugException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.inspiring.pugtsdb.util.Strings strings0 = new com.inspiring.pugtsdb.util.Strings();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.time.Granularity granularity9 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity10 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList11 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent12 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity9, granularity10, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList11);
        com.inspiring.pugtsdb.time.Interval.Builder builder13 = com.inspiring.pugtsdb.time.Interval.ofLast(granularity10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long14 = pointH2Repository4.selectMaxPointTimestampByNameAndAggregation("'sum'}", "MetricPoint{metric=null, point=null}", granularity10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity9 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity9.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity10 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity10.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 100);
        com.inspiring.pugtsdb.time.Interval interval2 = builder1.fromNow();
        com.inspiring.pugtsdb.time.Interval interval4 = builder1.fromMonthsAgo((long) ' ');
        com.inspiring.pugtsdb.time.Interval interval6 = builder1.fromSecondsAgo(1691829528911L);
        java.lang.String str7 = interval6.toString();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Interval{fromTime=-1690392033978951, untilTime=-1690129059378951}" + "'", str7, "Interval{fromTime=-1690392033978951, untilTime=-1690129059378951}");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool0 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = scheduledThreadPool0.awaitTermination((long) 100, timeUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        byte[] byteArray0 = null;
        java.lang.Boolean boolean1 = com.inspiring.pugtsdb.util.Bytes.toBoolean(byteArray0);
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories1 = new com.inspiring.pugtsdb.repository.h2.H2Repositories(pugConnectionSupplier0);
        com.inspiring.pugtsdb.repository.PointRepository pointRepository2 = h2Repositories1.getPointRepository();
        java.time.temporal.ChronoUnit chronoUnit4 = null;
        com.inspiring.pugtsdb.time.Retention retention5 = com.inspiring.pugtsdb.time.Retention.of((long) (byte) 10, chronoUnit4);
        java.time.temporal.ChronoUnit chronoUnit7 = null;
        com.inspiring.pugtsdb.time.Retention retention8 = com.inspiring.pugtsdb.time.Retention.of((long) (byte) 10, chronoUnit7);
        com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger scheduledPointPurger9 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger((com.inspiring.pugtsdb.repository.Repositories) h2Repositories1, retention5, retention8);
        // The following exception was thrown during execution in test generation
        try {
            scheduledPointPurger9.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pointRepository2);
        org.junit.Assert.assertNotNull(retention5);
        org.junit.Assert.assertNotNull(retention8);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastDays((long) '4');
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromDaysAgo(0L);
        java.time.temporal.ChronoUnit chronoUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.time.Interval interval5 = builder1.fromNowTruncatedTo(chronoUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories1 = new com.inspiring.pugtsdb.repository.h2.H2Repositories(pugConnectionSupplier0);
        com.inspiring.pugtsdb.repository.PointRepository pointRepository2 = h2Repositories1.getPointRepository();
        java.time.temporal.ChronoUnit chronoUnit4 = null;
        com.inspiring.pugtsdb.time.Retention retention5 = com.inspiring.pugtsdb.time.Retention.of((long) (byte) 10, chronoUnit4);
        java.time.temporal.ChronoUnit chronoUnit7 = null;
        com.inspiring.pugtsdb.time.Retention retention8 = com.inspiring.pugtsdb.time.Retention.of((long) (byte) 10, chronoUnit7);
        com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger scheduledPointPurger9 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger((com.inspiring.pugtsdb.repository.Repositories) h2Repositories1, retention5, retention8);
        com.inspiring.pugtsdb.repository.PointRepository pointRepository10 = h2Repositories1.getPointRepository();
        org.junit.Assert.assertNotNull(pointRepository2);
        org.junit.Assert.assertNotNull(retention5);
        org.junit.Assert.assertNotNull(retention8);
        org.junit.Assert.assertNotNull(pointRepository10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.inspiring.pugtsdb.time.Granularity granularity0 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        long long1 = granularity0.getValue();
        org.junit.Assert.assertTrue("'" + granularity0 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity0.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository2 = pointRocksRepository1.getMetricRepository();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList7 = pointRocksRepository1.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap4, (long) (short) 1, 10L);
        com.inspiring.pugtsdb.time.Granularity granularity14 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity15 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList16 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent17 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity14, granularity15, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList16);
        com.inspiring.pugtsdb.time.Granularity granularity18 = h2RepositoryRollUpEvent17.getTargetGranularity();
        com.inspiring.pugtsdb.time.Granularity granularity21 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity22 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList23 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent24 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity21, granularity22, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList23);
        com.inspiring.pugtsdb.time.Granularity granularity25 = h2RepositoryRollUpEvent24.getTargetGranularity();
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>> doubleAggregationMetricPointsList26 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationRollUpEvent27 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "max", granularity18, granularity25, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>>) doubleAggregationMetricPointsList26);
        java.util.Map<java.lang.String, java.lang.String> strMap28 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>>> wildcardClassMetricPointsList30 = pointRocksRepository1.selectLastMetricsPointsByNameAndAggregationAndTags("", "Interval{fromTime=1674166070495, untilTime=1700463530495}", granularity18, strMap28, (int) (byte) 10);
        com.inspiring.pugtsdb.time.Granularity granularity34 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity35 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList36 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent37 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity34, granularity35, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList36);
        com.inspiring.pugtsdb.time.Granularity granularity38 = h2RepositoryRollUpEvent37.getTargetGranularity();
        com.inspiring.pugtsdb.bean.MetricPoints<java.time.temporal.TemporalAmount> temporalAmountMetricPoints41 = pointRocksRepository1.selectMetricPointsByIdBetweenTimestamp("Tag{name='Aggregation{name', value=''sum'}'}", granularity38, (long) (short) 10, (long) (short) 1);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository44 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository45 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository44);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository46 = pointRocksRepository45.getMetricRepository();
        java.util.Map<java.lang.String, java.lang.String> strMap48 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList51 = pointRocksRepository45.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap48, (long) (short) 1, 10L);
        com.inspiring.pugtsdb.time.Granularity granularity54 = com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE;
        java.util.Map<java.lang.String, java.lang.String> strMap55 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.concurrent.ScheduledExecutorService>> scheduledExecutorServiceMetricPointsList57 = pointRocksRepository45.selectLastMetricsPointsByNameAndAggregationAndTags("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "'sum'}", granularity54, strMap55, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.DoubleMaxAggregation>> doubleMaxAggregationMetricPointsList60 = pointRocksRepository1.selectMetricsPointsByNameAndAggregationBetweenTimestamp("Interval{fromTime=1674166070495, untilTime=1700463530495}", "Tag{name='Aggregation{name', value=''sum'}'}", granularity54, (-1L), (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.exception.PugException; message: Cannot select metrics by name Interval{fromTime=1674166070495, untilTime=1700463530495}");
        } catch (com.inspiring.pugtsdb.exception.PugException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRocksRepository2);
        org.junit.Assert.assertNull(doubleListMetricPointsList7);
        org.junit.Assert.assertTrue("'" + granularity14 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity14.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity15 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity15.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity18 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity18.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity21 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity21.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity22 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity22.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity25 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity25.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNull(wildcardClassMetricPointsList30);
        org.junit.Assert.assertTrue("'" + granularity34 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity34.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity35 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity35.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity38 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity38.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNull(temporalAmountMetricPoints41);
        org.junit.Assert.assertNotNull(metricRocksRepository46);
        org.junit.Assert.assertNull(doubleListMetricPointsList51);
        org.junit.Assert.assertTrue("'" + granularity54 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE + "'", granularity54.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE));
        org.junit.Assert.assertNull(scheduledExecutorServiceMetricPointsList57);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.inspiring.pugtsdb.bean.Tag tag2 = new com.inspiring.pugtsdb.bean.Tag("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.time.Granularity granularity5 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity6 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList7 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent8 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity5, granularity6, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList7);
        com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.TagH2Repository> tagH2RepositoryMetricPoints11 = pointRocksRepository1.selectMetricPointsByIdBetweenTimestamp("Aggregation{name='avg'}", granularity5, (long) 1325048386, 1695976731791L);
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationMetric12 = null;
        com.inspiring.pugtsdb.bean.Point<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationPoint13 = null;
        com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationMetricPoint14 = new com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>(doubleAggregationMetric12, doubleAggregationPoint13);
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationMetric15 = doubleAggregationMetricPoint14.getMetric();
        // The following exception was thrown during execution in test generation
        try {
            pointRocksRepository1.upsertMetricPoint(doubleAggregationMetricPoint14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsatisfiedLinkError; message: org.rocksdb.WriteOptions.newWriteOptions()J");
        } catch (java.lang.UnsatisfiedLinkError e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity5 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity5.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity6 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity6.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNull(tagH2RepositoryMetricPoints11);
        org.junit.Assert.assertNull(doubleAggregationMetric15);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.inspiring.pugtsdb.repository.rocks.RocksRepositories rocksRepositories0 = null;
        java.time.temporal.ChronoUnit chronoUnit2 = null;
        com.inspiring.pugtsdb.time.Retention retention3 = com.inspiring.pugtsdb.time.Retention.of(1691829528911L, chronoUnit2);
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier4 = null;
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories5 = new com.inspiring.pugtsdb.repository.h2.H2Repositories(pugConnectionSupplier4);
        com.inspiring.pugtsdb.repository.PointRepository pointRepository6 = h2Repositories5.getPointRepository();
        java.time.temporal.ChronoUnit chronoUnit8 = null;
        com.inspiring.pugtsdb.time.Retention retention9 = com.inspiring.pugtsdb.time.Retention.of((long) (byte) 10, chronoUnit8);
        java.time.temporal.ChronoUnit chronoUnit11 = null;
        com.inspiring.pugtsdb.time.Retention retention12 = com.inspiring.pugtsdb.time.Retention.of((long) (byte) 10, chronoUnit11);
        com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger scheduledPointPurger13 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger((com.inspiring.pugtsdb.repository.Repositories) h2Repositories5, retention9, retention12);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.rollup.schedule.ScheduledRocksPointPurger scheduledRocksPointPurger14 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledRocksPointPurger(rocksRepositories0, retention3, retention9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(retention3);
        org.junit.Assert.assertNotNull(pointRepository6);
        org.junit.Assert.assertNotNull(retention9);
        org.junit.Assert.assertNotNull(retention12);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<byte[]> byteArrayMetricPoints8 = pointH2Repository4.selectRawMetricPointsByIdBetweenTimestamp("Interval{fromTime=1674166070495, untilTime=1700463530495}", (long) (byte) 100, (-1L));
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric Interval{fromTime=1674166070495, untilTime=1700463530495} points between 100 and -1 with statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"value\"                      FROM   metric                               INNER JOIN point                            ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository1 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository2 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList3 = metricH2Repository2.selectMetricNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool0 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories2 = new com.inspiring.pugtsdb.repository.h2.H2Repositories(pugConnectionSupplier1);
        com.inspiring.pugtsdb.repository.PointRepository pointRepository3 = h2Repositories2.getPointRepository();
        java.time.temporal.ChronoUnit chronoUnit5 = null;
        com.inspiring.pugtsdb.time.Retention retention6 = com.inspiring.pugtsdb.time.Retention.of((long) (byte) 10, chronoUnit5);
        java.time.temporal.ChronoUnit chronoUnit8 = null;
        com.inspiring.pugtsdb.time.Retention retention9 = com.inspiring.pugtsdb.time.Retention.of((long) (byte) 10, chronoUnit8);
        com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger scheduledPointPurger10 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger((com.inspiring.pugtsdb.repository.Repositories) h2Repositories2, retention6, retention9);
        java.util.concurrent.Future<?> wildcardFuture11 = scheduledThreadPool0.submit((java.lang.Runnable) scheduledPointPurger10);
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier12 = null;
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories13 = new com.inspiring.pugtsdb.repository.h2.H2Repositories(pugConnectionSupplier12);
        com.inspiring.pugtsdb.repository.PointRepository pointRepository14 = h2Repositories13.getPointRepository();
        java.time.temporal.ChronoUnit chronoUnit16 = null;
        com.inspiring.pugtsdb.time.Retention retention17 = com.inspiring.pugtsdb.time.Retention.of((long) (byte) 10, chronoUnit16);
        java.time.temporal.ChronoUnit chronoUnit19 = null;
        com.inspiring.pugtsdb.time.Retention retention20 = com.inspiring.pugtsdb.time.Retention.of((long) (byte) 10, chronoUnit19);
        com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger scheduledPointPurger21 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger((com.inspiring.pugtsdb.repository.Repositories) h2Repositories13, retention17, retention20);
        scheduledThreadPool0.execute((java.lang.Runnable) scheduledPointPurger21);
        boolean boolean23 = scheduledThreadPool0.isShutdown();
        org.junit.Assert.assertNotNull(pointRepository3);
        org.junit.Assert.assertNotNull(retention6);
        org.junit.Assert.assertNotNull(retention9);
        org.junit.Assert.assertNotNull(wildcardFuture11);
        org.junit.Assert.assertNotNull(pointRepository14);
        org.junit.Assert.assertNotNull(retention17);
        org.junit.Assert.assertNotNull(retention20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        java.sql.Clob clob3 = dummySqlConnection0.createClob();
        dummySqlConnection0.setSchema("");
        dummySqlConnection0.setClientInfo("max", "");
        java.lang.String str10 = dummySqlConnection0.nativeSQL("hi!");
        org.junit.Assert.assertNull(clob3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        byte[] byteArray1 = com.inspiring.pugtsdb.util.Bytes.fromDouble((java.lang.Double) 5.0d);
        com.inspiring.pugtsdb.util.MurmurHash3.LongPair longPair5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.util.MurmurHash3.murmurhash3_x64_128(byteArray1, 1, (-1), (int) (short) -1, longPair5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[64, 20, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories1 = new com.inspiring.pugtsdb.repository.h2.H2Repositories(pugConnectionSupplier0);
        com.inspiring.pugtsdb.repository.MetricRepository metricRepository2 = h2Repositories1.getMetricRepository();
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = metricRepository2.notExistsMetric((com.inspiring.pugtsdb.metric.Metric<java.lang.Long>) longMetric17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRepository2);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'sum'}" + "'", str6, "'sum'}");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "'sum'}" + "'", str9, "'sum'}");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Tag{name='Aggregation{name', value=''sum'}'}" + "'", str12, "Tag{name='Aggregation{name', value=''sum'}'}");
        org.junit.Assert.assertNotNull(tagArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository0 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository1 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.metric.Metric<java.lang.Object>> objMetricList3 = metricH2Repository1.selectMetricsByName("Interval{fromTime=-1690392033978951, untilTime=-1690129059378951}");
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metrics by name Interval{fromTime=-1690392033978951, untilTime=-1690129059378951} with statement  SELECT \"id\",              \"name\",            \"type\"      FROM   metric        WHERE  \"name\" = ? ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        com.inspiring.pugtsdb.rollup.aggregation.StringSumAggregation stringSumAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.StringSumAggregation();
        com.inspiring.pugtsdb.rollup.aggregation.StringMaxAggregation stringMaxAggregation1 = new com.inspiring.pugtsdb.rollup.aggregation.StringMaxAggregation();
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.lang.String str6 = stringMaxAggregation1.aggregate((java.util.List<java.lang.String>) strList4);
        java.lang.String str7 = stringSumAggregation0.aggregate((java.util.List<java.lang.String>) strList4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool0 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories2 = new com.inspiring.pugtsdb.repository.h2.H2Repositories(pugConnectionSupplier1);
        com.inspiring.pugtsdb.repository.PointRepository pointRepository3 = h2Repositories2.getPointRepository();
        java.time.temporal.ChronoUnit chronoUnit5 = null;
        com.inspiring.pugtsdb.time.Retention retention6 = com.inspiring.pugtsdb.time.Retention.of((long) (byte) 10, chronoUnit5);
        java.time.temporal.ChronoUnit chronoUnit8 = null;
        com.inspiring.pugtsdb.time.Retention retention9 = com.inspiring.pugtsdb.time.Retention.of((long) (byte) 10, chronoUnit8);
        com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger scheduledPointPurger10 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger((com.inspiring.pugtsdb.repository.Repositories) h2Repositories2, retention6, retention9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        java.time.temporal.ChronoUnit chronoUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture15 = scheduledThreadPool0.scheduleAtFixedRate((java.lang.Runnable) scheduledPointPurger10, (long) (byte) 0, timeUnit12, (long) (byte) 1, chronoUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pointRepository3);
        org.junit.Assert.assertNotNull(retention6);
        org.junit.Assert.assertNotNull(retention9);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.inspiring.pugtsdb.exception.PugIllegalArgumentException pugIllegalArgumentException2 = new com.inspiring.pugtsdb.exception.PugIllegalArgumentException("hi!");
        java.lang.Throwable[] throwableArray3 = pugIllegalArgumentException2.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.sql.PugSQLException pugSQLException4 = new com.inspiring.pugtsdb.sql.PugSQLException("max", (java.lang.Object[]) throwableArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        java.util.Map<java.lang.String, java.lang.Class<?>> strMap3 = dummySqlConnection0.getTypeMap();
        org.junit.Assert.assertNull(strMap3);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.inspiring.pugtsdb.bean.Tag tag1 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str2 = tag1.getValue();
        java.lang.String str3 = tag1.toString();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'sum'}" + "'", str2, "'sum'}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Tag{name='Aggregation{name', value=''sum'}'}" + "'", str3, "Tag{name='Aggregation{name', value=''sum'}'}");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.inspiring.pugtsdb.util.MurmurHash3.murmurhash3_x86_32((java.lang.CharSequence) "Aggregation{name='avg'}", (int) (byte) 10, (int) (short) 100, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 23");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 100);
        com.inspiring.pugtsdb.time.Interval interval2 = builder1.fromNow();
        com.inspiring.pugtsdb.time.Interval interval4 = builder1.fromMinutesAgo((long) '#');
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(interval4);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.MetricRepository>> metricRepositoryMetricPointsList8 = pointH2Repository4.selectRawMetricsPointsByNameBetweenTimestamp("sum", (long) 10, (long) 1325048386);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric sum points between 10 and 1325048386 with statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"value\"                      FROM   metric                               INNER JOIN point                            ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories1 = new com.inspiring.pugtsdb.repository.h2.H2Repositories(pugConnectionSupplier0);
        com.inspiring.pugtsdb.repository.MetricRepository metricRepository2 = h2Repositories1.getMetricRepository();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList3 = metricRepository2.selectMetricNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRepository2);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        int int0 = java.sql.Connection.TRANSACTION_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository5 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.time.Granularity granularity12 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity13 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList14 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent15 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity12, granularity13, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList14);
        com.inspiring.pugtsdb.time.Granularity granularity16 = h2RepositoryRollUpEvent15.getTargetGranularity();
        com.inspiring.pugtsdb.time.Granularity granularity19 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity20 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList21 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent22 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity19, granularity20, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList21);
        com.inspiring.pugtsdb.time.Granularity granularity23 = h2RepositoryRollUpEvent22.getTargetGranularity();
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>> doubleAggregationMetricPointsList24 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationRollUpEvent25 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "max", granularity16, granularity23, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>>) doubleAggregationMetricPointsList24);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<java.sql.Wrapper> wrapperMetricPoints27 = pointH2Repository5.selectLastMetricPointsByIdAndAggregation("Point{timestamp=32, value=[0.0, 10.0]}", "Interval{fromTime=1674166070495, untilTime=1700463530495}", granularity23, (int) 'a');
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric Point{timestamp=32, value=[0.0, 10.0]} last 97 points aggregated as Interval{fromTime=1674166070495, untilTime=1700463530495} with granularity 1mo and statement  SELECT TOP ?                                       metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1mo AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"aggregation\" = ?            ORDER BY metric.\"id\",                              point.\"timestamp\" DESC          ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity12 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity12.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity13 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity13.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity16 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity16.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity19 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity19.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity20 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity20.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity23 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity23.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository2 = pointRocksRepository1.getMetricRepository();
        com.inspiring.pugtsdb.time.Granularity granularity5 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>> wildcardClassMetricPoints7 = pointRocksRepository1.selectLastMetricPointsByIdAndAggregation("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "", granularity5, 1);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository10 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository11 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository10);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository12 = pointRocksRepository11.getMetricRepository();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList17 = pointRocksRepository11.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap14, (long) (short) 1, 10L);
        com.inspiring.pugtsdb.time.Granularity granularity20 = com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE;
        java.util.Map<java.lang.String, java.lang.String> strMap21 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.concurrent.ScheduledExecutorService>> scheduledExecutorServiceMetricPointsList23 = pointRocksRepository11.selectLastMetricsPointsByNameAndAggregationAndTags("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "'sum'}", granularity20, strMap21, (int) (short) 1);
        com.inspiring.pugtsdb.bean.Tag tag26 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str27 = tag26.getValue();
        com.inspiring.pugtsdb.bean.Tag tag29 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str30 = tag29.getValue();
        com.inspiring.pugtsdb.bean.Tag tag32 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str33 = tag32.toString();
        com.inspiring.pugtsdb.bean.Tag[] tagArray34 = new com.inspiring.pugtsdb.bean.Tag[] { tag26, tag29, tag32 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList35 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList35, tagArray34);
        java.util.Map<java.lang.String, java.lang.String> strMap37 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList35);
        com.inspiring.pugtsdb.metric.LongMetric longMetric38 = new com.inspiring.pugtsdb.metric.LongMetric("Aggregation{name='sum'}", strMap37);
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList40 = pointRocksRepository1.selectLastMetricsPointsByNameAndAggregationAndTags("", "Interval{fromTime=1674166070495, untilTime=1700463530495}", granularity20, strMap37, 1);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository43 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository44 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository43);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository45 = pointRocksRepository44.getMetricRepository();
        com.inspiring.pugtsdb.time.Granularity granularity48 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>> wildcardClassMetricPoints50 = pointRocksRepository44.selectLastMetricPointsByIdAndAggregation("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "", granularity48, 1);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository51 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository52 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository51);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository53 = pointRocksRepository52.getMetricRepository();
        java.util.Map<java.lang.String, java.lang.String> strMap55 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList58 = pointRocksRepository52.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap55, (long) (short) 1, 10L);
        com.inspiring.pugtsdb.time.Granularity granularity60 = com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE;
        java.util.Map<java.lang.String, java.lang.String> strMap61 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.List<java.lang.Double>>> doubleListMetricPointsList63 = pointRocksRepository52.selectLastMetricsPointsByNameAndTags("MetricPoint{metric=null, point=null}", granularity60, strMap61, (int) (byte) 10);
        java.util.Map<java.lang.String, java.lang.String> strMap65 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.rocks.PointRocksRepository>> pointRocksRepositoryMetricPointsList68 = pointRocksRepository52.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("MetricPoint{metric=null, point=null}", strMap65, (long) (byte) -1, (long) '4');
        com.inspiring.pugtsdb.time.Granularity granularity70 = com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE;
        com.inspiring.pugtsdb.bean.Tag tag73 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str74 = tag73.getValue();
        com.inspiring.pugtsdb.bean.Tag tag76 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str77 = tag76.getValue();
        com.inspiring.pugtsdb.bean.Tag tag79 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str80 = tag79.toString();
        com.inspiring.pugtsdb.bean.Tag[] tagArray81 = new com.inspiring.pugtsdb.bean.Tag[] { tag73, tag76, tag79 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList82 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList82, tagArray81);
        java.util.Map<java.lang.String, java.lang.String> strMap84 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList82);
        com.inspiring.pugtsdb.metric.LongMetric longMetric85 = new com.inspiring.pugtsdb.metric.LongMetric("Aggregation{name='sum'}", strMap84);
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>>> wildcardClassMetricPointsList88 = pointRocksRepository52.selectMetricsPointsByNameAndTagsBetweenTimestamp("MetricPoint{metric=null, point=null}", granularity70, strMap84, (long) (short) -1, (long) (byte) 1);
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>>> h2RepositoryRollUpEventMetricPointsList90 = pointRocksRepository1.selectLastMetricsPointsByNameAndAggregationAndTags("hi!", "hi!", granularity48, strMap84, (int) (short) 10);
        org.junit.Assert.assertNotNull(metricRocksRepository2);
        org.junit.Assert.assertTrue("'" + granularity5 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity5.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNull(wildcardClassMetricPoints7);
        org.junit.Assert.assertNotNull(metricRocksRepository12);
        org.junit.Assert.assertNull(doubleListMetricPointsList17);
        org.junit.Assert.assertTrue("'" + granularity20 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE + "'", granularity20.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE));
        org.junit.Assert.assertNull(scheduledExecutorServiceMetricPointsList23);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "'sum'}" + "'", str27, "'sum'}");
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "'sum'}" + "'", str30, "'sum'}");
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Tag{name='Aggregation{name', value=''sum'}'}" + "'", str33, "Tag{name='Aggregation{name', value=''sum'}'}");
        org.junit.Assert.assertNotNull(tagArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNull(doubleListMetricPointsList40);
        org.junit.Assert.assertNotNull(metricRocksRepository45);
        org.junit.Assert.assertTrue("'" + granularity48 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity48.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNull(wildcardClassMetricPoints50);
        org.junit.Assert.assertNotNull(metricRocksRepository53);
        org.junit.Assert.assertNull(doubleListMetricPointsList58);
        org.junit.Assert.assertTrue("'" + granularity60 + "' != '" + com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE + "'", granularity60.equals(com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE));
        org.junit.Assert.assertNull(doubleListMetricPointsList63);
        org.junit.Assert.assertNull(pointRocksRepositoryMetricPointsList68);
        org.junit.Assert.assertTrue("'" + granularity70 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE + "'", granularity70.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE));
        org.junit.Assert.assertNotNull(tag73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "'sum'}" + "'", str74, "'sum'}");
        org.junit.Assert.assertNotNull(tag76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "'sum'}" + "'", str77, "'sum'}");
        org.junit.Assert.assertNotNull(tag79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Tag{name='Aggregation{name', value=''sum'}'}" + "'", str80, "Tag{name='Aggregation{name', value=''sum'}'}");
        org.junit.Assert.assertNotNull(tagArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(strMap84);
        org.junit.Assert.assertNull(wildcardClassMetricPointsList88);
        org.junit.Assert.assertNull(h2RepositoryRollUpEventMetricPointsList90);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories1 = new com.inspiring.pugtsdb.repository.h2.H2Repositories(pugConnectionSupplier0);
        com.inspiring.pugtsdb.repository.PointRepository pointRepository2 = h2Repositories1.getPointRepository();
        java.time.temporal.ChronoUnit chronoUnit4 = null;
        com.inspiring.pugtsdb.time.Retention retention5 = com.inspiring.pugtsdb.time.Retention.of((long) (byte) 10, chronoUnit4);
        java.time.temporal.ChronoUnit chronoUnit7 = null;
        com.inspiring.pugtsdb.time.Retention retention8 = com.inspiring.pugtsdb.time.Retention.of((long) (byte) 10, chronoUnit7);
        com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger scheduledPointPurger9 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger((com.inspiring.pugtsdb.repository.Repositories) h2Repositories1, retention5, retention8);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository10 = h2Repositories1.getTagRepository();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap12 = tagRepository10.selectTagsByMetricId("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pointRepository2);
        org.junit.Assert.assertNotNull(retention5);
        org.junit.Assert.assertNotNull(retention8);
        org.junit.Assert.assertNotNull(tagRepository10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        java.time.ZonedDateTime zonedDateTime0 = null;
        java.time.temporal.ChronoUnit chronoUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime2 = com.inspiring.pugtsdb.util.Temporals.truncate(zonedDateTime0, chronoUnit1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        boolean boolean1 = com.inspiring.pugtsdb.util.Strings.isNotBlank((java.lang.CharSequence) "'sum'}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        java.sql.Savepoint savepoint1 = null;
        dummySqlConnection0.rollback(savepoint1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.inspiring.pugtsdb.bean.Tag tag1 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str2 = tag1.toString();
        java.lang.String str3 = tag1.getName();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Tag{name='Aggregation{name', value=''sum'}'}" + "'", str2, "Tag{name='Aggregation{name', value=''sum'}'}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aggregation{name" + "'", str3, "Aggregation{name");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository6 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository7 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository6);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository8 = pointRocksRepository7.getMetricRepository();
        com.inspiring.pugtsdb.time.Granularity granularity11 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>> wildcardClassMetricPoints13 = pointRocksRepository7.selectLastMetricPointsByIdAndAggregation("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "", granularity11, 1);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository16 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository17 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository16);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository18 = pointRocksRepository17.getMetricRepository();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList23 = pointRocksRepository17.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap20, (long) (short) 1, 10L);
        com.inspiring.pugtsdb.time.Granularity granularity26 = com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE;
        java.util.Map<java.lang.String, java.lang.String> strMap27 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.concurrent.ScheduledExecutorService>> scheduledExecutorServiceMetricPointsList29 = pointRocksRepository17.selectLastMetricsPointsByNameAndAggregationAndTags("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "'sum'}", granularity26, strMap27, (int) (short) 1);
        com.inspiring.pugtsdb.bean.Tag tag32 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str33 = tag32.getValue();
        com.inspiring.pugtsdb.bean.Tag tag35 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str36 = tag35.getValue();
        com.inspiring.pugtsdb.bean.Tag tag38 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str39 = tag38.toString();
        com.inspiring.pugtsdb.bean.Tag[] tagArray40 = new com.inspiring.pugtsdb.bean.Tag[] { tag32, tag35, tag38 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList41 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList41, tagArray40);
        java.util.Map<java.lang.String, java.lang.String> strMap43 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList41);
        com.inspiring.pugtsdb.metric.LongMetric longMetric44 = new com.inspiring.pugtsdb.metric.LongMetric("Aggregation{name='sum'}", strMap43);
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList46 = pointRocksRepository7.selectLastMetricsPointsByNameAndAggregationAndTags("", "Interval{fromTime=1674166070495, untilTime=1700463530495}", granularity26, strMap43, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>> doubleAggregationMetricPointsList49 = pointH2Repository4.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("max", strMap43, 0L, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric max points between 0 and 10 with tags {Aggregation{name='sum'}} and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"value\"                      FROM   metric                               INNER JOIN point                            ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              INNER JOIN metric_tag AS t0              ON     metric.\"id\" = t0.\"metric_id\"  AND    t0.\"tag_name\" = ?               AND    t0.\"tag_value\" = ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRocksRepository8);
        org.junit.Assert.assertTrue("'" + granularity11 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity11.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNull(wildcardClassMetricPoints13);
        org.junit.Assert.assertNotNull(metricRocksRepository18);
        org.junit.Assert.assertNull(doubleListMetricPointsList23);
        org.junit.Assert.assertTrue("'" + granularity26 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE + "'", granularity26.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE));
        org.junit.Assert.assertNull(scheduledExecutorServiceMetricPointsList29);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "'sum'}" + "'", str33, "'sum'}");
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "'sum'}" + "'", str36, "'sum'}");
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Tag{name='Aggregation{name', value=''sum'}'}" + "'", str39, "Tag{name='Aggregation{name', value=''sum'}'}");
        org.junit.Assert.assertNotNull(tagArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNull(doubleListMetricPointsList46);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.inspiring.pugtsdb.metric.Metric<java.sql.Connection> connectionMetric0 = null;
        com.inspiring.pugtsdb.bean.Point<java.sql.Connection> connectionPoint1 = null;
        com.inspiring.pugtsdb.bean.MetricPoint<java.sql.Connection> connectionMetricPoint2 = new com.inspiring.pugtsdb.bean.MetricPoint<java.sql.Connection>(connectionMetric0, connectionPoint1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository5 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository8 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository9 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository8);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository10 = pointRocksRepository9.getMetricRepository();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList15 = pointRocksRepository9.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap12, (long) (short) 1, 10L);
        com.inspiring.pugtsdb.time.Granularity granularity17 = com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.List<java.lang.Double>>> doubleListMetricPointsList20 = pointRocksRepository9.selectLastMetricsPointsByNameAndTags("MetricPoint{metric=null, point=null}", granularity17, strMap18, (int) (byte) 10);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository23 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository24 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository23);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository25 = pointRocksRepository24.getMetricRepository();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList30 = pointRocksRepository24.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap27, (long) (short) 1, 10L);
        com.inspiring.pugtsdb.time.Granularity granularity37 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity38 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList39 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent40 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity37, granularity38, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList39);
        com.inspiring.pugtsdb.time.Granularity granularity41 = h2RepositoryRollUpEvent40.getTargetGranularity();
        com.inspiring.pugtsdb.time.Granularity granularity44 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity45 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList46 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent47 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity44, granularity45, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList46);
        com.inspiring.pugtsdb.time.Granularity granularity48 = h2RepositoryRollUpEvent47.getTargetGranularity();
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>> doubleAggregationMetricPointsList49 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationRollUpEvent50 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "max", granularity41, granularity48, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>>) doubleAggregationMetricPointsList49);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>>> wildcardClassMetricPointsList53 = pointRocksRepository24.selectLastMetricsPointsByNameAndAggregationAndTags("", "Interval{fromTime=1674166070495, untilTime=1700463530495}", granularity41, strMap51, (int) (byte) 10);
        com.inspiring.pugtsdb.time.Granularity granularity57 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity58 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList59 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent60 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity57, granularity58, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList59);
        com.inspiring.pugtsdb.time.Granularity granularity61 = h2RepositoryRollUpEvent60.getTargetGranularity();
        com.inspiring.pugtsdb.bean.MetricPoints<java.time.temporal.TemporalAmount> temporalAmountMetricPoints64 = pointRocksRepository24.selectMetricPointsByIdBetweenTimestamp("Tag{name='Aggregation{name', value=''sum'}'}", granularity61, (long) (short) 10, (long) (short) 1);
        com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.util.GlobPattern> globPatternMetricPoints66 = pointRocksRepository9.selectLastMetricPointsByIdAndAggregation("Interval{fromTime=1674166070495, untilTime=1700463530495}", "hi!", granularity61, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long67 = pointH2Repository5.selectMaxPointTimestampByNameAndAggregation("hi!", "100", granularity61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRocksRepository10);
        org.junit.Assert.assertNull(doubleListMetricPointsList15);
        org.junit.Assert.assertTrue("'" + granularity17 + "' != '" + com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE + "'", granularity17.equals(com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE));
        org.junit.Assert.assertNull(doubleListMetricPointsList20);
        org.junit.Assert.assertNotNull(metricRocksRepository25);
        org.junit.Assert.assertNull(doubleListMetricPointsList30);
        org.junit.Assert.assertTrue("'" + granularity37 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity37.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity38 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity38.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity41 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity41.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity44 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity44.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity45 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity45.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity48 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity48.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNull(wildcardClassMetricPointsList53);
        org.junit.Assert.assertTrue("'" + granularity57 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity57.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity58 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity58.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity61 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity61.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNull(temporalAmountMetricPoints64);
        org.junit.Assert.assertNull(globPatternMetricPoints66);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.until((long) '#');
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastDays((long) 100);
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        java.sql.Clob clob3 = dummySqlConnection0.createClob();
        java.sql.Clob clob4 = dummySqlConnection0.createClob();
        boolean boolean5 = dummySqlConnection0.getAutoCommit();
        java.sql.Statement statement6 = dummySqlConnection0.createStatement();
        org.junit.Assert.assertNull(clob3);
        org.junit.Assert.assertNull(clob4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(statement6);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        java.util.Properties properties3 = null;
        dummySqlConnection0.setClientInfo(properties3);
        java.lang.String str6 = dummySqlConnection0.nativeSQL("sum");
        dummySqlConnection0.rollback();
        dummySqlConnection0.close();
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        java.sql.Statement statement5 = dummySqlConnection0.createStatement((int) (short) 1, 1);
        java.sql.Clob clob6 = dummySqlConnection0.createClob();
        dummySqlConnection0.close();
        boolean boolean9 = dummySqlConnection0.isValid((int) 'a');
        org.junit.Assert.assertNull(statement5);
        org.junit.Assert.assertNull(clob6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 10);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromMinutesAgo((long) (byte) 100);
        long long4 = interval3.getFromTime();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1674166073724L + "'", long4 == 1674166073724L);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.inspiring.pugtsdb.time.Granularity granularity2 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity3 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList4 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent5 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity2, granularity3, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList4);
        java.lang.String str6 = h2RepositoryRollUpEvent5.getMetricName();
        org.junit.Assert.assertTrue("'" + granularity2 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity2.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity3 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity3.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Aggregation{name='or'}" + "'", str6, "Aggregation{name='or'}");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories1 = new com.inspiring.pugtsdb.repository.h2.H2Repositories(pugConnectionSupplier0);
        java.time.temporal.ChronoUnit chronoUnit3 = null;
        com.inspiring.pugtsdb.time.Retention retention4 = new com.inspiring.pugtsdb.time.Retention((long) 100, chronoUnit3);
        java.time.temporal.ChronoUnit chronoUnit6 = null;
        com.inspiring.pugtsdb.time.Retention retention7 = com.inspiring.pugtsdb.time.Retention.of(1691829528911L, chronoUnit6);
        com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger scheduledPointPurger8 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger((com.inspiring.pugtsdb.repository.Repositories) h2Repositories1, retention4, retention7);
        java.time.temporal.Temporal temporal9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal10 = retention7.subtractFrom(temporal9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(retention7);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.repository.rocks.bean.PointId pointId2 = com.inspiring.pugtsdb.repository.rocks.bean.PointId.of("hi!", "Aggregation{name");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Aggregation{name\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository1 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository(pugConnectionSupplier0);
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository2 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository1);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        int int0 = java.sql.Connection.TRANSACTION_SERIALIZABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository5 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.time.Granularity granularity9 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity10 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList11 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent12 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity9, granularity10, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList11);
        com.inspiring.pugtsdb.time.Interval.Builder builder13 = com.inspiring.pugtsdb.time.Interval.ofLast(granularity9);
        com.inspiring.pugtsdb.bean.Tag tag15 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str16 = tag15.getValue();
        com.inspiring.pugtsdb.bean.Tag tag18 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str19 = tag18.getValue();
        com.inspiring.pugtsdb.bean.Tag tag21 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str22 = tag21.toString();
        com.inspiring.pugtsdb.bean.Tag[] tagArray23 = new com.inspiring.pugtsdb.bean.Tag[] { tag15, tag18, tag21 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList24 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList24, tagArray23);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList24);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.util.Temporals>> temporalsMetricPointsList28 = pointH2Repository5.selectLastMetricsPointsByNameAndTags("Aggregation{name='avg'}", granularity9, strMap26, (int) '4');
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric Aggregation{name='avg'} last 52 points with granularity 1y tags {Aggregation{name='sum'}} and statement  SELECT TOP ?                                       metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1y AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  INNER JOIN metric_tag AS t0              ON     metric.\"id\" = t0.\"metric_id\"  AND    t0.\"tag_name\" = ?               AND    t0.\"tag_value\" = ?              ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\" DESC         ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity9 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity9.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity10 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity10.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "'sum'}" + "'", str16, "'sum'}");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "'sum'}" + "'", str19, "'sum'}");
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Tag{name='Aggregation{name', value=''sum'}'}" + "'", str22, "Tag{name='Aggregation{name', value=''sum'}'}");
        org.junit.Assert.assertNotNull(tagArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        java.sql.Clob clob3 = dummySqlConnection0.createClob();
        dummySqlConnection0.setSchema("");
        dummySqlConnection0.setHoldability((int) '4');
        org.junit.Assert.assertNull(clob3);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        java.sql.Clob clob3 = dummySqlConnection0.createClob();
        dummySqlConnection0.setSchema("");
        java.lang.String str7 = dummySqlConnection0.nativeSQL("hi!");
        java.lang.String str8 = dummySqlConnection0.getSchema();
        dummySqlConnection0.setTransactionIsolation((int) (byte) 0);
        java.lang.String str12 = dummySqlConnection0.getClientInfo("Interval{fromTime=1674166070495, untilTime=1700463530495}");
        org.junit.Assert.assertNull(clob3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.inspiring.pugtsdb.time.Interval interval2 = new com.inspiring.pugtsdb.time.Interval((long) (short) 0, 718747495729L);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        byte[] byteArray1 = com.inspiring.pugtsdb.util.Bytes.fromDouble((java.lang.Double) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            long long3 = com.inspiring.pugtsdb.util.MurmurHash3.getLongLittleEndian(byteArray1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-65, -16, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        java.sql.Clob clob3 = dummySqlConnection0.createClob();
        java.sql.PreparedStatement preparedStatement8 = dummySqlConnection0.prepareStatement("Aggregation{name='avg'}", (int) '4', (int) '4', (-1));
        dummySqlConnection0.rollback();
        org.junit.Assert.assertNull(clob3);
        org.junit.Assert.assertNull(preparedStatement8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        java.sql.Clob clob3 = dummySqlConnection0.createClob();
        java.sql.PreparedStatement preparedStatement7 = dummySqlConnection0.prepareStatement("Aggregation{name='max'}", (int) '4', (int) (short) -1);
        dummySqlConnection0.rollback();
        dummySqlConnection0.setClientInfo("sum", "max");
        dummySqlConnection0.setCatalog("max");
        dummySqlConnection0.setAutoCommit(false);
        org.junit.Assert.assertNull(clob3);
        org.junit.Assert.assertNull(preparedStatement7);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.inspiring.pugtsdb.exception.PugIllegalArgumentException pugIllegalArgumentException1 = new com.inspiring.pugtsdb.exception.PugIllegalArgumentException("hi!");
        com.inspiring.pugtsdb.exception.PugIllegalArgumentException pugIllegalArgumentException3 = new com.inspiring.pugtsdb.exception.PugIllegalArgumentException("hi!");
        pugIllegalArgumentException1.addSuppressed((java.lang.Throwable) pugIllegalArgumentException3);
        java.lang.Throwable[] throwableArray5 = pugIllegalArgumentException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        boolean boolean1 = com.inspiring.pugtsdb.util.Collections.isNotEmpty(strMap0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        long long1 = com.inspiring.pugtsdb.util.MurmurHash3.fmix64(10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7233188113542599437L + "'", long1 == 7233188113542599437L);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository2 = pointRocksRepository1.getMetricRepository();
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.time.Interval> intervalMetricPoints6 = pointRocksRepository1.selectRawMetricPointsByIdBetweenTimestamp("Aggregation{name='or'}", (long) (short) -1, 1691829528911L);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.exception.PugNotImplementedException; message: selectRawMetricPointsByIdBetweenTimestamp(int metricId, long fromInclusiveTimestamp, long toExclusiveTimestamp)");
        } catch (com.inspiring.pugtsdb.exception.PugNotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRocksRepository2);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        java.util.Properties properties3 = null;
        dummySqlConnection0.setClientInfo(properties3);
        java.sql.Savepoint savepoint6 = dummySqlConnection0.setSavepoint("");
        org.junit.Assert.assertNull(savepoint6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationMetric5 = null;
        com.inspiring.pugtsdb.bean.Point<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationPoint6 = null;
        com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationMetricPoint7 = new com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>(doubleAggregationMetric5, doubleAggregationPoint6);
        // The following exception was thrown during execution in test generation
        try {
            pointH2Repository4.upsertMetricPoint(doubleAggregationMetricPoint7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.time.Granularity granularity5 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity6 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList7 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent8 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity5, granularity6, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList7);
        com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.TagH2Repository> tagH2RepositoryMetricPoints11 = pointRocksRepository1.selectMetricPointsByIdBetweenTimestamp("Aggregation{name='avg'}", granularity5, (long) 1325048386, 1695976731791L);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository13 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository14 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository13);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository15 = pointRocksRepository14.getMetricRepository();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList20 = pointRocksRepository14.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap17, (long) (short) 1, 10L);
        com.inspiring.pugtsdb.time.Granularity granularity22 = com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.List<java.lang.Double>>> doubleListMetricPointsList25 = pointRocksRepository14.selectLastMetricsPointsByNameAndTags("MetricPoint{metric=null, point=null}", granularity22, strMap23, (int) (byte) 10);
        java.util.Map<java.lang.String, java.lang.String> strMap27 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.rocks.PointRocksRepository>> pointRocksRepositoryMetricPointsList30 = pointRocksRepository14.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("MetricPoint{metric=null, point=null}", strMap27, (long) (byte) -1, (long) '4');
        com.inspiring.pugtsdb.time.Granularity granularity32 = com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE;
        com.inspiring.pugtsdb.bean.Tag tag35 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str36 = tag35.getValue();
        com.inspiring.pugtsdb.bean.Tag tag38 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str39 = tag38.getValue();
        com.inspiring.pugtsdb.bean.Tag tag41 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str42 = tag41.toString();
        com.inspiring.pugtsdb.bean.Tag[] tagArray43 = new com.inspiring.pugtsdb.bean.Tag[] { tag35, tag38, tag41 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList44 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList44, tagArray43);
        java.util.Map<java.lang.String, java.lang.String> strMap46 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList44);
        com.inspiring.pugtsdb.metric.LongMetric longMetric47 = new com.inspiring.pugtsdb.metric.LongMetric("Aggregation{name='sum'}", strMap46);
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>>> wildcardClassMetricPointsList50 = pointRocksRepository14.selectMetricsPointsByNameAndTagsBetweenTimestamp("MetricPoint{metric=null, point=null}", granularity32, strMap46, (long) (short) -1, (long) (byte) 1);
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.PointRepository>> pointRepositoryMetricPointsList53 = pointRocksRepository1.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("'sum'}", strMap46, 10L, (long) ' ');
        boolean boolean54 = com.inspiring.pugtsdb.util.Collections.isEmpty(strMap46);
        org.junit.Assert.assertTrue("'" + granularity5 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity5.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity6 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity6.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNull(tagH2RepositoryMetricPoints11);
        org.junit.Assert.assertNotNull(metricRocksRepository15);
        org.junit.Assert.assertNull(doubleListMetricPointsList20);
        org.junit.Assert.assertTrue("'" + granularity22 + "' != '" + com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE + "'", granularity22.equals(com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE));
        org.junit.Assert.assertNull(doubleListMetricPointsList25);
        org.junit.Assert.assertNull(pointRocksRepositoryMetricPointsList30);
        org.junit.Assert.assertTrue("'" + granularity32 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE + "'", granularity32.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE));
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "'sum'}" + "'", str36, "'sum'}");
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "'sum'}" + "'", str39, "'sum'}");
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Tag{name='Aggregation{name', value=''sum'}'}" + "'", str42, "Tag{name='Aggregation{name', value=''sum'}'}");
        org.junit.Assert.assertNotNull(tagArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNull(wildcardClassMetricPointsList50);
        org.junit.Assert.assertNull(pointRepositoryMetricPointsList53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastYears(0L);
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository2 = pointRocksRepository1.getMetricRepository();
        com.inspiring.pugtsdb.time.Granularity granularity5 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>> wildcardClassMetricPoints7 = pointRocksRepository1.selectLastMetricPointsByIdAndAggregation("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "", granularity5, 1);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository10 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository11 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository10);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository12 = pointRocksRepository11.getMetricRepository();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList17 = pointRocksRepository11.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap14, (long) (short) 1, 10L);
        com.inspiring.pugtsdb.time.Granularity granularity20 = com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE;
        java.util.Map<java.lang.String, java.lang.String> strMap21 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.concurrent.ScheduledExecutorService>> scheduledExecutorServiceMetricPointsList23 = pointRocksRepository11.selectLastMetricsPointsByNameAndAggregationAndTags("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "'sum'}", granularity20, strMap21, (int) (short) 1);
        com.inspiring.pugtsdb.bean.Tag tag26 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str27 = tag26.getValue();
        com.inspiring.pugtsdb.bean.Tag tag29 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str30 = tag29.getValue();
        com.inspiring.pugtsdb.bean.Tag tag32 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str33 = tag32.toString();
        com.inspiring.pugtsdb.bean.Tag[] tagArray34 = new com.inspiring.pugtsdb.bean.Tag[] { tag26, tag29, tag32 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList35 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList35, tagArray34);
        java.util.Map<java.lang.String, java.lang.String> strMap37 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList35);
        com.inspiring.pugtsdb.metric.LongMetric longMetric38 = new com.inspiring.pugtsdb.metric.LongMetric("Aggregation{name='sum'}", strMap37);
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList40 = pointRocksRepository1.selectLastMetricsPointsByNameAndAggregationAndTags("", "Interval{fromTime=1674166070495, untilTime=1700463530495}", granularity20, strMap37, 1);
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationMetric41 = null;
        com.inspiring.pugtsdb.bean.Point<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationPoint42 = null;
        com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationMetricPoint43 = new com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>(doubleAggregationMetric41, doubleAggregationPoint42);
        // The following exception was thrown during execution in test generation
        try {
            pointRocksRepository1.upsertMetricPoint(doubleAggregationMetricPoint43);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsatisfiedLinkError; message: org.rocksdb.WriteOptions.newWriteOptions()J");
        } catch (java.lang.UnsatisfiedLinkError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRocksRepository2);
        org.junit.Assert.assertTrue("'" + granularity5 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity5.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNull(wildcardClassMetricPoints7);
        org.junit.Assert.assertNotNull(metricRocksRepository12);
        org.junit.Assert.assertNull(doubleListMetricPointsList17);
        org.junit.Assert.assertTrue("'" + granularity20 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE + "'", granularity20.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE));
        org.junit.Assert.assertNull(scheduledExecutorServiceMetricPointsList23);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "'sum'}" + "'", str27, "'sum'}");
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "'sum'}" + "'", str30, "'sum'}");
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Tag{name='Aggregation{name', value=''sum'}'}" + "'", str33, "Tag{name='Aggregation{name', value=''sum'}'}");
        org.junit.Assert.assertNotNull(tagArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNull(doubleListMetricPointsList40);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.inspiring.pugtsdb.time.Granularity granularity0 = com.inspiring.pugtsdb.time.Granularity.ONE_SECOND;
        org.junit.Assert.assertTrue("'" + granularity0 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_SECOND + "'", granularity0.equals(com.inspiring.pugtsdb.time.Granularity.ONE_SECOND));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories1 = new com.inspiring.pugtsdb.repository.h2.H2Repositories(pugConnectionSupplier0);
        java.time.temporal.ChronoUnit chronoUnit3 = null;
        com.inspiring.pugtsdb.time.Retention retention4 = new com.inspiring.pugtsdb.time.Retention((long) 100, chronoUnit3);
        java.time.temporal.ChronoUnit chronoUnit6 = null;
        com.inspiring.pugtsdb.time.Retention retention7 = com.inspiring.pugtsdb.time.Retention.of(1691829528911L, chronoUnit6);
        com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger scheduledPointPurger8 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger((com.inspiring.pugtsdb.repository.Repositories) h2Repositories1, retention4, retention7);
        java.time.temporal.Temporal temporal9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal10 = retention4.addTo(temporal9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(retention7);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationMetric0 = null;
        com.inspiring.pugtsdb.bean.Point<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationPoint1 = null;
        com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationMetricPoint2 = new com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>(doubleAggregationMetric0, doubleAggregationPoint1);
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationMetric3 = doubleAggregationMetricPoint2.getMetric();
        java.lang.String str4 = doubleAggregationMetricPoint2.toString();
        org.junit.Assert.assertNull(doubleAggregationMetric3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MetricPoint{metric=null, point=null}" + "'", str4, "MetricPoint{metric=null, point=null}");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository2 = pointRocksRepository1.getMetricRepository();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList7 = pointRocksRepository1.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap4, (long) (short) 1, 10L);
        com.inspiring.pugtsdb.time.Granularity granularity10 = com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.concurrent.ScheduledExecutorService>> scheduledExecutorServiceMetricPointsList13 = pointRocksRepository1.selectLastMetricsPointsByNameAndAggregationAndTags("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "'sum'}", granularity10, strMap11, (int) (short) 1);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository16 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository17 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository16);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository18 = pointRocksRepository17.getMetricRepository();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList23 = pointRocksRepository17.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap20, (long) (short) 1, 10L);
        com.inspiring.pugtsdb.time.Granularity granularity25 = com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE;
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.List<java.lang.Double>>> doubleListMetricPointsList28 = pointRocksRepository17.selectLastMetricsPointsByNameAndTags("MetricPoint{metric=null, point=null}", granularity25, strMap26, (int) (byte) 10);
        java.util.Map<java.lang.String, java.lang.String> strMap30 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.rocks.PointRocksRepository>> pointRocksRepositoryMetricPointsList33 = pointRocksRepository17.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("MetricPoint{metric=null, point=null}", strMap30, (long) (byte) -1, (long) '4');
        com.inspiring.pugtsdb.time.Granularity granularity35 = com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE;
        com.inspiring.pugtsdb.bean.Tag tag38 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str39 = tag38.getValue();
        com.inspiring.pugtsdb.bean.Tag tag41 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str42 = tag41.getValue();
        com.inspiring.pugtsdb.bean.Tag tag44 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str45 = tag44.toString();
        com.inspiring.pugtsdb.bean.Tag[] tagArray46 = new com.inspiring.pugtsdb.bean.Tag[] { tag38, tag41, tag44 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList47 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList47, tagArray46);
        java.util.Map<java.lang.String, java.lang.String> strMap49 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList47);
        com.inspiring.pugtsdb.metric.LongMetric longMetric50 = new com.inspiring.pugtsdb.metric.LongMetric("Aggregation{name='sum'}", strMap49);
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>>> wildcardClassMetricPointsList53 = pointRocksRepository17.selectMetricsPointsByNameAndTagsBetweenTimestamp("MetricPoint{metric=null, point=null}", granularity35, strMap49, (long) (short) -1, (long) (byte) 1);
        com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.time.Interval.Builder> builderMetricPoints55 = pointRocksRepository1.selectLastMetricPointsByIdAndAggregation("Aggregation{name='avg'}", "MetricPoint{metric=null, point=null}", granularity35, (int) (byte) 10);
        org.junit.Assert.assertNotNull(metricRocksRepository2);
        org.junit.Assert.assertNull(doubleListMetricPointsList7);
        org.junit.Assert.assertTrue("'" + granularity10 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE + "'", granularity10.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE));
        org.junit.Assert.assertNull(scheduledExecutorServiceMetricPointsList13);
        org.junit.Assert.assertNotNull(metricRocksRepository18);
        org.junit.Assert.assertNull(doubleListMetricPointsList23);
        org.junit.Assert.assertTrue("'" + granularity25 + "' != '" + com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE + "'", granularity25.equals(com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE));
        org.junit.Assert.assertNull(doubleListMetricPointsList28);
        org.junit.Assert.assertNull(pointRocksRepositoryMetricPointsList33);
        org.junit.Assert.assertTrue("'" + granularity35 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE + "'", granularity35.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE));
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "'sum'}" + "'", str39, "'sum'}");
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "'sum'}" + "'", str42, "'sum'}");
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Tag{name='Aggregation{name', value=''sum'}'}" + "'", str45, "Tag{name='Aggregation{name', value=''sum'}'}");
        org.junit.Assert.assertNotNull(tagArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertNull(wildcardClassMetricPointsList53);
        org.junit.Assert.assertNull(builderMetricPoints55);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.time.temporal.ChronoUnit chronoUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.time.Interval.Builder builder2 = com.inspiring.pugtsdb.time.Interval.ofLast((long) ' ', chronoUnit1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories1 = new com.inspiring.pugtsdb.repository.h2.H2Repositories(pugConnectionSupplier0);
        com.inspiring.pugtsdb.repository.PointRepository pointRepository2 = h2Repositories1.getPointRepository();
        java.time.temporal.ChronoUnit chronoUnit4 = null;
        com.inspiring.pugtsdb.time.Retention retention5 = com.inspiring.pugtsdb.time.Retention.of((long) (byte) 10, chronoUnit4);
        java.time.temporal.ChronoUnit chronoUnit7 = null;
        com.inspiring.pugtsdb.time.Retention retention8 = com.inspiring.pugtsdb.time.Retention.of((long) (byte) 10, chronoUnit7);
        com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger scheduledPointPurger9 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger((com.inspiring.pugtsdb.repository.Repositories) h2Repositories1, retention5, retention8);
        com.inspiring.pugtsdb.repository.TagRepository tagRepository10 = h2Repositories1.getTagRepository();
        com.inspiring.pugtsdb.repository.PointRepository pointRepository11 = h2Repositories1.getPointRepository();
        com.inspiring.pugtsdb.repository.TagRepository tagRepository12 = h2Repositories1.getTagRepository();
        org.junit.Assert.assertNotNull(pointRepository2);
        org.junit.Assert.assertNotNull(retention5);
        org.junit.Assert.assertNotNull(retention8);
        org.junit.Assert.assertNotNull(tagRepository10);
        org.junit.Assert.assertNotNull(pointRepository11);
        org.junit.Assert.assertNotNull(tagRepository12);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        boolean boolean3 = dummySqlConnection0.getAutoCommit();
        java.sql.Statement statement6 = dummySqlConnection0.createStatement((int) 'a', 13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(statement6);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        int int4 = com.inspiring.pugtsdb.util.MurmurHash3.murmurhash3_x86_32((java.lang.CharSequence) "Aggregation{name='avg'}", (int) (short) 1, (-1), (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 33005907 + "'", int4 == 33005907);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastHours((long) 1325048386);
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.rollup.aggregation.StringMaxAggregation> stringMaxAggregationMetric2 = metricRocksRepository0.selectMetricById("Point{timestamp=32, value=[0.0, 10.0]}");
        com.inspiring.pugtsdb.sql.PugConnection pugConnection3 = metricRocksRepository0.getConnection();
        pugConnection3.setSchema("MetricPoint{metric=null, point=null}");
        boolean boolean6 = pugConnection3.getAutoCommit();
        int int7 = pugConnection3.getHoldability();
        org.junit.Assert.assertNull(stringMaxAggregationMetric2);
        org.junit.Assert.assertNotNull(pugConnection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        java.time.temporal.ChronoUnit chronoUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.time.Interval.Builder builder2 = com.inspiring.pugtsdb.time.Interval.ofLast((long) (byte) -1, chronoUnit1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        java.sql.Savepoint savepoint3 = dummySqlConnection0.setSavepoint();
        org.junit.Assert.assertNull(savepoint3);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) 'a');
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.inspiring.pugtsdb.time.Granularity granularity0 = com.inspiring.pugtsdb.time.Granularity.ONE_HOUR;
        org.junit.Assert.assertTrue("'" + granularity0 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_HOUR + "'", granularity0.equals(com.inspiring.pugtsdb.time.Granularity.ONE_HOUR));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        java.sql.Clob clob3 = dummySqlConnection0.createClob();
        java.sql.PreparedStatement preparedStatement7 = dummySqlConnection0.prepareStatement("Aggregation{name='max'}", (int) '4', (int) (short) -1);
        dummySqlConnection0.rollback();
        dummySqlConnection0.setClientInfo("sum", "max");
        int int12 = dummySqlConnection0.getHoldability();
        org.junit.Assert.assertNull(clob3);
        org.junit.Assert.assertNull(preparedStatement7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.inspiring.pugtsdb.rollup.aggregation.StringMaxAggregation stringMaxAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.StringMaxAggregation();
        java.lang.String[] strArray8 = new java.lang.String[] { "Point{timestamp=32, value=[0.0, 10.0]}", "sum", "MetricPoint{metric=null, point=null}", "Aggregation{name='max'}", "Interval{fromTime=1674166070495, untilTime=1700463530495}", "Aggregation{name='max'}", "Aggregation{name='or'}" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.lang.String str11 = stringMaxAggregation0.aggregate((java.util.List<java.lang.String>) strList9);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "sum" + "'", str11, "sum");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        byte[] byteArray1 = com.inspiring.pugtsdb.util.Bytes.fromBoolean((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        java.time.temporal.ChronoUnit chronoUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = com.inspiring.pugtsdb.util.Temporals.truncate((-1L), chronoUnit1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        // The following exception was thrown during execution in test generation
        try {
            pointH2Repository4.deleteRawPointsByNameBeforeTime("Interval{fromTime=-1690392033978951, untilTime=-1690129059378951}", (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        java.sql.PreparedStatement preparedStatement3 = dummySqlConnection0.prepareStatement("", 8);
        org.junit.Assert.assertNull(preparedStatement3);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository2 = pointRocksRepository1.getMetricRepository();
        com.inspiring.pugtsdb.time.Granularity granularity7 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity8 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList9 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent10 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity7, granularity8, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList9);
        com.inspiring.pugtsdb.time.Granularity granularity11 = h2RepositoryRollUpEvent10.getSourceGranularity();
        com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>> doubleAggregationMetricPointMetricPoints14 = pointRocksRepository1.selectMetricPointsByIdAndAggregationBetweenTimestamp("100", "hi!", granularity11, (-1L), (long) 2);
        com.inspiring.pugtsdb.time.Granularity granularity18 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity19 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList20 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent21 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity18, granularity19, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList20);
        com.inspiring.pugtsdb.time.Interval.Builder builder22 = com.inspiring.pugtsdb.time.Interval.ofLast(granularity18);
        long long23 = granularity18.getValue();
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository24 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository25 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository24);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository26 = pointRocksRepository25.getMetricRepository();
        com.inspiring.pugtsdb.time.Granularity granularity29 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>> wildcardClassMetricPoints31 = pointRocksRepository25.selectLastMetricPointsByIdAndAggregation("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "", granularity29, 1);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository34 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository35 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository34);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository36 = pointRocksRepository35.getMetricRepository();
        java.util.Map<java.lang.String, java.lang.String> strMap38 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList41 = pointRocksRepository35.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap38, (long) (short) 1, 10L);
        com.inspiring.pugtsdb.time.Granularity granularity44 = com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE;
        java.util.Map<java.lang.String, java.lang.String> strMap45 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.concurrent.ScheduledExecutorService>> scheduledExecutorServiceMetricPointsList47 = pointRocksRepository35.selectLastMetricsPointsByNameAndAggregationAndTags("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "'sum'}", granularity44, strMap45, (int) (short) 1);
        com.inspiring.pugtsdb.bean.Tag tag50 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str51 = tag50.getValue();
        com.inspiring.pugtsdb.bean.Tag tag53 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str54 = tag53.getValue();
        com.inspiring.pugtsdb.bean.Tag tag56 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str57 = tag56.toString();
        com.inspiring.pugtsdb.bean.Tag[] tagArray58 = new com.inspiring.pugtsdb.bean.Tag[] { tag50, tag53, tag56 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList59 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList59, tagArray58);
        java.util.Map<java.lang.String, java.lang.String> strMap61 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList59);
        com.inspiring.pugtsdb.metric.LongMetric longMetric62 = new com.inspiring.pugtsdb.metric.LongMetric("Aggregation{name='sum'}", strMap61);
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList64 = pointRocksRepository25.selectLastMetricsPointsByNameAndAggregationAndTags("", "Interval{fromTime=1674166070495, untilTime=1700463530495}", granularity44, strMap61, 1);
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Iterable<java.lang.Double>>> doubleIterableMetricPointsList66 = pointRocksRepository1.selectLastMetricsPointsByNameAndTags("Tag{name='Aggregation{name', value=''sum'}'}", granularity18, strMap61, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            pointRocksRepository1.deleteRawPointsByNameBeforeTime("Aggregation{name='sum'}", (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRocksRepository2);
        org.junit.Assert.assertTrue("'" + granularity7 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity7.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity8 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity8.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity11 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity11.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertNull(doubleAggregationMetricPointMetricPoints14);
        org.junit.Assert.assertTrue("'" + granularity18 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity18.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity19 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity19.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(metricRocksRepository26);
        org.junit.Assert.assertTrue("'" + granularity29 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity29.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNull(wildcardClassMetricPoints31);
        org.junit.Assert.assertNotNull(metricRocksRepository36);
        org.junit.Assert.assertNull(doubleListMetricPointsList41);
        org.junit.Assert.assertTrue("'" + granularity44 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE + "'", granularity44.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE));
        org.junit.Assert.assertNull(scheduledExecutorServiceMetricPointsList47);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "'sum'}" + "'", str51, "'sum'}");
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "'sum'}" + "'", str54, "'sum'}");
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Tag{name='Aggregation{name', value=''sum'}'}" + "'", str57, "Tag{name='Aggregation{name', value=''sum'}'}");
        org.junit.Assert.assertNotNull(tagArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertNull(doubleListMetricPointsList64);
        org.junit.Assert.assertNull(doubleIterableMetricPointsList66);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.inspiring.pugtsdb.time.Granularity granularity2 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity3 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList4 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent5 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity2, granularity3, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList4);
        com.inspiring.pugtsdb.time.Granularity granularity6 = h2RepositoryRollUpEvent5.getSourceGranularity();
        com.inspiring.pugtsdb.time.Granularity granularity7 = h2RepositoryRollUpEvent5.getSourceGranularity();
        org.junit.Assert.assertTrue("'" + granularity2 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity2.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity3 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity3.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity6 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity6.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity7 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity7.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.rollup.aggregation.StringMaxAggregation> stringMaxAggregationMetric2 = metricRocksRepository0.selectMetricById("Point{timestamp=32, value=[0.0, 10.0]}");
        com.inspiring.pugtsdb.sql.PugConnection pugConnection3 = metricRocksRepository0.getConnection();
        pugConnection3.setSchema("MetricPoint{metric=null, point=null}");
        com.inspiring.pugtsdb.rollup.aggregation.BooleanOrAggregation booleanOrAggregation7 = new com.inspiring.pugtsdb.rollup.aggregation.BooleanOrAggregation();
        java.lang.String str8 = booleanOrAggregation7.toString();
        java.lang.String str9 = booleanOrAggregation7.toString();
        java.lang.Object[] objArray10 = new java.lang.Object[] { booleanOrAggregation7 };
        java.sql.Struct struct11 = pugConnection3.createStruct("Aggregation{name='max'}", objArray10);
        org.junit.Assert.assertNull(stringMaxAggregationMetric2);
        org.junit.Assert.assertNotNull(pugConnection3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Aggregation{name='or'}" + "'", str8, "Aggregation{name='or'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Aggregation{name='or'}" + "'", str9, "Aggregation{name='or'}");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[Aggregation{name='or'}]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[Aggregation{name='or'}]");
        org.junit.Assert.assertNull(struct11);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        java.sql.Clob clob3 = dummySqlConnection0.createClob();
        java.sql.PreparedStatement preparedStatement7 = dummySqlConnection0.prepareStatement("Aggregation{name='max'}", (int) '4', (int) (short) -1);
        dummySqlConnection0.rollback();
        dummySqlConnection0.setClientInfo("sum", "max");
        dummySqlConnection0.setCatalog("max");
        java.sql.CallableStatement callableStatement17 = dummySqlConnection0.prepareCall("Point{timestamp=32, value=[0.0, 10.0]}", 8, (int) ' ');
        org.junit.Assert.assertNull(clob3);
        org.junit.Assert.assertNull(preparedStatement7);
        org.junit.Assert.assertNull(callableStatement17);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.rollup.aggregation.StringMaxAggregation> stringMaxAggregationMetric2 = metricRocksRepository0.selectMetricById("Point{timestamp=32, value=[0.0, 10.0]}");
        com.inspiring.pugtsdb.sql.PugConnection pugConnection3 = metricRocksRepository0.getConnection();
        pugConnection3.setSchema("MetricPoint{metric=null, point=null}");
        boolean boolean6 = pugConnection3.getAutoCommit();
        pugConnection3.rollback();
        org.junit.Assert.assertNull(stringMaxAggregationMetric2);
        org.junit.Assert.assertNotNull(pugConnection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        byte[] byteArray1 = com.inspiring.pugtsdb.util.Bytes.fromDouble((java.lang.Double) 1.0d);
        com.inspiring.pugtsdb.util.MurmurHash3.LongPair longPair5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.util.MurmurHash3.murmurhash3_x64_128(byteArray1, (int) (byte) 10, 0, (int) (short) 0, longPair5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[63, -16, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository2 = pointRocksRepository1.getMetricRepository();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList7 = pointRocksRepository1.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap4, (long) (short) 1, 10L);
        com.inspiring.pugtsdb.time.Granularity granularity10 = com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.concurrent.ScheduledExecutorService>> scheduledExecutorServiceMetricPointsList13 = pointRocksRepository1.selectLastMetricsPointsByNameAndAggregationAndTags("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "'sum'}", granularity10, strMap11, (int) (short) 1);
        com.inspiring.pugtsdb.sql.PugConnection pugConnection14 = pointRocksRepository1.getConnection();
        java.util.Map<java.lang.String, java.lang.Class<?>> strMap15 = pugConnection14.getTypeMap();
        org.junit.Assert.assertNotNull(metricRocksRepository2);
        org.junit.Assert.assertNull(doubleListMetricPointsList7);
        org.junit.Assert.assertTrue("'" + granularity10 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE + "'", granularity10.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE));
        org.junit.Assert.assertNull(scheduledExecutorServiceMetricPointsList13);
        org.junit.Assert.assertNotNull(pugConnection14);
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.inspiring.pugtsdb.rollup.aggregation.DoubleMinAggregation doubleMinAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.DoubleMinAggregation();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        java.lang.Throwable throwable2 = null;
        com.inspiring.pugtsdb.sql.PugSQLException pugSQLException3 = new com.inspiring.pugtsdb.sql.PugSQLException("Interval{fromTime=-1690392033978951, untilTime=-1690129059378951}", throwable2);
        com.inspiring.pugtsdb.sql.PugSQLException pugSQLException4 = new com.inspiring.pugtsdb.sql.PugSQLException("Interval{fromTime=1674166070495, untilTime=1700463530495}", throwable2);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository2 = pointRocksRepository1.getMetricRepository();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList7 = pointRocksRepository1.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap4, (long) (short) 1, 10L);
        com.inspiring.pugtsdb.time.Granularity granularity9 = com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.List<java.lang.Double>>> doubleListMetricPointsList12 = pointRocksRepository1.selectLastMetricsPointsByNameAndTags("MetricPoint{metric=null, point=null}", granularity9, strMap10, (int) (byte) 10);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository15 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository16 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository15);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository17 = pointRocksRepository16.getMetricRepository();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList22 = pointRocksRepository16.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap19, (long) (short) 1, 10L);
        com.inspiring.pugtsdb.time.Granularity granularity29 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity30 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList31 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent32 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity29, granularity30, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList31);
        com.inspiring.pugtsdb.time.Granularity granularity33 = h2RepositoryRollUpEvent32.getTargetGranularity();
        com.inspiring.pugtsdb.time.Granularity granularity36 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity37 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList38 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent39 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity36, granularity37, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList38);
        com.inspiring.pugtsdb.time.Granularity granularity40 = h2RepositoryRollUpEvent39.getTargetGranularity();
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>> doubleAggregationMetricPointsList41 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationRollUpEvent42 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "max", granularity33, granularity40, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>>) doubleAggregationMetricPointsList41);
        java.util.Map<java.lang.String, java.lang.String> strMap43 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>>> wildcardClassMetricPointsList45 = pointRocksRepository16.selectLastMetricsPointsByNameAndAggregationAndTags("", "Interval{fromTime=1674166070495, untilTime=1700463530495}", granularity33, strMap43, (int) (byte) 10);
        com.inspiring.pugtsdb.time.Granularity granularity49 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity50 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList51 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent52 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity49, granularity50, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList51);
        com.inspiring.pugtsdb.time.Granularity granularity53 = h2RepositoryRollUpEvent52.getTargetGranularity();
        com.inspiring.pugtsdb.bean.MetricPoints<java.time.temporal.TemporalAmount> temporalAmountMetricPoints56 = pointRocksRepository16.selectMetricPointsByIdBetweenTimestamp("Tag{name='Aggregation{name', value=''sum'}'}", granularity53, (long) (short) 10, (long) (short) 1);
        com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.util.GlobPattern> globPatternMetricPoints58 = pointRocksRepository1.selectLastMetricPointsByIdAndAggregation("Interval{fromTime=1674166070495, untilTime=1700463530495}", "hi!", granularity53, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.MetricRepository> metricRepositoryMetricPoints62 = pointRocksRepository1.selectRawMetricPointsByIdBetweenTimestamp("Aggregation{name='max'}", 0L, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.exception.PugNotImplementedException; message: selectRawMetricPointsByIdBetweenTimestamp(int metricId, long fromInclusiveTimestamp, long toExclusiveTimestamp)");
        } catch (com.inspiring.pugtsdb.exception.PugNotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRocksRepository2);
        org.junit.Assert.assertNull(doubleListMetricPointsList7);
        org.junit.Assert.assertTrue("'" + granularity9 + "' != '" + com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE + "'", granularity9.equals(com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE));
        org.junit.Assert.assertNull(doubleListMetricPointsList12);
        org.junit.Assert.assertNotNull(metricRocksRepository17);
        org.junit.Assert.assertNull(doubleListMetricPointsList22);
        org.junit.Assert.assertTrue("'" + granularity29 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity29.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity30 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity30.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity33 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity33.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity36 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity36.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity37 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity37.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity40 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity40.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNull(wildcardClassMetricPointsList45);
        org.junit.Assert.assertTrue("'" + granularity49 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity49.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity50 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity50.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity53 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity53.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNull(temporalAmountMetricPoints56);
        org.junit.Assert.assertNull(globPatternMetricPoints58);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        int int0 = com.inspiring.pugtsdb.metric.Metric.ID_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.inspiring.pugtsdb.rollup.aggregation.BooleanOrAggregation booleanOrAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.BooleanOrAggregation();
        java.lang.String str1 = booleanOrAggregation0.toString();
        java.lang.String str2 = booleanOrAggregation0.toString();
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { false, false };
        java.util.ArrayList<java.lang.Boolean> booleanList6 = new java.util.ArrayList<java.lang.Boolean>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>) booleanList6, booleanArray5);
        java.lang.Boolean boolean8 = booleanOrAggregation0.aggregate((java.util.List<java.lang.Boolean>) booleanList6);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aggregation{name='or'}" + "'", str1, "Aggregation{name='or'}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aggregation{name='or'}" + "'", str2, "Aggregation{name='or'}");
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        java.lang.Throwable throwable1 = null;
        com.inspiring.pugtsdb.sql.PugSQLException pugSQLException2 = new com.inspiring.pugtsdb.sql.PugSQLException("Interval{fromTime=-1690392033978951, untilTime=-1690129059378951}", throwable1);
        com.inspiring.pugtsdb.exception.PugIllegalArgumentException pugIllegalArgumentException4 = new com.inspiring.pugtsdb.exception.PugIllegalArgumentException("hi!");
        pugSQLException2.addSuppressed((java.lang.Throwable) pugIllegalArgumentException4);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.rollup.aggregation.StringMaxAggregation> stringMaxAggregationMetric2 = metricRocksRepository0.selectMetricById("Point{timestamp=32, value=[0.0, 10.0]}");
        com.inspiring.pugtsdb.sql.PugConnection pugConnection3 = metricRocksRepository0.getConnection();
        pugConnection3.setSchema("MetricPoint{metric=null, point=null}");
        java.sql.DatabaseMetaData databaseMetaData6 = pugConnection3.getMetaData();
        java.sql.CallableStatement callableStatement11 = pugConnection3.prepareCall("Point{timestamp=32, value=[0.0, 10.0]}", 1, (int) (short) 100, 0);
        java.sql.Savepoint savepoint12 = null;
        pugConnection3.releaseSavepoint(savepoint12);
        org.junit.Assert.assertNull(stringMaxAggregationMetric2);
        org.junit.Assert.assertNotNull(pugConnection3);
        org.junit.Assert.assertNull(databaseMetaData6);
        org.junit.Assert.assertNull(callableStatement11);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.repository.rocks.bean.PointId pointId1 = com.inspiring.pugtsdb.repository.rocks.bean.PointId.from("MetricPoint{metric=null, point=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"etric=null, point=null}\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        boolean boolean3 = dummySqlConnection0.getAutoCommit();
        dummySqlConnection0.setCatalog("Point{timestamp=32, value=[0.0, 10.0]}");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.inspiring.pugtsdb.bean.Tag tag2 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str3 = tag2.getValue();
        com.inspiring.pugtsdb.bean.Tag tag5 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str6 = tag5.getValue();
        com.inspiring.pugtsdb.bean.Tag tag8 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str9 = tag8.toString();
        com.inspiring.pugtsdb.bean.Tag[] tagArray10 = new com.inspiring.pugtsdb.bean.Tag[] { tag2, tag5, tag8 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList11 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList11, tagArray10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList11);
        com.inspiring.pugtsdb.metric.BooleanMetric booleanMetric14 = new com.inspiring.pugtsdb.metric.BooleanMetric("Aggregation{name='sum'}", strMap13);
        byte[] byteArray16 = booleanMetric14.valueToBytes((java.lang.Boolean) false);
        java.lang.String str17 = booleanMetric14.getId();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'sum'}" + "'", str3, "'sum'}");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'sum'}" + "'", str6, "'sum'}");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Tag{name='Aggregation{name', value=''sum'}'}" + "'", str9, "Tag{name='Aggregation{name', value=''sum'}'}");
        org.junit.Assert.assertNotNull(tagArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0000476860250" + "'", str17, "0000476860250");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.lang.String str2 = com.inspiring.pugtsdb.util.Strings.format((double) 100L, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100" + "'", str2, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool0 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories2 = new com.inspiring.pugtsdb.repository.h2.H2Repositories(pugConnectionSupplier1);
        com.inspiring.pugtsdb.repository.PointRepository pointRepository3 = h2Repositories2.getPointRepository();
        java.time.temporal.ChronoUnit chronoUnit5 = null;
        com.inspiring.pugtsdb.time.Retention retention6 = com.inspiring.pugtsdb.time.Retention.of((long) (byte) 10, chronoUnit5);
        java.time.temporal.ChronoUnit chronoUnit8 = null;
        com.inspiring.pugtsdb.time.Retention retention9 = com.inspiring.pugtsdb.time.Retention.of((long) (byte) 10, chronoUnit8);
        com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger scheduledPointPurger10 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger((com.inspiring.pugtsdb.repository.Repositories) h2Repositories2, retention6, retention9);
        java.util.concurrent.Future<?> wildcardFuture11 = scheduledThreadPool0.submit((java.lang.Runnable) scheduledPointPurger10);
        boolean boolean12 = scheduledThreadPool0.isTerminated();
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool13 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier14 = null;
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories15 = new com.inspiring.pugtsdb.repository.h2.H2Repositories(pugConnectionSupplier14);
        com.inspiring.pugtsdb.repository.PointRepository pointRepository16 = h2Repositories15.getPointRepository();
        java.time.temporal.ChronoUnit chronoUnit18 = null;
        com.inspiring.pugtsdb.time.Retention retention19 = com.inspiring.pugtsdb.time.Retention.of((long) (byte) 10, chronoUnit18);
        java.time.temporal.ChronoUnit chronoUnit21 = null;
        com.inspiring.pugtsdb.time.Retention retention22 = com.inspiring.pugtsdb.time.Retention.of((long) (byte) 10, chronoUnit21);
        com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger scheduledPointPurger23 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger((com.inspiring.pugtsdb.repository.Repositories) h2Repositories15, retention19, retention22);
        java.util.concurrent.Future<?> wildcardFuture24 = scheduledThreadPool13.submit((java.lang.Runnable) scheduledPointPurger23);
        java.util.concurrent.TimeUnit timeUnit27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture28 = scheduledThreadPool0.scheduleAtFixedRate((java.lang.Runnable) scheduledPointPurger23, (long) '#', 100L, timeUnit27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pointRepository3);
        org.junit.Assert.assertNotNull(retention6);
        org.junit.Assert.assertNotNull(retention9);
        org.junit.Assert.assertNotNull(wildcardFuture11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(pointRepository16);
        org.junit.Assert.assertNotNull(retention19);
        org.junit.Assert.assertNotNull(retention22);
        org.junit.Assert.assertNotNull(wildcardFuture24);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.inspiring.pugtsdb.rollup.aggregation.BooleanOrAggregation booleanOrAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.BooleanOrAggregation();
        java.lang.String str1 = booleanOrAggregation0.toString();
        java.lang.String str2 = booleanOrAggregation0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aggregation{name='or'}" + "'", str1, "Aggregation{name='or'}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "or" + "'", str2, "or");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.Tag tag1 = com.inspiring.pugtsdb.bean.Tag.valueOf("or");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        java.util.Properties properties3 = null;
        dummySqlConnection0.setClientInfo(properties3);
        java.lang.String str6 = dummySqlConnection0.nativeSQL("sum");
        java.sql.Clob clob7 = dummySqlConnection0.createClob();
        java.sql.CallableStatement callableStatement11 = dummySqlConnection0.prepareCall("Interval{fromTime=1674166070495, untilTime=1700463530495}", (int) ' ', (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(clob7);
        org.junit.Assert.assertNull(callableStatement11);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        com.inspiring.pugtsdb.time.Interval interval2 = new com.inspiring.pugtsdb.time.Interval((long) 13, (long) (-1));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        java.sql.Clob clob3 = dummySqlConnection0.createClob();
        java.sql.PreparedStatement preparedStatement7 = dummySqlConnection0.prepareStatement("Aggregation{name='max'}", (int) '4', (int) (short) -1);
        dummySqlConnection0.setSchema("Aggregation{name='sum'}");
        org.junit.Assert.assertNull(clob3);
        org.junit.Assert.assertNull(preparedStatement7);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromWeeksAgo(4617315517961601024L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Exceeds capacity of Duration: 2792552425263176299315200000000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        java.sql.Statement statement1 = dummySqlConnection0.createStatement();
        int int2 = dummySqlConnection0.getNetworkTimeout();
        org.junit.Assert.assertNull(statement1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        com.inspiring.pugtsdb.time.Granularity granularity2 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity3 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList4 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent5 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity2, granularity3, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList4);
        com.inspiring.pugtsdb.time.Granularity granularity6 = h2RepositoryRollUpEvent5.getTargetGranularity();
        com.inspiring.pugtsdb.time.Granularity granularity7 = h2RepositoryRollUpEvent5.getSourceGranularity();
        org.junit.Assert.assertTrue("'" + granularity2 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity2.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity3 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity3.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity6 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity6.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity7 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity7.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.inspiring.pugtsdb.repository.rocks.bean.MetaMetric metaMetric0 = new com.inspiring.pugtsdb.repository.rocks.bean.MetaMetric();
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> strMap1 = metaMetric0.getTagsById();
        org.junit.Assert.assertNull(strMap1);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        java.lang.String str2 = com.inspiring.pugtsdb.util.Strings.repeat("MetricPoint{metric=null, point=null}", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.rollup.aggregation.StringMaxAggregation> stringMaxAggregationMetric2 = metricRocksRepository0.selectMetricById("Point{timestamp=32, value=[0.0, 10.0]}");
        com.inspiring.pugtsdb.sql.PugConnection pugConnection3 = metricRocksRepository0.getConnection();
        pugConnection3.setSchema("MetricPoint{metric=null, point=null}");
        boolean boolean6 = pugConnection3.getAutoCommit();
        boolean boolean7 = pugConnection3.isClosed();
        java.sql.Savepoint savepoint9 = pugConnection3.setSavepoint("");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection11 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection11.setCatalog("");
        java.sql.Clob clob14 = dummySqlConnection11.createClob();
        java.sql.PreparedStatement preparedStatement18 = dummySqlConnection11.prepareStatement("Aggregation{name='max'}", (int) '4', (int) (short) -1);
        dummySqlConnection11.rollback();
        dummySqlConnection11.setClientInfo("sum", "max");
        int[] intArray26 = new int[] { 1, (short) -1 };
        java.sql.PreparedStatement preparedStatement27 = dummySqlConnection11.prepareStatement("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", intArray26);
        java.sql.PreparedStatement preparedStatement28 = pugConnection3.prepareStatement("0000476860250", intArray26);
        java.lang.String str30 = pugConnection3.getClientInfo("Tag{name='Aggregation{name', value=''sum'}'}");
        org.junit.Assert.assertNull(stringMaxAggregationMetric2);
        org.junit.Assert.assertNotNull(pugConnection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(savepoint9);
        org.junit.Assert.assertNull(clob14);
        org.junit.Assert.assertNull(preparedStatement18);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, -1]");
        org.junit.Assert.assertNull(preparedStatement27);
        org.junit.Assert.assertNull(preparedStatement28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<java.util.Collection<java.lang.Double>> doubleCollectionMetricPoints8 = pointH2Repository4.selectRawMetricPointsByIdBetweenTimestamp("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", 100L, (long) (-1));
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'} points between 100 and -1 with statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"value\"                      FROM   metric                               INNER JOIN point                            ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository5 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.time.Granularity granularity8 = com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE;
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<int[]> intArrayMetricPoints11 = pointH2Repository5.selectMetricPointsByIdAndAggregationBetweenTimestamp("'sum'}", "max", granularity8, (long) ' ', (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric 'sum'} points aggregated as max between 32 and 1 with granularity 1m and statement  SELECT metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_1m AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"id\" = ?                    AND    point.\"aggregation\" = ?            AND    point.\"timestamp\" >= ?             AND    point.\"timestamp\" < ?              ORDER BY metric.\"id\",                              point.\"timestamp\"               ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + granularity8 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE + "'", granularity8.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        java.sql.Clob clob3 = dummySqlConnection0.createClob();
        dummySqlConnection0.setSchema("");
        dummySqlConnection0.setReadOnly(false);
        java.util.Properties properties8 = dummySqlConnection0.getClientInfo();
        int int9 = dummySqlConnection0.getHoldability();
        org.junit.Assert.assertNull(clob3);
        org.junit.Assert.assertNull(properties8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.RandomAccess>> randomAccessMetricPointsList6 = pointRocksRepository1.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap3, (long) (byte) 10, 1437494990209L);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.bean.MetricPoints<java.util.AbstractCollection<java.lang.Double>> doubleCollectionMetricPoints10 = pointRocksRepository1.selectRawMetricPointsByIdBetweenTimestamp("100", (long) '#', (long) 100);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.exception.PugNotImplementedException; message: selectRawMetricPointsByIdBetweenTimestamp(int metricId, long fromInclusiveTimestamp, long toExclusiveTimestamp)");
        } catch (com.inspiring.pugtsdb.exception.PugNotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(randomAccessMetricPointsList6);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.rollup.aggregation.StringMaxAggregation> stringMaxAggregationMetric2 = metricRocksRepository0.selectMetricById("Point{timestamp=32, value=[0.0, 10.0]}");
        com.inspiring.pugtsdb.sql.PugConnection pugConnection3 = metricRocksRepository0.getConnection();
        pugConnection3.setSchema("MetricPoint{metric=null, point=null}");
        boolean boolean6 = pugConnection3.getAutoCommit();
        boolean boolean7 = pugConnection3.isClosed();
        java.sql.Savepoint savepoint9 = pugConnection3.setSavepoint("");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection11 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection11.setCatalog("");
        java.sql.Clob clob14 = dummySqlConnection11.createClob();
        java.sql.PreparedStatement preparedStatement18 = dummySqlConnection11.prepareStatement("Aggregation{name='max'}", (int) '4', (int) (short) -1);
        dummySqlConnection11.rollback();
        dummySqlConnection11.setClientInfo("sum", "max");
        int[] intArray26 = new int[] { 1, (short) -1 };
        java.sql.PreparedStatement preparedStatement27 = dummySqlConnection11.prepareStatement("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", intArray26);
        java.sql.PreparedStatement preparedStatement28 = pugConnection3.prepareStatement("0000476860250", intArray26);
        com.inspiring.pugtsdb.exception.PugIllegalArgumentException pugIllegalArgumentException31 = new com.inspiring.pugtsdb.exception.PugIllegalArgumentException("hi!");
        java.lang.Throwable[] throwableArray32 = pugIllegalArgumentException31.getSuppressed();
        java.sql.Array array33 = pugConnection3.createArrayOf("'sum'}", (java.lang.Object[]) throwableArray32);
        org.junit.Assert.assertNull(stringMaxAggregationMetric2);
        org.junit.Assert.assertNotNull(pugConnection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(savepoint9);
        org.junit.Assert.assertNull(clob14);
        org.junit.Assert.assertNull(preparedStatement18);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, -1]");
        org.junit.Assert.assertNull(preparedStatement27);
        org.junit.Assert.assertNull(preparedStatement28);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNull(array33);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository2 = pointRocksRepository1.getMetricRepository();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList7 = pointRocksRepository1.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap4, (long) (short) 1, 10L);
        com.inspiring.pugtsdb.time.Granularity granularity9 = com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.List<java.lang.Double>>> doubleListMetricPointsList12 = pointRocksRepository1.selectLastMetricsPointsByNameAndTags("MetricPoint{metric=null, point=null}", granularity9, strMap10, (int) (byte) 10);
        com.inspiring.pugtsdb.sql.PugConnection pugConnection13 = pointRocksRepository1.getConnection();
        org.junit.Assert.assertNotNull(metricRocksRepository2);
        org.junit.Assert.assertNull(doubleListMetricPointsList7);
        org.junit.Assert.assertTrue("'" + granularity9 + "' != '" + com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE + "'", granularity9.equals(com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE));
        org.junit.Assert.assertNull(doubleListMetricPointsList12);
        org.junit.Assert.assertNotNull(pugConnection13);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastSeconds(1L);
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository2 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository1);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository3 = pointRocksRepository2.getMetricRepository();
        com.inspiring.pugtsdb.time.Granularity granularity8 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity9 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList10 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent11 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity8, granularity9, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList10);
        com.inspiring.pugtsdb.time.Granularity granularity12 = h2RepositoryRollUpEvent11.getSourceGranularity();
        com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>> doubleAggregationMetricPointMetricPoints15 = pointRocksRepository2.selectMetricPointsByIdAndAggregationBetweenTimestamp("100", "hi!", granularity12, (-1L), (long) 2);
        com.inspiring.pugtsdb.time.Granularity granularity19 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity20 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList21 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent22 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity19, granularity20, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList21);
        com.inspiring.pugtsdb.time.Interval.Builder builder23 = com.inspiring.pugtsdb.time.Interval.ofLast(granularity19);
        long long24 = granularity19.getValue();
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository25 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository26 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository25);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository27 = pointRocksRepository26.getMetricRepository();
        com.inspiring.pugtsdb.time.Granularity granularity30 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>> wildcardClassMetricPoints32 = pointRocksRepository26.selectLastMetricPointsByIdAndAggregation("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "", granularity30, 1);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository35 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository36 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository35);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository37 = pointRocksRepository36.getMetricRepository();
        java.util.Map<java.lang.String, java.lang.String> strMap39 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList42 = pointRocksRepository36.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap39, (long) (short) 1, 10L);
        com.inspiring.pugtsdb.time.Granularity granularity45 = com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE;
        java.util.Map<java.lang.String, java.lang.String> strMap46 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.concurrent.ScheduledExecutorService>> scheduledExecutorServiceMetricPointsList48 = pointRocksRepository36.selectLastMetricsPointsByNameAndAggregationAndTags("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "'sum'}", granularity45, strMap46, (int) (short) 1);
        com.inspiring.pugtsdb.bean.Tag tag51 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str52 = tag51.getValue();
        com.inspiring.pugtsdb.bean.Tag tag54 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str55 = tag54.getValue();
        com.inspiring.pugtsdb.bean.Tag tag57 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str58 = tag57.toString();
        com.inspiring.pugtsdb.bean.Tag[] tagArray59 = new com.inspiring.pugtsdb.bean.Tag[] { tag51, tag54, tag57 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList60 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList60, tagArray59);
        java.util.Map<java.lang.String, java.lang.String> strMap62 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList60);
        com.inspiring.pugtsdb.metric.LongMetric longMetric63 = new com.inspiring.pugtsdb.metric.LongMetric("Aggregation{name='sum'}", strMap62);
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList65 = pointRocksRepository26.selectLastMetricsPointsByNameAndAggregationAndTags("", "Interval{fromTime=1674166070495, untilTime=1700463530495}", granularity45, strMap62, 1);
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Iterable<java.lang.Double>>> doubleIterableMetricPointsList67 = pointRocksRepository2.selectLastMetricsPointsByNameAndTags("Tag{name='Aggregation{name', value=''sum'}'}", granularity19, strMap62, (int) (byte) 1);
        com.inspiring.pugtsdb.metric.DoubleMetric doubleMetric68 = new com.inspiring.pugtsdb.metric.DoubleMetric("Tag{name='Aggregation{name', value=''sum'}'}", strMap62);
        java.lang.String str69 = doubleMetric68.toString();
        org.junit.Assert.assertNotNull(metricRocksRepository3);
        org.junit.Assert.assertTrue("'" + granularity8 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity8.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity9 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity9.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity12 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity12.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertNull(doubleAggregationMetricPointMetricPoints15);
        org.junit.Assert.assertTrue("'" + granularity19 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity19.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity20 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity20.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(metricRocksRepository27);
        org.junit.Assert.assertTrue("'" + granularity30 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity30.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNull(wildcardClassMetricPoints32);
        org.junit.Assert.assertNotNull(metricRocksRepository37);
        org.junit.Assert.assertNull(doubleListMetricPointsList42);
        org.junit.Assert.assertTrue("'" + granularity45 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE + "'", granularity45.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE));
        org.junit.Assert.assertNull(scheduledExecutorServiceMetricPointsList48);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "'sum'}" + "'", str52, "'sum'}");
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "'sum'}" + "'", str55, "'sum'}");
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Tag{name='Aggregation{name', value=''sum'}'}" + "'", str58, "Tag{name='Aggregation{name', value=''sum'}'}");
        org.junit.Assert.assertNotNull(tagArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertNull(doubleListMetricPointsList65);
        org.junit.Assert.assertNull(doubleIterableMetricPointsList67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Metric{id=-001561383299, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Tag{name='Aggregation{name', value=''sum'}'}', tags={Aggregation{name='sum'}}}" + "'", str69, "Metric{id=-001561383299, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Tag{name='Aggregation{name', value=''sum'}'}', tags={Aggregation{name='sum'}}}");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.rollup.aggregation.StringMaxAggregation> stringMaxAggregationMetric2 = metricRocksRepository0.selectMetricById("Point{timestamp=32, value=[0.0, 10.0]}");
        com.inspiring.pugtsdb.sql.PugConnection pugConnection3 = metricRocksRepository0.getConnection();
        pugConnection3.setSchema("MetricPoint{metric=null, point=null}");
        java.sql.Statement statement9 = pugConnection3.createStatement((int) '4', (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertNull(stringMaxAggregationMetric2);
        org.junit.Assert.assertNotNull(pugConnection3);
        org.junit.Assert.assertNull(statement9);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository5 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.time.Granularity granularity8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.lang.CharSequence>> charSequenceMetricPointsList10 = pointH2Repository5.selectLastMetricsPointsByNameAndAggregation("Point{timestamp=32, value=[0.0, 10.0]}", "Metric{id=-001561383299, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Tag{name='Aggregation{name', value=''sum'}'}', tags={Aggregation{name='sum'}}}", granularity8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot select metric Point{timestamp=32, value=[0.0, 10.0]} last 100 points aggregated as Metric{id=-001561383299, type='com.inspiring.pugtsdb.metric.DoubleMetric', name='Tag{name='Aggregation{name', value=''sum'}'}', tags={Aggregation{name='sum'}}} with granularity null and statement  SELECT TOP ?                                       metric.\"id\",                              metric.\"name\",                            metric.\"type\",                            point.\"timestamp\",                        point.\"aggregation\",                      point.\"value\"                      FROM   metric                               INNER JOIN point_null AS point                ON     metric.\"id\" = point.\"metric_id\"  AND    metric.\"name\" = ?                  AND    point.\"aggregation\" = ?            ORDER BY metric.\"id\",                             point.\"aggregation\",                     point.\"timestamp\" DESC         ");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository2 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository1);
        com.inspiring.pugtsdb.time.Granularity granularity6 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity7 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList8 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent9 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity6, granularity7, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList8);
        com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.TagH2Repository> tagH2RepositoryMetricPoints12 = pointRocksRepository2.selectMetricPointsByIdBetweenTimestamp("Aggregation{name='avg'}", granularity6, (long) 1325048386, 1695976731791L);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository14 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository15 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository14);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository16 = pointRocksRepository15.getMetricRepository();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList21 = pointRocksRepository15.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap18, (long) (short) 1, 10L);
        com.inspiring.pugtsdb.time.Granularity granularity23 = com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE;
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.List<java.lang.Double>>> doubleListMetricPointsList26 = pointRocksRepository15.selectLastMetricsPointsByNameAndTags("MetricPoint{metric=null, point=null}", granularity23, strMap24, (int) (byte) 10);
        java.util.Map<java.lang.String, java.lang.String> strMap28 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.rocks.PointRocksRepository>> pointRocksRepositoryMetricPointsList31 = pointRocksRepository15.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("MetricPoint{metric=null, point=null}", strMap28, (long) (byte) -1, (long) '4');
        com.inspiring.pugtsdb.time.Granularity granularity33 = com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE;
        com.inspiring.pugtsdb.bean.Tag tag36 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str37 = tag36.getValue();
        com.inspiring.pugtsdb.bean.Tag tag39 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str40 = tag39.getValue();
        com.inspiring.pugtsdb.bean.Tag tag42 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str43 = tag42.toString();
        com.inspiring.pugtsdb.bean.Tag[] tagArray44 = new com.inspiring.pugtsdb.bean.Tag[] { tag36, tag39, tag42 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList45 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList45, tagArray44);
        java.util.Map<java.lang.String, java.lang.String> strMap47 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList45);
        com.inspiring.pugtsdb.metric.LongMetric longMetric48 = new com.inspiring.pugtsdb.metric.LongMetric("Aggregation{name='sum'}", strMap47);
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>>> wildcardClassMetricPointsList51 = pointRocksRepository15.selectMetricsPointsByNameAndTagsBetweenTimestamp("MetricPoint{metric=null, point=null}", granularity33, strMap47, (long) (short) -1, (long) (byte) 1);
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.PointRepository>> pointRepositoryMetricPointsList54 = pointRocksRepository2.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("'sum'}", strMap47, 10L, (long) ' ');
        com.inspiring.pugtsdb.metric.BooleanMetric booleanMetric55 = new com.inspiring.pugtsdb.metric.BooleanMetric("hi!", strMap47);
        org.junit.Assert.assertTrue("'" + granularity6 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity6.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity7 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity7.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNull(tagH2RepositoryMetricPoints12);
        org.junit.Assert.assertNotNull(metricRocksRepository16);
        org.junit.Assert.assertNull(doubleListMetricPointsList21);
        org.junit.Assert.assertTrue("'" + granularity23 + "' != '" + com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE + "'", granularity23.equals(com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE));
        org.junit.Assert.assertNull(doubleListMetricPointsList26);
        org.junit.Assert.assertNull(pointRocksRepositoryMetricPointsList31);
        org.junit.Assert.assertTrue("'" + granularity33 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE + "'", granularity33.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE));
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "'sum'}" + "'", str37, "'sum'}");
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "'sum'}" + "'", str40, "'sum'}");
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Tag{name='Aggregation{name', value=''sum'}'}" + "'", str43, "Tag{name='Aggregation{name', value=''sum'}'}");
        org.junit.Assert.assertNotNull(tagArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNull(wildcardClassMetricPointsList51);
        org.junit.Assert.assertNull(pointRepositoryMetricPointsList54);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        com.inspiring.pugtsdb.repository.rocks.bean.PointId pointId0 = new com.inspiring.pugtsdb.repository.rocks.bean.PointId();
        java.lang.Long long1 = pointId0.timestamp;
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        com.inspiring.pugtsdb.bean.Tag tag2 = com.inspiring.pugtsdb.bean.Tag.of("MetricPoint{metric=null, point=null}", "Tag{name='Aggregation{name', value=''sum'}'}");
        java.lang.String str3 = tag2.getValue();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Tag{name='Aggregation{name', value=''sum'}'}" + "'", str3, "Tag{name='Aggregation{name', value=''sum'}'}");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        java.sql.Statement statement1 = dummySqlConnection0.createStatement();
        dummySqlConnection0.commit();
        org.junit.Assert.assertNull(statement1);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository2 = pointRocksRepository1.getMetricRepository();
        com.inspiring.pugtsdb.time.Granularity granularity7 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity8 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList9 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent10 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity7, granularity8, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList9);
        com.inspiring.pugtsdb.time.Granularity granularity11 = h2RepositoryRollUpEvent10.getSourceGranularity();
        com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>> doubleAggregationMetricPointMetricPoints14 = pointRocksRepository1.selectMetricPointsByIdAndAggregationBetweenTimestamp("100", "hi!", granularity11, (-1L), (long) 2);
        com.inspiring.pugtsdb.time.Granularity granularity18 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity19 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList20 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent21 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity18, granularity19, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList20);
        com.inspiring.pugtsdb.time.Interval.Builder builder22 = com.inspiring.pugtsdb.time.Interval.ofLast(granularity18);
        long long23 = granularity18.getValue();
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository24 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository25 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository24);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository26 = pointRocksRepository25.getMetricRepository();
        com.inspiring.pugtsdb.time.Granularity granularity29 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>> wildcardClassMetricPoints31 = pointRocksRepository25.selectLastMetricPointsByIdAndAggregation("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "", granularity29, 1);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository34 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository35 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository34);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository36 = pointRocksRepository35.getMetricRepository();
        java.util.Map<java.lang.String, java.lang.String> strMap38 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList41 = pointRocksRepository35.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap38, (long) (short) 1, 10L);
        com.inspiring.pugtsdb.time.Granularity granularity44 = com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE;
        java.util.Map<java.lang.String, java.lang.String> strMap45 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.concurrent.ScheduledExecutorService>> scheduledExecutorServiceMetricPointsList47 = pointRocksRepository35.selectLastMetricsPointsByNameAndAggregationAndTags("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "'sum'}", granularity44, strMap45, (int) (short) 1);
        com.inspiring.pugtsdb.bean.Tag tag50 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str51 = tag50.getValue();
        com.inspiring.pugtsdb.bean.Tag tag53 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str54 = tag53.getValue();
        com.inspiring.pugtsdb.bean.Tag tag56 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str57 = tag56.toString();
        com.inspiring.pugtsdb.bean.Tag[] tagArray58 = new com.inspiring.pugtsdb.bean.Tag[] { tag50, tag53, tag56 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList59 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList59, tagArray58);
        java.util.Map<java.lang.String, java.lang.String> strMap61 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList59);
        com.inspiring.pugtsdb.metric.LongMetric longMetric62 = new com.inspiring.pugtsdb.metric.LongMetric("Aggregation{name='sum'}", strMap61);
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList64 = pointRocksRepository25.selectLastMetricsPointsByNameAndAggregationAndTags("", "Interval{fromTime=1674166070495, untilTime=1700463530495}", granularity44, strMap61, 1);
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Iterable<java.lang.Double>>> doubleIterableMetricPointsList66 = pointRocksRepository1.selectLastMetricsPointsByNameAndTags("Tag{name='Aggregation{name', value=''sum'}'}", granularity18, strMap61, (int) (byte) 1);
        java.util.List<java.lang.String> strList67 = com.inspiring.pugtsdb.bean.Tag.fromMapToStringList(strMap61);
        org.junit.Assert.assertNotNull(metricRocksRepository2);
        org.junit.Assert.assertTrue("'" + granularity7 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity7.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity8 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity8.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity11 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity11.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertNull(doubleAggregationMetricPointMetricPoints14);
        org.junit.Assert.assertTrue("'" + granularity18 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity18.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity19 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity19.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(metricRocksRepository26);
        org.junit.Assert.assertTrue("'" + granularity29 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity29.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNull(wildcardClassMetricPoints31);
        org.junit.Assert.assertNotNull(metricRocksRepository36);
        org.junit.Assert.assertNull(doubleListMetricPointsList41);
        org.junit.Assert.assertTrue("'" + granularity44 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE + "'", granularity44.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE));
        org.junit.Assert.assertNull(scheduledExecutorServiceMetricPointsList47);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "'sum'}" + "'", str51, "'sum'}");
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "'sum'}" + "'", str54, "'sum'}");
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Tag{name='Aggregation{name', value=''sum'}'}" + "'", str57, "Tag{name='Aggregation{name', value=''sum'}'}");
        org.junit.Assert.assertNotNull(tagArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertNull(doubleListMetricPointsList64);
        org.junit.Assert.assertNull(doubleIterableMetricPointsList66);
        org.junit.Assert.assertNotNull(strList67);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.rollup.aggregation.StringMaxAggregation> stringMaxAggregationMetric2 = metricRocksRepository0.selectMetricById("Point{timestamp=32, value=[0.0, 10.0]}");
        com.inspiring.pugtsdb.sql.PugConnection pugConnection3 = metricRocksRepository0.getConnection();
        pugConnection3.setSchema("MetricPoint{metric=null, point=null}");
        com.inspiring.pugtsdb.exception.PugIllegalArgumentException pugIllegalArgumentException8 = new com.inspiring.pugtsdb.exception.PugIllegalArgumentException("hi!");
        java.lang.Throwable[] throwableArray9 = pugIllegalArgumentException8.getSuppressed();
        java.sql.Struct struct10 = pugConnection3.createStruct("Point{timestamp=32, value=[0.0, 10.0]}", (java.lang.Object[]) throwableArray9);
        pugConnection3.close();
        org.junit.Assert.assertNull(stringMaxAggregationMetric2);
        org.junit.Assert.assertNotNull(pugConnection3);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNull(struct10);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool0 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories2 = new com.inspiring.pugtsdb.repository.h2.H2Repositories(pugConnectionSupplier1);
        java.time.temporal.ChronoUnit chronoUnit4 = null;
        com.inspiring.pugtsdb.time.Retention retention5 = new com.inspiring.pugtsdb.time.Retention((long) 100, chronoUnit4);
        java.time.temporal.ChronoUnit chronoUnit7 = null;
        com.inspiring.pugtsdb.time.Retention retention8 = com.inspiring.pugtsdb.time.Retention.of(1691829528911L, chronoUnit7);
        com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger scheduledPointPurger9 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger((com.inspiring.pugtsdb.repository.Repositories) h2Repositories2, retention5, retention8);
        scheduledThreadPool0.execute((java.lang.Runnable) scheduledPointPurger9);
        boolean boolean11 = scheduledThreadPool0.isShutdown();
        org.junit.Assert.assertNotNull(retention8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.metric.Metric<java.util.Collection<java.lang.Double>> doubleCollectionMetric2 = metricRocksRepository0.selectMetricById("Aggregation{name='max'}");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.util.DummySqlConnection>> dummySqlConnectionMetricList4 = metricRocksRepository0.selectMetricsByName("Aggregation{name='avg'}");
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.exception.PugException; message: Cannot select metrics by name Aggregation{name='avg'}");
        } catch (com.inspiring.pugtsdb.exception.PugException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(doubleCollectionMetric2);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository2 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository3 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository2);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository4 = pointRocksRepository3.getMetricRepository();
        com.inspiring.pugtsdb.time.Granularity granularity7 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>> wildcardClassMetricPoints9 = pointRocksRepository3.selectLastMetricPointsByIdAndAggregation("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "", granularity7, 1);
        com.inspiring.pugtsdb.time.Granularity granularity12 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity13 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList14 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent15 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity12, granularity13, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList14);
        com.inspiring.pugtsdb.time.Granularity granularity16 = h2RepositoryRollUpEvent15.getSourceGranularity();
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>>> h2RepositoryRollUpEventMetricPointsList17 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryRollUpEventRollUpEvent18 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>>("Aggregation{name", "100", granularity7, granularity16, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>>>) h2RepositoryRollUpEventMetricPointsList17);
        long long19 = granularity16.getValue();
        org.junit.Assert.assertNotNull(metricRocksRepository4);
        org.junit.Assert.assertTrue("'" + granularity7 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity7.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNull(wildcardClassMetricPoints9);
        org.junit.Assert.assertTrue("'" + granularity12 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity12.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity13 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity13.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity16 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity16.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository2 = pointRocksRepository1.getMetricRepository();
        com.inspiring.pugtsdb.time.Granularity granularity5 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>> wildcardClassMetricPoints7 = pointRocksRepository1.selectLastMetricPointsByIdAndAggregation("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "", granularity5, 1);
        com.inspiring.pugtsdb.sql.PugConnection pugConnection8 = pointRocksRepository1.getConnection();
        java.sql.PreparedStatement preparedStatement10 = pugConnection8.prepareStatement("Tag{name='Aggregation{name', value=''sum'}'}");
        java.util.concurrent.Executor executor11 = null;
        pugConnection8.setNetworkTimeout(executor11, 0);
        org.junit.Assert.assertNotNull(metricRocksRepository2);
        org.junit.Assert.assertTrue("'" + granularity5 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity5.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNull(wildcardClassMetricPoints7);
        org.junit.Assert.assertNotNull(pugConnection8);
        org.junit.Assert.assertNull(preparedStatement10);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        com.inspiring.pugtsdb.time.Interval interval2 = new com.inspiring.pugtsdb.time.Interval(100L, (long) (short) 1);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository2 = pointRocksRepository1.getMetricRepository();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList7 = pointRocksRepository1.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap4, (long) (short) 1, 10L);
        com.inspiring.pugtsdb.time.Granularity granularity9 = com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.List<java.lang.Double>>> doubleListMetricPointsList12 = pointRocksRepository1.selectLastMetricsPointsByNameAndTags("MetricPoint{metric=null, point=null}", granularity9, strMap10, (int) (byte) 10);
        com.inspiring.pugtsdb.time.Granularity granularity19 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity20 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList21 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent22 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity19, granularity20, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList21);
        com.inspiring.pugtsdb.time.Granularity granularity23 = h2RepositoryRollUpEvent22.getTargetGranularity();
        com.inspiring.pugtsdb.time.Granularity granularity26 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity27 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList28 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent29 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity26, granularity27, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList28);
        com.inspiring.pugtsdb.time.Granularity granularity30 = h2RepositoryRollUpEvent29.getTargetGranularity();
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>> doubleAggregationMetricPointsList31 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationRollUpEvent32 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "max", granularity23, granularity30, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>>) doubleAggregationMetricPointsList31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long33 = pointRocksRepository1.selectMaxPointTimestampByNameAndAggregation("hi!", "MetricPoint{metric=null, point=null}", granularity23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsatisfiedLinkError; message: org.rocksdb.ReadOptions.newReadOptions()J");
        } catch (java.lang.UnsatisfiedLinkError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRocksRepository2);
        org.junit.Assert.assertNull(doubleListMetricPointsList7);
        org.junit.Assert.assertTrue("'" + granularity9 + "' != '" + com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE + "'", granularity9.equals(com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE));
        org.junit.Assert.assertNull(doubleListMetricPointsList12);
        org.junit.Assert.assertTrue("'" + granularity19 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity19.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity20 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity20.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity23 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity23.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity26 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity26.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity27 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity27.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity30 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity30.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.util.Strings> stringsMetric3 = metricRocksRepository0.selectMetricById("Aggregation{name='max'}");
        org.junit.Assert.assertNull(stringsMetric3);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        com.inspiring.pugtsdb.repository.rocks.bean.PointId pointId2 = com.inspiring.pugtsdb.repository.rocks.bean.PointId.of("Interval{fromTime=-1690392033978951, untilTime=-1690129059378951}", (java.lang.Long) 4617315517961601024L);
        org.junit.Assert.assertNotNull(pointId2);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.rollup.aggregation.StringMaxAggregation> stringMaxAggregationMetric2 = metricRocksRepository0.selectMetricById("Point{timestamp=32, value=[0.0, 10.0]}");
        com.inspiring.pugtsdb.sql.PugConnection pugConnection3 = metricRocksRepository0.getConnection();
        pugConnection3.setSchema("Interval{fromTime=1674166070495, untilTime=1700463530495}");
        java.sql.Blob blob6 = pugConnection3.createBlob();
        java.sql.Statement statement7 = pugConnection3.createStatement();
        com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool scheduledThreadPool8 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledThreadPool();
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier9 = null;
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories10 = new com.inspiring.pugtsdb.repository.h2.H2Repositories(pugConnectionSupplier9);
        com.inspiring.pugtsdb.repository.PointRepository pointRepository11 = h2Repositories10.getPointRepository();
        java.time.temporal.ChronoUnit chronoUnit13 = null;
        com.inspiring.pugtsdb.time.Retention retention14 = com.inspiring.pugtsdb.time.Retention.of((long) (byte) 10, chronoUnit13);
        java.time.temporal.ChronoUnit chronoUnit16 = null;
        com.inspiring.pugtsdb.time.Retention retention17 = com.inspiring.pugtsdb.time.Retention.of((long) (byte) 10, chronoUnit16);
        com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger scheduledPointPurger18 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger((com.inspiring.pugtsdb.repository.Repositories) h2Repositories10, retention14, retention17);
        java.util.concurrent.Future<?> wildcardFuture19 = scheduledThreadPool8.submit((java.lang.Runnable) scheduledPointPurger18);
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier20 = null;
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories21 = new com.inspiring.pugtsdb.repository.h2.H2Repositories(pugConnectionSupplier20);
        com.inspiring.pugtsdb.repository.PointRepository pointRepository22 = h2Repositories21.getPointRepository();
        java.time.temporal.ChronoUnit chronoUnit24 = null;
        com.inspiring.pugtsdb.time.Retention retention25 = com.inspiring.pugtsdb.time.Retention.of((long) (byte) 10, chronoUnit24);
        java.time.temporal.ChronoUnit chronoUnit27 = null;
        com.inspiring.pugtsdb.time.Retention retention28 = com.inspiring.pugtsdb.time.Retention.of((long) (byte) 10, chronoUnit27);
        com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger scheduledPointPurger29 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger((com.inspiring.pugtsdb.repository.Repositories) h2Repositories21, retention25, retention28);
        scheduledThreadPool8.execute((java.lang.Runnable) scheduledPointPurger29);
        pugConnection3.abort((java.util.concurrent.Executor) scheduledThreadPool8);
        org.junit.Assert.assertNull(stringMaxAggregationMetric2);
        org.junit.Assert.assertNotNull(pugConnection3);
        org.junit.Assert.assertNull(blob6);
        org.junit.Assert.assertNull(statement7);
        org.junit.Assert.assertNotNull(pointRepository11);
        org.junit.Assert.assertNotNull(retention14);
        org.junit.Assert.assertNotNull(retention17);
        org.junit.Assert.assertNotNull(wildcardFuture19);
        org.junit.Assert.assertNotNull(pointRepository22);
        org.junit.Assert.assertNotNull(retention25);
        org.junit.Assert.assertNotNull(retention28);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.PugTSDBOverH2 pugTSDBOverH2_3 = new com.inspiring.pugtsdb.PugTSDBOverH2("Point{timestamp=32, value=[0.0, 10.0]}", "Aggregation{name='avg'}", "Aggregation{name='max'}");
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.sql.PugSQLException; message: Cannot create database");
        } catch (com.inspiring.pugtsdb.sql.PugSQLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.rollup.aggregation.StringMaxAggregation> stringMaxAggregationMetric2 = metricRocksRepository0.selectMetricById("Point{timestamp=32, value=[0.0, 10.0]}");
        com.inspiring.pugtsdb.sql.PugConnection pugConnection3 = metricRocksRepository0.getConnection();
        pugConnection3.setSchema("MetricPoint{metric=null, point=null}");
        pugConnection3.setSchema("sum");
        java.sql.Blob blob8 = pugConnection3.createBlob();
        java.sql.DatabaseMetaData databaseMetaData9 = pugConnection3.getMetaData();
        org.junit.Assert.assertNull(stringMaxAggregationMetric2);
        org.junit.Assert.assertNotNull(pugConnection3);
        org.junit.Assert.assertNull(blob8);
        org.junit.Assert.assertNull(databaseMetaData9);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        com.inspiring.pugtsdb.time.Granularity granularity0 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        long long1 = granularity0.getValue();
        org.junit.Assert.assertTrue("'" + granularity0 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity0.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        com.inspiring.pugtsdb.repository.rocks.bean.PointId pointId2 = com.inspiring.pugtsdb.repository.rocks.bean.PointId.of("Aggregation{name='or'}", (java.lang.Long) 1437494991460L);
        org.junit.Assert.assertNotNull(pointId2);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        com.inspiring.pugtsdb.bean.Tag tag2 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str3 = tag2.getValue();
        com.inspiring.pugtsdb.bean.Tag tag5 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str6 = tag5.getValue();
        com.inspiring.pugtsdb.bean.Tag tag8 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str9 = tag8.toString();
        com.inspiring.pugtsdb.bean.Tag[] tagArray10 = new com.inspiring.pugtsdb.bean.Tag[] { tag2, tag5, tag8 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList11 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList11, tagArray10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList11);
        com.inspiring.pugtsdb.metric.BooleanMetric booleanMetric14 = new com.inspiring.pugtsdb.metric.BooleanMetric("Aggregation{name='sum'}", strMap13);
        byte[] byteArray16 = booleanMetric14.valueToBytes((java.lang.Boolean) false);
        java.lang.String str17 = booleanMetric14.toString();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'sum'}" + "'", str3, "'sum'}");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'sum'}" + "'", str6, "'sum'}");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Tag{name='Aggregation{name', value=''sum'}'}" + "'", str9, "Tag{name='Aggregation{name', value=''sum'}'}");
        org.junit.Assert.assertNotNull(tagArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Metric{id=0000476860250, type='com.inspiring.pugtsdb.metric.BooleanMetric', name='Aggregation{name='sum'}', tags={Aggregation{name='sum'}}}" + "'", str17, "Metric{id=0000476860250, type='com.inspiring.pugtsdb.metric.BooleanMetric', name='Aggregation{name='sum'}', tags={Aggregation{name='sum'}}}");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        com.inspiring.pugtsdb.rollup.aggregation.LongMaxAggregation longMaxAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.LongMaxAggregation();
        java.util.List<java.lang.Long> longList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long2 = longMaxAggregation0.aggregate(longList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        java.sql.Clob clob3 = dummySqlConnection0.createClob();
        dummySqlConnection0.setSchema("");
        dummySqlConnection0.setReadOnly(false);
        java.util.Properties properties8 = dummySqlConnection0.getClientInfo();
        java.sql.CallableStatement callableStatement13 = dummySqlConnection0.prepareCall("'sum'}", (int) '#', 1, (int) (byte) 100);
        java.sql.CallableStatement callableStatement17 = dummySqlConnection0.prepareCall("Aggregation{name='or'}", (int) (short) 0, 0);
        org.junit.Assert.assertNull(clob3);
        org.junit.Assert.assertNull(properties8);
        org.junit.Assert.assertNull(callableStatement13);
        org.junit.Assert.assertNull(callableStatement17);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        com.inspiring.pugtsdb.rollup.aggregation.LongMinAggregation longMinAggregation0 = new com.inspiring.pugtsdb.rollup.aggregation.LongMinAggregation();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories1 = new com.inspiring.pugtsdb.repository.h2.H2Repositories(pugConnectionSupplier0);
        java.time.temporal.ChronoUnit chronoUnit3 = null;
        com.inspiring.pugtsdb.time.Retention retention4 = new com.inspiring.pugtsdb.time.Retention((long) 100, chronoUnit3);
        java.time.temporal.ChronoUnit chronoUnit6 = null;
        com.inspiring.pugtsdb.time.Retention retention7 = com.inspiring.pugtsdb.time.Retention.of(1691829528911L, chronoUnit6);
        com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger scheduledPointPurger8 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger((com.inspiring.pugtsdb.repository.Repositories) h2Repositories1, retention4, retention7);
        long long9 = retention4.getValue();
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList10 = retention4.getUnits();
        org.junit.Assert.assertNotNull(retention7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(temporalUnitList10);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        com.inspiring.pugtsdb.exception.PugIllegalArgumentException pugIllegalArgumentException2 = new com.inspiring.pugtsdb.exception.PugIllegalArgumentException("hi!");
        com.inspiring.pugtsdb.exception.PugIllegalArgumentException pugIllegalArgumentException4 = new com.inspiring.pugtsdb.exception.PugIllegalArgumentException("hi!");
        pugIllegalArgumentException2.addSuppressed((java.lang.Throwable) pugIllegalArgumentException4);
        com.inspiring.pugtsdb.exception.PugException pugException6 = new com.inspiring.pugtsdb.exception.PugException("max", (java.lang.Throwable) pugIllegalArgumentException4);
        java.lang.String str7 = pugIllegalArgumentException4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.inspiring.pugtsdb.exception.PugIllegalArgumentException: hi!" + "'", str7, "com.inspiring.pugtsdb.exception.PugIllegalArgumentException: hi!");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        java.sql.Clob clob3 = dummySqlConnection0.createClob();
        dummySqlConnection0.setSchema("");
        dummySqlConnection0.setReadOnly(false);
        dummySqlConnection0.setHoldability(0);
        dummySqlConnection0.close();
        org.junit.Assert.assertNull(clob3);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        com.inspiring.pugtsdb.bean.Tag tag2 = new com.inspiring.pugtsdb.bean.Tag("Aggregation{name='or'}", "Tag{name='Aggregation{name', value=''sum'}'}");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        java.sql.Statement statement5 = dummySqlConnection0.createStatement((int) (short) 1, 1);
        java.sql.Clob clob6 = dummySqlConnection0.createClob();
        dummySqlConnection0.close();
        dummySqlConnection0.close();
        org.junit.Assert.assertNull(statement5);
        org.junit.Assert.assertNull(clob6);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.rollup.aggregation.StringMaxAggregation> stringMaxAggregationMetric2 = metricRocksRepository0.selectMetricById("Point{timestamp=32, value=[0.0, 10.0]}");
        com.inspiring.pugtsdb.sql.PugConnection pugConnection3 = metricRocksRepository0.getConnection();
        pugConnection3.setSchema("MetricPoint{metric=null, point=null}");
        java.sql.DatabaseMetaData databaseMetaData6 = pugConnection3.getMetaData();
        boolean boolean7 = pugConnection3.getAutoCommit();
        java.sql.CallableStatement callableStatement11 = pugConnection3.prepareCall("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", (int) (byte) 0, 0);
        boolean boolean12 = pugConnection3.isClosed();
        pugConnection3.setSchema("100");
        org.junit.Assert.assertNull(stringMaxAggregationMetric2);
        org.junit.Assert.assertNotNull(pugConnection3);
        org.junit.Assert.assertNull(databaseMetaData6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(callableStatement11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository2 = pointRocksRepository1.getMetricRepository();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList7 = pointRocksRepository1.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap4, (long) (short) 1, 10L);
        com.inspiring.pugtsdb.time.Granularity granularity9 = com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.List<java.lang.Double>>> doubleListMetricPointsList12 = pointRocksRepository1.selectLastMetricsPointsByNameAndTags("MetricPoint{metric=null, point=null}", granularity9, strMap10, (int) (byte) 10);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.rocks.PointRocksRepository>> pointRocksRepositoryMetricPointsList17 = pointRocksRepository1.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("MetricPoint{metric=null, point=null}", strMap14, (long) (byte) -1, (long) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Throwable>> throwableMetricPointsList21 = pointRocksRepository1.selectRawMetricsPointsByNameBetweenTimestamp("hi!", (long) (byte) 1, (long) 10);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.exception.PugException; message: Cannot select metrics by name hi!");
        } catch (com.inspiring.pugtsdb.exception.PugException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRocksRepository2);
        org.junit.Assert.assertNull(doubleListMetricPointsList7);
        org.junit.Assert.assertTrue("'" + granularity9 + "' != '" + com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE + "'", granularity9.equals(com.inspiring.pugtsdb.time.Granularity.HALF_MINUTE));
        org.junit.Assert.assertNull(doubleListMetricPointsList12);
        org.junit.Assert.assertNull(pointRocksRepositoryMetricPointsList17);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        com.inspiring.pugtsdb.time.Interval interval2 = new com.inspiring.pugtsdb.time.Interval((long) 0, 32L);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.rollup.aggregation.StringMaxAggregation> stringMaxAggregationMetric2 = metricRocksRepository0.selectMetricById("Point{timestamp=32, value=[0.0, 10.0]}");
        com.inspiring.pugtsdb.sql.PugConnection pugConnection3 = metricRocksRepository0.getConnection();
        pugConnection3.setSchema("MetricPoint{metric=null, point=null}");
        java.sql.DatabaseMetaData databaseMetaData6 = pugConnection3.getMetaData();
        boolean boolean7 = pugConnection3.getAutoCommit();
        java.sql.Savepoint savepoint8 = pugConnection3.setSavepoint();
        java.sql.NClob nClob9 = pugConnection3.createNClob();
        org.junit.Assert.assertNull(stringMaxAggregationMetric2);
        org.junit.Assert.assertNotNull(pugConnection3);
        org.junit.Assert.assertNull(databaseMetaData6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(savepoint8);
        org.junit.Assert.assertNull(nClob9);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 100);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromMinutesAgo((-1L));
        com.inspiring.pugtsdb.time.Interval interval5 = builder1.fromMinutesAgo(10L);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(interval5);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastDays(718747495729L);
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository2 = pointRocksRepository1.getMetricRepository();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList7 = pointRocksRepository1.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap4, (long) (short) 1, 10L);
        com.inspiring.pugtsdb.time.Granularity granularity10 = com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.concurrent.ScheduledExecutorService>> scheduledExecutorServiceMetricPointsList13 = pointRocksRepository1.selectLastMetricsPointsByNameAndAggregationAndTags("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "'sum'}", granularity10, strMap11, (int) (short) 1);
        com.inspiring.pugtsdb.sql.PugConnection pugConnection14 = pointRocksRepository1.getConnection();
        java.sql.CallableStatement callableStatement19 = pugConnection14.prepareCall("'sum'}", (int) (byte) 10, (int) (short) -1, 10);
        org.junit.Assert.assertNotNull(metricRocksRepository2);
        org.junit.Assert.assertNull(doubleListMetricPointsList7);
        org.junit.Assert.assertTrue("'" + granularity10 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE + "'", granularity10.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE));
        org.junit.Assert.assertNull(scheduledExecutorServiceMetricPointsList13);
        org.junit.Assert.assertNotNull(pugConnection14);
        org.junit.Assert.assertNull(callableStatement19);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        java.util.function.Supplier<com.esotericsoftware.kryo.Kryo> kryoSupplier0 = com.inspiring.pugtsdb.util.Serializer.defaultKryoSupplier();
        org.junit.Assert.assertNotNull(kryoSupplier0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository1 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository2 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository1);
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository1);
        com.inspiring.pugtsdb.bean.Tag tag6 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str7 = tag6.getValue();
        com.inspiring.pugtsdb.bean.Tag tag9 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str10 = tag9.getValue();
        com.inspiring.pugtsdb.bean.Tag tag12 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str13 = tag12.toString();
        com.inspiring.pugtsdb.bean.Tag[] tagArray14 = new com.inspiring.pugtsdb.bean.Tag[] { tag6, tag9, tag12 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList15 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList15, tagArray14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList15);
        com.inspiring.pugtsdb.metric.LongMetric longMetric18 = new com.inspiring.pugtsdb.metric.LongMetric("Aggregation{name='sum'}", strMap17);
        byte[] byteArray20 = longMetric18.valueToBytes((java.lang.Long) 7233188113542599437L);
        java.lang.String str21 = longMetric18.getId();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = metricH2Repository3.notExistsMetric((com.inspiring.pugtsdb.metric.Metric<java.lang.Long>) longMetric18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'sum'}" + "'", str7, "'sum'}");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'sum'}" + "'", str10, "'sum'}");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Tag{name='Aggregation{name', value=''sum'}'}" + "'", str13, "Tag{name='Aggregation{name', value=''sum'}'}");
        org.junit.Assert.assertNotNull(tagArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[100, 97, 114, 68, 37, 72, -45, 13]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0000476860250" + "'", str21, "0000476860250");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long2 = com.inspiring.pugtsdb.util.Bytes.toLong(byteArray1);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.exception.PugConversionException; message: Cannot convert bytes [1] to Long: Expected a length of 8, got 1");
        } catch (com.inspiring.pugtsdb.exception.PugConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository2 = pointRocksRepository1.getMetricRepository();
        com.inspiring.pugtsdb.time.Granularity granularity7 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity8 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList9 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent10 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity7, granularity8, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList9);
        com.inspiring.pugtsdb.time.Granularity granularity11 = h2RepositoryRollUpEvent10.getSourceGranularity();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>>> wildcardClassMetricPointsList14 = pointRocksRepository1.selectLastMetricsPointsByNameAndAggregationAndTags("", "hi!", granularity11, strMap12, (int) (short) 1);
        org.junit.Assert.assertNotNull(metricRocksRepository2);
        org.junit.Assert.assertTrue("'" + granularity7 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity7.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity8 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity8.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity11 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity11.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertNull(wildcardClassMetricPointsList14);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.rollup.aggregation.StringMaxAggregation> stringMaxAggregationMetric2 = metricRocksRepository0.selectMetricById("Point{timestamp=32, value=[0.0, 10.0]}");
        com.inspiring.pugtsdb.sql.PugConnection pugConnection3 = metricRocksRepository0.getConnection();
        com.inspiring.pugtsdb.bean.Tag tag6 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str7 = tag6.getValue();
        com.inspiring.pugtsdb.bean.Tag tag9 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str10 = tag9.getValue();
        com.inspiring.pugtsdb.bean.Tag tag12 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str13 = tag12.toString();
        com.inspiring.pugtsdb.bean.Tag[] tagArray14 = new com.inspiring.pugtsdb.bean.Tag[] { tag6, tag9, tag12 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList15 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList15, tagArray14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList15);
        com.inspiring.pugtsdb.metric.LongMetric longMetric18 = new com.inspiring.pugtsdb.metric.LongMetric("Aggregation{name='sum'}", strMap17);
        java.lang.String str19 = longMetric18.getId();
        // The following exception was thrown during execution in test generation
        try {
            metricRocksRepository0.insertMetric((com.inspiring.pugtsdb.metric.Metric<java.lang.Long>) longMetric18);
            org.junit.Assert.fail("Expected exception of type com.inspiring.pugtsdb.exception.PugException; message: Cannot insert metric Metric{id=0000476860250, type='com.inspiring.pugtsdb.metric.LongMetric', name='Aggregation{name='sum'}', tags={Aggregation{name='sum'}}}");
        } catch (com.inspiring.pugtsdb.exception.PugException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stringMaxAggregationMetric2);
        org.junit.Assert.assertNotNull(pugConnection3);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'sum'}" + "'", str7, "'sum'}");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'sum'}" + "'", str10, "'sum'}");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Tag{name='Aggregation{name', value=''sum'}'}" + "'", str13, "Tag{name='Aggregation{name', value=''sum'}'}");
        org.junit.Assert.assertNotNull(tagArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0000476860250" + "'", str19, "0000476860250");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        java.time.temporal.ChronoUnit chronoUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = com.inspiring.pugtsdb.util.Temporals.truncate(32L, chronoUnit1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository2 = pointRocksRepository1.getMetricRepository();
        com.inspiring.pugtsdb.time.Granularity granularity5 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>> wildcardClassMetricPoints7 = pointRocksRepository1.selectLastMetricPointsByIdAndAggregation("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "", granularity5, 1);
        com.inspiring.pugtsdb.sql.PugConnection pugConnection8 = pointRocksRepository1.getConnection();
        java.sql.CallableStatement callableStatement10 = pugConnection8.prepareCall("Interval{fromTime=-1690392033978951, untilTime=-1690129059378951}");
        org.junit.Assert.assertNotNull(metricRocksRepository2);
        org.junit.Assert.assertTrue("'" + granularity5 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity5.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNull(wildcardClassMetricPoints7);
        org.junit.Assert.assertNotNull(pugConnection8);
        org.junit.Assert.assertNull(callableStatement10);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier1 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository2 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier1, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository5 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository2);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository8 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository9 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository8);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository10 = pointRocksRepository9.getMetricRepository();
        com.inspiring.pugtsdb.time.Granularity granularity13 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>> wildcardClassMetricPoints15 = pointRocksRepository9.selectLastMetricPointsByIdAndAggregation("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "", granularity13, 1);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository18 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository19 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository18);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository20 = pointRocksRepository19.getMetricRepository();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList25 = pointRocksRepository19.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap22, (long) (short) 1, 10L);
        com.inspiring.pugtsdb.time.Granularity granularity28 = com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE;
        java.util.Map<java.lang.String, java.lang.String> strMap29 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.concurrent.ScheduledExecutorService>> scheduledExecutorServiceMetricPointsList31 = pointRocksRepository19.selectLastMetricsPointsByNameAndAggregationAndTags("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "'sum'}", granularity28, strMap29, (int) (short) 1);
        com.inspiring.pugtsdb.bean.Tag tag34 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str35 = tag34.getValue();
        com.inspiring.pugtsdb.bean.Tag tag37 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str38 = tag37.getValue();
        com.inspiring.pugtsdb.bean.Tag tag40 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str41 = tag40.toString();
        com.inspiring.pugtsdb.bean.Tag[] tagArray42 = new com.inspiring.pugtsdb.bean.Tag[] { tag34, tag37, tag40 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList43 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList43, tagArray42);
        java.util.Map<java.lang.String, java.lang.String> strMap45 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList43);
        com.inspiring.pugtsdb.metric.LongMetric longMetric46 = new com.inspiring.pugtsdb.metric.LongMetric("Aggregation{name='sum'}", strMap45);
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList48 = pointRocksRepository9.selectLastMetricsPointsByNameAndAggregationAndTags("", "Interval{fromTime=1674166070495, untilTime=1700463530495}", granularity28, strMap45, 1);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository52 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository53 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository52);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository54 = pointRocksRepository53.getMetricRepository();
        com.inspiring.pugtsdb.time.Granularity granularity57 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>> wildcardClassMetricPoints59 = pointRocksRepository53.selectLastMetricPointsByIdAndAggregation("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "", granularity57, 1);
        com.inspiring.pugtsdb.time.Granularity granularity62 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity63 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList64 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent65 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity62, granularity63, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList64);
        com.inspiring.pugtsdb.time.Granularity granularity66 = h2RepositoryRollUpEvent65.getSourceGranularity();
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>>> h2RepositoryRollUpEventMetricPointsList67 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryRollUpEventRollUpEvent68 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>>("Aggregation{name", "100", granularity57, granularity66, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>>>) h2RepositoryRollUpEventMetricPointsList67);
        com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.PointRepository> pointRepositoryMetricPoints71 = pointRocksRepository9.selectMetricPointsByIdBetweenTimestamp("max", granularity57, (long) 10, (long) ' ');
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository74 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository75 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository74);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository76 = pointRocksRepository75.getMetricRepository();
        com.inspiring.pugtsdb.time.Granularity granularity79 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>> wildcardClassMetricPoints81 = pointRocksRepository75.selectLastMetricPointsByIdAndAggregation("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "", granularity79, 1);
        long long82 = granularity79.getValue();
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.lang.AutoCloseable>> autoCloseableMetricPointsList84 = pointRocksRepository9.selectLastMetricsPointsByNameAndAggregation("Interval{fromTime=-1690392033978951, untilTime=-1690129059378951}", "100", granularity79, 2);
        // The following exception was thrown during execution in test generation
        try {
            pointH2Repository5.deletePointsByNameAndAggregationBeforeTime("Aggregation{name='sum'}", "'sum'}", granularity79, 1437494990209L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricRocksRepository10);
        org.junit.Assert.assertTrue("'" + granularity13 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity13.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNull(wildcardClassMetricPoints15);
        org.junit.Assert.assertNotNull(metricRocksRepository20);
        org.junit.Assert.assertNull(doubleListMetricPointsList25);
        org.junit.Assert.assertTrue("'" + granularity28 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE + "'", granularity28.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE));
        org.junit.Assert.assertNull(scheduledExecutorServiceMetricPointsList31);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "'sum'}" + "'", str35, "'sum'}");
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "'sum'}" + "'", str38, "'sum'}");
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Tag{name='Aggregation{name', value=''sum'}'}" + "'", str41, "Tag{name='Aggregation{name', value=''sum'}'}");
        org.junit.Assert.assertNotNull(tagArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNull(doubleListMetricPointsList48);
        org.junit.Assert.assertNotNull(metricRocksRepository54);
        org.junit.Assert.assertTrue("'" + granularity57 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity57.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNull(wildcardClassMetricPoints59);
        org.junit.Assert.assertTrue("'" + granularity62 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity62.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity63 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity63.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity66 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity66.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertNull(pointRepositoryMetricPoints71);
        org.junit.Assert.assertNotNull(metricRocksRepository76);
        org.junit.Assert.assertTrue("'" + granularity79 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity79.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNull(wildcardClassMetricPoints81);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 1L + "'", long82 == 1L);
        org.junit.Assert.assertNull(autoCloseableMetricPointsList84);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        java.time.temporal.ChronoUnit chronoUnit1 = null;
        com.inspiring.pugtsdb.time.Retention retention2 = new com.inspiring.pugtsdb.time.Retention((long) (byte) 10, chronoUnit1);
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList3 = retention2.getUnits();
        java.util.List<java.time.temporal.TemporalUnit> temporalUnitList4 = retention2.getUnits();
        java.time.temporal.Temporal temporal5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.temporal.Temporal temporal6 = retention2.subtractFrom(temporal5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporalUnitList3);
        org.junit.Assert.assertNotNull(temporalUnitList4);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository2 = pointRocksRepository1.getMetricRepository();
        com.inspiring.pugtsdb.time.Granularity granularity7 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity8 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList9 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent10 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity7, granularity8, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList9);
        com.inspiring.pugtsdb.time.Granularity granularity11 = h2RepositoryRollUpEvent10.getSourceGranularity();
        com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.bean.MetricPoint<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>> doubleAggregationMetricPointMetricPoints14 = pointRocksRepository1.selectMetricPointsByIdAndAggregationBetweenTimestamp("100", "hi!", granularity11, (-1L), (long) 2);
        com.inspiring.pugtsdb.bean.Tag tag18 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str19 = tag18.getValue();
        com.inspiring.pugtsdb.bean.Tag tag21 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str22 = tag21.getValue();
        com.inspiring.pugtsdb.bean.Tag tag24 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str25 = tag24.toString();
        com.inspiring.pugtsdb.bean.Tag[] tagArray26 = new com.inspiring.pugtsdb.bean.Tag[] { tag18, tag21, tag24 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList27 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList27, tagArray26);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList27);
        com.inspiring.pugtsdb.metric.LongMetric longMetric30 = new com.inspiring.pugtsdb.metric.LongMetric("Aggregation{name='sum'}", strMap29);
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.sql.PugConnection>> pugConnectionMetricPointsList33 = pointRocksRepository1.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("hi!", strMap29, (long) 2, (long) 1325048386);
        org.junit.Assert.assertNotNull(metricRocksRepository2);
        org.junit.Assert.assertTrue("'" + granularity7 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity7.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity8 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity8.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity11 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity11.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertNull(doubleAggregationMetricPointMetricPoints14);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "'sum'}" + "'", str19, "'sum'}");
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "'sum'}" + "'", str22, "'sum'}");
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Tag{name='Aggregation{name', value=''sum'}'}" + "'", str25, "Tag{name='Aggregation{name', value=''sum'}'}");
        org.junit.Assert.assertNotNull(tagArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNull(pugConnectionMetricPointsList33);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.h2.TagH2Repository tagH2Repository1 = new com.inspiring.pugtsdb.repository.h2.TagH2Repository();
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository2 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository(pugConnectionSupplier0, (com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository1);
        com.inspiring.pugtsdb.repository.h2.MetricH2Repository metricH2Repository3 = new com.inspiring.pugtsdb.repository.h2.MetricH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository1);
        com.inspiring.pugtsdb.repository.h2.PointH2Repository pointH2Repository4 = new com.inspiring.pugtsdb.repository.h2.PointH2Repository((com.inspiring.pugtsdb.repository.TagRepository) tagH2Repository1);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (short) 100);
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        com.inspiring.pugtsdb.util.DummySqlConnection dummySqlConnection0 = new com.inspiring.pugtsdb.util.DummySqlConnection();
        dummySqlConnection0.setCatalog("");
        int int3 = dummySqlConnection0.getTransactionIsolation();
        java.sql.CallableStatement callableStatement7 = dummySqlConnection0.prepareCall("", 1, (int) (byte) 10);
        java.util.Properties properties8 = dummySqlConnection0.getClientInfo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(callableStatement7);
        org.junit.Assert.assertNull(properties8);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        java.util.function.Supplier<com.inspiring.pugtsdb.sql.PugConnection> pugConnectionSupplier0 = null;
        com.inspiring.pugtsdb.repository.h2.H2Repositories h2Repositories1 = new com.inspiring.pugtsdb.repository.h2.H2Repositories(pugConnectionSupplier0);
        com.inspiring.pugtsdb.repository.PointRepository pointRepository2 = h2Repositories1.getPointRepository();
        java.time.temporal.ChronoUnit chronoUnit4 = null;
        com.inspiring.pugtsdb.time.Retention retention5 = com.inspiring.pugtsdb.time.Retention.of((long) (byte) 10, chronoUnit4);
        java.time.temporal.ChronoUnit chronoUnit7 = null;
        com.inspiring.pugtsdb.time.Retention retention8 = com.inspiring.pugtsdb.time.Retention.of((long) (byte) 10, chronoUnit7);
        com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger scheduledPointPurger9 = new com.inspiring.pugtsdb.rollup.schedule.ScheduledPointPurger((com.inspiring.pugtsdb.repository.Repositories) h2Repositories1, retention5, retention8);
        scheduledPointPurger9.close();
        org.junit.Assert.assertNotNull(pointRepository2);
        org.junit.Assert.assertNotNull(retention5);
        org.junit.Assert.assertNotNull(retention8);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository1 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository0);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository2 = pointRocksRepository1.getMetricRepository();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList7 = pointRocksRepository1.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap4, (long) (short) 1, 10L);
        com.inspiring.pugtsdb.time.Granularity granularity10 = com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.concurrent.ScheduledExecutorService>> scheduledExecutorServiceMetricPointsList13 = pointRocksRepository1.selectLastMetricsPointsByNameAndAggregationAndTags("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "'sum'}", granularity10, strMap11, (int) (short) 1);
        com.inspiring.pugtsdb.sql.PugConnection pugConnection14 = pointRocksRepository1.getConnection();
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository17 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository18 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository17);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository19 = pointRocksRepository18.getMetricRepository();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.util.ArrayList<java.lang.Double>>> doubleListMetricPointsList24 = pointRocksRepository18.selectRawMetricsPointsByNameAndTagsBetweenTimestamp("Aggregation{name='sum'}", strMap21, (long) (short) 1, 10L);
        com.inspiring.pugtsdb.time.Granularity granularity31 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity32 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList33 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent34 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity31, granularity32, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList33);
        com.inspiring.pugtsdb.time.Granularity granularity35 = h2RepositoryRollUpEvent34.getTargetGranularity();
        com.inspiring.pugtsdb.time.Granularity granularity38 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity39 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList40 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent41 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity38, granularity39, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList40);
        com.inspiring.pugtsdb.time.Granularity granularity42 = h2RepositoryRollUpEvent41.getTargetGranularity();
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>> doubleAggregationMetricPointsList43 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>> doubleAggregationRollUpEvent44 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "max", granularity35, granularity42, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.Aggregation<java.lang.Double>>>) doubleAggregationMetricPointsList43);
        java.util.Map<java.lang.String, java.lang.String> strMap45 = null;
        java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>>> wildcardClassMetricPointsList47 = pointRocksRepository18.selectLastMetricsPointsByNameAndAggregationAndTags("", "Interval{fromTime=1674166070495, untilTime=1700463530495}", granularity35, strMap45, (int) (byte) 10);
        com.inspiring.pugtsdb.time.Granularity granularity51 = com.inspiring.pugtsdb.time.Granularity.ONE_YEAR;
        com.inspiring.pugtsdb.time.Granularity granularity52 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>> h2RepositoryMetricPointsList53 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>();
        com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository> h2RepositoryRollUpEvent54 = new com.inspiring.pugtsdb.rollup.listen.RollUpEvent<com.inspiring.pugtsdb.repository.h2.H2Repository>("Aggregation{name='or'}", "max", granularity51, granularity52, (java.util.List<com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.repository.h2.H2Repository>>) h2RepositoryMetricPointsList53);
        com.inspiring.pugtsdb.time.Granularity granularity55 = h2RepositoryRollUpEvent54.getTargetGranularity();
        com.inspiring.pugtsdb.bean.MetricPoints<java.time.temporal.TemporalAmount> temporalAmountMetricPoints58 = pointRocksRepository18.selectMetricPointsByIdBetweenTimestamp("Tag{name='Aggregation{name', value=''sum'}'}", granularity55, (long) (short) 10, (long) (short) 1);
        com.inspiring.pugtsdb.bean.MetricPoints<com.inspiring.pugtsdb.rollup.aggregation.StringMaxAggregation> stringMaxAggregationMetricPoints60 = pointRocksRepository1.selectLastMetricPointsByIdAndAggregation("'sum'}", "MetricPoint{metric=null, point=null}", granularity55, 1);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository63 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.repository.rocks.PointRocksRepository pointRocksRepository64 = new com.inspiring.pugtsdb.repository.rocks.PointRocksRepository(metricRocksRepository63);
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository65 = pointRocksRepository64.getMetricRepository();
        com.inspiring.pugtsdb.time.Granularity granularity68 = com.inspiring.pugtsdb.time.Granularity.ONE_MONTH;
        com.inspiring.pugtsdb.bean.MetricPoints<java.lang.Class<?>> wildcardClassMetricPoints70 = pointRocksRepository64.selectLastMetricPointsByIdAndAggregation("com.inspiring.pugtsdb.exception.PugException: Aggregation{name='sum'}", "", granularity68, 1);
        com.inspiring.pugtsdb.bean.MetricPoints<java.util.RandomAccess> randomAccessMetricPoints72 = pointRocksRepository1.selectLastMetricPointsByIdAndAggregation("Aggregation{name='sum'}", "0000476860250", granularity68, (int) 'a');
        org.junit.Assert.assertNotNull(metricRocksRepository2);
        org.junit.Assert.assertNull(doubleListMetricPointsList7);
        org.junit.Assert.assertTrue("'" + granularity10 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE + "'", granularity10.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MINUTE));
        org.junit.Assert.assertNull(scheduledExecutorServiceMetricPointsList13);
        org.junit.Assert.assertNotNull(pugConnection14);
        org.junit.Assert.assertNotNull(metricRocksRepository19);
        org.junit.Assert.assertNull(doubleListMetricPointsList24);
        org.junit.Assert.assertTrue("'" + granularity31 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity31.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity32 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity32.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity35 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity35.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity38 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity38.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity39 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity39.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity42 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity42.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNull(wildcardClassMetricPointsList47);
        org.junit.Assert.assertTrue("'" + granularity51 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_YEAR + "'", granularity51.equals(com.inspiring.pugtsdb.time.Granularity.ONE_YEAR));
        org.junit.Assert.assertTrue("'" + granularity52 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity52.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertTrue("'" + granularity55 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity55.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNull(temporalAmountMetricPoints58);
        org.junit.Assert.assertNull(stringMaxAggregationMetricPoints60);
        org.junit.Assert.assertNotNull(metricRocksRepository65);
        org.junit.Assert.assertTrue("'" + granularity68 + "' != '" + com.inspiring.pugtsdb.time.Granularity.ONE_MONTH + "'", granularity68.equals(com.inspiring.pugtsdb.time.Granularity.ONE_MONTH));
        org.junit.Assert.assertNull(wildcardClassMetricPoints70);
        org.junit.Assert.assertNull(randomAccessMetricPoints72);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        com.inspiring.pugtsdb.bean.Tag tag2 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str3 = tag2.getValue();
        com.inspiring.pugtsdb.bean.Tag tag5 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str6 = tag5.getValue();
        com.inspiring.pugtsdb.bean.Tag tag8 = com.inspiring.pugtsdb.bean.Tag.valueOf("Aggregation{name='sum'}");
        java.lang.String str9 = tag8.toString();
        com.inspiring.pugtsdb.bean.Tag[] tagArray10 = new com.inspiring.pugtsdb.bean.Tag[] { tag2, tag5, tag8 };
        java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag> tagList11 = new java.util.ArrayList<com.inspiring.pugtsdb.bean.Tag>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList11, tagArray10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = com.inspiring.pugtsdb.bean.Tag.toMap((java.util.Collection<com.inspiring.pugtsdb.bean.Tag>) tagList11);
        com.inspiring.pugtsdb.metric.LongMetric longMetric14 = new com.inspiring.pugtsdb.metric.LongMetric("Aggregation{name='sum'}", strMap13);
        byte[] byteArray16 = longMetric14.valueToBytes((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'sum'}" + "'", str3, "'sum'}");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'sum'}" + "'", str6, "'sum'}");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Tag{name='Aggregation{name', value=''sum'}'}" + "'", str9, "Tag{name='Aggregation{name', value=''sum'}'}");
        org.junit.Assert.assertNotNull(tagArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.until(1691829528911L);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromHoursAgo(4617315517961601024L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Exceeds capacity of Duration: 16622335864661763686400000000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastSeconds((long) (byte) 0);
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository metricRocksRepository0 = new com.inspiring.pugtsdb.repository.rocks.MetricRocksRepository();
        com.inspiring.pugtsdb.metric.Metric<com.inspiring.pugtsdb.rollup.aggregation.StringMaxAggregation> stringMaxAggregationMetric2 = metricRocksRepository0.selectMetricById("Point{timestamp=32, value=[0.0, 10.0]}");
        com.inspiring.pugtsdb.sql.PugConnection pugConnection3 = metricRocksRepository0.getConnection();
        pugConnection3.setSchema("MetricPoint{metric=null, point=null}");
        java.sql.DatabaseMetaData databaseMetaData6 = pugConnection3.getMetaData();
        boolean boolean7 = pugConnection3.getAutoCommit();
        pugConnection3.setClientInfo("", "100");
        java.sql.SQLWarning sQLWarning11 = pugConnection3.getWarnings();
        org.junit.Assert.assertNull(stringMaxAggregationMetric2);
        org.junit.Assert.assertNotNull(pugConnection3);
        org.junit.Assert.assertNull(databaseMetaData6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(sQLWarning11);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromWeeksAgo(1695976731791L);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Instant exceeds minimum or maximum instant");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }
}
