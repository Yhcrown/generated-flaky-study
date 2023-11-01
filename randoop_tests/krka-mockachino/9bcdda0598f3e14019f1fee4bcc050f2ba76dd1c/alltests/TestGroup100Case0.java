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
        java.lang.Throwable throwable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.stub.exception.ThrowAnswer throwAnswer1 = new se.mockachino.stub.exception.ThrowAnswer(throwable0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        float float0 = se.mockachino.matchers.Matchers.anyFloat();
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        se.mockachino.util.MockachinoMethod mockachinoMethod0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall2 = new se.mockachino.MethodCall(mockachinoMethod0, objArray1);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher3 = se.mockachino.matchers.MatchersBase.mEq(methodCall2);
        se.mockachino.util.MockachinoMethod mockachinoMethod4 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall6 = new se.mockachino.MethodCall(mockachinoMethod4, objArray5);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher7 = se.mockachino.matchers.MatchersBase.mEq(methodCall6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = methodCall2.equals(methodCall6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        se.mockachino.matchers.matcher.Matcher<java.lang.Boolean> booleanMatcher0 = se.mockachino.matchers.MatchersBase.mAnyBoolean();
        org.junit.Assert.assertNotNull(booleanMatcher0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        se.mockachino.order.MockPoint mockPoint0 = null;
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.order.BetweenVerifyContext betweenVerifyContext1 = se.mockachino.Mockachino.before(mockPoint0);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: end can not be null");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        se.mockachino.alias.SimpleAlias simpleAlias0 = se.mockachino.Mockachino.newAlias();
        // The following exception was thrown during execution in test generation
        try {
            simpleAlias0.verify((int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleAlias0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        se.mockachino.alias.SimpleAlias simpleAlias0 = se.mockachino.Mockachino.newAlias();
        // The following exception was thrown during execution in test generation
        try {
            simpleAlias0.verifyOnce();
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleAlias0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        se.mockachino.CallHandler callHandler0 = null;
        se.mockachino.MockData<java.lang.RuntimeException> runtimeExceptionMockData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.mock.MockHandler<java.lang.RuntimeException> runtimeExceptionMockHandler4 = new se.mockachino.mock.MockHandler<java.lang.RuntimeException>(callHandler0, runtimeExceptionMockData1, false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        double double0 = se.mockachino.matchers.Matchers.anyDouble();
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        se.mockachino.matchers.matcher.ClassMatcher<java.lang.Character> charClassMatcher0 = se.mockachino.matchers.matcher.ClassMatcher.anyChar();
        org.junit.Assert.assertNotNull(charClassMatcher0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        java.lang.reflect.Type type0 = null;
        java.lang.reflect.Method method1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type2 = se.mockachino.util.MockachinoMethod.getReturnType(type0, method1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        se.mockachino.order.MockPoint mockPoint0 = null;
        se.mockachino.order.MockPoint mockPoint1 = null;
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.order.BetweenVerifyContext betweenVerifyContext2 = se.mockachino.Mockachino.between(mockPoint0, mockPoint1);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: start can not be null");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.lang.Class<java.lang.String> strClass0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        se.mockachino.matchers.matcher.ClassMatcher<java.lang.String> strClassMatcher2 = new se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>(strClass0, classArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = strClassMatcher2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.lang.reflect.Type type0 = null;
        se.mockachino.MockSettings mockSettings2 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler3 = mockSettings2.getFallback();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = se.mockachino.Mockachino.mockType(type0, mockSettings2);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: type can not be null");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockSettings2);
        org.junit.Assert.assertNotNull(callHandler3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        byte byte0 = se.mockachino.matchers.Matchers.anyByte();
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 0 + "'", byte0 == (byte) 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        java.lang.Class<java.lang.String> strClass0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        se.mockachino.matchers.matcher.ClassMatcher<java.lang.String> strClassMatcher2 = new se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>(strClass0, classArray1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = strClassMatcher2.matches("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        se.mockachino.matchers.MatcherThreadHandler matcherThreadHandler0 = new se.mockachino.matchers.MatcherThreadHandler();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.lang.Class<java.lang.String> strClass0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        se.mockachino.matchers.matcher.ClassMatcher<java.lang.String> strClassMatcher2 = new se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>(strClass0, classArray1);
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.mock.WhenStubber<java.lang.Class[]> classArrayWhenStubber3 = se.mockachino.Mockachino.when(classArray1);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Illegal when(X).thenReturn(..) expression. X needs to be on the form mock.method(...)");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.util.MockachinoMethod mockachinoMethod2 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall4 = new se.mockachino.MethodCall(mockachinoMethod2, objArray3);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher5 = se.mockachino.matchers.MatchersBase.mEq(methodCall4);
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher6 = verifyRangeStart1.on(methodCallMatcher5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        se.mockachino.matchers.matcher.Matcher<java.lang.Float> floatMatcher0 = se.mockachino.matchers.MatchersBase.mAnyFloat();
        org.junit.Assert.assertNotNull(floatMatcher0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        se.mockachino.alias.SimpleAlias simpleAlias0 = se.mockachino.Mockachino.newAlias();
        // The following exception was thrown during execution in test generation
        try {
            simpleAlias0.verifyAtMost(10);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleAlias0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        se.mockachino.Settings settings0 = new se.mockachino.Settings();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        se.mockachino.MockSettings mockSettings1 = se.mockachino.Settings.name("");
        java.lang.String str2 = mockSettings1.getName();
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        se.mockachino.alias.SimpleAlias simpleAlias0 = se.mockachino.Mockachino.newAlias();
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.MockData<se.mockachino.alias.AbstractAlias> abstractAliasMockData1 = se.mockachino.Mockachino.getData((se.mockachino.alias.AbstractAlias) simpleAlias0);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.alias.SimpleAlias@780f6346 is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleAlias0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        se.mockachino.alias.SimpleAlias simpleAlias0 = se.mockachino.Mockachino.newAlias();
        // The following exception was thrown during execution in test generation
        try {
            simpleAlias0.verifyAtLeast(100);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleAlias0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        short short0 = se.mockachino.matchers.Matchers.anyShort();
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 0 + "'", short0 == (short) 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        se.mockachino.matchers.matcher.Matcher<java.lang.Short> shortMatcher0 = se.mockachino.matchers.MatchersBase.mAnyShort();
        java.lang.Class<?> wildcardClass1 = shortMatcher0.getClass();
        java.lang.reflect.InvocationHandler invocationHandler2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement3 = se.mockachino.proxy.ProxyUtil.createProxy((java.lang.reflect.AnnotatedElement) wildcardClass1, invocationHandler2);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument class se.mockachino.matchers.matcher.ClassMatcher is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortMatcher0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        java.lang.Class<java.lang.String> strClass0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        se.mockachino.matchers.matcher.ClassMatcher<java.lang.String> strClassMatcher2 = new se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>(strClass0, classArray1);
        se.mockachino.matchers.matcher.BasicMatcher<java.lang.String> strBasicMatcher3 = se.mockachino.matchers.Matchers.notEq((se.mockachino.matchers.matcher.BasicMatcher<java.lang.String>) strClassMatcher2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = strClassMatcher2.matches("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNull(strBasicMatcher3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        se.mockachino.util.MockachinoMethod mockachinoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall3 = new se.mockachino.MethodCall(mockachinoMethod1, objArray2);
        java.lang.String str4 = se.mockachino.util.Formatting.join("", objArray2);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        java.lang.StackTraceElement stackTraceElement0 = null;
        java.lang.StackTraceElement[] stackTraceElementArray1 = new java.lang.StackTraceElement[] { stackTraceElement0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = se.mockachino.util.Formatting.toString(stackTraceElementArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stackTraceElementArray1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.util.MockachinoMethod mockachinoMethod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            verifyRangeStart1.onMethodWithAnyArgument((java.lang.Object) 10.0d, mockachinoMethod3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        se.mockachino.proxy.CglibAsmUtil cglibAsmUtil0 = new se.mockachino.proxy.CglibAsmUtil();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.MockData<se.mockachino.order.MockPoint> mockPointMockData3 = se.mockachino.Mockachino.getData(mockPoint0);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument MockPoint[0] is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        se.mockachino.matchers.matcher.Matcher<java.lang.Short> shortMatcher0 = se.mockachino.matchers.MatchersBase.mAnyShort();
        java.lang.Class<?> wildcardClass1 = shortMatcher0.getClass();
        se.mockachino.util.MockachinoMethod mockachinoMethod3 = se.mockachino.util.MockachinoMethod.find((java.lang.Class) wildcardClass1, "hi!");
        org.junit.Assert.assertNotNull(shortMatcher0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(mockachinoMethod3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart2 = null; // flaky: se.mockachino.Mockachino.verifyRange((int) (short) 10, 0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart4 = null; // flaky: verifyRangeStart2.withTimeout(10L);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart2);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.lang.Class<java.lang.String> strClass0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        se.mockachino.matchers.matcher.ClassMatcher<java.lang.String> strClassMatcher2 = new se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>(strClass0, classArray1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = strClassMatcher2.matches("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        java.lang.String str1 = se.mockachino.util.Formatting.argument((java.lang.Object) 0L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        se.mockachino.matchers.matcher.Matcher<se.mockachino.Settings> settingsMatcher0 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray2 = new se.mockachino.matchers.matcher.Matcher[1];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.Settings>[] settingsMatcherArray3 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.Settings>[]) matcherArray2;
        settingsMatcherArray3[0] = settingsMatcher0;
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.Settings settings6 = se.mockachino.matchers.Matchers.and(settingsMatcherArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matcherArray2);
        org.junit.Assert.assertNotNull(settingsMatcherArray3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        se.mockachino.alias.SimpleAlias simpleAlias0 = se.mockachino.Mockachino.newAlias();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = simpleAlias0.count();
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleAlias0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        se.mockachino.MockSettings mockSettings1 = se.mockachino.Settings.name("hi!");
        org.junit.Assert.assertNotNull(mockSettings1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.alias.Alias alias1 = se.mockachino.alias.AllAlias.fromMock((java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument 100 is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        se.mockachino.alias.SimpleAlias simpleAlias0 = se.mockachino.Mockachino.newAlias();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = simpleAlias0.bind("0");
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument 0 is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleAlias0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher0 = null;
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.MockData<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherMockData1 = se.mockachino.Mockachino.getData(methodCallMatcher0);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: mock can not be null");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.MethodMatcher methodMatcher5 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             verifyRangeStart1.onMethod((java.lang.Object) 10.0d, methodMatcher5);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument 10.0 is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.MockSettings mockSettings5 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler6 = mockSettings5.getFallback();
        se.mockachino.MockSettings mockSettings7 = mockSettings5.notQuick();
        se.mockachino.CallHandler callHandler8 = mockSettings5.getFallback();
        se.mockachino.util.MockachinoMethod mockachinoMethod9 = se.mockachino.util.MockachinoMethod.NULL;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             verifyRangeStart1.onMethodWithAnyArgument((java.lang.Object) callHandler8, mockachinoMethod9);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.invocationhandler.CollectionsHandler@6a71e941 is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart3);
        org.junit.Assert.assertNotNull(mockSettings5);
        org.junit.Assert.assertNotNull(callHandler6);
        org.junit.Assert.assertNotNull(mockSettings7);
        org.junit.Assert.assertNotNull(callHandler8);
        org.junit.Assert.assertNotNull(mockachinoMethod9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        se.mockachino.exceptions.UsageError usageError1 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber2 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) usageError1);
        se.mockachino.MockUtil mockUtil3 = new se.mockachino.MockUtil();
        se.mockachino.util.MockachinoMethod mockachinoMethod4 = se.mockachino.util.MockachinoMethod.NULL;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             stubber2.onMethodWithAnyArgument((java.lang.Object) mockUtil3, mockachinoMethod4);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.MockUtil@49dbd8fb is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(stubber2);
        org.junit.Assert.assertNotNull(mockachinoMethod4);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        java.lang.StackTraceElement[] stackTraceElementArray0 = new java.lang.StackTraceElement[] {};
        java.lang.String str1 = se.mockachino.util.Formatting.toString(stackTraceElementArray0);
        java.lang.StackTraceElement[] stackTraceElementArray2 = se.mockachino.matchers.Matchers.eq(stackTraceElementArray0);
        se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable> serializableIdentityMatcher3 = new se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable>((java.io.Serializable) stackTraceElementArray0);
        java.lang.String str4 = se.mockachino.util.Formatting.toString(stackTraceElementArray0);
        org.junit.Assert.assertNotNull(stackTraceElementArray0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(stackTraceElementArray2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        se.mockachino.MockData<se.mockachino.proxy.CglibAsmUtil> cglibAsmUtilMockData6 = null;
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.mock.MockHandler<se.mockachino.proxy.CglibAsmUtil> cglibAsmUtilMockHandler9 = new se.mockachino.mock.MockHandler<se.mockachino.proxy.CglibAsmUtil>((se.mockachino.CallHandler) returnAnswer5, cglibAsmUtilMockData6, true, "0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart3);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        se.mockachino.cleaner.StacktraceCleaner stacktraceCleaner0 = new se.mockachino.cleaner.StacktraceCleaner();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        se.mockachino.matchers.matcher.ClassMatcher<java.lang.Short> shortClassMatcher0 = se.mockachino.matchers.matcher.ClassMatcher.anyShort();
        org.junit.Assert.assertNotNull(shortClassMatcher0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        se.mockachino.matchers.matcher.Matcher[] matcherArray1 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray2 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray1;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher3 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray2);
        se.mockachino.util.MockachinoMethod mockachinoMethod4 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall6 = new se.mockachino.MethodCall(mockachinoMethod4, objArray5);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher7 = se.mockachino.matchers.MatchersBase.mEq(methodCall6);
        se.mockachino.MethodCall methodCall8 = se.mockachino.matchers.Matchers.not(methodCallMatcher7);
        boolean boolean9 = methodCallMatcherAndMatcher3.matches(methodCallMatcher7);
        se.mockachino.MethodCall methodCall10 = se.mockachino.matchers.Matchers.m(methodCallMatcher7);
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.alias.Alias alias11 = se.mockachino.alias.AllAlias.fromMock((java.lang.Object) methodCall10);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: mock can not be null");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matcherArray1);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher7);
        org.junit.Assert.assertNull(methodCall8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(methodCall10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        se.mockachino.alias.SimpleAlias simpleAlias0 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias1 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias2 = simpleAlias0.union((se.mockachino.alias.Alias) simpleAlias1);
        // The following exception was thrown during execution in test generation
        try {
            simpleAlias1.verifyAtMost((int) ' ');
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleAlias1);
        org.junit.Assert.assertNotNull(alias2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        se.mockachino.exceptions.UsageError usageError1 = new se.mockachino.exceptions.UsageError("");
        java.lang.String str2 = usageError1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "se.mockachino.exceptions.UsageError: " + "'", str2, "se.mockachino.exceptions.UsageError: ");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        se.mockachino.exceptions.UsageError usageError1 = new se.mockachino.exceptions.UsageError("0");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable4 = null;
        se.mockachino.order.MockPoint mockPoint5 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint6 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext7 = new se.mockachino.order.OrderingContext(mockPoint5, mockPoint6);
        se.mockachino.order.MockPoint mockPoint8 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint9 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext10 = new se.mockachino.order.OrderingContext(mockPoint8, mockPoint9);
        se.mockachino.order.MockPointIterable mockPointIterable11 = new se.mockachino.order.MockPointIterable(invocationIterable4, mockPoint6, mockPoint8);
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.verifier.VerifyHandler verifyHandler15 = new se.mockachino.verifier.VerifyHandler((java.lang.Object) mockPoint0, (java.lang.Iterable<se.mockachino.Invocation>) mockPointIterable11, (int) ' ', (int) (byte) 1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument MockPoint[0] is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext3);
        org.junit.Assert.assertNotNull(mockPoint5);
        org.junit.Assert.assertNotNull(mockPoint6);
        org.junit.Assert.assertNotNull(mockPoint8);
        org.junit.Assert.assertNotNull(mockPoint9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        se.mockachino.MockSettings mockSettings0 = se.mockachino.Settings.quick();
        org.junit.Assert.assertNotNull(mockSettings0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.MatchersBase> matchersBaseMatcher0 = null;
        se.mockachino.matchers.matcher.NotMatcher<se.mockachino.matchers.MatchersBase> matchersBaseNotMatcher1 = new se.mockachino.matchers.matcher.NotMatcher<se.mockachino.matchers.MatchersBase>(matchersBaseMatcher0);
        se.mockachino.matchers.matcher.NotMatcher<se.mockachino.matchers.MatchersBase> matchersBaseNotMatcher2 = new se.mockachino.matchers.matcher.NotMatcher<se.mockachino.matchers.MatchersBase>((se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.MatchersBase>) matchersBaseNotMatcher1);
        se.mockachino.matchers.matcher.NotMatcher<se.mockachino.matchers.MatchersBase> matchersBaseNotMatcher3 = new se.mockachino.matchers.matcher.NotMatcher<se.mockachino.matchers.MatchersBase>((se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.MatchersBase>) matchersBaseNotMatcher2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        java.lang.String str1 = se.mockachino.matchers.Matchers.endsWith("0");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        se.mockachino.alias.SimpleAlias simpleAlias0 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias1 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias2 = simpleAlias0.union((se.mockachino.alias.Alias) simpleAlias1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = simpleAlias0.count();
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleAlias1);
        org.junit.Assert.assertNotNull(alias2);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.lang.String str1 = se.mockachino.util.Formatting.calls((int) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "35 calls" + "'", str1, "35 calls");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        se.mockachino.stub.MethodStubs methodStubs0 = new se.mockachino.stub.MethodStubs();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable0 = null;
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable1 = null;
        se.mockachino.order.MockPoint mockPoint2 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint3 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext4 = new se.mockachino.order.OrderingContext(mockPoint2, mockPoint3);
        se.mockachino.order.MockPoint mockPoint5 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint6 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext7 = new se.mockachino.order.OrderingContext(mockPoint5, mockPoint6);
        se.mockachino.order.MockPointIterable mockPointIterable8 = new se.mockachino.order.MockPointIterable(invocationIterable1, mockPoint3, mockPoint5);
        java.util.Iterator<se.mockachino.Invocation> invocationItor9 = null;
        se.mockachino.order.MockPoint mockPoint10 = null;
        se.mockachino.order.MockPoint mockPoint11 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint12 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext13 = new se.mockachino.order.OrderingContext(mockPoint11, mockPoint12);
        se.mockachino.order.MockPointIterator mockPointIterator14 = new se.mockachino.order.MockPointIterator(invocationItor9, mockPoint10, mockPoint12);
        se.mockachino.order.MockPointIterable mockPointIterable15 = new se.mockachino.order.MockPointIterable(invocationIterable0, mockPoint5, mockPoint10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<se.mockachino.Invocation> invocationItor16 = mockPointIterable15.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockPoint2);
        org.junit.Assert.assertNotNull(mockPoint3);
        org.junit.Assert.assertNotNull(mockPoint5);
        org.junit.Assert.assertNotNull(mockPoint6);
        org.junit.Assert.assertNotNull(mockPoint11);
        org.junit.Assert.assertNotNull(mockPoint12);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        boolean boolean0 = se.mockachino.matchers.Matchers.anyBoolean();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
// flaky:         se.mockachino.matchers.MatcherThreadHandler.assertEmpty();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.lang.Class<java.lang.String> strClass0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        se.mockachino.matchers.matcher.ClassMatcher<java.lang.String> strClassMatcher2 = new se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>(strClass0, classArray1);
        se.mockachino.matchers.matcher.BasicMatcher<java.lang.String> strBasicMatcher3 = se.mockachino.matchers.Matchers.notEq((se.mockachino.matchers.matcher.BasicMatcher<java.lang.String>) strClassMatcher2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = strClassMatcher2.matches("0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNull(strBasicMatcher3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        se.mockachino.matchers.matcher.ClassMatcher<java.lang.Long> longClassMatcher0 = se.mockachino.matchers.matcher.ClassMatcher.anyLong();
        org.junit.Assert.assertNotNull(longClassMatcher0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        java.lang.reflect.Type type0 = null;
        java.lang.reflect.Method method1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = se.mockachino.util.MockachinoMethod.getReturnClass(type0, method1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.util.Iterator<se.mockachino.Invocation> invocationItor0 = null;
        se.mockachino.order.MockPoint mockPoint1 = null;
        se.mockachino.order.MockPoint mockPoint2 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint3 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext4 = new se.mockachino.order.OrderingContext(mockPoint2, mockPoint3);
        se.mockachino.order.MockPointIterator mockPointIterator5 = new se.mockachino.order.MockPointIterator(invocationItor0, mockPoint1, mockPoint3);
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.Invocation invocation6 = mockPointIterator5.fetchNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockPoint2);
        org.junit.Assert.assertNotNull(mockPoint3);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        se.mockachino.matchers.matcher.Matcher<java.lang.String> strMatcher1 = se.mockachino.matchers.MatchersBase.mEndsWith("");
        org.junit.Assert.assertNotNull(strMatcher1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        se.mockachino.order.MockPoint mockPoint0 = null;
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.order.BetweenVerifyContext betweenVerifyContext1 = se.mockachino.Mockachino.after(mockPoint0);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: start can not be null");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        se.mockachino.matchers.matcher.Matcher[] matcherArray1 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray2 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray1;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher3 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray1);
        se.mockachino.alias.Alias[] aliasArray4 = se.mockachino.matchers.Matchers.and((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias[]>[]) matcherArray1);
        se.mockachino.stub.MethodStubs methodStubs5 = se.mockachino.matchers.Matchers.or((se.mockachino.matchers.matcher.Matcher<se.mockachino.stub.MethodStubs>[]) matcherArray1);
        org.junit.Assert.assertNotNull(matcherArray1);
        org.junit.Assert.assertNotNull(aliasMatcherArray2);
        org.junit.Assert.assertNotNull(aliasMatcher3);
        org.junit.Assert.assertNull(aliasArray4);
        org.junit.Assert.assertNull(methodStubs5);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.lang.String str1 = se.mockachino.util.Formatting.calls((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10 calls" + "'", str1, "10 calls");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.lang.String str1 = se.mockachino.util.Formatting.quote("se.mockachino.exceptions.UsageError: ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "se.mockachino.exceptions.UsageError: " + "'", str1, "se.mockachino.exceptions.UsageError: ");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        se.mockachino.matchers.matcher.Matcher[] matcherArray1 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray2 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray1;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher3 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray2);
        se.mockachino.util.MockachinoMethod mockachinoMethod4 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall6 = new se.mockachino.MethodCall(mockachinoMethod4, objArray5);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher7 = se.mockachino.matchers.MatchersBase.mEq(methodCall6);
        boolean boolean8 = methodCallMatcherAndMatcher3.matches(methodCallMatcher7);
        java.lang.Class<se.mockachino.MethodCall> methodCallClass9 = methodCallMatcher7.getType();
        se.mockachino.MethodCall methodCall10 = se.mockachino.matchers.Matchers.match(methodCallMatcher7);
        org.junit.Assert.assertNotNull(matcherArray1);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(methodCallClass9);
        org.junit.Assert.assertNull(methodCall10);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.lang.String str1 = se.mockachino.util.Formatting.calls(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "no calls" + "'", str1, "no calls");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        java.lang.Class<java.lang.String> strClass0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        se.mockachino.matchers.matcher.ClassMatcher<java.lang.String> strClassMatcher2 = new se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>(strClass0, classArray1);
        se.mockachino.matchers.matcher.BasicMatcher<java.lang.String> strBasicMatcher3 = se.mockachino.matchers.Matchers.notEq((se.mockachino.matchers.matcher.BasicMatcher<java.lang.String>) strClassMatcher2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strBasicMatcher3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNull(strBasicMatcher3);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        java.lang.String str1 = se.mockachino.matchers.Matchers.startsWith("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        se.mockachino.alias.SimpleAlias simpleAlias0 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.SimpleAlias simpleAlias1 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.SimpleAlias simpleAlias2 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias[] aliasArray3 = new se.mockachino.alias.Alias[] { simpleAlias0, simpleAlias1, simpleAlias2 };
        se.mockachino.alias.UnionAlias unionAlias4 = new se.mockachino.alias.UnionAlias(aliasArray3);
        se.mockachino.alias.IntersectionAlias intersectionAlias5 = new se.mockachino.alias.IntersectionAlias(aliasArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<se.mockachino.Invocation> invocationList6 = intersectionAlias5.getMatches();
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleAlias0);
        org.junit.Assert.assertNotNull(simpleAlias1);
        org.junit.Assert.assertNotNull(simpleAlias2);
        org.junit.Assert.assertNotNull(aliasArray3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        se.mockachino.matchers.matcher.Matcher[] matcherArray1 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray2 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray1;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher3 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray2);
        se.mockachino.util.MockachinoMethod mockachinoMethod4 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall6 = new se.mockachino.MethodCall(mockachinoMethod4, objArray5);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher7 = se.mockachino.matchers.MatchersBase.mEq(methodCall6);
        se.mockachino.MethodCall methodCall8 = se.mockachino.matchers.Matchers.not(methodCallMatcher7);
        boolean boolean9 = methodCallMatcherAndMatcher3.matches(methodCallMatcher7);
        se.mockachino.util.MockachinoMethod mockachinoMethod10 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall12 = new se.mockachino.MethodCall(mockachinoMethod10, objArray11);
        boolean boolean13 = methodCallMatcher7.matches(methodCall12);
        se.mockachino.util.MockachinoMethod mockachinoMethod14 = methodCall12.getMethod();
        org.junit.Assert.assertNotNull(matcherArray1);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher7);
        org.junit.Assert.assertNull(methodCall8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(mockachinoMethod14);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        se.mockachino.MockSettings mockSettings1 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler2 = mockSettings1.getFallback();
        se.mockachino.MockSettings mockSettings3 = mockSettings1.notQuick();
        se.mockachino.MockSettings mockSettings4 = mockSettings1.quick();
        java.lang.String str5 = mockSettings4.getName();
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(callHandler2);
        org.junit.Assert.assertNotNull(mockSettings3);
        org.junit.Assert.assertNotNull(mockSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        se.mockachino.proxy.ObjenesisUtil objenesisUtil0 = new se.mockachino.proxy.ObjenesisUtil();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        se.mockachino.exceptions.UsageError usageError2 = new se.mockachino.exceptions.UsageError("");
        se.mockachino.exceptions.VerificationError verificationError3 = new se.mockachino.exceptions.VerificationError("", (java.lang.Exception) usageError2);
        se.mockachino.stub.Stubber stubber4 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) verificationError3);
        se.mockachino.alias.SimpleAlias simpleAlias5 = se.mockachino.Mockachino.newAlias();
        se.mockachino.util.MockachinoMethod mockachinoMethod6 = se.mockachino.util.MockachinoMethod.NULL;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             stubber4.onMethodWithAnyArgument((java.lang.Object) simpleAlias5, mockachinoMethod6);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.alias.SimpleAlias@61c6b108 is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(stubber4);
        org.junit.Assert.assertNotNull(simpleAlias5);
        org.junit.Assert.assertNotNull(mockachinoMethod6);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        se.mockachino.alias.SimpleAlias simpleAlias0 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias1 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias2 = simpleAlias0.union((se.mockachino.alias.Alias) simpleAlias1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<se.mockachino.Invocation> invocationList3 = simpleAlias0.getMatches();
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleAlias1);
        org.junit.Assert.assertNotNull(alias2);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        se.mockachino.exceptions.VerificationError verificationError1 = new se.mockachino.exceptions.VerificationError("10 calls");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        java.util.Iterator<se.mockachino.Invocation> invocationItor2 = null;
        se.mockachino.order.MockPoint mockPoint3 = null;
        se.mockachino.order.MockPoint mockPoint4 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint5 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext6 = new se.mockachino.order.OrderingContext(mockPoint4, mockPoint5);
        se.mockachino.order.MockPointIterator mockPointIterator7 = new se.mockachino.order.MockPointIterator(invocationItor2, mockPoint3, mockPoint5);
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.order.MockPointIterator mockPointIterator8 = null; // flaky: verifyRangeStart1.on(mockPointIterator7);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.order.MockPointIterator@103bea23 is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
        org.junit.Assert.assertNotNull(mockPoint4);
        org.junit.Assert.assertNotNull(mockPoint5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        se.mockachino.alias.SimpleAlias simpleAlias0 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.SimpleAlias simpleAlias1 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.SimpleAlias simpleAlias2 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias[] aliasArray3 = new se.mockachino.alias.Alias[] { simpleAlias0, simpleAlias1, simpleAlias2 };
        se.mockachino.alias.UnionAlias unionAlias4 = new se.mockachino.alias.UnionAlias(aliasArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<se.mockachino.Invocation> invocationList5 = unionAlias4.getMatches();
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleAlias0);
        org.junit.Assert.assertNotNull(simpleAlias1);
        org.junit.Assert.assertNotNull(simpleAlias2);
        org.junit.Assert.assertNotNull(aliasArray3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        boolean boolean0 = se.mockachino.cleaner.StacktraceCleaner.ENABLED;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        se.mockachino.verifier.Reporter reporter3 = new se.mockachino.verifier.Reporter((int) (byte) 100, (int) (short) 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.mock.WhenStubber<se.mockachino.verifier.Reporter> reporterWhenStubber4 = se.mockachino.Mockachino.when(reporter3);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Illegal when(X).thenReturn(..) expression. X needs to be on the form mock.method(...)");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        se.mockachino.alias.SimpleAlias simpleAlias0 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias1 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias2 = simpleAlias0.union((se.mockachino.alias.Alias) simpleAlias1);
        se.mockachino.alias.SimpleAlias simpleAlias3 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias4 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias5 = simpleAlias3.union((se.mockachino.alias.Alias) simpleAlias4);
        se.mockachino.alias.Alias alias6 = simpleAlias1.union((se.mockachino.alias.Alias) simpleAlias4);
        // The following exception was thrown during execution in test generation
        try {
            alias6.verify((int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleAlias1);
        org.junit.Assert.assertNotNull(alias2);
        org.junit.Assert.assertNotNull(simpleAlias4);
        org.junit.Assert.assertNotNull(alias5);
        org.junit.Assert.assertNotNull(alias6);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        se.mockachino.CallHandler callHandler0 = se.mockachino.Mockachino.DEFAULT_VALUES;
        org.junit.Assert.assertNotNull(callHandler0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        se.mockachino.matchers.matcher.ClassMatcher<java.lang.Double> doubleClassMatcher0 = se.mockachino.matchers.matcher.ClassMatcher.anyDouble();
        org.junit.Assert.assertNotNull(doubleClassMatcher0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyExactly((-1));
        se.mockachino.MockUtil mockUtil2 = new se.mockachino.MockUtil();
        java.lang.Object obj3 = se.mockachino.util.PrimitiveList.toList((java.lang.Object) mockUtil2);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             verifyRangeStart1.onAnyMethod((java.lang.Object) mockUtil2);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.MockUtil@6be99309 is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        java.lang.StackTraceElement[] stackTraceElementArray2 = new java.lang.StackTraceElement[] {};
        java.lang.String str3 = se.mockachino.util.Formatting.toString(stackTraceElementArray2);
        java.lang.StackTraceElement[] stackTraceElementArray4 = se.mockachino.matchers.Matchers.eq(stackTraceElementArray2);
        se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable> serializableIdentityMatcher5 = new se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable>((java.io.Serializable) stackTraceElementArray2);
        java.lang.String str6 = se.mockachino.util.Formatting.join(true, "", (java.lang.Object[]) stackTraceElementArray2);
        java.lang.String str7 = se.mockachino.util.Formatting.toString(stackTraceElementArray2);
        java.lang.String str8 = se.mockachino.util.Formatting.toString(stackTraceElementArray2);
        org.junit.Assert.assertNotNull(stackTraceElementArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(stackTraceElementArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        java.lang.Object obj0 = null;
        java.lang.String str1 = se.mockachino.util.Formatting.argument(obj0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null" + "'", str1, "null");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtMost((int) 'a');
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyExactly((int) (byte) -1);
        se.mockachino.MockSettings mockSettings3 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler4 = mockSettings3.getFallback();
        se.mockachino.MockSettings mockSettings5 = mockSettings3.notQuick();
        se.mockachino.util.MockachinoMethod mockachinoMethod6 = se.mockachino.util.MockachinoMethod.NULL;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             verifyRangeStart1.onMethodWithAnyArgument((java.lang.Object) mockSettings5, mockachinoMethod6);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.MockSettings@121144d4 is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
        org.junit.Assert.assertNotNull(mockSettings3);
        org.junit.Assert.assertNotNull(callHandler4);
        org.junit.Assert.assertNotNull(mockSettings5);
        org.junit.Assert.assertNotNull(mockachinoMethod6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        se.mockachino.order.MockPoint mockPoint2 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint3 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext4 = new se.mockachino.order.OrderingContext(mockPoint2, mockPoint3);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext5 = null; // flaky: se.mockachino.Mockachino.before(mockPoint2);
        se.mockachino.order.MockPoint mockPoint6 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint7 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext8 = new se.mockachino.order.OrderingContext(mockPoint6, mockPoint7);
        se.mockachino.order.MockPoint mockPoint9 = null; // flaky: orderingContext8.beforeLastCall();
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart10 = new se.mockachino.verifier.VerifyRangeStart((-1), 0, mockPoint2, mockPoint9);
        se.mockachino.exceptions.UsageError usageError13 = new se.mockachino.exceptions.UsageError("");
        se.mockachino.exceptions.VerificationError verificationError14 = new se.mockachino.exceptions.VerificationError("", (java.lang.Exception) usageError13);
        se.mockachino.stub.Stubber stubber15 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) verificationError14);
        // The following exception was thrown during execution in test generation
        try {
            verifyRangeStart10.onAnyMethod((java.lang.Object) verificationError14);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.exceptions.VerificationError:  is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockPoint2);
        org.junit.Assert.assertNotNull(mockPoint3);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext5);
        org.junit.Assert.assertNotNull(mockPoint6);
        org.junit.Assert.assertNotNull(mockPoint7);
// flaky:         org.junit.Assert.assertNotNull(mockPoint9);
// flaky:         org.junit.Assert.assertNotNull(stubber15);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) 1);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart3);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        se.mockachino.matchers.matcher.Matcher[] matcherArray1 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray2 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray1;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher3 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray2);
        se.mockachino.util.MockachinoMethod mockachinoMethod4 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall6 = new se.mockachino.MethodCall(mockachinoMethod4, objArray5);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher7 = se.mockachino.matchers.MatchersBase.mEq(methodCall6);
        se.mockachino.MethodCall methodCall8 = se.mockachino.matchers.Matchers.not(methodCallMatcher7);
        boolean boolean9 = methodCallMatcherAndMatcher3.matches(methodCallMatcher7);
        se.mockachino.util.MockachinoMethod mockachinoMethod10 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall12 = new se.mockachino.MethodCall(mockachinoMethod10, objArray11);
        boolean boolean13 = methodCallMatcher7.matches(methodCall12);
        se.mockachino.util.MockachinoMethod mockachinoMethod14 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall16 = new se.mockachino.MethodCall(mockachinoMethod14, objArray15);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher17 = se.mockachino.matchers.MatchersBase.mEq(methodCall16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = methodCall12.equals(methodCall16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matcherArray1);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher7);
        org.junit.Assert.assertNull(methodCall8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher17);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        se.mockachino.alias.SimpleAlias simpleAlias0 = new se.mockachino.alias.SimpleAlias();
        // The following exception was thrown during execution in test generation
        try {
            simpleAlias0.verifyNever();
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        java.util.Iterator<se.mockachino.Invocation> invocationItor0 = null;
        se.mockachino.order.MockPoint mockPoint1 = null;
        se.mockachino.order.MockPoint mockPoint2 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint3 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext4 = new se.mockachino.order.OrderingContext(mockPoint2, mockPoint3);
        se.mockachino.order.MockPointIterator mockPointIterator5 = new se.mockachino.order.MockPointIterator(invocationItor0, mockPoint1, mockPoint3);
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.Invocation invocation6 = mockPointIterator5.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockPoint2);
        org.junit.Assert.assertNotNull(mockPoint3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        se.mockachino.matchers.matcher.Matcher<java.lang.Integer> intMatcher0 = se.mockachino.matchers.MatchersBase.mAnyInt();
        org.junit.Assert.assertNotNull(intMatcher0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null; // flaky: betweenVerifyContext3.verifyAtMost((int) '#');
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null; // flaky: betweenVerifyContext3.verifyExactly((int) (short) 100);
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart7);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        java.lang.Class<se.mockachino.Invocation> invocationClass0 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray2 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray3 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray2;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher4 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray3);
        java.lang.Class<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherClass5 = methodCallMatcherAndMatcher4.getType();
        se.mockachino.MockData<se.mockachino.Invocation> invocationMockData7 = new se.mockachino.MockData<se.mockachino.Invocation>(invocationClass0, (java.lang.reflect.Type) methodCallMatcherClass5, "se.mockachino.exceptions.UsageError: ");
        java.util.Set<se.mockachino.util.MockachinoMethod> mockachinoMethodSet8 = invocationMockData7.getMethods();
        org.junit.Assert.assertNotNull(matcherArray2);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray3);
        org.junit.Assert.assertNotNull(methodCallMatcherClass5);
        org.junit.Assert.assertNotNull(mockachinoMethodSet8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        se.mockachino.util.MockachinoMethod mockachinoMethod0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall2 = new se.mockachino.MethodCall(mockachinoMethod0, objArray1);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher3 = se.mockachino.matchers.MatchersBase.mEq(methodCall2);
        se.mockachino.MethodCall methodCall4 = se.mockachino.matchers.Matchers.not(methodCallMatcher3);
        se.mockachino.util.MockachinoMethod mockachinoMethod5 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall7 = new se.mockachino.MethodCall(mockachinoMethod5, objArray6);
        boolean boolean8 = methodCallMatcher3.matches(methodCall7);
        se.mockachino.util.MockachinoMethod mockachinoMethod9 = methodCall7.getMethod();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher3);
        org.junit.Assert.assertNull(methodCall4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(mockachinoMethod9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        java.lang.Iterable<se.mockachino.matchers.matcher.Matcher> matcherIterable0 = null;
        java.lang.String str1 = se.mockachino.util.Formatting.list(matcherIterable0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        se.mockachino.alias.SimpleAlias simpleAlias0 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias1 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias2 = simpleAlias0.union((se.mockachino.alias.Alias) simpleAlias1);
        se.mockachino.alias.SimpleAlias simpleAlias3 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias4 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias5 = simpleAlias3.union((se.mockachino.alias.Alias) simpleAlias4);
        se.mockachino.alias.Alias alias6 = simpleAlias1.union((se.mockachino.alias.Alias) simpleAlias4);
        se.mockachino.alias.SimpleAlias simpleAlias7 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias8 = simpleAlias4.difference((se.mockachino.alias.Alias) simpleAlias7);
        se.mockachino.alias.SimpleAlias simpleAlias9 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias10 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias11 = simpleAlias9.union((se.mockachino.alias.Alias) simpleAlias10);
        se.mockachino.alias.SimpleAlias simpleAlias12 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias13 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias14 = simpleAlias12.union((se.mockachino.alias.Alias) simpleAlias13);
        se.mockachino.alias.Alias alias15 = simpleAlias10.union((se.mockachino.alias.Alias) simpleAlias13);
        se.mockachino.alias.SimpleAlias simpleAlias16 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias17 = simpleAlias13.difference((se.mockachino.alias.Alias) simpleAlias16);
        se.mockachino.alias.Alias alias18 = simpleAlias4.union((se.mockachino.alias.Alias) simpleAlias16);
        // The following exception was thrown during execution in test generation
        try {
            simpleAlias4.verifyOnce();
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleAlias1);
        org.junit.Assert.assertNotNull(alias2);
        org.junit.Assert.assertNotNull(simpleAlias4);
        org.junit.Assert.assertNotNull(alias5);
        org.junit.Assert.assertNotNull(alias6);
        org.junit.Assert.assertNotNull(simpleAlias7);
        org.junit.Assert.assertNotNull(alias8);
        org.junit.Assert.assertNotNull(simpleAlias10);
        org.junit.Assert.assertNotNull(alias11);
        org.junit.Assert.assertNotNull(simpleAlias13);
        org.junit.Assert.assertNotNull(alias14);
        org.junit.Assert.assertNotNull(alias15);
        org.junit.Assert.assertNotNull(simpleAlias16);
        org.junit.Assert.assertNotNull(alias17);
        org.junit.Assert.assertNotNull(alias18);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        se.mockachino.proxy.ProxyUtil proxyUtil0 = new se.mockachino.proxy.ProxyUtil();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        se.mockachino.CallHandler callHandler0 = se.mockachino.Mockachino.DEEP_MOCK;
        java.lang.Object obj1 = se.mockachino.util.PrimitiveList.toList((java.lang.Object) callHandler0);
        org.junit.Assert.assertNotNull(callHandler0);
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        se.mockachino.exceptions.UsageError usageError2 = new se.mockachino.exceptions.UsageError("");
        se.mockachino.exceptions.VerificationError verificationError3 = new se.mockachino.exceptions.VerificationError("", (java.lang.Exception) usageError2);
        se.mockachino.stub.Stubber stubber4 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) verificationError3);
        java.lang.Class<se.mockachino.Invocation> invocationClass5 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray7 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray8 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray7;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher9 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray8);
        java.lang.Class<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherClass10 = methodCallMatcherAndMatcher9.getType();
        se.mockachino.MockData<se.mockachino.Invocation> invocationMockData12 = new se.mockachino.MockData<se.mockachino.Invocation>(invocationClass5, (java.lang.reflect.Type) methodCallMatcherClass10, "se.mockachino.exceptions.UsageError: ");
        invocationMockData12.resetStubs();
        java.lang.String str14 = invocationMockData12.getName();
        se.mockachino.util.MockachinoMethod mockachinoMethod15 = se.mockachino.util.MockachinoMethod.NULL;
        se.mockachino.matchers.MethodMatcher methodMatcher16 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             stubber4.onMethod((java.lang.Object) invocationMockData12, mockachinoMethod15, methodMatcher16);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.MockData@2e68b591 is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(stubber4);
        org.junit.Assert.assertNotNull(matcherArray7);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray8);
        org.junit.Assert.assertNotNull(methodCallMatcherClass10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "se.mockachino.exceptions.UsageError: " + "'", str14, "se.mockachino.exceptions.UsageError: ");
        org.junit.Assert.assertNotNull(mockachinoMethod15);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        se.mockachino.exceptions.UsageError usageError1 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber2 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) usageError1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = null; // flaky: stubber2.on("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument hi! is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(stubber2);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        java.lang.reflect.Type type0 = null;
        se.mockachino.MockSettings mockSettings2 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler3 = mockSettings2.getFallback();
        se.mockachino.MockSettings mockSettings4 = mockSettings2.notQuick();
        se.mockachino.CallHandler callHandler5 = mockSettings2.getFallback();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = se.mockachino.MockUtil.mockType(type0, mockSettings2);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: type can not be null");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockSettings2);
        org.junit.Assert.assertNotNull(callHandler3);
        org.junit.Assert.assertNotNull(mockSettings4);
        org.junit.Assert.assertNotNull(callHandler5);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        se.mockachino.order.OrderingContext orderingContext0 = null; // flaky: se.mockachino.Mockachino.newOrdering();
// flaky:         org.junit.Assert.assertNotNull(orderingContext0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        se.mockachino.invocationhandler.PrimitiveInvocationHandler primitiveInvocationHandler0 = new se.mockachino.invocationhandler.PrimitiveInvocationHandler();
        se.mockachino.util.MockachinoMethod mockachinoMethod2 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall4 = new se.mockachino.MethodCall(mockachinoMethod2, objArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = primitiveInvocationHandler0.invoke((java.lang.Object) (byte) 0, methodCall4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        se.mockachino.matchers.matcher.ClassMatcher<java.lang.Integer> intClassMatcher0 = se.mockachino.matchers.matcher.ClassMatcher.anyInt();
        org.junit.Assert.assertNotNull(intClassMatcher0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify4 = null; // flaky: orderingContext2.verifyAtLeast(0);
        se.mockachino.order.MockPoint mockPoint5 = null; // flaky: orderingContext2.atLastCall();
        se.mockachino.order.MockPoint mockPoint6 = null; // flaky: orderingContext2.beforeLastCall();
        int int7 = 0; // flaky: mockPoint6.getCallNumber();
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(inOrderVerify4);
// flaky:         org.junit.Assert.assertNotNull(mockPoint5);
// flaky:         org.junit.Assert.assertNotNull(mockPoint6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.util.Iterator<se.mockachino.Invocation> invocationItor0 = null;
        se.mockachino.order.MockPoint mockPoint1 = null;
        se.mockachino.order.MockPoint mockPoint2 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint3 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext4 = new se.mockachino.order.OrderingContext(mockPoint2, mockPoint3);
        se.mockachino.order.MockPointIterator mockPointIterator5 = new se.mockachino.order.MockPointIterator(invocationItor0, mockPoint1, mockPoint3);
        // The following exception was thrown during execution in test generation
        try {
            mockPointIterator5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockPoint2);
        org.junit.Assert.assertNotNull(mockPoint3);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        se.mockachino.verifier.BadUsageThrower badUsageThrower1 = new se.mockachino.verifier.BadUsageThrower("35 calls");
        java.lang.Object obj2 = null;
        java.lang.reflect.Method method3 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray5 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray6 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray5;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher7 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray5);
        se.mockachino.alias.Alias[] aliasArray8 = se.mockachino.matchers.Matchers.and((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias[]>[]) matcherArray5);
        se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber> stubberOrMatcher9 = new se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber>((se.mockachino.matchers.matcher.Matcher<se.mockachino.stub.Stubber>[]) matcherArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = badUsageThrower1.invoke(obj2, method3, (java.lang.Object[]) matcherArray5);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: 35 calls");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matcherArray5);
        org.junit.Assert.assertNotNull(aliasMatcherArray6);
        org.junit.Assert.assertNotNull(aliasMatcher7);
        org.junit.Assert.assertNull(aliasArray8);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        se.mockachino.alias.SimpleAlias simpleAlias0 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias1 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias2 = simpleAlias0.union((se.mockachino.alias.Alias) simpleAlias1);
        se.mockachino.alias.SimpleAlias simpleAlias3 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias4 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias5 = simpleAlias3.union((se.mockachino.alias.Alias) simpleAlias4);
        se.mockachino.alias.Alias alias6 = simpleAlias1.union((se.mockachino.alias.Alias) simpleAlias4);
        se.mockachino.alias.SimpleAlias simpleAlias7 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias8 = simpleAlias4.difference((se.mockachino.alias.Alias) simpleAlias7);
        se.mockachino.alias.SimpleAlias simpleAlias9 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias10 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias11 = simpleAlias9.union((se.mockachino.alias.Alias) simpleAlias10);
        se.mockachino.alias.SimpleAlias simpleAlias12 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias13 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias14 = simpleAlias12.union((se.mockachino.alias.Alias) simpleAlias13);
        se.mockachino.alias.Alias alias15 = simpleAlias10.union((se.mockachino.alias.Alias) simpleAlias13);
        se.mockachino.alias.SimpleAlias simpleAlias16 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias17 = simpleAlias13.difference((se.mockachino.alias.Alias) simpleAlias16);
        se.mockachino.alias.Alias alias18 = simpleAlias4.union((se.mockachino.alias.Alias) simpleAlias16);
        // The following exception was thrown during execution in test generation
        try {
            simpleAlias4.verifyOnce();
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleAlias1);
        org.junit.Assert.assertNotNull(alias2);
        org.junit.Assert.assertNotNull(simpleAlias4);
        org.junit.Assert.assertNotNull(alias5);
        org.junit.Assert.assertNotNull(alias6);
        org.junit.Assert.assertNotNull(simpleAlias7);
        org.junit.Assert.assertNotNull(alias8);
        org.junit.Assert.assertNotNull(simpleAlias10);
        org.junit.Assert.assertNotNull(alias11);
        org.junit.Assert.assertNotNull(simpleAlias13);
        org.junit.Assert.assertNotNull(alias14);
        org.junit.Assert.assertNotNull(alias15);
        org.junit.Assert.assertNotNull(simpleAlias16);
        org.junit.Assert.assertNotNull(alias17);
        org.junit.Assert.assertNotNull(alias18);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        se.mockachino.matchers.matcher.Matcher[] matcherArray2 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray3 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray2;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher4 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray3);
        java.lang.String str5 = se.mockachino.util.Formatting.join("void <null>()", (java.lang.Object[]) methodCallMatcherMatcherArray3);
        org.junit.Assert.assertNotNull(matcherArray2);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        int int0 = se.mockachino.matchers.Matchers.anyInt();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart0 = null; // flaky: se.mockachino.Mockachino.verifyOnce();
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        se.mockachino.util.MockachinoMethod mockachinoMethod0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall2 = new se.mockachino.MethodCall(mockachinoMethod0, objArray1);
        se.mockachino.util.MockachinoMethod mockachinoMethod3 = methodCall2.getMethod();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(mockachinoMethod3);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        se.mockachino.alias.SimpleAlias simpleAlias0 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias1 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias2 = simpleAlias0.union((se.mockachino.alias.Alias) simpleAlias1);
        se.mockachino.alias.SimpleAlias simpleAlias3 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias4 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias5 = simpleAlias3.union((se.mockachino.alias.Alias) simpleAlias4);
        se.mockachino.alias.Alias alias6 = simpleAlias1.union((se.mockachino.alias.Alias) simpleAlias4);
        se.mockachino.alias.SimpleAlias simpleAlias7 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias8 = simpleAlias4.difference((se.mockachino.alias.Alias) simpleAlias7);
        se.mockachino.alias.SimpleAlias simpleAlias9 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias10 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias11 = simpleAlias9.union((se.mockachino.alias.Alias) simpleAlias10);
        se.mockachino.alias.SimpleAlias simpleAlias12 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias13 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias14 = simpleAlias12.union((se.mockachino.alias.Alias) simpleAlias13);
        se.mockachino.alias.Alias alias15 = simpleAlias10.union((se.mockachino.alias.Alias) simpleAlias13);
        se.mockachino.alias.SimpleAlias simpleAlias16 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias17 = simpleAlias13.difference((se.mockachino.alias.Alias) simpleAlias16);
        se.mockachino.alias.Alias alias18 = simpleAlias4.union((se.mockachino.alias.Alias) simpleAlias16);
        se.mockachino.alias.SimpleAlias simpleAlias19 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias20 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias21 = simpleAlias19.union((se.mockachino.alias.Alias) simpleAlias20);
        se.mockachino.alias.SimpleAlias simpleAlias22 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias23 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias24 = simpleAlias22.union((se.mockachino.alias.Alias) simpleAlias23);
        se.mockachino.alias.Alias alias25 = simpleAlias20.union((se.mockachino.alias.Alias) simpleAlias23);
        se.mockachino.alias.DifferenceAlias differenceAlias26 = new se.mockachino.alias.DifferenceAlias((se.mockachino.alias.Alias) simpleAlias16, alias25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<se.mockachino.Invocation> invocationList27 = differenceAlias26.getMatches();
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleAlias1);
        org.junit.Assert.assertNotNull(alias2);
        org.junit.Assert.assertNotNull(simpleAlias4);
        org.junit.Assert.assertNotNull(alias5);
        org.junit.Assert.assertNotNull(alias6);
        org.junit.Assert.assertNotNull(simpleAlias7);
        org.junit.Assert.assertNotNull(alias8);
        org.junit.Assert.assertNotNull(simpleAlias10);
        org.junit.Assert.assertNotNull(alias11);
        org.junit.Assert.assertNotNull(simpleAlias13);
        org.junit.Assert.assertNotNull(alias14);
        org.junit.Assert.assertNotNull(alias15);
        org.junit.Assert.assertNotNull(simpleAlias16);
        org.junit.Assert.assertNotNull(alias17);
        org.junit.Assert.assertNotNull(alias18);
        org.junit.Assert.assertNotNull(simpleAlias20);
        org.junit.Assert.assertNotNull(alias21);
        org.junit.Assert.assertNotNull(simpleAlias23);
        org.junit.Assert.assertNotNull(alias24);
        org.junit.Assert.assertNotNull(alias25);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        se.mockachino.order.OrderingContext orderingContext0 = null;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint2 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext3 = new se.mockachino.order.OrderingContext(mockPoint1, mockPoint2);
        se.mockachino.order.MockPoint mockPoint4 = null; // flaky: orderingContext3.beforeLastCall();
        se.mockachino.order.MockPoint mockPoint5 = null; // flaky: orderingContext3.beforeLastCall();
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable6 = null;
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable7 = null;
        se.mockachino.order.MockPoint mockPoint8 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint9 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext10 = new se.mockachino.order.OrderingContext(mockPoint8, mockPoint9);
        se.mockachino.order.MockPoint mockPoint11 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint12 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext13 = new se.mockachino.order.OrderingContext(mockPoint11, mockPoint12);
        se.mockachino.order.MockPointIterable mockPointIterable14 = new se.mockachino.order.MockPointIterable(invocationIterable7, mockPoint9, mockPoint11);
        java.util.Iterator<se.mockachino.Invocation> invocationItor15 = null;
        se.mockachino.order.MockPoint mockPoint16 = null;
        se.mockachino.order.MockPoint mockPoint17 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint18 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext19 = new se.mockachino.order.OrderingContext(mockPoint17, mockPoint18);
        se.mockachino.order.MockPointIterator mockPointIterator20 = new se.mockachino.order.MockPointIterator(invocationItor15, mockPoint16, mockPoint18);
        se.mockachino.order.MockPointIterable mockPointIterable21 = new se.mockachino.order.MockPointIterable(invocationIterable6, mockPoint11, mockPoint16);
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable22 = null;
        se.mockachino.order.MockPoint mockPoint23 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint24 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext25 = new se.mockachino.order.OrderingContext(mockPoint23, mockPoint24);
        se.mockachino.order.MockPoint mockPoint26 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint27 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext28 = new se.mockachino.order.OrderingContext(mockPoint26, mockPoint27);
        se.mockachino.order.MockPointIterable mockPointIterable29 = new se.mockachino.order.MockPointIterable(invocationIterable22, mockPoint24, mockPoint26);
        se.mockachino.order.MockPoint mockPoint30 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint31 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext32 = new se.mockachino.order.OrderingContext(mockPoint30, mockPoint31);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext33 = null; // flaky: se.mockachino.Mockachino.before(mockPoint30);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext34 = new se.mockachino.order.BetweenVerifyContext(mockPoint26, mockPoint30);
        se.mockachino.order.MockPoint mockPoint37 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint38 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext39 = new se.mockachino.order.OrderingContext(mockPoint37, mockPoint38);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext40 = null; // flaky: se.mockachino.Mockachino.before(mockPoint37);
        se.mockachino.order.MockPoint mockPoint41 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint42 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext43 = new se.mockachino.order.OrderingContext(mockPoint41, mockPoint42);
        se.mockachino.order.MockPoint mockPoint44 = null; // flaky: orderingContext43.beforeLastCall();
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart45 = new se.mockachino.verifier.VerifyRangeStart((-1), 0, mockPoint37, mockPoint44);
        se.mockachino.order.MockPointIterable mockPointIterable46 = new se.mockachino.order.MockPointIterable((java.lang.Iterable<se.mockachino.Invocation>) mockPointIterable21, mockPoint26, mockPoint37);
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.order.InOrderVerifyHandler inOrderVerifyHandler48 = new se.mockachino.order.InOrderVerifyHandler(orderingContext0, (java.lang.Object) mockPoint5, (java.lang.Iterable<se.mockachino.Invocation>) mockPointIterable46, (int) '#');
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument MockPoint[-2] is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockPoint1);
        org.junit.Assert.assertNotNull(mockPoint2);
// flaky:         org.junit.Assert.assertNotNull(mockPoint4);
// flaky:         org.junit.Assert.assertNotNull(mockPoint5);
        org.junit.Assert.assertNotNull(mockPoint8);
        org.junit.Assert.assertNotNull(mockPoint9);
        org.junit.Assert.assertNotNull(mockPoint11);
        org.junit.Assert.assertNotNull(mockPoint12);
        org.junit.Assert.assertNotNull(mockPoint17);
        org.junit.Assert.assertNotNull(mockPoint18);
        org.junit.Assert.assertNotNull(mockPoint23);
        org.junit.Assert.assertNotNull(mockPoint24);
        org.junit.Assert.assertNotNull(mockPoint26);
        org.junit.Assert.assertNotNull(mockPoint27);
        org.junit.Assert.assertNotNull(mockPoint30);
        org.junit.Assert.assertNotNull(mockPoint31);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext33);
        org.junit.Assert.assertNotNull(mockPoint37);
        org.junit.Assert.assertNotNull(mockPoint38);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext40);
        org.junit.Assert.assertNotNull(mockPoint41);
        org.junit.Assert.assertNotNull(mockPoint42);
// flaky:         org.junit.Assert.assertNotNull(mockPoint44);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.lang.Class<se.mockachino.Invocation> invocationClass0 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray2 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray3 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray2;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher4 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray3);
        java.lang.Class<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherClass5 = methodCallMatcherAndMatcher4.getType();
        se.mockachino.MockData<se.mockachino.Invocation> invocationMockData7 = new se.mockachino.MockData<se.mockachino.Invocation>(invocationClass0, (java.lang.reflect.Type) methodCallMatcherClass5, "se.mockachino.exceptions.UsageError: ");
        invocationMockData7.resetStubs();
        java.lang.String str9 = se.mockachino.util.Formatting.argument((java.lang.Object) invocationMockData7);
        invocationMockData7.resetStubs();
        org.junit.Assert.assertNotNull(matcherArray2);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray3);
        org.junit.Assert.assertNotNull(methodCallMatcherClass5);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyExactly((int) (byte) -1);
        java.lang.Object obj2 = se.mockachino.util.PrimitiveList.toList((java.lang.Object) (byte) -1);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        java.lang.Class<se.mockachino.Invocation> invocationClass0 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray2 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray3 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray2;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher4 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray3);
        java.lang.Class<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherClass5 = methodCallMatcherAndMatcher4.getType();
        se.mockachino.MockData<se.mockachino.Invocation> invocationMockData7 = new se.mockachino.MockData<se.mockachino.Invocation>(invocationClass0, (java.lang.reflect.Type) methodCallMatcherClass5, "se.mockachino.exceptions.UsageError: ");
        invocationMockData7.resetStubs();
        java.lang.String str9 = invocationMockData7.getName();
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable10 = invocationMockData7.getInvocations();
        org.junit.Assert.assertNotNull(matcherArray2);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray3);
        org.junit.Assert.assertNotNull(methodCallMatcherClass5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "se.mockachino.exceptions.UsageError: " + "'", str9, "se.mockachino.exceptions.UsageError: ");
        org.junit.Assert.assertNotNull(invocationIterable10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        se.mockachino.matchers.matcher.ClassMatcher<java.lang.Float> floatClassMatcher0 = se.mockachino.matchers.matcher.ClassMatcher.anyFloat();
        org.junit.Assert.assertNotNull(floatClassMatcher0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        se.mockachino.stub.returnvalue.SequentialAnswers sequentialAnswers0 = null;
        se.mockachino.stub.Stubber stubber1 = new se.mockachino.stub.Stubber(sequentialAnswers0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        se.mockachino.MockSettings mockSettings1 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler2 = mockSettings1.getFallback();
        se.mockachino.MockSettings mockSettings3 = mockSettings1.notQuick();
        se.mockachino.CallHandler callHandler4 = mockSettings1.getFallback();
        se.mockachino.invocationhandler.CollectionsHandler collectionsHandler5 = new se.mockachino.invocationhandler.CollectionsHandler(callHandler4);
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(callHandler2);
        org.junit.Assert.assertNotNull(mockSettings3);
        org.junit.Assert.assertNotNull(callHandler4);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        se.mockachino.alias.SimpleAlias simpleAlias0 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias1 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias2 = simpleAlias0.union((se.mockachino.alias.Alias) simpleAlias1);
        se.mockachino.alias.SimpleAlias simpleAlias3 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias4 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias5 = simpleAlias3.union((se.mockachino.alias.Alias) simpleAlias4);
        se.mockachino.alias.Alias alias6 = simpleAlias1.union((se.mockachino.alias.Alias) simpleAlias4);
        // The following exception was thrown during execution in test generation
        try {
            simpleAlias1.verifyAtMost(1);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleAlias1);
        org.junit.Assert.assertNotNull(alias2);
        org.junit.Assert.assertNotNull(simpleAlias4);
        org.junit.Assert.assertNotNull(alias5);
        org.junit.Assert.assertNotNull(alias6);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        se.mockachino.matchers.matcher.Matcher<java.lang.Character> charMatcher0 = se.mockachino.matchers.MatchersBase.mAnyChar();
        org.junit.Assert.assertNotNull(charMatcher0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable0 = null;
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable1 = null;
        se.mockachino.order.MockPoint mockPoint2 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint3 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext4 = new se.mockachino.order.OrderingContext(mockPoint2, mockPoint3);
        se.mockachino.order.MockPoint mockPoint5 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint6 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext7 = new se.mockachino.order.OrderingContext(mockPoint5, mockPoint6);
        se.mockachino.order.MockPointIterable mockPointIterable8 = new se.mockachino.order.MockPointIterable(invocationIterable1, mockPoint3, mockPoint5);
        java.util.Iterator<se.mockachino.Invocation> invocationItor9 = null;
        se.mockachino.order.MockPoint mockPoint10 = null;
        se.mockachino.order.MockPoint mockPoint11 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint12 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext13 = new se.mockachino.order.OrderingContext(mockPoint11, mockPoint12);
        se.mockachino.order.MockPointIterator mockPointIterator14 = new se.mockachino.order.MockPointIterator(invocationItor9, mockPoint10, mockPoint12);
        se.mockachino.order.MockPointIterable mockPointIterable15 = new se.mockachino.order.MockPointIterable(invocationIterable0, mockPoint5, mockPoint10);
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable16 = null;
        se.mockachino.order.MockPoint mockPoint17 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint18 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext19 = new se.mockachino.order.OrderingContext(mockPoint17, mockPoint18);
        se.mockachino.order.MockPoint mockPoint20 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint21 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext22 = new se.mockachino.order.OrderingContext(mockPoint20, mockPoint21);
        se.mockachino.order.MockPointIterable mockPointIterable23 = new se.mockachino.order.MockPointIterable(invocationIterable16, mockPoint18, mockPoint20);
        se.mockachino.order.MockPoint mockPoint24 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint25 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext26 = new se.mockachino.order.OrderingContext(mockPoint24, mockPoint25);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext27 = null; // flaky: se.mockachino.Mockachino.before(mockPoint24);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext28 = new se.mockachino.order.BetweenVerifyContext(mockPoint20, mockPoint24);
        se.mockachino.order.MockPoint mockPoint31 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint32 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext33 = new se.mockachino.order.OrderingContext(mockPoint31, mockPoint32);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext34 = null; // flaky: se.mockachino.Mockachino.before(mockPoint31);
        se.mockachino.order.MockPoint mockPoint35 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint36 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext37 = new se.mockachino.order.OrderingContext(mockPoint35, mockPoint36);
        se.mockachino.order.MockPoint mockPoint38 = null; // flaky: orderingContext37.beforeLastCall();
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart39 = new se.mockachino.verifier.VerifyRangeStart((-1), 0, mockPoint31, mockPoint38);
        se.mockachino.order.MockPointIterable mockPointIterable40 = new se.mockachino.order.MockPointIterable((java.lang.Iterable<se.mockachino.Invocation>) mockPointIterable15, mockPoint20, mockPoint31);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<se.mockachino.Invocation> invocationItor41 = mockPointIterable15.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockPoint2);
        org.junit.Assert.assertNotNull(mockPoint3);
        org.junit.Assert.assertNotNull(mockPoint5);
        org.junit.Assert.assertNotNull(mockPoint6);
        org.junit.Assert.assertNotNull(mockPoint11);
        org.junit.Assert.assertNotNull(mockPoint12);
        org.junit.Assert.assertNotNull(mockPoint17);
        org.junit.Assert.assertNotNull(mockPoint18);
        org.junit.Assert.assertNotNull(mockPoint20);
        org.junit.Assert.assertNotNull(mockPoint21);
        org.junit.Assert.assertNotNull(mockPoint24);
        org.junit.Assert.assertNotNull(mockPoint25);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext27);
        org.junit.Assert.assertNotNull(mockPoint31);
        org.junit.Assert.assertNotNull(mockPoint32);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext34);
        org.junit.Assert.assertNotNull(mockPoint35);
        org.junit.Assert.assertNotNull(mockPoint36);
// flaky:         org.junit.Assert.assertNotNull(mockPoint38);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        se.mockachino.MockSettings mockSettings1 = se.mockachino.Settings.name("0");
        org.junit.Assert.assertNotNull(mockSettings1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        se.mockachino.exceptions.UsageError usageError1 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber2 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) usageError1);
        se.mockachino.MockSettings mockSettings3 = null; // flaky: se.mockachino.Settings.spyOn((java.lang.Object) stubber2);
// flaky:         org.junit.Assert.assertNotNull(stubber2);
// flaky:         org.junit.Assert.assertNotNull(mockSettings3);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart2 = null; // flaky: se.mockachino.Mockachino.verifyRange((int) (short) 1, (int) ' ');
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart2);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable0 = null;
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable1 = null;
        se.mockachino.order.MockPoint mockPoint2 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint3 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext4 = new se.mockachino.order.OrderingContext(mockPoint2, mockPoint3);
        se.mockachino.order.MockPoint mockPoint5 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint6 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext7 = new se.mockachino.order.OrderingContext(mockPoint5, mockPoint6);
        se.mockachino.order.MockPointIterable mockPointIterable8 = new se.mockachino.order.MockPointIterable(invocationIterable1, mockPoint3, mockPoint5);
        java.util.Iterator<se.mockachino.Invocation> invocationItor9 = null;
        se.mockachino.order.MockPoint mockPoint10 = null;
        se.mockachino.order.MockPoint mockPoint11 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint12 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext13 = new se.mockachino.order.OrderingContext(mockPoint11, mockPoint12);
        se.mockachino.order.MockPointIterator mockPointIterator14 = new se.mockachino.order.MockPointIterator(invocationItor9, mockPoint10, mockPoint12);
        se.mockachino.order.MockPointIterable mockPointIterable15 = new se.mockachino.order.MockPointIterable(invocationIterable0, mockPoint5, mockPoint10);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext16 = null; // flaky: se.mockachino.Mockachino.after(mockPoint5);
        org.junit.Assert.assertNotNull(mockPoint2);
        org.junit.Assert.assertNotNull(mockPoint3);
        org.junit.Assert.assertNotNull(mockPoint5);
        org.junit.Assert.assertNotNull(mockPoint6);
        org.junit.Assert.assertNotNull(mockPoint11);
        org.junit.Assert.assertNotNull(mockPoint12);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext16);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        se.mockachino.matchers.matcher.Matcher<java.lang.String> strMatcher1 = se.mockachino.matchers.MatchersBase.mContains("void <null>()");
        org.junit.Assert.assertNotNull(strMatcher1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        se.mockachino.exceptions.UsageError usageError1 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber2 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) usageError1);
        java.lang.Throwable throwable3 = se.mockachino.cleaner.StacktraceCleaner.cleanError((java.lang.Throwable) usageError1);
// flaky:         org.junit.Assert.assertNotNull(stubber2);
        org.junit.Assert.assertNotNull(throwable3);
        org.junit.Assert.assertEquals(throwable3.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable3.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable3.toString(), "se.mockachino.exceptions.UsageError: hi!");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        se.mockachino.matchers.matcher.Matcher<java.lang.Long> longMatcher0 = se.mockachino.matchers.MatchersBase.mAnyLong();
        org.junit.Assert.assertNotNull(longMatcher0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null; // flaky: betweenVerifyContext3.verifyExactly((int) (byte) 1);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null; // flaky: betweenVerifyContext3.verifyExactly((int) (short) -1);
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        se.mockachino.verifier.BadUsageHandler badUsageHandler0 = se.mockachino.order.InOrderVerifyHandler.BAD_USAGE_HANDLER;
        se.mockachino.verifier.BadUsageHandler badUsageHandler1 = se.mockachino.order.InOrderVerifyHandler.BAD_USAGE_HANDLER;
        se.mockachino.verifier.BadUsageHandler[] badUsageHandlerArray2 = new se.mockachino.verifier.BadUsageHandler[] { badUsageHandler1 };
        se.mockachino.stub.Stubber stubber3 = null; // flaky: se.mockachino.Mockachino.stubReturn(badUsageHandler0, badUsageHandlerArray2);
        org.junit.Assert.assertNotNull(badUsageHandler0);
        org.junit.Assert.assertNotNull(badUsageHandler1);
        org.junit.Assert.assertNotNull(badUsageHandlerArray2);
// flaky:         org.junit.Assert.assertNotNull(stubber3);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.MatchersBase> matchersBaseMatcher0 = null;
        se.mockachino.matchers.matcher.NotMatcher<se.mockachino.matchers.MatchersBase> matchersBaseNotMatcher1 = new se.mockachino.matchers.matcher.NotMatcher<se.mockachino.matchers.MatchersBase>(matchersBaseMatcher0);
        se.mockachino.matchers.matcher.NotMatcher<se.mockachino.matchers.MatchersBase> matchersBaseNotMatcher2 = new se.mockachino.matchers.matcher.NotMatcher<se.mockachino.matchers.MatchersBase>((se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.MatchersBase>) matchersBaseNotMatcher1);
        se.mockachino.invocationhandler.PrimitiveInvocationHandler primitiveInvocationHandler3 = new se.mockachino.invocationhandler.PrimitiveInvocationHandler();
        se.mockachino.matchers.matcher.Matcher<se.mockachino.invocationhandler.PrimitiveInvocationHandler> primitiveInvocationHandlerMatcher4 = se.mockachino.matchers.MatchersBase.mSame(primitiveInvocationHandler3);
        se.mockachino.matchers.matcher.Matcher[] matcherArray6 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray7 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray6;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher8 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray7);
        se.mockachino.util.MockachinoMethod mockachinoMethod9 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall11 = new se.mockachino.MethodCall(mockachinoMethod9, objArray10);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher12 = se.mockachino.matchers.MatchersBase.mEq(methodCall11);
        boolean boolean13 = methodCallMatcherAndMatcher8.matches(methodCallMatcher12);
        java.lang.Class<se.mockachino.MethodCall> methodCallClass14 = methodCallMatcher12.getType();
        se.mockachino.matchers.matcher.Matcher[] matcherArray16 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray17 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray16;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher18 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray16);
        se.mockachino.alias.Alias[] aliasArray19 = se.mockachino.matchers.Matchers.and((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias[]>[]) matcherArray16);
        se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber> stubberOrMatcher20 = new se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber>((se.mockachino.matchers.matcher.Matcher<se.mockachino.stub.Stubber>[]) matcherArray16);
        se.mockachino.matchers.matcher.Matcher[] matcherArray22 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray23 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray22;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher24 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray22);
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher25 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>((se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray22);
        se.mockachino.matchers.matcher.Matcher[] matcherArray26 = new se.mockachino.matchers.matcher.Matcher[] { matchersBaseNotMatcher1, primitiveInvocationHandlerMatcher4, methodCallMatcher12, stubberOrMatcher20, methodCallMatcherAndMatcher25 };
        java.lang.Class<se.mockachino.matchers.MatcherThreadHandler> matcherThreadHandlerClass27 = null;
        se.mockachino.matchers.ArrayMatcher<se.mockachino.matchers.MatcherThreadHandler> matcherThreadHandlerArrayMatcher29 = new se.mockachino.matchers.ArrayMatcher<se.mockachino.matchers.MatcherThreadHandler>(matcherArray26, matcherThreadHandlerClass27, true);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.ArrayMatcher<se.mockachino.matchers.MatcherThreadHandler>> matcherThreadHandlerArrayMatcherMatcher30 = se.mockachino.matchers.MatchersBase.mEq(matcherThreadHandlerArrayMatcher29);
        java.lang.Class<se.mockachino.matchers.MatcherThreadHandler> matcherThreadHandlerClass31 = matcherThreadHandlerArrayMatcher29.getType();
        org.junit.Assert.assertNotNull(primitiveInvocationHandlerMatcher4);
        org.junit.Assert.assertNotNull(matcherArray6);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(methodCallClass14);
        org.junit.Assert.assertNotNull(matcherArray16);
        org.junit.Assert.assertNotNull(aliasMatcherArray17);
        org.junit.Assert.assertNotNull(aliasMatcher18);
        org.junit.Assert.assertNull(aliasArray19);
        org.junit.Assert.assertNotNull(matcherArray22);
        org.junit.Assert.assertNotNull(aliasMatcherArray23);
        org.junit.Assert.assertNotNull(aliasMatcher24);
        org.junit.Assert.assertNotNull(matcherArray26);
        org.junit.Assert.assertNotNull(matcherThreadHandlerArrayMatcherMatcher30);
        org.junit.Assert.assertNull(matcherThreadHandlerClass31);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        java.lang.String str3 = mockPoint0.toString();
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MockPoint[0]" + "'", str3, "MockPoint[0]");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        se.mockachino.alias.SimpleAlias simpleAlias0 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias1 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias2 = simpleAlias0.union((se.mockachino.alias.Alias) simpleAlias1);
        se.mockachino.alias.SimpleAlias simpleAlias3 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias4 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias5 = simpleAlias3.union((se.mockachino.alias.Alias) simpleAlias4);
        se.mockachino.alias.Alias alias6 = simpleAlias1.union((se.mockachino.alias.Alias) simpleAlias4);
        se.mockachino.alias.SimpleAlias simpleAlias7 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias8 = simpleAlias4.difference((se.mockachino.alias.Alias) simpleAlias7);
        se.mockachino.alias.SimpleAlias simpleAlias9 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias10 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias11 = simpleAlias9.union((se.mockachino.alias.Alias) simpleAlias10);
        se.mockachino.alias.SimpleAlias simpleAlias12 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias13 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias14 = simpleAlias12.union((se.mockachino.alias.Alias) simpleAlias13);
        se.mockachino.alias.Alias alias15 = simpleAlias10.union((se.mockachino.alias.Alias) simpleAlias13);
        se.mockachino.alias.SimpleAlias simpleAlias16 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias17 = simpleAlias13.difference((se.mockachino.alias.Alias) simpleAlias16);
        se.mockachino.alias.Alias alias18 = simpleAlias4.union((se.mockachino.alias.Alias) simpleAlias16);
        se.mockachino.alias.SimpleAlias simpleAlias19 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias20 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias21 = simpleAlias19.union((se.mockachino.alias.Alias) simpleAlias20);
        se.mockachino.alias.SimpleAlias simpleAlias22 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias23 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias24 = simpleAlias22.union((se.mockachino.alias.Alias) simpleAlias23);
        se.mockachino.alias.Alias alias25 = simpleAlias20.union((se.mockachino.alias.Alias) simpleAlias23);
        se.mockachino.alias.DifferenceAlias differenceAlias26 = new se.mockachino.alias.DifferenceAlias((se.mockachino.alias.Alias) simpleAlias16, alias25);
        se.mockachino.alias.SimpleAlias simpleAlias27 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias28 = simpleAlias16.intersection((se.mockachino.alias.Alias) simpleAlias27);
        se.mockachino.alias.Alias alias29 = null;
        se.mockachino.alias.Alias alias30 = alias28.difference(alias29);
        org.junit.Assert.assertNotNull(simpleAlias1);
        org.junit.Assert.assertNotNull(alias2);
        org.junit.Assert.assertNotNull(simpleAlias4);
        org.junit.Assert.assertNotNull(alias5);
        org.junit.Assert.assertNotNull(alias6);
        org.junit.Assert.assertNotNull(simpleAlias7);
        org.junit.Assert.assertNotNull(alias8);
        org.junit.Assert.assertNotNull(simpleAlias10);
        org.junit.Assert.assertNotNull(alias11);
        org.junit.Assert.assertNotNull(simpleAlias13);
        org.junit.Assert.assertNotNull(alias14);
        org.junit.Assert.assertNotNull(alias15);
        org.junit.Assert.assertNotNull(simpleAlias16);
        org.junit.Assert.assertNotNull(alias17);
        org.junit.Assert.assertNotNull(alias18);
        org.junit.Assert.assertNotNull(simpleAlias20);
        org.junit.Assert.assertNotNull(alias21);
        org.junit.Assert.assertNotNull(simpleAlias23);
        org.junit.Assert.assertNotNull(alias24);
        org.junit.Assert.assertNotNull(alias25);
        org.junit.Assert.assertNotNull(simpleAlias27);
        org.junit.Assert.assertNotNull(alias28);
        org.junit.Assert.assertNotNull(alias30);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        se.mockachino.alias.SimpleAlias simpleAlias0 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias1 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias2 = simpleAlias0.union((se.mockachino.alias.Alias) simpleAlias1);
        se.mockachino.alias.SimpleAlias simpleAlias3 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias4 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias5 = simpleAlias3.union((se.mockachino.alias.Alias) simpleAlias4);
        se.mockachino.alias.Alias alias6 = simpleAlias1.union((se.mockachino.alias.Alias) simpleAlias4);
        se.mockachino.alias.SimpleAlias simpleAlias7 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias8 = simpleAlias4.difference((se.mockachino.alias.Alias) simpleAlias7);
        se.mockachino.alias.SimpleAlias simpleAlias9 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias10 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias11 = simpleAlias9.union((se.mockachino.alias.Alias) simpleAlias10);
        se.mockachino.alias.SimpleAlias simpleAlias12 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias13 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias14 = simpleAlias12.union((se.mockachino.alias.Alias) simpleAlias13);
        se.mockachino.alias.Alias alias15 = simpleAlias10.union((se.mockachino.alias.Alias) simpleAlias13);
        se.mockachino.alias.SimpleAlias simpleAlias16 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias17 = simpleAlias13.difference((se.mockachino.alias.Alias) simpleAlias16);
        se.mockachino.alias.Alias alias18 = simpleAlias4.union((se.mockachino.alias.Alias) simpleAlias16);
        se.mockachino.alias.SimpleAlias simpleAlias19 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias20 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias21 = simpleAlias19.union((se.mockachino.alias.Alias) simpleAlias20);
        se.mockachino.alias.SimpleAlias simpleAlias22 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias23 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias24 = simpleAlias22.union((se.mockachino.alias.Alias) simpleAlias23);
        se.mockachino.alias.Alias alias25 = simpleAlias20.union((se.mockachino.alias.Alias) simpleAlias23);
        se.mockachino.alias.DifferenceAlias differenceAlias26 = new se.mockachino.alias.DifferenceAlias((se.mockachino.alias.Alias) simpleAlias16, alias25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<se.mockachino.Invocation> invocationList27 = simpleAlias16.getMatches();
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleAlias1);
        org.junit.Assert.assertNotNull(alias2);
        org.junit.Assert.assertNotNull(simpleAlias4);
        org.junit.Assert.assertNotNull(alias5);
        org.junit.Assert.assertNotNull(alias6);
        org.junit.Assert.assertNotNull(simpleAlias7);
        org.junit.Assert.assertNotNull(alias8);
        org.junit.Assert.assertNotNull(simpleAlias10);
        org.junit.Assert.assertNotNull(alias11);
        org.junit.Assert.assertNotNull(simpleAlias13);
        org.junit.Assert.assertNotNull(alias14);
        org.junit.Assert.assertNotNull(alias15);
        org.junit.Assert.assertNotNull(simpleAlias16);
        org.junit.Assert.assertNotNull(alias17);
        org.junit.Assert.assertNotNull(alias18);
        org.junit.Assert.assertNotNull(simpleAlias20);
        org.junit.Assert.assertNotNull(alias21);
        org.junit.Assert.assertNotNull(simpleAlias23);
        org.junit.Assert.assertNotNull(alias24);
        org.junit.Assert.assertNotNull(alias25);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        se.mockachino.exceptions.UsageError usageError1 = new se.mockachino.exceptions.UsageError("se.mockachino.exceptions.UsageError: ");
        se.mockachino.exceptions.VerificationError verificationError3 = new se.mockachino.exceptions.VerificationError("0");
        usageError1.addSuppressed((java.lang.Throwable) verificationError3);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        se.mockachino.exceptions.VerificationError verificationError1 = new se.mockachino.exceptions.VerificationError("");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null; // flaky: betweenVerifyContext3.verifyAtMost((int) '#');
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null; // flaky: betweenVerifyContext3.verifyAtMost((int) (byte) -1);
        se.mockachino.verifier.Reporter reporter11 = new se.mockachino.verifier.Reporter((int) (byte) 100, (int) (short) 0, (int) '4');
        se.mockachino.util.MockachinoMethod mockachinoMethod12 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall14 = new se.mockachino.MethodCall(mockachinoMethod12, objArray13);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher15 = se.mockachino.matchers.MatchersBase.mEq(methodCall14);
        se.mockachino.MethodCall methodCall16 = se.mockachino.matchers.Matchers.not(methodCallMatcher15);
        se.mockachino.util.MockachinoMethod mockachinoMethod17 = null;
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall19 = new se.mockachino.MethodCall(mockachinoMethod17, objArray18);
        boolean boolean20 = methodCallMatcher15.matches(methodCall19);
        java.lang.StackTraceElement[] stackTraceElementArray22 = new java.lang.StackTraceElement[] {};
        java.lang.String str23 = se.mockachino.util.Formatting.toString(stackTraceElementArray22);
        java.lang.StackTraceElement[] stackTraceElementArray24 = se.mockachino.matchers.Matchers.eq(stackTraceElementArray22);
        se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable> serializableIdentityMatcher25 = new se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable>((java.io.Serializable) stackTraceElementArray22);
        se.mockachino.verifier.InvocationCount invocationCount26 = new se.mockachino.verifier.InvocationCount((java.lang.Object) (byte) 100, methodCall19, (int) (short) 0, stackTraceElementArray22);
        java.lang.StackTraceElement[] stackTraceElementArray27 = invocationCount26.getStacktrace();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<se.mockachino.Invocation> invocationIterable28 = betweenVerifyContext3.getCalls((java.lang.Object) invocationCount26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart7);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher15);
        org.junit.Assert.assertNull(methodCall16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stackTraceElementArray22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(stackTraceElementArray24);
        org.junit.Assert.assertNotNull(stackTraceElementArray27);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        se.mockachino.verifier.Reporter reporter3 = new se.mockachino.verifier.Reporter((int) (byte) 100, (int) (short) 0, (int) '4');
        se.mockachino.util.MockachinoMethod mockachinoMethod4 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall6 = new se.mockachino.MethodCall(mockachinoMethod4, objArray5);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher7 = se.mockachino.matchers.MatchersBase.mEq(methodCall6);
        se.mockachino.MethodCall methodCall8 = se.mockachino.matchers.Matchers.not(methodCallMatcher7);
        se.mockachino.util.MockachinoMethod mockachinoMethod9 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall11 = new se.mockachino.MethodCall(mockachinoMethod9, objArray10);
        boolean boolean12 = methodCallMatcher7.matches(methodCall11);
        java.lang.StackTraceElement[] stackTraceElementArray14 = new java.lang.StackTraceElement[] {};
        java.lang.String str15 = se.mockachino.util.Formatting.toString(stackTraceElementArray14);
        java.lang.StackTraceElement[] stackTraceElementArray16 = se.mockachino.matchers.Matchers.eq(stackTraceElementArray14);
        se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable> serializableIdentityMatcher17 = new se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable>((java.io.Serializable) stackTraceElementArray14);
        se.mockachino.verifier.InvocationCount invocationCount18 = new se.mockachino.verifier.InvocationCount((java.lang.Object) (byte) 100, methodCall11, (int) (short) 0, stackTraceElementArray14);
        java.lang.String str19 = invocationCount18.getStackTraceString();
        int int20 = invocationCount18.getCallNumber();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher7);
        org.junit.Assert.assertNull(methodCall8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stackTraceElementArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(stackTraceElementArray16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        se.mockachino.MockSettings mockSettings1 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler2 = mockSettings1.getFallback();
        boolean boolean3 = mockSettings1.isQuick();
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(callHandler2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify3 = null; // flaky: orderingContext2.verify();
        se.mockachino.alias.SimpleAlias simpleAlias4 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.SimpleAlias simpleAlias5 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.SimpleAlias simpleAlias6 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias[] aliasArray7 = new se.mockachino.alias.Alias[] { simpleAlias4, simpleAlias5, simpleAlias6 };
        se.mockachino.alias.UnionAlias unionAlias8 = new se.mockachino.alias.UnionAlias(aliasArray7);
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.alias.UnionAlias unionAlias9 = null; // flaky: inOrderVerify3.on(unionAlias8);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.alias.UnionAlias@69fdf7e is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(inOrderVerify3);
        org.junit.Assert.assertNotNull(simpleAlias4);
        org.junit.Assert.assertNotNull(simpleAlias5);
        org.junit.Assert.assertNotNull(simpleAlias6);
        org.junit.Assert.assertNotNull(aliasArray7);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        boolean boolean0 = se.mockachino.matchers.MatcherThreadHandler.isClean();
// flaky:         org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null; // flaky: betweenVerifyContext3.verifyExactly((int) (byte) 1);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart6 = null; // flaky: betweenVerifyContext3.verifyOnce();
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart6);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        se.mockachino.util.MockachinoMethod mockachinoMethod0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall2 = new se.mockachino.MethodCall(mockachinoMethod0, objArray1);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher3 = se.mockachino.matchers.MatchersBase.mEq(methodCall2);
        se.mockachino.MethodCall methodCall4 = se.mockachino.matchers.Matchers.not(methodCallMatcher3);
        se.mockachino.MethodCall methodCall5 = se.mockachino.matchers.Matchers.not(methodCallMatcher3);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher3);
        org.junit.Assert.assertNull(methodCall4);
        org.junit.Assert.assertNull(methodCall5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        java.lang.Class<se.mockachino.Invocation> invocationClass0 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray2 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray3 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray2;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher4 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray3);
        java.lang.Class<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherClass5 = methodCallMatcherAndMatcher4.getType();
        se.mockachino.MockData<se.mockachino.Invocation> invocationMockData7 = new se.mockachino.MockData<se.mockachino.Invocation>(invocationClass0, (java.lang.reflect.Type) methodCallMatcherClass5, "se.mockachino.exceptions.UsageError: ");
        invocationMockData7.resetStubs();
        java.lang.reflect.Type type9 = invocationMockData7.getTypeLiteral();
        java.util.Set<se.mockachino.util.MockachinoMethod> mockachinoMethodSet10 = invocationMockData7.getMethods();
        invocationMockData7.resetStubs();
        org.junit.Assert.assertNotNull(matcherArray2);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray3);
        org.junit.Assert.assertNotNull(methodCallMatcherClass5);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(mockachinoMethodSet10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        se.mockachino.matchers.Matchers matchers0 = new se.mockachino.matchers.Matchers();
        se.mockachino.matchers.MatchersBase[] matchersBaseArray1 = new se.mockachino.matchers.MatchersBase[] { matchers0 };
        java.util.ArrayList<se.mockachino.matchers.MatchersBase> matchersBaseList2 = new java.util.ArrayList<se.mockachino.matchers.MatchersBase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBaseArray1);
        se.mockachino.matchers.MatchersBase matchersBase4 = new se.mockachino.matchers.MatchersBase();
        se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase> matchersBaseList5 = new se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase>((java.util.List<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBase4);
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.matchers.MatchersBase matchersBase7 = matchersBaseList5.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matchersBaseArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        se.mockachino.alias.SimpleAlias simpleAlias0 = new se.mockachino.alias.SimpleAlias();
        // The following exception was thrown during execution in test generation
        try {
            simpleAlias0.verifyAtMost(10);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        se.mockachino.util.MockachinoMethod mockachinoMethod0 = se.mockachino.util.MockachinoMethod.NULL;
        se.mockachino.util.MockachinoMethod mockachinoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall3 = new se.mockachino.MethodCall(mockachinoMethod1, objArray2);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher4 = se.mockachino.matchers.MatchersBase.mEq(methodCall3);
        java.lang.Object[] objArray5 = methodCall3.getArguments();
        se.mockachino.matchers.matcher.Matcher[] matcherArray7 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray8 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray7;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher9 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray7);
        se.mockachino.alias.Alias[] aliasArray10 = se.mockachino.matchers.Matchers.and((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias[]>[]) matcherArray7);
        se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber> stubberOrMatcher11 = new se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber>((se.mockachino.matchers.matcher.Matcher<se.mockachino.stub.Stubber>[]) matcherArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = mockachinoMethod0.invoke((java.lang.Object) methodCall3, (java.lang.Object[]) matcherArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockachinoMethod0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(matcherArray7);
        org.junit.Assert.assertNotNull(aliasMatcherArray8);
        org.junit.Assert.assertNotNull(aliasMatcher9);
        org.junit.Assert.assertNull(aliasArray10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        java.lang.Object obj6 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod7 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall9 = new se.mockachino.MethodCall(mockachinoMethod7, objArray8);
        java.lang.Object obj10 = returnAnswer5.invoke(obj6, methodCall9);
        se.mockachino.invocationhandler.CollectionsHandler collectionsHandler11 = new se.mockachino.invocationhandler.CollectionsHandler((se.mockachino.CallHandler) returnAnswer5);
        se.mockachino.matchers.MethodMatcher methodMatcher12 = null;
        se.mockachino.stub.MethodStub methodStub13 = new se.mockachino.stub.MethodStub((se.mockachino.CallHandler) returnAnswer5, methodMatcher12);
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.util.PrimitiveList primitiveList14 = new se.mockachino.util.PrimitiveList((java.lang.Object) methodMatcher12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        se.mockachino.matchers.matcher.Matcher[] matcherArray1 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray2 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray1;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher3 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray1);
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher4 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>((se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray1);
        java.lang.Class<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherClass5 = methodCallMatcherAndMatcher4.getType();
        org.junit.Assert.assertNotNull(matcherArray1);
        org.junit.Assert.assertNotNull(aliasMatcherArray2);
        org.junit.Assert.assertNotNull(aliasMatcher3);
        org.junit.Assert.assertNotNull(methodCallMatcherClass5);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        java.lang.String str1 = se.mockachino.matchers.Matchers.regexp("null");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.ArrayMatcher<se.mockachino.matchers.MatcherThreadHandler>>[] matcherThreadHandlerArrayMatcherMatcherArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.matchers.ArrayMatcher<se.mockachino.matchers.MatcherThreadHandler> matcherThreadHandlerArrayMatcher1 = se.mockachino.matchers.Matchers.and(matcherThreadHandlerArrayMatcherMatcherArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        se.mockachino.alias.SimpleAlias simpleAlias0 = new se.mockachino.alias.SimpleAlias();
        // The following exception was thrown during execution in test generation
        try {
            simpleAlias0.verifyOnce();
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify4 = null; // flaky: orderingContext2.verifyAtLeast(0);
        se.mockachino.verifier.BadUsageThrower badUsageThrower6 = new se.mockachino.verifier.BadUsageThrower("35 calls");
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.order.InOrderVerify inOrderVerify7 = se.mockachino.proxy.ProxyUtil.createProxy(inOrderVerify4, (java.lang.reflect.InvocationHandler) badUsageThrower6);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.order.InOrderVerify@6b933bd4 is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(inOrderVerify4);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        se.mockachino.alias.SimpleAlias simpleAlias0 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias1 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias2 = simpleAlias0.union((se.mockachino.alias.Alias) simpleAlias1);
        se.mockachino.alias.SimpleAlias simpleAlias3 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias4 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias5 = simpleAlias3.union((se.mockachino.alias.Alias) simpleAlias4);
        se.mockachino.alias.Alias alias6 = simpleAlias1.union((se.mockachino.alias.Alias) simpleAlias4);
        se.mockachino.alias.SimpleAlias simpleAlias7 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias8 = simpleAlias4.difference((se.mockachino.alias.Alias) simpleAlias7);
        se.mockachino.alias.SimpleAlias simpleAlias9 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias10 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias11 = simpleAlias9.union((se.mockachino.alias.Alias) simpleAlias10);
        se.mockachino.alias.SimpleAlias simpleAlias12 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias13 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias14 = simpleAlias12.union((se.mockachino.alias.Alias) simpleAlias13);
        se.mockachino.alias.Alias alias15 = simpleAlias10.union((se.mockachino.alias.Alias) simpleAlias13);
        se.mockachino.alias.SimpleAlias simpleAlias16 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias17 = simpleAlias13.difference((se.mockachino.alias.Alias) simpleAlias16);
        se.mockachino.alias.Alias alias18 = simpleAlias4.union((se.mockachino.alias.Alias) simpleAlias16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<se.mockachino.Invocation> invocationList19 = simpleAlias4.getMatches();
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleAlias1);
        org.junit.Assert.assertNotNull(alias2);
        org.junit.Assert.assertNotNull(simpleAlias4);
        org.junit.Assert.assertNotNull(alias5);
        org.junit.Assert.assertNotNull(alias6);
        org.junit.Assert.assertNotNull(simpleAlias7);
        org.junit.Assert.assertNotNull(alias8);
        org.junit.Assert.assertNotNull(simpleAlias10);
        org.junit.Assert.assertNotNull(alias11);
        org.junit.Assert.assertNotNull(simpleAlias13);
        org.junit.Assert.assertNotNull(alias14);
        org.junit.Assert.assertNotNull(alias15);
        org.junit.Assert.assertNotNull(simpleAlias16);
        org.junit.Assert.assertNotNull(alias17);
        org.junit.Assert.assertNotNull(alias18);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        se.mockachino.verifier.BadUsageHandler badUsageHandler0 = se.mockachino.order.InOrderVerifyHandler.BAD_USAGE_HANDLER;
        se.mockachino.stub.Stubber stubber1 = se.mockachino.Mockachino.stubReturn(badUsageHandler0);
        se.mockachino.util.MockachinoMethod mockachinoMethod3 = se.mockachino.util.MockachinoMethod.NULL;
        boolean boolean4 = mockachinoMethod3.isToStringCall();
        se.mockachino.util.MockachinoMethod mockachinoMethod5 = se.mockachino.util.MockachinoMethod.NULL;
        java.lang.reflect.Method method6 = mockachinoMethod5.getMethod();
        boolean boolean7 = mockachinoMethod5.isToStringCall();
        se.mockachino.matchers.matcher.Matcher[] matcherArray9 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray10 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray9;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher11 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray9);
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher12 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>((se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray9);
        se.mockachino.matchers.matcher.Matcher[] matcherArray14 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray15 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray14;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher16 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray15);
        se.mockachino.util.MockachinoMethod mockachinoMethod17 = null;
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall19 = new se.mockachino.MethodCall(mockachinoMethod17, objArray18);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher20 = se.mockachino.matchers.MatchersBase.mEq(methodCall19);
        se.mockachino.MethodCall methodCall21 = se.mockachino.matchers.Matchers.not(methodCallMatcher20);
        boolean boolean22 = methodCallMatcherAndMatcher16.matches(methodCallMatcher20);
        se.mockachino.matchers.matcher.Matcher[] matcherArray24 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray25 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray24;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher26 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray24);
        se.mockachino.matchers.matcher.Matcher[] matcherArray27 = new se.mockachino.matchers.matcher.Matcher[] { methodCallMatcherAndMatcher12, methodCallMatcherAndMatcher16, aliasMatcher26 };
        java.util.ArrayList<se.mockachino.matchers.matcher.Matcher> matcherList28 = new java.util.ArrayList<se.mockachino.matchers.matcher.Matcher>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.matcher.Matcher>) matcherList28, matcherArray27);
        se.mockachino.matchers.MethodMatcherImpl methodMatcherImpl30 = new se.mockachino.matchers.MethodMatcherImpl(mockachinoMethod5, (java.util.List<se.mockachino.matchers.matcher.Matcher>) matcherList28);
        // The following exception was thrown during execution in test generation
        try {
            stubber1.onMethod((java.lang.Object) (-2), mockachinoMethod3, (se.mockachino.matchers.MethodMatcher) methodMatcherImpl30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(badUsageHandler0);
        org.junit.Assert.assertNotNull(stubber1);
        org.junit.Assert.assertNotNull(mockachinoMethod3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(mockachinoMethod5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(matcherArray9);
        org.junit.Assert.assertNotNull(aliasMatcherArray10);
        org.junit.Assert.assertNotNull(aliasMatcher11);
        org.junit.Assert.assertNotNull(matcherArray14);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher20);
        org.junit.Assert.assertNull(methodCall21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(matcherArray24);
        org.junit.Assert.assertNotNull(aliasMatcherArray25);
        org.junit.Assert.assertNotNull(aliasMatcher26);
        org.junit.Assert.assertNotNull(matcherArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.mock.WhenStubber<se.mockachino.VerifyableCallHandlerWrapper> verifyableCallHandlerWrapperWhenStubber0 = new se.mockachino.mock.WhenStubber<se.mockachino.VerifyableCallHandlerWrapper>();
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Illegal when(X).thenReturn(..) expression. X needs to be on the form mock.method(...)");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify4 = null; // flaky: orderingContext2.verifyAtLeast(0);
        se.mockachino.order.MockPoint mockPoint5 = null; // flaky: orderingContext2.atLastCall();
        se.mockachino.order.MockPoint mockPoint6 = null; // flaky: orderingContext2.beforeLastCall();
        se.mockachino.order.MockPoint mockPoint7 = null; // flaky: orderingContext2.atLastCall();
        se.mockachino.order.InOrderVerify inOrderVerify9 = null; // flaky: orderingContext2.verifyAtLeast((int) 'a');
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(inOrderVerify4);
// flaky:         org.junit.Assert.assertNotNull(mockPoint5);
// flaky:         org.junit.Assert.assertNotNull(mockPoint6);
// flaky:         org.junit.Assert.assertNotNull(mockPoint7);
// flaky:         org.junit.Assert.assertNotNull(inOrderVerify9);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        se.mockachino.matchers.matcher.Matcher[] matcherArray1 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray2 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray1;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher3 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray1);
        se.mockachino.alias.Alias[] aliasArray4 = se.mockachino.matchers.Matchers.and((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias[]>[]) matcherArray1);
        se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber> stubberOrMatcher5 = new se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber>((se.mockachino.matchers.matcher.Matcher<se.mockachino.stub.Stubber>[]) matcherArray1);
        se.mockachino.exceptions.UsageError usageError8 = new se.mockachino.exceptions.UsageError("");
        se.mockachino.exceptions.VerificationError verificationError9 = new se.mockachino.exceptions.VerificationError("", (java.lang.Exception) usageError8);
        se.mockachino.stub.Stubber stubber10 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) verificationError9);
        boolean boolean11 = stubberOrMatcher5.matches(stubber10);
        se.mockachino.exceptions.UsageError usageError13 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber14 = null; // flaky: stubber10.thenThrow((java.lang.Throwable) usageError13);
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             stubber14.onAnyMethod(obj15);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: mock can not be null");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matcherArray1);
        org.junit.Assert.assertNotNull(aliasMatcherArray2);
        org.junit.Assert.assertNotNull(aliasMatcher3);
        org.junit.Assert.assertNull(aliasArray4);
// flaky:         org.junit.Assert.assertNotNull(stubber10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertNotNull(stubber14);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        se.mockachino.matchers.matcher.Matcher[] matcherArray1 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray2 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray1;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher3 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray1);
        se.mockachino.alias.Alias[] aliasArray4 = se.mockachino.matchers.Matchers.and((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias[]>[]) matcherArray1);
        se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber> stubberOrMatcher5 = new se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber>((se.mockachino.matchers.matcher.Matcher<se.mockachino.stub.Stubber>[]) matcherArray1);
        se.mockachino.exceptions.UsageError usageError8 = new se.mockachino.exceptions.UsageError("");
        se.mockachino.exceptions.VerificationError verificationError9 = new se.mockachino.exceptions.VerificationError("", (java.lang.Exception) usageError8);
        se.mockachino.stub.Stubber stubber10 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) verificationError9);
        boolean boolean11 = stubberOrMatcher5.matches(stubber10);
        se.mockachino.exceptions.UsageError usageError13 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber14 = null; // flaky: stubber10.thenThrow((java.lang.Throwable) usageError13);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart16 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart18 = null; // flaky: verifyRangeStart16.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher19 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart18);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer20 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher19);
        java.lang.Object obj21 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod22 = null;
        java.lang.Object[] objArray23 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall24 = new se.mockachino.MethodCall(mockachinoMethod22, objArray23);
        java.lang.Object obj25 = returnAnswer20.invoke(obj21, methodCall24);
        se.mockachino.invocationhandler.CollectionsHandler collectionsHandler26 = new se.mockachino.invocationhandler.CollectionsHandler((se.mockachino.CallHandler) returnAnswer20);
// flaky:         stubber10.extend((se.mockachino.VerifyableCallHandler) returnAnswer20);
        se.mockachino.util.MockachinoMethod mockachinoMethod28 = se.mockachino.util.MockachinoMethod.NULL;
        boolean boolean29 = mockachinoMethod28.isToStringCall();
        // The following exception was thrown during execution in test generation
        try {
            returnAnswer20.verify(mockachinoMethod28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matcherArray1);
        org.junit.Assert.assertNotNull(aliasMatcherArray2);
        org.junit.Assert.assertNotNull(aliasMatcher3);
        org.junit.Assert.assertNull(aliasArray4);
// flaky:         org.junit.Assert.assertNotNull(stubber10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertNotNull(stubber14);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart16);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart18);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(mockachinoMethod28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        java.lang.Class<se.mockachino.Invocation> invocationClass0 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray2 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray3 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray2;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher4 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray3);
        java.lang.Class<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherClass5 = methodCallMatcherAndMatcher4.getType();
        se.mockachino.MockData<se.mockachino.Invocation> invocationMockData7 = new se.mockachino.MockData<se.mockachino.Invocation>(invocationClass0, (java.lang.reflect.Type) methodCallMatcherClass5, "se.mockachino.exceptions.UsageError: ");
        invocationMockData7.resetObservers();
        org.junit.Assert.assertNotNull(matcherArray2);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray3);
        org.junit.Assert.assertNotNull(methodCallMatcherClass5);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        se.mockachino.matchers.matcher.Matcher[] matcherArray1 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray2 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray1;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher3 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray2);
        se.mockachino.util.MockachinoMethod mockachinoMethod4 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall6 = new se.mockachino.MethodCall(mockachinoMethod4, objArray5);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher7 = se.mockachino.matchers.MatchersBase.mEq(methodCall6);
        se.mockachino.MethodCall methodCall8 = se.mockachino.matchers.Matchers.not(methodCallMatcher7);
        boolean boolean9 = methodCallMatcherAndMatcher3.matches(methodCallMatcher7);
        se.mockachino.util.MockachinoMethod mockachinoMethod10 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall12 = new se.mockachino.MethodCall(mockachinoMethod10, objArray11);
        boolean boolean13 = methodCallMatcher7.matches(methodCall12);
        java.lang.Object[] objArray14 = methodCall12.getArguments();
        org.junit.Assert.assertNotNull(matcherArray1);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher7);
        org.junit.Assert.assertNull(methodCall8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        java.lang.Class<se.mockachino.Invocation> invocationClass0 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray2 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray3 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray2;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher4 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray3);
        java.lang.Class<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherClass5 = methodCallMatcherAndMatcher4.getType();
        se.mockachino.MockData<se.mockachino.Invocation> invocationMockData7 = new se.mockachino.MockData<se.mockachino.Invocation>(invocationClass0, (java.lang.reflect.Type) methodCallMatcherClass5, "se.mockachino.exceptions.UsageError: ");
        invocationMockData7.resetStubs();
        java.lang.reflect.Type type9 = invocationMockData7.getTypeLiteral();
        java.util.Set<se.mockachino.util.MockachinoMethod> mockachinoMethodSet10 = invocationMockData7.getMethods();
        invocationMockData7.resetObservers();
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable12 = null;
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable13 = null;
        se.mockachino.order.MockPoint mockPoint14 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint15 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext16 = new se.mockachino.order.OrderingContext(mockPoint14, mockPoint15);
        se.mockachino.order.MockPoint mockPoint17 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint18 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext19 = new se.mockachino.order.OrderingContext(mockPoint17, mockPoint18);
        se.mockachino.order.MockPointIterable mockPointIterable20 = new se.mockachino.order.MockPointIterable(invocationIterable13, mockPoint15, mockPoint17);
        java.util.Iterator<se.mockachino.Invocation> invocationItor21 = null;
        se.mockachino.order.MockPoint mockPoint22 = null;
        se.mockachino.order.MockPoint mockPoint23 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint24 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext25 = new se.mockachino.order.OrderingContext(mockPoint23, mockPoint24);
        se.mockachino.order.MockPointIterator mockPointIterator26 = new se.mockachino.order.MockPointIterator(invocationItor21, mockPoint22, mockPoint24);
        se.mockachino.order.MockPointIterable mockPointIterable27 = new se.mockachino.order.MockPointIterable(invocationIterable12, mockPoint17, mockPoint22);
        se.mockachino.order.MockPoint mockPoint28 = se.mockachino.Mockachino.BIG_BANG;
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable29 = invocationMockData7.getCalls(mockPoint22, mockPoint28);
        se.mockachino.order.MockPoint mockPoint30 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint31 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext32 = new se.mockachino.order.OrderingContext(mockPoint30, mockPoint31);
        se.mockachino.order.MockPoint mockPoint33 = null; // flaky: orderingContext32.beforeLastCall();
        se.mockachino.order.MockPoint mockPoint34 = null; // flaky: orderingContext32.beforeLastCall();
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable37 = null;
        se.mockachino.order.MockPoint mockPoint38 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint39 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext40 = new se.mockachino.order.OrderingContext(mockPoint38, mockPoint39);
        se.mockachino.order.MockPoint mockPoint41 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint42 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext43 = new se.mockachino.order.OrderingContext(mockPoint41, mockPoint42);
        se.mockachino.order.MockPointIterable mockPointIterable44 = new se.mockachino.order.MockPointIterable(invocationIterable37, mockPoint39, mockPoint41);
        se.mockachino.order.MockPoint mockPoint45 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint46 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext47 = new se.mockachino.order.OrderingContext(mockPoint45, mockPoint46);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext48 = null; // flaky: se.mockachino.Mockachino.before(mockPoint45);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext49 = new se.mockachino.order.BetweenVerifyContext(mockPoint41, mockPoint45);
        se.mockachino.order.MockPoint mockPoint50 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint51 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext52 = new se.mockachino.order.OrderingContext(mockPoint50, mockPoint51);
        se.mockachino.order.MockPoint mockPoint53 = null; // flaky: orderingContext52.beforeLastCall();
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart54 = new se.mockachino.verifier.VerifyRangeStart((int) (byte) 1, (int) (short) 1, mockPoint41, mockPoint53);
        se.mockachino.order.MockPointIterable mockPointIterable55 = new se.mockachino.order.MockPointIterable(invocationIterable29, mockPoint34, mockPoint53);
        org.junit.Assert.assertNotNull(matcherArray2);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray3);
        org.junit.Assert.assertNotNull(methodCallMatcherClass5);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(mockachinoMethodSet10);
        org.junit.Assert.assertNotNull(mockPoint14);
        org.junit.Assert.assertNotNull(mockPoint15);
        org.junit.Assert.assertNotNull(mockPoint17);
        org.junit.Assert.assertNotNull(mockPoint18);
        org.junit.Assert.assertNotNull(mockPoint23);
        org.junit.Assert.assertNotNull(mockPoint24);
        org.junit.Assert.assertNotNull(mockPoint28);
        org.junit.Assert.assertNotNull(invocationIterable29);
        org.junit.Assert.assertNotNull(mockPoint30);
        org.junit.Assert.assertNotNull(mockPoint31);
// flaky:         org.junit.Assert.assertNotNull(mockPoint33);
// flaky:         org.junit.Assert.assertNotNull(mockPoint34);
        org.junit.Assert.assertNotNull(mockPoint38);
        org.junit.Assert.assertNotNull(mockPoint39);
        org.junit.Assert.assertNotNull(mockPoint41);
        org.junit.Assert.assertNotNull(mockPoint42);
        org.junit.Assert.assertNotNull(mockPoint45);
        org.junit.Assert.assertNotNull(mockPoint46);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext48);
        org.junit.Assert.assertNotNull(mockPoint50);
        org.junit.Assert.assertNotNull(mockPoint51);
// flaky:         org.junit.Assert.assertNotNull(mockPoint53);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        se.mockachino.util.MockachinoMethod mockachinoMethod0 = se.mockachino.util.MockachinoMethod.NULL;
        java.lang.reflect.Method method1 = mockachinoMethod0.getMethod();
        boolean boolean2 = mockachinoMethod0.isToStringCall();
        se.mockachino.matchers.matcher.Matcher[] matcherArray4 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray5 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray4;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher6 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray4);
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher7 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>((se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray4);
        se.mockachino.matchers.matcher.Matcher[] matcherArray9 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray10 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray9;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher11 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray10);
        se.mockachino.util.MockachinoMethod mockachinoMethod12 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall14 = new se.mockachino.MethodCall(mockachinoMethod12, objArray13);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher15 = se.mockachino.matchers.MatchersBase.mEq(methodCall14);
        se.mockachino.MethodCall methodCall16 = se.mockachino.matchers.Matchers.not(methodCallMatcher15);
        boolean boolean17 = methodCallMatcherAndMatcher11.matches(methodCallMatcher15);
        se.mockachino.matchers.matcher.Matcher[] matcherArray19 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray20 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray19;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher21 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray19);
        se.mockachino.matchers.matcher.Matcher[] matcherArray22 = new se.mockachino.matchers.matcher.Matcher[] { methodCallMatcherAndMatcher7, methodCallMatcherAndMatcher11, aliasMatcher21 };
        java.util.ArrayList<se.mockachino.matchers.matcher.Matcher> matcherList23 = new java.util.ArrayList<se.mockachino.matchers.matcher.Matcher>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.matcher.Matcher>) matcherList23, matcherArray22);
        se.mockachino.matchers.MethodMatcherImpl methodMatcherImpl25 = new se.mockachino.matchers.MethodMatcherImpl(mockachinoMethod0, (java.util.List<se.mockachino.matchers.matcher.Matcher>) matcherList23);
        java.util.List<se.mockachino.matchers.matcher.Matcher> matcherList26 = methodMatcherImpl25.getArgumentMatchers();
        java.util.List<se.mockachino.matchers.matcher.Matcher> matcherList27 = methodMatcherImpl25.getArgumentMatchers();
        org.junit.Assert.assertNotNull(mockachinoMethod0);
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(matcherArray4);
        org.junit.Assert.assertNotNull(aliasMatcherArray5);
        org.junit.Assert.assertNotNull(aliasMatcher6);
        org.junit.Assert.assertNotNull(matcherArray9);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher15);
        org.junit.Assert.assertNull(methodCall16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(matcherArray19);
        org.junit.Assert.assertNotNull(aliasMatcherArray20);
        org.junit.Assert.assertNotNull(aliasMatcher21);
        org.junit.Assert.assertNotNull(matcherArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(matcherList26);
        org.junit.Assert.assertNotNull(matcherList27);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        java.lang.StackTraceElement[] stackTraceElementArray2 = new java.lang.StackTraceElement[] {};
        java.lang.String str3 = se.mockachino.util.Formatting.toString(stackTraceElementArray2);
        java.lang.StackTraceElement[] stackTraceElementArray4 = se.mockachino.matchers.Matchers.eq(stackTraceElementArray2);
        se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable> serializableIdentityMatcher5 = new se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable>((java.io.Serializable) stackTraceElementArray2);
        java.lang.String str6 = se.mockachino.util.Formatting.join(true, "", (java.lang.Object[]) stackTraceElementArray2);
        java.lang.String str8 = se.mockachino.util.Formatting.list((java.lang.Object[]) stackTraceElementArray2, true);
        java.lang.String str9 = se.mockachino.util.Formatting.toString(stackTraceElementArray2);
        org.junit.Assert.assertNotNull(stackTraceElementArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(stackTraceElementArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        se.mockachino.matchers.matcher.Matcher<java.lang.String> strMatcher1 = se.mockachino.matchers.MatchersBase.mRegexp("<null>(true, true, true)");
        org.junit.Assert.assertNotNull(strMatcher1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        java.lang.Class<java.lang.String> strClass0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        se.mockachino.matchers.matcher.ClassMatcher<java.lang.String> strClassMatcher2 = new se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>(strClass0, classArray1);
        se.mockachino.matchers.matcher.BasicMatcher<java.lang.String> strBasicMatcher3 = se.mockachino.matchers.Matchers.notEq((se.mockachino.matchers.matcher.BasicMatcher<java.lang.String>) strClassMatcher2);
        java.lang.Class<java.lang.String> strClass4 = strClassMatcher2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = strClassMatcher2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNull(strBasicMatcher3);
        org.junit.Assert.assertNull(strClass4);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        se.mockachino.matchers.matcher.ClassMatcher<java.lang.Boolean> booleanClassMatcher0 = se.mockachino.matchers.matcher.ClassMatcher.anyBoolean();
        org.junit.Assert.assertNotNull(booleanClassMatcher0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        se.mockachino.exceptions.UsageError usageError2 = new se.mockachino.exceptions.UsageError("");
        se.mockachino.exceptions.VerificationError verificationError3 = new se.mockachino.exceptions.VerificationError("se.mockachino.exceptions.UsageError: ", (java.lang.Exception) usageError2);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        se.mockachino.exceptions.UsageError usageError1 = new se.mockachino.exceptions.UsageError("se.mockachino.exceptions.UsageError: ");
        java.lang.String str2 = usageError1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "se.mockachino.exceptions.UsageError: se.mockachino.exceptions.UsageError: " + "'", str2, "se.mockachino.exceptions.UsageError: se.mockachino.exceptions.UsageError: ");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        se.mockachino.exceptions.UsageError usageError1 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber2 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) usageError1);
// flaky:         se.mockachino.Mockachino.setupMocks((java.lang.Object) stubber2);
// flaky:         org.junit.Assert.assertNotNull(stubber2);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        se.mockachino.matchers.matcher.RegexpMatcher regexpMatcher1 = new se.mockachino.matchers.matcher.RegexpMatcher("");
        java.lang.String str2 = regexpMatcher1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "regexp(\"\")" + "'", str2, "regexp(\"\")");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        java.lang.Class<se.mockachino.verifier.BadUsageThrower> badUsageThrowerClass0 = null;
        java.lang.StackTraceElement[] stackTraceElementArray1 = new java.lang.StackTraceElement[] {};
        java.lang.String str2 = se.mockachino.util.Formatting.toString(stackTraceElementArray1);
        java.lang.StackTraceElement[] stackTraceElementArray3 = se.mockachino.matchers.Matchers.eq(stackTraceElementArray1);
        se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable> serializableIdentityMatcher4 = new se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable>((java.io.Serializable) stackTraceElementArray1);
        java.lang.Class<java.io.Serializable> serializableClass5 = serializableIdentityMatcher4.getType();
        java.lang.Class[] classArray6 = new java.lang.Class[] {};
        se.mockachino.matchers.matcher.ClassMatcher<java.io.Serializable> serializableClassMatcher7 = new se.mockachino.matchers.matcher.ClassMatcher<java.io.Serializable>(serializableClass5, classArray6);
        se.mockachino.matchers.matcher.ClassMatcher<se.mockachino.verifier.BadUsageThrower> badUsageThrowerClassMatcher8 = new se.mockachino.matchers.matcher.ClassMatcher<se.mockachino.verifier.BadUsageThrower>(badUsageThrowerClass0, classArray6);
        org.junit.Assert.assertNotNull(stackTraceElementArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(stackTraceElementArray3);
        org.junit.Assert.assertNotNull(serializableClass5);
        org.junit.Assert.assertNotNull(classArray6);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        se.mockachino.alias.SimpleAlias simpleAlias0 = new se.mockachino.alias.SimpleAlias();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<se.mockachino.Invocation> invocationList1 = simpleAlias0.getMatches();
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        java.lang.Object obj6 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod7 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall9 = new se.mockachino.MethodCall(mockachinoMethod7, objArray8);
        java.lang.Object obj10 = returnAnswer5.invoke(obj6, methodCall9);
        se.mockachino.invocationhandler.CollectionsHandler collectionsHandler11 = new se.mockachino.invocationhandler.CollectionsHandler((se.mockachino.CallHandler) returnAnswer5);
        se.mockachino.observer.ObserverAdder observerAdder12 = new se.mockachino.observer.ObserverAdder((se.mockachino.CallHandler) returnAnswer5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        se.mockachino.alias.SimpleAlias simpleAlias0 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias1 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias2 = simpleAlias0.union((se.mockachino.alias.Alias) simpleAlias1);
        se.mockachino.alias.SimpleAlias simpleAlias3 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias4 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias5 = simpleAlias3.union((se.mockachino.alias.Alias) simpleAlias4);
        se.mockachino.alias.Alias alias6 = simpleAlias1.union((se.mockachino.alias.Alias) simpleAlias4);
        se.mockachino.alias.SimpleAlias simpleAlias7 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias8 = simpleAlias4.difference((se.mockachino.alias.Alias) simpleAlias7);
        se.mockachino.alias.SimpleAlias simpleAlias9 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias10 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias11 = simpleAlias9.union((se.mockachino.alias.Alias) simpleAlias10);
        se.mockachino.alias.SimpleAlias simpleAlias12 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias13 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias14 = simpleAlias12.union((se.mockachino.alias.Alias) simpleAlias13);
        se.mockachino.alias.Alias alias15 = simpleAlias10.union((se.mockachino.alias.Alias) simpleAlias13);
        se.mockachino.alias.SimpleAlias simpleAlias16 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias17 = simpleAlias13.difference((se.mockachino.alias.Alias) simpleAlias16);
        se.mockachino.alias.Alias alias18 = simpleAlias4.union((se.mockachino.alias.Alias) simpleAlias16);
        se.mockachino.alias.SimpleAlias simpleAlias19 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias20 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias21 = simpleAlias19.union((se.mockachino.alias.Alias) simpleAlias20);
        se.mockachino.alias.SimpleAlias simpleAlias22 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias23 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias24 = simpleAlias22.union((se.mockachino.alias.Alias) simpleAlias23);
        se.mockachino.alias.Alias alias25 = simpleAlias20.union((se.mockachino.alias.Alias) simpleAlias23);
        se.mockachino.alias.DifferenceAlias differenceAlias26 = new se.mockachino.alias.DifferenceAlias((se.mockachino.alias.Alias) simpleAlias16, alias25);
        se.mockachino.alias.SimpleAlias simpleAlias27 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias28 = simpleAlias16.intersection((se.mockachino.alias.Alias) simpleAlias27);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<se.mockachino.Invocation> invocationList29 = simpleAlias16.getMatches();
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleAlias1);
        org.junit.Assert.assertNotNull(alias2);
        org.junit.Assert.assertNotNull(simpleAlias4);
        org.junit.Assert.assertNotNull(alias5);
        org.junit.Assert.assertNotNull(alias6);
        org.junit.Assert.assertNotNull(simpleAlias7);
        org.junit.Assert.assertNotNull(alias8);
        org.junit.Assert.assertNotNull(simpleAlias10);
        org.junit.Assert.assertNotNull(alias11);
        org.junit.Assert.assertNotNull(simpleAlias13);
        org.junit.Assert.assertNotNull(alias14);
        org.junit.Assert.assertNotNull(alias15);
        org.junit.Assert.assertNotNull(simpleAlias16);
        org.junit.Assert.assertNotNull(alias17);
        org.junit.Assert.assertNotNull(alias18);
        org.junit.Assert.assertNotNull(simpleAlias20);
        org.junit.Assert.assertNotNull(alias21);
        org.junit.Assert.assertNotNull(simpleAlias23);
        org.junit.Assert.assertNotNull(alias24);
        org.junit.Assert.assertNotNull(alias25);
        org.junit.Assert.assertNotNull(simpleAlias27);
        org.junit.Assert.assertNotNull(alias28);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        se.mockachino.util.MockachinoMethod mockachinoMethod0 = se.mockachino.util.MockachinoMethod.EQUALS;
        org.junit.Assert.assertNotNull(mockachinoMethod0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable2 = null;
        se.mockachino.order.MockPoint mockPoint3 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint4 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext5 = new se.mockachino.order.OrderingContext(mockPoint3, mockPoint4);
        se.mockachino.order.MockPoint mockPoint6 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint7 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext8 = new se.mockachino.order.OrderingContext(mockPoint6, mockPoint7);
        se.mockachino.order.MockPointIterable mockPointIterable9 = new se.mockachino.order.MockPointIterable(invocationIterable2, mockPoint4, mockPoint6);
        se.mockachino.order.MockPoint mockPoint10 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint11 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext12 = new se.mockachino.order.OrderingContext(mockPoint10, mockPoint11);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext13 = null; // flaky: se.mockachino.Mockachino.before(mockPoint10);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext14 = new se.mockachino.order.BetweenVerifyContext(mockPoint6, mockPoint10);
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable15 = null;
        se.mockachino.order.MockPoint mockPoint16 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint17 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext18 = new se.mockachino.order.OrderingContext(mockPoint16, mockPoint17);
        se.mockachino.order.MockPoint mockPoint19 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint20 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext21 = new se.mockachino.order.OrderingContext(mockPoint19, mockPoint20);
        se.mockachino.order.MockPointIterable mockPointIterable22 = new se.mockachino.order.MockPointIterable(invocationIterable15, mockPoint17, mockPoint19);
        se.mockachino.order.MockPoint mockPoint23 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint24 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext25 = new se.mockachino.order.OrderingContext(mockPoint23, mockPoint24);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext26 = null; // flaky: se.mockachino.Mockachino.before(mockPoint23);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext27 = new se.mockachino.order.BetweenVerifyContext(mockPoint19, mockPoint23);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart28 = new se.mockachino.verifier.VerifyRangeStart((-2), (-2), mockPoint10, mockPoint23);
        org.junit.Assert.assertNotNull(mockPoint3);
        org.junit.Assert.assertNotNull(mockPoint4);
        org.junit.Assert.assertNotNull(mockPoint6);
        org.junit.Assert.assertNotNull(mockPoint7);
        org.junit.Assert.assertNotNull(mockPoint10);
        org.junit.Assert.assertNotNull(mockPoint11);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext13);
        org.junit.Assert.assertNotNull(mockPoint16);
        org.junit.Assert.assertNotNull(mockPoint17);
        org.junit.Assert.assertNotNull(mockPoint19);
        org.junit.Assert.assertNotNull(mockPoint20);
        org.junit.Assert.assertNotNull(mockPoint23);
        org.junit.Assert.assertNotNull(mockPoint24);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext26);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        java.lang.Class<se.mockachino.Invocation> invocationClass0 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray2 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray3 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray2;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher4 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray3);
        java.lang.Class<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherClass5 = methodCallMatcherAndMatcher4.getType();
        se.mockachino.MockData<se.mockachino.Invocation> invocationMockData7 = new se.mockachino.MockData<se.mockachino.Invocation>(invocationClass0, (java.lang.reflect.Type) methodCallMatcherClass5, "se.mockachino.exceptions.UsageError: ");
        java.lang.String str8 = invocationMockData7.getName();
        org.junit.Assert.assertNotNull(matcherArray2);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray3);
        org.junit.Assert.assertNotNull(methodCallMatcherClass5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "se.mockachino.exceptions.UsageError: " + "'", str8, "se.mockachino.exceptions.UsageError: ");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        java.lang.Class<se.mockachino.Invocation> invocationClass0 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray2 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray3 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray2;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher4 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray3);
        java.lang.Class<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherClass5 = methodCallMatcherAndMatcher4.getType();
        se.mockachino.MockData<se.mockachino.Invocation> invocationMockData7 = new se.mockachino.MockData<se.mockachino.Invocation>(invocationClass0, (java.lang.reflect.Type) methodCallMatcherClass5, "se.mockachino.exceptions.UsageError: ");
        invocationMockData7.resetStubs();
        java.lang.reflect.Type type9 = invocationMockData7.getTypeLiteral();
        java.util.Set<se.mockachino.util.MockachinoMethod> mockachinoMethodSet10 = invocationMockData7.getMethods();
        invocationMockData7.resetObservers();
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable12 = null;
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable13 = null;
        se.mockachino.order.MockPoint mockPoint14 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint15 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext16 = new se.mockachino.order.OrderingContext(mockPoint14, mockPoint15);
        se.mockachino.order.MockPoint mockPoint17 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint18 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext19 = new se.mockachino.order.OrderingContext(mockPoint17, mockPoint18);
        se.mockachino.order.MockPointIterable mockPointIterable20 = new se.mockachino.order.MockPointIterable(invocationIterable13, mockPoint15, mockPoint17);
        java.util.Iterator<se.mockachino.Invocation> invocationItor21 = null;
        se.mockachino.order.MockPoint mockPoint22 = null;
        se.mockachino.order.MockPoint mockPoint23 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint24 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext25 = new se.mockachino.order.OrderingContext(mockPoint23, mockPoint24);
        se.mockachino.order.MockPointIterator mockPointIterator26 = new se.mockachino.order.MockPointIterator(invocationItor21, mockPoint22, mockPoint24);
        se.mockachino.order.MockPointIterable mockPointIterable27 = new se.mockachino.order.MockPointIterable(invocationIterable12, mockPoint17, mockPoint22);
        se.mockachino.order.MockPoint mockPoint28 = se.mockachino.Mockachino.BIG_BANG;
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable29 = invocationMockData7.getCalls(mockPoint22, mockPoint28);
        se.mockachino.util.MockachinoMethod mockachinoMethod30 = se.mockachino.util.MockachinoMethod.NULL;
        boolean boolean31 = mockachinoMethod30.isToStringCall();
        se.mockachino.stub.MethodStubs methodStubs32 = invocationMockData7.getStubs(mockachinoMethod30);
        org.junit.Assert.assertNotNull(matcherArray2);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray3);
        org.junit.Assert.assertNotNull(methodCallMatcherClass5);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(mockachinoMethodSet10);
        org.junit.Assert.assertNotNull(mockPoint14);
        org.junit.Assert.assertNotNull(mockPoint15);
        org.junit.Assert.assertNotNull(mockPoint17);
        org.junit.Assert.assertNotNull(mockPoint18);
        org.junit.Assert.assertNotNull(mockPoint23);
        org.junit.Assert.assertNotNull(mockPoint24);
        org.junit.Assert.assertNotNull(mockPoint28);
        org.junit.Assert.assertNotNull(invocationIterable29);
        org.junit.Assert.assertNotNull(mockachinoMethod30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(methodStubs32);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.mock.WhenStubber<se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]> matcherMatcherArrayWhenStubber0 = new se.mockachino.mock.WhenStubber<se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]>();
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Illegal when(X).thenReturn(..) expression. X needs to be on the form mock.method(...)");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify4 = null; // flaky: orderingContext2.verifyAtLeast(0);
        se.mockachino.order.MockPoint mockPoint5 = null; // flaky: orderingContext2.atLastCall();
        se.mockachino.order.MockPoint mockPoint6 = null; // flaky: orderingContext2.beforeLastCall();
        se.mockachino.MockUtil mockUtil7 = new se.mockachino.MockUtil();
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable8 = null;
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable9 = null;
        se.mockachino.order.MockPoint mockPoint10 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint11 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext12 = new se.mockachino.order.OrderingContext(mockPoint10, mockPoint11);
        se.mockachino.order.MockPoint mockPoint13 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint14 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext15 = new se.mockachino.order.OrderingContext(mockPoint13, mockPoint14);
        se.mockachino.order.MockPointIterable mockPointIterable16 = new se.mockachino.order.MockPointIterable(invocationIterable9, mockPoint11, mockPoint13);
        java.util.Iterator<se.mockachino.Invocation> invocationItor17 = null;
        se.mockachino.order.MockPoint mockPoint18 = null;
        se.mockachino.order.MockPoint mockPoint19 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint20 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext21 = new se.mockachino.order.OrderingContext(mockPoint19, mockPoint20);
        se.mockachino.order.MockPointIterator mockPointIterator22 = new se.mockachino.order.MockPointIterator(invocationItor17, mockPoint18, mockPoint20);
        se.mockachino.order.MockPointIterable mockPointIterable23 = new se.mockachino.order.MockPointIterable(invocationIterable8, mockPoint13, mockPoint18);
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.order.InOrderVerifyHandler inOrderVerifyHandler25 = new se.mockachino.order.InOrderVerifyHandler(orderingContext2, (java.lang.Object) mockUtil7, invocationIterable8, (-1));
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.MockUtil@53e1308 is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(inOrderVerify4);
// flaky:         org.junit.Assert.assertNotNull(mockPoint5);
// flaky:         org.junit.Assert.assertNotNull(mockPoint6);
        org.junit.Assert.assertNotNull(mockPoint10);
        org.junit.Assert.assertNotNull(mockPoint11);
        org.junit.Assert.assertNotNull(mockPoint13);
        org.junit.Assert.assertNotNull(mockPoint14);
        org.junit.Assert.assertNotNull(mockPoint19);
        org.junit.Assert.assertNotNull(mockPoint20);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        se.mockachino.util.MockachinoMethod mockachinoMethod0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall2 = new se.mockachino.MethodCall(mockachinoMethod0, objArray1);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher3 = se.mockachino.matchers.MatchersBase.mEq(methodCall2);
        se.mockachino.MethodCall methodCall4 = se.mockachino.matchers.Matchers.not(methodCallMatcher3);
        se.mockachino.util.MockachinoMethod mockachinoMethod5 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall7 = new se.mockachino.MethodCall(mockachinoMethod5, objArray6);
        boolean boolean8 = methodCallMatcher3.matches(methodCall7);
        se.mockachino.MethodCall methodCall9 = se.mockachino.matchers.Matchers.m(methodCallMatcher3);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher3);
        org.junit.Assert.assertNull(methodCall4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(methodCall9);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        se.mockachino.matchers.matcher.Matcher<java.lang.Double> doubleMatcher0 = se.mockachino.matchers.MatchersBase.mAnyDouble();
        org.junit.Assert.assertNotNull(doubleMatcher0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        se.mockachino.exceptions.UsageError usageError2 = new se.mockachino.exceptions.UsageError("");
        se.mockachino.exceptions.VerificationError verificationError3 = new se.mockachino.exceptions.VerificationError("", (java.lang.Exception) usageError2);
        se.mockachino.stub.Stubber stubber4 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) verificationError3);
        se.mockachino.exceptions.UsageError usageError7 = new se.mockachino.exceptions.UsageError("");
        se.mockachino.exceptions.VerificationError verificationError8 = new se.mockachino.exceptions.VerificationError("", (java.lang.Exception) usageError7);
        se.mockachino.stub.Stubber stubber9 = null; // flaky: stubber4.thenThrow((java.lang.Throwable) usageError7);
        se.mockachino.stub.Stubber stubber10 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) usageError7);
        java.lang.Throwable throwable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageError7.addSuppressed(throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(stubber4);
// flaky:         org.junit.Assert.assertNotNull(stubber9);
// flaky:         org.junit.Assert.assertNotNull(stubber10);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        se.mockachino.MockSettings mockSettings1 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler2 = mockSettings1.getFallback();
        se.mockachino.VerifyableCallHandlerWrapper verifyableCallHandlerWrapper3 = new se.mockachino.VerifyableCallHandlerWrapper(callHandler2);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.VerifyableCallHandlerWrapper> verifyableCallHandlerWrapperMatcher4 = se.mockachino.matchers.MatchersBase.mSame(verifyableCallHandlerWrapper3);
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(callHandler2);
        org.junit.Assert.assertNotNull(verifyableCallHandlerWrapperMatcher4);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        java.util.Iterator<se.mockachino.Invocation> invocationItor0 = null;
        se.mockachino.order.MockPoint mockPoint1 = null;
        se.mockachino.order.MockPoint mockPoint2 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint3 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext4 = new se.mockachino.order.OrderingContext(mockPoint2, mockPoint3);
        se.mockachino.order.MockPointIterator mockPointIterator5 = new se.mockachino.order.MockPointIterator(invocationItor0, mockPoint1, mockPoint3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = mockPointIterator5.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockPoint2);
        org.junit.Assert.assertNotNull(mockPoint3);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        se.mockachino.cleaner.StacktraceCleaner.ENABLED = false;
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        se.mockachino.MockSettings mockSettings1 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler2 = mockSettings1.getFallback();
        se.mockachino.MockSettings mockSettings3 = mockSettings1.notQuick();
        se.mockachino.CallHandler callHandler4 = mockSettings1.getFallback();
        se.mockachino.MockSettings mockSettings6 = mockSettings1.name("void <null>()");
        se.mockachino.CallHandler callHandler7 = mockSettings1.getFallback();
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(callHandler2);
        org.junit.Assert.assertNotNull(mockSettings3);
        org.junit.Assert.assertNotNull(callHandler4);
        org.junit.Assert.assertNotNull(mockSettings6);
        org.junit.Assert.assertNotNull(callHandler7);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        se.mockachino.verifier.Reporter reporter3 = new se.mockachino.verifier.Reporter((int) (byte) 100, (int) (short) 0, (int) '4');
        se.mockachino.util.MockachinoMethod mockachinoMethod4 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall6 = new se.mockachino.MethodCall(mockachinoMethod4, objArray5);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher7 = se.mockachino.matchers.MatchersBase.mEq(methodCall6);
        se.mockachino.MethodCall methodCall8 = se.mockachino.matchers.Matchers.not(methodCallMatcher7);
        se.mockachino.util.MockachinoMethod mockachinoMethod9 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall11 = new se.mockachino.MethodCall(mockachinoMethod9, objArray10);
        boolean boolean12 = methodCallMatcher7.matches(methodCall11);
        java.lang.StackTraceElement[] stackTraceElementArray14 = new java.lang.StackTraceElement[] {};
        java.lang.String str15 = se.mockachino.util.Formatting.toString(stackTraceElementArray14);
        java.lang.StackTraceElement[] stackTraceElementArray16 = se.mockachino.matchers.Matchers.eq(stackTraceElementArray14);
        se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable> serializableIdentityMatcher17 = new se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable>((java.io.Serializable) stackTraceElementArray14);
        se.mockachino.verifier.InvocationCount invocationCount18 = new se.mockachino.verifier.InvocationCount((java.lang.Object) (byte) 100, methodCall11, (int) (short) 0, stackTraceElementArray14);
        java.lang.String str20 = invocationCount18.getStackTraceString((int) (byte) -1);
        java.lang.StackTraceElement[] stackTraceElementArray21 = invocationCount18.getStacktrace();
        java.lang.Object obj22 = invocationCount18.getObject();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher7);
        org.junit.Assert.assertNull(methodCall8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stackTraceElementArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(stackTraceElementArray16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(stackTraceElementArray21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 100 + "'", obj22, (byte) 100);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        se.mockachino.util.MockachinoMethod mockachinoMethod0 = se.mockachino.util.MockachinoMethod.NULL;
        java.lang.reflect.Method method1 = mockachinoMethod0.getMethod();
        java.lang.String str2 = mockachinoMethod0.getName();
        org.junit.Assert.assertNotNull(mockachinoMethod0);
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<null>" + "'", str2, "<null>");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        java.lang.Object obj6 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod7 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall9 = new se.mockachino.MethodCall(mockachinoMethod7, objArray8);
        java.lang.Object obj10 = returnAnswer5.invoke(obj6, methodCall9);
        se.mockachino.invocationhandler.CollectionsHandler collectionsHandler11 = new se.mockachino.invocationhandler.CollectionsHandler((se.mockachino.CallHandler) returnAnswer5);
        se.mockachino.matchers.MethodMatcher methodMatcher12 = null;
        se.mockachino.stub.MethodStub methodStub13 = new se.mockachino.stub.MethodStub((se.mockachino.CallHandler) returnAnswer5, methodMatcher12);
        se.mockachino.CallHandler callHandler14 = methodStub13.getAnswer();
        se.mockachino.matchers.matcher.Matcher matcher16 = se.mockachino.matchers.MatcherThreadHandler.getMatcher((java.lang.Object) callHandler14, true);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(callHandler14);
        org.junit.Assert.assertNotNull(matcher16);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        java.lang.Object obj6 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod7 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall9 = new se.mockachino.MethodCall(mockachinoMethod7, objArray8);
        java.lang.Object obj10 = returnAnswer5.invoke(obj6, methodCall9);
        se.mockachino.invocationhandler.CollectionsHandler collectionsHandler11 = new se.mockachino.invocationhandler.CollectionsHandler((se.mockachino.CallHandler) returnAnswer5);
        se.mockachino.matchers.MethodMatcher methodMatcher12 = null;
        se.mockachino.stub.MethodStub methodStub13 = new se.mockachino.stub.MethodStub((se.mockachino.CallHandler) returnAnswer5, methodMatcher12);
        se.mockachino.matchers.MethodMatcher methodMatcher14 = methodStub13.getMatcher();
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(methodMatcher14);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        java.lang.StackTraceElement[] stackTraceElementArray2 = new java.lang.StackTraceElement[] {};
        java.lang.String str3 = se.mockachino.util.Formatting.toString(stackTraceElementArray2);
        java.lang.StackTraceElement[] stackTraceElementArray4 = se.mockachino.matchers.Matchers.eq(stackTraceElementArray2);
        se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable> serializableIdentityMatcher5 = new se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable>((java.io.Serializable) stackTraceElementArray2);
        java.lang.Class<java.io.Serializable> serializableClass6 = serializableIdentityMatcher5.getType();
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        se.mockachino.matchers.matcher.ClassMatcher<java.io.Serializable> serializableClassMatcher8 = new se.mockachino.matchers.matcher.ClassMatcher<java.io.Serializable>(serializableClass6, classArray7);
        java.lang.String str9 = se.mockachino.util.Formatting.join(false, "<null>", (java.lang.Object[]) classArray7);
        org.junit.Assert.assertNotNull(stackTraceElementArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(stackTraceElementArray4);
        org.junit.Assert.assertNotNull(serializableClass6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify4 = null; // flaky: orderingContext2.verifyAtLeast(0);
        se.mockachino.order.MockPoint mockPoint5 = null; // flaky: orderingContext2.atLastCall();
        se.mockachino.order.MockPoint mockPoint6 = null; // flaky: orderingContext2.beforeLastCall();
        se.mockachino.order.MockPoint mockPoint7 = null; // flaky: orderingContext2.atLastCall();
        se.mockachino.order.MockPoint mockPoint8 = null; // flaky: orderingContext2.beforeLastCall();
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(inOrderVerify4);
// flaky:         org.junit.Assert.assertNotNull(mockPoint5);
// flaky:         org.junit.Assert.assertNotNull(mockPoint6);
// flaky:         org.junit.Assert.assertNotNull(mockPoint7);
// flaky:         org.junit.Assert.assertNotNull(mockPoint8);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        se.mockachino.matchers.matcher.Matcher[] matcherArray1 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray2 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray1;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher3 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray1);
        se.mockachino.alias.Alias[] aliasArray4 = se.mockachino.matchers.Matchers.and((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias[]>[]) matcherArray1);
        se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber> stubberOrMatcher5 = new se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber>((se.mockachino.matchers.matcher.Matcher<se.mockachino.stub.Stubber>[]) matcherArray1);
        se.mockachino.exceptions.UsageError usageError8 = new se.mockachino.exceptions.UsageError("");
        se.mockachino.exceptions.VerificationError verificationError9 = new se.mockachino.exceptions.VerificationError("", (java.lang.Exception) usageError8);
        se.mockachino.stub.Stubber stubber10 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) verificationError9);
        boolean boolean11 = stubberOrMatcher5.matches(stubber10);
        se.mockachino.exceptions.UsageError usageError13 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber14 = null; // flaky: stubber10.thenThrow((java.lang.Throwable) usageError13);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart16 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart18 = null; // flaky: verifyRangeStart16.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher19 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart18);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer20 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher19);
        java.lang.Object obj21 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod22 = null;
        java.lang.Object[] objArray23 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall24 = new se.mockachino.MethodCall(mockachinoMethod22, objArray23);
        java.lang.Object obj25 = returnAnswer20.invoke(obj21, methodCall24);
        se.mockachino.invocationhandler.CollectionsHandler collectionsHandler26 = new se.mockachino.invocationhandler.CollectionsHandler((se.mockachino.CallHandler) returnAnswer20);
// flaky:         stubber10.extend((se.mockachino.VerifyableCallHandler) returnAnswer20);
        se.mockachino.exceptions.VerificationError verificationError29 = new se.mockachino.exceptions.VerificationError("35 calls");
        java.lang.Throwable[] throwableArray30 = verificationError29.getSuppressed();
        se.mockachino.stub.Stubber stubber31 = null; // flaky: stubber10.thenThrow((java.lang.Throwable) verificationError29);
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable32 = null;
        se.mockachino.order.MockPoint mockPoint33 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint34 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext35 = new se.mockachino.order.OrderingContext(mockPoint33, mockPoint34);
        se.mockachino.order.MockPoint mockPoint36 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint37 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext38 = new se.mockachino.order.OrderingContext(mockPoint36, mockPoint37);
        se.mockachino.order.MockPointIterable mockPointIterable39 = new se.mockachino.order.MockPointIterable(invocationIterable32, mockPoint34, mockPoint36);
        se.mockachino.order.MockPoint mockPoint40 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint41 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext42 = new se.mockachino.order.OrderingContext(mockPoint40, mockPoint41);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext43 = null; // flaky: se.mockachino.Mockachino.before(mockPoint40);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext44 = new se.mockachino.order.BetweenVerifyContext(mockPoint36, mockPoint40);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart47 = null; // flaky: betweenVerifyContext44.verifyRange(1, (int) (short) 100);
        java.lang.Class<se.mockachino.Invocation> invocationClass48 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray50 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray51 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray50;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher52 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray51);
        java.lang.Class<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherClass53 = methodCallMatcherAndMatcher52.getType();
        se.mockachino.MockData<se.mockachino.Invocation> invocationMockData55 = new se.mockachino.MockData<se.mockachino.Invocation>(invocationClass48, (java.lang.reflect.Type) methodCallMatcherClass53, "se.mockachino.exceptions.UsageError: ");
        invocationMockData55.resetStubs();
        java.lang.reflect.Type type57 = invocationMockData55.getTypeLiteral();
        se.mockachino.util.MockachinoMethod mockachinoMethod58 = se.mockachino.util.MockachinoMethod.NULL;
        java.lang.reflect.Method method59 = mockachinoMethod58.getMethod();
        boolean boolean60 = mockachinoMethod58.isToStringCall();
        se.mockachino.matchers.matcher.Matcher[] matcherArray62 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray63 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray62;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher64 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray62);
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher65 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>((se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray62);
        se.mockachino.matchers.matcher.Matcher[] matcherArray67 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray68 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray67;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher69 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray68);
        se.mockachino.util.MockachinoMethod mockachinoMethod70 = null;
        java.lang.Object[] objArray71 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall72 = new se.mockachino.MethodCall(mockachinoMethod70, objArray71);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher73 = se.mockachino.matchers.MatchersBase.mEq(methodCall72);
        se.mockachino.MethodCall methodCall74 = se.mockachino.matchers.Matchers.not(methodCallMatcher73);
        boolean boolean75 = methodCallMatcherAndMatcher69.matches(methodCallMatcher73);
        se.mockachino.matchers.matcher.Matcher[] matcherArray77 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray78 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray77;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher79 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray77);
        se.mockachino.matchers.matcher.Matcher[] matcherArray80 = new se.mockachino.matchers.matcher.Matcher[] { methodCallMatcherAndMatcher65, methodCallMatcherAndMatcher69, aliasMatcher79 };
        java.util.ArrayList<se.mockachino.matchers.matcher.Matcher> matcherList81 = new java.util.ArrayList<se.mockachino.matchers.matcher.Matcher>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.matcher.Matcher>) matcherList81, matcherArray80);
        se.mockachino.matchers.MethodMatcherImpl methodMatcherImpl83 = new se.mockachino.matchers.MethodMatcherImpl(mockachinoMethod58, (java.util.List<se.mockachino.matchers.matcher.Matcher>) matcherList81);
        se.mockachino.stub.MethodStubs methodStubs84 = invocationMockData55.getStubs(mockachinoMethod58);
        se.mockachino.util.MockachinoMethod mockachinoMethod85 = se.mockachino.util.MockachinoMethod.NULL;
        java.lang.reflect.Method method86 = mockachinoMethod85.getMethod();
        boolean boolean87 = mockachinoMethod85.isToStringCall();
        se.mockachino.matchers.MethodMatcherImpl methodMatcherImpl88 = null; // flaky: se.mockachino.matchers.MethodMatcherImpl.matchAll(mockachinoMethod85);
        // The following exception was thrown during execution in test generation
        try {
            stubber10.onMethod((java.lang.Object) betweenVerifyContext44, mockachinoMethod58, (se.mockachino.matchers.MethodMatcher) methodMatcherImpl88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matcherArray1);
        org.junit.Assert.assertNotNull(aliasMatcherArray2);
        org.junit.Assert.assertNotNull(aliasMatcher3);
        org.junit.Assert.assertNull(aliasArray4);
// flaky:         org.junit.Assert.assertNotNull(stubber10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertNotNull(stubber14);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart16);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart18);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(throwableArray30);
// flaky:         org.junit.Assert.assertNotNull(stubber31);
        org.junit.Assert.assertNotNull(mockPoint33);
        org.junit.Assert.assertNotNull(mockPoint34);
        org.junit.Assert.assertNotNull(mockPoint36);
        org.junit.Assert.assertNotNull(mockPoint37);
        org.junit.Assert.assertNotNull(mockPoint40);
        org.junit.Assert.assertNotNull(mockPoint41);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext43);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart47);
        org.junit.Assert.assertNotNull(matcherArray50);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray51);
        org.junit.Assert.assertNotNull(methodCallMatcherClass53);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(mockachinoMethod58);
        org.junit.Assert.assertNull(method59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(matcherArray62);
        org.junit.Assert.assertNotNull(aliasMatcherArray63);
        org.junit.Assert.assertNotNull(aliasMatcher64);
        org.junit.Assert.assertNotNull(matcherArray67);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray68);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher73);
        org.junit.Assert.assertNull(methodCall74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(matcherArray77);
        org.junit.Assert.assertNotNull(aliasMatcherArray78);
        org.junit.Assert.assertNotNull(aliasMatcher79);
        org.junit.Assert.assertNotNull(matcherArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNull(methodStubs84);
        org.junit.Assert.assertNotNull(mockachinoMethod85);
        org.junit.Assert.assertNull(method86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
// flaky:         org.junit.Assert.assertNotNull(methodMatcherImpl88);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        se.mockachino.verifier.Reporter reporter3 = new se.mockachino.verifier.Reporter((int) (byte) 100, (int) (short) 0, (int) '4');
        se.mockachino.util.MockachinoMethod mockachinoMethod4 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall6 = new se.mockachino.MethodCall(mockachinoMethod4, objArray5);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher7 = se.mockachino.matchers.MatchersBase.mEq(methodCall6);
        se.mockachino.MethodCall methodCall8 = se.mockachino.matchers.Matchers.not(methodCallMatcher7);
        se.mockachino.util.MockachinoMethod mockachinoMethod9 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall11 = new se.mockachino.MethodCall(mockachinoMethod9, objArray10);
        boolean boolean12 = methodCallMatcher7.matches(methodCall11);
        java.lang.StackTraceElement[] stackTraceElementArray14 = new java.lang.StackTraceElement[] {};
        java.lang.String str15 = se.mockachino.util.Formatting.toString(stackTraceElementArray14);
        java.lang.StackTraceElement[] stackTraceElementArray16 = se.mockachino.matchers.Matchers.eq(stackTraceElementArray14);
        se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable> serializableIdentityMatcher17 = new se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable>((java.io.Serializable) stackTraceElementArray14);
        se.mockachino.verifier.InvocationCount invocationCount18 = new se.mockachino.verifier.InvocationCount((java.lang.Object) (byte) 100, methodCall11, (int) (short) 0, stackTraceElementArray14);
        java.lang.String str20 = invocationCount18.getStackTraceString((int) (byte) -1);
        java.lang.StackTraceElement[] stackTraceElementArray21 = invocationCount18.getStacktrace();
        int int22 = invocationCount18.getCallNumber();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher7);
        org.junit.Assert.assertNull(methodCall8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stackTraceElementArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(stackTraceElementArray16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(stackTraceElementArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        java.util.Iterator<se.mockachino.Invocation> invocationItor0 = null;
        se.mockachino.order.MockPoint mockPoint1 = null;
        se.mockachino.order.MockPoint mockPoint2 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint3 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext4 = new se.mockachino.order.OrderingContext(mockPoint2, mockPoint3);
        se.mockachino.order.MockPointIterator mockPointIterator5 = new se.mockachino.order.MockPointIterator(invocationItor0, mockPoint1, mockPoint3);
        java.lang.String str6 = mockPoint3.toString();
        org.junit.Assert.assertNotNull(mockPoint2);
        org.junit.Assert.assertNotNull(mockPoint3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MockPoint[0]" + "'", str6, "MockPoint[0]");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        se.mockachino.MockSettings mockSettings1 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler2 = mockSettings1.getFallback();
        se.mockachino.observer.ObserverAdder observerAdder3 = new se.mockachino.observer.ObserverAdder(callHandler2);
        se.mockachino.observer.ObserverAdder observerAdder4 = null; // flaky: se.mockachino.Mockachino.observeWith(callHandler2);
        se.mockachino.matchers.matcher.Matcher[] matcherArray6 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray7 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray6;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher8 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray6);
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher9 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>((se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = null; // flaky: observerAdder4.on((java.lang.Object[]) matcherArray6);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument [Lse.mockachino.matchers.matcher.Matcher;@5edaa3d1 is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(callHandler2);
// flaky:         org.junit.Assert.assertNotNull(observerAdder4);
        org.junit.Assert.assertNotNull(matcherArray6);
        org.junit.Assert.assertNotNull(aliasMatcherArray7);
        org.junit.Assert.assertNotNull(aliasMatcher8);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        se.mockachino.alias.SimpleAlias simpleAlias0 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias1 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias2 = simpleAlias0.union((se.mockachino.alias.Alias) simpleAlias1);
        se.mockachino.alias.SimpleAlias simpleAlias3 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias4 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias5 = simpleAlias3.union((se.mockachino.alias.Alias) simpleAlias4);
        se.mockachino.alias.Alias alias6 = simpleAlias1.union((se.mockachino.alias.Alias) simpleAlias4);
        // The following exception was thrown during execution in test generation
        try {
            simpleAlias4.verifyNever();
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleAlias1);
        org.junit.Assert.assertNotNull(alias2);
        org.junit.Assert.assertNotNull(simpleAlias4);
        org.junit.Assert.assertNotNull(alias5);
        org.junit.Assert.assertNotNull(alias6);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        se.mockachino.exceptions.VerificationError verificationError1 = new se.mockachino.exceptions.VerificationError("35 calls");
        java.lang.Throwable[] throwableArray2 = verificationError1.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.alias.Alias alias3 = se.mockachino.alias.AllAlias.fromMock((java.lang.Object) throwableArray2);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument [Ljava.lang.Throwable;@3f283b60 is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        java.lang.String str1 = se.mockachino.util.Formatting.argument((java.lang.Object) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10" + "'", str1, "10");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart0 = null; // flaky: se.mockachino.Mockachino.verifyNever();
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        se.mockachino.matchers.Matchers matchers0 = new se.mockachino.matchers.Matchers();
        se.mockachino.matchers.MatchersBase[] matchersBaseArray1 = new se.mockachino.matchers.MatchersBase[] { matchers0 };
        java.util.ArrayList<se.mockachino.matchers.MatchersBase> matchersBaseList2 = new java.util.ArrayList<se.mockachino.matchers.MatchersBase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBaseArray1);
        se.mockachino.matchers.MatchersBase matchersBase4 = new se.mockachino.matchers.MatchersBase();
        se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase> matchersBaseList5 = new se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase>((java.util.List<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBase4);
        java.lang.StackTraceElement[] stackTraceElementArray6 = new java.lang.StackTraceElement[] {};
        java.lang.String str7 = se.mockachino.util.Formatting.toString(stackTraceElementArray6);
        java.lang.StackTraceElement[] stackTraceElementArray8 = se.mockachino.matchers.Matchers.eq(stackTraceElementArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = matchersBaseList5.toArray((java.lang.Object[]) stackTraceElementArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matchersBaseArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stackTraceElementArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(stackTraceElementArray8);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        java.lang.StackTraceElement[] stackTraceElementArray0 = new java.lang.StackTraceElement[] {};
        java.lang.String str1 = se.mockachino.util.Formatting.toString(stackTraceElementArray0);
        java.lang.StackTraceElement[] stackTraceElementArray2 = se.mockachino.matchers.Matchers.eq(stackTraceElementArray0);
        se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable> serializableIdentityMatcher3 = new se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable>((java.io.Serializable) stackTraceElementArray0);
        java.lang.Class<java.io.Serializable> serializableClass4 = serializableIdentityMatcher3.getType();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray5 = new java.lang.reflect.AnnotatedElement[] { serializableClass4 };
        java.util.ArrayList<java.lang.reflect.AnnotatedElement> annotatedElementList6 = new java.util.ArrayList<java.lang.reflect.AnnotatedElement>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.AnnotatedElement>) annotatedElementList6, annotatedElementArray5);
        java.lang.reflect.AnnotatedElement annotatedElement8 = null;
        se.mockachino.util.SafeIteratorList<java.lang.reflect.AnnotatedElement> annotatedElementList9 = new se.mockachino.util.SafeIteratorList<java.lang.reflect.AnnotatedElement>((java.util.List<java.lang.reflect.AnnotatedElement>) annotatedElementList6, annotatedElement8);
        org.junit.Assert.assertNotNull(stackTraceElementArray0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(stackTraceElementArray2);
        org.junit.Assert.assertNotNull(serializableClass4);
        org.junit.Assert.assertNotNull(annotatedElementArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        se.mockachino.Invocation invocation0 = se.mockachino.Invocation.NULL;
        java.lang.String str1 = invocation0.getStackTraceString();
        java.lang.StackTraceElement[] stackTraceElementArray2 = invocation0.getStacktrace();
        org.junit.Assert.assertNotNull(invocation0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(stackTraceElementArray2);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        java.util.Iterator<se.mockachino.Invocation> invocationItor0 = null;
        se.mockachino.order.MockPoint mockPoint1 = null;
        se.mockachino.order.MockPoint mockPoint2 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint3 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext4 = new se.mockachino.order.OrderingContext(mockPoint2, mockPoint3);
        se.mockachino.order.MockPointIterator mockPointIterator5 = new se.mockachino.order.MockPointIterator(invocationItor0, mockPoint1, mockPoint3);
        java.util.Iterator<se.mockachino.Invocation> invocationItor6 = null;
        se.mockachino.order.MockPoint mockPoint7 = null;
        se.mockachino.order.MockPoint mockPoint8 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint9 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext10 = new se.mockachino.order.OrderingContext(mockPoint8, mockPoint9);
        se.mockachino.order.MockPointIterator mockPointIterator11 = new se.mockachino.order.MockPointIterator(invocationItor6, mockPoint7, mockPoint9);
        se.mockachino.order.MockPoint mockPoint12 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext13 = null; // flaky: se.mockachino.Mockachino.between(mockPoint9, mockPoint12);
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable14 = null;
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable15 = null;
        se.mockachino.order.MockPoint mockPoint16 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint17 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext18 = new se.mockachino.order.OrderingContext(mockPoint16, mockPoint17);
        se.mockachino.order.MockPoint mockPoint19 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint20 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext21 = new se.mockachino.order.OrderingContext(mockPoint19, mockPoint20);
        se.mockachino.order.MockPointIterable mockPointIterable22 = new se.mockachino.order.MockPointIterable(invocationIterable15, mockPoint17, mockPoint19);
        java.util.Iterator<se.mockachino.Invocation> invocationItor23 = null;
        se.mockachino.order.MockPoint mockPoint24 = null;
        se.mockachino.order.MockPoint mockPoint25 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint26 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext27 = new se.mockachino.order.OrderingContext(mockPoint25, mockPoint26);
        se.mockachino.order.MockPointIterator mockPointIterator28 = new se.mockachino.order.MockPointIterator(invocationItor23, mockPoint24, mockPoint26);
        se.mockachino.order.MockPointIterable mockPointIterable29 = new se.mockachino.order.MockPointIterable(invocationIterable14, mockPoint19, mockPoint24);
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable30 = null;
        se.mockachino.order.MockPoint mockPoint31 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint32 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext33 = new se.mockachino.order.OrderingContext(mockPoint31, mockPoint32);
        se.mockachino.order.MockPoint mockPoint34 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint35 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext36 = new se.mockachino.order.OrderingContext(mockPoint34, mockPoint35);
        se.mockachino.order.MockPointIterable mockPointIterable37 = new se.mockachino.order.MockPointIterable(invocationIterable30, mockPoint32, mockPoint34);
        se.mockachino.order.MockPoint mockPoint38 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint39 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext40 = new se.mockachino.order.OrderingContext(mockPoint38, mockPoint39);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext41 = null; // flaky: se.mockachino.Mockachino.before(mockPoint38);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext42 = new se.mockachino.order.BetweenVerifyContext(mockPoint34, mockPoint38);
        se.mockachino.order.MockPoint mockPoint45 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint46 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext47 = new se.mockachino.order.OrderingContext(mockPoint45, mockPoint46);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext48 = null; // flaky: se.mockachino.Mockachino.before(mockPoint45);
        se.mockachino.order.MockPoint mockPoint49 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint50 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext51 = new se.mockachino.order.OrderingContext(mockPoint49, mockPoint50);
        se.mockachino.order.MockPoint mockPoint52 = null; // flaky: orderingContext51.beforeLastCall();
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart53 = new se.mockachino.verifier.VerifyRangeStart((-1), 0, mockPoint45, mockPoint52);
        se.mockachino.order.MockPointIterable mockPointIterable54 = new se.mockachino.order.MockPointIterable((java.lang.Iterable<se.mockachino.Invocation>) mockPointIterable29, mockPoint34, mockPoint45);
        se.mockachino.order.MockPointIterator mockPointIterator55 = new se.mockachino.order.MockPointIterator((java.util.Iterator<se.mockachino.Invocation>) mockPointIterator5, mockPoint12, mockPoint34);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext56 = null; // flaky: se.mockachino.Mockachino.after(mockPoint34);
        org.junit.Assert.assertNotNull(mockPoint2);
        org.junit.Assert.assertNotNull(mockPoint3);
        org.junit.Assert.assertNotNull(mockPoint8);
        org.junit.Assert.assertNotNull(mockPoint9);
        org.junit.Assert.assertNotNull(mockPoint12);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext13);
        org.junit.Assert.assertNotNull(mockPoint16);
        org.junit.Assert.assertNotNull(mockPoint17);
        org.junit.Assert.assertNotNull(mockPoint19);
        org.junit.Assert.assertNotNull(mockPoint20);
        org.junit.Assert.assertNotNull(mockPoint25);
        org.junit.Assert.assertNotNull(mockPoint26);
        org.junit.Assert.assertNotNull(mockPoint31);
        org.junit.Assert.assertNotNull(mockPoint32);
        org.junit.Assert.assertNotNull(mockPoint34);
        org.junit.Assert.assertNotNull(mockPoint35);
        org.junit.Assert.assertNotNull(mockPoint38);
        org.junit.Assert.assertNotNull(mockPoint39);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext41);
        org.junit.Assert.assertNotNull(mockPoint45);
        org.junit.Assert.assertNotNull(mockPoint46);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext48);
        org.junit.Assert.assertNotNull(mockPoint49);
        org.junit.Assert.assertNotNull(mockPoint50);
// flaky:         org.junit.Assert.assertNotNull(mockPoint52);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext56);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        java.lang.Class<java.lang.String> strClass0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        se.mockachino.matchers.matcher.ClassMatcher<java.lang.String> strClassMatcher2 = new se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>(strClass0, classArray1);
        se.mockachino.matchers.matcher.BasicMatcher<java.lang.String> strBasicMatcher3 = se.mockachino.matchers.Matchers.notEq((se.mockachino.matchers.matcher.BasicMatcher<java.lang.String>) strClassMatcher2);
        java.lang.Class<java.lang.String> strClass4 = strClassMatcher2.getType();
        se.mockachino.matchers.matcher.BasicMatcher<java.lang.String> strBasicMatcher5 = se.mockachino.matchers.Matchers.eq((se.mockachino.matchers.matcher.BasicMatcher<java.lang.String>) strClassMatcher2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = strClassMatcher2.matches("10 calls");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNull(strBasicMatcher3);
        org.junit.Assert.assertNull(strClass4);
        org.junit.Assert.assertNull(strBasicMatcher5);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        se.mockachino.MockSettings mockSettings1 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler2 = mockSettings1.getFallback();
        se.mockachino.MockSettings mockSettings3 = mockSettings1.notQuick();
        se.mockachino.MockSettings mockSettings4 = mockSettings1.quick();
        se.mockachino.MockSettings mockSettings5 = mockSettings4.quick();
        java.lang.String str6 = mockSettings4.getName();
        se.mockachino.CallHandler callHandler7 = mockSettings4.getFallback();
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(callHandler2);
        org.junit.Assert.assertNotNull(mockSettings3);
        org.junit.Assert.assertNotNull(mockSettings4);
        org.junit.Assert.assertNotNull(mockSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(callHandler7);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart9 = null; // flaky: verifyRangeStart7.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher10 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart9);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer11 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher10);
        se.mockachino.matchers.matcher.Matcher[] matcherArray13 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray14 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray13;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher15 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray13);
        se.mockachino.alias.Alias[] aliasArray16 = se.mockachino.matchers.Matchers.and((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias[]>[]) matcherArray13);
        se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber> stubberOrMatcher17 = new se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber>((se.mockachino.matchers.matcher.Matcher<se.mockachino.stub.Stubber>[]) matcherArray13);
        se.mockachino.exceptions.UsageError usageError20 = new se.mockachino.exceptions.UsageError("");
        se.mockachino.exceptions.VerificationError verificationError21 = new se.mockachino.exceptions.VerificationError("", (java.lang.Exception) usageError20);
        se.mockachino.stub.Stubber stubber22 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) verificationError21);
        boolean boolean23 = stubberOrMatcher17.matches(stubber22);
        se.mockachino.exceptions.UsageError usageError25 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber26 = null; // flaky: stubber22.thenThrow((java.lang.Throwable) usageError25);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart28 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart30 = null; // flaky: verifyRangeStart28.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher31 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart30);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer32 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher31);
        java.lang.Object obj33 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod34 = null;
        java.lang.Object[] objArray35 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall36 = new se.mockachino.MethodCall(mockachinoMethod34, objArray35);
        java.lang.Object obj37 = returnAnswer32.invoke(obj33, methodCall36);
        se.mockachino.invocationhandler.CollectionsHandler collectionsHandler38 = new se.mockachino.invocationhandler.CollectionsHandler((se.mockachino.CallHandler) returnAnswer32);
// flaky:         stubber22.extend((se.mockachino.VerifyableCallHandler) returnAnswer32);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart41 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart43 = null; // flaky: verifyRangeStart41.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher44 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart43);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer45 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher44);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart47 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart49 = null; // flaky: verifyRangeStart47.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher50 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart49);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer51 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher50);
        java.lang.Object obj52 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod53 = null;
        java.lang.Object[] objArray54 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall55 = new se.mockachino.MethodCall(mockachinoMethod53, objArray54);
        java.lang.Object obj56 = returnAnswer51.invoke(obj52, methodCall55);
        se.mockachino.MockSettings mockSettings58 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler59 = mockSettings58.getFallback();
        se.mockachino.VerifyableCallHandlerWrapper verifyableCallHandlerWrapper60 = new se.mockachino.VerifyableCallHandlerWrapper(callHandler59);
        se.mockachino.matchers.matcher.Matcher[] matcherArray62 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray63 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray62;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher64 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray62);
        se.mockachino.alias.Alias[] aliasArray65 = se.mockachino.matchers.Matchers.and((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias[]>[]) matcherArray62);
        se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber> stubberOrMatcher66 = new se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber>((se.mockachino.matchers.matcher.Matcher<se.mockachino.stub.Stubber>[]) matcherArray62);
        se.mockachino.exceptions.UsageError usageError69 = new se.mockachino.exceptions.UsageError("");
        se.mockachino.exceptions.VerificationError verificationError70 = new se.mockachino.exceptions.VerificationError("", (java.lang.Exception) usageError69);
        se.mockachino.stub.Stubber stubber71 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) verificationError70);
        boolean boolean72 = stubberOrMatcher66.matches(stubber71);
        se.mockachino.exceptions.UsageError usageError74 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber75 = null; // flaky: stubber71.thenThrow((java.lang.Throwable) usageError74);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart77 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart79 = null; // flaky: verifyRangeStart77.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher80 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart79);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer81 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher80);
        java.lang.Object obj82 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod83 = null;
        java.lang.Object[] objArray84 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall85 = new se.mockachino.MethodCall(mockachinoMethod83, objArray84);
        java.lang.Object obj86 = returnAnswer81.invoke(obj82, methodCall85);
        se.mockachino.invocationhandler.CollectionsHandler collectionsHandler87 = new se.mockachino.invocationhandler.CollectionsHandler((se.mockachino.CallHandler) returnAnswer81);
// flaky:         stubber71.extend((se.mockachino.VerifyableCallHandler) returnAnswer81);
        se.mockachino.VerifyableCallHandler[] verifyableCallHandlerArray89 = new se.mockachino.VerifyableCallHandler[] { returnAnswer11, returnAnswer32, returnAnswer45, returnAnswer51, verifyableCallHandlerWrapper60, returnAnswer81 };
        se.mockachino.stub.returnvalue.SequentialAnswers sequentialAnswers90 = new se.mockachino.stub.returnvalue.SequentialAnswers((se.mockachino.VerifyableCallHandler) returnAnswer5, verifyableCallHandlerArray89);
        se.mockachino.util.MockachinoMethod mockachinoMethod91 = se.mockachino.util.MockachinoMethod.HASHCODE;
        // The following exception was thrown during execution in test generation
        try {
            sequentialAnswers90.verify(mockachinoMethod91);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Expected a return value of type int but was EqualityMatcher");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart7);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart9);
        org.junit.Assert.assertNotNull(matcherArray13);
        org.junit.Assert.assertNotNull(aliasMatcherArray14);
        org.junit.Assert.assertNotNull(aliasMatcher15);
        org.junit.Assert.assertNull(aliasArray16);
// flaky:         org.junit.Assert.assertNotNull(stubber22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky:         org.junit.Assert.assertNotNull(stubber26);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart28);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart30);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(obj37);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart41);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart43);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart47);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart49);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(mockSettings58);
        org.junit.Assert.assertNotNull(callHandler59);
        org.junit.Assert.assertNotNull(matcherArray62);
        org.junit.Assert.assertNotNull(aliasMatcherArray63);
        org.junit.Assert.assertNotNull(aliasMatcher64);
        org.junit.Assert.assertNull(aliasArray65);
// flaky:         org.junit.Assert.assertNotNull(stubber71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
// flaky:         org.junit.Assert.assertNotNull(stubber75);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart77);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart79);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[]");
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertNotNull(verifyableCallHandlerArray89);
        org.junit.Assert.assertNotNull(mockachinoMethod91);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart2 = new se.mockachino.verifier.VerifyRangeStart((int) (short) 0, 10);
        se.mockachino.MockSettings mockSettings3 = se.mockachino.Settings.spyOn((java.lang.Object) (short) 0);
        se.mockachino.MockSettings mockSettings5 = mockSettings3.name("se.mockachino.exceptions.UsageError: se.mockachino.exceptions.UsageError: ");
        org.junit.Assert.assertNotNull(mockSettings3);
        org.junit.Assert.assertNotNull(mockSettings5);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        se.mockachino.MockSettings mockSettings0 = se.mockachino.Settings.notQuick();
        org.junit.Assert.assertNotNull(mockSettings0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        java.lang.Class<se.mockachino.Invocation> invocationClass0 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray2 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray3 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray2;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher4 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray3);
        java.lang.Class<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherClass5 = methodCallMatcherAndMatcher4.getType();
        se.mockachino.MockData<se.mockachino.Invocation> invocationMockData7 = new se.mockachino.MockData<se.mockachino.Invocation>(invocationClass0, (java.lang.reflect.Type) methodCallMatcherClass5, "se.mockachino.exceptions.UsageError: ");
        invocationMockData7.resetStubs();
        java.lang.reflect.Type type9 = invocationMockData7.getTypeLiteral();
        java.util.Set<se.mockachino.util.MockachinoMethod> mockachinoMethodSet10 = invocationMockData7.getMethods();
        java.lang.Class<se.mockachino.Invocation> invocationClass11 = invocationMockData7.getInterface();
        org.junit.Assert.assertNotNull(matcherArray2);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray3);
        org.junit.Assert.assertNotNull(methodCallMatcherClass5);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(mockachinoMethodSet10);
        org.junit.Assert.assertNull(invocationClass11);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        se.mockachino.matchers.Matchers matchers0 = new se.mockachino.matchers.Matchers();
        se.mockachino.matchers.MatchersBase[] matchersBaseArray1 = new se.mockachino.matchers.MatchersBase[] { matchers0 };
        java.util.ArrayList<se.mockachino.matchers.MatchersBase> matchersBaseList2 = new java.util.ArrayList<se.mockachino.matchers.MatchersBase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBaseArray1);
        se.mockachino.matchers.MatchersBase matchersBase4 = new se.mockachino.matchers.MatchersBase();
        se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase> matchersBaseList5 = new se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase>((java.util.List<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBase4);
        se.mockachino.matchers.Matchers matchers7 = new se.mockachino.matchers.Matchers();
        // The following exception was thrown during execution in test generation
        try {
            matchersBaseList5.add((int) '4', (se.mockachino.matchers.MatchersBase) matchers7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matchersBaseArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        se.mockachino.MockSettings mockSettings1 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler2 = mockSettings1.getFallback();
        se.mockachino.MockSettings mockSettings3 = mockSettings1.notQuick();
        se.mockachino.MockSettings mockSettings4 = mockSettings1.quick();
        se.mockachino.MockSettings mockSettings5 = mockSettings4.quick();
        java.lang.String str6 = mockSettings5.getName();
        se.mockachino.MockSettings mockSettings8 = mockSettings5.name("<null>(true, true, true)");
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(callHandler2);
        org.junit.Assert.assertNotNull(mockSettings3);
        org.junit.Assert.assertNotNull(mockSettings4);
        org.junit.Assert.assertNotNull(mockSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(mockSettings8);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        se.mockachino.alias.SimpleAlias simpleAlias0 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias1 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias2 = simpleAlias0.union((se.mockachino.alias.Alias) simpleAlias1);
        se.mockachino.alias.SimpleAlias simpleAlias3 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.DifferenceAlias differenceAlias4 = new se.mockachino.alias.DifferenceAlias((se.mockachino.alias.Alias) simpleAlias0, (se.mockachino.alias.Alias) simpleAlias3);
        // The following exception was thrown during execution in test generation
        try {
            simpleAlias0.verifyAtMost((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleAlias1);
        org.junit.Assert.assertNotNull(alias2);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_CRUNCH;
        org.junit.Assert.assertNotNull(mockPoint0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        se.mockachino.verifier.Reporter reporter3 = new se.mockachino.verifier.Reporter((int) (byte) 100, (int) (short) 0, (int) '4');
        se.mockachino.util.MockachinoMethod mockachinoMethod4 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall6 = new se.mockachino.MethodCall(mockachinoMethod4, objArray5);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher7 = se.mockachino.matchers.MatchersBase.mEq(methodCall6);
        se.mockachino.MethodCall methodCall8 = se.mockachino.matchers.Matchers.not(methodCallMatcher7);
        se.mockachino.util.MockachinoMethod mockachinoMethod9 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall11 = new se.mockachino.MethodCall(mockachinoMethod9, objArray10);
        boolean boolean12 = methodCallMatcher7.matches(methodCall11);
        java.lang.StackTraceElement[] stackTraceElementArray14 = new java.lang.StackTraceElement[] {};
        java.lang.String str15 = se.mockachino.util.Formatting.toString(stackTraceElementArray14);
        java.lang.StackTraceElement[] stackTraceElementArray16 = se.mockachino.matchers.Matchers.eq(stackTraceElementArray14);
        se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable> serializableIdentityMatcher17 = new se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable>((java.io.Serializable) stackTraceElementArray14);
        se.mockachino.verifier.InvocationCount invocationCount18 = new se.mockachino.verifier.InvocationCount((java.lang.Object) (byte) 100, methodCall11, (int) (short) 0, stackTraceElementArray14);
        java.lang.String str19 = invocationCount18.getStackTraceString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = invocationCount18.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher7);
        org.junit.Assert.assertNull(methodCall8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stackTraceElementArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(stackTraceElementArray16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        se.mockachino.MockSettings mockSettings1 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler2 = mockSettings1.getFallback();
        se.mockachino.VerifyableCallHandlerWrapper verifyableCallHandlerWrapper3 = new se.mockachino.VerifyableCallHandlerWrapper(callHandler2);
        java.lang.Class<se.mockachino.Invocation> invocationClass4 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray6 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray7 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray6;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher8 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray7);
        java.lang.Class<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherClass9 = methodCallMatcherAndMatcher8.getType();
        se.mockachino.MockData<se.mockachino.Invocation> invocationMockData11 = new se.mockachino.MockData<se.mockachino.Invocation>(invocationClass4, (java.lang.reflect.Type) methodCallMatcherClass9, "se.mockachino.exceptions.UsageError: ");
        invocationMockData11.resetStubs();
        java.lang.reflect.Type type13 = invocationMockData11.getTypeLiteral();
        se.mockachino.util.MockachinoMethod mockachinoMethod14 = se.mockachino.util.MockachinoMethod.NULL;
        java.lang.reflect.Method method15 = mockachinoMethod14.getMethod();
        boolean boolean16 = mockachinoMethod14.isToStringCall();
        se.mockachino.matchers.matcher.Matcher[] matcherArray18 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray19 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray18;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher20 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray18);
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher21 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>((se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray18);
        se.mockachino.matchers.matcher.Matcher[] matcherArray23 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray24 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray23;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher25 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray24);
        se.mockachino.util.MockachinoMethod mockachinoMethod26 = null;
        java.lang.Object[] objArray27 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall28 = new se.mockachino.MethodCall(mockachinoMethod26, objArray27);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher29 = se.mockachino.matchers.MatchersBase.mEq(methodCall28);
        se.mockachino.MethodCall methodCall30 = se.mockachino.matchers.Matchers.not(methodCallMatcher29);
        boolean boolean31 = methodCallMatcherAndMatcher25.matches(methodCallMatcher29);
        se.mockachino.matchers.matcher.Matcher[] matcherArray33 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray34 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray33;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher35 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray33);
        se.mockachino.matchers.matcher.Matcher[] matcherArray36 = new se.mockachino.matchers.matcher.Matcher[] { methodCallMatcherAndMatcher21, methodCallMatcherAndMatcher25, aliasMatcher35 };
        java.util.ArrayList<se.mockachino.matchers.matcher.Matcher> matcherList37 = new java.util.ArrayList<se.mockachino.matchers.matcher.Matcher>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.matcher.Matcher>) matcherList37, matcherArray36);
        se.mockachino.matchers.MethodMatcherImpl methodMatcherImpl39 = new se.mockachino.matchers.MethodMatcherImpl(mockachinoMethod14, (java.util.List<se.mockachino.matchers.matcher.Matcher>) matcherList37);
        se.mockachino.stub.MethodStubs methodStubs40 = invocationMockData11.getStubs(mockachinoMethod14);
        verifyableCallHandlerWrapper3.verify(mockachinoMethod14);
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.MockData<se.mockachino.VerifyableCallHandlerWrapper> verifyableCallHandlerWrapperMockData42 = se.mockachino.Mockachino.getData(verifyableCallHandlerWrapper3);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.VerifyableCallHandlerWrapper@5bccbb1 is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(callHandler2);
        org.junit.Assert.assertNotNull(matcherArray6);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray7);
        org.junit.Assert.assertNotNull(methodCallMatcherClass9);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(mockachinoMethod14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(matcherArray18);
        org.junit.Assert.assertNotNull(aliasMatcherArray19);
        org.junit.Assert.assertNotNull(aliasMatcher20);
        org.junit.Assert.assertNotNull(matcherArray23);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher29);
        org.junit.Assert.assertNull(methodCall30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(matcherArray33);
        org.junit.Assert.assertNotNull(aliasMatcherArray34);
        org.junit.Assert.assertNotNull(aliasMatcher35);
        org.junit.Assert.assertNotNull(matcherArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(methodStubs40);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        java.lang.StackTraceElement[] stackTraceElementArray0 = new java.lang.StackTraceElement[] {};
        java.lang.String str1 = se.mockachino.util.Formatting.toString(stackTraceElementArray0);
        java.lang.StackTraceElement[] stackTraceElementArray2 = se.mockachino.matchers.Matchers.eq(stackTraceElementArray0);
        se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable> serializableIdentityMatcher3 = new se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable>((java.io.Serializable) stackTraceElementArray0);
        java.lang.Class<java.io.Serializable> serializableClass4 = serializableIdentityMatcher3.getType();
        se.mockachino.util.MockachinoMethod mockachinoMethod6 = se.mockachino.util.MockachinoMethod.find((java.lang.Class) serializableClass4, "no calls");
        org.junit.Assert.assertNotNull(stackTraceElementArray0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(stackTraceElementArray2);
        org.junit.Assert.assertNotNull(serializableClass4);
        org.junit.Assert.assertNull(mockachinoMethod6);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null; // flaky: betweenVerifyContext3.verifyAtMost((int) '#');
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null; // flaky: betweenVerifyContext3.verifyAtMost((int) (byte) -1);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart10 = null; // flaky: betweenVerifyContext3.verifyRange(0, (int) (byte) 100);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart13 = null; // flaky: betweenVerifyContext3.verifyRange(0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart7);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart10);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart13);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        se.mockachino.MockSettings mockSettings1 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler2 = mockSettings1.getFallback();
        se.mockachino.observer.ObserverAdder observerAdder3 = new se.mockachino.observer.ObserverAdder(callHandler2);
        se.mockachino.MockSettings mockSettings4 = se.mockachino.Settings.fallback(callHandler2);
        se.mockachino.MockSettings mockSettings5 = mockSettings4.quick();
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(callHandler2);
        org.junit.Assert.assertNotNull(mockSettings4);
        org.junit.Assert.assertNotNull(mockSettings5);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        java.lang.Object obj0 = null;
        se.mockachino.invocationhandler.PrimitiveInvocationHandler primitiveInvocationHandler1 = se.mockachino.Mockachino.PRIMITIVE_VALUES;
        se.mockachino.util.MockachinoMethod mockachinoMethod2 = se.mockachino.util.MockachinoMethod.NULL;
        java.lang.reflect.Method method3 = mockachinoMethod2.getMethod();
        boolean boolean4 = mockachinoMethod2.isToStringCall();
        se.mockachino.matchers.matcher.Matcher[] matcherArray6 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray7 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray6;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher8 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray6);
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher9 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>((se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray6);
        se.mockachino.matchers.matcher.Matcher[] matcherArray11 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray12 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray11;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher13 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray12);
        se.mockachino.util.MockachinoMethod mockachinoMethod14 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall16 = new se.mockachino.MethodCall(mockachinoMethod14, objArray15);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher17 = se.mockachino.matchers.MatchersBase.mEq(methodCall16);
        se.mockachino.MethodCall methodCall18 = se.mockachino.matchers.Matchers.not(methodCallMatcher17);
        boolean boolean19 = methodCallMatcherAndMatcher13.matches(methodCallMatcher17);
        se.mockachino.matchers.matcher.Matcher[] matcherArray21 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray22 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray21;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher23 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray21);
        se.mockachino.matchers.matcher.Matcher[] matcherArray24 = new se.mockachino.matchers.matcher.Matcher[] { methodCallMatcherAndMatcher9, methodCallMatcherAndMatcher13, aliasMatcher23 };
        java.util.ArrayList<se.mockachino.matchers.matcher.Matcher> matcherList25 = new java.util.ArrayList<se.mockachino.matchers.matcher.Matcher>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.matcher.Matcher>) matcherList25, matcherArray24);
        se.mockachino.matchers.MethodMatcherImpl methodMatcherImpl27 = new se.mockachino.matchers.MethodMatcherImpl(mockachinoMethod2, (java.util.List<se.mockachino.matchers.matcher.Matcher>) matcherList25);
        java.util.List<se.mockachino.matchers.matcher.Matcher> matcherList28 = methodMatcherImpl27.getArgumentMatchers();
        java.lang.String str29 = methodMatcherImpl27.toString();
        java.lang.String str30 = methodMatcherImpl27.toString();
        se.mockachino.util.MockachinoMethod mockachinoMethod31 = methodMatcherImpl27.getMethod();
        se.mockachino.observer.MethodObserver methodObserver32 = new se.mockachino.observer.MethodObserver(obj0, (se.mockachino.CallHandler) primitiveInvocationHandler1, (se.mockachino.matchers.MethodMatcher) methodMatcherImpl27);
        org.junit.Assert.assertNotNull(primitiveInvocationHandler1);
        org.junit.Assert.assertNotNull(mockachinoMethod2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(matcherArray6);
        org.junit.Assert.assertNotNull(aliasMatcherArray7);
        org.junit.Assert.assertNotNull(aliasMatcher8);
        org.junit.Assert.assertNotNull(matcherArray11);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher17);
        org.junit.Assert.assertNull(methodCall18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(matcherArray21);
        org.junit.Assert.assertNotNull(aliasMatcherArray22);
        org.junit.Assert.assertNotNull(aliasMatcher23);
        org.junit.Assert.assertNotNull(matcherArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(matcherList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<null>(true, true, true)" + "'", str29, "<null>(true, true, true)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<null>(true, true, true)" + "'", str30, "<null>(true, true, true)");
        org.junit.Assert.assertNotNull(mockachinoMethod31);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        se.mockachino.util.Formatting formatting0 = new se.mockachino.util.Formatting();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        java.lang.Object obj0 = null;
        se.mockachino.matchers.matcher.Matcher<java.lang.Object> objMatcher1 = se.mockachino.matchers.MatchersBase.mSame(obj0);
        org.junit.Assert.assertNotNull(objMatcher1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        se.mockachino.util.MockachinoMethod mockachinoMethod0 = se.mockachino.util.MockachinoMethod.NULL;
        java.lang.reflect.Method method1 = mockachinoMethod0.getMethod();
        boolean boolean2 = mockachinoMethod0.isToStringCall();
        se.mockachino.matchers.matcher.Matcher[] matcherArray4 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray5 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray4;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher6 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray4);
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher7 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>((se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray4);
        se.mockachino.matchers.matcher.Matcher[] matcherArray9 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray10 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray9;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher11 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray10);
        se.mockachino.util.MockachinoMethod mockachinoMethod12 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall14 = new se.mockachino.MethodCall(mockachinoMethod12, objArray13);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher15 = se.mockachino.matchers.MatchersBase.mEq(methodCall14);
        se.mockachino.MethodCall methodCall16 = se.mockachino.matchers.Matchers.not(methodCallMatcher15);
        boolean boolean17 = methodCallMatcherAndMatcher11.matches(methodCallMatcher15);
        se.mockachino.matchers.matcher.Matcher[] matcherArray19 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray20 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray19;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher21 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray19);
        se.mockachino.matchers.matcher.Matcher[] matcherArray22 = new se.mockachino.matchers.matcher.Matcher[] { methodCallMatcherAndMatcher7, methodCallMatcherAndMatcher11, aliasMatcher21 };
        java.util.ArrayList<se.mockachino.matchers.matcher.Matcher> matcherList23 = new java.util.ArrayList<se.mockachino.matchers.matcher.Matcher>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.matcher.Matcher>) matcherList23, matcherArray22);
        se.mockachino.matchers.MethodMatcherImpl methodMatcherImpl25 = new se.mockachino.matchers.MethodMatcherImpl(mockachinoMethod0, (java.util.List<se.mockachino.matchers.matcher.Matcher>) matcherList23);
        java.util.List<se.mockachino.matchers.matcher.Matcher> matcherList26 = methodMatcherImpl25.getArgumentMatchers();
        java.lang.String str27 = methodMatcherImpl25.toString();
        java.lang.String str28 = methodMatcherImpl25.toString();
        se.mockachino.util.MockachinoMethod mockachinoMethod29 = methodMatcherImpl25.getMethod();
        java.lang.String str30 = methodMatcherImpl25.toString();
        org.junit.Assert.assertNotNull(mockachinoMethod0);
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(matcherArray4);
        org.junit.Assert.assertNotNull(aliasMatcherArray5);
        org.junit.Assert.assertNotNull(aliasMatcher6);
        org.junit.Assert.assertNotNull(matcherArray9);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher15);
        org.junit.Assert.assertNull(methodCall16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(matcherArray19);
        org.junit.Assert.assertNotNull(aliasMatcherArray20);
        org.junit.Assert.assertNotNull(aliasMatcher21);
        org.junit.Assert.assertNotNull(matcherArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(matcherList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<null>(true, true, true)" + "'", str27, "<null>(true, true, true)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<null>(true, true, true)" + "'", str28, "<null>(true, true, true)");
        org.junit.Assert.assertNotNull(mockachinoMethod29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<null>(true, true, true)" + "'", str30, "<null>(true, true, true)");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        java.lang.StackTraceElement[] stackTraceElementArray0 = new java.lang.StackTraceElement[] {};
        java.lang.String str1 = se.mockachino.util.Formatting.toString(stackTraceElementArray0);
        java.lang.StackTraceElement[] stackTraceElementArray2 = se.mockachino.matchers.Matchers.eq(stackTraceElementArray0);
        se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable> serializableIdentityMatcher3 = new se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable>((java.io.Serializable) stackTraceElementArray0);
        java.lang.Class<java.io.Serializable> serializableClass4 = serializableIdentityMatcher3.getType();
        se.mockachino.matchers.matcher.Matcher[] matcherArray6 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray7 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray6;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher8 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray6);
        se.mockachino.alias.Alias[] aliasArray9 = se.mockachino.matchers.Matchers.and((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias[]>[]) matcherArray6);
        se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber> stubberOrMatcher10 = new se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber>((se.mockachino.matchers.matcher.Matcher<se.mockachino.stub.Stubber>[]) matcherArray6);
        java.lang.Class[] classArray11 = se.mockachino.matchers.Matchers.or((se.mockachino.matchers.matcher.Matcher<java.lang.Class[]>[]) matcherArray6);
        boolean boolean12 = serializableIdentityMatcher3.matches((java.io.Serializable) classArray11);
        se.mockachino.alias.SimpleAlias simpleAlias13 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.SimpleAlias simpleAlias14 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.SimpleAlias simpleAlias15 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias[] aliasArray16 = new se.mockachino.alias.Alias[] { simpleAlias13, simpleAlias14, simpleAlias15 };
        se.mockachino.alias.UnionAlias unionAlias17 = new se.mockachino.alias.UnionAlias(aliasArray16);
        se.mockachino.alias.IntersectionAlias intersectionAlias18 = new se.mockachino.alias.IntersectionAlias(aliasArray16);
        boolean boolean19 = serializableIdentityMatcher3.matches((java.io.Serializable) aliasArray16);
        org.junit.Assert.assertNotNull(stackTraceElementArray0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(stackTraceElementArray2);
        org.junit.Assert.assertNotNull(serializableClass4);
        org.junit.Assert.assertNotNull(matcherArray6);
        org.junit.Assert.assertNotNull(aliasMatcherArray7);
        org.junit.Assert.assertNotNull(aliasMatcher8);
        org.junit.Assert.assertNull(aliasArray9);
        org.junit.Assert.assertNull(classArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(simpleAlias13);
        org.junit.Assert.assertNotNull(simpleAlias14);
        org.junit.Assert.assertNotNull(simpleAlias15);
        org.junit.Assert.assertNotNull(aliasArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        java.lang.Class<se.mockachino.Invocation> invocationClass0 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray2 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray3 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray2;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher4 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray3);
        java.lang.Class<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherClass5 = methodCallMatcherAndMatcher4.getType();
        se.mockachino.MockData<se.mockachino.Invocation> invocationMockData7 = new se.mockachino.MockData<se.mockachino.Invocation>(invocationClass0, (java.lang.reflect.Type) methodCallMatcherClass5, "se.mockachino.exceptions.UsageError: ");
        invocationMockData7.resetStubs();
        java.lang.reflect.Type type9 = invocationMockData7.getTypeLiteral();
        se.mockachino.util.MockachinoMethod mockachinoMethod10 = se.mockachino.util.MockachinoMethod.NULL;
        java.lang.reflect.Method method11 = mockachinoMethod10.getMethod();
        boolean boolean12 = mockachinoMethod10.isToStringCall();
        se.mockachino.matchers.matcher.Matcher[] matcherArray14 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray15 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray14;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher16 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray14);
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher17 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>((se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray14);
        se.mockachino.matchers.matcher.Matcher[] matcherArray19 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray20 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray19;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher21 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray20);
        se.mockachino.util.MockachinoMethod mockachinoMethod22 = null;
        java.lang.Object[] objArray23 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall24 = new se.mockachino.MethodCall(mockachinoMethod22, objArray23);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher25 = se.mockachino.matchers.MatchersBase.mEq(methodCall24);
        se.mockachino.MethodCall methodCall26 = se.mockachino.matchers.Matchers.not(methodCallMatcher25);
        boolean boolean27 = methodCallMatcherAndMatcher21.matches(methodCallMatcher25);
        se.mockachino.matchers.matcher.Matcher[] matcherArray29 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray30 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray29;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher31 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray29);
        se.mockachino.matchers.matcher.Matcher[] matcherArray32 = new se.mockachino.matchers.matcher.Matcher[] { methodCallMatcherAndMatcher17, methodCallMatcherAndMatcher21, aliasMatcher31 };
        java.util.ArrayList<se.mockachino.matchers.matcher.Matcher> matcherList33 = new java.util.ArrayList<se.mockachino.matchers.matcher.Matcher>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.matcher.Matcher>) matcherList33, matcherArray32);
        se.mockachino.matchers.MethodMatcherImpl methodMatcherImpl35 = new se.mockachino.matchers.MethodMatcherImpl(mockachinoMethod10, (java.util.List<se.mockachino.matchers.matcher.Matcher>) matcherList33);
        se.mockachino.stub.MethodStubs methodStubs36 = invocationMockData7.getStubs(mockachinoMethod10);
        invocationMockData7.resetCalls();
        org.junit.Assert.assertNotNull(matcherArray2);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray3);
        org.junit.Assert.assertNotNull(methodCallMatcherClass5);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(mockachinoMethod10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(matcherArray14);
        org.junit.Assert.assertNotNull(aliasMatcherArray15);
        org.junit.Assert.assertNotNull(aliasMatcher16);
        org.junit.Assert.assertNotNull(matcherArray19);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher25);
        org.junit.Assert.assertNull(methodCall26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(matcherArray29);
        org.junit.Assert.assertNotNull(aliasMatcherArray30);
        org.junit.Assert.assertNotNull(aliasMatcher31);
        org.junit.Assert.assertNotNull(matcherArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(methodStubs36);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        java.lang.Class<java.lang.String> strClass6 = null;
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        se.mockachino.matchers.matcher.ClassMatcher<java.lang.String> strClassMatcher8 = new se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>(strClass6, classArray7);
        se.mockachino.matchers.matcher.BasicMatcher<java.lang.String> strBasicMatcher9 = se.mockachino.matchers.Matchers.notEq((se.mockachino.matchers.matcher.BasicMatcher<java.lang.String>) strClassMatcher8);
        java.lang.Class<java.lang.String> strClass10 = strClassMatcher8.getType();
        boolean boolean11 = strClassMatcherEqualityMatcher4.matches(strClassMatcher8);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart3);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNull(strBasicMatcher9);
        org.junit.Assert.assertNull(strClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        java.lang.Object obj6 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod7 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall9 = new se.mockachino.MethodCall(mockachinoMethod7, objArray8);
        java.lang.Object obj10 = returnAnswer5.invoke(obj6, methodCall9);
        se.mockachino.invocationhandler.CollectionsHandler collectionsHandler11 = new se.mockachino.invocationhandler.CollectionsHandler((se.mockachino.CallHandler) returnAnswer5);
        se.mockachino.matchers.MethodMatcher methodMatcher12 = null;
        se.mockachino.stub.MethodStub methodStub13 = new se.mockachino.stub.MethodStub((se.mockachino.CallHandler) returnAnswer5, methodMatcher12);
        se.mockachino.observer.ObserverAdder observerAdder14 = null; // flaky: se.mockachino.Mockachino.observeWith((se.mockachino.CallHandler) returnAnswer5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(obj10);
// flaky:         org.junit.Assert.assertNotNull(observerAdder14);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        se.mockachino.invocationhandler.PrimitiveInvocationHandler primitiveInvocationHandler0 = se.mockachino.Mockachino.PRIMITIVE_VALUES;
        se.mockachino.matchers.matcher.Matcher<java.lang.Short> shortMatcher1 = se.mockachino.matchers.MatchersBase.mAnyShort();
        se.mockachino.util.MockachinoMethod mockachinoMethod2 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall4 = new se.mockachino.MethodCall(mockachinoMethod2, objArray3);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher5 = se.mockachino.matchers.MatchersBase.mEq(methodCall4);
        se.mockachino.MethodCall methodCall6 = se.mockachino.matchers.Matchers.not(methodCallMatcher5);
        se.mockachino.util.MockachinoMethod mockachinoMethod7 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall9 = new se.mockachino.MethodCall(mockachinoMethod7, objArray8);
        boolean boolean10 = methodCallMatcher5.matches(methodCall9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = primitiveInvocationHandler0.invoke((java.lang.Object) shortMatcher1, methodCall9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(primitiveInvocationHandler0);
        org.junit.Assert.assertNotNull(shortMatcher1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher5);
        org.junit.Assert.assertNull(methodCall6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        java.lang.Object obj6 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod7 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall9 = new se.mockachino.MethodCall(mockachinoMethod7, objArray8);
        java.lang.Object obj10 = returnAnswer5.invoke(obj6, methodCall9);
        se.mockachino.invocationhandler.CollectionsHandler collectionsHandler11 = new se.mockachino.invocationhandler.CollectionsHandler((se.mockachino.CallHandler) returnAnswer5);
        se.mockachino.matchers.MethodMatcher methodMatcher12 = null;
        se.mockachino.stub.MethodStub methodStub13 = new se.mockachino.stub.MethodStub((se.mockachino.CallHandler) returnAnswer5, methodMatcher12);
        se.mockachino.CallHandler callHandler14 = methodStub13.getAnswer();
        se.mockachino.matchers.MethodMatcher methodMatcher15 = methodStub13.getMatcher();
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(callHandler14);
        org.junit.Assert.assertNull(methodMatcher15);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable0 = null;
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable1 = null;
        se.mockachino.order.MockPoint mockPoint2 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint3 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext4 = new se.mockachino.order.OrderingContext(mockPoint2, mockPoint3);
        se.mockachino.order.MockPoint mockPoint5 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint6 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext7 = new se.mockachino.order.OrderingContext(mockPoint5, mockPoint6);
        se.mockachino.order.MockPointIterable mockPointIterable8 = new se.mockachino.order.MockPointIterable(invocationIterable1, mockPoint3, mockPoint5);
        java.util.Iterator<se.mockachino.Invocation> invocationItor9 = null;
        se.mockachino.order.MockPoint mockPoint10 = null;
        se.mockachino.order.MockPoint mockPoint11 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint12 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext13 = new se.mockachino.order.OrderingContext(mockPoint11, mockPoint12);
        se.mockachino.order.MockPointIterator mockPointIterator14 = new se.mockachino.order.MockPointIterator(invocationItor9, mockPoint10, mockPoint12);
        se.mockachino.order.MockPointIterable mockPointIterable15 = new se.mockachino.order.MockPointIterable(invocationIterable0, mockPoint5, mockPoint10);
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable16 = null;
        se.mockachino.order.MockPoint mockPoint17 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint18 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext19 = new se.mockachino.order.OrderingContext(mockPoint17, mockPoint18);
        se.mockachino.order.MockPoint mockPoint20 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint21 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext22 = new se.mockachino.order.OrderingContext(mockPoint20, mockPoint21);
        se.mockachino.order.MockPointIterable mockPointIterable23 = new se.mockachino.order.MockPointIterable(invocationIterable16, mockPoint18, mockPoint20);
        se.mockachino.order.MockPoint mockPoint24 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint25 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext26 = new se.mockachino.order.OrderingContext(mockPoint24, mockPoint25);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext27 = null; // flaky: se.mockachino.Mockachino.before(mockPoint24);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext28 = new se.mockachino.order.BetweenVerifyContext(mockPoint20, mockPoint24);
        se.mockachino.order.MockPoint mockPoint31 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint32 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext33 = new se.mockachino.order.OrderingContext(mockPoint31, mockPoint32);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext34 = null; // flaky: se.mockachino.Mockachino.before(mockPoint31);
        se.mockachino.order.MockPoint mockPoint35 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint36 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext37 = new se.mockachino.order.OrderingContext(mockPoint35, mockPoint36);
        se.mockachino.order.MockPoint mockPoint38 = null; // flaky: orderingContext37.beforeLastCall();
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart39 = new se.mockachino.verifier.VerifyRangeStart((-1), 0, mockPoint31, mockPoint38);
        se.mockachino.order.MockPointIterable mockPointIterable40 = new se.mockachino.order.MockPointIterable((java.lang.Iterable<se.mockachino.Invocation>) mockPointIterable15, mockPoint20, mockPoint31);
        java.lang.Class<se.mockachino.Invocation> invocationClass41 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray43 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray44 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray43;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher45 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray44);
        java.lang.Class<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherClass46 = methodCallMatcherAndMatcher45.getType();
        se.mockachino.MockData<se.mockachino.Invocation> invocationMockData48 = new se.mockachino.MockData<se.mockachino.Invocation>(invocationClass41, (java.lang.reflect.Type) methodCallMatcherClass46, "se.mockachino.exceptions.UsageError: ");
        invocationMockData48.resetStubs();
        java.lang.reflect.Type type50 = invocationMockData48.getTypeLiteral();
        java.util.Set<se.mockachino.util.MockachinoMethod> mockachinoMethodSet51 = invocationMockData48.getMethods();
        invocationMockData48.resetObservers();
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable53 = null;
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable54 = null;
        se.mockachino.order.MockPoint mockPoint55 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint56 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext57 = new se.mockachino.order.OrderingContext(mockPoint55, mockPoint56);
        se.mockachino.order.MockPoint mockPoint58 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint59 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext60 = new se.mockachino.order.OrderingContext(mockPoint58, mockPoint59);
        se.mockachino.order.MockPointIterable mockPointIterable61 = new se.mockachino.order.MockPointIterable(invocationIterable54, mockPoint56, mockPoint58);
        java.util.Iterator<se.mockachino.Invocation> invocationItor62 = null;
        se.mockachino.order.MockPoint mockPoint63 = null;
        se.mockachino.order.MockPoint mockPoint64 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint65 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext66 = new se.mockachino.order.OrderingContext(mockPoint64, mockPoint65);
        se.mockachino.order.MockPointIterator mockPointIterator67 = new se.mockachino.order.MockPointIterator(invocationItor62, mockPoint63, mockPoint65);
        se.mockachino.order.MockPointIterable mockPointIterable68 = new se.mockachino.order.MockPointIterable(invocationIterable53, mockPoint58, mockPoint63);
        se.mockachino.order.MockPoint mockPoint69 = se.mockachino.Mockachino.BIG_BANG;
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable70 = invocationMockData48.getCalls(mockPoint63, mockPoint69);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext71 = new se.mockachino.order.BetweenVerifyContext(mockPoint20, mockPoint69);
        org.junit.Assert.assertNotNull(mockPoint2);
        org.junit.Assert.assertNotNull(mockPoint3);
        org.junit.Assert.assertNotNull(mockPoint5);
        org.junit.Assert.assertNotNull(mockPoint6);
        org.junit.Assert.assertNotNull(mockPoint11);
        org.junit.Assert.assertNotNull(mockPoint12);
        org.junit.Assert.assertNotNull(mockPoint17);
        org.junit.Assert.assertNotNull(mockPoint18);
        org.junit.Assert.assertNotNull(mockPoint20);
        org.junit.Assert.assertNotNull(mockPoint21);
        org.junit.Assert.assertNotNull(mockPoint24);
        org.junit.Assert.assertNotNull(mockPoint25);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext27);
        org.junit.Assert.assertNotNull(mockPoint31);
        org.junit.Assert.assertNotNull(mockPoint32);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext34);
        org.junit.Assert.assertNotNull(mockPoint35);
        org.junit.Assert.assertNotNull(mockPoint36);
// flaky:         org.junit.Assert.assertNotNull(mockPoint38);
        org.junit.Assert.assertNotNull(matcherArray43);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray44);
        org.junit.Assert.assertNotNull(methodCallMatcherClass46);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(mockachinoMethodSet51);
        org.junit.Assert.assertNotNull(mockPoint55);
        org.junit.Assert.assertNotNull(mockPoint56);
        org.junit.Assert.assertNotNull(mockPoint58);
        org.junit.Assert.assertNotNull(mockPoint59);
        org.junit.Assert.assertNotNull(mockPoint64);
        org.junit.Assert.assertNotNull(mockPoint65);
        org.junit.Assert.assertNotNull(mockPoint69);
        org.junit.Assert.assertNotNull(invocationIterable70);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        se.mockachino.verifier.Reporter reporter3 = new se.mockachino.verifier.Reporter((int) (byte) 100, (int) (short) 0, (int) '4');
        se.mockachino.util.MockachinoMethod mockachinoMethod4 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall6 = new se.mockachino.MethodCall(mockachinoMethod4, objArray5);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher7 = se.mockachino.matchers.MatchersBase.mEq(methodCall6);
        se.mockachino.MethodCall methodCall8 = se.mockachino.matchers.Matchers.not(methodCallMatcher7);
        se.mockachino.util.MockachinoMethod mockachinoMethod9 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall11 = new se.mockachino.MethodCall(mockachinoMethod9, objArray10);
        boolean boolean12 = methodCallMatcher7.matches(methodCall11);
        java.lang.StackTraceElement[] stackTraceElementArray14 = new java.lang.StackTraceElement[] {};
        java.lang.String str15 = se.mockachino.util.Formatting.toString(stackTraceElementArray14);
        java.lang.StackTraceElement[] stackTraceElementArray16 = se.mockachino.matchers.Matchers.eq(stackTraceElementArray14);
        se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable> serializableIdentityMatcher17 = new se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable>((java.io.Serializable) stackTraceElementArray14);
        se.mockachino.verifier.InvocationCount invocationCount18 = new se.mockachino.verifier.InvocationCount((java.lang.Object) (byte) 100, methodCall11, (int) (short) 0, stackTraceElementArray14);
        se.mockachino.verifier.InvocationCount invocationCount19 = new se.mockachino.verifier.InvocationCount((se.mockachino.Invocation) invocationCount18);
        int int20 = invocationCount18.getCount();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher7);
        org.junit.Assert.assertNull(methodCall8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stackTraceElementArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(stackTraceElementArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        se.mockachino.matchers.matcher.Matcher[] matcherArray1 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray2 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray1;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher3 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray2);
        se.mockachino.util.MockachinoMethod mockachinoMethod4 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall6 = new se.mockachino.MethodCall(mockachinoMethod4, objArray5);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher7 = se.mockachino.matchers.MatchersBase.mEq(methodCall6);
        se.mockachino.MethodCall methodCall8 = se.mockachino.matchers.Matchers.not(methodCallMatcher7);
        boolean boolean9 = methodCallMatcherAndMatcher3.matches(methodCallMatcher7);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer10 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) methodCallMatcher7);
        org.junit.Assert.assertNotNull(matcherArray1);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher7);
        org.junit.Assert.assertNull(methodCall8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        java.lang.Class<se.mockachino.Invocation> invocationClass0 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray2 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray3 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray2;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher4 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray3);
        java.lang.Class<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherClass5 = methodCallMatcherAndMatcher4.getType();
        se.mockachino.MockData<se.mockachino.Invocation> invocationMockData7 = new se.mockachino.MockData<se.mockachino.Invocation>(invocationClass0, (java.lang.reflect.Type) methodCallMatcherClass5, "se.mockachino.exceptions.UsageError: ");
        invocationMockData7.resetStubs();
        java.lang.String str9 = se.mockachino.util.Formatting.argument((java.lang.Object) invocationMockData7);
        se.mockachino.MockSettings mockSettings11 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler12 = mockSettings11.getFallback();
        se.mockachino.VerifyableCallHandlerWrapper verifyableCallHandlerWrapper13 = new se.mockachino.VerifyableCallHandlerWrapper(callHandler12);
        java.lang.Class<se.mockachino.Invocation> invocationClass14 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray16 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray17 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray16;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher18 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray17);
        java.lang.Class<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherClass19 = methodCallMatcherAndMatcher18.getType();
        se.mockachino.MockData<se.mockachino.Invocation> invocationMockData21 = new se.mockachino.MockData<se.mockachino.Invocation>(invocationClass14, (java.lang.reflect.Type) methodCallMatcherClass19, "se.mockachino.exceptions.UsageError: ");
        invocationMockData21.resetStubs();
        java.lang.reflect.Type type23 = invocationMockData21.getTypeLiteral();
        se.mockachino.util.MockachinoMethod mockachinoMethod24 = se.mockachino.util.MockachinoMethod.NULL;
        java.lang.reflect.Method method25 = mockachinoMethod24.getMethod();
        boolean boolean26 = mockachinoMethod24.isToStringCall();
        se.mockachino.matchers.matcher.Matcher[] matcherArray28 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray29 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray28;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher30 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray28);
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher31 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>((se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray28);
        se.mockachino.matchers.matcher.Matcher[] matcherArray33 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray34 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray33;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher35 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray34);
        se.mockachino.util.MockachinoMethod mockachinoMethod36 = null;
        java.lang.Object[] objArray37 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall38 = new se.mockachino.MethodCall(mockachinoMethod36, objArray37);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher39 = se.mockachino.matchers.MatchersBase.mEq(methodCall38);
        se.mockachino.MethodCall methodCall40 = se.mockachino.matchers.Matchers.not(methodCallMatcher39);
        boolean boolean41 = methodCallMatcherAndMatcher35.matches(methodCallMatcher39);
        se.mockachino.matchers.matcher.Matcher[] matcherArray43 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray44 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray43;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher45 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray43);
        se.mockachino.matchers.matcher.Matcher[] matcherArray46 = new se.mockachino.matchers.matcher.Matcher[] { methodCallMatcherAndMatcher31, methodCallMatcherAndMatcher35, aliasMatcher45 };
        java.util.ArrayList<se.mockachino.matchers.matcher.Matcher> matcherList47 = new java.util.ArrayList<se.mockachino.matchers.matcher.Matcher>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.matcher.Matcher>) matcherList47, matcherArray46);
        se.mockachino.matchers.MethodMatcherImpl methodMatcherImpl49 = new se.mockachino.matchers.MethodMatcherImpl(mockachinoMethod24, (java.util.List<se.mockachino.matchers.matcher.Matcher>) matcherList47);
        se.mockachino.stub.MethodStubs methodStubs50 = invocationMockData21.getStubs(mockachinoMethod24);
        verifyableCallHandlerWrapper13.verify(mockachinoMethod24);
        java.util.List<se.mockachino.observer.MethodObserver> methodObserverList52 = invocationMockData7.getObservers(mockachinoMethod24);
        org.junit.Assert.assertNotNull(matcherArray2);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray3);
        org.junit.Assert.assertNotNull(methodCallMatcherClass5);
        org.junit.Assert.assertNotNull(mockSettings11);
        org.junit.Assert.assertNotNull(callHandler12);
        org.junit.Assert.assertNotNull(matcherArray16);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray17);
        org.junit.Assert.assertNotNull(methodCallMatcherClass19);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(mockachinoMethod24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(matcherArray28);
        org.junit.Assert.assertNotNull(aliasMatcherArray29);
        org.junit.Assert.assertNotNull(aliasMatcher30);
        org.junit.Assert.assertNotNull(matcherArray33);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher39);
        org.junit.Assert.assertNull(methodCall40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(matcherArray43);
        org.junit.Assert.assertNotNull(aliasMatcherArray44);
        org.junit.Assert.assertNotNull(aliasMatcher45);
        org.junit.Assert.assertNotNull(matcherArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(methodStubs50);
        org.junit.Assert.assertNull(methodObserverList52);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        se.mockachino.order.MockPoint mockPoint2 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint3 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext4 = new se.mockachino.order.OrderingContext(mockPoint2, mockPoint3);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext5 = null; // flaky: se.mockachino.Mockachino.before(mockPoint2);
        se.mockachino.order.MockPoint mockPoint8 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint9 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext10 = new se.mockachino.order.OrderingContext(mockPoint8, mockPoint9);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext11 = null; // flaky: se.mockachino.Mockachino.before(mockPoint8);
        se.mockachino.order.MockPoint mockPoint12 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint13 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext14 = new se.mockachino.order.OrderingContext(mockPoint12, mockPoint13);
        se.mockachino.order.MockPoint mockPoint15 = null; // flaky: orderingContext14.beforeLastCall();
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart16 = new se.mockachino.verifier.VerifyRangeStart((-1), 0, mockPoint8, mockPoint15);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart17 = new se.mockachino.verifier.VerifyRangeStart((int) (short) -1, (int) '4', mockPoint2, mockPoint15);
        org.junit.Assert.assertNotNull(mockPoint2);
        org.junit.Assert.assertNotNull(mockPoint3);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext5);
        org.junit.Assert.assertNotNull(mockPoint8);
        org.junit.Assert.assertNotNull(mockPoint9);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext11);
        org.junit.Assert.assertNotNull(mockPoint12);
        org.junit.Assert.assertNotNull(mockPoint13);
// flaky:         org.junit.Assert.assertNotNull(mockPoint15);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        se.mockachino.Mockachino mockachino0 = new se.mockachino.Mockachino();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        java.util.Iterator<se.mockachino.Invocation> invocationItor0 = null;
        se.mockachino.order.MockPoint mockPoint1 = null;
        se.mockachino.order.MockPoint mockPoint2 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint3 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext4 = new se.mockachino.order.OrderingContext(mockPoint2, mockPoint3);
        se.mockachino.order.MockPointIterator mockPointIterator5 = new se.mockachino.order.MockPointIterator(invocationItor0, mockPoint1, mockPoint3);
        java.util.Iterator<se.mockachino.Invocation> invocationItor6 = null;
        se.mockachino.order.MockPoint mockPoint7 = null;
        se.mockachino.order.MockPoint mockPoint8 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint9 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext10 = new se.mockachino.order.OrderingContext(mockPoint8, mockPoint9);
        se.mockachino.order.MockPointIterator mockPointIterator11 = new se.mockachino.order.MockPointIterator(invocationItor6, mockPoint7, mockPoint9);
        se.mockachino.order.MockPoint mockPoint12 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext13 = null; // flaky: se.mockachino.Mockachino.between(mockPoint9, mockPoint12);
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable14 = null;
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable15 = null;
        se.mockachino.order.MockPoint mockPoint16 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint17 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext18 = new se.mockachino.order.OrderingContext(mockPoint16, mockPoint17);
        se.mockachino.order.MockPoint mockPoint19 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint20 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext21 = new se.mockachino.order.OrderingContext(mockPoint19, mockPoint20);
        se.mockachino.order.MockPointIterable mockPointIterable22 = new se.mockachino.order.MockPointIterable(invocationIterable15, mockPoint17, mockPoint19);
        java.util.Iterator<se.mockachino.Invocation> invocationItor23 = null;
        se.mockachino.order.MockPoint mockPoint24 = null;
        se.mockachino.order.MockPoint mockPoint25 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint26 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext27 = new se.mockachino.order.OrderingContext(mockPoint25, mockPoint26);
        se.mockachino.order.MockPointIterator mockPointIterator28 = new se.mockachino.order.MockPointIterator(invocationItor23, mockPoint24, mockPoint26);
        se.mockachino.order.MockPointIterable mockPointIterable29 = new se.mockachino.order.MockPointIterable(invocationIterable14, mockPoint19, mockPoint24);
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable30 = null;
        se.mockachino.order.MockPoint mockPoint31 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint32 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext33 = new se.mockachino.order.OrderingContext(mockPoint31, mockPoint32);
        se.mockachino.order.MockPoint mockPoint34 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint35 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext36 = new se.mockachino.order.OrderingContext(mockPoint34, mockPoint35);
        se.mockachino.order.MockPointIterable mockPointIterable37 = new se.mockachino.order.MockPointIterable(invocationIterable30, mockPoint32, mockPoint34);
        se.mockachino.order.MockPoint mockPoint38 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint39 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext40 = new se.mockachino.order.OrderingContext(mockPoint38, mockPoint39);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext41 = null; // flaky: se.mockachino.Mockachino.before(mockPoint38);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext42 = new se.mockachino.order.BetweenVerifyContext(mockPoint34, mockPoint38);
        se.mockachino.order.MockPoint mockPoint45 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint46 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext47 = new se.mockachino.order.OrderingContext(mockPoint45, mockPoint46);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext48 = null; // flaky: se.mockachino.Mockachino.before(mockPoint45);
        se.mockachino.order.MockPoint mockPoint49 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint50 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext51 = new se.mockachino.order.OrderingContext(mockPoint49, mockPoint50);
        se.mockachino.order.MockPoint mockPoint52 = null; // flaky: orderingContext51.beforeLastCall();
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart53 = new se.mockachino.verifier.VerifyRangeStart((-1), 0, mockPoint45, mockPoint52);
        se.mockachino.order.MockPointIterable mockPointIterable54 = new se.mockachino.order.MockPointIterable((java.lang.Iterable<se.mockachino.Invocation>) mockPointIterable29, mockPoint34, mockPoint45);
        se.mockachino.order.MockPointIterator mockPointIterator55 = new se.mockachino.order.MockPointIterator((java.util.Iterator<se.mockachino.Invocation>) mockPointIterator5, mockPoint12, mockPoint34);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = mockPointIterator55.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockPoint2);
        org.junit.Assert.assertNotNull(mockPoint3);
        org.junit.Assert.assertNotNull(mockPoint8);
        org.junit.Assert.assertNotNull(mockPoint9);
        org.junit.Assert.assertNotNull(mockPoint12);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext13);
        org.junit.Assert.assertNotNull(mockPoint16);
        org.junit.Assert.assertNotNull(mockPoint17);
        org.junit.Assert.assertNotNull(mockPoint19);
        org.junit.Assert.assertNotNull(mockPoint20);
        org.junit.Assert.assertNotNull(mockPoint25);
        org.junit.Assert.assertNotNull(mockPoint26);
        org.junit.Assert.assertNotNull(mockPoint31);
        org.junit.Assert.assertNotNull(mockPoint32);
        org.junit.Assert.assertNotNull(mockPoint34);
        org.junit.Assert.assertNotNull(mockPoint35);
        org.junit.Assert.assertNotNull(mockPoint38);
        org.junit.Assert.assertNotNull(mockPoint39);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext41);
        org.junit.Assert.assertNotNull(mockPoint45);
        org.junit.Assert.assertNotNull(mockPoint46);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext48);
        org.junit.Assert.assertNotNull(mockPoint49);
        org.junit.Assert.assertNotNull(mockPoint50);
// flaky:         org.junit.Assert.assertNotNull(mockPoint52);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        java.lang.Class<se.mockachino.Invocation> invocationClass0 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray2 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray3 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray2;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher4 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray3);
        java.lang.Class<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherClass5 = methodCallMatcherAndMatcher4.getType();
        se.mockachino.MockData<se.mockachino.Invocation> invocationMockData7 = new se.mockachino.MockData<se.mockachino.Invocation>(invocationClass0, (java.lang.reflect.Type) methodCallMatcherClass5, "se.mockachino.exceptions.UsageError: ");
        invocationMockData7.resetStubs();
        java.lang.String str9 = invocationMockData7.getName();
        java.lang.String str10 = invocationMockData7.getName();
        org.junit.Assert.assertNotNull(matcherArray2);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray3);
        org.junit.Assert.assertNotNull(methodCallMatcherClass5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "se.mockachino.exceptions.UsageError: " + "'", str9, "se.mockachino.exceptions.UsageError: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "se.mockachino.exceptions.UsageError: " + "'", str10, "se.mockachino.exceptions.UsageError: ");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null; // flaky: betweenVerifyContext3.verifyExactly((int) (byte) 1);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null; // flaky: betweenVerifyContext3.verifyExactly((int) '4');
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart10 = null; // flaky: betweenVerifyContext3.verifyRange((int) (byte) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.alias.Alias alias11 = se.mockachino.alias.AllAlias.fromMock((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument 100 is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart7);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart10);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        se.mockachino.exceptions.VerificationError verificationError2 = new se.mockachino.exceptions.VerificationError("0");
        se.mockachino.exceptions.VerificationError verificationError3 = new se.mockachino.exceptions.VerificationError("se.mockachino.exceptions.UsageError: ", (java.lang.Exception) verificationError2);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        java.lang.Class<se.mockachino.Invocation> invocationClass0 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray2 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray3 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray2;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher4 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray3);
        java.lang.Class<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherClass5 = methodCallMatcherAndMatcher4.getType();
        se.mockachino.MockData<se.mockachino.Invocation> invocationMockData7 = new se.mockachino.MockData<se.mockachino.Invocation>(invocationClass0, (java.lang.reflect.Type) methodCallMatcherClass5, "se.mockachino.exceptions.UsageError: ");
        invocationMockData7.resetStubs();
        java.lang.reflect.Type type9 = invocationMockData7.getTypeLiteral();
        java.util.Set<se.mockachino.util.MockachinoMethod> mockachinoMethodSet10 = invocationMockData7.getMethods();
        java.util.stream.Stream<se.mockachino.util.MockachinoMethod> mockachinoMethodStream11 = mockachinoMethodSet10.parallelStream();
        java.util.stream.Stream<se.mockachino.util.MockachinoMethod> mockachinoMethodStream12 = mockachinoMethodSet10.stream();
        org.junit.Assert.assertNotNull(matcherArray2);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray3);
        org.junit.Assert.assertNotNull(methodCallMatcherClass5);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(mockachinoMethodSet10);
        org.junit.Assert.assertNotNull(mockachinoMethodStream11);
        org.junit.Assert.assertNotNull(mockachinoMethodStream12);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        se.mockachino.matchers.Matchers matchers0 = new se.mockachino.matchers.Matchers();
        se.mockachino.matchers.MatchersBase[] matchersBaseArray1 = new se.mockachino.matchers.MatchersBase[] { matchers0 };
        java.util.ArrayList<se.mockachino.matchers.MatchersBase> matchersBaseList2 = new java.util.ArrayList<se.mockachino.matchers.MatchersBase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBaseArray1);
        se.mockachino.matchers.MatchersBase matchersBase4 = new se.mockachino.matchers.MatchersBase();
        se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase> matchersBaseList5 = new se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase>((java.util.List<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBase4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<se.mockachino.matchers.MatchersBase> matchersBaseList8 = matchersBaseList5.subList(1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matchersBaseArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        se.mockachino.matchers.matcher.RegexpMatcher regexpMatcher1 = new se.mockachino.matchers.matcher.RegexpMatcher("10 calls");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        se.mockachino.alias.SimpleAlias simpleAlias0 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias1 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias2 = simpleAlias0.union((se.mockachino.alias.Alias) simpleAlias1);
        se.mockachino.alias.SimpleAlias simpleAlias3 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias4 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias5 = simpleAlias3.union((se.mockachino.alias.Alias) simpleAlias4);
        se.mockachino.alias.Alias alias6 = simpleAlias1.union((se.mockachino.alias.Alias) simpleAlias4);
        se.mockachino.alias.SimpleAlias simpleAlias7 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias8 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias9 = simpleAlias7.union((se.mockachino.alias.Alias) simpleAlias8);
        se.mockachino.alias.SimpleAlias simpleAlias10 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias11 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias12 = simpleAlias10.union((se.mockachino.alias.Alias) simpleAlias11);
        se.mockachino.alias.Alias alias13 = simpleAlias8.union((se.mockachino.alias.Alias) simpleAlias11);
        se.mockachino.alias.SimpleAlias simpleAlias14 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias15 = simpleAlias11.difference((se.mockachino.alias.Alias) simpleAlias14);
        se.mockachino.alias.SimpleAlias simpleAlias16 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias17 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias18 = simpleAlias16.union((se.mockachino.alias.Alias) simpleAlias17);
        se.mockachino.alias.SimpleAlias simpleAlias19 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias20 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias21 = simpleAlias19.union((se.mockachino.alias.Alias) simpleAlias20);
        se.mockachino.alias.Alias alias22 = simpleAlias17.union((se.mockachino.alias.Alias) simpleAlias20);
        se.mockachino.alias.SimpleAlias simpleAlias23 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias24 = simpleAlias20.difference((se.mockachino.alias.Alias) simpleAlias23);
        se.mockachino.alias.Alias alias25 = simpleAlias11.union((se.mockachino.alias.Alias) simpleAlias23);
        se.mockachino.alias.SimpleAlias simpleAlias26 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias27 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias28 = simpleAlias26.union((se.mockachino.alias.Alias) simpleAlias27);
        se.mockachino.alias.SimpleAlias simpleAlias29 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias30 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias31 = simpleAlias29.union((se.mockachino.alias.Alias) simpleAlias30);
        se.mockachino.alias.Alias alias32 = simpleAlias27.union((se.mockachino.alias.Alias) simpleAlias30);
        se.mockachino.alias.DifferenceAlias differenceAlias33 = new se.mockachino.alias.DifferenceAlias((se.mockachino.alias.Alias) simpleAlias23, alias32);
        se.mockachino.alias.SimpleAlias simpleAlias34 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias35 = simpleAlias23.intersection((se.mockachino.alias.Alias) simpleAlias34);
        se.mockachino.alias.Alias alias36 = simpleAlias4.difference(alias35);
        org.junit.Assert.assertNotNull(simpleAlias1);
        org.junit.Assert.assertNotNull(alias2);
        org.junit.Assert.assertNotNull(simpleAlias4);
        org.junit.Assert.assertNotNull(alias5);
        org.junit.Assert.assertNotNull(alias6);
        org.junit.Assert.assertNotNull(simpleAlias8);
        org.junit.Assert.assertNotNull(alias9);
        org.junit.Assert.assertNotNull(simpleAlias11);
        org.junit.Assert.assertNotNull(alias12);
        org.junit.Assert.assertNotNull(alias13);
        org.junit.Assert.assertNotNull(simpleAlias14);
        org.junit.Assert.assertNotNull(alias15);
        org.junit.Assert.assertNotNull(simpleAlias17);
        org.junit.Assert.assertNotNull(alias18);
        org.junit.Assert.assertNotNull(simpleAlias20);
        org.junit.Assert.assertNotNull(alias21);
        org.junit.Assert.assertNotNull(alias22);
        org.junit.Assert.assertNotNull(simpleAlias23);
        org.junit.Assert.assertNotNull(alias24);
        org.junit.Assert.assertNotNull(alias25);
        org.junit.Assert.assertNotNull(simpleAlias27);
        org.junit.Assert.assertNotNull(alias28);
        org.junit.Assert.assertNotNull(simpleAlias30);
        org.junit.Assert.assertNotNull(alias31);
        org.junit.Assert.assertNotNull(alias32);
        org.junit.Assert.assertNotNull(simpleAlias34);
        org.junit.Assert.assertNotNull(alias35);
        org.junit.Assert.assertNotNull(alias36);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        java.lang.String str1 = se.mockachino.matchers.Matchers.endsWith("null");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        se.mockachino.MockSettings mockSettings1 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler2 = mockSettings1.getFallback();
        se.mockachino.VerifyableCallHandlerWrapper verifyableCallHandlerWrapper3 = new se.mockachino.VerifyableCallHandlerWrapper(callHandler2);
        java.lang.Class<se.mockachino.Invocation> invocationClass4 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray6 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray7 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray6;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher8 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray7);
        java.lang.Class<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherClass9 = methodCallMatcherAndMatcher8.getType();
        se.mockachino.MockData<se.mockachino.Invocation> invocationMockData11 = new se.mockachino.MockData<se.mockachino.Invocation>(invocationClass4, (java.lang.reflect.Type) methodCallMatcherClass9, "se.mockachino.exceptions.UsageError: ");
        invocationMockData11.resetStubs();
        java.lang.reflect.Type type13 = invocationMockData11.getTypeLiteral();
        se.mockachino.util.MockachinoMethod mockachinoMethod14 = se.mockachino.util.MockachinoMethod.NULL;
        java.lang.reflect.Method method15 = mockachinoMethod14.getMethod();
        boolean boolean16 = mockachinoMethod14.isToStringCall();
        se.mockachino.matchers.matcher.Matcher[] matcherArray18 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray19 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray18;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher20 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray18);
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher21 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>((se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray18);
        se.mockachino.matchers.matcher.Matcher[] matcherArray23 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray24 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray23;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher25 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray24);
        se.mockachino.util.MockachinoMethod mockachinoMethod26 = null;
        java.lang.Object[] objArray27 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall28 = new se.mockachino.MethodCall(mockachinoMethod26, objArray27);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher29 = se.mockachino.matchers.MatchersBase.mEq(methodCall28);
        se.mockachino.MethodCall methodCall30 = se.mockachino.matchers.Matchers.not(methodCallMatcher29);
        boolean boolean31 = methodCallMatcherAndMatcher25.matches(methodCallMatcher29);
        se.mockachino.matchers.matcher.Matcher[] matcherArray33 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray34 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray33;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher35 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray33);
        se.mockachino.matchers.matcher.Matcher[] matcherArray36 = new se.mockachino.matchers.matcher.Matcher[] { methodCallMatcherAndMatcher21, methodCallMatcherAndMatcher25, aliasMatcher35 };
        java.util.ArrayList<se.mockachino.matchers.matcher.Matcher> matcherList37 = new java.util.ArrayList<se.mockachino.matchers.matcher.Matcher>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.matcher.Matcher>) matcherList37, matcherArray36);
        se.mockachino.matchers.MethodMatcherImpl methodMatcherImpl39 = new se.mockachino.matchers.MethodMatcherImpl(mockachinoMethod14, (java.util.List<se.mockachino.matchers.matcher.Matcher>) matcherList37);
        se.mockachino.stub.MethodStubs methodStubs40 = invocationMockData11.getStubs(mockachinoMethod14);
        verifyableCallHandlerWrapper3.verify(mockachinoMethod14);
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable42 = null;
        se.mockachino.order.MockPoint mockPoint43 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint44 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext45 = new se.mockachino.order.OrderingContext(mockPoint43, mockPoint44);
        se.mockachino.order.MockPoint mockPoint46 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint47 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext48 = new se.mockachino.order.OrderingContext(mockPoint46, mockPoint47);
        se.mockachino.order.MockPointIterable mockPointIterable49 = new se.mockachino.order.MockPointIterable(invocationIterable42, mockPoint44, mockPoint46);
        se.mockachino.order.MockPoint mockPoint50 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint51 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext52 = new se.mockachino.order.OrderingContext(mockPoint50, mockPoint51);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext53 = null; // flaky: se.mockachino.Mockachino.before(mockPoint50);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext54 = new se.mockachino.order.BetweenVerifyContext(mockPoint46, mockPoint50);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart57 = null; // flaky: betweenVerifyContext54.verifyRange(1, (int) (short) 100);
        se.mockachino.util.MockachinoMethod mockachinoMethod58 = null;
        java.lang.Object[] objArray59 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall60 = new se.mockachino.MethodCall(mockachinoMethod58, objArray59);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher61 = se.mockachino.matchers.MatchersBase.mEq(methodCall60);
        java.lang.Object[] objArray62 = methodCall60.getArguments();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj63 = verifyableCallHandlerWrapper3.invoke((java.lang.Object) (short) 100, methodCall60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(callHandler2);
        org.junit.Assert.assertNotNull(matcherArray6);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray7);
        org.junit.Assert.assertNotNull(methodCallMatcherClass9);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(mockachinoMethod14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(matcherArray18);
        org.junit.Assert.assertNotNull(aliasMatcherArray19);
        org.junit.Assert.assertNotNull(aliasMatcher20);
        org.junit.Assert.assertNotNull(matcherArray23);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher29);
        org.junit.Assert.assertNull(methodCall30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(matcherArray33);
        org.junit.Assert.assertNotNull(aliasMatcherArray34);
        org.junit.Assert.assertNotNull(aliasMatcher35);
        org.junit.Assert.assertNotNull(matcherArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(methodStubs40);
        org.junit.Assert.assertNotNull(mockPoint43);
        org.junit.Assert.assertNotNull(mockPoint44);
        org.junit.Assert.assertNotNull(mockPoint46);
        org.junit.Assert.assertNotNull(mockPoint47);
        org.junit.Assert.assertNotNull(mockPoint50);
        org.junit.Assert.assertNotNull(mockPoint51);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext53);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart57);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher61);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        se.mockachino.MockSettings mockSettings1 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler2 = mockSettings1.getFallback();
        se.mockachino.MockSettings mockSettings3 = mockSettings1.notQuick();
        se.mockachino.MockSettings mockSettings4 = mockSettings1.quick();
        se.mockachino.MockSettings mockSettings5 = mockSettings4.quick();
        java.lang.String str6 = mockSettings5.getName();
        se.mockachino.CallHandler callHandler7 = mockSettings5.getFallback();
        se.mockachino.observer.ObserverAdder observerAdder8 = null; // flaky: se.mockachino.Mockachino.observeWith(callHandler7);
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(callHandler2);
        org.junit.Assert.assertNotNull(mockSettings3);
        org.junit.Assert.assertNotNull(mockSettings4);
        org.junit.Assert.assertNotNull(mockSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(callHandler7);
// flaky:         org.junit.Assert.assertNotNull(observerAdder8);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        se.mockachino.matchers.matcher.Matcher[] matcherArray1 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray2 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray1;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher3 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray1);
        se.mockachino.alias.Alias[] aliasArray4 = se.mockachino.matchers.Matchers.and((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias[]>[]) matcherArray1);
        se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber> stubberOrMatcher5 = new se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber>((se.mockachino.matchers.matcher.Matcher<se.mockachino.stub.Stubber>[]) matcherArray1);
        se.mockachino.MethodCall methodCall6 = se.mockachino.matchers.Matchers.or((se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>[]) matcherArray1);
        org.junit.Assert.assertNotNull(matcherArray1);
        org.junit.Assert.assertNotNull(aliasMatcherArray2);
        org.junit.Assert.assertNotNull(aliasMatcher3);
        org.junit.Assert.assertNull(aliasArray4);
        org.junit.Assert.assertNull(methodCall6);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        se.mockachino.util.MockachinoMethod mockachinoMethod0 = se.mockachino.util.MockachinoMethod.NULL;
        java.lang.reflect.Method method1 = mockachinoMethod0.getMethod();
        boolean boolean2 = mockachinoMethod0.isToStringCall();
        se.mockachino.matchers.matcher.Matcher[] matcherArray4 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray5 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray4;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher6 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray4);
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher7 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>((se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray4);
        se.mockachino.matchers.matcher.Matcher[] matcherArray9 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray10 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray9;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher11 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray10);
        se.mockachino.util.MockachinoMethod mockachinoMethod12 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall14 = new se.mockachino.MethodCall(mockachinoMethod12, objArray13);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher15 = se.mockachino.matchers.MatchersBase.mEq(methodCall14);
        se.mockachino.MethodCall methodCall16 = se.mockachino.matchers.Matchers.not(methodCallMatcher15);
        boolean boolean17 = methodCallMatcherAndMatcher11.matches(methodCallMatcher15);
        se.mockachino.matchers.matcher.Matcher[] matcherArray19 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray20 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray19;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher21 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray19);
        se.mockachino.matchers.matcher.Matcher[] matcherArray22 = new se.mockachino.matchers.matcher.Matcher[] { methodCallMatcherAndMatcher7, methodCallMatcherAndMatcher11, aliasMatcher21 };
        java.util.ArrayList<se.mockachino.matchers.matcher.Matcher> matcherList23 = new java.util.ArrayList<se.mockachino.matchers.matcher.Matcher>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.matcher.Matcher>) matcherList23, matcherArray22);
        se.mockachino.matchers.MethodMatcherImpl methodMatcherImpl25 = new se.mockachino.matchers.MethodMatcherImpl(mockachinoMethod0, (java.util.List<se.mockachino.matchers.matcher.Matcher>) matcherList23);
        java.util.List<se.mockachino.matchers.matcher.Matcher> matcherList26 = methodMatcherImpl25.getArgumentMatchers();
        java.lang.String str27 = se.mockachino.util.Formatting.list((java.lang.Iterable<se.mockachino.matchers.matcher.Matcher>) matcherList26);
        org.junit.Assert.assertNotNull(mockachinoMethod0);
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(matcherArray4);
        org.junit.Assert.assertNotNull(aliasMatcherArray5);
        org.junit.Assert.assertNotNull(aliasMatcher6);
        org.junit.Assert.assertNotNull(matcherArray9);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher15);
        org.junit.Assert.assertNull(methodCall16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(matcherArray19);
        org.junit.Assert.assertNotNull(aliasMatcherArray20);
        org.junit.Assert.assertNotNull(aliasMatcher21);
        org.junit.Assert.assertNotNull(matcherArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(matcherList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "true, true, true" + "'", str27, "true, true, true");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        se.mockachino.matchers.matcher.Matcher[] matcherArray2 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray3 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray2;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher4 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray2);
        se.mockachino.order.OrderingContext orderingContext5 = se.mockachino.matchers.Matchers.or((se.mockachino.matchers.matcher.Matcher<se.mockachino.order.OrderingContext>[]) matcherArray2);
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.MethodMatcherImpl> methodMatcherImplAndMatcher6 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.MethodMatcherImpl>((se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.MethodMatcherImpl>[]) matcherArray2);
        java.lang.String str7 = se.mockachino.util.Formatting.join("hi!", (java.lang.Object[]) matcherArray2);
        org.junit.Assert.assertNotNull(matcherArray2);
        org.junit.Assert.assertNotNull(aliasMatcherArray3);
        org.junit.Assert.assertNotNull(aliasMatcher4);
        org.junit.Assert.assertNull(orderingContext5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        se.mockachino.matchers.Matchers matchers0 = new se.mockachino.matchers.Matchers();
        se.mockachino.matchers.MatchersBase[] matchersBaseArray1 = new se.mockachino.matchers.MatchersBase[] { matchers0 };
        java.util.ArrayList<se.mockachino.matchers.MatchersBase> matchersBaseList2 = new java.util.ArrayList<se.mockachino.matchers.MatchersBase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBaseArray1);
        se.mockachino.matchers.MatchersBase matchersBase4 = new se.mockachino.matchers.MatchersBase();
        se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase> matchersBaseList5 = new se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase>((java.util.List<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBase4);
        se.mockachino.matchers.Matchers matchers7 = new se.mockachino.matchers.Matchers();
        se.mockachino.matchers.MatchersBase[] matchersBaseArray8 = new se.mockachino.matchers.MatchersBase[] { matchers7 };
        java.util.ArrayList<se.mockachino.matchers.MatchersBase> matchersBaseList9 = new java.util.ArrayList<se.mockachino.matchers.MatchersBase>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.MatchersBase>) matchersBaseList9, matchersBaseArray8);
        se.mockachino.matchers.MatchersBase matchersBase11 = new se.mockachino.matchers.MatchersBase();
        se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase> matchersBaseList12 = new se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase>((java.util.List<se.mockachino.matchers.MatchersBase>) matchersBaseList9, matchersBase11);
        // The following exception was thrown during execution in test generation
        try {
            matchersBaseList5.add((int) (byte) -1, matchersBase11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matchersBaseArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(matchersBaseArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        se.mockachino.matchers.matcher.Matcher[] matcherArray1 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray2 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray1;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher3 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray1);
        se.mockachino.alias.Alias[] aliasArray4 = se.mockachino.matchers.Matchers.and((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias[]>[]) matcherArray1);
        se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber> stubberOrMatcher5 = new se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber>((se.mockachino.matchers.matcher.Matcher<se.mockachino.stub.Stubber>[]) matcherArray1);
        se.mockachino.exceptions.UsageError usageError8 = new se.mockachino.exceptions.UsageError("");
        se.mockachino.exceptions.VerificationError verificationError9 = new se.mockachino.exceptions.VerificationError("", (java.lang.Exception) usageError8);
        se.mockachino.stub.Stubber stubber10 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) verificationError9);
        boolean boolean11 = stubberOrMatcher5.matches(stubber10);
        se.mockachino.exceptions.UsageError usageError13 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber14 = null; // flaky: stubber10.thenThrow((java.lang.Throwable) usageError13);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart16 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart18 = null; // flaky: verifyRangeStart16.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher19 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart18);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer20 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher19);
        java.lang.Object obj21 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod22 = null;
        java.lang.Object[] objArray23 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall24 = new se.mockachino.MethodCall(mockachinoMethod22, objArray23);
        java.lang.Object obj25 = returnAnswer20.invoke(obj21, methodCall24);
        se.mockachino.invocationhandler.CollectionsHandler collectionsHandler26 = new se.mockachino.invocationhandler.CollectionsHandler((se.mockachino.CallHandler) returnAnswer20);
// flaky:         stubber10.extend((se.mockachino.VerifyableCallHandler) returnAnswer20);
        se.mockachino.exceptions.VerificationError verificationError29 = new se.mockachino.exceptions.VerificationError("35 calls");
        java.lang.Throwable[] throwableArray30 = verificationError29.getSuppressed();
        se.mockachino.stub.Stubber stubber31 = null; // flaky: stubber10.thenThrow((java.lang.Throwable) verificationError29);
        se.mockachino.alias.SimpleAlias simpleAlias32 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias33 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias34 = simpleAlias32.union((se.mockachino.alias.Alias) simpleAlias33);
        se.mockachino.alias.SimpleAlias simpleAlias35 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias36 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias37 = simpleAlias35.union((se.mockachino.alias.Alias) simpleAlias36);
        se.mockachino.alias.Alias alias38 = simpleAlias33.union((se.mockachino.alias.Alias) simpleAlias36);
        se.mockachino.alias.SimpleAlias simpleAlias39 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias40 = simpleAlias36.difference((se.mockachino.alias.Alias) simpleAlias39);
        se.mockachino.alias.SimpleAlias simpleAlias41 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias42 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias43 = simpleAlias41.union((se.mockachino.alias.Alias) simpleAlias42);
        se.mockachino.alias.SimpleAlias simpleAlias44 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias45 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias46 = simpleAlias44.union((se.mockachino.alias.Alias) simpleAlias45);
        se.mockachino.alias.Alias alias47 = simpleAlias42.union((se.mockachino.alias.Alias) simpleAlias45);
        se.mockachino.alias.SimpleAlias simpleAlias48 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias49 = simpleAlias45.difference((se.mockachino.alias.Alias) simpleAlias48);
        se.mockachino.alias.Alias alias50 = simpleAlias36.union((se.mockachino.alias.Alias) simpleAlias48);
        se.mockachino.alias.SimpleAlias simpleAlias51 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias52 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias53 = simpleAlias51.union((se.mockachino.alias.Alias) simpleAlias52);
        se.mockachino.alias.SimpleAlias simpleAlias54 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias55 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias56 = simpleAlias54.union((se.mockachino.alias.Alias) simpleAlias55);
        se.mockachino.alias.Alias alias57 = simpleAlias52.union((se.mockachino.alias.Alias) simpleAlias55);
        se.mockachino.alias.DifferenceAlias differenceAlias58 = new se.mockachino.alias.DifferenceAlias((se.mockachino.alias.Alias) simpleAlias48, alias57);
        se.mockachino.alias.SimpleAlias simpleAlias59 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias60 = simpleAlias48.intersection((se.mockachino.alias.Alias) simpleAlias59);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             stubber31.onAnyMethod((java.lang.Object) simpleAlias59);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.alias.SimpleAlias@498e8b5d is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(matcherArray1);
        org.junit.Assert.assertNotNull(aliasMatcherArray2);
        org.junit.Assert.assertNotNull(aliasMatcher3);
        org.junit.Assert.assertNull(aliasArray4);
// flaky:         org.junit.Assert.assertNotNull(stubber10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertNotNull(stubber14);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart16);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart18);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(throwableArray30);
// flaky:         org.junit.Assert.assertNotNull(stubber31);
        org.junit.Assert.assertNotNull(simpleAlias33);
        org.junit.Assert.assertNotNull(alias34);
        org.junit.Assert.assertNotNull(simpleAlias36);
        org.junit.Assert.assertNotNull(alias37);
        org.junit.Assert.assertNotNull(alias38);
        org.junit.Assert.assertNotNull(simpleAlias39);
        org.junit.Assert.assertNotNull(alias40);
        org.junit.Assert.assertNotNull(simpleAlias42);
        org.junit.Assert.assertNotNull(alias43);
        org.junit.Assert.assertNotNull(simpleAlias45);
        org.junit.Assert.assertNotNull(alias46);
        org.junit.Assert.assertNotNull(alias47);
        org.junit.Assert.assertNotNull(simpleAlias48);
        org.junit.Assert.assertNotNull(alias49);
        org.junit.Assert.assertNotNull(alias50);
        org.junit.Assert.assertNotNull(simpleAlias52);
        org.junit.Assert.assertNotNull(alias53);
        org.junit.Assert.assertNotNull(simpleAlias55);
        org.junit.Assert.assertNotNull(alias56);
        org.junit.Assert.assertNotNull(alias57);
        org.junit.Assert.assertNotNull(simpleAlias59);
        org.junit.Assert.assertNotNull(alias60);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        se.mockachino.alias.SimpleAlias simpleAlias0 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias1 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias2 = simpleAlias0.union((se.mockachino.alias.Alias) simpleAlias1);
        se.mockachino.alias.SimpleAlias simpleAlias3 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias4 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias5 = simpleAlias3.union((se.mockachino.alias.Alias) simpleAlias4);
        se.mockachino.alias.Alias alias6 = simpleAlias1.union((se.mockachino.alias.Alias) simpleAlias4);
        java.lang.Class<?> wildcardClass7 = simpleAlias4.getClass();
        org.junit.Assert.assertNotNull(simpleAlias1);
        org.junit.Assert.assertNotNull(alias2);
        org.junit.Assert.assertNotNull(simpleAlias4);
        org.junit.Assert.assertNotNull(alias5);
        org.junit.Assert.assertNotNull(alias6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        se.mockachino.alias.SimpleAlias simpleAlias0 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias1 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias2 = simpleAlias0.union((se.mockachino.alias.Alias) simpleAlias1);
        se.mockachino.alias.SimpleAlias simpleAlias3 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias4 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias5 = simpleAlias3.union((se.mockachino.alias.Alias) simpleAlias4);
        se.mockachino.alias.Alias alias6 = simpleAlias1.union((se.mockachino.alias.Alias) simpleAlias4);
        se.mockachino.alias.SimpleAlias simpleAlias7 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias8 = simpleAlias4.difference((se.mockachino.alias.Alias) simpleAlias7);
        // The following exception was thrown during execution in test generation
        try {
            simpleAlias7.verifyAtMost((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleAlias1);
        org.junit.Assert.assertNotNull(alias2);
        org.junit.Assert.assertNotNull(simpleAlias4);
        org.junit.Assert.assertNotNull(alias5);
        org.junit.Assert.assertNotNull(alias6);
        org.junit.Assert.assertNotNull(simpleAlias7);
        org.junit.Assert.assertNotNull(alias8);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        se.mockachino.alias.SimpleAlias simpleAlias0 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias1 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias2 = simpleAlias0.union((se.mockachino.alias.Alias) simpleAlias1);
        se.mockachino.alias.SimpleAlias simpleAlias3 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias4 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias5 = simpleAlias3.union((se.mockachino.alias.Alias) simpleAlias4);
        se.mockachino.alias.Alias alias6 = simpleAlias1.union((se.mockachino.alias.Alias) simpleAlias4);
        se.mockachino.alias.SimpleAlias simpleAlias7 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias8 = simpleAlias4.difference((se.mockachino.alias.Alias) simpleAlias7);
        se.mockachino.alias.SimpleAlias simpleAlias9 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias10 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias11 = simpleAlias9.union((se.mockachino.alias.Alias) simpleAlias10);
        se.mockachino.alias.SimpleAlias simpleAlias12 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias13 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias14 = simpleAlias12.union((se.mockachino.alias.Alias) simpleAlias13);
        se.mockachino.alias.Alias alias15 = simpleAlias10.union((se.mockachino.alias.Alias) simpleAlias13);
        se.mockachino.alias.SimpleAlias simpleAlias16 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias17 = simpleAlias13.difference((se.mockachino.alias.Alias) simpleAlias16);
        se.mockachino.alias.Alias alias18 = simpleAlias4.union((se.mockachino.alias.Alias) simpleAlias16);
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.MockData<se.mockachino.alias.SimpleAlias> simpleAliasMockData19 = se.mockachino.Mockachino.getData(simpleAlias16);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.alias.SimpleAlias@356b9484 is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleAlias1);
        org.junit.Assert.assertNotNull(alias2);
        org.junit.Assert.assertNotNull(simpleAlias4);
        org.junit.Assert.assertNotNull(alias5);
        org.junit.Assert.assertNotNull(alias6);
        org.junit.Assert.assertNotNull(simpleAlias7);
        org.junit.Assert.assertNotNull(alias8);
        org.junit.Assert.assertNotNull(simpleAlias10);
        org.junit.Assert.assertNotNull(alias11);
        org.junit.Assert.assertNotNull(simpleAlias13);
        org.junit.Assert.assertNotNull(alias14);
        org.junit.Assert.assertNotNull(alias15);
        org.junit.Assert.assertNotNull(simpleAlias16);
        org.junit.Assert.assertNotNull(alias17);
        org.junit.Assert.assertNotNull(alias18);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null; // flaky: betweenVerifyContext3.verifyExactly((int) (byte) 1);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null; // flaky: betweenVerifyContext3.verifyExactly((int) '4');
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart9 = null; // flaky: betweenVerifyContext3.verifyAtMost(0);
        se.mockachino.order.OrderingContext orderingContext10 = null; // flaky: betweenVerifyContext3.newOrdering();
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart7);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart9);
// flaky:         org.junit.Assert.assertNotNull(orderingContext10);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        se.mockachino.matchers.matcher.Matcher[] matcherArray1 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray2 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray1;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher3 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray1);
        se.mockachino.alias.Alias[] aliasArray4 = se.mockachino.matchers.Matchers.and((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias[]>[]) matcherArray1);
        se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber> stubberOrMatcher5 = new se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber>((se.mockachino.matchers.matcher.Matcher<se.mockachino.stub.Stubber>[]) matcherArray1);
        java.lang.Class<se.mockachino.stub.Stubber> stubberClass6 = stubberOrMatcher5.getType();
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber>> stubberOrMatcherMatcher7 = se.mockachino.matchers.MatchersBase.mEq(stubberOrMatcher5);
        java.lang.Class<se.mockachino.stub.Stubber> stubberClass8 = stubberOrMatcher5.getType();
        org.junit.Assert.assertNotNull(matcherArray1);
        org.junit.Assert.assertNotNull(aliasMatcherArray2);
        org.junit.Assert.assertNotNull(aliasMatcher3);
        org.junit.Assert.assertNull(aliasArray4);
        org.junit.Assert.assertNotNull(stubberClass6);
        org.junit.Assert.assertNotNull(stubberOrMatcherMatcher7);
        org.junit.Assert.assertNotNull(stubberClass8);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.MatchersBase> matchersBaseMatcher0 = null;
        se.mockachino.matchers.matcher.NotMatcher<se.mockachino.matchers.MatchersBase> matchersBaseNotMatcher1 = new se.mockachino.matchers.matcher.NotMatcher<se.mockachino.matchers.MatchersBase>(matchersBaseMatcher0);
        se.mockachino.matchers.matcher.NotMatcher<se.mockachino.matchers.MatchersBase> matchersBaseNotMatcher2 = new se.mockachino.matchers.matcher.NotMatcher<se.mockachino.matchers.MatchersBase>((se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.MatchersBase>) matchersBaseNotMatcher1);
        se.mockachino.invocationhandler.PrimitiveInvocationHandler primitiveInvocationHandler3 = new se.mockachino.invocationhandler.PrimitiveInvocationHandler();
        se.mockachino.matchers.matcher.Matcher<se.mockachino.invocationhandler.PrimitiveInvocationHandler> primitiveInvocationHandlerMatcher4 = se.mockachino.matchers.MatchersBase.mSame(primitiveInvocationHandler3);
        se.mockachino.matchers.matcher.Matcher[] matcherArray6 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray7 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray6;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher8 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray7);
        se.mockachino.util.MockachinoMethod mockachinoMethod9 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall11 = new se.mockachino.MethodCall(mockachinoMethod9, objArray10);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher12 = se.mockachino.matchers.MatchersBase.mEq(methodCall11);
        boolean boolean13 = methodCallMatcherAndMatcher8.matches(methodCallMatcher12);
        java.lang.Class<se.mockachino.MethodCall> methodCallClass14 = methodCallMatcher12.getType();
        se.mockachino.matchers.matcher.Matcher[] matcherArray16 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray17 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray16;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher18 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray16);
        se.mockachino.alias.Alias[] aliasArray19 = se.mockachino.matchers.Matchers.and((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias[]>[]) matcherArray16);
        se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber> stubberOrMatcher20 = new se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber>((se.mockachino.matchers.matcher.Matcher<se.mockachino.stub.Stubber>[]) matcherArray16);
        se.mockachino.matchers.matcher.Matcher[] matcherArray22 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray23 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray22;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher24 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray22);
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher25 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>((se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray22);
        se.mockachino.matchers.matcher.Matcher[] matcherArray26 = new se.mockachino.matchers.matcher.Matcher[] { matchersBaseNotMatcher1, primitiveInvocationHandlerMatcher4, methodCallMatcher12, stubberOrMatcher20, methodCallMatcherAndMatcher25 };
        java.lang.Class<se.mockachino.matchers.MatcherThreadHandler> matcherThreadHandlerClass27 = null;
        se.mockachino.matchers.ArrayMatcher<se.mockachino.matchers.MatcherThreadHandler> matcherThreadHandlerArrayMatcher29 = new se.mockachino.matchers.ArrayMatcher<se.mockachino.matchers.MatcherThreadHandler>(matcherArray26, matcherThreadHandlerClass27, true);
        java.lang.Class<se.mockachino.matchers.MatcherThreadHandler> matcherThreadHandlerClass30 = matcherThreadHandlerArrayMatcher29.getType();
        java.lang.Class<se.mockachino.matchers.MatcherThreadHandler> matcherThreadHandlerClass31 = matcherThreadHandlerArrayMatcher29.getType();
        org.junit.Assert.assertNotNull(primitiveInvocationHandlerMatcher4);
        org.junit.Assert.assertNotNull(matcherArray6);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(methodCallClass14);
        org.junit.Assert.assertNotNull(matcherArray16);
        org.junit.Assert.assertNotNull(aliasMatcherArray17);
        org.junit.Assert.assertNotNull(aliasMatcher18);
        org.junit.Assert.assertNull(aliasArray19);
        org.junit.Assert.assertNotNull(matcherArray22);
        org.junit.Assert.assertNotNull(aliasMatcherArray23);
        org.junit.Assert.assertNotNull(aliasMatcher24);
        org.junit.Assert.assertNotNull(matcherArray26);
        org.junit.Assert.assertNull(matcherThreadHandlerClass30);
        org.junit.Assert.assertNull(matcherThreadHandlerClass31);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        se.mockachino.alias.SimpleAlias simpleAlias0 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.SimpleAlias simpleAlias1 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.SimpleAlias simpleAlias2 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.SimpleAlias simpleAlias3 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias[] aliasArray4 = new se.mockachino.alias.Alias[] { simpleAlias1, simpleAlias2, simpleAlias3 };
        se.mockachino.alias.UnionAlias unionAlias5 = new se.mockachino.alias.UnionAlias(aliasArray4);
        se.mockachino.alias.IntersectionAlias intersectionAlias6 = new se.mockachino.alias.IntersectionAlias(aliasArray4);
        se.mockachino.alias.Alias alias7 = simpleAlias0.intersection((se.mockachino.alias.Alias) intersectionAlias6);
        org.junit.Assert.assertNotNull(simpleAlias0);
        org.junit.Assert.assertNotNull(simpleAlias1);
        org.junit.Assert.assertNotNull(simpleAlias2);
        org.junit.Assert.assertNotNull(simpleAlias3);
        org.junit.Assert.assertNotNull(aliasArray4);
        org.junit.Assert.assertNotNull(alias7);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart9 = null; // flaky: verifyRangeStart7.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher10 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart9);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer11 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher10);
        se.mockachino.matchers.matcher.Matcher[] matcherArray13 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray14 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray13;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher15 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray13);
        se.mockachino.alias.Alias[] aliasArray16 = se.mockachino.matchers.Matchers.and((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias[]>[]) matcherArray13);
        se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber> stubberOrMatcher17 = new se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber>((se.mockachino.matchers.matcher.Matcher<se.mockachino.stub.Stubber>[]) matcherArray13);
        se.mockachino.exceptions.UsageError usageError20 = new se.mockachino.exceptions.UsageError("");
        se.mockachino.exceptions.VerificationError verificationError21 = new se.mockachino.exceptions.VerificationError("", (java.lang.Exception) usageError20);
        se.mockachino.stub.Stubber stubber22 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) verificationError21);
        boolean boolean23 = stubberOrMatcher17.matches(stubber22);
        se.mockachino.exceptions.UsageError usageError25 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber26 = null; // flaky: stubber22.thenThrow((java.lang.Throwable) usageError25);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart28 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart30 = null; // flaky: verifyRangeStart28.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher31 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart30);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer32 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher31);
        java.lang.Object obj33 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod34 = null;
        java.lang.Object[] objArray35 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall36 = new se.mockachino.MethodCall(mockachinoMethod34, objArray35);
        java.lang.Object obj37 = returnAnswer32.invoke(obj33, methodCall36);
        se.mockachino.invocationhandler.CollectionsHandler collectionsHandler38 = new se.mockachino.invocationhandler.CollectionsHandler((se.mockachino.CallHandler) returnAnswer32);
