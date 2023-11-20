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
        io.github.axel_n.limiter.dto.LimiterType limiterType0 = io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW;
        org.junit.Assert.assertTrue("'" + limiterType0 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType0.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException0 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.String str1 = reachedLimitException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "io.github.axel_n.limiter.exception.ReachedLimitException" + "'", str1, "io.github.axel_n.limiter.exception.ReachedLimitException");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        io.github.axel_n.limiter.annotation.ExecutionLimitType executionLimitType0 = io.github.axel_n.limiter.annotation.ExecutionLimitType.EXECUTE_OR_WAIT;
        org.junit.Assert.assertTrue("'" + executionLimitType0 + "' != '" + io.github.axel_n.limiter.annotation.ExecutionLimitType.EXECUTE_OR_WAIT + "'", executionLimitType0.equals(io.github.axel_n.limiter.annotation.ExecutionLimitType.EXECUTE_OR_WAIT));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        io.github.axel_n.limiter.annotation.ExecutionLimitType executionLimitType0 = io.github.axel_n.limiter.annotation.ExecutionLimitType.EXECUTE_OR_THROW_EXCEPTION;
        org.junit.Assert.assertTrue("'" + executionLimitType0 + "' != '" + io.github.axel_n.limiter.annotation.ExecutionLimitType.EXECUTE_OR_THROW_EXCEPTION + "'", executionLimitType0.equals(io.github.axel_n.limiter.annotation.ExecutionLimitType.EXECUTE_OR_THROW_EXCEPTION));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException0 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray1 = reachedLimitException0.getSuppressed();
        java.lang.String str2 = reachedLimitException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "io.github.axel_n.limiter.exception.ReachedLimitException" + "'", str2, "io.github.axel_n.limiter.exception.ReachedLimitException");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) 'a', (-1), (long) (short) -1, 0L, "");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        io.github.axel_n.limiter.Limiter[] limiterArray0 = new io.github.axel_n.limiter.Limiter[] {};
        java.util.ArrayList<io.github.axel_n.limiter.Limiter> limiterList1 = new java.util.ArrayList<io.github.axel_n.limiter.Limiter>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<io.github.axel_n.limiter.Limiter>) limiterList1, limiterArray0);
        io.github.axel_n.limiter.annotation.LimiterAspect limiterAspect3 = new io.github.axel_n.limiter.annotation.LimiterAspect((java.util.List<io.github.axel_n.limiter.Limiter>) limiterList1);
        org.aspectj.lang.ProceedingJoinPoint proceedingJoinPoint4 = null;
        io.github.axel_n.limiter.annotation.LimiterConfig limiterConfig5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = limiterAspect3.process(proceedingJoinPoint4, limiterConfig5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.util.List<io.github.axel_n.limiter.Limiter> limiterList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.annotation.LimiterAspect limiterAspect1 = new io.github.axel_n.limiter.annotation.LimiterAspect(limiterList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException0 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray1 = reachedLimitException0.getSuppressed();
        java.lang.Class<?> wildcardClass2 = reachedLimitException0.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getSizeWindowInMilliseconds();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        long long7 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException0 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray1 = reachedLimitException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = reachedLimitException0.getSuppressed();
        java.lang.Throwable throwable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reachedLimitException0.addSuppressed(throwable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        long long9 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrWait(runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrThrowException(runnable10);
            org.junit.Assert.fail("Expected exception of type io.github.axel_n.limiter.exception.ReachedLimitException; message: null");
        } catch (io.github.axel_n.limiter.exception.ReachedLimitException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrThrowException(runnable10);
            org.junit.Assert.fail("Expected exception of type io.github.axel_n.limiter.exception.ReachedLimitException; message: null");
        } catch (io.github.axel_n.limiter.exception.ReachedLimitException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        io.github.axel_n.limiter.Limiter[] limiterArray0 = new io.github.axel_n.limiter.Limiter[] {};
        java.util.ArrayList<io.github.axel_n.limiter.Limiter> limiterList1 = new java.util.ArrayList<io.github.axel_n.limiter.Limiter>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<io.github.axel_n.limiter.Limiter>) limiterList1, limiterArray0);
        io.github.axel_n.limiter.annotation.LimiterAspect limiterAspect3 = new io.github.axel_n.limiter.annotation.LimiterAspect((java.util.List<io.github.axel_n.limiter.Limiter>) limiterList1);
        java.lang.Class<?> wildcardClass4 = limiterList1.getClass();
        org.junit.Assert.assertNotNull(limiterArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        boolean boolean11 = limiterSlidingWindow8.isPossibleSendRequest();
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrWait(runnable12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean8 = limiterSlidingWindow7.isPossibleSendRequest();
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow7.executeOrWait(runnable9, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.TimeoutException; message: null");
        } catch (java.util.concurrent.TimeoutException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrWait(runnable11, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.TimeoutException; message: null");
        } catch (java.util.concurrent.TimeoutException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrWait(runnable11, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow7.executeOrThrowException(runnable8);
            org.junit.Assert.fail("Expected exception of type io.github.axel_n.limiter.exception.ReachedLimitException; message: null");
        } catch (io.github.axel_n.limiter.exception.ReachedLimitException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrWait(runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        io.github.axel_n.limiter.dto.LimiterType limiterType11 = limiterSlidingWindow8.getLimiterType();
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrWait(runnable12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + limiterType11 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType11.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        int int8 = limiterConfig5.getMaxRequestsInWindow();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrWait(runnable10, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        boolean boolean11 = limiterSlidingWindow8.isPossibleSendRequest();
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrThrowException(runnable12);
            org.junit.Assert.fail("Expected exception of type io.github.axel_n.limiter.exception.ReachedLimitException; message: null");
        } catch (io.github.axel_n.limiter.exception.ReachedLimitException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setMaxRequestsInWindow((int) (short) 100);
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder6 = limiterConfigBuilder3.setMaxAwaitExecutionTime((int) (byte) 1, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setInstanceName("");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig4 = limiterConfigBuilder3.build();
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder7 = limiterConfigBuilder3.setMaxAwaitExecutionTime((int) (short) -1, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
        org.junit.Assert.assertNotNull(limiterConfig4);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.Class<?> wildcardClass9 = limiterSlidingWindow8.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        java.lang.String str10 = limiterSlidingWindow8.getInstanceName();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        long long7 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        long long8 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow9 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow9.executeOrWait(runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) 10, (int) (byte) 10, (long) 1, 100L, "");
        java.lang.String str6 = limiterConfig5.getInstanceName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        io.github.axel_n.limiter.dto.LimiterType limiterType10 = limiterSlidingWindow8.getLimiterType();
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrWait(runnable11, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + limiterType10 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType10.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setMaxRequestsInWindow((int) (short) 100);
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder6 = limiterConfigBuilder3.setPeriodForCheckExecution((int) (short) 10, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow7.executeOrWait(runnable8, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig(100L, (int) (byte) 100, (long) (short) -1, (long) 10, "hi!");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getSizeWindowInMilliseconds();
        java.lang.String str8 = limiterConfig5.getInstanceName();
        java.lang.Class<?> wildcardClass9 = limiterConfig5.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        long long7 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        long long8 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow9 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow9.executeOrWait(runnable10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.TimeoutException; message: null");
        } catch (java.util.concurrent.TimeoutException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow7.executeOrWait(runnable8, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.TimeoutException; message: null");
        } catch (java.util.concurrent.TimeoutException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        java.lang.Class<?> wildcardClass10 = limiterSlidingWindow8.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrWait(runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        boolean boolean10 = limiterSlidingWindow8.isPossibleSendRequest();
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrWait(runnable11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setMaxRequestsInWindow((int) (short) 100);
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder6 = limiterConfigBuilder0.setMaxAwaitExecutionTime((int) (byte) 100, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        io.github.axel_n.limiter.dto.LimiterType limiterType11 = limiterSlidingWindow8.getLimiterType();
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrWait(runnable12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + limiterType11 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType11.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException0 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Class<?> wildcardClass1 = reachedLimitException0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setInstanceName("");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig4 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder6 = limiterConfigBuilder3.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder9 = limiterConfigBuilder6.setMaxAwaitExecutionTime((int) (byte) 0, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
        org.junit.Assert.assertNotNull(limiterConfig4);
        org.junit.Assert.assertNotNull(limiterConfigBuilder6);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        java.lang.String str7 = limiterConfig5.getInstanceName();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig(100L, (int) (byte) 100, (long) (short) -1, (long) 10, "hi!");
        long long6 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        long long7 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        long long8 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow9 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.String str10 = limiterSlidingWindow9.getInstanceName();
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow9.executeOrWait(runnable11, 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        io.github.axel_n.limiter.dto.LimiterType limiterType10 = limiterSlidingWindow8.getLimiterType();
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrWait(runnable11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + limiterType10 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType10.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException0 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException1 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        reachedLimitException0.addSuppressed((java.lang.Throwable) reachedLimitException1);
        java.lang.String str3 = reachedLimitException0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "io.github.axel_n.limiter.exception.ReachedLimitException" + "'", str3, "io.github.axel_n.limiter.exception.ReachedLimitException");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        io.github.axel_n.limiter.Limiter[] limiterArray0 = new io.github.axel_n.limiter.Limiter[] {};
        java.util.ArrayList<io.github.axel_n.limiter.Limiter> limiterList1 = new java.util.ArrayList<io.github.axel_n.limiter.Limiter>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<io.github.axel_n.limiter.Limiter>) limiterList1, limiterArray0);
        io.github.axel_n.limiter.annotation.LimiterAspect limiterAspect3 = new io.github.axel_n.limiter.annotation.LimiterAspect((java.util.List<io.github.axel_n.limiter.Limiter>) limiterList1);
        io.github.axel_n.limiter.annotation.LimiterAspect limiterAspect4 = new io.github.axel_n.limiter.annotation.LimiterAspect((java.util.List<io.github.axel_n.limiter.Limiter>) limiterList1);
        org.aspectj.lang.ProceedingJoinPoint proceedingJoinPoint5 = null;
        io.github.axel_n.limiter.annotation.LimiterConfig limiterConfig6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = limiterAspect4.process(proceedingJoinPoint5, limiterConfig6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrWait(runnable11, (long) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setInstanceName("");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig4 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder6 = limiterConfigBuilder3.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig7 = limiterConfigBuilder3.build();
        long long8 = limiterConfig7.getSizeWindowInMilliseconds();
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
        org.junit.Assert.assertNotNull(limiterConfig4);
        org.junit.Assert.assertNotNull(limiterConfigBuilder6);
        org.junit.Assert.assertNotNull(limiterConfig7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) 10, (int) (byte) 10, (long) 1, 100L, "");
        long long6 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        boolean boolean11 = limiterSlidingWindow8.isPossibleSendRequest();
        io.github.axel_n.limiter.Limiter[] limiterArray12 = new io.github.axel_n.limiter.Limiter[] { limiterSlidingWindow8 };
        java.util.ArrayList<io.github.axel_n.limiter.Limiter> limiterList13 = new java.util.ArrayList<io.github.axel_n.limiter.Limiter>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<io.github.axel_n.limiter.Limiter>) limiterList13, limiterArray12);
        io.github.axel_n.limiter.annotation.LimiterAspect limiterAspect15 = new io.github.axel_n.limiter.annotation.LimiterAspect((java.util.List<io.github.axel_n.limiter.Limiter>) limiterList13);
        org.aspectj.lang.ProceedingJoinPoint proceedingJoinPoint16 = null;
        io.github.axel_n.limiter.annotation.LimiterConfig limiterConfig17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = limiterAspect15.process(proceedingJoinPoint16, limiterConfig17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(limiterArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) '4', (int) (byte) 1, 97L, (long) 32, "");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        limiterSlidingWindow7.writeHistory();
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow7.executeOrWait(runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        io.github.axel_n.limiter.dto.LimiterType limiterType10 = limiterSlidingWindow8.getLimiterType();
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrWait(runnable11, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + limiterType10 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType10.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setInstanceName("");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig4 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder6 = limiterConfigBuilder3.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder9 = limiterConfigBuilder3.setMaxAwaitExecutionTime((int) 'a', timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
        org.junit.Assert.assertNotNull(limiterConfig4);
        org.junit.Assert.assertNotNull(limiterConfigBuilder6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        java.lang.String str7 = limiterConfig5.getInstanceName();
        long long8 = limiterConfig5.getSizeWindowInMilliseconds();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        limiterSlidingWindow7.writeHistory();
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow7.executeOrThrowException(runnable9);
            org.junit.Assert.fail("Expected exception of type io.github.axel_n.limiter.exception.ReachedLimitException; message: null");
        } catch (io.github.axel_n.limiter.exception.ReachedLimitException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        long long7 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        long long8 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        int int9 = limiterConfig5.getMaxRequestsInWindow();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setMaxRequestsInWindow((int) (short) 100);
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder6 = limiterConfigBuilder0.setSizeWindow((int) ' ', timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) ' ', (int) ' ', (long) ' ', (long) (byte) -1, "");
        java.lang.String str6 = limiterConfig5.getInstanceName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) 'a', (int) ' ', 10L, (long) 10, "io.github.axel_n.limiter.exception.ReachedLimitException");
        java.lang.String str6 = limiterConfig5.getInstanceName();
        int int7 = limiterConfig5.getMaxRequestsInWindow();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "io.github.axel_n.limiter.exception.ReachedLimitException" + "'", str6, "io.github.axel_n.limiter.exception.ReachedLimitException");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (short) 10, 0, (long) (byte) 100, (long) (byte) 1, "");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException0 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray1 = reachedLimitException0.getSuppressed();
        java.lang.Class<?> wildcardClass2 = throwableArray1.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) 'a', (int) ' ', 10L, (long) 10, "io.github.axel_n.limiter.exception.ReachedLimitException");
        java.lang.String str6 = limiterConfig5.getInstanceName();
        long long7 = limiterConfig5.getSizeWindowInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow9 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow9.executeOrWait(runnable10, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "io.github.axel_n.limiter.exception.ReachedLimitException" + "'", str6, "io.github.axel_n.limiter.exception.ReachedLimitException");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        long long7 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        long long8 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow9 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow9.executeOrWait(runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        boolean boolean11 = limiterSlidingWindow8.isPossibleSendRequest();
        io.github.axel_n.limiter.Limiter[] limiterArray12 = new io.github.axel_n.limiter.Limiter[] { limiterSlidingWindow8 };
        java.util.ArrayList<io.github.axel_n.limiter.Limiter> limiterList13 = new java.util.ArrayList<io.github.axel_n.limiter.Limiter>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<io.github.axel_n.limiter.Limiter>) limiterList13, limiterArray12);
        io.github.axel_n.limiter.annotation.LimiterAspect limiterAspect15 = new io.github.axel_n.limiter.annotation.LimiterAspect((java.util.List<io.github.axel_n.limiter.Limiter>) limiterList13);
        io.github.axel_n.limiter.annotation.LimiterAspect limiterAspect16 = new io.github.axel_n.limiter.annotation.LimiterAspect((java.util.List<io.github.axel_n.limiter.Limiter>) limiterList13);
        java.lang.Class<?> wildcardClass17 = limiterAspect16.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(limiterArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        long long7 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        long long8 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow9 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.String str10 = limiterSlidingWindow9.getInstanceName();
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow9.executeOrThrowException(runnable11);
            org.junit.Assert.fail("Expected exception of type io.github.axel_n.limiter.exception.ReachedLimitException; message: null");
        } catch (io.github.axel_n.limiter.exception.ReachedLimitException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) 10, (int) 'a', (long) 32, (long) (byte) 10, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        limiterSlidingWindow7.writeHistory();
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow7.executeOrWait(runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        io.github.axel_n.limiter.dto.LimiterType limiterType9 = limiterSlidingWindow8.getLimiterType();
        java.lang.Class<?> wildcardClass10 = limiterType9.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + limiterType9 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType9.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        io.github.axel_n.limiter.dto.LimiterType limiterType10 = limiterSlidingWindow8.getLimiterType();
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrThrowException(runnable11);
            org.junit.Assert.fail("Expected exception of type io.github.axel_n.limiter.exception.ReachedLimitException; message: null");
        } catch (io.github.axel_n.limiter.exception.ReachedLimitException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + limiterType10 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType10.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setInstanceName("");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig4 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder6 = limiterConfigBuilder3.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder9 = limiterConfigBuilder3.setPeriodForCheckExecution(10, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
        org.junit.Assert.assertNotNull(limiterConfig4);
        org.junit.Assert.assertNotNull(limiterConfigBuilder6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        limiterSlidingWindow7.writeHistory();
        boolean boolean9 = limiterSlidingWindow7.isPossibleSendRequest();
        java.lang.String str10 = limiterSlidingWindow7.getInstanceName();
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow7.executeOrThrowException(runnable11);
            org.junit.Assert.fail("Expected exception of type io.github.axel_n.limiter.exception.ReachedLimitException; message: null");
        } catch (io.github.axel_n.limiter.exception.ReachedLimitException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        long long7 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        long long8 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow9 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.String str10 = limiterSlidingWindow9.getInstanceName();
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow9.executeOrThrowException(runnable11);
            org.junit.Assert.fail("Expected exception of type io.github.axel_n.limiter.exception.ReachedLimitException; message: null");
        } catch (io.github.axel_n.limiter.exception.ReachedLimitException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean8 = limiterSlidingWindow7.isPossibleSendRequest();
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow7.executeOrWait(runnable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (-1), 0, (long) (byte) 1, (long) (-1), "");
        long long6 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        java.lang.String str7 = limiterConfig5.getInstanceName();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig(0L, 1, (long) 10, 10L, "io.github.axel_n.limiter.exception.ReachedLimitException");
        long long6 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow7.executeOrWait(runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) 'a', (int) ' ', 10L, (long) 10, "io.github.axel_n.limiter.exception.ReachedLimitException");
        java.lang.String str6 = limiterConfig5.getInstanceName();
        long long7 = limiterConfig5.getSizeWindowInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.String str9 = limiterSlidingWindow8.getInstanceName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "io.github.axel_n.limiter.exception.ReachedLimitException" + "'", str6, "io.github.axel_n.limiter.exception.ReachedLimitException");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "io.github.axel_n.limiter.exception.ReachedLimitException" + "'", str9, "io.github.axel_n.limiter.exception.ReachedLimitException");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig(100L, (int) (byte) 100, (long) (short) -1, (long) 10, "hi!");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getSizeWindowInMilliseconds();
        long long8 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow9 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        long long10 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        io.github.axel_n.limiter.dto.LimiterType limiterType10 = limiterSlidingWindow8.getLimiterType();
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrWait(runnable11, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + limiterType10 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType10.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        long long7 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        long long8 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow9 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.String str10 = limiterSlidingWindow9.getInstanceName();
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow9.executeOrWait(runnable11, (long) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        long long7 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        long long8 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        long long9 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        java.lang.String str10 = limiterConfig5.getInstanceName();
        java.lang.String str11 = limiterConfig5.getInstanceName();
        java.lang.Class<?> wildcardClass12 = limiterConfig5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        io.github.axel_n.limiter.dto.LimiterType limiterType10 = limiterSlidingWindow8.getLimiterType();
        limiterSlidingWindow8.writeHistory();
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrWait(runnable12, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.TimeoutException; message: null");
        } catch (java.util.concurrent.TimeoutException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + limiterType10 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType10.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException0 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray1 = reachedLimitException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = reachedLimitException0.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException3 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray4 = reachedLimitException3.getSuppressed();
        reachedLimitException0.addSuppressed((java.lang.Throwable) reachedLimitException3);
        java.lang.Throwable[] throwableArray6 = reachedLimitException0.getSuppressed();
        java.lang.String str7 = reachedLimitException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "io.github.axel_n.limiter.exception.ReachedLimitException" + "'", str7, "io.github.axel_n.limiter.exception.ReachedLimitException");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) 10, (int) (byte) 10, (long) 1, 100L, "");
        java.lang.Class<?> wildcardClass6 = limiterConfig5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException0 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray1 = reachedLimitException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = reachedLimitException0.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException3 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray4 = reachedLimitException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = reachedLimitException3.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException6 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray7 = reachedLimitException6.getSuppressed();
        reachedLimitException3.addSuppressed((java.lang.Throwable) reachedLimitException6);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException9 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray10 = reachedLimitException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = reachedLimitException9.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException12 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray13 = reachedLimitException12.getSuppressed();
        reachedLimitException9.addSuppressed((java.lang.Throwable) reachedLimitException12);
        reachedLimitException3.addSuppressed((java.lang.Throwable) reachedLimitException9);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException16 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException17 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        reachedLimitException16.addSuppressed((java.lang.Throwable) reachedLimitException17);
        reachedLimitException9.addSuppressed((java.lang.Throwable) reachedLimitException16);
        reachedLimitException0.addSuppressed((java.lang.Throwable) reachedLimitException9);
        java.lang.Class<?> wildcardClass21 = reachedLimitException9.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        io.github.axel_n.limiter.dto.LimiterType limiterType10 = limiterSlidingWindow8.getLimiterType();
        limiterSlidingWindow8.writeHistory();
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrThrowException(runnable12);
            org.junit.Assert.fail("Expected exception of type io.github.axel_n.limiter.exception.ReachedLimitException; message: null");
        } catch (io.github.axel_n.limiter.exception.ReachedLimitException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + limiterType10 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType10.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        long long7 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        long long8 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow9 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.Class<?> wildcardClass10 = limiterConfig5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setInstanceName("");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig4 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder6 = limiterConfigBuilder3.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig7 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder9 = limiterConfigBuilder3.setMaxRequestsInWindow(97);
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder11 = limiterConfigBuilder3.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder14 = limiterConfigBuilder3.setMaxAwaitExecutionTime((int) (short) 0, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
        org.junit.Assert.assertNotNull(limiterConfig4);
        org.junit.Assert.assertNotNull(limiterConfigBuilder6);
        org.junit.Assert.assertNotNull(limiterConfig7);
        org.junit.Assert.assertNotNull(limiterConfigBuilder9);
        org.junit.Assert.assertNotNull(limiterConfigBuilder11);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) ' ', 10, (long) (byte) 10, (long) 1, "io.github.axel_n.limiter.exception.ReachedLimitException");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException0 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray1 = reachedLimitException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = reachedLimitException0.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException3 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray4 = reachedLimitException3.getSuppressed();
        reachedLimitException0.addSuppressed((java.lang.Throwable) reachedLimitException3);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException6 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray7 = reachedLimitException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = reachedLimitException6.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException9 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray10 = reachedLimitException9.getSuppressed();
        reachedLimitException6.addSuppressed((java.lang.Throwable) reachedLimitException9);
        reachedLimitException0.addSuppressed((java.lang.Throwable) reachedLimitException6);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException13 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException14 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        reachedLimitException13.addSuppressed((java.lang.Throwable) reachedLimitException14);
        reachedLimitException6.addSuppressed((java.lang.Throwable) reachedLimitException13);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException17 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException18 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        reachedLimitException17.addSuppressed((java.lang.Throwable) reachedLimitException18);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException20 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        reachedLimitException17.addSuppressed((java.lang.Throwable) reachedLimitException20);
        reachedLimitException13.addSuppressed((java.lang.Throwable) reachedLimitException20);
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean8 = limiterSlidingWindow7.isPossibleSendRequest();
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow7.executeOrWait(runnable9, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setInstanceName("");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig4 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder6 = limiterConfigBuilder3.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig7 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder9 = limiterConfigBuilder3.setMaxRequestsInWindow(97);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder12 = limiterConfigBuilder3.setMaxAwaitExecutionTime((int) (byte) -1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
        org.junit.Assert.assertNotNull(limiterConfig4);
        org.junit.Assert.assertNotNull(limiterConfigBuilder6);
        org.junit.Assert.assertNotNull(limiterConfig7);
        org.junit.Assert.assertNotNull(limiterConfigBuilder9);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setInstanceName("");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig4 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder6 = limiterConfigBuilder3.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig7 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder9 = limiterConfigBuilder3.setMaxRequestsInWindow(97);
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder11 = limiterConfigBuilder3.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder14 = limiterConfigBuilder11.setMaxAwaitExecutionTime((int) (short) 10, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
        org.junit.Assert.assertNotNull(limiterConfig4);
        org.junit.Assert.assertNotNull(limiterConfigBuilder6);
        org.junit.Assert.assertNotNull(limiterConfig7);
        org.junit.Assert.assertNotNull(limiterConfigBuilder9);
        org.junit.Assert.assertNotNull(limiterConfigBuilder11);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        boolean boolean11 = limiterSlidingWindow8.isPossibleSendRequest();
        io.github.axel_n.limiter.dto.LimiterType limiterType12 = limiterSlidingWindow8.getLimiterType();
        limiterSlidingWindow8.writeHistory();
        java.lang.String str14 = limiterSlidingWindow8.getInstanceName();
        java.lang.String str15 = limiterSlidingWindow8.getInstanceName();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + limiterType12 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType12.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        limiterSlidingWindow7.writeHistory();
        boolean boolean9 = limiterSlidingWindow7.isPossibleSendRequest();
        io.github.axel_n.limiter.dto.LimiterType limiterType10 = limiterSlidingWindow7.getLimiterType();
        limiterSlidingWindow7.writeHistory();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + limiterType10 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType10.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.String str9 = limiterSlidingWindow8.getInstanceName();
        boolean boolean10 = limiterSlidingWindow8.isPossibleSendRequest();
        boolean boolean11 = limiterSlidingWindow8.isPossibleSendRequest();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setInstanceName("");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig4 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder6 = limiterConfigBuilder3.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig7 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder9 = limiterConfigBuilder3.setMaxRequestsInWindow(97);
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder11 = limiterConfigBuilder3.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder14 = limiterConfigBuilder3.setSizeWindow((int) (short) 100, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
        org.junit.Assert.assertNotNull(limiterConfig4);
        org.junit.Assert.assertNotNull(limiterConfigBuilder6);
        org.junit.Assert.assertNotNull(limiterConfig7);
        org.junit.Assert.assertNotNull(limiterConfigBuilder9);
        org.junit.Assert.assertNotNull(limiterConfigBuilder11);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        long long7 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        long long8 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        long long9 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        int int10 = limiterConfig5.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow11 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        int int7 = limiterConfig5.getMaxRequestsInWindow();
        long long8 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        boolean boolean11 = limiterSlidingWindow8.isPossibleSendRequest();
        io.github.axel_n.limiter.Limiter[] limiterArray12 = new io.github.axel_n.limiter.Limiter[] { limiterSlidingWindow8 };
        java.util.ArrayList<io.github.axel_n.limiter.Limiter> limiterList13 = new java.util.ArrayList<io.github.axel_n.limiter.Limiter>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<io.github.axel_n.limiter.Limiter>) limiterList13, limiterArray12);
        io.github.axel_n.limiter.annotation.LimiterAspect limiterAspect15 = new io.github.axel_n.limiter.annotation.LimiterAspect((java.util.List<io.github.axel_n.limiter.Limiter>) limiterList13);
        io.github.axel_n.limiter.annotation.LimiterAspect limiterAspect16 = new io.github.axel_n.limiter.annotation.LimiterAspect((java.util.List<io.github.axel_n.limiter.Limiter>) limiterList13);
        io.github.axel_n.limiter.annotation.LimiterAspect limiterAspect17 = new io.github.axel_n.limiter.annotation.LimiterAspect((java.util.List<io.github.axel_n.limiter.Limiter>) limiterList13);
        org.aspectj.lang.ProceedingJoinPoint proceedingJoinPoint18 = null;
        io.github.axel_n.limiter.annotation.LimiterConfig limiterConfig19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = limiterAspect17.process(proceedingJoinPoint18, limiterConfig19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(limiterArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) 'a', (int) ' ', 10L, (long) 10, "io.github.axel_n.limiter.exception.ReachedLimitException");
        java.lang.String str6 = limiterConfig5.getInstanceName();
        long long7 = limiterConfig5.getSizeWindowInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow9 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow10 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "io.github.axel_n.limiter.exception.ReachedLimitException" + "'", str6, "io.github.axel_n.limiter.exception.ReachedLimitException");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig(100L, (int) (byte) 100, (long) (short) -1, (long) 10, "hi!");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getSizeWindowInMilliseconds();
        long long8 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow9 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean10 = limiterSlidingWindow9.isPossibleSendRequest();
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow9.executeOrThrowException(runnable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) 10, (int) '4', (long) 97, (long) (short) 10, "");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        io.github.axel_n.limiter.dto.LimiterType limiterType11 = limiterSlidingWindow8.getLimiterType();
        limiterSlidingWindow8.writeHistory();
        java.lang.String str13 = limiterSlidingWindow8.getInstanceName();
        java.lang.Runnable runnable14 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             limiterSlidingWindow8.executeOrThrowException(runnable14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + limiterType11 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType11.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        limiterSlidingWindow7.writeHistory();
        limiterSlidingWindow7.writeHistory();
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             limiterSlidingWindow7.executeOrWait(runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig(100L, (int) (byte) 100, (long) (short) -1, (long) 10, "hi!");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getSizeWindowInMilliseconds();
        long long8 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setInstanceName("");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig4 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder6 = limiterConfigBuilder3.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder8 = limiterConfigBuilder3.setInstanceName("hi!");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder10 = limiterConfigBuilder8.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder12 = limiterConfigBuilder10.setInstanceName("hi!");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig13 = limiterConfigBuilder10.build();
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
        org.junit.Assert.assertNotNull(limiterConfig4);
        org.junit.Assert.assertNotNull(limiterConfigBuilder6);
        org.junit.Assert.assertNotNull(limiterConfigBuilder8);
        org.junit.Assert.assertNotNull(limiterConfigBuilder10);
        org.junit.Assert.assertNotNull(limiterConfigBuilder12);
        org.junit.Assert.assertNotNull(limiterConfig13);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig(0L, (int) (short) 100, (long) 32, 0L, "io.github.axel_n.limiter.exception.ReachedLimitException");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setInstanceName("");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig4 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder6 = limiterConfigBuilder3.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig7 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder9 = limiterConfigBuilder3.setMaxRequestsInWindow(97);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder12 = limiterConfigBuilder9.setPeriodForCheckExecution((int) (byte) 1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
        org.junit.Assert.assertNotNull(limiterConfig4);
        org.junit.Assert.assertNotNull(limiterConfigBuilder6);
        org.junit.Assert.assertNotNull(limiterConfig7);
        org.junit.Assert.assertNotNull(limiterConfigBuilder9);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) 'a', (int) ' ', 10L, (long) 10, "io.github.axel_n.limiter.exception.ReachedLimitException");
        java.lang.String str6 = limiterConfig5.getInstanceName();
        long long7 = limiterConfig5.getSizeWindowInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        int int9 = limiterConfig5.getMaxRequestsInWindow();
        long long10 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        java.lang.String str11 = limiterConfig5.getInstanceName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "io.github.axel_n.limiter.exception.ReachedLimitException" + "'", str6, "io.github.axel_n.limiter.exception.ReachedLimitException");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "io.github.axel_n.limiter.exception.ReachedLimitException" + "'", str11, "io.github.axel_n.limiter.exception.ReachedLimitException");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.String str9 = limiterSlidingWindow8.getInstanceName();
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrWait(runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        long long7 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        java.lang.String str8 = limiterConfig5.getInstanceName();
        java.lang.String str9 = limiterConfig5.getInstanceName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrWait(runnable11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        limiterSlidingWindow8.writeHistory();
        limiterSlidingWindow8.writeHistory();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        limiterSlidingWindow7.writeHistory();
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow7.executeOrWait(runnable9, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.String str9 = limiterSlidingWindow8.getInstanceName();
        boolean boolean10 = limiterSlidingWindow8.isPossibleSendRequest();
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrWait(runnable11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig(0L, 1, (long) 10, 10L, "io.github.axel_n.limiter.exception.ReachedLimitException");
        long long6 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        long long7 = limiterConfig5.getSizeWindowInMilliseconds();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setMaxRequestsInWindow((int) (short) 100);
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig4 = limiterConfigBuilder0.build();
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder7 = limiterConfigBuilder0.setSizeWindow(32, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
        org.junit.Assert.assertNotNull(limiterConfig4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) 100, (int) ' ', (long) 32, (long) (byte) 10, "hi!");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException0 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray1 = reachedLimitException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = reachedLimitException0.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException3 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray4 = reachedLimitException3.getSuppressed();
        reachedLimitException0.addSuppressed((java.lang.Throwable) reachedLimitException3);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException6 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray7 = reachedLimitException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = reachedLimitException6.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException9 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray10 = reachedLimitException9.getSuppressed();
        reachedLimitException6.addSuppressed((java.lang.Throwable) reachedLimitException9);
        reachedLimitException0.addSuppressed((java.lang.Throwable) reachedLimitException6);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException13 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException14 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        reachedLimitException13.addSuppressed((java.lang.Throwable) reachedLimitException14);
        reachedLimitException6.addSuppressed((java.lang.Throwable) reachedLimitException13);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException17 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray18 = reachedLimitException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = reachedLimitException17.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException20 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray21 = reachedLimitException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = reachedLimitException20.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException23 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray24 = reachedLimitException23.getSuppressed();
        reachedLimitException20.addSuppressed((java.lang.Throwable) reachedLimitException23);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException26 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray27 = reachedLimitException26.getSuppressed();
        java.lang.Throwable[] throwableArray28 = reachedLimitException26.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException29 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray30 = reachedLimitException29.getSuppressed();
        reachedLimitException26.addSuppressed((java.lang.Throwable) reachedLimitException29);
        reachedLimitException20.addSuppressed((java.lang.Throwable) reachedLimitException26);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException33 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException34 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        reachedLimitException33.addSuppressed((java.lang.Throwable) reachedLimitException34);
        reachedLimitException26.addSuppressed((java.lang.Throwable) reachedLimitException33);
        reachedLimitException17.addSuppressed((java.lang.Throwable) reachedLimitException26);
        reachedLimitException6.addSuppressed((java.lang.Throwable) reachedLimitException26);
        java.lang.Throwable[] throwableArray39 = reachedLimitException6.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray39);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        boolean boolean11 = limiterSlidingWindow8.isPossibleSendRequest();
        io.github.axel_n.limiter.dto.LimiterType limiterType12 = limiterSlidingWindow8.getLimiterType();
        limiterSlidingWindow8.writeHistory();
        io.github.axel_n.limiter.dto.LimiterType limiterType14 = limiterSlidingWindow8.getLimiterType();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + limiterType12 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType12.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
        org.junit.Assert.assertTrue("'" + limiterType14 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType14.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setInstanceName("");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig4 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder6 = limiterConfigBuilder3.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig7 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder9 = limiterConfigBuilder3.setMaxRequestsInWindow(97);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder12 = limiterConfigBuilder9.setPeriodForCheckExecution(0, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
        org.junit.Assert.assertNotNull(limiterConfig4);
        org.junit.Assert.assertNotNull(limiterConfigBuilder6);
        org.junit.Assert.assertNotNull(limiterConfig7);
        org.junit.Assert.assertNotNull(limiterConfigBuilder9);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.String str9 = limiterSlidingWindow8.getInstanceName();
        boolean boolean10 = limiterSlidingWindow8.isPossibleSendRequest();
        java.lang.Class<?> wildcardClass11 = limiterSlidingWindow8.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        java.lang.Class<?> wildcardClass11 = limiterSlidingWindow8.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setInstanceName("");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig4 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder6 = limiterConfigBuilder3.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig7 = limiterConfigBuilder3.build();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder10 = limiterConfigBuilder3.setPeriodForCheckExecution(0, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
        org.junit.Assert.assertNotNull(limiterConfig4);
        org.junit.Assert.assertNotNull(limiterConfigBuilder6);
        org.junit.Assert.assertNotNull(limiterConfig7);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        java.lang.String str10 = limiterSlidingWindow8.getInstanceName();
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrWait(runnable11, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.TimeoutException; message: null");
        } catch (java.util.concurrent.TimeoutException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setMaxRequestsInWindow((int) (short) 100);
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder5 = limiterConfigBuilder3.setInstanceName("");
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder8 = limiterConfigBuilder3.setMaxAwaitExecutionTime((int) '4', timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
        org.junit.Assert.assertNotNull(limiterConfigBuilder5);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        boolean boolean11 = limiterSlidingWindow8.isPossibleSendRequest();
        io.github.axel_n.limiter.Limiter[] limiterArray12 = new io.github.axel_n.limiter.Limiter[] { limiterSlidingWindow8 };
        java.util.ArrayList<io.github.axel_n.limiter.Limiter> limiterList13 = new java.util.ArrayList<io.github.axel_n.limiter.Limiter>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<io.github.axel_n.limiter.Limiter>) limiterList13, limiterArray12);
        io.github.axel_n.limiter.annotation.LimiterAspect limiterAspect15 = new io.github.axel_n.limiter.annotation.LimiterAspect((java.util.List<io.github.axel_n.limiter.Limiter>) limiterList13);
        io.github.axel_n.limiter.annotation.LimiterAspect limiterAspect16 = new io.github.axel_n.limiter.annotation.LimiterAspect((java.util.List<io.github.axel_n.limiter.Limiter>) limiterList13);
        io.github.axel_n.limiter.annotation.LimiterAspect limiterAspect17 = new io.github.axel_n.limiter.annotation.LimiterAspect((java.util.List<io.github.axel_n.limiter.Limiter>) limiterList13);
        io.github.axel_n.limiter.annotation.LimiterAspect limiterAspect18 = new io.github.axel_n.limiter.annotation.LimiterAspect((java.util.List<io.github.axel_n.limiter.Limiter>) limiterList13);
        io.github.axel_n.limiter.annotation.LimiterAspect limiterAspect19 = new io.github.axel_n.limiter.annotation.LimiterAspect((java.util.List<io.github.axel_n.limiter.Limiter>) limiterList13);
        io.github.axel_n.limiter.annotation.LimiterAspect limiterAspect20 = new io.github.axel_n.limiter.annotation.LimiterAspect((java.util.List<io.github.axel_n.limiter.Limiter>) limiterList13);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(limiterArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        java.lang.String str8 = limiterConfig5.getInstanceName();
        int int9 = limiterConfig5.getMaxRequestsInWindow();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig(0L, 1, (long) 10, 10L, "io.github.axel_n.limiter.exception.ReachedLimitException");
        long long6 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        int int7 = limiterConfig5.getMaxRequestsInWindow();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setInstanceName("");
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder6 = limiterConfigBuilder3.setPeriodForCheckExecution((int) (short) -1, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setInstanceName("");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig4 = limiterConfigBuilder3.build();
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder7 = limiterConfigBuilder3.setSizeWindow((int) (byte) 1, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
        org.junit.Assert.assertNotNull(limiterConfig4);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setSizeWindow(0, timeUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig(0L, 1, (long) 10, 10L, "io.github.axel_n.limiter.exception.ReachedLimitException");
        long long6 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        int int8 = limiterConfig5.getMaxRequestsInWindow();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setInstanceName("");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig4 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder6 = limiterConfigBuilder3.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder8 = limiterConfigBuilder3.setInstanceName("hi!");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder10 = limiterConfigBuilder8.setMaxRequestsInWindow(1);
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
        org.junit.Assert.assertNotNull(limiterConfig4);
        org.junit.Assert.assertNotNull(limiterConfigBuilder6);
        org.junit.Assert.assertNotNull(limiterConfigBuilder8);
        org.junit.Assert.assertNotNull(limiterConfigBuilder10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig(100L, (int) (byte) 100, (long) (short) -1, (long) 10, "hi!");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getSizeWindowInMilliseconds();
        long long8 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        int int9 = limiterConfig5.getMaxRequestsInWindow();
        long long10 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        boolean boolean10 = limiterSlidingWindow8.isPossibleSendRequest();
        java.lang.String str11 = limiterSlidingWindow8.getInstanceName();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.String str8 = limiterConfig5.getInstanceName();
        java.lang.String str9 = limiterConfig5.getInstanceName();
        long long10 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig(100L, (int) (byte) 100, (long) (short) -1, (long) 10, "hi!");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getSizeWindowInMilliseconds();
        long long8 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow9 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow9.executeOrWait(runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException0 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray1 = reachedLimitException0.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException2 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException3 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        reachedLimitException2.addSuppressed((java.lang.Throwable) reachedLimitException3);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException5 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        reachedLimitException2.addSuppressed((java.lang.Throwable) reachedLimitException5);
        reachedLimitException0.addSuppressed((java.lang.Throwable) reachedLimitException5);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException8 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray9 = reachedLimitException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = reachedLimitException8.getSuppressed();
        reachedLimitException5.addSuppressed((java.lang.Throwable) reachedLimitException8);
        java.lang.String str12 = reachedLimitException5.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "io.github.axel_n.limiter.exception.ReachedLimitException" + "'", str12, "io.github.axel_n.limiter.exception.ReachedLimitException");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException0 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray1 = reachedLimitException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = reachedLimitException0.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException3 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray4 = reachedLimitException3.getSuppressed();
        reachedLimitException0.addSuppressed((java.lang.Throwable) reachedLimitException3);
        java.lang.Throwable[] throwableArray6 = reachedLimitException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        io.github.axel_n.limiter.dto.LimiterType limiterType10 = limiterSlidingWindow8.getLimiterType();
        limiterSlidingWindow8.writeHistory();
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrWait(runnable12, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + limiterType10 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType10.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrThrowException(runnable10);
            org.junit.Assert.fail("Expected exception of type io.github.axel_n.limiter.exception.ReachedLimitException; message: null");
        } catch (io.github.axel_n.limiter.exception.ReachedLimitException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        io.github.axel_n.limiter.dto.LimiterType limiterType11 = limiterSlidingWindow8.getLimiterType();
        boolean boolean12 = limiterSlidingWindow8.isPossibleSendRequest();
        boolean boolean13 = limiterSlidingWindow8.isPossibleSendRequest();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + limiterType11 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType11.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        limiterSlidingWindow7.writeHistory();
        boolean boolean9 = limiterSlidingWindow7.isPossibleSendRequest();
        io.github.axel_n.limiter.dto.LimiterType limiterType10 = limiterSlidingWindow7.getLimiterType();
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow7.executeOrWait(runnable11, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + limiterType10 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType10.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig(100L, (int) (byte) 100, (long) (short) -1, (long) 10, "hi!");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getSizeWindowInMilliseconds();
        long long8 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow9 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow9.executeOrWait(runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        boolean boolean11 = limiterSlidingWindow8.isPossibleSendRequest();
        java.lang.Class<?> wildcardClass12 = limiterSlidingWindow8.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setInstanceName("");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig4 = limiterConfigBuilder3.build();
        long long5 = limiterConfig4.getPeriodForCheckExecutionInMilliseconds();
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
        org.junit.Assert.assertNotNull(limiterConfig4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.String str8 = limiterConfig5.getInstanceName();
        long long9 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        io.github.axel_n.limiter.dto.LimiterType limiterType10 = limiterSlidingWindow8.getLimiterType();
        limiterSlidingWindow8.writeHistory();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + limiterType10 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType10.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) 10, (int) (byte) 10, (long) 1, 100L, "");
        long long6 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow7.executeOrWait(runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException0 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray1 = reachedLimitException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = reachedLimitException0.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException3 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray4 = reachedLimitException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = reachedLimitException3.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException6 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray7 = reachedLimitException6.getSuppressed();
        reachedLimitException3.addSuppressed((java.lang.Throwable) reachedLimitException6);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException9 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray10 = reachedLimitException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = reachedLimitException9.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException12 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray13 = reachedLimitException12.getSuppressed();
        reachedLimitException9.addSuppressed((java.lang.Throwable) reachedLimitException12);
        reachedLimitException3.addSuppressed((java.lang.Throwable) reachedLimitException9);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException16 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException17 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        reachedLimitException16.addSuppressed((java.lang.Throwable) reachedLimitException17);
        reachedLimitException9.addSuppressed((java.lang.Throwable) reachedLimitException16);
        reachedLimitException0.addSuppressed((java.lang.Throwable) reachedLimitException9);
        java.lang.Throwable[] throwableArray21 = reachedLimitException0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        boolean boolean11 = limiterSlidingWindow8.isPossibleSendRequest();
        io.github.axel_n.limiter.dto.LimiterType limiterType12 = limiterSlidingWindow8.getLimiterType();
        limiterSlidingWindow8.writeHistory();
        java.lang.String str14 = limiterSlidingWindow8.getInstanceName();
        java.lang.Runnable runnable15 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             limiterSlidingWindow8.executeOrWait(runnable15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + limiterType12 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType12.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        boolean boolean11 = limiterSlidingWindow8.isPossibleSendRequest();
        io.github.axel_n.limiter.dto.LimiterType limiterType12 = limiterSlidingWindow8.getLimiterType();
        limiterSlidingWindow8.writeHistory();
        java.lang.String str14 = limiterSlidingWindow8.getInstanceName();
        limiterSlidingWindow8.writeHistory();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + limiterType12 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType12.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        java.lang.String str10 = limiterSlidingWindow8.getInstanceName();
        limiterSlidingWindow8.writeHistory();
        java.lang.String str12 = limiterSlidingWindow8.getInstanceName();
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrWait(runnable13, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setInstanceName("");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig4 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder6 = limiterConfigBuilder3.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder8 = limiterConfigBuilder3.setInstanceName("hi!");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder10 = limiterConfigBuilder8.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder12 = limiterConfigBuilder10.setInstanceName("hi!");
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder15 = limiterConfigBuilder10.setSizeWindow((int) (byte) -1, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
        org.junit.Assert.assertNotNull(limiterConfig4);
        org.junit.Assert.assertNotNull(limiterConfigBuilder6);
        org.junit.Assert.assertNotNull(limiterConfigBuilder8);
        org.junit.Assert.assertNotNull(limiterConfigBuilder10);
        org.junit.Assert.assertNotNull(limiterConfigBuilder12);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) 'a', (int) ' ', 10L, (long) 10, "io.github.axel_n.limiter.exception.ReachedLimitException");
        java.lang.String str6 = limiterConfig5.getInstanceName();
        long long7 = limiterConfig5.getSizeWindowInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow9 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        io.github.axel_n.limiter.dto.LimiterType limiterType10 = limiterSlidingWindow9.getLimiterType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "io.github.axel_n.limiter.exception.ReachedLimitException" + "'", str6, "io.github.axel_n.limiter.exception.ReachedLimitException");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + limiterType10 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType10.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig(1L, 0, (long) 1, 0L, "");
        java.lang.String str6 = limiterConfig5.getInstanceName();
        int int7 = limiterConfig5.getMaxRequestsInWindow();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        io.github.axel_n.limiter.dto.LimiterType limiterType11 = limiterSlidingWindow8.getLimiterType();
        limiterSlidingWindow8.writeHistory();
        boolean boolean13 = limiterSlidingWindow8.isPossibleSendRequest();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + limiterType11 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType11.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
// flaky:         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException0 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException1 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        reachedLimitException0.addSuppressed((java.lang.Throwable) reachedLimitException1);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException3 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        reachedLimitException0.addSuppressed((java.lang.Throwable) reachedLimitException3);
        java.lang.String str5 = reachedLimitException0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "io.github.axel_n.limiter.exception.ReachedLimitException" + "'", str5, "io.github.axel_n.limiter.exception.ReachedLimitException");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setMaxRequestsInWindow((int) (short) 100);
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig4 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder6 = limiterConfigBuilder0.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        java.lang.Class<?> wildcardClass7 = limiterConfigBuilder0.getClass();
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
        org.junit.Assert.assertNotNull(limiterConfig4);
        org.junit.Assert.assertNotNull(limiterConfigBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder2 = limiterConfigBuilder0.setMaxRequestsInWindow((int) (short) 0);
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder5 = limiterConfigBuilder2.setSizeWindow((int) (byte) 10, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfigBuilder2);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.String str8 = limiterConfig5.getInstanceName();
        long long9 = limiterConfig5.getSizeWindowInMilliseconds();
        long long10 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) 10, (int) (byte) 0, (long) (byte) 0, 100L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        limiterSlidingWindow7.writeHistory();
        boolean boolean9 = limiterSlidingWindow7.isPossibleSendRequest();
        java.lang.String str10 = limiterSlidingWindow7.getInstanceName();
        io.github.axel_n.limiter.dto.LimiterType limiterType11 = limiterSlidingWindow7.getLimiterType();
        io.github.axel_n.limiter.dto.LimiterType limiterType12 = limiterSlidingWindow7.getLimiterType();
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow7.executeOrThrowException(runnable13);
            org.junit.Assert.fail("Expected exception of type io.github.axel_n.limiter.exception.ReachedLimitException; message: null");
        } catch (io.github.axel_n.limiter.exception.ReachedLimitException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + limiterType11 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType11.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
        org.junit.Assert.assertTrue("'" + limiterType12 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType12.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        io.github.axel_n.limiter.dto.LimiterType limiterType10 = limiterSlidingWindow8.getLimiterType();
        limiterSlidingWindow8.writeHistory();
        java.lang.String str12 = limiterSlidingWindow8.getInstanceName();
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrThrowException(runnable13);
            org.junit.Assert.fail("Expected exception of type io.github.axel_n.limiter.exception.ReachedLimitException; message: null");
        } catch (io.github.axel_n.limiter.exception.ReachedLimitException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + limiterType10 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType10.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        io.github.axel_n.limiter.dto.LimiterType limiterType10 = limiterSlidingWindow8.getLimiterType();
        io.github.axel_n.limiter.dto.LimiterType limiterType11 = limiterSlidingWindow8.getLimiterType();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + limiterType10 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType10.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
        org.junit.Assert.assertTrue("'" + limiterType11 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType11.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        long long8 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        int int9 = limiterConfig5.getMaxRequestsInWindow();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder2 = limiterConfigBuilder0.setMaxRequestsInWindow((int) (short) 0);
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder4 = limiterConfigBuilder2.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        org.junit.Assert.assertNotNull(limiterConfigBuilder2);
        org.junit.Assert.assertNotNull(limiterConfigBuilder4);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setMaxRequestsInWindow((int) (short) 100);
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder5 = limiterConfigBuilder3.setInstanceName("");
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder8 = limiterConfigBuilder3.setPeriodForCheckExecution((int) (short) 10, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
        org.junit.Assert.assertNotNull(limiterConfigBuilder5);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        io.github.axel_n.limiter.dto.LimiterType limiterType11 = limiterSlidingWindow8.getLimiterType();
        limiterSlidingWindow8.writeHistory();
        java.lang.String str13 = limiterSlidingWindow8.getInstanceName();
        boolean boolean14 = limiterSlidingWindow8.isPossibleSendRequest();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + limiterType11 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType11.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException0 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray1 = reachedLimitException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = reachedLimitException0.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException3 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray4 = reachedLimitException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = reachedLimitException3.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException6 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray7 = reachedLimitException6.getSuppressed();
        reachedLimitException3.addSuppressed((java.lang.Throwable) reachedLimitException6);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException9 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray10 = reachedLimitException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = reachedLimitException9.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException12 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray13 = reachedLimitException12.getSuppressed();
        reachedLimitException9.addSuppressed((java.lang.Throwable) reachedLimitException12);
        reachedLimitException3.addSuppressed((java.lang.Throwable) reachedLimitException9);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException16 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException17 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        reachedLimitException16.addSuppressed((java.lang.Throwable) reachedLimitException17);
        reachedLimitException9.addSuppressed((java.lang.Throwable) reachedLimitException16);
        reachedLimitException0.addSuppressed((java.lang.Throwable) reachedLimitException9);
        java.lang.String str21 = reachedLimitException9.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "io.github.axel_n.limiter.exception.ReachedLimitException" + "'", str21, "io.github.axel_n.limiter.exception.ReachedLimitException");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException0 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray1 = reachedLimitException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = reachedLimitException0.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException3 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray4 = reachedLimitException3.getSuppressed();
        reachedLimitException0.addSuppressed((java.lang.Throwable) reachedLimitException3);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException6 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray7 = reachedLimitException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = reachedLimitException6.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException9 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray10 = reachedLimitException9.getSuppressed();
        reachedLimitException6.addSuppressed((java.lang.Throwable) reachedLimitException9);
        reachedLimitException0.addSuppressed((java.lang.Throwable) reachedLimitException6);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException13 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException14 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        reachedLimitException13.addSuppressed((java.lang.Throwable) reachedLimitException14);
        reachedLimitException6.addSuppressed((java.lang.Throwable) reachedLimitException13);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException17 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray18 = reachedLimitException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = reachedLimitException17.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException20 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray21 = reachedLimitException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = reachedLimitException20.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException23 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray24 = reachedLimitException23.getSuppressed();
        reachedLimitException20.addSuppressed((java.lang.Throwable) reachedLimitException23);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException26 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray27 = reachedLimitException26.getSuppressed();
        java.lang.Throwable[] throwableArray28 = reachedLimitException26.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException29 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray30 = reachedLimitException29.getSuppressed();
        reachedLimitException26.addSuppressed((java.lang.Throwable) reachedLimitException29);
        reachedLimitException20.addSuppressed((java.lang.Throwable) reachedLimitException26);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException33 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException34 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        reachedLimitException33.addSuppressed((java.lang.Throwable) reachedLimitException34);
        reachedLimitException26.addSuppressed((java.lang.Throwable) reachedLimitException33);
        reachedLimitException17.addSuppressed((java.lang.Throwable) reachedLimitException26);
        reachedLimitException6.addSuppressed((java.lang.Throwable) reachedLimitException26);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException39 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray40 = reachedLimitException39.getSuppressed();
        java.lang.Throwable[] throwableArray41 = reachedLimitException39.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException42 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray43 = reachedLimitException42.getSuppressed();
        reachedLimitException39.addSuppressed((java.lang.Throwable) reachedLimitException42);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException45 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray46 = reachedLimitException45.getSuppressed();
        java.lang.Throwable[] throwableArray47 = reachedLimitException45.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException48 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray49 = reachedLimitException48.getSuppressed();
        reachedLimitException45.addSuppressed((java.lang.Throwable) reachedLimitException48);
        reachedLimitException39.addSuppressed((java.lang.Throwable) reachedLimitException45);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException52 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException53 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        reachedLimitException52.addSuppressed((java.lang.Throwable) reachedLimitException53);
        reachedLimitException45.addSuppressed((java.lang.Throwable) reachedLimitException52);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException56 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray57 = reachedLimitException56.getSuppressed();
        java.lang.Throwable[] throwableArray58 = reachedLimitException56.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException59 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray60 = reachedLimitException59.getSuppressed();
        java.lang.Throwable[] throwableArray61 = reachedLimitException59.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException62 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray63 = reachedLimitException62.getSuppressed();
        reachedLimitException59.addSuppressed((java.lang.Throwable) reachedLimitException62);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException65 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray66 = reachedLimitException65.getSuppressed();
        java.lang.Throwable[] throwableArray67 = reachedLimitException65.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException68 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray69 = reachedLimitException68.getSuppressed();
        reachedLimitException65.addSuppressed((java.lang.Throwable) reachedLimitException68);
        reachedLimitException59.addSuppressed((java.lang.Throwable) reachedLimitException65);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException72 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException73 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        reachedLimitException72.addSuppressed((java.lang.Throwable) reachedLimitException73);
        reachedLimitException65.addSuppressed((java.lang.Throwable) reachedLimitException72);
        reachedLimitException56.addSuppressed((java.lang.Throwable) reachedLimitException65);
        reachedLimitException45.addSuppressed((java.lang.Throwable) reachedLimitException65);
        reachedLimitException26.addSuppressed((java.lang.Throwable) reachedLimitException45);
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray69);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setInstanceName("");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig4 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder6 = limiterConfigBuilder3.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig7 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder9 = limiterConfigBuilder3.setMaxRequestsInWindow(97);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder12 = limiterConfigBuilder9.setSizeWindow((int) (byte) 1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
        org.junit.Assert.assertNotNull(limiterConfig4);
        org.junit.Assert.assertNotNull(limiterConfigBuilder6);
        org.junit.Assert.assertNotNull(limiterConfig7);
        org.junit.Assert.assertNotNull(limiterConfigBuilder9);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setInstanceName("");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig4 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder6 = limiterConfigBuilder3.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig7 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder9 = limiterConfigBuilder3.setMaxRequestsInWindow(97);
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder11 = limiterConfigBuilder3.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder14 = limiterConfigBuilder3.setPeriodForCheckExecution((int) (short) 1, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
        org.junit.Assert.assertNotNull(limiterConfig4);
        org.junit.Assert.assertNotNull(limiterConfigBuilder6);
        org.junit.Assert.assertNotNull(limiterConfig7);
        org.junit.Assert.assertNotNull(limiterConfigBuilder9);
        org.junit.Assert.assertNotNull(limiterConfigBuilder11);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setInstanceName("");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig4 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder6 = limiterConfigBuilder3.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder8 = limiterConfigBuilder3.setInstanceName("hi!");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder10 = limiterConfigBuilder8.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder13 = limiterConfigBuilder10.setMaxAwaitExecutionTime((int) (byte) -1, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
        org.junit.Assert.assertNotNull(limiterConfig4);
        org.junit.Assert.assertNotNull(limiterConfigBuilder6);
        org.junit.Assert.assertNotNull(limiterConfigBuilder8);
        org.junit.Assert.assertNotNull(limiterConfigBuilder10);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        java.lang.String str10 = limiterSlidingWindow8.getInstanceName();
        limiterSlidingWindow8.writeHistory();
        java.lang.String str12 = limiterSlidingWindow8.getInstanceName();
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrWait(runnable13, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        io.github.axel_n.limiter.Limiter[] limiterArray0 = new io.github.axel_n.limiter.Limiter[] {};
        java.util.ArrayList<io.github.axel_n.limiter.Limiter> limiterList1 = new java.util.ArrayList<io.github.axel_n.limiter.Limiter>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<io.github.axel_n.limiter.Limiter>) limiterList1, limiterArray0);
        io.github.axel_n.limiter.annotation.LimiterAspect limiterAspect3 = new io.github.axel_n.limiter.annotation.LimiterAspect((java.util.List<io.github.axel_n.limiter.Limiter>) limiterList1);
        io.github.axel_n.limiter.annotation.LimiterAspect limiterAspect4 = new io.github.axel_n.limiter.annotation.LimiterAspect((java.util.List<io.github.axel_n.limiter.Limiter>) limiterList1);
        io.github.axel_n.limiter.annotation.LimiterAspect limiterAspect5 = new io.github.axel_n.limiter.annotation.LimiterAspect((java.util.List<io.github.axel_n.limiter.Limiter>) limiterList1);
        org.junit.Assert.assertNotNull(limiterArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        io.github.axel_n.limiter.dto.LimiterType limiterType11 = limiterSlidingWindow8.getLimiterType();
        boolean boolean12 = limiterSlidingWindow8.isPossibleSendRequest();
        io.github.axel_n.limiter.dto.LimiterType limiterType13 = limiterSlidingWindow8.getLimiterType();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + limiterType11 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType11.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + limiterType13 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType13.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder2 = limiterConfigBuilder0.setInstanceName("");
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder5 = limiterConfigBuilder2.setPeriodForCheckExecution((int) '#', timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfigBuilder2);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        java.lang.String str10 = limiterSlidingWindow8.getInstanceName();
        boolean boolean11 = limiterSlidingWindow8.isPossibleSendRequest();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException0 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray1 = reachedLimitException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = reachedLimitException0.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException3 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray4 = reachedLimitException3.getSuppressed();
        reachedLimitException0.addSuppressed((java.lang.Throwable) reachedLimitException3);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException6 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray7 = reachedLimitException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = reachedLimitException6.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException9 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray10 = reachedLimitException9.getSuppressed();
        reachedLimitException6.addSuppressed((java.lang.Throwable) reachedLimitException9);
        reachedLimitException0.addSuppressed((java.lang.Throwable) reachedLimitException6);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException13 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException14 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        reachedLimitException13.addSuppressed((java.lang.Throwable) reachedLimitException14);
        reachedLimitException6.addSuppressed((java.lang.Throwable) reachedLimitException13);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException17 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray18 = reachedLimitException17.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException19 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException20 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        reachedLimitException19.addSuppressed((java.lang.Throwable) reachedLimitException20);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException22 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        reachedLimitException19.addSuppressed((java.lang.Throwable) reachedLimitException22);
        reachedLimitException17.addSuppressed((java.lang.Throwable) reachedLimitException22);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException25 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray26 = reachedLimitException25.getSuppressed();
        java.lang.Throwable[] throwableArray27 = reachedLimitException25.getSuppressed();
        reachedLimitException22.addSuppressed((java.lang.Throwable) reachedLimitException25);
        reachedLimitException6.addSuppressed((java.lang.Throwable) reachedLimitException25);
        java.lang.Throwable[] throwableArray30 = reachedLimitException6.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        boolean boolean11 = limiterSlidingWindow8.isPossibleSendRequest();
        boolean boolean12 = limiterSlidingWindow8.isPossibleSendRequest();
        java.lang.String str13 = limiterSlidingWindow8.getInstanceName();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setInstanceName("");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig4 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder6 = limiterConfigBuilder3.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig7 = limiterConfigBuilder3.build();
        int int8 = limiterConfig7.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow9 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig7);
        limiterSlidingWindow9.writeHistory();
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
        org.junit.Assert.assertNotNull(limiterConfig4);
        org.junit.Assert.assertNotNull(limiterConfigBuilder6);
        org.junit.Assert.assertNotNull(limiterConfig7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        limiterSlidingWindow7.writeHistory();
        boolean boolean9 = limiterSlidingWindow7.isPossibleSendRequest();
        java.lang.String str10 = limiterSlidingWindow7.getInstanceName();
        io.github.axel_n.limiter.dto.LimiterType limiterType11 = limiterSlidingWindow7.getLimiterType();
        io.github.axel_n.limiter.dto.LimiterType limiterType12 = limiterSlidingWindow7.getLimiterType();
        io.github.axel_n.limiter.dto.LimiterType limiterType13 = limiterSlidingWindow7.getLimiterType();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + limiterType11 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType11.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
        org.junit.Assert.assertTrue("'" + limiterType12 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType12.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
        org.junit.Assert.assertTrue("'" + limiterType13 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType13.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig(0L, 1, (long) 10, 10L, "io.github.axel_n.limiter.exception.ReachedLimitException");
        long long6 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow7.executeOrWait(runnable8, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException0 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray1 = reachedLimitException0.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException2 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException3 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        reachedLimitException2.addSuppressed((java.lang.Throwable) reachedLimitException3);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException5 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        reachedLimitException2.addSuppressed((java.lang.Throwable) reachedLimitException5);
        reachedLimitException0.addSuppressed((java.lang.Throwable) reachedLimitException5);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException8 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray9 = reachedLimitException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = reachedLimitException8.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException11 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray12 = reachedLimitException11.getSuppressed();
        reachedLimitException8.addSuppressed((java.lang.Throwable) reachedLimitException11);
        reachedLimitException0.addSuppressed((java.lang.Throwable) reachedLimitException8);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException15 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray16 = reachedLimitException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = reachedLimitException15.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException18 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray19 = reachedLimitException18.getSuppressed();
        reachedLimitException15.addSuppressed((java.lang.Throwable) reachedLimitException18);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException21 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray22 = reachedLimitException21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = reachedLimitException21.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException24 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray25 = reachedLimitException24.getSuppressed();
        reachedLimitException21.addSuppressed((java.lang.Throwable) reachedLimitException24);
        reachedLimitException15.addSuppressed((java.lang.Throwable) reachedLimitException21);
        reachedLimitException8.addSuppressed((java.lang.Throwable) reachedLimitException15);
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) 'a', (int) ' ', 10L, (long) 10, "io.github.axel_n.limiter.exception.ReachedLimitException");
        java.lang.String str6 = limiterConfig5.getInstanceName();
        long long7 = limiterConfig5.getSizeWindowInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        int int9 = limiterConfig5.getMaxRequestsInWindow();
        long long10 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        long long11 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "io.github.axel_n.limiter.exception.ReachedLimitException" + "'", str6, "io.github.axel_n.limiter.exception.ReachedLimitException");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setInstanceName("");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig4 = limiterConfigBuilder3.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder6 = limiterConfigBuilder3.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder8 = limiterConfigBuilder3.setInstanceName("hi!");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder10 = limiterConfigBuilder8.setInstanceName("io.github.axel_n.limiter.exception.ReachedLimitException");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder12 = limiterConfigBuilder10.setInstanceName("hi!");
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder15 = limiterConfigBuilder12.setMaxAwaitExecutionTime((int) 'a', timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
        org.junit.Assert.assertNotNull(limiterConfig4);
        org.junit.Assert.assertNotNull(limiterConfigBuilder6);
        org.junit.Assert.assertNotNull(limiterConfigBuilder8);
        org.junit.Assert.assertNotNull(limiterConfigBuilder10);
        org.junit.Assert.assertNotNull(limiterConfigBuilder12);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        io.github.axel_n.limiter.dto.LimiterType limiterType10 = limiterSlidingWindow8.getLimiterType();
        limiterSlidingWindow8.writeHistory();
        boolean boolean12 = limiterSlidingWindow8.isPossibleSendRequest();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + limiterType10 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType10.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig(97L, (int) (short) 10, 97L, (long) (byte) -1, "io.github.axel_n.limiter.exception.ReachedLimitException");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig(1L, 0, (long) 1, 0L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        long long7 = limiterConfig5.getSizeWindowInMilliseconds();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        long long7 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        long long8 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        long long9 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        java.lang.String str10 = limiterConfig5.getInstanceName();
        int int11 = limiterConfig5.getMaxRequestsInWindow();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean8 = limiterSlidingWindow7.isPossibleSendRequest();
        boolean boolean9 = limiterSlidingWindow7.isPossibleSendRequest();
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow7.executeOrWait(runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        boolean boolean11 = limiterSlidingWindow8.isPossibleSendRequest();
        io.github.axel_n.limiter.Limiter[] limiterArray12 = new io.github.axel_n.limiter.Limiter[] { limiterSlidingWindow8 };
        java.util.ArrayList<io.github.axel_n.limiter.Limiter> limiterList13 = new java.util.ArrayList<io.github.axel_n.limiter.Limiter>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<io.github.axel_n.limiter.Limiter>) limiterList13, limiterArray12);
        io.github.axel_n.limiter.annotation.LimiterAspect limiterAspect15 = new io.github.axel_n.limiter.annotation.LimiterAspect((java.util.List<io.github.axel_n.limiter.Limiter>) limiterList13);
        io.github.axel_n.limiter.annotation.LimiterAspect limiterAspect16 = new io.github.axel_n.limiter.annotation.LimiterAspect((java.util.List<io.github.axel_n.limiter.Limiter>) limiterList13);
        io.github.axel_n.limiter.annotation.LimiterAspect limiterAspect17 = new io.github.axel_n.limiter.annotation.LimiterAspect((java.util.List<io.github.axel_n.limiter.Limiter>) limiterList13);
        io.github.axel_n.limiter.annotation.LimiterAspect limiterAspect18 = new io.github.axel_n.limiter.annotation.LimiterAspect((java.util.List<io.github.axel_n.limiter.Limiter>) limiterList13);
        org.aspectj.lang.ProceedingJoinPoint proceedingJoinPoint19 = null;
        io.github.axel_n.limiter.annotation.LimiterConfig limiterConfig20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = limiterAspect18.process(proceedingJoinPoint19, limiterConfig20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(limiterArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        io.github.axel_n.limiter.dto.LimiterType limiterType11 = limiterSlidingWindow8.getLimiterType();
        limiterSlidingWindow8.writeHistory();
        java.lang.String str13 = limiterSlidingWindow8.getInstanceName();
        io.github.axel_n.limiter.dto.LimiterType limiterType14 = limiterSlidingWindow8.getLimiterType();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + limiterType11 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType11.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + limiterType14 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType14.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        io.github.axel_n.limiter.dto.LimiterType limiterType10 = limiterSlidingWindow8.getLimiterType();
        limiterSlidingWindow8.writeHistory();
        io.github.axel_n.limiter.dto.LimiterType limiterType12 = limiterSlidingWindow8.getLimiterType();
        java.lang.Class<?> wildcardClass13 = limiterType12.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + limiterType10 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType10.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
        org.junit.Assert.assertTrue("'" + limiterType12 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType12.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        io.github.axel_n.limiter.dto.LimiterType limiterType10 = limiterSlidingWindow8.getLimiterType();
        limiterSlidingWindow8.writeHistory();
        boolean boolean12 = limiterSlidingWindow8.isPossibleSendRequest();
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrWait(runnable13, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.TimeoutException; message: null");
        } catch (java.util.concurrent.TimeoutException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + limiterType10 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType10.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        int int8 = limiterConfig5.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow9 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean8 = limiterSlidingWindow7.isPossibleSendRequest();
        java.lang.Runnable runnable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow7.executeOrThrowException(runnable9);
            org.junit.Assert.fail("Expected exception of type io.github.axel_n.limiter.exception.ReachedLimitException; message: null");
        } catch (io.github.axel_n.limiter.exception.ReachedLimitException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException0 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray1 = reachedLimitException0.getSuppressed();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException2 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException3 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        reachedLimitException2.addSuppressed((java.lang.Throwable) reachedLimitException3);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException5 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        reachedLimitException2.addSuppressed((java.lang.Throwable) reachedLimitException5);
        reachedLimitException0.addSuppressed((java.lang.Throwable) reachedLimitException5);
        io.github.axel_n.limiter.exception.ReachedLimitException reachedLimitException8 = new io.github.axel_n.limiter.exception.ReachedLimitException();
        java.lang.Throwable[] throwableArray9 = reachedLimitException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = reachedLimitException8.getSuppressed();
        reachedLimitException5.addSuppressed((java.lang.Throwable) reachedLimitException8);
        java.lang.Throwable[] throwableArray12 = reachedLimitException5.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder0 = new io.github.axel_n.limiter.config.LimiterConfigBuilder();
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig1 = limiterConfigBuilder0.build();
        io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder3 = limiterConfigBuilder0.setInstanceName("");
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.axel_n.limiter.config.LimiterConfigBuilder limiterConfigBuilder6 = limiterConfigBuilder0.setPeriodForCheckExecution((int) (byte) -1, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(limiterConfig1);
        org.junit.Assert.assertNotNull(limiterConfigBuilder3);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        limiterSlidingWindow7.writeHistory();
        boolean boolean9 = limiterSlidingWindow7.isPossibleSendRequest();
        boolean boolean10 = limiterSlidingWindow7.isPossibleSendRequest();
        limiterSlidingWindow7.writeHistory();
        java.lang.Runnable runnable12 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             limiterSlidingWindow7.executeOrThrowException(runnable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) 10, (int) (byte) 10, (long) 1, 100L, "");
        long long6 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.Runnable runnable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow7.executeOrThrowException(runnable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        io.github.axel_n.limiter.dto.LimiterType limiterType9 = limiterSlidingWindow8.getLimiterType();
        boolean boolean10 = limiterSlidingWindow8.isPossibleSendRequest();
        boolean boolean11 = limiterSlidingWindow8.isPossibleSendRequest();
        limiterSlidingWindow8.writeHistory();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + limiterType9 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType9.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        long long7 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        long long8 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        long long9 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        java.lang.String str10 = limiterConfig5.getInstanceName();
        java.lang.String str11 = limiterConfig5.getInstanceName();
        long long12 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        limiterSlidingWindow7.writeHistory();
        boolean boolean9 = limiterSlidingWindow7.isPossibleSendRequest();
        java.lang.String str10 = limiterSlidingWindow7.getInstanceName();
        java.lang.String str11 = limiterSlidingWindow7.getInstanceName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) 'a', (int) ' ', 10L, (long) 10, "io.github.axel_n.limiter.exception.ReachedLimitException");
        java.lang.String str6 = limiterConfig5.getInstanceName();
        long long7 = limiterConfig5.getSizeWindowInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow9 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        io.github.axel_n.limiter.dto.LimiterType limiterType10 = limiterSlidingWindow9.getLimiterType();
        java.lang.String str11 = limiterSlidingWindow9.getInstanceName();
        io.github.axel_n.limiter.dto.LimiterType limiterType12 = limiterSlidingWindow9.getLimiterType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "io.github.axel_n.limiter.exception.ReachedLimitException" + "'", str6, "io.github.axel_n.limiter.exception.ReachedLimitException");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + limiterType10 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType10.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "io.github.axel_n.limiter.exception.ReachedLimitException" + "'", str11, "io.github.axel_n.limiter.exception.ReachedLimitException");
        org.junit.Assert.assertTrue("'" + limiterType12 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType12.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow7 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        java.lang.String str8 = limiterConfig5.getInstanceName();
        long long9 = limiterConfig5.getSizeWindowInMilliseconds();
        long long10 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        io.github.axel_n.limiter.dto.LimiterType limiterType10 = limiterSlidingWindow8.getLimiterType();
        limiterSlidingWindow8.writeHistory();
        io.github.axel_n.limiter.dto.LimiterType limiterType12 = limiterSlidingWindow8.getLimiterType();
        java.lang.Runnable runnable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            limiterSlidingWindow8.executeOrWait(runnable13, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.TimeoutException; message: null");
        } catch (java.util.concurrent.TimeoutException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + limiterType10 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType10.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
        org.junit.Assert.assertTrue("'" + limiterType12 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType12.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        int int6 = limiterConfig5.getMaxRequestsInWindow();
        long long7 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        long long8 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow9 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        long long10 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (-1), 1L, "");
        long long6 = limiterConfig5.getSizeWindowInMilliseconds();
        long long7 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow limiterSlidingWindow8 = new io.github.axel_n.limiter.sliding_window.LimiterSlidingWindow(limiterConfig5);
        boolean boolean9 = limiterSlidingWindow8.isPossibleSendRequest();
        java.lang.String str10 = limiterSlidingWindow8.getInstanceName();
        limiterSlidingWindow8.writeHistory();
        java.lang.String str12 = limiterSlidingWindow8.getInstanceName();
        io.github.axel_n.limiter.dto.LimiterType limiterType13 = limiterSlidingWindow8.getLimiterType();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + limiterType13 + "' != '" + io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW + "'", limiterType13.equals(io.github.axel_n.limiter.dto.LimiterType.SLIDING_WINDOW));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        io.github.axel_n.limiter.config.LimiterConfig limiterConfig5 = new io.github.axel_n.limiter.config.LimiterConfig((long) (byte) -1, (-1), (long) (short) -1, (long) 100, "");
        long long6 = limiterConfig5.getPeriodForCheckExecutionInMilliseconds();
        int int7 = limiterConfig5.getMaxRequestsInWindow();
        java.lang.String str8 = limiterConfig5.getInstanceName();
        long long9 = limiterConfig5.getMaxAwaitExecutionTimeInMilliseconds();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }
}
