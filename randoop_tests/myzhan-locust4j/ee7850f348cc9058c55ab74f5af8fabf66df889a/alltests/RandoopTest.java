package flaky; 

import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class RandoopTest{


    public static boolean debug = false;



    @Test

    public void test001() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test001");

        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 10 };

        // The following exception was thrown during execution in test generation

        try {

            com.github.myzhan.locust4j.message.Message message3 = new com.github.myzhan.locust4j.message.Message(byteArray2);

            org.junit.Assert.fail("Expected exception of type org.msgpack.core.MessageTypeException; message: Expected Array, but got Integer (ff)");

        } catch (org.msgpack.core.MessageTypeException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray2);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 10]");

    }



    @Test

    public void test002() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test002");

        java.lang.String str2 = com.github.myzhan.locust4j.utils.Utils.getSystemEnvWithDefault("", "hi!");

        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");

    }



    @Test

    public void test003() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test003");

        com.github.myzhan.locust4j.runtime.RunnerState runnerState0 = com.github.myzhan.locust4j.runtime.RunnerState.Ready;

        org.junit.Assert.assertTrue("'" + runnerState0 + "' != '" + com.github.myzhan.locust4j.runtime.RunnerState.Ready + "'", runnerState0.equals(com.github.myzhan.locust4j.runtime.RunnerState.Ready));

    }



    @Test

    public void test004() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test004");

        java.lang.String str2 = com.github.myzhan.locust4j.utils.Utils.getSystemEnvWithDefault("hi!", "hi!");

        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");

    }



    @Test

    public void test005() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test005");

        long long2 = com.github.myzhan.locust4j.utils.Utils.round(100L, (int) (byte) 100);

        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);

    }



    @Test

    public void test006() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test006");

        long long0 = com.github.myzhan.locust4j.utils.Utils.currentTimeInSeconds();

// flaky:         org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1700469865L + "'", long0 == 1700469865L);

    }



    @Test

    public void test007() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test007");

        com.github.myzhan.locust4j.utils.Utils utils0 = new com.github.myzhan.locust4j.utils.Utils();

    }



    @Test

    public void test008() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test008");

        com.github.myzhan.locust4j.Locust locust0 = com.github.myzhan.locust4j.Locust.getInstance();

        locust0.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust0.setMasterPort((int) (short) -1);

        java.lang.Class<?> wildcardClass8 = locust0.getClass();

        org.junit.Assert.assertNotNull(locust0);

        org.junit.Assert.assertNotNull(wildcardClass8);

    }



    @Test

    public void test009() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test009");

        com.github.myzhan.locust4j.Locust locust0 = com.github.myzhan.locust4j.Locust.getInstance();

        locust0.recordFailure("", "hi!", (-1L), "");

        java.lang.Class<?> wildcardClass6 = locust0.getClass();

        org.junit.Assert.assertNotNull(locust0);

        org.junit.Assert.assertNotNull(wildcardClass6);

    }



    @Test

    public void test010() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test010");

        com.github.myzhan.locust4j.Locust locust0 = com.github.myzhan.locust4j.Locust.getInstance();

        locust0.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust0.setMasterPort(0);

        java.lang.Object obj9 = locust0.getRemoteParam("hi!");

        org.junit.Assert.assertNotNull(locust0);

        org.junit.Assert.assertNull(obj9);

    }



    @Test

    public void test011() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test011");

        org.msgpack.core.MessageUnpacker messageUnpacker0 = null;

        // The following exception was thrown during execution in test generation

        try {

            java.util.Map<java.lang.String, java.lang.Object> strMap1 = com.github.myzhan.locust4j.message.Message.unpackMap(messageUnpacker0);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test012() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test012");

        long long0 = com.github.myzhan.locust4j.utils.Utils.now();

// flaky:         org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1700469866049L + "'", long0 == 1700469866049L);

    }



    @Test

    public void test013() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test013");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setMinResponseTime(0L);

        long long5 = statsEntry2.getStartTime();

        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);

    }



    @Test

    public void test014() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test014");

        java.util.concurrent.TimeUnit timeUnit3 = null;

        java.util.concurrent.TimeUnit timeUnit5 = null;

        com.github.myzhan.locust4j.ratelimit.RampUpRateLimiter rampUpRateLimiter6 = new com.github.myzhan.locust4j.ratelimit.RampUpRateLimiter((-1L), (long) (byte) 100, (long) (byte) -1, timeUnit3, (long) (short) 0, timeUnit5);

        boolean boolean7 = rampUpRateLimiter6.isStopped();

        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);

    }



    @Test

    public void test015() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test015");

        com.github.myzhan.locust4j.runtime.RunnerState runnerState0 = com.github.myzhan.locust4j.runtime.RunnerState.Running;

        org.junit.Assert.assertTrue("'" + runnerState0 + "' != '" + com.github.myzhan.locust4j.runtime.RunnerState.Running + "'", runnerState0.equals(com.github.myzhan.locust4j.runtime.RunnerState.Running));

    }



    @Test

    public void test016() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test016");

        com.github.myzhan.locust4j.runtime.RunnerState runnerState0 = com.github.myzhan.locust4j.runtime.RunnerState.Spawning;

        org.junit.Assert.assertTrue("'" + runnerState0 + "' != '" + com.github.myzhan.locust4j.runtime.RunnerState.Spawning + "'", runnerState0.equals(com.github.myzhan.locust4j.runtime.RunnerState.Spawning));

    }



    @Test

    public void test017() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test017");

        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 0, (byte) 0 };

        // The following exception was thrown during execution in test generation

        try {

            com.github.myzhan.locust4j.message.Message message4 = new com.github.myzhan.locust4j.message.Message(byteArray3);

            org.junit.Assert.fail("Expected exception of type org.msgpack.core.MessageTypeException; message: Expected Array, but got Integer (64)");

        } catch (org.msgpack.core.MessageTypeException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray3);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 0, 0]");

    }



    @Test

    public void test018() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test018");

        com.github.myzhan.locust4j.Locust locust0 = com.github.myzhan.locust4j.Locust.getInstance();

        boolean boolean1 = locust0.isVerbose();

        locust0.setMasterPort((int) (short) 10);

        org.junit.Assert.assertNotNull(locust0);

        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);

    }



    @Test

    public void test019() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test019");

        java.util.concurrent.TimeUnit timeUnit3 = null;

        java.util.concurrent.TimeUnit timeUnit5 = null;

        com.github.myzhan.locust4j.ratelimit.RampUpRateLimiter rampUpRateLimiter6 = new com.github.myzhan.locust4j.ratelimit.RampUpRateLimiter(100L, (long) '4', (long) '4', timeUnit3, (long) 1, timeUnit5);

        // The following exception was thrown during execution in test generation

        try {

            rampUpRateLimiter6.stop();

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test020() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test020");

        com.github.myzhan.locust4j.runtime.RunnerState runnerState0 = com.github.myzhan.locust4j.runtime.RunnerState.Stopped;

        org.junit.Assert.assertTrue("'" + runnerState0 + "' != '" + com.github.myzhan.locust4j.runtime.RunnerState.Stopped + "'", runnerState0.equals(com.github.myzhan.locust4j.runtime.RunnerState.Stopped));

    }



    @Test

    public void test021() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test021");

        com.github.myzhan.locust4j.stats.Stats stats0 = com.github.myzhan.locust4j.stats.Stats.getInstance();

        java.util.concurrent.BlockingQueue<java.util.Map<java.lang.String, java.lang.Object>> strMapQueue1 = stats0.getMessageToRunnerQueue();

        stats0.logRequest("hi!", "", (long) (byte) 1, 1700469866L);

        org.junit.Assert.assertNotNull(stats0);

        org.junit.Assert.assertNotNull(strMapQueue1);

    }



    @Test

    public void test022() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test022");

        java.util.concurrent.TimeUnit timeUnit3 = null;

        java.util.concurrent.TimeUnit timeUnit5 = null;

        com.github.myzhan.locust4j.ratelimit.RampUpRateLimiter rampUpRateLimiter6 = new com.github.myzhan.locust4j.ratelimit.RampUpRateLimiter(100L, (long) '4', (long) '4', timeUnit3, (long) 1, timeUnit5);

        // The following exception was thrown during execution in test generation

        try {

            rampUpRateLimiter6.start();

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test023() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test023");

        java.util.concurrent.TimeUnit timeUnit3 = null;

        java.util.concurrent.TimeUnit timeUnit5 = null;

        com.github.myzhan.locust4j.ratelimit.RampUpRateLimiter rampUpRateLimiter6 = new com.github.myzhan.locust4j.ratelimit.RampUpRateLimiter(0L, (long) (byte) 1, (long) (short) 100, timeUnit3, (long) '4', timeUnit5);

        // The following exception was thrown during execution in test generation

        try {

            rampUpRateLimiter6.stop();

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test024() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test024");

        java.util.concurrent.TimeUnit timeUnit3 = null;

        java.util.concurrent.TimeUnit timeUnit5 = null;

        com.github.myzhan.locust4j.ratelimit.RampUpRateLimiter rampUpRateLimiter6 = new com.github.myzhan.locust4j.ratelimit.RampUpRateLimiter(0L, (long) (byte) 1, (long) (short) 100, timeUnit3, (long) '4', timeUnit5);

        boolean boolean7 = rampUpRateLimiter6.isStopped();

        // The following exception was thrown during execution in test generation

        try {

            rampUpRateLimiter6.start();

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);

    }



    @Test

    public void test025() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test025");

        com.github.myzhan.locust4j.stats.Stats stats0 = com.github.myzhan.locust4j.stats.Stats.getInstance();

        java.util.concurrent.BlockingQueue<java.util.Map<java.lang.String, java.lang.Object>> strMapQueue1 = stats0.getMessageToRunnerQueue();

        stats0.logError("", "hi!", "hi!");

        java.util.Queue<java.lang.Boolean> booleanQueue6 = stats0.getClearStatsQueue();

        org.junit.Assert.assertNotNull(stats0);

        org.junit.Assert.assertNotNull(strMapQueue1);

        org.junit.Assert.assertNotNull(booleanQueue6);

    }



    @Test

    public void test026() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test026");

        com.github.myzhan.locust4j.Locust locust0 = com.github.myzhan.locust4j.Locust.getInstance();

        locust0.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust0.setMasterPort(0);

        locust0.setMaxRPS((long) (short) 0);

        boolean boolean10 = locust0.isRateLimitEnabled();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet13 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet16 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet13.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet16);

        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray18 = new com.github.myzhan.locust4j.AbstractTask[] { weighingTaskSet16 };

        locust0.dryRun(abstractTaskArray18);

        boolean boolean20 = locust0.isRateLimitEnabled();

        org.junit.Assert.assertNotNull(locust0);

        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);

        org.junit.Assert.assertNotNull(abstractTaskArray18);

        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);

    }



    @Test

    public void test027() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test027");

        java.lang.String str0 = com.github.myzhan.locust4j.utils.Utils.getNodeID();

// flaky:         org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055" + "'", str0, "Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055");

    }



    @Test

    public void test028() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test028");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setMinResponseTime(0L);

        java.util.Map<java.lang.String, java.lang.Object> strMap5 = statsEntry2.getStrippedReport();

        long long6 = statsEntry2.getLastRequestTimestamp();

        long long7 = statsEntry2.getNumFailures();

        java.lang.Class<?> wildcardClass8 = statsEntry2.getClass();

        org.junit.Assert.assertNotNull(strMap5);

// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469871L + "'", long6 == 1700469871L);

        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);

        org.junit.Assert.assertNotNull(wildcardClass8);

    }



    @Test

    public void test029() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test029");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setMinResponseTime(0L);

        java.util.Map<java.lang.String, java.lang.Object> strMap5 = statsEntry2.getStrippedReport();

        long long6 = statsEntry2.getLastRequestTimestamp();

        long long7 = statsEntry2.getNumFailures();

        java.lang.String str8 = statsEntry2.getName();

        statsEntry2.setTotalResponseTime((long) '#');

        long long11 = statsEntry2.getTotalResponseTime();

        org.junit.Assert.assertNotNull(strMap5);

// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469871L + "'", long6 == 1700469871L);

        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);

        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");

        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);

    }



    @Test

    public void test030() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test030");

        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };

        // The following exception was thrown during execution in test generation

        try {

            com.github.myzhan.locust4j.message.Message message3 = new com.github.myzhan.locust4j.message.Message(byteArray2);

            org.junit.Assert.fail("Expected exception of type org.msgpack.core.MessageTypeException; message: Expected Array, but got Integer (0a)");

        } catch (org.msgpack.core.MessageTypeException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray2);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");

    }



    @Test

    public void test031() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test031");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setMinResponseTime(0L);

        statsEntry2.setLastRequestTimestamp((long) (short) 0);

        java.lang.String str7 = statsEntry2.getMethod();

        statsEntry2.reset();

        statsEntry2.logTimeOfRequest();

        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");

    }



    @Test

    public void test032() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test032");

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet2 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        int int3 = weighingTaskSet2.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet6 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet9 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet6.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet9);

        weighingTaskSet2.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet9);

        int int12 = weighingTaskSet2.getWeight();

        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);

        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);

    }



    @Test

    public void test033() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test033");

        java.lang.String str0 = com.github.myzhan.locust4j.utils.Utils.getHostname();

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Hengchens-MBP.attlocal.net" + "'", str0, "Hengchens-MBP.attlocal.net");

    }



    @Test

    public void test034() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test034");

        byte[] byteArray3 = new byte[] { (byte) 0, (byte) -1, (byte) 0 };

        // The following exception was thrown during execution in test generation

        try {

            com.github.myzhan.locust4j.message.Message message4 = new com.github.myzhan.locust4j.message.Message(byteArray3);

            org.junit.Assert.fail("Expected exception of type org.msgpack.core.MessageTypeException; message: Expected Array, but got Integer (00)");

        } catch (org.msgpack.core.MessageTypeException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray3);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, -1, 0]");

    }



    @Test

    public void test035() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test035");

        com.github.myzhan.locust4j.Locust locust0 = com.github.myzhan.locust4j.Locust.getInstance();

        locust0.setVerbose(false);

        org.junit.Assert.assertNotNull(locust0);

    }



    @Test

    public void test036() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test036");

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet2 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("hi!", 100);

        java.lang.Class<?> wildcardClass3 = weighingTaskSet2.getClass();

        org.junit.Assert.assertNotNull(wildcardClass3);

    }



    @Test

    public void test037() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test037");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055");

    }



    @Test

    public void test038() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test038");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setMinResponseTime(0L);

        statsEntry2.setTotalContentLength((long) '#');

        long long7 = statsEntry2.getTotalContentLength();

        long long8 = statsEntry2.getLastRequestTimestamp();

        long long9 = statsEntry2.getMinResponseTime();

        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);

        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);

        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);

    }



    @Test

    public void test039() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test039");

        byte[] byteArray4 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 0 };

        // The following exception was thrown during execution in test generation

        try {

            com.github.myzhan.locust4j.message.Message message5 = new com.github.myzhan.locust4j.message.Message(byteArray4);

            org.junit.Assert.fail("Expected exception of type org.msgpack.core.MessageTypeException; message: Expected Array, but got Integer (00)");

        } catch (org.msgpack.core.MessageTypeException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, -1, 100, 0]");

    }



    @Test

    public void test040() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test040");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setMinResponseTime(0L);

        java.util.Map<java.lang.String, java.lang.Object> strMap5 = statsEntry2.getStrippedReport();

        long long6 = statsEntry2.getLastRequestTimestamp();

        long long7 = statsEntry2.getNumFailures();

        java.lang.String str8 = statsEntry2.getName();

        statsEntry2.setTotalResponseTime((long) '#');

        java.util.Map<java.lang.String, java.lang.Object> strMap11 = statsEntry2.serialize();

        org.junit.Assert.assertNotNull(strMap5);

// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469877L + "'", long6 == 1700469877L);

        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);

        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");

        org.junit.Assert.assertNotNull(strMap11);

    }



    @Test

    public void test041() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test041");

        com.github.myzhan.locust4j.ratelimit.StableRateLimiter stableRateLimiter1 = new com.github.myzhan.locust4j.ratelimit.StableRateLimiter((long) (short) -1);

    }



    @Test

    public void test042() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test042");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setMinResponseTime(0L);

        statsEntry2.setLastRequestTimestamp((long) (short) 0);

        java.lang.String str7 = statsEntry2.getMethod();

        statsEntry2.reset();

        statsEntry2.reset();

        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");

    }



    @Test

    public void test043() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test043");

        long long2 = com.github.myzhan.locust4j.utils.Utils.round((long) '#', (int) ' ');

        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);

    }



    @Test

    public void test044() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test044");

        com.github.myzhan.locust4j.stats.RequestFailure requestFailure0 = new com.github.myzhan.locust4j.stats.RequestFailure();

        requestFailure0.setName("");

        java.lang.String str3 = requestFailure0.getName();

        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");

    }



    @Test

    public void test045() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test045");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setMinResponseTime(0L);

        statsEntry2.setMinResponseTime((long) (byte) -1);

    }



    @Test

    public void test046() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test046");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setMinResponseTime(0L);

        statsEntry2.setLastRequestTimestamp((long) (short) 0);

        java.lang.String str7 = statsEntry2.getMethod();

        statsEntry2.reset();

        long long9 = statsEntry2.getTotalContentLength();

        statsEntry2.setMaxResponseTime((long) 1);

        java.lang.String str12 = statsEntry2.getName();

        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");

        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);

        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");

    }



    @Test

    public void test047() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test047");

        com.github.myzhan.locust4j.runtime.Runner runner0 = new com.github.myzhan.locust4j.runtime.Runner();

        java.lang.Class<?> wildcardClass1 = runner0.getClass();

        org.junit.Assert.assertNotNull(wildcardClass1);

    }



    @Test

    public void test048() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test048");

        java.util.concurrent.TimeUnit timeUnit2 = null;

        com.github.myzhan.locust4j.ratelimit.StableRateLimiter stableRateLimiter3 = new com.github.myzhan.locust4j.ratelimit.StableRateLimiter((long) 0, (long) (byte) 100, timeUnit2);

        boolean boolean4 = stableRateLimiter3.isStopped();

        stableRateLimiter3.run();

        // The following exception was thrown during execution in test generation

        try {

            stableRateLimiter3.stop();

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);

    }



    @Test

    public void test049() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test049");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("hi!", "hi!--{num_fail_per_sec=null, last_request_timestamp=0, max_response_time=0, method=, num_reqs_per_sec=null, num_requests=0, num_failures=0, min_response_time=0, start_time=0, total_content_length=0, total_response_time=0, response_times=null, name=, num_none_requests=0}");

    }



    @Test

    public void test050() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test050");

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet2 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet5 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet2.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet5);

        int int7 = weighingTaskSet5.getWeight();

        weighingTaskSet5.onStop();

        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);

    }



    @Test

    public void test051() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test051");

        com.github.myzhan.locust4j.runtime.Runner runner0 = new com.github.myzhan.locust4j.runtime.Runner();

        com.github.myzhan.locust4j.rpc.Client client1 = null;

        runner0.setRPCClient(client1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet5 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet8 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet5.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet8);

        int int10 = weighingTaskSet8.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet13 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        int int14 = weighingTaskSet13.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet17 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet20 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet17.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet20);

        weighingTaskSet13.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet20);

        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray23 = new com.github.myzhan.locust4j.AbstractTask[] { weighingTaskSet8, weighingTaskSet20 };

        java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask> abstractTaskList24 = new java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask>();

        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList24, abstractTaskArray23);

        runner0.setTasks((java.util.List<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList24);

        java.lang.String str27 = runner0.getNodeID();

        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);

        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);

        org.junit.Assert.assertNotNull(abstractTaskArray23);

        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);

// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hengchens-MBP.attlocal.net_cb30a40375e116ee3da0095060de1fc6" + "'", str27, "Hengchens-MBP.attlocal.net_cb30a40375e116ee3da0095060de1fc6");

    }



    @Test

    public void test052() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test052");

        com.github.myzhan.locust4j.Locust locust0 = com.github.myzhan.locust4j.Locust.getInstance();

        locust0.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust0.setMasterPort(0);

        locust0.setMaxRPS((long) (short) 0);

        locust0.setMasterHost("");

        locust0.setVerbose(false);

        org.junit.Assert.assertNotNull(locust0);

    }



    @Test

    public void test053() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test053");

        com.github.myzhan.locust4j.stats.RequestFailure requestFailure0 = new com.github.myzhan.locust4j.stats.RequestFailure();

        java.lang.String str1 = requestFailure0.getRequestType();

        requestFailure0.setName("bcb1c32f385de115abd9c3efda4468d0");

        org.junit.Assert.assertNull(str1);

    }



    @Test

    public void test054() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test054");

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet2 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        int int3 = weighingTaskSet2.getWeight();

        weighingTaskSet2.onStart();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet7 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet2.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet7);

        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);

    }



    @Test

    public void test055() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test055");

        com.github.myzhan.locust4j.Locust locust0 = com.github.myzhan.locust4j.Locust.getInstance();

        locust0.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust0.setMasterPort(0);

        locust0.setMaxRPS((long) (short) 0);

        boolean boolean10 = locust0.isRateLimitEnabled();

        com.github.myzhan.locust4j.runtime.Runner runner11 = new com.github.myzhan.locust4j.runtime.Runner();

        com.github.myzhan.locust4j.rpc.Client client12 = null;

        runner11.setRPCClient(client12);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet16 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet19 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet16.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet19);

        int int21 = weighingTaskSet19.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet24 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        int int25 = weighingTaskSet24.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet28 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet31 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet28.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet31);

        weighingTaskSet24.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet31);

        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray34 = new com.github.myzhan.locust4j.AbstractTask[] { weighingTaskSet19, weighingTaskSet31 };

        java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask> abstractTaskList35 = new java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask>();

        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList35, abstractTaskArray34);

        runner11.setTasks((java.util.List<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList35);

        locust0.dryRun((java.util.List<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList35);

        com.github.myzhan.locust4j.runtime.Runner runner39 = new com.github.myzhan.locust4j.runtime.Runner();

        com.github.myzhan.locust4j.rpc.Client client40 = null;

        runner39.setRPCClient(client40);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet44 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        int int45 = weighingTaskSet44.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet48 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet51 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet48.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet51);

        weighingTaskSet44.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet51);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet56 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        int int57 = weighingTaskSet56.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet60 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        int int61 = weighingTaskSet60.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet64 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        int int65 = weighingTaskSet64.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet68 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet71 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet68.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet71);

        weighingTaskSet64.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet71);

        int int74 = weighingTaskSet64.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet77 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        java.lang.String str78 = weighingTaskSet77.getName();

        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray79 = new com.github.myzhan.locust4j.AbstractTask[] { weighingTaskSet44, weighingTaskSet56, weighingTaskSet60, weighingTaskSet64, weighingTaskSet77 };

        java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask> abstractTaskList80 = new java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask>();

        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList80, abstractTaskArray79);

        runner39.setTasks((java.util.List<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList80);

        locust0.dryRun((java.util.List<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList80);

        org.junit.Assert.assertNotNull(locust0);

        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);

        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);

        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);

        org.junit.Assert.assertNotNull(abstractTaskArray34);

        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);

        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);

        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);

        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);

        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);

        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);

        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");

        org.junit.Assert.assertNotNull(abstractTaskArray79);

        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);

    }



    @Test

    public void test056() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test056");

        com.github.myzhan.locust4j.Locust locust0 = com.github.myzhan.locust4j.Locust.getInstance();

        locust0.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust0.setMasterPort(0);

        locust0.setMaxRPS((long) (short) 0);

        boolean boolean10 = locust0.isRateLimitEnabled();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet13 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet16 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet13.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet16);

        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray18 = new com.github.myzhan.locust4j.AbstractTask[] { weighingTaskSet16 };

        locust0.dryRun(abstractTaskArray18);

        locust0.recordFailure("Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055", "hi!", (long) ' ', "hi!");

        org.junit.Assert.assertNotNull(locust0);

        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);

        org.junit.Assert.assertNotNull(abstractTaskArray18);

    }



    @Test

    public void test057() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test057");

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet2 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet5 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet2.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet5);

        java.lang.String str7 = weighingTaskSet2.getName();

        // The following exception was thrown during execution in test generation

        try {

            weighingTaskSet2.execute();

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");

    }



    @Test

    public void test058() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test058");

        java.util.concurrent.TimeUnit timeUnit3 = null;

        java.util.concurrent.TimeUnit timeUnit5 = null;

        com.github.myzhan.locust4j.ratelimit.RampUpRateLimiter rampUpRateLimiter6 = new com.github.myzhan.locust4j.ratelimit.RampUpRateLimiter(0L, (long) (byte) 1, (long) (short) 100, timeUnit3, (long) '4', timeUnit5);

        // The following exception was thrown during execution in test generation

        try {

            rampUpRateLimiter6.stop();

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test059() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test059");

        com.github.myzhan.locust4j.stats.RequestFailure requestFailure0 = new com.github.myzhan.locust4j.stats.RequestFailure();

        requestFailure0.setRequestType("Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055");

        java.lang.String str3 = requestFailure0.getError();

        org.junit.Assert.assertNull(str3);

    }



    @Test

    public void test060() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test060");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setMinResponseTime(0L);

        statsEntry2.setMinResponseTime((long) (byte) 0);

        java.lang.String str7 = statsEntry2.getName();

        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");

    }



    @Test

    public void test061() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test061");

        com.github.myzhan.locust4j.stats.RequestFailure requestFailure0 = new com.github.myzhan.locust4j.stats.RequestFailure();

        requestFailure0.setRequestType("Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055");

        requestFailure0.setError("Hengchens-MBP.attlocal.net");

        java.lang.String str5 = requestFailure0.getRequestType();

        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055" + "'", str5, "Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055");

    }



    @Test

    public void test062() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test062");

        com.github.myzhan.locust4j.stats.RequestSuccess requestSuccess0 = new com.github.myzhan.locust4j.stats.RequestSuccess();

        long long1 = requestSuccess0.getContentLength();

        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);

    }



    @Test

    public void test063() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test063");

        java.util.concurrent.TimeUnit timeUnit2 = null;

        com.github.myzhan.locust4j.ratelimit.StableRateLimiter stableRateLimiter3 = new com.github.myzhan.locust4j.ratelimit.StableRateLimiter((long) 0, (long) (byte) 100, timeUnit2);

        boolean boolean4 = stableRateLimiter3.isStopped();

        stableRateLimiter3.run();

        boolean boolean6 = stableRateLimiter3.isStopped();

        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);

        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);

    }



    @Test

    public void test064() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test064");

        com.github.myzhan.locust4j.stats.Stats stats0 = new com.github.myzhan.locust4j.stats.Stats();

        stats0.clearAll();

    }



    @Test

    public void test065() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test065");

        com.github.myzhan.locust4j.runtime.Runner runner0 = new com.github.myzhan.locust4j.runtime.Runner();

        com.github.myzhan.locust4j.rpc.Client client1 = null;

        runner0.setRPCClient(client1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet5 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet8 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet5.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet8);

        int int10 = weighingTaskSet8.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet13 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        int int14 = weighingTaskSet13.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet17 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet20 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet17.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet20);

        weighingTaskSet13.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet20);

        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray23 = new com.github.myzhan.locust4j.AbstractTask[] { weighingTaskSet8, weighingTaskSet20 };

        java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask> abstractTaskList24 = new java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask>();

        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList24, abstractTaskArray23);

        runner0.setTasks((java.util.List<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList24);

        com.github.myzhan.locust4j.rpc.Client client27 = null;

        runner0.setRPCClient(client27);

        java.util.Map<java.lang.String, java.lang.Object> strMap29 = runner0.getRemoteParams();

        java.lang.String str30 = runner0.getNodeID();

        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);

        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);

        org.junit.Assert.assertNotNull(abstractTaskArray23);

        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);

        org.junit.Assert.assertNotNull(strMap29);

// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hengchens-MBP.attlocal.net_4af26e3d62052f72b6fcabb7e77c556d" + "'", str30, "Hengchens-MBP.attlocal.net_4af26e3d62052f72b6fcabb7e77c556d");

    }



    @Test

    public void test066() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test066");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry3 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry3.setMinResponseTime(0L);

        java.util.Map<java.lang.String, java.lang.Object> strMap6 = statsEntry3.getStrippedReport();

        com.github.myzhan.locust4j.message.Message message9 = new com.github.myzhan.locust4j.message.Message("", strMap6, 0, "hi!");

        java.util.Map<java.lang.String, java.lang.Object> strMap10 = message9.getData();

        java.lang.String str11 = message9.getNodeID();

        java.lang.String str12 = message9.toString();

        byte[] byteArray13 = message9.getBytes();

        com.github.myzhan.locust4j.message.Message message14 = new com.github.myzhan.locust4j.message.Message(byteArray13);

        org.junit.Assert.assertNotNull(strMap6);

        org.junit.Assert.assertNotNull(strMap10);

        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");

        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!--{num_fail_per_sec=null, last_request_timestamp=0, max_response_time=0, method=, num_reqs_per_sec=null, num_requests=0, num_failures=0, min_response_time=0, start_time=0, total_content_length=0, total_response_time=0, response_times=null, name=, num_none_requests=0}" + "'", str12, "hi!--{num_fail_per_sec=null, last_request_timestamp=0, max_response_time=0, method=, num_reqs_per_sec=null, num_requests=0, num_failures=0, min_response_time=0, start_time=0, total_content_length=0, total_response_time=0, response_times=null, name=, num_none_requests=0}");

        org.junit.Assert.assertNotNull(byteArray13);

    }



    @Test

    public void test067() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test067");

        com.github.myzhan.locust4j.runtime.Runner runner0 = new com.github.myzhan.locust4j.runtime.Runner();

        com.github.myzhan.locust4j.rpc.Client client1 = null;

        runner0.setRPCClient(client1);

        com.github.myzhan.locust4j.runtime.RunnerState runnerState3 = runner0.getState();

        java.util.Map<java.lang.String, java.lang.Object> strMap4 = runner0.getRemoteParams();

        org.junit.Assert.assertNull(runnerState3);

        org.junit.Assert.assertNotNull(strMap4);

    }



    @Test

    public void test068() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test068");

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet2 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        java.lang.String str3 = weighingTaskSet2.getName();

        java.lang.String str4 = weighingTaskSet2.getName();

        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");

        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");

    }



    @Test

    public void test069() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test069");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        java.util.Map<java.lang.String, java.lang.Object> strMap3 = statsEntry2.getStrippedReport();

        statsEntry2.logError("hi!");

        statsEntry2.reset();

        org.junit.Assert.assertNotNull(strMap3);

    }



    @Test

    public void test070() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test070");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setMinResponseTime(0L);

        java.util.Map<java.lang.String, java.lang.Object> strMap5 = statsEntry2.getStrippedReport();

        long long6 = statsEntry2.getLastRequestTimestamp();

        long long7 = statsEntry2.getNumFailures();

        java.util.Map<java.lang.String, java.lang.Object> strMap8 = statsEntry2.serialize();

        org.junit.Assert.assertNotNull(strMap5);

// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469898L + "'", long6 == 1700469898L);

        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);

        org.junit.Assert.assertNotNull(strMap8);

    }



    @Test

    public void test071() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test071");

        java.util.concurrent.TimeUnit timeUnit3 = null;

        java.util.concurrent.TimeUnit timeUnit5 = null;

        com.github.myzhan.locust4j.ratelimit.RampUpRateLimiter rampUpRateLimiter6 = new com.github.myzhan.locust4j.ratelimit.RampUpRateLimiter(0L, (long) (byte) 1, (long) (short) 100, timeUnit3, (long) '4', timeUnit5);

        boolean boolean7 = rampUpRateLimiter6.isStopped();

        boolean boolean8 = rampUpRateLimiter6.isStopped();

        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);

        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);

    }



    @Test

    public void test072() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test072");

        java.lang.String str2 = com.github.myzhan.locust4j.utils.Utils.getSystemEnvWithDefault("hi!", "");

        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");

    }



    @Test

    public void test073() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test073");

        byte[] byteArray1 = new byte[] { (byte) 1 };

        // The following exception was thrown during execution in test generation

        try {

            com.github.myzhan.locust4j.message.Message message2 = new com.github.myzhan.locust4j.message.Message(byteArray1);

            org.junit.Assert.fail("Expected exception of type org.msgpack.core.MessageTypeException; message: Expected Array, but got Integer (01)");

        } catch (org.msgpack.core.MessageTypeException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");

    }



    @Test

    public void test074() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test074");

        com.github.myzhan.locust4j.ratelimit.StableRateLimiter stableRateLimiter1 = new com.github.myzhan.locust4j.ratelimit.StableRateLimiter(10L);

        boolean boolean2 = stableRateLimiter1.isStopped();

        boolean boolean3 = stableRateLimiter1.isStopped();

        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);

        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);

    }



    @Test

    public void test075() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test075");

        com.github.myzhan.locust4j.Locust locust0 = com.github.myzhan.locust4j.Locust.getInstance();

        locust0.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust0.setMasterPort((int) (short) -1);

        locust0.recordSuccess("hi!", "Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055", (long) '#', (-1L));

        locust0.stop();

        org.junit.Assert.assertNotNull(locust0);

    }



    @Test

    public void test076() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test076");

        com.github.myzhan.locust4j.Locust locust0 = com.github.myzhan.locust4j.Locust.getInstance();

        locust0.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust0.setMasterPort(0);

        locust0.setMaxRPS((long) (short) 0);

        com.github.myzhan.locust4j.Locust locust10 = com.github.myzhan.locust4j.Locust.getInstance();

        locust10.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust10.setMasterPort((int) (short) -1);

        locust10.recordSuccess("hi!", "Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055", (long) '#', (-1L));

        boolean boolean23 = locust10.isVerbose();

        com.github.myzhan.locust4j.Locust locust24 = com.github.myzhan.locust4j.Locust.getInstance();

        locust24.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust24.setMasterPort(0);

        locust24.setMaxRPS((long) (short) 0);

        boolean boolean34 = locust24.isRateLimitEnabled();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet37 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet40 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet37.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet40);

        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray42 = new com.github.myzhan.locust4j.AbstractTask[] { weighingTaskSet40 };

        locust24.dryRun(abstractTaskArray42);

        locust10.dryRun(abstractTaskArray42);

        locust0.dryRun(abstractTaskArray42);

        boolean boolean46 = locust0.isVerbose();

        org.junit.Assert.assertNotNull(locust0);

        org.junit.Assert.assertNotNull(locust10);

        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);

        org.junit.Assert.assertNotNull(locust24);

        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);

        org.junit.Assert.assertNotNull(abstractTaskArray42);

        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);

    }



    @Test

    public void test077() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test077");

        com.github.myzhan.locust4j.runtime.Runner runner0 = new com.github.myzhan.locust4j.runtime.Runner();

        com.github.myzhan.locust4j.rpc.Client client1 = null;

        runner0.setRPCClient(client1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet5 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet8 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet5.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet8);

        int int10 = weighingTaskSet8.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet13 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        int int14 = weighingTaskSet13.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet17 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet20 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet17.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet20);

        weighingTaskSet13.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet20);

        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray23 = new com.github.myzhan.locust4j.AbstractTask[] { weighingTaskSet8, weighingTaskSet20 };

        java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask> abstractTaskList24 = new java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask>();

        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList24, abstractTaskArray23);

        runner0.setTasks((java.util.List<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList24);

        com.github.myzhan.locust4j.rpc.Client client27 = null;

        runner0.setRPCClient(client27);

        com.github.myzhan.locust4j.rpc.Client client29 = null;

        runner0.setRPCClient(client29);

        java.lang.String str31 = runner0.getNodeID();

        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);

        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);

        org.junit.Assert.assertNotNull(abstractTaskArray23);

        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);

// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hengchens-MBP.attlocal.net_25090039ecec0617d4a04a6de56ed7fa" + "'", str31, "Hengchens-MBP.attlocal.net_25090039ecec0617d4a04a6de56ed7fa");

    }



    @Test

    public void test078() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test078");

        com.github.myzhan.locust4j.stats.Stats stats0 = com.github.myzhan.locust4j.stats.Stats.getInstance();

        java.util.concurrent.BlockingQueue<java.util.Map<java.lang.String, java.lang.Object>> strMapQueue1 = stats0.getMessageToRunnerQueue();

        stats0.logRequest("Hengchens-MBP.attlocal.net", "", (long) '#', 1700469898L);

        stats0.start();

        org.junit.Assert.assertNotNull(stats0);

        org.junit.Assert.assertNotNull(strMapQueue1);

    }



    @Test

    public void test079() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test079");

        com.github.myzhan.locust4j.ratelimit.StableRateLimiter stableRateLimiter1 = new com.github.myzhan.locust4j.ratelimit.StableRateLimiter(10L);

        boolean boolean2 = stableRateLimiter1.acquire();

        boolean boolean3 = stableRateLimiter1.acquire();

        stableRateLimiter1.start();

        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);

        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);

    }



    @Test

    public void test080() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test080");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry3 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry3.setMinResponseTime(0L);

        java.util.Map<java.lang.String, java.lang.Object> strMap6 = statsEntry3.getStrippedReport();

        com.github.myzhan.locust4j.message.Message message9 = new com.github.myzhan.locust4j.message.Message("", strMap6, 0, "hi!");

        java.util.Map<java.lang.String, java.lang.Object> strMap10 = message9.getData();

        java.lang.String str11 = message9.getNodeID();

        java.lang.String str12 = message9.toString();

        byte[] byteArray13 = message9.getBytes();

        java.lang.String str14 = message9.getType();

        org.junit.Assert.assertNotNull(strMap6);

        org.junit.Assert.assertNotNull(strMap10);

        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");

        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!--{num_fail_per_sec=null, last_request_timestamp=0, max_response_time=0, method=, num_reqs_per_sec=null, num_requests=0, num_failures=0, min_response_time=0, start_time=0, total_content_length=0, total_response_time=0, response_times=null, name=, num_none_requests=0}" + "'", str12, "hi!--{num_fail_per_sec=null, last_request_timestamp=0, max_response_time=0, method=, num_reqs_per_sec=null, num_requests=0, num_failures=0, min_response_time=0, start_time=0, total_content_length=0, total_response_time=0, response_times=null, name=, num_none_requests=0}");

        org.junit.Assert.assertNotNull(byteArray13);

        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");

    }



    @Test

    public void test081() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test081");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry1 = new com.github.myzhan.locust4j.stats.StatsEntry("hi!");

        long long2 = statsEntry1.getStartTime();

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry5 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        java.util.Map<java.lang.String, java.lang.Object> strMap6 = statsEntry5.getStrippedReport();

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry9 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry9.setMinResponseTime(0L);

        statsEntry9.setTotalContentLength((long) '#');

        long long14 = statsEntry9.getTotalContentLength();

        long long15 = statsEntry9.getLastRequestTimestamp();

        com.github.myzhan.locust4j.message.LongIntMap longIntMap16 = new com.github.myzhan.locust4j.message.LongIntMap();

        statsEntry9.setResponseTimes(longIntMap16);

        statsEntry5.setNumReqsPerSec(longIntMap16);

        statsEntry1.setResponseTimes(longIntMap16);

        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);

        org.junit.Assert.assertNotNull(strMap6);

        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);

        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);

    }



    @Test

    public void test082() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test082");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        java.util.Map<java.lang.String, java.lang.Object> strMap3 = statsEntry2.getStrippedReport();

        statsEntry2.logError("hi!");

        statsEntry2.setMethod("bcb1c32f385de115abd9c3efda4468d0-Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055-{num_fail_per_sec=null, last_request_timestamp=0, max_response_time=0, method=, num_reqs_per_sec=null, num_requests=0, num_failures=0, min_response_time=0, start_time=0, total_content_length=0, total_response_time=0, response_times=null, name=, num_none_requests=0}");

        org.junit.Assert.assertNotNull(strMap3);

    }



    @Test

    public void test083() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test083");

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet2 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        int int3 = weighingTaskSet2.getWeight();

// flaky:         weighingTaskSet2.run();

        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);

    }



    @Test

    public void test084() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test084");

        long long2 = com.github.myzhan.locust4j.utils.Utils.round((long) '#', (int) 'a');

        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);

    }



    @Test

    public void test085() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test085");

        com.github.myzhan.locust4j.stats.RequestSuccess requestSuccess0 = new com.github.myzhan.locust4j.stats.RequestSuccess();

        long long1 = requestSuccess0.getResponseTime();

        long long2 = requestSuccess0.getContentLength();

        long long3 = requestSuccess0.getContentLength();

        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);

        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);

        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);

    }



    @Test

    public void test086() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test086");

        com.github.myzhan.locust4j.Locust locust0 = com.github.myzhan.locust4j.Locust.getInstance();

        locust0.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust0.setMasterPort(0);

        locust0.setVerbose(false);

        locust0.recordSuccess("Hengchens-MBP.attlocal.net_25090039ecec0617d4a04a6de56ed7fa", "Hengchens-MBP.attlocal.net_cb30a40375e116ee3da0095060de1fc6", (long) (short) 0, (long) 1);

        org.junit.Assert.assertNotNull(locust0);

    }



    @Test

    public void test087() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test087");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("Hengchens-MBP.attlocal.net_cb30a40375e116ee3da0095060de1fc6", "bcb1c32f385de115abd9c3efda4468d0");

    }



    @Test

    public void test088() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test088");

        com.github.myzhan.locust4j.ratelimit.StableRateLimiter stableRateLimiter1 = new com.github.myzhan.locust4j.ratelimit.StableRateLimiter(10L);

        boolean boolean2 = stableRateLimiter1.acquire();

        boolean boolean3 = stableRateLimiter1.acquire();

        stableRateLimiter1.run();

        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);

        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);

    }



    @Test

    public void test089() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test089");

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet2 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("hi!", (int) (byte) 100);

// flaky:         weighingTaskSet2.run();

    }



    @Test

    public void test090() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test090");

        com.github.myzhan.locust4j.stats.RequestFailure requestFailure0 = new com.github.myzhan.locust4j.stats.RequestFailure();

        requestFailure0.setRequestType("Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055");

        requestFailure0.setError("Hengchens-MBP.attlocal.net");

        requestFailure0.setError("bcb1c32f385de115abd9c3efda4468d0-Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055-{num_fail_per_sec=null, last_request_timestamp=0, max_response_time=0, method=, num_reqs_per_sec=null, num_requests=0, num_failures=0, min_response_time=0, start_time=0, total_content_length=0, total_response_time=0, response_times=null, name=, num_none_requests=0}");

    }



    @Test

    public void test091() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test091");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setMinResponseTime(0L);

        statsEntry2.setLastRequestTimestamp((long) (short) 0);

        statsEntry2.setStartTime((long) 1);

        statsEntry2.reset();

    }



    @Test

    public void test092() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test092");

        com.github.myzhan.locust4j.stats.RequestSuccess requestSuccess0 = new com.github.myzhan.locust4j.stats.RequestSuccess();

        java.lang.String str1 = requestSuccess0.getName();

        requestSuccess0.setContentLength(1700469865L);

        java.lang.String str4 = requestSuccess0.getRequestType();

        requestSuccess0.setContentLength((long) 0);

        org.junit.Assert.assertNull(str1);

        org.junit.Assert.assertNull(str4);

    }



    @Test

    public void test093() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test093");

        java.lang.String str2 = com.github.myzhan.locust4j.utils.Utils.getSystemEnvWithDefault("bcb1c32f385de115abd9c3efda4468d0-Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055-{num_fail_per_sec=null, last_request_timestamp=0, max_response_time=0, method=, num_reqs_per_sec=null, num_requests=0, num_failures=0, min_response_time=0, start_time=0, total_content_length=0, total_response_time=0, response_times=null, name=, num_none_requests=0}", "Hengchens-MBP.attlocal.net_cb30a40375e116ee3da0095060de1fc6");

        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hengchens-MBP.attlocal.net_cb30a40375e116ee3da0095060de1fc6" + "'", str2, "Hengchens-MBP.attlocal.net_cb30a40375e116ee3da0095060de1fc6");

    }



    @Test

    public void test094() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test094");

        com.github.myzhan.locust4j.stats.Stats stats0 = com.github.myzhan.locust4j.stats.Stats.getInstance();

        java.util.concurrent.BlockingQueue<java.util.Map<java.lang.String, java.lang.Object>> strMapQueue1 = stats0.getMessageToRunnerQueue();

        stats0.logError("", "hi!", "hi!");

        java.util.concurrent.BlockingQueue<java.util.Map<java.lang.String, java.lang.Object>> strMapQueue6 = stats0.getMessageToRunnerQueue();

        org.junit.Assert.assertNotNull(stats0);

        org.junit.Assert.assertNotNull(strMapQueue1);

        org.junit.Assert.assertNotNull(strMapQueue6);

    }



    @Test

    public void test095() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test095");

        com.github.myzhan.locust4j.stats.RequestFailure requestFailure0 = new com.github.myzhan.locust4j.stats.RequestFailure();

        requestFailure0.setName("");

        java.lang.String str3 = requestFailure0.getRequestType();

        java.lang.String str4 = requestFailure0.getName();

        org.junit.Assert.assertNull(str3);

        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");

    }



    @Test

    public void test096() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test096");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry3 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry3.setMinResponseTime(0L);

        statsEntry3.setLastRequestTimestamp((long) (short) 0);

        java.lang.String str8 = statsEntry3.getMethod();

        java.util.Map<java.lang.String, java.lang.Object> strMap9 = statsEntry3.getStrippedReport();

        com.github.myzhan.locust4j.message.Message message12 = new com.github.myzhan.locust4j.message.Message("Hengchens-MBP.attlocal.net_cb30a40375e116ee3da0095060de1fc6", strMap9, 0, "Hengchens-MBP.attlocal.net");

        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");

        org.junit.Assert.assertNotNull(strMap9);

    }



    @Test

    public void test097() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test097");

        com.github.myzhan.locust4j.Locust locust0 = com.github.myzhan.locust4j.Locust.getInstance();

        locust0.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust0.setMasterPort(0);

        locust0.setVerbose(false);

        com.github.myzhan.locust4j.ratelimit.AbstractRateLimiter abstractRateLimiter10 = locust0.getRateLimiter();

        org.junit.Assert.assertNotNull(locust0);

        org.junit.Assert.assertNotNull(abstractRateLimiter10);

    }



    @Test

    public void test098() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test098");

        java.util.concurrent.TimeUnit timeUnit3 = null;

        java.util.concurrent.TimeUnit timeUnit5 = null;

        com.github.myzhan.locust4j.ratelimit.RampUpRateLimiter rampUpRateLimiter6 = new com.github.myzhan.locust4j.ratelimit.RampUpRateLimiter(0L, (long) (byte) 1, (long) (short) 100, timeUnit3, (long) '4', timeUnit5);

        boolean boolean7 = rampUpRateLimiter6.isStopped();

        // The following exception was thrown during execution in test generation

        try {

            rampUpRateLimiter6.start();

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);

    }



    @Test

    public void test099() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test099");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry3 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        java.util.Map<java.lang.String, java.lang.Object> strMap4 = statsEntry3.getStrippedReport();

        com.github.myzhan.locust4j.message.Message message7 = new com.github.myzhan.locust4j.message.Message("bcb1c32f385de115abd9c3efda4468d0", strMap4, 10, "Hengchens-MBP.attlocal.net_25090039ecec0617d4a04a6de56ed7fa");

        org.junit.Assert.assertNotNull(strMap4);

    }



    @Test

    public void test100() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test100");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry1 = new com.github.myzhan.locust4j.stats.StatsEntry("hi!");

        statsEntry1.setNumFailures(1L);

        statsEntry1.setMaxResponseTime(1700469866L);

        long long6 = statsEntry1.getMaxResponseTime();

        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469866L + "'", long6 == 1700469866L);

    }



    @Test

    public void test101() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test101");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setMinResponseTime(0L);

        statsEntry2.setLastRequestTimestamp((long) (short) 0);

        java.lang.String str7 = statsEntry2.getMethod();

        statsEntry2.reset();

        statsEntry2.setMaxResponseTime(0L);

        statsEntry2.setNumRequests(1700469871L);

        statsEntry2.setMethod("Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055");

        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");

    }



    @Test

    public void test102() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test102");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("Hengchens-MBP.attlocal.net", "Hengchens-MBP.attlocal.net");

    }



    @Test

    public void test103() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test103");

        com.github.myzhan.locust4j.ratelimit.StableRateLimiter stableRateLimiter1 = new com.github.myzhan.locust4j.ratelimit.StableRateLimiter(10L);

        boolean boolean2 = stableRateLimiter1.acquire();

        boolean boolean3 = stableRateLimiter1.isStopped();

        boolean boolean4 = stableRateLimiter1.acquire();

        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);

        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);

        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);

    }



    @Test

    public void test104() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test104");

        java.util.concurrent.TimeUnit timeUnit3 = null;

        java.util.concurrent.TimeUnit timeUnit5 = null;

        com.github.myzhan.locust4j.ratelimit.RampUpRateLimiter rampUpRateLimiter6 = new com.github.myzhan.locust4j.ratelimit.RampUpRateLimiter((long) (byte) 10, (long) (-1), 1700469871L, timeUnit3, 10L, timeUnit5);

        boolean boolean7 = rampUpRateLimiter6.isStopped();

        boolean boolean8 = rampUpRateLimiter6.isStopped();

        // The following exception was thrown during execution in test generation

        try {

            rampUpRateLimiter6.stop();

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);

        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);

    }



    @Test

    public void test105() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test105");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry3 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry3.setMinResponseTime(0L);

        statsEntry3.setLastRequestTimestamp((long) (short) 0);

        java.lang.String str8 = statsEntry3.getMethod();

        java.util.Map<java.lang.String, java.lang.Object> strMap9 = statsEntry3.getStrippedReport();

        com.github.myzhan.locust4j.message.Message message12 = new com.github.myzhan.locust4j.message.Message("Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055", strMap9, 0, "bcb1c32f385de115abd9c3efda4468d0");

        byte[] byteArray13 = message12.getBytes();

        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");

        org.junit.Assert.assertNotNull(strMap9);

        org.junit.Assert.assertNotNull(byteArray13);

    }



    @Test

    public void test106() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test106");

        com.github.myzhan.locust4j.stats.Stats stats0 = com.github.myzhan.locust4j.stats.Stats.getInstance();

        java.util.concurrent.BlockingQueue<java.util.Map<java.lang.String, java.lang.Object>> strMapQueue1 = stats0.getMessageToRunnerQueue();

        stats0.logRequest("Hengchens-MBP.attlocal.net", "hi!", 1700469866049L, (long) 10);

        stats0.stop();

        stats0.wakeMeUp();

        org.junit.Assert.assertNotNull(stats0);

        org.junit.Assert.assertNotNull(strMapQueue1);

    }



    @Test

    public void test107() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test107");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setMinResponseTime(0L);

        statsEntry2.setTotalContentLength((long) '#');

        long long7 = statsEntry2.getTotalContentLength();

        long long8 = statsEntry2.getLastRequestTimestamp();

        long long9 = statsEntry2.getMaxResponseTime();

        statsEntry2.setTotalContentLength((long) (short) 10);

        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);

        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);

        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);

    }



    @Test

    public void test108() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test108");

        java.lang.String[] strArray6 = new java.lang.String[] { "", "Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055", "", "Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055", "Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055", "" };

        java.lang.String str7 = com.github.myzhan.locust4j.utils.Utils.md5(strArray6);

        java.lang.String str8 = com.github.myzhan.locust4j.utils.Utils.md5(strArray6);

        org.junit.Assert.assertNotNull(strArray6);

        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "bcb1c32f385de115abd9c3efda4468d0" + "'", str7, "bcb1c32f385de115abd9c3efda4468d0");

        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "bcb1c32f385de115abd9c3efda4468d0" + "'", str8, "bcb1c32f385de115abd9c3efda4468d0");

    }



    @Test

    public void test109() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test109");

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet2 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("Hengchens-MBP.attlocal.net", (int) (short) 100);

    }



    @Test

    public void test110() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test110");

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet2 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        int int3 = weighingTaskSet2.getWeight();

        weighingTaskSet2.onStart();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet7 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        java.lang.String str8 = weighingTaskSet7.getName();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet11 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet14 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet11.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet14);

        weighingTaskSet7.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet14);

