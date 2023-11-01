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
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Seconds;
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Seconds + "'", unit0.equals(com.bizo.asperatus.model.Unit.Seconds));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        com.amazonaws.services.cloudwatch.AmazonCloudWatch amazonCloudWatch0 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.bizo.asperatus.tracker.impl.CWMetricTracker cWMetricTracker5 = new com.bizo.asperatus.tracker.impl.CWMetricTracker(amazonCloudWatch0, "", scheduledExecutorService2, (long) (byte) 1, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        com.google.common.base.Stopwatch stopwatch0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker1 = new com.bizo.asperatus.rates.ThreadSafeRateTracker(stopwatch0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.KilobitsSecond;
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.KilobitsSecond + "'", unit0.equals(com.bizo.asperatus.model.Unit.KilobitsSecond));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        com.bizo.asperatus.model.CompoundDimension compoundDimension1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.bizo.asperatus.tracker.impl.MetricKey metricKey2 = new com.bizo.asperatus.tracker.impl.MetricKey("hi!", compoundDimension1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.MegabitsSecond;
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.MegabitsSecond + "'", unit0.equals(com.bizo.asperatus.model.Unit.MegabitsSecond));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        // The following exception was thrown during execution in test generation
        try {
            com.bizo.asperatus.tracker.MetricTracker metricTracker0 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Missing required property: APPLICATION");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider1 = null;
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder2 = cWMetricTrackerBuilder0.withCredentialsProvider(aWSCredentialsProvider1);
        java.lang.String str3 = cWMetricTrackerBuilder0.getRegion();
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-east-1" + "'", str3, "us-east-1");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        // The following exception was thrown during execution in test generation
        try {
            com.bizo.asperatus.model.Unit unit1 = com.bizo.asperatus.model.Unit.fromValue("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create unit enum from hi! value!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Microseconds;
        java.lang.String str1 = unit0.getValue();
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Microseconds + "'", unit0.equals(com.bizo.asperatus.model.Unit.Microseconds));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Microseconds" + "'", str1, "Microseconds");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        com.bizo.asperatus.tracker.impl.RetryingScheduler retryingScheduler1 = new com.bizo.asperatus.tracker.impl.RetryingScheduler(scheduledExecutorService0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        // The following exception was thrown during execution in test generation
        try {
            com.bizo.asperatus.model.Unit unit1 = com.bizo.asperatus.model.Unit.fromValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value cannot be null or empty!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        // The following exception was thrown during execution in test generation
        try {
            asperatusRateTrackerScheduler14.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension8 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray9 = new com.bizo.asperatus.model.Dimension[] { dimension8 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList10 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList10, dimensionArray9);
        metricTracker3.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList10);
        java.lang.Class<?> wildcardClass13 = dimensionList10.getClass();
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.BitsSecond;
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.BitsSecond + "'", unit0.equals(com.bizo.asperatus.model.Unit.BitsSecond));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        // The following exception was thrown during execution in test generation
        try {
            asperatusRateTrackerScheduler14.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: This AsperatusRateTrackerScheduler has already been stopped.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension8 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray9 = new com.bizo.asperatus.model.Dimension[] { dimension8 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList10 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList10, dimensionArray9);
        metricTracker3.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList10);
        com.bizo.asperatus.model.Unit unit15 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension18 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray19 = new com.bizo.asperatus.model.Dimension[] { dimension18 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList20 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList20, dimensionArray19);
        com.bizo.asperatus.model.CompoundDimension compoundDimension22 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList20);
        metricTracker3.track("us-east-1", (java.lang.Number) 10.0f, unit15, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList20);
        com.bizo.asperatus.model.Dimension dimension28 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray29 = new com.bizo.asperatus.model.Dimension[] { dimension28 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList30 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList30, dimensionArray29);
        com.bizo.asperatus.model.CompoundDimension compoundDimension32 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList30);
        metricTracker3.track("Gigabytes", (java.lang.Number) (-1), (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList30);
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + unit15 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit15.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dimensionArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Megabits;
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Megabits + "'", unit0.equals(com.bizo.asperatus.model.Unit.Megabits));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.util.Collection<java.lang.String> strCollection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder1 = com.bizo.asperatus.logging.error.MachineInfo.with(strCollection0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.BytesSecond;
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.BytesSecond + "'", unit0.equals(com.bizo.asperatus.model.Unit.BytesSecond));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        int int15 = asperatusRateTrackerScheduler14.getFrequency();
        boolean boolean16 = asperatusRateTrackerScheduler14.isStarted();
        asperatusRateTrackerScheduler14.setFrequency(0);
        // The following exception was thrown during execution in test generation
        try {
            asperatusRateTrackerScheduler14.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: This AsperatusRateTrackerScheduler has already been stopped.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.bizo.asperatus.model.Dimension dimension2 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray3 = new com.bizo.asperatus.model.Dimension[] { dimension2 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList4 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList4, dimensionArray3);
        com.bizo.asperatus.model.CompoundDimension compoundDimension6 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList4);
        com.bizo.asperatus.model.Unit unit7 = com.bizo.asperatus.model.Unit.Megabytes;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics8 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit7);
        boolean boolean9 = compoundDimension6.equals((java.lang.Object) unit7);
        org.junit.Assert.assertNotNull(dimensionArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + unit7 + "' != '" + com.bizo.asperatus.model.Unit.Megabytes + "'", unit7.equals(com.bizo.asperatus.model.Unit.Megabytes));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Microseconds;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        float float2 = metricStatistics1.getMax();
        metricStatistics1.add((java.lang.Number) 1.0f);
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Microseconds + "'", unit0.equals(com.bizo.asperatus.model.Unit.Microseconds));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider1 = null;
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder2 = cWMetricTrackerBuilder0.withCredentialsProvider(aWSCredentialsProvider1);
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = cWMetricTrackerBuilder2.withStage("");
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder2);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder4);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str4 = dimension3.getValue();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey5 = new com.bizo.asperatus.tracker.impl.MetricKey("Gigabytes", dimension3);
        com.bizo.asperatus.model.CompoundDimension compoundDimension6 = metricKey5.getDimension();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(compoundDimension6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = cWMetricTrackerBuilder0.getExecutor();
        long long3 = cWMetricTrackerBuilder0.getFlushDelay();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertNull(scheduledExecutorService2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60L + "'", long3 == 60L);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.bizo.asperatus.tracker.Env.envOrProperty("Microseconds");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Missing required property: Microseconds");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Percent;
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Percent + "'", unit0.equals(com.bizo.asperatus.model.Unit.Percent));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = cWMetricTrackerBuilder0.getExecutor();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = cWMetricTrackerBuilder0.withStage("Terabytes");
        java.lang.String str5 = cWMetricTrackerBuilder4.getStage();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertNull(scheduledExecutorService2);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Terabytes" + "'", str5, "Terabytes");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.bizo.asperatus.tracker.Env.envOrProperty("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Missing required property: hi!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.bizo.asperatus.model.Dimension dimension2 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray3 = new com.bizo.asperatus.model.Dimension[] { dimension2 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList4 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList4, dimensionArray3);
        com.bizo.asperatus.model.CompoundDimension compoundDimension6 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList4);
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList7 = compoundDimension6.getDimensions();
        java.lang.String str8 = compoundDimension6.toString();
        org.junit.Assert.assertNotNull(dimensionArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dimensionList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CompoundDimension[dimensions=[Dimension[hi!=hi!]]]" + "'", str8, "CompoundDimension[dimensions=[Dimension[hi!=hi!]]]");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder1 = com.bizo.asperatus.logging.error.MachineInfo.without(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.amazonaws.services.cloudwatch.AmazonCloudWatch amazonCloudWatch0 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker7 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit6);
        com.bizo.asperatus.model.Dimension dimension11 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray12 = new com.bizo.asperatus.model.Dimension[] { dimension11 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList13 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList13, dimensionArray12);
        com.bizo.asperatus.model.CompoundDimension compoundDimension15 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList13);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker16 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService17 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler18 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker7, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList13, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker16, scheduledExecutorService17);
        int int19 = asperatusRateTrackerScheduler18.getFrequency();
        boolean boolean20 = asperatusRateTrackerScheduler18.isStarted();
        java.util.concurrent.TimeUnit timeUnit21 = asperatusRateTrackerScheduler18.getFrequencyUnit();
        // The following exception was thrown during execution in test generation
        try {
            com.bizo.asperatus.tracker.impl.CWMetricTracker cWMetricTracker22 = new com.bizo.asperatus.tracker.impl.CWMetricTracker(amazonCloudWatch0, "hi!", scheduledExecutorService2, 10L, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricTracker7);
        org.junit.Assert.assertNotNull(dimensionArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(timeUnit21);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Unit unit7 = com.bizo.asperatus.model.Unit.fromValue("Microseconds");
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList8 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricTracker3.track("us-east-1", (java.lang.Number) (-1.0f), unit7, dimensionList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertTrue("'" + unit7 + "' != '" + com.bizo.asperatus.model.Unit.Microseconds + "'", unit7.equals(com.bizo.asperatus.model.Unit.Microseconds));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Megabytes;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        long long2 = metricStatistics1.getSamples();
        float float3 = metricStatistics1.getSum();
        float float4 = metricStatistics1.getMin();
        float float5 = metricStatistics1.getSum();
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Megabytes + "'", unit0.equals(com.bizo.asperatus.model.Unit.Megabytes));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 3.4028235E38f + "'", float4 == 3.4028235E38f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = com.bizo.asperatus.logging.error.MachineInfo.info;
        org.junit.Assert.assertNotNull(strMap0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        java.lang.String str2 = cWMetricTrackerBuilder0.getRegion();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = cWMetricTrackerBuilder0.withRegion("Gigabytes");
        java.lang.String str5 = cWMetricTrackerBuilder4.getApplication();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "us-east-1" + "'", str2, "us-east-1");
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        com.bizo.asperatus.model.Dimension dimension2 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str3 = dimension2.getValue();
        java.lang.String str4 = dimension2.toString();
        java.lang.String str5 = dimension2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Dimension[hi!=hi!]" + "'", str4, "Dimension[hi!=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder4 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList2);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder5 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList2);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder6 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder4);
        org.junit.Assert.assertNotNull(machineInfoBuilder5);
        org.junit.Assert.assertNotNull(machineInfoBuilder6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.TerabytesSecond;
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.TerabytesSecond + "'", unit0.equals(com.bizo.asperatus.model.Unit.TerabytesSecond));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Microseconds;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        float float2 = metricStatistics1.getMax();
        float float3 = metricStatistics1.getMax();
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Microseconds + "'", unit0.equals(com.bizo.asperatus.model.Unit.Microseconds));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.4E-45f + "'", float3 == 1.4E-45f);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Bytes;
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Bytes + "'", unit0.equals(com.bizo.asperatus.model.Unit.Bytes));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = cWMetricTrackerBuilder0.getExecutor();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = cWMetricTrackerBuilder0.withStage("Terabytes");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder6 = cWMetricTrackerBuilder0.withRegion("Gigabytes");
        // The following exception was thrown during execution in test generation
        try {
            com.bizo.asperatus.tracker.MetricTracker metricTracker7 = cWMetricTrackerBuilder0.toMetricTracker();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Must set application before constructing.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertNull(scheduledExecutorService2);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder4);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder6);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Megabytes;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        boolean boolean3 = metricStatistics1.equals((java.lang.Object) (byte) 10);
        float float4 = metricStatistics1.getSum();
        float float5 = metricStatistics1.getSum();
        java.lang.String str6 = metricStatistics1.toString();
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Megabytes + "'", unit0.equals(com.bizo.asperatus.model.Unit.Megabytes));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MStats[unit:Megabytes,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]" + "'", str6, "MStats[unit:Megabytes,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.bizo.asperatus.model.Dimension dimension2 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str3 = dimension2.getValue();
        java.lang.String str4 = dimension2.toString();
        java.lang.String str5 = dimension2.getName();
        java.util.concurrent.TimeUnit timeUnit8 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker9 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit8);
        com.bizo.asperatus.model.Dimension dimension13 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray14 = new com.bizo.asperatus.model.Dimension[] { dimension13 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList15 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList15, dimensionArray14);
        com.bizo.asperatus.model.CompoundDimension compoundDimension17 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList15);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker18 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService19 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler20 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker9, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList15, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker18, scheduledExecutorService19);
        com.bizo.asperatus.model.Unit unit23 = com.bizo.asperatus.model.Unit.Count;
        java.util.concurrent.TimeUnit timeUnit26 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker27 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit26);
        com.bizo.asperatus.model.Dimension dimension32 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray33 = new com.bizo.asperatus.model.Dimension[] { dimension32 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList34 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList34, dimensionArray33);
        metricTracker27.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList34);
        java.util.concurrent.TimeUnit timeUnit41 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker42 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit41);
        com.bizo.asperatus.model.Dimension dimension47 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray48 = new com.bizo.asperatus.model.Dimension[] { dimension47 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList49 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList49, dimensionArray48);
        metricTracker42.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList49);
        com.bizo.asperatus.model.Unit unit54 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension57 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray58 = new com.bizo.asperatus.model.Dimension[] { dimension57 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList59 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList59, dimensionArray58);
        com.bizo.asperatus.model.CompoundDimension compoundDimension61 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList59);
        metricTracker42.track("us-east-1", (java.lang.Number) 10.0f, unit54, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList59);
        metricTracker27.track("Dimension[hi!=hi!]", (java.lang.Number) (short) 1, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList59);
        metricTracker9.track("Terabytes", (java.lang.Number) 100.0d, unit23, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList59);
        boolean boolean65 = dimension2.equals((java.lang.Object) dimensionList59);
        java.lang.String str66 = dimension2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Dimension[hi!=hi!]" + "'", str4, "Dimension[hi!=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(metricTracker9);
        org.junit.Assert.assertNotNull(dimensionArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + unit23 + "' != '" + com.bizo.asperatus.model.Unit.Count + "'", unit23.equals(com.bizo.asperatus.model.Unit.Count));
        org.junit.Assert.assertNotNull(metricTracker27);
        org.junit.Assert.assertNotNull(dimensionArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(metricTracker42);
        org.junit.Assert.assertNotNull(dimensionArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + unit54 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit54.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Dimension[hi!=hi!]" + "'", str66, "Dimension[hi!=hi!]");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        com.bizo.asperatus.model.Dimension dimension4 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str5 = dimension4.getValue();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey6 = new com.bizo.asperatus.tracker.impl.MetricKey("hi!", dimension4);
        com.bizo.asperatus.tracker.impl.MetricKey metricKey7 = new com.bizo.asperatus.tracker.impl.MetricKey("", dimension4);
        java.lang.String str8 = dimension4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.bizo.asperatus.model.Dimension[] dimensionArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.bizo.asperatus.model.CompoundDimension compoundDimension1 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider1 = null;
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder2 = cWMetricTrackerBuilder0.withCredentialsProvider(aWSCredentialsProvider1);
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = cWMetricTrackerBuilder2.withRegion("hi!");
        java.lang.String str5 = cWMetricTrackerBuilder2.getRegion();
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder2);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        com.bizo.asperatus.model.Dimension dimension4 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str5 = dimension4.getValue();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey6 = new com.bizo.asperatus.tracker.impl.MetricKey("hi!", dimension4);
        com.bizo.asperatus.tracker.impl.MetricKey metricKey7 = new com.bizo.asperatus.tracker.impl.MetricKey("", dimension4);
        java.lang.String str8 = dimension4.getValue();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str4 = dimension3.getValue();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey5 = new com.bizo.asperatus.tracker.impl.MetricKey("Gigabytes", dimension3);
        boolean boolean7 = metricKey5.equals((java.lang.Object) 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.GigabytesSecond;
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.GigabytesSecond + "'", unit0.equals(com.bizo.asperatus.model.Unit.GigabytesSecond));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        int int15 = asperatusRateTrackerScheduler14.getFrequency();
        boolean boolean16 = asperatusRateTrackerScheduler14.isStarted();
        // The following exception was thrown during execution in test generation
        try {
            asperatusRateTrackerScheduler14.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: This AsperatusRateTrackerScheduler has already been stopped.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Microseconds;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        float float2 = metricStatistics1.getMax();
        java.lang.String str3 = metricStatistics1.toString();
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Microseconds + "'", unit0.equals(com.bizo.asperatus.model.Unit.Microseconds));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]" + "'", str3, "MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        int int15 = asperatusRateTrackerScheduler14.getFrequency();
        boolean boolean16 = asperatusRateTrackerScheduler14.isStarted();
        java.util.concurrent.TimeUnit timeUnit17 = asperatusRateTrackerScheduler14.getFrequencyUnit();
        int int18 = asperatusRateTrackerScheduler14.getFrequency();
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeUnit17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.bizo.asperatus.tracker.Env.envOrProperty("Dimension[hi!=hi!]", "");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Missing required property: Dimension[hi!=hi!]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        double double15 = threadSafeRateTracker12.getRateAndResetPeriod();
        threadSafeRateTracker12.track();
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Milliseconds;
        java.lang.String str1 = unit0.getValue();
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Milliseconds + "'", unit0.equals(com.bizo.asperatus.model.Unit.Milliseconds));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Milliseconds" + "'", str1, "Milliseconds");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = cWMetricTrackerBuilder0.getExecutor();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = cWMetricTrackerBuilder0.withStage("Terabytes");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder6 = cWMetricTrackerBuilder0.withRegion("Gigabytes");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder8 = cWMetricTrackerBuilder6.withApplication("");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService9 = cWMetricTrackerBuilder6.getExecutor();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertNull(scheduledExecutorService2);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder4);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder6);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder8);
        org.junit.Assert.assertNull(scheduledExecutorService9);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        // The following exception was thrown during execution in test generation
        try {
            com.bizo.asperatus.model.Unit unit1 = com.bizo.asperatus.model.Unit.fromValue("MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create unit enum from MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00] value!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        threadSafeRateTracker12.track();
        double double16 = threadSafeRateTracker12.getRateAndResetPeriod();
        double double17 = threadSafeRateTracker12.getRateAndResetPeriod();
        threadSafeRateTracker12.track();
        double double19 = threadSafeRateTracker12.getRateAndResetPeriod();
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + Double.POSITIVE_INFINITY + "'", double19 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        int int15 = asperatusRateTrackerScheduler14.getFrequency();
        boolean boolean16 = asperatusRateTrackerScheduler14.isStarted();
        java.util.concurrent.TimeUnit timeUnit17 = asperatusRateTrackerScheduler14.getFrequencyUnit();
        // The following exception was thrown during execution in test generation
        try {
            asperatusRateTrackerScheduler14.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeUnit17);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        com.bizo.asperatus.model.Unit unit17 = com.bizo.asperatus.model.Unit.Gigabytes;
        java.lang.String str18 = unit17.getValue();
        java.util.Collection<com.bizo.asperatus.model.CompoundDimension> compoundDimensionCollection19 = null;
        metricTracker3.track("CompoundDimension[dimensions=[Dimension[hi!=hi!]]]", (java.lang.Number) (-1), unit17, compoundDimensionCollection19);
        java.util.concurrent.TimeUnit timeUnit24 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker25 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit24);
        com.bizo.asperatus.model.Dimension dimension30 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray31 = new com.bizo.asperatus.model.Dimension[] { dimension30 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList32 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList32, dimensionArray31);
        metricTracker25.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList32);
        com.bizo.asperatus.model.Unit unit37 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension40 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray41 = new com.bizo.asperatus.model.Dimension[] { dimension40 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList42 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList42, dimensionArray41);
        com.bizo.asperatus.model.CompoundDimension compoundDimension44 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList42);
        metricTracker25.track("us-east-1", (java.lang.Number) 10.0f, unit37, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList42);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker46 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService47 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler48 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "Gigabytes", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList42, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker46, scheduledExecutorService47);
        // The following exception was thrown during execution in test generation
        try {
            asperatusRateTrackerScheduler48.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + unit17 + "' != '" + com.bizo.asperatus.model.Unit.Gigabytes + "'", unit17.equals(com.bizo.asperatus.model.Unit.Gigabytes));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Gigabytes" + "'", str18, "Gigabytes");
        org.junit.Assert.assertNotNull(metricTracker25);
        org.junit.Assert.assertNotNull(dimensionArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + unit37 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit37.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        boolean boolean15 = asperatusRateTrackerScheduler14.isStarted();
        // The following exception was thrown during execution in test generation
        try {
            asperatusRateTrackerScheduler14.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: This AsperatusRateTrackerScheduler has already been stopped.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        int int15 = asperatusRateTrackerScheduler14.getFrequency();
        boolean boolean16 = asperatusRateTrackerScheduler14.isStarted();
        asperatusRateTrackerScheduler14.setFrequency(0);
        // The following exception was thrown during execution in test generation
        try {
            asperatusRateTrackerScheduler14.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.bizo.asperatus.model.Dimension dimension2 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str3 = dimension2.getValue();
        java.lang.String str4 = dimension2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        float float2 = metricStatistics1.getMax();
        float float3 = metricStatistics1.getMax();
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit0.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.4E-45f + "'", float3 == 1.4E-45f);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Megabytes;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        float float2 = metricStatistics1.getMin();
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Megabytes + "'", unit0.equals(com.bizo.asperatus.model.Unit.Megabytes));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.4028235E38f + "'", float2 == 3.4028235E38f);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str4 = dimension3.getValue();
        java.lang.String str5 = dimension3.toString();
        java.lang.String str6 = dimension3.getName();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey7 = new com.bizo.asperatus.tracker.impl.MetricKey("", dimension3);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker11 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit10);
        com.bizo.asperatus.model.Dimension dimension15 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray16 = new com.bizo.asperatus.model.Dimension[] { dimension15 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList17 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList17, dimensionArray16);
        com.bizo.asperatus.model.CompoundDimension compoundDimension19 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList17);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker20 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService21 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler22 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker11, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList17, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker20, scheduledExecutorService21);
        com.bizo.asperatus.model.Unit unit25 = com.bizo.asperatus.model.Unit.Count;
        java.util.concurrent.TimeUnit timeUnit28 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker29 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit28);
        com.bizo.asperatus.model.Dimension dimension34 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray35 = new com.bizo.asperatus.model.Dimension[] { dimension34 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList36 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList36, dimensionArray35);
        metricTracker29.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList36);
        java.util.concurrent.TimeUnit timeUnit43 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker44 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit43);
        com.bizo.asperatus.model.Dimension dimension49 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray50 = new com.bizo.asperatus.model.Dimension[] { dimension49 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList51 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList51, dimensionArray50);
        metricTracker44.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList51);
        com.bizo.asperatus.model.Unit unit56 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension59 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray60 = new com.bizo.asperatus.model.Dimension[] { dimension59 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList61 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList61, dimensionArray60);
        com.bizo.asperatus.model.CompoundDimension compoundDimension63 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList61);
        metricTracker44.track("us-east-1", (java.lang.Number) 10.0f, unit56, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList61);
        metricTracker29.track("Dimension[hi!=hi!]", (java.lang.Number) (short) 1, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList61);
        metricTracker11.track("Terabytes", (java.lang.Number) 100.0d, unit25, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList61);
        java.lang.Number number68 = null;
        com.bizo.asperatus.model.Unit unit69 = com.bizo.asperatus.model.Unit.Bits;
        com.bizo.asperatus.model.Dimension dimension72 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension75 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension78 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray79 = new com.bizo.asperatus.model.Dimension[] { dimension72, dimension75, dimension78 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension80 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray79);
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList81 = compoundDimension80.getDimensions();
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList82 = compoundDimension80.getDimensions();
        metricTracker11.track("Kilobits", number68, unit69, dimensionList82);
        java.lang.Class<?> wildcardClass84 = unit69.getClass();
        boolean boolean85 = dimension3.equals((java.lang.Object) unit69);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dimension[hi!=hi!]" + "'", str5, "Dimension[hi!=hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(metricTracker11);
        org.junit.Assert.assertNotNull(dimensionArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + unit25 + "' != '" + com.bizo.asperatus.model.Unit.Count + "'", unit25.equals(com.bizo.asperatus.model.Unit.Count));
        org.junit.Assert.assertNotNull(metricTracker29);
        org.junit.Assert.assertNotNull(dimensionArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(metricTracker44);
        org.junit.Assert.assertNotNull(dimensionArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + unit56 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit56.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + unit69 + "' != '" + com.bizo.asperatus.model.Unit.Bits + "'", unit69.equals(com.bizo.asperatus.model.Unit.Bits));
        org.junit.Assert.assertNotNull(dimensionArray79);
        org.junit.Assert.assertNotNull(dimensionList81);
        org.junit.Assert.assertNotNull(dimensionList82);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder3 = cWMetricTrackerBuilder0.withRegion("us-east-1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.util.concurrent.TimeUnit timeUnit4 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker5 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit4);
        com.bizo.asperatus.model.Dimension dimension9 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray10 = new com.bizo.asperatus.model.Dimension[] { dimension9 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList11 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList11, dimensionArray10);
        com.bizo.asperatus.model.CompoundDimension compoundDimension13 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList11);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker14 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService15 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler16 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker5, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList11, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker14, scheduledExecutorService15);
        com.bizo.asperatus.model.Unit unit19 = com.bizo.asperatus.model.Unit.Gigabytes;
        java.lang.String str20 = unit19.getValue();
        java.util.Collection<com.bizo.asperatus.model.CompoundDimension> compoundDimensionCollection21 = null;
        metricTracker5.track("CompoundDimension[dimensions=[Dimension[hi!=hi!]]]", (java.lang.Number) (-1), unit19, compoundDimensionCollection21);
        java.util.concurrent.TimeUnit timeUnit26 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker27 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit26);
        com.bizo.asperatus.model.Dimension dimension32 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray33 = new com.bizo.asperatus.model.Dimension[] { dimension32 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList34 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList34, dimensionArray33);
        metricTracker27.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList34);
        com.bizo.asperatus.model.Unit unit39 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension42 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray43 = new com.bizo.asperatus.model.Dimension[] { dimension42 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList44 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList44, dimensionArray43);
        com.bizo.asperatus.model.CompoundDimension compoundDimension46 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList44);
        metricTracker27.track("us-east-1", (java.lang.Number) 10.0f, unit39, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList44);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker48 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService49 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler50 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker5, "Gigabytes", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList44, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker48, scheduledExecutorService49);
        java.util.concurrent.TimeUnit timeUnit51 = asperatusRateTrackerScheduler50.getFrequencyUnit();
        // The following exception was thrown during execution in test generation
        try {
            com.bizo.asperatus.tracker.MetricTracker metricTracker52 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(true, (long) 'a', timeUnit51);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Missing required property: APPLICATION");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricTracker5);
        org.junit.Assert.assertNotNull(dimensionArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + unit19 + "' != '" + com.bizo.asperatus.model.Unit.Gigabytes + "'", unit19.equals(com.bizo.asperatus.model.Unit.Gigabytes));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Gigabytes" + "'", str20, "Gigabytes");
        org.junit.Assert.assertNotNull(metricTracker27);
        org.junit.Assert.assertNotNull(dimensionArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + unit39 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit39.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(timeUnit51);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker5 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit8 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics9 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit8);
        com.bizo.asperatus.model.Dimension dimension12 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str13 = dimension12.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray14 = new com.bizo.asperatus.model.Dimension[] { dimension12 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList15 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList15, dimensionArray14);
        inMemoryTracker5.track("Gigabytes", (java.lang.Number) 10.0d, unit8, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList15);
        java.util.concurrent.TimeUnit timeUnit20 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker21 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit20);
        com.bizo.asperatus.model.Dimension dimension25 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray26 = new com.bizo.asperatus.model.Dimension[] { dimension25 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList27 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList27, dimensionArray26);
        com.bizo.asperatus.model.CompoundDimension compoundDimension29 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList27);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker30 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService31 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler32 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker21, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList27, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker30, scheduledExecutorService31);
        threadSafeRateTracker30.track();
        double double34 = threadSafeRateTracker30.getRateAndResetPeriod();
        double double35 = threadSafeRateTracker30.getRateAndResetPeriod();
        threadSafeRateTracker30.track();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService37 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler38 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "Microseconds", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList15, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker30, scheduledExecutorService37);
        // The following exception was thrown during execution in test generation
        try {
            asperatusRateTrackerScheduler38.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: This AsperatusRateTrackerScheduler has already been stopped.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit8.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(metricTracker21);
        org.junit.Assert.assertNotNull(dimensionArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + Double.POSITIVE_INFINITY + "'", double34 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.bizo.asperatus.tracker.Env.envOrProperty("Kilobits");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Missing required property: Kilobits");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Megabytes;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        boolean boolean3 = metricStatistics1.equals((java.lang.Object) (byte) 10);
        long long4 = metricStatistics1.getSamples();
        float float5 = metricStatistics1.getMax();
        metricStatistics1.add((java.lang.Number) Double.NaN);
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Megabytes + "'", unit0.equals(com.bizo.asperatus.model.Unit.Megabytes));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.4E-45f + "'", float5 == 1.4E-45f);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        java.util.concurrent.TimeUnit timeUnit4 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker5 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit4);
        com.bizo.asperatus.model.Dimension dimension9 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray10 = new com.bizo.asperatus.model.Dimension[] { dimension9 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList11 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList11, dimensionArray10);
        com.bizo.asperatus.model.CompoundDimension compoundDimension13 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList11);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker14 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService15 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler16 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker5, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList11, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker14, scheduledExecutorService15);
        int int17 = asperatusRateTrackerScheduler16.getFrequency();
        boolean boolean18 = asperatusRateTrackerScheduler16.isStarted();
        asperatusRateTrackerScheduler16.setFrequency(0);
        java.util.concurrent.TimeUnit timeUnit25 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker26 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit25);
        com.bizo.asperatus.model.Dimension dimension30 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray31 = new com.bizo.asperatus.model.Dimension[] { dimension30 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList32 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList32, dimensionArray31);
        com.bizo.asperatus.model.CompoundDimension compoundDimension34 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList32);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker35 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService36 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler37 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker26, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList32, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker35, scheduledExecutorService36);
        int int38 = asperatusRateTrackerScheduler37.getFrequency();
        boolean boolean39 = asperatusRateTrackerScheduler37.isStarted();
        java.util.concurrent.TimeUnit timeUnit40 = asperatusRateTrackerScheduler37.getFrequencyUnit();
        com.bizo.asperatus.tracker.MetricTracker metricTracker41 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) 1, timeUnit40);
        asperatusRateTrackerScheduler16.setFrequencyUnit(timeUnit40);
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder43 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider44 = null;
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder45 = cWMetricTrackerBuilder43.withCredentialsProvider(aWSCredentialsProvider44);
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder47 = cWMetricTrackerBuilder45.withRegion("hi!");
        java.util.concurrent.TimeUnit timeUnit48 = cWMetricTrackerBuilder45.getFlushUnit();
        asperatusRateTrackerScheduler16.setFrequencyUnit(timeUnit48);
        // The following exception was thrown during execution in test generation
        try {
            com.bizo.asperatus.tracker.MetricTracker metricTracker50 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(true, (long) 0, timeUnit48);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Missing required property: APPLICATION");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricTracker5);
        org.junit.Assert.assertNotNull(dimensionArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(metricTracker26);
        org.junit.Assert.assertNotNull(dimensionArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(timeUnit40);
        org.junit.Assert.assertNotNull(metricTracker41);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder45);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder47);
        org.junit.Assert.assertNotNull(timeUnit48);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.util.concurrent.TimeUnit timeUnit4 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker5 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit4);
        com.bizo.asperatus.model.Dimension dimension9 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray10 = new com.bizo.asperatus.model.Dimension[] { dimension9 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList11 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList11, dimensionArray10);
        com.bizo.asperatus.model.CompoundDimension compoundDimension13 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList11);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker14 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService15 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler16 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker5, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList11, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker14, scheduledExecutorService15);
        int int17 = asperatusRateTrackerScheduler16.getFrequency();
        boolean boolean18 = asperatusRateTrackerScheduler16.isStarted();
        java.util.concurrent.TimeUnit timeUnit19 = asperatusRateTrackerScheduler16.getFrequencyUnit();
        com.bizo.asperatus.tracker.MetricTracker metricTracker20 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) 1, timeUnit19);
        com.bizo.asperatus.model.Unit unit23 = com.bizo.asperatus.model.Unit.Terabytes;
        java.lang.String str24 = unit23.getValue();
        com.bizo.asperatus.model.Dimension dimension27 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str28 = dimension27.getValue();
        java.lang.String str29 = dimension27.toString();
        java.lang.String str30 = dimension27.getName();
        java.util.concurrent.TimeUnit timeUnit33 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker34 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit33);
        com.bizo.asperatus.model.Dimension dimension38 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray39 = new com.bizo.asperatus.model.Dimension[] { dimension38 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList40 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList40, dimensionArray39);
        com.bizo.asperatus.model.CompoundDimension compoundDimension42 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList40);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker43 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService44 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler45 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker34, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList40, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker43, scheduledExecutorService44);
        com.bizo.asperatus.model.Unit unit48 = com.bizo.asperatus.model.Unit.Count;
        java.util.concurrent.TimeUnit timeUnit51 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker52 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit51);
        com.bizo.asperatus.model.Dimension dimension57 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray58 = new com.bizo.asperatus.model.Dimension[] { dimension57 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList59 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList59, dimensionArray58);
        metricTracker52.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList59);
        java.util.concurrent.TimeUnit timeUnit66 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker67 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit66);
        com.bizo.asperatus.model.Dimension dimension72 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray73 = new com.bizo.asperatus.model.Dimension[] { dimension72 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList74 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList74, dimensionArray73);
        metricTracker67.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList74);
        com.bizo.asperatus.model.Unit unit79 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension82 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray83 = new com.bizo.asperatus.model.Dimension[] { dimension82 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList84 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList84, dimensionArray83);
        com.bizo.asperatus.model.CompoundDimension compoundDimension86 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList84);
        metricTracker67.track("us-east-1", (java.lang.Number) 10.0f, unit79, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList84);
        metricTracker52.track("Dimension[hi!=hi!]", (java.lang.Number) (short) 1, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList84);
        metricTracker34.track("Terabytes", (java.lang.Number) 100.0d, unit48, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList84);
        boolean boolean90 = dimension27.equals((java.lang.Object) dimensionList84);
        metricTracker20.track("hi!", (java.lang.Number) 100.0f, unit23, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList84);
        org.junit.Assert.assertNotNull(metricTracker5);
        org.junit.Assert.assertNotNull(dimensionArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(timeUnit19);
        org.junit.Assert.assertNotNull(metricTracker20);
        org.junit.Assert.assertTrue("'" + unit23 + "' != '" + com.bizo.asperatus.model.Unit.Terabytes + "'", unit23.equals(com.bizo.asperatus.model.Unit.Terabytes));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Terabytes" + "'", str24, "Terabytes");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Dimension[hi!=hi!]" + "'", str29, "Dimension[hi!=hi!]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(metricTracker34);
        org.junit.Assert.assertNotNull(dimensionArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + unit48 + "' != '" + com.bizo.asperatus.model.Unit.Count + "'", unit48.equals(com.bizo.asperatus.model.Unit.Count));
        org.junit.Assert.assertNotNull(metricTracker52);
        org.junit.Assert.assertNotNull(dimensionArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(metricTracker67);
        org.junit.Assert.assertNotNull(dimensionArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + unit79 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit79.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.bizo.asperatus.tracker.impl.SystemOutTracker systemOutTracker0 = new com.bizo.asperatus.tracker.impl.SystemOutTracker();
        java.util.concurrent.TimeUnit timeUnit5 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker6 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit5);
        com.bizo.asperatus.model.Dimension dimension11 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray12 = new com.bizo.asperatus.model.Dimension[] { dimension11 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList13 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList13, dimensionArray12);
        metricTracker6.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList13);
        com.bizo.asperatus.model.Unit unit18 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension21 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray22 = new com.bizo.asperatus.model.Dimension[] { dimension21 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList23 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList23, dimensionArray22);
        com.bizo.asperatus.model.CompoundDimension compoundDimension25 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList23);
        metricTracker6.track("us-east-1", (java.lang.Number) 10.0f, unit18, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList23);
        systemOutTracker0.track("us-east-1", (java.lang.Number) (short) 10, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList23);
        systemOutTracker0.close();
        java.util.concurrent.TimeUnit timeUnit33 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker34 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit33);
        com.bizo.asperatus.model.Dimension dimension38 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray39 = new com.bizo.asperatus.model.Dimension[] { dimension38 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList40 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList40, dimensionArray39);
        com.bizo.asperatus.model.CompoundDimension compoundDimension42 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList40);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker43 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService44 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler45 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker34, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList40, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker43, scheduledExecutorService44);
        systemOutTracker0.track("Milliseconds", (java.lang.Number) (byte) 0, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList40);
        systemOutTracker0.close();
        org.junit.Assert.assertNotNull(metricTracker6);
        org.junit.Assert.assertNotNull(dimensionArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + unit18 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit18.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(metricTracker34);
        org.junit.Assert.assertNotNull(dimensionArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str4 = dimension3.getValue();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey5 = new com.bizo.asperatus.tracker.impl.MetricKey("Gigabytes", dimension3);
        java.util.concurrent.TimeUnit timeUnit8 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker9 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) (short) 10, timeUnit8);
        boolean boolean10 = metricKey5.equals((java.lang.Object) metricTracker9);
        java.lang.String str11 = metricKey5.getMetricName();
        com.bizo.asperatus.model.CompoundDimension compoundDimension12 = metricKey5.getDimension();
        java.lang.String str13 = metricKey5.getMetricName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(metricTracker9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Gigabytes" + "'", str11, "Gigabytes");
        org.junit.Assert.assertNotNull(compoundDimension12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Gigabytes" + "'", str13, "Gigabytes");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Kilobits;
        java.lang.String str1 = unit0.getValue();
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics2 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Kilobits + "'", unit0.equals(com.bizo.asperatus.model.Unit.Kilobits));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Kilobits" + "'", str1, "Kilobits");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        double double15 = threadSafeRateTracker12.getRateAndResetPeriod();
        double double16 = threadSafeRateTracker12.getRateAndResetPeriod();
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension6 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension9 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray10 = new com.bizo.asperatus.model.Dimension[] { dimension3, dimension6, dimension9 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray10);
        com.bizo.asperatus.tracker.impl.MetricKey metricKey12 = new com.bizo.asperatus.tracker.impl.MetricKey("us-east-1", compoundDimension11);
        com.bizo.asperatus.model.CompoundDimension compoundDimension13 = metricKey12.getDimension();
        org.junit.Assert.assertNotNull(dimensionArray10);
        org.junit.Assert.assertNotNull(compoundDimension13);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.CountSecond;
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.CountSecond + "'", unit0.equals(com.bizo.asperatus.model.Unit.CountSecond));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension8 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray9 = new com.bizo.asperatus.model.Dimension[] { dimension8 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList10 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList10, dimensionArray9);
        metricTracker3.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList10);
        java.util.concurrent.TimeUnit timeUnit17 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker18 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit17);
        com.bizo.asperatus.model.Dimension dimension23 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray24 = new com.bizo.asperatus.model.Dimension[] { dimension23 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList25 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList25, dimensionArray24);
        metricTracker18.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList25);
        com.bizo.asperatus.model.Unit unit30 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension33 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray34 = new com.bizo.asperatus.model.Dimension[] { dimension33 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList35 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList35, dimensionArray34);
        com.bizo.asperatus.model.CompoundDimension compoundDimension37 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList35);
        metricTracker18.track("us-east-1", (java.lang.Number) 10.0f, unit30, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList35);
        metricTracker3.track("Dimension[hi!=hi!]", (java.lang.Number) (short) 1, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList35);
        com.bizo.asperatus.model.Unit unit42 = com.bizo.asperatus.model.Unit.None;
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker43 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit46 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics47 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit46);
        com.bizo.asperatus.model.Dimension dimension50 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str51 = dimension50.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray52 = new com.bizo.asperatus.model.Dimension[] { dimension50 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList53 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList53, dimensionArray52);
        inMemoryTracker43.track("Gigabytes", (java.lang.Number) 10.0d, unit46, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList53);
        metricTracker3.track("Terabytes", (java.lang.Number) 0.0f, unit42, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList53);
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(metricTracker18);
        org.junit.Assert.assertNotNull(dimensionArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + unit30 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit30.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + unit42 + "' != '" + com.bizo.asperatus.model.Unit.None + "'", unit42.equals(com.bizo.asperatus.model.Unit.None));
        org.junit.Assert.assertTrue("'" + unit46 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit46.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.bizo.asperatus.tracker.impl.SystemOutTracker systemOutTracker0 = new com.bizo.asperatus.tracker.impl.SystemOutTracker();
        com.bizo.asperatus.model.Unit unit3 = com.bizo.asperatus.model.Unit.Gigabits;
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker4 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit7 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics8 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit7);
        com.bizo.asperatus.model.Dimension dimension11 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str12 = dimension11.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray13 = new com.bizo.asperatus.model.Dimension[] { dimension11 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList14 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList14, dimensionArray13);
        inMemoryTracker4.track("Gigabytes", (java.lang.Number) 10.0d, unit7, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList14);
        com.bizo.asperatus.model.Unit unit19 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics20 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit19);
        com.bizo.asperatus.model.Unit unit21 = com.bizo.asperatus.model.Unit.Megabytes;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics22 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit21);
        boolean boolean24 = metricStatistics22.equals((java.lang.Object) (byte) 10);
        float float25 = metricStatistics22.getSum();
        float float26 = metricStatistics22.getSum();
        java.util.concurrent.TimeUnit timeUnit29 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker30 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit29);
        com.bizo.asperatus.model.Dimension dimension35 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray36 = new com.bizo.asperatus.model.Dimension[] { dimension35 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList37 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList37, dimensionArray36);
        metricTracker30.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList37);
        boolean boolean40 = metricStatistics22.equals((java.lang.Object) dimensionList37);
        inMemoryTracker4.track("Microseconds", (java.lang.Number) Double.POSITIVE_INFINITY, unit19, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList37);
        systemOutTracker0.track("Milliseconds", (java.lang.Number) (short) 100, unit3, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList37);
        java.util.concurrent.TimeUnit timeUnit47 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker48 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit47);
        com.bizo.asperatus.model.Dimension dimension53 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray54 = new com.bizo.asperatus.model.Dimension[] { dimension53 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList55 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList55, dimensionArray54);
        metricTracker48.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList55);
        systemOutTracker0.track("Dimension[hi!=hi!]", (java.lang.Number) 100.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList55);
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + com.bizo.asperatus.model.Unit.Gigabits + "'", unit3.equals(com.bizo.asperatus.model.Unit.Gigabits));
        org.junit.Assert.assertTrue("'" + unit7 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit7.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + unit19 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit19.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertTrue("'" + unit21 + "' != '" + com.bizo.asperatus.model.Unit.Megabytes + "'", unit21.equals(com.bizo.asperatus.model.Unit.Megabytes));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertNotNull(metricTracker30);
        org.junit.Assert.assertNotNull(dimensionArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(metricTracker48);
        org.junit.Assert.assertNotNull(dimensionArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        threadSafeRateTracker12.track();
        double double16 = threadSafeRateTracker12.getRateAndResetPeriod();
        double double17 = threadSafeRateTracker12.getRateAndResetPeriod();
        threadSafeRateTracker12.track();
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.bizo.asperatus.model.Dimension dimension4 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str5 = dimension4.getValue();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey6 = new com.bizo.asperatus.tracker.impl.MetricKey("hi!", dimension4);
        com.bizo.asperatus.tracker.impl.MetricKey metricKey7 = new com.bizo.asperatus.tracker.impl.MetricKey("", dimension4);
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder8 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider9 = null;
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder10 = cWMetricTrackerBuilder8.withCredentialsProvider(aWSCredentialsProvider9);
        java.lang.String str11 = cWMetricTrackerBuilder8.getApplication();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder12 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str13 = cWMetricTrackerBuilder12.getRegion();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService14 = cWMetricTrackerBuilder12.getExecutor();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder16 = cWMetricTrackerBuilder12.withStage("Terabytes");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder18 = cWMetricTrackerBuilder12.withRegion("Gigabytes");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider19 = cWMetricTrackerBuilder18.getCredentialsProvider();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder20 = cWMetricTrackerBuilder8.withCredentialsProvider(aWSCredentialsProvider19);
        boolean boolean21 = dimension4.equals((java.lang.Object) cWMetricTrackerBuilder20);
        java.lang.String str22 = cWMetricTrackerBuilder20.getRegion();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "us-east-1" + "'", str13, "us-east-1");
        org.junit.Assert.assertNull(scheduledExecutorService14);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder16);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder18);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider19);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "us-east-1" + "'", str22, "us-east-1");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Megabytes;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        long long2 = metricStatistics1.getSamples();
        float float3 = metricStatistics1.getSum();
        java.lang.String str4 = metricStatistics1.toString();
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Megabytes + "'", unit0.equals(com.bizo.asperatus.model.Unit.Megabytes));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MStats[unit:Megabytes,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]" + "'", str4, "MStats[unit:Megabytes,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder4 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder9 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList7);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder10 = machineInfoBuilder4.with((java.util.Collection<java.lang.String>) strList7);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder15 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList13);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder20 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList18);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder21 = machineInfoBuilder15.without((java.util.Collection<java.lang.String>) strList18);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder22 = machineInfoBuilder4.without((java.util.Collection<java.lang.String>) strList18);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder27 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList25);
        java.lang.String[] strArray34 = new java.lang.String[] { "Terabytes", "Microseconds", "Terabytes", "Gigabytes", "Terabytes", "Microseconds" };
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder35 = machineInfoBuilder27.without(strArray34);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder36 = com.bizo.asperatus.logging.error.MachineInfo.with(strArray34);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder37 = machineInfoBuilder22.with(strArray34);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder38 = com.bizo.asperatus.logging.error.MachineInfo.with(strArray34);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder39 = com.bizo.asperatus.logging.error.MachineInfo.with(strArray34);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder9);
        org.junit.Assert.assertNotNull(machineInfoBuilder10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder20);
        org.junit.Assert.assertNotNull(machineInfoBuilder21);
        org.junit.Assert.assertNotNull(machineInfoBuilder22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder27);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(machineInfoBuilder35);
        org.junit.Assert.assertNotNull(machineInfoBuilder36);
        org.junit.Assert.assertNotNull(machineInfoBuilder37);
        org.junit.Assert.assertNotNull(machineInfoBuilder38);
        org.junit.Assert.assertNotNull(machineInfoBuilder39);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder2 = cWMetricTrackerBuilder0.withApplication("us-east-1");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = cWMetricTrackerBuilder2.withApplication("us-east-1");
        com.bizo.asperatus.tracker.MetricTracker metricTracker5 = cWMetricTrackerBuilder4.toMetricTracker();
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder2);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder4);
        org.junit.Assert.assertNotNull(metricTracker5);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker0 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit3 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics4 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit3);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str8 = dimension7.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray9 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList10 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList10, dimensionArray9);
        inMemoryTracker0.track("Gigabytes", (java.lang.Number) 10.0d, unit3, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList10);
        java.util.Map<com.bizo.asperatus.tracker.impl.MetricKey, com.bizo.asperatus.tracker.impl.MetricStatistics> metricKeyMap13 = inMemoryTracker0.reset();
        com.bizo.asperatus.model.Unit unit16 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.model.Dimension dimension19 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension22 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension25 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray26 = new com.bizo.asperatus.model.Dimension[] { dimension19, dimension22, dimension25 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension27 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray26);
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList28 = compoundDimension27.getDimensions();
        com.bizo.asperatus.model.Dimension dimension32 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension35 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension38 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray39 = new com.bizo.asperatus.model.Dimension[] { dimension32, dimension35, dimension38 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension40 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray39);
        com.bizo.asperatus.tracker.impl.MetricKey metricKey41 = new com.bizo.asperatus.tracker.impl.MetricKey("us-east-1", compoundDimension40);
        com.bizo.asperatus.model.CompoundDimension[] compoundDimensionArray42 = new com.bizo.asperatus.model.CompoundDimension[] { compoundDimension27, compoundDimension40 };
        java.util.ArrayList<com.bizo.asperatus.model.CompoundDimension> compoundDimensionList43 = new java.util.ArrayList<com.bizo.asperatus.model.CompoundDimension>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.CompoundDimension>) compoundDimensionList43, compoundDimensionArray42);
        inMemoryTracker0.track("Gigabytes", (java.lang.Number) 10L, unit16, (java.util.Collection<com.bizo.asperatus.model.CompoundDimension>) compoundDimensionList43);
        inMemoryTracker0.close();
        java.util.concurrent.TimeUnit timeUnit51 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker52 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit51);
        com.bizo.asperatus.model.Dimension dimension56 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray57 = new com.bizo.asperatus.model.Dimension[] { dimension56 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList58 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList58, dimensionArray57);
        com.bizo.asperatus.model.CompoundDimension compoundDimension60 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList58);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker61 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService62 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler63 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker52, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList58, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker61, scheduledExecutorService62);
        com.bizo.asperatus.model.Unit unit66 = com.bizo.asperatus.model.Unit.Gigabytes;
        java.lang.String str67 = unit66.getValue();
        java.util.Collection<com.bizo.asperatus.model.CompoundDimension> compoundDimensionCollection68 = null;
        metricTracker52.track("CompoundDimension[dimensions=[Dimension[hi!=hi!]]]", (java.lang.Number) (-1), unit66, compoundDimensionCollection68);
        java.util.concurrent.TimeUnit timeUnit73 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker74 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit73);
        com.bizo.asperatus.model.Dimension dimension79 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray80 = new com.bizo.asperatus.model.Dimension[] { dimension79 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList81 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList81, dimensionArray80);
        metricTracker74.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList81);
        com.bizo.asperatus.model.Unit unit86 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension89 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray90 = new com.bizo.asperatus.model.Dimension[] { dimension89 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList91 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList91, dimensionArray90);
        com.bizo.asperatus.model.CompoundDimension compoundDimension93 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList91);
        metricTracker74.track("us-east-1", (java.lang.Number) 10.0f, unit86, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList91);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker95 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService96 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler97 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker52, "Gigabytes", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList91, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker95, scheduledExecutorService96);
        inMemoryTracker0.track("Gigabytes", (java.lang.Number) Double.NaN, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList91);
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit3.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(metricKeyMap13);
        org.junit.Assert.assertTrue("'" + unit16 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit16.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertNotNull(dimensionArray26);
        org.junit.Assert.assertNotNull(dimensionList28);
        org.junit.Assert.assertNotNull(dimensionArray39);
        org.junit.Assert.assertNotNull(compoundDimensionArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(metricTracker52);
        org.junit.Assert.assertNotNull(dimensionArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + unit66 + "' != '" + com.bizo.asperatus.model.Unit.Gigabytes + "'", unit66.equals(com.bizo.asperatus.model.Unit.Gigabytes));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Gigabytes" + "'", str67, "Gigabytes");
        org.junit.Assert.assertNotNull(metricTracker74);
        org.junit.Assert.assertNotNull(dimensionArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + unit86 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit86.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str4 = dimension3.getValue();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey5 = new com.bizo.asperatus.tracker.impl.MetricKey("Gigabytes", dimension3);
        java.lang.String str6 = dimension3.getValue();
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder11 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder16 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList14);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder17 = machineInfoBuilder11.without((java.util.Collection<java.lang.String>) strList14);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder18 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList14);
        boolean boolean19 = dimension3.equals((java.lang.Object) strList14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder16);
        org.junit.Assert.assertNotNull(machineInfoBuilder17);
        org.junit.Assert.assertNotNull(machineInfoBuilder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.bizo.asperatus.model.Dimension dimension2 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray3 = new com.bizo.asperatus.model.Dimension[] { dimension2 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList4 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList4, dimensionArray3);
        com.bizo.asperatus.model.CompoundDimension compoundDimension6 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList4);
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList7 = compoundDimension6.getDimensions();
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList8 = compoundDimension6.getDimensions();
        org.junit.Assert.assertNotNull(dimensionArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dimensionList7);
        org.junit.Assert.assertNotNull(dimensionList8);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.bizo.asperatus.model.Dimension dimension2 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str3 = dimension2.getValue();
        java.lang.String str4 = dimension2.toString();
        java.lang.String str5 = dimension2.getName();
        java.lang.String str6 = dimension2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Dimension[hi!=hi!]" + "'", str4, "Dimension[hi!=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker0 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        double double1 = threadSafeRateTracker0.getRateAndResetPeriod();
        threadSafeRateTracker0.track();
        threadSafeRateTracker0.track();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.bizo.asperatus.model.Dimension dimension2 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension5 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension8 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray9 = new com.bizo.asperatus.model.Dimension[] { dimension2, dimension5, dimension8 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension10 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray9);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray9);
        java.lang.Object obj12 = null;
        boolean boolean13 = compoundDimension11.equals(obj12);
        org.junit.Assert.assertNotNull(dimensionArray9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.bizo.asperatus.tracker.impl.SystemOutTracker systemOutTracker0 = new com.bizo.asperatus.tracker.impl.SystemOutTracker();
        java.util.concurrent.TimeUnit timeUnit5 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker6 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit5);
        com.bizo.asperatus.model.Dimension dimension11 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray12 = new com.bizo.asperatus.model.Dimension[] { dimension11 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList13 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList13, dimensionArray12);
        metricTracker6.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList13);
        com.bizo.asperatus.model.Unit unit18 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension21 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray22 = new com.bizo.asperatus.model.Dimension[] { dimension21 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList23 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList23, dimensionArray22);
        com.bizo.asperatus.model.CompoundDimension compoundDimension25 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList23);
        metricTracker6.track("us-east-1", (java.lang.Number) 10.0f, unit18, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList23);
        systemOutTracker0.track("us-east-1", (java.lang.Number) (short) 10, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList23);
        systemOutTracker0.close();
        java.util.concurrent.TimeUnit timeUnit33 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker34 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit33);
        com.bizo.asperatus.model.Dimension dimension38 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray39 = new com.bizo.asperatus.model.Dimension[] { dimension38 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList40 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList40, dimensionArray39);
        com.bizo.asperatus.model.CompoundDimension compoundDimension42 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList40);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker43 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService44 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler45 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker34, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList40, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker43, scheduledExecutorService44);
        systemOutTracker0.track("Milliseconds", (java.lang.Number) (byte) 0, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList40);
        com.bizo.asperatus.model.Unit unit49 = com.bizo.asperatus.model.Unit.Gigabits;
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker50 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit53 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics54 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit53);
        com.bizo.asperatus.model.Dimension dimension57 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str58 = dimension57.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray59 = new com.bizo.asperatus.model.Dimension[] { dimension57 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList60 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList60, dimensionArray59);
        inMemoryTracker50.track("Gigabytes", (java.lang.Number) 10.0d, unit53, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList60);
        systemOutTracker0.track("Microseconds", (java.lang.Number) 0.0f, unit49, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList60);
        com.bizo.asperatus.model.Unit unit66 = null;
        com.bizo.asperatus.model.Dimension dimension69 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray70 = new com.bizo.asperatus.model.Dimension[] { dimension69 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList71 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList71, dimensionArray70);
        com.bizo.asperatus.model.CompoundDimension compoundDimension73 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList71);
        systemOutTracker0.track("", (java.lang.Number) (short) -1, unit66, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList71);
        com.bizo.asperatus.model.CompoundDimension compoundDimension75 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList71);
        org.junit.Assert.assertNotNull(metricTracker6);
        org.junit.Assert.assertNotNull(dimensionArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + unit18 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit18.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(metricTracker34);
        org.junit.Assert.assertNotNull(dimensionArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + unit49 + "' != '" + com.bizo.asperatus.model.Unit.Gigabits + "'", unit49.equals(com.bizo.asperatus.model.Unit.Gigabits));
        org.junit.Assert.assertTrue("'" + unit53 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit53.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(dimensionArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker5 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit8 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics9 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit8);
        com.bizo.asperatus.model.Dimension dimension12 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str13 = dimension12.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray14 = new com.bizo.asperatus.model.Dimension[] { dimension12 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList15 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList15, dimensionArray14);
        inMemoryTracker5.track("Gigabytes", (java.lang.Number) 10.0d, unit8, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList15);
        java.util.concurrent.TimeUnit timeUnit20 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker21 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit20);
        com.bizo.asperatus.model.Dimension dimension25 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray26 = new com.bizo.asperatus.model.Dimension[] { dimension25 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList27 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList27, dimensionArray26);
        com.bizo.asperatus.model.CompoundDimension compoundDimension29 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList27);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker30 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService31 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler32 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker21, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList27, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker30, scheduledExecutorService31);
        threadSafeRateTracker30.track();
        double double34 = threadSafeRateTracker30.getRateAndResetPeriod();
        double double35 = threadSafeRateTracker30.getRateAndResetPeriod();
        threadSafeRateTracker30.track();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService37 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler38 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "Microseconds", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList15, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker30, scheduledExecutorService37);
        java.util.concurrent.TimeUnit timeUnit39 = asperatusRateTrackerScheduler38.getFrequencyUnit();
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit8.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(metricTracker21);
        org.junit.Assert.assertNotNull(dimensionArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + Double.POSITIVE_INFINITY + "'", double34 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(timeUnit39);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider2 = cWMetricTrackerBuilder0.getCredentialsProvider();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService3 = null;
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = cWMetricTrackerBuilder0.withExecutor(scheduledExecutorService3);
        java.lang.String str5 = cWMetricTrackerBuilder0.getStage();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertNotNull(aWSCredentialsProvider2);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "dev" + "'", str5, "dev");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str4 = dimension3.getValue();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey5 = new com.bizo.asperatus.tracker.impl.MetricKey("hi!", dimension3);
        java.lang.String str6 = dimension3.getValue();
        java.lang.String str7 = dimension3.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.bizo.asperatus.tracker.Env.envOrProperty("MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Missing required property: MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        java.lang.String str2 = com.bizo.asperatus.tracker.Env.envOrProperty("Gigabytes", "Microseconds");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Microseconds" + "'", str2, "Microseconds");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Megabytes;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        float float2 = metricStatistics1.getMax();
        float float3 = metricStatistics1.getSum();
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Megabytes + "'", unit0.equals(com.bizo.asperatus.model.Unit.Megabytes));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.amazonaws.services.cloudwatch.AmazonCloudWatch amazonCloudWatch0 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker7 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit6);
        com.bizo.asperatus.model.Dimension dimension11 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray12 = new com.bizo.asperatus.model.Dimension[] { dimension11 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList13 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList13, dimensionArray12);
        com.bizo.asperatus.model.CompoundDimension compoundDimension15 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList13);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker16 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService17 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler18 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker7, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList13, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker16, scheduledExecutorService17);
        int int19 = asperatusRateTrackerScheduler18.getFrequency();
        boolean boolean20 = asperatusRateTrackerScheduler18.isStarted();
        java.util.concurrent.TimeUnit timeUnit21 = asperatusRateTrackerScheduler18.getFrequencyUnit();
        // The following exception was thrown during execution in test generation
        try {
            com.bizo.asperatus.tracker.impl.CWMetricTracker cWMetricTracker22 = new com.bizo.asperatus.tracker.impl.CWMetricTracker(amazonCloudWatch0, "Kilobits", scheduledExecutorService2, 60L, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricTracker7);
        org.junit.Assert.assertNotNull(dimensionArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(timeUnit21);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker0 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit3 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics4 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit3);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str8 = dimension7.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray9 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList10 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList10, dimensionArray9);
        inMemoryTracker0.track("Gigabytes", (java.lang.Number) 10.0d, unit3, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList10);
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics13 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit3);
        metricStatistics13.add((java.lang.Number) 100.0f);
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit3.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.amazonaws.services.cloudwatch.AmazonCloudWatch amazonCloudWatch0 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker7 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit6);
        com.bizo.asperatus.model.Dimension dimension11 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray12 = new com.bizo.asperatus.model.Dimension[] { dimension11 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList13 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList13, dimensionArray12);
        com.bizo.asperatus.model.CompoundDimension compoundDimension15 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList13);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker16 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService17 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler18 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker7, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList13, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker16, scheduledExecutorService17);
        int int19 = asperatusRateTrackerScheduler18.getFrequency();
        boolean boolean20 = asperatusRateTrackerScheduler18.isStarted();
        asperatusRateTrackerScheduler18.setFrequency(0);
        java.util.concurrent.TimeUnit timeUnit27 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker28 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit27);
        com.bizo.asperatus.model.Dimension dimension32 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray33 = new com.bizo.asperatus.model.Dimension[] { dimension32 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList34 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList34, dimensionArray33);
        com.bizo.asperatus.model.CompoundDimension compoundDimension36 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList34);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker37 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService38 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler39 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker28, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList34, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker37, scheduledExecutorService38);
        int int40 = asperatusRateTrackerScheduler39.getFrequency();
        boolean boolean41 = asperatusRateTrackerScheduler39.isStarted();
        java.util.concurrent.TimeUnit timeUnit42 = asperatusRateTrackerScheduler39.getFrequencyUnit();
        com.bizo.asperatus.tracker.MetricTracker metricTracker43 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) 1, timeUnit42);
        asperatusRateTrackerScheduler18.setFrequencyUnit(timeUnit42);
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder45 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider46 = null;
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder47 = cWMetricTrackerBuilder45.withCredentialsProvider(aWSCredentialsProvider46);
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder49 = cWMetricTrackerBuilder47.withRegion("hi!");
        java.util.concurrent.TimeUnit timeUnit50 = cWMetricTrackerBuilder47.getFlushUnit();
        asperatusRateTrackerScheduler18.setFrequencyUnit(timeUnit50);
        // The following exception was thrown during execution in test generation
        try {
            com.bizo.asperatus.tracker.impl.CWMetricTracker cWMetricTracker52 = new com.bizo.asperatus.tracker.impl.CWMetricTracker(amazonCloudWatch0, "hi!", scheduledExecutorService2, (-1L), timeUnit50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricTracker7);
        org.junit.Assert.assertNotNull(dimensionArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(metricTracker28);
        org.junit.Assert.assertNotNull(dimensionArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(timeUnit42);
        org.junit.Assert.assertNotNull(metricTracker43);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder47);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder49);
        org.junit.Assert.assertNotNull(timeUnit50);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker0 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit3 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics4 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit3);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str8 = dimension7.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray9 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList10 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList10, dimensionArray9);
        inMemoryTracker0.track("Gigabytes", (java.lang.Number) 10.0d, unit3, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList10);
        java.util.Map<com.bizo.asperatus.tracker.impl.MetricKey, com.bizo.asperatus.tracker.impl.MetricStatistics> metricKeyMap13 = inMemoryTracker0.reset();
        com.bizo.asperatus.tracker.impl.SystemOutTracker systemOutTracker16 = new com.bizo.asperatus.tracker.impl.SystemOutTracker();
        java.util.concurrent.TimeUnit timeUnit21 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker22 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit21);
        com.bizo.asperatus.model.Dimension dimension27 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray28 = new com.bizo.asperatus.model.Dimension[] { dimension27 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList29 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList29, dimensionArray28);
        metricTracker22.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList29);
        com.bizo.asperatus.model.Unit unit34 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension37 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray38 = new com.bizo.asperatus.model.Dimension[] { dimension37 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList39 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList39, dimensionArray38);
        com.bizo.asperatus.model.CompoundDimension compoundDimension41 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList39);
        metricTracker22.track("us-east-1", (java.lang.Number) 10.0f, unit34, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList39);
        systemOutTracker16.track("us-east-1", (java.lang.Number) (short) 10, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList39);
        inMemoryTracker0.track("dev", (java.lang.Number) (short) 100, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList39);
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit3.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(metricKeyMap13);
        org.junit.Assert.assertNotNull(metricTracker22);
        org.junit.Assert.assertNotNull(dimensionArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + unit34 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit34.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.bizo.asperatus.model.Dimension dimension2 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray3 = new com.bizo.asperatus.model.Dimension[] { dimension2 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList4 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList4, dimensionArray3);
        com.bizo.asperatus.model.CompoundDimension compoundDimension6 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList4);
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList7 = compoundDimension6.getDimensions();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder8 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str9 = cWMetricTrackerBuilder8.getRegion();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider10 = cWMetricTrackerBuilder8.getCredentialsProvider();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService11 = null;
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder12 = cWMetricTrackerBuilder8.withExecutor(scheduledExecutorService11);
        boolean boolean13 = compoundDimension6.equals((java.lang.Object) cWMetricTrackerBuilder8);
        java.lang.String str14 = compoundDimension6.toString();
        org.junit.Assert.assertNotNull(dimensionArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dimensionList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "us-east-1" + "'", str9, "us-east-1");
        org.junit.Assert.assertNotNull(aWSCredentialsProvider10);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "CompoundDimension[dimensions=[Dimension[hi!=hi!]]]" + "'", str14, "CompoundDimension[dimensions=[Dimension[hi!=hi!]]]");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        int int15 = asperatusRateTrackerScheduler14.getFrequency();
        boolean boolean16 = asperatusRateTrackerScheduler14.isStarted();
        java.util.concurrent.TimeUnit timeUnit17 = asperatusRateTrackerScheduler14.getFrequencyUnit();
        asperatusRateTrackerScheduler14.setFrequency((int) (short) 10);
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeUnit17);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider1 = null;
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder2 = cWMetricTrackerBuilder0.withCredentialsProvider(aWSCredentialsProvider1);
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider3 = cWMetricTrackerBuilder2.getCredentialsProvider();
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder2);
        org.junit.Assert.assertNull(aWSCredentialsProvider3);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        threadSafeRateTracker12.track();
        double double16 = threadSafeRateTracker12.getRateAndResetPeriod();
        double double17 = threadSafeRateTracker12.getRateAndResetPeriod();
        threadSafeRateTracker12.track();
        double double19 = threadSafeRateTracker12.getRateAndResetPeriod();
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + Double.POSITIVE_INFINITY + "'", double16 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + Double.POSITIVE_INFINITY + "'", double19 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.bizo.asperatus.model.Dimension dimension2 = new com.bizo.asperatus.model.Dimension("us-east-1", "hi!");
        java.lang.String str3 = dimension2.getName();
        com.bizo.asperatus.model.Dimension dimension6 = new com.bizo.asperatus.model.Dimension("us-east-1", "hi!");
        com.bizo.asperatus.model.Dimension dimension10 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str11 = dimension10.getValue();
        java.lang.String str12 = dimension10.toString();
        java.lang.String str13 = dimension10.getName();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey14 = new com.bizo.asperatus.tracker.impl.MetricKey("", dimension10);
        com.bizo.asperatus.model.Dimension dimension17 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str18 = dimension17.getValue();
        java.lang.String str19 = dimension17.getName();
        com.bizo.asperatus.model.Dimension[] dimensionArray20 = new com.bizo.asperatus.model.Dimension[] { dimension2, dimension6, dimension10, dimension17 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension21 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray20);
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList22 = compoundDimension21.getDimensions();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-east-1" + "'", str3, "us-east-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dimension[hi!=hi!]" + "'", str12, "Dimension[hi!=hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray20);
        org.junit.Assert.assertNotNull(dimensionList22);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder3 = cWMetricTrackerBuilder0.withRegion("hi!");
        java.lang.String str4 = cWMetricTrackerBuilder3.getStage();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder6 = cWMetricTrackerBuilder3.withStage("MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dev" + "'", str4, "dev");
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder6);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.bizo.asperatus.tracker.Env.envOrProperty("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: key can't be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = cWMetricTrackerBuilder0.getExecutor();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = cWMetricTrackerBuilder0.withStage("Terabytes");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder6 = cWMetricTrackerBuilder0.withRegion("Gigabytes");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider7 = cWMetricTrackerBuilder6.getCredentialsProvider();
        java.lang.String str8 = cWMetricTrackerBuilder6.getRegion();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertNull(scheduledExecutorService2);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder4);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder6);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Gigabytes" + "'", str8, "Gigabytes");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str4 = dimension3.getValue();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey5 = new com.bizo.asperatus.tracker.impl.MetricKey("Gigabytes", dimension3);
        java.lang.String str6 = dimension3.getValue();
        java.lang.String str7 = dimension3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Dimension[hi!=hi!]" + "'", str7, "Dimension[hi!=hi!]");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str4 = dimension3.getValue();
        java.lang.String str5 = dimension3.toString();
        java.lang.String str6 = dimension3.getName();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey7 = new com.bizo.asperatus.tracker.impl.MetricKey("", dimension3);
        java.lang.Object obj8 = null;
        boolean boolean9 = metricKey7.equals(obj8);
        java.lang.String str10 = metricKey7.getMetricName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dimension[hi!=hi!]" + "'", str5, "Dimension[hi!=hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        int int15 = asperatusRateTrackerScheduler14.getFrequency();
        boolean boolean16 = asperatusRateTrackerScheduler14.isStarted();
        asperatusRateTrackerScheduler14.setFrequency((int) (byte) 0);
        java.util.concurrent.TimeUnit timeUnit19 = asperatusRateTrackerScheduler14.getFrequencyUnit();
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeUnit19);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.bizo.asperatus.tracker.Env.envOrProperty("dev");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Missing required property: dev");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder2 = cWMetricTrackerBuilder0.withApplication("us-east-1");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = cWMetricTrackerBuilder2.withApplication("us-east-1");
        java.lang.String str5 = cWMetricTrackerBuilder4.getRegion();
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder2);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "us-east-1" + "'", str5, "us-east-1");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        int int15 = asperatusRateTrackerScheduler14.getFrequency();
        boolean boolean16 = asperatusRateTrackerScheduler14.isStarted();
        int int17 = asperatusRateTrackerScheduler14.getFrequency();
        boolean boolean18 = asperatusRateTrackerScheduler14.isStarted();
        // The following exception was thrown during execution in test generation
        try {
            asperatusRateTrackerScheduler14.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: This AsperatusRateTrackerScheduler has already been stopped.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        metricStatistics1.add((java.lang.Number) (short) 0);
        float float4 = metricStatistics1.getSum();
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit0.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Megabytes;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        float float2 = metricStatistics1.getMax();
        float float3 = metricStatistics1.getMin();
        long long4 = metricStatistics1.getSamples();
        metricStatistics1.add((java.lang.Number) 100L);
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Megabytes + "'", unit0.equals(com.bizo.asperatus.model.Unit.Megabytes));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3.4028235E38f + "'", float3 == 3.4028235E38f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        com.bizo.asperatus.model.Dimension dimension2 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension5 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension8 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray9 = new com.bizo.asperatus.model.Dimension[] { dimension2, dimension5, dimension8 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension10 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray9);
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList11 = compoundDimension10.getDimensions();
        java.util.concurrent.TimeUnit timeUnit14 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker15 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) (short) 10, timeUnit14);
        boolean boolean16 = compoundDimension10.equals((java.lang.Object) false);
        java.lang.String str17 = compoundDimension10.toString();
        org.junit.Assert.assertNotNull(dimensionArray9);
        org.junit.Assert.assertNotNull(dimensionList11);
        org.junit.Assert.assertNotNull(metricTracker15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CompoundDimension[dimensions=[Dimension[hi!=hi!], Dimension[hi!=hi!], Dimension[hi!=hi!]]]" + "'", str17, "CompoundDimension[dimensions=[Dimension[hi!=hi!], Dimension[hi!=hi!], Dimension[hi!=hi!]]]");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker0 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit3 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics4 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit3);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str8 = dimension7.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray9 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList10 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList10, dimensionArray9);
        inMemoryTracker0.track("Gigabytes", (java.lang.Number) 10.0d, unit3, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList10);
        java.util.concurrent.TimeUnit timeUnit17 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker18 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit17);
        com.bizo.asperatus.model.Dimension dimension22 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray23 = new com.bizo.asperatus.model.Dimension[] { dimension22 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList24 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList24, dimensionArray23);
        com.bizo.asperatus.model.CompoundDimension compoundDimension26 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList24);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker27 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService28 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler29 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker18, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList24, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker27, scheduledExecutorService28);
        com.bizo.asperatus.model.Unit unit32 = com.bizo.asperatus.model.Unit.Count;
        java.util.concurrent.TimeUnit timeUnit35 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker36 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit35);
        com.bizo.asperatus.model.Dimension dimension41 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray42 = new com.bizo.asperatus.model.Dimension[] { dimension41 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList43 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList43, dimensionArray42);
        metricTracker36.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList43);
        java.util.concurrent.TimeUnit timeUnit50 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker51 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit50);
        com.bizo.asperatus.model.Dimension dimension56 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray57 = new com.bizo.asperatus.model.Dimension[] { dimension56 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList58 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList58, dimensionArray57);
        metricTracker51.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList58);
        com.bizo.asperatus.model.Unit unit63 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension66 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray67 = new com.bizo.asperatus.model.Dimension[] { dimension66 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList68 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList68, dimensionArray67);
        com.bizo.asperatus.model.CompoundDimension compoundDimension70 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList68);
        metricTracker51.track("us-east-1", (java.lang.Number) 10.0f, unit63, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList68);
        metricTracker36.track("Dimension[hi!=hi!]", (java.lang.Number) (short) 1, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList68);
        metricTracker18.track("Terabytes", (java.lang.Number) 100.0d, unit32, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList68);
        inMemoryTracker0.track("Microseconds", (java.lang.Number) 10L, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList68);
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit3.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(metricTracker18);
        org.junit.Assert.assertNotNull(dimensionArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + unit32 + "' != '" + com.bizo.asperatus.model.Unit.Count + "'", unit32.equals(com.bizo.asperatus.model.Unit.Count));
        org.junit.Assert.assertNotNull(metricTracker36);
        org.junit.Assert.assertNotNull(dimensionArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(metricTracker51);
        org.junit.Assert.assertNotNull(dimensionArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + unit63 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit63.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = cWMetricTrackerBuilder0.getExecutor();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider3 = cWMetricTrackerBuilder0.getCredentialsProvider();
        long long4 = cWMetricTrackerBuilder0.getFlushDelay();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertNull(scheduledExecutorService2);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 60L + "'", long4 == 60L);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        java.util.concurrent.TimeUnit timeUnit6 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker7 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit6);
        com.bizo.asperatus.model.Dimension dimension11 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray12 = new com.bizo.asperatus.model.Dimension[] { dimension11 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList13 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList13, dimensionArray12);
        com.bizo.asperatus.model.CompoundDimension compoundDimension15 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList13);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker16 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService17 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler18 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker7, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList13, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker16, scheduledExecutorService17);
        int int19 = asperatusRateTrackerScheduler18.getFrequency();
        boolean boolean20 = asperatusRateTrackerScheduler18.isStarted();
        java.util.concurrent.TimeUnit timeUnit21 = asperatusRateTrackerScheduler18.getFrequencyUnit();
        com.bizo.asperatus.tracker.MetricTracker metricTracker22 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) 1, timeUnit21);
        com.bizo.asperatus.tracker.MetricTracker metricTracker23 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '#', timeUnit21);
        org.junit.Assert.assertNotNull(metricTracker7);
        org.junit.Assert.assertNotNull(dimensionArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(timeUnit21);
        org.junit.Assert.assertNotNull(metricTracker22);
        org.junit.Assert.assertNotNull(metricTracker23);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = cWMetricTrackerBuilder0.getExecutor();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = cWMetricTrackerBuilder0.withStage("Terabytes");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder6 = cWMetricTrackerBuilder0.withRegion("Gigabytes");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder8 = cWMetricTrackerBuilder6.withApplication("");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder9 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str10 = cWMetricTrackerBuilder9.getRegion();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService11 = cWMetricTrackerBuilder9.getExecutor();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder13 = cWMetricTrackerBuilder9.withStage("Terabytes");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider14 = cWMetricTrackerBuilder13.getCredentialsProvider();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder15 = cWMetricTrackerBuilder8.withCredentialsProvider(aWSCredentialsProvider14);
        java.lang.String str16 = cWMetricTrackerBuilder15.getApplication();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertNull(scheduledExecutorService2);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder4);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder6);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "us-east-1" + "'", str10, "us-east-1");
        org.junit.Assert.assertNull(scheduledExecutorService11);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder13);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider14);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker0 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit3 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics4 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit3);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str8 = dimension7.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray9 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList10 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList10, dimensionArray9);
        inMemoryTracker0.track("Gigabytes", (java.lang.Number) 10.0d, unit3, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList10);
        inMemoryTracker0.close();
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit3.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        java.lang.String str2 = com.bizo.asperatus.tracker.Env.envOrProperty("CompoundDimension[dimensions=[Dimension[hi!=hi!], Dimension[hi!=hi!], Dimension[hi!=hi!]]]", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.bizo.asperatus.tracker.impl.SystemOutTracker systemOutTracker0 = new com.bizo.asperatus.tracker.impl.SystemOutTracker();
        java.util.concurrent.TimeUnit timeUnit5 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker6 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit5);
        com.bizo.asperatus.model.Dimension dimension11 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray12 = new com.bizo.asperatus.model.Dimension[] { dimension11 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList13 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList13, dimensionArray12);
        metricTracker6.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList13);
        com.bizo.asperatus.model.Unit unit18 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension21 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray22 = new com.bizo.asperatus.model.Dimension[] { dimension21 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList23 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList23, dimensionArray22);
        com.bizo.asperatus.model.CompoundDimension compoundDimension25 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList23);
        metricTracker6.track("us-east-1", (java.lang.Number) 10.0f, unit18, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList23);
        systemOutTracker0.track("us-east-1", (java.lang.Number) (short) 10, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList23);
        systemOutTracker0.close();
        java.util.concurrent.TimeUnit timeUnit33 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker34 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit33);
        com.bizo.asperatus.model.Dimension dimension38 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray39 = new com.bizo.asperatus.model.Dimension[] { dimension38 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList40 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList40, dimensionArray39);
        com.bizo.asperatus.model.CompoundDimension compoundDimension42 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList40);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker43 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService44 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler45 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker34, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList40, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker43, scheduledExecutorService44);
        systemOutTracker0.track("Milliseconds", (java.lang.Number) (byte) 0, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList40);
        com.bizo.asperatus.model.Unit unit49 = com.bizo.asperatus.model.Unit.Terabits;
        java.util.concurrent.TimeUnit timeUnit52 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker53 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit52);
        com.bizo.asperatus.model.Dimension dimension58 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray59 = new com.bizo.asperatus.model.Dimension[] { dimension58 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList60 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList60, dimensionArray59);
        metricTracker53.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList60);
        com.bizo.asperatus.model.Unit unit65 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension68 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray69 = new com.bizo.asperatus.model.Dimension[] { dimension68 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList70 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList70, dimensionArray69);
        com.bizo.asperatus.model.CompoundDimension compoundDimension72 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList70);
        metricTracker53.track("us-east-1", (java.lang.Number) 10.0f, unit65, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList70);
        com.bizo.asperatus.model.Unit unit76 = com.bizo.asperatus.model.Unit.Terabytes;
        com.bizo.asperatus.model.Dimension dimension79 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension82 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension85 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray86 = new com.bizo.asperatus.model.Dimension[] { dimension79, dimension82, dimension85 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension87 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray86);
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList88 = compoundDimension87.getDimensions();
        com.bizo.asperatus.model.CompoundDimension[] compoundDimensionArray89 = new com.bizo.asperatus.model.CompoundDimension[] { compoundDimension87 };
        java.util.ArrayList<com.bizo.asperatus.model.CompoundDimension> compoundDimensionList90 = new java.util.ArrayList<com.bizo.asperatus.model.CompoundDimension>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.CompoundDimension>) compoundDimensionList90, compoundDimensionArray89);
        metricTracker53.track("Terabytes", (java.lang.Number) 0.0f, unit76, (java.util.Collection<com.bizo.asperatus.model.CompoundDimension>) compoundDimensionList90);
        systemOutTracker0.track("", (java.lang.Number) Double.POSITIVE_INFINITY, unit49, (java.util.Collection<com.bizo.asperatus.model.CompoundDimension>) compoundDimensionList90);
        org.junit.Assert.assertNotNull(metricTracker6);
        org.junit.Assert.assertNotNull(dimensionArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + unit18 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit18.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(metricTracker34);
        org.junit.Assert.assertNotNull(dimensionArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + unit49 + "' != '" + com.bizo.asperatus.model.Unit.Terabits + "'", unit49.equals(com.bizo.asperatus.model.Unit.Terabits));
        org.junit.Assert.assertNotNull(metricTracker53);
        org.junit.Assert.assertNotNull(dimensionArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + unit65 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit65.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + unit76 + "' != '" + com.bizo.asperatus.model.Unit.Terabytes + "'", unit76.equals(com.bizo.asperatus.model.Unit.Terabytes));
        org.junit.Assert.assertNotNull(dimensionArray86);
        org.junit.Assert.assertNotNull(dimensionList88);
        org.junit.Assert.assertNotNull(compoundDimensionArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = cWMetricTrackerBuilder0.getExecutor();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = cWMetricTrackerBuilder0.withStage("Terabytes");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder6 = cWMetricTrackerBuilder0.withRegion("Gigabytes");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder8 = cWMetricTrackerBuilder6.withApplication("");
        com.bizo.asperatus.tracker.MetricTracker metricTracker9 = cWMetricTrackerBuilder8.toMetricTracker();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertNull(scheduledExecutorService2);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder4);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder6);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder8);
        org.junit.Assert.assertNotNull(metricTracker9);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        int int15 = asperatusRateTrackerScheduler14.getFrequency();
        boolean boolean16 = asperatusRateTrackerScheduler14.isStarted();
        asperatusRateTrackerScheduler14.setFrequency((int) '#');
        boolean boolean19 = asperatusRateTrackerScheduler14.isStarted();
        java.util.concurrent.TimeUnit timeUnit20 = asperatusRateTrackerScheduler14.getFrequencyUnit();
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(timeUnit20);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str4 = dimension3.getValue();
        java.lang.String str5 = dimension3.toString();
        java.lang.String str6 = dimension3.getName();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey7 = new com.bizo.asperatus.tracker.impl.MetricKey("", dimension3);
        java.lang.String str8 = metricKey7.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dimension[hi!=hi!]" + "'", str5, "Dimension[hi!=hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MetricKey[metricName=,dimension=CompoundDimension[dimensions=[Dimension[hi!=hi!]]]]" + "'", str8, "MetricKey[metricName=,dimension=CompoundDimension[dimensions=[Dimension[hi!=hi!]]]]");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        int int15 = asperatusRateTrackerScheduler14.getFrequency();
        boolean boolean16 = asperatusRateTrackerScheduler14.isStarted();
        asperatusRateTrackerScheduler14.setFrequency(0);
        java.util.concurrent.TimeUnit timeUnit23 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker24 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit23);
        com.bizo.asperatus.model.Dimension dimension28 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray29 = new com.bizo.asperatus.model.Dimension[] { dimension28 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList30 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList30, dimensionArray29);
        com.bizo.asperatus.model.CompoundDimension compoundDimension32 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList30);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker33 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService34 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler35 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker24, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList30, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker33, scheduledExecutorService34);
        int int36 = asperatusRateTrackerScheduler35.getFrequency();
        boolean boolean37 = asperatusRateTrackerScheduler35.isStarted();
        java.util.concurrent.TimeUnit timeUnit38 = asperatusRateTrackerScheduler35.getFrequencyUnit();
        com.bizo.asperatus.tracker.MetricTracker metricTracker39 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) 1, timeUnit38);
        asperatusRateTrackerScheduler14.setFrequencyUnit(timeUnit38);
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder41 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider42 = null;
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder43 = cWMetricTrackerBuilder41.withCredentialsProvider(aWSCredentialsProvider42);
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder45 = cWMetricTrackerBuilder43.withRegion("hi!");
        java.util.concurrent.TimeUnit timeUnit46 = cWMetricTrackerBuilder43.getFlushUnit();
        asperatusRateTrackerScheduler14.setFrequencyUnit(timeUnit46);
        int int48 = asperatusRateTrackerScheduler14.getFrequency();
        asperatusRateTrackerScheduler14.setFrequency(1);
        // The following exception was thrown during execution in test generation
        try {
            asperatusRateTrackerScheduler14.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(metricTracker24);
        org.junit.Assert.assertNotNull(dimensionArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(timeUnit38);
        org.junit.Assert.assertNotNull(metricTracker39);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder43);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder45);
        org.junit.Assert.assertNotNull(timeUnit46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = cWMetricTrackerBuilder0.getExecutor();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = cWMetricTrackerBuilder0.withStage("Terabytes");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder6 = cWMetricTrackerBuilder0.withRegion("Gigabytes");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder8 = cWMetricTrackerBuilder6.withApplication("");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder9 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str10 = cWMetricTrackerBuilder9.getRegion();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService11 = cWMetricTrackerBuilder9.getExecutor();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder13 = cWMetricTrackerBuilder9.withStage("Terabytes");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider14 = cWMetricTrackerBuilder13.getCredentialsProvider();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder15 = cWMetricTrackerBuilder8.withCredentialsProvider(aWSCredentialsProvider14);
        long long16 = cWMetricTrackerBuilder8.getFlushDelay();
        java.lang.String str17 = cWMetricTrackerBuilder8.getRegion();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertNull(scheduledExecutorService2);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder4);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder6);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "us-east-1" + "'", str10, "us-east-1");
        org.junit.Assert.assertNull(scheduledExecutorService11);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder13);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider14);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Gigabytes" + "'", str17, "Gigabytes");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker0 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit3 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics4 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit3);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str8 = dimension7.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray9 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList10 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList10, dimensionArray9);
        inMemoryTracker0.track("Gigabytes", (java.lang.Number) 10.0d, unit3, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList10);
        com.bizo.asperatus.model.Unit unit15 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics16 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit15);
        com.bizo.asperatus.model.Unit unit17 = com.bizo.asperatus.model.Unit.Megabytes;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics18 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit17);
        boolean boolean20 = metricStatistics18.equals((java.lang.Object) (byte) 10);
        float float21 = metricStatistics18.getSum();
        float float22 = metricStatistics18.getSum();
        java.util.concurrent.TimeUnit timeUnit25 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker26 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit25);
        com.bizo.asperatus.model.Dimension dimension31 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray32 = new com.bizo.asperatus.model.Dimension[] { dimension31 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList33 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList33, dimensionArray32);
        metricTracker26.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList33);
        boolean boolean36 = metricStatistics18.equals((java.lang.Object) dimensionList33);
        inMemoryTracker0.track("Microseconds", (java.lang.Number) Double.POSITIVE_INFINITY, unit15, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList33);
        com.bizo.asperatus.model.CompoundDimension compoundDimension38 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList33);
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit3.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + unit15 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit15.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertTrue("'" + unit17 + "' != '" + com.bizo.asperatus.model.Unit.Megabytes + "'", unit17.equals(com.bizo.asperatus.model.Unit.Megabytes));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(metricTracker26);
        org.junit.Assert.assertNotNull(dimensionArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder4 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder9 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList7);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder10 = machineInfoBuilder4.without((java.util.Collection<java.lang.String>) strList7);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "CompoundDimension[dimensions=[Dimension[hi!=hi!]]]", "", "Dimension[hi!=hi!]", "Gigabytes", "Gigabytes", "MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]", "MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]", "MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder23 = machineInfoBuilder10.with((java.util.Collection<java.lang.String>) strList21);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder24 = com.bizo.asperatus.logging.error.MachineInfo.without((java.util.Collection<java.lang.String>) strList21);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder9);
        org.junit.Assert.assertNotNull(machineInfoBuilder10);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder23);
        org.junit.Assert.assertNotNull(machineInfoBuilder24);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.bizo.asperatus.model.CompoundDimension compoundDimension1 = new com.bizo.asperatus.model.CompoundDimension(dimensionList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        // The following exception was thrown during execution in test generation
        try {
            com.bizo.asperatus.model.Unit unit1 = com.bizo.asperatus.model.Unit.fromValue("us-east-1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create unit enum from us-east-1 value!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Megabytes;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        com.bizo.asperatus.model.Unit unit2 = metricStatistics1.getUnit();
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Megabytes + "'", unit0.equals(com.bizo.asperatus.model.Unit.Megabytes));
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + com.bizo.asperatus.model.Unit.Megabytes + "'", unit2.equals(com.bizo.asperatus.model.Unit.Megabytes));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str4 = dimension3.getValue();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey5 = new com.bizo.asperatus.tracker.impl.MetricKey("Gigabytes", dimension3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder10 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder15 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList13);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder20 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList18);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder21 = machineInfoBuilder15.with((java.util.Collection<java.lang.String>) strList18);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder22 = machineInfoBuilder10.with((java.util.Collection<java.lang.String>) strList18);
        boolean boolean23 = metricKey5.equals((java.lang.Object) machineInfoBuilder22);
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder28 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList26);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder33 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList31);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder34 = machineInfoBuilder28.without((java.util.Collection<java.lang.String>) strList31);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "CompoundDimension[dimensions=[Dimension[hi!=hi!]]]", "", "Dimension[hi!=hi!]", "Gigabytes", "Gigabytes", "MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]", "MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]", "MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder47 = machineInfoBuilder34.with((java.util.Collection<java.lang.String>) strList45);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder48 = machineInfoBuilder22.without((java.util.Collection<java.lang.String>) strList45);
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder53 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList51);
        java.lang.String[] strArray55 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder58 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList56);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder59 = machineInfoBuilder53.with((java.util.Collection<java.lang.String>) strList56);
        java.lang.String[] strArray61 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder64 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList62);
        java.lang.String[] strArray66 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder69 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList67);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder70 = machineInfoBuilder64.with((java.util.Collection<java.lang.String>) strList67);
        java.lang.String[] strArray72 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList73 = new java.util.ArrayList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder75 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList73);
        java.lang.String[] strArray77 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList78 = new java.util.ArrayList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder80 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList78);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder81 = machineInfoBuilder75.without((java.util.Collection<java.lang.String>) strList78);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder82 = machineInfoBuilder64.without((java.util.Collection<java.lang.String>) strList78);
        java.lang.String[] strArray84 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList85, strArray84);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder87 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList85);
        java.lang.String[] strArray94 = new java.lang.String[] { "Terabytes", "Microseconds", "Terabytes", "Gigabytes", "Terabytes", "Microseconds" };
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder95 = machineInfoBuilder87.without(strArray94);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder96 = com.bizo.asperatus.logging.error.MachineInfo.with(strArray94);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder97 = machineInfoBuilder82.with(strArray94);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder98 = machineInfoBuilder59.with(strArray94);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder99 = machineInfoBuilder22.without(strArray94);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder20);
        org.junit.Assert.assertNotNull(machineInfoBuilder21);
        org.junit.Assert.assertNotNull(machineInfoBuilder22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder33);
        org.junit.Assert.assertNotNull(machineInfoBuilder34);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder47);
        org.junit.Assert.assertNotNull(machineInfoBuilder48);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder53);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder58);
        org.junit.Assert.assertNotNull(machineInfoBuilder59);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder64);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder69);
        org.junit.Assert.assertNotNull(machineInfoBuilder70);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder75);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder80);
        org.junit.Assert.assertNotNull(machineInfoBuilder81);
        org.junit.Assert.assertNotNull(machineInfoBuilder82);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder87);
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertNotNull(machineInfoBuilder95);
        org.junit.Assert.assertNotNull(machineInfoBuilder96);
        org.junit.Assert.assertNotNull(machineInfoBuilder97);
        org.junit.Assert.assertNotNull(machineInfoBuilder98);
        org.junit.Assert.assertNotNull(machineInfoBuilder99);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = cWMetricTrackerBuilder0.getExecutor();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = cWMetricTrackerBuilder0.withStage("Terabytes");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder6 = cWMetricTrackerBuilder0.withRegion("Gigabytes");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider7 = cWMetricTrackerBuilder0.getCredentialsProvider();
        long long8 = cWMetricTrackerBuilder0.getFlushDelay();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertNull(scheduledExecutorService2);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder4);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder6);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60L + "'", long8 == 60L);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.bizo.asperatus.tracker.Env.envOrProperty("Gigabytes");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Missing required property: Gigabytes");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str4 = dimension3.getValue();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey5 = new com.bizo.asperatus.tracker.impl.MetricKey("Gigabytes", dimension3);
        java.util.concurrent.TimeUnit timeUnit8 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker9 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) (short) 10, timeUnit8);
        boolean boolean10 = metricKey5.equals((java.lang.Object) metricTracker9);
        com.bizo.asperatus.model.Unit unit13 = com.bizo.asperatus.model.Unit.Kilobits;
        java.lang.String str14 = unit13.getValue();
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker15 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit18 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics19 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit18);
        com.bizo.asperatus.model.Dimension dimension22 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str23 = dimension22.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray24 = new com.bizo.asperatus.model.Dimension[] { dimension22 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList25 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList25, dimensionArray24);
        inMemoryTracker15.track("Gigabytes", (java.lang.Number) 10.0d, unit18, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList25);
        java.util.Map<com.bizo.asperatus.tracker.impl.MetricKey, com.bizo.asperatus.tracker.impl.MetricStatistics> metricKeyMap28 = inMemoryTracker15.reset();
        com.bizo.asperatus.model.Unit unit31 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.model.Dimension dimension34 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension37 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension40 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray41 = new com.bizo.asperatus.model.Dimension[] { dimension34, dimension37, dimension40 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension42 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray41);
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList43 = compoundDimension42.getDimensions();
        com.bizo.asperatus.model.Dimension dimension47 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension50 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension53 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray54 = new com.bizo.asperatus.model.Dimension[] { dimension47, dimension50, dimension53 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension55 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray54);
        com.bizo.asperatus.tracker.impl.MetricKey metricKey56 = new com.bizo.asperatus.tracker.impl.MetricKey("us-east-1", compoundDimension55);
        com.bizo.asperatus.model.CompoundDimension[] compoundDimensionArray57 = new com.bizo.asperatus.model.CompoundDimension[] { compoundDimension42, compoundDimension55 };
        java.util.ArrayList<com.bizo.asperatus.model.CompoundDimension> compoundDimensionList58 = new java.util.ArrayList<com.bizo.asperatus.model.CompoundDimension>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.CompoundDimension>) compoundDimensionList58, compoundDimensionArray57);
        inMemoryTracker15.track("Gigabytes", (java.lang.Number) 10L, unit31, (java.util.Collection<com.bizo.asperatus.model.CompoundDimension>) compoundDimensionList58);
        metricTracker9.track("", (java.lang.Number) Double.POSITIVE_INFINITY, unit13, (java.util.Collection<com.bizo.asperatus.model.CompoundDimension>) compoundDimensionList58);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(metricTracker9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + unit13 + "' != '" + com.bizo.asperatus.model.Unit.Kilobits + "'", unit13.equals(com.bizo.asperatus.model.Unit.Kilobits));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Kilobits" + "'", str14, "Kilobits");
        org.junit.Assert.assertTrue("'" + unit18 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit18.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(metricKeyMap28);
        org.junit.Assert.assertTrue("'" + unit31 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit31.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertNotNull(dimensionArray41);
        org.junit.Assert.assertNotNull(dimensionList43);
        org.junit.Assert.assertNotNull(dimensionArray54);
        org.junit.Assert.assertNotNull(compoundDimensionArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker0 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit3 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics4 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit3);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str8 = dimension7.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray9 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList10 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList10, dimensionArray9);
        inMemoryTracker0.track("Gigabytes", (java.lang.Number) 10.0d, unit3, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList10);
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics13 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit3);
        float float14 = metricStatistics13.getMin();
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit3.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 3.4028235E38f + "'", float14 == 3.4028235E38f);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Megabytes;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics2 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        java.lang.Object obj3 = null;
        boolean boolean4 = metricStatistics2.equals(obj3);
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Megabytes + "'", unit0.equals(com.bizo.asperatus.model.Unit.Megabytes));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.bizo.asperatus.model.Dimension dimension2 = new com.bizo.asperatus.model.Dimension("Dimension[us-east-1=hi!]", "Dimension[us-east-1=hi!]");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider1 = null;
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder2 = cWMetricTrackerBuilder0.withCredentialsProvider(aWSCredentialsProvider1);
        java.lang.String str3 = cWMetricTrackerBuilder0.getApplication();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str5 = cWMetricTrackerBuilder4.getRegion();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService6 = cWMetricTrackerBuilder4.getExecutor();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder8 = cWMetricTrackerBuilder4.withStage("Terabytes");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder10 = cWMetricTrackerBuilder4.withRegion("Gigabytes");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider11 = cWMetricTrackerBuilder10.getCredentialsProvider();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder12 = cWMetricTrackerBuilder0.withCredentialsProvider(aWSCredentialsProvider11);
        java.lang.String str13 = cWMetricTrackerBuilder12.getRegion();
        long long14 = cWMetricTrackerBuilder12.getFlushDelay();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder16 = cWMetricTrackerBuilder12.withRegion("Dimension[us-east-1=hi!]");
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "us-east-1" + "'", str5, "us-east-1");
        org.junit.Assert.assertNull(scheduledExecutorService6);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder8);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder10);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider11);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "us-east-1" + "'", str13, "us-east-1");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder16);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker0 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit3 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics4 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit3);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str8 = dimension7.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray9 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList10 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList10, dimensionArray9);
        inMemoryTracker0.track("Gigabytes", (java.lang.Number) 10.0d, unit3, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList10);
        java.util.Map<com.bizo.asperatus.tracker.impl.MetricKey, com.bizo.asperatus.tracker.impl.MetricStatistics> metricKeyMap13 = inMemoryTracker0.reset();
        com.bizo.asperatus.model.Unit unit16 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.model.Dimension dimension19 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension22 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension25 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray26 = new com.bizo.asperatus.model.Dimension[] { dimension19, dimension22, dimension25 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension27 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray26);
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList28 = compoundDimension27.getDimensions();
        com.bizo.asperatus.model.Dimension dimension32 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension35 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension38 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray39 = new com.bizo.asperatus.model.Dimension[] { dimension32, dimension35, dimension38 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension40 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray39);
        com.bizo.asperatus.tracker.impl.MetricKey metricKey41 = new com.bizo.asperatus.tracker.impl.MetricKey("us-east-1", compoundDimension40);
        com.bizo.asperatus.model.CompoundDimension[] compoundDimensionArray42 = new com.bizo.asperatus.model.CompoundDimension[] { compoundDimension27, compoundDimension40 };
        java.util.ArrayList<com.bizo.asperatus.model.CompoundDimension> compoundDimensionList43 = new java.util.ArrayList<com.bizo.asperatus.model.CompoundDimension>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.CompoundDimension>) compoundDimensionList43, compoundDimensionArray42);
        inMemoryTracker0.track("Gigabytes", (java.lang.Number) 10L, unit16, (java.util.Collection<com.bizo.asperatus.model.CompoundDimension>) compoundDimensionList43);
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics46 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit16);
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit3.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(metricKeyMap13);
        org.junit.Assert.assertTrue("'" + unit16 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit16.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertNotNull(dimensionArray26);
        org.junit.Assert.assertNotNull(dimensionList28);
        org.junit.Assert.assertNotNull(dimensionArray39);
        org.junit.Assert.assertNotNull(compoundDimensionArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.bizo.asperatus.tracker.Env.envOrProperty("Microseconds", "");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Missing required property: Microseconds");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Megabytes;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        boolean boolean3 = metricStatistics1.equals((java.lang.Object) (byte) 10);
        long long4 = metricStatistics1.getSamples();
        long long5 = metricStatistics1.getSamples();
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Megabytes + "'", unit0.equals(com.bizo.asperatus.model.Unit.Megabytes));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder1 = com.bizo.asperatus.logging.error.MachineInfo.with(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Megabytes;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        boolean boolean3 = metricStatistics1.equals((java.lang.Object) (byte) 10);
        float float4 = metricStatistics1.getMin();
        float float5 = metricStatistics1.getMax();
        float float6 = metricStatistics1.getSum();
        java.lang.String str7 = metricStatistics1.toString();
        float float8 = metricStatistics1.getMax();
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Megabytes + "'", unit0.equals(com.bizo.asperatus.model.Unit.Megabytes));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 3.4028235E38f + "'", float4 == 3.4028235E38f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.4E-45f + "'", float5 == 1.4E-45f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MStats[unit:Megabytes,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]" + "'", str7, "MStats[unit:Megabytes,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.4E-45f + "'", float8 == 1.4E-45f);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder4 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder9 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList7);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder10 = machineInfoBuilder4.without((java.util.Collection<java.lang.String>) strList7);
        java.lang.String[] strArray17 = new java.lang.String[] { "Dimension[us-east-1=hi!]", "MetricKey[metricName=,dimension=CompoundDimension[dimensions=[Dimension[hi!=hi!]]]]", "dev", "CompoundDimension[dimensions=[Dimension[hi!=hi!], Dimension[hi!=hi!], Dimension[hi!=hi!]]]", "CompoundDimension[dimensions=[Dimension[hi!=hi!], Dimension[hi!=hi!], Dimension[hi!=hi!]]]", "dev" };
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder18 = machineInfoBuilder4.with(strArray17);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder9);
        org.junit.Assert.assertNotNull(machineInfoBuilder10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(machineInfoBuilder18);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str4 = dimension3.getValue();
        java.lang.String str5 = dimension3.toString();
        java.lang.String str6 = dimension3.getName();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker10 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit9);
        com.bizo.asperatus.model.Dimension dimension14 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray15 = new com.bizo.asperatus.model.Dimension[] { dimension14 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList16 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList16, dimensionArray15);
        com.bizo.asperatus.model.CompoundDimension compoundDimension18 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList16);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker19 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService20 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler21 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker10, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList16, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker19, scheduledExecutorService20);
        com.bizo.asperatus.model.Unit unit24 = com.bizo.asperatus.model.Unit.Count;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker28 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit27);
        com.bizo.asperatus.model.Dimension dimension33 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray34 = new com.bizo.asperatus.model.Dimension[] { dimension33 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList35 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList35, dimensionArray34);
        metricTracker28.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList35);
        java.util.concurrent.TimeUnit timeUnit42 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker43 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit42);
        com.bizo.asperatus.model.Dimension dimension48 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray49 = new com.bizo.asperatus.model.Dimension[] { dimension48 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList50 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList50, dimensionArray49);
        metricTracker43.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList50);
        com.bizo.asperatus.model.Unit unit55 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension58 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray59 = new com.bizo.asperatus.model.Dimension[] { dimension58 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList60 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList60, dimensionArray59);
        com.bizo.asperatus.model.CompoundDimension compoundDimension62 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList60);
        metricTracker43.track("us-east-1", (java.lang.Number) 10.0f, unit55, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList60);
        metricTracker28.track("Dimension[hi!=hi!]", (java.lang.Number) (short) 1, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList60);
        metricTracker10.track("Terabytes", (java.lang.Number) 100.0d, unit24, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList60);
        boolean boolean66 = dimension3.equals((java.lang.Object) dimensionList60);
        com.bizo.asperatus.tracker.impl.MetricKey metricKey67 = new com.bizo.asperatus.tracker.impl.MetricKey("Microseconds", dimension3);
        java.lang.String str68 = dimension3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dimension[hi!=hi!]" + "'", str5, "Dimension[hi!=hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(metricTracker10);
        org.junit.Assert.assertNotNull(dimensionArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + unit24 + "' != '" + com.bizo.asperatus.model.Unit.Count + "'", unit24.equals(com.bizo.asperatus.model.Unit.Count));
        org.junit.Assert.assertNotNull(metricTracker28);
        org.junit.Assert.assertNotNull(dimensionArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(metricTracker43);
        org.junit.Assert.assertNotNull(dimensionArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + unit55 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit55.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Dimension[hi!=hi!]" + "'", str68, "Dimension[hi!=hi!]");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.bizo.asperatus.model.Dimension dimension2 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker3 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit6 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics7 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit6);
        com.bizo.asperatus.model.Dimension dimension10 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str11 = dimension10.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray12 = new com.bizo.asperatus.model.Dimension[] { dimension10 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList13 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList13, dimensionArray12);
        inMemoryTracker3.track("Gigabytes", (java.lang.Number) 10.0d, unit6, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList13);
        java.util.Map<com.bizo.asperatus.tracker.impl.MetricKey, com.bizo.asperatus.tracker.impl.MetricStatistics> metricKeyMap16 = inMemoryTracker3.reset();
        java.util.Map<com.bizo.asperatus.tracker.impl.MetricKey, com.bizo.asperatus.tracker.impl.MetricStatistics> metricKeyMap17 = inMemoryTracker3.reset();
        boolean boolean18 = dimension2.equals((java.lang.Object) inMemoryTracker3);
        org.junit.Assert.assertTrue("'" + unit6 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit6.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(metricKeyMap16);
        org.junit.Assert.assertNotNull(metricKeyMap17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Microseconds;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        metricStatistics1.add((java.lang.Number) (byte) 0);
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Microseconds + "'", unit0.equals(com.bizo.asperatus.model.Unit.Microseconds));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str4 = dimension3.getValue();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey5 = new com.bizo.asperatus.tracker.impl.MetricKey("Gigabytes", dimension3);
        java.lang.String str6 = dimension3.toString();
        java.lang.String str7 = dimension3.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Dimension[hi!=hi!]" + "'", str6, "Dimension[hi!=hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Megabytes;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        boolean boolean3 = metricStatistics1.equals((java.lang.Object) (byte) 10);
        float float4 = metricStatistics1.getMax();
        java.lang.String str5 = metricStatistics1.toString();
        java.lang.Object obj6 = null;
        boolean boolean7 = metricStatistics1.equals(obj6);
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Megabytes + "'", unit0.equals(com.bizo.asperatus.model.Unit.Megabytes));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.4E-45f + "'", float4 == 1.4E-45f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MStats[unit:Megabytes,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]" + "'", str5, "MStats[unit:Megabytes,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = cWMetricTrackerBuilder0.getExecutor();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = cWMetricTrackerBuilder0.withStage("Terabytes");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider5 = cWMetricTrackerBuilder4.getCredentialsProvider();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder6 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider7 = null;
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder8 = cWMetricTrackerBuilder6.withCredentialsProvider(aWSCredentialsProvider7);
        java.lang.String str9 = cWMetricTrackerBuilder6.getApplication();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder10 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str11 = cWMetricTrackerBuilder10.getRegion();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService12 = cWMetricTrackerBuilder10.getExecutor();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder14 = cWMetricTrackerBuilder10.withStage("Terabytes");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder16 = cWMetricTrackerBuilder10.withRegion("Gigabytes");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider17 = cWMetricTrackerBuilder16.getCredentialsProvider();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder18 = cWMetricTrackerBuilder6.withCredentialsProvider(aWSCredentialsProvider17);
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder19 = cWMetricTrackerBuilder4.withCredentialsProvider(aWSCredentialsProvider17);
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder20 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider21 = null;
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder22 = cWMetricTrackerBuilder20.withCredentialsProvider(aWSCredentialsProvider21);
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder23 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str24 = cWMetricTrackerBuilder23.getRegion();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider25 = cWMetricTrackerBuilder23.getCredentialsProvider();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder26 = cWMetricTrackerBuilder22.withCredentialsProvider(aWSCredentialsProvider25);
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder27 = cWMetricTrackerBuilder19.withCredentialsProvider(aWSCredentialsProvider25);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertNull(scheduledExecutorService2);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder4);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider5);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "us-east-1" + "'", str11, "us-east-1");
        org.junit.Assert.assertNull(scheduledExecutorService12);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder14);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder16);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider17);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder18);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder19);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "us-east-1" + "'", str24, "us-east-1");
        org.junit.Assert.assertNotNull(aWSCredentialsProvider25);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder26);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder27);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.GigabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.GigabitsSecond + "'", unit0.equals(com.bizo.asperatus.model.Unit.GigabitsSecond));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        int int15 = asperatusRateTrackerScheduler14.getFrequency();
        boolean boolean16 = asperatusRateTrackerScheduler14.isStarted();
        asperatusRateTrackerScheduler14.setFrequency((int) '#');
        boolean boolean19 = asperatusRateTrackerScheduler14.isStarted();
        asperatusRateTrackerScheduler14.setFrequency(0);
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.bizo.asperatus.tracker.Env.envOrProperty("Dimension[us-east-1=hi!]", "");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Missing required property: Dimension[us-east-1=hi!]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.bizo.asperatus.tracker.impl.SystemOutTracker systemOutTracker0 = new com.bizo.asperatus.tracker.impl.SystemOutTracker();
        java.util.concurrent.TimeUnit timeUnit5 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker6 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit5);
        com.bizo.asperatus.model.Dimension dimension11 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray12 = new com.bizo.asperatus.model.Dimension[] { dimension11 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList13 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList13, dimensionArray12);
        metricTracker6.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList13);
        com.bizo.asperatus.model.Unit unit18 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension21 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray22 = new com.bizo.asperatus.model.Dimension[] { dimension21 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList23 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList23, dimensionArray22);
        com.bizo.asperatus.model.CompoundDimension compoundDimension25 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList23);
        metricTracker6.track("us-east-1", (java.lang.Number) 10.0f, unit18, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList23);
        systemOutTracker0.track("us-east-1", (java.lang.Number) (short) 10, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList23);
        systemOutTracker0.close();
        java.util.concurrent.TimeUnit timeUnit33 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker34 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit33);
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker36 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit39 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics40 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit39);
        com.bizo.asperatus.model.Dimension dimension43 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str44 = dimension43.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray45 = new com.bizo.asperatus.model.Dimension[] { dimension43 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList46 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList46, dimensionArray45);
        inMemoryTracker36.track("Gigabytes", (java.lang.Number) 10.0d, unit39, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList46);
        java.util.concurrent.TimeUnit timeUnit51 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker52 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit51);
        com.bizo.asperatus.model.Dimension dimension56 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray57 = new com.bizo.asperatus.model.Dimension[] { dimension56 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList58 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList58, dimensionArray57);
        com.bizo.asperatus.model.CompoundDimension compoundDimension60 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList58);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker61 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService62 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler63 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker52, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList58, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker61, scheduledExecutorService62);
        threadSafeRateTracker61.track();
        double double65 = threadSafeRateTracker61.getRateAndResetPeriod();
        double double66 = threadSafeRateTracker61.getRateAndResetPeriod();
        threadSafeRateTracker61.track();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService68 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler69 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker34, "Microseconds", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList46, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker61, scheduledExecutorService68);
        systemOutTracker0.track("", (java.lang.Number) (byte) -1, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList46);
        java.util.concurrent.TimeUnit timeUnit75 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker76 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit75);
        com.bizo.asperatus.model.Dimension dimension80 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray81 = new com.bizo.asperatus.model.Dimension[] { dimension80 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList82 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList82, dimensionArray81);
        com.bizo.asperatus.model.CompoundDimension compoundDimension84 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList82);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker85 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService86 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler87 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker76, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList82, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker85, scheduledExecutorService86);
        systemOutTracker0.track("Dimension[us-east-1=hi!]", (java.lang.Number) 0L, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList82);
        org.junit.Assert.assertNotNull(metricTracker6);
        org.junit.Assert.assertNotNull(dimensionArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + unit18 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit18.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(metricTracker34);
        org.junit.Assert.assertTrue("'" + unit39 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit39.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(metricTracker52);
        org.junit.Assert.assertNotNull(dimensionArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + Double.POSITIVE_INFINITY + "'", double65 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertNotNull(metricTracker76);
        org.junit.Assert.assertNotNull(dimensionArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.bizo.asperatus.model.Dimension dimension2 = new com.bizo.asperatus.model.Dimension("us-east-1", "hi!");
        java.lang.String str3 = dimension2.getName();
        java.lang.String str4 = dimension2.toString();
        com.bizo.asperatus.model.Unit unit6 = com.bizo.asperatus.model.Unit.fromValue("Kilobits");
        boolean boolean7 = dimension2.equals((java.lang.Object) "Kilobits");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-east-1" + "'", str3, "us-east-1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Dimension[us-east-1=hi!]" + "'", str4, "Dimension[us-east-1=hi!]");
        org.junit.Assert.assertTrue("'" + unit6 + "' != '" + com.bizo.asperatus.model.Unit.Kilobits + "'", unit6.equals(com.bizo.asperatus.model.Unit.Kilobits));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.bizo.asperatus.tracker.impl.SystemOutTracker systemOutTracker0 = new com.bizo.asperatus.tracker.impl.SystemOutTracker();
        java.util.concurrent.TimeUnit timeUnit5 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker6 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit5);
        com.bizo.asperatus.model.Dimension dimension11 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray12 = new com.bizo.asperatus.model.Dimension[] { dimension11 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList13 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList13, dimensionArray12);
        metricTracker6.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList13);
        com.bizo.asperatus.model.Unit unit18 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension21 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray22 = new com.bizo.asperatus.model.Dimension[] { dimension21 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList23 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList23, dimensionArray22);
        com.bizo.asperatus.model.CompoundDimension compoundDimension25 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList23);
        metricTracker6.track("us-east-1", (java.lang.Number) 10.0f, unit18, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList23);
        systemOutTracker0.track("us-east-1", (java.lang.Number) (short) 10, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList23);
        systemOutTracker0.close();
        java.util.concurrent.TimeUnit timeUnit33 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker34 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit33);
        com.bizo.asperatus.model.Dimension dimension38 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray39 = new com.bizo.asperatus.model.Dimension[] { dimension38 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList40 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList40, dimensionArray39);
        com.bizo.asperatus.model.CompoundDimension compoundDimension42 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList40);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker43 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService44 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler45 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker34, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList40, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker43, scheduledExecutorService44);
        systemOutTracker0.track("Milliseconds", (java.lang.Number) (byte) 0, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList40);
        com.bizo.asperatus.model.Unit unit49 = com.bizo.asperatus.model.Unit.Gigabits;
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker50 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit53 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics54 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit53);
        com.bizo.asperatus.model.Dimension dimension57 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str58 = dimension57.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray59 = new com.bizo.asperatus.model.Dimension[] { dimension57 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList60 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList60, dimensionArray59);
        inMemoryTracker50.track("Gigabytes", (java.lang.Number) 10.0d, unit53, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList60);
        systemOutTracker0.track("Microseconds", (java.lang.Number) 0.0f, unit49, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList60);
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker65 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit68 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics69 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit68);
        com.bizo.asperatus.model.Dimension dimension72 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str73 = dimension72.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray74 = new com.bizo.asperatus.model.Dimension[] { dimension72 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList75 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList75, dimensionArray74);
        inMemoryTracker65.track("Gigabytes", (java.lang.Number) 10.0d, unit68, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList75);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker78 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        double double79 = threadSafeRateTracker78.getRateAndResetPeriod();
        threadSafeRateTracker78.track();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService81 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler82 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler((com.bizo.asperatus.tracker.MetricTracker) systemOutTracker0, "Dimension[hi!=hi!]", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList75, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker78, scheduledExecutorService81);
        threadSafeRateTracker78.track();
        org.junit.Assert.assertNotNull(metricTracker6);
        org.junit.Assert.assertNotNull(dimensionArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + unit18 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit18.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(metricTracker34);
        org.junit.Assert.assertNotNull(dimensionArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + unit49 + "' != '" + com.bizo.asperatus.model.Unit.Gigabits + "'", unit49.equals(com.bizo.asperatus.model.Unit.Gigabits));
        org.junit.Assert.assertTrue("'" + unit53 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit53.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + unit68 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit68.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double79));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker0 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit3 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics4 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit3);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str8 = dimension7.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray9 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList10 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList10, dimensionArray9);
        inMemoryTracker0.track("Gigabytes", (java.lang.Number) 10.0d, unit3, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList10);
        java.util.Map<com.bizo.asperatus.tracker.impl.MetricKey, com.bizo.asperatus.tracker.impl.MetricStatistics> metricKeyMap13 = inMemoryTracker0.reset();
        com.bizo.asperatus.model.Unit unit16 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.model.Dimension dimension19 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension22 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension25 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray26 = new com.bizo.asperatus.model.Dimension[] { dimension19, dimension22, dimension25 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension27 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray26);
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList28 = compoundDimension27.getDimensions();
        com.bizo.asperatus.model.Dimension dimension32 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension35 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension38 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray39 = new com.bizo.asperatus.model.Dimension[] { dimension32, dimension35, dimension38 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension40 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray39);
        com.bizo.asperatus.tracker.impl.MetricKey metricKey41 = new com.bizo.asperatus.tracker.impl.MetricKey("us-east-1", compoundDimension40);
        com.bizo.asperatus.model.CompoundDimension[] compoundDimensionArray42 = new com.bizo.asperatus.model.CompoundDimension[] { compoundDimension27, compoundDimension40 };
        java.util.ArrayList<com.bizo.asperatus.model.CompoundDimension> compoundDimensionList43 = new java.util.ArrayList<com.bizo.asperatus.model.CompoundDimension>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.CompoundDimension>) compoundDimensionList43, compoundDimensionArray42);
        inMemoryTracker0.track("Gigabytes", (java.lang.Number) 10L, unit16, (java.util.Collection<com.bizo.asperatus.model.CompoundDimension>) compoundDimensionList43);
        com.bizo.asperatus.model.Unit unit48 = com.bizo.asperatus.model.Unit.Kilobits;
        com.bizo.asperatus.model.Dimension dimension51 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension54 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension57 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray58 = new com.bizo.asperatus.model.Dimension[] { dimension51, dimension54, dimension57 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension59 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray58);
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList60 = compoundDimension59.getDimensions();
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList61 = compoundDimension59.getDimensions();
        inMemoryTracker0.track("MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]", (java.lang.Number) 10, unit48, dimensionList61);
        java.util.Map<com.bizo.asperatus.tracker.impl.MetricKey, com.bizo.asperatus.tracker.impl.MetricStatistics> metricKeyMap63 = inMemoryTracker0.reset();
        com.bizo.asperatus.model.Unit unit66 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        java.lang.String[] strArray68 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder71 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList69);
        java.lang.String[] strArray73 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder76 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList74);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder77 = machineInfoBuilder71.without((java.util.Collection<java.lang.String>) strList74);
        java.lang.String[] strArray87 = new java.lang.String[] { "", "CompoundDimension[dimensions=[Dimension[hi!=hi!]]]", "", "Dimension[hi!=hi!]", "Gigabytes", "Gigabytes", "MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]", "MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]", "MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]" };
        java.util.ArrayList<java.lang.String> strList88 = new java.util.ArrayList<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList88, strArray87);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder90 = machineInfoBuilder77.with((java.util.Collection<java.lang.String>) strList88);
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList91 = machineInfoBuilder77.toDimensions();
        inMemoryTracker0.track("CompoundDimension[dimensions=[Dimension[hi!=hi!], Dimension[hi!=hi!], Dimension[hi!=hi!]]]", (java.lang.Number) 1.0d, unit66, dimensionList91);
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit3.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(metricKeyMap13);
        org.junit.Assert.assertTrue("'" + unit16 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit16.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertNotNull(dimensionArray26);
        org.junit.Assert.assertNotNull(dimensionList28);
        org.junit.Assert.assertNotNull(dimensionArray39);
        org.junit.Assert.assertNotNull(compoundDimensionArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + unit48 + "' != '" + com.bizo.asperatus.model.Unit.Kilobits + "'", unit48.equals(com.bizo.asperatus.model.Unit.Kilobits));
        org.junit.Assert.assertNotNull(dimensionArray58);
        org.junit.Assert.assertNotNull(dimensionList60);
        org.junit.Assert.assertNotNull(dimensionList61);
        org.junit.Assert.assertNotNull(metricKeyMap63);
        org.junit.Assert.assertTrue("'" + unit66 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit66.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder71);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder76);
        org.junit.Assert.assertNotNull(machineInfoBuilder77);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder90);
        org.junit.Assert.assertNotNull(dimensionList91);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str4 = dimension3.getValue();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey5 = new com.bizo.asperatus.tracker.impl.MetricKey("Gigabytes", dimension3);
        java.util.concurrent.TimeUnit timeUnit8 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker9 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) (short) 10, timeUnit8);
        boolean boolean10 = metricKey5.equals((java.lang.Object) metricTracker9);
        java.lang.String str11 = metricKey5.getMetricName();
        java.util.concurrent.TimeUnit timeUnit14 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker15 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit14);
        com.bizo.asperatus.model.Dimension dimension20 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray21 = new com.bizo.asperatus.model.Dimension[] { dimension20 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList22 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList22, dimensionArray21);
        metricTracker15.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList22);
        java.util.concurrent.TimeUnit timeUnit29 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker30 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit29);
        com.bizo.asperatus.model.Dimension dimension35 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray36 = new com.bizo.asperatus.model.Dimension[] { dimension35 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList37 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList37, dimensionArray36);
        metricTracker30.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList37);
        com.bizo.asperatus.model.Unit unit42 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension45 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray46 = new com.bizo.asperatus.model.Dimension[] { dimension45 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList47 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList47, dimensionArray46);
        com.bizo.asperatus.model.CompoundDimension compoundDimension49 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList47);
        metricTracker30.track("us-east-1", (java.lang.Number) 10.0f, unit42, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList47);
        metricTracker15.track("Dimension[hi!=hi!]", (java.lang.Number) (short) 1, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList47);
        com.bizo.asperatus.model.CompoundDimension compoundDimension52 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList47);
        boolean boolean53 = metricKey5.equals((java.lang.Object) compoundDimension52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(metricTracker9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Gigabytes" + "'", str11, "Gigabytes");
        org.junit.Assert.assertNotNull(metricTracker15);
        org.junit.Assert.assertNotNull(dimensionArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(metricTracker30);
        org.junit.Assert.assertNotNull(dimensionArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + unit42 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit42.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.bizo.asperatus.model.Dimension dimension5 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str6 = dimension5.getValue();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey7 = new com.bizo.asperatus.tracker.impl.MetricKey("hi!", dimension5);
        com.bizo.asperatus.tracker.impl.MetricKey metricKey8 = new com.bizo.asperatus.tracker.impl.MetricKey("", dimension5);
        com.bizo.asperatus.tracker.impl.MetricKey metricKey9 = new com.bizo.asperatus.tracker.impl.MetricKey("hi!", dimension5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker5 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit8 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics9 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit8);
        com.bizo.asperatus.model.Dimension dimension12 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str13 = dimension12.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray14 = new com.bizo.asperatus.model.Dimension[] { dimension12 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList15 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList15, dimensionArray14);
        inMemoryTracker5.track("Gigabytes", (java.lang.Number) 10.0d, unit8, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList15);
        java.util.concurrent.TimeUnit timeUnit20 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker21 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit20);
        com.bizo.asperatus.model.Dimension dimension25 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray26 = new com.bizo.asperatus.model.Dimension[] { dimension25 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList27 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList27, dimensionArray26);
        com.bizo.asperatus.model.CompoundDimension compoundDimension29 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList27);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker30 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService31 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler32 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker21, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList27, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker30, scheduledExecutorService31);
        threadSafeRateTracker30.track();
        double double34 = threadSafeRateTracker30.getRateAndResetPeriod();
        double double35 = threadSafeRateTracker30.getRateAndResetPeriod();
        threadSafeRateTracker30.track();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService37 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler38 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "Microseconds", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList15, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker30, scheduledExecutorService37);
        double double39 = threadSafeRateTracker30.getRateAndResetPeriod();
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit8.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(metricTracker21);
        org.junit.Assert.assertNotNull(dimensionArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + Double.POSITIVE_INFINITY + "'", double34 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + Double.POSITIVE_INFINITY + "'", double39 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension6 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension9 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray10 = new com.bizo.asperatus.model.Dimension[] { dimension3, dimension6, dimension9 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray10);
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList12 = compoundDimension11.getDimensions();
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList13 = compoundDimension11.getDimensions();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey14 = new com.bizo.asperatus.tracker.impl.MetricKey("hi!", compoundDimension11);
        com.bizo.asperatus.model.Unit unit15 = com.bizo.asperatus.model.Unit.Milliseconds;
        boolean boolean16 = compoundDimension11.equals((java.lang.Object) unit15);
        org.junit.Assert.assertNotNull(dimensionArray10);
        org.junit.Assert.assertNotNull(dimensionList12);
        org.junit.Assert.assertNotNull(dimensionList13);
        org.junit.Assert.assertTrue("'" + unit15 + "' != '" + com.bizo.asperatus.model.Unit.Milliseconds + "'", unit15.equals(com.bizo.asperatus.model.Unit.Milliseconds));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str4 = dimension3.getValue();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey5 = new com.bizo.asperatus.tracker.impl.MetricKey("hi!", dimension3);
        java.lang.String str6 = metricKey5.getMetricName();
        com.bizo.asperatus.model.Dimension dimension9 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension12 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension15 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray16 = new com.bizo.asperatus.model.Dimension[] { dimension9, dimension12, dimension15 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension17 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray16);
        boolean boolean18 = metricKey5.equals((java.lang.Object) dimensionArray16);
        java.lang.String str19 = metricKey5.getMetricName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder4 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList2);
        java.lang.String[] strArray9 = new java.lang.String[] { "Kilobits", "hi!", "dev", "Dimension[us-east-1=hi!]" };
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder10 = machineInfoBuilder4.without(strArray9);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(machineInfoBuilder10);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder4 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList2);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder5 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList2);
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList6 = machineInfoBuilder5.toDimensions();
        com.bizo.asperatus.model.Dimension dimension10 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str11 = dimension10.getValue();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey12 = new com.bizo.asperatus.tracker.impl.MetricKey("Gigabytes", dimension10);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder17 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder22 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList20);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder27 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList25);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder28 = machineInfoBuilder22.with((java.util.Collection<java.lang.String>) strList25);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder29 = machineInfoBuilder17.with((java.util.Collection<java.lang.String>) strList25);
        boolean boolean30 = metricKey12.equals((java.lang.Object) machineInfoBuilder29);
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder35 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList33);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder40 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList38);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder41 = machineInfoBuilder35.without((java.util.Collection<java.lang.String>) strList38);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "CompoundDimension[dimensions=[Dimension[hi!=hi!]]]", "", "Dimension[hi!=hi!]", "Gigabytes", "Gigabytes", "MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]", "MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]", "MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder54 = machineInfoBuilder41.with((java.util.Collection<java.lang.String>) strList52);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder55 = machineInfoBuilder29.without((java.util.Collection<java.lang.String>) strList52);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder56 = machineInfoBuilder5.without((java.util.Collection<java.lang.String>) strList52);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder4);
        org.junit.Assert.assertNotNull(machineInfoBuilder5);
        org.junit.Assert.assertNotNull(dimensionList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder27);
        org.junit.Assert.assertNotNull(machineInfoBuilder28);
        org.junit.Assert.assertNotNull(machineInfoBuilder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder40);
        org.junit.Assert.assertNotNull(machineInfoBuilder41);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder54);
        org.junit.Assert.assertNotNull(machineInfoBuilder55);
        org.junit.Assert.assertNotNull(machineInfoBuilder56);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder2 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider3 = null;
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = cWMetricTrackerBuilder2.withCredentialsProvider(aWSCredentialsProvider3);
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder5 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str6 = cWMetricTrackerBuilder5.getRegion();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider7 = cWMetricTrackerBuilder5.getCredentialsProvider();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder8 = cWMetricTrackerBuilder4.withCredentialsProvider(aWSCredentialsProvider7);
        java.util.concurrent.TimeUnit timeUnit9 = cWMetricTrackerBuilder4.getFlushUnit();
        // The following exception was thrown during execution in test generation
        try {
            com.bizo.asperatus.tracker.MetricTracker metricTracker10 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(true, (long) (short) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Missing required property: APPLICATION");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "us-east-1" + "'", str6, "us-east-1");
        org.junit.Assert.assertNotNull(aWSCredentialsProvider7);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder8);
        org.junit.Assert.assertNotNull(timeUnit9);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.bizo.asperatus.model.Dimension dimension2 = new com.bizo.asperatus.model.Dimension("Terabytes", "");
        java.lang.String str3 = dimension2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder3 = cWMetricTrackerBuilder0.withRegion("hi!");
        java.lang.String str4 = cWMetricTrackerBuilder3.getStage();
        long long5 = cWMetricTrackerBuilder3.getFlushDelay();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dev" + "'", str4, "dev");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60L + "'", long5 == 60L);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker0 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit3 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics4 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit3);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str8 = dimension7.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray9 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList10 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList10, dimensionArray9);
        inMemoryTracker0.track("Gigabytes", (java.lang.Number) 10.0d, unit3, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList10);
        com.bizo.asperatus.model.Unit unit15 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics16 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit15);
        com.bizo.asperatus.model.Unit unit17 = com.bizo.asperatus.model.Unit.Megabytes;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics18 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit17);
        boolean boolean20 = metricStatistics18.equals((java.lang.Object) (byte) 10);
        float float21 = metricStatistics18.getSum();
        float float22 = metricStatistics18.getSum();
        java.util.concurrent.TimeUnit timeUnit25 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker26 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit25);
        com.bizo.asperatus.model.Dimension dimension31 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray32 = new com.bizo.asperatus.model.Dimension[] { dimension31 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList33 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList33, dimensionArray32);
        metricTracker26.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList33);
        boolean boolean36 = metricStatistics18.equals((java.lang.Object) dimensionList33);
        inMemoryTracker0.track("Microseconds", (java.lang.Number) Double.POSITIVE_INFINITY, unit15, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList33);
        inMemoryTracker0.close();
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit3.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + unit15 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit15.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertTrue("'" + unit17 + "' != '" + com.bizo.asperatus.model.Unit.Megabytes + "'", unit17.equals(com.bizo.asperatus.model.Unit.Megabytes));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(metricTracker26);
        org.junit.Assert.assertNotNull(dimensionArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder4 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder9 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList7);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder10 = machineInfoBuilder4.with((java.util.Collection<java.lang.String>) strList7);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder11 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList7);
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList12 = machineInfoBuilder11.toDimensions();
        com.bizo.asperatus.model.Dimension dimension16 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str17 = dimension16.getValue();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey18 = new com.bizo.asperatus.tracker.impl.MetricKey("Gigabytes", dimension16);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder23 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList21);
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder28 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList26);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder33 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList31);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder34 = machineInfoBuilder28.with((java.util.Collection<java.lang.String>) strList31);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder35 = machineInfoBuilder23.with((java.util.Collection<java.lang.String>) strList31);
        boolean boolean36 = metricKey18.equals((java.lang.Object) machineInfoBuilder35);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder41 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList39);
        java.lang.String[] strArray48 = new java.lang.String[] { "Terabytes", "Microseconds", "Terabytes", "Gigabytes", "Terabytes", "Microseconds" };
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder49 = machineInfoBuilder41.without(strArray48);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder50 = machineInfoBuilder35.with(strArray48);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder51 = com.bizo.asperatus.logging.error.MachineInfo.without(strArray48);
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder56 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList54);
        java.lang.String[] strArray58 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder61 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList59);
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder66 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList64);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder67 = machineInfoBuilder61.with((java.util.Collection<java.lang.String>) strList64);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder68 = machineInfoBuilder56.with((java.util.Collection<java.lang.String>) strList64);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder69 = machineInfoBuilder51.with((java.util.Collection<java.lang.String>) strList64);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder70 = machineInfoBuilder11.with((java.util.Collection<java.lang.String>) strList64);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder9);
        org.junit.Assert.assertNotNull(machineInfoBuilder10);
        org.junit.Assert.assertNotNull(machineInfoBuilder11);
        org.junit.Assert.assertNotNull(dimensionList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder33);
        org.junit.Assert.assertNotNull(machineInfoBuilder34);
        org.junit.Assert.assertNotNull(machineInfoBuilder35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder41);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(machineInfoBuilder49);
        org.junit.Assert.assertNotNull(machineInfoBuilder50);
        org.junit.Assert.assertNotNull(machineInfoBuilder51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder56);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder61);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder66);
        org.junit.Assert.assertNotNull(machineInfoBuilder67);
        org.junit.Assert.assertNotNull(machineInfoBuilder68);
        org.junit.Assert.assertNotNull(machineInfoBuilder69);
        org.junit.Assert.assertNotNull(machineInfoBuilder70);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Megabytes;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        boolean boolean3 = metricStatistics1.equals((java.lang.Object) (byte) 10);
        float float4 = metricStatistics1.getSum();
        float float5 = metricStatistics1.getSum();
        java.util.concurrent.TimeUnit timeUnit8 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker9 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit8);
        com.bizo.asperatus.model.Dimension dimension14 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray15 = new com.bizo.asperatus.model.Dimension[] { dimension14 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList16 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList16, dimensionArray15);
        metricTracker9.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList16);
        boolean boolean19 = metricStatistics1.equals((java.lang.Object) dimensionList16);
        float float20 = metricStatistics1.getSum();
        float float21 = metricStatistics1.getSum();
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Megabytes + "'", unit0.equals(com.bizo.asperatus.model.Unit.Megabytes));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(metricTracker9);
        org.junit.Assert.assertNotNull(dimensionArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Megabytes;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        long long2 = metricStatistics1.getSamples();
        float float3 = metricStatistics1.getSum();
        float float4 = metricStatistics1.getMax();
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Megabytes + "'", unit0.equals(com.bizo.asperatus.model.Unit.Megabytes));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.4E-45f + "'", float4 == 1.4E-45f);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.amazonaws.services.cloudwatch.AmazonCloudWatch amazonCloudWatch0 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker7 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit6);
        com.bizo.asperatus.model.Dimension dimension11 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray12 = new com.bizo.asperatus.model.Dimension[] { dimension11 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList13 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList13, dimensionArray12);
        com.bizo.asperatus.model.CompoundDimension compoundDimension15 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList13);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker16 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService17 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler18 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker7, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList13, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker16, scheduledExecutorService17);
        int int19 = asperatusRateTrackerScheduler18.getFrequency();
        boolean boolean20 = asperatusRateTrackerScheduler18.isStarted();
        asperatusRateTrackerScheduler18.setFrequency(0);
        java.util.concurrent.TimeUnit timeUnit25 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker26 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit25);
        com.bizo.asperatus.model.Dimension dimension30 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray31 = new com.bizo.asperatus.model.Dimension[] { dimension30 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList32 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList32, dimensionArray31);
        com.bizo.asperatus.model.CompoundDimension compoundDimension34 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList32);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker35 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService36 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler37 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker26, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList32, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker35, scheduledExecutorService36);
        int int38 = asperatusRateTrackerScheduler37.getFrequency();
        boolean boolean39 = asperatusRateTrackerScheduler37.isStarted();
        java.util.concurrent.TimeUnit timeUnit40 = asperatusRateTrackerScheduler37.getFrequencyUnit();
        asperatusRateTrackerScheduler18.setFrequencyUnit(timeUnit40);
        // The following exception was thrown during execution in test generation
        try {
            com.bizo.asperatus.tracker.impl.CWMetricTracker cWMetricTracker42 = new com.bizo.asperatus.tracker.impl.CWMetricTracker(amazonCloudWatch0, "CompoundDimension[dimensions=[Dimension[hi!=hi!], Dimension[hi!=hi!], Dimension[hi!=hi!]]]", scheduledExecutorService2, (long) 0, timeUnit40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(metricTracker7);
        org.junit.Assert.assertNotNull(dimensionArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(metricTracker26);
        org.junit.Assert.assertNotNull(dimensionArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(timeUnit40);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Megabytes;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        boolean boolean3 = metricStatistics1.equals((java.lang.Object) (byte) 10);
        float float4 = metricStatistics1.getMin();
        float float5 = metricStatistics1.getMax();
        float float6 = metricStatistics1.getSum();
        float float7 = metricStatistics1.getMin();
        java.lang.Class<?> wildcardClass8 = metricStatistics1.getClass();
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Megabytes + "'", unit0.equals(com.bizo.asperatus.model.Unit.Megabytes));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 3.4028235E38f + "'", float4 == 3.4028235E38f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.4E-45f + "'", float5 == 1.4E-45f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 3.4028235E38f + "'", float7 == 3.4028235E38f);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.bizo.asperatus.model.Dimension dimension2 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray3 = new com.bizo.asperatus.model.Dimension[] { dimension2 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList4 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList4, dimensionArray3);
        com.bizo.asperatus.model.CompoundDimension compoundDimension6 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList4);
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList7 = compoundDimension6.getDimensions();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder8 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str9 = cWMetricTrackerBuilder8.getRegion();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider10 = cWMetricTrackerBuilder8.getCredentialsProvider();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService11 = null;
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder12 = cWMetricTrackerBuilder8.withExecutor(scheduledExecutorService11);
        boolean boolean13 = compoundDimension6.equals((java.lang.Object) cWMetricTrackerBuilder8);
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider14 = null;
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder15 = cWMetricTrackerBuilder8.withCredentialsProvider(aWSCredentialsProvider14);
        org.junit.Assert.assertNotNull(dimensionArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dimensionList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "us-east-1" + "'", str9, "us-east-1");
        org.junit.Assert.assertNotNull(aWSCredentialsProvider10);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder15);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        asperatusRateTrackerScheduler14.setFrequency((int) (byte) 10);
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = cWMetricTrackerBuilder0.getExecutor();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = cWMetricTrackerBuilder0.withStage("Terabytes");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider5 = cWMetricTrackerBuilder4.getCredentialsProvider();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder6 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider7 = null;
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder8 = cWMetricTrackerBuilder6.withCredentialsProvider(aWSCredentialsProvider7);
        java.lang.String str9 = cWMetricTrackerBuilder6.getApplication();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder10 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str11 = cWMetricTrackerBuilder10.getRegion();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService12 = cWMetricTrackerBuilder10.getExecutor();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder14 = cWMetricTrackerBuilder10.withStage("Terabytes");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder16 = cWMetricTrackerBuilder10.withRegion("Gigabytes");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider17 = cWMetricTrackerBuilder16.getCredentialsProvider();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder18 = cWMetricTrackerBuilder6.withCredentialsProvider(aWSCredentialsProvider17);
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder19 = cWMetricTrackerBuilder4.withCredentialsProvider(aWSCredentialsProvider17);
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder21 = cWMetricTrackerBuilder4.withApplication("us-east-1");
        java.lang.String str22 = cWMetricTrackerBuilder4.getStage();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertNull(scheduledExecutorService2);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder4);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider5);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "us-east-1" + "'", str11, "us-east-1");
        org.junit.Assert.assertNull(scheduledExecutorService12);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder14);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder16);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider17);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder18);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder19);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Terabytes" + "'", str22, "Terabytes");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder4 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder9 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList7);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder10 = machineInfoBuilder4.with((java.util.Collection<java.lang.String>) strList7);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder15 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList13);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder20 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList18);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder21 = machineInfoBuilder15.with((java.util.Collection<java.lang.String>) strList18);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder26 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList24);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder31 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList29);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder32 = machineInfoBuilder26.without((java.util.Collection<java.lang.String>) strList29);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder33 = machineInfoBuilder15.without((java.util.Collection<java.lang.String>) strList29);
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder38 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList36);
        java.lang.String[] strArray45 = new java.lang.String[] { "Terabytes", "Microseconds", "Terabytes", "Gigabytes", "Terabytes", "Microseconds" };
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder46 = machineInfoBuilder38.without(strArray45);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder47 = com.bizo.asperatus.logging.error.MachineInfo.with(strArray45);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder48 = machineInfoBuilder33.with(strArray45);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder49 = machineInfoBuilder10.with(strArray45);
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder54 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList52);
        java.lang.String[] strArray56 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder59 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList57);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder60 = machineInfoBuilder54.with((java.util.Collection<java.lang.String>) strList57);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder61 = machineInfoBuilder49.without((java.util.Collection<java.lang.String>) strList57);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder62 = com.bizo.asperatus.logging.error.MachineInfo.without((java.util.Collection<java.lang.String>) strList57);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder9);
        org.junit.Assert.assertNotNull(machineInfoBuilder10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder20);
        org.junit.Assert.assertNotNull(machineInfoBuilder21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder31);
        org.junit.Assert.assertNotNull(machineInfoBuilder32);
        org.junit.Assert.assertNotNull(machineInfoBuilder33);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder38);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(machineInfoBuilder46);
        org.junit.Assert.assertNotNull(machineInfoBuilder47);
        org.junit.Assert.assertNotNull(machineInfoBuilder48);
        org.junit.Assert.assertNotNull(machineInfoBuilder49);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder54);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder59);
        org.junit.Assert.assertNotNull(machineInfoBuilder60);
        org.junit.Assert.assertNotNull(machineInfoBuilder61);
        org.junit.Assert.assertNotNull(machineInfoBuilder62);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider2 = cWMetricTrackerBuilder0.getCredentialsProvider();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService3 = null;
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = cWMetricTrackerBuilder0.withExecutor(scheduledExecutorService3);
        // The following exception was thrown during execution in test generation
        try {
            com.bizo.asperatus.tracker.MetricTracker metricTracker5 = cWMetricTrackerBuilder0.toMetricTracker();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Must set application before constructing.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertNotNull(aWSCredentialsProvider2);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder4);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Megabytes;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        boolean boolean3 = metricStatistics1.equals((java.lang.Object) (byte) 10);
        float float4 = metricStatistics1.getSum();
        java.lang.String str5 = metricStatistics1.toString();
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Megabytes + "'", unit0.equals(com.bizo.asperatus.model.Unit.Megabytes));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MStats[unit:Megabytes,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]" + "'", str5, "MStats[unit:Megabytes,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str4 = dimension3.getValue();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey5 = new com.bizo.asperatus.tracker.impl.MetricKey("Gigabytes", dimension3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder10 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder15 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList13);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder20 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList18);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder21 = machineInfoBuilder15.with((java.util.Collection<java.lang.String>) strList18);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder22 = machineInfoBuilder10.with((java.util.Collection<java.lang.String>) strList18);
        boolean boolean23 = metricKey5.equals((java.lang.Object) machineInfoBuilder22);
        com.bizo.asperatus.model.CompoundDimension compoundDimension24 = metricKey5.getDimension();
        java.lang.String str25 = metricKey5.getMetricName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder20);
        org.junit.Assert.assertNotNull(machineInfoBuilder21);
        org.junit.Assert.assertNotNull(machineInfoBuilder22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(compoundDimension24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Gigabytes" + "'", str25, "Gigabytes");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.bizo.asperatus.model.Unit unit0 = null;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        com.bizo.asperatus.model.Unit unit2 = metricStatistics1.getUnit();
        float float3 = metricStatistics1.getMax();
        org.junit.Assert.assertNull(unit2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.4E-45f + "'", float3 == 1.4E-45f);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        java.lang.String str2 = com.bizo.asperatus.tracker.Env.envOrProperty("Dimension[hi!=hi!]", "Terabytes");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Terabytes" + "'", str2, "Terabytes");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.bizo.asperatus.tracker.Env.envOrProperty("Terabytes");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Missing required property: Terabytes");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker0 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit3 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics4 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit3);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str8 = dimension7.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray9 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList10 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList10, dimensionArray9);
        inMemoryTracker0.track("Gigabytes", (java.lang.Number) 10.0d, unit3, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList10);
        java.util.Map<com.bizo.asperatus.tracker.impl.MetricKey, com.bizo.asperatus.tracker.impl.MetricStatistics> metricKeyMap13 = inMemoryTracker0.reset();
        com.bizo.asperatus.model.Unit unit16 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.model.Dimension dimension19 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension22 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension25 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray26 = new com.bizo.asperatus.model.Dimension[] { dimension19, dimension22, dimension25 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension27 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray26);
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList28 = compoundDimension27.getDimensions();
        com.bizo.asperatus.model.Dimension dimension32 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension35 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension38 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray39 = new com.bizo.asperatus.model.Dimension[] { dimension32, dimension35, dimension38 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension40 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray39);
        com.bizo.asperatus.tracker.impl.MetricKey metricKey41 = new com.bizo.asperatus.tracker.impl.MetricKey("us-east-1", compoundDimension40);
        com.bizo.asperatus.model.CompoundDimension[] compoundDimensionArray42 = new com.bizo.asperatus.model.CompoundDimension[] { compoundDimension27, compoundDimension40 };
        java.util.ArrayList<com.bizo.asperatus.model.CompoundDimension> compoundDimensionList43 = new java.util.ArrayList<com.bizo.asperatus.model.CompoundDimension>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.CompoundDimension>) compoundDimensionList43, compoundDimensionArray42);
        inMemoryTracker0.track("Gigabytes", (java.lang.Number) 10L, unit16, (java.util.Collection<com.bizo.asperatus.model.CompoundDimension>) compoundDimensionList43);
        com.bizo.asperatus.model.Unit unit48 = com.bizo.asperatus.model.Unit.Kilobits;
        com.bizo.asperatus.model.Dimension dimension51 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension54 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension57 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray58 = new com.bizo.asperatus.model.Dimension[] { dimension51, dimension54, dimension57 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension59 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray58);
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList60 = compoundDimension59.getDimensions();
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList61 = compoundDimension59.getDimensions();
        inMemoryTracker0.track("MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]", (java.lang.Number) 10, unit48, dimensionList61);
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder65 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str66 = cWMetricTrackerBuilder65.getRegion();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService67 = cWMetricTrackerBuilder65.getExecutor();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder69 = cWMetricTrackerBuilder65.withStage("Terabytes");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder71 = cWMetricTrackerBuilder65.withRegion("Gigabytes");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder73 = cWMetricTrackerBuilder71.withApplication("");
        com.bizo.asperatus.tracker.MetricTracker metricTracker74 = cWMetricTrackerBuilder71.toMetricTracker();
        com.bizo.asperatus.model.Unit unit77 = com.bizo.asperatus.model.Unit.KilobytesSecond;
        com.bizo.asperatus.model.Dimension dimension80 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray81 = new com.bizo.asperatus.model.Dimension[] { dimension80 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList82 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList82, dimensionArray81);
        com.bizo.asperatus.model.CompoundDimension compoundDimension84 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList82);
        metricTracker74.track("Kilobytes", (java.lang.Number) Double.NaN, unit77, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList82);
        inMemoryTracker0.track("Dimension[us-east-1=hi!]", (java.lang.Number) 100, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList82);
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit3.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(metricKeyMap13);
        org.junit.Assert.assertTrue("'" + unit16 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit16.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertNotNull(dimensionArray26);
        org.junit.Assert.assertNotNull(dimensionList28);
        org.junit.Assert.assertNotNull(dimensionArray39);
        org.junit.Assert.assertNotNull(compoundDimensionArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + unit48 + "' != '" + com.bizo.asperatus.model.Unit.Kilobits + "'", unit48.equals(com.bizo.asperatus.model.Unit.Kilobits));
        org.junit.Assert.assertNotNull(dimensionArray58);
        org.junit.Assert.assertNotNull(dimensionList60);
        org.junit.Assert.assertNotNull(dimensionList61);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "us-east-1" + "'", str66, "us-east-1");
        org.junit.Assert.assertNull(scheduledExecutorService67);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder69);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder71);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder73);
        org.junit.Assert.assertNotNull(metricTracker74);
        org.junit.Assert.assertTrue("'" + unit77 + "' != '" + com.bizo.asperatus.model.Unit.KilobytesSecond + "'", unit77.equals(com.bizo.asperatus.model.Unit.KilobytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str4 = dimension3.getValue();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey5 = new com.bizo.asperatus.tracker.impl.MetricKey("hi!", dimension3);
        java.lang.String str6 = metricKey5.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MetricKey[metricName=hi!,dimension=CompoundDimension[dimensions=[Dimension[hi!=hi!]]]]" + "'", str6, "MetricKey[metricName=hi!,dimension=CompoundDimension[dimensions=[Dimension[hi!=hi!]]]]");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker0 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        double double1 = threadSafeRateTracker0.getRateAndResetPeriod();
        threadSafeRateTracker0.track();
        threadSafeRateTracker0.track();
        double double4 = threadSafeRateTracker0.getRateAndResetPeriod();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = cWMetricTrackerBuilder0.getExecutor();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = cWMetricTrackerBuilder0.withStage("Terabytes");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider5 = cWMetricTrackerBuilder4.getCredentialsProvider();
        long long6 = cWMetricTrackerBuilder4.getFlushDelay();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider7 = cWMetricTrackerBuilder4.getCredentialsProvider();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertNull(scheduledExecutorService2);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder4);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider7);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        int int15 = asperatusRateTrackerScheduler14.getFrequency();
        boolean boolean16 = asperatusRateTrackerScheduler14.isStarted();
        asperatusRateTrackerScheduler14.setFrequency(0);
        java.util.concurrent.TimeUnit timeUnit23 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker24 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit23);
        com.bizo.asperatus.model.Dimension dimension28 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray29 = new com.bizo.asperatus.model.Dimension[] { dimension28 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList30 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList30, dimensionArray29);
        com.bizo.asperatus.model.CompoundDimension compoundDimension32 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList30);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker33 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService34 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler35 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker24, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList30, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker33, scheduledExecutorService34);
        int int36 = asperatusRateTrackerScheduler35.getFrequency();
        boolean boolean37 = asperatusRateTrackerScheduler35.isStarted();
        java.util.concurrent.TimeUnit timeUnit38 = asperatusRateTrackerScheduler35.getFrequencyUnit();
        com.bizo.asperatus.tracker.MetricTracker metricTracker39 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) 1, timeUnit38);
        asperatusRateTrackerScheduler14.setFrequencyUnit(timeUnit38);
        int int41 = asperatusRateTrackerScheduler14.getFrequency();
        int int42 = asperatusRateTrackerScheduler14.getFrequency();
        boolean boolean43 = asperatusRateTrackerScheduler14.isStarted();
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(metricTracker24);
        org.junit.Assert.assertNotNull(dimensionArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(timeUnit38);
        org.junit.Assert.assertNotNull(metricTracker39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        com.bizo.asperatus.model.Unit unit17 = com.bizo.asperatus.model.Unit.Gigabytes;
        java.lang.String str18 = unit17.getValue();
        java.util.Collection<com.bizo.asperatus.model.CompoundDimension> compoundDimensionCollection19 = null;
        metricTracker3.track("CompoundDimension[dimensions=[Dimension[hi!=hi!]]]", (java.lang.Number) (-1), unit17, compoundDimensionCollection19);
        java.util.concurrent.TimeUnit timeUnit24 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker25 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit24);
        com.bizo.asperatus.model.Dimension dimension30 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray31 = new com.bizo.asperatus.model.Dimension[] { dimension30 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList32 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList32, dimensionArray31);
        metricTracker25.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList32);
        com.bizo.asperatus.model.Unit unit37 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension40 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray41 = new com.bizo.asperatus.model.Dimension[] { dimension40 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList42 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList42, dimensionArray41);
        com.bizo.asperatus.model.CompoundDimension compoundDimension44 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList42);
        metricTracker25.track("us-east-1", (java.lang.Number) 10.0f, unit37, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList42);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker46 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService47 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler48 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "Gigabytes", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList42, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker46, scheduledExecutorService47);
        double double49 = threadSafeRateTracker46.getRateAndResetPeriod();
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + unit17 + "' != '" + com.bizo.asperatus.model.Unit.Gigabytes + "'", unit17.equals(com.bizo.asperatus.model.Unit.Gigabytes));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Gigabytes" + "'", str18, "Gigabytes");
        org.junit.Assert.assertNotNull(metricTracker25);
        org.junit.Assert.assertNotNull(dimensionArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + unit37 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit37.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = cWMetricTrackerBuilder0.getExecutor();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = cWMetricTrackerBuilder0.withStage("Terabytes");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder6 = cWMetricTrackerBuilder0.withRegion("Gigabytes");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder8 = cWMetricTrackerBuilder6.withApplication("");
        java.lang.String str9 = cWMetricTrackerBuilder6.getApplication();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder11 = cWMetricTrackerBuilder6.withStage("MetricKey[metricName=,dimension=CompoundDimension[dimensions=[Dimension[hi!=hi!]]]]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertNull(scheduledExecutorService2);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder4);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder6);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder11);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder4 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList2);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder5 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList2);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder10 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList8);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder11 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList8);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder12 = machineInfoBuilder5.without((java.util.Collection<java.lang.String>) strList8);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder4);
        org.junit.Assert.assertNotNull(machineInfoBuilder5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder10);
        org.junit.Assert.assertNotNull(machineInfoBuilder11);
        org.junit.Assert.assertNotNull(machineInfoBuilder12);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        int int15 = asperatusRateTrackerScheduler14.getFrequency();
        boolean boolean16 = asperatusRateTrackerScheduler14.isStarted();
        java.util.concurrent.TimeUnit timeUnit17 = asperatusRateTrackerScheduler14.getFrequencyUnit();
        java.util.concurrent.TimeUnit timeUnit18 = asperatusRateTrackerScheduler14.getFrequencyUnit();
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeUnit17);
        org.junit.Assert.assertNotNull(timeUnit18);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider1 = null;
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder2 = cWMetricTrackerBuilder0.withCredentialsProvider(aWSCredentialsProvider1);
        java.lang.String str3 = cWMetricTrackerBuilder0.getApplication();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str5 = cWMetricTrackerBuilder4.getRegion();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService6 = cWMetricTrackerBuilder4.getExecutor();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder8 = cWMetricTrackerBuilder4.withStage("Terabytes");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder10 = cWMetricTrackerBuilder4.withRegion("Gigabytes");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider11 = cWMetricTrackerBuilder10.getCredentialsProvider();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder12 = cWMetricTrackerBuilder0.withCredentialsProvider(aWSCredentialsProvider11);
        java.lang.String str13 = cWMetricTrackerBuilder12.getRegion();
        long long14 = cWMetricTrackerBuilder12.getFlushDelay();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder16 = cWMetricTrackerBuilder12.withStage("MStats[unit:Megabytes,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]");
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "us-east-1" + "'", str5, "us-east-1");
        org.junit.Assert.assertNull(scheduledExecutorService6);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder8);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder10);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider11);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "us-east-1" + "'", str13, "us-east-1");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder16);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str4 = dimension3.getValue();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey5 = new com.bizo.asperatus.tracker.impl.MetricKey("Gigabytes", dimension3);
        java.lang.String str6 = dimension3.getValue();
        java.lang.String str7 = dimension3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Microseconds;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        float float2 = metricStatistics1.getMin();
        long long3 = metricStatistics1.getSamples();
        metricStatistics1.add((java.lang.Number) Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Microseconds + "'", unit0.equals(com.bizo.asperatus.model.Unit.Microseconds));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.4028235E38f + "'", float2 == 3.4028235E38f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker0 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        double double1 = threadSafeRateTracker0.getRateAndResetPeriod();
        threadSafeRateTracker0.track();
        double double3 = threadSafeRateTracker0.getRateAndResetPeriod();
        threadSafeRateTracker0.track();
        threadSafeRateTracker0.track();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Microseconds;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        float float2 = metricStatistics1.getMin();
        float float3 = metricStatistics1.getMin();
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Microseconds + "'", unit0.equals(com.bizo.asperatus.model.Unit.Microseconds));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.4028235E38f + "'", float2 == 3.4028235E38f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3.4028235E38f + "'", float3 == 3.4028235E38f);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        java.lang.String str2 = cWMetricTrackerBuilder0.getRegion();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = cWMetricTrackerBuilder0.withRegion("Gigabytes");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder6 = cWMetricTrackerBuilder4.withStage("dev");
        java.lang.String str7 = cWMetricTrackerBuilder4.getStage();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService8 = cWMetricTrackerBuilder4.getExecutor();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "us-east-1" + "'", str2, "us-east-1");
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder4);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "dev" + "'", str7, "dev");
        org.junit.Assert.assertNull(scheduledExecutorService8);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder4 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList2);
        java.lang.String[] strArray11 = new java.lang.String[] { "Terabytes", "Microseconds", "Terabytes", "Gigabytes", "Terabytes", "Microseconds" };
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder12 = machineInfoBuilder4.without(strArray11);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder17 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder22 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList20);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder23 = machineInfoBuilder17.with((java.util.Collection<java.lang.String>) strList20);
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder28 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList26);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder33 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList31);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder34 = machineInfoBuilder28.without((java.util.Collection<java.lang.String>) strList31);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder35 = machineInfoBuilder17.without((java.util.Collection<java.lang.String>) strList31);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder36 = machineInfoBuilder12.without((java.util.Collection<java.lang.String>) strList31);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder41 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList39);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder46 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList44);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder47 = machineInfoBuilder41.with((java.util.Collection<java.lang.String>) strList44);
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder52 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList50);
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder57 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList55);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder58 = machineInfoBuilder52.without((java.util.Collection<java.lang.String>) strList55);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder59 = machineInfoBuilder41.without((java.util.Collection<java.lang.String>) strList55);
        java.lang.String[] strArray61 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder64 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList62);
        java.lang.String[] strArray71 = new java.lang.String[] { "Terabytes", "Microseconds", "Terabytes", "Gigabytes", "Terabytes", "Microseconds" };
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder72 = machineInfoBuilder64.without(strArray71);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder73 = com.bizo.asperatus.logging.error.MachineInfo.with(strArray71);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder74 = machineInfoBuilder59.with(strArray71);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder75 = com.bizo.asperatus.logging.error.MachineInfo.with(strArray71);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder76 = machineInfoBuilder36.without(strArray71);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder4);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(machineInfoBuilder12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder22);
        org.junit.Assert.assertNotNull(machineInfoBuilder23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder33);
        org.junit.Assert.assertNotNull(machineInfoBuilder34);
        org.junit.Assert.assertNotNull(machineInfoBuilder35);
        org.junit.Assert.assertNotNull(machineInfoBuilder36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder41);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder46);
        org.junit.Assert.assertNotNull(machineInfoBuilder47);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder52);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder57);
        org.junit.Assert.assertNotNull(machineInfoBuilder58);
        org.junit.Assert.assertNotNull(machineInfoBuilder59);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder64);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(machineInfoBuilder72);
        org.junit.Assert.assertNotNull(machineInfoBuilder73);
        org.junit.Assert.assertNotNull(machineInfoBuilder74);
        org.junit.Assert.assertNotNull(machineInfoBuilder75);
        org.junit.Assert.assertNotNull(machineInfoBuilder76);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder2 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider3 = null;
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = cWMetricTrackerBuilder2.withCredentialsProvider(aWSCredentialsProvider3);
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder6 = cWMetricTrackerBuilder4.withRegion("hi!");
        java.util.concurrent.TimeUnit timeUnit7 = cWMetricTrackerBuilder4.getFlushUnit();
        com.bizo.asperatus.tracker.MetricTracker metricTracker8 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, 100L, timeUnit7);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder4);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder6);
        org.junit.Assert.assertNotNull(timeUnit7);
        org.junit.Assert.assertNotNull(metricTracker8);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker0 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit3 = com.bizo.asperatus.model.Unit.Milliseconds;
        java.util.concurrent.TimeUnit timeUnit6 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker7 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit6);
        com.bizo.asperatus.model.Dimension dimension12 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray13 = new com.bizo.asperatus.model.Dimension[] { dimension12 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList14 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList14, dimensionArray13);
        metricTracker7.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList14);
        com.bizo.asperatus.model.Unit unit19 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension22 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray23 = new com.bizo.asperatus.model.Dimension[] { dimension22 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList24 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList24, dimensionArray23);
        com.bizo.asperatus.model.CompoundDimension compoundDimension26 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList24);
        metricTracker7.track("us-east-1", (java.lang.Number) 10.0f, unit19, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList24);
        com.bizo.asperatus.model.Unit unit30 = com.bizo.asperatus.model.Unit.Terabytes;
        com.bizo.asperatus.model.Dimension dimension33 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension36 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension39 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray40 = new com.bizo.asperatus.model.Dimension[] { dimension33, dimension36, dimension39 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension41 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray40);
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList42 = compoundDimension41.getDimensions();
        com.bizo.asperatus.model.CompoundDimension[] compoundDimensionArray43 = new com.bizo.asperatus.model.CompoundDimension[] { compoundDimension41 };
        java.util.ArrayList<com.bizo.asperatus.model.CompoundDimension> compoundDimensionList44 = new java.util.ArrayList<com.bizo.asperatus.model.CompoundDimension>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.CompoundDimension>) compoundDimensionList44, compoundDimensionArray43);
        metricTracker7.track("Terabytes", (java.lang.Number) 0.0f, unit30, (java.util.Collection<com.bizo.asperatus.model.CompoundDimension>) compoundDimensionList44);
        inMemoryTracker0.track("hi!", (java.lang.Number) (short) 0, unit3, (java.util.Collection<com.bizo.asperatus.model.CompoundDimension>) compoundDimensionList44);
        com.bizo.asperatus.model.Unit unit50 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.SystemOutTracker systemOutTracker51 = new com.bizo.asperatus.tracker.impl.SystemOutTracker();
        java.util.concurrent.TimeUnit timeUnit56 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker57 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit56);
        com.bizo.asperatus.model.Dimension dimension62 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray63 = new com.bizo.asperatus.model.Dimension[] { dimension62 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList64 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList64, dimensionArray63);
        metricTracker57.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList64);
        com.bizo.asperatus.model.Unit unit69 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension72 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray73 = new com.bizo.asperatus.model.Dimension[] { dimension72 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList74 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList74, dimensionArray73);
        com.bizo.asperatus.model.CompoundDimension compoundDimension76 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList74);
        metricTracker57.track("us-east-1", (java.lang.Number) 10.0f, unit69, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList74);
        systemOutTracker51.track("us-east-1", (java.lang.Number) (short) 10, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList74);
        systemOutTracker51.close();
        java.util.concurrent.TimeUnit timeUnit84 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker85 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit84);
        com.bizo.asperatus.model.Dimension dimension89 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray90 = new com.bizo.asperatus.model.Dimension[] { dimension89 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList91 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList91, dimensionArray90);
        com.bizo.asperatus.model.CompoundDimension compoundDimension93 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList91);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker94 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService95 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler96 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker85, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList91, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker94, scheduledExecutorService95);
        systemOutTracker51.track("Milliseconds", (java.lang.Number) (byte) 0, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList91);
        inMemoryTracker0.track("Terabytes", (java.lang.Number) (byte) 100, unit50, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList91);
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics99 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit50);
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + com.bizo.asperatus.model.Unit.Milliseconds + "'", unit3.equals(com.bizo.asperatus.model.Unit.Milliseconds));
        org.junit.Assert.assertNotNull(metricTracker7);
        org.junit.Assert.assertNotNull(dimensionArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + unit19 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit19.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + unit30 + "' != '" + com.bizo.asperatus.model.Unit.Terabytes + "'", unit30.equals(com.bizo.asperatus.model.Unit.Terabytes));
        org.junit.Assert.assertNotNull(dimensionArray40);
        org.junit.Assert.assertNotNull(dimensionList42);
        org.junit.Assert.assertNotNull(compoundDimensionArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + unit50 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit50.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertNotNull(metricTracker57);
        org.junit.Assert.assertNotNull(dimensionArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + unit69 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit69.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(metricTracker85);
        org.junit.Assert.assertNotNull(dimensionArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str4 = dimension3.getValue();
        java.lang.String str5 = dimension3.toString();
        java.lang.String str6 = dimension3.getName();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey7 = new com.bizo.asperatus.tracker.impl.MetricKey("", dimension3);
        java.lang.String str8 = metricKey7.getMetricName();
        com.bizo.asperatus.model.CompoundDimension compoundDimension9 = metricKey7.getDimension();
        java.lang.String str10 = compoundDimension9.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dimension[hi!=hi!]" + "'", str5, "Dimension[hi!=hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(compoundDimension9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CompoundDimension[dimensions=[Dimension[hi!=hi!]]]" + "'", str10, "CompoundDimension[dimensions=[Dimension[hi!=hi!]]]");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Unit unit6 = com.bizo.asperatus.model.Unit.KilobytesSecond;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker10 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit9);
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker12 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit15 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics16 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit15);
        com.bizo.asperatus.model.Dimension dimension19 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str20 = dimension19.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray21 = new com.bizo.asperatus.model.Dimension[] { dimension19 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList22 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList22, dimensionArray21);
        inMemoryTracker12.track("Gigabytes", (java.lang.Number) 10.0d, unit15, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList22);
        java.util.concurrent.TimeUnit timeUnit27 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker28 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit27);
        com.bizo.asperatus.model.Dimension dimension32 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray33 = new com.bizo.asperatus.model.Dimension[] { dimension32 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList34 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList34, dimensionArray33);
        com.bizo.asperatus.model.CompoundDimension compoundDimension36 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList34);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker37 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService38 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler39 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker28, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList34, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker37, scheduledExecutorService38);
        threadSafeRateTracker37.track();
        double double41 = threadSafeRateTracker37.getRateAndResetPeriod();
        double double42 = threadSafeRateTracker37.getRateAndResetPeriod();
        threadSafeRateTracker37.track();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService44 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler45 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker10, "Microseconds", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList22, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker37, scheduledExecutorService44);
        metricTracker10.close();
        com.bizo.asperatus.model.Unit unit49 = com.bizo.asperatus.model.Unit.Kilobytes;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics50 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit49);
        com.bizo.asperatus.model.Dimension dimension53 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension56 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension59 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray60 = new com.bizo.asperatus.model.Dimension[] { dimension53, dimension56, dimension59 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension61 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray60);
        com.bizo.asperatus.model.Dimension dimension64 = new com.bizo.asperatus.model.Dimension("us-east-1", "hi!");
        java.lang.String str65 = dimension64.getName();
        com.bizo.asperatus.model.Dimension dimension68 = new com.bizo.asperatus.model.Dimension("us-east-1", "hi!");
        com.bizo.asperatus.model.Dimension dimension72 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str73 = dimension72.getValue();
        java.lang.String str74 = dimension72.toString();
        java.lang.String str75 = dimension72.getName();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey76 = new com.bizo.asperatus.tracker.impl.MetricKey("", dimension72);
        com.bizo.asperatus.model.Dimension dimension79 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str80 = dimension79.getValue();
        java.lang.String str81 = dimension79.getName();
        com.bizo.asperatus.model.Dimension[] dimensionArray82 = new com.bizo.asperatus.model.Dimension[] { dimension64, dimension68, dimension72, dimension79 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension83 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray82);
        com.bizo.asperatus.model.CompoundDimension[] compoundDimensionArray84 = new com.bizo.asperatus.model.CompoundDimension[] { compoundDimension61, compoundDimension83 };
        java.util.ArrayList<com.bizo.asperatus.model.CompoundDimension> compoundDimensionList85 = new java.util.ArrayList<com.bizo.asperatus.model.CompoundDimension>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.CompoundDimension>) compoundDimensionList85, compoundDimensionArray84);
        metricTracker10.track("CompoundDimension[dimensions=[Dimension[hi!=hi!]]]", (java.lang.Number) 100.0d, unit49, (java.util.Collection<com.bizo.asperatus.model.CompoundDimension>) compoundDimensionList85);
        metricTracker3.track("Dimension[hi!=hi!]", (java.lang.Number) (short) 10, unit6, (java.util.Collection<com.bizo.asperatus.model.CompoundDimension>) compoundDimensionList85);
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertTrue("'" + unit6 + "' != '" + com.bizo.asperatus.model.Unit.KilobytesSecond + "'", unit6.equals(com.bizo.asperatus.model.Unit.KilobytesSecond));
        org.junit.Assert.assertNotNull(metricTracker10);
        org.junit.Assert.assertTrue("'" + unit15 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit15.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(metricTracker28);
        org.junit.Assert.assertNotNull(dimensionArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + Double.POSITIVE_INFINITY + "'", double41 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + unit49 + "' != '" + com.bizo.asperatus.model.Unit.Kilobytes + "'", unit49.equals(com.bizo.asperatus.model.Unit.Kilobytes));
        org.junit.Assert.assertNotNull(dimensionArray60);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "us-east-1" + "'", str65, "us-east-1");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Dimension[hi!=hi!]" + "'", str74, "Dimension[hi!=hi!]");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray82);
        org.junit.Assert.assertNotNull(compoundDimensionArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.bizo.asperatus.tracker.Env.envOrProperty("MStats[unit:Megabytes,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Missing required property: MStats[unit:Megabytes,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.bizo.asperatus.tracker.impl.SystemOutTracker systemOutTracker0 = new com.bizo.asperatus.tracker.impl.SystemOutTracker();
        com.bizo.asperatus.model.Unit unit3 = com.bizo.asperatus.model.Unit.Kilobits;
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder8 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList6);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder13 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList11);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder14 = machineInfoBuilder8.with((java.util.Collection<java.lang.String>) strList11);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder15 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList11);
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList16 = machineInfoBuilder15.toDimensions();
        systemOutTracker0.track("Terabytes", (java.lang.Number) Double.NaN, unit3, dimensionList16);
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + com.bizo.asperatus.model.Unit.Kilobits + "'", unit3.equals(com.bizo.asperatus.model.Unit.Kilobits));
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder13);
        org.junit.Assert.assertNotNull(machineInfoBuilder14);
        org.junit.Assert.assertNotNull(machineInfoBuilder15);
        org.junit.Assert.assertNotNull(dimensionList16);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.bizo.asperatus.model.Dimension dimension2 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str3 = dimension2.getValue();
        java.lang.String str4 = dimension2.toString();
        java.lang.String str5 = dimension2.getName();
        java.lang.String str6 = dimension2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Dimension[hi!=hi!]" + "'", str4, "Dimension[hi!=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Dimension[hi!=hi!]" + "'", str6, "Dimension[hi!=hi!]");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder2 = cWMetricTrackerBuilder0.withApplication("us-east-1");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = cWMetricTrackerBuilder2.withApplication("us-east-1");
        java.util.concurrent.TimeUnit timeUnit8 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker9 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit8);
        com.bizo.asperatus.model.Dimension dimension13 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray14 = new com.bizo.asperatus.model.Dimension[] { dimension13 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList15 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList15, dimensionArray14);
        com.bizo.asperatus.model.CompoundDimension compoundDimension17 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList15);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker18 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService19 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler20 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker9, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList15, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker18, scheduledExecutorService19);
        int int21 = asperatusRateTrackerScheduler20.getFrequency();
        boolean boolean22 = asperatusRateTrackerScheduler20.isStarted();
        asperatusRateTrackerScheduler20.setFrequency(0);
        java.util.concurrent.TimeUnit timeUnit29 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker30 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit29);
        com.bizo.asperatus.model.Dimension dimension34 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray35 = new com.bizo.asperatus.model.Dimension[] { dimension34 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList36 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList36, dimensionArray35);
        com.bizo.asperatus.model.CompoundDimension compoundDimension38 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList36);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker39 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService40 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler41 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker30, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList36, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker39, scheduledExecutorService40);
        int int42 = asperatusRateTrackerScheduler41.getFrequency();
        boolean boolean43 = asperatusRateTrackerScheduler41.isStarted();
        java.util.concurrent.TimeUnit timeUnit44 = asperatusRateTrackerScheduler41.getFrequencyUnit();
        com.bizo.asperatus.tracker.MetricTracker metricTracker45 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) 1, timeUnit44);
        asperatusRateTrackerScheduler20.setFrequencyUnit(timeUnit44);
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder47 = cWMetricTrackerBuilder4.withFlushDelay((long) '4', timeUnit44);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder2);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder4);
        org.junit.Assert.assertNotNull(metricTracker9);
        org.junit.Assert.assertNotNull(dimensionArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(metricTracker30);
        org.junit.Assert.assertNotNull(dimensionArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(timeUnit44);
        org.junit.Assert.assertNotNull(metricTracker45);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder47);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = cWMetricTrackerBuilder0.getExecutor();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = cWMetricTrackerBuilder0.withStage("Terabytes");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder6 = cWMetricTrackerBuilder0.withRegion("Gigabytes");
        long long7 = cWMetricTrackerBuilder6.getFlushDelay();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService8 = null;
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder9 = cWMetricTrackerBuilder6.withExecutor(scheduledExecutorService8);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertNull(scheduledExecutorService2);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder4);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        int int15 = asperatusRateTrackerScheduler14.getFrequency();
        boolean boolean16 = asperatusRateTrackerScheduler14.isStarted();
        asperatusRateTrackerScheduler14.setFrequency((int) '#');
        boolean boolean19 = asperatusRateTrackerScheduler14.isStarted();
        asperatusRateTrackerScheduler14.setFrequency((int) (byte) 1);
        int int22 = asperatusRateTrackerScheduler14.getFrequency();
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        // The following exception was thrown during execution in test generation
        try {
            com.bizo.asperatus.model.Unit unit1 = com.bizo.asperatus.model.Unit.fromValue("Dimension[us-east-1=hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create unit enum from Dimension[us-east-1=hi!] value!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension6 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension9 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray10 = new com.bizo.asperatus.model.Dimension[] { dimension3, dimension6, dimension9 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray10);
        com.bizo.asperatus.model.CompoundDimension compoundDimension12 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray10);
        com.bizo.asperatus.tracker.impl.MetricKey metricKey13 = new com.bizo.asperatus.tracker.impl.MetricKey("Dimension[hi!=hi!]", compoundDimension12);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker14 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        double double15 = threadSafeRateTracker14.getRateAndResetPeriod();
        threadSafeRateTracker14.track();
        threadSafeRateTracker14.track();
        boolean boolean18 = metricKey13.equals((java.lang.Object) threadSafeRateTracker14);
        com.bizo.asperatus.model.CompoundDimension compoundDimension19 = metricKey13.getDimension();
        org.junit.Assert.assertNotNull(dimensionArray10);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(compoundDimension19);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        java.lang.String[] strArray6 = new java.lang.String[] { "MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]", "Kilobits", "CompoundDimension[dimensions=[Dimension[hi!=hi!]]]", "Terabytes", "CompoundDimension[dimensions=[Dimension[hi!=hi!]]]", "Terabytes" };
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder7 = com.bizo.asperatus.logging.error.MachineInfo.with(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(machineInfoBuilder7);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.bizo.asperatus.tracker.impl.SystemOutTracker systemOutTracker0 = new com.bizo.asperatus.tracker.impl.SystemOutTracker();
        java.util.concurrent.TimeUnit timeUnit5 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker6 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit5);
        com.bizo.asperatus.model.Dimension dimension11 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray12 = new com.bizo.asperatus.model.Dimension[] { dimension11 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList13 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList13, dimensionArray12);
        metricTracker6.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList13);
        com.bizo.asperatus.model.Unit unit18 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension21 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray22 = new com.bizo.asperatus.model.Dimension[] { dimension21 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList23 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList23, dimensionArray22);
        com.bizo.asperatus.model.CompoundDimension compoundDimension25 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList23);
        metricTracker6.track("us-east-1", (java.lang.Number) 10.0f, unit18, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList23);
        systemOutTracker0.track("us-east-1", (java.lang.Number) (short) 10, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList23);
        systemOutTracker0.close();
        java.util.concurrent.TimeUnit timeUnit33 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker34 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit33);
        com.bizo.asperatus.model.Dimension dimension38 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray39 = new com.bizo.asperatus.model.Dimension[] { dimension38 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList40 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList40, dimensionArray39);
        com.bizo.asperatus.model.CompoundDimension compoundDimension42 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList40);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker43 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService44 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler45 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker34, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList40, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker43, scheduledExecutorService44);
        systemOutTracker0.track("Milliseconds", (java.lang.Number) (byte) 0, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList40);
        java.util.concurrent.TimeUnit timeUnit51 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker52 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit51);
        com.bizo.asperatus.model.Dimension dimension56 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray57 = new com.bizo.asperatus.model.Dimension[] { dimension56 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList58 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList58, dimensionArray57);
        com.bizo.asperatus.model.CompoundDimension compoundDimension60 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList58);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker61 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService62 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler63 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker52, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList58, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker61, scheduledExecutorService62);
        com.bizo.asperatus.model.Unit unit66 = com.bizo.asperatus.model.Unit.Gigabytes;
        java.lang.String str67 = unit66.getValue();
        java.util.Collection<com.bizo.asperatus.model.CompoundDimension> compoundDimensionCollection68 = null;
        metricTracker52.track("CompoundDimension[dimensions=[Dimension[hi!=hi!]]]", (java.lang.Number) (-1), unit66, compoundDimensionCollection68);
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList70 = com.bizo.asperatus.logging.error.MachineInfo.defaultDimensions;
        systemOutTracker0.track("CompoundDimension[dimensions=[Dimension[hi!=hi!], Dimension[hi!=hi!], Dimension[hi!=hi!]]]", (java.lang.Number) 10.0f, unit66, dimensionList70);
        org.junit.Assert.assertNotNull(metricTracker6);
        org.junit.Assert.assertNotNull(dimensionArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + unit18 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit18.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(metricTracker34);
        org.junit.Assert.assertNotNull(dimensionArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(metricTracker52);
        org.junit.Assert.assertNotNull(dimensionArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + unit66 + "' != '" + com.bizo.asperatus.model.Unit.Gigabytes + "'", unit66.equals(com.bizo.asperatus.model.Unit.Gigabytes));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Gigabytes" + "'", str67, "Gigabytes");
        org.junit.Assert.assertNotNull(dimensionList70);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker0 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit3 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics4 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit3);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str8 = dimension7.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray9 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList10 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList10, dimensionArray9);
        inMemoryTracker0.track("Gigabytes", (java.lang.Number) 10.0d, unit3, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList10);
        com.bizo.asperatus.model.Unit unit15 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics16 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit15);
        com.bizo.asperatus.model.Unit unit17 = com.bizo.asperatus.model.Unit.Megabytes;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics18 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit17);
        boolean boolean20 = metricStatistics18.equals((java.lang.Object) (byte) 10);
        float float21 = metricStatistics18.getSum();
        float float22 = metricStatistics18.getSum();
        java.util.concurrent.TimeUnit timeUnit25 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker26 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit25);
        com.bizo.asperatus.model.Dimension dimension31 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray32 = new com.bizo.asperatus.model.Dimension[] { dimension31 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList33 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList33, dimensionArray32);
        metricTracker26.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList33);
        boolean boolean36 = metricStatistics18.equals((java.lang.Object) dimensionList33);
        inMemoryTracker0.track("Microseconds", (java.lang.Number) Double.POSITIVE_INFINITY, unit15, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList33);
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder43 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList41);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder48 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList46);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder49 = machineInfoBuilder43.without((java.util.Collection<java.lang.String>) strList46);
        java.lang.String[] strArray59 = new java.lang.String[] { "", "CompoundDimension[dimensions=[Dimension[hi!=hi!]]]", "", "Dimension[hi!=hi!]", "Gigabytes", "Gigabytes", "MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]", "MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]", "MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder62 = machineInfoBuilder49.with((java.util.Collection<java.lang.String>) strList60);
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList63 = machineInfoBuilder49.toDimensions();
        java.util.concurrent.TimeUnit timeUnit66 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker67 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit66);
        com.bizo.asperatus.model.Dimension dimension71 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray72 = new com.bizo.asperatus.model.Dimension[] { dimension71 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList73 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList73, dimensionArray72);
        com.bizo.asperatus.model.CompoundDimension compoundDimension75 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList73);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker76 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService77 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler78 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker67, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList73, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker76, scheduledExecutorService77);
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService79 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler80 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler((com.bizo.asperatus.tracker.MetricTracker) inMemoryTracker0, "Dimension[us-east-1=hi!]", dimensionList63, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker76, scheduledExecutorService79);
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit3.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + unit15 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit15.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertTrue("'" + unit17 + "' != '" + com.bizo.asperatus.model.Unit.Megabytes + "'", unit17.equals(com.bizo.asperatus.model.Unit.Megabytes));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(metricTracker26);
        org.junit.Assert.assertNotNull(dimensionArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder43);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder48);
        org.junit.Assert.assertNotNull(machineInfoBuilder49);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder62);
        org.junit.Assert.assertNotNull(dimensionList63);
        org.junit.Assert.assertNotNull(metricTracker67);
        org.junit.Assert.assertNotNull(dimensionArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker0 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        double double1 = threadSafeRateTracker0.getRateAndResetPeriod();
        threadSafeRateTracker0.track();
        threadSafeRateTracker0.track();
        threadSafeRateTracker0.track();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Terabytes;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Terabytes + "'", unit0.equals(com.bizo.asperatus.model.Unit.Terabytes));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker0 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit3 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics4 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit3);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str8 = dimension7.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray9 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList10 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList10, dimensionArray9);
        inMemoryTracker0.track("Gigabytes", (java.lang.Number) 10.0d, unit3, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList10);
        java.util.Map<com.bizo.asperatus.tracker.impl.MetricKey, com.bizo.asperatus.tracker.impl.MetricStatistics> metricKeyMap13 = inMemoryTracker0.reset();
        java.util.Map<com.bizo.asperatus.tracker.impl.MetricKey, com.bizo.asperatus.tracker.impl.MetricStatistics> metricKeyMap14 = inMemoryTracker0.reset();
        java.util.Map<com.bizo.asperatus.tracker.impl.MetricKey, com.bizo.asperatus.tracker.impl.MetricStatistics> metricKeyMap15 = inMemoryTracker0.reset();
        java.util.Map<com.bizo.asperatus.tracker.impl.MetricKey, com.bizo.asperatus.tracker.impl.MetricStatistics> metricKeyMap16 = inMemoryTracker0.reset();
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit3.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(metricKeyMap13);
        org.junit.Assert.assertNotNull(metricKeyMap14);
        org.junit.Assert.assertNotNull(metricKeyMap15);
        org.junit.Assert.assertNotNull(metricKeyMap16);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        boolean boolean15 = asperatusRateTrackerScheduler14.isStarted();
        boolean boolean16 = asperatusRateTrackerScheduler14.isStarted();
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.bizo.asperatus.tracker.impl.SystemOutTracker systemOutTracker0 = new com.bizo.asperatus.tracker.impl.SystemOutTracker();
        java.util.concurrent.TimeUnit timeUnit5 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker6 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit5);
        com.bizo.asperatus.model.Dimension dimension11 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray12 = new com.bizo.asperatus.model.Dimension[] { dimension11 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList13 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList13, dimensionArray12);
        metricTracker6.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList13);
        com.bizo.asperatus.model.Unit unit18 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension21 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray22 = new com.bizo.asperatus.model.Dimension[] { dimension21 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList23 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList23, dimensionArray22);
        com.bizo.asperatus.model.CompoundDimension compoundDimension25 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList23);
        metricTracker6.track("us-east-1", (java.lang.Number) 10.0f, unit18, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList23);
        systemOutTracker0.track("us-east-1", (java.lang.Number) (short) 10, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList23);
        systemOutTracker0.close();
        java.util.concurrent.TimeUnit timeUnit33 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker34 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit33);
        com.bizo.asperatus.model.Dimension dimension38 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray39 = new com.bizo.asperatus.model.Dimension[] { dimension38 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList40 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList40, dimensionArray39);
        com.bizo.asperatus.model.CompoundDimension compoundDimension42 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList40);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker43 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService44 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler45 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker34, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList40, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker43, scheduledExecutorService44);
        systemOutTracker0.track("Milliseconds", (java.lang.Number) (byte) 0, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList40);
        com.bizo.asperatus.model.Unit unit49 = com.bizo.asperatus.model.Unit.Gigabits;
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker50 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit53 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics54 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit53);
        com.bizo.asperatus.model.Dimension dimension57 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str58 = dimension57.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray59 = new com.bizo.asperatus.model.Dimension[] { dimension57 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList60 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList60, dimensionArray59);
        inMemoryTracker50.track("Gigabytes", (java.lang.Number) 10.0d, unit53, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList60);
        systemOutTracker0.track("Microseconds", (java.lang.Number) 0.0f, unit49, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList60);
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker65 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit68 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics69 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit68);
        com.bizo.asperatus.model.Dimension dimension72 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str73 = dimension72.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray74 = new com.bizo.asperatus.model.Dimension[] { dimension72 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList75 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList75, dimensionArray74);
        inMemoryTracker65.track("Gigabytes", (java.lang.Number) 10.0d, unit68, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList75);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker78 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        double double79 = threadSafeRateTracker78.getRateAndResetPeriod();
        threadSafeRateTracker78.track();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService81 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler82 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler((com.bizo.asperatus.tracker.MetricTracker) systemOutTracker0, "Dimension[hi!=hi!]", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList75, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker78, scheduledExecutorService81);
        int int83 = asperatusRateTrackerScheduler82.getFrequency();
        org.junit.Assert.assertNotNull(metricTracker6);
        org.junit.Assert.assertNotNull(dimensionArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + unit18 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit18.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(metricTracker34);
        org.junit.Assert.assertNotNull(dimensionArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + unit49 + "' != '" + com.bizo.asperatus.model.Unit.Gigabits + "'", unit49.equals(com.bizo.asperatus.model.Unit.Gigabits));
        org.junit.Assert.assertTrue("'" + unit53 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit53.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + unit68 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit68.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider2 = cWMetricTrackerBuilder0.getCredentialsProvider();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService3 = cWMetricTrackerBuilder0.getExecutor();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertNotNull(aWSCredentialsProvider2);
        org.junit.Assert.assertNull(scheduledExecutorService3);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider2 = cWMetricTrackerBuilder0.getCredentialsProvider();
        java.lang.String str3 = cWMetricTrackerBuilder0.getApplication();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService4 = cWMetricTrackerBuilder0.getExecutor();
        java.lang.String str5 = cWMetricTrackerBuilder0.getRegion();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertNotNull(aWSCredentialsProvider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(scheduledExecutorService4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "us-east-1" + "'", str5, "us-east-1");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Microseconds;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        float float2 = metricStatistics1.getMax();
        long long3 = metricStatistics1.getSamples();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str5 = cWMetricTrackerBuilder4.getRegion();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService6 = cWMetricTrackerBuilder4.getExecutor();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder8 = cWMetricTrackerBuilder4.withStage("Terabytes");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService9 = cWMetricTrackerBuilder4.getExecutor();
        java.lang.String str10 = cWMetricTrackerBuilder4.getApplication();
        boolean boolean11 = metricStatistics1.equals((java.lang.Object) str10);
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Microseconds + "'", unit0.equals(com.bizo.asperatus.model.Unit.Microseconds));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "us-east-1" + "'", str5, "us-east-1");
        org.junit.Assert.assertNull(scheduledExecutorService6);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder8);
        org.junit.Assert.assertNull(scheduledExecutorService9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.bizo.asperatus.model.Dimension dimension4 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str5 = dimension4.getValue();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey6 = new com.bizo.asperatus.tracker.impl.MetricKey("Gigabytes", dimension4);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker10 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) (short) 10, timeUnit9);
        boolean boolean11 = metricKey6.equals((java.lang.Object) metricTracker10);
        java.lang.String str12 = metricKey6.getMetricName();
        com.bizo.asperatus.model.CompoundDimension compoundDimension13 = metricKey6.getDimension();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey14 = new com.bizo.asperatus.tracker.impl.MetricKey("Kilobytes", compoundDimension13);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(metricTracker10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Gigabytes" + "'", str12, "Gigabytes");
        org.junit.Assert.assertNotNull(compoundDimension13);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        java.lang.String str2 = com.bizo.asperatus.tracker.Env.envOrProperty("Milliseconds", "MetricKey[metricName=,dimension=CompoundDimension[dimensions=[Dimension[hi!=hi!]]]]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MetricKey[metricName=,dimension=CompoundDimension[dimensions=[Dimension[hi!=hi!]]]]" + "'", str2, "MetricKey[metricName=,dimension=CompoundDimension[dimensions=[Dimension[hi!=hi!]]]]");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker0 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        double double1 = threadSafeRateTracker0.getRateAndResetPeriod();
        double double2 = threadSafeRateTracker0.getRateAndResetPeriod();
        double double3 = threadSafeRateTracker0.getRateAndResetPeriod();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker0 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit3 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics4 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit3);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str8 = dimension7.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray9 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList10 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList10, dimensionArray9);
        inMemoryTracker0.track("Gigabytes", (java.lang.Number) 10.0d, unit3, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList10);
        java.util.Map<com.bizo.asperatus.tracker.impl.MetricKey, com.bizo.asperatus.tracker.impl.MetricStatistics> metricKeyMap13 = inMemoryTracker0.reset();
        inMemoryTracker0.close();
        java.util.Map<com.bizo.asperatus.tracker.impl.MetricKey, com.bizo.asperatus.tracker.impl.MetricStatistics> metricKeyMap15 = inMemoryTracker0.reset();
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit3.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(metricKeyMap13);
        org.junit.Assert.assertNotNull(metricKeyMap15);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        java.lang.String str2 = com.bizo.asperatus.tracker.Env.envOrProperty("Dimension[us-east-1=hi!]", "MetricKey[metricName=hi!,dimension=CompoundDimension[dimensions=[Dimension[hi!=hi!]]]]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MetricKey[metricName=hi!,dimension=CompoundDimension[dimensions=[Dimension[hi!=hi!]]]]" + "'", str2, "MetricKey[metricName=hi!,dimension=CompoundDimension[dimensions=[Dimension[hi!=hi!]]]]");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str4 = dimension3.getValue();
        java.lang.String str5 = dimension3.toString();
        java.lang.String str6 = dimension3.getName();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker10 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit9);
        com.bizo.asperatus.model.Dimension dimension14 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray15 = new com.bizo.asperatus.model.Dimension[] { dimension14 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList16 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList16, dimensionArray15);
        com.bizo.asperatus.model.CompoundDimension compoundDimension18 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList16);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker19 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService20 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler21 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker10, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList16, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker19, scheduledExecutorService20);
        com.bizo.asperatus.model.Unit unit24 = com.bizo.asperatus.model.Unit.Count;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker28 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit27);
        com.bizo.asperatus.model.Dimension dimension33 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray34 = new com.bizo.asperatus.model.Dimension[] { dimension33 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList35 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList35, dimensionArray34);
        metricTracker28.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList35);
        java.util.concurrent.TimeUnit timeUnit42 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker43 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit42);
        com.bizo.asperatus.model.Dimension dimension48 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray49 = new com.bizo.asperatus.model.Dimension[] { dimension48 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList50 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList50, dimensionArray49);
        metricTracker43.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList50);
        com.bizo.asperatus.model.Unit unit55 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension58 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray59 = new com.bizo.asperatus.model.Dimension[] { dimension58 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList60 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList60, dimensionArray59);
        com.bizo.asperatus.model.CompoundDimension compoundDimension62 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList60);
        metricTracker43.track("us-east-1", (java.lang.Number) 10.0f, unit55, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList60);
        metricTracker28.track("Dimension[hi!=hi!]", (java.lang.Number) (short) 1, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList60);
        metricTracker10.track("Terabytes", (java.lang.Number) 100.0d, unit24, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList60);
        boolean boolean66 = dimension3.equals((java.lang.Object) dimensionList60);
        com.bizo.asperatus.tracker.impl.MetricKey metricKey67 = new com.bizo.asperatus.tracker.impl.MetricKey("Microseconds", dimension3);
        com.bizo.asperatus.model.Unit unit68 = com.bizo.asperatus.model.Unit.Kilobytes;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics69 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit68);
        java.lang.String str70 = unit68.getValue();
        boolean boolean71 = metricKey67.equals((java.lang.Object) unit68);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dimension[hi!=hi!]" + "'", str5, "Dimension[hi!=hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(metricTracker10);
        org.junit.Assert.assertNotNull(dimensionArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + unit24 + "' != '" + com.bizo.asperatus.model.Unit.Count + "'", unit24.equals(com.bizo.asperatus.model.Unit.Count));
        org.junit.Assert.assertNotNull(metricTracker28);
        org.junit.Assert.assertNotNull(dimensionArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(metricTracker43);
        org.junit.Assert.assertNotNull(dimensionArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + unit55 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit55.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + unit68 + "' != '" + com.bizo.asperatus.model.Unit.Kilobytes + "'", unit68.equals(com.bizo.asperatus.model.Unit.Kilobytes));
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Kilobytes" + "'", str70, "Kilobytes");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        com.bizo.asperatus.model.Dimension dimension2 = new com.bizo.asperatus.model.Dimension("us-east-1", "hi!");
        java.lang.String str3 = dimension2.getName();
        com.bizo.asperatus.model.Dimension dimension6 = new com.bizo.asperatus.model.Dimension("us-east-1", "hi!");
        com.bizo.asperatus.model.Dimension dimension10 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str11 = dimension10.getValue();
        java.lang.String str12 = dimension10.toString();
        java.lang.String str13 = dimension10.getName();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey14 = new com.bizo.asperatus.tracker.impl.MetricKey("", dimension10);
        com.bizo.asperatus.model.Dimension dimension17 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str18 = dimension17.getValue();
        java.lang.String str19 = dimension17.getName();
        com.bizo.asperatus.model.Dimension[] dimensionArray20 = new com.bizo.asperatus.model.Dimension[] { dimension2, dimension6, dimension10, dimension17 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension21 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray20);
        com.bizo.asperatus.model.CompoundDimension compoundDimension22 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray20);
        com.bizo.asperatus.model.CompoundDimension compoundDimension23 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray20);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us-east-1" + "'", str3, "us-east-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dimension[hi!=hi!]" + "'", str12, "Dimension[hi!=hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray20);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.bizo.asperatus.model.Dimension dimension4 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray5 = new com.bizo.asperatus.model.Dimension[] { dimension4 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList6 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList6, dimensionArray5);
        com.bizo.asperatus.model.CompoundDimension compoundDimension8 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList6);
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList9 = compoundDimension8.getDimensions();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey10 = new com.bizo.asperatus.tracker.impl.MetricKey("hi!", compoundDimension8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = metricKey10.getDimension();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey12 = new com.bizo.asperatus.tracker.impl.MetricKey("MetricKey[metricName=hi!,dimension=CompoundDimension[dimensions=[Dimension[hi!=hi!]]]]", compoundDimension11);
        org.junit.Assert.assertNotNull(dimensionArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dimensionList9);
        org.junit.Assert.assertNotNull(compoundDimension11);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.bizo.asperatus.model.Dimension dimension2 = new com.bizo.asperatus.model.Dimension("", "MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]");
        java.lang.String str3 = dimension2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]" + "'", str3, "MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("hi!", "us-east-1");
        com.bizo.asperatus.tracker.impl.MetricKey metricKey4 = new com.bizo.asperatus.tracker.impl.MetricKey("", dimension3);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Microseconds;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        float float2 = metricStatistics1.getMin();
        long long3 = metricStatistics1.getSamples();
        java.lang.String str4 = metricStatistics1.toString();
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Microseconds + "'", unit0.equals(com.bizo.asperatus.model.Unit.Microseconds));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.4028235E38f + "'", float2 == 3.4028235E38f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]" + "'", str4, "MStats[unit:Microseconds,samples=0,sum=0.00,min=340282346638528860000000000000000000000.00,max=0.00]");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        com.bizo.asperatus.model.Unit unit0 = com.bizo.asperatus.model.Unit.Microseconds;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics1 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit0);
        float float2 = metricStatistics1.getMin();
        long long3 = metricStatistics1.getSamples();
        float float4 = metricStatistics1.getSum();
        long long5 = metricStatistics1.getSamples();
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.bizo.asperatus.model.Unit.Microseconds + "'", unit0.equals(com.bizo.asperatus.model.Unit.Microseconds));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.4028235E38f + "'", float2 == 3.4028235E38f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("Terabytes", "");
        com.bizo.asperatus.model.Dimension dimension6 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str7 = dimension6.getValue();
        java.lang.String str8 = dimension6.toString();
        java.lang.String str9 = dimension6.getName();
        java.util.concurrent.TimeUnit timeUnit12 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker13 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit12);
        com.bizo.asperatus.model.Dimension dimension17 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray18 = new com.bizo.asperatus.model.Dimension[] { dimension17 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList19 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList19, dimensionArray18);
        com.bizo.asperatus.model.CompoundDimension compoundDimension21 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList19);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker22 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService23 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler24 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker13, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList19, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker22, scheduledExecutorService23);
        com.bizo.asperatus.model.Unit unit27 = com.bizo.asperatus.model.Unit.Count;
        java.util.concurrent.TimeUnit timeUnit30 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker31 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit30);
        com.bizo.asperatus.model.Dimension dimension36 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray37 = new com.bizo.asperatus.model.Dimension[] { dimension36 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList38 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList38, dimensionArray37);
        metricTracker31.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList38);
        java.util.concurrent.TimeUnit timeUnit45 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker46 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit45);
        com.bizo.asperatus.model.Dimension dimension51 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray52 = new com.bizo.asperatus.model.Dimension[] { dimension51 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList53 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList53, dimensionArray52);
        metricTracker46.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList53);
        com.bizo.asperatus.model.Unit unit58 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension61 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray62 = new com.bizo.asperatus.model.Dimension[] { dimension61 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList63 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList63, dimensionArray62);
        com.bizo.asperatus.model.CompoundDimension compoundDimension65 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList63);
        metricTracker46.track("us-east-1", (java.lang.Number) 10.0f, unit58, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList63);
        metricTracker31.track("Dimension[hi!=hi!]", (java.lang.Number) (short) 1, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList63);
        metricTracker13.track("Terabytes", (java.lang.Number) 100.0d, unit27, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList63);
        boolean boolean69 = dimension6.equals((java.lang.Object) dimensionList63);
        java.lang.String str70 = dimension6.toString();
        com.bizo.asperatus.model.Dimension dimension74 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str75 = dimension74.getValue();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey76 = new com.bizo.asperatus.tracker.impl.MetricKey("Gigabytes", dimension74);
        java.lang.String str77 = dimension74.toString();
        com.bizo.asperatus.model.Dimension[] dimensionArray78 = new com.bizo.asperatus.model.Dimension[] { dimension3, dimension6, dimension74 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension79 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray78);
        com.bizo.asperatus.tracker.impl.MetricKey metricKey80 = new com.bizo.asperatus.tracker.impl.MetricKey("", compoundDimension79);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Dimension[hi!=hi!]" + "'", str8, "Dimension[hi!=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(metricTracker13);
        org.junit.Assert.assertNotNull(dimensionArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + unit27 + "' != '" + com.bizo.asperatus.model.Unit.Count + "'", unit27.equals(com.bizo.asperatus.model.Unit.Count));
        org.junit.Assert.assertNotNull(metricTracker31);
        org.junit.Assert.assertNotNull(dimensionArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(metricTracker46);
        org.junit.Assert.assertNotNull(dimensionArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + unit58 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit58.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Dimension[hi!=hi!]" + "'", str70, "Dimension[hi!=hi!]");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Dimension[hi!=hi!]" + "'", str77, "Dimension[hi!=hi!]");
        org.junit.Assert.assertNotNull(dimensionArray78);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        int int15 = asperatusRateTrackerScheduler14.getFrequency();
        boolean boolean16 = asperatusRateTrackerScheduler14.isStarted();
        asperatusRateTrackerScheduler14.setFrequency(0);
        java.util.concurrent.TimeUnit timeUnit23 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker24 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit23);
        com.bizo.asperatus.model.Dimension dimension28 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray29 = new com.bizo.asperatus.model.Dimension[] { dimension28 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList30 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList30, dimensionArray29);
        com.bizo.asperatus.model.CompoundDimension compoundDimension32 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList30);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker33 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService34 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler35 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker24, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList30, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker33, scheduledExecutorService34);
        int int36 = asperatusRateTrackerScheduler35.getFrequency();
        boolean boolean37 = asperatusRateTrackerScheduler35.isStarted();
        java.util.concurrent.TimeUnit timeUnit38 = asperatusRateTrackerScheduler35.getFrequencyUnit();
        com.bizo.asperatus.tracker.MetricTracker metricTracker39 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) 1, timeUnit38);
        asperatusRateTrackerScheduler14.setFrequencyUnit(timeUnit38);
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder41 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider42 = null;
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder43 = cWMetricTrackerBuilder41.withCredentialsProvider(aWSCredentialsProvider42);
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder45 = cWMetricTrackerBuilder43.withRegion("hi!");
        java.util.concurrent.TimeUnit timeUnit46 = cWMetricTrackerBuilder43.getFlushUnit();
        asperatusRateTrackerScheduler14.setFrequencyUnit(timeUnit46);
        int int48 = asperatusRateTrackerScheduler14.getFrequency();
        asperatusRateTrackerScheduler14.setFrequency(1);
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder51 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str52 = cWMetricTrackerBuilder51.getRegion();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService53 = cWMetricTrackerBuilder51.getExecutor();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder55 = cWMetricTrackerBuilder51.withStage("Terabytes");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider56 = cWMetricTrackerBuilder55.getCredentialsProvider();
        long long57 = cWMetricTrackerBuilder55.getFlushDelay();
        java.util.concurrent.TimeUnit timeUnit58 = cWMetricTrackerBuilder55.getFlushUnit();
        asperatusRateTrackerScheduler14.setFrequencyUnit(timeUnit58);
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(metricTracker24);
        org.junit.Assert.assertNotNull(dimensionArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(timeUnit38);
        org.junit.Assert.assertNotNull(metricTracker39);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder43);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder45);
        org.junit.Assert.assertNotNull(timeUnit46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "us-east-1" + "'", str52, "us-east-1");
        org.junit.Assert.assertNull(scheduledExecutorService53);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder55);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 60L + "'", long57 == 60L);
        org.junit.Assert.assertNotNull(timeUnit58);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder3 = cWMetricTrackerBuilder0.withRegion("hi!");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider4 = cWMetricTrackerBuilder3.getCredentialsProvider();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder3);
        org.junit.Assert.assertNotNull(aWSCredentialsProvider4);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str4 = dimension3.getValue();
        java.lang.String str5 = dimension3.toString();
        java.lang.String str6 = dimension3.getName();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker10 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit9);
        com.bizo.asperatus.model.Dimension dimension14 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray15 = new com.bizo.asperatus.model.Dimension[] { dimension14 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList16 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList16, dimensionArray15);
        com.bizo.asperatus.model.CompoundDimension compoundDimension18 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList16);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker19 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService20 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler21 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker10, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList16, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker19, scheduledExecutorService20);
        com.bizo.asperatus.model.Unit unit24 = com.bizo.asperatus.model.Unit.Count;
        java.util.concurrent.TimeUnit timeUnit27 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker28 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit27);
        com.bizo.asperatus.model.Dimension dimension33 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray34 = new com.bizo.asperatus.model.Dimension[] { dimension33 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList35 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList35, dimensionArray34);
        metricTracker28.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList35);
        java.util.concurrent.TimeUnit timeUnit42 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker43 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit42);
        com.bizo.asperatus.model.Dimension dimension48 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray49 = new com.bizo.asperatus.model.Dimension[] { dimension48 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList50 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList50, dimensionArray49);
        metricTracker43.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList50);
        com.bizo.asperatus.model.Unit unit55 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension58 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray59 = new com.bizo.asperatus.model.Dimension[] { dimension58 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList60 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList60, dimensionArray59);
        com.bizo.asperatus.model.CompoundDimension compoundDimension62 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList60);
        metricTracker43.track("us-east-1", (java.lang.Number) 10.0f, unit55, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList60);
        metricTracker28.track("Dimension[hi!=hi!]", (java.lang.Number) (short) 1, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList60);
        metricTracker10.track("Terabytes", (java.lang.Number) 100.0d, unit24, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList60);
        boolean boolean66 = dimension3.equals((java.lang.Object) dimensionList60);
        com.bizo.asperatus.tracker.impl.MetricKey metricKey67 = new com.bizo.asperatus.tracker.impl.MetricKey("Terabytes", dimension3);
        com.bizo.asperatus.model.CompoundDimension compoundDimension68 = metricKey67.getDimension();
        com.bizo.asperatus.model.CompoundDimension compoundDimension69 = metricKey67.getDimension();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dimension[hi!=hi!]" + "'", str5, "Dimension[hi!=hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(metricTracker10);
        org.junit.Assert.assertNotNull(dimensionArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + unit24 + "' != '" + com.bizo.asperatus.model.Unit.Count + "'", unit24.equals(com.bizo.asperatus.model.Unit.Count));
        org.junit.Assert.assertNotNull(metricTracker28);
        org.junit.Assert.assertNotNull(dimensionArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(metricTracker43);
        org.junit.Assert.assertNotNull(dimensionArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + unit55 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit55.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(compoundDimension68);
        org.junit.Assert.assertNotNull(compoundDimension69);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        java.lang.String str2 = cWMetricTrackerBuilder0.getRegion();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder4 = cWMetricTrackerBuilder0.withRegion("Gigabytes");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder6 = cWMetricTrackerBuilder4.withStage("dev");
        java.lang.String str7 = cWMetricTrackerBuilder6.getApplication();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "us-east-1" + "'", str2, "us-east-1");
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder4);
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.bizo.asperatus.model.Dimension dimension3 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str4 = dimension3.getValue();
        com.bizo.asperatus.tracker.impl.MetricKey metricKey5 = new com.bizo.asperatus.tracker.impl.MetricKey("Gigabytes", dimension3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder10 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder15 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList13);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder20 = com.bizo.asperatus.logging.error.MachineInfo.with((java.util.Collection<java.lang.String>) strList18);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder21 = machineInfoBuilder15.with((java.util.Collection<java.lang.String>) strList18);
        com.bizo.asperatus.logging.error.MachineInfo.MachineInfoBuilder machineInfoBuilder22 = machineInfoBuilder10.with((java.util.Collection<java.lang.String>) strList18);
        boolean boolean23 = metricKey5.equals((java.lang.Object) machineInfoBuilder22);
        java.lang.String str24 = metricKey5.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(machineInfoBuilder20);
        org.junit.Assert.assertNotNull(machineInfoBuilder21);
        org.junit.Assert.assertNotNull(machineInfoBuilder22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "MetricKey[metricName=Gigabytes,dimension=CompoundDimension[dimensions=[Dimension[hi!=hi!]]]]" + "'", str24, "MetricKey[metricName=Gigabytes,dimension=CompoundDimension[dimensions=[Dimension[hi!=hi!]]]]");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker inMemoryTracker0 = new com.bizo.asperatus.tracker.impl.buffer.InMemoryTracker();
        com.bizo.asperatus.model.Unit unit3 = com.bizo.asperatus.model.Unit.TerabitsSecond;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics4 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit3);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        java.lang.String str8 = dimension7.getValue();
        com.bizo.asperatus.model.Dimension[] dimensionArray9 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList10 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList10, dimensionArray9);
        inMemoryTracker0.track("Gigabytes", (java.lang.Number) 10.0d, unit3, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList10);
        java.util.Map<com.bizo.asperatus.tracker.impl.MetricKey, com.bizo.asperatus.tracker.impl.MetricStatistics> metricKeyMap13 = inMemoryTracker0.reset();
        com.bizo.asperatus.model.Unit unit16 = com.bizo.asperatus.model.Unit.Kilobytes;
        com.bizo.asperatus.tracker.impl.MetricStatistics metricStatistics17 = new com.bizo.asperatus.tracker.impl.MetricStatistics(unit16);
        java.lang.String str18 = unit16.getValue();
        java.util.concurrent.TimeUnit timeUnit21 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker22 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit21);
        com.bizo.asperatus.model.Dimension dimension27 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray28 = new com.bizo.asperatus.model.Dimension[] { dimension27 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList29 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList29, dimensionArray28);
        metricTracker22.track("", (java.lang.Number) 0.0f, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList29);
        com.bizo.asperatus.model.Unit unit34 = com.bizo.asperatus.model.Unit.MegabytesSecond;
        com.bizo.asperatus.model.Dimension dimension37 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray38 = new com.bizo.asperatus.model.Dimension[] { dimension37 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList39 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList39, dimensionArray38);
        com.bizo.asperatus.model.CompoundDimension compoundDimension41 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList39);
        metricTracker22.track("us-east-1", (java.lang.Number) 10.0f, unit34, (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList39);
        com.bizo.asperatus.model.Unit unit45 = com.bizo.asperatus.model.Unit.Terabytes;
        com.bizo.asperatus.model.Dimension dimension48 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension51 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension dimension54 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray55 = new com.bizo.asperatus.model.Dimension[] { dimension48, dimension51, dimension54 };
        com.bizo.asperatus.model.CompoundDimension compoundDimension56 = new com.bizo.asperatus.model.CompoundDimension(dimensionArray55);
        java.util.List<com.bizo.asperatus.model.Dimension> dimensionList57 = compoundDimension56.getDimensions();
        com.bizo.asperatus.model.CompoundDimension[] compoundDimensionArray58 = new com.bizo.asperatus.model.CompoundDimension[] { compoundDimension56 };
        java.util.ArrayList<com.bizo.asperatus.model.CompoundDimension> compoundDimensionList59 = new java.util.ArrayList<com.bizo.asperatus.model.CompoundDimension>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.CompoundDimension>) compoundDimensionList59, compoundDimensionArray58);
        metricTracker22.track("Terabytes", (java.lang.Number) 0.0f, unit45, (java.util.Collection<com.bizo.asperatus.model.CompoundDimension>) compoundDimensionList59);
        inMemoryTracker0.track("Kilobytes", (java.lang.Number) 0L, unit16, (java.util.Collection<com.bizo.asperatus.model.CompoundDimension>) compoundDimensionList59);
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + com.bizo.asperatus.model.Unit.TerabitsSecond + "'", unit3.equals(com.bizo.asperatus.model.Unit.TerabitsSecond));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(dimensionArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(metricKeyMap13);
        org.junit.Assert.assertTrue("'" + unit16 + "' != '" + com.bizo.asperatus.model.Unit.Kilobytes + "'", unit16.equals(com.bizo.asperatus.model.Unit.Kilobytes));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Kilobytes" + "'", str18, "Kilobytes");
        org.junit.Assert.assertNotNull(metricTracker22);
        org.junit.Assert.assertNotNull(dimensionArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + unit34 + "' != '" + com.bizo.asperatus.model.Unit.MegabytesSecond + "'", unit34.equals(com.bizo.asperatus.model.Unit.MegabytesSecond));
        org.junit.Assert.assertNotNull(dimensionArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + unit45 + "' != '" + com.bizo.asperatus.model.Unit.Terabytes + "'", unit45.equals(com.bizo.asperatus.model.Unit.Terabytes));
        org.junit.Assert.assertNotNull(dimensionArray55);
        org.junit.Assert.assertNotNull(dimensionList57);
        org.junit.Assert.assertNotNull(compoundDimensionArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder0 = new com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder();
        java.lang.String str1 = cWMetricTrackerBuilder0.getRegion();
        com.bizo.asperatus.tracker.impl.CWMetricTrackerBuilder cWMetricTrackerBuilder3 = cWMetricTrackerBuilder0.withRegion("hi!");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService4 = cWMetricTrackerBuilder0.getExecutor();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us-east-1" + "'", str1, "us-east-1");
        org.junit.Assert.assertNotNull(cWMetricTrackerBuilder3);
        org.junit.Assert.assertNull(scheduledExecutorService4);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.bizo.asperatus.tracker.Env.envOrProperty("MetricKey[metricName=Gigabytes,dimension=CompoundDimension[dimensions=[Dimension[hi!=hi!]]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Missing required property: MetricKey[metricName=Gigabytes,dimension=CompoundDimension[dimensions=[Dimension[hi!=hi!]]]]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        java.util.concurrent.TimeUnit timeUnit2 = null;
        com.bizo.asperatus.tracker.MetricTracker metricTracker3 = com.bizo.asperatus.tracker.MetricTrackerFactory.forApplication(false, (long) '4', timeUnit2);
        com.bizo.asperatus.model.Dimension dimension7 = new com.bizo.asperatus.model.Dimension("hi!", "hi!");
        com.bizo.asperatus.model.Dimension[] dimensionArray8 = new com.bizo.asperatus.model.Dimension[] { dimension7 };
        java.util.ArrayList<com.bizo.asperatus.model.Dimension> dimensionList9 = new java.util.ArrayList<com.bizo.asperatus.model.Dimension>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.bizo.asperatus.model.Dimension>) dimensionList9, dimensionArray8);
        com.bizo.asperatus.model.CompoundDimension compoundDimension11 = new com.bizo.asperatus.model.CompoundDimension((java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9);
        com.bizo.asperatus.rates.ThreadSafeRateTracker threadSafeRateTracker12 = new com.bizo.asperatus.rates.ThreadSafeRateTracker();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        com.bizo.asperatus.rates.AsperatusRateTrackerScheduler asperatusRateTrackerScheduler14 = new com.bizo.asperatus.rates.AsperatusRateTrackerScheduler(metricTracker3, "hi!", (java.util.List<com.bizo.asperatus.model.Dimension>) dimensionList9, (com.bizo.asperatus.rates.RateTracker) threadSafeRateTracker12, scheduledExecutorService13);
        int int15 = asperatusRateTrackerScheduler14.getFrequency();
        boolean boolean16 = asperatusRateTrackerScheduler14.isStarted();
        asperatusRateTrackerScheduler14.setFrequency(0);
        boolean boolean19 = asperatusRateTrackerScheduler14.isStarted();
        boolean boolean20 = asperatusRateTrackerScheduler14.isStarted();
        asperatusRateTrackerScheduler14.setFrequency(100);
        org.junit.Assert.assertNotNull(metricTracker3);
        org.junit.Assert.assertNotNull(dimensionArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }
}

