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
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable10 = objSimpleEvent0.subscribe("hi!", objConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable10 = objSimpleEvent0.subscribe("", objConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.util.concurrent.ExecutorService executorService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.CharSequence> charSequenceSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.CharSequence>(executorService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable11 = objSimpleEvent0.subscribe("", objConsumer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        java.util.concurrent.ExecutorService executorService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>(executorService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.util.function.Consumer<java.lang.Object> objConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable3 = objSimpleEvent0.subscribe("hi!", objConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass7 = objSimpleEvent0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Comparable<java.lang.String>> strComparableSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass8 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean9 = objSimpleEvent0.thereIsNoActiveTask();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.util.concurrent.ExecutorService executorService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>> wildcardClassSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>>(executorService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        java.util.function.Consumer<java.lang.Object> objConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable9 = objSimpleEvent0.subscribe("", objConsumer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable4 = objSimpleEvent0.subscribe("", objConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Class<?> wildcardClass1 = objSimpleEvent0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>> objSimpleEventSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.util.concurrent.ExecutorService executorService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.GenericDeclaration> genericDeclarationSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.GenericDeclaration>(executorService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.util.concurrent.ExecutorService executorService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.AnnotatedElement> annotatedElementSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.AnnotatedElement>(executorService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        java.util.function.Consumer<java.lang.Object> objConsumer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable17 = objSimpleEvent9.subscribe("hi!", objConsumer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        java.util.function.Consumer<java.lang.Object> objConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable6 = objSimpleEvent0.subscribe("hi!", objConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass3 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.AnnotatedElement> annotatedElementSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.AnnotatedElement>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        java.util.function.Consumer<java.lang.Object> objConsumer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable14 = objSimpleEvent0.subscribe("", objConsumer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        java.lang.Class<?> wildcardClass15 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        boolean boolean4 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable7 = objSimpleEvent0.subscribe("", objConsumer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.util.concurrent.ExecutorService executorService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String> strSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String>(executorService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        java.util.function.Consumer<java.lang.Object> objConsumer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable17 = objSimpleEvent0.subscribe("hi!", objConsumer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        boolean boolean15 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable18 = objSimpleEvent0.subscribe("hi!", objConsumer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        java.util.concurrent.ExecutorService executorService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.io.Serializable> serializableSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.io.Serializable>(executorService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        objSimpleEvent0.publish("", (java.lang.Object) '#');
        java.util.function.Consumer<java.lang.Object> objConsumer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable20 = objSimpleEvent0.subscribe("hi!", objConsumer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>> objSimpleEventSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent4 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean5 = objSimpleEvent4.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) boolean5);
        java.util.function.Consumer<java.lang.Object> objConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable9 = objSimpleEvent0.subscribe("", objConsumer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        io.github.maroodb.simpleevent.core.SimpleEvent<io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>> objSimpleEventSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>>();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) '#');
        java.lang.Object obj12 = null;
        objSimpleEvent0.publish("", obj12);
        java.util.function.Consumer<java.lang.Object> objConsumer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable16 = objSimpleEvent0.subscribe("", objConsumer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 1);
        java.util.function.Consumer<java.lang.Object> objConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable4 = objSimpleEvent1.subscribe("", objConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass8 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        boolean boolean4 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable7 = objSimpleEvent0.subscribe("hi!", objConsumer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable10 = objSimpleEvent0.subscribe("", objConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("hi!", (java.lang.Object) 1.0d);
        java.util.function.Consumer<java.lang.Object> objConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable9 = objSimpleEvent0.subscribe("hi!", objConsumer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        java.util.function.Consumer<java.lang.Object> objConsumer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable13 = objSimpleEvent0.subscribe("", objConsumer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>> wildcardClassSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>>((int) (short) 100);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.util.function.Consumer<java.lang.Object> objConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable3 = objSimpleEvent0.subscribe("", objConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String> strSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>> wildcardClassSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>>();
        java.lang.Class<?> wildcardClass1 = wildcardClassSimpleEvent0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent4 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean5 = objSimpleEvent4.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) boolean5);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable11 = objSimpleEvent0.subscribe("", objConsumer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        objSimpleEvent0.publish("", (java.lang.Object) '#');
        java.util.function.Consumer<java.lang.Object> objConsumer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable20 = objSimpleEvent0.subscribe("", objConsumer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) ' ');
        boolean boolean2 = objSimpleEvent1.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable5 = objSimpleEvent1.subscribe("hi!", objConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        java.util.concurrent.ExecutorService executorService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.Type> typeSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.Type>(executorService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        objSimpleEvent12.publish("", (java.lang.Object) "hi!");
        boolean boolean19 = objSimpleEvent12.thereIsNoActiveTask();
        boolean boolean20 = objSimpleEvent12.thereIsNoActiveTask();
        objSimpleEvent12.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) "hi!");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent26 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean27 = objSimpleEvent26.thereIsNoActiveTask();
        boolean boolean28 = objSimpleEvent26.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent30 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean31 = objSimpleEvent30.thereIsNoActiveTask();
        objSimpleEvent26.publish("hi!", (java.lang.Object) boolean31);
        boolean boolean33 = objSimpleEvent26.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent35 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj37 = null;
        objSimpleEvent35.publish("hi!", obj37);
        objSimpleEvent35.publish("", (java.lang.Object) "hi!");
        boolean boolean42 = objSimpleEvent35.thereIsNoActiveTask();
        boolean boolean43 = objSimpleEvent35.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass44 = objSimpleEvent35.getClass();
        objSimpleEvent26.publish("hi!", (java.lang.Object) wildcardClass44);
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent26);
        java.util.function.Consumer<java.lang.Object> objConsumer48 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable49 = objSimpleEvent26.subscribe("hi!", objConsumer48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>> objSimpleEventSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        java.util.function.Consumer<java.lang.Object> objConsumer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable9 = objSimpleEvent0.subscribe("hi!", objConsumer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String> strSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String>((int) (short) 10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) 'a');
        java.util.function.Consumer<java.lang.Object> objConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable4 = objSimpleEvent1.subscribe("hi!", objConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        boolean boolean24 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable27 = objSimpleEvent0.subscribe("", objConsumer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        boolean boolean12 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable15 = objSimpleEvent0.subscribe("", objConsumer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent4 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean5 = objSimpleEvent4.thereIsNoActiveTask();
        boolean boolean6 = objSimpleEvent4.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent8 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean9 = objSimpleEvent8.thereIsNoActiveTask();
        objSimpleEvent4.publish("hi!", (java.lang.Object) boolean9);
        boolean boolean11 = objSimpleEvent4.thereIsNoActiveTask();
        boolean boolean12 = objSimpleEvent4.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) boolean12);
        java.lang.Class<?> wildcardClass14 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent4 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean5 = objSimpleEvent4.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) boolean5);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        objSimpleEvent9.publish("", (java.lang.Object) "hi!");
        boolean boolean16 = objSimpleEvent9.thereIsNoActiveTask();
        boolean boolean17 = objSimpleEvent9.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass18 = objSimpleEvent9.getClass();
        objSimpleEvent0.publish("hi!", (java.lang.Object) wildcardClass18);
        boolean boolean20 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent22 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean23 = objSimpleEvent22.thereIsNoActiveTask();
        boolean boolean24 = objSimpleEvent22.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) boolean24);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        java.lang.Class<?> wildcardClass16 = objSimpleEvent12.getClass();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent12);
        java.util.function.Consumer<java.lang.Object> objConsumer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable20 = objSimpleEvent12.subscribe("", objConsumer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String> strSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String>((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = strSimpleEvent1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Comparable<java.lang.String>> strComparableSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Comparable<java.lang.String>>((int) (short) 1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String> strSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String>((int) (byte) 10);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String> strSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 1);
        boolean boolean2 = objSimpleEvent1.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass3 = objSimpleEvent1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.Type> typeSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.Type>();
        java.lang.Class<?> wildcardClass1 = typeSimpleEvent0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 100);
        java.util.function.Consumer<java.lang.Object> objConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable4 = objSimpleEvent1.subscribe("", objConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.util.concurrent.ExecutorService executorService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>> objSimpleEventSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>>(executorService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) ' ');
        java.util.function.Consumer<java.lang.Object> objConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable4 = objSimpleEvent1.subscribe("hi!", objConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String> strSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>> objSimpleEventSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        java.lang.Class<?> wildcardClass16 = objSimpleEvent12.getClass();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent19 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj21 = null;
        objSimpleEvent19.publish("hi!", obj21);
        objSimpleEvent19.publish("", (java.lang.Object) "hi!");
        boolean boolean26 = objSimpleEvent19.thereIsNoActiveTask();
        objSimpleEvent19.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent31 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj33 = null;
        objSimpleEvent31.publish("hi!", obj33);
        objSimpleEvent31.publish("", (java.lang.Object) "hi!");
        boolean boolean38 = objSimpleEvent31.thereIsNoActiveTask();
        boolean boolean39 = objSimpleEvent31.thereIsNoActiveTask();
        objSimpleEvent31.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent19.publish("hi!", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>> wildcardClassSimpleEvent46 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>>();
        objSimpleEvent0.publish("", (java.lang.Object) wildcardClassSimpleEvent46);
        java.util.function.Consumer<java.lang.Object> objConsumer49 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable50 = objSimpleEvent0.subscribe("", objConsumer49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        java.lang.Class<?> wildcardClass16 = objSimpleEvent12.getClass();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent19 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj21 = null;
        objSimpleEvent19.publish("hi!", obj21);
        objSimpleEvent19.publish("", (java.lang.Object) "hi!");
        boolean boolean26 = objSimpleEvent19.thereIsNoActiveTask();
        objSimpleEvent19.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent31 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj33 = null;
        objSimpleEvent31.publish("hi!", obj33);
        objSimpleEvent31.publish("", (java.lang.Object) "hi!");
        boolean boolean38 = objSimpleEvent31.thereIsNoActiveTask();
        boolean boolean39 = objSimpleEvent31.thereIsNoActiveTask();
        objSimpleEvent31.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent19.publish("hi!", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        java.util.function.Consumer<java.lang.Object> objConsumer46 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable47 = objSimpleEvent0.subscribe("hi!", objConsumer46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean3 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean4 = objSimpleEvent0.thereIsNoActiveTask();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        objSimpleEvent9.publish("", (java.lang.Object) 100);
        java.util.function.Consumer<java.lang.Object> objConsumer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable20 = objSimpleEvent9.subscribe("hi!", objConsumer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) '#');
        java.lang.Object obj12 = null;
        objSimpleEvent0.publish("", obj12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent15 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj17 = null;
        objSimpleEvent15.publish("hi!", obj17);
        objSimpleEvent15.publish("", (java.lang.Object) "hi!");
        boolean boolean22 = objSimpleEvent15.thereIsNoActiveTask();
        boolean boolean23 = objSimpleEvent15.thereIsNoActiveTask();
        objSimpleEvent15.publish("hi!", (java.lang.Object) 10);
        boolean boolean27 = objSimpleEvent15.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent15);
        java.util.function.Consumer<java.lang.Object> objConsumer30 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable31 = objSimpleEvent15.subscribe("", objConsumer30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        objSimpleEvent12.publish("", (java.lang.Object) "hi!");
        boolean boolean19 = objSimpleEvent12.thereIsNoActiveTask();
        boolean boolean20 = objSimpleEvent12.thereIsNoActiveTask();
        objSimpleEvent12.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) "hi!");
        boolean boolean25 = objSimpleEvent0.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass26 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.Type> typeSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.Type>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        boolean boolean15 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent17 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj19 = null;
        objSimpleEvent17.publish("hi!", obj19);
        objSimpleEvent17.publish("", (java.lang.Object) "hi!");
        boolean boolean24 = objSimpleEvent17.thereIsNoActiveTask();
        objSimpleEvent17.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent29 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj31 = null;
        objSimpleEvent29.publish("hi!", obj31);
        java.lang.Class<?> wildcardClass33 = objSimpleEvent29.getClass();
        objSimpleEvent17.publish("", (java.lang.Object) objSimpleEvent29);
        java.lang.Class<?> wildcardClass35 = objSimpleEvent29.getClass();
        objSimpleEvent0.publish("hi!", (java.lang.Object) wildcardClass35);
        java.util.function.Consumer<java.lang.Object> objConsumer38 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable39 = objSimpleEvent0.subscribe("", objConsumer38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent4 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) ' ');
        boolean boolean5 = objSimpleEvent4.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass6 = objSimpleEvent4.getClass();
        objSimpleEvent1.publish("hi!", (java.lang.Object) wildcardClass6);
        java.util.function.Consumer<java.lang.Object> objConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable10 = objSimpleEvent1.subscribe("hi!", objConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.GenericDeclaration> genericDeclarationSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.GenericDeclaration>((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = genericDeclarationSimpleEvent1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        java.lang.Object obj25 = null;
        objSimpleEvent0.publish("", obj25);
        java.lang.Class<?> wildcardClass27 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        io.github.maroodb.simpleevent.core.SimpleEvent<io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>> objSimpleEventSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>>((int) (byte) 1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        java.lang.Class<?> wildcardClass24 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean3 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable6 = objSimpleEvent0.subscribe("hi!", objConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) '#');
        java.lang.Object obj12 = null;
        objSimpleEvent0.publish("", obj12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent15 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj17 = null;
        objSimpleEvent15.publish("hi!", obj17);
        objSimpleEvent15.publish("", (java.lang.Object) "hi!");
        boolean boolean22 = objSimpleEvent15.thereIsNoActiveTask();
        boolean boolean23 = objSimpleEvent15.thereIsNoActiveTask();
        objSimpleEvent15.publish("hi!", (java.lang.Object) 10);
        boolean boolean27 = objSimpleEvent15.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent15);
        java.util.function.Consumer<java.lang.Object> objConsumer30 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable31 = objSimpleEvent0.subscribe("", objConsumer30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String> strSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        java.lang.Class<?> wildcardClass11 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        boolean boolean12 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable15 = objSimpleEvent0.subscribe("hi!", objConsumer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Comparable<java.lang.String>> strComparableSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Comparable<java.lang.String>>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) '#');
        java.lang.Object obj12 = null;
        objSimpleEvent0.publish("", obj12);
        boolean boolean14 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable17 = objSimpleEvent0.subscribe("hi!", objConsumer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        boolean boolean15 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean16 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable19 = objSimpleEvent0.subscribe("", objConsumer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) '#');
        java.lang.Object obj12 = null;
        objSimpleEvent0.publish("", obj12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent15 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj17 = null;
        objSimpleEvent15.publish("hi!", obj17);
        objSimpleEvent15.publish("", (java.lang.Object) "hi!");
        boolean boolean22 = objSimpleEvent15.thereIsNoActiveTask();
        boolean boolean23 = objSimpleEvent15.thereIsNoActiveTask();
        objSimpleEvent15.publish("hi!", (java.lang.Object) 10);
        boolean boolean27 = objSimpleEvent15.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent15);
        java.util.function.Consumer<java.lang.Object> objConsumer30 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable31 = objSimpleEvent15.subscribe("hi!", objConsumer30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent5 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 1);
        boolean boolean6 = objSimpleEvent5.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent5);
        java.util.function.Consumer<java.lang.Object> objConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable10 = objSimpleEvent0.subscribe("hi!", objConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.CharSequence> charSequenceSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.CharSequence>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.GenericDeclaration> genericDeclarationSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.GenericDeclaration>();
        java.lang.Class<?> wildcardClass1 = genericDeclarationSimpleEvent0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent4 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean5 = objSimpleEvent4.thereIsNoActiveTask();
        boolean boolean6 = objSimpleEvent4.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent8 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean9 = objSimpleEvent8.thereIsNoActiveTask();
        objSimpleEvent4.publish("hi!", (java.lang.Object) boolean9);
        boolean boolean11 = objSimpleEvent4.thereIsNoActiveTask();
        boolean boolean12 = objSimpleEvent4.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) boolean12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.AnnotatedElement> annotatedElementSimpleEvent16 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.AnnotatedElement>(1);
        objSimpleEvent0.publish("hi!", (java.lang.Object) annotatedElementSimpleEvent16);
        java.util.function.Consumer<java.lang.Object> objConsumer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable20 = objSimpleEvent0.subscribe("hi!", objConsumer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        java.util.concurrent.ExecutorService executorService0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Comparable<java.lang.String>> strComparableSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Comparable<java.lang.String>>(executorService0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) '#');
        java.lang.Object obj12 = null;
        objSimpleEvent0.publish("", obj12);
        boolean boolean14 = objSimpleEvent0.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass15 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        java.lang.Class<?> wildcardClass16 = objSimpleEvent12.getClass();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent19 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj21 = null;
        objSimpleEvent19.publish("hi!", obj21);
        objSimpleEvent19.publish("", (java.lang.Object) "hi!");
        boolean boolean26 = objSimpleEvent19.thereIsNoActiveTask();
        objSimpleEvent19.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent31 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj33 = null;
        objSimpleEvent31.publish("hi!", obj33);
        objSimpleEvent31.publish("", (java.lang.Object) "hi!");
        boolean boolean38 = objSimpleEvent31.thereIsNoActiveTask();
        boolean boolean39 = objSimpleEvent31.thereIsNoActiveTask();
        objSimpleEvent31.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent19.publish("hi!", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass45 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent4 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean5 = objSimpleEvent4.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) boolean5);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        objSimpleEvent9.publish("", (java.lang.Object) "hi!");
        boolean boolean16 = objSimpleEvent9.thereIsNoActiveTask();
        boolean boolean17 = objSimpleEvent9.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass18 = objSimpleEvent9.getClass();
        objSimpleEvent0.publish("hi!", (java.lang.Object) wildcardClass18);
        boolean boolean20 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean21 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean22 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable25 = objSimpleEvent0.subscribe("hi!", objConsumer24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>> wildcardClassSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>>((int) (short) 1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>> wildcardClassSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>>((int) ' ');
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        boolean boolean15 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent17 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj19 = null;
        objSimpleEvent17.publish("hi!", obj19);
        java.lang.Class<?> wildcardClass21 = objSimpleEvent17.getClass();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent5 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj7 = null;
        objSimpleEvent5.publish("hi!", obj7);
        boolean boolean9 = objSimpleEvent5.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass10 = objSimpleEvent5.getClass();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent5);
        java.lang.Class<?> wildcardClass12 = objSimpleEvent5.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        java.lang.Class<?> wildcardClass16 = objSimpleEvent12.getClass();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent19 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj21 = null;
        objSimpleEvent19.publish("hi!", obj21);
        objSimpleEvent19.publish("", (java.lang.Object) "hi!");
        boolean boolean26 = objSimpleEvent19.thereIsNoActiveTask();
        objSimpleEvent19.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent31 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj33 = null;
        objSimpleEvent31.publish("hi!", obj33);
        objSimpleEvent31.publish("", (java.lang.Object) "hi!");
        boolean boolean38 = objSimpleEvent31.thereIsNoActiveTask();
        boolean boolean39 = objSimpleEvent31.thereIsNoActiveTask();
        objSimpleEvent31.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent19.publish("hi!", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>> wildcardClassSimpleEvent46 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>>();
        objSimpleEvent0.publish("", (java.lang.Object) wildcardClassSimpleEvent46);
        java.util.function.Consumer<java.lang.Object> objConsumer49 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable50 = objSimpleEvent0.subscribe("hi!", objConsumer49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean3 = objSimpleEvent0.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass4 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        java.lang.Class<?> wildcardClass16 = objSimpleEvent12.getClass();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent19 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj21 = null;
        objSimpleEvent19.publish("hi!", obj21);
        objSimpleEvent19.publish("", (java.lang.Object) "hi!");
        boolean boolean26 = objSimpleEvent19.thereIsNoActiveTask();
        objSimpleEvent19.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent31 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj33 = null;
        objSimpleEvent31.publish("hi!", obj33);
        objSimpleEvent31.publish("", (java.lang.Object) "hi!");
        boolean boolean38 = objSimpleEvent31.thereIsNoActiveTask();
        boolean boolean39 = objSimpleEvent31.thereIsNoActiveTask();
        objSimpleEvent31.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent19.publish("hi!", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean45 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent47 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj49 = null;
        objSimpleEvent47.publish("hi!", obj49);
        objSimpleEvent47.publish("", (java.lang.Object) "hi!");
        boolean boolean54 = objSimpleEvent47.thereIsNoActiveTask();
        objSimpleEvent47.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent59 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj61 = null;
        objSimpleEvent59.publish("hi!", obj61);
        java.lang.Class<?> wildcardClass63 = objSimpleEvent59.getClass();
        objSimpleEvent47.publish("", (java.lang.Object) objSimpleEvent59);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent66 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj68 = null;
        objSimpleEvent66.publish("hi!", obj68);
        objSimpleEvent66.publish("", (java.lang.Object) "hi!");
        boolean boolean73 = objSimpleEvent66.thereIsNoActiveTask();
        objSimpleEvent66.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent78 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj80 = null;
        objSimpleEvent78.publish("hi!", obj80);
        objSimpleEvent78.publish("", (java.lang.Object) "hi!");
        boolean boolean85 = objSimpleEvent78.thereIsNoActiveTask();
        boolean boolean86 = objSimpleEvent78.thereIsNoActiveTask();
        objSimpleEvent78.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent66.publish("hi!", (java.lang.Object) "hi!");
        objSimpleEvent47.publish("", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent47);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.GenericDeclaration> genericDeclarationSimpleEvent95 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.GenericDeclaration>(1);
        java.lang.Class<?> wildcardClass96 = genericDeclarationSimpleEvent95.getClass();
        objSimpleEvent47.publish("", (java.lang.Object) genericDeclarationSimpleEvent95);
        java.lang.Class<?> wildcardClass98 = objSimpleEvent47.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(wildcardClass96);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>> wildcardClassSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        objSimpleEvent0.publish("", (java.lang.Object) 10L);
        java.util.function.Consumer<java.lang.Object> objConsumer28 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable29 = objSimpleEvent0.subscribe("", objConsumer28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) '#');
        java.util.function.Consumer<java.lang.Object> objConsumer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable13 = objSimpleEvent0.subscribe("hi!", objConsumer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        java.lang.Object obj8 = null;
        objSimpleEvent0.publish("hi!", obj8);
        java.util.function.Consumer<java.lang.Object> objConsumer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable12 = objSimpleEvent0.subscribe("hi!", objConsumer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent4 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean5 = objSimpleEvent4.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) boolean5);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        objSimpleEvent9.publish("", (java.lang.Object) "hi!");
        boolean boolean16 = objSimpleEvent9.thereIsNoActiveTask();
        boolean boolean17 = objSimpleEvent9.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass18 = objSimpleEvent9.getClass();
        objSimpleEvent0.publish("hi!", (java.lang.Object) wildcardClass18);
        boolean boolean20 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean21 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean22 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable25 = objSimpleEvent0.subscribe("", objConsumer24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String> strSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Comparable<java.lang.String>> strComparableSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Comparable<java.lang.String>>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        java.lang.Class<?> wildcardClass16 = objSimpleEvent12.getClass();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent19 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj21 = null;
        objSimpleEvent19.publish("hi!", obj21);
        objSimpleEvent19.publish("", (java.lang.Object) "hi!");
        boolean boolean26 = objSimpleEvent19.thereIsNoActiveTask();
        objSimpleEvent19.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent31 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj33 = null;
        objSimpleEvent31.publish("hi!", obj33);
        objSimpleEvent31.publish("", (java.lang.Object) "hi!");
        boolean boolean38 = objSimpleEvent31.thereIsNoActiveTask();
        boolean boolean39 = objSimpleEvent31.thereIsNoActiveTask();
        objSimpleEvent31.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent19.publish("hi!", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean45 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent47 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj49 = null;
        objSimpleEvent47.publish("hi!", obj49);
        objSimpleEvent47.publish("", (java.lang.Object) "hi!");
        boolean boolean54 = objSimpleEvent47.thereIsNoActiveTask();
        objSimpleEvent47.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent59 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj61 = null;
        objSimpleEvent59.publish("hi!", obj61);
        java.lang.Class<?> wildcardClass63 = objSimpleEvent59.getClass();
        objSimpleEvent47.publish("", (java.lang.Object) objSimpleEvent59);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent66 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj68 = null;
        objSimpleEvent66.publish("hi!", obj68);
        objSimpleEvent66.publish("", (java.lang.Object) "hi!");
        boolean boolean73 = objSimpleEvent66.thereIsNoActiveTask();
        objSimpleEvent66.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent78 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj80 = null;
        objSimpleEvent78.publish("hi!", obj80);
        objSimpleEvent78.publish("", (java.lang.Object) "hi!");
        boolean boolean85 = objSimpleEvent78.thereIsNoActiveTask();
        boolean boolean86 = objSimpleEvent78.thereIsNoActiveTask();
        objSimpleEvent78.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent66.publish("hi!", (java.lang.Object) "hi!");
        objSimpleEvent47.publish("", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent47);
        boolean boolean93 = objSimpleEvent0.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass94 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        java.util.function.Consumer<java.lang.Object> objConsumer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable17 = objSimpleEvent0.subscribe("", objConsumer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        boolean boolean15 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent17 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj19 = null;
        objSimpleEvent17.publish("hi!", obj19);
        objSimpleEvent17.publish("", (java.lang.Object) "hi!");
        boolean boolean24 = objSimpleEvent17.thereIsNoActiveTask();
        objSimpleEvent17.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent29 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj31 = null;
        objSimpleEvent29.publish("hi!", obj31);
        java.lang.Class<?> wildcardClass33 = objSimpleEvent29.getClass();
        objSimpleEvent17.publish("", (java.lang.Object) objSimpleEvent29);
        java.lang.Class<?> wildcardClass35 = objSimpleEvent29.getClass();
        objSimpleEvent0.publish("hi!", (java.lang.Object) wildcardClass35);
        boolean boolean37 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer39 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable40 = objSimpleEvent0.subscribe("hi!", objConsumer39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        boolean boolean4 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) (short) 10);
        java.util.function.Consumer<java.lang.Object> objConsumer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable10 = objSimpleEvent0.subscribe("hi!", objConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        boolean boolean4 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) 'a');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        objSimpleEvent12.publish("", (java.lang.Object) "hi!");
        boolean boolean19 = objSimpleEvent12.thereIsNoActiveTask();
        boolean boolean20 = objSimpleEvent12.thereIsNoActiveTask();
        objSimpleEvent12.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent25 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj27 = null;
        objSimpleEvent25.publish("hi!", obj27);
        objSimpleEvent25.publish("", (java.lang.Object) "hi!");
        objSimpleEvent25.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent12.publish("hi!", (java.lang.Object) objSimpleEvent25);
        boolean boolean36 = objSimpleEvent12.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent38 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj40 = null;
        objSimpleEvent38.publish("hi!", obj40);
        boolean boolean42 = objSimpleEvent38.thereIsNoActiveTask();
        objSimpleEvent38.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent12.publish("", (java.lang.Object) objSimpleEvent38);
        objSimpleEvent0.publish("hi!", (java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent5 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 1);
        boolean boolean6 = objSimpleEvent5.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent5);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String> strSimpleEvent10 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String>((int) (short) 1);
        objSimpleEvent5.publish("", (java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass12 = objSimpleEvent5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        boolean boolean24 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean25 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) 1);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent31 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent34 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) ' ');
        boolean boolean35 = objSimpleEvent34.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass36 = objSimpleEvent34.getClass();
        objSimpleEvent31.publish("hi!", (java.lang.Object) wildcardClass36);
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent31);
        java.lang.Class<?> wildcardClass39 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) false);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent6 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj8 = null;
        objSimpleEvent6.publish("hi!", obj8);
        objSimpleEvent6.publish("", (java.lang.Object) "hi!");
        boolean boolean13 = objSimpleEvent6.thereIsNoActiveTask();
        boolean boolean14 = objSimpleEvent6.thereIsNoActiveTask();
        objSimpleEvent6.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent19 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj21 = null;
        objSimpleEvent19.publish("hi!", obj21);
        objSimpleEvent19.publish("", (java.lang.Object) "hi!");
        objSimpleEvent19.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent6.publish("hi!", (java.lang.Object) objSimpleEvent19);
        boolean boolean30 = objSimpleEvent6.thereIsNoActiveTask();
        boolean boolean31 = objSimpleEvent6.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass32 = objSimpleEvent6.getClass();
        objSimpleEvent0.publish("hi!", (java.lang.Object) wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String> strSimpleEvent4 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String>((int) (byte) 1);
        objSimpleEvent1.publish("hi!", (java.lang.Object) strSimpleEvent4);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent7 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean8 = objSimpleEvent7.thereIsNoActiveTask();
        boolean boolean9 = objSimpleEvent7.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 1);
        boolean boolean13 = objSimpleEvent12.thereIsNoActiveTask();
        objSimpleEvent7.publish("", (java.lang.Object) objSimpleEvent12);
        objSimpleEvent1.publish("hi!", (java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        boolean boolean15 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent17 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj19 = null;
        objSimpleEvent17.publish("hi!", obj19);
        objSimpleEvent17.publish("", (java.lang.Object) "hi!");
        boolean boolean24 = objSimpleEvent17.thereIsNoActiveTask();
        objSimpleEvent17.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent29 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj31 = null;
        objSimpleEvent29.publish("hi!", obj31);
        java.lang.Class<?> wildcardClass33 = objSimpleEvent29.getClass();
        objSimpleEvent17.publish("", (java.lang.Object) objSimpleEvent29);
        java.lang.Class<?> wildcardClass35 = objSimpleEvent29.getClass();
        objSimpleEvent0.publish("hi!", (java.lang.Object) wildcardClass35);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent38 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj40 = null;
        objSimpleEvent38.publish("hi!", obj40);
        boolean boolean42 = objSimpleEvent38.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) boolean42);
        java.lang.Class<?> wildcardClass44 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        io.github.maroodb.simpleevent.core.SimpleEvent<io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>> objSimpleEventSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>>((int) (byte) 100);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>> wildcardClassSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent4 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean5 = objSimpleEvent4.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) boolean5);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        objSimpleEvent9.publish("", (java.lang.Object) "hi!");
        boolean boolean16 = objSimpleEvent9.thereIsNoActiveTask();
        boolean boolean17 = objSimpleEvent9.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass18 = objSimpleEvent9.getClass();
        objSimpleEvent0.publish("hi!", (java.lang.Object) wildcardClass18);
        java.util.function.Consumer<java.lang.Object> objConsumer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable22 = objSimpleEvent0.subscribe("", objConsumer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        java.lang.Class<?> wildcardClass16 = objSimpleEvent12.getClass();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent19 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj21 = null;
        objSimpleEvent19.publish("hi!", obj21);
        objSimpleEvent19.publish("", (java.lang.Object) "hi!");
        boolean boolean26 = objSimpleEvent19.thereIsNoActiveTask();
        objSimpleEvent19.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent31 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj33 = null;
        objSimpleEvent31.publish("hi!", obj33);
        objSimpleEvent31.publish("", (java.lang.Object) "hi!");
        boolean boolean38 = objSimpleEvent31.thereIsNoActiveTask();
        boolean boolean39 = objSimpleEvent31.thereIsNoActiveTask();
        objSimpleEvent31.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent19.publish("hi!", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10L);
        boolean boolean48 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>> wildcardClassSimpleEvent51 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>>((int) (byte) 100);
        objSimpleEvent0.publish("hi!", (java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent4 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean5 = objSimpleEvent4.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) boolean5);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        objSimpleEvent9.publish("", (java.lang.Object) "hi!");
        boolean boolean16 = objSimpleEvent9.thereIsNoActiveTask();
        boolean boolean17 = objSimpleEvent9.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass18 = objSimpleEvent9.getClass();
        objSimpleEvent0.publish("hi!", (java.lang.Object) wildcardClass18);
        java.util.function.Consumer<java.lang.Object> objConsumer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable22 = objSimpleEvent0.subscribe("hi!", objConsumer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) 1);
        java.util.function.Consumer<java.lang.Object> objConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable4 = objSimpleEvent1.subscribe("", objConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.io.Serializable> serializableSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.io.Serializable>((int) ' ');
        java.lang.Class<?> wildcardClass2 = serializableSimpleEvent1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        boolean boolean15 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent17 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj19 = null;
        objSimpleEvent17.publish("hi!", obj19);
        objSimpleEvent17.publish("", (java.lang.Object) "hi!");
        boolean boolean24 = objSimpleEvent17.thereIsNoActiveTask();
        objSimpleEvent17.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent29 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj31 = null;
        objSimpleEvent29.publish("hi!", obj31);
        java.lang.Class<?> wildcardClass33 = objSimpleEvent29.getClass();
        objSimpleEvent17.publish("", (java.lang.Object) objSimpleEvent29);
        java.lang.Class<?> wildcardClass35 = objSimpleEvent29.getClass();
        objSimpleEvent0.publish("hi!", (java.lang.Object) wildcardClass35);
        boolean boolean37 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean38 = objSimpleEvent0.thereIsNoActiveTask();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent5 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 1);
        boolean boolean6 = objSimpleEvent5.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent5);
        boolean boolean8 = objSimpleEvent5.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass9 = objSimpleEvent5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        objSimpleEvent0.publish("", (java.lang.Object) 10L);
        boolean boolean27 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable30 = objSimpleEvent0.subscribe("", objConsumer29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean3 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String> strSimpleEvent5 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String>();
        objSimpleEvent0.publish("", (java.lang.Object) strSimpleEvent5);
        java.lang.Class<?> wildcardClass7 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        boolean boolean24 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean25 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) 1);
        boolean boolean29 = objSimpleEvent0.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass30 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.io.Serializable> serializableSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.io.Serializable>((int) '4');
        java.lang.Class<?> wildcardClass2 = serializableSimpleEvent1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        java.lang.Class<?> wildcardClass16 = objSimpleEvent12.getClass();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent19 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj21 = null;
        objSimpleEvent19.publish("hi!", obj21);
        objSimpleEvent19.publish("", (java.lang.Object) "hi!");
        boolean boolean26 = objSimpleEvent19.thereIsNoActiveTask();
        objSimpleEvent19.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent31 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj33 = null;
        objSimpleEvent31.publish("hi!", obj33);
        objSimpleEvent31.publish("", (java.lang.Object) "hi!");
        boolean boolean38 = objSimpleEvent31.thereIsNoActiveTask();
        boolean boolean39 = objSimpleEvent31.thereIsNoActiveTask();
        objSimpleEvent31.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent19.publish("hi!", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>> wildcardClassSimpleEvent46 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>>();
        objSimpleEvent0.publish("", (java.lang.Object) wildcardClassSimpleEvent46);
        java.lang.Class<?> wildcardClass48 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        java.lang.Object obj8 = null;
        objSimpleEvent0.publish("hi!", obj8);
        boolean boolean10 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        objSimpleEvent12.publish("", (java.lang.Object) "hi!");
        boolean boolean19 = objSimpleEvent12.thereIsNoActiveTask();
        objSimpleEvent12.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent24 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj26 = null;
        objSimpleEvent24.publish("hi!", obj26);
        java.lang.Class<?> wildcardClass28 = objSimpleEvent24.getClass();
        objSimpleEvent12.publish("", (java.lang.Object) objSimpleEvent24);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent31 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj33 = null;
        objSimpleEvent31.publish("hi!", obj33);
        objSimpleEvent31.publish("", (java.lang.Object) "hi!");
        boolean boolean38 = objSimpleEvent31.thereIsNoActiveTask();
        objSimpleEvent31.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent43 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj45 = null;
        objSimpleEvent43.publish("hi!", obj45);
        objSimpleEvent43.publish("", (java.lang.Object) "hi!");
        boolean boolean50 = objSimpleEvent43.thereIsNoActiveTask();
        boolean boolean51 = objSimpleEvent43.thereIsNoActiveTask();
        objSimpleEvent43.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent31.publish("hi!", (java.lang.Object) "hi!");
        objSimpleEvent12.publish("", (java.lang.Object) "hi!");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>> wildcardClassSimpleEvent58 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>>();
        objSimpleEvent12.publish("", (java.lang.Object) wildcardClassSimpleEvent58);
        objSimpleEvent0.publish("hi!", (java.lang.Object) wildcardClassSimpleEvent58);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent4 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) ' ');
        boolean boolean5 = objSimpleEvent4.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass6 = objSimpleEvent4.getClass();
        objSimpleEvent1.publish("hi!", (java.lang.Object) wildcardClass6);
        objSimpleEvent1.publish("", (java.lang.Object) false);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent16 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) ' ');
        boolean boolean17 = objSimpleEvent16.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass18 = objSimpleEvent16.getClass();
        objSimpleEvent13.publish("hi!", (java.lang.Object) wildcardClass18);
        boolean boolean20 = objSimpleEvent13.thereIsNoActiveTask();
        objSimpleEvent1.publish("", (java.lang.Object) boolean20);
        java.lang.Class<?> wildcardClass22 = objSimpleEvent1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        boolean boolean15 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent17 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj19 = null;
        objSimpleEvent17.publish("hi!", obj19);
        objSimpleEvent17.publish("", (java.lang.Object) "hi!");
        boolean boolean24 = objSimpleEvent17.thereIsNoActiveTask();
        objSimpleEvent17.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent29 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj31 = null;
        objSimpleEvent29.publish("hi!", obj31);
        java.lang.Class<?> wildcardClass33 = objSimpleEvent29.getClass();
        objSimpleEvent17.publish("", (java.lang.Object) objSimpleEvent29);
        java.lang.Class<?> wildcardClass35 = objSimpleEvent29.getClass();
        objSimpleEvent0.publish("hi!", (java.lang.Object) wildcardClass35);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent38 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj40 = null;
        objSimpleEvent38.publish("hi!", obj40);
        boolean boolean42 = objSimpleEvent38.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) boolean42);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent45 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj47 = null;
        objSimpleEvent45.publish("hi!", obj47);
        objSimpleEvent45.publish("", (java.lang.Object) "hi!");
        boolean boolean52 = objSimpleEvent45.thereIsNoActiveTask();
        boolean boolean53 = objSimpleEvent45.thereIsNoActiveTask();
        objSimpleEvent45.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent45);
        boolean boolean58 = objSimpleEvent0.thereIsNoActiveTask();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        java.lang.Class<?> wildcardClass16 = objSimpleEvent12.getClass();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent19 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj21 = null;
        objSimpleEvent19.publish("hi!", obj21);
        objSimpleEvent19.publish("", (java.lang.Object) "hi!");
        boolean boolean26 = objSimpleEvent19.thereIsNoActiveTask();
        objSimpleEvent19.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent31 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj33 = null;
        objSimpleEvent31.publish("hi!", obj33);
        objSimpleEvent31.publish("", (java.lang.Object) "hi!");
        boolean boolean38 = objSimpleEvent31.thereIsNoActiveTask();
        boolean boolean39 = objSimpleEvent31.thereIsNoActiveTask();
        objSimpleEvent31.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent19.publish("hi!", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10L);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent49 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj51 = null;
        objSimpleEvent49.publish("hi!", obj51);
        objSimpleEvent49.publish("", (java.lang.Object) "hi!");
        boolean boolean56 = objSimpleEvent49.thereIsNoActiveTask();
        objSimpleEvent49.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent61 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj63 = null;
        objSimpleEvent61.publish("hi!", obj63);
        objSimpleEvent61.publish("", (java.lang.Object) "hi!");
        boolean boolean68 = objSimpleEvent61.thereIsNoActiveTask();
        boolean boolean69 = objSimpleEvent61.thereIsNoActiveTask();
        objSimpleEvent61.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent49.publish("hi!", (java.lang.Object) "hi!");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent75 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean76 = objSimpleEvent75.thereIsNoActiveTask();
        boolean boolean77 = objSimpleEvent75.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent79 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean80 = objSimpleEvent79.thereIsNoActiveTask();
        objSimpleEvent75.publish("hi!", (java.lang.Object) boolean80);
        boolean boolean82 = objSimpleEvent75.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent84 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj86 = null;
        objSimpleEvent84.publish("hi!", obj86);
        objSimpleEvent84.publish("", (java.lang.Object) "hi!");
        boolean boolean91 = objSimpleEvent84.thereIsNoActiveTask();
        boolean boolean92 = objSimpleEvent84.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass93 = objSimpleEvent84.getClass();
        objSimpleEvent75.publish("hi!", (java.lang.Object) wildcardClass93);
        objSimpleEvent49.publish("", (java.lang.Object) objSimpleEvent75);
        boolean boolean96 = objSimpleEvent49.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass97 = objSimpleEvent49.getClass();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent49);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        java.lang.Object obj8 = null;
        objSimpleEvent0.publish("hi!", obj8);
        objSimpleEvent0.publish("hi!", (java.lang.Object) (byte) 10);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        boolean boolean24 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean25 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable28 = objSimpleEvent0.subscribe("hi!", objConsumer27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = objSimpleEvent1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent5 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 1);
        boolean boolean6 = objSimpleEvent5.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent5);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        objSimpleEvent9.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean16 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent9.publish("", (java.lang.Object) '#');
        objSimpleEvent0.publish("", (java.lang.Object) "");
        boolean boolean21 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent2 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj4 = null;
        objSimpleEvent2.publish("hi!", obj4);
        objSimpleEvent2.publish("", (java.lang.Object) "hi!");
        boolean boolean9 = objSimpleEvent2.thereIsNoActiveTask();
        boolean boolean10 = objSimpleEvent2.thereIsNoActiveTask();
        objSimpleEvent2.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent15 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj17 = null;
        objSimpleEvent15.publish("hi!", obj17);
        objSimpleEvent15.publish("", (java.lang.Object) "hi!");
        objSimpleEvent15.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent2.publish("hi!", (java.lang.Object) objSimpleEvent15);
        boolean boolean26 = objSimpleEvent2.thereIsNoActiveTask();
        boolean boolean27 = objSimpleEvent2.thereIsNoActiveTask();
        objSimpleEvent2.publish("", (java.lang.Object) 1);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent32 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean33 = objSimpleEvent32.thereIsNoActiveTask();
        objSimpleEvent32.publish("", (java.lang.Object) 1);
        objSimpleEvent2.publish("hi!", (java.lang.Object) objSimpleEvent32);
        java.lang.Object obj39 = null;
        objSimpleEvent32.publish("", obj39);
        objSimpleEvent0.publish("hi!", (java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent3 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean4 = objSimpleEvent3.thereIsNoActiveTask();
        boolean boolean5 = objSimpleEvent3.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent7 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean8 = objSimpleEvent7.thereIsNoActiveTask();
        objSimpleEvent3.publish("hi!", (java.lang.Object) boolean8);
        objSimpleEvent1.publish("hi!", (java.lang.Object) objSimpleEvent3);
        boolean boolean11 = objSimpleEvent1.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass12 = objSimpleEvent1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent4 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean5 = objSimpleEvent4.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) boolean5);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        objSimpleEvent9.publish("", (java.lang.Object) "hi!");
        boolean boolean16 = objSimpleEvent9.thereIsNoActiveTask();
        boolean boolean17 = objSimpleEvent9.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass18 = objSimpleEvent9.getClass();
        objSimpleEvent0.publish("hi!", (java.lang.Object) wildcardClass18);
        boolean boolean20 = objSimpleEvent0.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass21 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        objSimpleEvent0.publish("", (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass18 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("", (java.lang.Object) (short) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.AnnotatedElement> annotatedElementSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.AnnotatedElement>(1);
        objSimpleEvent0.publish("hi!", (java.lang.Object) 1);
        boolean boolean14 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable17 = objSimpleEvent0.subscribe("hi!", objConsumer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent4 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) ' ');
        boolean boolean5 = objSimpleEvent4.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass6 = objSimpleEvent4.getClass();
        objSimpleEvent1.publish("hi!", (java.lang.Object) wildcardClass6);
        boolean boolean8 = objSimpleEvent1.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass9 = objSimpleEvent1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) 'a');
        java.lang.Class<?> wildcardClass2 = objSimpleEvent1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent5 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 1);
        boolean boolean6 = objSimpleEvent5.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent5);
        boolean boolean8 = objSimpleEvent5.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable11 = objSimpleEvent5.subscribe("hi!", objConsumer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 1);
        boolean boolean2 = objSimpleEvent1.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable5 = objSimpleEvent1.subscribe("", objConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        java.util.function.Consumer<java.lang.Object> objConsumer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable26 = objSimpleEvent0.subscribe("hi!", objConsumer25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) false);
        boolean boolean5 = objSimpleEvent0.thereIsNoActiveTask();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        java.lang.Object obj25 = null;
        objSimpleEvent0.publish("", obj25);
        boolean boolean27 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable30 = objSimpleEvent0.subscribe("hi!", objConsumer29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) false);
        java.lang.Class<?> wildcardClass5 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>(1);
        boolean boolean2 = objSimpleEvent1.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent4 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj6 = null;
        objSimpleEvent4.publish("hi!", obj6);
        objSimpleEvent4.publish("", (java.lang.Object) "hi!");
        boolean boolean11 = objSimpleEvent4.thereIsNoActiveTask();
        objSimpleEvent4.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent16 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj18 = null;
        objSimpleEvent16.publish("hi!", obj18);
        java.lang.Class<?> wildcardClass20 = objSimpleEvent16.getClass();
        objSimpleEvent4.publish("", (java.lang.Object) objSimpleEvent16);
        objSimpleEvent1.publish("", (java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        objSimpleEvent12.publish("", (java.lang.Object) "hi!");
        boolean boolean19 = objSimpleEvent12.thereIsNoActiveTask();
        boolean boolean20 = objSimpleEvent12.thereIsNoActiveTask();
        objSimpleEvent12.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) "hi!");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent26 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean27 = objSimpleEvent26.thereIsNoActiveTask();
        boolean boolean28 = objSimpleEvent26.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent30 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean31 = objSimpleEvent30.thereIsNoActiveTask();
        objSimpleEvent26.publish("hi!", (java.lang.Object) boolean31);
        boolean boolean33 = objSimpleEvent26.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent35 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj37 = null;
        objSimpleEvent35.publish("hi!", obj37);
        objSimpleEvent35.publish("", (java.lang.Object) "hi!");
        boolean boolean42 = objSimpleEvent35.thereIsNoActiveTask();
        boolean boolean43 = objSimpleEvent35.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass44 = objSimpleEvent35.getClass();
        objSimpleEvent26.publish("hi!", (java.lang.Object) wildcardClass44);
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent26);
        java.util.function.Consumer<java.lang.Object> objConsumer48 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable49 = objSimpleEvent0.subscribe("", objConsumer48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("", (java.lang.Object) (short) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.AnnotatedElement> annotatedElementSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.AnnotatedElement>(1);
        objSimpleEvent0.publish("hi!", (java.lang.Object) 1);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent15 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj17 = null;
        objSimpleEvent15.publish("hi!", obj17);
        objSimpleEvent15.publish("", (java.lang.Object) "hi!");
        boolean boolean22 = objSimpleEvent15.thereIsNoActiveTask();
        objSimpleEvent15.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent27 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj29 = null;
        objSimpleEvent27.publish("hi!", obj29);
        objSimpleEvent27.publish("", (java.lang.Object) "hi!");
        boolean boolean34 = objSimpleEvent27.thereIsNoActiveTask();
        boolean boolean35 = objSimpleEvent27.thereIsNoActiveTask();
        objSimpleEvent27.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent15.publish("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass40 = objSimpleEvent15.getClass();
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String> strSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String>((int) (short) 100);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        objSimpleEvent9.publish("", (java.lang.Object) 100);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent19 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj21 = null;
        objSimpleEvent19.publish("hi!", obj21);
        objSimpleEvent19.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean26 = objSimpleEvent19.thereIsNoActiveTask();
        objSimpleEvent19.publish("", (java.lang.Object) '#');
        java.lang.Object obj31 = null;
        objSimpleEvent19.publish("", obj31);
        boolean boolean33 = objSimpleEvent19.thereIsNoActiveTask();
        boolean boolean34 = objSimpleEvent19.thereIsNoActiveTask();
        objSimpleEvent9.publish("", (java.lang.Object) objSimpleEvent19);
        boolean boolean36 = objSimpleEvent19.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer38 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable39 = objSimpleEvent19.subscribe("hi!", objConsumer38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent5 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 1);
        boolean boolean6 = objSimpleEvent5.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent5);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        objSimpleEvent9.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean16 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent9.publish("", (java.lang.Object) '#');
        objSimpleEvent0.publish("", (java.lang.Object) "");
        objSimpleEvent0.publish("", (java.lang.Object) "");
        java.util.function.Consumer<java.lang.Object> objConsumer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable26 = objSimpleEvent0.subscribe("hi!", objConsumer25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent5 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 1);
        boolean boolean6 = objSimpleEvent5.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent5);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        objSimpleEvent9.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean16 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent9.publish("", (java.lang.Object) '#');
        objSimpleEvent0.publish("", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass21 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        boolean boolean24 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean25 = objSimpleEvent0.thereIsNoActiveTask();
        java.lang.Object obj27 = null;
        objSimpleEvent0.publish("hi!", obj27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        java.lang.Class<?> wildcardClass16 = objSimpleEvent12.getClass();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent19 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj21 = null;
        objSimpleEvent19.publish("hi!", obj21);
        objSimpleEvent19.publish("", (java.lang.Object) "hi!");
        boolean boolean26 = objSimpleEvent19.thereIsNoActiveTask();
        objSimpleEvent19.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent31 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj33 = null;
        objSimpleEvent31.publish("hi!", obj33);
        objSimpleEvent31.publish("", (java.lang.Object) "hi!");
        boolean boolean38 = objSimpleEvent31.thereIsNoActiveTask();
        boolean boolean39 = objSimpleEvent31.thereIsNoActiveTask();
        objSimpleEvent31.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent19.publish("hi!", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean45 = objSimpleEvent0.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass46 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) '#');
        java.lang.Object obj12 = null;
        objSimpleEvent0.publish("", obj12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent15 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj17 = null;
        objSimpleEvent15.publish("hi!", obj17);
        objSimpleEvent15.publish("", (java.lang.Object) "hi!");
        boolean boolean22 = objSimpleEvent15.thereIsNoActiveTask();
        boolean boolean23 = objSimpleEvent15.thereIsNoActiveTask();
        objSimpleEvent15.publish("hi!", (java.lang.Object) 10);
        boolean boolean27 = objSimpleEvent15.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent15);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent30 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean31 = objSimpleEvent30.thereIsNoActiveTask();
        boolean boolean32 = objSimpleEvent30.thereIsNoActiveTask();
        objSimpleEvent15.publish("", (java.lang.Object) boolean32);
        objSimpleEvent15.publish("hi!", (java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Comparable<java.lang.String>> strComparableSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Comparable<java.lang.String>>((int) 'a');
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) '4');
        java.util.function.Consumer<java.lang.Object> objConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable4 = objSimpleEvent1.subscribe("hi!", objConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>(1);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent3 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean4 = objSimpleEvent3.thereIsNoActiveTask();
        boolean boolean5 = objSimpleEvent3.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent8 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 1);
        boolean boolean9 = objSimpleEvent8.thereIsNoActiveTask();
        objSimpleEvent3.publish("", (java.lang.Object) objSimpleEvent8);
        objSimpleEvent1.publish("", (java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent4 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean5 = objSimpleEvent4.thereIsNoActiveTask();
        boolean boolean6 = objSimpleEvent4.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent8 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean9 = objSimpleEvent8.thereIsNoActiveTask();
        objSimpleEvent4.publish("hi!", (java.lang.Object) boolean9);
        boolean boolean11 = objSimpleEvent4.thereIsNoActiveTask();
        boolean boolean12 = objSimpleEvent4.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) boolean12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.AnnotatedElement> annotatedElementSimpleEvent16 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.AnnotatedElement>(1);
        objSimpleEvent0.publish("hi!", (java.lang.Object) annotatedElementSimpleEvent16);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent19 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj21 = null;
        objSimpleEvent19.publish("hi!", obj21);
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent19);
        java.lang.Class<?> wildcardClass24 = objSimpleEvent19.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) '#');
        java.lang.Object obj12 = null;
        objSimpleEvent0.publish("", obj12);
        boolean boolean14 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean15 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent17 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj19 = null;
        objSimpleEvent17.publish("hi!", obj19);
        objSimpleEvent17.publish("", (java.lang.Object) "hi!");
        java.lang.Object obj25 = null;
        objSimpleEvent17.publish("hi!", obj25);
        boolean boolean27 = objSimpleEvent17.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent30 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>(1);
        java.lang.Object obj32 = null;
        objSimpleEvent30.publish("hi!", obj32);
        objSimpleEvent17.publish("", (java.lang.Object) objSimpleEvent30);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent37 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>(1);
        boolean boolean38 = objSimpleEvent37.thereIsNoActiveTask();
        objSimpleEvent30.publish("", (java.lang.Object) boolean38);
        objSimpleEvent0.publish("hi!", (java.lang.Object) boolean38);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent4 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) ' ');
        boolean boolean5 = objSimpleEvent4.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass6 = objSimpleEvent4.getClass();
        objSimpleEvent1.publish("hi!", (java.lang.Object) wildcardClass6);
        boolean boolean8 = objSimpleEvent1.thereIsNoActiveTask();
        boolean boolean9 = objSimpleEvent1.thereIsNoActiveTask();
        boolean boolean10 = objSimpleEvent1.thereIsNoActiveTask();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent3 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean4 = objSimpleEvent3.thereIsNoActiveTask();
        boolean boolean5 = objSimpleEvent3.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent7 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean8 = objSimpleEvent7.thereIsNoActiveTask();
        objSimpleEvent3.publish("hi!", (java.lang.Object) boolean8);
        objSimpleEvent1.publish("hi!", (java.lang.Object) objSimpleEvent3);
        java.lang.Class<?> wildcardClass11 = objSimpleEvent3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        java.lang.Class<?> wildcardClass16 = objSimpleEvent12.getClass();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent19 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj21 = null;
        objSimpleEvent19.publish("hi!", obj21);
        objSimpleEvent19.publish("", (java.lang.Object) "hi!");
        boolean boolean26 = objSimpleEvent19.thereIsNoActiveTask();
        objSimpleEvent19.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent31 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj33 = null;
        objSimpleEvent31.publish("hi!", obj33);
        objSimpleEvent31.publish("", (java.lang.Object) "hi!");
        boolean boolean38 = objSimpleEvent31.thereIsNoActiveTask();
        boolean boolean39 = objSimpleEvent31.thereIsNoActiveTask();
        objSimpleEvent31.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent19.publish("hi!", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10L);
        java.util.function.Consumer<java.lang.Object> objConsumer49 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable50 = objSimpleEvent0.subscribe("", objConsumer49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean10 = objSimpleEvent9.thereIsNoActiveTask();
        boolean boolean11 = objSimpleEvent9.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean14 = objSimpleEvent13.thereIsNoActiveTask();
        boolean boolean15 = objSimpleEvent13.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent17 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean18 = objSimpleEvent17.thereIsNoActiveTask();
        objSimpleEvent13.publish("hi!", (java.lang.Object) boolean18);
        boolean boolean20 = objSimpleEvent13.thereIsNoActiveTask();
        boolean boolean21 = objSimpleEvent13.thereIsNoActiveTask();
        objSimpleEvent9.publish("", (java.lang.Object) boolean21);
        objSimpleEvent0.publish("", (java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        java.lang.Object obj8 = null;
        objSimpleEvent0.publish("hi!", obj8);
        boolean boolean10 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>(1);
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent13);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent20 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>(1);
        boolean boolean21 = objSimpleEvent20.thereIsNoActiveTask();
        objSimpleEvent13.publish("", (java.lang.Object) boolean21);
        boolean boolean23 = objSimpleEvent13.thereIsNoActiveTask();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        java.lang.Class<?> wildcardClass15 = objSimpleEvent9.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) '#');
        java.lang.Object obj12 = null;
        objSimpleEvent0.publish("", obj12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent15 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj17 = null;
        objSimpleEvent15.publish("hi!", obj17);
        objSimpleEvent15.publish("", (java.lang.Object) "hi!");
        boolean boolean22 = objSimpleEvent15.thereIsNoActiveTask();
        boolean boolean23 = objSimpleEvent15.thereIsNoActiveTask();
        objSimpleEvent15.publish("hi!", (java.lang.Object) 10);
        boolean boolean27 = objSimpleEvent15.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent15);
        boolean boolean29 = objSimpleEvent0.thereIsNoActiveTask();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        objSimpleEvent12.publish("", (java.lang.Object) "hi!");
        boolean boolean19 = objSimpleEvent12.thereIsNoActiveTask();
        boolean boolean20 = objSimpleEvent12.thereIsNoActiveTask();
        objSimpleEvent12.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) "hi!");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent26 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean27 = objSimpleEvent26.thereIsNoActiveTask();
        boolean boolean28 = objSimpleEvent26.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent30 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean31 = objSimpleEvent30.thereIsNoActiveTask();
        objSimpleEvent26.publish("hi!", (java.lang.Object) boolean31);
        boolean boolean33 = objSimpleEvent26.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent35 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj37 = null;
        objSimpleEvent35.publish("hi!", obj37);
        objSimpleEvent35.publish("", (java.lang.Object) "hi!");
        boolean boolean42 = objSimpleEvent35.thereIsNoActiveTask();
        boolean boolean43 = objSimpleEvent35.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass44 = objSimpleEvent35.getClass();
        objSimpleEvent26.publish("hi!", (java.lang.Object) wildcardClass44);
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent26);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.GenericDeclaration> genericDeclarationSimpleEvent49 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.GenericDeclaration>(1);
        java.lang.Class<?> wildcardClass50 = genericDeclarationSimpleEvent49.getClass();
        objSimpleEvent26.publish("", (java.lang.Object) wildcardClass50);
        java.util.function.Consumer<java.lang.Object> objConsumer53 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable54 = objSimpleEvent26.subscribe("hi!", objConsumer53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        boolean boolean24 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean25 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) 1);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent31 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent34 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) ' ');
        boolean boolean35 = objSimpleEvent34.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass36 = objSimpleEvent34.getClass();
        objSimpleEvent31.publish("hi!", (java.lang.Object) wildcardClass36);
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent31);
        java.lang.Object obj40 = new java.lang.Object();
        objSimpleEvent0.publish("", obj40);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent43 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj45 = null;
        objSimpleEvent43.publish("hi!", obj45);
        objSimpleEvent43.publish("", (java.lang.Object) "hi!");
        objSimpleEvent43.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        boolean boolean4 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) (short) 10);
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass9 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        boolean boolean24 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean25 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) 1);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent31 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent34 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) ' ');
        boolean boolean35 = objSimpleEvent34.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass36 = objSimpleEvent34.getClass();
        objSimpleEvent31.publish("hi!", (java.lang.Object) wildcardClass36);
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent31);
        java.lang.Object obj40 = new java.lang.Object();
        objSimpleEvent0.publish("", obj40);
        boolean boolean42 = objSimpleEvent0.thereIsNoActiveTask();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        boolean boolean24 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent26 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj28 = null;
        objSimpleEvent26.publish("hi!", obj28);
        boolean boolean30 = objSimpleEvent26.thereIsNoActiveTask();
        objSimpleEvent26.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent26);
        java.lang.Class<?> wildcardClass35 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        boolean boolean24 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean25 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) 1);
        boolean boolean29 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent32 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) 10);
        java.lang.Class<?> wildcardClass33 = objSimpleEvent32.getClass();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent32);
        boolean boolean35 = objSimpleEvent32.thereIsNoActiveTask();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        objSimpleEvent12.publish("", (java.lang.Object) "hi!");
        boolean boolean19 = objSimpleEvent12.thereIsNoActiveTask();
        boolean boolean20 = objSimpleEvent12.thereIsNoActiveTask();
        objSimpleEvent12.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) "hi!");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent26 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean27 = objSimpleEvent26.thereIsNoActiveTask();
        boolean boolean28 = objSimpleEvent26.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent30 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean31 = objSimpleEvent30.thereIsNoActiveTask();
        objSimpleEvent26.publish("hi!", (java.lang.Object) boolean31);
        boolean boolean33 = objSimpleEvent26.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent35 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj37 = null;
        objSimpleEvent35.publish("hi!", obj37);
        objSimpleEvent35.publish("", (java.lang.Object) "hi!");
        boolean boolean42 = objSimpleEvent35.thereIsNoActiveTask();
        boolean boolean43 = objSimpleEvent35.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass44 = objSimpleEvent35.getClass();
        objSimpleEvent26.publish("hi!", (java.lang.Object) wildcardClass44);
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent26);
        java.lang.Class<?> wildcardClass47 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent5 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj7 = null;
        objSimpleEvent5.publish("hi!", obj7);
        boolean boolean9 = objSimpleEvent5.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass10 = objSimpleEvent5.getClass();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent5);
        boolean boolean12 = objSimpleEvent0.thereIsNoActiveTask();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>> wildcardClassSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>>((int) '#');
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        objSimpleEvent0.publish("", (java.lang.Object) '#');
        boolean boolean18 = objSimpleEvent0.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass19 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent5 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>(100);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent8 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent11 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String> strSimpleEvent14 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String>((int) (byte) 1);
        objSimpleEvent11.publish("hi!", (java.lang.Object) strSimpleEvent14);
        objSimpleEvent8.publish("hi!", (java.lang.Object) strSimpleEvent14);
        objSimpleEvent5.publish("", (java.lang.Object) objSimpleEvent8);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent8);
        java.util.function.Consumer<java.lang.Object> objConsumer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable21 = objSimpleEvent0.subscribe("hi!", objConsumer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = objSimpleEvent1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent3 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean4 = objSimpleEvent3.thereIsNoActiveTask();
        boolean boolean5 = objSimpleEvent3.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent7 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean8 = objSimpleEvent7.thereIsNoActiveTask();
        objSimpleEvent3.publish("hi!", (java.lang.Object) boolean8);
        objSimpleEvent1.publish("hi!", (java.lang.Object) objSimpleEvent3);
        boolean boolean11 = objSimpleEvent1.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable14 = objSimpleEvent1.subscribe("", objConsumer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        boolean boolean24 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean25 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) 1);
        boolean boolean29 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent32 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) 10);
        java.lang.Class<?> wildcardClass33 = objSimpleEvent32.getClass();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent32);
        java.lang.Class<?> wildcardClass35 = objSimpleEvent32.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        objSimpleEvent9.publish("", (java.lang.Object) 100);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent19 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj21 = null;
        objSimpleEvent19.publish("hi!", obj21);
        objSimpleEvent19.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean26 = objSimpleEvent19.thereIsNoActiveTask();
        objSimpleEvent19.publish("", (java.lang.Object) '#');
        java.lang.Object obj31 = null;
        objSimpleEvent19.publish("", obj31);
        boolean boolean33 = objSimpleEvent19.thereIsNoActiveTask();
        boolean boolean34 = objSimpleEvent19.thereIsNoActiveTask();
        objSimpleEvent9.publish("", (java.lang.Object) objSimpleEvent19);
        java.util.function.Consumer<java.lang.Object> objConsumer37 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable38 = objSimpleEvent9.subscribe("hi!", objConsumer37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        boolean boolean24 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable27 = objSimpleEvent0.subscribe("hi!", objConsumer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        boolean boolean4 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) 'a');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        objSimpleEvent12.publish("", (java.lang.Object) "hi!");
        objSimpleEvent12.publish("", (java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass22 = objSimpleEvent12.getClass();
        objSimpleEvent0.publish("hi!", (java.lang.Object) wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        java.lang.Class<?> wildcardClass16 = objSimpleEvent12.getClass();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent19 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj21 = null;
        objSimpleEvent19.publish("hi!", obj21);
        objSimpleEvent19.publish("", (java.lang.Object) "hi!");
        boolean boolean26 = objSimpleEvent19.thereIsNoActiveTask();
        objSimpleEvent19.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent31 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj33 = null;
        objSimpleEvent31.publish("hi!", obj33);
        objSimpleEvent31.publish("", (java.lang.Object) "hi!");
        boolean boolean38 = objSimpleEvent31.thereIsNoActiveTask();
        boolean boolean39 = objSimpleEvent31.thereIsNoActiveTask();
        objSimpleEvent31.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent19.publish("hi!", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean45 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent47 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj49 = null;
        objSimpleEvent47.publish("hi!", obj49);
        objSimpleEvent47.publish("", (java.lang.Object) "hi!");
        boolean boolean54 = objSimpleEvent47.thereIsNoActiveTask();
        objSimpleEvent47.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent59 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj61 = null;
        objSimpleEvent59.publish("hi!", obj61);
        java.lang.Class<?> wildcardClass63 = objSimpleEvent59.getClass();
        objSimpleEvent47.publish("", (java.lang.Object) objSimpleEvent59);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent66 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj68 = null;
        objSimpleEvent66.publish("hi!", obj68);
        objSimpleEvent66.publish("", (java.lang.Object) "hi!");
        boolean boolean73 = objSimpleEvent66.thereIsNoActiveTask();
        objSimpleEvent66.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent78 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj80 = null;
        objSimpleEvent78.publish("hi!", obj80);
        objSimpleEvent78.publish("", (java.lang.Object) "hi!");
        boolean boolean85 = objSimpleEvent78.thereIsNoActiveTask();
        boolean boolean86 = objSimpleEvent78.thereIsNoActiveTask();
        objSimpleEvent78.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent66.publish("hi!", (java.lang.Object) "hi!");
        objSimpleEvent47.publish("", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent47);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.GenericDeclaration> genericDeclarationSimpleEvent95 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.GenericDeclaration>(1);
        java.lang.Class<?> wildcardClass96 = genericDeclarationSimpleEvent95.getClass();
        objSimpleEvent47.publish("", (java.lang.Object) genericDeclarationSimpleEvent95);
        java.lang.Class<?> wildcardClass98 = genericDeclarationSimpleEvent95.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(wildcardClass96);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        boolean boolean15 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean16 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) true);
        java.lang.Class<?> wildcardClass20 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        objSimpleEvent12.publish("", (java.lang.Object) "hi!");
        boolean boolean19 = objSimpleEvent12.thereIsNoActiveTask();
        boolean boolean20 = objSimpleEvent12.thereIsNoActiveTask();
        objSimpleEvent12.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) "hi!");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent26 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean27 = objSimpleEvent26.thereIsNoActiveTask();
        boolean boolean28 = objSimpleEvent26.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent30 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean31 = objSimpleEvent30.thereIsNoActiveTask();
        objSimpleEvent26.publish("hi!", (java.lang.Object) boolean31);
        boolean boolean33 = objSimpleEvent26.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent35 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj37 = null;
        objSimpleEvent35.publish("hi!", obj37);
        objSimpleEvent35.publish("", (java.lang.Object) "hi!");
        boolean boolean42 = objSimpleEvent35.thereIsNoActiveTask();
        boolean boolean43 = objSimpleEvent35.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass44 = objSimpleEvent35.getClass();
        objSimpleEvent26.publish("hi!", (java.lang.Object) wildcardClass44);
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent26);
        java.lang.Class<?> wildcardClass47 = objSimpleEvent26.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) '#');
        java.lang.Object obj12 = null;
        objSimpleEvent0.publish("", obj12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent15 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj17 = null;
        objSimpleEvent15.publish("hi!", obj17);
        objSimpleEvent15.publish("", (java.lang.Object) "hi!");
        boolean boolean22 = objSimpleEvent15.thereIsNoActiveTask();
        boolean boolean23 = objSimpleEvent15.thereIsNoActiveTask();
        objSimpleEvent15.publish("hi!", (java.lang.Object) 10);
        boolean boolean27 = objSimpleEvent15.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent15);
        boolean boolean29 = objSimpleEvent15.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer31 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable32 = objSimpleEvent15.subscribe("hi!", objConsumer31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent4 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean5 = objSimpleEvent4.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) boolean5);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        objSimpleEvent9.publish("", (java.lang.Object) "hi!");
        boolean boolean16 = objSimpleEvent9.thereIsNoActiveTask();
        boolean boolean17 = objSimpleEvent9.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass18 = objSimpleEvent9.getClass();
        objSimpleEvent0.publish("hi!", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass20 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        objSimpleEvent12.publish("", (java.lang.Object) "hi!");
        boolean boolean19 = objSimpleEvent12.thereIsNoActiveTask();
        boolean boolean20 = objSimpleEvent12.thereIsNoActiveTask();
        objSimpleEvent12.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) "hi!");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent26 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean27 = objSimpleEvent26.thereIsNoActiveTask();
        boolean boolean28 = objSimpleEvent26.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent30 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean31 = objSimpleEvent30.thereIsNoActiveTask();
        objSimpleEvent26.publish("hi!", (java.lang.Object) boolean31);
        boolean boolean33 = objSimpleEvent26.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent35 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj37 = null;
        objSimpleEvent35.publish("hi!", obj37);
        objSimpleEvent35.publish("", (java.lang.Object) "hi!");
        boolean boolean42 = objSimpleEvent35.thereIsNoActiveTask();
        boolean boolean43 = objSimpleEvent35.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass44 = objSimpleEvent35.getClass();
        objSimpleEvent26.publish("hi!", (java.lang.Object) wildcardClass44);
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent26);
        java.util.function.Consumer<java.lang.Object> objConsumer48 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable49 = objSimpleEvent0.subscribe("hi!", objConsumer48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent25 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean26 = objSimpleEvent25.thereIsNoActiveTask();
        boolean boolean27 = objSimpleEvent25.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent29 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean30 = objSimpleEvent29.thereIsNoActiveTask();
        objSimpleEvent25.publish("hi!", (java.lang.Object) boolean30);
        boolean boolean32 = objSimpleEvent25.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent34 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj36 = null;
        objSimpleEvent34.publish("hi!", obj36);
        objSimpleEvent34.publish("", (java.lang.Object) "hi!");
        boolean boolean41 = objSimpleEvent34.thereIsNoActiveTask();
        objSimpleEvent34.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent46 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj48 = null;
        objSimpleEvent46.publish("hi!", obj48);
        java.lang.Class<?> wildcardClass50 = objSimpleEvent46.getClass();
        objSimpleEvent34.publish("", (java.lang.Object) objSimpleEvent46);
        java.lang.Class<?> wildcardClass52 = objSimpleEvent46.getClass();
        objSimpleEvent25.publish("", (java.lang.Object) objSimpleEvent46);
        java.lang.Class<?> wildcardClass54 = objSimpleEvent25.getClass();
        objSimpleEvent0.publish("hi!", (java.lang.Object) wildcardClass54);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean3 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable6 = objSimpleEvent0.subscribe("", objConsumer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.io.Serializable> serializableSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.io.Serializable>((int) (short) 100);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass2 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) 1);
        boolean boolean5 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable8 = objSimpleEvent0.subscribe("hi!", objConsumer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        boolean boolean4 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean5 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent8 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = objSimpleEvent8.getClass();
        objSimpleEvent0.publish("hi!", (java.lang.Object) wildcardClass9);
        boolean boolean11 = objSimpleEvent0.thereIsNoActiveTask();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        boolean boolean15 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent17 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj19 = null;
        objSimpleEvent17.publish("hi!", obj19);
        objSimpleEvent17.publish("", (java.lang.Object) "hi!");
        boolean boolean24 = objSimpleEvent17.thereIsNoActiveTask();
        objSimpleEvent17.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent29 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj31 = null;
        objSimpleEvent29.publish("hi!", obj31);
        java.lang.Class<?> wildcardClass33 = objSimpleEvent29.getClass();
        objSimpleEvent17.publish("", (java.lang.Object) objSimpleEvent29);
        java.lang.Class<?> wildcardClass35 = objSimpleEvent29.getClass();
        objSimpleEvent0.publish("hi!", (java.lang.Object) wildcardClass35);
        java.lang.Class<?> wildcardClass37 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent5 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 1);
        boolean boolean6 = objSimpleEvent5.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent5);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        objSimpleEvent9.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean16 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent9.publish("", (java.lang.Object) '#');
        objSimpleEvent0.publish("", (java.lang.Object) "");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent23 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent25 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean26 = objSimpleEvent25.thereIsNoActiveTask();
        boolean boolean27 = objSimpleEvent25.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent29 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean30 = objSimpleEvent29.thereIsNoActiveTask();
        objSimpleEvent25.publish("hi!", (java.lang.Object) boolean30);
        objSimpleEvent23.publish("hi!", (java.lang.Object) objSimpleEvent25);
        boolean boolean33 = objSimpleEvent23.thereIsNoActiveTask();
        boolean boolean34 = objSimpleEvent23.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) boolean34);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent4 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean5 = objSimpleEvent4.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) boolean5);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        objSimpleEvent9.publish("", (java.lang.Object) "hi!");
        boolean boolean16 = objSimpleEvent9.thereIsNoActiveTask();
        boolean boolean17 = objSimpleEvent9.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass18 = objSimpleEvent9.getClass();
        objSimpleEvent0.publish("hi!", (java.lang.Object) wildcardClass18);
        boolean boolean20 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable23 = objSimpleEvent0.subscribe("", objConsumer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        objSimpleEvent0.publish("", (java.lang.Object) 10L);
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        objSimpleEvent0.publish("", obj28);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        java.lang.Object obj8 = null;
        objSimpleEvent0.publish("hi!", obj8);
        boolean boolean10 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>(1);
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent13);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent20 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>(1);
        boolean boolean21 = objSimpleEvent20.thereIsNoActiveTask();
        objSimpleEvent13.publish("", (java.lang.Object) boolean21);
        java.lang.Class<?> wildcardClass23 = objSimpleEvent13.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        io.github.maroodb.simpleevent.core.SimpleEvent<io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>> objSimpleEventSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>>((int) (short) 1);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        boolean boolean24 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean25 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) 1);
        boolean boolean29 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean30 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean31 = objSimpleEvent0.thereIsNoActiveTask();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent4 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) ' ');
        boolean boolean5 = objSimpleEvent4.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass6 = objSimpleEvent4.getClass();
        objSimpleEvent1.publish("hi!", (java.lang.Object) wildcardClass6);
        objSimpleEvent1.publish("hi!", (java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent5 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 1);
        boolean boolean6 = objSimpleEvent5.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent5);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        objSimpleEvent9.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean16 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent9.publish("", (java.lang.Object) '#');
        objSimpleEvent0.publish("", (java.lang.Object) "");
        java.util.function.Consumer<java.lang.Object> objConsumer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable23 = objSimpleEvent0.subscribe("", objConsumer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent5 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj7 = null;
        objSimpleEvent5.publish("hi!", obj7);
        objSimpleEvent5.publish("", (java.lang.Object) "hi!");
        java.lang.Object obj13 = null;
        objSimpleEvent5.publish("hi!", obj13);
        boolean boolean15 = objSimpleEvent5.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent18 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>(1);
        java.lang.Object obj20 = null;
        objSimpleEvent18.publish("hi!", obj20);
        objSimpleEvent5.publish("", (java.lang.Object) objSimpleEvent18);
        objSimpleEvent0.publish("", (java.lang.Object) "");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent26 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) 100);
        boolean boolean27 = objSimpleEvent26.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent26);
        java.lang.Class<?> wildcardClass29 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String> strSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String>(100);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) '#');
        java.lang.Class<?> wildcardClass2 = objSimpleEvent1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        boolean boolean24 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean25 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) 1);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent31 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent34 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) ' ');
        boolean boolean35 = objSimpleEvent34.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass36 = objSimpleEvent34.getClass();
        objSimpleEvent31.publish("hi!", (java.lang.Object) wildcardClass36);
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent31);
        java.lang.Object obj40 = new java.lang.Object();
        objSimpleEvent0.publish("", obj40);
        java.lang.Class<?> wildcardClass42 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean3 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String> strSimpleEvent5 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String>();
        objSimpleEvent0.publish("", (java.lang.Object) strSimpleEvent5);
        java.lang.Class<?> wildcardClass7 = strSimpleEvent5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        boolean boolean15 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean16 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable19 = objSimpleEvent0.subscribe("hi!", objConsumer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) '4');
        boolean boolean2 = objSimpleEvent1.thereIsNoActiveTask();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        java.lang.Class<?> wildcardClass16 = objSimpleEvent12.getClass();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent19 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj21 = null;
        objSimpleEvent19.publish("hi!", obj21);
        objSimpleEvent19.publish("", (java.lang.Object) "hi!");
        boolean boolean26 = objSimpleEvent19.thereIsNoActiveTask();
        objSimpleEvent19.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent31 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj33 = null;
        objSimpleEvent31.publish("hi!", obj33);
        objSimpleEvent31.publish("", (java.lang.Object) "hi!");
        boolean boolean38 = objSimpleEvent31.thereIsNoActiveTask();
        boolean boolean39 = objSimpleEvent31.thereIsNoActiveTask();
        objSimpleEvent31.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent19.publish("hi!", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean45 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent47 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj49 = null;
        objSimpleEvent47.publish("hi!", obj49);
        objSimpleEvent47.publish("", (java.lang.Object) "hi!");
        boolean boolean54 = objSimpleEvent47.thereIsNoActiveTask();
        objSimpleEvent47.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent59 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj61 = null;
        objSimpleEvent59.publish("hi!", obj61);
        java.lang.Class<?> wildcardClass63 = objSimpleEvent59.getClass();
        objSimpleEvent47.publish("", (java.lang.Object) objSimpleEvent59);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent66 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj68 = null;
        objSimpleEvent66.publish("hi!", obj68);
        objSimpleEvent66.publish("", (java.lang.Object) "hi!");
        boolean boolean73 = objSimpleEvent66.thereIsNoActiveTask();
        objSimpleEvent66.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent78 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj80 = null;
        objSimpleEvent78.publish("hi!", obj80);
        objSimpleEvent78.publish("", (java.lang.Object) "hi!");
        boolean boolean85 = objSimpleEvent78.thereIsNoActiveTask();
        boolean boolean86 = objSimpleEvent78.thereIsNoActiveTask();
        objSimpleEvent78.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent66.publish("hi!", (java.lang.Object) "hi!");
        objSimpleEvent47.publish("", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent47);
        objSimpleEvent47.publish("", (java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass96 = objSimpleEvent47.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        java.lang.Class<?> wildcardClass16 = objSimpleEvent12.getClass();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent12);
        java.lang.Object obj19 = null;
        objSimpleEvent12.publish("hi!", obj19);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) '#');
        java.lang.Object obj12 = null;
        objSimpleEvent0.publish("", obj12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent15 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj17 = null;
        objSimpleEvent15.publish("hi!", obj17);
        objSimpleEvent15.publish("", (java.lang.Object) "hi!");
        boolean boolean22 = objSimpleEvent15.thereIsNoActiveTask();
        boolean boolean23 = objSimpleEvent15.thereIsNoActiveTask();
        objSimpleEvent15.publish("hi!", (java.lang.Object) 10);
        boolean boolean27 = objSimpleEvent15.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent15);
        java.lang.Class<?> wildcardClass29 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) '#');
        java.util.function.Consumer<java.lang.Object> objConsumer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable13 = objSimpleEvent0.subscribe("", objConsumer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        objSimpleEvent12.publish("", (java.lang.Object) "hi!");
        boolean boolean19 = objSimpleEvent12.thereIsNoActiveTask();
        boolean boolean20 = objSimpleEvent12.thereIsNoActiveTask();
        objSimpleEvent12.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) "hi!");
        boolean boolean25 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent27 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj29 = null;
        objSimpleEvent27.publish("hi!", obj29);
        objSimpleEvent27.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean34 = objSimpleEvent27.thereIsNoActiveTask();
        objSimpleEvent27.publish("", (java.lang.Object) '#');
        java.lang.Object obj39 = null;
        objSimpleEvent27.publish("", obj39);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent42 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj44 = null;
        objSimpleEvent42.publish("hi!", obj44);
        objSimpleEvent42.publish("", (java.lang.Object) "hi!");
        boolean boolean49 = objSimpleEvent42.thereIsNoActiveTask();
        boolean boolean50 = objSimpleEvent42.thereIsNoActiveTask();
        objSimpleEvent42.publish("hi!", (java.lang.Object) 10);
        boolean boolean54 = objSimpleEvent42.thereIsNoActiveTask();
        objSimpleEvent27.publish("", (java.lang.Object) objSimpleEvent42);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent57 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean58 = objSimpleEvent57.thereIsNoActiveTask();
        boolean boolean59 = objSimpleEvent57.thereIsNoActiveTask();
        objSimpleEvent42.publish("", (java.lang.Object) boolean59);
        java.lang.Class<?> wildcardClass61 = objSimpleEvent42.getClass();
        objSimpleEvent0.publish("hi!", (java.lang.Object) wildcardClass61);
        boolean boolean63 = objSimpleEvent0.thereIsNoActiveTask();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        java.lang.Object obj8 = null;
        objSimpleEvent0.publish("hi!", obj8);
        boolean boolean10 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>(1);
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent13);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent20 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>(1);
        boolean boolean21 = objSimpleEvent20.thereIsNoActiveTask();
        objSimpleEvent13.publish("", (java.lang.Object) boolean21);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent24 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean25 = objSimpleEvent24.thereIsNoActiveTask();
        boolean boolean26 = objSimpleEvent24.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent28 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean29 = objSimpleEvent28.thereIsNoActiveTask();
        objSimpleEvent24.publish("hi!", (java.lang.Object) boolean29);
        java.lang.Class<?> wildcardClass31 = objSimpleEvent24.getClass();
        objSimpleEvent13.publish("", (java.lang.Object) objSimpleEvent24);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) '#');
        java.lang.Object obj12 = null;
        objSimpleEvent0.publish("", obj12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent15 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj17 = null;
        objSimpleEvent15.publish("hi!", obj17);
        objSimpleEvent15.publish("", (java.lang.Object) "hi!");
        boolean boolean22 = objSimpleEvent15.thereIsNoActiveTask();
        boolean boolean23 = objSimpleEvent15.thereIsNoActiveTask();
        objSimpleEvent15.publish("hi!", (java.lang.Object) 10);
        boolean boolean27 = objSimpleEvent15.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent15);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent30 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj32 = null;
        objSimpleEvent30.publish("hi!", obj32);
        objSimpleEvent30.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean37 = objSimpleEvent30.thereIsNoActiveTask();
        objSimpleEvent30.publish("", (java.lang.Object) '#');
        java.lang.Object obj42 = null;
        objSimpleEvent30.publish("", obj42);
        objSimpleEvent0.publish("hi!", (java.lang.Object) "");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.io.Serializable> serializableSimpleEvent46 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.io.Serializable>();
        objSimpleEvent0.publish("hi!", (java.lang.Object) serializableSimpleEvent46);
        java.util.function.Consumer<java.lang.Object> objConsumer49 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable50 = objSimpleEvent0.subscribe("hi!", objConsumer49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        boolean boolean15 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent17 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj19 = null;
        objSimpleEvent17.publish("hi!", obj19);
        objSimpleEvent17.publish("", (java.lang.Object) "hi!");
        boolean boolean24 = objSimpleEvent17.thereIsNoActiveTask();
        objSimpleEvent17.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent29 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj31 = null;
        objSimpleEvent29.publish("hi!", obj31);
        java.lang.Class<?> wildcardClass33 = objSimpleEvent29.getClass();
        objSimpleEvent17.publish("", (java.lang.Object) objSimpleEvent29);
        java.lang.Class<?> wildcardClass35 = objSimpleEvent29.getClass();
        objSimpleEvent0.publish("hi!", (java.lang.Object) wildcardClass35);
        boolean boolean37 = objSimpleEvent0.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass38 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.AnnotatedElement> annotatedElementSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.AnnotatedElement>((int) (short) 1);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        java.lang.Class<?> wildcardClass16 = objSimpleEvent12.getClass();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent19 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj21 = null;
        objSimpleEvent19.publish("hi!", obj21);
        objSimpleEvent19.publish("", (java.lang.Object) "hi!");
        boolean boolean26 = objSimpleEvent19.thereIsNoActiveTask();
        objSimpleEvent19.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent31 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj33 = null;
        objSimpleEvent31.publish("hi!", obj33);
        objSimpleEvent31.publish("", (java.lang.Object) "hi!");
        boolean boolean38 = objSimpleEvent31.thereIsNoActiveTask();
        boolean boolean39 = objSimpleEvent31.thereIsNoActiveTask();
        objSimpleEvent31.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent19.publish("hi!", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean45 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent47 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj49 = null;
        objSimpleEvent47.publish("hi!", obj49);
        objSimpleEvent47.publish("", (java.lang.Object) "hi!");
        boolean boolean54 = objSimpleEvent47.thereIsNoActiveTask();
        objSimpleEvent47.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent59 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj61 = null;
        objSimpleEvent59.publish("hi!", obj61);
        java.lang.Class<?> wildcardClass63 = objSimpleEvent59.getClass();
        objSimpleEvent47.publish("", (java.lang.Object) objSimpleEvent59);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent66 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj68 = null;
        objSimpleEvent66.publish("hi!", obj68);
        objSimpleEvent66.publish("", (java.lang.Object) "hi!");
        boolean boolean73 = objSimpleEvent66.thereIsNoActiveTask();
        objSimpleEvent66.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent78 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj80 = null;
        objSimpleEvent78.publish("hi!", obj80);
        objSimpleEvent78.publish("", (java.lang.Object) "hi!");
        boolean boolean85 = objSimpleEvent78.thereIsNoActiveTask();
        boolean boolean86 = objSimpleEvent78.thereIsNoActiveTask();
        objSimpleEvent78.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent66.publish("hi!", (java.lang.Object) "hi!");
        objSimpleEvent47.publish("", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent47);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.AnnotatedElement> annotatedElementSimpleEvent94 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.AnnotatedElement>();
        objSimpleEvent47.publish("", (java.lang.Object) annotatedElementSimpleEvent94);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) '#');
        java.lang.Object obj12 = null;
        objSimpleEvent0.publish("", obj12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent15 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj17 = null;
        objSimpleEvent15.publish("hi!", obj17);
        objSimpleEvent15.publish("", (java.lang.Object) "hi!");
        boolean boolean22 = objSimpleEvent15.thereIsNoActiveTask();
        boolean boolean23 = objSimpleEvent15.thereIsNoActiveTask();
        objSimpleEvent15.publish("hi!", (java.lang.Object) 10);
        boolean boolean27 = objSimpleEvent15.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent15);
        boolean boolean29 = objSimpleEvent15.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent31 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj33 = null;
        objSimpleEvent31.publish("hi!", obj33);
        objSimpleEvent31.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean38 = objSimpleEvent31.thereIsNoActiveTask();
        objSimpleEvent31.publish("", (java.lang.Object) '#');
        boolean boolean42 = objSimpleEvent31.thereIsNoActiveTask();
        objSimpleEvent15.publish("hi!", (java.lang.Object) boolean42);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent46 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent49 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) ' ');
        boolean boolean50 = objSimpleEvent49.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass51 = objSimpleEvent49.getClass();
        objSimpleEvent46.publish("hi!", (java.lang.Object) wildcardClass51);
        boolean boolean53 = objSimpleEvent46.thereIsNoActiveTask();
        objSimpleEvent15.publish("", (java.lang.Object) boolean53);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) 1);
        boolean boolean2 = objSimpleEvent1.thereIsNoActiveTask();
        boolean boolean3 = objSimpleEvent1.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass4 = objSimpleEvent1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        objSimpleEvent9.publish("", (java.lang.Object) 100);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent20 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent23 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String> strSimpleEvent26 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String>((int) (byte) 1);
        objSimpleEvent23.publish("hi!", (java.lang.Object) strSimpleEvent26);
        objSimpleEvent20.publish("hi!", (java.lang.Object) strSimpleEvent26);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent30 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean31 = objSimpleEvent30.thereIsNoActiveTask();
        boolean boolean32 = objSimpleEvent30.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent35 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 1);
        boolean boolean36 = objSimpleEvent35.thereIsNoActiveTask();
        objSimpleEvent30.publish("", (java.lang.Object) objSimpleEvent35);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent39 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj41 = null;
        objSimpleEvent39.publish("hi!", obj41);
        objSimpleEvent39.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean46 = objSimpleEvent39.thereIsNoActiveTask();
        objSimpleEvent39.publish("", (java.lang.Object) '#');
        objSimpleEvent30.publish("", (java.lang.Object) "");
        boolean boolean51 = objSimpleEvent30.thereIsNoActiveTask();
        objSimpleEvent20.publish("", (java.lang.Object) objSimpleEvent30);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent54 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj56 = null;
        objSimpleEvent54.publish("hi!", obj56);
        objSimpleEvent54.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean61 = objSimpleEvent54.thereIsNoActiveTask();
        objSimpleEvent54.publish("", (java.lang.Object) '#');
        java.lang.Object obj66 = null;
        objSimpleEvent54.publish("", obj66);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.AnnotatedElement> annotatedElementSimpleEvent69 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.AnnotatedElement>();
        java.lang.Class<?> wildcardClass70 = annotatedElementSimpleEvent69.getClass();
        objSimpleEvent54.publish("hi!", (java.lang.Object) wildcardClass70);
        objSimpleEvent20.publish("hi!", (java.lang.Object) wildcardClass70);
        objSimpleEvent9.publish("", (java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent25 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj27 = null;
        objSimpleEvent25.publish("hi!", obj27);
        objSimpleEvent25.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean32 = objSimpleEvent25.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent25);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Comparable<java.lang.String>> strComparableSimpleEvent36 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Comparable<java.lang.String>>((int) (byte) 1);
        objSimpleEvent0.publish("", (java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        objSimpleEvent0.publish("", (java.lang.Object) 10L);
        boolean boolean27 = objSimpleEvent0.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass28 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) 100);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent3 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj5 = null;
        objSimpleEvent3.publish("hi!", obj5);
        objSimpleEvent3.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean10 = objSimpleEvent3.thereIsNoActiveTask();
        objSimpleEvent3.publish("", (java.lang.Object) '#');
        boolean boolean14 = objSimpleEvent3.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent16 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj18 = null;
        objSimpleEvent16.publish("hi!", obj18);
        objSimpleEvent16.publish("", (java.lang.Object) "hi!");
        java.lang.Object obj24 = null;
        objSimpleEvent16.publish("hi!", obj24);
        objSimpleEvent3.publish("", (java.lang.Object) objSimpleEvent16);
        objSimpleEvent1.publish("", (java.lang.Object) "");
        java.util.function.Consumer<java.lang.Object> objConsumer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable30 = objSimpleEvent1.subscribe("", objConsumer29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        io.github.maroodb.simpleevent.core.SimpleEvent<io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>> objSimpleEventSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>>((int) 'a');
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent4 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String> strSimpleEvent7 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String>((int) (byte) 1);
        objSimpleEvent4.publish("hi!", (java.lang.Object) strSimpleEvent7);
        objSimpleEvent1.publish("hi!", (java.lang.Object) strSimpleEvent7);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent11 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean12 = objSimpleEvent11.thereIsNoActiveTask();
        boolean boolean13 = objSimpleEvent11.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent16 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 1);
        boolean boolean17 = objSimpleEvent16.thereIsNoActiveTask();
        objSimpleEvent11.publish("", (java.lang.Object) objSimpleEvent16);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent20 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj22 = null;
        objSimpleEvent20.publish("hi!", obj22);
        objSimpleEvent20.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean27 = objSimpleEvent20.thereIsNoActiveTask();
        objSimpleEvent20.publish("", (java.lang.Object) '#');
        objSimpleEvent11.publish("", (java.lang.Object) "");
        boolean boolean32 = objSimpleEvent11.thereIsNoActiveTask();
        objSimpleEvent1.publish("", (java.lang.Object) objSimpleEvent11);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent36 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) ' ');
        boolean boolean37 = objSimpleEvent36.thereIsNoActiveTask();
        objSimpleEvent11.publish("hi!", (java.lang.Object) objSimpleEvent36);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean3 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent5 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj7 = null;
        objSimpleEvent5.publish("hi!", obj7);
        objSimpleEvent5.publish("", (java.lang.Object) "hi!");
        boolean boolean12 = objSimpleEvent5.thereIsNoActiveTask();
        objSimpleEvent5.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent17 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj19 = null;
        objSimpleEvent17.publish("hi!", obj19);
        java.lang.Class<?> wildcardClass21 = objSimpleEvent17.getClass();
        objSimpleEvent5.publish("", (java.lang.Object) objSimpleEvent17);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent5);
        boolean boolean24 = objSimpleEvent0.thereIsNoActiveTask();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        java.lang.Object obj8 = null;
        objSimpleEvent0.publish("hi!", obj8);
        boolean boolean10 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean11 = objSimpleEvent0.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass12 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        objSimpleEvent12.publish("", (java.lang.Object) "hi!");
        boolean boolean19 = objSimpleEvent12.thereIsNoActiveTask();
        boolean boolean20 = objSimpleEvent12.thereIsNoActiveTask();
        objSimpleEvent12.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) "hi!");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent26 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean27 = objSimpleEvent26.thereIsNoActiveTask();
        boolean boolean28 = objSimpleEvent26.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent30 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean31 = objSimpleEvent30.thereIsNoActiveTask();
        objSimpleEvent26.publish("hi!", (java.lang.Object) boolean31);
        boolean boolean33 = objSimpleEvent26.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent35 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj37 = null;
        objSimpleEvent35.publish("hi!", obj37);
        objSimpleEvent35.publish("", (java.lang.Object) "hi!");
        boolean boolean42 = objSimpleEvent35.thereIsNoActiveTask();
        boolean boolean43 = objSimpleEvent35.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass44 = objSimpleEvent35.getClass();
        objSimpleEvent26.publish("hi!", (java.lang.Object) wildcardClass44);
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent26);
        objSimpleEvent26.publish("", (java.lang.Object) (short) -1);
        java.util.function.Consumer<java.lang.Object> objConsumer51 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable52 = objSimpleEvent26.subscribe("", objConsumer51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) 1);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent6 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj8 = null;
        objSimpleEvent6.publish("hi!", obj8);
        objSimpleEvent6.publish("", (java.lang.Object) "hi!");
        boolean boolean13 = objSimpleEvent6.thereIsNoActiveTask();
        objSimpleEvent6.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent18 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj20 = null;
        objSimpleEvent18.publish("hi!", obj20);
        objSimpleEvent18.publish("", (java.lang.Object) "hi!");
        boolean boolean25 = objSimpleEvent18.thereIsNoActiveTask();
        boolean boolean26 = objSimpleEvent18.thereIsNoActiveTask();
        objSimpleEvent18.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent6.publish("hi!", (java.lang.Object) "hi!");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent32 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean33 = objSimpleEvent32.thereIsNoActiveTask();
        boolean boolean34 = objSimpleEvent32.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent36 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean37 = objSimpleEvent36.thereIsNoActiveTask();
        objSimpleEvent32.publish("hi!", (java.lang.Object) boolean37);
        boolean boolean39 = objSimpleEvent32.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent41 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj43 = null;
        objSimpleEvent41.publish("hi!", obj43);
        objSimpleEvent41.publish("", (java.lang.Object) "hi!");
        boolean boolean48 = objSimpleEvent41.thereIsNoActiveTask();
        boolean boolean49 = objSimpleEvent41.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass50 = objSimpleEvent41.getClass();
        objSimpleEvent32.publish("hi!", (java.lang.Object) wildcardClass50);
        objSimpleEvent6.publish("", (java.lang.Object) objSimpleEvent32);
        boolean boolean53 = objSimpleEvent6.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) boolean53);
        java.lang.Class<?> wildcardClass55 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.CharSequence> charSequenceSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass1 = charSequenceSimpleEvent0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent5 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>(100);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent8 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent11 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String> strSimpleEvent14 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String>((int) (byte) 1);
        objSimpleEvent11.publish("hi!", (java.lang.Object) strSimpleEvent14);
        objSimpleEvent8.publish("hi!", (java.lang.Object) strSimpleEvent14);
        objSimpleEvent5.publish("", (java.lang.Object) objSimpleEvent8);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent8);
        boolean boolean19 = objSimpleEvent8.thereIsNoActiveTask();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.GenericDeclaration> genericDeclarationSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.GenericDeclaration>((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = genericDeclarationSimpleEvent1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent5 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 1);
        boolean boolean6 = objSimpleEvent5.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent5);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        objSimpleEvent9.publish("", (java.lang.Object) "hi!");
        boolean boolean16 = objSimpleEvent9.thereIsNoActiveTask();
        boolean boolean17 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent9.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent22 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj24 = null;
        objSimpleEvent22.publish("hi!", obj24);
        objSimpleEvent22.publish("", (java.lang.Object) "hi!");
        objSimpleEvent22.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent9.publish("hi!", (java.lang.Object) objSimpleEvent22);
        boolean boolean33 = objSimpleEvent9.thereIsNoActiveTask();
        boolean boolean34 = objSimpleEvent9.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass35 = objSimpleEvent9.getClass();
        objSimpleEvent0.publish("", (java.lang.Object) wildcardClass35);
        boolean boolean37 = objSimpleEvent0.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass38 = objSimpleEvent0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        boolean boolean15 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean16 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) true);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent22 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 100);
        objSimpleEvent0.publish("", (java.lang.Object) (byte) 100);
        boolean boolean24 = objSimpleEvent0.thereIsNoActiveTask();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) 1);
        boolean boolean2 = objSimpleEvent1.thereIsNoActiveTask();
        boolean boolean3 = objSimpleEvent1.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent5 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean6 = objSimpleEvent5.thereIsNoActiveTask();
        boolean boolean7 = objSimpleEvent5.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean10 = objSimpleEvent9.thereIsNoActiveTask();
        boolean boolean11 = objSimpleEvent9.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean14 = objSimpleEvent13.thereIsNoActiveTask();
        objSimpleEvent9.publish("hi!", (java.lang.Object) boolean14);
        boolean boolean16 = objSimpleEvent9.thereIsNoActiveTask();
        boolean boolean17 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent5.publish("", (java.lang.Object) boolean17);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.AnnotatedElement> annotatedElementSimpleEvent21 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.AnnotatedElement>(1);
        objSimpleEvent5.publish("hi!", (java.lang.Object) annotatedElementSimpleEvent21);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent24 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj26 = null;
        objSimpleEvent24.publish("hi!", obj26);
        objSimpleEvent5.publish("", (java.lang.Object) objSimpleEvent24);
        objSimpleEvent1.publish("", (java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("", (java.lang.Object) (short) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.AnnotatedElement> annotatedElementSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.AnnotatedElement>(1);
        objSimpleEvent0.publish("hi!", (java.lang.Object) 1);
        java.util.function.Consumer<java.lang.Object> objConsumer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable16 = objSimpleEvent0.subscribe("hi!", objConsumer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>(1);
        java.lang.Object obj3 = null;
        objSimpleEvent1.publish("hi!", obj3);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent7 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 1);
        objSimpleEvent1.publish("hi!", (java.lang.Object) (byte) 1);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent11 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) 1);
        objSimpleEvent1.publish("", (java.lang.Object) objSimpleEvent11);
        java.util.function.Consumer<java.lang.Object> objConsumer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable15 = objSimpleEvent1.subscribe("hi!", objConsumer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) '#');
        java.lang.Object obj12 = null;
        objSimpleEvent0.publish("", obj12);
        boolean boolean14 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean15 = objSimpleEvent0.thereIsNoActiveTask();
        java.lang.Object obj17 = null;
        objSimpleEvent0.publish("hi!", obj17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        objSimpleEvent9.publish("", (java.lang.Object) 100);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent19 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj21 = null;
        objSimpleEvent19.publish("hi!", obj21);
        objSimpleEvent19.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean26 = objSimpleEvent19.thereIsNoActiveTask();
        objSimpleEvent19.publish("", (java.lang.Object) '#');
        java.lang.Object obj31 = null;
        objSimpleEvent19.publish("", obj31);
        boolean boolean33 = objSimpleEvent19.thereIsNoActiveTask();
        boolean boolean34 = objSimpleEvent19.thereIsNoActiveTask();
        objSimpleEvent9.publish("", (java.lang.Object) objSimpleEvent19);
        boolean boolean36 = objSimpleEvent9.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer38 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable39 = objSimpleEvent9.subscribe("hi!", objConsumer38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 10);
        java.util.function.Consumer<java.lang.Object> objConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable4 = objSimpleEvent1.subscribe("", objConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) '#');
        java.lang.Object obj12 = null;
        objSimpleEvent0.publish("", obj12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent15 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj17 = null;
        objSimpleEvent15.publish("hi!", obj17);
        objSimpleEvent15.publish("", (java.lang.Object) "hi!");
        boolean boolean22 = objSimpleEvent15.thereIsNoActiveTask();
        boolean boolean23 = objSimpleEvent15.thereIsNoActiveTask();
        objSimpleEvent15.publish("hi!", (java.lang.Object) 10);
        boolean boolean27 = objSimpleEvent15.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent15);
        boolean boolean29 = objSimpleEvent15.thereIsNoActiveTask();
        boolean boolean30 = objSimpleEvent15.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent32 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj34 = null;
        objSimpleEvent32.publish("hi!", obj34);
        objSimpleEvent32.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean39 = objSimpleEvent32.thereIsNoActiveTask();
        objSimpleEvent32.publish("", (java.lang.Object) '#');
        boolean boolean43 = objSimpleEvent32.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent45 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj47 = null;
        objSimpleEvent45.publish("hi!", obj47);
        objSimpleEvent45.publish("", (java.lang.Object) "hi!");
        boolean boolean52 = objSimpleEvent45.thereIsNoActiveTask();
        boolean boolean53 = objSimpleEvent45.thereIsNoActiveTask();
        objSimpleEvent45.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent58 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj60 = null;
        objSimpleEvent58.publish("hi!", obj60);
        objSimpleEvent58.publish("", (java.lang.Object) "hi!");
        objSimpleEvent58.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent45.publish("hi!", (java.lang.Object) objSimpleEvent58);
        boolean boolean69 = objSimpleEvent45.thereIsNoActiveTask();
        boolean boolean70 = objSimpleEvent45.thereIsNoActiveTask();
        objSimpleEvent45.publish("", (java.lang.Object) 1);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent75 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean76 = objSimpleEvent75.thereIsNoActiveTask();
        objSimpleEvent75.publish("", (java.lang.Object) 1);
        objSimpleEvent45.publish("hi!", (java.lang.Object) objSimpleEvent75);
        objSimpleEvent32.publish("hi!", (java.lang.Object) objSimpleEvent75);
        objSimpleEvent15.publish("", (java.lang.Object) objSimpleEvent32);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent4 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String> strSimpleEvent7 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String>((int) (byte) 1);
        objSimpleEvent4.publish("hi!", (java.lang.Object) strSimpleEvent7);
        objSimpleEvent1.publish("hi!", (java.lang.Object) strSimpleEvent7);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String> strSimpleEvent15 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String>((int) (byte) 1);
        objSimpleEvent12.publish("hi!", (java.lang.Object) strSimpleEvent15);
        boolean boolean17 = objSimpleEvent12.thereIsNoActiveTask();
        boolean boolean18 = objSimpleEvent12.thereIsNoActiveTask();
        objSimpleEvent1.publish("hi!", (java.lang.Object) boolean18);
        boolean boolean20 = objSimpleEvent1.thereIsNoActiveTask();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>> wildcardClassSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>>(100);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent16 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj18 = null;
        objSimpleEvent16.publish("hi!", obj18);
        objSimpleEvent16.publish("", (java.lang.Object) "hi!");
        boolean boolean23 = objSimpleEvent16.thereIsNoActiveTask();
        objSimpleEvent16.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent28 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj30 = null;
        objSimpleEvent28.publish("hi!", obj30);
        java.lang.Class<?> wildcardClass32 = objSimpleEvent28.getClass();
        objSimpleEvent16.publish("", (java.lang.Object) objSimpleEvent28);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent35 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj37 = null;
        objSimpleEvent35.publish("hi!", obj37);
        objSimpleEvent35.publish("", (java.lang.Object) "hi!");
        boolean boolean42 = objSimpleEvent35.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent44 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj46 = null;
        objSimpleEvent44.publish("hi!", obj46);
        boolean boolean48 = objSimpleEvent44.thereIsNoActiveTask();
        objSimpleEvent35.publish("", (java.lang.Object) objSimpleEvent44);
        boolean boolean50 = objSimpleEvent35.thereIsNoActiveTask();
        boolean boolean51 = objSimpleEvent35.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.CharSequence> charSequenceSimpleEvent54 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.CharSequence>((int) (byte) 100);
        objSimpleEvent35.publish("hi!", (java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass56 = objSimpleEvent35.getClass();
        objSimpleEvent16.publish("", (java.lang.Object) wildcardClass56);
        objSimpleEvent9.publish("", (java.lang.Object) wildcardClass56);
        boolean boolean59 = objSimpleEvent9.thereIsNoActiveTask();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        java.util.function.Consumer<java.lang.Object> objConsumer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable17 = objSimpleEvent9.subscribe("", objConsumer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent3 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj5 = null;
        objSimpleEvent3.publish("hi!", obj5);
        objSimpleEvent3.publish("", (java.lang.Object) "hi!");
        objSimpleEvent3.publish("", (java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass13 = objSimpleEvent3.getClass();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent3);
        java.util.function.Consumer<java.lang.Object> objConsumer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable17 = objSimpleEvent3.subscribe("hi!", objConsumer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        java.lang.Class<?> wildcardClass16 = objSimpleEvent12.getClass();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent19 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj21 = null;
        objSimpleEvent19.publish("hi!", obj21);
        objSimpleEvent19.publish("", (java.lang.Object) "hi!");
        boolean boolean26 = objSimpleEvent19.thereIsNoActiveTask();
        objSimpleEvent19.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent31 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj33 = null;
        objSimpleEvent31.publish("hi!", obj33);
        objSimpleEvent31.publish("", (java.lang.Object) "hi!");
        boolean boolean38 = objSimpleEvent31.thereIsNoActiveTask();
        boolean boolean39 = objSimpleEvent31.thereIsNoActiveTask();
        objSimpleEvent31.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent19.publish("hi!", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean45 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent47 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj49 = null;
        objSimpleEvent47.publish("hi!", obj49);
        objSimpleEvent47.publish("", (java.lang.Object) "hi!");
        boolean boolean54 = objSimpleEvent47.thereIsNoActiveTask();
        objSimpleEvent47.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent59 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj61 = null;
        objSimpleEvent59.publish("hi!", obj61);
        java.lang.Class<?> wildcardClass63 = objSimpleEvent59.getClass();
        objSimpleEvent47.publish("", (java.lang.Object) objSimpleEvent59);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent66 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj68 = null;
        objSimpleEvent66.publish("hi!", obj68);
        objSimpleEvent66.publish("", (java.lang.Object) "hi!");
        boolean boolean73 = objSimpleEvent66.thereIsNoActiveTask();
        objSimpleEvent66.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent78 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj80 = null;
        objSimpleEvent78.publish("hi!", obj80);
        objSimpleEvent78.publish("", (java.lang.Object) "hi!");
        boolean boolean85 = objSimpleEvent78.thereIsNoActiveTask();
        boolean boolean86 = objSimpleEvent78.thereIsNoActiveTask();
        objSimpleEvent78.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent66.publish("hi!", (java.lang.Object) "hi!");
        objSimpleEvent47.publish("", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent47);
        boolean boolean93 = objSimpleEvent0.thereIsNoActiveTask();
        java.util.function.Consumer<java.lang.Object> objConsumer95 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable96 = objSimpleEvent0.subscribe("hi!", objConsumer95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) ' ');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.GenericDeclaration> genericDeclarationSimpleEvent4 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.GenericDeclaration>(1);
        java.lang.Class<?> wildcardClass5 = genericDeclarationSimpleEvent4.getClass();
        objSimpleEvent1.publish("hi!", (java.lang.Object) genericDeclarationSimpleEvent4);
        boolean boolean7 = objSimpleEvent1.thereIsNoActiveTask();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.Type> typeSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.Type>((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = typeSimpleEvent1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        boolean boolean24 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean25 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) 1);
        java.util.function.Consumer<java.lang.Object> objConsumer30 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable31 = objSimpleEvent0.subscribe("", objConsumer30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>(1);
        java.lang.Object obj3 = null;
        objSimpleEvent1.publish("hi!", obj3);
        boolean boolean5 = objSimpleEvent1.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass6 = objSimpleEvent1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String> strSimpleEvent4 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.String>((int) (byte) 1);
        objSimpleEvent1.publish("hi!", (java.lang.Object) strSimpleEvent4);
        boolean boolean6 = objSimpleEvent1.thereIsNoActiveTask();
        boolean boolean7 = objSimpleEvent1.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass8 = objSimpleEvent1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        boolean boolean24 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean25 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) 1);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent30 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean31 = objSimpleEvent30.thereIsNoActiveTask();
        objSimpleEvent30.publish("", (java.lang.Object) 1);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent30);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent37 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj39 = null;
        objSimpleEvent37.publish("hi!", obj39);
        objSimpleEvent37.publish("", (java.lang.Object) "hi!");
        boolean boolean44 = objSimpleEvent37.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) boolean44);
        boolean boolean46 = objSimpleEvent0.thereIsNoActiveTask();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) 1);
        boolean boolean2 = objSimpleEvent1.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent4 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj6 = null;
        objSimpleEvent4.publish("hi!", obj6);
        objSimpleEvent4.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean11 = objSimpleEvent4.thereIsNoActiveTask();
        objSimpleEvent4.publish("", (java.lang.Object) '#');
        java.lang.Object obj16 = null;
        objSimpleEvent4.publish("", obj16);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent19 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj21 = null;
        objSimpleEvent19.publish("hi!", obj21);
        objSimpleEvent19.publish("", (java.lang.Object) "hi!");
        boolean boolean26 = objSimpleEvent19.thereIsNoActiveTask();
        boolean boolean27 = objSimpleEvent19.thereIsNoActiveTask();
        objSimpleEvent19.publish("hi!", (java.lang.Object) 10);
        boolean boolean31 = objSimpleEvent19.thereIsNoActiveTask();
        objSimpleEvent4.publish("", (java.lang.Object) objSimpleEvent19);
        boolean boolean33 = objSimpleEvent19.thereIsNoActiveTask();
        objSimpleEvent1.publish("", (java.lang.Object) objSimpleEvent19);
        boolean boolean35 = objSimpleEvent19.thereIsNoActiveTask();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>> wildcardClassSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Class<?>>(1);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        boolean boolean24 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean25 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean26 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent28 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj30 = null;
        objSimpleEvent28.publish("hi!", obj30);
        objSimpleEvent28.publish("", (java.lang.Object) "hi!");
        boolean boolean35 = objSimpleEvent28.thereIsNoActiveTask();
        boolean boolean36 = objSimpleEvent28.thereIsNoActiveTask();
        objSimpleEvent28.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent41 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj43 = null;
        objSimpleEvent41.publish("hi!", obj43);
        objSimpleEvent41.publish("", (java.lang.Object) "hi!");
        objSimpleEvent41.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent28.publish("hi!", (java.lang.Object) objSimpleEvent41);
        boolean boolean52 = objSimpleEvent28.thereIsNoActiveTask();
        boolean boolean53 = objSimpleEvent28.thereIsNoActiveTask();
        objSimpleEvent28.publish("", (java.lang.Object) 1);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent59 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent62 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) ' ');
        boolean boolean63 = objSimpleEvent62.thereIsNoActiveTask();
        java.lang.Class<?> wildcardClass64 = objSimpleEvent62.getClass();
        objSimpleEvent59.publish("hi!", (java.lang.Object) wildcardClass64);
        objSimpleEvent28.publish("", (java.lang.Object) objSimpleEvent59);
        java.lang.Object obj68 = new java.lang.Object();
        objSimpleEvent28.publish("", obj68);
        objSimpleEvent0.publish("hi!", obj68);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent5 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj7 = null;
        objSimpleEvent5.publish("hi!", obj7);
        objSimpleEvent5.publish("", (java.lang.Object) "hi!");
        java.lang.Object obj13 = null;
        objSimpleEvent5.publish("hi!", obj13);
        boolean boolean15 = objSimpleEvent5.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent18 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>(1);
        java.lang.Object obj20 = null;
        objSimpleEvent18.publish("hi!", obj20);
        objSimpleEvent5.publish("", (java.lang.Object) objSimpleEvent18);
        objSimpleEvent0.publish("", (java.lang.Object) "");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent26 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) 100);
        boolean boolean27 = objSimpleEvent26.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent26);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent30 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean31 = objSimpleEvent30.thereIsNoActiveTask();
        boolean boolean32 = objSimpleEvent30.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent34 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean35 = objSimpleEvent34.thereIsNoActiveTask();
        boolean boolean36 = objSimpleEvent34.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent38 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean39 = objSimpleEvent38.thereIsNoActiveTask();
        objSimpleEvent34.publish("hi!", (java.lang.Object) boolean39);
        boolean boolean41 = objSimpleEvent34.thereIsNoActiveTask();
        boolean boolean42 = objSimpleEvent34.thereIsNoActiveTask();
        objSimpleEvent30.publish("", (java.lang.Object) boolean42);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.AnnotatedElement> annotatedElementSimpleEvent46 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.AnnotatedElement>(1);
        objSimpleEvent30.publish("hi!", (java.lang.Object) annotatedElementSimpleEvent46);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent49 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj51 = null;
        objSimpleEvent49.publish("hi!", obj51);
        objSimpleEvent30.publish("", (java.lang.Object) objSimpleEvent49);
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent30);
        java.util.function.Consumer<java.lang.Object> objConsumer56 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.maroodb.simpleevent.core.Observable<java.lang.Object> objObservable57 = objSimpleEvent30.subscribe("", objConsumer56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        boolean boolean15 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent17 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj19 = null;
        objSimpleEvent17.publish("hi!", obj19);
        objSimpleEvent17.publish("", (java.lang.Object) "hi!");
        boolean boolean24 = objSimpleEvent17.thereIsNoActiveTask();
        objSimpleEvent17.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent29 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj31 = null;
        objSimpleEvent29.publish("hi!", obj31);
        java.lang.Class<?> wildcardClass33 = objSimpleEvent29.getClass();
        objSimpleEvent17.publish("", (java.lang.Object) objSimpleEvent29);
        java.lang.Class<?> wildcardClass35 = objSimpleEvent29.getClass();
        objSimpleEvent0.publish("hi!", (java.lang.Object) wildcardClass35);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent38 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj40 = null;
        objSimpleEvent38.publish("hi!", obj40);
        boolean boolean42 = objSimpleEvent38.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) boolean42);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent45 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj47 = null;
        objSimpleEvent45.publish("hi!", obj47);
        objSimpleEvent45.publish("", (java.lang.Object) "hi!");
        boolean boolean52 = objSimpleEvent45.thereIsNoActiveTask();
        boolean boolean53 = objSimpleEvent45.thereIsNoActiveTask();
        objSimpleEvent45.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent45);
        boolean boolean58 = objSimpleEvent45.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent60 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj62 = null;
        objSimpleEvent60.publish("hi!", obj62);
        objSimpleEvent60.publish("hi!", (java.lang.Object) 1.0d);
        boolean boolean67 = objSimpleEvent60.thereIsNoActiveTask();
        objSimpleEvent60.publish("", (java.lang.Object) '#');
        boolean boolean71 = objSimpleEvent60.thereIsNoActiveTask();
        boolean boolean72 = objSimpleEvent60.thereIsNoActiveTask();
        objSimpleEvent45.publish("", (java.lang.Object) objSimpleEvent60);
        java.lang.Class<?> wildcardClass74 = objSimpleEvent45.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent12 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj14 = null;
        objSimpleEvent12.publish("hi!", obj14);
        java.lang.Class<?> wildcardClass16 = objSimpleEvent12.getClass();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent12);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent19 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj21 = null;
        objSimpleEvent19.publish("hi!", obj21);
        objSimpleEvent19.publish("", (java.lang.Object) "hi!");
        boolean boolean26 = objSimpleEvent19.thereIsNoActiveTask();
        objSimpleEvent19.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent31 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj33 = null;
        objSimpleEvent31.publish("hi!", obj33);
        objSimpleEvent31.publish("", (java.lang.Object) "hi!");
        boolean boolean38 = objSimpleEvent31.thereIsNoActiveTask();
        boolean boolean39 = objSimpleEvent31.thereIsNoActiveTask();
        objSimpleEvent31.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent19.publish("hi!", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean45 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent47 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj49 = null;
        objSimpleEvent47.publish("hi!", obj49);
        objSimpleEvent47.publish("", (java.lang.Object) "hi!");
        boolean boolean54 = objSimpleEvent47.thereIsNoActiveTask();
        objSimpleEvent47.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent59 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj61 = null;
        objSimpleEvent59.publish("hi!", obj61);
        java.lang.Class<?> wildcardClass63 = objSimpleEvent59.getClass();
        objSimpleEvent47.publish("", (java.lang.Object) objSimpleEvent59);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent66 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj68 = null;
        objSimpleEvent66.publish("hi!", obj68);
        objSimpleEvent66.publish("", (java.lang.Object) "hi!");
        boolean boolean73 = objSimpleEvent66.thereIsNoActiveTask();
        objSimpleEvent66.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent78 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj80 = null;
        objSimpleEvent78.publish("hi!", obj80);
        objSimpleEvent78.publish("", (java.lang.Object) "hi!");
        boolean boolean85 = objSimpleEvent78.thereIsNoActiveTask();
        boolean boolean86 = objSimpleEvent78.thereIsNoActiveTask();
        objSimpleEvent78.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent66.publish("hi!", (java.lang.Object) "hi!");
        objSimpleEvent47.publish("", (java.lang.Object) "hi!");
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent47);
        java.lang.Class<?> wildcardClass93 = objSimpleEvent47.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (byte) 100);
        boolean boolean2 = objSimpleEvent1.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.AnnotatedElement> annotatedElementSimpleEvent5 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.reflect.AnnotatedElement>(100);
        objSimpleEvent1.publish("hi!", (java.lang.Object) annotatedElementSimpleEvent5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent1 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) 1);
        boolean boolean2 = objSimpleEvent1.thereIsNoActiveTask();
        boolean boolean3 = objSimpleEvent1.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent5 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj7 = null;
        objSimpleEvent5.publish("hi!", obj7);
        objSimpleEvent5.publish("", (java.lang.Object) "hi!");
        boolean boolean12 = objSimpleEvent5.thereIsNoActiveTask();
        boolean boolean13 = objSimpleEvent5.thereIsNoActiveTask();
        objSimpleEvent5.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent18 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj20 = null;
        objSimpleEvent18.publish("hi!", obj20);
        objSimpleEvent18.publish("", (java.lang.Object) "hi!");
        objSimpleEvent18.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent5.publish("hi!", (java.lang.Object) objSimpleEvent18);
        boolean boolean29 = objSimpleEvent5.thereIsNoActiveTask();
        boolean boolean30 = objSimpleEvent5.thereIsNoActiveTask();
        objSimpleEvent5.publish("", (java.lang.Object) 1);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent35 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean36 = objSimpleEvent35.thereIsNoActiveTask();
        objSimpleEvent35.publish("", (java.lang.Object) 1);
        objSimpleEvent5.publish("hi!", (java.lang.Object) objSimpleEvent35);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent42 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj44 = null;
        objSimpleEvent42.publish("hi!", obj44);
        objSimpleEvent42.publish("", (java.lang.Object) "hi!");
        boolean boolean49 = objSimpleEvent42.thereIsNoActiveTask();
        objSimpleEvent5.publish("hi!", (java.lang.Object) boolean49);
        java.lang.Class<?> wildcardClass51 = objSimpleEvent5.getClass();
        objSimpleEvent1.publish("", (java.lang.Object) objSimpleEvent5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean8 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) 10);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent13 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj15 = null;
        objSimpleEvent13.publish("hi!", obj15);
        objSimpleEvent13.publish("", (java.lang.Object) "hi!");
        objSimpleEvent13.publish("", (java.lang.Object) (short) 10);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent13);
        boolean boolean24 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean25 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) 1);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent30 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean31 = objSimpleEvent30.thereIsNoActiveTask();
        objSimpleEvent30.publish("", (java.lang.Object) 1);
        objSimpleEvent0.publish("hi!", (java.lang.Object) objSimpleEvent30);
        java.lang.Class<?> wildcardClass36 = objSimpleEvent30.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean1 = objSimpleEvent0.thereIsNoActiveTask();
        boolean boolean2 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent4 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        boolean boolean5 = objSimpleEvent4.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) boolean5);
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        boolean boolean7 = objSimpleEvent0.thereIsNoActiveTask();
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent9 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj11 = null;
        objSimpleEvent9.publish("hi!", obj11);
        boolean boolean13 = objSimpleEvent9.thereIsNoActiveTask();
        objSimpleEvent0.publish("", (java.lang.Object) objSimpleEvent9);
        objSimpleEvent0.publish("", (java.lang.Object) '#');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent20 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>((int) (short) 100);
        boolean boolean21 = objSimpleEvent20.thereIsNoActiveTask();
        objSimpleEvent0.publish("hi!", (java.lang.Object) boolean21);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent24 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj26 = null;
        objSimpleEvent24.publish("hi!", obj26);
        objSimpleEvent24.publish("", (java.lang.Object) "hi!");
        boolean boolean31 = objSimpleEvent24.thereIsNoActiveTask();
        objSimpleEvent24.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent36 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj38 = null;
        objSimpleEvent36.publish("hi!", obj38);
        java.lang.Class<?> wildcardClass40 = objSimpleEvent36.getClass();
        objSimpleEvent24.publish("", (java.lang.Object) objSimpleEvent36);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent43 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj45 = null;
        objSimpleEvent43.publish("hi!", obj45);
        objSimpleEvent43.publish("", (java.lang.Object) "hi!");
        boolean boolean50 = objSimpleEvent43.thereIsNoActiveTask();
        objSimpleEvent43.publish("hi!", (java.lang.Object) '4');
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent55 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj57 = null;
        objSimpleEvent55.publish("hi!", obj57);
        objSimpleEvent55.publish("", (java.lang.Object) "hi!");
        boolean boolean62 = objSimpleEvent55.thereIsNoActiveTask();
        boolean boolean63 = objSimpleEvent55.thereIsNoActiveTask();
        objSimpleEvent55.publish("hi!", (java.lang.Object) 10);
        objSimpleEvent43.publish("hi!", (java.lang.Object) "hi!");
        objSimpleEvent24.publish("", (java.lang.Object) "hi!");
        objSimpleEvent24.publish("hi!", (java.lang.Object) 10L);
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.CharSequence> charSequenceSimpleEvent73 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.CharSequence>();
        objSimpleEvent24.publish("", (java.lang.Object) charSequenceSimpleEvent73);
        objSimpleEvent0.publish("", (java.lang.Object) charSequenceSimpleEvent73);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object> objSimpleEvent0 = new io.github.maroodb.simpleevent.core.SimpleEvent<java.lang.Object>();
        java.lang.Object obj2 = null;
        objSimpleEvent0.publish("hi!", obj2);
        objSimpleEvent0.publish("", (java.lang.Object) "hi!");
        java.lang.Object obj8 = null;
        objSimpleEvent0.publish("hi!", obj8);
        java.lang.Class<?> wildcardClass10 = objSimpleEvent0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}

