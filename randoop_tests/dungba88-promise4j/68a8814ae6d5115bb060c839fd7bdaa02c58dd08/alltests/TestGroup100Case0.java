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
        org.joo.promise4j.DeferredStatus deferredStatus0 = org.joo.promise4j.DeferredStatus.RESOLVED;
        org.junit.Assert.assertTrue("'" + deferredStatus0 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus0.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.lang.Runnable runnable0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture3 = org.joo.promise4j.util.TimeoutScheduler.delay(runnable0, (long) 10, timeUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.lang.Runnable runnable0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture3 = org.joo.promise4j.util.TimeoutScheduler.delay(runnable0, (long) '#', timeUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        org.joo.promise4j.util.ThreadHints.onSpinWait();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        org.joo.promise4j.Promise[] promiseArray1 = new org.joo.promise4j.Promise[0];
        @SuppressWarnings("unchecked")
        org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[] deferredStatusCollectionPromiseArray2 = (org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1;
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise3 = org.joo.promise4j.impl.JoinedPromise.of((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.Promise[] promiseArray5 = new org.joo.promise4j.Promise[0];
        @SuppressWarnings("unchecked")
        org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[] deferredStatusCollectionPromiseArray6 = (org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray5;
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise7 = org.joo.promise4j.impl.JoinedPromise.of((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray5);
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise8 = new org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray5);
        java.util.ArrayList<org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>> deferredStatusCollectionJoinedPromiseList9 = new java.util.ArrayList<org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>>();
        boolean boolean10 = deferredStatusCollectionJoinedPromiseList9.add(deferredStatusCollectionJoinedPromise3);
        boolean boolean11 = deferredStatusCollectionJoinedPromiseList9.add(deferredStatusCollectionJoinedPromise8);
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>> deferredStatusCollectionJoinedPromiseJoinedResults12 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>>((java.util.List<org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>>) deferredStatusCollectionJoinedPromiseList9);
        org.junit.Assert.assertNotNull(promiseArray1);
        org.junit.Assert.assertNotNull(deferredStatusCollectionPromiseArray2);
        org.junit.Assert.assertNotNull(deferredStatusCollectionJoinedPromise3);
        org.junit.Assert.assertNotNull(promiseArray5);
        org.junit.Assert.assertNotNull(deferredStatusCollectionPromiseArray6);
        org.junit.Assert.assertNotNull(deferredStatusCollectionJoinedPromise7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable4 = serializableCompletableDeferredObject0.get((long) (short) 0, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        java.util.function.Predicate<java.io.Serializable> serializablePredicate4 = null;
        org.joo.promise4j.PipeDoneCallback<java.io.Serializable, java.io.Serializable, java.lang.Throwable> serializablePipeDoneCallback5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise6 = serializablePromise3.when(serializablePredicate4, serializablePipeDoneCallback5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        org.joo.promise4j.Promise<org.joo.promise4j.PromiseException, java.lang.Throwable> promiseExceptionPromise0 = null;
        org.joo.promise4j.PipeDoneCallback<org.joo.promise4j.PromiseException, java.io.Serializable, org.joo.promise4j.PromiseException> promiseExceptionPipeDoneCallback1 = null;
        org.joo.promise4j.PipeFailureCallback<java.lang.Throwable, java.io.Serializable, org.joo.promise4j.PromiseException> throwablePipeFailureCallback2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.PipedPromise<org.joo.promise4j.PromiseException, java.lang.Throwable, java.io.Serializable, org.joo.promise4j.PromiseException> promiseExceptionPipedPromise3 = new org.joo.promise4j.impl.PipedPromise<org.joo.promise4j.PromiseException, java.lang.Throwable, java.io.Serializable, org.joo.promise4j.PromiseException>(promiseExceptionPromise0, promiseExceptionPipeDoneCallback1, throwablePipeFailureCallback2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.DeferredStatus deferredStatus4 = deferredStatusSimpleDeferredObject3.get();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Callback cannot be deferred in non-deferred mode");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise1 = deferredStatusAsyncDeferredObject0.promise();
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject2 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable3 = null;
        org.joo.promise4j.PromiseException promiseException4 = new org.joo.promise4j.PromiseException(throwable3);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred5 = deferredStatusAsyncDeferredObject2.reject((java.lang.Exception) promiseException4);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject6 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.DeferredStatus deferredStatus7 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred8 = deferredStatusAsyncDeferredObject6.resolve(deferredStatus7);
        org.joo.promise4j.Promise[] promiseArray10 = new org.joo.promise4j.Promise[3];
        @SuppressWarnings("unchecked")
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception>[] deferredStatusPromiseArray11 = (org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception>[]) promiseArray10;
        deferredStatusPromiseArray11[0] = deferredStatusAsyncDeferredObject0;
        deferredStatusPromiseArray11[1] = deferredStatusAsyncDeferredObject2;
        deferredStatusPromiseArray11[2] = deferredStatusAsyncDeferredObject6;
        org.joo.promise4j.impl.JoinedPromise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusJoinedPromise18 = org.joo.promise4j.impl.JoinedPromise.of(deferredStatusPromiseArray11);
        org.junit.Assert.assertNotNull(deferredStatusPromise1);
        org.junit.Assert.assertNotNull(deferredStatusDeferred5);
        org.junit.Assert.assertTrue("'" + deferredStatus7 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus7.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred8);
        org.junit.Assert.assertNotNull(promiseArray10);
        org.junit.Assert.assertNotNull(deferredStatusPromiseArray11);
        org.junit.Assert.assertNotNull(deferredStatusJoinedPromise18);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        java.util.concurrent.CompletableFuture<java.lang.Enum<org.joo.promise4j.DeferredStatus>> deferredStatusEnumCompletableFuture0 = null;
        org.joo.promise4j.impl.CompletableDeferredObject<java.lang.Enum<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusEnumCompletableDeferredObject1 = new org.joo.promise4j.impl.CompletableDeferredObject<java.lang.Enum<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>(deferredStatusEnumCompletableFuture0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        org.joo.promise4j.impl.CompletableDeferredObject<java.lang.Iterable<org.joo.promise4j.DeferredStatus>, java.lang.Throwable> deferredStatusIterableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.lang.Iterable<org.joo.promise4j.DeferredStatus>, java.lang.Throwable>();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusListPromise0 = null;
        org.joo.promise4j.Promise[] promiseArray2 = new org.joo.promise4j.Promise[1];
        @SuppressWarnings("unchecked")
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[] deferredStatusListPromiseArray3 = (org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray2;
        deferredStatusListPromiseArray3[0] = deferredStatusListPromise0;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.JoinedPromise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusListJoinedPromise6 = org.joo.promise4j.impl.JoinedPromise.of(deferredStatusListPromiseArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(promiseArray2);
        org.junit.Assert.assertNotNull(deferredStatusListPromiseArray3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        org.joo.promise4j.util.TimeoutScheduler timeoutScheduler0 = new org.joo.promise4j.util.TimeoutScheduler();
        java.lang.Class<?> wildcardClass1 = timeoutScheduler0.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[] { wildcardClass1 };
        java.util.ArrayList<java.lang.reflect.GenericDeclaration> genericDeclarationList3 = new java.util.ArrayList<java.lang.reflect.GenericDeclaration>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.GenericDeclaration>) genericDeclarationList3, genericDeclarationArray2);
        org.joo.promise4j.impl.JoinedResults<java.lang.reflect.GenericDeclaration> genericDeclarationJoinedResults5 = new org.joo.promise4j.impl.JoinedResults<java.lang.reflect.GenericDeclaration>((java.util.List<java.lang.reflect.GenericDeclaration>) genericDeclarationList3);
        java.lang.Class<?> wildcardClass6 = genericDeclarationList3.getClass();
        org.joo.promise4j.Promise<java.lang.Class<?>, org.joo.promise4j.PromiseException> wildcardClassPromise7 = org.joo.promise4j.Promise.of(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClassPromise7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable1 = null;
        org.joo.promise4j.PromiseException promiseException2 = new org.joo.promise4j.PromiseException(throwable1);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred3 = deferredStatusAsyncDeferredObject0.reject((java.lang.Exception) promiseException2);
        org.joo.promise4j.PromiseException promiseException4 = new org.joo.promise4j.PromiseException((java.lang.Throwable) promiseException2);
        java.lang.String str5 = promiseException4.toString();
        org.junit.Assert.assertNotNull(deferredStatusDeferred3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.joo.promise4j.PromiseException: org.joo.promise4j.PromiseException" + "'", str5, "org.joo.promise4j.PromiseException: org.joo.promise4j.PromiseException");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.DeferredStatus deferredStatus1 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred2 = deferredStatusAsyncDeferredObject0.resolve(deferredStatus1);
        java.lang.Class<?> wildcardClass3 = deferredStatusAsyncDeferredObject0.getClass();
        org.junit.Assert.assertTrue("'" + deferredStatus1 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus1.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        org.joo.promise4j.Promise<org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>, java.lang.Exception> deferredStatusSimpleDeferredObjectPromise0 = null;
        org.joo.promise4j.PipeDoneCallback<org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>, java.lang.Enum<org.joo.promise4j.DeferredStatus>, java.lang.Throwable> deferredStatusSimpleDeferredObjectPipeDoneCallback1 = null;
        org.joo.promise4j.PipeFailureCallback<java.lang.Exception, java.lang.Enum<org.joo.promise4j.DeferredStatus>, java.lang.Throwable> exceptionPipeFailureCallback2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.PipedPromise<org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>, java.lang.Exception, java.lang.Enum<org.joo.promise4j.DeferredStatus>, java.lang.Throwable> deferredStatusSimpleDeferredObjectPipedPromise3 = new org.joo.promise4j.impl.PipedPromise<org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>, java.lang.Exception, java.lang.Enum<org.joo.promise4j.DeferredStatus>, java.lang.Throwable>(deferredStatusSimpleDeferredObjectPromise0, deferredStatusSimpleDeferredObjectPipeDoneCallback1, exceptionPipeFailureCallback2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable1 = null;
        org.joo.promise4j.PromiseException promiseException2 = new org.joo.promise4j.PromiseException(throwable1);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred3 = deferredStatusAsyncDeferredObject0.reject((java.lang.Exception) promiseException2);
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.DeferredStatus deferredStatus6 = deferredStatusAsyncDeferredObject0.get((-1L), timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deferredStatusDeferred3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable4 = serializablePromise1.get((long) (short) -1, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.lang.Runnable runnable0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture3 = org.joo.promise4j.util.TimeoutScheduler.delay(runnable0, 1L, timeUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        org.joo.promise4j.Promise<org.joo.promise4j.util.TimeoutScheduler, org.joo.promise4j.PromiseException> timeoutSchedulerPromise0 = null;
        org.joo.promise4j.PipeDoneCallback<org.joo.promise4j.util.TimeoutScheduler, org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> timeoutSchedulerPipeDoneCallback1 = null;
        org.joo.promise4j.PipeFailureCallback<org.joo.promise4j.PromiseException, org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> promiseExceptionPipeFailureCallback2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.PipedPromise<org.joo.promise4j.util.TimeoutScheduler, org.joo.promise4j.PromiseException, org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> timeoutSchedulerPipedPromise3 = new org.joo.promise4j.impl.PipedPromise<org.joo.promise4j.util.TimeoutScheduler, org.joo.promise4j.PromiseException, org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>(timeoutSchedulerPromise0, timeoutSchedulerPipeDoneCallback1, promiseExceptionPipeFailureCallback2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred3 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) 10L);
        java.io.Serializable serializable4 = serializableCompletableDeferredObject0.get();
        java.util.concurrent.TimeUnit timeUnit6 = null;
        java.util.function.Supplier<java.lang.Throwable> throwableSupplier7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise8 = serializableCompletableDeferredObject0.timeoutAfter((long) (byte) 10, timeUnit6, throwableSupplier7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializableDeferred3);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + 10L + "'", serializable4, 10L);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isPending();
        org.joo.promise4j.DoneCallback<java.util.ArrayList<org.joo.promise4j.DeferredStatus>> deferredStatusListDoneCallback2 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise3 = deferredStatusListSyncDeferredObject0.done(deferredStatusListDoneCallback2);
        java.util.concurrent.TimeUnit timeUnit5 = null;
        java.util.function.Supplier<org.joo.promise4j.PromiseException> promiseExceptionSupplier6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred7 = deferredStatusListSyncDeferredObject0.withTimeout((long) 0, timeUnit5, promiseExceptionSupplier6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(deferredStatusListPromise3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable1 = null;
        org.joo.promise4j.PromiseException promiseException2 = new org.joo.promise4j.PromiseException(throwable1);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred3 = deferredStatusAsyncDeferredObject0.reject((java.lang.Exception) promiseException2);
        java.util.concurrent.TimeUnit timeUnit5 = null;
        java.util.function.Supplier<java.lang.Exception> exceptionSupplier6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise7 = deferredStatusAsyncDeferredObject0.timeoutAfter((long) (byte) -1, timeUnit5, exceptionSupplier6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deferredStatusDeferred3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.DeferredStatus deferredStatus4 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred5 = deferredStatusSimpleDeferredObject3.resolve(deferredStatus4);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise6 = deferredStatusSimpleDeferredObject3.promise();
        org.joo.promise4j.DeferredStatus deferredStatus7 = deferredStatusSimpleDeferredObject3.getStatus();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        java.util.function.Supplier<java.lang.Throwable> throwableSupplier10 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise11 = deferredStatusSimpleDeferredObject3.timeoutAfter((long) (short) 100, timeUnit9, throwableSupplier10);
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise13 = deferredStatusSimpleDeferredObject3.always(deferredStatusAlwaysCallback12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Callback cannot be deferred in non-deferred mode");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred5);
        org.junit.Assert.assertNotNull(deferredStatusPromise6);
        org.junit.Assert.assertTrue("'" + deferredStatus7 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus7.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusPromise11);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.DeferredStatus deferredStatus4 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred5 = deferredStatusSimpleDeferredObject3.resolve(deferredStatus4);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise6 = deferredStatusSimpleDeferredObject3.promise();
        org.joo.promise4j.DeferredStatus deferredStatus7 = deferredStatusSimpleDeferredObject3.getStatus();
        java.util.function.Predicate<org.joo.promise4j.DeferredStatus> deferredStatusPredicate8 = null;
        org.joo.promise4j.PipeDoneCallback<org.joo.promise4j.DeferredStatus, org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPipeDoneCallback9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise10 = deferredStatusSimpleDeferredObject3.when(deferredStatusPredicate8, deferredStatusPipeDoneCallback9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Callback cannot be deferred in non-deferred mode");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred5);
        org.junit.Assert.assertNotNull(deferredStatusPromise6);
        org.junit.Assert.assertTrue("'" + deferredStatus7 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus7.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.DeferredStatus deferredStatus4 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred5 = deferredStatusSimpleDeferredObject3.resolve(deferredStatus4);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise6 = deferredStatusSimpleDeferredObject3.promise();
        org.joo.promise4j.DeferredStatus deferredStatus7 = deferredStatusSimpleDeferredObject3.getStatus();
        java.lang.Throwable throwable8 = null;
        org.joo.promise4j.PromiseException promiseException9 = new org.joo.promise4j.PromiseException(throwable8);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise10 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException9);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred11 = deferredStatusSimpleDeferredObject3.reject((java.lang.Throwable) promiseException9);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        java.util.function.Supplier<java.lang.Throwable> throwableSupplier14 = null;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred15 = deferredStatusSimpleDeferredObject3.withTimeout((long) (byte) -1, timeUnit13, throwableSupplier14);
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred5);
        org.junit.Assert.assertNotNull(deferredStatusPromise6);
        org.junit.Assert.assertTrue("'" + deferredStatus7 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus7.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(wildcardClassPromise10);
        org.junit.Assert.assertNotNull(deferredStatusDeferred11);
        org.junit.Assert.assertNotNull(deferredStatusDeferred15);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isRejected();
        org.joo.promise4j.DoneCallback<java.util.ArrayList<org.joo.promise4j.DeferredStatus>> deferredStatusListDoneCallback2 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise3 = deferredStatusListSyncDeferredObject0.done(deferredStatusListDoneCallback2);
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise4 = deferredStatusListSyncDeferredObject0.promise();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(deferredStatusListPromise3);
        org.junit.Assert.assertNotNull(deferredStatusListPromise4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred3 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) 10L);
        java.io.Serializable serializable4 = serializableCompletableDeferredObject0.get();
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback5 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise6 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback5);
        java.util.concurrent.TimeUnit timeUnit8 = null;
        java.util.function.Supplier<java.lang.Throwable> throwableSupplier9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred10 = serializableCompletableDeferredObject0.withTimeout(0L, timeUnit8, throwableSupplier9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializableDeferred3);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + 10L + "'", serializable4, 10L);
        org.junit.Assert.assertNotNull(serializablePromise6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        org.joo.promise4j.Promise<org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromisePromise0 = null;
        org.joo.promise4j.PipeAlwaysCallback<org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>, java.lang.reflect.AnnotatedElement, org.joo.promise4j.PromiseException, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromisePipeAlwaysCallback1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.PipedAlwaysPromise<org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>, org.joo.promise4j.PromiseException, java.lang.reflect.AnnotatedElement, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromisePipedAlwaysPromise2 = new org.joo.promise4j.impl.PipedAlwaysPromise<org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>, org.joo.promise4j.PromiseException, java.lang.reflect.AnnotatedElement, org.joo.promise4j.PromiseException>(deferredStatusAsyncDeferredObjectSimpleFailurePromisePromise0, deferredStatusAsyncDeferredObjectSimpleFailurePromisePipeAlwaysCallback1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        java.lang.Throwable throwable0 = null;
        org.joo.promise4j.PromiseException promiseException1 = new org.joo.promise4j.PromiseException(throwable0);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise2 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException1);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise3 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException1);
        org.joo.promise4j.DeferredStatus deferredStatus4 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.getStatus();
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectAlwaysCallback5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectPromise6 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.always(deferredStatusAsyncDeferredObjectAlwaysCallback5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassPromise2);
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        java.lang.Throwable throwable0 = null;
        org.joo.promise4j.PromiseException promiseException1 = new org.joo.promise4j.PromiseException(throwable0);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise2 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException1);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise3 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException1);
        org.joo.promise4j.DeferredStatus deferredStatus4 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.getStatus();
        org.joo.promise4j.FailCallback<org.joo.promise4j.PromiseException> promiseExceptionFailCallback5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectPromise6 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.fail(promiseExceptionFailCallback5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassPromise2);
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        org.joo.promise4j.Promise<org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusJoinedResultsPromise0 = null;
        org.joo.promise4j.FilteredDoneCallback<org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>, java.lang.Throwable[]> deferredStatusJoinedResultsFilteredDoneCallback1 = null;
        org.joo.promise4j.FilteredFailureCallback<java.lang.Exception, java.lang.Exception> exceptionFilteredFailureCallback2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.FilteredPromise<org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>, java.lang.Exception, java.lang.Throwable[], java.lang.Exception> deferredStatusJoinedResultsFilteredPromise3 = new org.joo.promise4j.impl.FilteredPromise<org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>, java.lang.Exception, java.lang.Throwable[], java.lang.Exception>(deferredStatusJoinedResultsPromise0, deferredStatusJoinedResultsFilteredDoneCallback1, exceptionFilteredFailureCallback2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback4);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback6 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback6);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback8 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise9 = serializablePromise7.done(serializableDoneCallback8);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback10 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise11 = serializablePromise9.done(serializableDoneCallback10);
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNotNull(serializablePromise7);
        org.junit.Assert.assertNotNull(serializablePromise9);
        org.junit.Assert.assertNotNull(serializablePromise11);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred3 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) 10L);
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise4 = serializableCompletableDeferredObject0.promise();
        java.util.function.Predicate<java.io.Serializable> serializablePredicate5 = null;
        org.joo.promise4j.PipeDoneCallback<java.io.Serializable, java.io.Serializable, java.lang.Throwable> serializablePipeDoneCallback6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.when(serializablePredicate5, serializablePipeDoneCallback6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializableDeferred3);
        org.junit.Assert.assertNotNull(serializablePromise4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback4);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback6 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback6);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback8 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise9 = serializablePromise7.done(serializableDoneCallback8);
        java.lang.Class<?> wildcardClass10 = serializablePromise9.getClass();
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNotNull(serializablePromise7);
        org.junit.Assert.assertNotNull(serializablePromise9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.util.TimeoutScheduler, java.lang.Exception> timeoutSchedulerAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.util.TimeoutScheduler, java.lang.Exception>();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isRejected();
        org.joo.promise4j.AlwaysCallback<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListAlwaysCallback2 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise3 = deferredStatusListSyncDeferredObject0.always(deferredStatusListAlwaysCallback2);
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList6 = deferredStatusListSyncDeferredObject0.get(1L, timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(deferredStatusListPromise3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback4);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback6 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback6);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback8 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise9 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        java.util.function.Supplier<java.lang.Throwable> throwableSupplier12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred13 = serializableCompletableDeferredObject0.withTimeout((long) 'a', timeUnit11, throwableSupplier12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNotNull(serializablePromise7);
        org.junit.Assert.assertNotNull(serializablePromise9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        org.joo.promise4j.Promise<java.util.Spliterator<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusSpliteratorPromise0 = null;
        org.joo.promise4j.PipeAlwaysCallback<java.util.Spliterator<org.joo.promise4j.DeferredStatus>, java.lang.Iterable<org.joo.promise4j.DeferredStatus>, java.lang.Exception, java.lang.Exception> deferredStatusSpliteratorPipeAlwaysCallback1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.PipedAlwaysPromise<java.util.Spliterator<org.joo.promise4j.DeferredStatus>, java.lang.Exception, java.lang.Iterable<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusSpliteratorPipedAlwaysPromise2 = new org.joo.promise4j.impl.PipedAlwaysPromise<java.util.Spliterator<org.joo.promise4j.DeferredStatus>, java.lang.Exception, java.lang.Iterable<org.joo.promise4j.DeferredStatus>, java.lang.Exception>(deferredStatusSpliteratorPromise0, deferredStatusSpliteratorPipeAlwaysCallback1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable1 = null;
        org.joo.promise4j.PromiseException promiseException2 = new org.joo.promise4j.PromiseException(throwable1);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred3 = deferredStatusAsyncDeferredObject0.reject((java.lang.Exception) promiseException2);
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.DeferredStatus deferredStatus4 = deferredStatusAsyncDeferredObject0.get();
            org.junit.Assert.fail("Expected exception of type org.joo.promise4j.PromiseException; message: org.joo.promise4j.PromiseException");
        } catch (org.joo.promise4j.PromiseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deferredStatusDeferred3);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isPending();
        boolean boolean2 = deferredStatusListSyncDeferredObject0.isPending();
        java.util.concurrent.TimeUnit timeUnit4 = null;
        java.util.function.Supplier<org.joo.promise4j.PromiseException> promiseExceptionSupplier5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred6 = deferredStatusListSyncDeferredObject0.withTimeout((long) (short) 100, timeUnit4, promiseExceptionSupplier5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        org.joo.promise4j.Promise[] promiseArray1 = new org.joo.promise4j.Promise[0];
        @SuppressWarnings("unchecked")
        org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[] deferredStatusCollectionPromiseArray2 = (org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1;
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise3 = new org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>(deferredStatusCollectionPromiseArray2);
        org.junit.Assert.assertNotNull(promiseArray1);
        org.junit.Assert.assertNotNull(deferredStatusCollectionPromiseArray2);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable1 = null;
        org.joo.promise4j.PromiseException promiseException2 = new org.joo.promise4j.PromiseException(throwable1);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred3 = deferredStatusAsyncDeferredObject0.reject((java.lang.Exception) promiseException2);
        org.joo.promise4j.PromiseException promiseException4 = new org.joo.promise4j.PromiseException((java.lang.Throwable) promiseException2);
        org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionPromise5 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException4);
        org.junit.Assert.assertNotNull(deferredStatusDeferred3);
        org.junit.Assert.assertNotNull(deferredStatusCollectionPromise5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise5 = deferredStatusSimpleDeferredObject3.done(deferredStatusDoneCallback4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Callback cannot be deferred in non-deferred mode");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        org.joo.promise4j.DeferredStatus deferredStatus0 = org.joo.promise4j.DeferredStatus.RESOLVED;
        org.joo.promise4j.DeferredStatus[] deferredStatusArray1 = new org.joo.promise4j.DeferredStatus[] { deferredStatus0 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList2 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList2, deferredStatusArray1);
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults4 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>((java.util.List<org.joo.promise4j.DeferredStatus>) deferredStatusList2);
        java.util.Iterator<org.joo.promise4j.DeferredStatus> deferredStatusItor5 = deferredStatusJoinedResults4.iterator();
        org.junit.Assert.assertTrue("'" + deferredStatus0 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus0.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(deferredStatusItor5);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        org.joo.promise4j.DeferredStatus deferredStatus0 = org.joo.promise4j.DeferredStatus.RESOLVED;
        org.joo.promise4j.DeferredStatus[] deferredStatusArray1 = new org.joo.promise4j.DeferredStatus[] { deferredStatus0 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList2 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList2, deferredStatusArray1);
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults4 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>((java.util.List<org.joo.promise4j.DeferredStatus>) deferredStatusList2);
        java.util.Spliterator<org.joo.promise4j.DeferredStatus> deferredStatusSpliterator5 = deferredStatusList2.spliterator();
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults6 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>((java.util.List<org.joo.promise4j.DeferredStatus>) deferredStatusList2);
        org.junit.Assert.assertTrue("'" + deferredStatus0 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus0.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(deferredStatusSpliterator5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "hi!", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList4 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList4, charSequenceArray3);
        org.joo.promise4j.impl.JoinedResults<java.lang.CharSequence> charSequenceJoinedResults6 = new org.joo.promise4j.impl.JoinedResults<java.lang.CharSequence>((java.util.List<java.lang.CharSequence>) charSequenceList4);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable1 = null;
        org.joo.promise4j.PromiseException promiseException2 = new org.joo.promise4j.PromiseException(throwable1);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred3 = deferredStatusAsyncDeferredObject0.reject((java.lang.Exception) promiseException2);
        java.util.concurrent.TimeUnit timeUnit5 = null;
        java.util.function.Supplier<java.lang.Exception> exceptionSupplier6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise7 = deferredStatusAsyncDeferredObject0.timeoutAfter((long) (byte) 10, timeUnit5, exceptionSupplier6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deferredStatusDeferred3);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable1 = null;
        org.joo.promise4j.PromiseException promiseException2 = new org.joo.promise4j.PromiseException(throwable1);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise3 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException2);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred4 = deferredStatusAsyncDeferredObject0.reject((java.lang.Exception) promiseException2);
        java.util.concurrent.TimeUnit timeUnit6 = null;
        java.util.function.Supplier<java.lang.Exception> exceptionSupplier7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise8 = deferredStatusAsyncDeferredObject0.timeoutAfter((long) (byte) 100, timeUnit6, exceptionSupplier7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassPromise3);
        org.junit.Assert.assertNotNull(deferredStatusDeferred4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise1 = deferredStatusAsyncDeferredObject0.promise();
        org.joo.promise4j.FailCallback<java.lang.Exception> exceptionFailCallback2 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise3 = deferredStatusAsyncDeferredObject0.fail(exceptionFailCallback2);
        java.util.concurrent.TimeUnit timeUnit5 = null;
        java.util.function.Supplier<java.lang.Exception> exceptionSupplier6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise7 = deferredStatusAsyncDeferredObject0.timeoutAfter((long) (byte) 0, timeUnit5, exceptionSupplier6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deferredStatusPromise1);
        org.junit.Assert.assertNotNull(deferredStatusPromise3);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.DeferredStatus deferredStatus4 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred5 = deferredStatusSimpleDeferredObject3.resolve(deferredStatus4);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise6 = deferredStatusSimpleDeferredObject3.promise();
        org.joo.promise4j.DeferredStatus deferredStatus7 = deferredStatusSimpleDeferredObject3.getStatus();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        java.util.function.Supplier<java.lang.Throwable> throwableSupplier10 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise11 = deferredStatusSimpleDeferredObject3.timeoutAfter((long) (short) 100, timeUnit9, throwableSupplier10);
        org.joo.promise4j.DeferredStatus deferredStatus12 = deferredStatusSimpleDeferredObject3.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.DeferredStatus deferredStatus13 = deferredStatusSimpleDeferredObject3.get();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Callback cannot be deferred in non-deferred mode");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred5);
        org.junit.Assert.assertNotNull(deferredStatusPromise6);
        org.junit.Assert.assertTrue("'" + deferredStatus7 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus7.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusPromise11);
        org.junit.Assert.assertTrue("'" + deferredStatus12 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus12.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        java.lang.Runnable runnable0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture3 = org.joo.promise4j.util.TimeoutScheduler.delay(runnable0, (long) (short) 0, timeUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        org.joo.promise4j.Promise<java.lang.reflect.AnnotatedElement, org.joo.promise4j.PromiseException> annotatedElementPromise0 = null;
        org.joo.promise4j.FilteredDoneCallback<java.lang.reflect.AnnotatedElement, org.joo.promise4j.DeferredStatus> annotatedElementFilteredDoneCallback1 = null;
        org.joo.promise4j.FilteredFailureCallback<org.joo.promise4j.PromiseException, java.lang.Exception> promiseExceptionFilteredFailureCallback2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.FilteredPromise<java.lang.reflect.AnnotatedElement, org.joo.promise4j.PromiseException, org.joo.promise4j.DeferredStatus, java.lang.Exception> annotatedElementFilteredPromise3 = new org.joo.promise4j.impl.FilteredPromise<java.lang.reflect.AnnotatedElement, org.joo.promise4j.PromiseException, org.joo.promise4j.DeferredStatus, java.lang.Exception>(annotatedElementPromise0, annotatedElementFilteredDoneCallback1, promiseExceptionFilteredFailureCallback2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.fail(throwableFailCallback4);
        org.joo.promise4j.DeferredStatus deferredStatus6 = serializablePromise5.getStatus();
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback7 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise8 = serializablePromise5.fail(throwableFailCallback7);
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNull(deferredStatus6);
        org.junit.Assert.assertNotNull(serializablePromise8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback4);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback6 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback6);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback8 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise9 = serializablePromise7.done(serializableDoneCallback8);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable12 = serializablePromise7.get((long) (byte) -1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNotNull(serializablePromise7);
        org.junit.Assert.assertNotNull(serializablePromise9);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback4);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback6 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback6);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback8 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise9 = serializablePromise7.done(serializableDoneCallback8);
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject10 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise11 = serializableCompletableDeferredObject10.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred13 = serializableCompletableDeferredObject10.resolve((java.io.Serializable) 10L);
        java.io.Serializable serializable14 = serializableCompletableDeferredObject10.get();
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject15 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise16 = serializableCompletableDeferredObject15.promise();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise17 = serializableCompletableDeferredObject10.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject15);
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise18 = serializablePromise9.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject15);
        java.util.concurrent.TimeUnit timeUnit20 = null;
        java.util.function.Supplier<java.lang.Throwable> throwableSupplier21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise22 = serializableCompletableDeferredObject15.timeoutAfter(10L, timeUnit20, throwableSupplier21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNotNull(serializablePromise7);
        org.junit.Assert.assertNotNull(serializablePromise9);
        org.junit.Assert.assertNotNull(serializablePromise11);
        org.junit.Assert.assertNotNull(serializableDeferred13);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + 10L + "'", serializable14, 10L);
        org.junit.Assert.assertNotNull(serializablePromise16);
        org.junit.Assert.assertNotNull(serializablePromise17);
        org.junit.Assert.assertNotNull(serializablePromise18);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred5 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) 0);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable8 = serializableCompletableDeferredObject0.get((long) (byte) 0, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializableDeferred5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        org.joo.promise4j.Promise<org.joo.promise4j.impl.AbstractPromise<java.io.Serializable, java.lang.Throwable>, java.lang.Exception> serializableAbstractPromisePromise0 = null;
        org.joo.promise4j.PipeDoneCallback<org.joo.promise4j.impl.AbstractPromise<java.io.Serializable, java.lang.Throwable>, org.joo.promise4j.impl.AbstractPromise<java.io.Serializable, java.lang.Throwable>, java.lang.Exception> serializableAbstractPromisePipeDoneCallback1 = null;
        java.util.function.Predicate<org.joo.promise4j.impl.AbstractPromise<java.io.Serializable, java.lang.Throwable>> serializableAbstractPromisePredicate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.ConditionalPipedPromise<org.joo.promise4j.impl.AbstractPromise<java.io.Serializable, java.lang.Throwable>, java.lang.Exception> serializableAbstractPromiseConditionalPipedPromise3 = new org.joo.promise4j.impl.ConditionalPipedPromise<org.joo.promise4j.impl.AbstractPromise<java.io.Serializable, java.lang.Throwable>, java.lang.Exception>(serializableAbstractPromisePromise0, serializableAbstractPromisePipeDoneCallback1, serializableAbstractPromisePredicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.fail(throwableFailCallback4);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable8 = serializablePromise5.get(0L, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        org.joo.promise4j.Deferred<java.lang.reflect.AnnotatedElement, org.joo.promise4j.PromiseException> annotatedElementDeferred0 = null;
        org.joo.promise4j.Deferred[] deferredArray2 = new org.joo.promise4j.Deferred[1];
        @SuppressWarnings("unchecked")
        org.joo.promise4j.Deferred<java.lang.reflect.AnnotatedElement, org.joo.promise4j.PromiseException>[] annotatedElementDeferredArray3 = (org.joo.promise4j.Deferred<java.lang.reflect.AnnotatedElement, org.joo.promise4j.PromiseException>[]) deferredArray2;
        annotatedElementDeferredArray3[0] = annotatedElementDeferred0;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.JoinedPromise<java.lang.reflect.AnnotatedElement, org.joo.promise4j.PromiseException> annotatedElementJoinedPromise6 = org.joo.promise4j.impl.JoinedPromise.of(annotatedElementDeferredArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deferredArray2);
        org.junit.Assert.assertNotNull(annotatedElementDeferredArray3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        org.joo.promise4j.Deferred<org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>, java.lang.Throwable> deferredStatusListSyncDeferredObjectDeferred0 = null;
        org.joo.promise4j.Deferred[] deferredArray2 = new org.joo.promise4j.Deferred[1];
        @SuppressWarnings("unchecked")
        org.joo.promise4j.Deferred<org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>, java.lang.Throwable>[] listSyncDeferredObjectDeferredArray3 = (org.joo.promise4j.Deferred<org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>, java.lang.Throwable>[]) deferredArray2;
        listSyncDeferredObjectDeferredArray3[0] = deferredStatusListSyncDeferredObjectDeferred0;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.JoinedPromise<org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>, java.lang.Throwable> deferredStatusListSyncDeferredObjectJoinedPromise6 = org.joo.promise4j.impl.JoinedPromise.from(listSyncDeferredObjectDeferredArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deferredArray2);
        org.junit.Assert.assertNotNull(listSyncDeferredObjectDeferredArray3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        java.lang.Throwable throwable0 = null;
        org.joo.promise4j.PromiseException promiseException1 = new org.joo.promise4j.PromiseException(throwable0);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise2 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException1);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise3 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException1);
        org.joo.promise4j.FailCallback<org.joo.promise4j.PromiseException> promiseExceptionFailCallback4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectPromise5 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.fail(promiseExceptionFailCallback4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassPromise2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred5 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) 0);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable8 = serializableCompletableDeferredObject0.get((long) 'a', timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializableDeferred5);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback4);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback6 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback6);
        java.lang.Throwable throwable8 = null;
        org.joo.promise4j.PromiseException promiseException9 = new org.joo.promise4j.PromiseException(throwable8);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise10 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException9);
        java.lang.Throwable[] throwableArray11 = promiseException9.getSuppressed();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred12 = serializableCompletableDeferredObject0.reject((java.lang.Throwable) promiseException9);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject13 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable14 = null;
        org.joo.promise4j.PromiseException promiseException15 = new org.joo.promise4j.PromiseException(throwable14);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred16 = deferredStatusAsyncDeferredObject13.reject((java.lang.Exception) promiseException15);
        org.joo.promise4j.PromiseException promiseException17 = new org.joo.promise4j.PromiseException((java.lang.Throwable) promiseException15);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred18 = serializableCompletableDeferredObject0.reject((java.lang.Throwable) promiseException15);
        org.joo.promise4j.PromiseException promiseException19 = new org.joo.promise4j.PromiseException((java.lang.Throwable) promiseException15);
        org.joo.promise4j.PromiseException promiseException20 = new org.joo.promise4j.PromiseException((java.lang.Throwable) promiseException19);
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNotNull(serializablePromise7);
        org.junit.Assert.assertNotNull(wildcardClassPromise10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(serializableDeferred12);
        org.junit.Assert.assertNotNull(deferredStatusDeferred16);
        org.junit.Assert.assertNotNull(serializableDeferred18);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>> serializableCompletableDeferredObjectDoneCallback0 = null;
        org.joo.promise4j.FailCallback<org.joo.promise4j.PromiseException> promiseExceptionFailCallback1 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>, org.joo.promise4j.PromiseException> serializableCompletableDeferredObjectSimpleDeferredObject2 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>, org.joo.promise4j.PromiseException>(serializableCompletableDeferredObjectDoneCallback0, promiseExceptionFailCallback1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        java.lang.Throwable throwable0 = null;
        org.joo.promise4j.PromiseException promiseException1 = new org.joo.promise4j.PromiseException(throwable0);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise2 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException1);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise3 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException1);
        org.joo.promise4j.DeferredStatus deferredStatus4 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.getStatus();
        org.joo.promise4j.DoneCallback<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>> deferredStatusAsyncDeferredObjectDoneCallback5 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectPromise6 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.done(deferredStatusAsyncDeferredObjectDoneCallback5);
        org.joo.promise4j.DeferredStatus deferredStatus7 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.getStatus();
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectAlwaysCallback8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectPromise9 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.always(deferredStatusAsyncDeferredObjectAlwaysCallback8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassPromise2);
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusAsyncDeferredObjectPromise6);
        org.junit.Assert.assertTrue("'" + deferredStatus7 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus7.equals(org.joo.promise4j.DeferredStatus.REJECTED));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.lang.Throwable throwable0 = null;
        org.joo.promise4j.PromiseException promiseException1 = new org.joo.promise4j.PromiseException(throwable0);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise2 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException1);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise3 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException1);
        org.joo.promise4j.DeferredStatus deferredStatus4 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.getStatus();
        org.joo.promise4j.DoneCallback<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>> deferredStatusAsyncDeferredObjectDoneCallback5 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectPromise6 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.done(deferredStatusAsyncDeferredObjectDoneCallback5);
        org.joo.promise4j.DeferredStatus deferredStatus7 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject8 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.get();
            org.junit.Assert.fail("Expected exception of type org.joo.promise4j.PromiseException; message: org.joo.promise4j.PromiseException");
        } catch (org.joo.promise4j.PromiseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassPromise2);
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusAsyncDeferredObjectPromise6);
        org.junit.Assert.assertTrue("'" + deferredStatus7 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus7.equals(org.joo.promise4j.DeferredStatus.REJECTED));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isPending();
        boolean boolean2 = deferredStatusListSyncDeferredObject0.isPending();
        org.joo.promise4j.FailCallback<org.joo.promise4j.PromiseException> promiseExceptionFailCallback3 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise4 = deferredStatusListSyncDeferredObject0.fail(promiseExceptionFailCallback3);
        boolean boolean5 = deferredStatusListSyncDeferredObject0.isRejected();
        boolean boolean6 = deferredStatusListSyncDeferredObject0.isRejected();
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList9 = deferredStatusListSyncDeferredObject0.get(0L, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(deferredStatusListPromise4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        org.joo.promise4j.impl.CompletableDeferredObject<java.lang.Exception, java.lang.Exception> exceptionCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.lang.Exception, java.lang.Exception>();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise1 = deferredStatusAsyncDeferredObject0.promise();
        org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectSimpleDonePromise2 = new org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>(deferredStatusAsyncDeferredObject0);
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectAlwaysCallback3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectPromise4 = deferredStatusAsyncDeferredObjectSimpleDonePromise2.always(deferredStatusAsyncDeferredObjectAlwaysCallback3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deferredStatusPromise1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback4);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback6 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback6);
        java.lang.Throwable throwable8 = null;
        org.joo.promise4j.PromiseException promiseException9 = new org.joo.promise4j.PromiseException(throwable8);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise10 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException9);
        java.lang.Throwable[] throwableArray11 = promiseException9.getSuppressed();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred12 = serializableCompletableDeferredObject0.reject((java.lang.Throwable) promiseException9);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject13 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable14 = null;
        org.joo.promise4j.PromiseException promiseException15 = new org.joo.promise4j.PromiseException(throwable14);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred16 = deferredStatusAsyncDeferredObject13.reject((java.lang.Exception) promiseException15);
        org.joo.promise4j.PromiseException promiseException17 = new org.joo.promise4j.PromiseException((java.lang.Throwable) promiseException15);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred18 = serializableCompletableDeferredObject0.reject((java.lang.Throwable) promiseException15);
        java.lang.String str19 = promiseException15.toString();
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNotNull(serializablePromise7);
        org.junit.Assert.assertNotNull(wildcardClassPromise10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(serializableDeferred12);
        org.junit.Assert.assertNotNull(deferredStatusDeferred16);
        org.junit.Assert.assertNotNull(serializableDeferred18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.joo.promise4j.PromiseException" + "'", str19, "org.joo.promise4j.PromiseException");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        org.joo.promise4j.DeferredStatus deferredStatus0 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.DeferredStatus[] deferredStatusArray1 = new org.joo.promise4j.DeferredStatus[] { deferredStatus0 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList2 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList2, deferredStatusArray1);
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults4 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>((java.util.List<org.joo.promise4j.DeferredStatus>) deferredStatusList2);
        java.util.List<org.joo.promise4j.DeferredStatus> deferredStatusList5 = deferredStatusJoinedResults4.getResults();
        java.util.Iterator<org.joo.promise4j.DeferredStatus> deferredStatusItor6 = deferredStatusJoinedResults4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.DeferredStatus deferredStatus8 = deferredStatusJoinedResults4.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + deferredStatus0 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus0.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(deferredStatusList5);
        org.junit.Assert.assertNotNull(deferredStatusItor6);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.DeferredStatus deferredStatus4 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred5 = deferredStatusSimpleDeferredObject3.resolve(deferredStatus4);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise6 = deferredStatusSimpleDeferredObject3.promise();
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject7 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable8 = null;
        org.joo.promise4j.PromiseException promiseException9 = new org.joo.promise4j.PromiseException(throwable8);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred10 = deferredStatusAsyncDeferredObject7.reject((java.lang.Exception) promiseException9);
        org.joo.promise4j.PromiseException promiseException11 = new org.joo.promise4j.PromiseException((java.lang.Throwable) promiseException9);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred12 = deferredStatusSimpleDeferredObject3.reject((java.lang.Throwable) promiseException11);
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.DeferredStatus deferredStatus13 = deferredStatusSimpleDeferredObject3.get();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Callback cannot be deferred in non-deferred mode");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred5);
        org.junit.Assert.assertNotNull(deferredStatusPromise6);
        org.junit.Assert.assertNotNull(deferredStatusDeferred10);
        org.junit.Assert.assertNotNull(deferredStatusDeferred12);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.lang.Throwable throwable0 = null;
        org.joo.promise4j.PromiseException promiseException1 = new org.joo.promise4j.PromiseException(throwable0);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise2 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException1);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise3 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException1);
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectAlwaysCallback4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectPromise5 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.always(deferredStatusAsyncDeferredObjectAlwaysCallback4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassPromise2);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Throwable> deferredStatusAsyncDeferredObjectPromise0 = null;
        org.joo.promise4j.Promise[] promiseArray2 = new org.joo.promise4j.Promise[1];
        @SuppressWarnings("unchecked")
        org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Throwable>[] deferredStatusAsyncDeferredObjectPromiseArray3 = (org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Throwable>[]) promiseArray2;
        deferredStatusAsyncDeferredObjectPromiseArray3[0] = deferredStatusAsyncDeferredObjectPromise0;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>>, java.lang.Throwable> deferredStatusAsyncDeferredObjectJoinedResultsPromise6 = org.joo.promise4j.Promise.all(deferredStatusAsyncDeferredObjectPromiseArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(promiseArray2);
        org.junit.Assert.assertNotNull(deferredStatusAsyncDeferredObjectPromiseArray3);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback4);
        java.lang.Throwable throwable6 = null;
        org.joo.promise4j.PromiseException promiseException7 = new org.joo.promise4j.PromiseException(throwable6);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise8 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException7);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise9 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException7);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred10 = serializableCompletableDeferredObject0.reject((java.lang.Throwable) promiseException7);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback11 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise12 = serializableCompletableDeferredObject0.done(serializableDoneCallback11);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable15 = serializableCompletableDeferredObject0.get((long) (short) 0, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNotNull(wildcardClassPromise8);
        org.junit.Assert.assertNotNull(serializableDeferred10);
        org.junit.Assert.assertNotNull(serializablePromise12);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isRejected();
        java.lang.Throwable throwable2 = null;
        org.joo.promise4j.PromiseException promiseException3 = new org.joo.promise4j.PromiseException(throwable2);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise4 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException3);
        java.lang.Throwable[] throwableArray5 = promiseException3.getSuppressed();
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred6 = deferredStatusListSyncDeferredObject0.reject(promiseException3);
        boolean boolean7 = deferredStatusListSyncDeferredObject0.isResolved();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        java.util.function.Supplier<org.joo.promise4j.PromiseException> promiseExceptionSupplier10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred11 = deferredStatusListSyncDeferredObject0.withTimeout((long) (short) 10, timeUnit9, promiseExceptionSupplier10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClassPromise4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.DeferredStatus deferredStatus4 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred5 = deferredStatusSimpleDeferredObject3.resolve(deferredStatus4);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise6 = deferredStatusSimpleDeferredObject3.promise();
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise8 = deferredStatusSimpleDeferredObject3.done(deferredStatusDoneCallback7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Callback cannot be deferred in non-deferred mode");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred5);
        org.junit.Assert.assertNotNull(deferredStatusPromise6);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred3 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) 10L);
        java.io.Serializable serializable4 = serializableCompletableDeferredObject0.get();
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback5 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise6 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback5);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback7 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise8 = serializablePromise6.done(serializableDoneCallback7);
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject9 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise10 = serializableCompletableDeferredObject9.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback11 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise12 = serializableCompletableDeferredObject9.done(serializableDoneCallback11);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback13 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise14 = serializableCompletableDeferredObject9.always(serializableAlwaysCallback13);
        java.lang.Throwable throwable15 = null;
        org.joo.promise4j.PromiseException promiseException16 = new org.joo.promise4j.PromiseException(throwable15);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise17 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException16);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise18 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException16);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred19 = serializableCompletableDeferredObject9.reject((java.lang.Throwable) promiseException16);
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise20 = serializablePromise8.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject9);
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializableDeferred3);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + 10L + "'", serializable4, 10L);
        org.junit.Assert.assertNotNull(serializablePromise6);
        org.junit.Assert.assertNotNull(serializablePromise8);
        org.junit.Assert.assertNotNull(serializablePromise10);
        org.junit.Assert.assertNotNull(serializablePromise12);
        org.junit.Assert.assertNotNull(serializablePromise14);
        org.junit.Assert.assertNotNull(wildcardClassPromise17);
        org.junit.Assert.assertNotNull(serializableDeferred19);
        org.junit.Assert.assertNotNull(serializablePromise20);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise1 = deferredStatusAsyncDeferredObject0.promise();
        org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectSimpleDonePromise2 = new org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>(deferredStatusAsyncDeferredObject0);
        java.util.concurrent.TimeUnit timeUnit4 = null;
        java.util.function.Supplier<java.lang.Exception> exceptionSupplier5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred6 = deferredStatusAsyncDeferredObject0.withTimeout((long) ' ', timeUnit4, exceptionSupplier5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deferredStatusPromise1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        org.joo.promise4j.Promise<org.joo.promise4j.PromiseException, org.joo.promise4j.PromiseException> promiseExceptionPromise0 = null;
        org.joo.promise4j.PipeDoneCallback<org.joo.promise4j.PromiseException, java.lang.String, java.lang.Throwable> promiseExceptionPipeDoneCallback1 = null;
        org.joo.promise4j.PipeFailureCallback<org.joo.promise4j.PromiseException, java.lang.String, java.lang.Throwable> promiseExceptionPipeFailureCallback2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.PipedPromise<org.joo.promise4j.PromiseException, org.joo.promise4j.PromiseException, java.lang.String, java.lang.Throwable> promiseExceptionPipedPromise3 = new org.joo.promise4j.impl.PipedPromise<org.joo.promise4j.PromiseException, org.joo.promise4j.PromiseException, java.lang.String, java.lang.Throwable>(promiseExceptionPromise0, promiseExceptionPipeDoneCallback1, promiseExceptionPipeFailureCallback2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.DeferredStatus deferredStatus1 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred2 = deferredStatusAsyncDeferredObject0.resolve(deferredStatus1);
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAlwaysCallback3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise4 = deferredStatusAsyncDeferredObject0.always(deferredStatusAlwaysCallback3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + deferredStatus1 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus1.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred2);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        java.lang.Throwable throwable1 = null;
        org.joo.promise4j.PromiseException promiseException2 = new org.joo.promise4j.PromiseException(throwable1);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise3 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException2);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise4 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException2);
        org.joo.promise4j.DeferredStatus deferredStatus5 = deferredStatusAsyncDeferredObjectSimpleFailurePromise4.getStatus();
        org.joo.promise4j.DoneCallback<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>> deferredStatusAsyncDeferredObjectDoneCallback6 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectPromise7 = deferredStatusAsyncDeferredObjectSimpleFailurePromise4.done(deferredStatusAsyncDeferredObjectDoneCallback6);
        org.joo.promise4j.DeferredStatus deferredStatus8 = deferredStatusAsyncDeferredObjectSimpleFailurePromise4.getStatus();
        org.joo.promise4j.DeferredStatus deferredStatus9 = deferredStatusAsyncDeferredObjectSimpleFailurePromise4.getStatus();
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject10 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise11 = deferredStatusAsyncDeferredObject10.promise();
        org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectSimpleDonePromise12 = new org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>(deferredStatusAsyncDeferredObject10);
        org.joo.promise4j.DeferredStatus deferredStatus13 = deferredStatusAsyncDeferredObjectSimpleDonePromise12.getStatus();
        org.joo.promise4j.DeferredStatus deferredStatus14 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback15 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback16 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback17 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject18 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback15, throwableFailCallback16, deferredStatusAlwaysCallback17);
        org.joo.promise4j.DeferredStatus deferredStatus19 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred20 = deferredStatusSimpleDeferredObject18.resolve(deferredStatus19);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise21 = deferredStatusSimpleDeferredObject18.promise();
        org.joo.promise4j.DeferredStatus deferredStatus22 = deferredStatusSimpleDeferredObject18.getStatus();
        java.util.concurrent.TimeUnit timeUnit24 = null;
        java.util.function.Supplier<java.lang.Throwable> throwableSupplier25 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise26 = deferredStatusSimpleDeferredObject18.timeoutAfter((long) (short) 100, timeUnit24, throwableSupplier25);
        org.joo.promise4j.DeferredStatus deferredStatus27 = deferredStatusSimpleDeferredObject18.getStatus();
        org.joo.promise4j.DeferredStatus[] deferredStatusArray28 = new org.joo.promise4j.DeferredStatus[] { deferredStatus9, deferredStatus13, deferredStatus14, deferredStatus27 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList29 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList29, deferredStatusArray28);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred31 = deferredStatusListSyncDeferredObject0.resolve(deferredStatusList29);
        org.junit.Assert.assertNotNull(wildcardClassPromise3);
        org.junit.Assert.assertTrue("'" + deferredStatus5 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus5.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusAsyncDeferredObjectPromise7);
        org.junit.Assert.assertTrue("'" + deferredStatus8 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus8.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertTrue("'" + deferredStatus9 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus9.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusPromise11);
        org.junit.Assert.assertTrue("'" + deferredStatus13 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus13.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertTrue("'" + deferredStatus14 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus14.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertTrue("'" + deferredStatus19 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus19.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred20);
        org.junit.Assert.assertNotNull(deferredStatusPromise21);
        org.junit.Assert.assertTrue("'" + deferredStatus22 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus22.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusPromise26);
        org.junit.Assert.assertTrue("'" + deferredStatus27 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus27.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred31);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isRejected();
        org.joo.promise4j.DoneCallback<java.util.ArrayList<org.joo.promise4j.DeferredStatus>> deferredStatusListDoneCallback2 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise3 = deferredStatusListSyncDeferredObject0.done(deferredStatusListDoneCallback2);
        boolean boolean4 = deferredStatusListSyncDeferredObject0.isPending();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(deferredStatusListPromise3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        org.joo.promise4j.impl.SyncDeferredObject<java.lang.Class<?>, java.lang.Throwable> wildcardClassSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.lang.Class<?>, java.lang.Throwable>();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback4);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback6 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        java.util.function.Supplier<java.lang.Throwable> throwableSupplier10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred11 = serializableCompletableDeferredObject0.withTimeout((long) (short) 0, timeUnit9, throwableSupplier10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNotNull(serializablePromise7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        org.joo.promise4j.Promise[] promiseArray1 = new org.joo.promise4j.Promise[0];
        @SuppressWarnings("unchecked")
        org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[] deferredStatusCollectionPromiseArray2 = (org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1;
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise3 = org.joo.promise4j.impl.JoinedPromise.of((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise4 = new org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise5 = new org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>, java.lang.Throwable> deferredStatusAsyncDeferredObjectSimpleDonePromiseJoinedPromise6 = new org.joo.promise4j.impl.JoinedPromise<org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>, java.lang.Throwable>((org.joo.promise4j.Promise<org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>, java.lang.Throwable>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<java.lang.CharSequence, java.lang.Exception> charSequenceJoinedPromise7 = org.joo.promise4j.impl.JoinedPromise.from((org.joo.promise4j.Promise<java.lang.CharSequence, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.Promise<org.joo.promise4j.impl.JoinedResults<java.lang.Throwable>, java.lang.Exception> throwableJoinedResultsPromise8 = org.joo.promise4j.Promise.all((org.joo.promise4j.Promise<java.lang.Throwable, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<java.lang.Cloneable, org.joo.promise4j.PromiseException> cloneableJoinedPromise9 = new org.joo.promise4j.impl.JoinedPromise<java.lang.Cloneable, org.joo.promise4j.PromiseException>((org.joo.promise4j.Promise<java.lang.Cloneable, org.joo.promise4j.PromiseException>[]) promiseArray1);
        org.junit.Assert.assertNotNull(promiseArray1);
        org.junit.Assert.assertNotNull(deferredStatusCollectionPromiseArray2);
        org.junit.Assert.assertNotNull(deferredStatusCollectionJoinedPromise3);
        org.junit.Assert.assertNotNull(charSequenceJoinedPromise7);
        org.junit.Assert.assertNotNull(throwableJoinedResultsPromise8);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback4);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback6 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback6);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback8 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise9 = serializablePromise7.done(serializableDoneCallback8);
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject10 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise11 = serializableCompletableDeferredObject10.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred13 = serializableCompletableDeferredObject10.resolve((java.io.Serializable) 10L);
        java.io.Serializable serializable14 = serializableCompletableDeferredObject10.get();
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject15 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise16 = serializableCompletableDeferredObject15.promise();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise17 = serializableCompletableDeferredObject10.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject15);
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise18 = serializablePromise9.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject15);
        java.util.function.Predicate<java.io.Serializable> serializablePredicate19 = null;
        org.joo.promise4j.PipeDoneCallback<java.io.Serializable, java.io.Serializable, java.lang.Throwable> serializablePipeDoneCallback20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise21 = serializablePromise9.when(serializablePredicate19, serializablePipeDoneCallback20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNotNull(serializablePromise7);
        org.junit.Assert.assertNotNull(serializablePromise9);
        org.junit.Assert.assertNotNull(serializablePromise11);
        org.junit.Assert.assertNotNull(serializableDeferred13);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + 10L + "'", serializable14, 10L);
        org.junit.Assert.assertNotNull(serializablePromise16);
        org.junit.Assert.assertNotNull(serializablePromise17);
        org.junit.Assert.assertNotNull(serializablePromise18);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.DeferredStatus deferredStatus4 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred5 = deferredStatusSimpleDeferredObject3.resolve(deferredStatus4);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise6 = deferredStatusSimpleDeferredObject3.promise();
        java.util.concurrent.TimeUnit timeUnit8 = null;
        java.util.function.Supplier<java.lang.Throwable> throwableSupplier9 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise10 = deferredStatusSimpleDeferredObject3.timeoutAfter(0L, timeUnit8, throwableSupplier9);
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred5);
        org.junit.Assert.assertNotNull(deferredStatusPromise6);
        org.junit.Assert.assertNotNull(deferredStatusPromise10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        org.joo.promise4j.Promise[] promiseArray1 = new org.joo.promise4j.Promise[0];
        @SuppressWarnings("unchecked")
        org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[] deferredStatusCollectionPromiseArray2 = (org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1;
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise3 = org.joo.promise4j.impl.JoinedPromise.of((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise4 = new org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise5 = new org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>, java.lang.Throwable> deferredStatusAsyncDeferredObjectSimpleDonePromiseJoinedPromise6 = new org.joo.promise4j.impl.JoinedPromise<org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>, java.lang.Throwable>((org.joo.promise4j.Promise<org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>, java.lang.Throwable>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<org.joo.promise4j.impl.AbstractPromise<java.io.Serializable, java.lang.Throwable>, java.lang.Throwable> serializableAbstractPromiseJoinedPromise7 = org.joo.promise4j.impl.JoinedPromise.from((org.joo.promise4j.Promise<org.joo.promise4j.impl.AbstractPromise<java.io.Serializable, java.lang.Throwable>, java.lang.Throwable>[]) promiseArray1);
        org.junit.Assert.assertNotNull(promiseArray1);
        org.junit.Assert.assertNotNull(deferredStatusCollectionPromiseArray2);
        org.junit.Assert.assertNotNull(deferredStatusCollectionJoinedPromise3);
        org.junit.Assert.assertNotNull(serializableAbstractPromiseJoinedPromise7);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback4);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback6 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback6);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback8 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise9 = serializablePromise7.done(serializableDoneCallback8);
        java.util.function.Predicate<java.io.Serializable> serializablePredicate10 = null;
        org.joo.promise4j.PipeDoneCallback<java.io.Serializable, java.io.Serializable, java.lang.Throwable> serializablePipeDoneCallback11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise12 = serializablePromise9.when(serializablePredicate10, serializablePipeDoneCallback11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNotNull(serializablePromise7);
        org.junit.Assert.assertNotNull(serializablePromise9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise1 = deferredStatusAsyncDeferredObject0.promise();
        org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectSimpleDonePromise2 = new org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>(deferredStatusAsyncDeferredObject0);
        org.joo.promise4j.DeferredStatus deferredStatus3 = deferredStatusAsyncDeferredObjectSimpleDonePromise2.getStatus();
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectAlwaysCallback4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectPromise5 = deferredStatusAsyncDeferredObjectSimpleDonePromise2.always(deferredStatusAsyncDeferredObjectAlwaysCallback4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deferredStatusPromise1);
        org.junit.Assert.assertTrue("'" + deferredStatus3 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus3.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isRejected();
        java.lang.Throwable throwable2 = null;
        org.joo.promise4j.PromiseException promiseException3 = new org.joo.promise4j.PromiseException(throwable2);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise4 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException3);
        java.lang.Throwable[] throwableArray5 = promiseException3.getSuppressed();
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred6 = deferredStatusListSyncDeferredObject0.reject(promiseException3);
        org.joo.promise4j.DeferredStatus deferredStatus7 = org.joo.promise4j.DeferredStatus.RESOLVED;
        org.joo.promise4j.DeferredStatus[] deferredStatusArray8 = new org.joo.promise4j.DeferredStatus[] { deferredStatus7 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList9 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList9, deferredStatusArray8);
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults11 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>((java.util.List<org.joo.promise4j.DeferredStatus>) deferredStatusList9);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred12 = deferredStatusListSyncDeferredObject0.resolve(deferredStatusList9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList13 = deferredStatusListSyncDeferredObject0.get();
            org.junit.Assert.fail("Expected exception of type org.joo.promise4j.PromiseException; message: org.joo.promise4j.PromiseException");
        } catch (org.joo.promise4j.PromiseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClassPromise4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred6);
        org.junit.Assert.assertTrue("'" + deferredStatus7 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus7.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred12);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        org.joo.promise4j.impl.AsyncDeferredObject<java.util.List<org.joo.promise4j.DeferredStatus>, java.lang.Throwable> deferredStatusListAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<java.util.List<org.joo.promise4j.DeferredStatus>, java.lang.Throwable>();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.DeferredStatus deferredStatus4 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred5 = deferredStatusSimpleDeferredObject3.resolve(deferredStatus4);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise6 = deferredStatusSimpleDeferredObject3.promise();
        org.joo.promise4j.DeferredStatus deferredStatus7 = deferredStatusSimpleDeferredObject3.getStatus();
        java.lang.Throwable throwable8 = null;
        org.joo.promise4j.PromiseException promiseException9 = new org.joo.promise4j.PromiseException(throwable8);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise10 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException9);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred11 = deferredStatusSimpleDeferredObject3.reject((java.lang.Throwable) promiseException9);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise12 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException9);
        org.joo.promise4j.Promise<org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>, java.lang.Throwable> deferredStatusAsyncDeferredObjectSimpleFailurePromisePromise13 = org.joo.promise4j.Promise.of(deferredStatusAsyncDeferredObjectSimpleFailurePromise12);
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred5);
        org.junit.Assert.assertNotNull(deferredStatusPromise6);
        org.junit.Assert.assertTrue("'" + deferredStatus7 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus7.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(wildcardClassPromise10);
        org.junit.Assert.assertNotNull(deferredStatusDeferred11);
        org.junit.Assert.assertNotNull(deferredStatusAsyncDeferredObjectSimpleFailurePromisePromise13);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback4);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback6 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback6);
        java.lang.Throwable throwable8 = null;
        org.joo.promise4j.PromiseException promiseException9 = new org.joo.promise4j.PromiseException(throwable8);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise10 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException9);
        java.lang.Throwable[] throwableArray11 = promiseException9.getSuppressed();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred12 = serializableCompletableDeferredObject0.reject((java.lang.Throwable) promiseException9);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject13 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable14 = null;
        org.joo.promise4j.PromiseException promiseException15 = new org.joo.promise4j.PromiseException(throwable14);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred16 = deferredStatusAsyncDeferredObject13.reject((java.lang.Exception) promiseException15);
        org.joo.promise4j.PromiseException promiseException17 = new org.joo.promise4j.PromiseException((java.lang.Throwable) promiseException15);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred18 = serializableCompletableDeferredObject0.reject((java.lang.Throwable) promiseException15);
        org.joo.promise4j.PromiseException promiseException19 = new org.joo.promise4j.PromiseException((java.lang.Throwable) promiseException15);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObjectSimpleFailurePromise20 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>, org.joo.promise4j.PromiseException>(promiseException19);
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNotNull(serializablePromise7);
        org.junit.Assert.assertNotNull(wildcardClassPromise10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(serializableDeferred12);
        org.junit.Assert.assertNotNull(deferredStatusDeferred16);
        org.junit.Assert.assertNotNull(serializableDeferred18);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject4 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializablePromise3.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject4);
        org.joo.promise4j.DeferredStatus deferredStatus6 = serializableCompletableDeferredObject4.getStatus();
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject7 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise8 = serializableCompletableDeferredObject7.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback9 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise10 = serializableCompletableDeferredObject7.done(serializableDoneCallback9);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback11 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise12 = serializableCompletableDeferredObject7.always(serializableAlwaysCallback11);
        java.lang.Throwable throwable13 = null;
        org.joo.promise4j.PromiseException promiseException14 = new org.joo.promise4j.PromiseException(throwable13);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise15 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException14);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise16 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException14);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred17 = serializableCompletableDeferredObject7.reject((java.lang.Throwable) promiseException14);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred18 = serializableCompletableDeferredObject4.reject((java.lang.Throwable) promiseException14);
        java.util.function.Predicate<java.io.Serializable> serializablePredicate19 = null;
        org.joo.promise4j.PipeDoneCallback<java.io.Serializable, java.io.Serializable, java.lang.Throwable> serializablePipeDoneCallback20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise21 = serializableCompletableDeferredObject4.when(serializablePredicate19, serializablePipeDoneCallback20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNull(deferredStatus6);
        org.junit.Assert.assertNotNull(serializablePromise8);
        org.junit.Assert.assertNotNull(serializablePromise10);
        org.junit.Assert.assertNotNull(serializablePromise12);
        org.junit.Assert.assertNotNull(wildcardClassPromise15);
        org.junit.Assert.assertNotNull(serializableDeferred17);
        org.junit.Assert.assertNotNull(serializableDeferred18);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise1 = deferredStatusAsyncDeferredObject0.promise();
        org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectSimpleDonePromise2 = new org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>(deferredStatusAsyncDeferredObject0);
        org.joo.promise4j.DeferredStatus deferredStatus3 = deferredStatusAsyncDeferredObjectSimpleDonePromise2.getStatus();
        org.joo.promise4j.FailCallback<java.lang.Exception> exceptionFailCallback4 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectPromise5 = deferredStatusAsyncDeferredObjectSimpleDonePromise2.fail(exceptionFailCallback4);
        org.junit.Assert.assertNotNull(deferredStatusPromise1);
        org.junit.Assert.assertTrue("'" + deferredStatus3 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus3.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusAsyncDeferredObjectPromise5);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.DeferredStatus deferredStatus4 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred5 = deferredStatusSimpleDeferredObject3.resolve(deferredStatus4);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise6 = deferredStatusSimpleDeferredObject3.promise();
        org.joo.promise4j.DeferredStatus deferredStatus7 = deferredStatusSimpleDeferredObject3.getStatus();
        java.lang.Throwable throwable8 = null;
        org.joo.promise4j.PromiseException promiseException9 = new org.joo.promise4j.PromiseException(throwable8);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise10 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException9);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred11 = deferredStatusSimpleDeferredObject3.reject((java.lang.Throwable) promiseException9);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise12 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException9);
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject13 = deferredStatusAsyncDeferredObjectSimpleFailurePromise12.get();
            org.junit.Assert.fail("Expected exception of type org.joo.promise4j.PromiseException; message: org.joo.promise4j.PromiseException");
        } catch (org.joo.promise4j.PromiseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred5);
        org.junit.Assert.assertNotNull(deferredStatusPromise6);
        org.junit.Assert.assertTrue("'" + deferredStatus7 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus7.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(wildcardClassPromise10);
        org.junit.Assert.assertNotNull(deferredStatusDeferred11);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isRejected();
        org.joo.promise4j.DoneCallback<java.util.ArrayList<org.joo.promise4j.DeferredStatus>> deferredStatusListDoneCallback2 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise3 = deferredStatusListSyncDeferredObject0.done(deferredStatusListDoneCallback2);
        boolean boolean4 = deferredStatusListSyncDeferredObject0.isResolved();
        java.lang.Throwable throwable5 = null;
        org.joo.promise4j.PromiseException promiseException6 = new org.joo.promise4j.PromiseException(throwable5);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise7 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException6);
        java.lang.Throwable[] throwableArray8 = promiseException6.getSuppressed();
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred9 = deferredStatusListSyncDeferredObject0.reject(promiseException6);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        java.util.function.Supplier<org.joo.promise4j.PromiseException> promiseExceptionSupplier12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred13 = deferredStatusListSyncDeferredObject0.withTimeout((long) (-1), timeUnit11, promiseExceptionSupplier12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(deferredStatusListPromise3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClassPromise7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred9);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject2 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1);
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise4 = deferredStatusSimpleDeferredObject2.done(deferredStatusDoneCallback3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Callback cannot be deferred in non-deferred mode");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        java.lang.Throwable throwable0 = null;
        org.joo.promise4j.PromiseException promiseException1 = new org.joo.promise4j.PromiseException(throwable0);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise2 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException1);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise3 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException1);
        org.joo.promise4j.DeferredStatus deferredStatus4 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.getStatus();
        org.joo.promise4j.DoneCallback<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>> deferredStatusAsyncDeferredObjectDoneCallback5 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectPromise6 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.done(deferredStatusAsyncDeferredObjectDoneCallback5);
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectAlwaysCallback7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectPromise8 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.always(deferredStatusAsyncDeferredObjectAlwaysCallback7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassPromise2);
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusAsyncDeferredObjectPromise6);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable1 = null;
        org.joo.promise4j.PromiseException promiseException2 = new org.joo.promise4j.PromiseException(throwable1);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise3 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException2);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred4 = deferredStatusAsyncDeferredObject0.reject((java.lang.Exception) promiseException2);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise5 = deferredStatusAsyncDeferredObject0.promise();
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise6 = deferredStatusAsyncDeferredObject0.promise();
        org.junit.Assert.assertNotNull(wildcardClassPromise3);
        org.junit.Assert.assertNotNull(deferredStatusDeferred4);
        org.junit.Assert.assertNotNull(deferredStatusPromise5);
        org.junit.Assert.assertNotNull(deferredStatusPromise6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        org.joo.promise4j.Promise<java.lang.Iterable<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusIterablePromise0 = null;
        org.joo.promise4j.FilteredDoneCallback<java.lang.Iterable<org.joo.promise4j.DeferredStatus>, java.util.AbstractList<org.joo.promise4j.DeferredStatus>> deferredStatusIterableFilteredDoneCallback1 = null;
        org.joo.promise4j.FilteredFailureCallback<java.lang.Exception, org.joo.promise4j.PromiseException> exceptionFilteredFailureCallback2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.FilteredPromise<java.lang.Iterable<org.joo.promise4j.DeferredStatus>, java.lang.Exception, java.util.AbstractList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusIterableFilteredPromise3 = new org.joo.promise4j.impl.FilteredPromise<java.lang.Iterable<org.joo.promise4j.DeferredStatus>, java.lang.Exception, java.util.AbstractList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>(deferredStatusIterablePromise0, deferredStatusIterableFilteredDoneCallback1, exceptionFilteredFailureCallback2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred3 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) 10L);
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise4 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback5 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise6 = serializablePromise4.always(serializableAlwaysCallback5);
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializableDeferred3);
        org.junit.Assert.assertNotNull(serializablePromise4);
        org.junit.Assert.assertNotNull(serializablePromise6);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isPending();
        boolean boolean2 = deferredStatusListSyncDeferredObject0.isPending();
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise3 = deferredStatusListSyncDeferredObject0.promise();
        org.joo.promise4j.FailCallback<org.joo.promise4j.PromiseException> promiseExceptionFailCallback4 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise5 = deferredStatusListSyncDeferredObject0.fail(promiseExceptionFailCallback4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(deferredStatusListPromise3);
        org.junit.Assert.assertNotNull(deferredStatusListPromise5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred3 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) 10L);
        java.io.Serializable serializable4 = serializableCompletableDeferredObject0.get();
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback5 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise6 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback5);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback7 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise8 = serializablePromise6.done(serializableDoneCallback7);
        java.io.Serializable serializable9 = serializablePromise6.get();
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializableDeferred3);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + 10L + "'", serializable4, 10L);
        org.junit.Assert.assertNotNull(serializablePromise6);
        org.junit.Assert.assertNotNull(serializablePromise8);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + 10L + "'", serializable9, 10L);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.fail(throwableFailCallback4);
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback6 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.fail(throwableFailCallback6);
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNotNull(serializablePromise7);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        org.joo.promise4j.Promise[] promiseArray1 = new org.joo.promise4j.Promise[0];
        @SuppressWarnings("unchecked")
        org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[] deferredStatusCollectionPromiseArray2 = (org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1;
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise3 = org.joo.promise4j.impl.JoinedPromise.of((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise4 = new org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise5 = new org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>, java.lang.Throwable> deferredStatusAsyncDeferredObjectSimpleDonePromiseJoinedPromise6 = new org.joo.promise4j.impl.JoinedPromise<org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>, java.lang.Throwable>((org.joo.promise4j.Promise<org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>, java.lang.Throwable>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<java.lang.CharSequence, java.lang.Exception> charSequenceJoinedPromise7 = org.joo.promise4j.impl.JoinedPromise.from((org.joo.promise4j.Promise<java.lang.CharSequence, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.Promise<org.joo.promise4j.impl.JoinedResults<java.lang.Object>, java.lang.Throwable> objJoinedResultsPromise8 = org.joo.promise4j.Promise.all((org.joo.promise4j.Promise<java.lang.Object, java.lang.Throwable>[]) promiseArray1);
        org.junit.Assert.assertNotNull(promiseArray1);
        org.junit.Assert.assertNotNull(deferredStatusCollectionPromiseArray2);
        org.junit.Assert.assertNotNull(deferredStatusCollectionJoinedPromise3);
        org.junit.Assert.assertNotNull(charSequenceJoinedPromise7);
        org.junit.Assert.assertNotNull(objJoinedResultsPromise8);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable1 = null;
        org.joo.promise4j.PromiseException promiseException2 = new org.joo.promise4j.PromiseException(throwable1);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise3 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException2);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred4 = deferredStatusAsyncDeferredObject0.reject((java.lang.Exception) promiseException2);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise5 = deferredStatusAsyncDeferredObject0.promise();
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.DeferredStatus deferredStatus6 = deferredStatusAsyncDeferredObject0.get();
            org.junit.Assert.fail("Expected exception of type org.joo.promise4j.PromiseException; message: org.joo.promise4j.PromiseException");
        } catch (org.joo.promise4j.PromiseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassPromise3);
        org.junit.Assert.assertNotNull(deferredStatusDeferred4);
        org.junit.Assert.assertNotNull(deferredStatusPromise5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject2 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1);
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise4 = deferredStatusSimpleDeferredObject2.fail(throwableFailCallback3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Callback cannot be deferred in non-deferred mode");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.DeferredStatus deferredStatus1 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred2 = deferredStatusAsyncDeferredObject0.resolve(deferredStatus1);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise3 = deferredStatusAsyncDeferredObject0.promise();
        org.junit.Assert.assertTrue("'" + deferredStatus1 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus1.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred2);
        org.junit.Assert.assertNotNull(deferredStatusPromise3);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.lang.Throwable throwable0 = null;
        org.joo.promise4j.PromiseException promiseException1 = new org.joo.promise4j.PromiseException(throwable0);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise2 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException1);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise3 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException1);
        org.joo.promise4j.DeferredStatus deferredStatus4 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.getStatus();
        java.util.concurrent.TimeUnit timeUnit6 = null;
        java.util.function.Supplier<org.joo.promise4j.PromiseException> promiseExceptionSupplier7 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectPromise8 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.timeoutAfter((long) 100, timeUnit6, promiseExceptionSupplier7);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject11 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.get((-1L), timeUnit10);
            org.junit.Assert.fail("Expected exception of type org.joo.promise4j.PromiseException; message: org.joo.promise4j.PromiseException");
        } catch (org.joo.promise4j.PromiseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassPromise2);
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusAsyncDeferredObjectPromise8);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.lang.Throwable throwable0 = null;
        org.joo.promise4j.PromiseException promiseException1 = new org.joo.promise4j.PromiseException(throwable0);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise2 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException1);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise3 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException1);
        org.joo.promise4j.Promise<java.lang.Throwable, org.joo.promise4j.PromiseException> throwablePromise4 = org.joo.promise4j.Promise.of((java.lang.Throwable) promiseException1);
        org.joo.promise4j.PipeDoneCallback<java.lang.Throwable, java.lang.Throwable, org.joo.promise4j.PromiseException> throwablePipeDoneCallback5 = null;
        java.util.function.Predicate<java.lang.Throwable> throwablePredicate6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.ConditionalPipedPromise<java.lang.Throwable, org.joo.promise4j.PromiseException> throwableConditionalPipedPromise7 = new org.joo.promise4j.impl.ConditionalPipedPromise<java.lang.Throwable, org.joo.promise4j.PromiseException>(throwablePromise4, throwablePipeDoneCallback5, throwablePredicate6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassPromise2);
        org.junit.Assert.assertNotNull(throwablePromise4);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        org.joo.promise4j.Promise<java.lang.Iterable<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusIterablePromise0 = null;
        org.joo.promise4j.PipeAlwaysCallback<java.lang.Iterable<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>, java.lang.Exception, java.lang.Throwable> deferredStatusIterablePipeAlwaysCallback1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.PipedAlwaysPromise<java.lang.Iterable<org.joo.promise4j.DeferredStatus>, java.lang.Exception, org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>, java.lang.Throwable> deferredStatusIterablePipedAlwaysPromise2 = new org.joo.promise4j.impl.PipedAlwaysPromise<java.lang.Iterable<org.joo.promise4j.DeferredStatus>, java.lang.Exception, org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>, java.lang.Throwable>(deferredStatusIterablePromise0, deferredStatusIterablePipeAlwaysCallback1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject4 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializablePromise3.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject4);
        org.joo.promise4j.DeferredStatus deferredStatus6 = serializableCompletableDeferredObject4.getStatus();
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject7 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise8 = serializableCompletableDeferredObject7.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback9 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise10 = serializableCompletableDeferredObject7.done(serializableDoneCallback9);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback11 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise12 = serializableCompletableDeferredObject7.always(serializableAlwaysCallback11);
        java.lang.Throwable throwable13 = null;
        org.joo.promise4j.PromiseException promiseException14 = new org.joo.promise4j.PromiseException(throwable13);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise15 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException14);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise16 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException14);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred17 = serializableCompletableDeferredObject7.reject((java.lang.Throwable) promiseException14);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred18 = serializableCompletableDeferredObject4.reject((java.lang.Throwable) promiseException14);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred20 = serializableCompletableDeferredObject4.resolve((java.io.Serializable) (short) 1);
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNull(deferredStatus6);
        org.junit.Assert.assertNotNull(serializablePromise8);
        org.junit.Assert.assertNotNull(serializablePromise10);
        org.junit.Assert.assertNotNull(serializablePromise12);
        org.junit.Assert.assertNotNull(wildcardClassPromise15);
        org.junit.Assert.assertNotNull(serializableDeferred17);
        org.junit.Assert.assertNotNull(serializableDeferred18);
        org.junit.Assert.assertNotNull(serializableDeferred20);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        org.joo.promise4j.Promise[] promiseArray1 = new org.joo.promise4j.Promise[0];
        @SuppressWarnings("unchecked")
        org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[] deferredStatusCollectionPromiseArray2 = (org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1;
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise3 = org.joo.promise4j.impl.JoinedPromise.of((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise4 = new org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise5 = new org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<java.lang.Comparable<java.lang.String>, java.lang.Exception> strComparableJoinedPromise6 = org.joo.promise4j.impl.JoinedPromise.of((org.joo.promise4j.Promise<java.lang.Comparable<java.lang.String>, java.lang.Exception>[]) promiseArray1);
        org.junit.Assert.assertNotNull(promiseArray1);
        org.junit.Assert.assertNotNull(deferredStatusCollectionPromiseArray2);
        org.junit.Assert.assertNotNull(deferredStatusCollectionJoinedPromise3);
        org.junit.Assert.assertNotNull(strComparableJoinedPromise6);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        org.joo.promise4j.impl.AsyncDeferredObject<java.util.Spliterator<org.joo.promise4j.DeferredStatus>, java.lang.Throwable> deferredStatusSpliteratorAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<java.util.Spliterator<org.joo.promise4j.DeferredStatus>, java.lang.Throwable>();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAlwaysCallback1 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise2 = deferredStatusAsyncDeferredObject0.always(deferredStatusAlwaysCallback1);
        org.junit.Assert.assertNotNull(deferredStatusPromise2);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject4 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializablePromise3.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject4);
        org.joo.promise4j.DeferredStatus deferredStatus6 = serializableCompletableDeferredObject4.getStatus();
        java.util.concurrent.TimeUnit timeUnit8 = null;
        java.util.function.Supplier<java.lang.Throwable> throwableSupplier9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred10 = serializableCompletableDeferredObject4.withTimeout((long) 100, timeUnit8, throwableSupplier9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNull(deferredStatus6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.util.function.Supplier[] supplierArray1 = new java.util.function.Supplier[0];
        @SuppressWarnings("unchecked")
        java.util.function.Supplier<org.joo.promise4j.Promise<?, ?>>[] wildcardPromiseSupplierArray2 = (java.util.function.Supplier<org.joo.promise4j.Promise<?, ?>>[]) supplierArray1;
        org.joo.promise4j.Promise<java.lang.Comparable<java.lang.String>, java.lang.Exception> strComparablePromise3 = org.joo.promise4j.Promise.sequence((java.util.function.Supplier<org.joo.promise4j.Promise<?, ?>>[]) supplierArray1);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise4 = org.joo.promise4j.Promise.sequence((java.util.function.Supplier<org.joo.promise4j.Promise<?, ?>>[]) supplierArray1);
        org.junit.Assert.assertNotNull(supplierArray1);
        org.junit.Assert.assertNotNull(wildcardPromiseSupplierArray2);
        org.junit.Assert.assertNull(strComparablePromise3);
        org.junit.Assert.assertNull(deferredStatusPromise4);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        org.joo.promise4j.Promise[] promiseArray1 = new org.joo.promise4j.Promise[0];
        @SuppressWarnings("unchecked")
        org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[] deferredStatusCollectionPromiseArray2 = (org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1;
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise3 = org.joo.promise4j.impl.JoinedPromise.of((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.Promise<org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.Promise[]>, java.lang.Exception> promiseArrayJoinedResultsPromise4 = org.joo.promise4j.Promise.all((org.joo.promise4j.Promise<org.joo.promise4j.Promise[], java.lang.Exception>[]) promiseArray1);
        org.junit.Assert.assertNotNull(promiseArray1);
        org.junit.Assert.assertNotNull(deferredStatusCollectionPromiseArray2);
        org.junit.Assert.assertNotNull(deferredStatusCollectionJoinedPromise3);
        org.junit.Assert.assertNotNull(promiseArrayJoinedResultsPromise4);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise4 = deferredStatusSimpleDeferredObject3.promise();
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback5 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback6 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback7 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject8 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback5, throwableFailCallback6, deferredStatusAlwaysCallback7);
        org.joo.promise4j.DeferredStatus deferredStatus9 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred10 = deferredStatusSimpleDeferredObject8.resolve(deferredStatus9);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred11 = deferredStatusSimpleDeferredObject3.resolve(deferredStatus9);
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise13 = deferredStatusSimpleDeferredObject3.fail(throwableFailCallback12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Callback cannot be deferred in non-deferred mode");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deferredStatusPromise4);
        org.junit.Assert.assertTrue("'" + deferredStatus9 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus9.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred10);
        org.junit.Assert.assertNotNull(deferredStatusDeferred11);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        org.joo.promise4j.AlwaysCallback<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListAlwaysCallback1 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise2 = deferredStatusListSyncDeferredObject0.always(deferredStatusListAlwaysCallback1);
        org.joo.promise4j.DoneCallback<java.util.ArrayList<org.joo.promise4j.DeferredStatus>> deferredStatusListDoneCallback3 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise4 = deferredStatusListSyncDeferredObject0.done(deferredStatusListDoneCallback3);
        org.junit.Assert.assertNotNull(deferredStatusListPromise2);
        org.junit.Assert.assertNotNull(deferredStatusListPromise4);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isRejected();
        java.lang.Throwable throwable2 = null;
        org.joo.promise4j.PromiseException promiseException3 = new org.joo.promise4j.PromiseException(throwable2);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise4 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException3);
        java.lang.Throwable[] throwableArray5 = promiseException3.getSuppressed();
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred6 = deferredStatusListSyncDeferredObject0.reject(promiseException3);
        org.joo.promise4j.DeferredStatus deferredStatus7 = org.joo.promise4j.DeferredStatus.RESOLVED;
        org.joo.promise4j.DeferredStatus[] deferredStatusArray8 = new org.joo.promise4j.DeferredStatus[] { deferredStatus7 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList9 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList9, deferredStatusArray8);
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults11 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>((java.util.List<org.joo.promise4j.DeferredStatus>) deferredStatusList9);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred12 = deferredStatusListSyncDeferredObject0.resolve(deferredStatusList9);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject13 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable14 = null;
        org.joo.promise4j.PromiseException promiseException15 = new org.joo.promise4j.PromiseException(throwable14);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred16 = deferredStatusAsyncDeferredObject13.reject((java.lang.Exception) promiseException15);
        org.joo.promise4j.PromiseException promiseException17 = new org.joo.promise4j.PromiseException((java.lang.Throwable) promiseException15);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred18 = deferredStatusListSyncDeferredObject0.reject(promiseException15);
        org.joo.promise4j.FailCallback<org.joo.promise4j.PromiseException> promiseExceptionFailCallback19 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise20 = deferredStatusListSyncDeferredObject0.fail(promiseExceptionFailCallback19);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClassPromise4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred6);
        org.junit.Assert.assertTrue("'" + deferredStatus7 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus7.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred12);
        org.junit.Assert.assertNotNull(deferredStatusDeferred16);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred18);
        org.junit.Assert.assertNotNull(deferredStatusListPromise20);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise1 = deferredStatusAsyncDeferredObject0.promise();
        org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectSimpleDonePromise2 = new org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>(deferredStatusAsyncDeferredObject0);
        org.joo.promise4j.DeferredStatus deferredStatus3 = deferredStatusAsyncDeferredObjectSimpleDonePromise2.getStatus();
        org.joo.promise4j.DoneCallback<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>> deferredStatusAsyncDeferredObjectDoneCallback4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectPromise5 = deferredStatusAsyncDeferredObjectSimpleDonePromise2.done(deferredStatusAsyncDeferredObjectDoneCallback4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deferredStatusPromise1);
        org.junit.Assert.assertTrue("'" + deferredStatus3 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus3.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.DeferredStatus deferredStatus4 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred5 = deferredStatusSimpleDeferredObject3.resolve(deferredStatus4);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise6 = deferredStatusSimpleDeferredObject3.promise();
        java.util.concurrent.TimeUnit timeUnit8 = null;
        java.util.function.Supplier<java.lang.Throwable> throwableSupplier9 = null;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred10 = deferredStatusSimpleDeferredObject3.withTimeout(0L, timeUnit8, throwableSupplier9);
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred5);
        org.junit.Assert.assertNotNull(deferredStatusPromise6);
        org.junit.Assert.assertNotNull(deferredStatusDeferred10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback4);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback6 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback6);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback8 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise9 = serializablePromise7.done(serializableDoneCallback8);
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject10 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise11 = serializableCompletableDeferredObject10.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred13 = serializableCompletableDeferredObject10.resolve((java.io.Serializable) 10L);
        java.io.Serializable serializable14 = serializableCompletableDeferredObject10.get();
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject15 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise16 = serializableCompletableDeferredObject15.promise();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise17 = serializableCompletableDeferredObject10.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject15);
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise18 = serializablePromise9.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject15);
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback19 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise20 = serializableCompletableDeferredObject15.fail(throwableFailCallback19);
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback21 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise22 = serializableCompletableDeferredObject15.fail(throwableFailCallback21);
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNotNull(serializablePromise7);
        org.junit.Assert.assertNotNull(serializablePromise9);
        org.junit.Assert.assertNotNull(serializablePromise11);
        org.junit.Assert.assertNotNull(serializableDeferred13);
        org.junit.Assert.assertEquals("'" + serializable14 + "' != '" + 10L + "'", serializable14, 10L);
        org.junit.Assert.assertNotNull(serializablePromise16);
        org.junit.Assert.assertNotNull(serializablePromise17);
        org.junit.Assert.assertNotNull(serializablePromise18);
        org.junit.Assert.assertNotNull(serializablePromise20);
        org.junit.Assert.assertNotNull(serializablePromise22);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.DeferredStatus deferredStatus4 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred5 = deferredStatusSimpleDeferredObject3.resolve(deferredStatus4);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise6 = deferredStatusSimpleDeferredObject3.promise();
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject7 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable8 = null;
        org.joo.promise4j.PromiseException promiseException9 = new org.joo.promise4j.PromiseException(throwable8);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred10 = deferredStatusAsyncDeferredObject7.reject((java.lang.Exception) promiseException9);
        org.joo.promise4j.PromiseException promiseException11 = new org.joo.promise4j.PromiseException((java.lang.Throwable) promiseException9);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred12 = deferredStatusSimpleDeferredObject3.reject((java.lang.Throwable) promiseException11);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        java.util.function.Supplier<java.lang.Throwable> throwableSupplier15 = null;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred16 = deferredStatusSimpleDeferredObject3.withTimeout((long) (short) 1, timeUnit14, throwableSupplier15);
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred5);
        org.junit.Assert.assertNotNull(deferredStatusPromise6);
        org.junit.Assert.assertNotNull(deferredStatusDeferred10);
        org.junit.Assert.assertNotNull(deferredStatusDeferred12);
        org.junit.Assert.assertNotNull(deferredStatusDeferred16);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isRejected();
        org.joo.promise4j.AlwaysCallback<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListAlwaysCallback2 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise3 = deferredStatusListSyncDeferredObject0.always(deferredStatusListAlwaysCallback2);
        org.joo.promise4j.DeferredStatus deferredStatus4 = deferredStatusListSyncDeferredObject0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(deferredStatusListPromise3);
        org.junit.Assert.assertNull(deferredStatus4);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred5 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) 0);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback6 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.done(serializableDoneCallback6);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject8 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable9 = null;
        org.joo.promise4j.PromiseException promiseException10 = new org.joo.promise4j.PromiseException(throwable9);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred11 = deferredStatusAsyncDeferredObject8.reject((java.lang.Exception) promiseException10);
        org.joo.promise4j.PromiseException promiseException12 = new org.joo.promise4j.PromiseException((java.lang.Throwable) promiseException10);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred13 = serializableCompletableDeferredObject0.reject((java.lang.Throwable) promiseException12);
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializableDeferred5);
        org.junit.Assert.assertNotNull(serializablePromise7);
        org.junit.Assert.assertNotNull(deferredStatusDeferred11);
        org.junit.Assert.assertNotNull(serializableDeferred13);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        org.joo.promise4j.Promise[] promiseArray1 = new org.joo.promise4j.Promise[0];
        @SuppressWarnings("unchecked")
        org.joo.promise4j.Promise<org.joo.promise4j.PromiseException, org.joo.promise4j.PromiseException>[] promiseExceptionPromiseArray2 = (org.joo.promise4j.Promise<org.joo.promise4j.PromiseException, org.joo.promise4j.PromiseException>[]) promiseArray1;
        org.joo.promise4j.impl.JoinedPromise<org.joo.promise4j.PromiseException, org.joo.promise4j.PromiseException> promiseExceptionJoinedPromise3 = new org.joo.promise4j.impl.JoinedPromise<org.joo.promise4j.PromiseException, org.joo.promise4j.PromiseException>(promiseExceptionPromiseArray2);
        org.junit.Assert.assertNotNull(promiseArray1);
        org.junit.Assert.assertNotNull(promiseExceptionPromiseArray2);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        org.joo.promise4j.Deferred<java.lang.String, java.lang.Exception> strDeferred0 = null;
        org.joo.promise4j.Deferred[] deferredArray2 = new org.joo.promise4j.Deferred[1];
        @SuppressWarnings("unchecked")
        org.joo.promise4j.Deferred<java.lang.String, java.lang.Exception>[] strDeferredArray3 = (org.joo.promise4j.Deferred<java.lang.String, java.lang.Exception>[]) deferredArray2;
        strDeferredArray3[0] = strDeferred0;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.JoinedPromise<java.lang.String, java.lang.Exception> strJoinedPromise6 = org.joo.promise4j.impl.JoinedPromise.of(strDeferredArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deferredArray2);
        org.junit.Assert.assertNotNull(strDeferredArray3);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isRejected();
        boolean boolean2 = deferredStatusListSyncDeferredObject0.isPending();
        boolean boolean3 = deferredStatusListSyncDeferredObject0.isResolved();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isPending();
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject2 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.DeferredStatus deferredStatus3 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred4 = deferredStatusAsyncDeferredObject2.resolve(deferredStatus3);
        java.lang.Throwable throwable5 = null;
        org.joo.promise4j.PromiseException promiseException6 = new org.joo.promise4j.PromiseException(throwable5);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise7 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException6);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise8 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException6);
        org.joo.promise4j.DeferredStatus deferredStatus9 = deferredStatusAsyncDeferredObjectSimpleFailurePromise8.getStatus();
        org.joo.promise4j.DeferredStatus deferredStatus10 = org.joo.promise4j.DeferredStatus.RESOLVED;
        org.joo.promise4j.DeferredStatus deferredStatus11 = org.joo.promise4j.DeferredStatus.RESOLVED;
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject12 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise13 = deferredStatusAsyncDeferredObject12.promise();
        org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectSimpleDonePromise14 = new org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>(deferredStatusAsyncDeferredObject12);
        org.joo.promise4j.DeferredStatus deferredStatus15 = deferredStatusAsyncDeferredObjectSimpleDonePromise14.getStatus();
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject16 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.DeferredStatus deferredStatus17 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred18 = deferredStatusAsyncDeferredObject16.resolve(deferredStatus17);
        org.joo.promise4j.DeferredStatus deferredStatus19 = deferredStatusAsyncDeferredObject16.getStatus();
        org.joo.promise4j.DeferredStatus deferredStatus20 = org.joo.promise4j.DeferredStatus.RESOLVED;
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback21 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback22 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback23 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject24 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback21, throwableFailCallback22, deferredStatusAlwaysCallback23);
        org.joo.promise4j.DeferredStatus deferredStatus25 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred26 = deferredStatusSimpleDeferredObject24.resolve(deferredStatus25);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise27 = deferredStatusSimpleDeferredObject24.promise();
        org.joo.promise4j.DeferredStatus deferredStatus28 = deferredStatusSimpleDeferredObject24.getStatus();
        java.lang.Throwable throwable29 = null;
        org.joo.promise4j.PromiseException promiseException30 = new org.joo.promise4j.PromiseException(throwable29);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise31 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException30);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred32 = deferredStatusSimpleDeferredObject24.reject((java.lang.Throwable) promiseException30);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise33 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException30);
        org.joo.promise4j.DeferredStatus deferredStatus34 = deferredStatusAsyncDeferredObjectSimpleFailurePromise33.getStatus();
        java.lang.Throwable throwable35 = null;
        org.joo.promise4j.PromiseException promiseException36 = new org.joo.promise4j.PromiseException(throwable35);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise37 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException36);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise38 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException36);
        org.joo.promise4j.DeferredStatus deferredStatus39 = deferredStatusAsyncDeferredObjectSimpleFailurePromise38.getStatus();
        org.joo.promise4j.DoneCallback<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>> deferredStatusAsyncDeferredObjectDoneCallback40 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectPromise41 = deferredStatusAsyncDeferredObjectSimpleFailurePromise38.done(deferredStatusAsyncDeferredObjectDoneCallback40);
        org.joo.promise4j.DeferredStatus deferredStatus42 = deferredStatusAsyncDeferredObjectSimpleFailurePromise38.getStatus();
        org.joo.promise4j.DeferredStatus[] deferredStatusArray43 = new org.joo.promise4j.DeferredStatus[] { deferredStatus3, deferredStatus9, deferredStatus10, deferredStatus11, deferredStatus15, deferredStatus19, deferredStatus20, deferredStatus34, deferredStatus42 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList44 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList44, deferredStatusArray43);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred46 = deferredStatusListSyncDeferredObject0.resolve(deferredStatusList44);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + deferredStatus3 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus3.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred4);
        org.junit.Assert.assertNotNull(wildcardClassPromise7);
        org.junit.Assert.assertTrue("'" + deferredStatus9 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus9.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertTrue("'" + deferredStatus10 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus10.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertTrue("'" + deferredStatus11 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus11.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusPromise13);
        org.junit.Assert.assertTrue("'" + deferredStatus15 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus15.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertTrue("'" + deferredStatus17 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus17.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred18);
        org.junit.Assert.assertTrue("'" + deferredStatus19 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus19.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertTrue("'" + deferredStatus20 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus20.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertTrue("'" + deferredStatus25 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus25.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred26);
        org.junit.Assert.assertNotNull(deferredStatusPromise27);
        org.junit.Assert.assertTrue("'" + deferredStatus28 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus28.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(wildcardClassPromise31);
        org.junit.Assert.assertNotNull(deferredStatusDeferred32);
        org.junit.Assert.assertTrue("'" + deferredStatus34 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus34.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(wildcardClassPromise37);
        org.junit.Assert.assertTrue("'" + deferredStatus39 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus39.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusAsyncDeferredObjectPromise41);
        org.junit.Assert.assertTrue("'" + deferredStatus42 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus42.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred46);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        org.joo.promise4j.DeferredStatus deferredStatus0 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.DeferredStatus[] deferredStatusArray1 = new org.joo.promise4j.DeferredStatus[] { deferredStatus0 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList2 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList2, deferredStatusArray1);
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults4 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>((java.util.List<org.joo.promise4j.DeferredStatus>) deferredStatusList2);
        java.util.List<org.joo.promise4j.DeferredStatus> deferredStatusList5 = deferredStatusJoinedResults4.getResults();
        org.joo.promise4j.DeferredStatus deferredStatus7 = deferredStatusJoinedResults4.get(0);
        org.junit.Assert.assertTrue("'" + deferredStatus0 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus0.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(deferredStatusList5);
        org.junit.Assert.assertTrue("'" + deferredStatus7 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus7.equals(org.joo.promise4j.DeferredStatus.REJECTED));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.joo.promise4j.DeferredStatus deferredStatus0 = org.joo.promise4j.DeferredStatus.RESOLVED;
        org.joo.promise4j.DeferredStatus[] deferredStatusArray1 = new org.joo.promise4j.DeferredStatus[] { deferredStatus0 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList2 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList2, deferredStatusArray1);
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults4 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>((java.util.List<org.joo.promise4j.DeferredStatus>) deferredStatusList2);
        java.util.List<org.joo.promise4j.DeferredStatus> deferredStatusList5 = deferredStatusJoinedResults4.getResults();
        int int6 = deferredStatusJoinedResults4.size();
        org.junit.Assert.assertTrue("'" + deferredStatus0 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus0.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(deferredStatusList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise1 = deferredStatusAsyncDeferredObject0.promise();
        org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectSimpleDonePromise2 = new org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>(deferredStatusAsyncDeferredObject0);
        java.util.concurrent.TimeUnit timeUnit4 = null;
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject5 = deferredStatusAsyncDeferredObjectSimpleDonePromise2.get((-1L), timeUnit4);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        java.util.function.Supplier<java.lang.Exception> exceptionSupplier8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise9 = deferredStatusAsyncDeferredObject5.timeoutAfter((long) 3, timeUnit7, exceptionSupplier8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deferredStatusPromise1);
        org.junit.Assert.assertNotNull(deferredStatusAsyncDeferredObject5);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        org.joo.promise4j.Deferred<java.lang.reflect.Type, java.lang.Throwable> typeDeferred0 = null;
        org.joo.promise4j.Deferred[] deferredArray2 = new org.joo.promise4j.Deferred[1];
        @SuppressWarnings("unchecked")
        org.joo.promise4j.Deferred<java.lang.reflect.Type, java.lang.Throwable>[] typeDeferredArray3 = (org.joo.promise4j.Deferred<java.lang.reflect.Type, java.lang.Throwable>[]) deferredArray2;
        typeDeferredArray3[0] = typeDeferred0;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.JoinedPromise<java.lang.reflect.Type, java.lang.Throwable> typeJoinedPromise6 = org.joo.promise4j.impl.JoinedPromise.from(typeDeferredArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deferredArray2);
        org.junit.Assert.assertNotNull(typeDeferredArray3);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.DeferredStatus deferredStatus4 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred5 = deferredStatusSimpleDeferredObject3.resolve(deferredStatus4);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise6 = deferredStatusSimpleDeferredObject3.promise();
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise7 = deferredStatusSimpleDeferredObject3.promise();
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred5);
        org.junit.Assert.assertNotNull(deferredStatusPromise6);
        org.junit.Assert.assertNotNull(deferredStatusPromise7);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback4);
        java.lang.Throwable throwable6 = null;
        org.joo.promise4j.PromiseException promiseException7 = new org.joo.promise4j.PromiseException(throwable6);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise8 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException7);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise9 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException7);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred10 = serializableCompletableDeferredObject0.reject((java.lang.Throwable) promiseException7);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise11 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException7);
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNotNull(wildcardClassPromise8);
        org.junit.Assert.assertNotNull(serializableDeferred10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        org.joo.promise4j.Promise<org.joo.promise4j.PromiseException, org.joo.promise4j.PromiseException> promiseExceptionPromise0 = null;
        org.joo.promise4j.FilteredDoneCallback<org.joo.promise4j.PromiseException, java.util.AbstractList<org.joo.promise4j.DeferredStatus>> promiseExceptionFilteredDoneCallback1 = null;
        org.joo.promise4j.FilteredFailureCallback<org.joo.promise4j.PromiseException, java.lang.Exception> promiseExceptionFilteredFailureCallback2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.FilteredPromise<org.joo.promise4j.PromiseException, org.joo.promise4j.PromiseException, java.util.AbstractList<org.joo.promise4j.DeferredStatus>, java.lang.Exception> promiseExceptionFilteredPromise3 = new org.joo.promise4j.impl.FilteredPromise<org.joo.promise4j.PromiseException, org.joo.promise4j.PromiseException, java.util.AbstractList<org.joo.promise4j.DeferredStatus>, java.lang.Exception>(promiseExceptionPromise0, promiseExceptionFilteredDoneCallback1, promiseExceptionFilteredFailureCallback2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isRejected();
        boolean boolean2 = deferredStatusListSyncDeferredObject0.isPending();
        org.joo.promise4j.DeferredStatus deferredStatus3 = deferredStatusListSyncDeferredObject0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(deferredStatus3);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        org.joo.promise4j.DeferredStatus deferredStatus0 = org.joo.promise4j.DeferredStatus.RESOLVED;
        org.joo.promise4j.DeferredStatus[] deferredStatusArray1 = new org.joo.promise4j.DeferredStatus[] { deferredStatus0 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList2 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList2, deferredStatusArray1);
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults4 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>((java.util.List<org.joo.promise4j.DeferredStatus>) deferredStatusList2);
        java.util.List<org.joo.promise4j.DeferredStatus> deferredStatusList5 = deferredStatusJoinedResults4.getResults();
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.DeferredStatus deferredStatus7 = deferredStatusJoinedResults4.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + deferredStatus0 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus0.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(deferredStatusList5);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        org.joo.promise4j.DeferredStatus deferredStatus0 = org.joo.promise4j.DeferredStatus.RESOLVED;
        org.joo.promise4j.DeferredStatus[] deferredStatusArray1 = new org.joo.promise4j.DeferredStatus[] { deferredStatus0 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList2 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList2, deferredStatusArray1);
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults4 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>((java.util.List<org.joo.promise4j.DeferredStatus>) deferredStatusList2);
        int int5 = deferredStatusJoinedResults4.size();
        java.util.List<org.joo.promise4j.DeferredStatus> deferredStatusList6 = deferredStatusJoinedResults4.getResults();
        org.junit.Assert.assertTrue("'" + deferredStatus0 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus0.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(deferredStatusList6);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        org.joo.promise4j.DeferredStatus deferredStatus0 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.DeferredStatus[] deferredStatusArray1 = new org.joo.promise4j.DeferredStatus[] { deferredStatus0 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList2 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList2, deferredStatusArray1);
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults4 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>((java.util.List<org.joo.promise4j.DeferredStatus>) deferredStatusList2);
        int int5 = deferredStatusJoinedResults4.size();
        org.junit.Assert.assertTrue("'" + deferredStatus0 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus0.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred3 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) 10L);
        java.io.Serializable serializable4 = serializableCompletableDeferredObject0.get();
        java.util.function.Predicate<java.io.Serializable> serializablePredicate5 = null;
        org.joo.promise4j.PipeDoneCallback<java.io.Serializable, java.io.Serializable, java.lang.Throwable> serializablePipeDoneCallback6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.when(serializablePredicate5, serializablePipeDoneCallback6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializableDeferred3);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + 10L + "'", serializable4, 10L);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject4 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializablePromise3.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject4);
        org.joo.promise4j.DeferredStatus deferredStatus6 = serializableCompletableDeferredObject4.getStatus();
        java.util.function.Predicate<java.io.Serializable> serializablePredicate7 = null;
        org.joo.promise4j.PipeDoneCallback<java.io.Serializable, java.io.Serializable, java.lang.Throwable> serializablePipeDoneCallback8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise9 = serializableCompletableDeferredObject4.when(serializablePredicate7, serializablePipeDoneCallback8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNull(deferredStatus6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isPending();
        boolean boolean2 = deferredStatusListSyncDeferredObject0.isPending();
        org.joo.promise4j.FailCallback<org.joo.promise4j.PromiseException> promiseExceptionFailCallback3 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise4 = deferredStatusListSyncDeferredObject0.fail(promiseExceptionFailCallback3);
        boolean boolean5 = deferredStatusListSyncDeferredObject0.isRejected();
        boolean boolean6 = deferredStatusListSyncDeferredObject0.isRejected();
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList9 = deferredStatusListSyncDeferredObject0.get((long) (byte) -1, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(deferredStatusListPromise4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isPending();
        boolean boolean2 = deferredStatusListSyncDeferredObject0.isPending();
        org.joo.promise4j.FailCallback<org.joo.promise4j.PromiseException> promiseExceptionFailCallback3 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise4 = deferredStatusListSyncDeferredObject0.fail(promiseExceptionFailCallback3);
        boolean boolean5 = deferredStatusListSyncDeferredObject0.isRejected();
        boolean boolean6 = deferredStatusListSyncDeferredObject0.isRejected();
        org.joo.promise4j.FilteredDoneCallback<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, java.util.function.Supplier[]> deferredStatusListFilteredDoneCallback7 = null;
        org.joo.promise4j.FilteredFailureCallback<org.joo.promise4j.PromiseException, org.joo.promise4j.PromiseException> promiseExceptionFilteredFailureCallback8 = null;
        org.joo.promise4j.impl.FilteredPromise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException, java.util.function.Supplier[], org.joo.promise4j.PromiseException> deferredStatusListFilteredPromise9 = new org.joo.promise4j.impl.FilteredPromise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException, java.util.function.Supplier[], org.joo.promise4j.PromiseException>((org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>) deferredStatusListSyncDeferredObject0, deferredStatusListFilteredDoneCallback7, promiseExceptionFilteredFailureCallback8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(deferredStatusListPromise4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isRejected();
        org.joo.promise4j.AlwaysCallback<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListAlwaysCallback2 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise3 = deferredStatusListSyncDeferredObject0.always(deferredStatusListAlwaysCallback2);
        java.util.concurrent.TimeUnit timeUnit5 = null;
        java.util.function.Supplier<org.joo.promise4j.PromiseException> promiseExceptionSupplier6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred7 = deferredStatusListSyncDeferredObject0.withTimeout((long) (short) 100, timeUnit5, promiseExceptionSupplier6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(deferredStatusListPromise3);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        java.lang.Throwable throwable0 = null;
        org.joo.promise4j.PromiseException promiseException1 = new org.joo.promise4j.PromiseException(throwable0);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise2 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException1);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise3 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException1);
        org.joo.promise4j.Promise<java.lang.Throwable, org.joo.promise4j.PromiseException> throwablePromise4 = org.joo.promise4j.Promise.of((java.lang.Throwable) promiseException1);
        java.lang.String str5 = promiseException1.toString();
        org.junit.Assert.assertNotNull(wildcardClassPromise2);
        org.junit.Assert.assertNotNull(throwablePromise4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.joo.promise4j.PromiseException" + "'", str5, "org.joo.promise4j.PromiseException");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject4 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean5 = deferredStatusListSyncDeferredObject4.isRejected();
        java.lang.Throwable throwable6 = null;
        org.joo.promise4j.PromiseException promiseException7 = new org.joo.promise4j.PromiseException(throwable6);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise8 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException7);
        java.lang.Throwable[] throwableArray9 = promiseException7.getSuppressed();
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred10 = deferredStatusListSyncDeferredObject4.reject(promiseException7);
        org.joo.promise4j.DeferredStatus deferredStatus11 = org.joo.promise4j.DeferredStatus.RESOLVED;
        org.joo.promise4j.DeferredStatus[] deferredStatusArray12 = new org.joo.promise4j.DeferredStatus[] { deferredStatus11 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList13 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList13, deferredStatusArray12);
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults15 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>((java.util.List<org.joo.promise4j.DeferredStatus>) deferredStatusList13);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred16 = deferredStatusListSyncDeferredObject4.resolve(deferredStatusList13);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject17 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable18 = null;
        org.joo.promise4j.PromiseException promiseException19 = new org.joo.promise4j.PromiseException(throwable18);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred20 = deferredStatusAsyncDeferredObject17.reject((java.lang.Exception) promiseException19);
        org.joo.promise4j.PromiseException promiseException21 = new org.joo.promise4j.PromiseException((java.lang.Throwable) promiseException19);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred22 = deferredStatusListSyncDeferredObject4.reject(promiseException19);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred23 = deferredStatusSimpleDeferredObject3.reject((java.lang.Throwable) promiseException19);
        java.lang.String str24 = promiseException19.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClassPromise8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred10);
        org.junit.Assert.assertTrue("'" + deferredStatus11 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus11.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred16);
        org.junit.Assert.assertNotNull(deferredStatusDeferred20);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred22);
        org.junit.Assert.assertNotNull(deferredStatusDeferred23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.joo.promise4j.PromiseException" + "'", str24, "org.joo.promise4j.PromiseException");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        java.lang.Throwable throwable0 = null;
        org.joo.promise4j.PromiseException promiseException1 = new org.joo.promise4j.PromiseException(throwable0);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise2 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException1);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise3 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException1);
        org.joo.promise4j.DeferredStatus deferredStatus4 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.getStatus();
        java.util.concurrent.TimeUnit timeUnit6 = null;
        java.util.function.Supplier<org.joo.promise4j.PromiseException> promiseExceptionSupplier7 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectPromise8 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.timeoutAfter((long) 100, timeUnit6, promiseExceptionSupplier7);
        org.joo.promise4j.DeferredStatus deferredStatus9 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.getStatus();
        org.junit.Assert.assertNotNull(wildcardClassPromise2);
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusAsyncDeferredObjectPromise8);
        org.junit.Assert.assertTrue("'" + deferredStatus9 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus9.equals(org.joo.promise4j.DeferredStatus.REJECTED));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred3 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) 10L);
        java.io.Serializable serializable4 = serializableCompletableDeferredObject0.get();
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback5 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise6 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback5);
        java.util.concurrent.TimeUnit timeUnit8 = null;
        java.util.function.Supplier<java.lang.Throwable> throwableSupplier9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise10 = serializablePromise6.timeoutAfter((long) (short) 10, timeUnit8, throwableSupplier9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializableDeferred3);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + 10L + "'", serializable4, 10L);
        org.junit.Assert.assertNotNull(serializablePromise6);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        org.joo.promise4j.util.TimeoutScheduler timeoutScheduler0 = new org.joo.promise4j.util.TimeoutScheduler();
        java.lang.Class<?> wildcardClass1 = timeoutScheduler0.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[] { wildcardClass1 };
        java.util.ArrayList<java.lang.reflect.GenericDeclaration> genericDeclarationList3 = new java.util.ArrayList<java.lang.reflect.GenericDeclaration>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.GenericDeclaration>) genericDeclarationList3, genericDeclarationArray2);
        org.joo.promise4j.impl.JoinedResults<java.lang.reflect.GenericDeclaration> genericDeclarationJoinedResults5 = new org.joo.promise4j.impl.JoinedResults<java.lang.reflect.GenericDeclaration>((java.util.List<java.lang.reflect.GenericDeclaration>) genericDeclarationList3);
        java.lang.Class<?> wildcardClass6 = genericDeclarationList3.getClass();
        org.joo.promise4j.util.TimeoutScheduler timeoutScheduler7 = new org.joo.promise4j.util.TimeoutScheduler();
        java.lang.Class<?> wildcardClass8 = timeoutScheduler7.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray9 = new java.lang.reflect.GenericDeclaration[] { wildcardClass8 };
        java.util.ArrayList<java.lang.reflect.GenericDeclaration> genericDeclarationList10 = new java.util.ArrayList<java.lang.reflect.GenericDeclaration>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.GenericDeclaration>) genericDeclarationList10, genericDeclarationArray9);
        org.joo.promise4j.impl.JoinedResults<java.lang.reflect.GenericDeclaration> genericDeclarationJoinedResults12 = new org.joo.promise4j.impl.JoinedResults<java.lang.reflect.GenericDeclaration>((java.util.List<java.lang.reflect.GenericDeclaration>) genericDeclarationList10);
        java.lang.Class<?> wildcardClass13 = genericDeclarationList10.getClass();
        org.joo.promise4j.Promise<java.lang.Class<?>, org.joo.promise4j.PromiseException> wildcardClassPromise14 = org.joo.promise4j.Promise.of(wildcardClass13);
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject15 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise16 = serializableCompletableDeferredObject15.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback17 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise18 = serializableCompletableDeferredObject15.done(serializableDoneCallback17);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback19 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise20 = serializableCompletableDeferredObject15.always(serializableAlwaysCallback19);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback21 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise22 = serializableCompletableDeferredObject15.always(serializableAlwaysCallback21);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback23 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise24 = serializablePromise22.done(serializableDoneCallback23);
        java.lang.Class<?> wildcardClass25 = serializablePromise24.getClass();
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject26 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.DeferredStatus deferredStatus27 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred28 = deferredStatusAsyncDeferredObject26.resolve(deferredStatus27);
        java.lang.Class<?> wildcardClass29 = deferredStatusAsyncDeferredObject26.getClass();
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject30 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.DeferredStatus deferredStatus31 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred32 = deferredStatusAsyncDeferredObject30.resolve(deferredStatus31);
        java.lang.Class<?> wildcardClass33 = deferredStatusAsyncDeferredObject30.getClass();
        java.lang.reflect.Type[] typeArray34 = new java.lang.reflect.Type[] { wildcardClass6, wildcardClass13, wildcardClass25, wildcardClass29, wildcardClass33 };
        java.util.ArrayList<java.lang.reflect.Type> typeList35 = new java.util.ArrayList<java.lang.reflect.Type>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Type>) typeList35, typeArray34);
        org.joo.promise4j.impl.JoinedResults<java.lang.reflect.Type> typeJoinedResults37 = new org.joo.promise4j.impl.JoinedResults<java.lang.reflect.Type>((java.util.List<java.lang.reflect.Type>) typeList35);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(genericDeclarationArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClassPromise14);
        org.junit.Assert.assertNotNull(serializablePromise16);
        org.junit.Assert.assertNotNull(serializablePromise18);
        org.junit.Assert.assertNotNull(serializablePromise20);
        org.junit.Assert.assertNotNull(serializablePromise22);
        org.junit.Assert.assertNotNull(serializablePromise24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + deferredStatus27 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus27.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + deferredStatus31 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus31.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        java.lang.Throwable throwable0 = null;
        org.joo.promise4j.PromiseException promiseException1 = new org.joo.promise4j.PromiseException(throwable0);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise2 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException1);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise3 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException1);
        org.joo.promise4j.DeferredStatus deferredStatus4 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.getStatus();
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject7 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.get((long) 0, timeUnit6);
            org.junit.Assert.fail("Expected exception of type org.joo.promise4j.PromiseException; message: org.joo.promise4j.PromiseException");
        } catch (org.joo.promise4j.PromiseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassPromise2);
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred5 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) 0);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback6 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.done(serializableDoneCallback6);
        java.util.concurrent.TimeUnit timeUnit9 = null;
        java.util.function.Supplier<java.lang.Throwable> throwableSupplier10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise11 = serializableCompletableDeferredObject0.timeoutAfter((long) (byte) 100, timeUnit9, throwableSupplier10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializableDeferred5);
        org.junit.Assert.assertNotNull(serializablePromise7);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isPending();
        org.joo.promise4j.DoneCallback<java.util.ArrayList<org.joo.promise4j.DeferredStatus>> deferredStatusListDoneCallback2 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise3 = deferredStatusListSyncDeferredObject0.done(deferredStatusListDoneCallback2);
        boolean boolean4 = deferredStatusListSyncDeferredObject0.isRejected();
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise5 = deferredStatusListSyncDeferredObject0.promise();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(deferredStatusListPromise3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deferredStatusListPromise5);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred5 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) 0);
        java.lang.Throwable throwable6 = null;
        org.joo.promise4j.PromiseException promiseException7 = new org.joo.promise4j.PromiseException(throwable6);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise8 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException7);
        java.lang.Throwable[] throwableArray9 = promiseException7.getSuppressed();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred10 = serializableCompletableDeferredObject0.reject((java.lang.Throwable) promiseException7);
        java.util.concurrent.TimeUnit timeUnit12 = null;
        java.util.function.Supplier<java.lang.Throwable> throwableSupplier13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred14 = serializableCompletableDeferredObject0.withTimeout((long) (byte) 1, timeUnit12, throwableSupplier13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializableDeferred5);
        org.junit.Assert.assertNotNull(wildcardClassPromise8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(serializableDeferred10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred3 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) 10L);
        java.io.Serializable serializable4 = serializableCompletableDeferredObject0.get();
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback5 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise6 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback5);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject7 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable8 = null;
        org.joo.promise4j.PromiseException promiseException9 = new org.joo.promise4j.PromiseException(throwable8);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred10 = deferredStatusAsyncDeferredObject7.reject((java.lang.Exception) promiseException9);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject11 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable12 = null;
        org.joo.promise4j.PromiseException promiseException13 = new org.joo.promise4j.PromiseException(throwable12);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred14 = deferredStatusAsyncDeferredObject11.reject((java.lang.Exception) promiseException13);
        org.joo.promise4j.PromiseException promiseException15 = new org.joo.promise4j.PromiseException((java.lang.Throwable) promiseException13);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred16 = deferredStatusAsyncDeferredObject7.reject((java.lang.Exception) promiseException15);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred17 = serializableCompletableDeferredObject0.reject((java.lang.Throwable) promiseException15);
        java.util.concurrent.TimeUnit timeUnit19 = null;
        java.util.function.Supplier<java.lang.Throwable> throwableSupplier20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred21 = serializableCompletableDeferredObject0.withTimeout((long) (short) 100, timeUnit19, throwableSupplier20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializableDeferred3);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + 10L + "'", serializable4, 10L);
        org.junit.Assert.assertNotNull(serializablePromise6);
        org.junit.Assert.assertNotNull(deferredStatusDeferred10);
        org.junit.Assert.assertNotNull(deferredStatusDeferred14);
        org.junit.Assert.assertNotNull(deferredStatusDeferred16);
        org.junit.Assert.assertNotNull(serializableDeferred17);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.DeferredStatus deferredStatus4 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred5 = deferredStatusSimpleDeferredObject3.resolve(deferredStatus4);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise6 = deferredStatusSimpleDeferredObject3.promise();
        java.util.function.Predicate<org.joo.promise4j.DeferredStatus> deferredStatusPredicate7 = null;
        org.joo.promise4j.PipeDoneCallback<org.joo.promise4j.DeferredStatus, org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPipeDoneCallback8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise9 = deferredStatusSimpleDeferredObject3.when(deferredStatusPredicate7, deferredStatusPipeDoneCallback8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Callback cannot be deferred in non-deferred mode");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred5);
        org.junit.Assert.assertNotNull(deferredStatusPromise6);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable1 = null;
        org.joo.promise4j.PromiseException promiseException2 = new org.joo.promise4j.PromiseException(throwable1);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred3 = deferredStatusAsyncDeferredObject0.reject((java.lang.Exception) promiseException2);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject4 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable5 = null;
        org.joo.promise4j.PromiseException promiseException6 = new org.joo.promise4j.PromiseException(throwable5);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise7 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException6);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred8 = deferredStatusAsyncDeferredObject4.reject((java.lang.Exception) promiseException6);
        promiseException2.addSuppressed((java.lang.Throwable) promiseException6);
        java.lang.Throwable[] throwableArray10 = promiseException6.getSuppressed();
        org.junit.Assert.assertNotNull(deferredStatusDeferred3);
        org.junit.Assert.assertNotNull(wildcardClassPromise7);
        org.junit.Assert.assertNotNull(deferredStatusDeferred8);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback4);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback6 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback6);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback8 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise9 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback8);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject10 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable11 = null;
        org.joo.promise4j.PromiseException promiseException12 = new org.joo.promise4j.PromiseException(throwable11);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred13 = deferredStatusAsyncDeferredObject10.reject((java.lang.Exception) promiseException12);
        org.joo.promise4j.PromiseException promiseException14 = new org.joo.promise4j.PromiseException((java.lang.Throwable) promiseException12);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred15 = serializableCompletableDeferredObject0.reject((java.lang.Throwable) promiseException14);
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise16 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject17 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise18 = serializableCompletableDeferredObject17.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback19 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise20 = serializableCompletableDeferredObject17.done(serializableDoneCallback19);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback21 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise22 = serializableCompletableDeferredObject17.always(serializableAlwaysCallback21);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback23 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise24 = serializableCompletableDeferredObject17.always(serializableAlwaysCallback23);
        java.lang.Throwable throwable25 = null;
        org.joo.promise4j.PromiseException promiseException26 = new org.joo.promise4j.PromiseException(throwable25);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise27 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException26);
        java.lang.Throwable[] throwableArray28 = promiseException26.getSuppressed();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred29 = serializableCompletableDeferredObject17.reject((java.lang.Throwable) promiseException26);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred30 = serializableCompletableDeferredObject0.reject((java.lang.Throwable) promiseException26);
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNotNull(serializablePromise7);
        org.junit.Assert.assertNotNull(serializablePromise9);
        org.junit.Assert.assertNotNull(deferredStatusDeferred13);
        org.junit.Assert.assertNotNull(serializableDeferred15);
        org.junit.Assert.assertNotNull(serializablePromise16);
        org.junit.Assert.assertNotNull(serializablePromise18);
        org.junit.Assert.assertNotNull(serializablePromise20);
        org.junit.Assert.assertNotNull(serializablePromise22);
        org.junit.Assert.assertNotNull(serializablePromise24);
        org.junit.Assert.assertNotNull(wildcardClassPromise27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(serializableDeferred29);
        org.junit.Assert.assertNotNull(serializableDeferred30);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback4);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback6 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback6);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback8 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise9 = serializableCompletableDeferredObject0.done(serializableDoneCallback8);
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNotNull(serializablePromise7);
        org.junit.Assert.assertNotNull(serializablePromise9);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject4 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializablePromise3.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject4);
        org.joo.promise4j.DeferredStatus deferredStatus6 = serializableCompletableDeferredObject4.getStatus();
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject7 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise8 = serializableCompletableDeferredObject7.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback9 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise10 = serializableCompletableDeferredObject7.done(serializableDoneCallback9);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback11 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise12 = serializableCompletableDeferredObject7.always(serializableAlwaysCallback11);
        java.lang.Throwable throwable13 = null;
        org.joo.promise4j.PromiseException promiseException14 = new org.joo.promise4j.PromiseException(throwable13);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise15 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException14);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise16 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException14);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred17 = serializableCompletableDeferredObject7.reject((java.lang.Throwable) promiseException14);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred18 = serializableCompletableDeferredObject4.reject((java.lang.Throwable) promiseException14);
        org.joo.promise4j.Promise<java.util.Iterator<org.joo.promise4j.DeferredStatus>, java.lang.Throwable> deferredStatusItorPromise19 = org.joo.promise4j.Promise.ofCause((java.lang.Throwable) promiseException14);
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNull(deferredStatus6);
        org.junit.Assert.assertNotNull(serializablePromise8);
        org.junit.Assert.assertNotNull(serializablePromise10);
        org.junit.Assert.assertNotNull(serializablePromise12);
        org.junit.Assert.assertNotNull(wildcardClassPromise15);
        org.junit.Assert.assertNotNull(serializableDeferred17);
        org.junit.Assert.assertNotNull(serializableDeferred18);
        org.junit.Assert.assertNotNull(deferredStatusItorPromise19);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isPending();
        boolean boolean2 = deferredStatusListSyncDeferredObject0.isPending();
        org.joo.promise4j.FailCallback<org.joo.promise4j.PromiseException> promiseExceptionFailCallback3 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise4 = deferredStatusListSyncDeferredObject0.fail(promiseExceptionFailCallback3);
        boolean boolean5 = deferredStatusListSyncDeferredObject0.isRejected();
        org.joo.promise4j.AlwaysCallback<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListAlwaysCallback6 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise7 = deferredStatusListSyncDeferredObject0.always(deferredStatusListAlwaysCallback6);
        org.joo.promise4j.DoneCallback<java.util.ArrayList<org.joo.promise4j.DeferredStatus>> deferredStatusListDoneCallback8 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise9 = deferredStatusListSyncDeferredObject0.done(deferredStatusListDoneCallback8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(deferredStatusListPromise4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(deferredStatusListPromise7);
        org.junit.Assert.assertNotNull(deferredStatusListPromise9);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.DeferredStatus deferredStatus1 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred2 = deferredStatusAsyncDeferredObject0.resolve(deferredStatus1);
        org.joo.promise4j.DeferredStatus deferredStatus3 = deferredStatusAsyncDeferredObject0.getStatus();
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAlwaysCallback4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise5 = deferredStatusAsyncDeferredObject0.always(deferredStatusAlwaysCallback4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + deferredStatus1 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus1.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred2);
        org.junit.Assert.assertTrue("'" + deferredStatus3 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus3.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.Promise[]> promiseArrayDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Exception> exceptionFailCallback1 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.Promise[], java.lang.Exception> promiseArraySimpleDeferredObject2 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.Promise[], java.lang.Exception>(promiseArrayDoneCallback0, exceptionFailCallback1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isPending();
        boolean boolean2 = deferredStatusListSyncDeferredObject0.isPending();
        org.joo.promise4j.FailCallback<org.joo.promise4j.PromiseException> promiseExceptionFailCallback3 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise4 = deferredStatusListSyncDeferredObject0.fail(promiseExceptionFailCallback3);
        boolean boolean5 = deferredStatusListSyncDeferredObject0.isRejected();
        org.joo.promise4j.AlwaysCallback<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListAlwaysCallback6 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise7 = deferredStatusListSyncDeferredObject0.always(deferredStatusListAlwaysCallback6);
        boolean boolean8 = deferredStatusListSyncDeferredObject0.isPending();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(deferredStatusListPromise4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(deferredStatusListPromise7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        org.joo.promise4j.DeferredStatus deferredStatus0 = org.joo.promise4j.DeferredStatus.RESOLVED;
        org.joo.promise4j.DeferredStatus[] deferredStatusArray1 = new org.joo.promise4j.DeferredStatus[] { deferredStatus0 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList2 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList2, deferredStatusArray1);
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults4 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>((java.util.List<org.joo.promise4j.DeferredStatus>) deferredStatusList2);
        java.util.Spliterator<org.joo.promise4j.DeferredStatus> deferredStatusSpliterator5 = deferredStatusJoinedResults4.spliterator();
        java.util.Iterator<org.joo.promise4j.DeferredStatus> deferredStatusItor6 = deferredStatusJoinedResults4.iterator();
        java.util.Iterator<org.joo.promise4j.DeferredStatus> deferredStatusItor7 = deferredStatusJoinedResults4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.DeferredStatus deferredStatus9 = deferredStatusJoinedResults4.get(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + deferredStatus0 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus0.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(deferredStatusSpliterator5);
        org.junit.Assert.assertNotNull(deferredStatusItor6);
        org.junit.Assert.assertNotNull(deferredStatusItor7);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        org.joo.promise4j.Promise[] promiseArray1 = new org.joo.promise4j.Promise[0];
        @SuppressWarnings("unchecked")
        org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[] deferredStatusCollectionPromiseArray2 = (org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1;
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise3 = org.joo.promise4j.impl.JoinedPromise.of((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListJoinedPromise4 = new org.joo.promise4j.impl.JoinedPromise<java.util.AbstractList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>((org.joo.promise4j.Promise<java.util.AbstractList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>[]) promiseArray1);
        org.junit.Assert.assertNotNull(promiseArray1);
        org.junit.Assert.assertNotNull(deferredStatusCollectionPromiseArray2);
        org.junit.Assert.assertNotNull(deferredStatusCollectionJoinedPromise3);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isPending();
        boolean boolean2 = deferredStatusListSyncDeferredObject0.isPending();
        org.joo.promise4j.DoneCallback<java.util.ArrayList<org.joo.promise4j.DeferredStatus>> deferredStatusListDoneCallback3 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise4 = deferredStatusListSyncDeferredObject0.done(deferredStatusListDoneCallback3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(deferredStatusListPromise4);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject2 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise3 = deferredStatusSimpleDeferredObject2.promise();
        org.junit.Assert.assertNotNull(deferredStatusPromise3);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        org.joo.promise4j.DeferredStatus deferredStatus0 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.DeferredStatus[] deferredStatusArray1 = new org.joo.promise4j.DeferredStatus[] { deferredStatus0 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList2 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList2, deferredStatusArray1);
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults4 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>((java.util.List<org.joo.promise4j.DeferredStatus>) deferredStatusList2);
        java.util.Iterator<org.joo.promise4j.DeferredStatus> deferredStatusItor5 = deferredStatusJoinedResults4.iterator();
        org.junit.Assert.assertTrue("'" + deferredStatus0 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus0.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(deferredStatusItor5);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred3 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) 10L);
        java.io.Serializable serializable4 = serializableCompletableDeferredObject0.get();
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject5 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise6 = serializableCompletableDeferredObject5.promise();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject5);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback8 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise9 = serializableCompletableDeferredObject5.done(serializableDoneCallback8);
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback10 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise11 = serializableCompletableDeferredObject5.fail(throwableFailCallback10);
        org.joo.promise4j.DeferredStatus deferredStatus12 = serializablePromise11.getStatus();
        java.lang.Class<?> wildcardClass13 = deferredStatus12.getClass();
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializableDeferred3);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + 10L + "'", serializable4, 10L);
        org.junit.Assert.assertNotNull(serializablePromise6);
        org.junit.Assert.assertNotNull(serializablePromise7);
        org.junit.Assert.assertNotNull(serializablePromise9);
        org.junit.Assert.assertNotNull(serializablePromise11);
        org.junit.Assert.assertTrue("'" + deferredStatus12 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus12.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback4);
        java.lang.Throwable throwable6 = null;
        org.joo.promise4j.PromiseException promiseException7 = new org.joo.promise4j.PromiseException(throwable6);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise8 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException7);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise9 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException7);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred10 = serializableCompletableDeferredObject0.reject((java.lang.Throwable) promiseException7);
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise11 = serializableCompletableDeferredObject0.promise();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable12 = serializablePromise11.get();
            org.junit.Assert.fail("Expected exception of type org.joo.promise4j.PromiseException; message: org.joo.promise4j.PromiseException");
        } catch (org.joo.promise4j.PromiseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNotNull(wildcardClassPromise8);
        org.junit.Assert.assertNotNull(serializableDeferred10);
        org.junit.Assert.assertNotNull(serializablePromise11);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        org.joo.promise4j.DeferredStatus deferredStatus0 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.DeferredStatus[] deferredStatusArray1 = new org.joo.promise4j.DeferredStatus[] { deferredStatus0 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList2 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList2, deferredStatusArray1);
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults4 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>((java.util.List<org.joo.promise4j.DeferredStatus>) deferredStatusList2);
        java.util.List<org.joo.promise4j.DeferredStatus> deferredStatusList5 = deferredStatusJoinedResults4.getResults();
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults6 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>(deferredStatusList5);
        org.junit.Assert.assertTrue("'" + deferredStatus0 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus0.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(deferredStatusList5);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.DeferredStatus deferredStatus4 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred5 = deferredStatusSimpleDeferredObject3.resolve(deferredStatus4);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise6 = deferredStatusSimpleDeferredObject3.promise();
        org.joo.promise4j.DeferredStatus deferredStatus7 = deferredStatusSimpleDeferredObject3.getStatus();
        java.lang.Throwable throwable8 = null;
        org.joo.promise4j.PromiseException promiseException9 = new org.joo.promise4j.PromiseException(throwable8);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise10 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException9);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred11 = deferredStatusSimpleDeferredObject3.reject((java.lang.Throwable) promiseException9);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise12 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException9);
        org.joo.promise4j.DeferredStatus deferredStatus13 = deferredStatusAsyncDeferredObjectSimpleFailurePromise12.getStatus();
        org.joo.promise4j.DoneCallback<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>> deferredStatusAsyncDeferredObjectDoneCallback14 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectPromise15 = deferredStatusAsyncDeferredObjectSimpleFailurePromise12.done(deferredStatusAsyncDeferredObjectDoneCallback14);
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject16 = deferredStatusAsyncDeferredObjectSimpleFailurePromise12.get();
            org.junit.Assert.fail("Expected exception of type org.joo.promise4j.PromiseException; message: org.joo.promise4j.PromiseException");
        } catch (org.joo.promise4j.PromiseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred5);
        org.junit.Assert.assertNotNull(deferredStatusPromise6);
        org.junit.Assert.assertTrue("'" + deferredStatus7 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus7.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(wildcardClassPromise10);
        org.junit.Assert.assertNotNull(deferredStatusDeferred11);
        org.junit.Assert.assertTrue("'" + deferredStatus13 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus13.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusAsyncDeferredObjectPromise15);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        java.util.concurrent.CompletableFuture<org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>> deferredStatusAsyncDeferredObjectSimpleFailurePromiseCompletableFuture0 = null;
        org.joo.promise4j.impl.CompletableDeferredObject<org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>, java.lang.Exception> deferredStatusAsyncDeferredObjectSimpleFailurePromiseCompletableDeferredObject1 = new org.joo.promise4j.impl.CompletableDeferredObject<org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>, java.lang.Exception>(deferredStatusAsyncDeferredObjectSimpleFailurePromiseCompletableFuture0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        org.joo.promise4j.Promise[] promiseArray1 = new org.joo.promise4j.Promise[0];
        @SuppressWarnings("unchecked")
        org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[] deferredStatusCollectionPromiseArray2 = (org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1;
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise3 = org.joo.promise4j.impl.JoinedPromise.of((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise4 = new org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise5 = new org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise6 = new org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.junit.Assert.assertNotNull(promiseArray1);
        org.junit.Assert.assertNotNull(deferredStatusCollectionPromiseArray2);
        org.junit.Assert.assertNotNull(deferredStatusCollectionJoinedPromise3);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback4);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback6 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback6);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback8 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise9 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback8);
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback10 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback11 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback12 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject13 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback10, throwableFailCallback11, deferredStatusAlwaysCallback12);
        org.joo.promise4j.DeferredStatus deferredStatus14 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred15 = deferredStatusSimpleDeferredObject13.resolve(deferredStatus14);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise16 = deferredStatusSimpleDeferredObject13.promise();
        org.joo.promise4j.DeferredStatus deferredStatus17 = deferredStatusSimpleDeferredObject13.getStatus();
        java.lang.Throwable throwable18 = null;
        org.joo.promise4j.PromiseException promiseException19 = new org.joo.promise4j.PromiseException(throwable18);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise20 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException19);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred21 = deferredStatusSimpleDeferredObject13.reject((java.lang.Throwable) promiseException19);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred22 = serializableCompletableDeferredObject0.reject((java.lang.Throwable) promiseException19);
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNotNull(serializablePromise7);
        org.junit.Assert.assertNotNull(serializablePromise9);
        org.junit.Assert.assertTrue("'" + deferredStatus14 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus14.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred15);
        org.junit.Assert.assertNotNull(deferredStatusPromise16);
        org.junit.Assert.assertTrue("'" + deferredStatus17 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus17.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(wildcardClassPromise20);
        org.junit.Assert.assertNotNull(deferredStatusDeferred21);
        org.junit.Assert.assertNotNull(serializableDeferred22);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise1 = deferredStatusAsyncDeferredObject0.promise();
        org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectSimpleDonePromise2 = new org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>(deferredStatusAsyncDeferredObject0);
        org.joo.promise4j.FailCallback<java.lang.Exception> exceptionFailCallback3 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectPromise4 = deferredStatusAsyncDeferredObjectSimpleDonePromise2.fail(exceptionFailCallback3);
        org.joo.promise4j.DoneCallback<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>> deferredStatusAsyncDeferredObjectDoneCallback5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectPromise6 = deferredStatusAsyncDeferredObjectSimpleDonePromise2.done(deferredStatusAsyncDeferredObjectDoneCallback5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deferredStatusPromise1);
        org.junit.Assert.assertNotNull(deferredStatusAsyncDeferredObjectPromise4);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        org.joo.promise4j.Deferred<java.lang.Object, java.lang.Throwable>[] objDeferredArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.JoinedPromise<java.lang.Object, java.lang.Throwable> objJoinedPromise1 = org.joo.promise4j.impl.JoinedPromise.from(objDeferredArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred3 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) 10L);
        java.io.Serializable serializable4 = serializableCompletableDeferredObject0.get();
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject5 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise6 = serializableCompletableDeferredObject5.promise();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject5);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback8 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise9 = serializableCompletableDeferredObject5.done(serializableDoneCallback8);
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject10 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise11 = serializableCompletableDeferredObject10.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred13 = serializableCompletableDeferredObject10.resolve((java.io.Serializable) 10L);
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback14 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise15 = serializableCompletableDeferredObject10.fail(throwableFailCallback14);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback16 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise17 = serializableCompletableDeferredObject10.done(serializableDoneCallback16);
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise18 = serializableCompletableDeferredObject5.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject10);
        java.io.Serializable serializable19 = serializableCompletableDeferredObject5.get();
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializableDeferred3);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + 10L + "'", serializable4, 10L);
        org.junit.Assert.assertNotNull(serializablePromise6);
        org.junit.Assert.assertNotNull(serializablePromise7);
        org.junit.Assert.assertNotNull(serializablePromise9);
        org.junit.Assert.assertNotNull(serializablePromise11);
        org.junit.Assert.assertNotNull(serializableDeferred13);
        org.junit.Assert.assertNotNull(serializablePromise15);
        org.junit.Assert.assertNotNull(serializablePromise17);
        org.junit.Assert.assertNotNull(serializablePromise18);
        org.junit.Assert.assertEquals("'" + serializable19 + "' != '" + 10L + "'", serializable19, 10L);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        org.joo.promise4j.Promise[] promiseArray1 = new org.joo.promise4j.Promise[0];
        @SuppressWarnings("unchecked")
        org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[] deferredStatusCollectionPromiseArray2 = (org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1;
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise3 = org.joo.promise4j.impl.JoinedPromise.of((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise4 = new org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise5 = new org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<java.lang.reflect.GenericDeclaration, java.lang.Exception> genericDeclarationJoinedPromise6 = org.joo.promise4j.impl.JoinedPromise.of((org.joo.promise4j.Promise<java.lang.reflect.GenericDeclaration, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusListJoinedPromise7 = org.joo.promise4j.impl.JoinedPromise.of((org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.junit.Assert.assertNotNull(promiseArray1);
        org.junit.Assert.assertNotNull(deferredStatusCollectionPromiseArray2);
        org.junit.Assert.assertNotNull(deferredStatusCollectionJoinedPromise3);
        org.junit.Assert.assertNotNull(genericDeclarationJoinedPromise6);
        org.junit.Assert.assertNotNull(deferredStatusListJoinedPromise7);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred3 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) 10L);
        java.io.Serializable serializable4 = serializableCompletableDeferredObject0.get();
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject5 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise6 = serializableCompletableDeferredObject5.promise();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject5);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback8 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise9 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback8);
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializableDeferred3);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + 10L + "'", serializable4, 10L);
        org.junit.Assert.assertNotNull(serializablePromise6);
        org.junit.Assert.assertNotNull(serializablePromise7);
        org.junit.Assert.assertNotNull(serializablePromise9);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise2 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback3 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback4 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback5 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject6 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback3, throwableFailCallback4, deferredStatusAlwaysCallback5);
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject7 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean8 = deferredStatusListSyncDeferredObject7.isRejected();
        java.lang.Throwable throwable9 = null;
        org.joo.promise4j.PromiseException promiseException10 = new org.joo.promise4j.PromiseException(throwable9);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise11 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException10);
        java.lang.Throwable[] throwableArray12 = promiseException10.getSuppressed();
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred13 = deferredStatusListSyncDeferredObject7.reject(promiseException10);
        org.joo.promise4j.DeferredStatus deferredStatus14 = org.joo.promise4j.DeferredStatus.RESOLVED;
        org.joo.promise4j.DeferredStatus[] deferredStatusArray15 = new org.joo.promise4j.DeferredStatus[] { deferredStatus14 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList16 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList16, deferredStatusArray15);
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults18 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>((java.util.List<org.joo.promise4j.DeferredStatus>) deferredStatusList16);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred19 = deferredStatusListSyncDeferredObject7.resolve(deferredStatusList16);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject20 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable21 = null;
        org.joo.promise4j.PromiseException promiseException22 = new org.joo.promise4j.PromiseException(throwable21);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred23 = deferredStatusAsyncDeferredObject20.reject((java.lang.Exception) promiseException22);
        org.joo.promise4j.PromiseException promiseException24 = new org.joo.promise4j.PromiseException((java.lang.Throwable) promiseException22);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred25 = deferredStatusListSyncDeferredObject7.reject(promiseException22);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred26 = deferredStatusSimpleDeferredObject6.reject((java.lang.Throwable) promiseException22);
        boolean boolean27 = deferredStatusSimpleDeferredObject6.isPending();
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject28 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable29 = null;
        org.joo.promise4j.PromiseException promiseException30 = new org.joo.promise4j.PromiseException(throwable29);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred31 = deferredStatusAsyncDeferredObject28.reject((java.lang.Exception) promiseException30);
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback32 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback33 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback34 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject35 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback32, throwableFailCallback33, deferredStatusAlwaysCallback34);
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject36 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean37 = deferredStatusListSyncDeferredObject36.isRejected();
        java.lang.Throwable throwable38 = null;
        org.joo.promise4j.PromiseException promiseException39 = new org.joo.promise4j.PromiseException(throwable38);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise40 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException39);
        java.lang.Throwable[] throwableArray41 = promiseException39.getSuppressed();
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred42 = deferredStatusListSyncDeferredObject36.reject(promiseException39);
        org.joo.promise4j.DeferredStatus deferredStatus43 = org.joo.promise4j.DeferredStatus.RESOLVED;
        org.joo.promise4j.DeferredStatus[] deferredStatusArray44 = new org.joo.promise4j.DeferredStatus[] { deferredStatus43 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList45 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList45, deferredStatusArray44);
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults47 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>((java.util.List<org.joo.promise4j.DeferredStatus>) deferredStatusList45);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred48 = deferredStatusListSyncDeferredObject36.resolve(deferredStatusList45);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject49 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable50 = null;
        org.joo.promise4j.PromiseException promiseException51 = new org.joo.promise4j.PromiseException(throwable50);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred52 = deferredStatusAsyncDeferredObject49.reject((java.lang.Exception) promiseException51);
        org.joo.promise4j.PromiseException promiseException53 = new org.joo.promise4j.PromiseException((java.lang.Throwable) promiseException51);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred54 = deferredStatusListSyncDeferredObject36.reject(promiseException51);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred55 = deferredStatusSimpleDeferredObject35.reject((java.lang.Throwable) promiseException51);
        promiseException30.addSuppressed((java.lang.Throwable) promiseException51);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred57 = deferredStatusSimpleDeferredObject6.reject((java.lang.Throwable) promiseException30);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred58 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) promiseException30);
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClassPromise11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred13);
        org.junit.Assert.assertTrue("'" + deferredStatus14 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus14.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred19);
        org.junit.Assert.assertNotNull(deferredStatusDeferred23);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred25);
        org.junit.Assert.assertNotNull(deferredStatusDeferred26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(deferredStatusDeferred31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClassPromise40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred42);
        org.junit.Assert.assertTrue("'" + deferredStatus43 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus43.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred48);
        org.junit.Assert.assertNotNull(deferredStatusDeferred52);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred54);
        org.junit.Assert.assertNotNull(deferredStatusDeferred55);
        org.junit.Assert.assertNotNull(deferredStatusDeferred57);
        org.junit.Assert.assertNotNull(serializableDeferred58);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.DeferredStatus deferredStatus4 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred5 = deferredStatusSimpleDeferredObject3.resolve(deferredStatus4);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise6 = deferredStatusSimpleDeferredObject3.promise();
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise8 = deferredStatusSimpleDeferredObject3.fail(throwableFailCallback7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Callback cannot be deferred in non-deferred mode");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred5);
        org.junit.Assert.assertNotNull(deferredStatusPromise6);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isPending();
        org.joo.promise4j.DoneCallback<java.util.ArrayList<org.joo.promise4j.DeferredStatus>> deferredStatusListDoneCallback2 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise3 = deferredStatusListSyncDeferredObject0.done(deferredStatusListDoneCallback2);
        boolean boolean4 = deferredStatusListSyncDeferredObject0.isRejected();
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject5 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise6 = serializableCompletableDeferredObject5.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback7 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise8 = serializableCompletableDeferredObject5.done(serializableDoneCallback7);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback9 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise10 = serializableCompletableDeferredObject5.always(serializableAlwaysCallback9);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback11 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise12 = serializableCompletableDeferredObject5.always(serializableAlwaysCallback11);
        java.lang.Throwable throwable13 = null;
        org.joo.promise4j.PromiseException promiseException14 = new org.joo.promise4j.PromiseException(throwable13);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise15 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException14);
        java.lang.Throwable[] throwableArray16 = promiseException14.getSuppressed();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred17 = serializableCompletableDeferredObject5.reject((java.lang.Throwable) promiseException14);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject18 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable19 = null;
        org.joo.promise4j.PromiseException promiseException20 = new org.joo.promise4j.PromiseException(throwable19);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred21 = deferredStatusAsyncDeferredObject18.reject((java.lang.Exception) promiseException20);
        org.joo.promise4j.PromiseException promiseException22 = new org.joo.promise4j.PromiseException((java.lang.Throwable) promiseException20);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred23 = serializableCompletableDeferredObject5.reject((java.lang.Throwable) promiseException20);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred24 = deferredStatusListSyncDeferredObject0.reject(promiseException20);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(deferredStatusListPromise3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(serializablePromise6);
        org.junit.Assert.assertNotNull(serializablePromise8);
        org.junit.Assert.assertNotNull(serializablePromise10);
        org.junit.Assert.assertNotNull(serializablePromise12);
        org.junit.Assert.assertNotNull(wildcardClassPromise15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(serializableDeferred17);
        org.junit.Assert.assertNotNull(deferredStatusDeferred21);
        org.junit.Assert.assertNotNull(serializableDeferred23);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred24);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        org.joo.promise4j.DeferredStatus deferredStatus0 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.DeferredStatus[] deferredStatusArray1 = new org.joo.promise4j.DeferredStatus[] { deferredStatus0 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList2 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList2, deferredStatusArray1);
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults4 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>((java.util.List<org.joo.promise4j.DeferredStatus>) deferredStatusList2);
        java.util.Spliterator<org.joo.promise4j.DeferredStatus> deferredStatusSpliterator5 = deferredStatusList2.spliterator();
        java.util.Spliterator<org.joo.promise4j.DeferredStatus> deferredStatusSpliterator6 = deferredStatusList2.spliterator();
        org.junit.Assert.assertTrue("'" + deferredStatus0 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus0.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(deferredStatusSpliterator5);
        org.junit.Assert.assertNotNull(deferredStatusSpliterator6);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        org.joo.promise4j.DeferredStatus deferredStatus0 = org.joo.promise4j.DeferredStatus.RESOLVED;
        org.joo.promise4j.DeferredStatus[] deferredStatusArray1 = new org.joo.promise4j.DeferredStatus[] { deferredStatus0 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList2 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList2, deferredStatusArray1);
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults4 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>((java.util.List<org.joo.promise4j.DeferredStatus>) deferredStatusList2);
        java.util.List<org.joo.promise4j.DeferredStatus> deferredStatusList5 = deferredStatusJoinedResults4.getResults();
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.DeferredStatus deferredStatus7 = deferredStatusJoinedResults4.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + deferredStatus0 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus0.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(deferredStatusList5);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        org.joo.promise4j.impl.AsyncDeferredObject<java.lang.Comparable<java.lang.String>, java.lang.Exception> strComparableAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<java.lang.Comparable<java.lang.String>, java.lang.Exception>();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable1 = null;
        org.joo.promise4j.PromiseException promiseException2 = new org.joo.promise4j.PromiseException(throwable1);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise3 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException2);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise4 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException2);
        org.joo.promise4j.DeferredStatus deferredStatus5 = deferredStatusAsyncDeferredObjectSimpleFailurePromise4.getStatus();
        org.joo.promise4j.DoneCallback<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>> deferredStatusAsyncDeferredObjectDoneCallback6 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectPromise7 = deferredStatusAsyncDeferredObjectSimpleFailurePromise4.done(deferredStatusAsyncDeferredObjectDoneCallback6);
        org.joo.promise4j.DeferredStatus deferredStatus8 = deferredStatusAsyncDeferredObjectSimpleFailurePromise4.getStatus();
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred9 = deferredStatusAsyncDeferredObject0.resolve(deferredStatus8);
        org.joo.promise4j.DeferredStatus deferredStatus10 = null;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred11 = deferredStatusAsyncDeferredObject0.resolve(deferredStatus10);
        org.junit.Assert.assertNotNull(wildcardClassPromise3);
        org.junit.Assert.assertTrue("'" + deferredStatus5 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus5.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusAsyncDeferredObjectPromise7);
        org.junit.Assert.assertTrue("'" + deferredStatus8 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus8.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred9);
        org.junit.Assert.assertNotNull(deferredStatusDeferred11);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise1 = deferredStatusAsyncDeferredObject0.promise();
        org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectSimpleDonePromise2 = new org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>(deferredStatusAsyncDeferredObject0);
        org.joo.promise4j.DoneCallback<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>> deferredStatusAsyncDeferredObjectDoneCallback3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectPromise4 = deferredStatusAsyncDeferredObjectSimpleDonePromise2.done(deferredStatusAsyncDeferredObjectDoneCallback3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deferredStatusPromise1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.DeferredStatus deferredStatus1 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred2 = deferredStatusAsyncDeferredObject0.resolve(deferredStatus1);
        org.joo.promise4j.DeferredStatus deferredStatus3 = deferredStatusAsyncDeferredObject0.getStatus();
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise4 = deferredStatusAsyncDeferredObject0.promise();
        org.junit.Assert.assertTrue("'" + deferredStatus1 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus1.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred2);
        org.junit.Assert.assertTrue("'" + deferredStatus3 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus3.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusPromise4);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred3 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) 10L);
        java.io.Serializable serializable4 = serializableCompletableDeferredObject0.get();
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject5 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise6 = serializableCompletableDeferredObject5.promise();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject5);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback8 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise9 = serializableCompletableDeferredObject5.done(serializableDoneCallback8);
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback10 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise11 = serializableCompletableDeferredObject5.fail(throwableFailCallback10);
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise12 = serializableCompletableDeferredObject5.promise();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise13 = serializableCompletableDeferredObject5.promise();
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializableDeferred3);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + 10L + "'", serializable4, 10L);
        org.junit.Assert.assertNotNull(serializablePromise6);
        org.junit.Assert.assertNotNull(serializablePromise7);
        org.junit.Assert.assertNotNull(serializablePromise9);
        org.junit.Assert.assertNotNull(serializablePromise11);
        org.junit.Assert.assertNotNull(serializablePromise12);
        org.junit.Assert.assertNotNull(serializablePromise13);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback4);
        java.lang.Throwable throwable6 = null;
        org.joo.promise4j.PromiseException promiseException7 = new org.joo.promise4j.PromiseException(throwable6);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise8 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException7);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise9 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException7);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred10 = serializableCompletableDeferredObject0.reject((java.lang.Throwable) promiseException7);
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise11 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DeferredStatus deferredStatus12 = serializableCompletableDeferredObject0.getStatus();
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNotNull(wildcardClassPromise8);
        org.junit.Assert.assertNotNull(serializableDeferred10);
        org.junit.Assert.assertNotNull(serializablePromise11);
        org.junit.Assert.assertTrue("'" + deferredStatus12 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus12.equals(org.joo.promise4j.DeferredStatus.REJECTED));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback4);
        java.lang.Throwable throwable6 = null;
        org.joo.promise4j.PromiseException promiseException7 = new org.joo.promise4j.PromiseException(throwable6);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise8 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException7);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise9 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException7);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred10 = serializableCompletableDeferredObject0.reject((java.lang.Throwable) promiseException7);
        org.joo.promise4j.DeferredStatus deferredStatus11 = serializableCompletableDeferredObject0.getStatus();
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNotNull(wildcardClassPromise8);
        org.junit.Assert.assertNotNull(serializableDeferred10);
        org.junit.Assert.assertTrue("'" + deferredStatus11 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus11.equals(org.joo.promise4j.DeferredStatus.REJECTED));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        java.util.concurrent.TimeUnit timeUnit3 = null;
        java.util.function.Supplier<java.lang.Throwable> throwableSupplier4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred5 = serializableCompletableDeferredObject0.withTimeout((long) (byte) 1, timeUnit3, throwableSupplier4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject4 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializablePromise3.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject4);
        org.joo.promise4j.DeferredStatus deferredStatus6 = serializableCompletableDeferredObject4.getStatus();
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback7 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise8 = serializableCompletableDeferredObject4.fail(throwableFailCallback7);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        java.util.function.Supplier<java.lang.Throwable> throwableSupplier11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred12 = serializableCompletableDeferredObject4.withTimeout((long) 0, timeUnit10, throwableSupplier11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNull(deferredStatus6);
        org.junit.Assert.assertNotNull(serializablePromise8);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise1 = deferredStatusAsyncDeferredObject0.promise();
        org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectSimpleDonePromise2 = new org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>(deferredStatusAsyncDeferredObject0);
        java.util.concurrent.TimeUnit timeUnit4 = null;
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject5 = deferredStatusAsyncDeferredObjectSimpleDonePromise2.get((-1L), timeUnit4);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject6 = deferredStatusAsyncDeferredObjectSimpleDonePromise2.get();
        java.util.concurrent.TimeUnit timeUnit8 = null;
        java.util.function.Supplier<java.lang.Exception> exceptionSupplier9 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectPromise10 = deferredStatusAsyncDeferredObjectSimpleDonePromise2.timeoutAfter((long) 3, timeUnit8, exceptionSupplier9);
        org.junit.Assert.assertNotNull(deferredStatusPromise1);
        org.junit.Assert.assertNotNull(deferredStatusAsyncDeferredObject5);
        org.junit.Assert.assertNotNull(deferredStatusAsyncDeferredObject6);
        org.junit.Assert.assertNotNull(deferredStatusAsyncDeferredObjectPromise10);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.DeferredStatus deferredStatus4 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred5 = deferredStatusSimpleDeferredObject3.resolve(deferredStatus4);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise6 = deferredStatusSimpleDeferredObject3.promise();
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise8 = deferredStatusSimpleDeferredObject3.always(deferredStatusAlwaysCallback7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Callback cannot be deferred in non-deferred mode");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred5);
        org.junit.Assert.assertNotNull(deferredStatusPromise6);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred3 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) 10L);
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.fail(throwableFailCallback4);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback6 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.done(serializableDoneCallback6);
        org.joo.promise4j.DeferredStatus deferredStatus8 = serializableCompletableDeferredObject0.getStatus();
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializableDeferred3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNotNull(serializablePromise7);
        org.junit.Assert.assertTrue("'" + deferredStatus8 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus8.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred3 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) 10L);
        java.io.Serializable serializable4 = serializableCompletableDeferredObject0.get();
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject5 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable6 = null;
        org.joo.promise4j.PromiseException promiseException7 = new org.joo.promise4j.PromiseException(throwable6);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred8 = deferredStatusAsyncDeferredObject5.reject((java.lang.Exception) promiseException7);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject9 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable10 = null;
        org.joo.promise4j.PromiseException promiseException11 = new org.joo.promise4j.PromiseException(throwable10);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise12 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException11);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred13 = deferredStatusAsyncDeferredObject9.reject((java.lang.Exception) promiseException11);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred14 = deferredStatusAsyncDeferredObject5.reject((java.lang.Exception) promiseException11);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred15 = serializableCompletableDeferredObject0.reject((java.lang.Throwable) promiseException11);
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializableDeferred3);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + 10L + "'", serializable4, 10L);
        org.junit.Assert.assertNotNull(deferredStatusDeferred8);
        org.junit.Assert.assertNotNull(wildcardClassPromise12);
        org.junit.Assert.assertNotNull(deferredStatusDeferred13);
        org.junit.Assert.assertNotNull(deferredStatusDeferred14);
        org.junit.Assert.assertNotNull(serializableDeferred15);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable1 = null;
        org.joo.promise4j.PromiseException promiseException2 = new org.joo.promise4j.PromiseException(throwable1);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred3 = deferredStatusAsyncDeferredObject0.reject((java.lang.Exception) promiseException2);
        org.joo.promise4j.FailCallback<java.lang.Exception> exceptionFailCallback4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise5 = deferredStatusAsyncDeferredObject0.fail(exceptionFailCallback4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deferredStatusDeferred3);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        org.joo.promise4j.Promise[] promiseArray1 = new org.joo.promise4j.Promise[0];
        @SuppressWarnings("unchecked")
        org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[] deferredStatusCollectionPromiseArray2 = (org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1;
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise3 = org.joo.promise4j.impl.JoinedPromise.of((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise4 = new org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise5 = new org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<java.io.Serializable, java.lang.Throwable> serializableJoinedPromise6 = org.joo.promise4j.impl.JoinedPromise.of((org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<java.lang.Throwable[], java.lang.Throwable> throwableArrayJoinedPromise7 = org.joo.promise4j.impl.JoinedPromise.from((org.joo.promise4j.Promise<java.lang.Throwable[], java.lang.Throwable>[]) promiseArray1);
        org.junit.Assert.assertNotNull(promiseArray1);
        org.junit.Assert.assertNotNull(deferredStatusCollectionPromiseArray2);
        org.junit.Assert.assertNotNull(deferredStatusCollectionJoinedPromise3);
        org.junit.Assert.assertNotNull(serializableJoinedPromise6);
        org.junit.Assert.assertNotNull(throwableArrayJoinedPromise7);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isPending();
        org.joo.promise4j.DeferredStatus deferredStatus2 = deferredStatusListSyncDeferredObject0.getStatus();
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise3 = deferredStatusListSyncDeferredObject0.promise();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(deferredStatus2);
        org.junit.Assert.assertNotNull(deferredStatusListPromise3);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred3 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) 10L);
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.fail(throwableFailCallback4);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback6 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.done(serializableDoneCallback6);
        java.io.Serializable serializable8 = serializableCompletableDeferredObject0.get();
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializableDeferred3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNotNull(serializablePromise7);
        org.junit.Assert.assertEquals("'" + serializable8 + "' != '" + 10L + "'", serializable8, 10L);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject4 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean5 = deferredStatusListSyncDeferredObject4.isRejected();
        java.lang.Throwable throwable6 = null;
        org.joo.promise4j.PromiseException promiseException7 = new org.joo.promise4j.PromiseException(throwable6);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise8 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException7);
        java.lang.Throwable[] throwableArray9 = promiseException7.getSuppressed();
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred10 = deferredStatusListSyncDeferredObject4.reject(promiseException7);
        org.joo.promise4j.DeferredStatus deferredStatus11 = org.joo.promise4j.DeferredStatus.RESOLVED;
        org.joo.promise4j.DeferredStatus[] deferredStatusArray12 = new org.joo.promise4j.DeferredStatus[] { deferredStatus11 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList13 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList13, deferredStatusArray12);
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults15 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>((java.util.List<org.joo.promise4j.DeferredStatus>) deferredStatusList13);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred16 = deferredStatusListSyncDeferredObject4.resolve(deferredStatusList13);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject17 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable18 = null;
        org.joo.promise4j.PromiseException promiseException19 = new org.joo.promise4j.PromiseException(throwable18);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred20 = deferredStatusAsyncDeferredObject17.reject((java.lang.Exception) promiseException19);
        org.joo.promise4j.PromiseException promiseException21 = new org.joo.promise4j.PromiseException((java.lang.Throwable) promiseException19);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred22 = deferredStatusListSyncDeferredObject4.reject(promiseException19);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred23 = deferredStatusSimpleDeferredObject3.reject((java.lang.Throwable) promiseException19);
        boolean boolean24 = deferredStatusSimpleDeferredObject3.isPending();
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject25 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable26 = null;
        org.joo.promise4j.PromiseException promiseException27 = new org.joo.promise4j.PromiseException(throwable26);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred28 = deferredStatusAsyncDeferredObject25.reject((java.lang.Exception) promiseException27);
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback29 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback30 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback31 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject32 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback29, throwableFailCallback30, deferredStatusAlwaysCallback31);
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject33 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean34 = deferredStatusListSyncDeferredObject33.isRejected();
        java.lang.Throwable throwable35 = null;
        org.joo.promise4j.PromiseException promiseException36 = new org.joo.promise4j.PromiseException(throwable35);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise37 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException36);
        java.lang.Throwable[] throwableArray38 = promiseException36.getSuppressed();
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred39 = deferredStatusListSyncDeferredObject33.reject(promiseException36);
        org.joo.promise4j.DeferredStatus deferredStatus40 = org.joo.promise4j.DeferredStatus.RESOLVED;
        org.joo.promise4j.DeferredStatus[] deferredStatusArray41 = new org.joo.promise4j.DeferredStatus[] { deferredStatus40 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList42 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList42, deferredStatusArray41);
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults44 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>((java.util.List<org.joo.promise4j.DeferredStatus>) deferredStatusList42);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred45 = deferredStatusListSyncDeferredObject33.resolve(deferredStatusList42);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject46 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable47 = null;
        org.joo.promise4j.PromiseException promiseException48 = new org.joo.promise4j.PromiseException(throwable47);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred49 = deferredStatusAsyncDeferredObject46.reject((java.lang.Exception) promiseException48);
        org.joo.promise4j.PromiseException promiseException50 = new org.joo.promise4j.PromiseException((java.lang.Throwable) promiseException48);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred51 = deferredStatusListSyncDeferredObject33.reject(promiseException48);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred52 = deferredStatusSimpleDeferredObject32.reject((java.lang.Throwable) promiseException48);
        promiseException27.addSuppressed((java.lang.Throwable) promiseException48);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred54 = deferredStatusSimpleDeferredObject3.reject((java.lang.Throwable) promiseException27);
        java.util.concurrent.TimeUnit timeUnit56 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.DeferredStatus deferredStatus57 = deferredStatusSimpleDeferredObject3.get(1L, timeUnit56);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Callback cannot be deferred in non-deferred mode");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClassPromise8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred10);
        org.junit.Assert.assertTrue("'" + deferredStatus11 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus11.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred16);
        org.junit.Assert.assertNotNull(deferredStatusDeferred20);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred22);
        org.junit.Assert.assertNotNull(deferredStatusDeferred23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(deferredStatusDeferred28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClassPromise37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred39);
        org.junit.Assert.assertTrue("'" + deferredStatus40 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus40.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred45);
        org.junit.Assert.assertNotNull(deferredStatusDeferred49);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred51);
        org.junit.Assert.assertNotNull(deferredStatusDeferred52);
        org.junit.Assert.assertNotNull(deferredStatusDeferred54);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred3 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) 10L);
        java.io.Serializable serializable4 = serializableCompletableDeferredObject0.get();
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject5 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise6 = serializableCompletableDeferredObject5.promise();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject5);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback8 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise9 = serializableCompletableDeferredObject5.done(serializableDoneCallback8);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject10 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable11 = null;
        org.joo.promise4j.PromiseException promiseException12 = new org.joo.promise4j.PromiseException(throwable11);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise13 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException12);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred14 = deferredStatusAsyncDeferredObject10.reject((java.lang.Exception) promiseException12);
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback15 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback16 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback17 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject18 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback15, throwableFailCallback16, deferredStatusAlwaysCallback17);
        org.joo.promise4j.DeferredStatus deferredStatus19 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred20 = deferredStatusSimpleDeferredObject18.resolve(deferredStatus19);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise21 = deferredStatusSimpleDeferredObject18.promise();
        org.joo.promise4j.DeferredStatus deferredStatus22 = deferredStatusSimpleDeferredObject18.getStatus();
        java.lang.Throwable throwable23 = null;
        org.joo.promise4j.PromiseException promiseException24 = new org.joo.promise4j.PromiseException(throwable23);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise25 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException24);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred26 = deferredStatusSimpleDeferredObject18.reject((java.lang.Throwable) promiseException24);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise27 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException24);
        promiseException12.addSuppressed((java.lang.Throwable) promiseException24);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred29 = serializableCompletableDeferredObject5.reject((java.lang.Throwable) promiseException24);
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializableDeferred3);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + 10L + "'", serializable4, 10L);
        org.junit.Assert.assertNotNull(serializablePromise6);
        org.junit.Assert.assertNotNull(serializablePromise7);
        org.junit.Assert.assertNotNull(serializablePromise9);
        org.junit.Assert.assertNotNull(wildcardClassPromise13);
        org.junit.Assert.assertNotNull(deferredStatusDeferred14);
        org.junit.Assert.assertTrue("'" + deferredStatus19 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus19.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred20);
        org.junit.Assert.assertNotNull(deferredStatusPromise21);
        org.junit.Assert.assertTrue("'" + deferredStatus22 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus22.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(wildcardClassPromise25);
        org.junit.Assert.assertNotNull(deferredStatusDeferred26);
        org.junit.Assert.assertNotNull(serializableDeferred29);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise1 = deferredStatusAsyncDeferredObject0.promise();
        org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectSimpleDonePromise2 = new org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>(deferredStatusAsyncDeferredObject0);
        java.util.concurrent.TimeUnit timeUnit4 = null;
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject5 = deferredStatusAsyncDeferredObjectSimpleDonePromise2.get((-1L), timeUnit4);
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectAlwaysCallback6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectPromise7 = deferredStatusAsyncDeferredObjectSimpleDonePromise2.always(deferredStatusAsyncDeferredObjectAlwaysCallback6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deferredStatusPromise1);
        org.junit.Assert.assertNotNull(deferredStatusAsyncDeferredObject5);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable1 = null;
        org.joo.promise4j.PromiseException promiseException2 = new org.joo.promise4j.PromiseException(throwable1);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise3 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException2);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred4 = deferredStatusAsyncDeferredObject0.reject((java.lang.Exception) promiseException2);
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.DeferredStatus deferredStatus5 = deferredStatusAsyncDeferredObject0.get();
            org.junit.Assert.fail("Expected exception of type org.joo.promise4j.PromiseException; message: org.joo.promise4j.PromiseException");
        } catch (org.joo.promise4j.PromiseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassPromise3);
        org.junit.Assert.assertNotNull(deferredStatusDeferred4);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isPending();
        boolean boolean2 = deferredStatusListSyncDeferredObject0.isRejected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.fail(throwableFailCallback4);
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject6 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject6.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred9 = serializableCompletableDeferredObject6.resolve((java.io.Serializable) 10L);
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise10 = serializableCompletableDeferredObject6.promise();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise11 = serializablePromise5.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject6);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        java.util.function.Supplier<java.lang.Throwable> throwableSupplier14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise15 = serializableCompletableDeferredObject6.timeoutAfter(100L, timeUnit13, throwableSupplier14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNotNull(serializablePromise7);
        org.junit.Assert.assertNotNull(serializableDeferred9);
        org.junit.Assert.assertNotNull(serializablePromise10);
        org.junit.Assert.assertNotNull(serializablePromise11);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.DeferredStatus deferredStatus4 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred5 = deferredStatusSimpleDeferredObject3.resolve(deferredStatus4);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise6 = deferredStatusSimpleDeferredObject3.promise();
        org.joo.promise4j.DeferredStatus deferredStatus7 = deferredStatusSimpleDeferredObject3.getStatus();
        java.lang.Throwable throwable8 = null;
        org.joo.promise4j.PromiseException promiseException9 = new org.joo.promise4j.PromiseException(throwable8);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise10 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException9);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred11 = deferredStatusSimpleDeferredObject3.reject((java.lang.Throwable) promiseException9);
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject12 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean13 = deferredStatusListSyncDeferredObject12.isRejected();
        org.joo.promise4j.AlwaysCallback<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListAlwaysCallback14 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise15 = deferredStatusListSyncDeferredObject12.always(deferredStatusListAlwaysCallback14);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject16 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable17 = null;
        org.joo.promise4j.PromiseException promiseException18 = new org.joo.promise4j.PromiseException(throwable17);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise19 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException18);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred20 = deferredStatusAsyncDeferredObject16.reject((java.lang.Exception) promiseException18);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred21 = deferredStatusListSyncDeferredObject12.reject(promiseException18);
        java.lang.Throwable[] throwableArray22 = promiseException18.getSuppressed();
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred23 = deferredStatusSimpleDeferredObject3.reject((java.lang.Throwable) promiseException18);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise24 = deferredStatusSimpleDeferredObject3.promise();
        java.util.function.Predicate<org.joo.promise4j.DeferredStatus> deferredStatusPredicate25 = null;
        org.joo.promise4j.PipeDoneCallback<org.joo.promise4j.DeferredStatus, org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPipeDoneCallback26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise27 = deferredStatusSimpleDeferredObject3.when(deferredStatusPredicate25, deferredStatusPipeDoneCallback26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Callback cannot be deferred in non-deferred mode");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred5);
        org.junit.Assert.assertNotNull(deferredStatusPromise6);
        org.junit.Assert.assertTrue("'" + deferredStatus7 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus7.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(wildcardClassPromise10);
        org.junit.Assert.assertNotNull(deferredStatusDeferred11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(deferredStatusListPromise15);
        org.junit.Assert.assertNotNull(wildcardClassPromise19);
        org.junit.Assert.assertNotNull(deferredStatusDeferred20);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(deferredStatusDeferred23);
        org.junit.Assert.assertNotNull(deferredStatusPromise24);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        org.joo.promise4j.Promise[] promiseArray1 = new org.joo.promise4j.Promise[0];
        @SuppressWarnings("unchecked")
        org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[] deferredStatusCollectionPromiseArray2 = (org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1;
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise3 = org.joo.promise4j.impl.JoinedPromise.of((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise4 = new org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusCollectionJoinedPromise5 = new org.joo.promise4j.impl.JoinedPromise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>((org.joo.promise4j.Promise<java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Exception>[]) promiseArray1);
        org.joo.promise4j.impl.JoinedPromise<org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>, java.lang.Throwable> deferredStatusAsyncDeferredObjectSimpleDonePromiseJoinedPromise6 = new org.joo.promise4j.impl.JoinedPromise<org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>, java.lang.Throwable>((org.joo.promise4j.Promise<org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>, java.lang.Throwable>[]) promiseArray1);
        org.joo.promise4j.Promise<org.joo.promise4j.impl.JoinedResults<java.util.AbstractList<org.joo.promise4j.DeferredStatus>>, org.joo.promise4j.PromiseException> deferredStatusListJoinedResultsPromise7 = org.joo.promise4j.Promise.all((org.joo.promise4j.Promise<java.util.AbstractList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>[]) promiseArray1);
        org.junit.Assert.assertNotNull(promiseArray1);
        org.junit.Assert.assertNotNull(deferredStatusCollectionPromiseArray2);
        org.junit.Assert.assertNotNull(deferredStatusCollectionJoinedPromise3);
        org.junit.Assert.assertNotNull(deferredStatusListJoinedResultsPromise7);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise2 = serializableCompletableDeferredObject0.promise();
        java.util.concurrent.TimeUnit timeUnit4 = null;
        java.util.function.Supplier<java.lang.Throwable> throwableSupplier5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred6 = serializableCompletableDeferredObject0.withTimeout((long) '4', timeUnit4, throwableSupplier5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise2);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isRejected();
        org.joo.promise4j.AlwaysCallback<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListAlwaysCallback2 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise3 = deferredStatusListSyncDeferredObject0.always(deferredStatusListAlwaysCallback2);
        boolean boolean4 = deferredStatusListSyncDeferredObject0.isResolved();
        org.joo.promise4j.DoneCallback<java.util.ArrayList<org.joo.promise4j.DeferredStatus>> deferredStatusListDoneCallback5 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise6 = deferredStatusListSyncDeferredObject0.done(deferredStatusListDoneCallback5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(deferredStatusListPromise3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deferredStatusListPromise6);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.Promise[]> promiseArrayDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Exception> exceptionFailCallback1 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.Promise[], java.lang.Exception> promiseArraySimpleDeferredObject2 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.Promise[], java.lang.Exception>(promiseArrayDoneCallback0, exceptionFailCallback1);
        org.joo.promise4j.DoneCallback<org.joo.promise4j.Promise[]> promiseArrayDoneCallback3 = null;
        org.joo.promise4j.FailCallback<java.lang.Exception> exceptionFailCallback4 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.Promise[], java.lang.Exception> promiseArraySimpleDeferredObject5 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.Promise[], java.lang.Exception>(promiseArrayDoneCallback3, exceptionFailCallback4);
        org.joo.promise4j.DoneCallback<org.joo.promise4j.Promise[]> promiseArrayDoneCallback6 = null;
        org.joo.promise4j.FailCallback<java.lang.Exception> exceptionFailCallback7 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.Promise[], java.lang.Exception> promiseArraySimpleDeferredObject8 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.Promise[], java.lang.Exception>(promiseArrayDoneCallback6, exceptionFailCallback7);
        org.joo.promise4j.DoneCallback<org.joo.promise4j.Promise[]> promiseArrayDoneCallback9 = null;
        org.joo.promise4j.FailCallback<java.lang.Exception> exceptionFailCallback10 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.Promise[], java.lang.Exception> promiseArraySimpleDeferredObject11 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.Promise[], java.lang.Exception>(promiseArrayDoneCallback9, exceptionFailCallback10);
        org.joo.promise4j.Deferred[] deferredArray13 = new org.joo.promise4j.Deferred[4];
        @SuppressWarnings("unchecked")
        org.joo.promise4j.Deferred<org.joo.promise4j.Promise[], java.lang.Exception>[] promiseArrayDeferredArray14 = (org.joo.promise4j.Deferred<org.joo.promise4j.Promise[], java.lang.Exception>[]) deferredArray13;
        promiseArrayDeferredArray14[0] = promiseArraySimpleDeferredObject2;
        promiseArrayDeferredArray14[1] = promiseArraySimpleDeferredObject5;
        promiseArrayDeferredArray14[2] = promiseArraySimpleDeferredObject8;
        promiseArrayDeferredArray14[3] = promiseArraySimpleDeferredObject11;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.JoinedPromise<org.joo.promise4j.Promise[], java.lang.Exception> promiseArrayJoinedPromise23 = org.joo.promise4j.impl.JoinedPromise.of(promiseArrayDeferredArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Callback cannot be deferred in non-deferred mode");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deferredArray13);
        org.junit.Assert.assertNotNull(promiseArrayDeferredArray14);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred3 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) 10L);
        java.io.Serializable serializable4 = serializableCompletableDeferredObject0.get();
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject5 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise6 = serializableCompletableDeferredObject5.promise();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject5);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback8 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise9 = serializableCompletableDeferredObject5.done(serializableDoneCallback8);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback10 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise11 = serializablePromise9.done(serializableDoneCallback10);
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializableDeferred3);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + 10L + "'", serializable4, 10L);
        org.junit.Assert.assertNotNull(serializablePromise6);
        org.junit.Assert.assertNotNull(serializablePromise7);
        org.junit.Assert.assertNotNull(serializablePromise9);
        org.junit.Assert.assertNotNull(serializablePromise11);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject4 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializablePromise3.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject4);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject6 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable7 = null;
        org.joo.promise4j.PromiseException promiseException8 = new org.joo.promise4j.PromiseException(throwable7);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred9 = deferredStatusAsyncDeferredObject6.reject((java.lang.Exception) promiseException8);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject10 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable11 = null;
        org.joo.promise4j.PromiseException promiseException12 = new org.joo.promise4j.PromiseException(throwable11);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise13 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException12);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred14 = deferredStatusAsyncDeferredObject10.reject((java.lang.Exception) promiseException12);
        promiseException8.addSuppressed((java.lang.Throwable) promiseException12);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred16 = serializableCompletableDeferredObject4.resolve((java.io.Serializable) promiseException12);
        java.util.concurrent.TimeUnit timeUnit18 = null;
        java.util.function.Supplier<java.lang.Throwable> throwableSupplier19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred20 = serializableCompletableDeferredObject4.withTimeout((long) (byte) 0, timeUnit18, throwableSupplier19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNotNull(deferredStatusDeferred9);
        org.junit.Assert.assertNotNull(wildcardClassPromise13);
        org.junit.Assert.assertNotNull(deferredStatusDeferred14);
        org.junit.Assert.assertNotNull(serializableDeferred16);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        java.lang.Runnable runnable0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture3 = org.joo.promise4j.util.TimeoutScheduler.delay(runnable0, (long) ' ', timeUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.DeferredStatus deferredStatus4 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred5 = deferredStatusSimpleDeferredObject3.resolve(deferredStatus4);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise6 = deferredStatusSimpleDeferredObject3.promise();
        org.joo.promise4j.DeferredStatus deferredStatus7 = deferredStatusSimpleDeferredObject3.getStatus();
        java.lang.Throwable throwable8 = null;
        org.joo.promise4j.PromiseException promiseException9 = new org.joo.promise4j.PromiseException(throwable8);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise10 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException9);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred11 = deferredStatusSimpleDeferredObject3.reject((java.lang.Throwable) promiseException9);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise12 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException9);
        org.joo.promise4j.DeferredStatus deferredStatus13 = deferredStatusAsyncDeferredObjectSimpleFailurePromise12.getStatus();
        org.joo.promise4j.DoneCallback<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>> deferredStatusAsyncDeferredObjectDoneCallback14 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectPromise15 = deferredStatusAsyncDeferredObjectSimpleFailurePromise12.done(deferredStatusAsyncDeferredObjectDoneCallback14);
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectAlwaysCallback16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectPromise17 = deferredStatusAsyncDeferredObjectSimpleFailurePromise12.always(deferredStatusAsyncDeferredObjectAlwaysCallback16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred5);
        org.junit.Assert.assertNotNull(deferredStatusPromise6);
        org.junit.Assert.assertTrue("'" + deferredStatus7 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus7.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(wildcardClassPromise10);
        org.junit.Assert.assertNotNull(deferredStatusDeferred11);
        org.junit.Assert.assertTrue("'" + deferredStatus13 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus13.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusAsyncDeferredObjectPromise15);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject2 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1);
        java.util.concurrent.TimeUnit timeUnit4 = null;
        java.util.function.Supplier<java.lang.Throwable> throwableSupplier5 = null;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred6 = deferredStatusSimpleDeferredObject2.withTimeout(0L, timeUnit4, throwableSupplier5);
        java.util.concurrent.TimeUnit timeUnit8 = null;
        java.util.function.Supplier<java.lang.Throwable> throwableSupplier9 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise10 = deferredStatusSimpleDeferredObject2.timeoutAfter((long) '#', timeUnit8, throwableSupplier9);
        org.junit.Assert.assertNotNull(deferredStatusDeferred6);
        org.junit.Assert.assertNotNull(deferredStatusPromise10);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        org.joo.promise4j.DoneCallback<java.lang.Throwable> throwableDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Exception> exceptionFailCallback1 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<java.lang.Throwable, java.lang.Exception> throwableSimpleDeferredObject2 = new org.joo.promise4j.impl.SimpleDeferredObject<java.lang.Throwable, java.lang.Exception>(throwableDoneCallback0, exceptionFailCallback1);
        org.joo.promise4j.FilteredDoneCallback<java.lang.Throwable, org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable>> throwableFilteredDoneCallback3 = null;
        org.joo.promise4j.FilteredFailureCallback<java.lang.Exception, java.lang.Exception> exceptionFilteredFailureCallback4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.FilteredPromise<java.lang.Throwable, java.lang.Exception, org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable>, java.lang.Exception> throwableFilteredPromise5 = new org.joo.promise4j.impl.FilteredPromise<java.lang.Throwable, java.lang.Exception, org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable>, java.lang.Exception>((org.joo.promise4j.Promise<java.lang.Throwable, java.lang.Exception>) throwableSimpleDeferredObject2, throwableFilteredDoneCallback3, exceptionFilteredFailureCallback4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Callback cannot be deferred in non-deferred mode");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        org.joo.promise4j.DeferredStatus deferredStatus0 = org.joo.promise4j.DeferredStatus.RESOLVED;
        org.joo.promise4j.DeferredStatus[] deferredStatusArray1 = new org.joo.promise4j.DeferredStatus[] { deferredStatus0 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList2 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList2, deferredStatusArray1);
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults4 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>((java.util.List<org.joo.promise4j.DeferredStatus>) deferredStatusList2);
        java.util.List<org.joo.promise4j.DeferredStatus> deferredStatusList5 = deferredStatusJoinedResults4.getResults();
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults6 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>(deferredStatusList5);
        org.junit.Assert.assertTrue("'" + deferredStatus0 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus0.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(deferredStatusList5);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.DeferredStatus deferredStatus4 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred5 = deferredStatusSimpleDeferredObject3.resolve(deferredStatus4);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise6 = deferredStatusSimpleDeferredObject3.promise();
        org.joo.promise4j.DeferredStatus deferredStatus7 = deferredStatusSimpleDeferredObject3.getStatus();
        java.lang.Throwable throwable8 = null;
        org.joo.promise4j.PromiseException promiseException9 = new org.joo.promise4j.PromiseException(throwable8);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise10 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException9);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred11 = deferredStatusSimpleDeferredObject3.reject((java.lang.Throwable) promiseException9);
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject12 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean13 = deferredStatusListSyncDeferredObject12.isRejected();
        org.joo.promise4j.AlwaysCallback<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListAlwaysCallback14 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise15 = deferredStatusListSyncDeferredObject12.always(deferredStatusListAlwaysCallback14);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject16 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable17 = null;
        org.joo.promise4j.PromiseException promiseException18 = new org.joo.promise4j.PromiseException(throwable17);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise19 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException18);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred20 = deferredStatusAsyncDeferredObject16.reject((java.lang.Exception) promiseException18);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred21 = deferredStatusListSyncDeferredObject12.reject(promiseException18);
        java.lang.Throwable[] throwableArray22 = promiseException18.getSuppressed();
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred23 = deferredStatusSimpleDeferredObject3.reject((java.lang.Throwable) promiseException18);
        java.util.concurrent.TimeUnit timeUnit25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.DeferredStatus deferredStatus26 = deferredStatusSimpleDeferredObject3.get((long) (short) -1, timeUnit25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Callback cannot be deferred in non-deferred mode");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred5);
        org.junit.Assert.assertNotNull(deferredStatusPromise6);
        org.junit.Assert.assertTrue("'" + deferredStatus7 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus7.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(wildcardClassPromise10);
        org.junit.Assert.assertNotNull(deferredStatusDeferred11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(deferredStatusListPromise15);
        org.junit.Assert.assertNotNull(wildcardClassPromise19);
        org.junit.Assert.assertNotNull(deferredStatusDeferred20);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(deferredStatusDeferred23);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        java.lang.Throwable throwable0 = null;
        org.joo.promise4j.PromiseException promiseException1 = new org.joo.promise4j.PromiseException(throwable0);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise2 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException1);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise3 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException1);
        org.joo.promise4j.DeferredStatus deferredStatus4 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.getStatus();
        org.joo.promise4j.DoneCallback<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>> deferredStatusAsyncDeferredObjectDoneCallback5 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectPromise6 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.done(deferredStatusAsyncDeferredObjectDoneCallback5);
        org.joo.promise4j.DoneCallback<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>> deferredStatusAsyncDeferredObjectDoneCallback7 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectPromise8 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.done(deferredStatusAsyncDeferredObjectDoneCallback7);
        org.junit.Assert.assertNotNull(wildcardClassPromise2);
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusAsyncDeferredObjectPromise6);
        org.junit.Assert.assertNotNull(deferredStatusAsyncDeferredObjectPromise8);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred3 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) 10L);
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise4 = serializableDeferred3.promise();
        org.joo.promise4j.util.TimeoutScheduler timeoutScheduler5 = new org.joo.promise4j.util.TimeoutScheduler();
        java.lang.Class<?> wildcardClass6 = timeoutScheduler5.getClass();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred7 = serializableDeferred3.resolve((java.io.Serializable) wildcardClass6);
        java.lang.Throwable throwable8 = null;
        org.joo.promise4j.PromiseException promiseException9 = new org.joo.promise4j.PromiseException(throwable8);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred10 = serializableDeferred7.reject((java.lang.Throwable) promiseException9);
        org.joo.promise4j.Promise<java.lang.Exception, org.joo.promise4j.PromiseException> exceptionPromise11 = org.joo.promise4j.Promise.of((java.lang.Exception) promiseException9);
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializableDeferred3);
        org.junit.Assert.assertNotNull(serializablePromise4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(serializableDeferred7);
        org.junit.Assert.assertNotNull(serializableDeferred10);
        org.junit.Assert.assertNotNull(exceptionPromise11);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        java.util.concurrent.CompletableFuture<org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>> deferredStatusJoinedResultsCompletableFuture0 = null;
        org.joo.promise4j.impl.CompletableDeferredObject<org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusJoinedResultsCompletableDeferredObject1 = new org.joo.promise4j.impl.CompletableDeferredObject<org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>(deferredStatusJoinedResultsCompletableFuture0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise1 = deferredStatusAsyncDeferredObject0.promise();
        org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectSimpleDonePromise2 = new org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>(deferredStatusAsyncDeferredObject0);
        java.util.concurrent.TimeUnit timeUnit4 = null;
        java.util.function.Supplier<java.lang.Exception> exceptionSupplier5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise6 = deferredStatusAsyncDeferredObject0.timeoutAfter((long) (byte) -1, timeUnit4, exceptionSupplier5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deferredStatusPromise1);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        java.util.concurrent.TimeUnit timeUnit5 = null;
        java.util.function.Supplier<java.lang.Throwable> throwableSupplier6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred7 = serializableCompletableDeferredObject0.withTimeout((long) 0, timeUnit5, throwableSupplier6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        java.lang.Throwable throwable0 = null;
        org.joo.promise4j.PromiseException promiseException1 = new org.joo.promise4j.PromiseException(throwable0);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise2 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException1);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise3 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException1);
        org.joo.promise4j.DeferredStatus deferredStatus4 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.getStatus();
        org.joo.promise4j.DoneCallback<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>> deferredStatusAsyncDeferredObjectDoneCallback5 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectPromise6 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.done(deferredStatusAsyncDeferredObjectDoneCallback5);
        org.joo.promise4j.DeferredStatus deferredStatus7 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.getStatus();
        org.joo.promise4j.DeferredStatus deferredStatus8 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.getStatus();
        java.lang.Class<?> wildcardClass9 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.getClass();
        org.junit.Assert.assertNotNull(wildcardClassPromise2);
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusAsyncDeferredObjectPromise6);
        org.junit.Assert.assertTrue("'" + deferredStatus7 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus7.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertTrue("'" + deferredStatus8 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus8.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        java.lang.Throwable throwable0 = null;
        org.joo.promise4j.PromiseException promiseException1 = new org.joo.promise4j.PromiseException(throwable0);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise2 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException1);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise3 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException1);
        org.joo.promise4j.DeferredStatus deferredStatus4 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.getStatus();
        java.util.concurrent.TimeUnit timeUnit6 = null;
        java.util.function.Supplier<org.joo.promise4j.PromiseException> promiseExceptionSupplier7 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectPromise8 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.timeoutAfter((long) 100, timeUnit6, promiseExceptionSupplier7);
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectAlwaysCallback9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectPromise10 = deferredStatusAsyncDeferredObjectSimpleFailurePromise3.always(deferredStatusAsyncDeferredObjectAlwaysCallback9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassPromise2);
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusAsyncDeferredObjectPromise8);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        org.joo.promise4j.Promise<java.lang.Throwable[], java.lang.Throwable> throwableArrayPromise0 = null;
        org.joo.promise4j.PipeAlwaysCallback<java.lang.Throwable[], java.lang.Cloneable, java.lang.Throwable, java.lang.Throwable> throwableArrayPipeAlwaysCallback1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.PipedAlwaysPromise<java.lang.Throwable[], java.lang.Throwable, java.lang.Cloneable, java.lang.Throwable> throwableArrayPipedAlwaysPromise2 = new org.joo.promise4j.impl.PipedAlwaysPromise<java.lang.Throwable[], java.lang.Throwable, java.lang.Cloneable, java.lang.Throwable>(throwableArrayPromise0, throwableArrayPipeAlwaysCallback1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise1 = deferredStatusAsyncDeferredObject0.promise();
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject2 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise3 = deferredStatusAsyncDeferredObject2.promise();
        org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectSimpleDonePromise4 = new org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>(deferredStatusAsyncDeferredObject2);
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject5 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise6 = serializableCompletableDeferredObject5.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred8 = serializableCompletableDeferredObject5.resolve((java.io.Serializable) 10L);
        java.io.Serializable serializable9 = serializableCompletableDeferredObject5.get();
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject10 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise11 = serializableCompletableDeferredObject10.promise();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise12 = serializableCompletableDeferredObject5.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject10);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback13 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise14 = serializableCompletableDeferredObject10.done(serializableDoneCallback13);
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback15 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise16 = serializableCompletableDeferredObject10.fail(throwableFailCallback15);
        org.joo.promise4j.DeferredStatus deferredStatus17 = serializablePromise16.getStatus();
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred18 = deferredStatusAsyncDeferredObject2.resolve(deferredStatus17);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred19 = deferredStatusAsyncDeferredObject0.resolve(deferredStatus17);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise20 = deferredStatusAsyncDeferredObject0.promise();
        java.util.concurrent.TimeUnit timeUnit22 = null;
        java.util.function.Supplier<java.lang.Exception> exceptionSupplier23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred24 = deferredStatusAsyncDeferredObject0.withTimeout((long) 100, timeUnit22, exceptionSupplier23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(deferredStatusPromise1);
        org.junit.Assert.assertNotNull(deferredStatusPromise3);
        org.junit.Assert.assertNotNull(serializablePromise6);
        org.junit.Assert.assertNotNull(serializableDeferred8);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + 10L + "'", serializable9, 10L);
        org.junit.Assert.assertNotNull(serializablePromise11);
        org.junit.Assert.assertNotNull(serializablePromise12);
        org.junit.Assert.assertNotNull(serializablePromise14);
        org.junit.Assert.assertNotNull(serializablePromise16);
        org.junit.Assert.assertTrue("'" + deferredStatus17 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus17.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred18);
        org.junit.Assert.assertNotNull(deferredStatusDeferred19);
        org.junit.Assert.assertNotNull(deferredStatusPromise20);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback2 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise3 = serializableCompletableDeferredObject0.done(serializableDoneCallback2);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback4 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise5 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback4);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback6 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback6);
        org.joo.promise4j.AlwaysCallback<java.io.Serializable, java.lang.Throwable> serializableAlwaysCallback8 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise9 = serializableCompletableDeferredObject0.always(serializableAlwaysCallback8);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject10 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable11 = null;
        org.joo.promise4j.PromiseException promiseException12 = new org.joo.promise4j.PromiseException(throwable11);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred13 = deferredStatusAsyncDeferredObject10.reject((java.lang.Exception) promiseException12);
        org.joo.promise4j.PromiseException promiseException14 = new org.joo.promise4j.PromiseException((java.lang.Throwable) promiseException12);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred15 = serializableCompletableDeferredObject0.reject((java.lang.Throwable) promiseException14);
        org.joo.promise4j.impl.SimpleFailurePromise<java.util.Spliterator<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusSpliteratorSimpleFailurePromise16 = new org.joo.promise4j.impl.SimpleFailurePromise<java.util.Spliterator<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>(promiseException14);
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializablePromise3);
        org.junit.Assert.assertNotNull(serializablePromise5);
        org.junit.Assert.assertNotNull(serializablePromise7);
        org.junit.Assert.assertNotNull(serializablePromise9);
        org.junit.Assert.assertNotNull(deferredStatusDeferred13);
        org.junit.Assert.assertNotNull(serializableDeferred15);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.DeferredStatus deferredStatus4 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred5 = deferredStatusSimpleDeferredObject3.resolve(deferredStatus4);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise6 = deferredStatusSimpleDeferredObject3.promise();
        org.joo.promise4j.DeferredStatus deferredStatus7 = deferredStatusSimpleDeferredObject3.getStatus();
        java.lang.Throwable throwable8 = null;
        org.joo.promise4j.PromiseException promiseException9 = new org.joo.promise4j.PromiseException(throwable8);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise10 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException9);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred11 = deferredStatusSimpleDeferredObject3.reject((java.lang.Throwable) promiseException9);
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject12 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean13 = deferredStatusListSyncDeferredObject12.isRejected();
        org.joo.promise4j.AlwaysCallback<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListAlwaysCallback14 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise15 = deferredStatusListSyncDeferredObject12.always(deferredStatusListAlwaysCallback14);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject16 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable17 = null;
        org.joo.promise4j.PromiseException promiseException18 = new org.joo.promise4j.PromiseException(throwable17);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise19 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException18);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred20 = deferredStatusAsyncDeferredObject16.reject((java.lang.Exception) promiseException18);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred21 = deferredStatusListSyncDeferredObject12.reject(promiseException18);
        java.lang.Throwable[] throwableArray22 = promiseException18.getSuppressed();
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred23 = deferredStatusSimpleDeferredObject3.reject((java.lang.Throwable) promiseException18);
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback24 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback25 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback26 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject27 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback24, throwableFailCallback25, deferredStatusAlwaysCallback26);
        org.joo.promise4j.DeferredStatus deferredStatus28 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred29 = deferredStatusSimpleDeferredObject27.resolve(deferredStatus28);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise30 = deferredStatusSimpleDeferredObject27.promise();
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject31 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable32 = null;
        org.joo.promise4j.PromiseException promiseException33 = new org.joo.promise4j.PromiseException(throwable32);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred34 = deferredStatusAsyncDeferredObject31.reject((java.lang.Exception) promiseException33);
        org.joo.promise4j.PromiseException promiseException35 = new org.joo.promise4j.PromiseException((java.lang.Throwable) promiseException33);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred36 = deferredStatusSimpleDeferredObject27.reject((java.lang.Throwable) promiseException35);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred37 = deferredStatusSimpleDeferredObject3.reject((java.lang.Throwable) promiseException35);
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred5);
        org.junit.Assert.assertNotNull(deferredStatusPromise6);
        org.junit.Assert.assertTrue("'" + deferredStatus7 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus7.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(wildcardClassPromise10);
        org.junit.Assert.assertNotNull(deferredStatusDeferred11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(deferredStatusListPromise15);
        org.junit.Assert.assertNotNull(wildcardClassPromise19);
        org.junit.Assert.assertNotNull(deferredStatusDeferred20);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(deferredStatusDeferred23);
        org.junit.Assert.assertTrue("'" + deferredStatus28 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus28.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred29);
        org.junit.Assert.assertNotNull(deferredStatusPromise30);
        org.junit.Assert.assertNotNull(deferredStatusDeferred34);
        org.junit.Assert.assertNotNull(deferredStatusDeferred36);
        org.junit.Assert.assertNotNull(deferredStatusDeferred37);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        java.util.function.Supplier[] supplierArray1 = new java.util.function.Supplier[0];
        @SuppressWarnings("unchecked")
        java.util.function.Supplier<org.joo.promise4j.Promise<?, ?>>[] wildcardPromiseSupplierArray2 = (java.util.function.Supplier<org.joo.promise4j.Promise<?, ?>>[]) supplierArray1;
        org.joo.promise4j.Promise<java.lang.Comparable<java.lang.String>, java.lang.Exception> strComparablePromise3 = org.joo.promise4j.Promise.sequence((java.util.function.Supplier<org.joo.promise4j.Promise<?, ?>>[]) supplierArray1);
        org.joo.promise4j.Promise<java.lang.reflect.Type, java.lang.Exception> typePromise4 = org.joo.promise4j.Promise.sequence((java.util.function.Supplier<org.joo.promise4j.Promise<?, ?>>[]) supplierArray1);
        org.joo.promise4j.Promise<org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusJoinedResultsPromise5 = org.joo.promise4j.Promise.sequence((java.util.function.Supplier<org.joo.promise4j.Promise<?, ?>>[]) supplierArray1);
        org.junit.Assert.assertNotNull(supplierArray1);
        org.junit.Assert.assertNotNull(wildcardPromiseSupplierArray2);
        org.junit.Assert.assertNull(strComparablePromise3);
        org.junit.Assert.assertNull(typePromise4);
        org.junit.Assert.assertNull(deferredStatusJoinedResultsPromise5);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isRejected();
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject2 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean3 = deferredStatusListSyncDeferredObject2.isRejected();
        java.lang.Throwable throwable4 = null;
        org.joo.promise4j.PromiseException promiseException5 = new org.joo.promise4j.PromiseException(throwable4);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise6 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException5);
        java.lang.Throwable[] throwableArray7 = promiseException5.getSuppressed();
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred8 = deferredStatusListSyncDeferredObject2.reject(promiseException5);
        org.joo.promise4j.DeferredStatus deferredStatus9 = org.joo.promise4j.DeferredStatus.RESOLVED;
        org.joo.promise4j.DeferredStatus[] deferredStatusArray10 = new org.joo.promise4j.DeferredStatus[] { deferredStatus9 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList11 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList11, deferredStatusArray10);
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults13 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>((java.util.List<org.joo.promise4j.DeferredStatus>) deferredStatusList11);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred14 = deferredStatusListSyncDeferredObject2.resolve(deferredStatusList11);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred15 = deferredStatusListSyncDeferredObject0.resolve(deferredStatusList11);
        java.util.Spliterator<org.joo.promise4j.DeferredStatus> deferredStatusSpliterator16 = deferredStatusList11.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClassPromise6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred8);
        org.junit.Assert.assertTrue("'" + deferredStatus9 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus9.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred14);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred15);
        org.junit.Assert.assertNotNull(deferredStatusSpliterator16);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.DeferredStatus deferredStatus4 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred5 = deferredStatusSimpleDeferredObject3.resolve(deferredStatus4);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise6 = deferredStatusSimpleDeferredObject3.promise();
        org.joo.promise4j.DeferredStatus deferredStatus7 = deferredStatusSimpleDeferredObject3.getStatus();
        java.lang.Throwable throwable8 = null;
        org.joo.promise4j.PromiseException promiseException9 = new org.joo.promise4j.PromiseException(throwable8);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise10 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException9);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred11 = deferredStatusSimpleDeferredObject3.reject((java.lang.Throwable) promiseException9);
        org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectSimpleFailurePromise12 = new org.joo.promise4j.impl.SimpleFailurePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException>(promiseException9);
        org.joo.promise4j.DeferredStatus deferredStatus13 = deferredStatusAsyncDeferredObjectSimpleFailurePromise12.getStatus();
        org.joo.promise4j.DoneCallback<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>> deferredStatusAsyncDeferredObjectDoneCallback14 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectPromise15 = deferredStatusAsyncDeferredObjectSimpleFailurePromise12.done(deferredStatusAsyncDeferredObjectDoneCallback14);
        org.joo.promise4j.FailCallback<org.joo.promise4j.PromiseException> promiseExceptionFailCallback16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, org.joo.promise4j.PromiseException> deferredStatusAsyncDeferredObjectPromise17 = deferredStatusAsyncDeferredObjectSimpleFailurePromise12.fail(promiseExceptionFailCallback16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred5);
        org.junit.Assert.assertNotNull(deferredStatusPromise6);
        org.junit.Assert.assertTrue("'" + deferredStatus7 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus7.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(wildcardClassPromise10);
        org.junit.Assert.assertNotNull(deferredStatusDeferred11);
        org.junit.Assert.assertTrue("'" + deferredStatus13 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus13.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusAsyncDeferredObjectPromise15);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isRejected();
        java.lang.Throwable throwable2 = null;
        org.joo.promise4j.PromiseException promiseException3 = new org.joo.promise4j.PromiseException(throwable2);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise4 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException3);
        java.lang.Throwable[] throwableArray5 = promiseException3.getSuppressed();
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred6 = deferredStatusListSyncDeferredObject0.reject(promiseException3);
        org.joo.promise4j.DeferredStatus deferredStatus7 = org.joo.promise4j.DeferredStatus.RESOLVED;
        org.joo.promise4j.DeferredStatus[] deferredStatusArray8 = new org.joo.promise4j.DeferredStatus[] { deferredStatus7 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList9 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList9, deferredStatusArray8);
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults11 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>((java.util.List<org.joo.promise4j.DeferredStatus>) deferredStatusList9);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred12 = deferredStatusListSyncDeferredObject0.resolve(deferredStatusList9);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject13 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable14 = null;
        org.joo.promise4j.PromiseException promiseException15 = new org.joo.promise4j.PromiseException(throwable14);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred16 = deferredStatusAsyncDeferredObject13.reject((java.lang.Exception) promiseException15);
        org.joo.promise4j.PromiseException promiseException17 = new org.joo.promise4j.PromiseException((java.lang.Throwable) promiseException15);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred18 = deferredStatusListSyncDeferredObject0.reject(promiseException15);
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject19 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise20 = serializableCompletableDeferredObject19.promise();
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback21 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise22 = serializableCompletableDeferredObject19.done(serializableDoneCallback21);
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred24 = serializableCompletableDeferredObject19.resolve((java.io.Serializable) 0);
        java.lang.Throwable throwable25 = null;
        org.joo.promise4j.PromiseException promiseException26 = new org.joo.promise4j.PromiseException(throwable25);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise27 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException26);
        java.lang.Throwable[] throwableArray28 = promiseException26.getSuppressed();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred29 = serializableCompletableDeferredObject19.reject((java.lang.Throwable) promiseException26);
        promiseException15.addSuppressed((java.lang.Throwable) promiseException26);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClassPromise4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred6);
        org.junit.Assert.assertTrue("'" + deferredStatus7 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus7.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred12);
        org.junit.Assert.assertNotNull(deferredStatusDeferred16);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred18);
        org.junit.Assert.assertNotNull(serializablePromise20);
        org.junit.Assert.assertNotNull(serializablePromise22);
        org.junit.Assert.assertNotNull(serializableDeferred24);
        org.junit.Assert.assertNotNull(wildcardClassPromise27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(serializableDeferred29);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isPending();
        boolean boolean2 = deferredStatusListSyncDeferredObject0.isPending();
        org.joo.promise4j.FailCallback<org.joo.promise4j.PromiseException> promiseExceptionFailCallback3 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise4 = deferredStatusListSyncDeferredObject0.fail(promiseExceptionFailCallback3);
        boolean boolean5 = deferredStatusListSyncDeferredObject0.isRejected();
        org.joo.promise4j.AlwaysCallback<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListAlwaysCallback6 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise7 = deferredStatusListSyncDeferredObject0.always(deferredStatusListAlwaysCallback6);
        org.joo.promise4j.DeferredStatus deferredStatus8 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.DeferredStatus[] deferredStatusArray9 = new org.joo.promise4j.DeferredStatus[] { deferredStatus8 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList10 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList10, deferredStatusArray9);
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults12 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>((java.util.List<org.joo.promise4j.DeferredStatus>) deferredStatusList10);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred13 = deferredStatusListSyncDeferredObject0.resolve(deferredStatusList10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(deferredStatusListPromise4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(deferredStatusListPromise7);
        org.junit.Assert.assertTrue("'" + deferredStatus8 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus8.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred13);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.DeferredStatus deferredStatus4 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred5 = deferredStatusSimpleDeferredObject3.resolve(deferredStatus4);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise6 = deferredStatusSimpleDeferredObject3.promise();
        org.joo.promise4j.DeferredStatus deferredStatus7 = deferredStatusSimpleDeferredObject3.getStatus();
        java.lang.Throwable throwable8 = null;
        org.joo.promise4j.PromiseException promiseException9 = new org.joo.promise4j.PromiseException(throwable8);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise10 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException9);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred11 = deferredStatusSimpleDeferredObject3.reject((java.lang.Throwable) promiseException9);
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject12 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean13 = deferredStatusListSyncDeferredObject12.isRejected();
        org.joo.promise4j.AlwaysCallback<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListAlwaysCallback14 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise15 = deferredStatusListSyncDeferredObject12.always(deferredStatusListAlwaysCallback14);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject16 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable17 = null;
        org.joo.promise4j.PromiseException promiseException18 = new org.joo.promise4j.PromiseException(throwable17);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise19 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException18);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred20 = deferredStatusAsyncDeferredObject16.reject((java.lang.Exception) promiseException18);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred21 = deferredStatusListSyncDeferredObject12.reject(promiseException18);
        java.lang.Throwable[] throwableArray22 = promiseException18.getSuppressed();
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred23 = deferredStatusSimpleDeferredObject3.reject((java.lang.Throwable) promiseException18);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise24 = deferredStatusSimpleDeferredObject3.promise();
        boolean boolean25 = deferredStatusSimpleDeferredObject3.isPending();
        org.junit.Assert.assertTrue("'" + deferredStatus4 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus4.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred5);
        org.junit.Assert.assertNotNull(deferredStatusPromise6);
        org.junit.Assert.assertTrue("'" + deferredStatus7 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus7.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(wildcardClassPromise10);
        org.junit.Assert.assertNotNull(deferredStatusDeferred11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(deferredStatusListPromise15);
        org.junit.Assert.assertNotNull(wildcardClassPromise19);
        org.junit.Assert.assertNotNull(deferredStatusDeferred20);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(deferredStatusDeferred23);
        org.junit.Assert.assertNotNull(deferredStatusPromise24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred3 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) 10L);
        java.io.Serializable serializable4 = serializableCompletableDeferredObject0.get();
        java.util.concurrent.TimeUnit timeUnit6 = null;
        java.util.function.Supplier<java.lang.Throwable> throwableSupplier7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred8 = serializableCompletableDeferredObject0.withTimeout((long) 10, timeUnit6, throwableSupplier7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializableDeferred3);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + 10L + "'", serializable4, 10L);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise1 = deferredStatusAsyncDeferredObject0.promise();
        org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectSimpleDonePromise2 = new org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>(deferredStatusAsyncDeferredObject0);
        java.util.concurrent.TimeUnit timeUnit4 = null;
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject5 = deferredStatusAsyncDeferredObjectSimpleDonePromise2.get((-1L), timeUnit4);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject6 = deferredStatusAsyncDeferredObjectSimpleDonePromise2.get();
        org.joo.promise4j.DeferredStatus deferredStatus7 = deferredStatusAsyncDeferredObjectSimpleDonePromise2.getStatus();
        org.junit.Assert.assertNotNull(deferredStatusPromise1);
        org.junit.Assert.assertNotNull(deferredStatusAsyncDeferredObject5);
        org.junit.Assert.assertNotNull(deferredStatusAsyncDeferredObject6);
        org.junit.Assert.assertTrue("'" + deferredStatus7 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus7.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        org.joo.promise4j.Promise<java.lang.Throwable[], java.lang.Exception> throwableArrayPromise0 = null;
        org.joo.promise4j.PipeDoneCallback<java.lang.Throwable[], java.lang.Throwable[], java.lang.Exception> throwableArrayPipeDoneCallback1 = null;
        java.util.function.Predicate<java.lang.Throwable[]> throwableArrayPredicate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.ConditionalPipedPromise<java.lang.Throwable[], java.lang.Exception> throwableArrayConditionalPipedPromise3 = new org.joo.promise4j.impl.ConditionalPipedPromise<java.lang.Throwable[], java.lang.Exception>(throwableArrayPromise0, throwableArrayPipeDoneCallback1, throwableArrayPredicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject0 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise1 = serializableCompletableDeferredObject0.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred3 = serializableCompletableDeferredObject0.resolve((java.io.Serializable) 10L);
        java.io.Serializable serializable4 = serializableCompletableDeferredObject0.get();
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject5 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise6 = serializableCompletableDeferredObject5.promise();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise7 = serializableCompletableDeferredObject0.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject5);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback8 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise9 = serializableCompletableDeferredObject5.done(serializableDoneCallback8);
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject10 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise11 = serializableCompletableDeferredObject10.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred13 = serializableCompletableDeferredObject10.resolve((java.io.Serializable) 10L);
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback14 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise15 = serializableCompletableDeferredObject10.fail(throwableFailCallback14);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback16 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise17 = serializableCompletableDeferredObject10.done(serializableDoneCallback16);
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise18 = serializableCompletableDeferredObject5.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject10);
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable21 = serializableCompletableDeferredObject5.get((long) (short) 0, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializablePromise1);
        org.junit.Assert.assertNotNull(serializableDeferred3);
        org.junit.Assert.assertEquals("'" + serializable4 + "' != '" + 10L + "'", serializable4, 10L);
        org.junit.Assert.assertNotNull(serializablePromise6);
        org.junit.Assert.assertNotNull(serializablePromise7);
        org.junit.Assert.assertNotNull(serializablePromise9);
        org.junit.Assert.assertNotNull(serializablePromise11);
        org.junit.Assert.assertNotNull(serializableDeferred13);
        org.junit.Assert.assertNotNull(serializablePromise15);
        org.junit.Assert.assertNotNull(serializablePromise17);
        org.junit.Assert.assertNotNull(serializablePromise18);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isRejected();
        java.lang.Throwable throwable2 = null;
        org.joo.promise4j.PromiseException promiseException3 = new org.joo.promise4j.PromiseException(throwable2);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise4 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException3);
        java.lang.Throwable[] throwableArray5 = promiseException3.getSuppressed();
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred6 = deferredStatusListSyncDeferredObject0.reject(promiseException3);
        boolean boolean7 = deferredStatusListSyncDeferredObject0.isResolved();
        org.joo.promise4j.DeferredStatus deferredStatus8 = deferredStatusListSyncDeferredObject0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClassPromise4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + deferredStatus8 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus8.equals(org.joo.promise4j.DeferredStatus.REJECTED));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isRejected();
        java.lang.Throwable throwable2 = null;
        org.joo.promise4j.PromiseException promiseException3 = new org.joo.promise4j.PromiseException(throwable2);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise4 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException3);
        java.lang.Throwable[] throwableArray5 = promiseException3.getSuppressed();
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred6 = deferredStatusListSyncDeferredObject0.reject(promiseException3);
        boolean boolean7 = deferredStatusListSyncDeferredObject0.isResolved();
        org.joo.promise4j.AlwaysCallback<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListAlwaysCallback8 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise9 = deferredStatusListSyncDeferredObject0.always(deferredStatusListAlwaysCallback8);
        org.joo.promise4j.DoneCallback<java.util.ArrayList<org.joo.promise4j.DeferredStatus>> deferredStatusListDoneCallback10 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise11 = deferredStatusListSyncDeferredObject0.done(deferredStatusListDoneCallback10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClassPromise4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(deferredStatusListPromise9);
        org.junit.Assert.assertNotNull(deferredStatusListPromise11);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        org.joo.promise4j.Promise<java.lang.Enum<org.joo.promise4j.DeferredStatus>, java.lang.Exception> deferredStatusEnumPromise0 = null;
        org.joo.promise4j.PipeAlwaysCallback<java.lang.Enum<org.joo.promise4j.DeferredStatus>, java.util.RandomAccess, java.lang.Exception, java.lang.Exception> deferredStatusEnumPipeAlwaysCallback1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.PipedAlwaysPromise<java.lang.Enum<org.joo.promise4j.DeferredStatus>, java.lang.Exception, java.util.RandomAccess, java.lang.Exception> deferredStatusEnumPipedAlwaysPromise2 = new org.joo.promise4j.impl.PipedAlwaysPromise<java.lang.Enum<org.joo.promise4j.DeferredStatus>, java.lang.Exception, java.util.RandomAccess, java.lang.Exception>(deferredStatusEnumPromise0, deferredStatusEnumPipeAlwaysCallback1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise1 = deferredStatusAsyncDeferredObject0.promise();
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject2 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise3 = deferredStatusAsyncDeferredObject2.promise();
        org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectSimpleDonePromise4 = new org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>(deferredStatusAsyncDeferredObject2);
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject5 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise6 = serializableCompletableDeferredObject5.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred8 = serializableCompletableDeferredObject5.resolve((java.io.Serializable) 10L);
        java.io.Serializable serializable9 = serializableCompletableDeferredObject5.get();
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject10 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise11 = serializableCompletableDeferredObject10.promise();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise12 = serializableCompletableDeferredObject5.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject10);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback13 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise14 = serializableCompletableDeferredObject10.done(serializableDoneCallback13);
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback15 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise16 = serializableCompletableDeferredObject10.fail(throwableFailCallback15);
        org.joo.promise4j.DeferredStatus deferredStatus17 = serializablePromise16.getStatus();
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred18 = deferredStatusAsyncDeferredObject2.resolve(deferredStatus17);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred19 = deferredStatusAsyncDeferredObject0.resolve(deferredStatus17);
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise20 = deferredStatusAsyncDeferredObject0.promise();
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback21 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback22 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback23 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject24 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback21, throwableFailCallback22, deferredStatusAlwaysCallback23);
        org.joo.promise4j.DeferredStatus deferredStatus25 = org.joo.promise4j.DeferredStatus.REJECTED;
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred26 = deferredStatusSimpleDeferredObject24.resolve(deferredStatus25);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred27 = deferredStatusAsyncDeferredObject0.resolve(deferredStatus25);
        org.junit.Assert.assertNotNull(deferredStatusPromise1);
        org.junit.Assert.assertNotNull(deferredStatusPromise3);
        org.junit.Assert.assertNotNull(serializablePromise6);
        org.junit.Assert.assertNotNull(serializableDeferred8);
        org.junit.Assert.assertEquals("'" + serializable9 + "' != '" + 10L + "'", serializable9, 10L);
        org.junit.Assert.assertNotNull(serializablePromise11);
        org.junit.Assert.assertNotNull(serializablePromise12);
        org.junit.Assert.assertNotNull(serializablePromise14);
        org.junit.Assert.assertNotNull(serializablePromise16);
        org.junit.Assert.assertTrue("'" + deferredStatus17 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus17.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred18);
        org.junit.Assert.assertNotNull(deferredStatusDeferred19);
        org.junit.Assert.assertNotNull(deferredStatusPromise20);
        org.junit.Assert.assertTrue("'" + deferredStatus25 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus25.equals(org.joo.promise4j.DeferredStatus.REJECTED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred26);
        org.junit.Assert.assertNotNull(deferredStatusDeferred27);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        org.joo.promise4j.Promise<java.lang.String, java.lang.Throwable> strPromise0 = null;
        org.joo.promise4j.PipeAlwaysCallback<java.lang.String, java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Throwable, java.lang.Throwable> strPipeAlwaysCallback1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.impl.PipedAlwaysPromise<java.lang.String, java.lang.Throwable, java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Throwable> strPipedAlwaysPromise2 = new org.joo.promise4j.impl.PipedAlwaysPromise<java.lang.String, java.lang.Throwable, java.util.AbstractCollection<org.joo.promise4j.DeferredStatus>, java.lang.Throwable>(strPromise0, strPipeAlwaysCallback1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject0 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean1 = deferredStatusListSyncDeferredObject0.isPending();
        boolean boolean2 = deferredStatusListSyncDeferredObject0.isPending();
        org.joo.promise4j.FailCallback<org.joo.promise4j.PromiseException> promiseExceptionFailCallback3 = null;
        org.joo.promise4j.Promise<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListPromise4 = deferredStatusListSyncDeferredObject0.fail(promiseExceptionFailCallback3);
        boolean boolean5 = deferredStatusListSyncDeferredObject0.isRejected();
        boolean boolean6 = deferredStatusListSyncDeferredObject0.isRejected();
        boolean boolean7 = deferredStatusListSyncDeferredObject0.isPending();
        java.lang.Class<?> wildcardClass8 = deferredStatusListSyncDeferredObject0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(deferredStatusListPromise4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise1 = deferredStatusAsyncDeferredObject0.promise();
        org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception> deferredStatusAsyncDeferredObjectSimpleDonePromise2 = new org.joo.promise4j.impl.SimpleDonePromise<org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>, java.lang.Exception>(deferredStatusAsyncDeferredObject0);
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject3 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise4 = serializableCompletableDeferredObject3.promise();
        org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable> serializableDeferred6 = serializableCompletableDeferredObject3.resolve((java.io.Serializable) 10L);
        java.io.Serializable serializable7 = serializableCompletableDeferredObject3.get();
        org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable> serializableCompletableDeferredObject8 = new org.joo.promise4j.impl.CompletableDeferredObject<java.io.Serializable, java.lang.Throwable>();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise9 = serializableCompletableDeferredObject8.promise();
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise10 = serializableCompletableDeferredObject3.forward((org.joo.promise4j.Deferred<java.io.Serializable, java.lang.Throwable>) serializableCompletableDeferredObject8);
        org.joo.promise4j.DoneCallback<java.io.Serializable> serializableDoneCallback11 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise12 = serializableCompletableDeferredObject8.done(serializableDoneCallback11);
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback13 = null;
        org.joo.promise4j.Promise<java.io.Serializable, java.lang.Throwable> serializablePromise14 = serializableCompletableDeferredObject8.fail(throwableFailCallback13);
        org.joo.promise4j.DeferredStatus deferredStatus15 = serializablePromise14.getStatus();
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred16 = deferredStatusAsyncDeferredObject0.resolve(deferredStatus15);
        org.joo.promise4j.FailCallback<java.lang.Exception> exceptionFailCallback17 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise18 = deferredStatusAsyncDeferredObject0.fail(exceptionFailCallback17);
        org.junit.Assert.assertNotNull(deferredStatusPromise1);
        org.junit.Assert.assertNotNull(serializablePromise4);
        org.junit.Assert.assertNotNull(serializableDeferred6);
        org.junit.Assert.assertEquals("'" + serializable7 + "' != '" + 10L + "'", serializable7, 10L);
        org.junit.Assert.assertNotNull(serializablePromise9);
        org.junit.Assert.assertNotNull(serializablePromise10);
        org.junit.Assert.assertNotNull(serializablePromise12);
        org.junit.Assert.assertNotNull(serializablePromise14);
        org.junit.Assert.assertTrue("'" + deferredStatus15 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus15.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusDeferred16);
        org.junit.Assert.assertNotNull(deferredStatusPromise18);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback0 = null;
        org.joo.promise4j.FailCallback<java.lang.Throwable> throwableFailCallback1 = null;
        org.joo.promise4j.AlwaysCallback<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusAlwaysCallback2 = null;
        org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusSimpleDeferredObject3 = new org.joo.promise4j.impl.SimpleDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Throwable>(deferredStatusDoneCallback0, throwableFailCallback1, deferredStatusAlwaysCallback2);
        org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListSyncDeferredObject4 = new org.joo.promise4j.impl.SyncDeferredObject<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException>();
        boolean boolean5 = deferredStatusListSyncDeferredObject4.isRejected();
        java.lang.Throwable throwable6 = null;
        org.joo.promise4j.PromiseException promiseException7 = new org.joo.promise4j.PromiseException(throwable6);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise8 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException7);
        java.lang.Throwable[] throwableArray9 = promiseException7.getSuppressed();
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred10 = deferredStatusListSyncDeferredObject4.reject(promiseException7);
        org.joo.promise4j.DeferredStatus deferredStatus11 = org.joo.promise4j.DeferredStatus.RESOLVED;
        org.joo.promise4j.DeferredStatus[] deferredStatusArray12 = new org.joo.promise4j.DeferredStatus[] { deferredStatus11 };
        java.util.ArrayList<org.joo.promise4j.DeferredStatus> deferredStatusList13 = new java.util.ArrayList<org.joo.promise4j.DeferredStatus>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.joo.promise4j.DeferredStatus>) deferredStatusList13, deferredStatusArray12);
        org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus> deferredStatusJoinedResults15 = new org.joo.promise4j.impl.JoinedResults<org.joo.promise4j.DeferredStatus>((java.util.List<org.joo.promise4j.DeferredStatus>) deferredStatusList13);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred16 = deferredStatusListSyncDeferredObject4.resolve(deferredStatusList13);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject17 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable18 = null;
        org.joo.promise4j.PromiseException promiseException19 = new org.joo.promise4j.PromiseException(throwable18);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred20 = deferredStatusAsyncDeferredObject17.reject((java.lang.Exception) promiseException19);
        org.joo.promise4j.PromiseException promiseException21 = new org.joo.promise4j.PromiseException((java.lang.Throwable) promiseException19);
        org.joo.promise4j.Deferred<java.util.ArrayList<org.joo.promise4j.DeferredStatus>, org.joo.promise4j.PromiseException> deferredStatusListDeferred22 = deferredStatusListSyncDeferredObject4.reject(promiseException19);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusDeferred23 = deferredStatusSimpleDeferredObject3.reject((java.lang.Throwable) promiseException19);
        boolean boolean24 = deferredStatusSimpleDeferredObject3.isPending();
        java.util.function.Predicate<org.joo.promise4j.DeferredStatus> deferredStatusPredicate25 = null;
        org.joo.promise4j.PipeDoneCallback<org.joo.promise4j.DeferredStatus, org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPipeDoneCallback26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Throwable> deferredStatusPromise27 = deferredStatusSimpleDeferredObject3.when(deferredStatusPredicate25, deferredStatusPipeDoneCallback26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Callback cannot be deferred in non-deferred mode");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClassPromise8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred10);
        org.junit.Assert.assertTrue("'" + deferredStatus11 + "' != '" + org.joo.promise4j.DeferredStatus.RESOLVED + "'", deferredStatus11.equals(org.joo.promise4j.DeferredStatus.RESOLVED));
        org.junit.Assert.assertNotNull(deferredStatusArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred16);
        org.junit.Assert.assertNotNull(deferredStatusDeferred20);
        org.junit.Assert.assertNotNull(deferredStatusListDeferred22);
        org.junit.Assert.assertNotNull(deferredStatusDeferred23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject0 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable1 = null;
        org.joo.promise4j.PromiseException promiseException2 = new org.joo.promise4j.PromiseException(throwable1);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred3 = deferredStatusAsyncDeferredObject0.reject((java.lang.Exception) promiseException2);
        org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusAsyncDeferredObject4 = new org.joo.promise4j.impl.AsyncDeferredObject<org.joo.promise4j.DeferredStatus, java.lang.Exception>();
        java.lang.Throwable throwable5 = null;
        org.joo.promise4j.PromiseException promiseException6 = new org.joo.promise4j.PromiseException(throwable5);
        org.joo.promise4j.Promise<java.lang.Class<?>, java.lang.Exception> wildcardClassPromise7 = org.joo.promise4j.Promise.ofCause((java.lang.Exception) promiseException6);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred8 = deferredStatusAsyncDeferredObject4.reject((java.lang.Exception) promiseException6);
        org.joo.promise4j.Deferred<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusDeferred9 = deferredStatusAsyncDeferredObject0.reject((java.lang.Exception) promiseException6);
        org.joo.promise4j.DoneCallback<org.joo.promise4j.DeferredStatus> deferredStatusDoneCallback10 = null;
        org.joo.promise4j.Promise<org.joo.promise4j.DeferredStatus, java.lang.Exception> deferredStatusPromise11 = deferredStatusAsyncDeferredObject0.done(deferredStatusDoneCallback10);
        org.joo.promise4j.DeferredStatus deferredStatus12 = deferredStatusAsyncDeferredObject0.getStatus();
        org.junit.Assert.assertNotNull(deferredStatusDeferred3);
        org.junit.Assert.assertNotNull(wildcardClassPromise7);
        org.junit.Assert.assertNotNull(deferredStatusDeferred8);
        org.junit.Assert.assertNotNull(deferredStatusDeferred9);
        org.junit.Assert.assertNotNull(deferredStatusPromise11);
        org.junit.Assert.assertTrue("'" + deferredStatus12 + "' != '" + org.joo.promise4j.DeferredStatus.REJECTED + "'", deferredStatus12.equals(org.joo.promise4j.DeferredStatus.REJECTED));
    }
}

