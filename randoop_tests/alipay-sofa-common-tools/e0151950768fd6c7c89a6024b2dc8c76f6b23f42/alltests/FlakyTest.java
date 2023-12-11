package flaky; 

import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTest{
    public static boolean debug = false;

	@Test
    public void test025_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        java.lang.String str2 = com.alipay.sofa.common.profile.diagnostic.Profiler.dump("10", "hi!");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }
	@Test
    public void test083_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        java.lang.String str2 = com.alipay.sofa.common.utils.StringUtil.center("\u63a7\u5236\u7ebf\u7a0b\u4fe1\u606f\u6253\u5370\u95f4\u9694", (int) '#');
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u63a7\u5236\u7ebf\u7a0b\u4fe1\u606f\u6253\u5370\u95f4\u9694             " + "'", str2, "\u63a7\u5236\u7ebf\u7a0b\u4fe1\u606f\u6253\u5370\u95f4\u9694             ");
    }
}