import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTests{
    public static boolean debug = false;


    public void test019_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null;  se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.util.MockachinoMethod mockachinoMethod2 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] {}

    public void test031_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null;  se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.util.MockachinoMethod mockachinoMethod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            verifyRangeStart1.onMethodWithAnyArgument((java.lang.Object) 10.0d, mockachinoMethod3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        }

    public void test035_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart2 = null;  se.mockachino.Mockachino.verifyRange((int) (short) 10, 0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart4 = null; // flaky: verifyRangeStart2.withTimeout(10L);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart2);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart4);
    }

    public void test035_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart2 = null; // flaky: se.mockachino.Mockachino.verifyRange((int) (short) 10, 0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart4 = null;  verifyRangeStart2.withTimeout(10L);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart2);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart4);
    }

    public void test035_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart2 = null; // flaky: se.mockachino.Mockachino.verifyRange((int) (short) 10, 0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart4 = null; // flaky: verifyRangeStart2.withTimeout(10L);
         org.junit.Assert.assertNotNull(verifyRangeStart2);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart4);
    }

    public void test035_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart2 = null; // flaky: se.mockachino.Mockachino.verifyRange((int) (short) 10, 0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart4 = null; // flaky: verifyRangeStart2.withTimeout(10L);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart2);
         org.junit.Assert.assertNotNull(verifyRangeStart4);
    }

    public void test044_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null;  se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.MethodMatcher methodMatcher5 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             verifyRangeStart1.onMethod((java.lang.Object) 10.0d, methodMatcher5);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument 10.0 is not a mock object");
        }

    public void test044_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null;  verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.MethodMatcher methodMatcher5 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             verifyRangeStart1.onMethod((java.lang.Object) 10.0d, methodMatcher5);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument 10.0 is not a mock object");
        }

    public void test044_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.MethodMatcher methodMatcher5 = null;
        // The following exception was thrown during execution in test generation
        try {
             verifyRangeStart1.onMethod((java.lang.Object) 10.0d, methodMatcher5);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument 10.0 is not a mock object");
        }

    public void test044_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.MethodMatcher methodMatcher5 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             verifyRangeStart1.onMethod((java.lang.Object) 10.0d, methodMatcher5);
             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument 10.0 is not a mock object");
        }

    public void test045_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null;  se.mockachino.Mockachino.verifyAtLeast(0);
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
        }

    public void test045_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null;  verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.MockSettings mockSettings5 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler6 = mockSettings5.getFallback();
        se.mockachino.MockSettings mockSettings7 = mockSettings5.notQuick();
        se.mockachino.CallHandler callHandler8 = mockSettings5.getFallback();
        se.mockachino.util.MockachinoMethod mockachinoMethod9 = se.mockachino.util.MockachinoMethod.NULL;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             verifyRangeStart1.onMethodWithAnyArgument((java.lang.Object) callHandler8, mockachinoMethod9);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.invocationhandler.CollectionsHandler@6a71e941 is not a mock object");
        }

    public void test045_3() throws Throwable {
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
             verifyRangeStart1.onMethodWithAnyArgument((java.lang.Object) callHandler8, mockachinoMethod9);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.invocationhandler.CollectionsHandler@6a71e941 is not a mock object");
        }

    public void test045_4() throws Throwable {
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
             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.invocationhandler.CollectionsHandler@6a71e941 is not a mock object");
        }

    public void test046_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        se.mockachino.exceptions.UsageError usageError1 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber2 = null;  se.mockachino.Mockachino.stubThrow((java.lang.Throwable) usageError1);
        se.mockachino.MockUtil mockUtil3 = new se.mockachino.MockUtil();
        se.mockachino.util.MockachinoMethod mockachinoMethod4 = se.mockachino.util.MockachinoMethod.NULL;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             stubber2.onMethodWithAnyArgument((java.lang.Object) mockUtil3, mockachinoMethod4);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.MockUtil@49dbd8fb is not a mock object");
        }

    public void test046_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        se.mockachino.exceptions.UsageError usageError1 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber2 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) usageError1);
        se.mockachino.MockUtil mockUtil3 = new se.mockachino.MockUtil();
        se.mockachino.util.MockachinoMethod mockachinoMethod4 = se.mockachino.util.MockachinoMethod.NULL;
        // The following exception was thrown during execution in test generation
        try {
             stubber2.onMethodWithAnyArgument((java.lang.Object) mockUtil3, mockachinoMethod4);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.MockUtil@49dbd8fb is not a mock object");
        }

    public void test046_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        se.mockachino.exceptions.UsageError usageError1 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber2 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) usageError1);
        se.mockachino.MockUtil mockUtil3 = new se.mockachino.MockUtil();
        se.mockachino.util.MockachinoMethod mockachinoMethod4 = se.mockachino.util.MockachinoMethod.NULL;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             stubber2.onMethodWithAnyArgument((java.lang.Object) mockUtil3, mockachinoMethod4);
             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.MockUtil@49dbd8fb is not a mock object");
        }

    public void test048_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null;  se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        se.mockachino.MockData<se.mockachino.proxy.CglibAsmUtil> cglibAsmUtilMockData6 = null;
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.mock.MockHandler<se.mockachino.proxy.CglibAsmUtil> cglibAsmUtilMockHandler9 = new se.mockachino.mock.MockHandler<se.mockachino.proxy.CglibAsmUtil>((se.mockachino.CallHandler) returnAnswer5, cglibAsmUtilMockData6, true, "0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        }

    public void test048_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null;  verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        se.mockachino.MockData<se.mockachino.proxy.CglibAsmUtil> cglibAsmUtilMockData6 = null;
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.mock.MockHandler<se.mockachino.proxy.CglibAsmUtil> cglibAsmUtilMockHandler9 = new se.mockachino.mock.MockHandler<se.mockachino.proxy.CglibAsmUtil>((se.mockachino.CallHandler) returnAnswer5, cglibAsmUtilMockData6, true, "0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        }

    public void test055_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null;  se.mockachino.Mockachino.before(mockPoint0);
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
        }

    public void test064_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
         se.mockachino.matchers.MatcherThreadHandler.assertEmpty();
    }

    public void test082_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        se.mockachino.exceptions.UsageError usageError2 = new se.mockachino.exceptions.UsageError("");
        se.mockachino.exceptions.VerificationError verificationError3 = new se.mockachino.exceptions.VerificationError("", (java.lang.Exception) usageError2);
        se.mockachino.stub.Stubber stubber4 = null;  se.mockachino.Mockachino.stubThrow((java.lang.Throwable) verificationError3);
        se.mockachino.alias.SimpleAlias simpleAlias5 = se.mockachino.Mockachino.newAlias();
        se.mockachino.util.MockachinoMethod mockachinoMethod6 = se.mockachino.util.MockachinoMethod.NULL;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             stubber4.onMethodWithAnyArgument((java.lang.Object) simpleAlias5, mockachinoMethod6);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.alias.SimpleAlias@61c6b108 is not a mock object");
        }

    public void test082_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        se.mockachino.exceptions.UsageError usageError2 = new se.mockachino.exceptions.UsageError("");
        se.mockachino.exceptions.VerificationError verificationError3 = new se.mockachino.exceptions.VerificationError("", (java.lang.Exception) usageError2);
        se.mockachino.stub.Stubber stubber4 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) verificationError3);
        se.mockachino.alias.SimpleAlias simpleAlias5 = se.mockachino.Mockachino.newAlias();
        se.mockachino.util.MockachinoMethod mockachinoMethod6 = se.mockachino.util.MockachinoMethod.NULL;
        // The following exception was thrown during execution in test generation
        try {
             stubber4.onMethodWithAnyArgument((java.lang.Object) simpleAlias5, mockachinoMethod6);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.alias.SimpleAlias@61c6b108 is not a mock object");
        }

    public void test082_3() throws Throwable {
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
             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.alias.SimpleAlias@61c6b108 is not a mock object");
        }

    public void test085_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null;  se.mockachino.Mockachino.verifyAtLeast(0);
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
        }

    public void test085_2() throws Throwable {
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
            se.mockachino.order.MockPointIterator mockPointIterator8 = null;  verifyRangeStart1.on(mockPointIterator7);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.order.MockPointIterator@103bea23 is not a mock object");
        }

    public void test085_3() throws Throwable {
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
             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.order.MockPointIterator@103bea23 is not a mock object");
        }

    public void test092_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null;  se.mockachino.Mockachino.verifyExactly((-1));
        se.mockachino.MockUtil mockUtil2 = new se.mockachino.MockUtil();
        java.lang.Object obj3 = se.mockachino.util.PrimitiveList.toList((java.lang.Object) mockUtil2);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             verifyRangeStart1.onAnyMethod((java.lang.Object) mockUtil2);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.MockUtil@6be99309 is not a mock object");
        }

    public void test092_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyExactly((-1));
        se.mockachino.MockUtil mockUtil2 = new se.mockachino.MockUtil();
        java.lang.Object obj3 = se.mockachino.util.PrimitiveList.toList((java.lang.Object) mockUtil2);
        // The following exception was thrown during execution in test generation
        try {
             verifyRangeStart1.onAnyMethod((java.lang.Object) mockUtil2);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.MockUtil@6be99309 is not a mock object");
        }

    public void test092_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyExactly((-1));
        se.mockachino.MockUtil mockUtil2 = new se.mockachino.MockUtil();
        java.lang.Object obj3 = se.mockachino.util.PrimitiveList.toList((java.lang.Object) mockUtil2);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             verifyRangeStart1.onAnyMethod((java.lang.Object) mockUtil2);
             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.MockUtil@6be99309 is not a mock object");
        }

    public void test095_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null;  se.mockachino.Mockachino.verifyAtMost((int) 'a');
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
    }

    public void test095_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtMost((int) 'a');
         org.junit.Assert.assertNotNull(verifyRangeStart1);
    }

    public void test096_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null;  se.mockachino.Mockachino.verifyExactly((int) (byte) -1);
        se.mockachino.MockSettings mockSettings3 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler4 = mockSettings3.getFallback();
        se.mockachino.MockSettings mockSettings5 = mockSettings3.notQuick();
        se.mockachino.util.MockachinoMethod mockachinoMethod6 = se.mockachino.util.MockachinoMethod.NULL;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             verifyRangeStart1.onMethodWithAnyArgument((java.lang.Object) mockSettings5, mockachinoMethod6);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.MockSettings@121144d4 is not a mock object");
        }

    public void test096_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyExactly((int) (byte) -1);
        se.mockachino.MockSettings mockSettings3 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler4 = mockSettings3.getFallback();
        se.mockachino.MockSettings mockSettings5 = mockSettings3.notQuick();
        se.mockachino.util.MockachinoMethod mockachinoMethod6 = se.mockachino.util.MockachinoMethod.NULL;
        // The following exception was thrown during execution in test generation
        try {
             verifyRangeStart1.onMethodWithAnyArgument((java.lang.Object) mockSettings5, mockachinoMethod6);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.MockSettings@121144d4 is not a mock object");
        }

    public void test096_3() throws Throwable {
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
             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.MockSettings@121144d4 is not a mock object");
        }

    public void test097_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        se.mockachino.order.MockPoint mockPoint2 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint3 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext4 = new se.mockachino.order.OrderingContext(mockPoint2, mockPoint3);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext5 = null;  se.mockachino.Mockachino.before(mockPoint2);
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
        }

    public void test097_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        se.mockachino.order.MockPoint mockPoint2 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint3 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext4 = new se.mockachino.order.OrderingContext(mockPoint2, mockPoint3);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext5 = null; // flaky: se.mockachino.Mockachino.before(mockPoint2);
        se.mockachino.order.MockPoint mockPoint6 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint7 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext8 = new se.mockachino.order.OrderingContext(mockPoint6, mockPoint7);
        se.mockachino.order.MockPoint mockPoint9 = null;  orderingContext8.beforeLastCall();
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart10 = new se.mockachino.verifier.VerifyRangeStart((-1), 0, mockPoint2, mockPoint9);
        se.mockachino.exceptions.UsageError usageError13 = new se.mockachino.exceptions.UsageError("");
        se.mockachino.exceptions.VerificationError verificationError14 = new se.mockachino.exceptions.VerificationError("", (java.lang.Exception) usageError13);
        se.mockachino.stub.Stubber stubber15 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) verificationError14);
        // The following exception was thrown during execution in test generation
        try {
            verifyRangeStart10.onAnyMethod((java.lang.Object) verificationError14);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.exceptions.VerificationError:  is not a mock object");
        }

    public void test097_3() throws Throwable {
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
        se.mockachino.stub.Stubber stubber15 = null;  se.mockachino.Mockachino.stubThrow((java.lang.Throwable) verificationError14);
        // The following exception was thrown during execution in test generation
        try {
            verifyRangeStart10.onAnyMethod((java.lang.Object) verificationError14);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.exceptions.VerificationError:  is not a mock object");
        }

    public void test098_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null;  se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) 1);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart3);
    }

    public void test098_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null;  verifyRangeStart1.withTimeout((long) 1);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart3);
    }

    public void test098_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) 1);
         org.junit.Assert.assertNotNull(verifyRangeStart1);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart3);
    }

    public void test098_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) 1);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
         org.junit.Assert.assertNotNull(verifyRangeStart3);
    }

    public void test103_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null;  se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null; // flaky: betweenVerifyContext3.verifyAtMost((int) '#');
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null; // flaky: betweenVerifyContext3.verifyExactly((int) (short) 100);
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart7);
    }

    public void test103_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null;  betweenVerifyContext3.verifyAtMost((int) '#');
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null; // flaky: betweenVerifyContext3.verifyExactly((int) (short) 100);
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart7);
    }

    public void test103_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null; // flaky: betweenVerifyContext3.verifyAtMost((int) '#');
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null;  betweenVerifyContext3.verifyExactly((int) (short) 100);
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart7);
    }

    public void test103_4() throws Throwable {
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
         org.junit.Assert.assertNotNull(betweenVerifyContext3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart7);
    }

    public void test103_5() throws Throwable {
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
         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart7);
    }

    public void test103_6() throws Throwable {
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
         org.junit.Assert.assertNotNull(verifyRangeStart7);
    }

    public void test110_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        se.mockachino.exceptions.UsageError usageError2 = new se.mockachino.exceptions.UsageError("");
        se.mockachino.exceptions.VerificationError verificationError3 = new se.mockachino.exceptions.VerificationError("", (java.lang.Exception) usageError2);
        se.mockachino.stub.Stubber stubber4 = null;  se.mockachino.Mockachino.stubThrow((java.lang.Throwable) verificationError3);
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
        }

    public void test110_2() throws Throwable {
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
             stubber4.onMethod((java.lang.Object) invocationMockData12, mockachinoMethod15, methodMatcher16);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.MockData@2e68b591 is not a mock object");
        }

    public void test110_3() throws Throwable {
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
             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.MockData@2e68b591 is not a mock object");
        }

    public void test111_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        se.mockachino.exceptions.UsageError usageError1 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber2 = null;  se.mockachino.Mockachino.stubThrow((java.lang.Throwable) usageError1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = null; // flaky: stubber2.on("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument hi! is not a mock object");
        }

    public void test111_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        se.mockachino.exceptions.UsageError usageError1 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber2 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) usageError1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = null;  stubber2.on("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument hi! is not a mock object");
        }

    public void test111_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        se.mockachino.exceptions.UsageError usageError1 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber2 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) usageError1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = null; // flaky: stubber2.on("hi!");
             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument hi! is not a mock object");
        }

    public void test113_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        se.mockachino.order.OrderingContext orderingContext0 = null;  se.mockachino.Mockachino.newOrdering();