// flaky:         stubber22.extend((se.mockachino.VerifyableCallHandler) returnAnswer32);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart41 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart43 = null; // flaky: verifyRangeStart41.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher44 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart43);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer45 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher44);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart47 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart49 = null; // flaky: verifyRangeStart47.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher50 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart49);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer51 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher50);
        java.lang.Object obj52 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod53 = null;
        java.lang.Object[] objArray54 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall55 = new se.mockachino.MethodCall(mockachinoMethod53, objArray54);
        java.lang.Object obj56 = returnAnswer51.invoke(obj52, methodCall55);
        se.mockachino.MockSettings mockSettings58 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler59 = mockSettings58.getFallback();
        se.mockachino.VerifyableCallHandlerWrapper verifyableCallHandlerWrapper60 = new se.mockachino.VerifyableCallHandlerWrapper(callHandler59);
        se.mockachino.matchers.matcher.Matcher[] matcherArray62 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray63 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray62;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher64 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray62);
        se.mockachino.alias.Alias[] aliasArray65 = se.mockachino.matchers.Matchers.and((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias[]>[]) matcherArray62);
        se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber> stubberOrMatcher66 = new se.mockachino.matchers.matcher.OrMatcher<se.mockachino.stub.Stubber>((se.mockachino.matchers.matcher.Matcher<se.mockachino.stub.Stubber>[]) matcherArray62);
        se.mockachino.exceptions.UsageError usageError69 = new se.mockachino.exceptions.UsageError("");
        se.mockachino.exceptions.VerificationError verificationError70 = new se.mockachino.exceptions.VerificationError("", (java.lang.Exception) usageError69);
        se.mockachino.stub.Stubber stubber71 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) verificationError70);
        boolean boolean72 = stubberOrMatcher66.matches(stubber71);
        se.mockachino.exceptions.UsageError usageError74 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber75 = null; // flaky: stubber71.thenThrow((java.lang.Throwable) usageError74);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart77 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart79 = null; // flaky: verifyRangeStart77.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher80 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart79);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer81 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher80);
        java.lang.Object obj82 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod83 = null;
        java.lang.Object[] objArray84 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall85 = new se.mockachino.MethodCall(mockachinoMethod83, objArray84);
        java.lang.Object obj86 = returnAnswer81.invoke(obj82, methodCall85);
        se.mockachino.invocationhandler.CollectionsHandler collectionsHandler87 = new se.mockachino.invocationhandler.CollectionsHandler((se.mockachino.CallHandler) returnAnswer81);
