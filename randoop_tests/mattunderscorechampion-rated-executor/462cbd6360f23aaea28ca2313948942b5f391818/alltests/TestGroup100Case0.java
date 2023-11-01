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
        java.util.concurrent.TimeUnit timeUnit1 = null;
        java.util.concurrent.ThreadFactory threadFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor3 = com.mattunderscore.rated.executor.RatedExecutors.ratedExecutor((long) (byte) 1, timeUnit1, threadFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.ratedExecutor((long) (-1), timeUnit1);
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<?> wildcardFuture4 = iRatedExecutor2.schedule(runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iRatedExecutor2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperIRepeatingFutureSingleFuture1 = new com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>(iTaskCanceller0);
        boolean boolean2 = runnableWrapperIRepeatingFutureSingleFuture1.isCancelled();
        boolean boolean3 = runnableWrapperIRepeatingFutureSingleFuture1.isDone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.ratedExecutor((long) (-1), timeUnit1);
        java.lang.Runnable runnable3 = null;
        com.mattunderscore.executors.RunnableWrapper runnableWrapper4 = new com.mattunderscore.executors.RunnableWrapper(runnable3);
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.IRepeatingFuture<java.lang.Void> voidIRepeatingFuture6 = iRatedExecutor2.schedule((java.util.concurrent.Callable<java.lang.Void>) runnableWrapper4, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iRatedExecutor2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        com.mattunderscore.executors.ITaskWrapper iTaskWrapper3 = null;
        runnableWrapperRepeatingFuture2.setTask(iTaskWrapper3);
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper7 = runnableWrapperRepeatingFuture2.get((long) (short) -1, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        java.util.concurrent.ThreadFactory threadFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor3 = com.mattunderscore.rated.executor.RatedExecutors.ratedExecutor((long) (short) 10, timeUnit1, threadFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.util.concurrent.Callable<com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>> runnableWrapperIRepeatingFutureSingleFutureCallable0 = null;
        com.mattunderscore.executors.ITaskResultProcessor<com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>> runnableWrapperIRepeatingFutureSingleFutureITaskResultProcessor1 = null;
        com.mattunderscore.executors.TaskWrapper<com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>> runnableWrapperIRepeatingFutureSingleFutureTaskWrapper2 = new com.mattunderscore.executors.TaskWrapper<com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>>(runnableWrapperIRepeatingFutureSingleFutureCallable0, runnableWrapperIRepeatingFutureSingleFutureITaskResultProcessor1);
        // The following exception was thrown during execution in test generation
        try {
            runnableWrapperIRepeatingFutureSingleFutureTaskWrapper2.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.ratedExecutor((long) (-1), timeUnit1);
        java.lang.Runnable runnable3 = null;
        com.mattunderscore.executors.RunnableWrapper runnableWrapper4 = new com.mattunderscore.executors.RunnableWrapper(runnable3);
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.IRepeatingFuture<java.lang.Void> voidIRepeatingFuture6 = iRatedExecutor2.schedule((java.util.concurrent.Callable<java.lang.Void>) runnableWrapper4, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iRatedExecutor2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        com.mattunderscore.executors.UncaughtExceptionResult uncaughtExceptionResult0 = com.mattunderscore.executors.UncaughtExceptionResult.VOID_RESULT_PROCESSOR;
        org.junit.Assert.assertNotNull(uncaughtExceptionResult0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.ratedExecutor((long) (-1), timeUnit1);
        java.lang.Runnable runnable3 = null;
        com.mattunderscore.executors.RunnableWrapper runnableWrapper4 = new com.mattunderscore.executors.RunnableWrapper(runnable3);
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.IRepeatingFuture<java.lang.Void> voidIRepeatingFuture6 = iRatedExecutor2.schedule((java.util.concurrent.Callable<java.lang.Void>) runnableWrapper4, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iRatedExecutor2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        boolean boolean5 = runnableWrapperRepeatingFuture2.isCancelled();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = runnableWrapperRepeatingFuture2.cancel(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.ratedExecutor((long) (byte) 1, timeUnit1);
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<?> wildcardFuture4 = iRatedExecutor2.submit(runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iRatedExecutor2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperIRepeatingFutureSingleFuture1 = new com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>(iTaskCanceller0);
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = runnableWrapperIRepeatingFutureSingleFuture1.get(1L, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.ratedExecutor((long) (-1), timeUnit1);
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<?> wildcardFuture4 = iRatedExecutor2.submit(runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iRatedExecutor2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.ratedExecutor((long) 10, timeUnit1);
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<?> wildcardFuture4 = iRatedExecutor2.submit(runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iRatedExecutor2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        java.util.concurrent.ThreadFactory threadFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.IUniversalExecutor iUniversalExecutor3 = com.mattunderscore.rated.executor.RatedExecutors.simpleRatedExecutor((long) 0, timeUnit1, threadFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperIRepeatingFutureSingleFuture1 = new com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>(iTaskCanceller0);
        boolean boolean2 = runnableWrapperIRepeatingFutureSingleFuture1.isCancelled();
        com.mattunderscore.executors.ITaskWrapper iTaskWrapper3 = null;
        runnableWrapperIRepeatingFutureSingleFuture1.setTask(iTaskWrapper3);
        boolean boolean5 = runnableWrapperIRepeatingFutureSingleFuture1.isCancelled();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.IUniversalExecutor> iUniversalExecutorRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.IUniversalExecutor>(iTaskCanceller0, 10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        boolean boolean5 = runnableWrapperRepeatingFuture2.isCancelled();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = runnableWrapperRepeatingFuture2.cancel(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.ratedExecutor((long) (byte) 1, timeUnit1);
        java.lang.Runnable runnable3 = null;
        com.mattunderscore.executors.RunnableWrapper runnableWrapper4 = new com.mattunderscore.executors.RunnableWrapper(runnable3);
        // The following exception was thrown during execution in test generation
        try {
            iRatedExecutor2.execute((java.util.concurrent.Callable<java.lang.Void>) runnableWrapper4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iRatedExecutor2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        com.mattunderscore.executors.UncaughtExceptionResult<com.mattunderscore.rated.executor.IRatedExecutor> iRatedExecutorUncaughtExceptionResult0 = new com.mattunderscore.executors.UncaughtExceptionResult<com.mattunderscore.rated.executor.IRatedExecutor>();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper6 = runnableWrapperRepeatingFuture2.getResult((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.ExecutionException; message: null");
        } catch (java.util.concurrent.ExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        com.mattunderscore.executors.ITaskWrapper iTaskWrapper6 = null;
        runnableWrapperRepeatingFuture2.setTask(iTaskWrapper6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = runnableWrapperRepeatingFuture2.cancel(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperIRepeatingFutureSingleFuture1 = new com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>(iTaskCanceller0);
        boolean boolean2 = runnableWrapperIRepeatingFutureSingleFuture1.isCancelled();
        com.mattunderscore.executors.ITaskWrapper iTaskWrapper3 = null;
        runnableWrapperIRepeatingFutureSingleFuture1.setTask(iTaskWrapper3);
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = runnableWrapperIRepeatingFutureSingleFuture1.get((-1L), timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.ratedExecutor((long) (-1), timeUnit1);
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.IRepeatingFuture<?> wildcardIRepeatingFuture5 = iRatedExecutor2.schedule(runnable3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iRatedExecutor2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.util.concurrent.Callable<java.lang.Comparable<java.lang.String>> strComparableCallable0 = null;
        com.mattunderscore.executors.ITaskResultProcessor<java.lang.Comparable<java.lang.String>> strComparableITaskResultProcessor1 = null;
        com.mattunderscore.executors.TaskWrapper<java.lang.Comparable<java.lang.String>> strComparableTaskWrapper2 = new com.mattunderscore.executors.TaskWrapper<java.lang.Comparable<java.lang.String>>(strComparableCallable0, strComparableITaskResultProcessor1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        java.util.concurrent.ThreadFactory threadFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.IUniversalExecutor iUniversalExecutor3 = com.mattunderscore.rated.executor.RatedExecutors.simpleRatedExecutor((long) (short) 10, timeUnit1, threadFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        boolean boolean5 = runnableWrapperRepeatingFuture2.isCancelled();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = runnableWrapperRepeatingFuture2.get();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.ExecutionException; message: null");
        } catch (java.util.concurrent.ExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperIRepeatingFutureSingleFuture1 = new com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>(iTaskCanceller0);
        boolean boolean2 = runnableWrapperIRepeatingFutureSingleFuture1.isCancelled();
        com.mattunderscore.executors.ITaskWrapper iTaskWrapper3 = null;
        runnableWrapperIRepeatingFutureSingleFuture1.setTask(iTaskWrapper3);
        boolean boolean5 = runnableWrapperIRepeatingFutureSingleFuture1.isDone();
        boolean boolean6 = runnableWrapperIRepeatingFutureSingleFuture1.isCancelled();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.mattunderscore.executors.UncaughtExceptionResult<java.lang.CharSequence> charSequenceUncaughtExceptionResult0 = new com.mattunderscore.executors.UncaughtExceptionResult<java.lang.CharSequence>();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        com.mattunderscore.executors.ITaskWrapper iTaskWrapper3 = null;
        runnableWrapperRepeatingFuture2.setTask(iTaskWrapper3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = runnableWrapperRepeatingFuture2.cancel(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        int int7 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = runnableWrapperRepeatingFuture2.get();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.ExecutionException; message: null");
        } catch (java.util.concurrent.ExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        com.mattunderscore.executors.ITaskWrapper iTaskWrapper3 = null;
        runnableWrapperRepeatingFuture2.setTask(iTaskWrapper3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = runnableWrapperRepeatingFuture2.cancel(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        java.lang.Throwable throwable7 = null;
        com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>> strComparableTaskExecutionResult8 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>>(throwable7);
        java.util.concurrent.ExecutionException executionException9 = strComparableTaskExecutionResult8.exception;
        runnableWrapperRepeatingFuture2.setException((java.lang.Throwable) executionException9);
        com.mattunderscore.executors.TaskExecutionResult<java.io.Serializable> serializableTaskExecutionResult11 = new com.mattunderscore.executors.TaskExecutionResult<java.io.Serializable>((java.lang.Throwable) executionException9);
        java.lang.Class<?> wildcardClass12 = executionException9.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(executionException9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = runnableWrapperRepeatingFuture2.get((long) (byte) 1, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        boolean boolean6 = runnableWrapperRepeatingFuture2.isCancelled();
        int int7 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper9 = runnableWrapperRepeatingFuture2.getResult((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        boolean boolean5 = runnableWrapperRepeatingFuture2.isCancelled();
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper7 = runnableWrapperRepeatingFuture2.getResult(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        boolean boolean5 = runnableWrapperRepeatingFuture2.isCancelled();
        boolean boolean6 = runnableWrapperRepeatingFuture2.isDone();
        boolean boolean7 = runnableWrapperRepeatingFuture2.isCancelled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperIRepeatingFutureSingleFuture1 = new com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>(iTaskCanceller0);
        boolean boolean2 = runnableWrapperIRepeatingFutureSingleFuture1.isCancelled();
        com.mattunderscore.executors.ITaskWrapper iTaskWrapper3 = null;
        runnableWrapperIRepeatingFutureSingleFuture1.setTask(iTaskWrapper3);
        boolean boolean5 = runnableWrapperIRepeatingFutureSingleFuture1.isDone();
        boolean boolean6 = runnableWrapperIRepeatingFutureSingleFuture1.isDone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        java.util.concurrent.ThreadFactory threadFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.IUniversalExecutor iUniversalExecutor3 = com.mattunderscore.rated.executor.RatedExecutors.simpleRatedExecutor((long) (-1), timeUnit1, threadFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        boolean boolean7 = runnableWrapperRepeatingFuture2.isDone();
        boolean boolean8 = runnableWrapperRepeatingFuture2.isDone();
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper12 = runnableWrapperRepeatingFuture2.getResult((int) '#', (long) (byte) 0, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = runnableWrapperRepeatingFuture2.get();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.ExecutionException; message: null");
        } catch (java.util.concurrent.ExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        boolean boolean6 = runnableWrapperRepeatingFuture2.isCancelled();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper10 = runnableWrapperRepeatingFuture2.getResult(100, (long) (byte) 100, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        int int3 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = runnableWrapperRepeatingFuture2.cancel(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper7 = runnableWrapperRepeatingFuture2.getResult((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        java.util.concurrent.ThreadFactory threadFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor3 = com.mattunderscore.rated.executor.RatedExecutors.ratedExecutor((long) 2, timeUnit1, threadFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.executors.IUniversalExecutor iUniversalExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.simpleRatedExecutor((long) 'a', timeUnit1);
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            iUniversalExecutor2.execute(runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iUniversalExecutor2);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        boolean boolean7 = runnableWrapperRepeatingFuture2.isDone();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = runnableWrapperRepeatingFuture2.cancel(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.interruptableRatedExecutor(1L, timeUnit1);
        org.junit.Assert.assertNotNull(iRatedExecutor2);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperIRepeatingFutureSingleFuture1 = new com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>(iTaskCanceller0);
        boolean boolean2 = runnableWrapperIRepeatingFutureSingleFuture1.isCancelled();
        java.lang.Class<?> wildcardClass3 = runnableWrapperIRepeatingFutureSingleFuture1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.ratedExecutor((long) (byte) 1, timeUnit1);
        java.lang.Runnable runnable3 = null;
        com.mattunderscore.executors.RunnableWrapper runnableWrapper4 = new com.mattunderscore.executors.RunnableWrapper(runnable3);
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.IRepeatingFuture<java.lang.Void> voidIRepeatingFuture6 = iRatedExecutor2.schedule((java.util.concurrent.Callable<java.lang.Void>) runnableWrapper4, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iRatedExecutor2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        boolean boolean7 = runnableWrapperRepeatingFuture2.isDone();
        int int8 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper12 = runnableWrapperRepeatingFuture2.getResult((int) '#', (long) ' ', timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        java.lang.Throwable throwable0 = null;
        com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>> strComparableTaskExecutionResult1 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>>(throwable0);
        java.lang.Comparable<java.lang.String> strComparable2 = strComparableTaskExecutionResult1.result;
        org.junit.Assert.assertNull(strComparable2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        com.mattunderscore.executors.UncaughtExceptionResult<java.lang.Object> objUncaughtExceptionResult0 = new com.mattunderscore.executors.UncaughtExceptionResult<java.lang.Object>();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        boolean boolean6 = runnableWrapperRepeatingFuture2.isCancelled();
        int int7 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper11 = runnableWrapperRepeatingFuture2.getResult(10, (long) (byte) 0, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.executors.IUniversalExecutor iUniversalExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.simpleRatedExecutor((long) 100, timeUnit1);
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            iUniversalExecutor2.execute(runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iUniversalExecutor2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        int int7 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper11 = runnableWrapperRepeatingFuture2.getResult((int) (byte) 10, (long) 100, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        boolean boolean5 = runnableWrapperRepeatingFuture2.isCancelled();
        com.mattunderscore.executors.ITaskWrapper iTaskWrapper6 = null;
        runnableWrapperRepeatingFuture2.setTask(iTaskWrapper6);
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper9 = runnableWrapperRepeatingFuture2.getResult((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        boolean boolean6 = runnableWrapperRepeatingFuture2.isCancelled();
        int int7 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        boolean boolean8 = runnableWrapperRepeatingFuture2.isCancelled();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper11 = runnableWrapperRepeatingFuture2.get((long) ' ', timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        java.util.concurrent.ThreadFactory threadFactory2 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor3 = com.mattunderscore.rated.executor.RatedExecutors.interruptableRatedExecutor((long) (byte) 0, timeUnit1, threadFactory2);
        java.lang.Runnable runnable4 = null;
        com.mattunderscore.executors.RunnableWrapper runnableWrapper5 = new com.mattunderscore.executors.RunnableWrapper(runnable4);
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.IRepeatingFuture<java.lang.Void> voidIRepeatingFuture7 = iRatedExecutor3.schedule((java.util.concurrent.Callable<java.lang.Void>) runnableWrapper5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iRatedExecutor3);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        com.mattunderscore.executors.ITaskWrapper iTaskWrapper3 = null;
        runnableWrapperRepeatingFuture2.setTask(iTaskWrapper3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.interruptableRatedExecutor(0L, timeUnit1);
        java.lang.Runnable runnable3 = null;
        java.util.concurrent.Future<?> wildcardFuture4 = iRatedExecutor2.schedule(runnable3);
        java.lang.Runnable runnable5 = null;
        com.mattunderscore.executors.IRepeatingFuture<?> wildcardIRepeatingFuture7 = iRatedExecutor2.schedule(runnable5, (int) (byte) 1);
        org.junit.Assert.assertNotNull(iRatedExecutor2);
        org.junit.Assert.assertNotNull(wildcardFuture4);
        org.junit.Assert.assertNotNull(wildcardIRepeatingFuture7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperIRepeatingFutureSingleFuture1 = new com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>(iTaskCanceller0);
        boolean boolean2 = runnableWrapperIRepeatingFutureSingleFuture1.isDone();
        java.lang.Class<?> wildcardClass3 = runnableWrapperIRepeatingFutureSingleFuture1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = runnableWrapperRepeatingFuture2.get();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.ExecutionException; message: null");
        } catch (java.util.concurrent.ExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.ratedExecutor(0L, timeUnit1);
        java.util.concurrent.Callable<java.lang.Void> voidCallable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Void> voidFuture4 = iRatedExecutor2.submit(voidCallable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iRatedExecutor2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        boolean boolean5 = runnableWrapperRepeatingFuture2.isCancelled();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = runnableWrapperRepeatingFuture2.cancel(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        boolean boolean7 = runnableWrapperRepeatingFuture2.isDone();
        int int8 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper12 = runnableWrapperRepeatingFuture2.getResult(0, (long) (short) 100, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.lang.Runnable runnable0 = null;
        com.mattunderscore.executors.RunnableWrapper runnableWrapper1 = new com.mattunderscore.executors.RunnableWrapper(runnable0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Void void2 = runnableWrapper1.call();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        com.mattunderscore.executors.ITaskWrapper iTaskWrapper3 = null;
        runnableWrapperRepeatingFuture2.setTask(iTaskWrapper3);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper8 = runnableWrapperRepeatingFuture2.getResult((int) (byte) 0, (long) (byte) -1, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.interruptableRatedExecutor((long) (byte) -1, timeUnit1);
        java.lang.Runnable runnable3 = null;
        com.mattunderscore.executors.IRepeatingFuture<?> wildcardIRepeatingFuture5 = iRatedExecutor2.schedule(runnable3, 2);
        org.junit.Assert.assertNotNull(iRatedExecutor2);
        org.junit.Assert.assertNotNull(wildcardIRepeatingFuture5);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.ratedExecutor((long) 1, timeUnit1);
        java.lang.Runnable runnable3 = null;
        com.mattunderscore.executors.RunnableWrapper runnableWrapper4 = new com.mattunderscore.executors.RunnableWrapper(runnable3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Void> voidFuture5 = iRatedExecutor2.submit((java.util.concurrent.Callable<java.lang.Void>) runnableWrapper4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iRatedExecutor2);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = runnableWrapperRepeatingFuture2.get();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        com.mattunderscore.executors.ITaskWrapper iTaskWrapper6 = null;
        runnableWrapperRepeatingFuture2.setTask(iTaskWrapper6);
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper8 = runnableWrapperRepeatingFuture2.get();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.ExecutionException; message: null");
        } catch (java.util.concurrent.ExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.util.concurrent.Callable<com.mattunderscore.executors.IUniversalExecutor> iUniversalExecutorCallable0 = null;
        com.mattunderscore.executors.ITaskResultProcessor<com.mattunderscore.executors.IUniversalExecutor> iUniversalExecutorITaskResultProcessor1 = null;
        com.mattunderscore.executors.TaskWrapper<com.mattunderscore.executors.IUniversalExecutor> iUniversalExecutorTaskWrapper2 = new com.mattunderscore.executors.TaskWrapper<com.mattunderscore.executors.IUniversalExecutor>(iUniversalExecutorCallable0, iUniversalExecutorITaskResultProcessor1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.mattunderscore.executors.UncaughtExceptionResult<java.io.Serializable> serializableUncaughtExceptionResult0 = new com.mattunderscore.executors.UncaughtExceptionResult<java.io.Serializable>();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        com.mattunderscore.executors.ITaskWrapper iTaskWrapper3 = null;
        runnableWrapperRepeatingFuture2.setTask(iTaskWrapper3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper9 = runnableWrapperRepeatingFuture2.get((long) (byte) 1, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        boolean boolean7 = runnableWrapperRepeatingFuture2.isCancelled();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = runnableWrapperRepeatingFuture2.cancel(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        com.mattunderscore.executors.ITaskWrapper iTaskWrapper6 = null;
        runnableWrapperRepeatingFuture2.setTask(iTaskWrapper6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = runnableWrapperRepeatingFuture2.cancel(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper8 = runnableWrapperRepeatingFuture2.get((long) (byte) 10, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        boolean boolean6 = runnableWrapperRepeatingFuture2.isCancelled();
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper8 = runnableWrapperRepeatingFuture2.getResult((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        boolean boolean5 = runnableWrapperRepeatingFuture2.isCancelled();
        java.lang.Class<?> wildcardClass6 = runnableWrapperRepeatingFuture2.getClass();
        com.mattunderscore.executors.TaskExecutionResult<java.lang.reflect.Type> typeTaskExecutionResult7 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        boolean boolean6 = runnableWrapperRepeatingFuture2.isCancelled();
        int int7 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        boolean boolean8 = runnableWrapperRepeatingFuture2.isCancelled();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        java.util.concurrent.Callable<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperRepeatingFutureCallable0 = null;
        com.mattunderscore.executors.ITaskResultProcessor<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperRepeatingFutureITaskResultProcessor1 = null;
        com.mattunderscore.executors.TaskWrapper<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperRepeatingFutureTaskWrapper2 = new com.mattunderscore.executors.TaskWrapper<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>(runnableWrapperRepeatingFutureCallable0, runnableWrapperRepeatingFutureITaskResultProcessor1);
        // The following exception was thrown during execution in test generation
        try {
            runnableWrapperRepeatingFutureTaskWrapper2.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        java.lang.Throwable throwable7 = null;
        com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>> strComparableTaskExecutionResult8 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>>(throwable7);
        java.util.concurrent.ExecutionException executionException9 = strComparableTaskExecutionResult8.exception;
        runnableWrapperRepeatingFuture2.setException((java.lang.Throwable) executionException9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper13 = runnableWrapperRepeatingFuture2.get((long) '4', timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(executionException9);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.ratedExecutor((long) 1, timeUnit1);
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.IRepeatingFuture<?> wildcardIRepeatingFuture5 = iRatedExecutor2.schedule(runnable3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iRatedExecutor2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        java.lang.Throwable throwable7 = null;
        com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>> strComparableTaskExecutionResult8 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>>(throwable7);
        java.util.concurrent.ExecutionException executionException9 = strComparableTaskExecutionResult8.exception;
        runnableWrapperRepeatingFuture2.setException((java.lang.Throwable) executionException9);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = runnableWrapperRepeatingFuture2.get((long) (short) 100, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(executionException9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        com.mattunderscore.executors.ISettableFuture<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperRepeatingFutureISettableFuture0 = null;
        com.mattunderscore.executors.FutureSetResult<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperRepeatingFutureFutureSetResult1 = new com.mattunderscore.executors.FutureSetResult<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>(runnableWrapperRepeatingFutureISettableFuture0);
        com.mattunderscore.executors.TaskWrapperFactory taskWrapperFactory2 = new com.mattunderscore.executors.TaskWrapperFactory();
        java.lang.Runnable runnable3 = null;
        com.mattunderscore.executors.ITaskWrapper iTaskWrapper4 = taskWrapperFactory2.newWrapper(runnable3);
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture5 = null;
        // The following exception was thrown during execution in test generation
        try {
            runnableWrapperRepeatingFutureFutureSetResult1.onResult(iTaskWrapper4, runnableWrapperRepeatingFuture5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTaskWrapper4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        int int7 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        int int8 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper9 = runnableWrapperRepeatingFuture2.get();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.ExecutionException; message: null");
        } catch (java.util.concurrent.ExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.interruptableRatedExecutor(0L, timeUnit1);
        java.lang.Runnable runnable3 = null;
        java.util.concurrent.Future<?> wildcardFuture4 = iRatedExecutor2.schedule(runnable3);
        java.lang.Runnable runnable5 = null;
        java.util.concurrent.Future<?> wildcardFuture6 = iRatedExecutor2.submit(runnable5);
        org.junit.Assert.assertNotNull(iRatedExecutor2);
        org.junit.Assert.assertNotNull(wildcardFuture4);
        org.junit.Assert.assertNotNull(wildcardFuture6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        java.lang.Throwable throwable0 = null;
        com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>> strComparableTaskExecutionResult1 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>>(throwable0);
        java.util.concurrent.ExecutionException executionException2 = strComparableTaskExecutionResult1.exception;
        java.util.concurrent.ExecutionException executionException3 = strComparableTaskExecutionResult1.exception;
        java.lang.Class<?> wildcardClass4 = executionException3.getClass();
        com.mattunderscore.executors.TaskExecutionResult<java.lang.reflect.Type> typeTaskExecutionResult5 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.reflect.Type>((java.lang.reflect.Type) wildcardClass4);
        org.junit.Assert.assertNotNull(executionException2);
        org.junit.Assert.assertNotNull(executionException3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.mattunderscore.executors.ISettableFuture<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperRepeatingFutureISettableFuture0 = null;
        com.mattunderscore.executors.FutureSetResult<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperRepeatingFutureFutureSetResult1 = new com.mattunderscore.executors.FutureSetResult<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>(runnableWrapperRepeatingFutureISettableFuture0);
        com.mattunderscore.executors.TaskWrapperFactory taskWrapperFactory2 = new com.mattunderscore.executors.TaskWrapperFactory();
        java.lang.Runnable runnable3 = null;
        com.mattunderscore.executors.ITaskResultProcessor<java.lang.Void> voidITaskResultProcessor4 = null;
        com.mattunderscore.executors.ITaskWrapper iTaskWrapper5 = taskWrapperFactory2.newWrapper(runnable3, voidITaskResultProcessor4);
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller6 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture8 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller6, (int) 'a');
        java.lang.Throwable throwable9 = null;
        runnableWrapperRepeatingFuture8.setException(throwable9);
        int int11 = runnableWrapperRepeatingFuture8.getExpectedExecutions();
        int int12 = runnableWrapperRepeatingFuture8.getCompletedExecutions();
        java.lang.Throwable throwable13 = null;
        com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>> strComparableTaskExecutionResult14 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>>(throwable13);
        java.util.concurrent.ExecutionException executionException15 = strComparableTaskExecutionResult14.exception;
        runnableWrapperRepeatingFuture8.setException((java.lang.Throwable) executionException15);
        com.mattunderscore.executors.TaskExecutionResult<java.io.Serializable> serializableTaskExecutionResult17 = new com.mattunderscore.executors.TaskExecutionResult<java.io.Serializable>((java.lang.Throwable) executionException15);
        com.mattunderscore.executors.TaskExecutionResult<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperIRepeatingFutureTaskExecutionResult18 = new com.mattunderscore.executors.TaskExecutionResult<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>((java.lang.Throwable) executionException15);
        // The following exception was thrown during execution in test generation
        try {
            runnableWrapperRepeatingFutureFutureSetResult1.onThrowable(iTaskWrapper5, (java.lang.Throwable) executionException15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTaskWrapper5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(executionException15);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        java.lang.Throwable throwable0 = null;
        com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>> strComparableTaskExecutionResult1 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>>(throwable0);
        java.util.concurrent.ExecutionException executionException2 = strComparableTaskExecutionResult1.exception;
        java.util.concurrent.ExecutionException executionException3 = strComparableTaskExecutionResult1.exception;
        java.util.concurrent.ExecutionException executionException4 = strComparableTaskExecutionResult1.exception;
        com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>> strComparableTaskExecutionResult5 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>>((java.lang.Throwable) executionException4);
        org.junit.Assert.assertNotNull(executionException2);
        org.junit.Assert.assertNotNull(executionException3);
        org.junit.Assert.assertNotNull(executionException4);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.interruptableRatedExecutor((long) ' ', timeUnit1);
        java.lang.Runnable runnable3 = null;
        java.util.concurrent.Future<?> wildcardFuture4 = iRatedExecutor2.submit(runnable3);
        org.junit.Assert.assertNotNull(iRatedExecutor2);
        org.junit.Assert.assertNotNull(wildcardFuture4);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        java.lang.Throwable throwable7 = null;
        com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>> strComparableTaskExecutionResult8 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>>(throwable7);
        java.util.concurrent.ExecutionException executionException9 = strComparableTaskExecutionResult8.exception;
        runnableWrapperRepeatingFuture2.setException((java.lang.Throwable) executionException9);
        boolean boolean11 = runnableWrapperRepeatingFuture2.isDone();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(executionException9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        com.mattunderscore.executors.ITaskWrapper iTaskWrapper3 = null;
        runnableWrapperRepeatingFuture2.setTask(iTaskWrapper3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int7 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        boolean boolean8 = runnableWrapperRepeatingFuture2.isDone();
        java.lang.Throwable throwable9 = null;
        runnableWrapperRepeatingFuture2.setException(throwable9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        boolean boolean7 = runnableWrapperRepeatingFuture2.isCancelled();
        int int8 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        java.util.concurrent.ThreadFactory threadFactory2 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor3 = com.mattunderscore.rated.executor.RatedExecutors.interruptableRatedExecutor((long) (short) 100, timeUnit1, threadFactory2);
        org.junit.Assert.assertNotNull(iRatedExecutor3);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.SingleFuture<java.lang.Comparable<java.lang.String>> strComparableSingleFuture1 = new com.mattunderscore.executors.SingleFuture<java.lang.Comparable<java.lang.String>>(iTaskCanceller0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.executors.IUniversalExecutor iUniversalExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.simpleRatedExecutor((long) 'a', timeUnit1);
        java.lang.Runnable runnable3 = null;
        com.mattunderscore.executors.RunnableWrapper runnableWrapper4 = new com.mattunderscore.executors.RunnableWrapper(runnable3);
        // The following exception was thrown during execution in test generation
        try {
            iUniversalExecutor2.execute((java.util.concurrent.Callable<java.lang.Void>) runnableWrapper4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iUniversalExecutor2);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.SingleFuture<java.lang.String> strSingleFuture1 = new com.mattunderscore.executors.SingleFuture<java.lang.String>(iTaskCanceller0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.SingleFuture<java.lang.Throwable> throwableSingleFuture1 = new com.mattunderscore.executors.SingleFuture<java.lang.Throwable>(iTaskCanceller0);
        java.lang.Class<?> wildcardClass2 = throwableSingleFuture1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        int int7 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        int int8 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper11 = runnableWrapperRepeatingFuture2.get((long) ' ', timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.ratedExecutor((long) (byte) 1, timeUnit1);
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.IRepeatingFuture<?> wildcardIRepeatingFuture5 = iRatedExecutor2.schedule(runnable3, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iRatedExecutor2);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.ratedExecutor((long) (short) 1, timeUnit1);
        org.junit.Assert.assertNotNull(iRatedExecutor2);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.mattunderscore.executors.ISettableFuture<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperRepeatingFutureISettableFuture0 = null;
        com.mattunderscore.executors.FutureSetResult<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperRepeatingFutureFutureSetResult1 = new com.mattunderscore.executors.FutureSetResult<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>(runnableWrapperRepeatingFutureISettableFuture0);
        com.mattunderscore.executors.TaskWrapperFactory taskWrapperFactory2 = new com.mattunderscore.executors.TaskWrapperFactory();
        java.lang.Runnable runnable3 = null;
        com.mattunderscore.executors.ITaskWrapper iTaskWrapper4 = taskWrapperFactory2.newWrapper(runnable3);
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller5 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture7 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller5, (int) 'a');
        java.lang.Throwable throwable8 = null;
        runnableWrapperRepeatingFuture7.setException(throwable8);
        int int10 = runnableWrapperRepeatingFuture7.getExpectedExecutions();
        int int11 = runnableWrapperRepeatingFuture7.getCompletedExecutions();
        java.lang.Throwable throwable12 = null;
        com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>> strComparableTaskExecutionResult13 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>>(throwable12);
        java.util.concurrent.ExecutionException executionException14 = strComparableTaskExecutionResult13.exception;
        runnableWrapperRepeatingFuture7.setException((java.lang.Throwable) executionException14);
        com.mattunderscore.executors.TaskExecutionResult<java.io.Serializable> serializableTaskExecutionResult16 = new com.mattunderscore.executors.TaskExecutionResult<java.io.Serializable>((java.lang.Throwable) executionException14);
        com.mattunderscore.executors.TaskExecutionResult<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperIRepeatingFutureTaskExecutionResult17 = new com.mattunderscore.executors.TaskExecutionResult<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>((java.lang.Throwable) executionException14);
        // The following exception was thrown during execution in test generation
        try {
            runnableWrapperRepeatingFutureFutureSetResult1.onThrowable(iTaskWrapper4, (java.lang.Throwable) executionException14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTaskWrapper4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(executionException14);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.mattunderscore.executors.ISettableFuture<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperRepeatingFutureISettableFuture0 = null;
        com.mattunderscore.executors.FutureSetResult<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperRepeatingFutureFutureSetResult1 = new com.mattunderscore.executors.FutureSetResult<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>(runnableWrapperRepeatingFutureISettableFuture0);
        com.mattunderscore.executors.TaskWrapperFactory taskWrapperFactory2 = new com.mattunderscore.executors.TaskWrapperFactory();
        java.lang.Runnable runnable3 = null;
        com.mattunderscore.executors.ITaskResultProcessor<java.lang.Void> voidITaskResultProcessor4 = null;
        com.mattunderscore.executors.ITaskWrapper iTaskWrapper5 = taskWrapperFactory2.newWrapper(runnable3, voidITaskResultProcessor4);
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller6 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture8 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller6, (int) 'a');
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller9 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture11 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller9, (int) 'a');
        java.lang.Throwable throwable12 = null;
        runnableWrapperRepeatingFuture11.setException(throwable12);
        int int14 = runnableWrapperRepeatingFuture11.getExpectedExecutions();
        int int15 = runnableWrapperRepeatingFuture11.getCompletedExecutions();
        java.lang.Throwable throwable16 = null;
        com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>> strComparableTaskExecutionResult17 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>>(throwable16);
        java.util.concurrent.ExecutionException executionException18 = strComparableTaskExecutionResult17.exception;
        runnableWrapperRepeatingFuture11.setException((java.lang.Throwable) executionException18);
        com.mattunderscore.executors.TaskExecutionResult<java.io.Serializable> serializableTaskExecutionResult20 = new com.mattunderscore.executors.TaskExecutionResult<java.io.Serializable>((java.lang.Throwable) executionException18);
        com.mattunderscore.executors.TaskExecutionResult<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperIRepeatingFutureTaskExecutionResult21 = new com.mattunderscore.executors.TaskExecutionResult<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>((java.lang.Throwable) executionException18);
        runnableWrapperRepeatingFuture8.setException((java.lang.Throwable) executionException18);
        // The following exception was thrown during execution in test generation
        try {
            runnableWrapperRepeatingFutureFutureSetResult1.onThrowable(iTaskWrapper5, (java.lang.Throwable) executionException18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTaskWrapper5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(executionException18);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.interruptableRatedExecutor((long) (byte) 100, timeUnit1);
        java.lang.Runnable runnable3 = null;
        java.util.concurrent.Future<?> wildcardFuture4 = iRatedExecutor2.schedule(runnable3);
        java.lang.Runnable runnable5 = null;
        iRatedExecutor2.execute(runnable5);
        org.junit.Assert.assertNotNull(iRatedExecutor2);
        org.junit.Assert.assertNotNull(wildcardFuture4);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.interruptableRatedExecutor(0L, timeUnit1);
        java.lang.Runnable runnable3 = null;
        java.util.concurrent.Future<?> wildcardFuture4 = iRatedExecutor2.schedule(runnable3);
        java.lang.Runnable runnable5 = null;
        com.mattunderscore.executors.IRepeatingFuture<?> wildcardIRepeatingFuture7 = iRatedExecutor2.schedule(runnable5, (int) (byte) 100);
        java.lang.Runnable runnable8 = null;
        java.util.concurrent.Future<?> wildcardFuture9 = iRatedExecutor2.schedule(runnable8);
        java.lang.Runnable runnable10 = null;
        iRatedExecutor2.execute(runnable10);
        org.junit.Assert.assertNotNull(iRatedExecutor2);
        org.junit.Assert.assertNotNull(wildcardFuture4);
        org.junit.Assert.assertNotNull(wildcardIRepeatingFuture7);
        org.junit.Assert.assertNotNull(wildcardFuture9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        int int3 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper7 = runnableWrapperRepeatingFuture2.getResult((int) (byte) 100, (long) (short) 1, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.mattunderscore.executors.UncaughtExceptionResult<com.mattunderscore.executors.IUniversalExecutor> iUniversalExecutorUncaughtExceptionResult0 = new com.mattunderscore.executors.UncaughtExceptionResult<com.mattunderscore.executors.IUniversalExecutor>();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        boolean boolean6 = runnableWrapperRepeatingFuture2.isCancelled();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = runnableWrapperRepeatingFuture2.cancel(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        java.util.concurrent.ThreadFactory threadFactory2 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor3 = com.mattunderscore.rated.executor.RatedExecutors.interruptableRatedExecutor((long) 'a', timeUnit1, threadFactory2);
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<?> wildcardFuture5 = iRatedExecutor3.schedule(runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iRatedExecutor3);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.lang.Throwable throwable0 = null;
        com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>> strComparableTaskExecutionResult1 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>>(throwable0);
        java.util.concurrent.ExecutionException executionException2 = strComparableTaskExecutionResult1.exception;
        com.mattunderscore.executors.TaskExecutionResult<java.util.concurrent.ExecutionException> executionExceptionTaskExecutionResult3 = new com.mattunderscore.executors.TaskExecutionResult<java.util.concurrent.ExecutionException>(executionException2);
        org.junit.Assert.assertNotNull(executionException2);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperIRepeatingFutureSingleFuture1 = new com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>(iTaskCanceller0);
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = runnableWrapperIRepeatingFutureSingleFuture1.get((long) (short) 10, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        boolean boolean6 = runnableWrapperRepeatingFuture2.isCancelled();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = runnableWrapperRepeatingFuture2.cancel(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        java.util.concurrent.ThreadFactory threadFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.IUniversalExecutor iUniversalExecutor3 = com.mattunderscore.rated.executor.RatedExecutors.simpleRatedExecutor((long) (byte) 0, timeUnit1, threadFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        boolean boolean6 = runnableWrapperRepeatingFuture2.isCancelled();
        int int7 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        boolean boolean8 = runnableWrapperRepeatingFuture2.isCancelled();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = runnableWrapperRepeatingFuture2.cancel(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.mattunderscore.executors.ISettableFuture<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperRepeatingFutureISettableFuture0 = null;
        com.mattunderscore.executors.FutureSetResult<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperRepeatingFutureFutureSetResult1 = new com.mattunderscore.executors.FutureSetResult<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>(runnableWrapperRepeatingFutureISettableFuture0);
        java.util.concurrent.Callable<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperRepeatingFutureCallable2 = null;
        com.mattunderscore.executors.ITaskResultProcessor<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperRepeatingFutureITaskResultProcessor3 = null;
        com.mattunderscore.executors.TaskWrapper<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperRepeatingFutureTaskWrapper4 = new com.mattunderscore.executors.TaskWrapper<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>(runnableWrapperRepeatingFutureCallable2, runnableWrapperRepeatingFutureITaskResultProcessor3);
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller5 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture7 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller5, (int) 'a');
        java.lang.Throwable throwable8 = null;
        runnableWrapperRepeatingFuture7.setException(throwable8);
        int int10 = runnableWrapperRepeatingFuture7.getExpectedExecutions();
        int int11 = runnableWrapperRepeatingFuture7.getCompletedExecutions();
        boolean boolean12 = runnableWrapperRepeatingFuture7.isDone();
        int int13 = runnableWrapperRepeatingFuture7.getCompletedExecutions();
        // The following exception was thrown during execution in test generation
        try {
            runnableWrapperRepeatingFutureFutureSetResult1.onResult((com.mattunderscore.executors.ITaskWrapper) runnableWrapperRepeatingFutureTaskWrapper4, runnableWrapperRepeatingFuture7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        java.util.concurrent.ThreadFactory threadFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.IUniversalExecutor iUniversalExecutor3 = com.mattunderscore.rated.executor.RatedExecutors.simpleRatedExecutor(1L, timeUnit1, threadFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.util.concurrent.Callable<java.util.concurrent.Executor> executorCallable0 = null;
        com.mattunderscore.executors.ITaskResultProcessor<java.util.concurrent.Executor> executorITaskResultProcessor1 = null;
        com.mattunderscore.executors.TaskWrapper<java.util.concurrent.Executor> executorTaskWrapper2 = new com.mattunderscore.executors.TaskWrapper<java.util.concurrent.Executor>(executorCallable0, executorITaskResultProcessor1);
        // The following exception was thrown during execution in test generation
        try {
            executorTaskWrapper2.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperIRepeatingFutureRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>(iTaskCanceller0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        boolean boolean6 = runnableWrapperRepeatingFuture2.isCancelled();
        int int7 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        boolean boolean8 = runnableWrapperRepeatingFuture2.isCancelled();
        com.mattunderscore.executors.FutureSetResult<com.mattunderscore.executors.RunnableWrapper> runnableWrapperFutureSetResult9 = new com.mattunderscore.executors.FutureSetResult<com.mattunderscore.executors.RunnableWrapper>((com.mattunderscore.executors.ISettableFuture<com.mattunderscore.executors.RunnableWrapper>) runnableWrapperRepeatingFuture2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        int int7 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        int int8 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        java.lang.Class<?> wildcardClass9 = runnableWrapperRepeatingFuture2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperRepeatingFutureSingleFuture1 = new com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>(iTaskCanceller0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.ratedExecutor((long) (byte) 10, timeUnit1);
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<?> wildcardFuture4 = iRatedExecutor2.submit(runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iRatedExecutor2);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        boolean boolean5 = runnableWrapperRepeatingFuture2.isCancelled();
        boolean boolean6 = runnableWrapperRepeatingFuture2.isCancelled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.interruptableRatedExecutor((long) 97, timeUnit1);
        org.junit.Assert.assertNotNull(iRatedExecutor2);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>> strComparableTaskExecutionResult1 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable2 = strComparableTaskExecutionResult1.result;
        java.lang.Comparable<java.lang.String> strComparable3 = strComparableTaskExecutionResult1.result;
        org.junit.Assert.assertEquals("'" + strComparable2 + "' != '" + "hi!" + "'", strComparable2, "hi!");
        org.junit.Assert.assertEquals("'" + strComparable3 + "' != '" + "hi!" + "'", strComparable3, "hi!");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller3 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture5 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller3, (int) 'a');
        java.lang.Throwable throwable6 = null;
        runnableWrapperRepeatingFuture5.setException(throwable6);
        int int8 = runnableWrapperRepeatingFuture5.getExpectedExecutions();
        int int9 = runnableWrapperRepeatingFuture5.getCompletedExecutions();
        java.lang.Throwable throwable10 = null;
        com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>> strComparableTaskExecutionResult11 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>>(throwable10);
        java.util.concurrent.ExecutionException executionException12 = strComparableTaskExecutionResult11.exception;
        runnableWrapperRepeatingFuture5.setException((java.lang.Throwable) executionException12);
        com.mattunderscore.executors.TaskExecutionResult<java.io.Serializable> serializableTaskExecutionResult14 = new com.mattunderscore.executors.TaskExecutionResult<java.io.Serializable>((java.lang.Throwable) executionException12);
        com.mattunderscore.executors.TaskExecutionResult<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperIRepeatingFutureTaskExecutionResult15 = new com.mattunderscore.executors.TaskExecutionResult<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>((java.lang.Throwable) executionException12);
        runnableWrapperRepeatingFuture2.setException((java.lang.Throwable) executionException12);
        int int17 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(executionException12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        boolean boolean7 = runnableWrapperRepeatingFuture2.isCancelled();
        com.mattunderscore.executors.TaskExecutionResult<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperRepeatingFutureTaskExecutionResult8 = new com.mattunderscore.executors.TaskExecutionResult<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>(runnableWrapperRepeatingFuture2);
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper9 = runnableWrapperRepeatingFuture2.get();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.ExecutionException; message: null");
        } catch (java.util.concurrent.ExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.interruptableRatedExecutor((long) (short) 10, timeUnit1);
        java.lang.Runnable runnable3 = null;
        java.util.concurrent.Future<?> wildcardFuture4 = iRatedExecutor2.schedule(runnable3);
        org.junit.Assert.assertNotNull(iRatedExecutor2);
        org.junit.Assert.assertNotNull(wildcardFuture4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        int int7 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        int int8 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        java.lang.Throwable throwable9 = null;
        com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>> strComparableTaskExecutionResult10 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>>(throwable9);
        java.util.concurrent.ExecutionException executionException11 = strComparableTaskExecutionResult10.exception;
        java.util.concurrent.ExecutionException executionException12 = strComparableTaskExecutionResult10.exception;
        runnableWrapperRepeatingFuture2.setException((java.lang.Throwable) executionException12);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(executionException11);
        org.junit.Assert.assertNotNull(executionException12);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        int int7 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        int int8 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        com.mattunderscore.executors.ITaskWrapper iTaskWrapper9 = null;
        runnableWrapperRepeatingFuture2.setTask(iTaskWrapper9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.mattunderscore.executors.TaskWrapperFactory taskWrapperFactory0 = new com.mattunderscore.executors.TaskWrapperFactory();
        java.lang.Runnable runnable1 = null;
        com.mattunderscore.executors.ITaskResultProcessor<java.lang.Void> voidITaskResultProcessor2 = null;
        com.mattunderscore.executors.ITaskWrapper iTaskWrapper3 = taskWrapperFactory0.newWrapper(runnable1, voidITaskResultProcessor2);
        org.junit.Assert.assertNotNull(iTaskWrapper3);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        java.util.concurrent.ThreadFactory threadFactory2 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor3 = com.mattunderscore.rated.executor.RatedExecutors.interruptableRatedExecutor((long) 'a', timeUnit1, threadFactory2);
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.IRepeatingFuture<?> wildcardIRepeatingFuture6 = iRatedExecutor3.schedule(runnable4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iRatedExecutor3);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.executors.IUniversalExecutor iUniversalExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.simpleRatedExecutor((long) (byte) -1, timeUnit1);
        org.junit.Assert.assertNotNull(iUniversalExecutor2);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.executors.IUniversalExecutor iUniversalExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.simpleRatedExecutor((long) 97, timeUnit1);
        org.junit.Assert.assertNotNull(iUniversalExecutor2);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        java.util.concurrent.ThreadFactory threadFactory2 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor3 = com.mattunderscore.rated.executor.RatedExecutors.interruptableRatedExecutor((-1L), timeUnit1, threadFactory2);
        org.junit.Assert.assertNotNull(iRatedExecutor3);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IUniversalExecutor> iUniversalExecutorSingleFuture1 = new com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IUniversalExecutor>(iTaskCanceller0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) (short) 0);
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper6 = runnableWrapperRepeatingFuture2.getResult((int) 'a', (long) 97, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.ratedExecutor((long) 1, timeUnit1);
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<?> wildcardFuture4 = iRatedExecutor2.schedule(runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iRatedExecutor2);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>> strComparableTaskExecutionResult1 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>>((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.concurrent.ExecutionException executionException2 = strComparableTaskExecutionResult1.exception;
        java.util.concurrent.ExecutionException executionException3 = strComparableTaskExecutionResult1.exception;
        org.junit.Assert.assertNull(executionException2);
        org.junit.Assert.assertNull(executionException3);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        int int7 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        boolean boolean8 = runnableWrapperRepeatingFuture2.isDone();
        boolean boolean9 = runnableWrapperRepeatingFuture2.isCancelled();
        int int10 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        boolean boolean11 = runnableWrapperRepeatingFuture2.isDone();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        boolean boolean7 = runnableWrapperRepeatingFuture2.isDone();
        int int8 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        boolean boolean9 = runnableWrapperRepeatingFuture2.isDone();
        int int10 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        boolean boolean5 = runnableWrapperRepeatingFuture2.isCancelled();
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper9 = runnableWrapperRepeatingFuture2.getResult((-1), (long) (byte) 10, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.interruptableRatedExecutor((long) (byte) 100, timeUnit1);
        java.lang.Runnable runnable3 = null;
        com.mattunderscore.executors.IRepeatingFuture<?> wildcardIRepeatingFuture5 = iRatedExecutor2.schedule(runnable3, 1);
        org.junit.Assert.assertNotNull(iRatedExecutor2);
        org.junit.Assert.assertNotNull(wildcardIRepeatingFuture5);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.UnboundedFuture unboundedFuture1 = new com.mattunderscore.executors.UnboundedFuture(iTaskCanceller0);
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller2 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture4 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller2, (int) 'a');
        java.lang.Throwable throwable5 = null;
        runnableWrapperRepeatingFuture4.setException(throwable5);
        int int7 = runnableWrapperRepeatingFuture4.getExpectedExecutions();
        int int8 = runnableWrapperRepeatingFuture4.getCompletedExecutions();
        boolean boolean9 = runnableWrapperRepeatingFuture4.isDone();
        int int10 = runnableWrapperRepeatingFuture4.getCompletedExecutions();
        java.lang.Throwable throwable11 = null;
        com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>> strComparableTaskExecutionResult12 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>>(throwable11);
        java.util.concurrent.ExecutionException executionException13 = strComparableTaskExecutionResult12.exception;
        java.util.concurrent.ExecutionException executionException14 = strComparableTaskExecutionResult12.exception;
        java.util.concurrent.ExecutionException executionException15 = strComparableTaskExecutionResult12.exception;
        runnableWrapperRepeatingFuture4.setException((java.lang.Throwable) executionException15);
        unboundedFuture1.setException((java.lang.Throwable) executionException15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Void void18 = unboundedFuture1.get();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.ExecutionException; message: java.util.concurrent.ExecutionException");
        } catch (java.util.concurrent.ExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(executionException13);
        org.junit.Assert.assertNotNull(executionException14);
        org.junit.Assert.assertNotNull(executionException15);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.interruptableRatedExecutor((long) (byte) 100, timeUnit1);
        java.lang.Runnable runnable3 = null;
        java.util.concurrent.Future<?> wildcardFuture4 = iRatedExecutor2.schedule(runnable3);
        java.lang.Runnable runnable5 = null;
        com.mattunderscore.executors.IRepeatingFuture<?> wildcardIRepeatingFuture7 = iRatedExecutor2.schedule(runnable5, (int) (short) 0);
        org.junit.Assert.assertNotNull(iRatedExecutor2);
        org.junit.Assert.assertNotNull(wildcardFuture4);
        org.junit.Assert.assertNotNull(wildcardIRepeatingFuture7);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        boolean boolean7 = runnableWrapperRepeatingFuture2.isDone();
        int int8 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int9 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper12 = runnableWrapperRepeatingFuture2.get((long) (short) -1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        java.util.concurrent.ThreadFactory threadFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor3 = com.mattunderscore.rated.executor.RatedExecutors.ratedExecutor((long) 'a', timeUnit1, threadFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        boolean boolean7 = runnableWrapperRepeatingFuture2.isCancelled();
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper9 = runnableWrapperRepeatingFuture2.getResult((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.executors.IUniversalExecutor iUniversalExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.simpleRatedExecutor(0L, timeUnit1);
        org.junit.Assert.assertNotNull(iUniversalExecutor2);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.ratedExecutor((long) 100, timeUnit1);
        org.junit.Assert.assertNotNull(iRatedExecutor2);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        boolean boolean7 = runnableWrapperRepeatingFuture2.isDone();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper10 = runnableWrapperRepeatingFuture2.get((long) 97, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        boolean boolean6 = runnableWrapperRepeatingFuture2.isCancelled();
        int int7 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int8 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.mattunderscore.executors.ISettableFuture<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperRepeatingFutureISettableFuture0 = null;
        com.mattunderscore.executors.FutureSetResult<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperRepeatingFutureFutureSetResult1 = new com.mattunderscore.executors.FutureSetResult<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>(runnableWrapperRepeatingFutureISettableFuture0);
        java.util.concurrent.Callable<com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>> runnableWrapperIRepeatingFutureSingleFutureCallable2 = null;
        com.mattunderscore.executors.ITaskResultProcessor<com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>> runnableWrapperIRepeatingFutureSingleFutureITaskResultProcessor3 = null;
        com.mattunderscore.executors.TaskWrapper<com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>> runnableWrapperIRepeatingFutureSingleFutureTaskWrapper4 = new com.mattunderscore.executors.TaskWrapper<com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>>(runnableWrapperIRepeatingFutureSingleFutureCallable2, runnableWrapperIRepeatingFutureSingleFutureITaskResultProcessor3);
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller5 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture7 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller5, (int) 'a');
        java.lang.Throwable throwable8 = null;
        runnableWrapperRepeatingFuture7.setException(throwable8);
        int int10 = runnableWrapperRepeatingFuture7.getExpectedExecutions();
        int int11 = runnableWrapperRepeatingFuture7.getCompletedExecutions();
        java.lang.Throwable throwable12 = null;
        com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>> strComparableTaskExecutionResult13 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>>(throwable12);
        java.util.concurrent.ExecutionException executionException14 = strComparableTaskExecutionResult13.exception;
        runnableWrapperRepeatingFuture7.setException((java.lang.Throwable) executionException14);
        com.mattunderscore.executors.TaskExecutionResult<java.io.Serializable> serializableTaskExecutionResult16 = new com.mattunderscore.executors.TaskExecutionResult<java.io.Serializable>((java.lang.Throwable) executionException14);
        // The following exception was thrown during execution in test generation
        try {
            runnableWrapperRepeatingFutureFutureSetResult1.onThrowable((com.mattunderscore.executors.ITaskWrapper) runnableWrapperIRepeatingFutureSingleFutureTaskWrapper4, (java.lang.Throwable) executionException14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(executionException14);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        boolean boolean6 = runnableWrapperRepeatingFuture2.isDone();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.interruptableRatedExecutor((long) (byte) 100, timeUnit1);
        java.lang.Runnable runnable3 = null;
        iRatedExecutor2.execute(runnable3);
        java.lang.Runnable runnable5 = null;
        java.util.concurrent.Future<?> wildcardFuture6 = iRatedExecutor2.schedule(runnable5);
        org.junit.Assert.assertNotNull(iRatedExecutor2);
        org.junit.Assert.assertNotNull(wildcardFuture6);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        java.lang.Throwable throwable0 = null;
        com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>> strComparableTaskExecutionResult1 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>>(throwable0);
        java.util.concurrent.ExecutionException executionException2 = strComparableTaskExecutionResult1.exception;
        java.util.concurrent.ExecutionException executionException3 = strComparableTaskExecutionResult1.exception;
        java.util.concurrent.ExecutionException executionException4 = strComparableTaskExecutionResult1.exception;
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableTaskExecutionResult1.result;
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableTaskExecutionResult1.result;
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableTaskExecutionResult1.result;
        org.junit.Assert.assertNotNull(executionException2);
        org.junit.Assert.assertNotNull(executionException3);
        org.junit.Assert.assertNotNull(executionException4);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNull(strComparable7);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.mattunderscore.executors.TaskWrapperFactory taskWrapperFactory0 = new com.mattunderscore.executors.TaskWrapperFactory();
        java.lang.Runnable runnable1 = null;
        com.mattunderscore.executors.ITaskResultProcessor<java.lang.Void> voidITaskResultProcessor2 = null;
        com.mattunderscore.executors.ITaskWrapper iTaskWrapper3 = taskWrapperFactory0.newWrapper(runnable1, voidITaskResultProcessor2);
        // The following exception was thrown during execution in test generation
        try {
            iTaskWrapper3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTaskWrapper3);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.interruptableRatedExecutor((long) (byte) 100, timeUnit1);
        com.mattunderscore.executors.TaskExecutionResult<java.util.concurrent.Executor> executorTaskExecutionResult3 = new com.mattunderscore.executors.TaskExecutionResult<java.util.concurrent.Executor>((java.util.concurrent.Executor) iRatedExecutor2);
        org.junit.Assert.assertNotNull(iRatedExecutor2);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.UnboundedFuture unboundedFuture1 = new com.mattunderscore.executors.UnboundedFuture(iTaskCanceller0);
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller2 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture4 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller2, (int) 'a');
        java.lang.Throwable throwable5 = null;
        runnableWrapperRepeatingFuture4.setException(throwable5);
        int int7 = runnableWrapperRepeatingFuture4.getExpectedExecutions();
        int int8 = runnableWrapperRepeatingFuture4.getCompletedExecutions();
        boolean boolean9 = runnableWrapperRepeatingFuture4.isDone();
        int int10 = runnableWrapperRepeatingFuture4.getCompletedExecutions();
        java.lang.Throwable throwable11 = null;
        com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>> strComparableTaskExecutionResult12 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>>(throwable11);
        java.util.concurrent.ExecutionException executionException13 = strComparableTaskExecutionResult12.exception;
        java.util.concurrent.ExecutionException executionException14 = strComparableTaskExecutionResult12.exception;
        java.util.concurrent.ExecutionException executionException15 = strComparableTaskExecutionResult12.exception;
        runnableWrapperRepeatingFuture4.setException((java.lang.Throwable) executionException15);
        unboundedFuture1.setException((java.lang.Throwable) executionException15);
        java.lang.Void void18 = null;
        unboundedFuture1.setResult(void18);
        java.lang.Void void20 = unboundedFuture1.get();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = unboundedFuture1.cancel(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(executionException13);
        org.junit.Assert.assertNotNull(executionException14);
        org.junit.Assert.assertNotNull(executionException15);
        org.junit.Assert.assertNull(void20);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.mattunderscore.executors.ISettableFuture<com.mattunderscore.executors.ITaskResultProcessor> iTaskResultProcessorISettableFuture0 = null;
        com.mattunderscore.executors.FutureSetResult<com.mattunderscore.executors.ITaskResultProcessor> iTaskResultProcessorFutureSetResult1 = new com.mattunderscore.executors.FutureSetResult<com.mattunderscore.executors.ITaskResultProcessor>(iTaskResultProcessorISettableFuture0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.UnboundedFuture unboundedFuture1 = new com.mattunderscore.executors.UnboundedFuture(iTaskCanceller0);
        boolean boolean2 = unboundedFuture1.isDone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        int int3 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper7 = runnableWrapperRepeatingFuture2.getResult((int) (byte) -1, (long) (byte) -1, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        java.util.concurrent.ThreadFactory threadFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor3 = com.mattunderscore.rated.executor.RatedExecutors.ratedExecutor(100L, timeUnit1, threadFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.mattunderscore.executors.ISettableFuture<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperRepeatingFutureISettableFuture0 = null;
        com.mattunderscore.executors.FutureSetResult<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperRepeatingFutureFutureSetResult1 = new com.mattunderscore.executors.FutureSetResult<com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>(runnableWrapperRepeatingFutureISettableFuture0);
        com.mattunderscore.executors.TaskWrapperFactory taskWrapperFactory2 = new com.mattunderscore.executors.TaskWrapperFactory();
        java.lang.Runnable runnable3 = null;
        com.mattunderscore.executors.ITaskWrapper iTaskWrapper4 = taskWrapperFactory2.newWrapper(runnable3);
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller5 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture7 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller5, (int) 'a');
        java.lang.Throwable throwable8 = null;
        runnableWrapperRepeatingFuture7.setException(throwable8);
        int int10 = runnableWrapperRepeatingFuture7.getExpectedExecutions();
        int int11 = runnableWrapperRepeatingFuture7.getCompletedExecutions();
        // The following exception was thrown during execution in test generation
        try {
            runnableWrapperRepeatingFutureFutureSetResult1.onResult(iTaskWrapper4, runnableWrapperRepeatingFuture7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTaskWrapper4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        boolean boolean7 = runnableWrapperRepeatingFuture2.isDone();
        int int8 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int9 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        int int10 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper14 = runnableWrapperRepeatingFuture2.getResult(2, 100L, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        boolean boolean7 = runnableWrapperRepeatingFuture2.isDone();
        int int8 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.RunnableWrapper runnableWrapper12 = runnableWrapperRepeatingFuture2.getResult((-1), 100L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.UnboundedFuture unboundedFuture1 = new com.mattunderscore.executors.UnboundedFuture(iTaskCanceller0);
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller2 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture4 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller2, (int) 'a');
        java.lang.Throwable throwable5 = null;
        runnableWrapperRepeatingFuture4.setException(throwable5);
        int int7 = runnableWrapperRepeatingFuture4.getExpectedExecutions();
        int int8 = runnableWrapperRepeatingFuture4.getCompletedExecutions();
        boolean boolean9 = runnableWrapperRepeatingFuture4.isDone();
        int int10 = runnableWrapperRepeatingFuture4.getCompletedExecutions();
        java.lang.Throwable throwable11 = null;
        com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>> strComparableTaskExecutionResult12 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>>(throwable11);
        java.util.concurrent.ExecutionException executionException13 = strComparableTaskExecutionResult12.exception;
        java.util.concurrent.ExecutionException executionException14 = strComparableTaskExecutionResult12.exception;
        java.util.concurrent.ExecutionException executionException15 = strComparableTaskExecutionResult12.exception;
        runnableWrapperRepeatingFuture4.setException((java.lang.Throwable) executionException15);
        unboundedFuture1.setException((java.lang.Throwable) executionException15);
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Void void20 = unboundedFuture1.get((long) (byte) -1, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(executionException13);
        org.junit.Assert.assertNotNull(executionException14);
        org.junit.Assert.assertNotNull(executionException15);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller3 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture5 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller3, (int) 'a');
        java.lang.Throwable throwable6 = null;
        runnableWrapperRepeatingFuture5.setException(throwable6);
        int int8 = runnableWrapperRepeatingFuture5.getExpectedExecutions();
        int int9 = runnableWrapperRepeatingFuture5.getCompletedExecutions();
        java.lang.Throwable throwable10 = null;
        com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>> strComparableTaskExecutionResult11 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>>(throwable10);
        java.util.concurrent.ExecutionException executionException12 = strComparableTaskExecutionResult11.exception;
        runnableWrapperRepeatingFuture5.setException((java.lang.Throwable) executionException12);
        com.mattunderscore.executors.TaskExecutionResult<java.io.Serializable> serializableTaskExecutionResult14 = new com.mattunderscore.executors.TaskExecutionResult<java.io.Serializable>((java.lang.Throwable) executionException12);
        com.mattunderscore.executors.TaskExecutionResult<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperIRepeatingFutureTaskExecutionResult15 = new com.mattunderscore.executors.TaskExecutionResult<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>((java.lang.Throwable) executionException12);
        runnableWrapperRepeatingFuture2.setException((java.lang.Throwable) executionException12);
        boolean boolean17 = runnableWrapperRepeatingFuture2.isCancelled();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = runnableWrapperRepeatingFuture2.get();
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.ExecutionException; message: java.util.concurrent.ExecutionException");
        } catch (java.util.concurrent.ExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(executionException12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        int int7 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        int int8 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = runnableWrapperRepeatingFuture2.cancel(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture2 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller0, (int) 'a');
        java.lang.Throwable throwable3 = null;
        runnableWrapperRepeatingFuture2.setException(throwable3);
        int int5 = runnableWrapperRepeatingFuture2.getExpectedExecutions();
        int int6 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        boolean boolean7 = runnableWrapperRepeatingFuture2.isDone();
        int int8 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        java.lang.Throwable throwable9 = null;
        com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>> strComparableTaskExecutionResult10 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>>(throwable9);
        java.util.concurrent.ExecutionException executionException11 = strComparableTaskExecutionResult10.exception;
        java.util.concurrent.ExecutionException executionException12 = strComparableTaskExecutionResult10.exception;
        java.util.concurrent.ExecutionException executionException13 = strComparableTaskExecutionResult10.exception;
        runnableWrapperRepeatingFuture2.setException((java.lang.Throwable) executionException13);
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller15 = null;
        com.mattunderscore.executors.UnboundedFuture unboundedFuture16 = new com.mattunderscore.executors.UnboundedFuture(iTaskCanceller15);
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller17 = null;
        com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper> runnableWrapperRepeatingFuture19 = new com.mattunderscore.executors.RepeatingFuture<com.mattunderscore.executors.RunnableWrapper>(iTaskCanceller17, (int) 'a');
        java.lang.Throwable throwable20 = null;
        runnableWrapperRepeatingFuture19.setException(throwable20);
        int int22 = runnableWrapperRepeatingFuture19.getExpectedExecutions();
        int int23 = runnableWrapperRepeatingFuture19.getCompletedExecutions();
        boolean boolean24 = runnableWrapperRepeatingFuture19.isDone();
        int int25 = runnableWrapperRepeatingFuture19.getCompletedExecutions();
        java.lang.Throwable throwable26 = null;
        com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>> strComparableTaskExecutionResult27 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>>(throwable26);
        java.util.concurrent.ExecutionException executionException28 = strComparableTaskExecutionResult27.exception;
        java.util.concurrent.ExecutionException executionException29 = strComparableTaskExecutionResult27.exception;
        java.util.concurrent.ExecutionException executionException30 = strComparableTaskExecutionResult27.exception;
        runnableWrapperRepeatingFuture19.setException((java.lang.Throwable) executionException30);
        unboundedFuture16.setException((java.lang.Throwable) executionException30);
        runnableWrapperRepeatingFuture2.setException((java.lang.Throwable) executionException30);
        int int34 = runnableWrapperRepeatingFuture2.getCompletedExecutions();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(executionException11);
        org.junit.Assert.assertNotNull(executionException12);
        org.junit.Assert.assertNotNull(executionException13);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(executionException28);
        org.junit.Assert.assertNotNull(executionException29);
        org.junit.Assert.assertNotNull(executionException30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        com.mattunderscore.rated.executor.IRatedExecutor iRatedExecutor2 = com.mattunderscore.rated.executor.RatedExecutors.ratedExecutor((long) (-1), timeUnit1);
        java.lang.Runnable runnable3 = null;
        com.mattunderscore.executors.RunnableWrapper runnableWrapper4 = new com.mattunderscore.executors.RunnableWrapper(runnable3);
        // The following exception was thrown during execution in test generation
        try {
            com.mattunderscore.executors.IRepeatingFuture<java.lang.Void> voidIRepeatingFuture6 = iRatedExecutor2.schedule((java.util.concurrent.Callable<java.lang.Void>) runnableWrapper4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iRatedExecutor2);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.mattunderscore.executors.ITaskCanceller iTaskCanceller0 = null;
        com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>> runnableWrapperIRepeatingFutureSingleFuture1 = new com.mattunderscore.executors.SingleFuture<com.mattunderscore.executors.IRepeatingFuture<com.mattunderscore.executors.RunnableWrapper>>(iTaskCanceller0);
        boolean boolean2 = runnableWrapperIRepeatingFutureSingleFuture1.isCancelled();
        com.mattunderscore.executors.ITaskWrapper iTaskWrapper3 = null;
        runnableWrapperIRepeatingFutureSingleFuture1.setTask(iTaskWrapper3);
        boolean boolean5 = runnableWrapperIRepeatingFutureSingleFuture1.isDone();
        java.lang.Throwable throwable6 = null;
        com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>> strComparableTaskExecutionResult7 = new com.mattunderscore.executors.TaskExecutionResult<java.lang.Comparable<java.lang.String>>(throwable6);
        java.util.concurrent.ExecutionException executionException8 = strComparableTaskExecutionResult7.exception;
        java.util.concurrent.ExecutionException executionException9 = strComparableTaskExecutionResult7.exception;
        runnableWrapperIRepeatingFutureSingleFuture1.setException((java.lang.Throwable) executionException9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(executionException8);
        org.junit.Assert.assertNotNull(executionException9);
    }
}