// flaky:         org.junit.Assert.assertNotNull(orderingContext0);
    }

    public void test113_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        se.mockachino.order.OrderingContext orderingContext0 = null; // flaky: se.mockachino.Mockachino.newOrdering();
         org.junit.Assert.assertNotNull(orderingContext0);
    }

    public void test116_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify4 = null;  orderingContext2.verifyAtLeast(0);
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

    public void test116_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify4 = null; // flaky: orderingContext2.verifyAtLeast(0);
        se.mockachino.order.MockPoint mockPoint5 = null;  orderingContext2.atLastCall();
        se.mockachino.order.MockPoint mockPoint6 = null; // flaky: orderingContext2.beforeLastCall();
        int int7 = 0; // flaky: mockPoint6.getCallNumber();
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(inOrderVerify4);
// flaky:         org.junit.Assert.assertNotNull(mockPoint5);
// flaky:         org.junit.Assert.assertNotNull(mockPoint6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    public void test116_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify4 = null; // flaky: orderingContext2.verifyAtLeast(0);
        se.mockachino.order.MockPoint mockPoint5 = null; // flaky: orderingContext2.atLastCall();
        se.mockachino.order.MockPoint mockPoint6 = null;  orderingContext2.beforeLastCall();
        int int7 = 0; // flaky: mockPoint6.getCallNumber();
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(inOrderVerify4);
// flaky:         org.junit.Assert.assertNotNull(mockPoint5);
// flaky:         org.junit.Assert.assertNotNull(mockPoint6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    public void test116_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify4 = null; // flaky: orderingContext2.verifyAtLeast(0);
        se.mockachino.order.MockPoint mockPoint5 = null; // flaky: orderingContext2.atLastCall();
        se.mockachino.order.MockPoint mockPoint6 = null; // flaky: orderingContext2.beforeLastCall();
        int int7 = 0;  mockPoint6.getCallNumber();
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(inOrderVerify4);
// flaky:         org.junit.Assert.assertNotNull(mockPoint5);
// flaky:         org.junit.Assert.assertNotNull(mockPoint6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    public void test116_5() throws Throwable {
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
         org.junit.Assert.assertNotNull(inOrderVerify4);
// flaky:         org.junit.Assert.assertNotNull(mockPoint5);
// flaky:         org.junit.Assert.assertNotNull(mockPoint6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    public void test116_6() throws Throwable {
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
         org.junit.Assert.assertNotNull(mockPoint5);