// flaky:         stubber71.extend((se.mockachino.VerifyableCallHandler) returnAnswer81);
        se.mockachino.VerifyableCallHandler[] verifyableCallHandlerArray89 = new se.mockachino.VerifyableCallHandler[] { returnAnswer11, returnAnswer32, returnAnswer45, returnAnswer51, verifyableCallHandlerWrapper60, returnAnswer81 };
        se.mockachino.stub.returnvalue.SequentialAnswers sequentialAnswers90 = new se.mockachino.stub.returnvalue.SequentialAnswers((se.mockachino.VerifyableCallHandler) returnAnswer5, verifyableCallHandlerArray89);
        se.mockachino.stub.Stubber stubber91 = new se.mockachino.stub.Stubber(sequentialAnswers90);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart7);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart9);
        org.junit.Assert.assertNotNull(matcherArray13);
        org.junit.Assert.assertNotNull(aliasMatcherArray14);
        org.junit.Assert.assertNotNull(aliasMatcher15);
        org.junit.Assert.assertNull(aliasArray16);
// flaky:         org.junit.Assert.assertNotNull(stubber22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky:         org.junit.Assert.assertNotNull(stubber26);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart28);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart30);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(obj37);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart41);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart43);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart47);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart49);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(mockSettings58);
        org.junit.Assert.assertNotNull(callHandler59);
        org.junit.Assert.assertNotNull(matcherArray62);
        org.junit.Assert.assertNotNull(aliasMatcherArray63);
        org.junit.Assert.assertNotNull(aliasMatcher64);
        org.junit.Assert.assertNull(aliasArray65);
