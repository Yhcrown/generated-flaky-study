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
        java.util.function.Supplier<java.lang.String> strSupplier0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.util.function.Consumer<java.lang.String> strConsumer2 = null;
        java.lang.String[] strArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result4 = sh.nerd.async.process.AsyncProcess.run(strSupplier0, strConsumer1, strConsumer2, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.util.function.Supplier<java.lang.String> strSupplier0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.util.function.Consumer<java.lang.String> strConsumer2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result9 = sh.nerd.async.process.AsyncProcess.run(strSupplier0, strConsumer1, strConsumer2, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.lang.String[] strArray1 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result2 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.util.concurrent.Executor executor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.executor(executor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.lang.Class<?> wildcardClass15 = strArray12.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result9 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strConsumer1, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result15 = sh.nerd.async.process.AsyncProcess.run(strArray12);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder16 = builder6.env(strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder6.cmd(strArray20);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result24 = builder6.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder14 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder15 = builder7.cmd(strArray13);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result16 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd(file9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result8 = sh.nerd.async.process.AsyncProcess.run(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd(file9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder9 = builder7.out(strConsumer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        java.util.function.Supplier<java.lang.String> strSupplier0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.util.function.Consumer<java.lang.String> strConsumer2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder9 = sh.nerd.async.process.AsyncProcess.cmd(strArray8);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = sh.nerd.async.process.AsyncProcess.cmd(strArray8);
        sh.nerd.async.process.AsyncProcess.Builder builder11 = sh.nerd.async.process.AsyncProcess.cmd(strArray8);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result12 = sh.nerd.async.process.AsyncProcess.run(strSupplier0, strConsumer1, strConsumer2, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder6.cmd(strArray20);
        java.io.File file24 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder25 = builder6.cwd(file24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory1 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory3 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable4 = null;
        java.lang.Thread thread5 = namedThreadFactory3.newThread(runnable4);
        java.lang.Thread thread6 = namedThreadFactory1.newThread((java.lang.Runnable) thread5);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory8 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory10 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable11 = null;
        java.lang.Thread thread12 = namedThreadFactory10.newThread(runnable11);
        java.lang.Thread thread13 = namedThreadFactory8.newThread((java.lang.Runnable) thread12);
        java.lang.Thread thread14 = namedThreadFactory1.newThread((java.lang.Runnable) thread12);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory16 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory18 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable19 = null;
        java.lang.Thread thread20 = namedThreadFactory18.newThread(runnable19);
        java.lang.Thread thread21 = namedThreadFactory16.newThread((java.lang.Runnable) thread20);
        java.lang.Thread thread22 = namedThreadFactory1.newThread((java.lang.Runnable) thread21);
        org.junit.Assert.assertNotNull(namedThreadFactory1);
        org.junit.Assert.assertNotNull(namedThreadFactory3);
        org.junit.Assert.assertNotNull(thread5);
        org.junit.Assert.assertEquals(thread5.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread6);
        org.junit.Assert.assertEquals(thread6.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory8);
        org.junit.Assert.assertNotNull(namedThreadFactory10);
        org.junit.Assert.assertNotNull(thread12);
        org.junit.Assert.assertEquals(thread12.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread13);
        org.junit.Assert.assertEquals(thread13.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread14);
        org.junit.Assert.assertEquals(thread14.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory16);
        org.junit.Assert.assertNotNull(namedThreadFactory18);
        org.junit.Assert.assertNotNull(thread20);
        org.junit.Assert.assertEquals(thread20.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread21);
        org.junit.Assert.assertEquals(thread21.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread22);
        org.junit.Assert.assertEquals(thread22.toString(), "Thread[hi!-2,5,main]");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.err(strConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result9 = sh.nerd.async.process.AsyncProcess.run(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        sh.nerd.async.process.AsyncProcess.Builder builder2 = builder0.cwd("");
        java.util.function.Consumer<java.lang.String> strConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder4 = builder2.out(strConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.env(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder16 = builder14.env(strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder14 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder15 = builder7.cmd(strArray13);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray21);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = sh.nerd.async.process.AsyncProcess.cmd(strArray21);
        sh.nerd.async.process.AsyncProcess.Builder builder24 = builder7.cmd(strArray21);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray21);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result26 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder9 = builder7.env(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result9 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result8 = builder7.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        sh.nerd.async.process.AsyncProcess.Builder builder9 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result10 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strConsumer1, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result7 = sh.nerd.async.process.AsyncProcess.run(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.util.function.Consumer<java.lang.String> strConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.out(strConsumer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.err(strConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder15 = sh.nerd.async.process.AsyncProcess.cmd(strArray14);
        sh.nerd.async.process.AsyncProcess.Builder builder16 = builder8.cmd(strArray14);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder23 = sh.nerd.async.process.AsyncProcess.cmd(strArray22);
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray22);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder8.cmd(strArray22);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result26 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strConsumer1, strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder15 = sh.nerd.async.process.AsyncProcess.cmd(strArray14);
        sh.nerd.async.process.AsyncProcess.Builder builder16 = builder8.cmd(strArray14);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder23 = sh.nerd.async.process.AsyncProcess.cmd(strArray22);
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray22);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder8.cmd(strArray22);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray22);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result27 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strConsumer1, strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder8.env(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.out(strConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder6.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder6.cwd("");
        java.util.function.Consumer<java.lang.String> strConsumer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder27 = builder6.err(strConsumer26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder15 = sh.nerd.async.process.AsyncProcess.cmd(strArray14);
        sh.nerd.async.process.AsyncProcess.Builder builder16 = builder8.cmd(strArray14);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result17 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strConsumer1, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder6.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        java.util.concurrent.Executor executor25 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder26 = builder24.executor(executor25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.util.function.Supplier<java.lang.String> strSupplier15 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder16 = builder14.in(strSupplier15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory1 = sh.nerd.async.process.NamedThreadFactory.withPrefix("");
        java.lang.Class<?> wildcardClass2 = namedThreadFactory1.getClass();
        org.junit.Assert.assertNotNull(namedThreadFactory1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.out(strConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        java.util.function.Supplier<java.lang.String> strSupplier0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.util.function.Consumer<java.lang.String> strConsumer2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder9 = sh.nerd.async.process.AsyncProcess.cmd(strArray8);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result10 = sh.nerd.async.process.AsyncProcess.run(strSupplier0, strConsumer1, strConsumer2, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.Class<?> wildcardClass19 = builder10.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder6.cmd(strArray20);
        java.util.function.Consumer<java.lang.String> strConsumer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder25 = builder23.err(strConsumer24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder6.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        java.util.function.Consumer<java.lang.String> strConsumer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder26 = builder24.out(strConsumer25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.util.function.Supplier<java.lang.String> strSupplier8 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder9 = builder7.in(strSupplier8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        sh.nerd.async.process.AsyncProcess.Builder builder9 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result11 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strConsumer1, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        java.util.concurrent.Executor executor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.executor(executor9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        sh.nerd.async.process.AsyncProcess.Builder builder2 = builder0.cwd("");
        java.util.function.Consumer<java.lang.String> strConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder4 = builder0.out(strConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder10.cmd(strArray24);
        java.util.Map<java.lang.String, java.lang.String> strMap28 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.env(strMap28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        java.util.function.Supplier<java.lang.String> strSupplier0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.util.function.Consumer<java.lang.String> strConsumer2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder9 = sh.nerd.async.process.AsyncProcess.cmd(strArray8);
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder9.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder13 = builder9.cwd("");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder20 = sh.nerd.async.process.AsyncProcess.cmd(strArray19);
        sh.nerd.async.process.AsyncProcess.Builder builder21 = builder13.cmd(strArray19);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result22 = sh.nerd.async.process.AsyncProcess.run(strSupplier0, strConsumer1, strConsumer2, strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.util.function.Consumer<java.lang.String> strConsumer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder16 = builder6.err(strConsumer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder10.cwd("hi!");
        java.util.function.Consumer<java.lang.String> strConsumer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder22 = builder10.err(strConsumer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder8.env(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder6.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        java.lang.Class<?> wildcardClass25 = builder24.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder10.cwd("hi!");
        java.util.function.Supplier<java.lang.String> strSupplier21 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder22 = builder10.in(strSupplier21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.io.File file15 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder16 = builder14.cwd(file15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder10.cwd("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder22 = builder10.env(strMap21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.cwd(file11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder10.cwd("hi!");
        java.util.concurrent.Executor executor21 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder22 = builder10.executor(executor21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.util.function.Consumer<java.lang.String> strConsumer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder16 = builder6.out(strConsumer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.util.function.Supplier<java.lang.String> strSupplier0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.util.function.Consumer<java.lang.String> strConsumer2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder9 = sh.nerd.async.process.AsyncProcess.cmd(strArray8);
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder9.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder13 = builder9.cwd("");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder20 = sh.nerd.async.process.AsyncProcess.cmd(strArray19);
        sh.nerd.async.process.AsyncProcess.Builder builder21 = builder13.cmd(strArray19);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder28 = sh.nerd.async.process.AsyncProcess.cmd(strArray27);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = sh.nerd.async.process.AsyncProcess.cmd(strArray27);
        sh.nerd.async.process.AsyncProcess.Builder builder30 = builder13.cmd(strArray27);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result31 = sh.nerd.async.process.AsyncProcess.run(strSupplier0, strConsumer1, strConsumer2, strArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.in(strSupplier9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.cwd("hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray18);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray25);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder19.cmd(strArray25);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder34 = sh.nerd.async.process.AsyncProcess.cmd(strArray33);
        sh.nerd.async.process.AsyncProcess.Builder builder35 = sh.nerd.async.process.AsyncProcess.cmd(strArray33);
        sh.nerd.async.process.AsyncProcess.Builder builder36 = builder19.cmd(strArray33);
        sh.nerd.async.process.AsyncProcess.Builder builder37 = builder12.cmd(strArray33);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result38 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strConsumer1, strArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder10.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        java.util.function.Consumer<java.lang.String> strConsumer30 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder31 = builder27.out(strConsumer30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = builder10.cmd(strArray24);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result27 = builder10.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\" (in directory \"\"): error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.err(strConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.util.function.Supplier<java.lang.String> strSupplier11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder8.in(strSupplier11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result11 = builder10.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\" (in directory \"\"): error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.util.concurrent.Executor executor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder9 = builder7.executor(executor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder15 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        java.util.function.Supplier<java.lang.String> strSupplier16 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder17 = builder15.in(strSupplier16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder8.env(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder10.cmd(strArray16);
        java.util.function.Consumer<java.lang.String> strConsumer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder22 = builder20.out(strConsumer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder10.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder22 = builder20.cwd("");
        java.util.function.Consumer<java.lang.String> strConsumer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder24 = builder20.err(strConsumer23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder10.cmd(strArray24);
        java.io.File file28 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd(file28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.lang.Class<?> wildcardClass11 = builder8.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder8.cwd("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray18);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder12.cmd(strArray18);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result21 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strConsumer1, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder9 = builder7.cwd("hi!");
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder11 = builder9.out(strConsumer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder6.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result25 = sh.nerd.async.process.AsyncProcess.run(strArray20);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder14 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = builder14.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder7.cmd(strArray20);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result24 = sh.nerd.async.process.AsyncProcess.run(strArray20);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        sh.nerd.async.process.AsyncProcess.Builder builder9 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.cwd("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray18);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = sh.nerd.async.process.AsyncProcess.cmd(strArray18);
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray18);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = builder12.cmd(strArray18);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result23 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strConsumer1, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory1 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory3 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable4 = null;
        java.lang.Thread thread5 = namedThreadFactory3.newThread(runnable4);
        java.lang.Thread thread6 = namedThreadFactory1.newThread((java.lang.Runnable) thread5);
        java.lang.Class<?> wildcardClass7 = namedThreadFactory1.getClass();
        org.junit.Assert.assertNotNull(namedThreadFactory1);
        org.junit.Assert.assertNotNull(namedThreadFactory3);
        org.junit.Assert.assertNotNull(thread5);
        org.junit.Assert.assertEquals(thread5.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread6);
        org.junit.Assert.assertEquals(thread6.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder10.cwd("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder22 = builder10.env(strMap21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        sh.nerd.async.process.AsyncProcess.Builder builder2 = builder0.cwd("");
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder4 = builder2.cwd(file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder9 = builder7.cwd("hi!");
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result10 = builder9.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\" (in directory \"hi!\"): error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        java.util.function.Supplier<java.lang.String> strSupplier0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.util.function.Consumer<java.lang.String> strConsumer2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder9 = sh.nerd.async.process.AsyncProcess.cmd(strArray8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder16 = sh.nerd.async.process.AsyncProcess.cmd(strArray15);
        sh.nerd.async.process.AsyncProcess.Builder builder17 = builder9.cmd(strArray15);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = sh.nerd.async.process.AsyncProcess.cmd(strArray15);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result19 = sh.nerd.async.process.AsyncProcess.run(strSupplier0, strConsumer1, strConsumer2, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder10.cmd(strArray16);
        java.io.File file21 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder22 = builder20.cwd(file21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder6.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder6.cwd("");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder27 = builder6.env(strMap26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder14 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = builder14.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder7.cmd(strArray20);
        java.io.File file24 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder25 = builder23.cwd(file24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder8.cwd(file11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.err(strConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        java.util.concurrent.Executor executor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder8.executor(executor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        sh.nerd.async.process.AsyncProcess.Builder builder2 = builder0.cwd("");
        java.util.function.Consumer<java.lang.String> strConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder4 = builder0.err(strConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result9 = builder8.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\" (in directory \"\"): error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder8.env(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.Class<?> wildcardClass19 = builder18.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.cwd(file11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result9 = builder6.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\" (in directory \"hi!\"): error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.in(strSupplier9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder20 = builder10.env(strMap19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder10.cwd("hi!");
        java.util.function.Consumer<java.lang.String> strConsumer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder22 = builder20.out(strConsumer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder8.err(strConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder6.cwd("");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder14 = builder12.env(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = builder10.cmd(strArray24);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result27 = sh.nerd.async.process.AsyncProcess.run(strArray24);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder8.cmd(strArray23);
        java.io.File file28 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd(file28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder10.cmd(strArray16);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result21 = sh.nerd.async.process.AsyncProcess.run(strArray16);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder8.env(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder14 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder15 = builder7.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder16 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result17 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder6.cwd(file11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder6.cwd("");
        java.io.File file13 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder14 = builder12.cwd(file13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder32 = sh.nerd.async.process.AsyncProcess.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder33 = sh.nerd.async.process.AsyncProcess.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder34 = builder17.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder35 = builder10.cmd(strArray31);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result36 = builder10.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\" (in directory \"hi!\"): error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.io.File file21 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder22 = builder18.cwd(file21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.env(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        sh.nerd.async.process.AsyncProcess.Builder builder2 = builder0.cwd("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder4 = builder2.env(strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder9 = builder7.cwd("hi!");
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder11 = builder7.cwd(file10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder29.cwd("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder45 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder46 = builder38.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder29.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = builder20.cmd(strArray44);
        java.util.function.Consumer<java.lang.String> strConsumer50 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder51 = builder20.err(strConsumer50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.in(strSupplier9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder6.cmd(strArray20);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder30 = sh.nerd.async.process.AsyncProcess.cmd(strArray29);
        sh.nerd.async.process.AsyncProcess.Builder builder32 = builder30.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder34 = builder30.cwd("");
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder41 = sh.nerd.async.process.AsyncProcess.cmd(strArray40);
        sh.nerd.async.process.AsyncProcess.Builder builder42 = builder34.cmd(strArray40);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder49 = sh.nerd.async.process.AsyncProcess.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder50 = sh.nerd.async.process.AsyncProcess.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder34.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder52 = builder6.cmd(strArray48);
        java.util.function.Supplier<java.lang.String> strSupplier53 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder54 = builder52.in(strSupplier53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        sh.nerd.async.process.AsyncProcess.Builder builder9 = builder7.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder7.cwd("");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder18 = sh.nerd.async.process.AsyncProcess.cmd(strArray17);
        sh.nerd.async.process.AsyncProcess.Builder builder19 = builder11.cmd(strArray17);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray25);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray25);
        sh.nerd.async.process.AsyncProcess.Builder builder28 = builder11.cmd(strArray25);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result29 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.env(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder8.cwd("");
        java.util.function.Supplier<java.lang.String> strSupplier13 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder14 = builder8.in(strSupplier13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.env(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder14 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder15 = builder7.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder16 = builder0.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder0.cwd("hi!");
        java.io.File file19 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder20 = builder0.cwd(file19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.util.function.Supplier<java.lang.String> strSupplier7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.in(strSupplier7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder32 = sh.nerd.async.process.AsyncProcess.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder33 = sh.nerd.async.process.AsyncProcess.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder34 = builder17.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder35 = builder10.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder36 = sh.nerd.async.process.AsyncProcess.cmd(strArray31);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result37 = sh.nerd.async.process.AsyncProcess.run(strArray31);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder10.cmd(strArray24);
        java.lang.Class<?> wildcardClass28 = builder27.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder16 = builder14.env(strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory1 = sh.nerd.async.process.NamedThreadFactory.withPrefix("");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory3 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable4 = null;
        java.lang.Thread thread5 = namedThreadFactory3.newThread(runnable4);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory7 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable8 = null;
        java.lang.Thread thread9 = namedThreadFactory7.newThread(runnable8);
        java.lang.Thread thread10 = namedThreadFactory3.newThread(runnable8);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory12 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory14 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable15 = null;
        java.lang.Thread thread16 = namedThreadFactory14.newThread(runnable15);
        java.lang.Thread thread17 = namedThreadFactory12.newThread((java.lang.Runnable) thread16);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory19 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory21 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable22 = null;
        java.lang.Thread thread23 = namedThreadFactory21.newThread(runnable22);
        java.lang.Thread thread24 = namedThreadFactory19.newThread((java.lang.Runnable) thread23);
        java.lang.Thread thread25 = namedThreadFactory12.newThread((java.lang.Runnable) thread23);
        java.lang.Thread thread26 = namedThreadFactory3.newThread((java.lang.Runnable) thread23);
        java.lang.Thread thread27 = namedThreadFactory1.newThread((java.lang.Runnable) thread23);
        java.lang.Class<?> wildcardClass28 = thread27.getClass();
        org.junit.Assert.assertNotNull(namedThreadFactory1);
        org.junit.Assert.assertNotNull(namedThreadFactory3);
        org.junit.Assert.assertNotNull(thread5);
        org.junit.Assert.assertEquals(thread5.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory7);
        org.junit.Assert.assertNotNull(thread9);
        org.junit.Assert.assertEquals(thread9.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread10);
        org.junit.Assert.assertEquals(thread10.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory12);
        org.junit.Assert.assertNotNull(namedThreadFactory14);
        org.junit.Assert.assertNotNull(thread16);
        org.junit.Assert.assertEquals(thread16.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread17);
        org.junit.Assert.assertEquals(thread17.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory19);
        org.junit.Assert.assertNotNull(namedThreadFactory21);
        org.junit.Assert.assertNotNull(thread23);
        org.junit.Assert.assertEquals(thread23.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread24);
        org.junit.Assert.assertEquals(thread24.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread25);
        org.junit.Assert.assertEquals(thread25.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread26);
        org.junit.Assert.assertEquals(thread26.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(thread27);
        org.junit.Assert.assertEquals(thread27.toString(), "Thread[-0,5,main]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder32 = sh.nerd.async.process.AsyncProcess.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder33 = sh.nerd.async.process.AsyncProcess.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder34 = builder17.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder35 = builder10.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder36 = sh.nerd.async.process.AsyncProcess.cmd(strArray31);
        java.lang.String[] strArray37 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder38 = builder36.cmd(strArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.util.function.Supplier<java.lang.String> strSupplier0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.util.function.Consumer<java.lang.String> strConsumer2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder9 = sh.nerd.async.process.AsyncProcess.cmd(strArray8);
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder9.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder13 = builder11.cwd("hi!");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder20 = sh.nerd.async.process.AsyncProcess.cmd(strArray19);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder28 = builder20.cmd(strArray26);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder35 = sh.nerd.async.process.AsyncProcess.cmd(strArray34);
        sh.nerd.async.process.AsyncProcess.Builder builder36 = sh.nerd.async.process.AsyncProcess.cmd(strArray34);
        sh.nerd.async.process.AsyncProcess.Builder builder37 = builder20.cmd(strArray34);
        sh.nerd.async.process.AsyncProcess.Builder builder38 = builder13.cmd(strArray34);
        sh.nerd.async.process.AsyncProcess.Builder builder39 = sh.nerd.async.process.AsyncProcess.cmd(strArray34);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result40 = sh.nerd.async.process.AsyncProcess.run(strSupplier0, strConsumer1, strConsumer2, strArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.util.function.Supplier<java.lang.String> strSupplier11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder6.in(strSupplier11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder10.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result30 = builder27.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\" (in directory \"\"): error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.env(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.util.concurrent.Executor executor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder20 = builder10.executor(executor19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder1 = sh.nerd.async.process.AsyncProcess.cmd(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder29.cwd("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder45 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder46 = builder38.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder29.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = builder20.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder49.cwd("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap52 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder53 = builder49.env(strMap52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.cwd("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray18);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray25);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder19.cmd(strArray25);
        sh.nerd.async.process.AsyncProcess.Builder builder28 = sh.nerd.async.process.AsyncProcess.cmd(strArray25);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder10.cmd(strArray25);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result30 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strConsumer1, strArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder14 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder15 = builder7.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder16 = builder0.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder0.cwd("hi!");
        java.util.function.Consumer<java.lang.String> strConsumer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder20 = builder0.out(strConsumer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder10.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder30 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder37 = sh.nerd.async.process.AsyncProcess.cmd(strArray36);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder44 = sh.nerd.async.process.AsyncProcess.cmd(strArray43);
        sh.nerd.async.process.AsyncProcess.Builder builder45 = builder37.cmd(strArray43);
        sh.nerd.async.process.AsyncProcess.Builder builder46 = builder30.cmd(strArray43);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = builder27.cmd(strArray43);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result48 = builder47.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\" (in directory \"\"): error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder6.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        java.util.Map<java.lang.String, java.lang.String> strMap25 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder26 = builder24.env(strMap25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory1 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable2 = null;
        java.lang.Thread thread3 = namedThreadFactory1.newThread(runnable2);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory5 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable6 = null;
        java.lang.Thread thread7 = namedThreadFactory5.newThread(runnable6);
        java.lang.Thread thread8 = namedThreadFactory1.newThread(runnable6);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory10 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory12 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable13 = null;
        java.lang.Thread thread14 = namedThreadFactory12.newThread(runnable13);
        java.lang.Thread thread15 = namedThreadFactory10.newThread((java.lang.Runnable) thread14);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory17 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory19 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable20 = null;
        java.lang.Thread thread21 = namedThreadFactory19.newThread(runnable20);
        java.lang.Thread thread22 = namedThreadFactory17.newThread((java.lang.Runnable) thread21);
        java.lang.Thread thread23 = namedThreadFactory10.newThread((java.lang.Runnable) thread21);
        java.lang.Thread thread24 = namedThreadFactory1.newThread((java.lang.Runnable) thread21);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory26 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable27 = null;
        java.lang.Thread thread28 = namedThreadFactory26.newThread(runnable27);
        java.lang.Thread thread29 = namedThreadFactory1.newThread(runnable27);
        org.junit.Assert.assertNotNull(namedThreadFactory1);
        org.junit.Assert.assertNotNull(thread3);
        org.junit.Assert.assertEquals(thread3.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory5);
        org.junit.Assert.assertNotNull(thread7);
        org.junit.Assert.assertEquals(thread7.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread8);
        org.junit.Assert.assertEquals(thread8.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory10);
        org.junit.Assert.assertNotNull(namedThreadFactory12);
        org.junit.Assert.assertNotNull(thread14);
        org.junit.Assert.assertEquals(thread14.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread15);
        org.junit.Assert.assertEquals(thread15.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory17);
        org.junit.Assert.assertNotNull(namedThreadFactory19);
        org.junit.Assert.assertNotNull(thread21);
        org.junit.Assert.assertEquals(thread21.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread22);
        org.junit.Assert.assertEquals(thread22.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread23);
        org.junit.Assert.assertEquals(thread23.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread24);
        org.junit.Assert.assertEquals(thread24.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory26);
        org.junit.Assert.assertNotNull(thread28);
        org.junit.Assert.assertEquals(thread28.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread29);
        org.junit.Assert.assertEquals(thread29.toString(), "Thread[hi!-3,5,main]");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder22 = builder20.env(strMap21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.cwd("hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray18);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray25);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder19.cmd(strArray25);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder34 = sh.nerd.async.process.AsyncProcess.cmd(strArray33);
        sh.nerd.async.process.AsyncProcess.Builder builder35 = sh.nerd.async.process.AsyncProcess.cmd(strArray33);
        sh.nerd.async.process.AsyncProcess.Builder builder36 = builder19.cmd(strArray33);
        sh.nerd.async.process.AsyncProcess.Builder builder37 = builder12.cmd(strArray33);
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray33);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result39 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strConsumer1, strArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder14 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder15 = builder7.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder16 = builder0.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder0.cwd("hi!");
        java.util.function.Consumer<java.lang.String> strConsumer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.err(strConsumer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder8.cwd("");
        java.util.concurrent.Executor executor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder14 = builder8.executor(executor13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder29.cwd("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder45 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder46 = builder38.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder29.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = builder20.cmd(strArray44);
        java.util.Map<java.lang.String, java.lang.String> strMap50 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder51 = builder49.env(strMap50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.env(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.env(strMap19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result11 = builder10.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\" (in directory \"\"): error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder32 = sh.nerd.async.process.AsyncProcess.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder33 = sh.nerd.async.process.AsyncProcess.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder34 = builder17.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder35 = builder10.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder36 = sh.nerd.async.process.AsyncProcess.cmd(strArray31);
        java.io.File file37 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder38 = builder36.cwd(file37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = builder10.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder28 = builder26.cwd("hi!");
        java.util.function.Supplier<java.lang.String> strSupplier29 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder30 = builder26.in(strSupplier29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.util.function.Consumer<java.lang.String> strConsumer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder22 = builder20.err(strConsumer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder27.cwd("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        sh.nerd.async.process.AsyncProcess.Builder builder39 = builder31.cmd(strArray37);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder46 = sh.nerd.async.process.AsyncProcess.cmd(strArray45);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = builder31.cmd(strArray45);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder20.cmd(strArray45);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result49 = sh.nerd.async.process.AsyncProcess.run(strArray45);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder14 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder15 = builder7.cmd(strArray13);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray21);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = sh.nerd.async.process.AsyncProcess.cmd(strArray21);
        sh.nerd.async.process.AsyncProcess.Builder builder24 = builder7.cmd(strArray21);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder31 = sh.nerd.async.process.AsyncProcess.cmd(strArray30);
        sh.nerd.async.process.AsyncProcess.Builder builder33 = builder31.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder35 = builder31.cwd("");
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder42 = sh.nerd.async.process.AsyncProcess.cmd(strArray41);
        sh.nerd.async.process.AsyncProcess.Builder builder43 = builder35.cmd(strArray41);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder50 = sh.nerd.async.process.AsyncProcess.cmd(strArray49);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = sh.nerd.async.process.AsyncProcess.cmd(strArray49);
        sh.nerd.async.process.AsyncProcess.Builder builder52 = builder35.cmd(strArray49);
        sh.nerd.async.process.AsyncProcess.Builder builder53 = builder7.cmd(strArray49);
        sh.nerd.async.process.AsyncProcess.Builder builder54 = sh.nerd.async.process.AsyncProcess.cmd(strArray49);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result55 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder14 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder15 = builder7.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder16 = builder0.cmd(strArray13);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder18 = builder16.env(strMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        sh.nerd.async.process.AsyncProcess.Builder builder9 = builder7.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder7.cwd("");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder18 = sh.nerd.async.process.AsyncProcess.cmd(strArray17);
        sh.nerd.async.process.AsyncProcess.Builder builder19 = builder11.cmd(strArray17);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result20 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        sh.nerd.async.process.AsyncProcess.Builder builder9 = builder7.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder7.cwd("");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder18 = sh.nerd.async.process.AsyncProcess.cmd(strArray17);
        sh.nerd.async.process.AsyncProcess.Builder builder19 = builder11.cmd(strArray17);
        sh.nerd.async.process.AsyncProcess.Builder builder21 = builder19.cwd("");
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder28 = sh.nerd.async.process.AsyncProcess.cmd(strArray27);
        sh.nerd.async.process.AsyncProcess.Builder builder30 = builder28.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder32 = builder28.cwd("");
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder39 = sh.nerd.async.process.AsyncProcess.cmd(strArray38);
        sh.nerd.async.process.AsyncProcess.Builder builder40 = builder32.cmd(strArray38);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder47 = sh.nerd.async.process.AsyncProcess.cmd(strArray46);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder32.cmd(strArray46);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = builder21.cmd(strArray46);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result50 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory1 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable2 = null;
        java.lang.Thread thread3 = namedThreadFactory1.newThread(runnable2);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory5 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable6 = null;
        java.lang.Thread thread7 = namedThreadFactory5.newThread(runnable6);
        java.lang.Thread thread8 = namedThreadFactory1.newThread(runnable6);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory10 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory12 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable13 = null;
        java.lang.Thread thread14 = namedThreadFactory12.newThread(runnable13);
        java.lang.Thread thread15 = namedThreadFactory10.newThread((java.lang.Runnable) thread14);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory17 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory19 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable20 = null;
        java.lang.Thread thread21 = namedThreadFactory19.newThread(runnable20);
        java.lang.Thread thread22 = namedThreadFactory17.newThread((java.lang.Runnable) thread21);
        java.lang.Thread thread23 = namedThreadFactory10.newThread((java.lang.Runnable) thread21);
        java.lang.Thread thread24 = namedThreadFactory1.newThread((java.lang.Runnable) thread21);
        java.lang.Class<?> wildcardClass25 = thread24.getClass();
        org.junit.Assert.assertNotNull(namedThreadFactory1);
        org.junit.Assert.assertNotNull(thread3);
        org.junit.Assert.assertEquals(thread3.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory5);
        org.junit.Assert.assertNotNull(thread7);
        org.junit.Assert.assertEquals(thread7.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread8);
        org.junit.Assert.assertEquals(thread8.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory10);
        org.junit.Assert.assertNotNull(namedThreadFactory12);
        org.junit.Assert.assertNotNull(thread14);
        org.junit.Assert.assertEquals(thread14.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread15);
        org.junit.Assert.assertEquals(thread15.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory17);
        org.junit.Assert.assertNotNull(namedThreadFactory19);
        org.junit.Assert.assertNotNull(thread21);
        org.junit.Assert.assertEquals(thread21.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread22);
        org.junit.Assert.assertEquals(thread22.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread23);
        org.junit.Assert.assertEquals(thread23.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread24);
        org.junit.Assert.assertEquals(thread24.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder14 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder15 = builder7.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder16 = builder0.cmd(strArray13);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result17 = builder16.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder10.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder30 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder37 = sh.nerd.async.process.AsyncProcess.cmd(strArray36);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder44 = sh.nerd.async.process.AsyncProcess.cmd(strArray43);
        sh.nerd.async.process.AsyncProcess.Builder builder45 = builder37.cmd(strArray43);
        sh.nerd.async.process.AsyncProcess.Builder builder46 = builder30.cmd(strArray43);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = builder27.cmd(strArray43);
        java.io.File file48 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder49 = builder27.cwd(file48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        java.util.concurrent.Executor executor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.executor(executor9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder10.cmd(strArray16);
        java.lang.Class<?> wildcardClass21 = strArray16.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder8.cwd("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray18);
        sh.nerd.async.process.AsyncProcess.Builder builder21 = builder19.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder19.cwd("");
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder30 = sh.nerd.async.process.AsyncProcess.cmd(strArray29);
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder23.cmd(strArray29);
        sh.nerd.async.process.AsyncProcess.Builder builder33 = builder31.cwd("");
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder40 = sh.nerd.async.process.AsyncProcess.cmd(strArray39);
        sh.nerd.async.process.AsyncProcess.Builder builder42 = builder40.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder44 = builder42.cwd("");
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder51 = sh.nerd.async.process.AsyncProcess.cmd(strArray50);
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder58 = sh.nerd.async.process.AsyncProcess.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder59 = builder51.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder60 = sh.nerd.async.process.AsyncProcess.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder61 = builder42.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder62 = builder33.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder63 = builder12.cmd(strArray57);
        java.util.concurrent.Executor executor64 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder65 = builder63.executor(executor64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.out(strConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory1 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable2 = null;
        java.lang.Thread thread3 = namedThreadFactory1.newThread(runnable2);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory5 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable6 = null;
        java.lang.Thread thread7 = namedThreadFactory5.newThread(runnable6);
        java.lang.Thread thread8 = namedThreadFactory1.newThread(runnable6);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory10 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable11 = null;
        java.lang.Thread thread12 = namedThreadFactory10.newThread(runnable11);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory14 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable15 = null;
        java.lang.Thread thread16 = namedThreadFactory14.newThread(runnable15);
        java.lang.Thread thread17 = namedThreadFactory10.newThread(runnable15);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory19 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory21 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable22 = null;
        java.lang.Thread thread23 = namedThreadFactory21.newThread(runnable22);
        java.lang.Thread thread24 = namedThreadFactory19.newThread((java.lang.Runnable) thread23);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory26 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory28 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable29 = null;
        java.lang.Thread thread30 = namedThreadFactory28.newThread(runnable29);
        java.lang.Thread thread31 = namedThreadFactory26.newThread((java.lang.Runnable) thread30);
        java.lang.Thread thread32 = namedThreadFactory19.newThread((java.lang.Runnable) thread30);
        java.lang.Thread thread33 = namedThreadFactory10.newThread((java.lang.Runnable) thread30);
        java.lang.Thread thread34 = namedThreadFactory1.newThread((java.lang.Runnable) thread33);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory36 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable37 = null;
        java.lang.Thread thread38 = namedThreadFactory36.newThread(runnable37);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory40 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable41 = null;
        java.lang.Thread thread42 = namedThreadFactory40.newThread(runnable41);
        java.lang.Thread thread43 = namedThreadFactory36.newThread(runnable41);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory45 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory47 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable48 = null;
        java.lang.Thread thread49 = namedThreadFactory47.newThread(runnable48);
        java.lang.Thread thread50 = namedThreadFactory45.newThread((java.lang.Runnable) thread49);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory52 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory54 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable55 = null;
        java.lang.Thread thread56 = namedThreadFactory54.newThread(runnable55);
        java.lang.Thread thread57 = namedThreadFactory52.newThread((java.lang.Runnable) thread56);
        java.lang.Thread thread58 = namedThreadFactory45.newThread((java.lang.Runnable) thread56);
        java.lang.Thread thread59 = namedThreadFactory36.newThread((java.lang.Runnable) thread56);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory61 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory63 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable64 = null;
        java.lang.Thread thread65 = namedThreadFactory63.newThread(runnable64);
        java.lang.Thread thread66 = namedThreadFactory61.newThread((java.lang.Runnable) thread65);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory68 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory70 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable71 = null;
        java.lang.Thread thread72 = namedThreadFactory70.newThread(runnable71);
        java.lang.Thread thread73 = namedThreadFactory68.newThread((java.lang.Runnable) thread72);
        java.lang.Thread thread74 = namedThreadFactory61.newThread((java.lang.Runnable) thread72);
        java.lang.Thread thread75 = namedThreadFactory36.newThread((java.lang.Runnable) thread74);
        java.lang.Thread thread76 = namedThreadFactory1.newThread((java.lang.Runnable) thread75);
        java.lang.Class<?> wildcardClass77 = namedThreadFactory1.getClass();
        org.junit.Assert.assertNotNull(namedThreadFactory1);
        org.junit.Assert.assertNotNull(thread3);
        org.junit.Assert.assertEquals(thread3.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory5);
        org.junit.Assert.assertNotNull(thread7);
        org.junit.Assert.assertEquals(thread7.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread8);
        org.junit.Assert.assertEquals(thread8.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory10);
        org.junit.Assert.assertNotNull(thread12);
        org.junit.Assert.assertEquals(thread12.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory14);
        org.junit.Assert.assertNotNull(thread16);
        org.junit.Assert.assertEquals(thread16.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread17);
        org.junit.Assert.assertEquals(thread17.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory19);
        org.junit.Assert.assertNotNull(namedThreadFactory21);
        org.junit.Assert.assertNotNull(thread23);
        org.junit.Assert.assertEquals(thread23.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread24);
        org.junit.Assert.assertEquals(thread24.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory26);
        org.junit.Assert.assertNotNull(namedThreadFactory28);
        org.junit.Assert.assertNotNull(thread30);
        org.junit.Assert.assertEquals(thread30.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread31);
        org.junit.Assert.assertEquals(thread31.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread32);
        org.junit.Assert.assertEquals(thread32.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread33);
        org.junit.Assert.assertEquals(thread33.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(thread34);
        org.junit.Assert.assertEquals(thread34.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory36);
        org.junit.Assert.assertNotNull(thread38);
        org.junit.Assert.assertEquals(thread38.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory40);
        org.junit.Assert.assertNotNull(thread42);
        org.junit.Assert.assertEquals(thread42.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread43);
        org.junit.Assert.assertEquals(thread43.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory45);
        org.junit.Assert.assertNotNull(namedThreadFactory47);
        org.junit.Assert.assertNotNull(thread49);
        org.junit.Assert.assertEquals(thread49.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread50);
        org.junit.Assert.assertEquals(thread50.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory52);
        org.junit.Assert.assertNotNull(namedThreadFactory54);
        org.junit.Assert.assertNotNull(thread56);
        org.junit.Assert.assertEquals(thread56.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread57);
        org.junit.Assert.assertEquals(thread57.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread58);
        org.junit.Assert.assertEquals(thread58.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread59);
        org.junit.Assert.assertEquals(thread59.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory61);
        org.junit.Assert.assertNotNull(namedThreadFactory63);
        org.junit.Assert.assertNotNull(thread65);
        org.junit.Assert.assertEquals(thread65.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread66);
        org.junit.Assert.assertEquals(thread66.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory68);
        org.junit.Assert.assertNotNull(namedThreadFactory70);
        org.junit.Assert.assertNotNull(thread72);
        org.junit.Assert.assertEquals(thread72.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread73);
        org.junit.Assert.assertEquals(thread73.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread74);
        org.junit.Assert.assertEquals(thread74.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread75);
        org.junit.Assert.assertEquals(thread75.toString(), "Thread[hi!-3,5,main]");
        org.junit.Assert.assertNotNull(thread76);
        org.junit.Assert.assertEquals(thread76.toString(), "Thread[hi!-3,5,main]");
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder6.cmd(strArray20);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder30 = sh.nerd.async.process.AsyncProcess.cmd(strArray29);
        sh.nerd.async.process.AsyncProcess.Builder builder32 = builder30.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder34 = builder30.cwd("");
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder41 = sh.nerd.async.process.AsyncProcess.cmd(strArray40);
        sh.nerd.async.process.AsyncProcess.Builder builder42 = builder34.cmd(strArray40);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder49 = sh.nerd.async.process.AsyncProcess.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder50 = sh.nerd.async.process.AsyncProcess.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder34.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder52 = builder6.cmd(strArray48);
        java.lang.Class<?> wildcardClass53 = strArray48.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder14 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = builder14.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder7.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder23.cwd("");
        java.util.function.Consumer<java.lang.String> strConsumer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder27 = builder25.err(strConsumer26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder32 = sh.nerd.async.process.AsyncProcess.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder33 = sh.nerd.async.process.AsyncProcess.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder34 = builder17.cmd(strArray31);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder41 = sh.nerd.async.process.AsyncProcess.cmd(strArray40);
        sh.nerd.async.process.AsyncProcess.Builder builder43 = builder41.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder45 = builder41.cwd("");
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder52 = sh.nerd.async.process.AsyncProcess.cmd(strArray51);
        sh.nerd.async.process.AsyncProcess.Builder builder53 = builder45.cmd(strArray51);
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder60 = sh.nerd.async.process.AsyncProcess.cmd(strArray59);
        sh.nerd.async.process.AsyncProcess.Builder builder61 = sh.nerd.async.process.AsyncProcess.cmd(strArray59);
        sh.nerd.async.process.AsyncProcess.Builder builder62 = builder45.cmd(strArray59);
        sh.nerd.async.process.AsyncProcess.Builder builder63 = builder17.cmd(strArray59);
        sh.nerd.async.process.AsyncProcess.Builder builder64 = builder10.cmd(strArray59);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result65 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strConsumer1, strArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        sh.nerd.async.process.AsyncProcess.Builder builder2 = builder0.cwd("");
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder4 = builder0.cwd(file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder15 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder16 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        java.util.function.Consumer<java.lang.String> strConsumer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder18 = builder16.err(strConsumer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder27.cwd("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        sh.nerd.async.process.AsyncProcess.Builder builder39 = builder31.cmd(strArray37);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder46 = sh.nerd.async.process.AsyncProcess.cmd(strArray45);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = builder31.cmd(strArray45);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder20.cmd(strArray45);
        java.util.Map<java.lang.String, java.lang.String> strMap49 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder50 = builder20.env(strMap49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder14 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder15 = builder7.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder16 = builder0.cmd(strArray13);
        java.lang.Class<?> wildcardClass17 = strArray13.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory1 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable2 = null;
        java.lang.Thread thread3 = namedThreadFactory1.newThread(runnable2);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory5 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory7 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable8 = null;
        java.lang.Thread thread9 = namedThreadFactory7.newThread(runnable8);
        java.lang.Thread thread10 = namedThreadFactory5.newThread((java.lang.Runnable) thread9);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory12 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory14 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable15 = null;
        java.lang.Thread thread16 = namedThreadFactory14.newThread(runnable15);
        java.lang.Thread thread17 = namedThreadFactory12.newThread((java.lang.Runnable) thread16);
        java.lang.Thread thread18 = namedThreadFactory5.newThread((java.lang.Runnable) thread16);
        java.lang.Thread thread19 = namedThreadFactory1.newThread((java.lang.Runnable) thread18);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory21 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable22 = null;
        java.lang.Thread thread23 = namedThreadFactory21.newThread(runnable22);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory25 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable26 = null;
        java.lang.Thread thread27 = namedThreadFactory25.newThread(runnable26);
        java.lang.Thread thread28 = namedThreadFactory21.newThread(runnable26);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory30 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory32 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable33 = null;
        java.lang.Thread thread34 = namedThreadFactory32.newThread(runnable33);
        java.lang.Thread thread35 = namedThreadFactory30.newThread((java.lang.Runnable) thread34);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory37 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory39 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable40 = null;
        java.lang.Thread thread41 = namedThreadFactory39.newThread(runnable40);
        java.lang.Thread thread42 = namedThreadFactory37.newThread((java.lang.Runnable) thread41);
        java.lang.Thread thread43 = namedThreadFactory30.newThread((java.lang.Runnable) thread41);
        java.lang.Thread thread44 = namedThreadFactory21.newThread((java.lang.Runnable) thread41);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory46 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory48 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable49 = null;
        java.lang.Thread thread50 = namedThreadFactory48.newThread(runnable49);
        java.lang.Thread thread51 = namedThreadFactory46.newThread((java.lang.Runnable) thread50);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory53 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory55 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable56 = null;
        java.lang.Thread thread57 = namedThreadFactory55.newThread(runnable56);
        java.lang.Thread thread58 = namedThreadFactory53.newThread((java.lang.Runnable) thread57);
        java.lang.Thread thread59 = namedThreadFactory46.newThread((java.lang.Runnable) thread57);
        java.lang.Thread thread60 = namedThreadFactory21.newThread((java.lang.Runnable) thread59);
        java.lang.Thread thread61 = namedThreadFactory1.newThread((java.lang.Runnable) thread60);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory63 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable64 = null;
        java.lang.Thread thread65 = namedThreadFactory63.newThread(runnable64);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory67 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory69 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable70 = null;
        java.lang.Thread thread71 = namedThreadFactory69.newThread(runnable70);
        java.lang.Thread thread72 = namedThreadFactory67.newThread((java.lang.Runnable) thread71);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory74 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory76 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable77 = null;
        java.lang.Thread thread78 = namedThreadFactory76.newThread(runnable77);
        java.lang.Thread thread79 = namedThreadFactory74.newThread((java.lang.Runnable) thread78);
        java.lang.Thread thread80 = namedThreadFactory67.newThread((java.lang.Runnable) thread78);
        java.lang.Thread thread81 = namedThreadFactory63.newThread((java.lang.Runnable) thread80);
        java.lang.Thread thread82 = namedThreadFactory1.newThread((java.lang.Runnable) thread80);
        org.junit.Assert.assertNotNull(namedThreadFactory1);
        org.junit.Assert.assertNotNull(thread3);
        org.junit.Assert.assertEquals(thread3.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory5);
        org.junit.Assert.assertNotNull(namedThreadFactory7);
        org.junit.Assert.assertNotNull(thread9);
        org.junit.Assert.assertEquals(thread9.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread10);
        org.junit.Assert.assertEquals(thread10.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory12);
        org.junit.Assert.assertNotNull(namedThreadFactory14);
        org.junit.Assert.assertNotNull(thread16);
        org.junit.Assert.assertEquals(thread16.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread17);
        org.junit.Assert.assertEquals(thread17.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread18);
        org.junit.Assert.assertEquals(thread18.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread19);
        org.junit.Assert.assertEquals(thread19.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory21);
        org.junit.Assert.assertNotNull(thread23);
        org.junit.Assert.assertEquals(thread23.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory25);
        org.junit.Assert.assertNotNull(thread27);
        org.junit.Assert.assertEquals(thread27.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread28);
        org.junit.Assert.assertEquals(thread28.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory30);
        org.junit.Assert.assertNotNull(namedThreadFactory32);
        org.junit.Assert.assertNotNull(thread34);
        org.junit.Assert.assertEquals(thread34.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread35);
        org.junit.Assert.assertEquals(thread35.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory37);
        org.junit.Assert.assertNotNull(namedThreadFactory39);
        org.junit.Assert.assertNotNull(thread41);
        org.junit.Assert.assertEquals(thread41.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread42);
        org.junit.Assert.assertEquals(thread42.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread43);
        org.junit.Assert.assertEquals(thread43.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread44);
        org.junit.Assert.assertEquals(thread44.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory46);
        org.junit.Assert.assertNotNull(namedThreadFactory48);
        org.junit.Assert.assertNotNull(thread50);
        org.junit.Assert.assertEquals(thread50.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread51);
        org.junit.Assert.assertEquals(thread51.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory53);
        org.junit.Assert.assertNotNull(namedThreadFactory55);
        org.junit.Assert.assertNotNull(thread57);
        org.junit.Assert.assertEquals(thread57.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread58);
        org.junit.Assert.assertEquals(thread58.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread59);
        org.junit.Assert.assertEquals(thread59.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread60);
        org.junit.Assert.assertEquals(thread60.toString(), "Thread[hi!-3,5,main]");
        org.junit.Assert.assertNotNull(thread61);
        org.junit.Assert.assertEquals(thread61.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory63);
        org.junit.Assert.assertNotNull(thread65);
        org.junit.Assert.assertEquals(thread65.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory67);
        org.junit.Assert.assertNotNull(namedThreadFactory69);
        org.junit.Assert.assertNotNull(thread71);
        org.junit.Assert.assertEquals(thread71.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread72);
        org.junit.Assert.assertEquals(thread72.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory74);
        org.junit.Assert.assertNotNull(namedThreadFactory76);
        org.junit.Assert.assertNotNull(thread78);
        org.junit.Assert.assertEquals(thread78.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread79);
        org.junit.Assert.assertEquals(thread79.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread80);
        org.junit.Assert.assertEquals(thread80.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread81);
        org.junit.Assert.assertEquals(thread81.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread82);
        org.junit.Assert.assertEquals(thread82.toString(), "Thread[hi!-3,5,main]");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder32 = sh.nerd.async.process.AsyncProcess.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder33 = sh.nerd.async.process.AsyncProcess.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder34 = builder17.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder35 = builder10.cmd(strArray31);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result36 = sh.nerd.async.process.AsyncProcess.run(strArray31);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder14 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = builder14.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder7.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder23.cwd("");
        java.util.function.Supplier<java.lang.String> strSupplier26 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder27 = builder25.in(strSupplier26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder10.cmd(strArray24);
        java.util.function.Consumer<java.lang.String> strConsumer28 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.out(strConsumer28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory1 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable2 = null;
        java.lang.Thread thread3 = namedThreadFactory1.newThread(runnable2);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory5 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory7 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable8 = null;
        java.lang.Thread thread9 = namedThreadFactory7.newThread(runnable8);
        java.lang.Thread thread10 = namedThreadFactory5.newThread((java.lang.Runnable) thread9);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory12 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory14 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable15 = null;
        java.lang.Thread thread16 = namedThreadFactory14.newThread(runnable15);
        java.lang.Thread thread17 = namedThreadFactory12.newThread((java.lang.Runnable) thread16);
        java.lang.Thread thread18 = namedThreadFactory5.newThread((java.lang.Runnable) thread16);
        java.lang.Thread thread19 = namedThreadFactory1.newThread((java.lang.Runnable) thread18);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory21 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory23 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable24 = null;
        java.lang.Thread thread25 = namedThreadFactory23.newThread(runnable24);
        java.lang.Thread thread26 = namedThreadFactory21.newThread((java.lang.Runnable) thread25);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory28 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable29 = null;
        java.lang.Thread thread30 = namedThreadFactory28.newThread(runnable29);
        java.lang.Thread thread31 = namedThreadFactory21.newThread(runnable29);
        java.lang.Thread thread32 = namedThreadFactory1.newThread((java.lang.Runnable) thread31);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory34 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable35 = null;
        java.lang.Thread thread36 = namedThreadFactory34.newThread(runnable35);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory38 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory40 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable41 = null;
        java.lang.Thread thread42 = namedThreadFactory40.newThread(runnable41);
        java.lang.Thread thread43 = namedThreadFactory38.newThread((java.lang.Runnable) thread42);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory45 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory47 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable48 = null;
        java.lang.Thread thread49 = namedThreadFactory47.newThread(runnable48);
        java.lang.Thread thread50 = namedThreadFactory45.newThread((java.lang.Runnable) thread49);
        java.lang.Thread thread51 = namedThreadFactory38.newThread((java.lang.Runnable) thread49);
        java.lang.Thread thread52 = namedThreadFactory34.newThread((java.lang.Runnable) thread51);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory54 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory56 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable57 = null;
        java.lang.Thread thread58 = namedThreadFactory56.newThread(runnable57);
        java.lang.Thread thread59 = namedThreadFactory54.newThread((java.lang.Runnable) thread58);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory61 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable62 = null;
        java.lang.Thread thread63 = namedThreadFactory61.newThread(runnable62);
        java.lang.Thread thread64 = namedThreadFactory54.newThread(runnable62);
        java.lang.Thread thread65 = namedThreadFactory34.newThread((java.lang.Runnable) thread64);
        java.lang.Thread thread66 = namedThreadFactory1.newThread((java.lang.Runnable) thread65);
        org.junit.Assert.assertNotNull(namedThreadFactory1);
        org.junit.Assert.assertNotNull(thread3);
        org.junit.Assert.assertEquals(thread3.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory5);
        org.junit.Assert.assertNotNull(namedThreadFactory7);
        org.junit.Assert.assertNotNull(thread9);
        org.junit.Assert.assertEquals(thread9.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread10);
        org.junit.Assert.assertEquals(thread10.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory12);
        org.junit.Assert.assertNotNull(namedThreadFactory14);
        org.junit.Assert.assertNotNull(thread16);
        org.junit.Assert.assertEquals(thread16.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread17);
        org.junit.Assert.assertEquals(thread17.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread18);
        org.junit.Assert.assertEquals(thread18.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread19);
        org.junit.Assert.assertEquals(thread19.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory21);
        org.junit.Assert.assertNotNull(namedThreadFactory23);
        org.junit.Assert.assertNotNull(thread25);
        org.junit.Assert.assertEquals(thread25.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread26);
        org.junit.Assert.assertEquals(thread26.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory28);
        org.junit.Assert.assertNotNull(thread30);
        org.junit.Assert.assertEquals(thread30.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread31);
        org.junit.Assert.assertEquals(thread31.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread32);
        org.junit.Assert.assertEquals(thread32.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory34);
        org.junit.Assert.assertNotNull(thread36);
        org.junit.Assert.assertEquals(thread36.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory38);
        org.junit.Assert.assertNotNull(namedThreadFactory40);
        org.junit.Assert.assertNotNull(thread42);
        org.junit.Assert.assertEquals(thread42.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread43);
        org.junit.Assert.assertEquals(thread43.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory45);
        org.junit.Assert.assertNotNull(namedThreadFactory47);
        org.junit.Assert.assertNotNull(thread49);
        org.junit.Assert.assertEquals(thread49.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread50);
        org.junit.Assert.assertEquals(thread50.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread51);
        org.junit.Assert.assertEquals(thread51.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread52);
        org.junit.Assert.assertEquals(thread52.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory54);
        org.junit.Assert.assertNotNull(namedThreadFactory56);
        org.junit.Assert.assertNotNull(thread58);
        org.junit.Assert.assertEquals(thread58.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread59);
        org.junit.Assert.assertEquals(thread59.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory61);
        org.junit.Assert.assertNotNull(thread63);
        org.junit.Assert.assertEquals(thread63.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread64);
        org.junit.Assert.assertEquals(thread64.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread65);
        org.junit.Assert.assertEquals(thread65.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(thread66);
        org.junit.Assert.assertEquals(thread66.toString(), "Thread[hi!-3,5,main]");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory1 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable2 = null;
        java.lang.Thread thread3 = namedThreadFactory1.newThread(runnable2);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory5 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable6 = null;
        java.lang.Thread thread7 = namedThreadFactory5.newThread(runnable6);
        java.lang.Thread thread8 = namedThreadFactory1.newThread(runnable6);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory10 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable11 = null;
        java.lang.Thread thread12 = namedThreadFactory10.newThread(runnable11);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory14 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable15 = null;
        java.lang.Thread thread16 = namedThreadFactory14.newThread(runnable15);
        java.lang.Thread thread17 = namedThreadFactory10.newThread(runnable15);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory19 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory21 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable22 = null;
        java.lang.Thread thread23 = namedThreadFactory21.newThread(runnable22);
        java.lang.Thread thread24 = namedThreadFactory19.newThread((java.lang.Runnable) thread23);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory26 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory28 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable29 = null;
        java.lang.Thread thread30 = namedThreadFactory28.newThread(runnable29);
        java.lang.Thread thread31 = namedThreadFactory26.newThread((java.lang.Runnable) thread30);
        java.lang.Thread thread32 = namedThreadFactory19.newThread((java.lang.Runnable) thread30);
        java.lang.Thread thread33 = namedThreadFactory10.newThread((java.lang.Runnable) thread30);
        java.lang.Thread thread34 = namedThreadFactory1.newThread((java.lang.Runnable) thread33);
        java.lang.Class<?> wildcardClass35 = thread33.getClass();
        org.junit.Assert.assertNotNull(namedThreadFactory1);
        org.junit.Assert.assertNotNull(thread3);
        org.junit.Assert.assertEquals(thread3.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory5);
        org.junit.Assert.assertNotNull(thread7);
        org.junit.Assert.assertEquals(thread7.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread8);
        org.junit.Assert.assertEquals(thread8.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory10);
        org.junit.Assert.assertNotNull(thread12);
        org.junit.Assert.assertEquals(thread12.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory14);
        org.junit.Assert.assertNotNull(thread16);
        org.junit.Assert.assertEquals(thread16.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread17);
        org.junit.Assert.assertEquals(thread17.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory19);
        org.junit.Assert.assertNotNull(namedThreadFactory21);
        org.junit.Assert.assertNotNull(thread23);
        org.junit.Assert.assertEquals(thread23.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread24);
        org.junit.Assert.assertEquals(thread24.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory26);
        org.junit.Assert.assertNotNull(namedThreadFactory28);
        org.junit.Assert.assertNotNull(thread30);
        org.junit.Assert.assertEquals(thread30.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread31);
        org.junit.Assert.assertEquals(thread31.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread32);
        org.junit.Assert.assertEquals(thread32.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread33);
        org.junit.Assert.assertEquals(thread33.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(thread34);
        org.junit.Assert.assertEquals(thread34.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder14 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder15 = builder7.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder16 = builder0.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        java.lang.Class<?> wildcardClass18 = builder17.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder10.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder30 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder37 = sh.nerd.async.process.AsyncProcess.cmd(strArray36);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder44 = sh.nerd.async.process.AsyncProcess.cmd(strArray43);
        sh.nerd.async.process.AsyncProcess.Builder builder45 = builder37.cmd(strArray43);
        sh.nerd.async.process.AsyncProcess.Builder builder46 = builder30.cmd(strArray43);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = builder27.cmd(strArray43);
        java.util.concurrent.Executor executor48 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder49 = builder27.executor(executor48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder6.cwd("");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder8.cwd(file11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory1 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory3 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable4 = null;
        java.lang.Thread thread5 = namedThreadFactory3.newThread(runnable4);
        java.lang.Thread thread6 = namedThreadFactory1.newThread((java.lang.Runnable) thread5);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory8 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory10 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable11 = null;
        java.lang.Thread thread12 = namedThreadFactory10.newThread(runnable11);
        java.lang.Thread thread13 = namedThreadFactory8.newThread((java.lang.Runnable) thread12);
        java.lang.Thread thread14 = namedThreadFactory1.newThread((java.lang.Runnable) thread12);
        java.lang.Class<?> wildcardClass15 = namedThreadFactory1.getClass();
        org.junit.Assert.assertNotNull(namedThreadFactory1);
        org.junit.Assert.assertNotNull(namedThreadFactory3);
        org.junit.Assert.assertNotNull(thread5);
        org.junit.Assert.assertEquals(thread5.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread6);
        org.junit.Assert.assertEquals(thread6.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory8);
        org.junit.Assert.assertNotNull(namedThreadFactory10);
        org.junit.Assert.assertNotNull(thread12);
        org.junit.Assert.assertEquals(thread12.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread13);
        org.junit.Assert.assertEquals(thread13.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread14);
        org.junit.Assert.assertEquals(thread14.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder15 = sh.nerd.async.process.AsyncProcess.cmd(strArray14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray21);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder15.cmd(strArray21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder30 = sh.nerd.async.process.AsyncProcess.cmd(strArray29);
        sh.nerd.async.process.AsyncProcess.Builder builder31 = sh.nerd.async.process.AsyncProcess.cmd(strArray29);
        sh.nerd.async.process.AsyncProcess.Builder builder32 = builder15.cmd(strArray29);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder39 = sh.nerd.async.process.AsyncProcess.cmd(strArray38);
        sh.nerd.async.process.AsyncProcess.Builder builder41 = builder39.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder43 = builder39.cwd("");
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder50 = sh.nerd.async.process.AsyncProcess.cmd(strArray49);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder43.cmd(strArray49);
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder58 = sh.nerd.async.process.AsyncProcess.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder59 = sh.nerd.async.process.AsyncProcess.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder60 = builder43.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder61 = builder15.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder62 = builder8.cmd(strArray57);
        java.util.Map<java.lang.String, java.lang.String> strMap63 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder64 = builder8.env(strMap63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        java.util.function.Supplier<java.lang.String> strSupplier0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.util.function.Consumer<java.lang.String> strConsumer2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder9 = sh.nerd.async.process.AsyncProcess.cmd(strArray8);
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder9.cwd("hi!");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder18 = sh.nerd.async.process.AsyncProcess.cmd(strArray17);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = builder18.cmd(strArray24);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder33 = sh.nerd.async.process.AsyncProcess.cmd(strArray32);
        sh.nerd.async.process.AsyncProcess.Builder builder34 = sh.nerd.async.process.AsyncProcess.cmd(strArray32);
        sh.nerd.async.process.AsyncProcess.Builder builder35 = builder18.cmd(strArray32);
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder42 = sh.nerd.async.process.AsyncProcess.cmd(strArray41);
        sh.nerd.async.process.AsyncProcess.Builder builder44 = builder42.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder46 = builder42.cwd("");
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder53 = sh.nerd.async.process.AsyncProcess.cmd(strArray52);
        sh.nerd.async.process.AsyncProcess.Builder builder54 = builder46.cmd(strArray52);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder61 = sh.nerd.async.process.AsyncProcess.cmd(strArray60);
        sh.nerd.async.process.AsyncProcess.Builder builder62 = sh.nerd.async.process.AsyncProcess.cmd(strArray60);
        sh.nerd.async.process.AsyncProcess.Builder builder63 = builder46.cmd(strArray60);
        sh.nerd.async.process.AsyncProcess.Builder builder64 = builder18.cmd(strArray60);
        sh.nerd.async.process.AsyncProcess.Builder builder65 = builder11.cmd(strArray60);
        sh.nerd.async.process.AsyncProcess.Builder builder66 = sh.nerd.async.process.AsyncProcess.cmd(strArray60);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result67 = sh.nerd.async.process.AsyncProcess.run(strSupplier0, strConsumer1, strConsumer2, strArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder66);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder10.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        java.lang.String[] strArray30 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder31 = builder27.cmd(strArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.io.File file20 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder21 = builder19.cwd(file20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        java.util.function.Supplier<java.lang.String> strSupplier0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.util.function.Consumer<java.lang.String> strConsumer2 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result8 = sh.nerd.async.process.AsyncProcess.run(strSupplier0, strConsumer1, strConsumer2, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder9 = builder7.cwd("hi!");
        java.lang.Class<?> wildcardClass10 = builder7.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder8.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder28 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result29 = sh.nerd.async.process.AsyncProcess.run(strArray23);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder10.cmd(strArray24);
        java.lang.Class<?> wildcardClass28 = strArray24.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder14 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder15 = builder7.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder16 = builder0.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder0.cwd("hi!");
        java.io.File file19 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd(file19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder8.env(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.io.File file15 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder16 = builder6.cwd(file15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        java.util.function.Supplier<java.lang.String> strSupplier0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.util.function.Consumer<java.lang.String> strConsumer2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder9 = sh.nerd.async.process.AsyncProcess.cmd(strArray8);
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder9.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder13 = builder11.cwd("");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder20 = sh.nerd.async.process.AsyncProcess.cmd(strArray19);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder28 = builder20.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder30 = builder11.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder31 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result32 = sh.nerd.async.process.AsyncProcess.run(strSupplier0, strConsumer1, strConsumer2, strArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder10.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder22 = builder20.cwd("");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder24 = builder20.env(strMap23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        java.util.function.Supplier<java.lang.String> strSupplier0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.util.function.Consumer<java.lang.String> strConsumer2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder9 = sh.nerd.async.process.AsyncProcess.cmd(strArray8);
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder9.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder13 = builder9.cwd("");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder20 = sh.nerd.async.process.AsyncProcess.cmd(strArray19);
        sh.nerd.async.process.AsyncProcess.Builder builder21 = builder13.cmd(strArray19);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder21.cwd("");
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder30 = sh.nerd.async.process.AsyncProcess.cmd(strArray29);
        sh.nerd.async.process.AsyncProcess.Builder builder32 = builder30.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder34 = builder32.cwd("");
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder41 = sh.nerd.async.process.AsyncProcess.cmd(strArray40);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder48 = sh.nerd.async.process.AsyncProcess.cmd(strArray47);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = builder41.cmd(strArray47);
        sh.nerd.async.process.AsyncProcess.Builder builder50 = sh.nerd.async.process.AsyncProcess.cmd(strArray47);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder32.cmd(strArray47);
        sh.nerd.async.process.AsyncProcess.Builder builder52 = builder23.cmd(strArray47);
        sh.nerd.async.process.AsyncProcess.Builder builder53 = sh.nerd.async.process.AsyncProcess.cmd(strArray47);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result54 = sh.nerd.async.process.AsyncProcess.run(strSupplier0, strConsumer1, strConsumer2, strArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder8.cmd(strArray23);
        java.io.File file28 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd(file28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder6.cwd(file11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder10.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder22 = builder20.cwd("");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder29 = sh.nerd.async.process.AsyncProcess.cmd(strArray28);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder36 = sh.nerd.async.process.AsyncProcess.cmd(strArray35);
        sh.nerd.async.process.AsyncProcess.Builder builder37 = builder29.cmd(strArray35);
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray35);
        sh.nerd.async.process.AsyncProcess.Builder builder39 = builder22.cmd(strArray35);
        java.io.File file40 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder41 = builder22.cwd(file40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder6.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        java.util.function.Supplier<java.lang.String> strSupplier25 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder26 = builder24.in(strSupplier25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        sh.nerd.async.process.AsyncProcess.Builder builder2 = builder0.cwd("");
        java.lang.Class<?> wildcardClass3 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder15 = sh.nerd.async.process.AsyncProcess.cmd(strArray14);
        sh.nerd.async.process.AsyncProcess.Builder builder16 = builder8.cmd(strArray14);
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray14);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = sh.nerd.async.process.AsyncProcess.cmd(strArray14);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result19 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strConsumer1, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder22 = builder18.env(strMap21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.util.function.Consumer<java.lang.String> strConsumer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder16 = builder14.err(strConsumer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder6.cwd("");
        java.util.concurrent.Executor executor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder14 = builder12.executor(executor13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder9 = builder7.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder9.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder13 = builder9.cwd("");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder10.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder22 = builder20.cwd("");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder24 = builder20.env(strMap23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder6.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder25.cwd("");
        java.util.function.Consumer<java.lang.String> strConsumer28 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder29 = builder25.err(strConsumer28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder8.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder8.cwd("");
        java.io.File file30 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder31 = builder29.cwd(file30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder10.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        java.util.function.Supplier<java.lang.String> strSupplier30 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder31 = builder29.in(strSupplier30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder8.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder8.cwd("");
        java.io.File file30 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder31 = builder8.cwd(file30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder10.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder29.cwd("");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder27.cwd("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        sh.nerd.async.process.AsyncProcess.Builder builder39 = builder31.cmd(strArray37);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder46 = sh.nerd.async.process.AsyncProcess.cmd(strArray45);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = builder31.cmd(strArray45);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder20.cmd(strArray45);
        java.util.Map<java.lang.String, java.lang.String> strMap49 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder50 = builder20.env(strMap49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result5 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strConsumer1, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        sh.nerd.async.process.AsyncProcess.Builder builder1 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder15 = sh.nerd.async.process.AsyncProcess.cmd(strArray14);
        sh.nerd.async.process.AsyncProcess.Builder builder16 = builder8.cmd(strArray14);
        sh.nerd.async.process.AsyncProcess.Builder builder17 = builder1.cmd(strArray14);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = sh.nerd.async.process.AsyncProcess.cmd(strArray14);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result19 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder8.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder28 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        java.lang.Class<?> wildcardClass29 = strArray23.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.util.concurrent.Executor executor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder6.executor(executor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder6.out(strConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory1 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable2 = null;
        java.lang.Thread thread3 = namedThreadFactory1.newThread(runnable2);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory5 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory7 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable8 = null;
        java.lang.Thread thread9 = namedThreadFactory7.newThread(runnable8);
        java.lang.Thread thread10 = namedThreadFactory5.newThread((java.lang.Runnable) thread9);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory12 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory14 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable15 = null;
        java.lang.Thread thread16 = namedThreadFactory14.newThread(runnable15);
        java.lang.Thread thread17 = namedThreadFactory12.newThread((java.lang.Runnable) thread16);
        java.lang.Thread thread18 = namedThreadFactory5.newThread((java.lang.Runnable) thread16);
        java.lang.Thread thread19 = namedThreadFactory1.newThread((java.lang.Runnable) thread18);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory21 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory23 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable24 = null;
        java.lang.Thread thread25 = namedThreadFactory23.newThread(runnable24);
        java.lang.Thread thread26 = namedThreadFactory21.newThread((java.lang.Runnable) thread25);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory28 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable29 = null;
        java.lang.Thread thread30 = namedThreadFactory28.newThread(runnable29);
        java.lang.Thread thread31 = namedThreadFactory21.newThread(runnable29);
        java.lang.Thread thread32 = namedThreadFactory1.newThread((java.lang.Runnable) thread31);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory34 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable35 = null;
        java.lang.Thread thread36 = namedThreadFactory34.newThread(runnable35);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory38 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable39 = null;
        java.lang.Thread thread40 = namedThreadFactory38.newThread(runnable39);
        java.lang.Thread thread41 = namedThreadFactory34.newThread(runnable39);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory43 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory45 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable46 = null;
        java.lang.Thread thread47 = namedThreadFactory45.newThread(runnable46);
        java.lang.Thread thread48 = namedThreadFactory43.newThread((java.lang.Runnable) thread47);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory50 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory52 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable53 = null;
        java.lang.Thread thread54 = namedThreadFactory52.newThread(runnable53);
        java.lang.Thread thread55 = namedThreadFactory50.newThread((java.lang.Runnable) thread54);
        java.lang.Thread thread56 = namedThreadFactory43.newThread((java.lang.Runnable) thread54);
        java.lang.Thread thread57 = namedThreadFactory34.newThread((java.lang.Runnable) thread54);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory59 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory61 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable62 = null;
        java.lang.Thread thread63 = namedThreadFactory61.newThread(runnable62);
        java.lang.Thread thread64 = namedThreadFactory59.newThread((java.lang.Runnable) thread63);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory66 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory68 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable69 = null;
        java.lang.Thread thread70 = namedThreadFactory68.newThread(runnable69);
        java.lang.Thread thread71 = namedThreadFactory66.newThread((java.lang.Runnable) thread70);
        java.lang.Thread thread72 = namedThreadFactory59.newThread((java.lang.Runnable) thread70);
        java.lang.Thread thread73 = namedThreadFactory34.newThread((java.lang.Runnable) thread72);
        java.lang.Thread thread74 = namedThreadFactory1.newThread((java.lang.Runnable) thread73);
        org.junit.Assert.assertNotNull(namedThreadFactory1);
        org.junit.Assert.assertNotNull(thread3);
        org.junit.Assert.assertEquals(thread3.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory5);
        org.junit.Assert.assertNotNull(namedThreadFactory7);
        org.junit.Assert.assertNotNull(thread9);
        org.junit.Assert.assertEquals(thread9.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread10);
        org.junit.Assert.assertEquals(thread10.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory12);
        org.junit.Assert.assertNotNull(namedThreadFactory14);
        org.junit.Assert.assertNotNull(thread16);
        org.junit.Assert.assertEquals(thread16.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread17);
        org.junit.Assert.assertEquals(thread17.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread18);
        org.junit.Assert.assertEquals(thread18.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread19);
        org.junit.Assert.assertEquals(thread19.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory21);
        org.junit.Assert.assertNotNull(namedThreadFactory23);
        org.junit.Assert.assertNotNull(thread25);
        org.junit.Assert.assertEquals(thread25.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread26);
        org.junit.Assert.assertEquals(thread26.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory28);
        org.junit.Assert.assertNotNull(thread30);
        org.junit.Assert.assertEquals(thread30.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread31);
        org.junit.Assert.assertEquals(thread31.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread32);
        org.junit.Assert.assertEquals(thread32.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory34);
        org.junit.Assert.assertNotNull(thread36);
        org.junit.Assert.assertEquals(thread36.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory38);
        org.junit.Assert.assertNotNull(thread40);
        org.junit.Assert.assertEquals(thread40.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread41);
        org.junit.Assert.assertEquals(thread41.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory43);
        org.junit.Assert.assertNotNull(namedThreadFactory45);
        org.junit.Assert.assertNotNull(thread47);
        org.junit.Assert.assertEquals(thread47.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread48);
        org.junit.Assert.assertEquals(thread48.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory50);
        org.junit.Assert.assertNotNull(namedThreadFactory52);
        org.junit.Assert.assertNotNull(thread54);
        org.junit.Assert.assertEquals(thread54.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread55);
        org.junit.Assert.assertEquals(thread55.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread56);
        org.junit.Assert.assertEquals(thread56.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread57);
        org.junit.Assert.assertEquals(thread57.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory59);
        org.junit.Assert.assertNotNull(namedThreadFactory61);
        org.junit.Assert.assertNotNull(thread63);
        org.junit.Assert.assertEquals(thread63.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread64);
        org.junit.Assert.assertEquals(thread64.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory66);
        org.junit.Assert.assertNotNull(namedThreadFactory68);
        org.junit.Assert.assertNotNull(thread70);
        org.junit.Assert.assertEquals(thread70.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread71);
        org.junit.Assert.assertEquals(thread71.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread72);
        org.junit.Assert.assertEquals(thread72.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread73);
        org.junit.Assert.assertEquals(thread73.toString(), "Thread[hi!-3,5,main]");
        org.junit.Assert.assertNotNull(thread74);
        org.junit.Assert.assertEquals(thread74.toString(), "Thread[hi!-3,5,main]");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder8.cwd("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray18);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder12.cmd(strArray18);
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray18);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result22 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strConsumer1, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result11 = builder8.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\" (in directory \"\"): error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.out(strConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder6.cmd(strArray20);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder30 = sh.nerd.async.process.AsyncProcess.cmd(strArray29);
        sh.nerd.async.process.AsyncProcess.Builder builder32 = builder30.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder34 = builder30.cwd("");
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder41 = sh.nerd.async.process.AsyncProcess.cmd(strArray40);
        sh.nerd.async.process.AsyncProcess.Builder builder42 = builder34.cmd(strArray40);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder49 = sh.nerd.async.process.AsyncProcess.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder50 = sh.nerd.async.process.AsyncProcess.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder34.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder52 = builder6.cmd(strArray48);
        java.util.function.Consumer<java.lang.String> strConsumer53 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder54 = builder52.out(strConsumer53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder32 = sh.nerd.async.process.AsyncProcess.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder33 = sh.nerd.async.process.AsyncProcess.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder34 = builder17.cmd(strArray31);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder41 = sh.nerd.async.process.AsyncProcess.cmd(strArray40);
        sh.nerd.async.process.AsyncProcess.Builder builder43 = builder41.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder45 = builder41.cwd("");
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder52 = sh.nerd.async.process.AsyncProcess.cmd(strArray51);
        sh.nerd.async.process.AsyncProcess.Builder builder53 = builder45.cmd(strArray51);
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder60 = sh.nerd.async.process.AsyncProcess.cmd(strArray59);
        sh.nerd.async.process.AsyncProcess.Builder builder61 = sh.nerd.async.process.AsyncProcess.cmd(strArray59);
        sh.nerd.async.process.AsyncProcess.Builder builder62 = builder45.cmd(strArray59);
        sh.nerd.async.process.AsyncProcess.Builder builder63 = builder17.cmd(strArray59);
        sh.nerd.async.process.AsyncProcess.Builder builder64 = builder10.cmd(strArray59);
        sh.nerd.async.process.AsyncProcess.Builder builder65 = sh.nerd.async.process.AsyncProcess.cmd(strArray59);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result66 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strConsumer1, strArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.cwd("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray18);
        sh.nerd.async.process.AsyncProcess.Builder builder21 = builder19.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder21.cwd("");
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder30 = sh.nerd.async.process.AsyncProcess.cmd(strArray29);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder37 = sh.nerd.async.process.AsyncProcess.cmd(strArray36);
        sh.nerd.async.process.AsyncProcess.Builder builder38 = builder30.cmd(strArray36);
        sh.nerd.async.process.AsyncProcess.Builder builder39 = sh.nerd.async.process.AsyncProcess.cmd(strArray36);
        sh.nerd.async.process.AsyncProcess.Builder builder40 = builder21.cmd(strArray36);
        sh.nerd.async.process.AsyncProcess.Builder builder41 = sh.nerd.async.process.AsyncProcess.cmd(strArray36);
        sh.nerd.async.process.AsyncProcess.Builder builder42 = builder10.cmd(strArray36);
        java.lang.Class<?> wildcardClass43 = strArray36.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory1 = sh.nerd.async.process.NamedThreadFactory.withPrefix("");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory3 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable4 = null;
        java.lang.Thread thread5 = namedThreadFactory3.newThread(runnable4);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory7 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable8 = null;
        java.lang.Thread thread9 = namedThreadFactory7.newThread(runnable8);
        java.lang.Thread thread10 = namedThreadFactory3.newThread(runnable8);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory12 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory14 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable15 = null;
        java.lang.Thread thread16 = namedThreadFactory14.newThread(runnable15);
        java.lang.Thread thread17 = namedThreadFactory12.newThread((java.lang.Runnable) thread16);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory19 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory21 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable22 = null;
        java.lang.Thread thread23 = namedThreadFactory21.newThread(runnable22);
        java.lang.Thread thread24 = namedThreadFactory19.newThread((java.lang.Runnable) thread23);
        java.lang.Thread thread25 = namedThreadFactory12.newThread((java.lang.Runnable) thread23);
        java.lang.Thread thread26 = namedThreadFactory3.newThread((java.lang.Runnable) thread23);
        java.lang.Thread thread27 = namedThreadFactory1.newThread((java.lang.Runnable) thread23);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory29 = sh.nerd.async.process.NamedThreadFactory.withPrefix("");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory31 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable32 = null;
        java.lang.Thread thread33 = namedThreadFactory31.newThread(runnable32);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory35 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable36 = null;
        java.lang.Thread thread37 = namedThreadFactory35.newThread(runnable36);
        java.lang.Thread thread38 = namedThreadFactory31.newThread(runnable36);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory40 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory42 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable43 = null;
        java.lang.Thread thread44 = namedThreadFactory42.newThread(runnable43);
        java.lang.Thread thread45 = namedThreadFactory40.newThread((java.lang.Runnable) thread44);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory47 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory49 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable50 = null;
        java.lang.Thread thread51 = namedThreadFactory49.newThread(runnable50);
        java.lang.Thread thread52 = namedThreadFactory47.newThread((java.lang.Runnable) thread51);
        java.lang.Thread thread53 = namedThreadFactory40.newThread((java.lang.Runnable) thread51);
        java.lang.Thread thread54 = namedThreadFactory31.newThread((java.lang.Runnable) thread51);
        java.lang.Thread thread55 = namedThreadFactory29.newThread((java.lang.Runnable) thread51);
        java.lang.Thread thread56 = namedThreadFactory1.newThread((java.lang.Runnable) thread55);
        org.junit.Assert.assertNotNull(namedThreadFactory1);
        org.junit.Assert.assertNotNull(namedThreadFactory3);
        org.junit.Assert.assertNotNull(thread5);
        org.junit.Assert.assertEquals(thread5.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory7);
        org.junit.Assert.assertNotNull(thread9);
        org.junit.Assert.assertEquals(thread9.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread10);
        org.junit.Assert.assertEquals(thread10.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory12);
        org.junit.Assert.assertNotNull(namedThreadFactory14);
        org.junit.Assert.assertNotNull(thread16);
        org.junit.Assert.assertEquals(thread16.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread17);
        org.junit.Assert.assertEquals(thread17.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory19);
        org.junit.Assert.assertNotNull(namedThreadFactory21);
        org.junit.Assert.assertNotNull(thread23);
        org.junit.Assert.assertEquals(thread23.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread24);
        org.junit.Assert.assertEquals(thread24.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread25);
        org.junit.Assert.assertEquals(thread25.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread26);
        org.junit.Assert.assertEquals(thread26.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(thread27);
        org.junit.Assert.assertEquals(thread27.toString(), "Thread[-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory29);
        org.junit.Assert.assertNotNull(namedThreadFactory31);
        org.junit.Assert.assertNotNull(thread33);
        org.junit.Assert.assertEquals(thread33.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory35);
        org.junit.Assert.assertNotNull(thread37);
        org.junit.Assert.assertEquals(thread37.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread38);
        org.junit.Assert.assertEquals(thread38.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory40);
        org.junit.Assert.assertNotNull(namedThreadFactory42);
        org.junit.Assert.assertNotNull(thread44);
        org.junit.Assert.assertEquals(thread44.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread45);
        org.junit.Assert.assertEquals(thread45.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory47);
        org.junit.Assert.assertNotNull(namedThreadFactory49);
        org.junit.Assert.assertNotNull(thread51);
        org.junit.Assert.assertEquals(thread51.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread52);
        org.junit.Assert.assertEquals(thread52.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread53);
        org.junit.Assert.assertEquals(thread53.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread54);
        org.junit.Assert.assertEquals(thread54.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(thread55);
        org.junit.Assert.assertEquals(thread55.toString(), "Thread[-0,5,main]");
        org.junit.Assert.assertNotNull(thread56);
        org.junit.Assert.assertEquals(thread56.toString(), "Thread[-1,5,main]");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder10.cmd(strArray24);
        java.util.function.Supplier<java.lang.String> strSupplier28 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder29 = builder10.in(strSupplier28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder10.cmd(strArray16);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result21 = builder10.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\" (in directory \"\"): error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder8.cwd("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray18);
        sh.nerd.async.process.AsyncProcess.Builder builder21 = builder19.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder19.cwd("");
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder30 = sh.nerd.async.process.AsyncProcess.cmd(strArray29);
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder23.cmd(strArray29);
        sh.nerd.async.process.AsyncProcess.Builder builder33 = builder31.cwd("");
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder40 = sh.nerd.async.process.AsyncProcess.cmd(strArray39);
        sh.nerd.async.process.AsyncProcess.Builder builder42 = builder40.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder44 = builder42.cwd("");
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder51 = sh.nerd.async.process.AsyncProcess.cmd(strArray50);
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder58 = sh.nerd.async.process.AsyncProcess.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder59 = builder51.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder60 = sh.nerd.async.process.AsyncProcess.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder61 = builder42.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder62 = builder33.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder63 = builder12.cmd(strArray57);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result64 = sh.nerd.async.process.AsyncProcess.run(strArray57);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.out(strConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.cwd("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray18);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray25);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder19.cmd(strArray25);
        sh.nerd.async.process.AsyncProcess.Builder builder28 = sh.nerd.async.process.AsyncProcess.cmd(strArray25);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder10.cmd(strArray25);
        sh.nerd.async.process.AsyncProcess.Builder builder30 = sh.nerd.async.process.AsyncProcess.cmd(strArray25);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result31 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strConsumer1, strArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("hi!");
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        sh.nerd.async.process.AsyncProcess.Builder builder2 = builder0.cwd("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder4 = builder0.env(strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = builder10.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder28 = builder26.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder30 = builder26.cwd("hi!");
        java.io.File file31 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder32 = builder30.cwd(file31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        java.util.function.Supplier<java.lang.String> strSupplier0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.util.function.Consumer<java.lang.String> strConsumer2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder9 = sh.nerd.async.process.AsyncProcess.cmd(strArray8);
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder9.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder13 = builder9.cwd("");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder20 = sh.nerd.async.process.AsyncProcess.cmd(strArray19);
        sh.nerd.async.process.AsyncProcess.Builder builder21 = builder13.cmd(strArray19);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder28 = sh.nerd.async.process.AsyncProcess.cmd(strArray27);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = sh.nerd.async.process.AsyncProcess.cmd(strArray27);
        sh.nerd.async.process.AsyncProcess.Builder builder30 = builder13.cmd(strArray27);
        sh.nerd.async.process.AsyncProcess.Builder builder32 = builder30.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder33 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder40 = sh.nerd.async.process.AsyncProcess.cmd(strArray39);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder47 = sh.nerd.async.process.AsyncProcess.cmd(strArray46);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder40.cmd(strArray46);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = builder33.cmd(strArray46);
        sh.nerd.async.process.AsyncProcess.Builder builder50 = builder30.cmd(strArray46);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result51 = sh.nerd.async.process.AsyncProcess.run(strSupplier0, strConsumer1, strConsumer2, strArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory1 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory3 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable4 = null;
        java.lang.Thread thread5 = namedThreadFactory3.newThread(runnable4);
        java.lang.Thread thread6 = namedThreadFactory1.newThread((java.lang.Runnable) thread5);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory8 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable9 = null;
        java.lang.Thread thread10 = namedThreadFactory8.newThread(runnable9);
        java.lang.Thread thread11 = namedThreadFactory1.newThread(runnable9);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory13 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable14 = null;
        java.lang.Thread thread15 = namedThreadFactory13.newThread(runnable14);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory17 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory19 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable20 = null;
        java.lang.Thread thread21 = namedThreadFactory19.newThread(runnable20);
        java.lang.Thread thread22 = namedThreadFactory17.newThread((java.lang.Runnable) thread21);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory24 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory26 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable27 = null;
        java.lang.Thread thread28 = namedThreadFactory26.newThread(runnable27);
        java.lang.Thread thread29 = namedThreadFactory24.newThread((java.lang.Runnable) thread28);
        java.lang.Thread thread30 = namedThreadFactory17.newThread((java.lang.Runnable) thread28);
        java.lang.Thread thread31 = namedThreadFactory13.newThread((java.lang.Runnable) thread30);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory33 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable34 = null;
        java.lang.Thread thread35 = namedThreadFactory33.newThread(runnable34);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory37 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable38 = null;
        java.lang.Thread thread39 = namedThreadFactory37.newThread(runnable38);
        java.lang.Thread thread40 = namedThreadFactory33.newThread(runnable38);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory42 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory44 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable45 = null;
        java.lang.Thread thread46 = namedThreadFactory44.newThread(runnable45);
        java.lang.Thread thread47 = namedThreadFactory42.newThread((java.lang.Runnable) thread46);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory49 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory51 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable52 = null;
        java.lang.Thread thread53 = namedThreadFactory51.newThread(runnable52);
        java.lang.Thread thread54 = namedThreadFactory49.newThread((java.lang.Runnable) thread53);
        java.lang.Thread thread55 = namedThreadFactory42.newThread((java.lang.Runnable) thread53);
        java.lang.Thread thread56 = namedThreadFactory33.newThread((java.lang.Runnable) thread53);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory58 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory60 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable61 = null;
        java.lang.Thread thread62 = namedThreadFactory60.newThread(runnable61);
        java.lang.Thread thread63 = namedThreadFactory58.newThread((java.lang.Runnable) thread62);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory65 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory67 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable68 = null;
        java.lang.Thread thread69 = namedThreadFactory67.newThread(runnable68);
        java.lang.Thread thread70 = namedThreadFactory65.newThread((java.lang.Runnable) thread69);
        java.lang.Thread thread71 = namedThreadFactory58.newThread((java.lang.Runnable) thread69);
        java.lang.Thread thread72 = namedThreadFactory33.newThread((java.lang.Runnable) thread71);
        java.lang.Thread thread73 = namedThreadFactory13.newThread((java.lang.Runnable) thread72);
        java.lang.Thread thread74 = namedThreadFactory1.newThread((java.lang.Runnable) thread73);
        org.junit.Assert.assertNotNull(namedThreadFactory1);
        org.junit.Assert.assertNotNull(namedThreadFactory3);
        org.junit.Assert.assertNotNull(thread5);
        org.junit.Assert.assertEquals(thread5.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread6);
        org.junit.Assert.assertEquals(thread6.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory8);
        org.junit.Assert.assertNotNull(thread10);
        org.junit.Assert.assertEquals(thread10.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread11);
        org.junit.Assert.assertEquals(thread11.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory13);
        org.junit.Assert.assertNotNull(thread15);
        org.junit.Assert.assertEquals(thread15.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory17);
        org.junit.Assert.assertNotNull(namedThreadFactory19);
        org.junit.Assert.assertNotNull(thread21);
        org.junit.Assert.assertEquals(thread21.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread22);
        org.junit.Assert.assertEquals(thread22.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory24);
        org.junit.Assert.assertNotNull(namedThreadFactory26);
        org.junit.Assert.assertNotNull(thread28);
        org.junit.Assert.assertEquals(thread28.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread29);
        org.junit.Assert.assertEquals(thread29.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread30);
        org.junit.Assert.assertEquals(thread30.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread31);
        org.junit.Assert.assertEquals(thread31.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory33);
        org.junit.Assert.assertNotNull(thread35);
        org.junit.Assert.assertEquals(thread35.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory37);
        org.junit.Assert.assertNotNull(thread39);
        org.junit.Assert.assertEquals(thread39.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread40);
        org.junit.Assert.assertEquals(thread40.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory42);
        org.junit.Assert.assertNotNull(namedThreadFactory44);
        org.junit.Assert.assertNotNull(thread46);
        org.junit.Assert.assertEquals(thread46.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread47);
        org.junit.Assert.assertEquals(thread47.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory49);
        org.junit.Assert.assertNotNull(namedThreadFactory51);
        org.junit.Assert.assertNotNull(thread53);
        org.junit.Assert.assertEquals(thread53.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread54);
        org.junit.Assert.assertEquals(thread54.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread55);
        org.junit.Assert.assertEquals(thread55.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread56);
        org.junit.Assert.assertEquals(thread56.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory58);
        org.junit.Assert.assertNotNull(namedThreadFactory60);
        org.junit.Assert.assertNotNull(thread62);
        org.junit.Assert.assertEquals(thread62.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread63);
        org.junit.Assert.assertEquals(thread63.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory65);
        org.junit.Assert.assertNotNull(namedThreadFactory67);
        org.junit.Assert.assertNotNull(thread69);
        org.junit.Assert.assertEquals(thread69.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread70);
        org.junit.Assert.assertEquals(thread70.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread71);
        org.junit.Assert.assertEquals(thread71.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread72);
        org.junit.Assert.assertEquals(thread72.toString(), "Thread[hi!-3,5,main]");
        org.junit.Assert.assertNotNull(thread73);
        org.junit.Assert.assertEquals(thread73.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(thread74);
        org.junit.Assert.assertEquals(thread74.toString(), "Thread[hi!-2,5,main]");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.util.function.Supplier<java.lang.String> strSupplier20 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder21 = builder19.in(strSupplier20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder9 = builder7.cwd("hi!");
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder11 = builder7.err(strConsumer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder27.cwd("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        sh.nerd.async.process.AsyncProcess.Builder builder39 = builder31.cmd(strArray37);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder46 = sh.nerd.async.process.AsyncProcess.cmd(strArray45);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = builder31.cmd(strArray45);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder20.cmd(strArray45);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = sh.nerd.async.process.AsyncProcess.cmd(strArray45);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result50 = sh.nerd.async.process.AsyncProcess.run(strArray45);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder14 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder15 = builder7.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder16 = builder0.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder19 = builder17.env(strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory1 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable2 = null;
        java.lang.Thread thread3 = namedThreadFactory1.newThread(runnable2);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory5 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable6 = null;
        java.lang.Thread thread7 = namedThreadFactory5.newThread(runnable6);
        java.lang.Thread thread8 = namedThreadFactory1.newThread(runnable6);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory10 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory12 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable13 = null;
        java.lang.Thread thread14 = namedThreadFactory12.newThread(runnable13);
        java.lang.Thread thread15 = namedThreadFactory10.newThread((java.lang.Runnable) thread14);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory17 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory19 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable20 = null;
        java.lang.Thread thread21 = namedThreadFactory19.newThread(runnable20);
        java.lang.Thread thread22 = namedThreadFactory17.newThread((java.lang.Runnable) thread21);
        java.lang.Thread thread23 = namedThreadFactory10.newThread((java.lang.Runnable) thread21);
        java.lang.Thread thread24 = namedThreadFactory1.newThread((java.lang.Runnable) thread21);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory26 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable27 = null;
        java.lang.Thread thread28 = namedThreadFactory26.newThread(runnable27);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory30 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable31 = null;
        java.lang.Thread thread32 = namedThreadFactory30.newThread(runnable31);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory34 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory36 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable37 = null;
        java.lang.Thread thread38 = namedThreadFactory36.newThread(runnable37);
        java.lang.Thread thread39 = namedThreadFactory34.newThread((java.lang.Runnable) thread38);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory41 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory43 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable44 = null;
        java.lang.Thread thread45 = namedThreadFactory43.newThread(runnable44);
        java.lang.Thread thread46 = namedThreadFactory41.newThread((java.lang.Runnable) thread45);
        java.lang.Thread thread47 = namedThreadFactory34.newThread((java.lang.Runnable) thread45);
        java.lang.Thread thread48 = namedThreadFactory30.newThread((java.lang.Runnable) thread47);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory50 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory52 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable53 = null;
        java.lang.Thread thread54 = namedThreadFactory52.newThread(runnable53);
        java.lang.Thread thread55 = namedThreadFactory50.newThread((java.lang.Runnable) thread54);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory57 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable58 = null;
        java.lang.Thread thread59 = namedThreadFactory57.newThread(runnable58);
        java.lang.Thread thread60 = namedThreadFactory50.newThread(runnable58);
        java.lang.Thread thread61 = namedThreadFactory30.newThread((java.lang.Runnable) thread60);
        java.lang.Thread thread62 = namedThreadFactory26.newThread((java.lang.Runnable) thread60);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory64 = sh.nerd.async.process.NamedThreadFactory.withPrefix("");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory66 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable67 = null;
        java.lang.Thread thread68 = namedThreadFactory66.newThread(runnable67);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory70 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable71 = null;
        java.lang.Thread thread72 = namedThreadFactory70.newThread(runnable71);
        java.lang.Thread thread73 = namedThreadFactory66.newThread(runnable71);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory75 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory77 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable78 = null;
        java.lang.Thread thread79 = namedThreadFactory77.newThread(runnable78);
        java.lang.Thread thread80 = namedThreadFactory75.newThread((java.lang.Runnable) thread79);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory82 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory84 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable85 = null;
        java.lang.Thread thread86 = namedThreadFactory84.newThread(runnable85);
        java.lang.Thread thread87 = namedThreadFactory82.newThread((java.lang.Runnable) thread86);
        java.lang.Thread thread88 = namedThreadFactory75.newThread((java.lang.Runnable) thread86);
        java.lang.Thread thread89 = namedThreadFactory66.newThread((java.lang.Runnable) thread86);
        java.lang.Thread thread90 = namedThreadFactory64.newThread((java.lang.Runnable) thread86);
        java.lang.Thread thread91 = namedThreadFactory26.newThread((java.lang.Runnable) thread90);
        java.lang.Thread thread92 = namedThreadFactory1.newThread((java.lang.Runnable) thread91);
        org.junit.Assert.assertNotNull(namedThreadFactory1);
        org.junit.Assert.assertNotNull(thread3);
        org.junit.Assert.assertEquals(thread3.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory5);
        org.junit.Assert.assertNotNull(thread7);
        org.junit.Assert.assertEquals(thread7.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread8);
        org.junit.Assert.assertEquals(thread8.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory10);
        org.junit.Assert.assertNotNull(namedThreadFactory12);
        org.junit.Assert.assertNotNull(thread14);
        org.junit.Assert.assertEquals(thread14.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread15);
        org.junit.Assert.assertEquals(thread15.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory17);
        org.junit.Assert.assertNotNull(namedThreadFactory19);
        org.junit.Assert.assertNotNull(thread21);
        org.junit.Assert.assertEquals(thread21.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread22);
        org.junit.Assert.assertEquals(thread22.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread23);
        org.junit.Assert.assertEquals(thread23.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread24);
        org.junit.Assert.assertEquals(thread24.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory26);
        org.junit.Assert.assertNotNull(thread28);
        org.junit.Assert.assertEquals(thread28.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory30);
        org.junit.Assert.assertNotNull(thread32);
        org.junit.Assert.assertEquals(thread32.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory34);
        org.junit.Assert.assertNotNull(namedThreadFactory36);
        org.junit.Assert.assertNotNull(thread38);
        org.junit.Assert.assertEquals(thread38.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread39);
        org.junit.Assert.assertEquals(thread39.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory41);
        org.junit.Assert.assertNotNull(namedThreadFactory43);
        org.junit.Assert.assertNotNull(thread45);
        org.junit.Assert.assertEquals(thread45.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread46);
        org.junit.Assert.assertEquals(thread46.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread47);
        org.junit.Assert.assertEquals(thread47.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread48);
        org.junit.Assert.assertEquals(thread48.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory50);
        org.junit.Assert.assertNotNull(namedThreadFactory52);
        org.junit.Assert.assertNotNull(thread54);
        org.junit.Assert.assertEquals(thread54.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread55);
        org.junit.Assert.assertEquals(thread55.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory57);
        org.junit.Assert.assertNotNull(thread59);
        org.junit.Assert.assertEquals(thread59.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread60);
        org.junit.Assert.assertEquals(thread60.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread61);
        org.junit.Assert.assertEquals(thread61.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(thread62);
        org.junit.Assert.assertEquals(thread62.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory64);
        org.junit.Assert.assertNotNull(namedThreadFactory66);
        org.junit.Assert.assertNotNull(thread68);
        org.junit.Assert.assertEquals(thread68.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory70);
        org.junit.Assert.assertNotNull(thread72);
        org.junit.Assert.assertEquals(thread72.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread73);
        org.junit.Assert.assertEquals(thread73.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory75);
        org.junit.Assert.assertNotNull(namedThreadFactory77);
        org.junit.Assert.assertNotNull(thread79);
        org.junit.Assert.assertEquals(thread79.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread80);
        org.junit.Assert.assertEquals(thread80.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory82);
        org.junit.Assert.assertNotNull(namedThreadFactory84);
        org.junit.Assert.assertNotNull(thread86);
        org.junit.Assert.assertEquals(thread86.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread87);
        org.junit.Assert.assertEquals(thread87.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread88);
        org.junit.Assert.assertEquals(thread88.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread89);
        org.junit.Assert.assertEquals(thread89.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(thread90);
        org.junit.Assert.assertEquals(thread90.toString(), "Thread[-0,5,main]");
        org.junit.Assert.assertNotNull(thread91);
        org.junit.Assert.assertEquals(thread91.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(thread92);
        org.junit.Assert.assertEquals(thread92.toString(), "Thread[hi!-3,5,main]");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder8.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder28 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder30 = builder28.env(strMap29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder14 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder15 = builder7.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder16 = builder0.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result18 = sh.nerd.async.process.AsyncProcess.run(strArray13);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder8.out(strConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder10.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder30 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder37 = sh.nerd.async.process.AsyncProcess.cmd(strArray36);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder44 = sh.nerd.async.process.AsyncProcess.cmd(strArray43);
        sh.nerd.async.process.AsyncProcess.Builder builder45 = builder37.cmd(strArray43);
        sh.nerd.async.process.AsyncProcess.Builder builder46 = builder30.cmd(strArray43);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = builder27.cmd(strArray43);
        java.util.Map<java.lang.String, java.lang.String> strMap48 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder49 = builder47.env(strMap48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder22 = builder18.env(strMap21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        java.util.function.Supplier<java.lang.String> strSupplier0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.util.function.Consumer<java.lang.String> strConsumer2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder9 = sh.nerd.async.process.AsyncProcess.cmd(strArray8);
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder9.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder13 = builder9.cwd("");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder20 = sh.nerd.async.process.AsyncProcess.cmd(strArray19);
        sh.nerd.async.process.AsyncProcess.Builder builder21 = builder13.cmd(strArray19);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder28 = sh.nerd.async.process.AsyncProcess.cmd(strArray27);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = sh.nerd.async.process.AsyncProcess.cmd(strArray27);
        sh.nerd.async.process.AsyncProcess.Builder builder30 = builder13.cmd(strArray27);
        sh.nerd.async.process.AsyncProcess.Builder builder32 = builder30.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder33 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder40 = sh.nerd.async.process.AsyncProcess.cmd(strArray39);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder47 = sh.nerd.async.process.AsyncProcess.cmd(strArray46);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder40.cmd(strArray46);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = builder33.cmd(strArray46);
        sh.nerd.async.process.AsyncProcess.Builder builder50 = builder30.cmd(strArray46);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = sh.nerd.async.process.AsyncProcess.cmd(strArray46);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result52 = sh.nerd.async.process.AsyncProcess.run(strSupplier0, strConsumer1, strConsumer2, strArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder14 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder15 = builder7.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder16 = builder0.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder16.cwd("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder8.cmd(strArray23);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder34 = sh.nerd.async.process.AsyncProcess.cmd(strArray33);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder41 = sh.nerd.async.process.AsyncProcess.cmd(strArray40);
        sh.nerd.async.process.AsyncProcess.Builder builder42 = builder34.cmd(strArray40);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder49 = sh.nerd.async.process.AsyncProcess.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder50 = sh.nerd.async.process.AsyncProcess.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder34.cmd(strArray48);
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder58 = sh.nerd.async.process.AsyncProcess.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder60 = builder58.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder62 = builder58.cwd("");
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder69 = sh.nerd.async.process.AsyncProcess.cmd(strArray68);
        sh.nerd.async.process.AsyncProcess.Builder builder70 = builder62.cmd(strArray68);
        java.lang.String[] strArray76 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder77 = sh.nerd.async.process.AsyncProcess.cmd(strArray76);
        sh.nerd.async.process.AsyncProcess.Builder builder78 = sh.nerd.async.process.AsyncProcess.cmd(strArray76);
        sh.nerd.async.process.AsyncProcess.Builder builder79 = builder62.cmd(strArray76);
        sh.nerd.async.process.AsyncProcess.Builder builder80 = builder34.cmd(strArray76);
        sh.nerd.async.process.AsyncProcess.Builder builder81 = sh.nerd.async.process.AsyncProcess.cmd(strArray76);
        sh.nerd.async.process.AsyncProcess.Builder builder82 = builder8.cmd(strArray76);
        java.util.function.Supplier<java.lang.String> strSupplier83 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder84 = builder82.in(strSupplier83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder82);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder10.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        java.io.File file30 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder31 = builder27.cwd(file30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        java.util.function.Supplier<java.lang.String> strSupplier0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.util.function.Consumer<java.lang.String> strConsumer2 = null;
        sh.nerd.async.process.AsyncProcess.Builder builder3 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder10 = sh.nerd.async.process.AsyncProcess.cmd(strArray9);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder19 = builder3.cmd(strArray16);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result20 = sh.nerd.async.process.AsyncProcess.run(strSupplier0, strConsumer1, strConsumer2, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        sh.nerd.async.process.AsyncProcess.Builder builder9 = builder7.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder7.cwd("");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder18 = sh.nerd.async.process.AsyncProcess.cmd(strArray17);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = builder18.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder28 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder7.cmd(strArray24);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result30 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        sh.nerd.async.process.AsyncProcess.Builder builder9 = builder7.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder9.cwd("");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder18 = sh.nerd.async.process.AsyncProcess.cmd(strArray17);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = builder18.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder28 = builder9.cmd(strArray24);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder35 = sh.nerd.async.process.AsyncProcess.cmd(strArray34);
        sh.nerd.async.process.AsyncProcess.Builder builder37 = builder35.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder39 = builder37.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder41 = builder37.cwd("");
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder48 = sh.nerd.async.process.AsyncProcess.cmd(strArray47);
        sh.nerd.async.process.AsyncProcess.Builder builder50 = builder48.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder52 = builder48.cwd("");
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder59 = sh.nerd.async.process.AsyncProcess.cmd(strArray58);
        sh.nerd.async.process.AsyncProcess.Builder builder60 = builder52.cmd(strArray58);
        sh.nerd.async.process.AsyncProcess.Builder builder62 = builder60.cwd("");
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder69 = sh.nerd.async.process.AsyncProcess.cmd(strArray68);
        sh.nerd.async.process.AsyncProcess.Builder builder71 = builder69.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder73 = builder71.cwd("");
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder80 = sh.nerd.async.process.AsyncProcess.cmd(strArray79);
        java.lang.String[] strArray86 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder87 = sh.nerd.async.process.AsyncProcess.cmd(strArray86);
        sh.nerd.async.process.AsyncProcess.Builder builder88 = builder80.cmd(strArray86);
        sh.nerd.async.process.AsyncProcess.Builder builder89 = sh.nerd.async.process.AsyncProcess.cmd(strArray86);
        sh.nerd.async.process.AsyncProcess.Builder builder90 = builder71.cmd(strArray86);
        sh.nerd.async.process.AsyncProcess.Builder builder91 = builder62.cmd(strArray86);
        sh.nerd.async.process.AsyncProcess.Builder builder92 = builder41.cmd(strArray86);
        sh.nerd.async.process.AsyncProcess.Builder builder93 = builder28.cmd(strArray86);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result94 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strArray86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(builder93);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        sh.nerd.async.process.AsyncProcess.Builder builder9 = builder7.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder9.cwd("hi!");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder18 = sh.nerd.async.process.AsyncProcess.cmd(strArray17);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = builder18.cmd(strArray24);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder33 = sh.nerd.async.process.AsyncProcess.cmd(strArray32);
        sh.nerd.async.process.AsyncProcess.Builder builder34 = sh.nerd.async.process.AsyncProcess.cmd(strArray32);
        sh.nerd.async.process.AsyncProcess.Builder builder35 = builder18.cmd(strArray32);
        sh.nerd.async.process.AsyncProcess.Builder builder36 = builder11.cmd(strArray32);
        sh.nerd.async.process.AsyncProcess.Builder builder37 = sh.nerd.async.process.AsyncProcess.cmd(strArray32);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result38 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder6.cwd("");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder14 = builder12.env(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory1 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable2 = null;
        java.lang.Thread thread3 = namedThreadFactory1.newThread(runnable2);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory5 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable6 = null;
        java.lang.Thread thread7 = namedThreadFactory5.newThread(runnable6);
        java.lang.Thread thread8 = namedThreadFactory1.newThread(runnable6);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory10 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable11 = null;
        java.lang.Thread thread12 = namedThreadFactory10.newThread(runnable11);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory14 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable15 = null;
        java.lang.Thread thread16 = namedThreadFactory14.newThread(runnable15);
        java.lang.Thread thread17 = namedThreadFactory10.newThread(runnable15);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory19 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory21 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable22 = null;
        java.lang.Thread thread23 = namedThreadFactory21.newThread(runnable22);
        java.lang.Thread thread24 = namedThreadFactory19.newThread((java.lang.Runnable) thread23);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory26 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory28 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable29 = null;
        java.lang.Thread thread30 = namedThreadFactory28.newThread(runnable29);
        java.lang.Thread thread31 = namedThreadFactory26.newThread((java.lang.Runnable) thread30);
        java.lang.Thread thread32 = namedThreadFactory19.newThread((java.lang.Runnable) thread30);
        java.lang.Thread thread33 = namedThreadFactory10.newThread((java.lang.Runnable) thread30);
        java.lang.Thread thread34 = namedThreadFactory1.newThread((java.lang.Runnable) thread33);
        java.lang.Runnable runnable35 = null;
        java.lang.Thread thread36 = namedThreadFactory1.newThread(runnable35);
        org.junit.Assert.assertNotNull(namedThreadFactory1);
        org.junit.Assert.assertNotNull(thread3);
        org.junit.Assert.assertEquals(thread3.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory5);
        org.junit.Assert.assertNotNull(thread7);
        org.junit.Assert.assertEquals(thread7.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread8);
        org.junit.Assert.assertEquals(thread8.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory10);
        org.junit.Assert.assertNotNull(thread12);
        org.junit.Assert.assertEquals(thread12.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory14);
        org.junit.Assert.assertNotNull(thread16);
        org.junit.Assert.assertEquals(thread16.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread17);
        org.junit.Assert.assertEquals(thread17.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory19);
        org.junit.Assert.assertNotNull(namedThreadFactory21);
        org.junit.Assert.assertNotNull(thread23);
        org.junit.Assert.assertEquals(thread23.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread24);
        org.junit.Assert.assertEquals(thread24.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory26);
        org.junit.Assert.assertNotNull(namedThreadFactory28);
        org.junit.Assert.assertNotNull(thread30);
        org.junit.Assert.assertEquals(thread30.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread31);
        org.junit.Assert.assertEquals(thread31.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread32);
        org.junit.Assert.assertEquals(thread32.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread33);
        org.junit.Assert.assertEquals(thread33.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(thread34);
        org.junit.Assert.assertEquals(thread34.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(thread36);
        org.junit.Assert.assertEquals(thread36.toString(), "Thread[hi!-3,5,main]");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder6.cmd(strArray20);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder30 = sh.nerd.async.process.AsyncProcess.cmd(strArray29);
        sh.nerd.async.process.AsyncProcess.Builder builder32 = builder30.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder34 = builder30.cwd("");
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder41 = sh.nerd.async.process.AsyncProcess.cmd(strArray40);
        sh.nerd.async.process.AsyncProcess.Builder builder42 = builder34.cmd(strArray40);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder49 = sh.nerd.async.process.AsyncProcess.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder50 = sh.nerd.async.process.AsyncProcess.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder34.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder52 = builder6.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder53 = sh.nerd.async.process.AsyncProcess.cmd(strArray48);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result54 = sh.nerd.async.process.AsyncProcess.run(strArray48);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder10.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder36 = sh.nerd.async.process.AsyncProcess.cmd(strArray35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder43 = sh.nerd.async.process.AsyncProcess.cmd(strArray42);
        sh.nerd.async.process.AsyncProcess.Builder builder44 = builder36.cmd(strArray42);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder51 = sh.nerd.async.process.AsyncProcess.cmd(strArray50);
        sh.nerd.async.process.AsyncProcess.Builder builder52 = sh.nerd.async.process.AsyncProcess.cmd(strArray50);
        sh.nerd.async.process.AsyncProcess.Builder builder53 = builder36.cmd(strArray50);
        sh.nerd.async.process.AsyncProcess.Builder builder54 = sh.nerd.async.process.AsyncProcess.cmd(strArray50);
        sh.nerd.async.process.AsyncProcess.Builder builder55 = builder29.cmd(strArray50);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder57 = builder55.env(strMap56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder6.cmd(strArray20);
        java.util.function.Consumer<java.lang.String> strConsumer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder25 = builder6.out(strConsumer24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        java.util.function.Supplier<java.lang.String> strSupplier0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.util.function.Consumer<java.lang.String> strConsumer2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder9 = sh.nerd.async.process.AsyncProcess.cmd(strArray8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder16 = sh.nerd.async.process.AsyncProcess.cmd(strArray15);
        sh.nerd.async.process.AsyncProcess.Builder builder17 = builder9.cmd(strArray15);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = builder9.cmd(strArray23);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder33 = sh.nerd.async.process.AsyncProcess.cmd(strArray32);
        sh.nerd.async.process.AsyncProcess.Builder builder35 = builder33.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder37 = builder33.cwd("");
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder44 = sh.nerd.async.process.AsyncProcess.cmd(strArray43);
        sh.nerd.async.process.AsyncProcess.Builder builder45 = builder37.cmd(strArray43);
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder52 = sh.nerd.async.process.AsyncProcess.cmd(strArray51);
        sh.nerd.async.process.AsyncProcess.Builder builder53 = sh.nerd.async.process.AsyncProcess.cmd(strArray51);
        sh.nerd.async.process.AsyncProcess.Builder builder54 = builder37.cmd(strArray51);
        sh.nerd.async.process.AsyncProcess.Builder builder55 = builder9.cmd(strArray51);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result56 = sh.nerd.async.process.AsyncProcess.run(strSupplier0, strConsumer1, strConsumer2, strArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        sh.nerd.async.process.AsyncProcess.Builder builder2 = builder0.cwd("");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder9 = sh.nerd.async.process.AsyncProcess.cmd(strArray8);
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder9.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder13 = builder11.cwd("");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder20 = sh.nerd.async.process.AsyncProcess.cmd(strArray19);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder28 = builder20.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder30 = builder11.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder2.cmd(strArray26);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        sh.nerd.async.process.AsyncProcess.Builder builder40 = builder38.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder42 = builder40.cwd("hi!");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder49 = sh.nerd.async.process.AsyncProcess.cmd(strArray48);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder56 = sh.nerd.async.process.AsyncProcess.cmd(strArray55);
        sh.nerd.async.process.AsyncProcess.Builder builder57 = builder49.cmd(strArray55);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder64 = sh.nerd.async.process.AsyncProcess.cmd(strArray63);
        sh.nerd.async.process.AsyncProcess.Builder builder65 = sh.nerd.async.process.AsyncProcess.cmd(strArray63);
        sh.nerd.async.process.AsyncProcess.Builder builder66 = builder49.cmd(strArray63);
        sh.nerd.async.process.AsyncProcess.Builder builder67 = builder42.cmd(strArray63);
        sh.nerd.async.process.AsyncProcess.Builder builder68 = builder31.cmd(strArray63);
        java.util.function.Consumer<java.lang.String> strConsumer69 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder70 = builder31.out(strConsumer69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder68);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder10.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder28 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        java.util.function.Consumer<java.lang.String> strConsumer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder30 = builder28.err(strConsumer29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder29.cwd("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder45 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder46 = builder38.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder29.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = builder20.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder49.cwd("hi!");
        java.io.File file52 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder53 = builder51.cwd(file52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder15 = sh.nerd.async.process.AsyncProcess.cmd(strArray14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray21);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder15.cmd(strArray21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder30 = sh.nerd.async.process.AsyncProcess.cmd(strArray29);
        sh.nerd.async.process.AsyncProcess.Builder builder31 = sh.nerd.async.process.AsyncProcess.cmd(strArray29);
        sh.nerd.async.process.AsyncProcess.Builder builder32 = builder15.cmd(strArray29);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder39 = sh.nerd.async.process.AsyncProcess.cmd(strArray38);
        sh.nerd.async.process.AsyncProcess.Builder builder41 = builder39.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder43 = builder39.cwd("");
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder50 = sh.nerd.async.process.AsyncProcess.cmd(strArray49);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder43.cmd(strArray49);
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder58 = sh.nerd.async.process.AsyncProcess.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder59 = sh.nerd.async.process.AsyncProcess.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder60 = builder43.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder61 = builder15.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder62 = builder8.cmd(strArray57);
        java.util.function.Supplier<java.lang.String> strSupplier63 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder64 = builder62.in(strSupplier63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        sh.nerd.async.process.AsyncProcess.Builder builder9 = builder7.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder7.cwd("");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder18 = sh.nerd.async.process.AsyncProcess.cmd(strArray17);
        sh.nerd.async.process.AsyncProcess.Builder builder19 = builder11.cmd(strArray17);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray25);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray25);
        sh.nerd.async.process.AsyncProcess.Builder builder28 = builder11.cmd(strArray25);
        sh.nerd.async.process.AsyncProcess.Builder builder30 = builder28.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder31 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder45 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder46 = builder38.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = builder31.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder28.cmd(strArray44);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result49 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder10.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder22 = builder20.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder24 = builder20.cwd("");
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result25 = builder24.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\" (in directory \"\"): error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder29.cwd("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder45 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder46 = builder38.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder29.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = builder20.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder49.cwd("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap52 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder53 = builder49.env(strMap52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("hi!");
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder6.err(strConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder32 = sh.nerd.async.process.AsyncProcess.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder33 = sh.nerd.async.process.AsyncProcess.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder34 = builder17.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder35 = builder10.cmd(strArray31);
        java.util.function.Supplier<java.lang.String> strSupplier36 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder37 = builder35.in(strSupplier36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder29.cwd("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder45 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder46 = builder38.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder29.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = builder20.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder50 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        java.util.function.Consumer<java.lang.String> strConsumer51 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder52 = builder50.err(strConsumer51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder29.cwd("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder45 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder46 = builder38.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder29.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = builder20.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder50 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder52 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        java.util.function.Supplier<java.lang.String> strSupplier0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.util.function.Consumer<java.lang.String> strConsumer2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder9 = sh.nerd.async.process.AsyncProcess.cmd(strArray8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder16 = sh.nerd.async.process.AsyncProcess.cmd(strArray15);
        sh.nerd.async.process.AsyncProcess.Builder builder17 = builder9.cmd(strArray15);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = builder9.cmd(strArray23);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result27 = sh.nerd.async.process.AsyncProcess.run(strSupplier0, strConsumer1, strConsumer2, strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("hi!");
        java.util.function.Supplier<java.lang.String> strSupplier11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder6.in(strSupplier11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        sh.nerd.async.process.AsyncProcess.Builder builder2 = builder0.cwd("");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder9 = sh.nerd.async.process.AsyncProcess.cmd(strArray8);
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder9.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder13 = builder11.cwd("");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder20 = sh.nerd.async.process.AsyncProcess.cmd(strArray19);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder28 = builder20.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder30 = builder11.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder2.cmd(strArray26);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result32 = sh.nerd.async.process.AsyncProcess.run(strArray26);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.util.function.Supplier<java.lang.String> strSupplier15 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder16 = builder6.in(strSupplier15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.cwd("");
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder14 = builder10.err(strConsumer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder10.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder30 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder37 = sh.nerd.async.process.AsyncProcess.cmd(strArray36);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder44 = sh.nerd.async.process.AsyncProcess.cmd(strArray43);
        sh.nerd.async.process.AsyncProcess.Builder builder45 = builder37.cmd(strArray43);
        sh.nerd.async.process.AsyncProcess.Builder builder46 = builder30.cmd(strArray43);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = builder27.cmd(strArray43);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = sh.nerd.async.process.AsyncProcess.cmd(strArray43);
        java.util.function.Supplier<java.lang.String> strSupplier49 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder50 = builder48.in(strSupplier49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.out(strConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder27.cwd("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        sh.nerd.async.process.AsyncProcess.Builder builder39 = builder31.cmd(strArray37);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder46 = sh.nerd.async.process.AsyncProcess.cmd(strArray45);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = builder31.cmd(strArray45);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder20.cmd(strArray45);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = sh.nerd.async.process.AsyncProcess.cmd(strArray45);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result50 = builder49.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder10.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder28 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder30 = builder28.env(strMap29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        java.util.function.Supplier<java.lang.String> strSupplier9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.in(strSupplier9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder8.cmd(strArray23);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result28 = sh.nerd.async.process.AsyncProcess.run(strArray23);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder6.cwd("");
        java.io.File file13 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cwd(file13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result1 = sh.nerd.async.process.AsyncProcess.run(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder8.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder8.cwd("");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder31 = builder8.env(strMap30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder8.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder28 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        sh.nerd.async.process.AsyncProcess.Builder builder9 = builder7.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder7.cwd("");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder18 = sh.nerd.async.process.AsyncProcess.cmd(strArray17);
        sh.nerd.async.process.AsyncProcess.Builder builder19 = builder11.cmd(strArray17);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray25);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder11.cmd(strArray25);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result28 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.env(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        sh.nerd.async.process.AsyncProcess.Builder builder2 = builder0.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder4 = builder2.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder6 = builder4.cwd("");
        java.util.function.Supplier<java.lang.String> strSupplier7 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.in(strSupplier7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("hi!");
        java.util.function.Supplier<java.lang.String> strSupplier11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder6.in(strSupplier11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder8.cmd(strArray23);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder34 = sh.nerd.async.process.AsyncProcess.cmd(strArray33);
        sh.nerd.async.process.AsyncProcess.Builder builder36 = builder34.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder38 = builder36.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder40 = builder36.cwd("");
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder47 = sh.nerd.async.process.AsyncProcess.cmd(strArray46);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = builder47.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder47.cwd("");
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder58 = sh.nerd.async.process.AsyncProcess.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder59 = builder51.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder61 = builder59.cwd("");
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder68 = sh.nerd.async.process.AsyncProcess.cmd(strArray67);
        sh.nerd.async.process.AsyncProcess.Builder builder70 = builder68.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder72 = builder70.cwd("");
        java.lang.String[] strArray78 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder79 = sh.nerd.async.process.AsyncProcess.cmd(strArray78);
        java.lang.String[] strArray85 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder86 = sh.nerd.async.process.AsyncProcess.cmd(strArray85);
        sh.nerd.async.process.AsyncProcess.Builder builder87 = builder79.cmd(strArray85);
        sh.nerd.async.process.AsyncProcess.Builder builder88 = sh.nerd.async.process.AsyncProcess.cmd(strArray85);
        sh.nerd.async.process.AsyncProcess.Builder builder89 = builder70.cmd(strArray85);
        sh.nerd.async.process.AsyncProcess.Builder builder90 = builder61.cmd(strArray85);
        sh.nerd.async.process.AsyncProcess.Builder builder91 = builder40.cmd(strArray85);
        sh.nerd.async.process.AsyncProcess.Builder builder92 = builder27.cmd(strArray85);
        sh.nerd.async.process.AsyncProcess.Builder builder94 = builder92.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder96 = builder92.cwd("");
        java.util.function.Consumer<java.lang.String> strConsumer97 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder98 = builder92.out(strConsumer97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(builder94);
        org.junit.Assert.assertNotNull(builder96);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder27.cwd("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        sh.nerd.async.process.AsyncProcess.Builder builder39 = builder31.cmd(strArray37);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder46 = sh.nerd.async.process.AsyncProcess.cmd(strArray45);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = builder31.cmd(strArray45);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder20.cmd(strArray45);
        sh.nerd.async.process.AsyncProcess.Builder builder50 = builder48.cwd("");
        java.io.File file51 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder52 = builder48.cwd(file51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.env(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder14 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder15 = builder7.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder16 = builder0.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder0.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.util.function.Supplier<java.lang.String> strSupplier21 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder22 = builder18.in(strSupplier21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.cwd("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray18);
        sh.nerd.async.process.AsyncProcess.Builder builder21 = builder19.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder21.cwd("");
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder30 = sh.nerd.async.process.AsyncProcess.cmd(strArray29);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder37 = sh.nerd.async.process.AsyncProcess.cmd(strArray36);
        sh.nerd.async.process.AsyncProcess.Builder builder38 = builder30.cmd(strArray36);
        sh.nerd.async.process.AsyncProcess.Builder builder39 = sh.nerd.async.process.AsyncProcess.cmd(strArray36);
        sh.nerd.async.process.AsyncProcess.Builder builder40 = builder21.cmd(strArray36);
        sh.nerd.async.process.AsyncProcess.Builder builder41 = sh.nerd.async.process.AsyncProcess.cmd(strArray36);
        sh.nerd.async.process.AsyncProcess.Builder builder42 = builder10.cmd(strArray36);
        sh.nerd.async.process.AsyncProcess.Builder builder43 = sh.nerd.async.process.AsyncProcess.cmd(strArray36);
        sh.nerd.async.process.AsyncProcess.Builder builder44 = sh.nerd.async.process.AsyncProcess.cmd(strArray36);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder8.cmd(strArray23);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder34 = sh.nerd.async.process.AsyncProcess.cmd(strArray33);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder41 = sh.nerd.async.process.AsyncProcess.cmd(strArray40);
        sh.nerd.async.process.AsyncProcess.Builder builder42 = builder34.cmd(strArray40);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder49 = sh.nerd.async.process.AsyncProcess.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder50 = sh.nerd.async.process.AsyncProcess.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder34.cmd(strArray48);
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder58 = sh.nerd.async.process.AsyncProcess.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder60 = builder58.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder62 = builder58.cwd("");
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder69 = sh.nerd.async.process.AsyncProcess.cmd(strArray68);
        sh.nerd.async.process.AsyncProcess.Builder builder70 = builder62.cmd(strArray68);
        java.lang.String[] strArray76 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder77 = sh.nerd.async.process.AsyncProcess.cmd(strArray76);
        sh.nerd.async.process.AsyncProcess.Builder builder78 = sh.nerd.async.process.AsyncProcess.cmd(strArray76);
        sh.nerd.async.process.AsyncProcess.Builder builder79 = builder62.cmd(strArray76);
        sh.nerd.async.process.AsyncProcess.Builder builder80 = builder34.cmd(strArray76);
        sh.nerd.async.process.AsyncProcess.Builder builder81 = sh.nerd.async.process.AsyncProcess.cmd(strArray76);
        sh.nerd.async.process.AsyncProcess.Builder builder82 = builder8.cmd(strArray76);
        sh.nerd.async.process.AsyncProcess.Builder builder84 = builder82.cwd("");
        java.util.function.Consumer<java.lang.String> strConsumer85 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder86 = builder82.err(strConsumer85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder84);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        sh.nerd.async.process.AsyncProcess.Builder builder2 = builder0.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder4 = builder2.cwd("hi!");
        java.util.concurrent.Executor executor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder6 = builder4.executor(executor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result19 = sh.nerd.async.process.AsyncProcess.run(strArray16);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        sh.nerd.async.process.AsyncProcess.Builder builder2 = builder0.cwd("");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder9 = sh.nerd.async.process.AsyncProcess.cmd(strArray8);
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder9.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder13 = builder11.cwd("");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder20 = sh.nerd.async.process.AsyncProcess.cmd(strArray19);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder28 = builder20.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder30 = builder11.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder2.cmd(strArray26);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        sh.nerd.async.process.AsyncProcess.Builder builder40 = builder38.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder42 = builder40.cwd("hi!");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder49 = sh.nerd.async.process.AsyncProcess.cmd(strArray48);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder56 = sh.nerd.async.process.AsyncProcess.cmd(strArray55);
        sh.nerd.async.process.AsyncProcess.Builder builder57 = builder49.cmd(strArray55);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder64 = sh.nerd.async.process.AsyncProcess.cmd(strArray63);
        sh.nerd.async.process.AsyncProcess.Builder builder65 = sh.nerd.async.process.AsyncProcess.cmd(strArray63);
        sh.nerd.async.process.AsyncProcess.Builder builder66 = builder49.cmd(strArray63);
        sh.nerd.async.process.AsyncProcess.Builder builder67 = builder42.cmd(strArray63);
        sh.nerd.async.process.AsyncProcess.Builder builder68 = builder31.cmd(strArray63);
        java.lang.Class<?> wildcardClass69 = builder68.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder8.cwd("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray18);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder12.cmd(strArray18);
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray18);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray18);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result23 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strConsumer1, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder32 = sh.nerd.async.process.AsyncProcess.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder33 = sh.nerd.async.process.AsyncProcess.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder34 = builder17.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder35 = builder10.cmd(strArray31);
        java.util.Map<java.lang.String, java.lang.String> strMap36 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder37 = builder10.env(strMap36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder6.cmd(strArray20);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder30 = sh.nerd.async.process.AsyncProcess.cmd(strArray29);
        sh.nerd.async.process.AsyncProcess.Builder builder32 = builder30.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder34 = builder30.cwd("");
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder41 = sh.nerd.async.process.AsyncProcess.cmd(strArray40);
        sh.nerd.async.process.AsyncProcess.Builder builder42 = builder34.cmd(strArray40);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder49 = sh.nerd.async.process.AsyncProcess.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder50 = sh.nerd.async.process.AsyncProcess.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder34.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder52 = builder6.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder53 = sh.nerd.async.process.AsyncProcess.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder54 = sh.nerd.async.process.AsyncProcess.cmd(strArray48);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder8.cwd("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray18);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder12.cmd(strArray18);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = builder20.cwd("");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder29 = sh.nerd.async.process.AsyncProcess.cmd(strArray28);
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder29.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder33 = builder31.cwd("");
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder40 = sh.nerd.async.process.AsyncProcess.cmd(strArray39);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder47 = sh.nerd.async.process.AsyncProcess.cmd(strArray46);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder40.cmd(strArray46);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = sh.nerd.async.process.AsyncProcess.cmd(strArray46);
        sh.nerd.async.process.AsyncProcess.Builder builder50 = builder31.cmd(strArray46);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder22.cmd(strArray46);
        sh.nerd.async.process.AsyncProcess.Builder builder52 = sh.nerd.async.process.AsyncProcess.cmd(strArray46);
        sh.nerd.async.process.AsyncProcess.Builder builder53 = sh.nerd.async.process.AsyncProcess.cmd(strArray46);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result54 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strConsumer1, strArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder14 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder15 = builder7.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder16 = builder0.cmd(strArray13);
        java.io.File file17 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder18 = builder0.cwd(file17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.cwd("");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        sh.nerd.async.process.AsyncProcess.Builder builder1 = new sh.nerd.async.process.AsyncProcess.Builder();
        sh.nerd.async.process.AsyncProcess.Builder builder3 = builder1.cwd("");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder10 = sh.nerd.async.process.AsyncProcess.cmd(strArray9);
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder12.cwd("");
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder28 = sh.nerd.async.process.AsyncProcess.cmd(strArray27);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder21.cmd(strArray27);
        sh.nerd.async.process.AsyncProcess.Builder builder30 = sh.nerd.async.process.AsyncProcess.cmd(strArray27);
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder12.cmd(strArray27);
        sh.nerd.async.process.AsyncProcess.Builder builder32 = builder3.cmd(strArray27);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result33 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder29.cwd("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder45 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder46 = builder38.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder29.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = builder20.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder49.cwd("hi!");
        java.io.File file52 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder53 = builder49.cwd(file52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        sh.nerd.async.process.AsyncProcess.Builder builder9 = builder7.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder7.cwd("");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder18 = sh.nerd.async.process.AsyncProcess.cmd(strArray17);
        sh.nerd.async.process.AsyncProcess.Builder builder19 = builder11.cmd(strArray17);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = sh.nerd.async.process.AsyncProcess.cmd(strArray17);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result21 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder29.cwd("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder45 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder46 = builder38.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder29.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = builder20.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder49.cwd("hi!");
        java.util.function.Supplier<java.lang.String> strSupplier52 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder53 = builder51.in(strSupplier52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder12.cwd("");
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder14.cmd(strArray20);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder10.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder22 = builder20.cwd("");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder24 = builder22.env(strMap23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.err(strConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        java.util.function.Supplier<java.lang.String> strSupplier0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.util.function.Consumer<java.lang.String> strConsumer2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder9 = sh.nerd.async.process.AsyncProcess.cmd(strArray8);
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder9.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder13 = builder9.cwd("");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder20 = sh.nerd.async.process.AsyncProcess.cmd(strArray19);
        sh.nerd.async.process.AsyncProcess.Builder builder21 = builder13.cmd(strArray19);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder21.cwd("");
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder30 = sh.nerd.async.process.AsyncProcess.cmd(strArray29);
        sh.nerd.async.process.AsyncProcess.Builder builder32 = builder30.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder34 = builder30.cwd("");
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder41 = sh.nerd.async.process.AsyncProcess.cmd(strArray40);
        sh.nerd.async.process.AsyncProcess.Builder builder42 = builder34.cmd(strArray40);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder49 = sh.nerd.async.process.AsyncProcess.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder50 = builder34.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder23.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder52 = sh.nerd.async.process.AsyncProcess.cmd(strArray48);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result53 = sh.nerd.async.process.AsyncProcess.run(strSupplier0, strConsumer1, strConsumer2, strArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = builder10.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder28 = builder26.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder30 = builder26.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder32 = builder26.cwd("");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.cwd("hi!");
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder14 = builder12.err(strConsumer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder14 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = builder14.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder7.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        java.util.Map<java.lang.String, java.lang.String> strMap25 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder26 = builder24.env(strMap25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder14 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = builder14.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder7.cmd(strArray20);
        java.util.function.Supplier<java.lang.String> strSupplier24 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder25 = builder7.in(strSupplier24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder8.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder8.cwd("");
        java.util.function.Supplier<java.lang.String> strSupplier30 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder31 = builder8.in(strSupplier30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder14 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder15 = builder7.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder16 = builder0.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder0.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder0.cwd("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder10.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder22 = builder20.cwd("");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder29 = sh.nerd.async.process.AsyncProcess.cmd(strArray28);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder36 = sh.nerd.async.process.AsyncProcess.cmd(strArray35);
        sh.nerd.async.process.AsyncProcess.Builder builder37 = builder29.cmd(strArray35);
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray35);
        sh.nerd.async.process.AsyncProcess.Builder builder39 = builder22.cmd(strArray35);
        sh.nerd.async.process.AsyncProcess.Builder builder41 = builder22.cwd("hi!");
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result42 = builder41.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\" (in directory \"hi!\"): error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder6.cwd("");
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.out(strConsumer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.cwd("hi!");
        java.lang.Class<?> wildcardClass13 = builder12.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder29.cwd("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder45 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder46 = builder38.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder29.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = builder20.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder50 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        java.lang.Class<?> wildcardClass52 = strArray44.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        sh.nerd.async.process.AsyncProcess.Builder builder1 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder15 = sh.nerd.async.process.AsyncProcess.cmd(strArray14);
        sh.nerd.async.process.AsyncProcess.Builder builder16 = builder8.cmd(strArray14);
        sh.nerd.async.process.AsyncProcess.Builder builder17 = builder1.cmd(strArray14);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result18 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder15 = sh.nerd.async.process.AsyncProcess.cmd(strArray14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray21);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder15.cmd(strArray21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder30 = sh.nerd.async.process.AsyncProcess.cmd(strArray29);
        sh.nerd.async.process.AsyncProcess.Builder builder31 = sh.nerd.async.process.AsyncProcess.cmd(strArray29);
        sh.nerd.async.process.AsyncProcess.Builder builder32 = builder15.cmd(strArray29);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder39 = sh.nerd.async.process.AsyncProcess.cmd(strArray38);
        sh.nerd.async.process.AsyncProcess.Builder builder41 = builder39.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder43 = builder39.cwd("");
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder50 = sh.nerd.async.process.AsyncProcess.cmd(strArray49);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder43.cmd(strArray49);
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder58 = sh.nerd.async.process.AsyncProcess.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder59 = sh.nerd.async.process.AsyncProcess.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder60 = builder43.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder61 = builder15.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder62 = builder8.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder64 = builder8.cwd("");
        java.util.Map<java.lang.String, java.lang.String> strMap65 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder66 = builder8.env(strMap65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder15 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        java.util.function.Consumer<java.lang.String> strConsumer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder17 = builder15.err(strConsumer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = builder20.cwd("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder24 = builder20.env(strMap23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder29.cwd("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder45 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder46 = builder38.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder29.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = builder20.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder49.cwd("hi!");
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder58 = sh.nerd.async.process.AsyncProcess.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder60 = builder58.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder62 = builder58.cwd("");
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder69 = sh.nerd.async.process.AsyncProcess.cmd(strArray68);
        sh.nerd.async.process.AsyncProcess.Builder builder70 = builder62.cmd(strArray68);
        sh.nerd.async.process.AsyncProcess.Builder builder71 = builder51.cmd(strArray68);
        java.lang.Class<?> wildcardClass72 = builder71.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test337");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder14 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder15 = builder7.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder16 = builder0.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder0.cwd("hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test338");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder8.cwd("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray18);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder12.cmd(strArray18);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = builder20.cwd("");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder29 = sh.nerd.async.process.AsyncProcess.cmd(strArray28);
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder29.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder33 = builder31.cwd("");
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder40 = sh.nerd.async.process.AsyncProcess.cmd(strArray39);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder47 = sh.nerd.async.process.AsyncProcess.cmd(strArray46);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder40.cmd(strArray46);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = sh.nerd.async.process.AsyncProcess.cmd(strArray46);
        sh.nerd.async.process.AsyncProcess.Builder builder50 = builder31.cmd(strArray46);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder22.cmd(strArray46);
        sh.nerd.async.process.AsyncProcess.Builder builder53 = builder51.cwd("hi!");
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder60 = sh.nerd.async.process.AsyncProcess.cmd(strArray59);
        sh.nerd.async.process.AsyncProcess.Builder builder62 = builder60.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder64 = builder60.cwd("");
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder71 = sh.nerd.async.process.AsyncProcess.cmd(strArray70);
        sh.nerd.async.process.AsyncProcess.Builder builder72 = builder64.cmd(strArray70);
        sh.nerd.async.process.AsyncProcess.Builder builder73 = builder53.cmd(strArray70);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result74 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strConsumer1, strArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder73);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test339");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder6.env(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder6.cwd(file11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test341");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        sh.nerd.async.process.AsyncProcess.Builder builder9 = builder7.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder7.cwd("");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder18 = sh.nerd.async.process.AsyncProcess.cmd(strArray17);
        sh.nerd.async.process.AsyncProcess.Builder builder19 = builder11.cmd(strArray17);
        sh.nerd.async.process.AsyncProcess.Builder builder21 = builder19.cwd("");
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder28 = sh.nerd.async.process.AsyncProcess.cmd(strArray27);
        sh.nerd.async.process.AsyncProcess.Builder builder30 = builder28.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder32 = builder28.cwd("");
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder39 = sh.nerd.async.process.AsyncProcess.cmd(strArray38);
        sh.nerd.async.process.AsyncProcess.Builder builder40 = builder32.cmd(strArray38);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder47 = sh.nerd.async.process.AsyncProcess.cmd(strArray46);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder32.cmd(strArray46);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = builder21.cmd(strArray46);
        sh.nerd.async.process.AsyncProcess.Builder builder50 = sh.nerd.async.process.AsyncProcess.cmd(strArray46);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result51 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test342");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder10.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        java.lang.Class<?> wildcardClass30 = builder29.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test343");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = builder20.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder24 = builder20.cwd("");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test344");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.cwd(file11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test345");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder29.cwd("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder45 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder46 = builder38.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder29.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = builder20.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder49.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder53 = builder49.cwd("");
        java.util.function.Consumer<java.lang.String> strConsumer54 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder55 = builder49.err(strConsumer54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test346");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.env(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test347");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder10.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder22 = builder20.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder24 = builder20.cwd("");
        java.io.File file25 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder26 = builder24.cwd(file25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test348");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.cwd("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray18);
        sh.nerd.async.process.AsyncProcess.Builder builder21 = builder19.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder21.cwd("");
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder30 = sh.nerd.async.process.AsyncProcess.cmd(strArray29);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder37 = sh.nerd.async.process.AsyncProcess.cmd(strArray36);
        sh.nerd.async.process.AsyncProcess.Builder builder38 = builder30.cmd(strArray36);
        sh.nerd.async.process.AsyncProcess.Builder builder39 = sh.nerd.async.process.AsyncProcess.cmd(strArray36);
        sh.nerd.async.process.AsyncProcess.Builder builder40 = builder21.cmd(strArray36);
        sh.nerd.async.process.AsyncProcess.Builder builder41 = sh.nerd.async.process.AsyncProcess.cmd(strArray36);
        sh.nerd.async.process.AsyncProcess.Builder builder42 = builder10.cmd(strArray36);
        sh.nerd.async.process.AsyncProcess.Builder builder43 = sh.nerd.async.process.AsyncProcess.cmd(strArray36);
        java.io.File file44 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder45 = builder43.cwd(file44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test349");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory1 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable2 = null;
        java.lang.Thread thread3 = namedThreadFactory1.newThread(runnable2);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory5 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable6 = null;
        java.lang.Thread thread7 = namedThreadFactory5.newThread(runnable6);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory9 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory11 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable12 = null;
        java.lang.Thread thread13 = namedThreadFactory11.newThread(runnable12);
        java.lang.Thread thread14 = namedThreadFactory9.newThread((java.lang.Runnable) thread13);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory16 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory18 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable19 = null;
        java.lang.Thread thread20 = namedThreadFactory18.newThread(runnable19);
        java.lang.Thread thread21 = namedThreadFactory16.newThread((java.lang.Runnable) thread20);
        java.lang.Thread thread22 = namedThreadFactory9.newThread((java.lang.Runnable) thread20);
        java.lang.Thread thread23 = namedThreadFactory5.newThread((java.lang.Runnable) thread22);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory25 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory27 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable28 = null;
        java.lang.Thread thread29 = namedThreadFactory27.newThread(runnable28);
        java.lang.Thread thread30 = namedThreadFactory25.newThread((java.lang.Runnable) thread29);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory32 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable33 = null;
        java.lang.Thread thread34 = namedThreadFactory32.newThread(runnable33);
        java.lang.Thread thread35 = namedThreadFactory25.newThread(runnable33);
        java.lang.Thread thread36 = namedThreadFactory5.newThread((java.lang.Runnable) thread35);
        java.lang.Thread thread37 = namedThreadFactory1.newThread((java.lang.Runnable) thread36);
        org.junit.Assert.assertNotNull(namedThreadFactory1);
        org.junit.Assert.assertNotNull(thread3);
        org.junit.Assert.assertEquals(thread3.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory5);
        org.junit.Assert.assertNotNull(thread7);
        org.junit.Assert.assertEquals(thread7.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory9);
        org.junit.Assert.assertNotNull(namedThreadFactory11);
        org.junit.Assert.assertNotNull(thread13);
        org.junit.Assert.assertEquals(thread13.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread14);
        org.junit.Assert.assertEquals(thread14.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory16);
        org.junit.Assert.assertNotNull(namedThreadFactory18);
        org.junit.Assert.assertNotNull(thread20);
        org.junit.Assert.assertEquals(thread20.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread21);
        org.junit.Assert.assertEquals(thread21.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread22);
        org.junit.Assert.assertEquals(thread22.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread23);
        org.junit.Assert.assertEquals(thread23.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory25);
        org.junit.Assert.assertNotNull(namedThreadFactory27);
        org.junit.Assert.assertNotNull(thread29);
        org.junit.Assert.assertEquals(thread29.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread30);
        org.junit.Assert.assertEquals(thread30.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory32);
        org.junit.Assert.assertNotNull(thread34);
        org.junit.Assert.assertEquals(thread34.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread35);
        org.junit.Assert.assertEquals(thread35.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread36);
        org.junit.Assert.assertEquals(thread36.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(thread37);
        org.junit.Assert.assertEquals(thread37.toString(), "Thread[hi!-1,5,main]");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test350");
        java.util.function.Supplier<java.lang.String> strSupplier0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.util.function.Consumer<java.lang.String> strConsumer2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder9 = sh.nerd.async.process.AsyncProcess.cmd(strArray8);
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder9.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder13 = builder9.cwd("");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder20 = sh.nerd.async.process.AsyncProcess.cmd(strArray19);
        sh.nerd.async.process.AsyncProcess.Builder builder21 = builder13.cmd(strArray19);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder13.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder23.cwd("");
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder32 = sh.nerd.async.process.AsyncProcess.cmd(strArray31);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder39 = sh.nerd.async.process.AsyncProcess.cmd(strArray38);
        sh.nerd.async.process.AsyncProcess.Builder builder40 = builder32.cmd(strArray38);
        sh.nerd.async.process.AsyncProcess.Builder builder41 = sh.nerd.async.process.AsyncProcess.cmd(strArray38);
        sh.nerd.async.process.AsyncProcess.Builder builder42 = builder25.cmd(strArray38);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result43 = sh.nerd.async.process.AsyncProcess.run(strSupplier0, strConsumer1, strConsumer2, strArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test351");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder32 = sh.nerd.async.process.AsyncProcess.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder33 = sh.nerd.async.process.AsyncProcess.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder34 = builder17.cmd(strArray31);
        sh.nerd.async.process.AsyncProcess.Builder builder35 = builder10.cmd(strArray31);
        java.util.Map<java.lang.String, java.lang.String> strMap36 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder37 = builder10.env(strMap36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test352");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder8.out(strConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test353");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        java.util.concurrent.Executor executor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder8.executor(executor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test354");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.env(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test355");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder8.cmd(strArray23);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder34 = sh.nerd.async.process.AsyncProcess.cmd(strArray33);
        sh.nerd.async.process.AsyncProcess.Builder builder36 = builder34.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder38 = builder36.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder40 = builder36.cwd("");
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder47 = sh.nerd.async.process.AsyncProcess.cmd(strArray46);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = builder47.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder47.cwd("");
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder58 = sh.nerd.async.process.AsyncProcess.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder59 = builder51.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder61 = builder59.cwd("");
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder68 = sh.nerd.async.process.AsyncProcess.cmd(strArray67);
        sh.nerd.async.process.AsyncProcess.Builder builder70 = builder68.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder72 = builder70.cwd("");
        java.lang.String[] strArray78 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder79 = sh.nerd.async.process.AsyncProcess.cmd(strArray78);
        java.lang.String[] strArray85 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder86 = sh.nerd.async.process.AsyncProcess.cmd(strArray85);
        sh.nerd.async.process.AsyncProcess.Builder builder87 = builder79.cmd(strArray85);
        sh.nerd.async.process.AsyncProcess.Builder builder88 = sh.nerd.async.process.AsyncProcess.cmd(strArray85);
        sh.nerd.async.process.AsyncProcess.Builder builder89 = builder70.cmd(strArray85);
        sh.nerd.async.process.AsyncProcess.Builder builder90 = builder61.cmd(strArray85);
        sh.nerd.async.process.AsyncProcess.Builder builder91 = builder40.cmd(strArray85);
        sh.nerd.async.process.AsyncProcess.Builder builder92 = builder27.cmd(strArray85);
        sh.nerd.async.process.AsyncProcess.Builder builder94 = builder92.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder96 = builder92.cwd("");
        java.util.Map<java.lang.String, java.lang.String> strMap97 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder98 = builder92.env(strMap97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(builder94);
        org.junit.Assert.assertNotNull(builder96);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test356");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder7 = sh.nerd.async.process.AsyncProcess.cmd(strArray6);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder14 = sh.nerd.async.process.AsyncProcess.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder15 = builder7.cmd(strArray13);
        sh.nerd.async.process.AsyncProcess.Builder builder16 = builder0.cmd(strArray13);
        java.io.File file17 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder18 = builder0.cwd(file17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test357");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder29.cwd("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder45 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder46 = builder38.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder29.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = builder20.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder20.cwd("hi!");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test358");
        java.util.function.Supplier<java.lang.String> strSupplier0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.util.function.Consumer<java.lang.String> strConsumer2 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result8 = sh.nerd.async.process.AsyncProcess.run(strSupplier0, strConsumer1, strConsumer2, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test359");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = builder10.cmd(strArray24);
        java.io.File file27 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder28 = builder26.cwd(file27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test360");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        sh.nerd.async.process.AsyncProcess.Builder builder2 = builder0.cwd("");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder9 = sh.nerd.async.process.AsyncProcess.cmd(strArray8);
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder9.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder13 = builder11.cwd("");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder20 = sh.nerd.async.process.AsyncProcess.cmd(strArray19);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder28 = builder20.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder30 = builder11.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder2.cmd(strArray26);
        java.lang.Class<?> wildcardClass32 = strArray26.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test361");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        sh.nerd.async.process.AsyncProcess.Builder builder2 = builder0.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder4 = builder2.cwd("hi!");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test362");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder8 = sh.nerd.async.process.AsyncProcess.cmd(strArray7);
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder8.cwd("hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray18);
        sh.nerd.async.process.AsyncProcess.Builder builder21 = builder19.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder19.cwd("");
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder30 = sh.nerd.async.process.AsyncProcess.cmd(strArray29);
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder23.cmd(strArray29);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        sh.nerd.async.process.AsyncProcess.Builder builder39 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        sh.nerd.async.process.AsyncProcess.Builder builder40 = builder23.cmd(strArray37);
        sh.nerd.async.process.AsyncProcess.Builder builder42 = builder40.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder43 = new sh.nerd.async.process.AsyncProcess.Builder();
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder50 = sh.nerd.async.process.AsyncProcess.cmd(strArray49);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder57 = sh.nerd.async.process.AsyncProcess.cmd(strArray56);
        sh.nerd.async.process.AsyncProcess.Builder builder58 = builder50.cmd(strArray56);
        sh.nerd.async.process.AsyncProcess.Builder builder59 = builder43.cmd(strArray56);
        sh.nerd.async.process.AsyncProcess.Builder builder60 = builder40.cmd(strArray56);
        sh.nerd.async.process.AsyncProcess.Builder builder61 = builder8.cmd(strArray56);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result62 = sh.nerd.async.process.AsyncProcess.run(strConsumer0, strConsumer1, strArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test363");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder10.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder22 = builder20.cwd("");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder29 = sh.nerd.async.process.AsyncProcess.cmd(strArray28);
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder29.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder33 = builder29.cwd("");
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder40 = sh.nerd.async.process.AsyncProcess.cmd(strArray39);
        sh.nerd.async.process.AsyncProcess.Builder builder41 = builder33.cmd(strArray39);
        sh.nerd.async.process.AsyncProcess.Builder builder42 = builder22.cmd(strArray39);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test364");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder29.cwd("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder45 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder46 = builder38.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder29.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = builder20.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder49.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder53 = builder49.cwd("");
        java.io.File file54 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder55 = builder53.cwd(file54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test365");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder6.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder25.cwd("");
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result28 = builder27.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\" (in directory \"\"): error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test366");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder28 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder20.cmd(strArray26);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test367");
        java.util.function.Supplier<java.lang.String> strSupplier0 = null;
        java.util.function.Consumer<java.lang.String> strConsumer1 = null;
        java.util.function.Consumer<java.lang.String> strConsumer2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder9 = sh.nerd.async.process.AsyncProcess.cmd(strArray8);
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder9.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder13 = builder11.cwd("hi!");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder20 = sh.nerd.async.process.AsyncProcess.cmd(strArray19);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder28 = builder20.cmd(strArray26);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder35 = sh.nerd.async.process.AsyncProcess.cmd(strArray34);
        sh.nerd.async.process.AsyncProcess.Builder builder36 = sh.nerd.async.process.AsyncProcess.cmd(strArray34);
        sh.nerd.async.process.AsyncProcess.Builder builder37 = builder20.cmd(strArray34);
        sh.nerd.async.process.AsyncProcess.Builder builder38 = builder13.cmd(strArray34);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result39 = sh.nerd.async.process.AsyncProcess.run(strSupplier0, strConsumer1, strConsumer2, strArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test368");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder10.cmd(strArray24);
        java.util.concurrent.Executor executor28 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.executor(executor28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test369");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder8.cmd(strArray23);
        java.util.concurrent.Executor executor28 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.executor(executor28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test370");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder24 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder25 = builder17.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = sh.nerd.async.process.AsyncProcess.cmd(strArray23);
        sh.nerd.async.process.AsyncProcess.Builder builder27 = builder8.cmd(strArray23);
        java.util.Map<java.lang.String, java.lang.String> strMap28 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.env(strMap28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test371");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder10.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder22 = builder20.cwd("");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder29 = sh.nerd.async.process.AsyncProcess.cmd(strArray28);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder36 = sh.nerd.async.process.AsyncProcess.cmd(strArray35);
        sh.nerd.async.process.AsyncProcess.Builder builder37 = builder29.cmd(strArray35);
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray35);
        sh.nerd.async.process.AsyncProcess.Builder builder39 = builder22.cmd(strArray35);
        sh.nerd.async.process.AsyncProcess.Builder builder41 = builder22.cwd("hi!");
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result42 = builder22.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\" (in directory \"hi!\"): error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test372");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder10.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder22 = builder20.cwd("");
        java.util.concurrent.Executor executor23 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder24 = builder20.executor(executor23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test373");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder15 = sh.nerd.async.process.AsyncProcess.cmd(strArray14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray21);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder15.cmd(strArray21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder30 = sh.nerd.async.process.AsyncProcess.cmd(strArray29);
        sh.nerd.async.process.AsyncProcess.Builder builder31 = sh.nerd.async.process.AsyncProcess.cmd(strArray29);
        sh.nerd.async.process.AsyncProcess.Builder builder32 = builder15.cmd(strArray29);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder39 = sh.nerd.async.process.AsyncProcess.cmd(strArray38);
        sh.nerd.async.process.AsyncProcess.Builder builder41 = builder39.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder43 = builder39.cwd("");
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder50 = sh.nerd.async.process.AsyncProcess.cmd(strArray49);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder43.cmd(strArray49);
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder58 = sh.nerd.async.process.AsyncProcess.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder59 = sh.nerd.async.process.AsyncProcess.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder60 = builder43.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder61 = builder15.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder62 = builder8.cmd(strArray57);
        sh.nerd.async.process.AsyncProcess.Builder builder63 = sh.nerd.async.process.AsyncProcess.cmd(strArray57);
        java.util.concurrent.Executor executor64 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder65 = builder63.executor(executor64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test374");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder25 = sh.nerd.async.process.AsyncProcess.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder26 = builder10.cmd(strArray24);
        sh.nerd.async.process.AsyncProcess.Builder builder28 = builder26.cwd("hi!");
        java.util.function.Consumer<java.lang.String> strConsumer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder30 = builder26.out(strConsumer29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test375");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder6.cmd(strArray20);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder30 = sh.nerd.async.process.AsyncProcess.cmd(strArray29);
        sh.nerd.async.process.AsyncProcess.Builder builder32 = builder30.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder34 = builder30.cwd("");
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder41 = sh.nerd.async.process.AsyncProcess.cmd(strArray40);
        sh.nerd.async.process.AsyncProcess.Builder builder42 = builder34.cmd(strArray40);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder49 = sh.nerd.async.process.AsyncProcess.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder50 = sh.nerd.async.process.AsyncProcess.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder34.cmd(strArray48);
        sh.nerd.async.process.AsyncProcess.Builder builder52 = builder6.cmd(strArray48);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result53 = builder6.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test376");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder13 = sh.nerd.async.process.AsyncProcess.cmd(strArray12);
        sh.nerd.async.process.AsyncProcess.Builder builder14 = builder6.cmd(strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder21 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder22 = sh.nerd.async.process.AsyncProcess.cmd(strArray20);
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder6.cmd(strArray20);
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.Result result24 = builder23.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"hi!\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test377");
        sh.nerd.async.process.AsyncProcess.Builder builder0 = new sh.nerd.async.process.AsyncProcess.Builder();
        sh.nerd.async.process.AsyncProcess.Builder builder2 = builder0.cwd("");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder9 = sh.nerd.async.process.AsyncProcess.cmd(strArray8);
        sh.nerd.async.process.AsyncProcess.Builder builder11 = builder9.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder13 = builder11.cwd("");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder20 = sh.nerd.async.process.AsyncProcess.cmd(strArray19);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder28 = builder20.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder30 = builder11.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder2.cmd(strArray26);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        sh.nerd.async.process.AsyncProcess.Builder builder40 = builder38.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder42 = builder40.cwd("hi!");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder49 = sh.nerd.async.process.AsyncProcess.cmd(strArray48);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder56 = sh.nerd.async.process.AsyncProcess.cmd(strArray55);
        sh.nerd.async.process.AsyncProcess.Builder builder57 = builder49.cmd(strArray55);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder64 = sh.nerd.async.process.AsyncProcess.cmd(strArray63);
        sh.nerd.async.process.AsyncProcess.Builder builder65 = sh.nerd.async.process.AsyncProcess.cmd(strArray63);
        sh.nerd.async.process.AsyncProcess.Builder builder66 = builder49.cmd(strArray63);
        sh.nerd.async.process.AsyncProcess.Builder builder67 = builder42.cmd(strArray63);
        sh.nerd.async.process.AsyncProcess.Builder builder68 = builder31.cmd(strArray63);
        java.util.Map<java.lang.String, java.lang.String> strMap69 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder70 = builder31.env(strMap69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder68);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test378");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.cwd("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray18);
        sh.nerd.async.process.AsyncProcess.Builder builder21 = builder19.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder19.cwd("");
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder30 = sh.nerd.async.process.AsyncProcess.cmd(strArray29);
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder23.cmd(strArray29);
        sh.nerd.async.process.AsyncProcess.Builder builder33 = builder31.cwd("");
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder40 = sh.nerd.async.process.AsyncProcess.cmd(strArray39);
        sh.nerd.async.process.AsyncProcess.Builder builder42 = builder40.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder44 = builder40.cwd("");
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder51 = sh.nerd.async.process.AsyncProcess.cmd(strArray50);
        sh.nerd.async.process.AsyncProcess.Builder builder52 = builder44.cmd(strArray50);
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder59 = sh.nerd.async.process.AsyncProcess.cmd(strArray58);
        sh.nerd.async.process.AsyncProcess.Builder builder60 = builder44.cmd(strArray58);
        sh.nerd.async.process.AsyncProcess.Builder builder61 = builder33.cmd(strArray58);
        sh.nerd.async.process.AsyncProcess.Builder builder62 = sh.nerd.async.process.AsyncProcess.cmd(strArray58);
        sh.nerd.async.process.AsyncProcess.Builder builder63 = builder12.cmd(strArray58);
        java.lang.Class<?> wildcardClass64 = strArray58.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test379");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd(file9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test380");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder29.cwd("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder45 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder46 = builder38.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder29.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = builder20.cmd(strArray44);
        java.util.Map<java.lang.String, java.lang.String> strMap50 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder51 = builder20.env(strMap50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test381");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory1 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory3 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable4 = null;
        java.lang.Thread thread5 = namedThreadFactory3.newThread(runnable4);
        java.lang.Thread thread6 = namedThreadFactory1.newThread((java.lang.Runnable) thread5);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory8 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable9 = null;
        java.lang.Thread thread10 = namedThreadFactory8.newThread(runnable9);
        java.lang.Thread thread11 = namedThreadFactory1.newThread(runnable9);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory13 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable14 = null;
        java.lang.Thread thread15 = namedThreadFactory13.newThread(runnable14);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory17 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable18 = null;
        java.lang.Thread thread19 = namedThreadFactory17.newThread(runnable18);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory21 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory23 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable24 = null;
        java.lang.Thread thread25 = namedThreadFactory23.newThread(runnable24);
        java.lang.Thread thread26 = namedThreadFactory21.newThread((java.lang.Runnable) thread25);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory28 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory30 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable31 = null;
        java.lang.Thread thread32 = namedThreadFactory30.newThread(runnable31);
        java.lang.Thread thread33 = namedThreadFactory28.newThread((java.lang.Runnable) thread32);
        java.lang.Thread thread34 = namedThreadFactory21.newThread((java.lang.Runnable) thread32);
        java.lang.Thread thread35 = namedThreadFactory17.newThread((java.lang.Runnable) thread34);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory37 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory39 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable40 = null;
        java.lang.Thread thread41 = namedThreadFactory39.newThread(runnable40);
        java.lang.Thread thread42 = namedThreadFactory37.newThread((java.lang.Runnable) thread41);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory44 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable45 = null;
        java.lang.Thread thread46 = namedThreadFactory44.newThread(runnable45);
        java.lang.Thread thread47 = namedThreadFactory37.newThread(runnable45);
        java.lang.Thread thread48 = namedThreadFactory17.newThread((java.lang.Runnable) thread47);
        java.lang.Thread thread49 = namedThreadFactory13.newThread((java.lang.Runnable) thread47);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory51 = sh.nerd.async.process.NamedThreadFactory.withPrefix("");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory53 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable54 = null;
        java.lang.Thread thread55 = namedThreadFactory53.newThread(runnable54);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory57 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable58 = null;
        java.lang.Thread thread59 = namedThreadFactory57.newThread(runnable58);
        java.lang.Thread thread60 = namedThreadFactory53.newThread(runnable58);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory62 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory64 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable65 = null;
        java.lang.Thread thread66 = namedThreadFactory64.newThread(runnable65);
        java.lang.Thread thread67 = namedThreadFactory62.newThread((java.lang.Runnable) thread66);
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory69 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        sh.nerd.async.process.NamedThreadFactory namedThreadFactory71 = sh.nerd.async.process.NamedThreadFactory.withPrefix("hi!");
        java.lang.Runnable runnable72 = null;
        java.lang.Thread thread73 = namedThreadFactory71.newThread(runnable72);
        java.lang.Thread thread74 = namedThreadFactory69.newThread((java.lang.Runnable) thread73);
        java.lang.Thread thread75 = namedThreadFactory62.newThread((java.lang.Runnable) thread73);
        java.lang.Thread thread76 = namedThreadFactory53.newThread((java.lang.Runnable) thread73);
        java.lang.Thread thread77 = namedThreadFactory51.newThread((java.lang.Runnable) thread73);
        java.lang.Thread thread78 = namedThreadFactory13.newThread((java.lang.Runnable) thread77);
        java.lang.Thread thread79 = namedThreadFactory1.newThread((java.lang.Runnable) thread78);
        org.junit.Assert.assertNotNull(namedThreadFactory1);
        org.junit.Assert.assertNotNull(namedThreadFactory3);
        org.junit.Assert.assertNotNull(thread5);
        org.junit.Assert.assertEquals(thread5.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread6);
        org.junit.Assert.assertEquals(thread6.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory8);
        org.junit.Assert.assertNotNull(thread10);
        org.junit.Assert.assertEquals(thread10.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread11);
        org.junit.Assert.assertEquals(thread11.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory13);
        org.junit.Assert.assertNotNull(thread15);
        org.junit.Assert.assertEquals(thread15.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory17);
        org.junit.Assert.assertNotNull(thread19);
        org.junit.Assert.assertEquals(thread19.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory21);
        org.junit.Assert.assertNotNull(namedThreadFactory23);
        org.junit.Assert.assertNotNull(thread25);
        org.junit.Assert.assertEquals(thread25.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread26);
        org.junit.Assert.assertEquals(thread26.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory28);
        org.junit.Assert.assertNotNull(namedThreadFactory30);
        org.junit.Assert.assertNotNull(thread32);
        org.junit.Assert.assertEquals(thread32.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread33);
        org.junit.Assert.assertEquals(thread33.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread34);
        org.junit.Assert.assertEquals(thread34.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread35);
        org.junit.Assert.assertEquals(thread35.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory37);
        org.junit.Assert.assertNotNull(namedThreadFactory39);
        org.junit.Assert.assertNotNull(thread41);
        org.junit.Assert.assertEquals(thread41.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread42);
        org.junit.Assert.assertEquals(thread42.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory44);
        org.junit.Assert.assertNotNull(thread46);
        org.junit.Assert.assertEquals(thread46.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread47);
        org.junit.Assert.assertEquals(thread47.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread48);
        org.junit.Assert.assertEquals(thread48.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(thread49);
        org.junit.Assert.assertEquals(thread49.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory51);
        org.junit.Assert.assertNotNull(namedThreadFactory53);
        org.junit.Assert.assertNotNull(thread55);
        org.junit.Assert.assertEquals(thread55.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory57);
        org.junit.Assert.assertNotNull(thread59);
        org.junit.Assert.assertEquals(thread59.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread60);
        org.junit.Assert.assertEquals(thread60.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory62);
        org.junit.Assert.assertNotNull(namedThreadFactory64);
        org.junit.Assert.assertNotNull(thread66);
        org.junit.Assert.assertEquals(thread66.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread67);
        org.junit.Assert.assertEquals(thread67.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(namedThreadFactory69);
        org.junit.Assert.assertNotNull(namedThreadFactory71);
        org.junit.Assert.assertNotNull(thread73);
        org.junit.Assert.assertEquals(thread73.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread74);
        org.junit.Assert.assertEquals(thread74.toString(), "Thread[hi!-0,5,main]");
        org.junit.Assert.assertNotNull(thread75);
        org.junit.Assert.assertEquals(thread75.toString(), "Thread[hi!-1,5,main]");
        org.junit.Assert.assertNotNull(thread76);
        org.junit.Assert.assertEquals(thread76.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(thread77);
        org.junit.Assert.assertEquals(thread77.toString(), "Thread[-0,5,main]");
        org.junit.Assert.assertNotNull(thread78);
        org.junit.Assert.assertEquals(thread78.toString(), "Thread[hi!-2,5,main]");
        org.junit.Assert.assertNotNull(thread79);
        org.junit.Assert.assertEquals(thread79.toString(), "Thread[hi!-2,5,main]");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test382");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder29.cwd("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder45 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder46 = builder38.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = sh.nerd.async.process.AsyncProcess.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder29.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder49 = builder20.cmd(strArray44);
        sh.nerd.async.process.AsyncProcess.Builder builder51 = builder49.cwd("hi!");
        java.io.File file52 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder53 = builder49.cwd(file52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test383");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder8.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder12 = builder10.cwd("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder19 = sh.nerd.async.process.AsyncProcess.cmd(strArray18);
        sh.nerd.async.process.AsyncProcess.Builder builder21 = builder19.cwd("");
        sh.nerd.async.process.AsyncProcess.Builder builder23 = builder21.cwd("");
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder30 = sh.nerd.async.process.AsyncProcess.cmd(strArray29);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder37 = sh.nerd.async.process.AsyncProcess.cmd(strArray36);
        sh.nerd.async.process.AsyncProcess.Builder builder38 = builder30.cmd(strArray36);
        sh.nerd.async.process.AsyncProcess.Builder builder39 = sh.nerd.async.process.AsyncProcess.cmd(strArray36);
        sh.nerd.async.process.AsyncProcess.Builder builder40 = builder21.cmd(strArray36);
        sh.nerd.async.process.AsyncProcess.Builder builder41 = sh.nerd.async.process.AsyncProcess.cmd(strArray36);
        sh.nerd.async.process.AsyncProcess.Builder builder42 = builder10.cmd(strArray36);
        java.io.File file43 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder44 = builder42.cwd(file43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Path can't be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test384");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder6 = sh.nerd.async.process.AsyncProcess.cmd(strArray5);
        sh.nerd.async.process.AsyncProcess.Builder builder8 = builder6.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder10 = builder6.cwd("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder17 = sh.nerd.async.process.AsyncProcess.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder18 = builder10.cmd(strArray16);
        sh.nerd.async.process.AsyncProcess.Builder builder20 = builder18.cwd("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder27 = sh.nerd.async.process.AsyncProcess.cmd(strArray26);
        sh.nerd.async.process.AsyncProcess.Builder builder29 = builder27.cwd("hi!");
        sh.nerd.async.process.AsyncProcess.Builder builder31 = builder27.cwd("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder38 = sh.nerd.async.process.AsyncProcess.cmd(strArray37);
        sh.nerd.async.process.AsyncProcess.Builder builder39 = builder31.cmd(strArray37);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        sh.nerd.async.process.AsyncProcess.Builder builder46 = sh.nerd.async.process.AsyncProcess.cmd(strArray45);
        sh.nerd.async.process.AsyncProcess.Builder builder47 = builder31.cmd(strArray45);
        sh.nerd.async.process.AsyncProcess.Builder builder48 = builder20.cmd(strArray45);
        sh.nerd.async.process.AsyncProcess.Builder builder50 = builder48.cwd("");
        java.util.function.Consumer<java.lang.String> strConsumer51 = null;
        // The following exception was thrown during execution in test generation
        try {
            sh.nerd.async.process.AsyncProcess.Builder builder52 = builder48.err(strConsumer51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
    }
}