// flaky:         org.junit.Assert.assertNotNull(mockPoint6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    public void test116_7() throws Throwable {
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
         org.junit.Assert.assertNotNull(mockPoint6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    public void test116_8() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    public void test122_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart0 = null;  se.mockachino.Mockachino.verifyOnce();
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart0);
    }

    public void test122_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart0 = null; // flaky: se.mockachino.Mockachino.verifyOnce();
         org.junit.Assert.assertNotNull(verifyRangeStart0);
    }

    public void test125_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        se.mockachino.order.OrderingContext orderingContext0 = null;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint2 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext3 = new se.mockachino.order.OrderingContext(mockPoint1, mockPoint2);
        se.mockachino.order.MockPoint mockPoint4 = null;  orderingContext3.beforeLastCall();
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
        }

    public void test125_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        se.mockachino.order.OrderingContext orderingContext0 = null;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint2 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext3 = new se.mockachino.order.OrderingContext(mockPoint1, mockPoint2);
        se.mockachino.order.MockPoint mockPoint4 = null; // flaky: orderingContext3.beforeLastCall();
        se.mockachino.order.MockPoint mockPoint5 = null;  orderingContext3.beforeLastCall();
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
        }

    public void test125_3() throws Throwable {
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
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext33 = null;  se.mockachino.Mockachino.before(mockPoint30);
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
        }

    public void test125_4() throws Throwable {
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
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext40 = null;  se.mockachino.Mockachino.before(mockPoint37);
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
        }

    public void test125_5() throws Throwable {
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
        se.mockachino.order.MockPoint mockPoint44 = null;  orderingContext43.beforeLastCall();
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart45 = new se.mockachino.verifier.VerifyRangeStart((-1), 0, mockPoint37, mockPoint44);
        se.mockachino.order.MockPointIterable mockPointIterable46 = new se.mockachino.order.MockPointIterable((java.lang.Iterable<se.mockachino.Invocation>) mockPointIterable21, mockPoint26, mockPoint37);
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.order.InOrderVerifyHandler inOrderVerifyHandler48 = new se.mockachino.order.InOrderVerifyHandler(orderingContext0, (java.lang.Object) mockPoint5, (java.lang.Iterable<se.mockachino.Invocation>) mockPointIterable46, (int) '#');
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument MockPoint[-2] is not a mock object");
        }

    public void test127_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null;  se.mockachino.Mockachino.verifyExactly((int) (byte) -1);
        java.lang.Object obj2 = se.mockachino.util.PrimitiveList.toList((java.lang.Object) (byte) -1);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
    }

    public void test127_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyExactly((int) (byte) -1);
        java.lang.Object obj2 = se.mockachino.util.PrimitiveList.toList((java.lang.Object) (byte) -1);
         org.junit.Assert.assertNotNull(verifyRangeStart1);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
    }

    public void test134_1() throws Throwable {
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
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext27 = null;  se.mockachino.Mockachino.before(mockPoint24);
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
        }

    public void test134_2() throws Throwable {
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
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext34 = null;  se.mockachino.Mockachino.before(mockPoint31);
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
        }

    public void test134_3() throws Throwable {
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
        se.mockachino.order.MockPoint mockPoint38 = null;  orderingContext37.beforeLastCall();
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart39 = new se.mockachino.verifier.VerifyRangeStart((-1), 0, mockPoint31, mockPoint38);
        se.mockachino.order.MockPointIterable mockPointIterable40 = new se.mockachino.order.MockPointIterable((java.lang.Iterable<se.mockachino.Invocation>) mockPointIterable15, mockPoint20, mockPoint31);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<se.mockachino.Invocation> invocationItor41 = mockPointIterable15.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        }

    public void test136_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        se.mockachino.exceptions.UsageError usageError1 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber2 = null;  se.mockachino.Mockachino.stubThrow((java.lang.Throwable) usageError1);
        se.mockachino.MockSettings mockSettings3 = null; // flaky: se.mockachino.Settings.spyOn((java.lang.Object) stubber2);
// flaky:         org.junit.Assert.assertNotNull(stubber2);
// flaky:         org.junit.Assert.assertNotNull(mockSettings3);
    }

    public void test136_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        se.mockachino.exceptions.UsageError usageError1 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber2 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) usageError1);
        se.mockachino.MockSettings mockSettings3 = null;  se.mockachino.Settings.spyOn((java.lang.Object) stubber2);
// flaky:         org.junit.Assert.assertNotNull(stubber2);
// flaky:         org.junit.Assert.assertNotNull(mockSettings3);
    }

    public void test136_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        se.mockachino.exceptions.UsageError usageError1 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber2 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) usageError1);
        se.mockachino.MockSettings mockSettings3 = null; // flaky: se.mockachino.Settings.spyOn((java.lang.Object) stubber2);
         org.junit.Assert.assertNotNull(stubber2);
// flaky:         org.junit.Assert.assertNotNull(mockSettings3);
    }

    public void test136_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        se.mockachino.exceptions.UsageError usageError1 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber2 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) usageError1);
        se.mockachino.MockSettings mockSettings3 = null; // flaky: se.mockachino.Settings.spyOn((java.lang.Object) stubber2);
// flaky:         org.junit.Assert.assertNotNull(stubber2);
         org.junit.Assert.assertNotNull(mockSettings3);
    }

    public void test137_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart2 = null;  se.mockachino.Mockachino.verifyRange((int) (short) 1, (int) ' ');
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart2);
    }

    public void test137_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart2 = null; // flaky: se.mockachino.Mockachino.verifyRange((int) (short) 1, (int) ' ');
         org.junit.Assert.assertNotNull(verifyRangeStart2);
    }

    public void test138_1() throws Throwable {
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
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext16 = null;  se.mockachino.Mockachino.after(mockPoint5);
        org.junit.Assert.assertNotNull(mockPoint2);
        org.junit.Assert.assertNotNull(mockPoint3);
        org.junit.Assert.assertNotNull(mockPoint5);
        org.junit.Assert.assertNotNull(mockPoint6);
        org.junit.Assert.assertNotNull(mockPoint11);
        org.junit.Assert.assertNotNull(mockPoint12);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext16);
    }

    public void test138_2() throws Throwable {
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
         org.junit.Assert.assertNotNull(betweenVerifyContext16);
    }

    public void test140_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        se.mockachino.exceptions.UsageError usageError1 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber2 = null;  se.mockachino.Mockachino.stubThrow((java.lang.Throwable) usageError1);
        java.lang.Throwable throwable3 = se.mockachino.cleaner.StacktraceCleaner.cleanError((java.lang.Throwable) usageError1);
// flaky:         org.junit.Assert.assertNotNull(stubber2);
        org.junit.Assert.assertNotNull(throwable3);
        org.junit.Assert.assertEquals(throwable3.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable3.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable3.toString(), "se.mockachino.exceptions.UsageError: hi!");
    }

    public void test140_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        se.mockachino.exceptions.UsageError usageError1 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber2 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) usageError1);
        java.lang.Throwable throwable3 = se.mockachino.cleaner.StacktraceCleaner.cleanError((java.lang.Throwable) usageError1);
         org.junit.Assert.assertNotNull(stubber2);
        org.junit.Assert.assertNotNull(throwable3);
        org.junit.Assert.assertEquals(throwable3.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable3.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable3.toString(), "se.mockachino.exceptions.UsageError: hi!");
    }

    public void test142_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null;  se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null; // flaky: betweenVerifyContext3.verifyExactly((int) (byte) 1);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null; // flaky: betweenVerifyContext3.verifyExactly((int) (short) -1);
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart7);
    }

    public void test142_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null;  betweenVerifyContext3.verifyExactly((int) (byte) 1);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null; // flaky: betweenVerifyContext3.verifyExactly((int) (short) -1);
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart7);
    }

    public void test142_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null; // flaky: betweenVerifyContext3.verifyExactly((int) (byte) 1);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null;  betweenVerifyContext3.verifyExactly((int) (short) -1);
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart7);
    }

    public void test142_4() throws Throwable {
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
         org.junit.Assert.assertNotNull(betweenVerifyContext3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart7);
    }

    public void test142_5() throws Throwable {
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
         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart7);
    }

    public void test142_6() throws Throwable {
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
         org.junit.Assert.assertNotNull(verifyRangeStart7);
    }

    public void test143_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        se.mockachino.verifier.BadUsageHandler badUsageHandler0 = se.mockachino.order.InOrderVerifyHandler.BAD_USAGE_HANDLER;
        se.mockachino.verifier.BadUsageHandler badUsageHandler1 = se.mockachino.order.InOrderVerifyHandler.BAD_USAGE_HANDLER;
        se.mockachino.verifier.BadUsageHandler[] badUsageHandlerArray2 = new se.mockachino.verifier.BadUsageHandler[] { badUsageHandler1 };
        se.mockachino.stub.Stubber stubber3 = null;  se.mockachino.Mockachino.stubReturn(badUsageHandler0, badUsageHandlerArray2);
        org.junit.Assert.assertNotNull(badUsageHandler0);
        org.junit.Assert.assertNotNull(badUsageHandler1);
        org.junit.Assert.assertNotNull(badUsageHandlerArray2);