// flaky:         org.junit.Assert.assertNotNull(stubber71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
// flaky:         org.junit.Assert.assertNotNull(stubber75);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart77);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart79);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[]");
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertNotNull(verifyableCallHandlerArray89);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart2 = new se.mockachino.verifier.VerifyRangeStart((int) ' ', 1);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        se.mockachino.exceptions.UsageError usageError2 = new se.mockachino.exceptions.UsageError("");
        se.mockachino.exceptions.VerificationError verificationError3 = new se.mockachino.exceptions.VerificationError("", (java.lang.Exception) usageError2);
        se.mockachino.verifier.BadUsageHandler badUsageHandler4 = se.mockachino.order.InOrderVerifyHandler.BAD_USAGE_HANDLER;
        se.mockachino.matchers.matcher.Matcher[] matcherArray6 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray7 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray6;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher8 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray7);
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher9 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) methodCallMatcherAndMatcher8);
        se.mockachino.matchers.matcher.ClassMatcher<java.lang.String> strClassMatcher10 = null;
        boolean boolean11 = strClassMatcherEqualityMatcher9.matches(strClassMatcher10);
        se.mockachino.invocationhandler.PrimitiveInvocationHandler primitiveInvocationHandler12 = new se.mockachino.invocationhandler.PrimitiveInvocationHandler();
        se.mockachino.matchers.matcher.Matcher<se.mockachino.invocationhandler.PrimitiveInvocationHandler> primitiveInvocationHandlerMatcher13 = se.mockachino.matchers.MatchersBase.mSame(primitiveInvocationHandler12);
        se.mockachino.util.MockachinoMethod mockachinoMethod14 = se.mockachino.util.MockachinoMethod.NULL;
        java.lang.reflect.Method method15 = mockachinoMethod14.getMethod();
        boolean boolean16 = mockachinoMethod14.isToStringCall();
        se.mockachino.matchers.matcher.Matcher[] matcherArray18 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray19 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray18;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher20 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray18);
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher21 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>((se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray18);
        se.mockachino.matchers.matcher.Matcher[] matcherArray23 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray24 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray23;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher25 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray24);
        se.mockachino.util.MockachinoMethod mockachinoMethod26 = null;
        java.lang.Object[] objArray27 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall28 = new se.mockachino.MethodCall(mockachinoMethod26, objArray27);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher29 = se.mockachino.matchers.MatchersBase.mEq(methodCall28);
        se.mockachino.MethodCall methodCall30 = se.mockachino.matchers.Matchers.not(methodCallMatcher29);
        boolean boolean31 = methodCallMatcherAndMatcher25.matches(methodCallMatcher29);
        se.mockachino.matchers.matcher.Matcher[] matcherArray33 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray34 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray33;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher35 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray33);
        se.mockachino.matchers.matcher.Matcher[] matcherArray36 = new se.mockachino.matchers.matcher.Matcher[] { methodCallMatcherAndMatcher21, methodCallMatcherAndMatcher25, aliasMatcher35 };
        java.util.ArrayList<se.mockachino.matchers.matcher.Matcher> matcherList37 = new java.util.ArrayList<se.mockachino.matchers.matcher.Matcher>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.matcher.Matcher>) matcherList37, matcherArray36);
        se.mockachino.matchers.MethodMatcherImpl methodMatcherImpl39 = new se.mockachino.matchers.MethodMatcherImpl(mockachinoMethod14, (java.util.List<se.mockachino.matchers.matcher.Matcher>) matcherList37);
        java.util.List<se.mockachino.matchers.matcher.Matcher> matcherList40 = methodMatcherImpl39.getArgumentMatchers();
        java.lang.String str41 = methodMatcherImpl39.toString();
        java.lang.String str42 = methodMatcherImpl39.toString();
        se.mockachino.observer.MethodObserver methodObserver43 = new se.mockachino.observer.MethodObserver((java.lang.Object) strClassMatcherEqualityMatcher9, (se.mockachino.CallHandler) primitiveInvocationHandler12, (se.mockachino.matchers.MethodMatcher) methodMatcherImpl39);
        se.mockachino.observer.MethodObserver methodObserver44 = new se.mockachino.observer.MethodObserver((java.lang.Object) verificationError3, (se.mockachino.CallHandler) badUsageHandler4, (se.mockachino.matchers.MethodMatcher) methodMatcherImpl39);
        org.junit.Assert.assertNotNull(badUsageHandler4);
        org.junit.Assert.assertNotNull(matcherArray6);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(primitiveInvocationHandlerMatcher13);
        org.junit.Assert.assertNotNull(mockachinoMethod14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(matcherArray18);
        org.junit.Assert.assertNotNull(aliasMatcherArray19);
        org.junit.Assert.assertNotNull(aliasMatcher20);
        org.junit.Assert.assertNotNull(matcherArray23);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher29);
        org.junit.Assert.assertNull(methodCall30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(matcherArray33);
        org.junit.Assert.assertNotNull(aliasMatcherArray34);
        org.junit.Assert.assertNotNull(aliasMatcher35);
        org.junit.Assert.assertNotNull(matcherArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(matcherList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<null>(true, true, true)" + "'", str41, "<null>(true, true, true)");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<null>(true, true, true)" + "'", str42, "<null>(true, true, true)");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        se.mockachino.util.MockachinoMethod mockachinoMethod0 = se.mockachino.util.MockachinoMethod.NULL;
        java.lang.reflect.Method method1 = mockachinoMethod0.getMethod();
        boolean boolean2 = mockachinoMethod0.isToStringCall();
        se.mockachino.matchers.matcher.Matcher[] matcherArray4 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray5 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray4;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher6 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray4);
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher7 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>((se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray4);
        se.mockachino.matchers.matcher.Matcher[] matcherArray9 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray10 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray9;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher11 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray10);
        se.mockachino.util.MockachinoMethod mockachinoMethod12 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall14 = new se.mockachino.MethodCall(mockachinoMethod12, objArray13);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher15 = se.mockachino.matchers.MatchersBase.mEq(methodCall14);
        se.mockachino.MethodCall methodCall16 = se.mockachino.matchers.Matchers.not(methodCallMatcher15);
        boolean boolean17 = methodCallMatcherAndMatcher11.matches(methodCallMatcher15);
        se.mockachino.matchers.matcher.Matcher[] matcherArray19 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray20 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray19;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher21 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray19);
        se.mockachino.matchers.matcher.Matcher[] matcherArray22 = new se.mockachino.matchers.matcher.Matcher[] { methodCallMatcherAndMatcher7, methodCallMatcherAndMatcher11, aliasMatcher21 };
        java.util.ArrayList<se.mockachino.matchers.matcher.Matcher> matcherList23 = new java.util.ArrayList<se.mockachino.matchers.matcher.Matcher>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.matcher.Matcher>) matcherList23, matcherArray22);
        se.mockachino.matchers.MethodMatcherImpl methodMatcherImpl25 = new se.mockachino.matchers.MethodMatcherImpl(mockachinoMethod0, (java.util.List<se.mockachino.matchers.matcher.Matcher>) matcherList23);
        java.util.List<se.mockachino.matchers.matcher.Matcher> matcherList26 = methodMatcherImpl25.getArgumentMatchers();
        java.lang.String str27 = methodMatcherImpl25.toString();
        se.mockachino.matchers.matcher.Matcher matcher29 = se.mockachino.matchers.MatcherThreadHandler.getMatcher((java.lang.Object) str27, false);
        org.junit.Assert.assertNotNull(mockachinoMethod0);
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(matcherArray4);
        org.junit.Assert.assertNotNull(aliasMatcherArray5);
        org.junit.Assert.assertNotNull(aliasMatcher6);
        org.junit.Assert.assertNotNull(matcherArray9);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher15);
        org.junit.Assert.assertNull(methodCall16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(matcherArray19);
        org.junit.Assert.assertNotNull(aliasMatcherArray20);
        org.junit.Assert.assertNotNull(aliasMatcher21);
        org.junit.Assert.assertNotNull(matcherArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(matcherList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<null>(true, true, true)" + "'", str27, "<null>(true, true, true)");
        org.junit.Assert.assertNotNull(matcher29);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        se.mockachino.util.MockachinoMethod mockachinoMethod0 = se.mockachino.util.MockachinoMethod.NULL;
        boolean boolean1 = mockachinoMethod0.isToStringCall();
        java.lang.String str2 = mockachinoMethod0.getName();
        org.junit.Assert.assertNotNull(mockachinoMethod0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<null>" + "'", str2, "<null>");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        se.mockachino.alias.SimpleAlias simpleAlias0 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.SimpleAlias simpleAlias1 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.SimpleAlias simpleAlias2 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias[] aliasArray3 = new se.mockachino.alias.Alias[] { simpleAlias0, simpleAlias1, simpleAlias2 };
        se.mockachino.alias.UnionAlias unionAlias4 = new se.mockachino.alias.UnionAlias(aliasArray3);
        se.mockachino.alias.IntersectionAlias intersectionAlias5 = new se.mockachino.alias.IntersectionAlias(aliasArray3);
        // The following exception was thrown during execution in test generation
        try {
            intersectionAlias5.verifyOnce();
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleAlias0);
        org.junit.Assert.assertNotNull(simpleAlias1);
        org.junit.Assert.assertNotNull(simpleAlias2);
        org.junit.Assert.assertNotNull(aliasArray3);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        se.mockachino.matchers.matcher.RegexpMatcher regexpMatcher1 = new se.mockachino.matchers.matcher.RegexpMatcher("");
        java.lang.String str2 = regexpMatcher1.asString();
        java.lang.String str3 = regexpMatcher1.asString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "regexp(\"\")" + "'", str2, "regexp(\"\")");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "regexp(\"\")" + "'", str3, "regexp(\"\")");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        se.mockachino.matchers.MethodMatcher methodMatcher0 = null;
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable1 = null;
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable2 = null;
        se.mockachino.order.MockPoint mockPoint3 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint4 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext5 = new se.mockachino.order.OrderingContext(mockPoint3, mockPoint4);
        se.mockachino.order.MockPoint mockPoint6 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint7 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext8 = new se.mockachino.order.OrderingContext(mockPoint6, mockPoint7);
        se.mockachino.order.MockPointIterable mockPointIterable9 = new se.mockachino.order.MockPointIterable(invocationIterable2, mockPoint4, mockPoint6);
        java.util.Iterator<se.mockachino.Invocation> invocationItor10 = null;
        se.mockachino.order.MockPoint mockPoint11 = null;
        se.mockachino.order.MockPoint mockPoint12 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint13 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext14 = new se.mockachino.order.OrderingContext(mockPoint12, mockPoint13);
        se.mockachino.order.MockPointIterator mockPointIterator15 = new se.mockachino.order.MockPointIterator(invocationItor10, mockPoint11, mockPoint13);
        se.mockachino.order.MockPointIterable mockPointIterable16 = new se.mockachino.order.MockPointIterable(invocationIterable1, mockPoint6, mockPoint11);
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable17 = se.mockachino.matchers.Matchers.same((java.lang.Iterable<se.mockachino.Invocation>) mockPointIterable16);
        se.mockachino.order.MockPoint mockPoint18 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint19 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext20 = new se.mockachino.order.OrderingContext(mockPoint18, mockPoint19);
        se.mockachino.order.InOrderVerify inOrderVerify22 = null; // flaky: orderingContext20.verifyAtLeast(0);
        se.mockachino.order.MockPoint mockPoint23 = null; // flaky: orderingContext20.atLastCall();
        se.mockachino.order.MockPoint mockPoint24 = null; // flaky: orderingContext20.beforeLastCall();
        java.util.Iterator<se.mockachino.Invocation> invocationItor25 = null;
        se.mockachino.order.MockPoint mockPoint26 = null;
        se.mockachino.order.MockPoint mockPoint27 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint28 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext29 = new se.mockachino.order.OrderingContext(mockPoint27, mockPoint28);
        se.mockachino.order.MockPointIterator mockPointIterator30 = new se.mockachino.order.MockPointIterator(invocationItor25, mockPoint26, mockPoint28);
        se.mockachino.order.MockPointIterable mockPointIterable31 = new se.mockachino.order.MockPointIterable(invocationIterable17, mockPoint24, mockPoint26);
        se.mockachino.verifier.MethodCallGrouper methodCallGrouper32 = new se.mockachino.verifier.MethodCallGrouper(methodMatcher0, invocationIterable17);
        org.junit.Assert.assertNotNull(mockPoint3);
        org.junit.Assert.assertNotNull(mockPoint4);
        org.junit.Assert.assertNotNull(mockPoint6);
        org.junit.Assert.assertNotNull(mockPoint7);
        org.junit.Assert.assertNotNull(mockPoint12);
        org.junit.Assert.assertNotNull(mockPoint13);
        org.junit.Assert.assertNull(invocationIterable17);
        org.junit.Assert.assertNotNull(mockPoint18);
        org.junit.Assert.assertNotNull(mockPoint19);
// flaky:         org.junit.Assert.assertNotNull(inOrderVerify22);
// flaky:         org.junit.Assert.assertNotNull(mockPoint23);
// flaky:         org.junit.Assert.assertNotNull(mockPoint24);
        org.junit.Assert.assertNotNull(mockPoint27);
        org.junit.Assert.assertNotNull(mockPoint28);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        java.lang.String str1 = se.mockachino.util.Formatting.calls((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 call" + "'", str1, "1 call");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        java.lang.Class<java.lang.String> strClass0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        se.mockachino.matchers.matcher.ClassMatcher<java.lang.String> strClassMatcher2 = new se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>(strClass0, classArray1);
        se.mockachino.matchers.matcher.BasicMatcher<java.lang.String> strBasicMatcher3 = se.mockachino.matchers.Matchers.notEq((se.mockachino.matchers.matcher.BasicMatcher<java.lang.String>) strClassMatcher2);
        java.lang.Class<java.lang.String> strClass4 = strClassMatcher2.getType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = strClassMatcher2.matches("se.mockachino.exceptions.UsageError: se.mockachino.exceptions.UsageError: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNull(strBasicMatcher3);
        org.junit.Assert.assertNull(strClass4);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        se.mockachino.matchers.matcher.Matcher<java.lang.Byte> byteMatcher0 = se.mockachino.matchers.MatchersBase.mAnyByte();
        org.junit.Assert.assertNotNull(byteMatcher0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        se.mockachino.alias.SimpleAlias simpleAlias0 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias1 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias2 = simpleAlias0.union((se.mockachino.alias.Alias) simpleAlias1);
        se.mockachino.alias.SimpleAlias simpleAlias3 = new se.mockachino.alias.SimpleAlias();
        se.mockachino.alias.SimpleAlias simpleAlias4 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias5 = simpleAlias3.union((se.mockachino.alias.Alias) simpleAlias4);
        se.mockachino.alias.Alias alias6 = simpleAlias1.union((se.mockachino.alias.Alias) simpleAlias4);
        se.mockachino.alias.SimpleAlias simpleAlias7 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias alias8 = simpleAlias4.difference((se.mockachino.alias.Alias) simpleAlias7);
        // The following exception was thrown during execution in test generation
        try {
            simpleAlias7.verifyOnce();
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: Alias must be bound to a mock method");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(simpleAlias1);
        org.junit.Assert.assertNotNull(alias2);
        org.junit.Assert.assertNotNull(simpleAlias4);
        org.junit.Assert.assertNotNull(alias5);
        org.junit.Assert.assertNotNull(alias6);
        org.junit.Assert.assertNotNull(simpleAlias7);
        org.junit.Assert.assertNotNull(alias8);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        se.mockachino.exceptions.UsageError usageError1 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber2 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) usageError1);
        java.lang.Class<se.mockachino.Invocation> invocationClass3 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray5 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray6 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray5;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher7 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray6);
        java.lang.Class<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherClass8 = methodCallMatcherAndMatcher7.getType();
        se.mockachino.MockData<se.mockachino.Invocation> invocationMockData10 = new se.mockachino.MockData<se.mockachino.Invocation>(invocationClass3, (java.lang.reflect.Type) methodCallMatcherClass8, "se.mockachino.exceptions.UsageError: ");
        invocationMockData10.resetStubs();
        java.lang.reflect.Type type12 = invocationMockData10.getTypeLiteral();
        java.util.Set<se.mockachino.util.MockachinoMethod> mockachinoMethodSet13 = invocationMockData10.getMethods();
        java.lang.Class<se.mockachino.Invocation> invocationClass14 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray16 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray17 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray16;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher18 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray17);
        java.lang.Class<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherClass19 = methodCallMatcherAndMatcher18.getType();
        se.mockachino.MockData<se.mockachino.Invocation> invocationMockData21 = new se.mockachino.MockData<se.mockachino.Invocation>(invocationClass14, (java.lang.reflect.Type) methodCallMatcherClass19, "se.mockachino.exceptions.UsageError: ");
        invocationMockData21.resetStubs();
        java.lang.reflect.Type type23 = invocationMockData21.getTypeLiteral();
        se.mockachino.util.MockachinoMethod mockachinoMethod24 = se.mockachino.util.MockachinoMethod.NULL;
        java.lang.reflect.Method method25 = mockachinoMethod24.getMethod();
        boolean boolean26 = mockachinoMethod24.isToStringCall();
        se.mockachino.matchers.matcher.Matcher[] matcherArray28 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray29 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray28;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher30 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray28);
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher31 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>((se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray28);
        se.mockachino.matchers.matcher.Matcher[] matcherArray33 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray34 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray33;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher35 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray34);
        se.mockachino.util.MockachinoMethod mockachinoMethod36 = null;
        java.lang.Object[] objArray37 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall38 = new se.mockachino.MethodCall(mockachinoMethod36, objArray37);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher39 = se.mockachino.matchers.MatchersBase.mEq(methodCall38);
        se.mockachino.MethodCall methodCall40 = se.mockachino.matchers.Matchers.not(methodCallMatcher39);
        boolean boolean41 = methodCallMatcherAndMatcher35.matches(methodCallMatcher39);
        se.mockachino.matchers.matcher.Matcher[] matcherArray43 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray44 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray43;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher45 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray43);
        se.mockachino.matchers.matcher.Matcher[] matcherArray46 = new se.mockachino.matchers.matcher.Matcher[] { methodCallMatcherAndMatcher31, methodCallMatcherAndMatcher35, aliasMatcher45 };
        java.util.ArrayList<se.mockachino.matchers.matcher.Matcher> matcherList47 = new java.util.ArrayList<se.mockachino.matchers.matcher.Matcher>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.matcher.Matcher>) matcherList47, matcherArray46);
        se.mockachino.matchers.MethodMatcherImpl methodMatcherImpl49 = new se.mockachino.matchers.MethodMatcherImpl(mockachinoMethod24, (java.util.List<se.mockachino.matchers.matcher.Matcher>) matcherList47);
        se.mockachino.stub.MethodStubs methodStubs50 = invocationMockData21.getStubs(mockachinoMethod24);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             stubber2.onMethodWithAnyArgument((java.lang.Object) invocationMockData10, mockachinoMethod24);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.MockData@1c98fc31 is not a mock object");
        } catch (se.mockachino.exceptions.UsageError e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(stubber2);
        org.junit.Assert.assertNotNull(matcherArray5);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray6);
        org.junit.Assert.assertNotNull(methodCallMatcherClass8);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(mockachinoMethodSet13);
        org.junit.Assert.assertNotNull(matcherArray16);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray17);
        org.junit.Assert.assertNotNull(methodCallMatcherClass19);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(mockachinoMethod24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(matcherArray28);
        org.junit.Assert.assertNotNull(aliasMatcherArray29);
        org.junit.Assert.assertNotNull(aliasMatcher30);
        org.junit.Assert.assertNotNull(matcherArray33);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher39);
        org.junit.Assert.assertNull(methodCall40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(matcherArray43);
        org.junit.Assert.assertNotNull(aliasMatcherArray44);
        org.junit.Assert.assertNotNull(aliasMatcher45);
        org.junit.Assert.assertNotNull(matcherArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(methodStubs50);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify4 = null; // flaky: orderingContext2.verifyAtLeast(0);
        se.mockachino.matchers.matcher.Matcher[] matcherArray6 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray7 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray6;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher8 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray7);
        se.mockachino.util.MockachinoMethod mockachinoMethod9 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall11 = new se.mockachino.MethodCall(mockachinoMethod9, objArray10);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher12 = se.mockachino.matchers.MatchersBase.mEq(methodCall11);
        se.mockachino.MethodCall methodCall13 = se.mockachino.matchers.Matchers.not(methodCallMatcher12);
        se.mockachino.util.MockachinoMethod mockachinoMethod14 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall16 = new se.mockachino.MethodCall(mockachinoMethod14, objArray15);
        boolean boolean17 = methodCallMatcher12.matches(methodCall16);
        boolean boolean18 = methodCallMatcherAndMatcher8.matches(methodCallMatcher12);
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher19 = inOrderVerify4.on(methodCallMatcher12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(inOrderVerify4);
        org.junit.Assert.assertNotNull(matcherArray6);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher12);
        org.junit.Assert.assertNull(methodCall13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        se.mockachino.verifier.BadUsageBuilder badUsageBuilder0 = null;
        se.mockachino.verifier.BadUsageHandler badUsageHandler1 = new se.mockachino.verifier.BadUsageHandler(badUsageBuilder0);
        java.lang.Object obj2 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod3 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall5 = new se.mockachino.MethodCall(mockachinoMethod3, objArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = badUsageHandler1.invoke(obj2, methodCall5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        se.mockachino.matchers.matcher.Matcher<java.lang.String> strMatcher1 = se.mockachino.matchers.MatchersBase.mEndsWith("se.mockachino.exceptions.UsageError: ");
        org.junit.Assert.assertNotNull(strMatcher1);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        se.mockachino.util.MockachinoMethod mockachinoMethod0 = se.mockachino.util.MockachinoMethod.NULL;
        java.lang.String str1 = mockachinoMethod0.toString();
        boolean boolean3 = mockachinoMethod0.equals((java.lang.Object) 0L);
        org.junit.Assert.assertNotNull(mockachinoMethod0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "void <null>()" + "'", str1, "void <null>()");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        se.mockachino.verifier.Reporter reporter3 = new se.mockachino.verifier.Reporter((int) (byte) 100, (int) (short) 0, (int) '4');
        se.mockachino.util.MockachinoMethod mockachinoMethod4 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall6 = new se.mockachino.MethodCall(mockachinoMethod4, objArray5);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher7 = se.mockachino.matchers.MatchersBase.mEq(methodCall6);
        se.mockachino.MethodCall methodCall8 = se.mockachino.matchers.Matchers.not(methodCallMatcher7);
        se.mockachino.util.MockachinoMethod mockachinoMethod9 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall11 = new se.mockachino.MethodCall(mockachinoMethod9, objArray10);
        boolean boolean12 = methodCallMatcher7.matches(methodCall11);
        java.lang.StackTraceElement[] stackTraceElementArray14 = new java.lang.StackTraceElement[] {};
        java.lang.String str15 = se.mockachino.util.Formatting.toString(stackTraceElementArray14);
        java.lang.StackTraceElement[] stackTraceElementArray16 = se.mockachino.matchers.Matchers.eq(stackTraceElementArray14);
        se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable> serializableIdentityMatcher17 = new se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable>((java.io.Serializable) stackTraceElementArray14);
        se.mockachino.verifier.InvocationCount invocationCount18 = new se.mockachino.verifier.InvocationCount((java.lang.Object) (byte) 100, methodCall11, (int) (short) 0, stackTraceElementArray14);
        se.mockachino.verifier.InvocationCount invocationCount19 = new se.mockachino.verifier.InvocationCount((se.mockachino.Invocation) invocationCount18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = invocationCount18.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher7);
        org.junit.Assert.assertNull(methodCall8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stackTraceElementArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(stackTraceElementArray16);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtMost((int) (byte) 1);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        se.mockachino.verifier.Reporter reporter3 = new se.mockachino.verifier.Reporter((int) '4', 0, (int) (short) 0);
        java.lang.String str4 = reporter3.getErrorLine();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Expected no calls but got 52 calls" + "'", str4, "Expected no calls but got 52 calls");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        se.mockachino.matchers.matcher.Matcher[] matcherArray1 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray2 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray1;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher3 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray2);
        se.mockachino.util.MockachinoMethod mockachinoMethod4 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall6 = new se.mockachino.MethodCall(mockachinoMethod4, objArray5);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher7 = se.mockachino.matchers.MatchersBase.mEq(methodCall6);
        se.mockachino.MethodCall methodCall8 = se.mockachino.matchers.Matchers.not(methodCallMatcher7);
        boolean boolean9 = methodCallMatcherAndMatcher3.matches(methodCallMatcher7);
        se.mockachino.matchers.matcher.ArgumentCatcher<se.mockachino.MethodCall> methodCallArgumentCatcher10 = se.mockachino.matchers.matcher.ArgumentCatcher.create(methodCallMatcher7);
        org.junit.Assert.assertNotNull(matcherArray1);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher7);
        org.junit.Assert.assertNull(methodCall8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(methodCallArgumentCatcher10);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        se.mockachino.matchers.matcher.RegexpMatcher regexpMatcher1 = new se.mockachino.matchers.matcher.RegexpMatcher("");
        java.lang.String str2 = regexpMatcher1.asString();
        java.lang.Class<java.lang.String> strClass3 = regexpMatcher1.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "regexp(\"\")" + "'", str2, "regexp(\"\")");
        org.junit.Assert.assertNotNull(strClass3);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        se.mockachino.matchers.matcher.Matcher<java.lang.Short> shortMatcher0 = se.mockachino.matchers.MatchersBase.mAnyShort();
        java.lang.Class<?> wildcardClass1 = shortMatcher0.getClass();
        boolean boolean2 = se.mockachino.Mockachino.canMock((java.lang.Class) wildcardClass1);
        boolean boolean3 = se.mockachino.Mockachino.canMock((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(shortMatcher0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        se.mockachino.MockSettings mockSettings1 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler2 = mockSettings1.getFallback();
        se.mockachino.MockSettings mockSettings3 = mockSettings1.notQuick();
        se.mockachino.CallHandler callHandler4 = mockSettings1.getFallback();
        se.mockachino.MockSettings mockSettings6 = mockSettings1.name("void <null>()");
        java.lang.String str7 = mockSettings6.getName();
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(callHandler2);
        org.junit.Assert.assertNotNull(mockSettings3);
        org.junit.Assert.assertNotNull(callHandler4);
        org.junit.Assert.assertNotNull(mockSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "void <null>()" + "'", str7, "void <null>()");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable0 = null;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint2 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext3 = new se.mockachino.order.OrderingContext(mockPoint1, mockPoint2);
        se.mockachino.order.MockPoint mockPoint4 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint5 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext6 = new se.mockachino.order.OrderingContext(mockPoint4, mockPoint5);
        se.mockachino.order.MockPointIterable mockPointIterable7 = new se.mockachino.order.MockPointIterable(invocationIterable0, mockPoint2, mockPoint4);
        se.mockachino.order.MockPoint mockPoint8 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint9 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext10 = new se.mockachino.order.OrderingContext(mockPoint8, mockPoint9);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext11 = null; // flaky: se.mockachino.Mockachino.before(mockPoint8);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext12 = new se.mockachino.order.BetweenVerifyContext(mockPoint4, mockPoint8);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart15 = null; // flaky: betweenVerifyContext12.verifyRange(1, (int) (short) 100);
        se.mockachino.matchers.matcher.Matcher[] matcherArray17 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray18 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray17;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher19 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray18);
        se.mockachino.util.MockachinoMethod mockachinoMethod20 = null;
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall22 = new se.mockachino.MethodCall(mockachinoMethod20, objArray21);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher23 = se.mockachino.matchers.MatchersBase.mEq(methodCall22);
        se.mockachino.MethodCall methodCall24 = se.mockachino.matchers.Matchers.not(methodCallMatcher23);
        boolean boolean25 = methodCallMatcherAndMatcher19.matches(methodCallMatcher23);
        se.mockachino.util.MockachinoMethod mockachinoMethod26 = null;
        java.lang.Object[] objArray27 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall28 = new se.mockachino.MethodCall(mockachinoMethod26, objArray27);
        boolean boolean29 = methodCallMatcher23.matches(methodCall28);
        se.mockachino.util.MockachinoMethod mockachinoMethod30 = se.mockachino.util.MockachinoMethod.NULL;
        java.lang.reflect.Method method31 = mockachinoMethod30.getMethod();
        boolean boolean32 = mockachinoMethod30.isToStringCall();
        se.mockachino.matchers.matcher.Matcher[] matcherArray34 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray35 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray34;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher36 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray34);
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher37 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>((se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray34);
        se.mockachino.matchers.matcher.Matcher[] matcherArray39 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray40 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray39;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher41 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray40);
        se.mockachino.util.MockachinoMethod mockachinoMethod42 = null;
        java.lang.Object[] objArray43 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall44 = new se.mockachino.MethodCall(mockachinoMethod42, objArray43);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher45 = se.mockachino.matchers.MatchersBase.mEq(methodCall44);
        se.mockachino.MethodCall methodCall46 = se.mockachino.matchers.Matchers.not(methodCallMatcher45);
        boolean boolean47 = methodCallMatcherAndMatcher41.matches(methodCallMatcher45);
        se.mockachino.matchers.matcher.Matcher[] matcherArray49 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray50 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray49;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher51 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray49);
        se.mockachino.matchers.matcher.Matcher[] matcherArray52 = new se.mockachino.matchers.matcher.Matcher[] { methodCallMatcherAndMatcher37, methodCallMatcherAndMatcher41, aliasMatcher51 };
        java.util.ArrayList<se.mockachino.matchers.matcher.Matcher> matcherList53 = new java.util.ArrayList<se.mockachino.matchers.matcher.Matcher>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.matcher.Matcher>) matcherList53, matcherArray52);
        se.mockachino.matchers.MethodMatcherImpl methodMatcherImpl55 = new se.mockachino.matchers.MethodMatcherImpl(mockachinoMethod30, (java.util.List<se.mockachino.matchers.matcher.Matcher>) matcherList53);
        se.mockachino.util.MockachinoMethod mockachinoMethod56 = methodMatcherImpl55.getMethod();
        // The following exception was thrown during execution in test generation
        try {
            verifyRangeStart15.onMethodWithAnyArgument((java.lang.Object) methodCallMatcher23, mockachinoMethod56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockPoint1);
        org.junit.Assert.assertNotNull(mockPoint2);
        org.junit.Assert.assertNotNull(mockPoint4);
        org.junit.Assert.assertNotNull(mockPoint5);
        org.junit.Assert.assertNotNull(mockPoint8);
        org.junit.Assert.assertNotNull(mockPoint9);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext11);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart15);
        org.junit.Assert.assertNotNull(matcherArray17);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher23);
        org.junit.Assert.assertNull(methodCall24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(mockachinoMethod30);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(matcherArray34);
        org.junit.Assert.assertNotNull(aliasMatcherArray35);
        org.junit.Assert.assertNotNull(aliasMatcher36);
        org.junit.Assert.assertNotNull(matcherArray39);
        org.junit.Assert.assertNotNull(methodCallMatcherMatcherArray40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher45);
        org.junit.Assert.assertNull(methodCall46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(matcherArray49);
        org.junit.Assert.assertNotNull(aliasMatcherArray50);
        org.junit.Assert.assertNotNull(aliasMatcher51);
        org.junit.Assert.assertNotNull(matcherArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(mockachinoMethod56);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        se.mockachino.verifier.Reporter reporter3 = new se.mockachino.verifier.Reporter((int) (byte) 100, (int) (short) 0, (int) '4');
        se.mockachino.util.MockachinoMethod mockachinoMethod4 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall6 = new se.mockachino.MethodCall(mockachinoMethod4, objArray5);
        se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall> methodCallMatcher7 = se.mockachino.matchers.MatchersBase.mEq(methodCall6);
        se.mockachino.MethodCall methodCall8 = se.mockachino.matchers.Matchers.not(methodCallMatcher7);
        se.mockachino.util.MockachinoMethod mockachinoMethod9 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        se.mockachino.MethodCall methodCall11 = new se.mockachino.MethodCall(mockachinoMethod9, objArray10);
        boolean boolean12 = methodCallMatcher7.matches(methodCall11);
        java.lang.StackTraceElement[] stackTraceElementArray14 = new java.lang.StackTraceElement[] {};
        java.lang.String str15 = se.mockachino.util.Formatting.toString(stackTraceElementArray14);
        java.lang.StackTraceElement[] stackTraceElementArray16 = se.mockachino.matchers.Matchers.eq(stackTraceElementArray14);
        se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable> serializableIdentityMatcher17 = new se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable>((java.io.Serializable) stackTraceElementArray14);
        se.mockachino.verifier.InvocationCount invocationCount18 = new se.mockachino.verifier.InvocationCount((java.lang.Object) (byte) 100, methodCall11, (int) (short) 0, stackTraceElementArray14);
        se.mockachino.verifier.InvocationCount invocationCount19 = new se.mockachino.verifier.InvocationCount((se.mockachino.Invocation) invocationCount18);
        se.mockachino.verifier.InvocationCount invocationCount20 = new se.mockachino.verifier.InvocationCount((se.mockachino.Invocation) invocationCount18);
        java.lang.String str22 = invocationCount20.getStackTraceString((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = invocationCount20.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(methodCallMatcher7);
        org.junit.Assert.assertNull(methodCall8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stackTraceElementArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(stackTraceElementArray16);
        org.junit.Assert.assertNull(str22);
    }
}
