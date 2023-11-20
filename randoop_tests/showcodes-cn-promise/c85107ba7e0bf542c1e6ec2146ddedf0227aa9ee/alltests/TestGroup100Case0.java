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
        java.util.function.Supplier<cn.showcodes.promise.Promise> promiseSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.retry(promiseSupplier0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.timeout((long) '#');
        org.junit.Assert.assertNotNull(promise1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.util.function.Supplier<cn.showcodes.promise.Promise> promiseSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.retry(promiseSupplier0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.util.function.Supplier<cn.showcodes.promise.Promise> promiseSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.retry(promiseSupplier0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        cn.showcodes.promise.PromiseStatus promiseStatus0 = cn.showcodes.promise.PromiseStatus.pending;
        org.junit.Assert.assertTrue("'" + promiseStatus0 + "' != '" + cn.showcodes.promise.PromiseStatus.pending + "'", promiseStatus0.equals(cn.showcodes.promise.PromiseStatus.pending));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        java.lang.Class<?> wildcardClass6 = objPromise5.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        // The following exception was thrown during execution in test generation
        try {
            cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.timeout((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative delay.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.timeout(0L);
        org.junit.Assert.assertNotNull(promise1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.util.function.Supplier<cn.showcodes.promise.Promise> promiseSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.retry(promiseSupplier0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        cn.showcodes.promise.Promise[] promiseArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        java.util.List<cn.showcodes.promise.Promise> promiseList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.any(promiseList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.util.function.Supplier<cn.showcodes.promise.Promise> promiseSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.retry(promiseSupplier0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.any(promiseArray0);
        java.lang.Class<?> wildcardClass4 = promiseArray0.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise[] promiseArray33 = new cn.showcodes.promise.Promise[] { promise32 };
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.race(promiseArray33);
        java.lang.Class<?> wildcardClass35 = promise34.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promiseArray33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.any(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.timeout((long) (byte) 0);
        org.junit.Assert.assertNotNull(promise1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.timeout((long) (byte) 1);
        org.junit.Assert.assertNotNull(promise1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.util.function.Supplier<cn.showcodes.promise.Promise> promiseSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.retry(promiseSupplier0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        java.lang.Class<?> wildcardClass36 = promiseList28.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.any(promiseArray0);
        java.lang.Class<?> wildcardClass3 = promiseArray0.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.timeout((long) 100);
        org.junit.Assert.assertNotNull(promise1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.any(promiseArray0);
        java.lang.Class<?> wildcardClass3 = promise2.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.timeout(1L);
        org.junit.Assert.assertNotNull(promise1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        java.util.function.Supplier<cn.showcodes.promise.Promise> promiseSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.retry(promiseSupplier0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        java.util.function.Supplier<cn.showcodes.promise.Promise> promiseSupplier0 = null;
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.retry(promiseSupplier0, 0);
        org.junit.Assert.assertNotNull(promise2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.lang.reflect.GenericDeclaration genericDeclaration0 = null;
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.reflect.GenericDeclaration> objPromise1 = cn.showcodes.promise.Promise.reject(genericDeclaration0);
        org.junit.Assert.assertNotNull(objPromise1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.any(promiseArray0);
        java.lang.Class<?> wildcardClass3 = promiseArray0.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        java.util.function.Supplier<cn.showcodes.promise.Promise> promiseSupplier0 = null;
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.retry(promiseSupplier0, (-1));
        org.junit.Assert.assertNotNull(promise2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        java.util.function.Supplier<cn.showcodes.promise.Promise> promiseSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.retry(promiseSupplier0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.String> objPromise1 = cn.showcodes.promise.Promise.reject("");
        org.junit.Assert.assertNotNull(objPromise1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.timeout(10L);
        java.lang.Class<?> wildcardClass2 = promise1.getClass();
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.Class<?>> objPromise3 = cn.showcodes.promise.Promise.reject(wildcardClass2);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objPromise3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        java.lang.Class<?> wildcardClass4 = promise3.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        java.lang.Class<?> wildcardClass33 = promiseList28.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.Object> objPromise1 = cn.showcodes.promise.Promise.reject((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass2 = objPromise1.getClass();
        org.junit.Assert.assertNotNull(objPromise1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.util.function.Supplier<cn.showcodes.promise.Promise> promiseSupplier0 = null;
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.retry(promiseSupplier0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(promise2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.Object> objPromise33 = cn.showcodes.promise.Promise.reject((java.lang.Object) promise32);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise34 = cn.showcodes.promise.Promise.reject((cn.showcodes.promise.Promise) objPromise33);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(objPromise33);
        org.junit.Assert.assertNotNull(objPromise34);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        cn.showcodes.promise.Promise[] promiseArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.race(promiseArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.timeout(10L);
        java.lang.Class<?> wildcardClass2 = promise1.getClass();
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.Class<?>> objPromise3 = cn.showcodes.promise.Promise.reject(wildcardClass2);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objPromise3);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.timeout((long) ' ');
        org.junit.Assert.assertNotNull(promise1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.all(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        // The following exception was thrown during execution in test generation
        try {
            cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.timeout((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative delay.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        java.lang.Class<?> wildcardClass5 = promiseArray0.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.any(promiseArray0);
        java.lang.Class<?> wildcardClass9 = promise8.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        // The following exception was thrown during execution in test generation
        try {
            cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.timeout((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative delay.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        java.util.function.Supplier<cn.showcodes.promise.Promise> promiseSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.retry(promiseSupplier0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        java.util.function.Supplier<cn.showcodes.promise.Promise> promiseSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.retry(promiseSupplier0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        java.util.function.Supplier<cn.showcodes.promise.Promise> promiseSupplier0 = null;
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.retry(promiseSupplier0, (int) (byte) 0);
        cn.showcodes.promise.Promise[] promiseArray3 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.all(promiseArray3);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.allSettled(promiseArray3);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.all(promiseArray3);
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.race(promiseArray3);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.race(promiseArray3);
        cn.showcodes.promise.Promise[] promiseArray9 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.all(promiseArray9);
        cn.showcodes.promise.Promise promise11 = cn.showcodes.promise.Promise.allSettled(promiseArray9);
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray9);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.race(promiseArray9);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise14 = cn.showcodes.promise.Promise.reject(promise13);
        cn.showcodes.promise.Promise[] promiseArray15 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.all(promiseArray15);
        cn.showcodes.promise.Promise promise17 = cn.showcodes.promise.Promise.allSettled(promiseArray15);
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray15);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.race(promiseArray15);
        cn.showcodes.promise.Promise[] promiseArray20 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise21 = cn.showcodes.promise.Promise.all(promiseArray20);
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.allSettled(promiseArray20);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.all(promiseArray20);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.race(promiseArray20);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.allSettled(promiseArray20);
        cn.showcodes.promise.Promise[] promiseArray26 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise27 = cn.showcodes.promise.Promise.all(promiseArray26);
        cn.showcodes.promise.Promise promise28 = cn.showcodes.promise.Promise.allSettled(promiseArray26);
        cn.showcodes.promise.Promise promise29 = cn.showcodes.promise.Promise.all(promiseArray26);
        cn.showcodes.promise.Promise[] promiseArray30 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all(promiseArray30);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled(promiseArray30);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.all(promiseArray30);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.race(promiseArray30);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.race(promiseArray30);
        cn.showcodes.promise.Promise[] promiseArray36 = new cn.showcodes.promise.Promise[] { promise13, promise19, promise25, promise29, promise35 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList37 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList37, promiseArray36);
        cn.showcodes.promise.Promise promise39 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList37);
        cn.showcodes.promise.Promise promise40 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList37);
        cn.showcodes.promise.Promise promise41 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList37);
        cn.showcodes.promise.Promise promise42 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList37);
        cn.showcodes.promise.Promise[] promiseArray43 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise44 = cn.showcodes.promise.Promise.race(promiseArray43);
        cn.showcodes.promise.Promise promise45 = cn.showcodes.promise.Promise.any(promiseArray43);
        cn.showcodes.promise.Promise promise46 = cn.showcodes.promise.Promise.any(promiseArray43);
        cn.showcodes.promise.Promise promise47 = cn.showcodes.promise.Promise.race(promiseArray43);
        cn.showcodes.promise.Promise promise48 = cn.showcodes.promise.Promise.race(promiseArray43);
        cn.showcodes.promise.Promise[] promiseArray49 = new cn.showcodes.promise.Promise[] { promise2, promise8, promise42, promise48 };
        cn.showcodes.promise.Promise promise50 = cn.showcodes.promise.Promise.race(promiseArray49);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promiseArray3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promiseArray9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promise11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(objPromise14);
        org.junit.Assert.assertNotNull(promiseArray15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promise17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promiseArray20);
        org.junit.Assert.assertNotNull(promise21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promiseArray26);
        org.junit.Assert.assertNotNull(promise27);
        org.junit.Assert.assertNotNull(promise28);
        org.junit.Assert.assertNotNull(promise29);
        org.junit.Assert.assertNotNull(promiseArray30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promiseArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(promise39);
        org.junit.Assert.assertNotNull(promise40);
        org.junit.Assert.assertNotNull(promise41);
        org.junit.Assert.assertNotNull(promise42);
        org.junit.Assert.assertNotNull(promiseArray43);
        org.junit.Assert.assertNotNull(promise44);
        org.junit.Assert.assertNotNull(promise45);
        org.junit.Assert.assertNotNull(promise46);
        org.junit.Assert.assertNotNull(promise47);
        org.junit.Assert.assertNotNull(promise48);
        org.junit.Assert.assertNotNull(promiseArray49);
        org.junit.Assert.assertNotNull(promise50);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.util.List<cn.showcodes.promise.Promise> promiseList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.timeout(100L);
        org.junit.Assert.assertNotNull(promise1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        java.lang.Class<?> wildcardClass35 = promise34.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.any(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.util.function.Supplier<cn.showcodes.promise.Promise> promiseSupplier0 = null;
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.retry(promiseSupplier0, (int) (short) -1);
        org.junit.Assert.assertNotNull(promise2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        cn.showcodes.promise.Promise[] promiseArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise[] promiseArray33 = new cn.showcodes.promise.Promise[] { promise32 };
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.race(promiseArray33);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.all(promiseArray33);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.race(promiseArray33);
        java.lang.Class<?> wildcardClass37 = promise36.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promiseArray33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
        org.junit.Assert.assertNotNull(promise7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise[] promiseArray33 = new cn.showcodes.promise.Promise[] { promise32 };
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.race(promiseArray33);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.any(promiseArray33);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promiseArray33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.all(promiseArray0);
        java.lang.Class<?> wildcardClass7 = promise6.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        java.lang.Class<?> wildcardClass33 = promise32.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise[] promiseArray33 = new cn.showcodes.promise.Promise[] { promise32 };
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.race(promiseArray33);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.all(promiseArray33);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise[]> objPromise36 = cn.showcodes.promise.Promise.reject(promiseArray33);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promiseArray33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(objPromise36);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        java.lang.Class<?> wildcardClass34 = promiseList28.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        java.lang.Class<?> wildcardClass6 = promise4.getClass();
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.reflect.GenericDeclaration> objPromise7 = cn.showcodes.promise.Promise.reject((java.lang.reflect.GenericDeclaration) wildcardClass6);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objPromise7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.Iterable<cn.showcodes.promise.Promise>> objPromise33 = cn.showcodes.promise.Promise.reject((java.lang.Iterable<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        java.lang.Class<?> wildcardClass35 = promise34.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(objPromise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        java.lang.Class<?> wildcardClass6 = promiseArray0.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.race(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        java.lang.Class<?> wildcardClass34 = promiseList28.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise<java.lang.Object, java.util.AbstractList<cn.showcodes.promise.Promise>> objPromise32 = cn.showcodes.promise.Promise.reject((java.util.AbstractList<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        java.lang.Class<?> wildcardClass34 = promiseList28.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(objPromise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        java.lang.Class<?> wildcardClass4 = promiseArray0.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        java.lang.Class<?> wildcardClass36 = promise35.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.String> objPromise1 = cn.showcodes.promise.Promise.reject("");
        org.junit.Assert.assertNotNull(objPromise1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.any(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        cn.showcodes.promise.PromiseStatus promiseStatus0 = cn.showcodes.promise.PromiseStatus.fulfilled;
        java.lang.Class<?> wildcardClass1 = promiseStatus0.getClass();
        org.junit.Assert.assertTrue("'" + promiseStatus0 + "' != '" + cn.showcodes.promise.PromiseStatus.fulfilled + "'", promiseStatus0.equals(cn.showcodes.promise.PromiseStatus.fulfilled));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.race(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        java.lang.Class<?> wildcardClass6 = promise5.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise<java.lang.Object, java.util.AbstractList<cn.showcodes.promise.Promise>> objPromise33 = cn.showcodes.promise.Promise.reject((java.util.AbstractList<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(objPromise33);
        org.junit.Assert.assertNotNull(promise34);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        java.lang.Class<?> wildcardClass33 = promiseList28.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        cn.showcodes.promise.PromiseStatus promiseStatus0 = cn.showcodes.promise.PromiseStatus.fulfilled;
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.PromiseStatus> objPromise1 = cn.showcodes.promise.Promise.reject(promiseStatus0);
        org.junit.Assert.assertTrue("'" + promiseStatus0 + "' != '" + cn.showcodes.promise.PromiseStatus.fulfilled + "'", promiseStatus0.equals(cn.showcodes.promise.PromiseStatus.fulfilled));
        org.junit.Assert.assertNotNull(objPromise1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.CharSequence> objPromise1 = cn.showcodes.promise.Promise.reject((java.lang.CharSequence) "");
        org.junit.Assert.assertNotNull(objPromise1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        java.lang.Class<?> wildcardClass2 = promise1.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise<java.lang.Object, java.util.RandomAccess> objPromise36 = cn.showcodes.promise.Promise.reject((java.util.RandomAccess) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(objPromise36);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray0);
        java.lang.Class<?> wildcardClass10 = promise9.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.timeout((long) '4');
        org.junit.Assert.assertNotNull(promise1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.timeout((long) 1);
        org.junit.Assert.assertNotNull(promise1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.timeout((long) (short) 1);
        org.junit.Assert.assertNotNull(promise1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        cn.showcodes.promise.Promise[] promiseArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.any(promiseArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise<java.lang.Object, java.util.Collection<cn.showcodes.promise.Promise>> objPromise33 = cn.showcodes.promise.Promise.reject((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28);
        java.lang.Class<?> wildcardClass34 = objPromise33.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(objPromise33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise37 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise38 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(promise37);
        org.junit.Assert.assertNotNull(promise38);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.any(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.Iterable<cn.showcodes.promise.Promise>> objPromise34 = cn.showcodes.promise.Promise.reject((java.lang.Iterable<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(objPromise34);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        java.util.function.Supplier<cn.showcodes.promise.Promise> promiseSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.retry(promiseSupplier0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        cn.showcodes.promise.PromiseStatus promiseStatus0 = cn.showcodes.promise.PromiseStatus.rejected;
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.Enum<cn.showcodes.promise.PromiseStatus>> objPromise1 = cn.showcodes.promise.Promise.reject((java.lang.Enum<cn.showcodes.promise.PromiseStatus>) promiseStatus0);
        org.junit.Assert.assertTrue("'" + promiseStatus0 + "' != '" + cn.showcodes.promise.PromiseStatus.rejected + "'", promiseStatus0.equals(cn.showcodes.promise.PromiseStatus.rejected));
        org.junit.Assert.assertNotNull(objPromise1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        java.lang.Class<?> wildcardClass32 = promise31.getClass();
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.reflect.GenericDeclaration> objPromise33 = cn.showcodes.promise.Promise.reject((java.lang.reflect.GenericDeclaration) wildcardClass32);
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.reflect.Type> objPromise34 = cn.showcodes.promise.Promise.reject((java.lang.reflect.Type) wildcardClass32);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(objPromise33);
        org.junit.Assert.assertNotNull(objPromise34);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        cn.showcodes.promise.PromiseStatus promiseStatus0 = cn.showcodes.promise.PromiseStatus.fulfilled;
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.PromiseStatus> objPromise1 = cn.showcodes.promise.Promise.reject(promiseStatus0);
        org.junit.Assert.assertTrue("'" + promiseStatus0 + "' != '" + cn.showcodes.promise.PromiseStatus.fulfilled + "'", promiseStatus0.equals(cn.showcodes.promise.PromiseStatus.fulfilled));
        org.junit.Assert.assertNotNull(objPromise1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise[] promiseArray33 = new cn.showcodes.promise.Promise[] { promise32 };
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.race(promiseArray33);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.allSettled(promiseArray33);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.any(promiseArray33);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promiseArray33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.race(promiseArray0);
        java.lang.Class<?> wildcardClass6 = promiseArray0.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise37 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise38 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(promise37);
        org.junit.Assert.assertNotNull(promise38);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise<java.lang.Object, java.util.Collection<cn.showcodes.promise.Promise>> objPromise33 = cn.showcodes.promise.Promise.reject((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(objPromise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.all(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        java.lang.Class<?> wildcardClass6 = promise5.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.race(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.util.function.Supplier<cn.showcodes.promise.Promise> promiseSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.retry(promiseSupplier0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.all(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.util.function.Supplier<cn.showcodes.promise.Promise> promiseSupplier0 = null;
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.retry(promiseSupplier0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(promise2);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise[] promiseArray33 = new cn.showcodes.promise.Promise[] { promise32 };
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.race(promiseArray33);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise[]> objPromise35 = cn.showcodes.promise.Promise.reject(promiseArray33);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.any(promiseArray33);
        cn.showcodes.promise.Promise promise37 = cn.showcodes.promise.Promise.race(promiseArray33);
        java.lang.Class<?> wildcardClass38 = promiseArray33.getClass();
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.Class<?>> objPromise39 = cn.showcodes.promise.Promise.reject(wildcardClass38);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promiseArray33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(objPromise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(promise37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(objPromise39);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        java.lang.Class<?> wildcardClass32 = promiseList28.getClass();
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.reflect.Type> objPromise33 = cn.showcodes.promise.Promise.reject((java.lang.reflect.Type) wildcardClass32);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(objPromise33);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.all(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.util.List<cn.showcodes.promise.Promise> promiseList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.allSettled(promiseList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.Iterable<cn.showcodes.promise.Promise>> objPromise37 = cn.showcodes.promise.Promise.reject((java.lang.Iterable<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise38 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(objPromise37);
        org.junit.Assert.assertNotNull(promise38);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise<java.lang.Object, java.util.Collection<cn.showcodes.promise.Promise>> objPromise33 = cn.showcodes.promise.Promise.reject((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise37 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise38 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(objPromise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(promise37);
        org.junit.Assert.assertNotNull(promise38);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise<java.lang.Object, java.util.Collection<cn.showcodes.promise.Promise>> objPromise34 = cn.showcodes.promise.Promise.reject((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28);
        java.lang.Class<?> wildcardClass35 = objPromise34.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(objPromise34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise37 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise38 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(promise37);
        org.junit.Assert.assertNotNull(promise38);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.CharSequence> objPromise1 = cn.showcodes.promise.Promise.reject((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNotNull(objPromise1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise<java.lang.Object, java.util.AbstractList<cn.showcodes.promise.Promise>> objPromise32 = cn.showcodes.promise.Promise.reject((java.util.AbstractList<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(objPromise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise37 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise38 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        java.lang.Class<?> wildcardClass39 = promise38.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(promise37);
        org.junit.Assert.assertNotNull(promise38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.timeout((long) (short) 100);
        org.junit.Assert.assertNotNull(promise1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.race(promiseArray0);
        java.lang.Class<?> wildcardClass10 = promiseArray0.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        java.lang.Class<?> wildcardClass37 = promise36.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise37 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise38 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(promise37);
        org.junit.Assert.assertNotNull(promise38);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise promise11 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.any(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray13 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray13);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.allSettled(promiseArray13);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.all(promiseArray13);
        cn.showcodes.promise.Promise promise17 = cn.showcodes.promise.Promise.race(promiseArray13);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise18 = cn.showcodes.promise.Promise.reject(promise17);
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.Object> objPromise20 = cn.showcodes.promise.Promise.reject((java.lang.Object) (short) 1);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.Object> objPromise24 = cn.showcodes.promise.Promise.reject((java.lang.Object) (short) 1);
        cn.showcodes.promise.Promise[] promiseArray25 = new cn.showcodes.promise.Promise[] { promise5, promise12, objPromise18, objPromise20, promise22, objPromise24 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList26 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList26, promiseArray25);
        cn.showcodes.promise.Promise promise28 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList26);
        cn.showcodes.promise.Promise<java.lang.Object, java.util.List<cn.showcodes.promise.Promise>> objPromise29 = cn.showcodes.promise.Promise.reject((java.util.List<cn.showcodes.promise.Promise>) promiseList26);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList26);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList26);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promise11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promiseArray13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promise17);
        org.junit.Assert.assertNotNull(objPromise18);
        org.junit.Assert.assertNotNull(objPromise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(objPromise24);
        org.junit.Assert.assertNotNull(promiseArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(promise28);
        org.junit.Assert.assertNotNull(objPromise29);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.any(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.race(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        java.lang.Class<?> wildcardClass34 = promise33.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise<java.lang.Object, java.util.Collection<cn.showcodes.promise.Promise>> objPromise33 = cn.showcodes.promise.Promise.reject((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(objPromise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise37 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise38 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise39 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(promise37);
        org.junit.Assert.assertNotNull(promise38);
        org.junit.Assert.assertNotNull(promise39);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise[] promiseArray33 = new cn.showcodes.promise.Promise[] { promise32 };
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.race(promiseArray33);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise[]> objPromise35 = cn.showcodes.promise.Promise.reject(promiseArray33);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.any(promiseArray33);
        cn.showcodes.promise.Promise promise37 = cn.showcodes.promise.Promise.allSettled(promiseArray33);
        cn.showcodes.promise.Promise promise38 = cn.showcodes.promise.Promise.all(promiseArray33);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promiseArray33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(objPromise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(promise37);
        org.junit.Assert.assertNotNull(promise38);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise[] promiseArray33 = new cn.showcodes.promise.Promise[] { promise32 };
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.race(promiseArray33);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.allSettled(promiseArray33);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.all(promiseArray33);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promiseArray33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.Iterable<cn.showcodes.promise.Promise>> objPromise37 = cn.showcodes.promise.Promise.reject((java.lang.Iterable<cn.showcodes.promise.Promise>) promiseList28);
        java.lang.Class<?> wildcardClass38 = objPromise37.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(objPromise37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise37 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        java.lang.Class<?> wildcardClass38 = promise37.getClass();
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.reflect.AnnotatedElement> objPromise39 = cn.showcodes.promise.Promise.reject((java.lang.reflect.AnnotatedElement) wildcardClass38);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(promise37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(objPromise39);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise[] promiseArray33 = new cn.showcodes.promise.Promise[] { promise32 };
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.race(promiseArray33);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise[]> objPromise35 = cn.showcodes.promise.Promise.reject(promiseArray33);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.any(promiseArray33);
        cn.showcodes.promise.Promise promise37 = cn.showcodes.promise.Promise.allSettled(promiseArray33);
        cn.showcodes.promise.Promise promise38 = cn.showcodes.promise.Promise.allSettled(promiseArray33);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promiseArray33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(objPromise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(promise37);
        org.junit.Assert.assertNotNull(promise38);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise37 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        java.lang.Class<?> wildcardClass38 = promiseList28.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(promise37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise<java.lang.Object, java.util.AbstractList<cn.showcodes.promise.Promise>> objPromise32 = cn.showcodes.promise.Promise.reject((java.util.AbstractList<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise<java.lang.Object, java.util.ArrayList<cn.showcodes.promise.Promise>> objPromise36 = cn.showcodes.promise.Promise.reject(promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(objPromise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(objPromise36);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.timeout((long) 10);
        org.junit.Assert.assertNotNull(promise1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.any(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise37 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise38 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise39 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise40 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(promise37);
        org.junit.Assert.assertNotNull(promise38);
        org.junit.Assert.assertNotNull(promise39);
        org.junit.Assert.assertNotNull(promise40);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.any(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise11 = cn.showcodes.promise.Promise.race(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promise11);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        java.util.function.Supplier<cn.showcodes.promise.Promise> promiseSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.retry(promiseSupplier0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.timeout((long) 0);
        java.lang.Class<?> wildcardClass2 = promise1.getClass();
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.any(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.race(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise11 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promise11);
        org.junit.Assert.assertNotNull(promise12);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
        org.junit.Assert.assertNotNull(promise7);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.any(promiseArray0);
        java.lang.Class<?> wildcardClass5 = promiseArray0.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.CharSequence> objPromise1 = cn.showcodes.promise.Promise.reject((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNotNull(objPromise1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.Object> objPromise6 = cn.showcodes.promise.Promise.reject((java.lang.Object) promise5);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(objPromise6);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise<java.lang.Object, java.util.AbstractCollection<cn.showcodes.promise.Promise>> objPromise32 = cn.showcodes.promise.Promise.reject((java.util.AbstractCollection<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(objPromise32);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise37 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(promise37);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.any(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise promise11 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.any(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray13 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray13);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.allSettled(promiseArray13);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.all(promiseArray13);
        cn.showcodes.promise.Promise promise17 = cn.showcodes.promise.Promise.race(promiseArray13);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise18 = cn.showcodes.promise.Promise.reject(promise17);
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.Object> objPromise20 = cn.showcodes.promise.Promise.reject((java.lang.Object) (short) 1);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.Object> objPromise24 = cn.showcodes.promise.Promise.reject((java.lang.Object) (short) 1);
        cn.showcodes.promise.Promise[] promiseArray25 = new cn.showcodes.promise.Promise[] { promise5, promise12, objPromise18, objPromise20, promise22, objPromise24 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList26 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList26, promiseArray25);
        cn.showcodes.promise.Promise promise28 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList26);
        cn.showcodes.promise.Promise promise29 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList26);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList26);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promise11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promiseArray13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promise17);
        org.junit.Assert.assertNotNull(objPromise18);
        org.junit.Assert.assertNotNull(objPromise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(objPromise24);
        org.junit.Assert.assertNotNull(promiseArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(promise28);
        org.junit.Assert.assertNotNull(promise29);
        org.junit.Assert.assertNotNull(promise30);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise<java.lang.Object, java.util.AbstractList<cn.showcodes.promise.Promise>> objPromise32 = cn.showcodes.promise.Promise.reject((java.util.AbstractList<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(objPromise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.all(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        java.util.function.Supplier<cn.showcodes.promise.Promise> promiseSupplier0 = null;
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.retry(promiseSupplier0, (int) (short) 0);
        org.junit.Assert.assertNotNull(promise2);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise37 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(promise37);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.race(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise[] promiseArray33 = new cn.showcodes.promise.Promise[] { promise32 };
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.race(promiseArray33);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.race(promiseArray33);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promiseArray33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise11 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray0);
        java.lang.Class<?> wildcardClass13 = promise12.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promise11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.all(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.all(promiseArray0);
        java.lang.Class<?> wildcardClass9 = promiseArray0.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise37 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise38 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise39 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(promise37);
        org.junit.Assert.assertNotNull(promise38);
        org.junit.Assert.assertNotNull(promise39);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise<java.lang.Object, java.util.List<cn.showcodes.promise.Promise>> objPromise31 = cn.showcodes.promise.Promise.reject((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(objPromise31);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.race(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.any(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
        org.junit.Assert.assertNotNull(promise7);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise[] promiseArray33 = new cn.showcodes.promise.Promise[] { promise32 };
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.race(promiseArray33);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.all(promiseArray33);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise36 = cn.showcodes.promise.Promise.reject(promise35);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise37 = cn.showcodes.promise.Promise.reject((cn.showcodes.promise.Promise) objPromise36);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promiseArray33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(objPromise36);
        org.junit.Assert.assertNotNull(objPromise37);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise37 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        java.lang.Class<?> wildcardClass38 = promiseList28.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(promise37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise7 = cn.showcodes.promise.Promise.reject(promise6);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
        org.junit.Assert.assertNotNull(objPromise7);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.any(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise37 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise38 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise39 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(promise37);
        org.junit.Assert.assertNotNull(promise38);
        org.junit.Assert.assertNotNull(promise39);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise<java.lang.Object, java.lang.Object> objPromise33 = cn.showcodes.promise.Promise.reject((java.lang.Object) promise32);
        java.lang.Class<?> wildcardClass34 = objPromise33.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(objPromise33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise[] promiseArray33 = new cn.showcodes.promise.Promise[] { promise32 };
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.race(promiseArray33);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.allSettled(promiseArray33);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.allSettled(promiseArray33);
        cn.showcodes.promise.Promise promise37 = cn.showcodes.promise.Promise.all(promiseArray33);
        cn.showcodes.promise.Promise promise38 = cn.showcodes.promise.Promise.any(promiseArray33);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promiseArray33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(promise37);
        org.junit.Assert.assertNotNull(promise38);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise<java.lang.Object, java.util.Collection<cn.showcodes.promise.Promise>> objPromise33 = cn.showcodes.promise.Promise.reject((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise37 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise<java.lang.Object, java.util.List<cn.showcodes.promise.Promise>> objPromise38 = cn.showcodes.promise.Promise.reject((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(objPromise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(promise37);
        org.junit.Assert.assertNotNull(objPromise38);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.race(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise37 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise38 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise39 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise40 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise41 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise42 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(promise37);
        org.junit.Assert.assertNotNull(promise38);
        org.junit.Assert.assertNotNull(promise39);
        org.junit.Assert.assertNotNull(promise40);
        org.junit.Assert.assertNotNull(promise41);
        org.junit.Assert.assertNotNull(promise42);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise37 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise38 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise39 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(promise37);
        org.junit.Assert.assertNotNull(promise38);
        org.junit.Assert.assertNotNull(promise39);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise11 = cn.showcodes.promise.Promise.all(promiseArray0);
        java.lang.Class<?> wildcardClass12 = promiseArray0.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promise11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise[] promiseArray33 = new cn.showcodes.promise.Promise[] { promise32 };
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.race(promiseArray33);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.all(promiseArray33);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.all(promiseArray33);
        cn.showcodes.promise.Promise promise37 = cn.showcodes.promise.Promise.all(promiseArray33);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promiseArray33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(promise37);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise6 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
        org.junit.Assert.assertNotNull(promise6);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise37 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise38 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise<java.lang.Object, java.util.AbstractCollection<cn.showcodes.promise.Promise>> objPromise39 = cn.showcodes.promise.Promise.reject((java.util.AbstractCollection<cn.showcodes.promise.Promise>) promiseList28);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
        org.junit.Assert.assertNotNull(promise37);
        org.junit.Assert.assertNotNull(promise38);
        org.junit.Assert.assertNotNull(objPromise39);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise[] promiseArray33 = new cn.showcodes.promise.Promise[] { promise32 };
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.race(promiseArray33);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.all(promiseArray33);
        cn.showcodes.promise.Promise promise36 = cn.showcodes.promise.Promise.any(promiseArray33);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promiseArray33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(promise36);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.any(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise5 = cn.showcodes.promise.Promise.race(promiseArray0);
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(promise5);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        cn.showcodes.promise.Promise[] promiseArray0 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise1 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise2 = cn.showcodes.promise.Promise.allSettled(promiseArray0);
        cn.showcodes.promise.Promise promise3 = cn.showcodes.promise.Promise.all(promiseArray0);
        cn.showcodes.promise.Promise promise4 = cn.showcodes.promise.Promise.race(promiseArray0);
        cn.showcodes.promise.Promise<java.lang.Object, cn.showcodes.promise.Promise> objPromise5 = cn.showcodes.promise.Promise.reject(promise4);
        cn.showcodes.promise.Promise[] promiseArray6 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise7 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise8 = cn.showcodes.promise.Promise.allSettled(promiseArray6);
        cn.showcodes.promise.Promise promise9 = cn.showcodes.promise.Promise.all(promiseArray6);
        cn.showcodes.promise.Promise promise10 = cn.showcodes.promise.Promise.race(promiseArray6);
        cn.showcodes.promise.Promise[] promiseArray11 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise12 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise13 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise promise14 = cn.showcodes.promise.Promise.all(promiseArray11);
        cn.showcodes.promise.Promise promise15 = cn.showcodes.promise.Promise.race(promiseArray11);
        cn.showcodes.promise.Promise promise16 = cn.showcodes.promise.Promise.allSettled(promiseArray11);
        cn.showcodes.promise.Promise[] promiseArray17 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise18 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise promise19 = cn.showcodes.promise.Promise.allSettled(promiseArray17);
        cn.showcodes.promise.Promise promise20 = cn.showcodes.promise.Promise.all(promiseArray17);
        cn.showcodes.promise.Promise[] promiseArray21 = new cn.showcodes.promise.Promise[] {};
        cn.showcodes.promise.Promise promise22 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise23 = cn.showcodes.promise.Promise.allSettled(promiseArray21);
        cn.showcodes.promise.Promise promise24 = cn.showcodes.promise.Promise.all(promiseArray21);
        cn.showcodes.promise.Promise promise25 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise promise26 = cn.showcodes.promise.Promise.race(promiseArray21);
        cn.showcodes.promise.Promise[] promiseArray27 = new cn.showcodes.promise.Promise[] { promise4, promise10, promise16, promise20, promise26 };
        java.util.ArrayList<cn.showcodes.promise.Promise> promiseList28 = new java.util.ArrayList<cn.showcodes.promise.Promise>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<cn.showcodes.promise.Promise>) promiseList28, promiseArray27);
        cn.showcodes.promise.Promise promise30 = cn.showcodes.promise.Promise.any((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise31 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise32 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise33 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise34 = cn.showcodes.promise.Promise.allSettled((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        cn.showcodes.promise.Promise promise35 = cn.showcodes.promise.Promise.all((java.util.List<cn.showcodes.promise.Promise>) promiseList28);
        java.lang.Class<?> wildcardClass36 = promiseList28.getClass();
        org.junit.Assert.assertNotNull(promiseArray0);
        org.junit.Assert.assertNotNull(promise1);
        org.junit.Assert.assertNotNull(promise2);
        org.junit.Assert.assertNotNull(promise3);
        org.junit.Assert.assertNotNull(promise4);
        org.junit.Assert.assertNotNull(objPromise5);
        org.junit.Assert.assertNotNull(promiseArray6);
        org.junit.Assert.assertNotNull(promise7);
        org.junit.Assert.assertNotNull(promise8);
        org.junit.Assert.assertNotNull(promise9);
        org.junit.Assert.assertNotNull(promise10);
        org.junit.Assert.assertNotNull(promiseArray11);
        org.junit.Assert.assertNotNull(promise12);
        org.junit.Assert.assertNotNull(promise13);
        org.junit.Assert.assertNotNull(promise14);
        org.junit.Assert.assertNotNull(promise15);
        org.junit.Assert.assertNotNull(promise16);
        org.junit.Assert.assertNotNull(promiseArray17);
        org.junit.Assert.assertNotNull(promise18);
        org.junit.Assert.assertNotNull(promise19);
        org.junit.Assert.assertNotNull(promise20);
        org.junit.Assert.assertNotNull(promiseArray21);
        org.junit.Assert.assertNotNull(promise22);
        org.junit.Assert.assertNotNull(promise23);
        org.junit.Assert.assertNotNull(promise24);
        org.junit.Assert.assertNotNull(promise25);
        org.junit.Assert.assertNotNull(promise26);
        org.junit.Assert.assertNotNull(promiseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(promise30);
        org.junit.Assert.assertNotNull(promise31);
        org.junit.Assert.assertNotNull(promise32);
        org.junit.Assert.assertNotNull(promise33);
        org.junit.Assert.assertNotNull(promise34);
        org.junit.Assert.assertNotNull(promise35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }
}