// flaky:         weighingTaskSet14.run();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet20 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet23 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet20.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet23);

        java.lang.String str25 = weighingTaskSet20.getName();

        weighingTaskSet14.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet20);

        weighingTaskSet2.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet14);

        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);

        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");

        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");

    }



    @Test

    public void test111() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test111");

        com.github.myzhan.locust4j.Locust locust0 = com.github.myzhan.locust4j.Locust.getInstance();

        locust0.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust0.setMasterPort(0);

        locust0.setMaxRPS((long) (short) 0);

        boolean boolean10 = locust0.isRateLimitEnabled();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet13 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet16 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet13.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet16);

        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray18 = new com.github.myzhan.locust4j.AbstractTask[] { weighingTaskSet16 };

        locust0.dryRun(abstractTaskArray18);

        locust0.setMaxRPS((long) (byte) 0);

        org.junit.Assert.assertNotNull(locust0);

        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);

        org.junit.Assert.assertNotNull(abstractTaskArray18);

    }



    @Test

    public void test112() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test112");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry1 = new com.github.myzhan.locust4j.stats.StatsEntry("");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry4 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry4.setMinResponseTime(0L);

        statsEntry4.setTotalContentLength((long) '#');

        long long9 = statsEntry4.getTotalContentLength();

        long long10 = statsEntry4.getLastRequestTimestamp();

        statsEntry4.setMethod("");

        com.github.myzhan.locust4j.message.LongIntMap longIntMap13 = new com.github.myzhan.locust4j.message.LongIntMap();

        statsEntry4.setResponseTimes(longIntMap13);

        java.lang.String str15 = longIntMap13.toString();

        statsEntry1.setResponseTimes(longIntMap13);

        java.lang.Integer int18 = longIntMap13.get((java.lang.Long) 10L);

        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);

        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);

        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{}" + "'", str15, "{}");

        org.junit.Assert.assertNull(int18);

    }



    @Test

    public void test113() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test113");

        com.github.myzhan.locust4j.stats.RequestSuccess requestSuccess0 = new com.github.myzhan.locust4j.stats.RequestSuccess();

        long long1 = requestSuccess0.getResponseTime();

        requestSuccess0.setContentLength((long) (short) 1);

        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);

    }



    @Test

    public void test114() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test114");

        org.msgpack.core.MessagePacker messagePacker0 = null;

        com.github.myzhan.locust4j.message.Visitor visitor1 = new com.github.myzhan.locust4j.message.Visitor(messagePacker0);

        java.lang.Object obj2 = null;

        // The following exception was thrown during execution in test generation

        try {

            visitor1.visit(obj2);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test115() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test115");

        java.util.concurrent.TimeUnit timeUnit2 = null;

        com.github.myzhan.locust4j.ratelimit.StableRateLimiter stableRateLimiter3 = new com.github.myzhan.locust4j.ratelimit.StableRateLimiter((long) 0, (long) (byte) 100, timeUnit2);

        boolean boolean4 = stableRateLimiter3.isStopped();

        stableRateLimiter3.run();

        // The following exception was thrown during execution in test generation

        try {

            stableRateLimiter3.start();

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);

    }



    @Test

    public void test116() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test116");

        com.github.myzhan.locust4j.runtime.Runner runner0 = new com.github.myzhan.locust4j.runtime.Runner();

        com.github.myzhan.locust4j.rpc.Client client1 = null;

        runner0.setRPCClient(client1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet5 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet8 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet5.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet8);

        int int10 = weighingTaskSet8.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet13 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        int int14 = weighingTaskSet13.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet17 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet20 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet17.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet20);

        weighingTaskSet13.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet20);

        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray23 = new com.github.myzhan.locust4j.AbstractTask[] { weighingTaskSet8, weighingTaskSet20 };

        java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask> abstractTaskList24 = new java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask>();

        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList24, abstractTaskArray23);

        runner0.setTasks((java.util.List<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList24);

        com.github.myzhan.locust4j.rpc.Client client27 = null;

        runner0.setRPCClient(client27);

        com.github.myzhan.locust4j.rpc.ZeromqClient zeromqClient32 = new com.github.myzhan.locust4j.rpc.ZeromqClient("Hengchens-MBP.attlocal.net", (int) (short) 1, "bcb1c32f385de115abd9c3efda4468d0");

        zeromqClient32.close();

        runner0.setRPCClient((com.github.myzhan.locust4j.rpc.Client) zeromqClient32);

        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);

        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);

        org.junit.Assert.assertNotNull(abstractTaskArray23);

        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);

    }



    @Test

    public void test117() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test117");

        com.github.myzhan.locust4j.Locust locust0 = com.github.myzhan.locust4j.Locust.getInstance();

        locust0.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust0.setMasterPort(0);

        locust0.setMaxRPS((long) (short) 0);

        boolean boolean10 = locust0.isRateLimitEnabled();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet13 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet16 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet13.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet16);

        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray18 = new com.github.myzhan.locust4j.AbstractTask[] { weighingTaskSet16 };

        locust0.dryRun(abstractTaskArray18);

        locust0.stop();

        locust0.setMaxRPS((long) (byte) 0);

        java.lang.Object obj24 = locust0.getRemoteParam("hi!--{num_fail_per_sec=null, last_request_timestamp=0, max_response_time=0, method=, num_reqs_per_sec=null, num_requests=0, num_failures=0, min_response_time=0, start_time=0, total_content_length=0, total_response_time=0, response_times=null, name=, num_none_requests=0}");

        org.junit.Assert.assertNotNull(locust0);

        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);

        org.junit.Assert.assertNotNull(abstractTaskArray18);

        org.junit.Assert.assertNull(obj24);

    }



    @Test

    public void test118() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test118");

        long long2 = com.github.myzhan.locust4j.utils.Utils.round((long) (byte) -1, (int) (byte) 1);

        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));

    }



    @Test

    public void test119() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test119");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry3 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry3.setMinResponseTime(0L);

        statsEntry3.setLastRequestTimestamp((long) (short) 0);

        java.lang.String str8 = statsEntry3.getMethod();

        java.util.Map<java.lang.String, java.lang.Object> strMap9 = statsEntry3.getStrippedReport();

        com.github.myzhan.locust4j.message.Message message12 = new com.github.myzhan.locust4j.message.Message("Hengchens-MBP.attlocal.net_4af26e3d62052f72b6fcabb7e77c556d", strMap9, (int) (byte) 0, "{}");

        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");

        org.junit.Assert.assertNotNull(strMap9);

    }



    @Test

    public void test120() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test120");

        com.github.myzhan.locust4j.runtime.Runner runner0 = new com.github.myzhan.locust4j.runtime.Runner();

        com.github.myzhan.locust4j.rpc.Client client1 = null;

        runner0.setRPCClient(client1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet5 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet8 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet5.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet8);

        int int10 = weighingTaskSet8.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet13 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        int int14 = weighingTaskSet13.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet17 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet20 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet17.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet20);

        weighingTaskSet13.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet20);

        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray23 = new com.github.myzhan.locust4j.AbstractTask[] { weighingTaskSet8, weighingTaskSet20 };

        java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask> abstractTaskList24 = new java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask>();

        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList24, abstractTaskArray23);

        runner0.setTasks((java.util.List<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList24);

        com.github.myzhan.locust4j.runtime.RunnerState runnerState27 = runner0.getState();

        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);

        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);

        org.junit.Assert.assertNotNull(abstractTaskArray23);

        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);

        org.junit.Assert.assertNull(runnerState27);

    }



    @Test

    public void test121() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test121");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055", "bcb1c32f385de115abd9c3efda4468d0");

        statsEntry2.setMaxResponseTime((long) (-1));

        statsEntry2.setName("Hengchens-MBP.attlocal.net_25090039ecec0617d4a04a6de56ed7fa");

    }



    @Test

    public void test122() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test122");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setMinResponseTime(0L);

        statsEntry2.setTotalContentLength((long) '#');

        long long7 = statsEntry2.getTotalContentLength();

        statsEntry2.setMinResponseTime((long) ' ');

        java.util.Map<java.lang.String, java.lang.Object> strMap10 = statsEntry2.getStrippedReport();

        java.util.Map<java.lang.String, java.lang.Object> strMap11 = statsEntry2.serialize();

        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);

        org.junit.Assert.assertNotNull(strMap10);

        org.junit.Assert.assertNotNull(strMap11);

    }



    @Test

    public void test123() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test123");

        com.github.myzhan.locust4j.rpc.ZeromqClient zeromqClient3 = new com.github.myzhan.locust4j.rpc.ZeromqClient("Hengchens-MBP.attlocal.net", (int) (short) 1, "bcb1c32f385de115abd9c3efda4468d0");

        zeromqClient3.close();

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry8 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry8.setMinResponseTime(0L);

        java.util.Map<java.lang.String, java.lang.Object> strMap11 = statsEntry8.getStrippedReport();

        com.github.myzhan.locust4j.message.Message message14 = new com.github.myzhan.locust4j.message.Message("", strMap11, 0, "hi!");

        java.util.Map<java.lang.String, java.lang.Object> strMap15 = message14.getData();

        java.lang.String str16 = message14.getNodeID();

        java.lang.String str17 = message14.getType();

        // The following exception was thrown during execution in test generation

        try {

            zeromqClient3.send(message14);

            org.junit.Assert.fail("Expected exception of type org.zeromq.ZMQException; message: Errno 156384765");

        } catch (org.zeromq.ZMQException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(strMap11);

        org.junit.Assert.assertNotNull(strMap15);

        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");

        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");

    }



    @Test

    public void test124() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test124");

        com.github.myzhan.locust4j.runtime.Runner runner0 = new com.github.myzhan.locust4j.runtime.Runner();

        com.github.myzhan.locust4j.rpc.Client client1 = null;

        runner0.setRPCClient(client1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet5 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet8 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet5.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet8);

        int int10 = weighingTaskSet8.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet13 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        int int14 = weighingTaskSet13.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet17 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet20 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet17.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet20);

        weighingTaskSet13.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet20);

        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray23 = new com.github.myzhan.locust4j.AbstractTask[] { weighingTaskSet8, weighingTaskSet20 };

        java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask> abstractTaskList24 = new java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask>();

        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList24, abstractTaskArray23);

        runner0.setTasks((java.util.List<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList24);

        com.github.myzhan.locust4j.rpc.Client client27 = null;

        runner0.setRPCClient(client27);

        java.util.Map<java.lang.String, java.lang.Object> strMap29 = runner0.getRemoteParams();

        com.github.myzhan.locust4j.rpc.Client client30 = null;

        runner0.setRPCClient(client30);

        java.lang.String str32 = runner0.getNodeID();

        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);

        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);

        org.junit.Assert.assertNotNull(abstractTaskArray23);

        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);

        org.junit.Assert.assertNotNull(strMap29);

// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hengchens-MBP.attlocal.net_b940cee87fb658aeefc4e20796d4f0c1" + "'", str32, "Hengchens-MBP.attlocal.net_b940cee87fb658aeefc4e20796d4f0c1");

    }



    @Test

    public void test125() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test125");

        com.github.myzhan.locust4j.ratelimit.StableRateLimiter stableRateLimiter1 = new com.github.myzhan.locust4j.ratelimit.StableRateLimiter((long) (byte) 1);

    }



    @Test

    public void test126() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test126");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setMinResponseTime(0L);

        statsEntry2.setLastRequestTimestamp((long) (short) 0);

        java.lang.String str7 = statsEntry2.getMethod();

        statsEntry2.reset();

        long long9 = statsEntry2.getTotalContentLength();

        statsEntry2.setMaxResponseTime((long) 1);

        statsEntry2.setMinResponseTime((long) ' ');

        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");

        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);

    }



    @Test

    public void test127() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test127");

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet2 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        int int3 = weighingTaskSet2.getWeight();

        int int4 = weighingTaskSet2.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet7 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("hi!", 100);

        weighingTaskSet2.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet7);

// flaky:         weighingTaskSet7.run();

        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);

        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);

    }



    @Test

    public void test128() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test128");

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet2 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        int int3 = weighingTaskSet2.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet6 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet9 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet6.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet9);

        weighingTaskSet2.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet9);

        int int12 = weighingTaskSet9.getWeight();

        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);

        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);

    }



    @Test

    public void test129() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test129");

        com.github.myzhan.locust4j.stats.RequestFailure requestFailure0 = new com.github.myzhan.locust4j.stats.RequestFailure();

        java.lang.String str1 = requestFailure0.getRequestType();

        long long2 = requestFailure0.getResponseTime();

        org.junit.Assert.assertNull(str1);

        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);

    }



    @Test

    public void test130() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test130");

        com.github.myzhan.locust4j.Locust locust0 = com.github.myzhan.locust4j.Locust.getInstance();

        locust0.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust0.setMasterPort(0);

        locust0.setMaxRPS((long) (short) 0);

        locust0.setMasterHost("");

        locust0.setMaxRPS(35L);

        boolean boolean14 = locust0.isRateLimitEnabled();

        org.junit.Assert.assertNotNull(locust0);

        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);

    }



    @Test

    public void test131() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test131");

        com.github.myzhan.locust4j.stats.RequestSuccess requestSuccess0 = new com.github.myzhan.locust4j.stats.RequestSuccess();

        long long1 = requestSuccess0.getResponseTime();

        requestSuccess0.setContentLength(1L);

        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);

    }



    @Test

    public void test132() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test132");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setLastRequestTimestamp((long) (short) 1);

        statsEntry2.setNumRequests((long) 100);

        java.lang.String str7 = statsEntry2.getName();

        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");

    }



    @Test

    public void test133() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test133");

        com.github.myzhan.locust4j.Locust locust0 = com.github.myzhan.locust4j.Locust.getInstance();

        locust0.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust0.setMasterPort(0);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet10 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        java.lang.String str11 = weighingTaskSet10.getName();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet14 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet17 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet14.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet17);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet21 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        java.lang.String str22 = weighingTaskSet21.getName();

        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray23 = new com.github.myzhan.locust4j.AbstractTask[] { weighingTaskSet10, weighingTaskSet14, weighingTaskSet21 };

        java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask> abstractTaskList24 = new java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask>();

        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList24, abstractTaskArray23);

        locust0.dryRun((java.util.List<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList24);

        com.github.myzhan.locust4j.Locust locust27 = com.github.myzhan.locust4j.Locust.getInstance();

        locust27.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust27.setMasterPort(0);

        locust27.setMaxRPS((long) (short) 0);

        locust27.setMasterHost("");

        locust27.setMaxRPS(35L);

        locust27.setMasterHost("");

        com.github.myzhan.locust4j.ratelimit.AbstractRateLimiter abstractRateLimiter43 = locust27.getRateLimiter();

        locust0.setRateLimiter(abstractRateLimiter43);

        org.junit.Assert.assertNotNull(locust0);

        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");

        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");

        org.junit.Assert.assertNotNull(abstractTaskArray23);

        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);

        org.junit.Assert.assertNotNull(locust27);

        org.junit.Assert.assertNotNull(abstractRateLimiter43);

    }



    @Test

    public void test134() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test134");

        com.github.myzhan.locust4j.ratelimit.StableRateLimiter stableRateLimiter1 = new com.github.myzhan.locust4j.ratelimit.StableRateLimiter(10L);

        boolean boolean2 = stableRateLimiter1.isStopped();

        boolean boolean3 = stableRateLimiter1.isStopped();

        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);

        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);

    }



    @Test

    public void test135() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test135");

        com.github.myzhan.locust4j.runtime.Runner runner0 = new com.github.myzhan.locust4j.runtime.Runner();

        com.github.myzhan.locust4j.rpc.Client client1 = null;

        runner0.setRPCClient(client1);

        // The following exception was thrown during execution in test generation

        try {

            runner0.quit();

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test136() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test136");

        com.github.myzhan.locust4j.Locust locust0 = com.github.myzhan.locust4j.Locust.getInstance();

        locust0.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust0.setMasterPort(0);

        locust0.setMaxRPS((long) (short) 0);

        boolean boolean10 = locust0.isRateLimitEnabled();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet13 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet16 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet13.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet16);

        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray18 = new com.github.myzhan.locust4j.AbstractTask[] { weighingTaskSet16 };

        locust0.dryRun(abstractTaskArray18);

        locust0.stop();

        java.lang.Object obj22 = locust0.getRemoteParam("Hengchens-MBP.attlocal.net_cb30a40375e116ee3da0095060de1fc6");

        org.junit.Assert.assertNotNull(locust0);

        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);

        org.junit.Assert.assertNotNull(abstractTaskArray18);

        org.junit.Assert.assertNull(obj22);

    }



    @Test

    public void test137() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test137");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setMinResponseTime(0L);

        statsEntry2.setLastRequestTimestamp((long) (short) 0);

        java.lang.String str7 = statsEntry2.getMethod();

        statsEntry2.reset();

        long long9 = statsEntry2.getTotalContentLength();

        statsEntry2.setMaxResponseTime((long) 1);

        java.util.Map<java.lang.String, java.lang.Object> strMap12 = statsEntry2.getStrippedReport();

        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");

        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);

        org.junit.Assert.assertNotNull(strMap12);

    }



    @Test

    public void test138() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test138");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry1 = new com.github.myzhan.locust4j.stats.StatsEntry("hi!");

        long long2 = statsEntry1.getLastRequestTimestamp();

        statsEntry1.setMethod("Hengchens-MBP.attlocal.net_4af26e3d62052f72b6fcabb7e77c556d");

        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);

    }



    @Test

    public void test139() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test139");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("bcb1c32f385de115abd9c3efda4468d0", "Hengchens-MBP.attlocal.net_4af26e3d62052f72b6fcabb7e77c556d");

    }



    @Test

    public void test140() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test140");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setMinResponseTime(0L);

        java.util.Map<java.lang.String, java.lang.Object> strMap5 = statsEntry2.getStrippedReport();

        long long6 = statsEntry2.getLastRequestTimestamp();

        long long7 = statsEntry2.getNumFailures();

        java.lang.String str8 = statsEntry2.getName();

        statsEntry2.setTotalResponseTime((long) '#');

        java.util.Map<java.lang.String, java.lang.Object> strMap11 = statsEntry2.getStrippedReport();

        org.junit.Assert.assertNotNull(strMap5);

// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469904L + "'", long6 == 1700469904L);

        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);

        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");

        org.junit.Assert.assertNotNull(strMap11);

    }



    @Test

    public void test141() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test141");

        com.github.myzhan.locust4j.Locust locust0 = com.github.myzhan.locust4j.Locust.getInstance();

        locust0.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust0.setMasterPort(0);

        locust0.setMaxRPS((long) (short) 0);

        com.github.myzhan.locust4j.Locust locust10 = com.github.myzhan.locust4j.Locust.getInstance();

        locust10.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust10.setMasterPort((int) (short) -1);

        locust10.recordSuccess("hi!", "Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055", (long) '#', (-1L));

        boolean boolean23 = locust10.isVerbose();

        com.github.myzhan.locust4j.Locust locust24 = com.github.myzhan.locust4j.Locust.getInstance();

        locust24.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust24.setMasterPort(0);

        locust24.setMaxRPS((long) (short) 0);

        boolean boolean34 = locust24.isRateLimitEnabled();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet37 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet40 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet37.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet40);

        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray42 = new com.github.myzhan.locust4j.AbstractTask[] { weighingTaskSet40 };

        locust24.dryRun(abstractTaskArray42);

        locust10.dryRun(abstractTaskArray42);

        locust0.dryRun(abstractTaskArray42);

        locust0.recordFailure("", "hi!", 100L, "Hengchens-MBP.attlocal.net_4af26e3d62052f72b6fcabb7e77c556d");

        com.github.myzhan.locust4j.Locust locust51 = com.github.myzhan.locust4j.Locust.getInstance();

        locust51.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust51.setMasterPort(0);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet61 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        java.lang.String str62 = weighingTaskSet61.getName();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet65 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet68 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet65.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet68);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet72 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        java.lang.String str73 = weighingTaskSet72.getName();

        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray74 = new com.github.myzhan.locust4j.AbstractTask[] { weighingTaskSet61, weighingTaskSet65, weighingTaskSet72 };

        java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask> abstractTaskList75 = new java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask>();

        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList75, abstractTaskArray74);

        locust51.dryRun((java.util.List<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList75);

        locust0.dryRun((java.util.List<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList75);

        org.junit.Assert.assertNotNull(locust0);

        org.junit.Assert.assertNotNull(locust10);

        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);

        org.junit.Assert.assertNotNull(locust24);

        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);

        org.junit.Assert.assertNotNull(abstractTaskArray42);

        org.junit.Assert.assertNotNull(locust51);

        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");

        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");

        org.junit.Assert.assertNotNull(abstractTaskArray74);

        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);

    }



    @Test

    public void test142() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test142");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setMinResponseTime(0L);

        statsEntry2.setLastRequestTimestamp((long) (short) 0);

        java.lang.String str7 = statsEntry2.getMethod();

        statsEntry2.reset();

        statsEntry2.setMaxResponseTime(0L);

        statsEntry2.setNumRequests(1700469871L);

        long long13 = statsEntry2.getNumRequests();

        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");

        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1700469871L + "'", long13 == 1700469871L);

    }



    @Test

    public void test143() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test143");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        com.github.myzhan.locust4j.message.LongIntMap longIntMap3 = statsEntry2.getNumReqsPerSec();

        long long4 = statsEntry2.getTotalContentLength();

        org.junit.Assert.assertNull(longIntMap3);

        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);

    }



    @Test

    public void test144() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test144");

        com.github.myzhan.locust4j.Locust locust0 = com.github.myzhan.locust4j.Locust.getInstance();

        locust0.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust0.setMasterPort(0);

        locust0.setMaxRPS((long) (short) 0);

        com.github.myzhan.locust4j.Locust locust10 = com.github.myzhan.locust4j.Locust.getInstance();

        locust10.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust10.setMasterPort((int) (short) -1);

        locust10.recordSuccess("hi!", "Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055", (long) '#', (-1L));

        boolean boolean23 = locust10.isVerbose();

        com.github.myzhan.locust4j.Locust locust24 = com.github.myzhan.locust4j.Locust.getInstance();

        locust24.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust24.setMasterPort(0);

        locust24.setMaxRPS((long) (short) 0);

        boolean boolean34 = locust24.isRateLimitEnabled();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet37 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet40 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet37.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet40);

        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray42 = new com.github.myzhan.locust4j.AbstractTask[] { weighingTaskSet40 };

        locust24.dryRun(abstractTaskArray42);

        locust10.dryRun(abstractTaskArray42);

        locust0.dryRun(abstractTaskArray42);

        locust0.recordFailure("", "hi!", 100L, "Hengchens-MBP.attlocal.net_4af26e3d62052f72b6fcabb7e77c556d");

        locust0.setMaxRPS(1700469898L);

        org.junit.Assert.assertNotNull(locust0);

        org.junit.Assert.assertNotNull(locust10);

        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);

        org.junit.Assert.assertNotNull(locust24);

        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);

        org.junit.Assert.assertNotNull(abstractTaskArray42);

    }



    @Test

    public void test145() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test145");

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet2 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet5 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet2.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet5);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet9 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        java.lang.String str10 = weighingTaskSet9.getName();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet13 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet16 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet13.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet16);

        weighingTaskSet9.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet16);

