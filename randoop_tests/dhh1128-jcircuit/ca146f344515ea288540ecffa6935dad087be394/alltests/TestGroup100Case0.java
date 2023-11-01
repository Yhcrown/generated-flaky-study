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
        // The following exception was thrown during execution in test generation
        try {
            int int1 = co.codecraft.jcircuit.Circuit.stringToState("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unrecognized state hi!.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        int int0 = co.codecraft.jcircuit.Circuit.FAILED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        boolean boolean2 = co.codecraft.jcircuit.Circuit.isValidTransition(0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = co.codecraft.jcircuit.CircuitBreaker.scheduledExecutorService;
        org.junit.Assert.assertNotNull(scheduledExecutorService0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        boolean boolean2 = co.codecraft.jcircuit.Circuit.isValidTransition(10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        int int0 = co.codecraft.jcircuit.Circuit.RESETTING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        // The following exception was thrown during execution in test generation
        try {
            co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy6 = new co.codecraft.jcircuit.TimedRatioPolicy(0.0d, (double) (short) 1, 0, 1, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minSliceCount must be >= 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.lang.String str1 = co.codecraft.jcircuit.Circuit.stateToString(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLOSED" + "'", str1, "CLOSED");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        int int0 = co.codecraft.jcircuit.Circuit.OPEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        int int0 = co.codecraft.jcircuit.Circuit.CLOSED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        directTransitionPolicy0.onGoodPulse();
        directTransitionPolicy0.onGoodPulse();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onGoodPulse();
        directTransitionPolicy0.onAltPulse();
        java.lang.Class<?> wildcardClass5 = directTransitionPolicy0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onGoodPulse();
        timedRatioPolicy5.onGoodPulse();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        int int2 = circuit1.getStateSnapshot();
        co.codecraft.jcircuit.Circuit.Listener listener3 = circuit1.listener;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(listener3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        boolean boolean2 = co.codecraft.jcircuit.Circuit.isValidTransition(100, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.failAfterNBadResets;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onAltPulse();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setMinSliceCount(3);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder4.setOpenAtGoodRatio((double) 0L);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder4.setFailAfterNBadResets((int) (short) -1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        java.lang.Class<?> wildcardClass3 = builder2.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        boolean boolean2 = co.codecraft.jcircuit.Circuit.isValidTransition((int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        boolean boolean8 = circuitBreaker5.directTransition(10, true);
        boolean boolean11 = circuitBreaker5.directTransition(0, false);
        co.codecraft.jcircuit.TransitionPolicy transitionPolicy12 = circuitBreaker5.transitionPolicy;
        co.codecraft.jcircuit.Circuit circuit13 = circuitBreaker5.circuit;
        co.codecraft.jcircuit.TransitionPolicy transitionPolicy14 = circuitBreaker5.transitionPolicy;
        java.lang.Class<?> wildcardClass15 = transitionPolicy14.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(transitionPolicy12);
        org.junit.Assert.assertNotNull(circuit13);
        org.junit.Assert.assertNotNull(transitionPolicy14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        int int0 = co.codecraft.jcircuit.Circuit.STATE_MASK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        // The following exception was thrown during execution in test generation
        try {
            co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy6 = new co.codecraft.jcircuit.TimedRatioPolicy((double) 100.0f, (double) 'a', 1, (int) (byte) 0, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: openAtGoodRatio must be >= 0.0 and <= 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        // The following exception was thrown during execution in test generation
        try {
            co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy6 = new co.codecraft.jcircuit.TimedRatioPolicy(100.0d, (double) (byte) -1, (int) ' ', (int) '#', (int) (short) -1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: openAtGoodRatio must be >= 0.0 and <= 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        boolean boolean2 = circuit1.shouldValidate;
        java.lang.Class<?> wildcardClass3 = circuit1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable4 = null;
        directTransitionPolicy0.onBadPulse(throwable4);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable7 = null;
        directTransitionPolicy0.onBadPulse(throwable7);
        directTransitionPolicy0.onGoodPulse();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable4 = null;
        directTransitionPolicy0.onBadPulse(throwable4);
        java.lang.Throwable throwable6 = null;
        directTransitionPolicy0.onBadPulse(throwable6);
        java.lang.Throwable throwable8 = null;
        directTransitionPolicy0.onBadPulse(throwable8);
        directTransitionPolicy0.onGoodPulse();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable4 = null;
        directTransitionPolicy0.onBadPulse(throwable4);
        java.lang.Throwable throwable6 = null;
        directTransitionPolicy0.onBadPulse(throwable6);
        directTransitionPolicy0.onAltPulse();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder2.setFailAfterNBadResets((int) (byte) 0);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder4.build();
        timedRatioPolicy5.onBadPulse();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        float float9 = timedRatioPolicy5.closeAtGoodRatio;
        timedRatioPolicy5.onGoodPulse();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.75f + "'", float9 == 0.75f);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder2.setFailAfterNBadResets((int) (byte) 0);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder2.setCloseAtGoodRatio((double) 100.0f);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder6.setCloseAtGoodRatio((double) (-1L));
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        java.lang.String str1 = co.codecraft.jcircuit.Circuit.stateToString((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RESETTING" + "'", str1, "RESETTING");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onGoodPulse();
        directTransitionPolicy0.onGoodPulse();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        directTransitionPolicy0.onGoodPulse();
        boolean boolean7 = directTransitionPolicy0.beforeDirectTransition(0, true);
        directTransitionPolicy0.onBadPulse();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        boolean boolean8 = circuitBreaker5.directTransition(10, true);
        boolean boolean11 = circuitBreaker5.directTransition(0, false);
        co.codecraft.jcircuit.TransitionPolicy transitionPolicy12 = circuitBreaker5.transitionPolicy;
        co.codecraft.jcircuit.Circuit circuit13 = circuitBreaker5.circuit;
        co.codecraft.jcircuit.Circuit.Listener listener14 = circuit13.listener;
        boolean boolean17 = circuit13.transition((int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(transitionPolicy12);
        org.junit.Assert.assertNotNull(circuit13);
        org.junit.Assert.assertNull(listener14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder4.setOpenAtGoodRatio((double) 0L);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder6.setCloseAtGoodRatio((double) (byte) 0);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder10 = builder8.setMinSliceCount((int) (byte) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        boolean boolean8 = circuitBreaker5.directTransition(10, true);
        boolean boolean11 = circuitBreaker5.directTransition(0, false);
        co.codecraft.jcircuit.Circuit circuit12 = circuitBreaker5.circuit;
        boolean boolean13 = circuitBreaker5.shouldTryNormalPath();
        circuitBreaker5.onGoodPulse();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(circuit12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable4 = null;
        directTransitionPolicy0.onBadPulse(throwable4);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable7 = null;
        directTransitionPolicy0.onBadPulse(throwable7);
        directTransitionPolicy0.onAltPulse();
        directTransitionPolicy0.afterDirectTransition((int) (short) 10, false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        // The following exception was thrown during execution in test generation
        try {
            co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy6 = new co.codecraft.jcircuit.TimedRatioPolicy(0.0d, (double) (short) -1, (int) '#', 0, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: closeAtGoodRatio must be >= 0.0 and <= 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = co.codecraft.jcircuit.Circuit.stringToState("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unrecognized state .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        boolean boolean2 = co.codecraft.jcircuit.Circuit.isValidTransition((int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        boolean boolean8 = circuitBreaker5.directTransition(10, true);
        boolean boolean11 = circuitBreaker5.directTransition(0, false);
        co.codecraft.jcircuit.Circuit circuit12 = circuitBreaker5.circuit;
        circuitBreaker5.onAltPulse();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(circuit12);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder4.setMinSliceCount(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder6.setResetAfterNMillis((int) (short) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        boolean boolean2 = circuit1.shouldValidate;
        boolean boolean3 = circuit1.shouldValidate;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        float float9 = timedRatioPolicy5.closeAtGoodRatio;
        timedRatioPolicy5.afterDirectTransition((int) (short) 1, true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.75f + "'", float9 == 0.75f);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setMinSliceCount((int) (byte) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        boolean boolean8 = circuitBreaker5.directTransition(10, true);
        boolean boolean11 = circuitBreaker5.directTransition(0, false);
        co.codecraft.jcircuit.TransitionPolicy transitionPolicy12 = circuitBreaker5.transitionPolicy;
        co.codecraft.jcircuit.Circuit circuit13 = circuitBreaker5.circuit;
        co.codecraft.jcircuit.Circuit.Listener listener14 = circuit13.listener;
        boolean boolean17 = circuit13.transition(0, 0);
        boolean boolean20 = circuit13.transition(3, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(transitionPolicy12);
        org.junit.Assert.assertNotNull(circuit13);
        org.junit.Assert.assertNull(listener14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        co.codecraft.jcircuit.Circuit.Listener listener6 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker7 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener6);
        circuitBreaker7.onGoodPulse();
        circuitBreaker7.onAltPulse();
        java.lang.Throwable throwable10 = null;
        circuitBreaker7.onBadPulse(throwable10);
        boolean boolean14 = circuitBreaker7.directTransition((int) ' ', false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        boolean boolean8 = circuitBreaker5.directTransition(10, true);
        boolean boolean11 = circuitBreaker5.directTransition(0, false);
        co.codecraft.jcircuit.Circuit circuit12 = circuitBreaker5.circuit;
        boolean boolean15 = circuitBreaker5.directTransition((int) 'a', false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(circuit12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = new co.codecraft.jcircuit.TimedRatioPolicy.Builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setResetAfterNMillis(10);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        boolean boolean2 = co.codecraft.jcircuit.Circuit.isValidTransition(10, 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder2.setFailAfterNBadResets((int) (byte) 0);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder2.setOpenAtGoodRatio(100.0d);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder6.setFailAfterNBadResets(0);
        // The following exception was thrown during execution in test generation
        try {
            co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy9 = builder8.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: openAtGoodRatio must be >= 0.0 and <= 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        // The following exception was thrown during execution in test generation
        try {
            co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy6 = new co.codecraft.jcircuit.TimedRatioPolicy((double) 100L, (double) (byte) 0, (int) (short) -1, 3, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: openAtGoodRatio must be >= 0.0 and <= 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder2.setFailAfterNBadResets((int) (byte) 0);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder4.build();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder7 = builder4.setEvalEveryNMillis((-1));
        // The following exception was thrown during execution in test generation
        try {
            co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy8 = builder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: evalEveryNMillis must be >= 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        co.codecraft.jcircuit.Circuit.Listener listener6 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker7 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener6);
        boolean boolean8 = circuitBreaker7.shouldTryNormalPath();
        boolean boolean9 = circuitBreaker7.shouldTryNormalPath();
        java.lang.Throwable throwable10 = null;
        circuitBreaker7.onBadPulse(throwable10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        // The following exception was thrown during execution in test generation
        try {
            co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy6 = new co.codecraft.jcircuit.TimedRatioPolicy((double) (-1.0f), (double) 10L, (int) (byte) 0, (int) (short) -1, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: openAtGoodRatio must be >= 0.0 and <= 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable4 = null;
        directTransitionPolicy0.onBadPulse(throwable4);
        java.lang.Throwable throwable6 = null;
        directTransitionPolicy0.onBadPulse(throwable6);
        co.codecraft.jcircuit.Circuit.Listener listener8 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker9 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener8);
        circuitBreaker9.onGoodPulse();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.lang.String str1 = co.codecraft.jcircuit.Circuit.stateToString(10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RESETTING" + "'", str1, "RESETTING");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        boolean boolean2 = co.codecraft.jcircuit.Circuit.isValidTransition((int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        directTransitionPolicy0.onGoodPulse();
        directTransitionPolicy0.afterDirectTransition(0, false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        boolean boolean2 = co.codecraft.jcircuit.Circuit.isValidTransition(1, 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Class<?> wildcardClass4 = directTransitionPolicy0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable4 = null;
        directTransitionPolicy0.onBadPulse(throwable4);
        java.lang.Throwable throwable6 = null;
        directTransitionPolicy0.onBadPulse(throwable6);
        directTransitionPolicy0.onGoodPulse();
        boolean boolean11 = directTransitionPolicy0.beforeDirectTransition((int) (byte) 100, true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        int int9 = timedRatioPolicy5.resetAfterNMillis;
        boolean boolean12 = timedRatioPolicy5.beforeDirectTransition((int) (short) 1, true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        boolean boolean2 = co.codecraft.jcircuit.Circuit.isValidTransition((int) (byte) 10, 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable4 = null;
        directTransitionPolicy0.onBadPulse(throwable4);
        java.lang.Throwable throwable6 = null;
        directTransitionPolicy0.onBadPulse(throwable6);
        directTransitionPolicy0.onGoodPulse();
        directTransitionPolicy0.onAltPulse();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        co.codecraft.jcircuit.Circuit.Listener listener6 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker7 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener6);
        directTransitionPolicy0.onAltPulse();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        co.codecraft.jcircuit.Circuit.Listener listener6 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker7 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener6);
        java.lang.Throwable throwable8 = null;
        directTransitionPolicy0.onBadPulse(throwable8);
        directTransitionPolicy0.onGoodPulse();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        java.lang.String str1 = co.codecraft.jcircuit.Circuit.stateToString(3);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FAILED" + "'", str1, "FAILED");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        float float7 = timedRatioPolicy5.closeAtGoodRatio;
        int int8 = timedRatioPolicy5.resetAfterNMillis;
        timedRatioPolicy5.onAltPulse();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.75f + "'", float7 == 0.75f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onBadPulse();
        java.lang.Throwable throwable11 = null;
        timedRatioPolicy5.onBadPulse(throwable11);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onAltPulse();
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder2.setFailAfterNBadResets((int) (byte) 0);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder2.setOpenAtGoodRatio(100.0d);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder6.setFailAfterNBadResets(0);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder10 = builder8.setCloseAtGoodRatio((double) (short) 10);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder12 = builder10.setFailAfterNBadResets((int) (short) 10);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder14 = builder10.setResetAfterNMillis((int) (byte) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        co.codecraft.jcircuit.Circuit.Listener listener6 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker7 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener6);
        circuitBreaker7.onGoodPulse();
        boolean boolean11 = circuitBreaker7.directTransition(1, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy6 = new co.codecraft.jcircuit.TimedRatioPolicy((double) (short) 0, (double) 1.0f, 2, (int) (byte) 10, (int) '4', 2);
        java.lang.Throwable throwable7 = null;
        timedRatioPolicy6.onBadPulse(throwable7);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder4.setMinSliceCount(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder6.setMinSliceCount((int) 'a');
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder10 = builder6.setCloseAtGoodRatio((double) 1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder12 = builder10.setCloseAtGoodRatio((double) (byte) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        int int1 = co.codecraft.jcircuit.Circuit.stringToState("CLOSED");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        int int9 = timedRatioPolicy5.resetAfterNMillis;
        int int10 = timedRatioPolicy5.minSliceCount;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        boolean boolean8 = circuitBreaker5.directTransition(10, true);
        boolean boolean11 = circuitBreaker5.directTransition(0, false);
        co.codecraft.jcircuit.TransitionPolicy transitionPolicy12 = circuitBreaker5.transitionPolicy;
        transitionPolicy12.afterDirectTransition((int) 'a', true);
        transitionPolicy12.afterDirectTransition((int) '4', true);
        transitionPolicy12.afterDirectTransition(100, true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(transitionPolicy12);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onBadPulse();
        directTransitionPolicy0.onAltPulse();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        boolean boolean2 = co.codecraft.jcircuit.Circuit.isValidTransition((int) 'a', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        java.lang.String str1 = co.codecraft.jcircuit.Circuit.stateToString((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FAILED" + "'", str1, "FAILED");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        int int2 = circuit1.getStateSnapshot();
        boolean boolean3 = circuit1.shouldValidate;
        circuit1.shouldValidate = false;
        co.codecraft.jcircuit.Circuit.Listener listener6 = circuit1.listener;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(listener6);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        int int2 = circuit1.getStateSnapshot();
        boolean boolean3 = circuit1.shouldValidate;
        circuit1.shouldValidate = false;
        boolean boolean6 = circuit1.shouldValidate;
        int int7 = circuit1.getStateSnapshot();
        boolean boolean8 = circuit1.shouldValidate;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        int int2 = circuit1.getStateSnapshot();
        circuit1.shouldValidate = true;
        boolean boolean7 = circuit1.transition(1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets((int) (byte) 100);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder2.setResetAfterNMillis((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder4.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: resetAfterNMillis must be >= 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder2.setFailAfterNBadResets((int) (byte) 0);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder2.setResetAfterNMillis((int) (short) -1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder6.setResetAfterNMillis((int) ' ');
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder10 = builder6.setFailAfterNBadResets(0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        float float7 = timedRatioPolicy5.closeAtGoodRatio;
        timedRatioPolicy5.afterDirectTransition((int) (byte) -1, false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.75f + "'", float7 == 0.75f);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        float float7 = timedRatioPolicy5.closeAtGoodRatio;
        timedRatioPolicy5.onAltPulse();
        int int9 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.afterDirectTransition(1, true);
        timedRatioPolicy5.onAltPulse();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.75f + "'", float7 == 0.75f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder2.setFailAfterNBadResets((int) (byte) 0);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder2.setCloseAtGoodRatio((double) 100.0f);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder2.setCloseAtGoodRatio((double) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder4.setOpenAtGoodRatio((double) 0L);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder6.setEvalEveryNMillis(2);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets((int) (byte) 100);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setFailAfterNBadResets((int) ' ');
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder0.setMinSliceCount(2);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder6.setResetAfterNMillis((int) (byte) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        java.lang.Throwable throwable6 = null;
        circuitBreaker5.onBadPulse(throwable6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onBadPulse();
        timedRatioPolicy5.afterDirectTransition(1, false);
        boolean boolean16 = timedRatioPolicy5.beforeDirectTransition(0, true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onGoodPulse();
        directTransitionPolicy0.onGoodPulse();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder2.setFailAfterNBadResets((int) (byte) 0);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder2.setCloseAtGoodRatio((double) 100.0f);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder6.setCloseAtGoodRatio((double) (-1L));
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder10 = builder6.setMinSliceCount(0);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder12 = builder10.setEvalEveryNMillis(2);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        float float9 = timedRatioPolicy5.closeAtGoodRatio;
        int int10 = timedRatioPolicy5.resetAfterNMillis;
        int int11 = timedRatioPolicy5.minSliceCount;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.75f + "'", float9 == 0.75f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.afterDirectTransition(0, true);
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.afterDirectTransition(1, false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        // The following exception was thrown during execution in test generation
        try {
            co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy6 = new co.codecraft.jcircuit.TimedRatioPolicy((double) (byte) -1, (double) 'a', (int) 'a', (int) (short) 100, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: openAtGoodRatio must be >= 0.0 and <= 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        boolean boolean2 = circuit1.shouldValidate;
        circuit1.shouldValidate = true;
        int int5 = circuit1.getStateSnapshot();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onGoodPulse();
        directTransitionPolicy0.onAltPulse();
        directTransitionPolicy0.onAltPulse();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        float float7 = timedRatioPolicy5.closeAtGoodRatio;
        timedRatioPolicy5.onAltPulse();
        int int9 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.afterDirectTransition((int) (byte) 10, true);
        float float13 = timedRatioPolicy5.closeAtGoodRatio;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.75f + "'", float7 == 0.75f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.75f + "'", float13 == 0.75f);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder2.setFailAfterNBadResets((int) (byte) 0);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder2.setOpenAtGoodRatio(100.0d);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder6.setFailAfterNBadResets(0);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder10 = builder6.setResetAfterNMillis((int) (byte) 1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder12 = builder10.setCloseAtGoodRatio((double) 0.75f);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        float float7 = timedRatioPolicy5.closeAtGoodRatio;
        timedRatioPolicy5.onAltPulse();
        java.lang.Throwable throwable9 = null;
        timedRatioPolicy5.onBadPulse(throwable9);
        float float11 = timedRatioPolicy5.openAtGoodRatio;
        java.lang.Class<?> wildcardClass12 = timedRatioPolicy5.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.75f + "'", float7 == 0.75f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onBadPulse();
        timedRatioPolicy5.afterDirectTransition(1, false);
        java.lang.Throwable throwable14 = null;
        timedRatioPolicy5.onBadPulse(throwable14);
        timedRatioPolicy5.afterDirectTransition(1, true);
        float float19 = timedRatioPolicy5.openAtGoodRatio;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        directTransitionPolicy0.onGoodPulse();
        boolean boolean7 = directTransitionPolicy0.beforeDirectTransition(0, true);
        directTransitionPolicy0.afterDirectTransition((int) (byte) -1, false);
        directTransitionPolicy0.afterDirectTransition((int) (byte) 100, true);
        directTransitionPolicy0.onAltPulse();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.lang.String str1 = co.codecraft.jcircuit.Circuit.stateToString((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLOSED" + "'", str1, "CLOSED");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onGoodPulse();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder2.setFailAfterNBadResets((int) (byte) 0);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder2.setOpenAtGoodRatio(100.0d);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder6.setFailAfterNBadResets(0);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder10 = builder8.setCloseAtGoodRatio((double) (short) 10);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder12 = builder8.setCloseAtGoodRatio((double) '4');
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder14 = builder8.setCloseAtGoodRatio((double) 1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder16 = builder14.setFailAfterNBadResets((int) (short) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        float float7 = timedRatioPolicy5.closeAtGoodRatio;
        timedRatioPolicy5.onAltPulse();
        int int9 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.afterDirectTransition((int) (byte) 10, true);
        timedRatioPolicy5.onBadPulse();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.75f + "'", float7 == 0.75f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onBadPulse();
        timedRatioPolicy5.afterDirectTransition(1, false);
        float float14 = timedRatioPolicy5.closeAtGoodRatio;
        float float15 = timedRatioPolicy5.openAtGoodRatio;
        int int16 = timedRatioPolicy5.evalEveryNMillis;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.75f + "'", float14 == 0.75f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder4.setMinSliceCount(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder4.setEvalEveryNMillis((int) (byte) -1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder10 = builder8.setEvalEveryNMillis((int) (short) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.afterDirectTransition(0, true);
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onAltPulse();
        int int15 = timedRatioPolicy5.failAfterNBadResets;
        float float16 = timedRatioPolicy5.closeAtGoodRatio;
        int int17 = timedRatioPolicy5.minSliceCount;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.75f + "'", float16 == 0.75f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable4 = null;
        directTransitionPolicy0.onBadPulse(throwable4);
        java.lang.Throwable throwable6 = null;
        directTransitionPolicy0.onBadPulse(throwable6);
        directTransitionPolicy0.onAltPulse();
        directTransitionPolicy0.onAltPulse();
        directTransitionPolicy0.onGoodPulse();
        directTransitionPolicy0.onAltPulse();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        boolean boolean4 = circuit1.transition(2, (int) (byte) -1);
        co.codecraft.jcircuit.Circuit.Listener listener5 = circuit1.listener;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(listener5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable4 = null;
        directTransitionPolicy0.onBadPulse(throwable4);
        java.lang.Throwable throwable6 = null;
        directTransitionPolicy0.onBadPulse(throwable6);
        java.lang.Throwable throwable8 = null;
        directTransitionPolicy0.onBadPulse(throwable8);
        directTransitionPolicy0.onAltPulse();
        directTransitionPolicy0.onGoodPulse();
        directTransitionPolicy0.onGoodPulse();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setOpenAtGoodRatio((double) 100);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder4.setResetAfterNMillis((int) '#');
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder6.setResetAfterNMillis((int) (short) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        int int2 = circuit1.getStateSnapshot();
        boolean boolean3 = circuit1.shouldValidate;
        circuit1.shouldValidate = false;
        boolean boolean6 = circuit1.shouldValidate;
        int int7 = circuit1.getStateSnapshot();
        circuit1.shouldValidate = true;
        circuit1.shouldValidate = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.lang.String str1 = co.codecraft.jcircuit.Circuit.stateToString((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FAILED" + "'", str1, "FAILED");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.lang.String str1 = co.codecraft.jcircuit.Circuit.stateToString(1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "OPEN" + "'", str1, "OPEN");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        float float10 = timedRatioPolicy5.closeAtGoodRatio;
        int int11 = timedRatioPolicy5.failAfterNBadResets;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.75f + "'", float10 == 0.75f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Class<?> wildcardClass1 = directTransitionPolicy0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        co.codecraft.jcircuit.Circuit.Listener listener6 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker7 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener6);
        circuitBreaker7.onGoodPulse();
        circuitBreaker7.onAltPulse();
        java.lang.Throwable throwable10 = null;
        circuitBreaker7.onBadPulse(throwable10);
        circuitBreaker7.onGoodPulse();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        circuitBreaker5.onGoodPulse();
        co.codecraft.jcircuit.TransitionPolicy transitionPolicy7 = circuitBreaker5.transitionPolicy;
        boolean boolean8 = circuitBreaker5.shouldTryNormalPath();
        java.lang.Throwable throwable9 = null;
        circuitBreaker5.onBadPulse(throwable9);
        org.junit.Assert.assertNotNull(transitionPolicy7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy6 = new co.codecraft.jcircuit.TimedRatioPolicy((double) (short) 0, (double) 1.0f, 2, (int) (byte) 10, (int) '4', 2);
        timedRatioPolicy6.afterDirectTransition((int) (byte) -1, false);
        boolean boolean12 = timedRatioPolicy6.beforeDirectTransition((int) (byte) 100, false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        boolean boolean8 = circuitBreaker5.directTransition(10, true);
        boolean boolean11 = circuitBreaker5.directTransition(0, false);
        boolean boolean14 = circuitBreaker5.directTransition(3, false);
        co.codecraft.jcircuit.Circuit circuit15 = circuitBreaker5.circuit;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(circuit15);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        circuit1.shouldValidate = true;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = circuit1.transition((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can't transition from state 1 to 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        int int2 = circuit1.getStateSnapshot();
        boolean boolean3 = circuit1.shouldValidate;
        circuit1.shouldValidate = false;
        boolean boolean8 = circuit1.transition((int) '4', (int) (short) 1);
        co.codecraft.jcircuit.Circuit.Listener listener9 = circuit1.listener;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(listener9);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable4 = null;
        directTransitionPolicy0.onBadPulse(throwable4);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable7 = null;
        directTransitionPolicy0.onBadPulse(throwable7);
        directTransitionPolicy0.onAltPulse();
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable11 = null;
        directTransitionPolicy0.onBadPulse(throwable11);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setOpenAtGoodRatio((double) 100);
        // The following exception was thrown during execution in test generation
        try {
            co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder4.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: openAtGoodRatio must be >= 0.0 and <= 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onBadPulse();
        timedRatioPolicy5.afterDirectTransition(1, false);
        java.lang.Throwable throwable14 = null;
        timedRatioPolicy5.onBadPulse(throwable14);
        int int16 = timedRatioPolicy5.failAfterNBadResets;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.afterDirectTransition(0, true);
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onAltPulse();
        java.lang.Throwable throwable15 = null;
        timedRatioPolicy5.onBadPulse(throwable15);
        int int17 = timedRatioPolicy5.evalEveryNMillis;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.lang.String str1 = co.codecraft.jcircuit.Circuit.stateToString((int) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLOSED" + "'", str1, "CLOSED");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        int int2 = circuit1.getStateSnapshot();
        boolean boolean3 = circuit1.shouldValidate;
        circuit1.shouldValidate = false;
        boolean boolean8 = circuit1.transition((int) '4', (int) (short) 1);
        boolean boolean9 = circuit1.shouldValidate;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable4 = null;
        directTransitionPolicy0.onBadPulse(throwable4);
        java.lang.Throwable throwable6 = null;
        directTransitionPolicy0.onBadPulse(throwable6);
        java.lang.Throwable throwable8 = null;
        directTransitionPolicy0.onBadPulse(throwable8);
        boolean boolean12 = directTransitionPolicy0.beforeDirectTransition((int) (byte) 10, true);
        java.lang.Throwable throwable13 = null;
        directTransitionPolicy0.onBadPulse(throwable13);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        java.lang.String str1 = co.codecraft.jcircuit.Circuit.stateToString((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLOSED" + "'", str1, "CLOSED");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        circuitBreaker5.onGoodPulse();
        boolean boolean7 = circuitBreaker5.shouldTryNormalPath();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        float float7 = timedRatioPolicy5.closeAtGoodRatio;
        int int8 = timedRatioPolicy5.resetAfterNMillis;
        timedRatioPolicy5.onGoodPulse();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.75f + "'", float7 == 0.75f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        boolean boolean2 = circuit1.shouldValidate;
        circuit1.shouldValidate = true;
        circuit1.shouldValidate = false;
        circuit1.shouldValidate = false;
        co.codecraft.jcircuit.Circuit.Listener listener9 = circuit1.listener;
        co.codecraft.jcircuit.Circuit.Listener listener10 = circuit1.listener;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(listener9);
        org.junit.Assert.assertNull(listener10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        // The following exception was thrown during execution in test generation
        try {
            co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy6 = new co.codecraft.jcircuit.TimedRatioPolicy((double) (short) 1, (double) 0L, 10, 0, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: evalEveryNMillis must be >= 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        float float7 = timedRatioPolicy5.closeAtGoodRatio;
        timedRatioPolicy5.onAltPulse();
        int int9 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.afterDirectTransition((int) (byte) 10, true);
        timedRatioPolicy5.onGoodPulse();
        timedRatioPolicy5.onAltPulse();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.75f + "'", float7 == 0.75f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setOpenAtGoodRatio((double) 100);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder4.setResetAfterNMillis((int) '#');
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder4.setResetAfterNMillis(3);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder10 = builder4.setEvalEveryNMillis(2);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder12 = builder4.setEvalEveryNMillis((int) (byte) -1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        boolean boolean8 = circuitBreaker5.directTransition(10, true);
        boolean boolean11 = circuitBreaker5.directTransition(0, false);
        co.codecraft.jcircuit.Circuit circuit12 = circuitBreaker5.circuit;
        boolean boolean13 = circuitBreaker5.shouldTryNormalPath();
        co.codecraft.jcircuit.TransitionPolicy transitionPolicy14 = circuitBreaker5.transitionPolicy;
        co.codecraft.jcircuit.Circuit circuit15 = circuitBreaker5.circuit;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(circuit12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(transitionPolicy14);
        org.junit.Assert.assertNotNull(circuit15);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets((int) (byte) 100);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy3 = builder2.build();
        timedRatioPolicy3.onAltPulse();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(timedRatioPolicy3);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        int int10 = timedRatioPolicy5.resetAfterNMillis;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onBadPulse();
        timedRatioPolicy5.afterDirectTransition(1, false);
        java.lang.Throwable throwable14 = null;
        timedRatioPolicy5.onBadPulse(throwable14);
        timedRatioPolicy5.afterDirectTransition(1, true);
        java.lang.Throwable throwable19 = null;
        timedRatioPolicy5.onBadPulse(throwable19);
        int int21 = timedRatioPolicy5.failAfterNBadResets;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onBadPulse();
        float float8 = timedRatioPolicy5.closeAtGoodRatio;
        timedRatioPolicy5.onGoodPulse();
        java.lang.Throwable throwable10 = null;
        timedRatioPolicy5.onBadPulse(throwable10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.75f + "'", float8 == 0.75f);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onBadPulse();
        timedRatioPolicy5.onAltPulse();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        java.lang.Throwable throwable8 = null;
        timedRatioPolicy5.onBadPulse(throwable8);
        java.lang.Throwable throwable10 = null;
        timedRatioPolicy5.onBadPulse(throwable10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onGoodPulse();
        directTransitionPolicy0.onAltPulse();
        directTransitionPolicy0.onGoodPulse();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        boolean boolean2 = circuit1.shouldValidate;
        circuit1.shouldValidate = true;
        circuit1.shouldValidate = false;
        circuit1.shouldValidate = false;
        co.codecraft.jcircuit.Circuit.Listener listener9 = circuit1.listener;
        int int10 = circuit1.getStateSnapshot();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(listener9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        float float7 = timedRatioPolicy5.closeAtGoodRatio;
        timedRatioPolicy5.onAltPulse();
        int int9 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.afterDirectTransition(0, false);
        timedRatioPolicy5.onAltPulse();
        int int14 = timedRatioPolicy5.failAfterNBadResets;
        timedRatioPolicy5.onAltPulse();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.75f + "'", float7 == 0.75f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder2.setFailAfterNBadResets((int) (byte) 0);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder2.setCloseAtGoodRatio((double) 100.0f);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder6.setResetAfterNMillis(3);
        // The following exception was thrown during execution in test generation
        try {
            co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy9 = builder8.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: closeAtGoodRatio must be >= 0.0 and <= 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        circuit1.shouldValidate = true;
        boolean boolean4 = circuit1.shouldValidate;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        boolean boolean2 = circuit1.shouldValidate;
        circuit1.shouldValidate = true;
        circuit1.shouldValidate = false;
        circuit1.shouldValidate = false;
        co.codecraft.jcircuit.Circuit.Listener listener9 = circuit1.listener;
        boolean boolean12 = circuit1.transition((int) ' ', 0);
        circuit1.shouldValidate = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(listener9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        int int2 = circuit1.getStateSnapshot();
        circuit1.shouldValidate = true;
        co.codecraft.jcircuit.Circuit.Listener listener5 = circuit1.listener;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(listener5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setOpenAtGoodRatio((double) 100);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder4.setResetAfterNMillis((int) '#');
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder4.setResetAfterNMillis(3);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder10 = builder8.setMinSliceCount((int) '4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder2.setFailAfterNBadResets((int) (byte) 0);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder2.setOpenAtGoodRatio(100.0d);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder6.setFailAfterNBadResets(0);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder10 = builder8.setOpenAtGoodRatio((double) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onBadPulse();
        int int7 = timedRatioPolicy5.resetAfterNMillis;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy6 = new co.codecraft.jcircuit.TimedRatioPolicy((double) (short) 0, (double) 1.0f, 2, (int) (byte) 10, (int) '4', 2);
        float float7 = timedRatioPolicy6.openAtGoodRatio;
        timedRatioPolicy6.onGoodPulse();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable4 = null;
        directTransitionPolicy0.onBadPulse(throwable4);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable7 = null;
        directTransitionPolicy0.onBadPulse(throwable7);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        int int2 = circuit1.getStateSnapshot();
        circuit1.shouldValidate = true;
        boolean boolean5 = circuit1.shouldValidate;
        co.codecraft.jcircuit.Circuit.Listener listener6 = circuit1.listener;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(listener6);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onBadPulse();
        directTransitionPolicy0.onGoodPulse();
        directTransitionPolicy0.onAltPulse();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.afterDirectTransition((int) (byte) 1, false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onAltPulse();
        java.lang.Throwable throwable4 = null;
        directTransitionPolicy0.onBadPulse(throwable4);
        directTransitionPolicy0.onGoodPulse();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        float float9 = timedRatioPolicy5.closeAtGoodRatio;
        timedRatioPolicy5.onAltPulse();
        co.codecraft.jcircuit.Circuit.Listener listener11 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker12 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) timedRatioPolicy5, listener11);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.75f + "'", float9 == 0.75f);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable4 = null;
        directTransitionPolicy0.onBadPulse(throwable4);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable7 = null;
        directTransitionPolicy0.onBadPulse(throwable7);
        directTransitionPolicy0.onAltPulse();
        directTransitionPolicy0.onGoodPulse();
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable12 = null;
        directTransitionPolicy0.onBadPulse(throwable12);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.afterDirectTransition(0, true);
        timedRatioPolicy5.onAltPulse();
        int int14 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.afterDirectTransition(0, false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        float float7 = timedRatioPolicy5.closeAtGoodRatio;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onAltPulse();
        int int10 = timedRatioPolicy5.minSliceCount;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.75f + "'", float7 == 0.75f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        boolean boolean8 = circuitBreaker5.directTransition(10, true);
        boolean boolean11 = circuitBreaker5.directTransition(0, false);
        co.codecraft.jcircuit.TransitionPolicy transitionPolicy12 = circuitBreaker5.transitionPolicy;
        co.codecraft.jcircuit.Circuit circuit13 = circuitBreaker5.circuit;
        boolean boolean14 = circuitBreaker5.shouldTryNormalPath();
        circuitBreaker5.onGoodPulse();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(transitionPolicy12);
        org.junit.Assert.assertNotNull(circuit13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable4 = null;
        directTransitionPolicy0.onBadPulse(throwable4);
        directTransitionPolicy0.onAltPulse();
        boolean boolean9 = directTransitionPolicy0.beforeDirectTransition((int) (short) 10, false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        java.lang.Throwable throwable4 = null;
        directTransitionPolicy0.onBadPulse(throwable4);
        directTransitionPolicy0.onAltPulse();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.evalEveryNMillis;
        int int8 = timedRatioPolicy5.failAfterNBadResets;
        int int9 = timedRatioPolicy5.evalEveryNMillis;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        boolean boolean2 = circuit1.shouldValidate;
        circuit1.shouldValidate = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onBadPulse();
        java.lang.Throwable throwable4 = null;
        directTransitionPolicy0.onBadPulse(throwable4);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        boolean boolean8 = circuitBreaker5.directTransition(10, true);
        circuitBreaker5.onGoodPulse();
        circuitBreaker5.onAltPulse();
        boolean boolean13 = circuitBreaker5.directTransition((int) (byte) 100, true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets((int) (byte) 100);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy3 = builder2.build();
        timedRatioPolicy3.afterDirectTransition((int) (short) 10, false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(timedRatioPolicy3);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onBadPulse();
        timedRatioPolicy5.afterDirectTransition(1, false);
        co.codecraft.jcircuit.Circuit.Listener listener14 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker15 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) timedRatioPolicy5, listener14);
        int int16 = timedRatioPolicy5.minSliceCount;
        boolean boolean19 = timedRatioPolicy5.beforeDirectTransition((int) (byte) -1, false);
        boolean boolean22 = timedRatioPolicy5.beforeDirectTransition((int) (short) -1, true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets((int) (byte) 100);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setFailAfterNBadResets((int) ' ');
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder0.setMinSliceCount((int) (short) 0);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder6.setOpenAtGoodRatio((double) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder2.setFailAfterNBadResets((int) (byte) 0);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder2.setOpenAtGoodRatio(100.0d);
        // The following exception was thrown during execution in test generation
        try {
            co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy7 = builder2.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: openAtGoodRatio must be >= 0.0 and <= 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        boolean boolean2 = circuit1.shouldValidate;
        circuit1.shouldValidate = true;
        co.codecraft.jcircuit.Circuit.Listener listener5 = circuit1.listener;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(listener5);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        boolean boolean8 = circuitBreaker5.directTransition(10, true);
        boolean boolean11 = circuitBreaker5.directTransition(0, false);
        co.codecraft.jcircuit.Circuit circuit12 = circuitBreaker5.circuit;
        boolean boolean13 = circuitBreaker5.shouldTryNormalPath();
        circuitBreaker5.onAltPulse();
        co.codecraft.jcircuit.TransitionPolicy transitionPolicy15 = circuitBreaker5.transitionPolicy;
        java.lang.Throwable throwable16 = null;
        transitionPolicy15.onBadPulse(throwable16);
        java.lang.Class<?> wildcardClass18 = transitionPolicy15.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(circuit12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(transitionPolicy15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets((int) (byte) 100);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy3 = builder2.build();
        timedRatioPolicy3.onBadPulse();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(timedRatioPolicy3);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        float float7 = timedRatioPolicy5.closeAtGoodRatio;
        timedRatioPolicy5.onAltPulse();
        int int9 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onGoodPulse();
        boolean boolean13 = timedRatioPolicy5.beforeDirectTransition(2, true);
        boolean boolean16 = timedRatioPolicy5.beforeDirectTransition(1, false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.75f + "'", float7 == 0.75f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy6 = new co.codecraft.jcircuit.TimedRatioPolicy((double) (short) 0, (double) 1.0f, 2, (int) (byte) 10, (int) '4', 2);
        timedRatioPolicy6.afterDirectTransition(100, false);
        float float10 = timedRatioPolicy6.closeAtGoodRatio;
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        boolean boolean8 = circuitBreaker5.directTransition(10, true);
        boolean boolean11 = circuitBreaker5.directTransition(0, false);
        co.codecraft.jcircuit.Circuit circuit12 = circuitBreaker5.circuit;
        boolean boolean13 = circuitBreaker5.shouldTryNormalPath();
        circuitBreaker5.onAltPulse();
        circuitBreaker5.onGoodPulse();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(circuit12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder2.setFailAfterNBadResets((int) (byte) 0);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder2.setOpenAtGoodRatio(100.0d);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder6.setFailAfterNBadResets(0);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder10 = builder8.setCloseAtGoodRatio((double) (short) 10);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder12 = builder8.setCloseAtGoodRatio((double) '4');
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder14 = builder12.setFailAfterNBadResets((-1));
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder16 = builder12.setOpenAtGoodRatio((double) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        int int9 = timedRatioPolicy5.resetAfterNMillis;
        int int10 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.afterDirectTransition((int) (short) -1, false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onBadPulse();
        timedRatioPolicy5.afterDirectTransition(1, false);
        java.lang.Throwable throwable14 = null;
        timedRatioPolicy5.onBadPulse(throwable14);
        timedRatioPolicy5.afterDirectTransition(1, true);
        java.lang.Throwable throwable19 = null;
        timedRatioPolicy5.onBadPulse(throwable19);
        timedRatioPolicy5.onAltPulse();
        boolean boolean24 = timedRatioPolicy5.beforeDirectTransition(1, true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        java.lang.Throwable throwable8 = null;
        timedRatioPolicy5.onBadPulse(throwable8);
        float float10 = timedRatioPolicy5.openAtGoodRatio;
        timedRatioPolicy5.afterDirectTransition((int) (short) 100, false);
        float float14 = timedRatioPolicy5.openAtGoodRatio;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        boolean boolean8 = circuitBreaker5.directTransition(10, true);
        circuitBreaker5.onGoodPulse();
        circuitBreaker5.onGoodPulse();
        boolean boolean13 = circuitBreaker5.directTransition((int) (short) 10, true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy6 = new co.codecraft.jcircuit.TimedRatioPolicy((double) (short) 0, (double) 1.0f, 2, (int) (byte) 10, (int) '4', 2);
        timedRatioPolicy6.afterDirectTransition(100, false);
        timedRatioPolicy6.afterDirectTransition(10, true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        // The following exception was thrown during execution in test generation
        try {
            co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy6 = new co.codecraft.jcircuit.TimedRatioPolicy(1.0d, (double) (-1.0f), (int) (byte) 1, (-1), 3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: closeAtGoodRatio must be >= 0.0 and <= 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.evalEveryNMillis;
        int int8 = timedRatioPolicy5.failAfterNBadResets;
        int int9 = timedRatioPolicy5.failAfterNBadResets;
        java.lang.Throwable throwable10 = null;
        timedRatioPolicy5.onBadPulse(throwable10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder2.setFailAfterNBadResets((int) (byte) 0);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder2.setOpenAtGoodRatio(100.0d);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder6.setFailAfterNBadResets(0);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder10 = builder8.setCloseAtGoodRatio((double) (short) 10);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder12 = builder8.setCloseAtGoodRatio((double) '4');
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder14 = builder8.setFailAfterNBadResets((int) (short) -1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder16 = builder14.setOpenAtGoodRatio((double) 1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder18 = builder14.setMinSliceCount((int) (short) 1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder20 = builder18.setEvalEveryNMillis((int) '#');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        boolean boolean4 = circuit1.transition((int) (short) 0, 1);
        circuit1.shouldValidate = false;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        java.lang.Throwable throwable4 = null;
        directTransitionPolicy0.onBadPulse(throwable4);
        boolean boolean8 = directTransitionPolicy0.beforeDirectTransition((int) 'a', true);
        directTransitionPolicy0.onAltPulse();
        boolean boolean12 = directTransitionPolicy0.beforeDirectTransition((int) (byte) 10, false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        circuitBreaker5.onGoodPulse();
        co.codecraft.jcircuit.TransitionPolicy transitionPolicy7 = circuitBreaker5.transitionPolicy;
        java.lang.Class<?> wildcardClass8 = transitionPolicy7.getClass();
        org.junit.Assert.assertNotNull(transitionPolicy7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onBadPulse();
        timedRatioPolicy5.afterDirectTransition((int) (short) 10, true);
        timedRatioPolicy5.afterDirectTransition((int) 'a', true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onBadPulse();
        timedRatioPolicy5.afterDirectTransition(1, false);
        co.codecraft.jcircuit.Circuit.Listener listener14 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker15 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) timedRatioPolicy5, listener14);
        int int16 = timedRatioPolicy5.minSliceCount;
        timedRatioPolicy5.afterDirectTransition((int) (short) 100, false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        co.codecraft.jcircuit.Circuit.Listener listener6 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker7 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener6);
        circuitBreaker7.onGoodPulse();
        circuitBreaker7.onAltPulse();
        co.codecraft.jcircuit.Circuit circuit10 = circuitBreaker7.circuit;
        org.junit.Assert.assertNotNull(circuit10);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        boolean boolean3 = directTransitionPolicy0.beforeDirectTransition((int) (short) 0, false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        int int1 = co.codecraft.jcircuit.Circuit.stringToState("RESETTING");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        java.lang.Class<?> wildcardClass3 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onBadPulse();
        timedRatioPolicy5.afterDirectTransition(1, false);
        java.lang.Throwable throwable14 = null;
        timedRatioPolicy5.onBadPulse(throwable14);
        int int16 = timedRatioPolicy5.minSliceCount;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        boolean boolean8 = circuitBreaker5.directTransition(10, true);
        boolean boolean11 = circuitBreaker5.directTransition(0, false);
        co.codecraft.jcircuit.Circuit circuit12 = circuitBreaker5.circuit;
        boolean boolean13 = circuitBreaker5.shouldTryNormalPath();
        java.lang.Throwable throwable14 = null;
        circuitBreaker5.onBadPulse(throwable14);
        boolean boolean18 = circuitBreaker5.directTransition((int) (byte) 0, false);
        boolean boolean19 = circuitBreaker5.shouldTryNormalPath();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(circuit12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable4 = null;
        directTransitionPolicy0.onBadPulse(throwable4);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable7 = null;
        directTransitionPolicy0.onBadPulse(throwable7);
        directTransitionPolicy0.onAltPulse();
        java.lang.Throwable throwable10 = null;
        directTransitionPolicy0.onBadPulse(throwable10);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder4.setMinSliceCount(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder4.setFailAfterNBadResets((int) (short) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        boolean boolean8 = circuitBreaker5.directTransition(10, true);
        boolean boolean11 = circuitBreaker5.directTransition(0, false);
        boolean boolean12 = circuitBreaker5.shouldTryNormalPath();
        java.lang.Throwable throwable13 = null;
        circuitBreaker5.onBadPulse(throwable13);
        boolean boolean17 = circuitBreaker5.directTransition(100, false);
        boolean boolean20 = circuitBreaker5.directTransition((int) (byte) 1, false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        boolean boolean8 = circuitBreaker5.directTransition(10, true);
        boolean boolean11 = circuitBreaker5.directTransition(0, false);
        boolean boolean12 = circuitBreaker5.shouldTryNormalPath();
        circuitBreaker5.onAltPulse();
        boolean boolean14 = circuitBreaker5.shouldTryNormalPath();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        float float7 = timedRatioPolicy5.closeAtGoodRatio;
        timedRatioPolicy5.onAltPulse();
        int int9 = timedRatioPolicy5.minSliceCount;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.75f + "'", float7 == 0.75f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onBadPulse();
        co.codecraft.jcircuit.Circuit.Listener listener8 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker9 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) timedRatioPolicy5, listener8);
        java.lang.Throwable throwable10 = null;
        circuitBreaker9.onBadPulse(throwable10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy6 = new co.codecraft.jcircuit.TimedRatioPolicy((double) (short) 0, (double) 1.0f, 2, (int) (byte) 10, (int) '4', 2);
        int int7 = timedRatioPolicy6.minSliceCount;
        java.lang.Class<?> wildcardClass8 = timedRatioPolicy6.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        java.lang.Throwable throwable8 = null;
        timedRatioPolicy5.onBadPulse(throwable8);
        float float10 = timedRatioPolicy5.openAtGoodRatio;
        boolean boolean13 = timedRatioPolicy5.beforeDirectTransition((int) (short) 1, true);
        timedRatioPolicy5.afterDirectTransition(0, true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        boolean boolean8 = circuitBreaker5.directTransition(10, true);
        boolean boolean11 = circuitBreaker5.directTransition(0, false);
        java.lang.Throwable throwable12 = null;
        circuitBreaker5.onBadPulse(throwable12);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.afterDirectTransition(0, true);
        timedRatioPolicy5.onAltPulse();
        boolean boolean16 = timedRatioPolicy5.beforeDirectTransition((int) '4', true);
        int int17 = timedRatioPolicy5.resetAfterNMillis;
        boolean boolean20 = timedRatioPolicy5.beforeDirectTransition((int) (byte) 100, true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onBadPulse();
        timedRatioPolicy5.afterDirectTransition(1, false);
        java.lang.Throwable throwable14 = null;
        timedRatioPolicy5.onBadPulse(throwable14);
        timedRatioPolicy5.afterDirectTransition(1, true);
        java.lang.Throwable throwable19 = null;
        timedRatioPolicy5.onBadPulse(throwable19);
        timedRatioPolicy5.onAltPulse();
        int int22 = timedRatioPolicy5.failAfterNBadResets;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onBadPulse();
        timedRatioPolicy5.afterDirectTransition(1, false);
        java.lang.Throwable throwable14 = null;
        timedRatioPolicy5.onBadPulse(throwable14);
        timedRatioPolicy5.afterDirectTransition(1, true);
        java.lang.Throwable throwable19 = null;
        timedRatioPolicy5.onBadPulse(throwable19);
        co.codecraft.jcircuit.Circuit.Listener listener21 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker22 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) timedRatioPolicy5, listener21);
        int int23 = timedRatioPolicy5.minSliceCount;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder2.setEvalEveryNMillis(10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        co.codecraft.jcircuit.Circuit.Listener listener6 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker7 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener6);
        java.lang.Throwable throwable8 = null;
        directTransitionPolicy0.onBadPulse(throwable8);
        java.lang.Throwable throwable10 = null;
        directTransitionPolicy0.onBadPulse(throwable10);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onBadPulse();
        timedRatioPolicy5.afterDirectTransition(1, false);
        java.lang.Throwable throwable14 = null;
        timedRatioPolicy5.onBadPulse(throwable14);
        float float16 = timedRatioPolicy5.closeAtGoodRatio;
        timedRatioPolicy5.onGoodPulse();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.75f + "'", float16 == 0.75f);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.afterDirectTransition(0, true);
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onGoodPulse();
        int int16 = timedRatioPolicy5.evalEveryNMillis;
        int int17 = timedRatioPolicy5.evalEveryNMillis;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder2.setFailAfterNBadResets((int) (byte) 0);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder4.build();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder7 = builder4.setEvalEveryNMillis(2);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder9 = builder7.setCloseAtGoodRatio((-1.0d));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onAltPulse();
        java.lang.Throwable throwable4 = null;
        directTransitionPolicy0.onBadPulse(throwable4);
        java.lang.Throwable throwable6 = null;
        directTransitionPolicy0.onBadPulse(throwable6);
        java.lang.Throwable throwable8 = null;
        directTransitionPolicy0.onBadPulse(throwable8);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        boolean boolean2 = circuit1.shouldValidate;
        circuit1.shouldValidate = true;
        circuit1.shouldValidate = false;
        boolean boolean7 = circuit1.shouldValidate;
        boolean boolean8 = circuit1.shouldValidate;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        boolean boolean4 = circuit1.transition(2, (int) (byte) -1);
        boolean boolean5 = circuit1.shouldValidate;
        boolean boolean6 = circuit1.shouldValidate;
        circuit1.shouldValidate = false;
        co.codecraft.jcircuit.Circuit.Listener listener9 = circuit1.listener;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(listener9);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.afterDirectTransition(0, true);
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onGoodPulse();
        java.lang.Throwable throwable16 = null;
        timedRatioPolicy5.onBadPulse(throwable16);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        circuitBreaker5.onGoodPulse();
        co.codecraft.jcircuit.TransitionPolicy transitionPolicy7 = circuitBreaker5.transitionPolicy;
        java.lang.Throwable throwable8 = null;
        circuitBreaker5.onBadPulse(throwable8);
        java.lang.Throwable throwable10 = null;
        circuitBreaker5.onBadPulse(throwable10);
        org.junit.Assert.assertNotNull(transitionPolicy7);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.afterDirectTransition(0, true);
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onGoodPulse();
        int int16 = timedRatioPolicy5.evalEveryNMillis;
        boolean boolean19 = timedRatioPolicy5.beforeDirectTransition((int) (short) 10, true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder4.setMinSliceCount(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder4.setFailAfterNBadResets((int) (byte) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onBadPulse();
        timedRatioPolicy5.afterDirectTransition(1, false);
        co.codecraft.jcircuit.Circuit.Listener listener14 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker15 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) timedRatioPolicy5, listener14);
        int int16 = timedRatioPolicy5.minSliceCount;
        java.lang.Class<?> wildcardClass17 = timedRatioPolicy5.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable4 = null;
        directTransitionPolicy0.onBadPulse(throwable4);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable7 = null;
        directTransitionPolicy0.onBadPulse(throwable7);
        directTransitionPolicy0.onAltPulse();
        directTransitionPolicy0.onGoodPulse();
        directTransitionPolicy0.onGoodPulse();
        boolean boolean14 = directTransitionPolicy0.beforeDirectTransition((int) '4', false);
        java.lang.Throwable throwable15 = null;
        directTransitionPolicy0.onBadPulse(throwable15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onBadPulse();
        timedRatioPolicy5.afterDirectTransition(1, false);
        co.codecraft.jcircuit.Circuit.Listener listener14 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker15 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) timedRatioPolicy5, listener14);
        float float16 = timedRatioPolicy5.closeAtGoodRatio;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.75f + "'", float16 == 0.75f);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.minSliceCount;
        timedRatioPolicy5.onGoodPulse();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        boolean boolean8 = circuitBreaker5.directTransition(10, true);
        boolean boolean11 = circuitBreaker5.directTransition(0, false);
        co.codecraft.jcircuit.Circuit circuit12 = circuitBreaker5.circuit;
        boolean boolean13 = circuitBreaker5.shouldTryNormalPath();
        circuitBreaker5.onAltPulse();
        co.codecraft.jcircuit.TransitionPolicy transitionPolicy15 = circuitBreaker5.transitionPolicy;
        boolean boolean18 = circuitBreaker5.directTransition((int) (short) 10, true);
        boolean boolean21 = circuitBreaker5.directTransition((int) (byte) 1, true);
        java.lang.Throwable throwable22 = null;
        circuitBreaker5.onBadPulse(throwable22);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(circuit12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(transitionPolicy15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable4 = null;
        directTransitionPolicy0.onBadPulse(throwable4);
        java.lang.Throwable throwable6 = null;
        directTransitionPolicy0.onBadPulse(throwable6);
        java.lang.Throwable throwable8 = null;
        directTransitionPolicy0.onBadPulse(throwable8);
        directTransitionPolicy0.onAltPulse();
        directTransitionPolicy0.onGoodPulse();
        directTransitionPolicy0.afterDirectTransition((int) (byte) 100, true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy6 = new co.codecraft.jcircuit.TimedRatioPolicy((double) (short) 0, (double) 1.0f, 2, (int) (byte) 10, (int) '4', 2);
        float float7 = timedRatioPolicy6.openAtGoodRatio;
        int int8 = timedRatioPolicy6.minSliceCount;
        int int9 = timedRatioPolicy6.evalEveryNMillis;
        timedRatioPolicy6.onAltPulse();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onGoodPulse();
        directTransitionPolicy0.onBadPulse();
        java.lang.Throwable throwable5 = null;
        directTransitionPolicy0.onBadPulse(throwable5);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        boolean boolean2 = circuit1.shouldValidate;
        circuit1.shouldValidate = true;
        circuit1.shouldValidate = false;
        circuit1.shouldValidate = false;
        co.codecraft.jcircuit.Circuit.Listener listener9 = circuit1.listener;
        circuit1.shouldValidate = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(listener9);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        boolean boolean8 = circuitBreaker5.directTransition(10, true);
        boolean boolean11 = circuitBreaker5.directTransition(0, false);
        co.codecraft.jcircuit.Circuit circuit12 = circuitBreaker5.circuit;
        boolean boolean13 = circuitBreaker5.shouldTryNormalPath();
        circuitBreaker5.onAltPulse();
        co.codecraft.jcircuit.TransitionPolicy transitionPolicy15 = circuitBreaker5.transitionPolicy;
        co.codecraft.jcircuit.Circuit circuit16 = circuitBreaker5.circuit;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(circuit12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(transitionPolicy15);
        org.junit.Assert.assertNotNull(circuit16);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        float float7 = timedRatioPolicy5.closeAtGoodRatio;
        timedRatioPolicy5.onAltPulse();
        int int9 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.afterDirectTransition(0, false);
        timedRatioPolicy5.onAltPulse();
        co.codecraft.jcircuit.Circuit.Listener listener14 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker15 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) timedRatioPolicy5, listener14);
        int int16 = timedRatioPolicy5.resetAfterNMillis;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.75f + "'", float7 == 0.75f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        int int2 = circuit1.getStateSnapshot();
        circuit1.shouldValidate = true;
        circuit1.shouldValidate = true;
        int int7 = circuit1.getStateSnapshot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder4.setMinSliceCount(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder6.setOpenAtGoodRatio((double) 10);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder10 = builder6.setOpenAtGoodRatio((double) (-1L));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        circuit1.shouldValidate = true;
        boolean boolean6 = circuit1.transition((int) (byte) 10, 3);
        int int7 = circuit1.getStateSnapshot();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        directTransitionPolicy0.onGoodPulse();
        boolean boolean7 = directTransitionPolicy0.beforeDirectTransition(0, true);
        directTransitionPolicy0.afterDirectTransition((int) (byte) -1, false);
        directTransitionPolicy0.onAltPulse();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        boolean boolean8 = circuitBreaker5.directTransition(10, true);
        boolean boolean11 = circuitBreaker5.directTransition(0, false);
        co.codecraft.jcircuit.Circuit circuit12 = circuitBreaker5.circuit;
        boolean boolean13 = circuitBreaker5.shouldTryNormalPath();
        circuitBreaker5.onAltPulse();
        co.codecraft.jcircuit.TransitionPolicy transitionPolicy15 = circuitBreaker5.transitionPolicy;
        boolean boolean18 = circuitBreaker5.directTransition((int) (short) 10, true);
        circuitBreaker5.onAltPulse();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(circuit12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(transitionPolicy15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.afterDirectTransition(0, true);
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onAltPulse();
        float float15 = timedRatioPolicy5.closeAtGoodRatio;
        java.lang.Throwable throwable16 = null;
        timedRatioPolicy5.onBadPulse(throwable16);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.75f + "'", float15 == 0.75f);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy6 = new co.codecraft.jcircuit.TimedRatioPolicy((double) (short) 0, (double) 1.0f, 2, (int) (byte) 10, (int) '4', 2);
        int int7 = timedRatioPolicy6.minSliceCount;
        boolean boolean10 = timedRatioPolicy6.beforeDirectTransition((int) ' ', false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onBadPulse();
        timedRatioPolicy5.afterDirectTransition((int) (short) 10, true);
        float float11 = timedRatioPolicy5.openAtGoodRatio;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        co.codecraft.jcircuit.Circuit.Listener listener4 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker5 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener4);
        boolean boolean8 = circuitBreaker5.directTransition(10, true);
        boolean boolean11 = circuitBreaker5.directTransition(0, false);
        co.codecraft.jcircuit.Circuit circuit12 = circuitBreaker5.circuit;
        co.codecraft.jcircuit.TransitionPolicy transitionPolicy13 = circuitBreaker5.transitionPolicy;
        co.codecraft.jcircuit.TransitionPolicy transitionPolicy14 = circuitBreaker5.transitionPolicy;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(circuit12);
        org.junit.Assert.assertNotNull(transitionPolicy13);
        org.junit.Assert.assertNotNull(transitionPolicy14);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder6 = builder4.setMinSliceCount(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder8 = builder6.setMinSliceCount((int) 'a');
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder10 = builder6.setResetAfterNMillis((int) 'a');
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy11 = builder10.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(timedRatioPolicy11);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.afterDirectTransition(0, true);
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onAltPulse();
        int int15 = timedRatioPolicy5.failAfterNBadResets;
        float float16 = timedRatioPolicy5.closeAtGoodRatio;
        int int17 = timedRatioPolicy5.evalEveryNMillis;
        float float18 = timedRatioPolicy5.openAtGoodRatio;
        timedRatioPolicy5.onGoodPulse();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.75f + "'", float16 == 0.75f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        int int2 = circuit1.getStateSnapshot();
        circuit1.shouldValidate = true;
        int int5 = circuit1.getStateSnapshot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder2.setFailAfterNBadResets((int) (byte) 0);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder4.build();
        float float6 = timedRatioPolicy5.closeAtGoodRatio;
        boolean boolean9 = timedRatioPolicy5.beforeDirectTransition((int) (short) -1, false);
        boolean boolean12 = timedRatioPolicy5.beforeDirectTransition((int) (short) 1, false);
        timedRatioPolicy5.onAltPulse();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.75f + "'", float6 == 0.75f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        float float7 = timedRatioPolicy5.closeAtGoodRatio;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onAltPulse();
        int int10 = timedRatioPolicy5.evalEveryNMillis;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.75f + "'", float7 == 0.75f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets((int) (byte) 100);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy3 = builder2.build();
        int int4 = timedRatioPolicy3.minSliceCount;
        java.lang.Throwable throwable5 = null;
        timedRatioPolicy3.onBadPulse(throwable5);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(timedRatioPolicy3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        co.codecraft.jcircuit.Circuit.Listener listener0 = null;
        co.codecraft.jcircuit.Circuit circuit1 = new co.codecraft.jcircuit.Circuit(listener0);
        int int2 = circuit1.getStateSnapshot();
        boolean boolean3 = circuit1.shouldValidate;
        circuit1.shouldValidate = false;
        boolean boolean6 = circuit1.shouldValidate;
        int int7 = circuit1.getStateSnapshot();
        circuit1.shouldValidate = true;
        boolean boolean12 = circuit1.transition((int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        java.lang.Throwable throwable1 = null;
        directTransitionPolicy0.onBadPulse(throwable1);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable4 = null;
        directTransitionPolicy0.onBadPulse(throwable4);
        directTransitionPolicy0.onGoodPulse();
        java.lang.Throwable throwable7 = null;
        directTransitionPolicy0.onBadPulse(throwable7);
        directTransitionPolicy0.onAltPulse();
        co.codecraft.jcircuit.Circuit.Listener listener10 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker11 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) directTransitionPolicy0, listener10);
        circuitBreaker11.onGoodPulse();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        float float7 = timedRatioPolicy5.closeAtGoodRatio;
        int int8 = timedRatioPolicy5.resetAfterNMillis;
        float float9 = timedRatioPolicy5.closeAtGoodRatio;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.75f + "'", float7 == 0.75f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.75f + "'", float9 == 0.75f);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onBadPulse();
        co.codecraft.jcircuit.Circuit.Listener listener8 = null;
        co.codecraft.jcircuit.CircuitBreaker circuitBreaker9 = new co.codecraft.jcircuit.CircuitBreaker((co.codecraft.jcircuit.TransitionPolicy) timedRatioPolicy5, listener8);
        circuitBreaker9.onGoodPulse();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setOpenAtGoodRatio((double) ' ');
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        java.lang.Throwable throwable8 = null;
        timedRatioPolicy5.onBadPulse(throwable8);
        timedRatioPolicy5.onBadPulse();
        java.lang.Class<?> wildcardClass11 = timedRatioPolicy5.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        timedRatioPolicy5.onBadPulse();
        timedRatioPolicy5.afterDirectTransition(1, false);
        float float14 = timedRatioPolicy5.closeAtGoodRatio;
        timedRatioPolicy5.onGoodPulse();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.75f + "'", float14 == 0.75f);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        co.codecraft.jcircuit.DirectTransitionPolicy directTransitionPolicy0 = new co.codecraft.jcircuit.DirectTransitionPolicy();
        directTransitionPolicy0.afterDirectTransition(10, false);
        java.lang.Throwable throwable4 = null;
        directTransitionPolicy0.onBadPulse(throwable4);
        directTransitionPolicy0.onGoodPulse();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        timedRatioPolicy5.onAltPulse();
        float float10 = timedRatioPolicy5.closeAtGoodRatio;
        int int11 = timedRatioPolicy5.minSliceCount;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.75f + "'", float10 == 0.75f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder0 = co.codecraft.jcircuit.TimedRatioPolicy.builder();
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder2 = builder0.setFailAfterNBadResets(1);
        co.codecraft.jcircuit.TimedRatioPolicy.Builder builder4 = builder0.setResetAfterNMillis(10);
        co.codecraft.jcircuit.TimedRatioPolicy timedRatioPolicy5 = builder0.build();
        timedRatioPolicy5.onAltPulse();
        int int7 = timedRatioPolicy5.failAfterNBadResets;
        int int8 = timedRatioPolicy5.evalEveryNMillis;
        float float9 = timedRatioPolicy5.closeAtGoodRatio;
        int int10 = timedRatioPolicy5.resetAfterNMillis;
        float float11 = timedRatioPolicy5.closeAtGoodRatio;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(timedRatioPolicy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.75f + "'", float9 == 0.75f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.75f + "'", float11 == 0.75f);
    }
}

