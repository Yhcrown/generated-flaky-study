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
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber1 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber1.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        org.reactivestreams.Subscription subscription5 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber1 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0);
        charSequenceAdaptiveSubscriber1.onComplete();
        org.reactivestreams.Subscription subscription3 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber1.onSubscribe(subscription3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        java.lang.Throwable throwable5 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable5);
        java.lang.Class<?> wildcardClass7 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber1 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0);
        charSequenceAdaptiveSubscriber1.onComplete();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber1.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.String>> strSubscriberSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.String> strAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.String>(strSubscriberSupplier0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.io.Serializable>> serializableSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.io.Serializable> serializableAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.io.Serializable>(serializableSubscriberSupplier0, (int) (byte) 10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        java.lang.Class<?> wildcardClass5 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber1 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0);
        org.reactivestreams.Subscription subscription2 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber1.onSubscribe(subscription2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (short) 1, threadPoolExecutor2, resourceMonitor3);
        org.reactivestreams.Subscription subscription5 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (short) 1, threadPoolExecutor2, resourceMonitor3);
        java.lang.Class<?> wildcardClass5 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        org.reactivestreams.Subscription subscription5 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        java.lang.Class<?> wildcardClass4 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (short) 0, threadPoolExecutor2, resourceMonitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        org.reactivestreams.Subscription subscription7 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass11 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (short) 1, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        org.reactivestreams.Subscription subscription3 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 0, threadPoolExecutor2, resourceMonitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        java.lang.Class<?> wildcardClass3 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        java.util.function.Supplier<org.reactivestreams.Subscriber<org.reactivestreams.Subscriber<java.lang.CharSequence>>> charSequenceSubscriberSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberAdaptiveSubscriber1 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<org.reactivestreams.Subscriber<java.lang.CharSequence>>(charSequenceSubscriberSubscriberSupplier0);
        java.lang.Class<?> wildcardClass2 = charSequenceSubscriberAdaptiveSubscriber1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable7 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable7);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 0, threadPoolExecutor2, resourceMonitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        java.util.function.Supplier<org.reactivestreams.Subscriber<org.reactivestreams.Subscriber<java.lang.CharSequence>>> charSequenceSubscriberSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<org.reactivestreams.Subscriber<java.lang.CharSequence>>(charSequenceSubscriberSubscriberSupplier0, 100, threadPoolExecutor2, resourceMonitor3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 100, threadPoolExecutor2, resourceMonitor3);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable7 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable7);
        org.reactivestreams.Subscription subscription9 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 100);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 1, threadPoolExecutor2, resourceMonitor3);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        org.reactivestreams.Subscription subscription5 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (short) 1, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.reflect.Type>> typeSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.Type> typeAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.Type>(typeSubscriberSupplier0, (int) (short) 0, threadPoolExecutor2, resourceMonitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 10, threadPoolExecutor2, resourceMonitor3);
        java.lang.Class<?> wildcardClass5 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 10, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass7 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (-1), threadPoolExecutor2, resourceMonitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.util.function.Supplier<org.reactivestreams.Subscriber<org.reactivestreams.Subscriber<java.lang.CharSequence>>> charSequenceSubscriberSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<org.reactivestreams.Subscriber<java.lang.CharSequence>>(charSequenceSubscriberSubscriberSupplier0, (int) (short) 10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (short) 1, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        org.reactivestreams.Subscription subscription7 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.io.Serializable>> serializableSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.io.Serializable> serializableAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.io.Serializable>(serializableSubscriberSupplier0, (int) (byte) 100);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        java.lang.Class<?> wildcardClass11 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        org.reactivestreams.Subscription subscription11 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (short) 1, threadPoolExecutor2, resourceMonitor3);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        charSequenceAdaptiveSubscriber2.onComplete();
        java.lang.Class<?> wildcardClass6 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 1, threadPoolExecutor2, resourceMonitor3);
        org.reactivestreams.Subscription subscription5 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 1, threadPoolExecutor2, resourceMonitor3);
        java.lang.Class<?> wildcardClass5 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable7 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable7);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.Object>> objSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Object> objAdaptiveSubscriber1 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Object>(objSubscriberSupplier0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.Comparable<java.lang.String>>> strComparableSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Comparable<java.lang.String>> strComparableAdaptiveSubscriber1 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Comparable<java.lang.String>>(strComparableSubscriberSupplier0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.Comparable<java.lang.String>>> strComparableSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Comparable<java.lang.String>> strComparableAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Comparable<java.lang.String>>(strComparableSubscriberSupplier0, (int) (byte) 100);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.Comparable<java.lang.String>>> strComparableSubscriberSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Comparable<java.lang.String>> strComparableAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Comparable<java.lang.String>>(strComparableSubscriberSupplier0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#', threadPoolExecutor2, resourceMonitor3);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) ' ');
        java.lang.Throwable throwable3 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable3);
        org.reactivestreams.Subscription subscription5 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 10, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        org.reactivestreams.Subscription subscription7 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 10, threadPoolExecutor2, resourceMonitor3);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 10, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable7 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable7);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        org.reactivestreams.Subscription subscription4 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (short) 1, threadPoolExecutor2, resourceMonitor3);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) -1, threadPoolExecutor2, resourceMonitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        java.lang.CharSequence charSequence11 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onNext(charSequence11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber2.onComplete();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 100);
        org.reactivestreams.Subscription subscription3 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable7 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable7);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.util.function.Supplier<org.reactivestreams.Subscriber<com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>>> charSequenceAdaptiveSubscriberSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>> charSequenceAdaptiveSubscriberAdaptiveSubscriber1 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>>(charSequenceAdaptiveSubscriberSubscriberSupplier0);
        java.lang.Class<?> wildcardClass2 = charSequenceAdaptiveSubscriberAdaptiveSubscriber1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable7 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable7);
        java.lang.Class<?> wildcardClass9 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 1, threadPoolExecutor2, resourceMonitor3);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#', threadPoolExecutor2, resourceMonitor3);
        java.lang.Class<?> wildcardClass5 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 10, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        org.reactivestreams.Subscription subscription9 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        java.lang.Throwable throwable7 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable7);
        org.reactivestreams.Subscription subscription9 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.io.Serializable>> serializableSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.io.Serializable> serializableAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.io.Serializable>(serializableSubscriberSupplier0, 100);
        java.lang.Class<?> wildcardClass3 = serializableAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        java.util.function.Supplier<org.reactivestreams.Subscriber<io.reactivex.rxjava3.subscribers.DefaultSubscriber<java.lang.CharSequence>>> charSequenceDefaultSubscriberSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.subscribers.DefaultSubscriber<java.lang.CharSequence>> charSequenceDefaultSubscriberAdaptiveSubscriber1 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.subscribers.DefaultSubscriber<java.lang.CharSequence>>(charSequenceDefaultSubscriberSubscriberSupplier0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#', threadPoolExecutor2, resourceMonitor3);
        org.reactivestreams.Subscription subscription5 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        java.lang.Throwable throwable11 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable11);
        java.lang.Class<?> wildcardClass13 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.String>> strSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.String> strAdaptiveSubscriber1 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.String>(strSubscriberSupplier0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 100);
        charSequenceAdaptiveSubscriber2.onComplete();
        org.reactivestreams.Subscription subscription4 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.reflect.GenericDeclaration>> genericDeclarationSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.GenericDeclaration> genericDeclarationAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.GenericDeclaration>(genericDeclarationSubscriberSupplier0, (int) (short) -1, threadPoolExecutor2, resourceMonitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.reflect.GenericDeclaration>> genericDeclarationSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.GenericDeclaration> genericDeclarationAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.GenericDeclaration>(genericDeclarationSubscriberSupplier0, (-1), threadPoolExecutor2, resourceMonitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 10, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 10, threadPoolExecutor2, resourceMonitor3);
        java.lang.Throwable throwable5 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable5);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.String>> strSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.String> strAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.String>(strSubscriberSupplier0, (-1), threadPoolExecutor2, resourceMonitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable13 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable13);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) ' ');
        org.reactivestreams.Subscription subscription3 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.reflect.GenericDeclaration>> genericDeclarationSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.GenericDeclaration> genericDeclarationAdaptiveSubscriber1 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.GenericDeclaration>(genericDeclarationSubscriberSupplier0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable7 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable7);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        org.reactivestreams.Subscription subscription11 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.io.Serializable>> serializableSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.io.Serializable> serializableAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.io.Serializable>(serializableSubscriberSupplier0, (int) (short) -1, threadPoolExecutor2, resourceMonitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a');
        org.reactivestreams.Subscription subscription3 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.reflect.Type>> typeSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.Type> typeAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.Type>(typeSubscriberSupplier0, (int) '#', threadPoolExecutor2, resourceMonitor3);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 100, threadPoolExecutor2, resourceMonitor3);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable7 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable7);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        java.lang.Throwable throwable11 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable11);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 100);
        java.lang.Throwable throwable3 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable3);
        org.reactivestreams.Subscription subscription5 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.Comparable<java.lang.String>>> strComparableSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Comparable<java.lang.String>> strComparableAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Comparable<java.lang.String>>(strComparableSubscriberSupplier0, (int) '4');
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 10);
        java.lang.Throwable throwable3 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable3);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber1 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0);
        charSequenceAdaptiveSubscriber1.onComplete();
        java.lang.Throwable throwable3 = null;
        charSequenceAdaptiveSubscriber1.onError(throwable3);
        charSequenceAdaptiveSubscriber1.onComplete();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber1.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onComplete();
        java.lang.Class<?> wildcardClass4 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 100, threadPoolExecutor2, resourceMonitor3);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a');
        java.lang.Class<?> wildcardClass3 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        org.reactivestreams.Subscription subscription7 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) ' ', threadPoolExecutor2, resourceMonitor3);
        java.lang.Throwable throwable5 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable5);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        java.util.function.Supplier<org.reactivestreams.Subscriber<io.reactivex.rxjava3.core.FlowableSubscriber<java.lang.CharSequence>>> charSequenceFlowableSubscriberSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.core.FlowableSubscriber<java.lang.CharSequence>> charSequenceFlowableSubscriberAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.core.FlowableSubscriber<java.lang.CharSequence>>(charSequenceFlowableSubscriberSubscriberSupplier0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = charSequenceFlowableSubscriberAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (short) -1, threadPoolExecutor2, resourceMonitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        org.reactivestreams.Subscription subscription11 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        org.reactivestreams.Subscription subscription3 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.util.function.Supplier<org.reactivestreams.Subscriber<io.reactivex.rxjava3.subscribers.DefaultSubscriber<java.lang.CharSequence>>> charSequenceDefaultSubscriberSubscriberSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.subscribers.DefaultSubscriber<java.lang.CharSequence>> charSequenceDefaultSubscriberAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.subscribers.DefaultSubscriber<java.lang.CharSequence>>(charSequenceDefaultSubscriberSubscriberSupplier0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        java.util.function.Supplier<org.reactivestreams.Subscriber<io.reactivex.rxjava3.subscribers.DefaultSubscriber<java.lang.CharSequence>>> charSequenceDefaultSubscriberSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.subscribers.DefaultSubscriber<java.lang.CharSequence>> charSequenceDefaultSubscriberAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.subscribers.DefaultSubscriber<java.lang.CharSequence>>(charSequenceDefaultSubscriberSubscriberSupplier0, (int) '#');
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (short) 1, threadPoolExecutor2, resourceMonitor3);
        java.lang.Throwable throwable5 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable5);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onComplete();
        java.lang.Throwable throwable4 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable4);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.io.Serializable>> serializableSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.io.Serializable> serializableAdaptiveSubscriber1 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.io.Serializable>(serializableSubscriberSupplier0);
        java.lang.Class<?> wildcardClass2 = serializableAdaptiveSubscriber1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.reflect.AnnotatedElement>> annotatedElementSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.AnnotatedElement> annotatedElementAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.AnnotatedElement>(annotatedElementSubscriberSupplier0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = annotatedElementAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.Comparable<java.lang.String>>> strComparableSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Comparable<java.lang.String>> strComparableAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Comparable<java.lang.String>>(strComparableSubscriberSupplier0, (int) 'a');
        java.lang.Class<?> wildcardClass3 = strComparableAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        java.util.function.Supplier<org.reactivestreams.Subscriber<org.reactivestreams.Subscriber<java.lang.CharSequence>>> charSequenceSubscriberSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<org.reactivestreams.Subscriber<java.lang.CharSequence>>(charSequenceSubscriberSubscriberSupplier0, (int) (byte) 100);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        java.lang.Throwable throwable4 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable4);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass8 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.String>> strSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.String> strAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.String>(strSubscriberSupplier0, 0, threadPoolExecutor2, resourceMonitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 100);
        charSequenceAdaptiveSubscriber2.onComplete();
        java.lang.Class<?> wildcardClass4 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        org.reactivestreams.Subscription subscription5 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        java.util.function.Supplier<org.reactivestreams.Subscriber<com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>>> charSequenceAdaptiveSubscriberSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>> charSequenceAdaptiveSubscriberAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>>(charSequenceAdaptiveSubscriberSubscriberSupplier0, (int) (short) 100, threadPoolExecutor2, resourceMonitor3);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 100, threadPoolExecutor2, resourceMonitor3);
        java.lang.Class<?> wildcardClass5 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable13 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable13);
        java.lang.Class<?> wildcardClass15 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable13 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable13);
        java.lang.Throwable throwable15 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable15);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable13 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable13);
        java.lang.Throwable throwable15 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable15);
        java.lang.Class<?> wildcardClass17 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        java.lang.Throwable throwable5 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable5);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        java.lang.Throwable throwable5 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable5);
        org.reactivestreams.Subscription subscription7 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) ' ', threadPoolExecutor2, resourceMonitor3);
        java.lang.Class<?> wildcardClass5 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.util.function.Supplier<org.reactivestreams.Subscriber<io.reactivex.rxjava3.subscribers.DefaultSubscriber<java.lang.CharSequence>>> charSequenceDefaultSubscriberSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.subscribers.DefaultSubscriber<java.lang.CharSequence>> charSequenceDefaultSubscriberAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.subscribers.DefaultSubscriber<java.lang.CharSequence>>(charSequenceDefaultSubscriberSubscriberSupplier0, (int) (short) 0, threadPoolExecutor2, resourceMonitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 1);
        java.lang.Throwable throwable3 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable3);
        org.reactivestreams.Subscription subscription5 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) ' ');
        java.lang.Throwable throwable3 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable3);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 10);
        java.lang.Throwable throwable3 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable3);
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber1 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0);
        charSequenceAdaptiveSubscriber1.onComplete();
        java.lang.Throwable throwable3 = null;
        charSequenceAdaptiveSubscriber1.onError(throwable3);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber1.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        java.lang.Throwable throwable7 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable7);
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable9);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        java.util.function.Supplier<org.reactivestreams.Subscriber<com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>>> charSequenceAdaptiveSubscriberSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>> charSequenceAdaptiveSubscriberAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>>(charSequenceAdaptiveSubscriberSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber2.onComplete();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 100, threadPoolExecutor2, resourceMonitor3);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        java.lang.Throwable throwable4 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable4);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.reflect.AnnotatedElement>> annotatedElementSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.AnnotatedElement> annotatedElementAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.AnnotatedElement>(annotatedElementSubscriberSupplier0, (int) '#');
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) ' ', threadPoolExecutor2, resourceMonitor3);
        org.reactivestreams.Subscription subscription5 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 1, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        java.lang.Throwable throwable7 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable7);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        java.util.function.Supplier<org.reactivestreams.Subscriber<io.reactivex.rxjava3.subscribers.DefaultSubscriber<java.lang.CharSequence>>> charSequenceDefaultSubscriberSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.subscribers.DefaultSubscriber<java.lang.CharSequence>> charSequenceDefaultSubscriberAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.subscribers.DefaultSubscriber<java.lang.CharSequence>>(charSequenceDefaultSubscriberSubscriberSupplier0, (int) ' ', threadPoolExecutor2, resourceMonitor3);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 10, threadPoolExecutor2, resourceMonitor3);
        org.reactivestreams.Subscription subscription5 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 100);
        charSequenceAdaptiveSubscriber2.onComplete();
        java.lang.Class<?> wildcardClass4 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 10, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        java.util.function.Supplier<org.reactivestreams.Subscriber<com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>>> charSequenceAdaptiveSubscriberSubscriberSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>> charSequenceAdaptiveSubscriberAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>>(charSequenceAdaptiveSubscriberSubscriberSupplier0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onComplete();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 100, threadPoolExecutor2, resourceMonitor3);
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onNext(charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.reflect.Type>> typeSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.Type> typeAdaptiveSubscriber1 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.Type>(typeSubscriberSupplier0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        java.lang.Throwable throwable5 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable5);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        java.util.function.Supplier<org.reactivestreams.Subscriber<com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>>> charSequenceAdaptiveSubscriberSubscriberSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>> charSequenceAdaptiveSubscriberAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>>(charSequenceAdaptiveSubscriberSubscriberSupplier0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        java.lang.Throwable throwable7 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable7);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.reflect.AnnotatedElement>> annotatedElementSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.AnnotatedElement> annotatedElementAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.AnnotatedElement>(annotatedElementSubscriberSupplier0, 1, threadPoolExecutor2, resourceMonitor3);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        java.util.function.Supplier<org.reactivestreams.Subscriber<io.reactivex.rxjava3.core.FlowableSubscriber<java.lang.CharSequence>>> charSequenceFlowableSubscriberSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.core.FlowableSubscriber<java.lang.CharSequence>> charSequenceFlowableSubscriberAdaptiveSubscriber1 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.core.FlowableSubscriber<java.lang.CharSequence>>(charSequenceFlowableSubscriberSubscriberSupplier0);
        java.lang.Class<?> wildcardClass2 = charSequenceFlowableSubscriberAdaptiveSubscriber1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 10, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a');
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 1);
        java.lang.Throwable throwable3 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable3);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.reflect.AnnotatedElement>> annotatedElementSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.AnnotatedElement> annotatedElementAdaptiveSubscriber1 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.AnnotatedElement>(annotatedElementSubscriberSupplier0);
        java.lang.Class<?> wildcardClass2 = annotatedElementAdaptiveSubscriber1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 10, threadPoolExecutor2, resourceMonitor3);
        java.lang.Throwable throwable5 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable5);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) ' ', threadPoolExecutor2, resourceMonitor3);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 10);
        java.lang.Throwable throwable3 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable3);
        charSequenceAdaptiveSubscriber2.onComplete();
        java.lang.Class<?> wildcardClass6 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.Object>> objSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Object> objAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Object>(objSubscriberSupplier0, (int) ' ');
        java.lang.Class<?> wildcardClass3 = objAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        org.reactivestreams.Subscription subscription7 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 100, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) ' ');
        java.lang.Throwable throwable3 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable3);
        java.lang.Throwable throwable5 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable5);
        java.lang.Throwable throwable7 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable7);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable13 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable13);
        java.lang.Throwable throwable15 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable15);
        org.reactivestreams.Subscription subscription17 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        java.lang.Throwable throwable11 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable11);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        java.util.function.Supplier<org.reactivestreams.Subscriber<com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>>> charSequenceAdaptiveSubscriberSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>> charSequenceAdaptiveSubscriberAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>>(charSequenceAdaptiveSubscriberSubscriberSupplier0, (int) (byte) 0, threadPoolExecutor2, resourceMonitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 100);
        java.lang.Class<?> wildcardClass3 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass11 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 10, threadPoolExecutor2, resourceMonitor3);
        java.lang.Throwable throwable5 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable5);
        org.reactivestreams.Subscription subscription7 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.Object>> objSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Object> objAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Object>(objSubscriberSupplier0, 100);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '4');
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 100);
        charSequenceAdaptiveSubscriber2.onComplete();
        java.lang.Throwable throwable4 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable4);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.Object>> objSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Object> objAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Object>(objSubscriberSupplier0, (int) (byte) 100, threadPoolExecutor2, resourceMonitor3);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        java.lang.Throwable throwable11 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable11);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass15 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        charSequenceAdaptiveSubscriber2.onComplete();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.Object>> objSubscriberSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Object> objAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Object>(objSubscriberSupplier0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.Object>> objSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Object> objAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Object>(objSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 10, threadPoolExecutor2, resourceMonitor3);
        java.lang.Throwable throwable5 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable5);
        java.lang.Class<?> wildcardClass7 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable13 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable13);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 10, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber1 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0);
        charSequenceAdaptiveSubscriber1.onComplete();
        java.lang.Throwable throwable3 = null;
        charSequenceAdaptiveSubscriber1.onError(throwable3);
        charSequenceAdaptiveSubscriber1.onComplete();
        java.lang.Throwable throwable6 = null;
        charSequenceAdaptiveSubscriber1.onError(throwable6);
        org.reactivestreams.Subscription subscription8 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber1.onSubscribe(subscription8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber1 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0);
        java.lang.Class<?> wildcardClass2 = charSequenceAdaptiveSubscriber1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable13 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable13);
        java.lang.Throwable throwable15 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable15);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 1, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 100);
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.io.Serializable>> serializableSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.io.Serializable> serializableAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.io.Serializable>(serializableSubscriberSupplier0, (int) (byte) -1, threadPoolExecutor2, resourceMonitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.io.Serializable>> serializableSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.io.Serializable> serializableAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.io.Serializable>(serializableSubscriberSupplier0, (int) ' ');
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        org.reactivestreams.Subscription subscription15 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable9);
        org.reactivestreams.Subscription subscription11 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (short) 10);
        java.lang.Throwable throwable3 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable3);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.reflect.GenericDeclaration>> genericDeclarationSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.GenericDeclaration> genericDeclarationAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.GenericDeclaration>(genericDeclarationSubscriberSupplier0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = genericDeclarationAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 1);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (short) 100, threadPoolExecutor2, resourceMonitor3);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable13 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable13);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass17 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (short) 10, threadPoolExecutor2, resourceMonitor3);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.reflect.GenericDeclaration>> genericDeclarationSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.GenericDeclaration> genericDeclarationAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.GenericDeclaration>(genericDeclarationSubscriberSupplier0, (int) (byte) 100, threadPoolExecutor2, resourceMonitor3);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        java.lang.Throwable throwable4 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable4);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        org.reactivestreams.Subscription subscription8 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 100);
        java.lang.Throwable throwable3 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable3);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        org.reactivestreams.Subscription subscription7 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        java.lang.Throwable throwable5 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable5);
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        java.lang.Class<?> wildcardClass10 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 10, threadPoolExecutor2, resourceMonitor3);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        java.util.function.Supplier<org.reactivestreams.Subscriber<org.reactivestreams.Subscriber<java.lang.CharSequence>>> charSequenceSubscriberSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<org.reactivestreams.Subscriber<java.lang.CharSequence>>(charSequenceSubscriberSubscriberSupplier0, 0, threadPoolExecutor2, resourceMonitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (short) 1, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        java.util.function.Supplier<org.reactivestreams.Subscriber<com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>>> charSequenceAdaptiveSubscriberSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>> charSequenceAdaptiveSubscriberAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>>(charSequenceAdaptiveSubscriberSubscriberSupplier0, 100);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable7 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable7);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 1);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 1, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        java.lang.Throwable throwable7 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable7);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable7 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable7);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass5 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (short) 100, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        org.reactivestreams.Subscription subscription7 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onComplete();
        java.lang.Throwable throwable4 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable4);
        java.lang.Class<?> wildcardClass6 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.reflect.AnnotatedElement>> annotatedElementSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.AnnotatedElement> annotatedElementAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.AnnotatedElement>(annotatedElementSubscriberSupplier0, 10);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable13 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable13);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        org.reactivestreams.Subscription subscription19 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        org.reactivestreams.Subscription subscription7 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) ' ');
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '4', threadPoolExecutor2, resourceMonitor3);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        org.reactivestreams.Subscription subscription7 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass5 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.reflect.Type>> typeSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.Type> typeAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.Type>(typeSubscriberSupplier0, (int) (short) -1, threadPoolExecutor2, resourceMonitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        java.lang.Throwable throwable11 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable11);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '4');
        charSequenceAdaptiveSubscriber2.onComplete();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.String>> strSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.String> strAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.String>(strSubscriberSupplier0, 1, threadPoolExecutor2, resourceMonitor3);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable13 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable13);
        org.reactivestreams.Subscription subscription15 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        java.util.function.Supplier<org.reactivestreams.Subscriber<io.reactivex.rxjava3.core.FlowableSubscriber<java.lang.CharSequence>>> charSequenceFlowableSubscriberSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.core.FlowableSubscriber<java.lang.CharSequence>> charSequenceFlowableSubscriberAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.core.FlowableSubscriber<java.lang.CharSequence>>(charSequenceFlowableSubscriberSubscriberSupplier0, (int) (byte) 10, threadPoolExecutor2, resourceMonitor3);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        org.reactivestreams.Subscription subscription11 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable13 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable13);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        org.reactivestreams.Subscription subscription13 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable13 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable13);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        org.reactivestreams.Subscription subscription17 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 100);
        charSequenceAdaptiveSubscriber2.onComplete();
        java.lang.Throwable throwable4 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable4);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        org.reactivestreams.Subscription subscription5 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        java.lang.Throwable throwable4 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable4);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 1, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.io.Serializable>> serializableSubscriberSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.io.Serializable> serializableAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.io.Serializable>(serializableSubscriberSupplier0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (short) 100, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable7 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable7);
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass11 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 10);
        java.lang.Throwable throwable3 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable3);
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass10 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        java.lang.Throwable throwable5 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable5);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable6 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable6);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber2.onComplete();
        java.lang.Throwable throwable8 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable8);
        org.reactivestreams.Subscription subscription10 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        java.util.function.Supplier<org.reactivestreams.Subscriber<io.reactivex.rxjava3.core.FlowableSubscriber<java.lang.CharSequence>>> charSequenceFlowableSubscriberSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.core.FlowableSubscriber<java.lang.CharSequence>> charSequenceFlowableSubscriberAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.core.FlowableSubscriber<java.lang.CharSequence>>(charSequenceFlowableSubscriberSubscriberSupplier0, (int) (short) 1, threadPoolExecutor2, resourceMonitor3);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.Comparable<java.lang.String>>> strComparableSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Comparable<java.lang.String>> strComparableAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Comparable<java.lang.String>>(strComparableSubscriberSupplier0, 1, threadPoolExecutor2, resourceMonitor3);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '4');
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber2.onComplete();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.reflect.GenericDeclaration>> genericDeclarationSubscriberSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.GenericDeclaration> genericDeclarationAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.GenericDeclaration>(genericDeclarationSubscriberSupplier0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) ' ', threadPoolExecutor2, resourceMonitor3);
        java.lang.Throwable throwable5 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable5);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onComplete();
        java.lang.Throwable throwable4 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable4);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable7 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable7);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass11 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.Object>> objSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Object> objAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Object>(objSubscriberSupplier0, (int) '4', threadPoolExecutor2, resourceMonitor3);
        java.lang.Class<?> wildcardClass5 = objAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.reflect.AnnotatedElement>> annotatedElementSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.AnnotatedElement> annotatedElementAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.AnnotatedElement>(annotatedElementSubscriberSupplier0, 1);
        java.lang.Class<?> wildcardClass3 = annotatedElementAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        java.lang.Throwable throwable5 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable5);
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass11 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 10, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) ' ', threadPoolExecutor2, resourceMonitor3);
        java.lang.Throwable throwable5 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable5);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass13 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.reflect.GenericDeclaration>> genericDeclarationSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.GenericDeclaration> genericDeclarationAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.GenericDeclaration>(genericDeclarationSubscriberSupplier0, 10, threadPoolExecutor2, resourceMonitor3);
        java.lang.Class<?> wildcardClass5 = genericDeclarationAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) ' ');
        java.lang.Throwable throwable3 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable3);
        java.lang.Throwable throwable5 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable5);
        java.lang.Class<?> wildcardClass7 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (short) 10, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.String>> strSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.String> strAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.String>(strSubscriberSupplier0, (int) (byte) 10);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        java.lang.Throwable throwable7 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable7);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass11 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 10, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable9);
        org.reactivestreams.Subscription subscription11 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass7 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable13 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable13);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        java.lang.Throwable throwable19 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable19);
        java.lang.Throwable throwable21 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable21);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '4');
        java.lang.Throwable throwable3 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable3);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 100, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable7 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable7);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.reflect.Type>> typeSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.Type> typeAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.Type>(typeSubscriberSupplier0, (int) (byte) 1);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.reflect.Type>> typeSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.Type> typeAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.Type>(typeSubscriberSupplier0, (int) '#');
        java.lang.Class<?> wildcardClass3 = typeAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '4');
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        org.reactivestreams.Subscription subscription5 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) ' ', threadPoolExecutor2, resourceMonitor3);
        java.lang.Throwable throwable5 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable5);
        org.reactivestreams.Subscription subscription7 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onComplete();
        org.reactivestreams.Subscription subscription4 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) ' ', threadPoolExecutor2, resourceMonitor3);
        java.lang.Throwable throwable5 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable5);
        java.lang.Throwable throwable7 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable7);
        java.lang.Class<?> wildcardClass9 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 100, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        org.reactivestreams.Subscription subscription7 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        java.util.function.Supplier<org.reactivestreams.Subscriber<io.reactivex.rxjava3.core.FlowableSubscriber<java.lang.CharSequence>>> charSequenceFlowableSubscriberSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.core.FlowableSubscriber<java.lang.CharSequence>> charSequenceFlowableSubscriberAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.core.FlowableSubscriber<java.lang.CharSequence>>(charSequenceFlowableSubscriberSubscriberSupplier0, (int) '4', threadPoolExecutor2, resourceMonitor3);
        java.lang.Class<?> wildcardClass5 = charSequenceFlowableSubscriberAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber1 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0);
        charSequenceAdaptiveSubscriber1.onNext((java.lang.CharSequence) "");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber1 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0);
        charSequenceAdaptiveSubscriber1.onComplete();
        charSequenceAdaptiveSubscriber1.onComplete();
        charSequenceAdaptiveSubscriber1.onComplete();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber1.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 10, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        org.reactivestreams.Subscription subscription11 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        java.lang.Throwable throwable11 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable11);
        java.lang.Throwable throwable13 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable13);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 100);
        charSequenceAdaptiveSubscriber2.onComplete();
        java.lang.Throwable throwable4 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable4);
        charSequenceAdaptiveSubscriber2.onComplete();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (short) 10);
        java.lang.Throwable throwable3 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable3);
        java.lang.Class<?> wildcardClass5 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10, threadPoolExecutor2, resourceMonitor3);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable11 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable11);
        java.lang.Throwable throwable13 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable13);
        java.lang.Class<?> wildcardClass15 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 100);
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.String>> strSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.String> strAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.String>(strSubscriberSupplier0, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = strAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable7 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable7);
        java.lang.CharSequence charSequence9 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onNext(charSequence9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (short) 10);
        charSequenceAdaptiveSubscriber2.onComplete();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.reflect.AnnotatedElement>> annotatedElementSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.AnnotatedElement> annotatedElementAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.AnnotatedElement>(annotatedElementSubscriberSupplier0, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = annotatedElementAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onComplete();
        java.lang.Throwable throwable4 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable4);
        java.lang.Throwable throwable6 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable6);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        java.util.function.Supplier<org.reactivestreams.Subscriber<io.reactivex.rxjava3.subscribers.DefaultSubscriber<java.lang.CharSequence>>> charSequenceDefaultSubscriberSubscriberSupplier0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.subscribers.DefaultSubscriber<java.lang.CharSequence>> charSequenceDefaultSubscriberAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.subscribers.DefaultSubscriber<java.lang.CharSequence>>(charSequenceDefaultSubscriberSubscriberSupplier0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) ' ');
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        org.reactivestreams.Subscription subscription5 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        java.lang.Throwable throwable7 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable7);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 1, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) ' ', threadPoolExecutor2, resourceMonitor3);
        java.lang.Throwable throwable5 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable5);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 1);
        charSequenceAdaptiveSubscriber2.onComplete();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        java.util.function.Supplier<org.reactivestreams.Subscriber<io.reactivex.rxjava3.core.FlowableSubscriber<java.lang.CharSequence>>> charSequenceFlowableSubscriberSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.core.FlowableSubscriber<java.lang.CharSequence>> charSequenceFlowableSubscriberAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.core.FlowableSubscriber<java.lang.CharSequence>>(charSequenceFlowableSubscriberSubscriberSupplier0, (int) '4');
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a');
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        org.reactivestreams.Subscription subscription5 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onSubscribe(subscription5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        charSequenceAdaptiveSubscriber2.onComplete();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onComplete();
        java.lang.Throwable throwable4 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable4);
        java.lang.Throwable throwable6 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable6);
        java.lang.Throwable throwable8 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable8);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        java.util.function.Supplier<org.reactivestreams.Subscriber<io.reactivex.rxjava3.core.FlowableSubscriber<java.lang.CharSequence>>> charSequenceFlowableSubscriberSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.core.FlowableSubscriber<java.lang.CharSequence>> charSequenceFlowableSubscriberAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.core.FlowableSubscriber<java.lang.CharSequence>>(charSequenceFlowableSubscriberSubscriberSupplier0, (int) (short) 10);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.Object>> objSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Object> objAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.Object>(objSubscriberSupplier0, (int) (byte) 100);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 10);
        charSequenceAdaptiveSubscriber2.onComplete();
        java.lang.Class<?> wildcardClass4 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable9);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (short) 100, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable11 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable11);
        java.lang.Throwable throwable13 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable13);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onComplete();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 100);
        java.lang.Throwable throwable3 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable3);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        java.util.function.Supplier<org.reactivestreams.Subscriber<io.reactivex.rxjava3.core.FlowableSubscriber<java.lang.CharSequence>>> charSequenceFlowableSubscriberSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.core.FlowableSubscriber<java.lang.CharSequence>> charSequenceFlowableSubscriberAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<io.reactivex.rxjava3.core.FlowableSubscriber<java.lang.CharSequence>>(charSequenceFlowableSubscriberSubscriberSupplier0, (int) ' ', threadPoolExecutor2, resourceMonitor3);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.reflect.GenericDeclaration>> genericDeclarationSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.GenericDeclaration> genericDeclarationAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.GenericDeclaration>(genericDeclarationSubscriberSupplier0, (int) (short) 10, threadPoolExecutor2, resourceMonitor3);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) (byte) 10);
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass6 = charSequenceAdaptiveSubscriber2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test337");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.reflect.AnnotatedElement>> annotatedElementSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.AnnotatedElement> annotatedElementAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.reflect.AnnotatedElement>(annotatedElementSubscriberSupplier0, (int) (byte) 1, threadPoolExecutor2, resourceMonitor3);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test338");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a');
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test339");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, 10, threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable7 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable7);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '4');
        charSequenceAdaptiveSubscriber2.onComplete();
        java.lang.Throwable throwable4 = null;
        charSequenceAdaptiveSubscriber2.onError(throwable4);
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test341");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test342");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '#');
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "");
        charSequenceAdaptiveSubscriber2.onComplete();
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test343");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test344");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) ' ', threadPoolExecutor2, resourceMonitor3);
        java.lang.Throwable throwable5 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable5);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "");
        org.reactivestreams.Subscription subscription13 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber4.onSubscribe(subscription13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: next is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test345");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = null;
        com.teodorstoev.adaptivestreams.ResourceMonitor resourceMonitor3 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber4 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) 'a', threadPoolExecutor2, resourceMonitor3);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Throwable throwable9 = null;
        charSequenceAdaptiveSubscriber4.onError(throwable9);
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber4.onNext((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass15 = charSequenceAdaptiveSubscriber4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test346");
        java.util.function.Supplier<org.reactivestreams.Subscriber<java.lang.CharSequence>> charSequenceSubscriberSupplier0 = null;
        com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence> charSequenceAdaptiveSubscriber2 = new com.teodorstoev.adaptivestreams.AdaptiveSubscriber<java.lang.CharSequence>(charSequenceSubscriberSupplier0, (int) '4');
        charSequenceAdaptiveSubscriber2.onNext((java.lang.CharSequence) "hi!");
        charSequenceAdaptiveSubscriber2.onComplete();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceAdaptiveSubscriber2.onStart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

