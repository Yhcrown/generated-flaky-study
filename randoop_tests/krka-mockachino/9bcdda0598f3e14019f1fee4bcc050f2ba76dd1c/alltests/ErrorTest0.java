import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        se.mockachino.order.MockPoint mockPoint0 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint1 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext2 = new se.mockachino.order.OrderingContext(mockPoint0, mockPoint1);
        se.mockachino.MockSettings mockSettings4 = se.mockachino.Settings.name("");
        se.mockachino.order.MockPoint mockPoint5 = se.mockachino.Mockachino.spy(mockPoint0, mockSettings4);
        org.junit.Assert.assertTrue("Contract failed: mockPoint5.equals(mockPoint5)", mockPoint5.equals(mockPoint5));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart1 = se.mockachino.Mockachino.verifyAtLeast(0);
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart3 = verifyRangeStart1.withTimeout((long) ' ');
        se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>> strClassMatcherEqualityMatcher4 = new se.mockachino.matchers.matcher.EqualityMatcher<se.mockachino.matchers.matcher.ClassMatcher<java.lang.String>>((java.lang.Object) verifyRangeStart3);
        se.mockachino.stub.returnvalue.ReturnAnswer returnAnswer5 = new se.mockachino.stub.returnvalue.ReturnAnswer((java.lang.Object) strClassMatcherEqualityMatcher4);
        se.mockachino.util.MockachinoMethod mockachinoMethod6 = se.mockachino.util.MockachinoMethod.NULL;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        returnAnswer5.verify(mockachinoMethod6);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        se.mockachino.MockSettings mockSettings1 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler2 = mockSettings1.getFallback();
        se.mockachino.observer.ObserverAdder observerAdder3 = new se.mockachino.observer.ObserverAdder(callHandler2);
        se.mockachino.observer.ObserverAdder observerAdder4 = se.mockachino.Mockachino.spy(observerAdder3);
        org.junit.Assert.assertTrue("Contract failed: observerAdder4.equals(observerAdder4)", observerAdder4.equals(observerAdder4));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        se.mockachino.order.MockPoint mockPoint2 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint3 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext4 = new se.mockachino.order.OrderingContext(mockPoint2, mockPoint3);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext5 = se.mockachino.Mockachino.before(mockPoint2);
        se.mockachino.order.MockPoint mockPoint6 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint7 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext8 = new se.mockachino.order.OrderingContext(mockPoint6, mockPoint7);
        se.mockachino.order.MockPoint mockPoint9 = orderingContext8.beforeLastCall();
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart10 = new se.mockachino.verifier.VerifyRangeStart((-1), 0, mockPoint2, mockPoint9);
        se.mockachino.MockSettings mockSettings12 = se.mockachino.Settings.name("");
        se.mockachino.CallHandler callHandler13 = mockSettings12.getFallback();
        se.mockachino.MockSettings mockSettings14 = mockSettings12.notQuick();
        se.mockachino.CallHandler callHandler15 = mockSettings12.getFallback();
        se.mockachino.MockSettings mockSettings17 = mockSettings12.name("void <null>()");
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart18 = se.mockachino.Mockachino.spy(verifyRangeStart10, mockSettings12);
        org.junit.Assert.assertTrue("Contract failed: verifyRangeStart18.equals(verifyRangeStart18)", verifyRangeStart18.equals(verifyRangeStart18));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        se.mockachino.matchers.Matchers matchers0 = new se.mockachino.matchers.Matchers();
        se.mockachino.matchers.MatchersBase[] matchersBaseArray1 = new se.mockachino.matchers.MatchersBase[] { matchers0 };
        java.util.ArrayList<se.mockachino.matchers.MatchersBase> matchersBaseList2 = new java.util.ArrayList<se.mockachino.matchers.MatchersBase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBaseArray1);
        se.mockachino.matchers.MatchersBase matchersBase4 = new se.mockachino.matchers.MatchersBase();
        se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase> matchersBaseList5 = new se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase>((java.util.List<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBase4);
        java.lang.Class<se.mockachino.Invocation> invocationClass6 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray8 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray9 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray8;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher10 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray9);
        java.lang.Class<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherClass11 = methodCallMatcherAndMatcher10.getType();
        se.mockachino.MockData<se.mockachino.Invocation> invocationMockData13 = new se.mockachino.MockData<se.mockachino.Invocation>(invocationClass6, (java.lang.reflect.Type) methodCallMatcherClass11, "se.mockachino.exceptions.UsageError: ");
        invocationMockData13.resetStubs();
        java.lang.reflect.Type type15 = invocationMockData13.getTypeLiteral();
        java.util.Set<se.mockachino.util.MockachinoMethod> mockachinoMethodSet16 = invocationMockData13.getMethods();
        boolean boolean17 = matchersBaseList5.retainAll((java.util.Collection<se.mockachino.util.MockachinoMethod>) mockachinoMethodSet16);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on matchersBaseList2 and matchersBaseList5.", matchersBaseList2.equals(matchersBaseList5) == matchersBaseList5.equals(matchersBaseList2));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        se.mockachino.util.MockachinoMethod mockachinoMethod0 = se.mockachino.util.MockachinoMethod.NULL;
        java.lang.reflect.Method method1 = mockachinoMethod0.getMethod();
        boolean boolean2 = mockachinoMethod0.isToStringCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass3 = mockachinoMethod0.getReturnType();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        se.mockachino.matchers.Matchers matchers0 = new se.mockachino.matchers.Matchers();
        se.mockachino.matchers.MatchersBase[] matchersBaseArray1 = new se.mockachino.matchers.MatchersBase[] { matchers0 };
        java.util.ArrayList<se.mockachino.matchers.MatchersBase> matchersBaseList2 = new java.util.ArrayList<se.mockachino.matchers.MatchersBase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBaseArray1);
        se.mockachino.matchers.MatchersBase matchersBase4 = new se.mockachino.matchers.MatchersBase();
        se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase> matchersBaseList5 = new se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase>((java.util.List<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBase4);
        java.lang.Class<se.mockachino.Invocation> invocationClass6 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray8 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray9 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray8;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher10 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray9);
        java.lang.Class<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherClass11 = methodCallMatcherAndMatcher10.getType();
        se.mockachino.MockData<se.mockachino.Invocation> invocationMockData13 = new se.mockachino.MockData<se.mockachino.Invocation>(invocationClass6, (java.lang.reflect.Type) methodCallMatcherClass11, "se.mockachino.exceptions.UsageError: ");
        invocationMockData13.resetStubs();
        java.lang.reflect.Type type15 = invocationMockData13.getTypeLiteral();
        java.util.Set<se.mockachino.util.MockachinoMethod> mockachinoMethodSet16 = invocationMockData13.getMethods();
        boolean boolean17 = matchersBaseList5.removeAll((java.util.Collection<se.mockachino.util.MockachinoMethod>) mockachinoMethodSet16);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on matchersBaseList2 and matchersBaseList5.", matchersBaseList2.equals(matchersBaseList5) == matchersBaseList5.equals(matchersBaseList2));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        se.mockachino.util.MockachinoMethod mockachinoMethod0 = se.mockachino.util.MockachinoMethod.NULL;
        se.mockachino.CallHandler callHandler1 = se.mockachino.Mockachino.DEFAULT_VALUES;
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart4 = se.mockachino.Mockachino.verifyRange((int) (short) 1, (int) ' ');
        se.mockachino.exceptions.VerificationError verificationError6 = new se.mockachino.exceptions.VerificationError("35 calls");
        java.lang.Throwable[] throwableArray7 = verificationError6.getSuppressed();
        se.mockachino.invocationhandler.PrimitiveInvocationHandler primitiveInvocationHandler8 = new se.mockachino.invocationhandler.PrimitiveInvocationHandler();
        se.mockachino.matchers.matcher.Matcher<se.mockachino.invocationhandler.PrimitiveInvocationHandler> primitiveInvocationHandlerMatcher9 = se.mockachino.matchers.MatchersBase.mSame(primitiveInvocationHandler8);
        se.mockachino.matchers.matcher.Matcher<java.lang.Short> shortMatcher10 = se.mockachino.matchers.MatchersBase.mAnyShort();
        java.lang.Class<?> wildcardClass11 = shortMatcher10.getClass();
        se.mockachino.util.MockachinoMethod mockachinoMethod13 = se.mockachino.util.MockachinoMethod.find((java.lang.Class) wildcardClass11, "hi!");
        java.lang.StackTraceElement[] stackTraceElementArray14 = new java.lang.StackTraceElement[] {};
        java.lang.String str15 = se.mockachino.util.Formatting.toString(stackTraceElementArray14);
        java.lang.StackTraceElement[] stackTraceElementArray16 = se.mockachino.matchers.Matchers.eq(stackTraceElementArray14);
        se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable> serializableIdentityMatcher17 = new se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable>((java.io.Serializable) stackTraceElementArray14);
        java.lang.Class<java.io.Serializable> serializableClass18 = serializableIdentityMatcher17.getType();
        java.lang.Class[] classArray19 = new java.lang.Class[] {};
        se.mockachino.matchers.matcher.ClassMatcher<java.io.Serializable> serializableClassMatcher20 = new se.mockachino.matchers.matcher.ClassMatcher<java.io.Serializable>(serializableClass18, classArray19);
        java.lang.Object[] objArray21 = new java.lang.Object[] { callHandler1, (short) 1, verificationError6, primitiveInvocationHandlerMatcher9, "hi!", serializableClass18 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        se.mockachino.matchers.MethodMatcherImpl methodMatcherImpl22 = new se.mockachino.matchers.MethodMatcherImpl(mockachinoMethod0, objArray21);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        se.mockachino.util.MockachinoMethod mockachinoMethod0 = se.mockachino.util.MockachinoMethod.NULL;
        se.mockachino.exceptions.UsageError usageError2 = new se.mockachino.exceptions.UsageError("se.mockachino.exceptions.UsageError: ");
        se.mockachino.exceptions.VerificationError verificationError4 = new se.mockachino.exceptions.VerificationError("0");
        usageError2.addSuppressed((java.lang.Throwable) verificationError4);
        se.mockachino.alias.SimpleAlias simpleAlias6 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.SimpleAlias simpleAlias7 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.SimpleAlias simpleAlias8 = se.mockachino.Mockachino.newAlias();
        se.mockachino.alias.Alias[] aliasArray9 = new se.mockachino.alias.Alias[] { simpleAlias6, simpleAlias7, simpleAlias8 };
        se.mockachino.alias.UnionAlias unionAlias10 = new se.mockachino.alias.UnionAlias(aliasArray9);
        se.mockachino.alias.IntersectionAlias intersectionAlias11 = new se.mockachino.alias.IntersectionAlias(aliasArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj12 = mockachinoMethod0.invoke((java.lang.Object) usageError2, (java.lang.Object[]) aliasArray9);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        se.mockachino.matchers.Matchers matchers0 = new se.mockachino.matchers.Matchers();
        se.mockachino.matchers.MatchersBase[] matchersBaseArray1 = new se.mockachino.matchers.MatchersBase[] { matchers0 };
        java.util.ArrayList<se.mockachino.matchers.MatchersBase> matchersBaseList2 = new java.util.ArrayList<se.mockachino.matchers.MatchersBase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBaseArray1);
        se.mockachino.matchers.MatchersBase matchersBase4 = new se.mockachino.matchers.MatchersBase();
        se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase> matchersBaseList5 = new se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase>((java.util.List<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBase4);
        java.lang.Object obj6 = null;
        boolean boolean7 = matchersBaseList5.remove(obj6);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on matchersBaseList2 and matchersBaseList5.", matchersBaseList2.equals(matchersBaseList5) == matchersBaseList5.equals(matchersBaseList2));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        se.mockachino.matchers.Matchers matchers0 = new se.mockachino.matchers.Matchers();
        se.mockachino.matchers.MatchersBase[] matchersBaseArray1 = new se.mockachino.matchers.MatchersBase[] { matchers0 };
        java.util.ArrayList<se.mockachino.matchers.MatchersBase> matchersBaseList2 = new java.util.ArrayList<se.mockachino.matchers.MatchersBase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBaseArray1);
        se.mockachino.matchers.MatchersBase matchersBase4 = new se.mockachino.matchers.MatchersBase();
        se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase> matchersBaseList5 = new se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase>((java.util.List<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBase4);
        matchersBaseList5.clear();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on matchersBaseList2 and matchersBaseList5.", matchersBaseList2.equals(matchersBaseList5) == matchersBaseList5.equals(matchersBaseList2));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        se.mockachino.matchers.Matchers matchers0 = new se.mockachino.matchers.Matchers();
        se.mockachino.matchers.MatchersBase[] matchersBaseArray1 = new se.mockachino.matchers.MatchersBase[] { matchers0 };
        java.util.ArrayList<se.mockachino.matchers.MatchersBase> matchersBaseList2 = new java.util.ArrayList<se.mockachino.matchers.MatchersBase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBaseArray1);
        se.mockachino.matchers.MatchersBase matchersBase4 = new se.mockachino.matchers.MatchersBase();
        se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase> matchersBaseList5 = new se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase>((java.util.List<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBase4);
        se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase> matchersBaseList6 = se.mockachino.matchers.Matchers.same(matchersBaseList5);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on matchersBaseList2 and matchersBaseList5.", matchersBaseList2.equals(matchersBaseList5) == matchersBaseList5.equals(matchersBaseList2));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        se.mockachino.matchers.Matchers matchers0 = new se.mockachino.matchers.Matchers();
        se.mockachino.matchers.MatchersBase[] matchersBaseArray1 = new se.mockachino.matchers.MatchersBase[] { matchers0 };
        java.util.ArrayList<se.mockachino.matchers.MatchersBase> matchersBaseList2 = new java.util.ArrayList<se.mockachino.matchers.MatchersBase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBaseArray1);
        se.mockachino.matchers.MatchersBase matchersBase4 = new se.mockachino.matchers.MatchersBase();
        se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase> matchersBaseList5 = new se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase>((java.util.List<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBase4);
        se.mockachino.matchers.Matchers matchers6 = new se.mockachino.matchers.Matchers();
        se.mockachino.matchers.MatchersBase[] matchersBaseArray7 = new se.mockachino.matchers.MatchersBase[] { matchers6 };
        java.util.ArrayList<se.mockachino.matchers.MatchersBase> matchersBaseList8 = new java.util.ArrayList<se.mockachino.matchers.MatchersBase>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.MatchersBase>) matchersBaseList8, matchersBaseArray7);
        se.mockachino.matchers.MatchersBase matchersBase10 = new se.mockachino.matchers.MatchersBase();
        se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase> matchersBaseList11 = new se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase>((java.util.List<se.mockachino.matchers.MatchersBase>) matchersBaseList8, matchersBase10);
        se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase> matchersBaseList12 = new se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase>((java.util.List<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBase10);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on matchersBaseList2 and matchersBaseList5.", matchersBaseList2.equals(matchersBaseList5) == matchersBaseList5.equals(matchersBaseList2));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        se.mockachino.matchers.Matchers matchers0 = new se.mockachino.matchers.Matchers();
        se.mockachino.matchers.MatchersBase[] matchersBaseArray1 = new se.mockachino.matchers.MatchersBase[] { matchers0 };
        java.util.ArrayList<se.mockachino.matchers.MatchersBase> matchersBaseList2 = new java.util.ArrayList<se.mockachino.matchers.MatchersBase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBaseArray1);
        se.mockachino.matchers.MatchersBase matchersBase4 = new se.mockachino.matchers.MatchersBase();
        se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase> matchersBaseList5 = new se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase>((java.util.List<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBase4);
        java.lang.Class<se.mockachino.Invocation> invocationClass6 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray8 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray9 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray8;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher10 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray9);
        java.lang.Class<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherClass11 = methodCallMatcherAndMatcher10.getType();
        se.mockachino.MockData<se.mockachino.Invocation> invocationMockData13 = new se.mockachino.MockData<se.mockachino.Invocation>(invocationClass6, (java.lang.reflect.Type) methodCallMatcherClass11, "se.mockachino.exceptions.UsageError: ");
        java.util.Set<se.mockachino.util.MockachinoMethod> mockachinoMethodSet14 = invocationMockData13.getMethods();
        boolean boolean15 = matchersBaseList5.retainAll((java.util.Collection<se.mockachino.util.MockachinoMethod>) mockachinoMethodSet14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on matchersBaseList2 and matchersBaseList5.", matchersBaseList2.equals(matchersBaseList5) == matchersBaseList5.equals(matchersBaseList2));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        se.mockachino.matchers.Matchers matchers0 = new se.mockachino.matchers.Matchers();
        se.mockachino.matchers.MatchersBase[] matchersBaseArray1 = new se.mockachino.matchers.MatchersBase[] { matchers0 };
        java.util.ArrayList<se.mockachino.matchers.MatchersBase> matchersBaseList2 = new java.util.ArrayList<se.mockachino.matchers.MatchersBase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBaseArray1);
        se.mockachino.matchers.MatchersBase matchersBase4 = new se.mockachino.matchers.MatchersBase();
        se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase> matchersBaseList5 = new se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase>((java.util.List<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBase4);
        int int6 = matchersBaseList5.size();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on matchersBaseList2 and matchersBaseList5.", matchersBaseList2.equals(matchersBaseList5) == matchersBaseList5.equals(matchersBaseList2));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        se.mockachino.matchers.Matchers matchers0 = new se.mockachino.matchers.Matchers();
        se.mockachino.matchers.MatchersBase[] matchersBaseArray1 = new se.mockachino.matchers.MatchersBase[] { matchers0 };
        java.util.ArrayList<se.mockachino.matchers.MatchersBase> matchersBaseList2 = new java.util.ArrayList<se.mockachino.matchers.MatchersBase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBaseArray1);
        se.mockachino.matchers.MatchersBase matchersBase4 = new se.mockachino.matchers.MatchersBase();
        se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase> matchersBaseList5 = new se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase>((java.util.List<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBase4);
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
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext33 = se.mockachino.Mockachino.before(mockPoint30);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext34 = new se.mockachino.order.BetweenVerifyContext(mockPoint26, mockPoint30);
        se.mockachino.order.MockPoint mockPoint37 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint38 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext39 = new se.mockachino.order.OrderingContext(mockPoint37, mockPoint38);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext40 = se.mockachino.Mockachino.before(mockPoint37);
        se.mockachino.order.MockPoint mockPoint41 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint42 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext43 = new se.mockachino.order.OrderingContext(mockPoint41, mockPoint42);
        se.mockachino.order.MockPoint mockPoint44 = orderingContext43.beforeLastCall();
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart45 = new se.mockachino.verifier.VerifyRangeStart((-1), 0, mockPoint37, mockPoint44);
        se.mockachino.order.MockPointIterable mockPointIterable46 = new se.mockachino.order.MockPointIterable((java.lang.Iterable<se.mockachino.Invocation>) mockPointIterable21, mockPoint26, mockPoint37);
        boolean boolean47 = matchersBaseList5.contains((java.lang.Object) mockPoint26);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on matchersBaseList2 and matchersBaseList5.", matchersBaseList2.equals(matchersBaseList5) == matchersBaseList5.equals(matchersBaseList2));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        se.mockachino.matchers.Matchers matchers0 = new se.mockachino.matchers.Matchers();
        se.mockachino.matchers.MatchersBase[] matchersBaseArray1 = new se.mockachino.matchers.MatchersBase[] { matchers0 };
        java.util.ArrayList<se.mockachino.matchers.MatchersBase> matchersBaseList2 = new java.util.ArrayList<se.mockachino.matchers.MatchersBase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBaseArray1);
        se.mockachino.matchers.MatchersBase matchersBase4 = new se.mockachino.matchers.MatchersBase();
        se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase> matchersBaseList5 = new se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase>((java.util.List<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBase4);
        se.mockachino.matchers.matcher.RegexpMatcher regexpMatcher7 = new se.mockachino.matchers.matcher.RegexpMatcher("");
        java.lang.String str8 = regexpMatcher7.toString();
        int int9 = matchersBaseList5.indexOf((java.lang.Object) regexpMatcher7);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on matchersBaseList2 and matchersBaseList5.", matchersBaseList2.equals(matchersBaseList5) == matchersBaseList5.equals(matchersBaseList2));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        se.mockachino.matchers.Matchers matchers0 = new se.mockachino.matchers.Matchers();
        se.mockachino.matchers.MatchersBase[] matchersBaseArray1 = new se.mockachino.matchers.MatchersBase[] { matchers0 };
        java.util.ArrayList<se.mockachino.matchers.MatchersBase> matchersBaseList2 = new java.util.ArrayList<se.mockachino.matchers.MatchersBase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBaseArray1);
        se.mockachino.matchers.MatchersBase matchersBase4 = new se.mockachino.matchers.MatchersBase();
        se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase> matchersBaseList5 = new se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase>((java.util.List<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBase4);
        se.mockachino.matchers.MatchersBase matchersBase7 = matchersBaseList5.get((int) (byte) 100);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on matchersBaseList2 and matchersBaseList5.", matchersBaseList2.equals(matchersBaseList5) == matchersBaseList5.equals(matchersBaseList2));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        se.mockachino.matchers.Matchers matchers0 = new se.mockachino.matchers.Matchers();
        se.mockachino.matchers.MatchersBase[] matchersBaseArray1 = new se.mockachino.matchers.MatchersBase[] { matchers0 };
        java.util.ArrayList<se.mockachino.matchers.MatchersBase> matchersBaseList2 = new java.util.ArrayList<se.mockachino.matchers.MatchersBase>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBaseArray1);
        se.mockachino.matchers.MatchersBase matchersBase4 = new se.mockachino.matchers.MatchersBase();
        se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase> matchersBaseList5 = new se.mockachino.util.SafeIteratorList<se.mockachino.matchers.MatchersBase>((java.util.List<se.mockachino.matchers.MatchersBase>) matchersBaseList2, matchersBase4);
        java.lang.Class<se.mockachino.Invocation> invocationClass6 = null;
        se.mockachino.matchers.matcher.Matcher[] matcherArray8 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[] methodCallMatcherMatcherArray9 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>[]) matcherArray8;
        se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherAndMatcher10 = new se.mockachino.matchers.matcher.AndMatcher<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>>(methodCallMatcherMatcherArray9);
        java.lang.Class<se.mockachino.matchers.matcher.Matcher<se.mockachino.MethodCall>> methodCallMatcherClass11 = methodCallMatcherAndMatcher10.getType();
        se.mockachino.MockData<se.mockachino.Invocation> invocationMockData13 = new se.mockachino.MockData<se.mockachino.Invocation>(invocationClass6, (java.lang.reflect.Type) methodCallMatcherClass11, "se.mockachino.exceptions.UsageError: ");
        invocationMockData13.resetStubs();
        java.lang.reflect.Type type15 = invocationMockData13.getTypeLiteral();
        java.util.Set<se.mockachino.util.MockachinoMethod> mockachinoMethodSet16 = invocationMockData13.getMethods();
        invocationMockData13.resetObservers();
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable18 = null;
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable19 = null;
        se.mockachino.order.MockPoint mockPoint20 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint21 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext22 = new se.mockachino.order.OrderingContext(mockPoint20, mockPoint21);
        se.mockachino.order.MockPoint mockPoint23 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint24 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext25 = new se.mockachino.order.OrderingContext(mockPoint23, mockPoint24);
        se.mockachino.order.MockPointIterable mockPointIterable26 = new se.mockachino.order.MockPointIterable(invocationIterable19, mockPoint21, mockPoint23);
        java.util.Iterator<se.mockachino.Invocation> invocationItor27 = null;
        se.mockachino.order.MockPoint mockPoint28 = null;
        se.mockachino.order.MockPoint mockPoint29 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint30 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext31 = new se.mockachino.order.OrderingContext(mockPoint29, mockPoint30);
        se.mockachino.order.MockPointIterator mockPointIterator32 = new se.mockachino.order.MockPointIterator(invocationItor27, mockPoint28, mockPoint30);
        se.mockachino.order.MockPointIterable mockPointIterable33 = new se.mockachino.order.MockPointIterable(invocationIterable18, mockPoint23, mockPoint28);
        se.mockachino.order.MockPoint mockPoint34 = se.mockachino.Mockachino.BIG_BANG;
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable35 = invocationMockData13.getCalls(mockPoint28, mockPoint34);
        se.mockachino.order.MockPoint mockPoint36 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint37 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext38 = new se.mockachino.order.OrderingContext(mockPoint36, mockPoint37);
        se.mockachino.order.MockPoint mockPoint39 = orderingContext38.beforeLastCall();
        se.mockachino.order.MockPoint mockPoint40 = orderingContext38.beforeLastCall();
        java.lang.Iterable<se.mockachino.Invocation> invocationIterable43 = null;
        se.mockachino.order.MockPoint mockPoint44 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint45 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext46 = new se.mockachino.order.OrderingContext(mockPoint44, mockPoint45);
        se.mockachino.order.MockPoint mockPoint47 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint48 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext49 = new se.mockachino.order.OrderingContext(mockPoint47, mockPoint48);
        se.mockachino.order.MockPointIterable mockPointIterable50 = new se.mockachino.order.MockPointIterable(invocationIterable43, mockPoint45, mockPoint47);
        se.mockachino.order.MockPoint mockPoint51 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint52 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext53 = new se.mockachino.order.OrderingContext(mockPoint51, mockPoint52);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext54 = se.mockachino.Mockachino.before(mockPoint51);
        se.mockachino.order.BetweenVerifyContext betweenVerifyContext55 = new se.mockachino.order.BetweenVerifyContext(mockPoint47, mockPoint51);
        se.mockachino.order.MockPoint mockPoint56 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.MockPoint mockPoint57 = se.mockachino.Mockachino.BIG_BANG;
        se.mockachino.order.OrderingContext orderingContext58 = new se.mockachino.order.OrderingContext(mockPoint56, mockPoint57);
        se.mockachino.order.MockPoint mockPoint59 = orderingContext58.beforeLastCall();
        se.mockachino.verifier.VerifyRangeStart verifyRangeStart60 = new se.mockachino.verifier.VerifyRangeStart((int) (byte) 1, (int) (short) 1, mockPoint47, mockPoint59);
        se.mockachino.order.MockPointIterable mockPointIterable61 = new se.mockachino.order.MockPointIterable(invocationIterable35, mockPoint40, mockPoint59);
        int int62 = matchersBaseList5.lastIndexOf((java.lang.Object) mockPointIterable61);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on matchersBaseList2 and matchersBaseList5.", matchersBaseList2.equals(matchersBaseList5) == matchersBaseList5.equals(matchersBaseList2));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        se.mockachino.util.MockachinoMethod mockachinoMethod0 = se.mockachino.util.MockachinoMethod.NULL;
        se.mockachino.matchers.matcher.Matcher[] matcherArray2 = new se.mockachino.matchers.matcher.Matcher[0];
        @SuppressWarnings("unchecked")
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[] aliasMatcherArray3 = (se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray2;
        se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias> aliasMatcher4 = se.mockachino.matchers.MatchersBase.mAnd((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias>[]) matcherArray2);
        se.mockachino.alias.Alias[] aliasArray5 = se.mockachino.matchers.Matchers.and((se.mockachino.matchers.matcher.Matcher<se.mockachino.alias.Alias[]>[]) matcherArray2);
        se.mockachino.stub.MethodStubs methodStubs6 = se.mockachino.matchers.Matchers.or((se.mockachino.matchers.matcher.Matcher<se.mockachino.stub.MethodStubs>[]) matcherArray2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        se.mockachino.matchers.MethodMatcherImpl methodMatcherImpl7 = new se.mockachino.matchers.MethodMatcherImpl(mockachinoMethod0, (java.lang.Object[]) matcherArray2);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        se.mockachino.util.MockachinoMethod mockachinoMethod0 = se.mockachino.util.MockachinoMethod.NULL;
        boolean boolean1 = mockachinoMethod0.isToStringCall();
        java.lang.String str2 = mockachinoMethod0.getName();
        java.lang.StackTraceElement[] stackTraceElementArray3 = new java.lang.StackTraceElement[] {};
        java.lang.String str4 = se.mockachino.util.Formatting.toString(stackTraceElementArray3);
        java.lang.StackTraceElement[] stackTraceElementArray5 = se.mockachino.matchers.Matchers.eq(stackTraceElementArray3);
        se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable> serializableIdentityMatcher6 = new se.mockachino.matchers.matcher.IdentityMatcher<java.io.Serializable>((java.io.Serializable) stackTraceElementArray3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        se.mockachino.matchers.MethodMatcherImpl methodMatcherImpl7 = new se.mockachino.matchers.MethodMatcherImpl(mockachinoMethod0, (java.lang.Object[]) stackTraceElementArray3);
    }
}