// flaky:         weighingTaskSet16.run();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet22 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet25 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet22.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet25);

        java.lang.String str27 = weighingTaskSet22.getName();

        weighingTaskSet16.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet22);

        weighingTaskSet5.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet16);

        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");

        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");

    }



    @Test

    public void test146() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test146");

        com.github.myzhan.locust4j.Locust locust0 = com.github.myzhan.locust4j.Locust.getInstance();

        locust0.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust0.setMasterPort((int) (short) -1);

        locust0.recordSuccess("hi!", "Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055", (long) '#', (-1L));

        boolean boolean13 = locust0.isVerbose();

        java.lang.Object obj15 = locust0.getRemoteParam("Hengchens-MBP.attlocal.net_cb30a40375e116ee3da0095060de1fc6");

        locust0.setMasterPort((int) (short) 1);

        org.junit.Assert.assertNotNull(locust0);

        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);

        org.junit.Assert.assertNull(obj15);

    }



    @Test

    public void test147() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test147");

        com.github.myzhan.locust4j.rpc.ZeromqClient zeromqClient3 = new com.github.myzhan.locust4j.rpc.ZeromqClient("Hengchens-MBP.attlocal.net", (int) (short) 1, "bcb1c32f385de115abd9c3efda4468d0");

        zeromqClient3.close();

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry8 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry8.setMinResponseTime(0L);

        statsEntry8.setLastRequestTimestamp((long) (short) 0);

        java.lang.String str13 = statsEntry8.getMethod();

        java.util.Map<java.lang.String, java.lang.Object> strMap14 = statsEntry8.getStrippedReport();

        com.github.myzhan.locust4j.message.Message message17 = new com.github.myzhan.locust4j.message.Message("Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055", strMap14, 0, "bcb1c32f385de115abd9c3efda4468d0");

        // The following exception was thrown during execution in test generation

        try {

            zeromqClient3.send(message17);

            org.junit.Assert.fail("Expected exception of type org.zeromq.ZMQException; message: Errno 156384765");

        } catch (org.zeromq.ZMQException e) {

            // Expected exception.

        }

        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");

        org.junit.Assert.assertNotNull(strMap14);

    }



    @Test

    public void test148() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test148");

        com.github.myzhan.locust4j.stats.RequestFailure requestFailure0 = new com.github.myzhan.locust4j.stats.RequestFailure();

        requestFailure0.setRequestType("Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055");

        java.lang.String str3 = requestFailure0.getName();

        org.junit.Assert.assertNull(str3);

    }



    @Test

    public void test149() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test149");

        java.util.concurrent.TimeUnit timeUnit2 = null;

        com.github.myzhan.locust4j.ratelimit.StableRateLimiter stableRateLimiter3 = new com.github.myzhan.locust4j.ratelimit.StableRateLimiter(1L, (long) (short) 1, timeUnit2);

        boolean boolean4 = stableRateLimiter3.isStopped();

        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);

    }



    @Test

    public void test150() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test150");

        com.github.myzhan.locust4j.stats.Stats stats0 = com.github.myzhan.locust4j.stats.Stats.getInstance();

        stats0.start();

        java.util.Queue<java.lang.Boolean> booleanQueue2 = stats0.getClearStatsQueue();

        java.util.concurrent.BlockingQueue<java.util.Map<java.lang.String, java.lang.Object>> strMapQueue3 = stats0.getMessageToRunnerQueue();

        org.junit.Assert.assertNotNull(stats0);

        org.junit.Assert.assertNotNull(booleanQueue2);

        org.junit.Assert.assertNotNull(strMapQueue3);

    }



    @Test

    public void test151() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test151");

        com.github.myzhan.locust4j.stats.RequestFailure requestFailure0 = new com.github.myzhan.locust4j.stats.RequestFailure();

        requestFailure0.setName("");

        java.lang.String str3 = requestFailure0.getRequestType();

        requestFailure0.setRequestType("hi!--{num_fail_per_sec=null, last_request_timestamp=0, max_response_time=0, method=, num_reqs_per_sec=null, num_requests=0, num_failures=0, min_response_time=0, start_time=0, total_content_length=0, total_response_time=0, response_times=null, name=, num_none_requests=0}");

        requestFailure0.setName("");

        org.junit.Assert.assertNull(str3);

    }



    @Test

    public void test152() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test152");

        com.github.myzhan.locust4j.stats.RequestFailure requestFailure0 = new com.github.myzhan.locust4j.stats.RequestFailure();

        java.lang.String str1 = requestFailure0.getRequestType();

        java.lang.String str2 = requestFailure0.getError();

        org.junit.Assert.assertNull(str1);

        org.junit.Assert.assertNull(str2);

    }



    @Test

    public void test153() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test153");

        com.github.myzhan.locust4j.stats.Stats stats0 = com.github.myzhan.locust4j.stats.Stats.getInstance();

        stats0.logRequest("", "", (long) 'a', (long) (byte) -1);

        java.util.Queue<com.github.myzhan.locust4j.stats.RequestFailure> requestFailureQueue6 = stats0.getReportFailureQueue();

        java.util.Queue<java.lang.Boolean> booleanQueue7 = stats0.getClearStatsQueue();

        stats0.logError("Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055", "Hengchens-MBP.attlocal.net_cb30a40375e116ee3da0095060de1fc6", "Hengchens-MBP.attlocal.net_25090039ecec0617d4a04a6de56ed7fa");

        stats0.wakeMeUp();

        org.junit.Assert.assertNotNull(stats0);

        org.junit.Assert.assertNotNull(requestFailureQueue6);

        org.junit.Assert.assertNotNull(booleanQueue7);

    }



    @Test

    public void test154() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test154");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setMinResponseTime(0L);

        statsEntry2.setTotalContentLength((long) '#');

        long long7 = statsEntry2.getTotalContentLength();

        long long8 = statsEntry2.getLastRequestTimestamp();

        statsEntry2.setMinResponseTime((long) (byte) 0);

        com.github.myzhan.locust4j.message.LongIntMap longIntMap11 = statsEntry2.getNumReqsPerSec();

        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);

        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);

        org.junit.Assert.assertNull(longIntMap11);

    }



    @Test

    public void test155() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test155");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setMinResponseTime(0L);

        statsEntry2.setTotalContentLength((long) '#');

        long long7 = statsEntry2.getTotalContentLength();

        long long8 = statsEntry2.getNumRequests();

        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);

        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);

    }



    @Test

    public void test156() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test156");

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet2 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        int int3 = weighingTaskSet2.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet6 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet9 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet6.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet9);

        weighingTaskSet2.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet9);

        java.lang.String str12 = weighingTaskSet2.getName();

        java.lang.String str13 = weighingTaskSet2.getName();

        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);

        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");

        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");

    }



    @Test

    public void test157() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test157");

        com.github.myzhan.locust4j.stats.RequestSuccess requestSuccess0 = new com.github.myzhan.locust4j.stats.RequestSuccess();

        java.lang.String str1 = requestSuccess0.getName();

        requestSuccess0.setRequestType("");

        org.junit.Assert.assertNull(str1);

    }



    @Test

    public void test158() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test158");

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet2 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        java.lang.String str3 = weighingTaskSet2.getName();

        weighingTaskSet2.onStop();

        weighingTaskSet2.onStart();

        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");

    }



    @Test

    public void test159() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test159");

        com.github.myzhan.locust4j.Locust locust0 = com.github.myzhan.locust4j.Locust.getInstance();

        locust0.setVerbose(true);

        org.junit.Assert.assertNotNull(locust0);

    }



    @Test

    public void test160() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test160");

        com.github.myzhan.locust4j.stats.RequestSuccess requestSuccess0 = new com.github.myzhan.locust4j.stats.RequestSuccess();

        long long1 = requestSuccess0.getResponseTime();

        long long2 = requestSuccess0.getContentLength();

        java.lang.String str3 = requestSuccess0.getRequestType();

        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);

        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);

        org.junit.Assert.assertNull(str3);

    }



    @Test

    public void test161() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test161");

        com.github.myzhan.locust4j.stats.Stats stats0 = com.github.myzhan.locust4j.stats.Stats.getInstance();

        stats0.logRequest("", "", (long) 'a', (long) (byte) -1);

        java.util.concurrent.BlockingQueue<java.util.Map<java.lang.String, java.lang.Object>> strMapQueue6 = stats0.getMessageToRunnerQueue();

        stats0.wakeMeUp();

        stats0.wakeMeUp();

        org.junit.Assert.assertNotNull(stats0);

        org.junit.Assert.assertNotNull(strMapQueue6);

    }



    @Test

    public void test162() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test162");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setMinResponseTime(0L);

        statsEntry2.setTotalContentLength((long) '#');

        java.util.Map<java.lang.String, java.lang.Object> strMap7 = statsEntry2.serialize();

        org.junit.Assert.assertNotNull(strMap7);

    }



    @Test

    public void test163() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test163");

        com.github.myzhan.locust4j.ratelimit.StableRateLimiter stableRateLimiter1 = new com.github.myzhan.locust4j.ratelimit.StableRateLimiter((long) (-1));

    }



    @Test

    public void test164() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test164");

        com.github.myzhan.locust4j.stats.RequestFailure requestFailure0 = new com.github.myzhan.locust4j.stats.RequestFailure();

        requestFailure0.setName("");

        requestFailure0.setName("Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055");

        requestFailure0.setName("Hengchens-MBP.attlocal.net_cb30a40375e116ee3da0095060de1fc6");

        requestFailure0.setRequestType("");

    }



    @Test

    public void test165() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test165");

        com.github.myzhan.locust4j.Locust locust0 = com.github.myzhan.locust4j.Locust.getInstance();

        locust0.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust0.setMasterPort(0);

        locust0.setMaxRPS((long) (short) 0);

        com.github.myzhan.locust4j.Locust locust10 = com.github.myzhan.locust4j.Locust.getInstance();

        locust10.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust10.setMasterPort((int) (short) -1);

        locust10.recordSuccess("hi!", "Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055", (long) '#', (-1L));

        boolean boolean23 = locust10.isVerbose();

        com.github.myzhan.locust4j.Locust locust24 = com.github.myzhan.locust4j.Locust.getInstance();

        locust24.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");

        locust24.setMasterPort(0);

        locust24.setMaxRPS((long) (short) 0);

        boolean boolean34 = locust24.isRateLimitEnabled();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet37 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet40 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet37.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet40);

        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray42 = new com.github.myzhan.locust4j.AbstractTask[] { weighingTaskSet40 };

        locust24.dryRun(abstractTaskArray42);

        locust10.dryRun(abstractTaskArray42);

        locust0.dryRun(abstractTaskArray42);

        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray46 = null;

        // The following exception was thrown during execution in test generation

        try {

            locust0.run(abstractTaskArray46);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(locust0);

        org.junit.Assert.assertNotNull(locust10);

        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);

        org.junit.Assert.assertNotNull(locust24);

        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);

        org.junit.Assert.assertNotNull(abstractTaskArray42);

    }



    @Test

    public void test166() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test166");

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet2 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet5 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet2.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet5);

        java.lang.String str7 = weighingTaskSet2.getName();

        com.github.myzhan.locust4j.AbstractTask abstractTask9 = weighingTaskSet2.getTask(10);

        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");

        org.junit.Assert.assertNull(abstractTask9);

    }



    @Test

    public void test167() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test167");

        com.github.myzhan.locust4j.stats.RequestFailure requestFailure0 = new com.github.myzhan.locust4j.stats.RequestFailure();

        requestFailure0.setRequestType("Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055");

        requestFailure0.setError("Hengchens-MBP.attlocal.net");

        java.lang.String str5 = requestFailure0.getName();

        org.junit.Assert.assertNull(str5);

    }



    @Test

    public void test168() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test168");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setMinResponseTime(0L);

        statsEntry2.setTotalContentLength((long) '#');

        long long7 = statsEntry2.getTotalContentLength();

        statsEntry2.setMinResponseTime((long) ' ');

        java.lang.String str10 = statsEntry2.getName();

        java.lang.String str11 = statsEntry2.getName();

        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);

        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");

        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");

    }



    @Test

    public void test169() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test169");

        com.github.myzhan.locust4j.stats.RequestSuccess requestSuccess0 = new com.github.myzhan.locust4j.stats.RequestSuccess();

        requestSuccess0.setResponseTime((long) (short) 1);

        long long3 = requestSuccess0.getContentLength();

        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);

    }



    @Test

    public void test170() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test170");

        com.github.myzhan.locust4j.stats.RequestSuccess requestSuccess0 = new com.github.myzhan.locust4j.stats.RequestSuccess();

        java.lang.String str1 = requestSuccess0.getRequestType();

        org.junit.Assert.assertNull(str1);

    }



    @Test

    public void test171() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test171");

        com.github.myzhan.locust4j.stats.RequestFailure requestFailure0 = new com.github.myzhan.locust4j.stats.RequestFailure();

        requestFailure0.setName("");

        java.lang.String str3 = requestFailure0.getRequestType();

        requestFailure0.setRequestType("Hengchens-MBP.attlocal.net_25090039ecec0617d4a04a6de56ed7fa");

        java.lang.String str6 = requestFailure0.getError();

        org.junit.Assert.assertNull(str3);

        org.junit.Assert.assertNull(str6);

    }



    @Test

    public void test172() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test172");

        com.github.myzhan.locust4j.runtime.Runner runner0 = new com.github.myzhan.locust4j.runtime.Runner();

        com.github.myzhan.locust4j.rpc.Client client1 = null;

        runner0.setRPCClient(client1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet5 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet8 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet5.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet8);

        int int10 = weighingTaskSet8.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet13 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        int int14 = weighingTaskSet13.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet17 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet20 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet17.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet20);

        weighingTaskSet13.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet20);

        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray23 = new com.github.myzhan.locust4j.AbstractTask[] { weighingTaskSet8, weighingTaskSet20 };

        java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask> abstractTaskList24 = new java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask>();

        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList24, abstractTaskArray23);

        runner0.setTasks((java.util.List<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList24);

        com.github.myzhan.locust4j.rpc.Client client27 = null;

        runner0.setRPCClient(client27);

        com.github.myzhan.locust4j.rpc.Client client29 = null;

        runner0.setRPCClient(client29);

        com.github.myzhan.locust4j.stats.Stats stats31 = com.github.myzhan.locust4j.stats.Stats.getInstance();

        stats31.logRequest("", "", (long) 'a', (long) (byte) -1);

        java.util.concurrent.BlockingQueue<java.util.Map<java.lang.String, java.lang.Object>> strMapQueue37 = stats31.getMessageToRunnerQueue();

        runner0.setStats(stats31);

        // The following exception was thrown during execution in test generation

        try {

            runner0.getReady();

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);

        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);

        org.junit.Assert.assertNotNull(abstractTaskArray23);

        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);

        org.junit.Assert.assertNotNull(stats31);

        org.junit.Assert.assertNotNull(strMapQueue37);

    }



    @Test

    public void test173() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test173");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setMinResponseTime(0L);

        java.util.Map<java.lang.String, java.lang.Object> strMap5 = statsEntry2.getStrippedReport();

        long long6 = statsEntry2.getLastRequestTimestamp();

        long long7 = statsEntry2.getNumFailures();

        java.lang.String str8 = statsEntry2.getName();

        statsEntry2.setMaxResponseTime((long) (short) 100);

        org.junit.Assert.assertNotNull(strMap5);

// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469915L + "'", long6 == 1700469915L);

        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);

        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");

    }



    @Test

    public void test174() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test174");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry1 = new com.github.myzhan.locust4j.stats.StatsEntry("");

        statsEntry1.setLastRequestTimestamp(1700469898L);

    }



    @Test

    public void test175() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test175");

        com.github.myzhan.locust4j.stats.Stats stats0 = com.github.myzhan.locust4j.stats.Stats.getInstance();

        java.util.concurrent.BlockingQueue<java.util.Map<java.lang.String, java.lang.Object>> strMapQueue1 = stats0.getMessageToRunnerQueue();

        stats0.logRequest("Hengchens-MBP.attlocal.net", "", (long) '#', 1700469898L);

        stats0.clearAll();

        org.junit.Assert.assertNotNull(stats0);

        org.junit.Assert.assertNotNull(strMapQueue1);

    }



    @Test

    public void test176() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test176");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry1 = new com.github.myzhan.locust4j.stats.StatsEntry("hi!");

        long long2 = statsEntry1.getStartTime();

        com.github.myzhan.locust4j.message.LongIntMap longIntMap3 = statsEntry1.getNumReqsPerSec();

        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);

        org.junit.Assert.assertNull(longIntMap3);

    }



    @Test

    public void test177() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test177");

        java.util.concurrent.TimeUnit timeUnit3 = null;

        java.util.concurrent.TimeUnit timeUnit5 = null;

        com.github.myzhan.locust4j.ratelimit.RampUpRateLimiter rampUpRateLimiter6 = new com.github.myzhan.locust4j.ratelimit.RampUpRateLimiter((long) (byte) 10, (long) (-1), 1700469871L, timeUnit3, 10L, timeUnit5);

        boolean boolean7 = rampUpRateLimiter6.isStopped();

        boolean boolean8 = rampUpRateLimiter6.isStopped();

        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);

        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);

    }



    @Test

    public void test178() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test178");

        java.util.concurrent.TimeUnit timeUnit2 = null;

        com.github.myzhan.locust4j.ratelimit.StableRateLimiter stableRateLimiter3 = new com.github.myzhan.locust4j.ratelimit.StableRateLimiter(1L, (long) (short) 1, timeUnit2);

        stableRateLimiter3.run();

        // The following exception was thrown during execution in test generation

        try {

            stableRateLimiter3.start();

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test179() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test179");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setMinResponseTime(0L);

        statsEntry2.setTotalContentLength((long) '#');

        statsEntry2.setTotalContentLength(1700469866L);

        statsEntry2.setTotalContentLength((long) (short) -1);

    }



    @Test

    public void test180() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test180");

        com.github.myzhan.locust4j.stats.RequestSuccess requestSuccess0 = new com.github.myzhan.locust4j.stats.RequestSuccess();

        java.lang.String str1 = requestSuccess0.getName();

        requestSuccess0.setContentLength(1700469865L);

        requestSuccess0.setContentLength((long) '#');

        org.junit.Assert.assertNull(str1);

    }



    @Test

    public void test181() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test181");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry2.setMinResponseTime(0L);

        statsEntry2.setTotalContentLength((long) '#');

        long long7 = statsEntry2.getTotalContentLength();

        statsEntry2.setMinResponseTime((long) ' ');

        java.lang.String str10 = statsEntry2.getName();

        statsEntry2.setNumFailures((long) 10);

        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);

        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");

    }



    @Test

    public void test182() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test182");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry3 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry3.setMinResponseTime(0L);

        statsEntry3.setTotalContentLength((long) '#');

        long long8 = statsEntry3.getTotalContentLength();

        statsEntry3.setMinResponseTime((long) ' ');

        java.util.Map<java.lang.String, java.lang.Object> strMap11 = statsEntry3.getStrippedReport();

        com.github.myzhan.locust4j.message.Message message14 = new com.github.myzhan.locust4j.message.Message("Hengchens-MBP.attlocal.net_25090039ecec0617d4a04a6de56ed7fa", strMap11, (-1), "Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055");

        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);

        org.junit.Assert.assertNotNull(strMap11);

    }



    @Test

    public void test183() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test183");

        com.github.myzhan.locust4j.stats.RequestFailure requestFailure0 = new com.github.myzhan.locust4j.stats.RequestFailure();

        requestFailure0.setName("");

        requestFailure0.setRequestType("Hengchens-MBP.attlocal.net_b940cee87fb658aeefc4e20796d4f0c1");

    }



    @Test

    public void test184() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test184");

        com.github.myzhan.locust4j.stats.RequestSuccess requestSuccess0 = new com.github.myzhan.locust4j.stats.RequestSuccess();

        long long1 = requestSuccess0.getResponseTime();

        requestSuccess0.setContentLength((long) (short) -1);

        requestSuccess0.setResponseTime((long) (short) 0);

        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);

    }



    @Test

    public void test185() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test185");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055", "bcb1c32f385de115abd9c3efda4468d0");

        statsEntry2.setMaxResponseTime((long) (-1));

        statsEntry2.setTotalResponseTime((long) (byte) 100);

        java.lang.String str7 = statsEntry2.getName();

        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055" + "'", str7, "Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055");

    }



    @Test

    public void test186() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test186");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("bcb1c32f385de115abd9c3efda4468d0", "");

    }



    @Test

    public void test187() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test187");

        com.github.myzhan.locust4j.stats.Stats stats0 = com.github.myzhan.locust4j.stats.Stats.getInstance();

        stats0.start();

        stats0.wakeMeUp();

        stats0.stop();

        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> strMap4 = stats0.serializeErrors();

        java.util.concurrent.BlockingQueue<java.util.Map<java.lang.String, java.lang.Object>> strMapQueue5 = stats0.getMessageToRunnerQueue();

        org.junit.Assert.assertNotNull(stats0);

        org.junit.Assert.assertNotNull(strMap4);

        org.junit.Assert.assertNotNull(strMapQueue5);

    }



    @Test

    public void test188() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test188");

        com.github.myzhan.locust4j.runtime.Runner runner0 = new com.github.myzhan.locust4j.runtime.Runner();

        com.github.myzhan.locust4j.runtime.Runner runner1 = new com.github.myzhan.locust4j.runtime.Runner();

        com.github.myzhan.locust4j.rpc.Client client2 = null;

        runner1.setRPCClient(client2);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet6 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        int int7 = weighingTaskSet6.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet10 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet13 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet10.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet13);

        weighingTaskSet6.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet13);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet18 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        int int19 = weighingTaskSet18.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet22 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        int int23 = weighingTaskSet22.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet26 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        int int27 = weighingTaskSet26.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet30 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet33 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        weighingTaskSet30.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet33);

        weighingTaskSet26.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet33);

        int int36 = weighingTaskSet26.getWeight();

        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet39 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);

        java.lang.String str40 = weighingTaskSet39.getName();

        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray41 = new com.github.myzhan.locust4j.AbstractTask[] { weighingTaskSet6, weighingTaskSet18, weighingTaskSet22, weighingTaskSet26, weighingTaskSet39 };

        java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask> abstractTaskList42 = new java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask>();

        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList42, abstractTaskArray41);

        runner1.setTasks((java.util.List<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList42);

        runner0.setTasks((java.util.List<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList42);

        com.github.myzhan.locust4j.rpc.ZeromqClient zeromqClient49 = new com.github.myzhan.locust4j.rpc.ZeromqClient("Hengchens-MBP.attlocal.net", (int) (short) 1, "bcb1c32f385de115abd9c3efda4468d0");

        com.github.myzhan.locust4j.stats.StatsEntry statsEntry53 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");

        statsEntry53.setMinResponseTime(0L);

        statsEntry53.setLastRequestTimestamp((long) (short) 0);

        java.lang.String str58 = statsEntry53.getMethod();

        java.util.Map<java.lang.String, java.lang.Object> strMap59 = statsEntry53.getStrippedReport();

        com.github.myzhan.locust4j.message.Message message62 = new com.github.myzhan.locust4j.message.Message("Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055", strMap59, 0, "bcb1c32f385de115abd9c3efda4468d0");

        java.lang.String str63 = message62.toString();

        byte[] byteArray64 = message62.getBytes();

        zeromqClient49.send(message62);

        runner0.setRPCClient((com.github.myzhan.locust4j.rpc.Client) zeromqClient49);

        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);

        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);

        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);

        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);

        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);

        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");

        org.junit.Assert.assertNotNull(abstractTaskArray41);

        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);

        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");

        org.junit.Assert.assertNotNull(strMap59);

        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "bcb1c32f385de115abd9c3efda4468d0-Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055-{num_fail_per_sec=null, last_request_timestamp=0, max_response_time=0, method=, num_reqs_per_sec=null, num_requests=0, num_failures=0, min_response_time=0, start_time=0, total_content_length=0, total_response_time=0, response_times=null, name=, num_none_requests=0}" + "'", str63, "bcb1c32f385de115abd9c3efda4468d0-Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055-{num_fail_per_sec=null, last_request_timestamp=0, max_response_time=0, method=, num_reqs_per_sec=null, num_requests=0, num_failures=0, min_response_time=0, start_time=0, total_content_length=0, total_response_time=0, response_times=null, name=, num_none_requests=0}");

        org.junit.Assert.assertNotNull(byteArray64);

    }

}