// flaky:         org.junit.Assert.assertNotNull(stubber3);
    }

    public void test143_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        se.mockachino.verifier.BadUsageHandler badUsageHandler0 = se.mockachino.order.InOrderVerifyHandler.BAD_USAGE_HANDLER;
        se.mockachino.verifier.BadUsageHandler badUsageHandler1 = se.mockachino.order.InOrderVerifyHandler.BAD_USAGE_HANDLER;
        se.mockachino.verifier.BadUsageHandler[] badUsageHandlerArray2 = new se.mockachino.verifier.BadUsageHandler[] { badUsageHandler1 };
        se.mockachino.stub.Stubber stubber3 = null; // flaky: se.mockachino.Mockachino.stubReturn(badUsageHandler0, badUsageHandlerArray2);
        org.junit.Assert.assertNotNull(badUsageHandler0);
        org.junit.Assert.assertNotNull(badUsageHandler1);
        org.junit.Assert.assertNotNull(badUsageHandlerArray2);
         org.junit.Assert.assertNotNull(stubber3);
    }

    public void test150_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null;  se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null; // flaky: betweenVerifyContext3.verifyAtMost((int) '#');
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null; // flaky: betweenVerifyContext3.verifyAtMost((int) (byte) -1);
        se.mockachino.verifier.Reporter reporter11 = new se.mockachino.verifier.Reporter((int) (byte) 100, (int) (short) 0, (int) '4');
        se.mockachino.util.MockachinoMethod mockachinoMethod12 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] {}

    public void test150_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null;  betweenVerifyContext3.verifyAtMost((int) '#');
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null; // flaky: betweenVerifyContext3.verifyAtMost((int) (byte) -1);
        se.mockachino.verifier.Reporter reporter11 = new se.mockachino.verifier.Reporter((int) (byte) 100, (int) (short) 0, (int) '4');
        se.mockachino.util.MockachinoMethod mockachinoMethod12 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] {}

    public void test150_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null; // flaky: betweenVerifyContext3.verifyAtMost((int) '#');
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null;  betweenVerifyContext3.verifyAtMost((int) (byte) -1);
        se.mockachino.verifier.Reporter reporter11 = new se.mockachino.verifier.Reporter((int) (byte) 100, (int) (short) 0, (int) '4');
        se.mockachino.util.MockachinoMethod mockachinoMethod12 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] {}

    public void test153_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify3 = null;  orderingContext2.verify();
        se.mockachino.alias.SimpleAlias simpleAlias4 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.SimpleAlias simpleAlias5 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.SimpleAlias simpleAlias6 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias[] aliasArray7 = new se.mockachino.alias.Alias[] { simpleAlias4, simpleAlias5, simpleAlias6 }

    public void test154_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        boolean boolean0 = se.mockachino.matchers.MatcherThreadHandler.isClean();
         org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    public void test155_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null;  se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null; // flaky: betweenVerifyContext3.verifyExactly((int) (byte) 1);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart6 = null; // flaky: betweenVerifyContext3.verifyOnce();
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart6);
    }

    public void test155_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null;  betweenVerifyContext3.verifyExactly((int) (byte) 1);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart6 = null; // flaky: betweenVerifyContext3.verifyOnce();
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart6);
    }

    public void test155_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null; // flaky: betweenVerifyContext3.verifyExactly((int) (byte) 1);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart6 = null;  betweenVerifyContext3.verifyOnce();
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart6);
    }

    public void test155_4() throws Throwable {
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
         org.junit.Assert.assertNotNull(betweenVerifyContext3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart6);
    }

    public void test155_5() throws Throwable {
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
         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart6);
    }

    public void test155_6() throws Throwable {
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
         org.junit.Assert.assertNotNull(verifyRangeStart6);
    }

    public void test161_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null;  se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        java.lang.Object obj6 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod7 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] {}

    public void test161_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null;  verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        java.lang.Object obj6 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod7 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] {}

    public void test166_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify4 = null;  orderingContext2.verifyAtLeast(0);
        se.mockachino.verifier.BadUsageThrower badUsageThrower6 = new se.mockachino.verifier.BadUsageThrower("35 calls");
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.order.InOrderVerify inOrderVerify7 = se.mockachino.proxy.ProxyUtil.createProxy(inOrderVerify4, (java.lang.reflect.InvocationHandler) badUsageThrower6);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument se.mockachino.order.InOrderVerify@6b933bd4 is not a mock object");
        }

    public void test170_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify4 = null;  orderingContext2.verifyAtLeast(0);
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

    public void test170_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify4 = null; // flaky: orderingContext2.verifyAtLeast(0);
        se.mockachino.order.MockPoint mockPoint5 = null;  orderingContext2.atLastCall();
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

    public void test170_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify4 = null; // flaky: orderingContext2.verifyAtLeast(0);
        se.mockachino.order.MockPoint mockPoint5 = null; // flaky: orderingContext2.atLastCall();
        se.mockachino.order.MockPoint mockPoint6 = null;  orderingContext2.beforeLastCall();
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

    public void test170_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify4 = null; // flaky: orderingContext2.verifyAtLeast(0);
        se.mockachino.order.MockPoint mockPoint5 = null; // flaky: orderingContext2.atLastCall();
        se.mockachino.order.MockPoint mockPoint6 = null; // flaky: orderingContext2.beforeLastCall();
        se.mockachino.order.MockPoint mockPoint7 = null;  orderingContext2.atLastCall();
        se.mockachino.order.InOrderVerify inOrderVerify9 = null; // flaky: orderingContext2.verifyAtLeast((int) 'a');
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(inOrderVerify4);
// flaky:         org.junit.Assert.assertNotNull(mockPoint5);
// flaky:         org.junit.Assert.assertNotNull(mockPoint6);
// flaky:         org.junit.Assert.assertNotNull(mockPoint7);
// flaky:         org.junit.Assert.assertNotNull(inOrderVerify9);
    }

    public void test170_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify4 = null; // flaky: orderingContext2.verifyAtLeast(0);
        se.mockachino.order.MockPoint mockPoint5 = null; // flaky: orderingContext2.atLastCall();
        se.mockachino.order.MockPoint mockPoint6 = null; // flaky: orderingContext2.beforeLastCall();
        se.mockachino.order.MockPoint mockPoint7 = null; // flaky: orderingContext2.atLastCall();
        se.mockachino.order.InOrderVerify inOrderVerify9 = null;  orderingContext2.verifyAtLeast((int) 'a');
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(inOrderVerify4);
// flaky:         org.junit.Assert.assertNotNull(mockPoint5);
// flaky:         org.junit.Assert.assertNotNull(mockPoint6);
// flaky:         org.junit.Assert.assertNotNull(mockPoint7);
// flaky:         org.junit.Assert.assertNotNull(inOrderVerify9);
    }

    public void test170_6() throws Throwable {
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
         org.junit.Assert.assertNotNull(inOrderVerify4);
// flaky:         org.junit.Assert.assertNotNull(mockPoint5);
// flaky:         org.junit.Assert.assertNotNull(mockPoint6);
// flaky:         org.junit.Assert.assertNotNull(mockPoint7);
// flaky:         org.junit.Assert.assertNotNull(inOrderVerify9);
    }

    public void test170_7() throws Throwable {
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
         org.junit.Assert.assertNotNull(mockPoint5);
// flaky:         org.junit.Assert.assertNotNull(mockPoint6);
// flaky:         org.junit.Assert.assertNotNull(mockPoint7);
// flaky:         org.junit.Assert.assertNotNull(inOrderVerify9);
    }

    public void test170_8() throws Throwable {
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
         org.junit.Assert.assertNotNull(mockPoint6);
// flaky:         org.junit.Assert.assertNotNull(mockPoint7);
// flaky:         org.junit.Assert.assertNotNull(inOrderVerify9);
    }

    public void test170_9() throws Throwable {
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
         org.junit.Assert.assertNotNull(mockPoint7);
// flaky:         org.junit.Assert.assertNotNull(inOrderVerify9);
    }

    public void test170_10() throws Throwable {
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
         org.junit.Assert.assertNotNull(inOrderVerify9);
    }

    public void test171_1() throws Throwable {
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
        se.mockachino.stub.Stubber stubber10 = null;  se.mockachino.Mockachino.stubThrow((java.lang.Throwable) verificationError9);
        boolean boolean11 = stubberOrMatcher5.matches(stubber10);
        se.mockachino.exceptions.UsageError usageError13 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber14 = null; // flaky: stubber10.thenThrow((java.lang.Throwable) usageError13);
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             stubber14.onAnyMethod(obj15);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: mock can not be null");
        }

    public void test171_2() throws Throwable {
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
        se.mockachino.stub.Stubber stubber14 = null;  stubber10.thenThrow((java.lang.Throwable) usageError13);
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             stubber14.onAnyMethod(obj15);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: mock can not be null");
        }

    public void test171_3() throws Throwable {
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
             stubber14.onAnyMethod(obj15);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: mock can not be null");
        }

    public void test171_4() throws Throwable {
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
             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: mock can not be null");
        }

    public void test172_1() throws Throwable {
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
        se.mockachino.stub.Stubber stubber10 = null;  se.mockachino.Mockachino.stubThrow((java.lang.Throwable) verificationError9);
        boolean boolean11 = stubberOrMatcher5.matches(stubber10);
        se.mockachino.exceptions.UsageError usageError13 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber14 = null; // flaky: stubber10.thenThrow((java.lang.Throwable) usageError13);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart16 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart18 = null; // flaky: verifyRangeStart16.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher19 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart18);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer20 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher19);
        java.lang.Object obj21 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod22 = null;
        java.lang.Object[] objArray23 = new java.lang.Object[] {}

    public void test172_2() throws Throwable {
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
        se.mockachino.stub.Stubber stubber14 = null;  stubber10.thenThrow((java.lang.Throwable) usageError13);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart16 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart18 = null; // flaky: verifyRangeStart16.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher19 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart18);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer20 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher19);
        java.lang.Object obj21 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod22 = null;
        java.lang.Object[] objArray23 = new java.lang.Object[] {}

    public void test172_3() throws Throwable {
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
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart16 = null;  se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart18 = null; // flaky: verifyRangeStart16.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher19 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart18);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer20 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher19);
        java.lang.Object obj21 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod22 = null;
        java.lang.Object[] objArray23 = new java.lang.Object[] {}

    public void test172_4() throws Throwable {
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
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart18 = null;  verifyRangeStart16.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher19 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart18);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer20 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher19);
        java.lang.Object obj21 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod22 = null;
        java.lang.Object[] objArray23 = new java.lang.Object[] {}

    public void test175_1() throws Throwable {
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
        se.mockachino.order.MockPoint mockPoint33 = null;  orderingContext32.beforeLastCall();
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

    public void test175_2() throws Throwable {
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
        se.mockachino.order.MockPoint mockPoint34 = null;  orderingContext32.beforeLastCall();
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

    public void test175_3() throws Throwable {
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
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext48 = null;  se.mockachino.Mockachino.before(mockPoint45);
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

    public void test175_4() throws Throwable {
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
        se.mockachino.order.MockPoint mockPoint53 = null;  orderingContext52.beforeLastCall();
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

    public void test175_5() throws Throwable {
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
         org.junit.Assert.assertNotNull(mockPoint33);
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

    public void test175_6() throws Throwable {
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
         org.junit.Assert.assertNotNull(mockPoint34);
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

    public void test175_7() throws Throwable {
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
         org.junit.Assert.assertNotNull(betweenVerifyContext48);
        org.junit.Assert.assertNotNull(mockPoint50);
        org.junit.Assert.assertNotNull(mockPoint51);
// flaky:         org.junit.Assert.assertNotNull(mockPoint53);
    }

    public void test175_8() throws Throwable {
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
         org.junit.Assert.assertNotNull(mockPoint53);
    }

    public void test183_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        se.mockachino.exceptions.UsageError usageError1 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber2 = null;  se.mockachino.Mockachino.stubThrow((java.lang.Throwable) usageError1);
// flaky:         se.mockachino.Mockachino.setupMocks((java.lang.Object) stubber2);
// flaky:         org.junit.Assert.assertNotNull(stubber2);
    }

    public void test183_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        se.mockachino.exceptions.UsageError usageError1 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber2 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) usageError1);
         se.mockachino.Mockachino.setupMocks((java.lang.Object) stubber2);
// flaky:         org.junit.Assert.assertNotNull(stubber2);
    }

    public void test183_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        se.mockachino.exceptions.UsageError usageError1 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber2 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) usageError1);
// flaky:         se.mockachino.Mockachino.setupMocks((java.lang.Object) stubber2);
         org.junit.Assert.assertNotNull(stubber2);
    }

    public void test187_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null;  se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        java.lang.Object obj6 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod7 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] {}

    public void test187_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null;  verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        java.lang.Object obj6 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod7 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] {}

    public void test190_1() throws Throwable {
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
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext13 = null;  se.mockachino.Mockachino.before(mockPoint10);
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

    public void test190_2() throws Throwable {
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
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext26 = null;  se.mockachino.Mockachino.before(mockPoint23);
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

    public void test190_3() throws Throwable {
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
         org.junit.Assert.assertNotNull(betweenVerifyContext13);
        org.junit.Assert.assertNotNull(mockPoint16);
        org.junit.Assert.assertNotNull(mockPoint17);
        org.junit.Assert.assertNotNull(mockPoint19);
        org.junit.Assert.assertNotNull(mockPoint20);
        org.junit.Assert.assertNotNull(mockPoint23);
        org.junit.Assert.assertNotNull(mockPoint24);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext26);
    }

    public void test190_4() throws Throwable {
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
         org.junit.Assert.assertNotNull(betweenVerifyContext26);
    }

    public void test194_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify4 = null;  orderingContext2.verifyAtLeast(0);
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
        }

    public void test194_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify4 = null; // flaky: orderingContext2.verifyAtLeast(0);
        se.mockachino.order.MockPoint mockPoint5 = null;  orderingContext2.atLastCall();
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
        }

    public void test194_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify4 = null; // flaky: orderingContext2.verifyAtLeast(0);
        se.mockachino.order.MockPoint mockPoint5 = null; // flaky: orderingContext2.atLastCall();
        se.mockachino.order.MockPoint mockPoint6 = null;  orderingContext2.beforeLastCall();
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
        }

    public void test197_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        se.mockachino.exceptions.UsageError usageError2 = new se.mockachino.exceptions.UsageError("");
        se.mockachino.exceptions.VerificationError verificationError3 = new se.mockachino.exceptions.VerificationError("", (java.lang.Exception) usageError2);
        se.mockachino.stub.Stubber stubber4 = null;  se.mockachino.Mockachino.stubThrow((java.lang.Throwable) verificationError3);
        se.mockachino.exceptions.UsageError usageError7 = new se.mockachino.exceptions.UsageError("");
        se.mockachino.exceptions.VerificationError verificationError8 = new se.mockachino.exceptions.VerificationError("", (java.lang.Exception) usageError7);
        se.mockachino.stub.Stubber stubber9 = null; // flaky: stubber4.thenThrow((java.lang.Throwable) usageError7);
        se.mockachino.stub.Stubber stubber10 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) usageError7);
        java.lang.Throwable throwable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageError7.addSuppressed(throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        }

    public void test197_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        se.mockachino.exceptions.UsageError usageError2 = new se.mockachino.exceptions.UsageError("");
        se.mockachino.exceptions.VerificationError verificationError3 = new se.mockachino.exceptions.VerificationError("", (java.lang.Exception) usageError2);
        se.mockachino.stub.Stubber stubber4 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) verificationError3);
        se.mockachino.exceptions.UsageError usageError7 = new se.mockachino.exceptions.UsageError("");
        se.mockachino.exceptions.VerificationError verificationError8 = new se.mockachino.exceptions.VerificationError("", (java.lang.Exception) usageError7);
        se.mockachino.stub.Stubber stubber9 = null;  stubber4.thenThrow((java.lang.Throwable) usageError7);
        se.mockachino.stub.Stubber stubber10 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) usageError7);
        java.lang.Throwable throwable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageError7.addSuppressed(throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        }

    public void test197_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        se.mockachino.exceptions.UsageError usageError2 = new se.mockachino.exceptions.UsageError("");
        se.mockachino.exceptions.VerificationError verificationError3 = new se.mockachino.exceptions.VerificationError("", (java.lang.Exception) usageError2);
        se.mockachino.stub.Stubber stubber4 = null; // flaky: se.mockachino.Mockachino.stubThrow((java.lang.Throwable) verificationError3);
        se.mockachino.exceptions.UsageError usageError7 = new se.mockachino.exceptions.UsageError("");
        se.mockachino.exceptions.VerificationError verificationError8 = new se.mockachino.exceptions.VerificationError("", (java.lang.Exception) usageError7);
        se.mockachino.stub.Stubber stubber9 = null; // flaky: stubber4.thenThrow((java.lang.Throwable) usageError7);
        se.mockachino.stub.Stubber stubber10 = null;  se.mockachino.Mockachino.stubThrow((java.lang.Throwable) usageError7);
        java.lang.Throwable throwable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            usageError7.addSuppressed(throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        }

    public void test204_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null;  se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        java.lang.Object obj6 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod7 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] {}

    public void test204_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null;  verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        java.lang.Object obj6 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod7 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] {}

    public void test205_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null;  se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        java.lang.Object obj6 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod7 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] {}

    public void test205_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null;  verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        java.lang.Object obj6 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod7 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] {}

    public void test207_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify4 = null;  orderingContext2.verifyAtLeast(0);
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

    public void test207_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify4 = null; // flaky: orderingContext2.verifyAtLeast(0);
        se.mockachino.order.MockPoint mockPoint5 = null;  orderingContext2.atLastCall();
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

    public void test207_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify4 = null; // flaky: orderingContext2.verifyAtLeast(0);
        se.mockachino.order.MockPoint mockPoint5 = null; // flaky: orderingContext2.atLastCall();
        se.mockachino.order.MockPoint mockPoint6 = null;  orderingContext2.beforeLastCall();
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

    public void test207_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify4 = null; // flaky: orderingContext2.verifyAtLeast(0);
        se.mockachino.order.MockPoint mockPoint5 = null; // flaky: orderingContext2.atLastCall();
        se.mockachino.order.MockPoint mockPoint6 = null; // flaky: orderingContext2.beforeLastCall();
        se.mockachino.order.MockPoint mockPoint7 = null;  orderingContext2.atLastCall();
        se.mockachino.order.MockPoint mockPoint8 = null; // flaky: orderingContext2.beforeLastCall();
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(inOrderVerify4);
// flaky:         org.junit.Assert.assertNotNull(mockPoint5);
// flaky:         org.junit.Assert.assertNotNull(mockPoint6);
// flaky:         org.junit.Assert.assertNotNull(mockPoint7);
// flaky:         org.junit.Assert.assertNotNull(mockPoint8);
    }

    public void test207_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify4 = null; // flaky: orderingContext2.verifyAtLeast(0);
        se.mockachino.order.MockPoint mockPoint5 = null; // flaky: orderingContext2.atLastCall();
        se.mockachino.order.MockPoint mockPoint6 = null; // flaky: orderingContext2.beforeLastCall();
        se.mockachino.order.MockPoint mockPoint7 = null; // flaky: orderingContext2.atLastCall();
        se.mockachino.order.MockPoint mockPoint8 = null;  orderingContext2.beforeLastCall();
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(inOrderVerify4);
// flaky:         org.junit.Assert.assertNotNull(mockPoint5);
// flaky:         org.junit.Assert.assertNotNull(mockPoint6);
// flaky:         org.junit.Assert.assertNotNull(mockPoint7);
// flaky:         org.junit.Assert.assertNotNull(mockPoint8);
    }

    public void test207_6() throws Throwable {
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
         org.junit.Assert.assertNotNull(inOrderVerify4);
// flaky:         org.junit.Assert.assertNotNull(mockPoint5);
// flaky:         org.junit.Assert.assertNotNull(mockPoint6);
// flaky:         org.junit.Assert.assertNotNull(mockPoint7);
// flaky:         org.junit.Assert.assertNotNull(mockPoint8);
    }

    public void test207_7() throws Throwable {
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
         org.junit.Assert.assertNotNull(mockPoint5);
// flaky:         org.junit.Assert.assertNotNull(mockPoint6);
// flaky:         org.junit.Assert.assertNotNull(mockPoint7);
// flaky:         org.junit.Assert.assertNotNull(mockPoint8);
    }

    public void test207_8() throws Throwable {
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
         org.junit.Assert.assertNotNull(mockPoint6);
// flaky:         org.junit.Assert.assertNotNull(mockPoint7);
// flaky:         org.junit.Assert.assertNotNull(mockPoint8);
    }

    public void test207_9() throws Throwable {
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
         org.junit.Assert.assertNotNull(mockPoint7);
// flaky:         org.junit.Assert.assertNotNull(mockPoint8);
    }

    public void test207_10() throws Throwable {
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
         org.junit.Assert.assertNotNull(mockPoint8);
    }

    public void test208_1() throws Throwable {
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
        se.mockachino.stub.Stubber stubber10 = null;  se.mockachino.Mockachino.stubThrow((java.lang.Throwable) verificationError9);
        boolean boolean11 = stubberOrMatcher5.matches(stubber10);
        se.mockachino.exceptions.UsageError usageError13 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber14 = null; // flaky: stubber10.thenThrow((java.lang.Throwable) usageError13);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart16 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart18 = null; // flaky: verifyRangeStart16.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher19 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart18);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer20 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher19);
        java.lang.Object obj21 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod22 = null;
        java.lang.Object[] objArray23 = new java.lang.Object[] {}

    public void test208_2() throws Throwable {
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
        se.mockachino.stub.Stubber stubber14 = null;  stubber10.thenThrow((java.lang.Throwable) usageError13);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart16 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart18 = null; // flaky: verifyRangeStart16.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher19 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart18);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer20 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher19);
        java.lang.Object obj21 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod22 = null;
        java.lang.Object[] objArray23 = new java.lang.Object[] {}

    public void test208_3() throws Throwable {
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
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart16 = null;  se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart18 = null; // flaky: verifyRangeStart16.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher19 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart18);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer20 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher19);
        java.lang.Object obj21 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod22 = null;
        java.lang.Object[] objArray23 = new java.lang.Object[] {}

    public void test208_4() throws Throwable {
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
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart18 = null;  verifyRangeStart16.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher19 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart18);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer20 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher19);
        java.lang.Object obj21 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod22 = null;
        java.lang.Object[] objArray23 = new java.lang.Object[] {}

    public void test211_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        se.mockachino.MockSettings mockSettings1 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler2 = mockSettings1.getFallback();
        se.mockachino.observer.ObserverAdder observerAdder3 = new se.mockachino.observer.ObserverAdder(callHandler2);
        se.mockachino.observer.ObserverAdder observerAdder4 = null;  se.mockachino.Mockachino.observeWith(callHandler2);
        se.mockachino.matchers.matcher.Matcher[] matcherArray6 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray7 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray6;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher8 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray6);
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher9 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>((se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = null; // flaky: observerAdder4.on((java.lang.Object[]) matcherArray6);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument [Lse.mockachino.matchers.matcher.Matcher;@5edaa3d1 is not a mock object");
        }

    public void test211_2() throws Throwable {
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
            java.lang.Object[] objArray10 = null;  observerAdder4.on((java.lang.Object[]) matcherArray6);
// flaky:             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument [Lse.mockachino.matchers.matcher.Matcher;@5edaa3d1 is not a mock object");
        }

    public void test211_3() throws Throwable {
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
             org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument [Lse.mockachino.matchers.matcher.Matcher;@5edaa3d1 is not a mock object");
        }

    public void test215_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart0 = null;  se.mockachino.Mockachino.verifyNever();
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart0);
    }

    public void test215_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart0 = null; // flaky: se.mockachino.Mockachino.verifyNever();
         org.junit.Assert.assertNotNull(verifyRangeStart0);
    }

    public void test219_1() throws Throwable {
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
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext13 = null;  se.mockachino.Mockachino.between(mockPoint9, mockPoint12);
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

    public void test219_2() throws Throwable {
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
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext41 = null;  se.mockachino.Mockachino.before(mockPoint38);
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

    public void test219_3() throws Throwable {
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
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext48 = null;  se.mockachino.Mockachino.before(mockPoint45);
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

    public void test219_4() throws Throwable {
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
        se.mockachino.order.MockPoint mockPoint52 = null;  orderingContext51.beforeLastCall();
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

    public void test219_5() throws Throwable {
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
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext56 = null;  se.mockachino.Mockachino.after(mockPoint34);
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

    public void test219_6() throws Throwable {
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
         org.junit.Assert.assertNotNull(betweenVerifyContext13);
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

    public void test219_7() throws Throwable {
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
         org.junit.Assert.assertNotNull(betweenVerifyContext41);
        org.junit.Assert.assertNotNull(mockPoint45);
        org.junit.Assert.assertNotNull(mockPoint46);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext48);
        org.junit.Assert.assertNotNull(mockPoint49);
        org.junit.Assert.assertNotNull(mockPoint50);
// flaky:         org.junit.Assert.assertNotNull(mockPoint52);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext56);
    }

    public void test219_8() throws Throwable {
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
         org.junit.Assert.assertNotNull(betweenVerifyContext48);
        org.junit.Assert.assertNotNull(mockPoint49);
        org.junit.Assert.assertNotNull(mockPoint50);
// flaky:         org.junit.Assert.assertNotNull(mockPoint52);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext56);
    }

    public void test219_9() throws Throwable {
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
         org.junit.Assert.assertNotNull(mockPoint52);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext56);
    }

    public void test219_10() throws Throwable {
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
         org.junit.Assert.assertNotNull(betweenVerifyContext56);
    }

    public void test222_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null;  se.mockachino.Mockachino.verifyAtLeast(0);
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
        java.lang.Object[] objArray35 = new java.lang.Object[] {}

    public void test222_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null;  verifyRangeStart1.withTimeout((long) ' ');
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
        java.lang.Object[] objArray35 = new java.lang.Object[] {}

    public void test222_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null;  se.mockachino.Mockachino.verifyAtLeast(0);
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
        java.lang.Object[] objArray35 = new java.lang.Object[] {}

    public void test222_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart9 = null;  verifyRangeStart7.withTimeout((long) ' ');
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
        java.lang.Object[] objArray35 = new java.lang.Object[] {}

    public void test222_5() throws Throwable {
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
        se.mockachino.stub.Stubber stubber22 = null;  se.mockachino.Mockachino.stubThrow((java.lang.Throwable) verificationError21);
        boolean boolean23 = stubberOrMatcher17.matches(stubber22);
        se.mockachino.exceptions.UsageError usageError25 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber26 = null; // flaky: stubber22.thenThrow((java.lang.Throwable) usageError25);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart28 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart30 = null; // flaky: verifyRangeStart28.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher31 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart30);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer32 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher31);
        java.lang.Object obj33 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod34 = null;
        java.lang.Object[] objArray35 = new java.lang.Object[] {}

    public void test222_6() throws Throwable {
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
        se.mockachino.stub.Stubber stubber26 = null;  stubber22.thenThrow((java.lang.Throwable) usageError25);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart28 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart30 = null; // flaky: verifyRangeStart28.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher31 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart30);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer32 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher31);
        java.lang.Object obj33 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod34 = null;
        java.lang.Object[] objArray35 = new java.lang.Object[] {}

    public void test222_7() throws Throwable {
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
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart28 = null;  se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart30 = null; // flaky: verifyRangeStart28.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher31 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart30);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer32 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher31);
        java.lang.Object obj33 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod34 = null;
        java.lang.Object[] objArray35 = new java.lang.Object[] {}

    public void test222_8() throws Throwable {
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
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart30 = null;  verifyRangeStart28.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher31 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart30);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer32 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher31);
        java.lang.Object obj33 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod34 = null;
        java.lang.Object[] objArray35 = new java.lang.Object[] {}

    public void test233_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null;  se.mockachino.Mockachino.before(mockPoint0);
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

    public void test233_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null;  betweenVerifyContext3.verifyAtMost((int) '#');
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

    public void test233_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null; // flaky: betweenVerifyContext3.verifyAtMost((int) '#');
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null;  betweenVerifyContext3.verifyAtMost((int) (byte) -1);
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

    public void test233_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null; // flaky: betweenVerifyContext3.verifyAtMost((int) '#');
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null; // flaky: betweenVerifyContext3.verifyAtMost((int) (byte) -1);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart10 = null;  betweenVerifyContext3.verifyRange(0, (int) (byte) 100);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart13 = null; // flaky: betweenVerifyContext3.verifyRange(0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart7);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart10);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart13);
    }

    public void test233_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null; // flaky: betweenVerifyContext3.verifyAtMost((int) '#');
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null; // flaky: betweenVerifyContext3.verifyAtMost((int) (byte) -1);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart10 = null; // flaky: betweenVerifyContext3.verifyRange(0, (int) (byte) 100);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart13 = null;  betweenVerifyContext3.verifyRange(0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart7);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart10);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart13);
    }

    public void test233_6() throws Throwable {
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
         org.junit.Assert.assertNotNull(betweenVerifyContext3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart7);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart10);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart13);
    }

    public void test233_7() throws Throwable {
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
         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart7);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart10);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart13);
    }

    public void test233_8() throws Throwable {
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
         org.junit.Assert.assertNotNull(verifyRangeStart7);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart10);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart13);
    }

    public void test233_9() throws Throwable {
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
         org.junit.Assert.assertNotNull(verifyRangeStart10);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart13);
    }

    public void test233_10() throws Throwable {
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
         org.junit.Assert.assertNotNull(verifyRangeStart13);
    }

    public void test241_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null;  se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        java.lang.Class<java.lang.String> strClass6 = null;
        java.lang.Class[] classArray7 = new java.lang.Class[] {}

    public void test241_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null;  verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        java.lang.Class<java.lang.String> strClass6 = null;
        java.lang.Class[] classArray7 = new java.lang.Class[] {}

    public void test242_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null;  se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        java.lang.Object obj6 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod7 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] {}

    public void test242_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null;  verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        java.lang.Object obj6 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod7 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] {}

    public void test244_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null;  se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        java.lang.Object obj6 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod7 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] {}

    public void test244_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null;  verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        java.lang.Object obj6 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod7 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] {}

    public void test245_1() throws Throwable {
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
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext27 = null;  se.mockachino.Mockachino.before(mockPoint24);
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

    public void test245_2() throws Throwable {
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
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext34 = null;  se.mockachino.Mockachino.before(mockPoint31);
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

    public void test245_3() throws Throwable {
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
        se.mockachino.order.MockPoint mockPoint38 = null;  orderingContext37.beforeLastCall();
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

    public void test245_4() throws Throwable {
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
         org.junit.Assert.assertNotNull(betweenVerifyContext27);
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

    public void test245_5() throws Throwable {
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
         org.junit.Assert.assertNotNull(betweenVerifyContext34);
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

    public void test245_6() throws Throwable {
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
         org.junit.Assert.assertNotNull(mockPoint38);
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

    public void test249_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        se.mockachino.order.MockPoint mockPoint2 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint3 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext4 = new se.mockachino.order.OrderingContext(mockPoint2, mockPoint3);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext5 = null;  se.mockachino.Mockachino.before(mockPoint2);
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

    public void test249_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        se.mockachino.order.MockPoint mockPoint2 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint3 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext4 = new se.mockachino.order.OrderingContext(mockPoint2, mockPoint3);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext5 = null; // flaky: se.mockachino.Mockachino.before(mockPoint2);
        se.mockachino.order.MockPoint mockPoint8 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint9 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext10 = new se.mockachino.order.OrderingContext(mockPoint8, mockPoint9);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext11 = null;  se.mockachino.Mockachino.before(mockPoint8);
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

    public void test249_3() throws Throwable {
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
        se.mockachino.order.MockPoint mockPoint15 = null;  orderingContext14.beforeLastCall();
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

    public void test249_4() throws Throwable {
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
         org.junit.Assert.assertNotNull(betweenVerifyContext5);
        org.junit.Assert.assertNotNull(mockPoint8);
        org.junit.Assert.assertNotNull(mockPoint9);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext11);
        org.junit.Assert.assertNotNull(mockPoint12);
        org.junit.Assert.assertNotNull(mockPoint13);
// flaky:         org.junit.Assert.assertNotNull(mockPoint15);
    }

    public void test249_5() throws Throwable {
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
         org.junit.Assert.assertNotNull(betweenVerifyContext11);
        org.junit.Assert.assertNotNull(mockPoint12);
        org.junit.Assert.assertNotNull(mockPoint13);
// flaky:         org.junit.Assert.assertNotNull(mockPoint15);
    }

    public void test249_6() throws Throwable {
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
         org.junit.Assert.assertNotNull(mockPoint15);
    }

    public void test251_1() throws Throwable {
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
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext13 = null;  se.mockachino.Mockachino.between(mockPoint9, mockPoint12);
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
        }

    public void test251_2() throws Throwable {
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
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext41 = null;  se.mockachino.Mockachino.before(mockPoint38);
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
        }

    public void test251_3() throws Throwable {
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
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext48 = null;  se.mockachino.Mockachino.before(mockPoint45);
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
        }

    public void test251_4() throws Throwable {
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
        se.mockachino.order.MockPoint mockPoint52 = null;  orderingContext51.beforeLastCall();
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart53 = new se.mockachino.verifier.VerifyRangeStart((-1), 0, mockPoint45, mockPoint52);
        se.mockachino.order.MockPointIterable mockPointIterable54 = new se.mockachino.order.MockPointIterable((java.lang.Iterable<se.mockachino.Invocation>) mockPointIterable29, mockPoint34, mockPoint45);
        se.mockachino.order.MockPointIterator mockPointIterator55 = new se.mockachino.order.MockPointIterator((java.util.Iterator<se.mockachino.Invocation>) mockPointIterator5, mockPoint12, mockPoint34);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = mockPointIterator55.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        }

    public void test253_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null;  se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null; // flaky: betweenVerifyContext3.verifyExactly((int) (byte) 1);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null; // flaky: betweenVerifyContext3.verifyExactly((int) '4');
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart10 = null; // flaky: betweenVerifyContext3.verifyRange((int) (byte) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.alias.Alias alias11 = se.mockachino.alias.AllAlias.fromMock((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument 100 is not a mock object");
        }

    public void test253_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null;  betweenVerifyContext3.verifyExactly((int) (byte) 1);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null; // flaky: betweenVerifyContext3.verifyExactly((int) '4');
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart10 = null; // flaky: betweenVerifyContext3.verifyRange((int) (byte) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.alias.Alias alias11 = se.mockachino.alias.AllAlias.fromMock((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument 100 is not a mock object");
        }

    public void test253_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null; // flaky: betweenVerifyContext3.verifyExactly((int) (byte) 1);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null;  betweenVerifyContext3.verifyExactly((int) '4');
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart10 = null; // flaky: betweenVerifyContext3.verifyRange((int) (byte) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.alias.Alias alias11 = se.mockachino.alias.AllAlias.fromMock((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument 100 is not a mock object");
        }

    public void test253_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null; // flaky: betweenVerifyContext3.verifyExactly((int) (byte) 1);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null; // flaky: betweenVerifyContext3.verifyExactly((int) '4');
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart10 = null;  betweenVerifyContext3.verifyRange((int) (byte) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            se.mockachino.alias.Alias alias11 = se.mockachino.alias.AllAlias.fromMock((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type se.mockachino.exceptions.UsageError; message: argument 100 is not a mock object");
        }

    public void test260_1() throws Throwable {
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
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext53 = null;  se.mockachino.Mockachino.before(mockPoint50);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext54 = new se.mockachino.order.BetweenVerifyContext(mockPoint46, mockPoint50);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart57 = null; // flaky: betweenVerifyContext54.verifyRange(1, (int) (short) 100);
        se.mockachino.util.MockachinoMethod mockachinoMethod58 = null;
        java.lang.Object[] objArray59 = new java.lang.Object[] {}

    public void test260_2() throws Throwable {
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
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart57 = null;  betweenVerifyContext54.verifyRange(1, (int) (short) 100);
        se.mockachino.util.MockachinoMethod mockachinoMethod58 = null;
        java.lang.Object[] objArray59 = new java.lang.Object[] {}

    public void test261_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        se.mockachino.MockSettings mockSettings1 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler2 = mockSettings1.getFallback();
        se.mockachino.MockSettings mockSettings3 = mockSettings1.notQuick();
        se.mockachino.MockSettings mockSettings4 = mockSettings1.quick();
        se.mockachino.MockSettings mockSettings5 = mockSettings4.quick();
        java.lang.String str6 = mockSettings5.getName();
        se.mockachino.CallHandler callHandler7 = mockSettings5.getFallback();
        se.mockachino.observer.ObserverAdder observerAdder8 = null;  se.mockachino.Mockachino.observeWith(callHandler7);
        org.junit.Assert.assertNotNull(mockSettings1);
        org.junit.Assert.assertNotNull(callHandler2);
        org.junit.Assert.assertNotNull(mockSettings3);
        org.junit.Assert.assertNotNull(mockSettings4);
        org.junit.Assert.assertNotNull(mockSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(callHandler7);
// flaky:         org.junit.Assert.assertNotNull(observerAdder8);
    }

    public void test261_2() throws Throwable {
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
         org.junit.Assert.assertNotNull(observerAdder8);
    }

    public void test266_1() throws Throwable {
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
        se.mockachino.stub.Stubber stubber10 = null;  se.mockachino.Mockachino.stubThrow((java.lang.Throwable) verificationError9);
        boolean boolean11 = stubberOrMatcher5.matches(stubber10);
        se.mockachino.exceptions.UsageError usageError13 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber14 = null; // flaky: stubber10.thenThrow((java.lang.Throwable) usageError13);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart16 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart18 = null; // flaky: verifyRangeStart16.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher19 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart18);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer20 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher19);
        java.lang.Object obj21 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod22 = null;
        java.lang.Object[] objArray23 = new java.lang.Object[] {}

    public void test266_2() throws Throwable {
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
        se.mockachino.stub.Stubber stubber14 = null;  stubber10.thenThrow((java.lang.Throwable) usageError13);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart16 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart18 = null; // flaky: verifyRangeStart16.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher19 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart18);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer20 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher19);
        java.lang.Object obj21 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod22 = null;
        java.lang.Object[] objArray23 = new java.lang.Object[] {}

    public void test266_3() throws Throwable {
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
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart16 = null;  se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart18 = null; // flaky: verifyRangeStart16.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher19 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart18);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer20 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher19);
        java.lang.Object obj21 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod22 = null;
        java.lang.Object[] objArray23 = new java.lang.Object[] {}

    public void test266_4() throws Throwable {
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
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart18 = null;  verifyRangeStart16.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher19 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart18);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer20 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher19);
        java.lang.Object obj21 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod22 = null;
        java.lang.Object[] objArray23 = new java.lang.Object[] {}

    public void test270_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null;  se.mockachino.Mockachino.before(mockPoint0);
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

    public void test270_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null;  betweenVerifyContext3.verifyExactly((int) (byte) 1);
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

    public void test270_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null; // flaky: betweenVerifyContext3.verifyExactly((int) (byte) 1);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null;  betweenVerifyContext3.verifyExactly((int) '4');
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

    public void test270_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null; // flaky: betweenVerifyContext3.verifyExactly((int) (byte) 1);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null; // flaky: betweenVerifyContext3.verifyExactly((int) '4');
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart9 = null;  betweenVerifyContext3.verifyAtMost(0);
        se.mockachino.order.OrderingContext orderingContext10 = null; // flaky: betweenVerifyContext3.newOrdering();
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart7);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart9);
// flaky:         org.junit.Assert.assertNotNull(orderingContext10);
    }

    public void test270_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext3 = null; // flaky: se.mockachino.Mockachino.before(mockPoint0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart5 = null; // flaky: betweenVerifyContext3.verifyExactly((int) (byte) 1);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null; // flaky: betweenVerifyContext3.verifyExactly((int) '4');
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart9 = null; // flaky: betweenVerifyContext3.verifyAtMost(0);
        se.mockachino.order.OrderingContext orderingContext10 = null;  betweenVerifyContext3.newOrdering();
        org.junit.Assert.assertNotNull(mockPoint0);
        org.junit.Assert.assertNotNull(mockPoint1);
// flaky:         org.junit.Assert.assertNotNull(betweenVerifyContext3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart7);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart9);
// flaky:         org.junit.Assert.assertNotNull(orderingContext10);
    }

    public void test270_6() throws Throwable {
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
         org.junit.Assert.assertNotNull(betweenVerifyContext3);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart7);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart9);
// flaky:         org.junit.Assert.assertNotNull(orderingContext10);
    }

    public void test270_7() throws Throwable {
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
         org.junit.Assert.assertNotNull(verifyRangeStart5);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart7);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart9);
// flaky:         org.junit.Assert.assertNotNull(orderingContext10);
    }

    public void test270_8() throws Throwable {
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
         org.junit.Assert.assertNotNull(verifyRangeStart7);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart9);
// flaky:         org.junit.Assert.assertNotNull(orderingContext10);
    }

    public void test270_9() throws Throwable {
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
         org.junit.Assert.assertNotNull(verifyRangeStart9);
// flaky:         org.junit.Assert.assertNotNull(orderingContext10);
    }

    public void test270_10() throws Throwable {
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
         org.junit.Assert.assertNotNull(orderingContext10);
    }

    public void test274_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null;  se.mockachino.Mockachino.verifyAtLeast(0);
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
        java.lang.Object[] objArray35 = new java.lang.Object[] {}

    public void test274_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null;  verifyRangeStart1.withTimeout((long) ' ');
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
        java.lang.Object[] objArray35 = new java.lang.Object[] {}

    public void test274_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null;  se.mockachino.Mockachino.verifyAtLeast(0);
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
        java.lang.Object[] objArray35 = new java.lang.Object[] {}

    public void test274_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = null; // flaky: verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart7 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart9 = null;  verifyRangeStart7.withTimeout((long) ' ');
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
        java.lang.Object[] objArray35 = new java.lang.Object[] {}

    public void test274_5() throws Throwable {
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
        se.mockachino.stub.Stubber stubber22 = null;  se.mockachino.Mockachino.stubThrow((java.lang.Throwable) verificationError21);
        boolean boolean23 = stubberOrMatcher17.matches(stubber22);
        se.mockachino.exceptions.UsageError usageError25 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber26 = null; // flaky: stubber22.thenThrow((java.lang.Throwable) usageError25);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart28 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart30 = null; // flaky: verifyRangeStart28.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher31 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart30);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer32 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher31);
        java.lang.Object obj33 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod34 = null;
        java.lang.Object[] objArray35 = new java.lang.Object[] {}

    public void test274_6() throws Throwable {
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
        se.mockachino.stub.Stubber stubber26 = null;  stubber22.thenThrow((java.lang.Throwable) usageError25);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart28 = null; // flaky: se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart30 = null; // flaky: verifyRangeStart28.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher31 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart30);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer32 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher31);
        java.lang.Object obj33 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod34 = null;
        java.lang.Object[] objArray35 = new java.lang.Object[] {}

    public void test274_7() throws Throwable {
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
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart28 = null;  se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart30 = null; // flaky: verifyRangeStart28.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher31 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart30);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer32 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher31);
        java.lang.Object obj33 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod34 = null;
        java.lang.Object[] objArray35 = new java.lang.Object[] {}

    public void test274_8() throws Throwable {
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
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart30 = null;  verifyRangeStart28.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher31 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart30);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer32 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher31);
        java.lang.Object obj33 = null;
        se.mockachino.util.MockachinoMethod mockachinoMethod34 = null;
        java.lang.Object[] objArray35 = new java.lang.Object[] {}

    public void test281_1() throws Throwable {
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
        se.mockachino.order.InOrderVerify inOrderVerify22 = null;  orderingContext20.verifyAtLeast(0);
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

    public void test281_2() throws Throwable {
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
        se.mockachino.order.MockPoint mockPoint23 = null;  orderingContext20.atLastCall();
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

    public void test281_3() throws Throwable {
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
        se.mockachino.order.MockPoint mockPoint24 = null;  orderingContext20.beforeLastCall();
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

    public void test281_4() throws Throwable {
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
         org.junit.Assert.assertNotNull(inOrderVerify22);
// flaky:         org.junit.Assert.assertNotNull(mockPoint23);
// flaky:         org.junit.Assert.assertNotNull(mockPoint24);
        org.junit.Assert.assertNotNull(mockPoint27);
        org.junit.Assert.assertNotNull(mockPoint28);
    }

    public void test281_5() throws Throwable {
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
         org.junit.Assert.assertNotNull(mockPoint23);
// flaky:         org.junit.Assert.assertNotNull(mockPoint24);
        org.junit.Assert.assertNotNull(mockPoint27);
        org.junit.Assert.assertNotNull(mockPoint28);
    }

    public void test281_6() throws Throwable {
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
         org.junit.Assert.assertNotNull(mockPoint24);
        org.junit.Assert.assertNotNull(mockPoint27);
        org.junit.Assert.assertNotNull(mockPoint28);
    }

    public void test286_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        se.mockachino.exceptions.UsageError usageError1 = new se.mockachino.exceptions.UsageError("hi!");
        se.mockachino.stub.Stubber stubber2 = null;  se.mockachino.Mockachino.stubThrow((java.lang.Throwable) usageError1);
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
        java.lang.Object[] objArray37 = new java.lang.Object[] {}

    public void test287_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.order.InOrderVerify inOrderVerify4 = null;  orderingContext2.verifyAtLeast(0);
        se.mockachino.matchers.matcher.Matcher[] matcherArray6 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray7 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray6;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher8 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray7);
        se.mockachino.util.MockachinoMethod mockachinoMethod9 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] {}

    public void test292_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null;  se.mockachino.Mockachino.verifyAtMost((int) (byte) 1);
// flaky:         org.junit.Assert.assertNotNull(verifyRangeStart1);
    }

    public void test292_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = null; // flaky: se.mockachino.Mockachino.verifyAtMost((int) (byte) 1);
         org.junit.Assert.assertNotNull(verifyRangeStart1);
    }

    public void test298_1() throws Throwable {
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
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext11 = null;  se.mockachino.Mockachino.before(mockPoint8);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext12 = new se.mockachino.order.BetweenVerifyContext(mockPoint4, mockPoint8);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart15 = null; // flaky: betweenVerifyContext12.verifyRange(1, (int) (short) 100);
        se.mockachino.matchers.matcher.Matcher[] matcherArray17 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray18 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray17;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher19 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray18);
        se.mockachino.util.MockachinoMethod mockachinoMethod20 = null;
        java.lang.Object[] objArray21 = new java.lang.Object[] {}

    public void test298_2() throws Throwable {
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
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart15 = null;  betweenVerifyContext12.verifyRange(1, (int) (short) 100);
        se.mockachino.matchers.matcher.Matcher[] matcherArray17 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray18 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray17;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher19 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray18);
        se.mockachino.util.MockachinoMethod mockachinoMethod20 = null;
        java.lang.Object[] objArray21 = new java.lang.Object[] {}
}