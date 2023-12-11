package flaky; 

import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTest{
    public static boolean debug = false;

	@Test
    public void test041_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        java.lang.String str0 = net.landzero.xlog.utils.Hex.randomHex16();
         org.junit.Assert.assertEquals("'" + str0 + "' != '" + "f9d53dd29cb697a5" + "'", str0, "f9d53dd29cb697a5");
    }
	@Test
    public void test078_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        java.lang.String str0 = net.landzero.xlog.XLog.crid();
         org.junit.Assert.assertEquals("'" + str0 + "' != '" + "-" + "'", str0, "-");
    }
	@Test
    public void test085_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.util.ArrayList<java.lang.String> strList1 = accessEvent0.getHeaderAppInfo();
        long long2 = accessEvent0.getDuration();
        java.util.Date date3 = net.landzero.xlog.utils.Dates.yesterday();
        accessEvent0.setTimestamp(date3);
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(date3);
         org.junit.Assert.assertEquals(date3.toString(), "Sun Nov 19 02:33:18 CST 2023");
    }
	@Test
    public void test101_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        net.landzero.xlog.utils.CallerInfo callerInfo0 = net.landzero.xlog.utils.Reflections.getCallerInfo();
        java.lang.String str1 = callerInfo0.getMethodName();
        java.lang.String str2 = callerInfo0.getClassName();
        java.lang.String str3 = callerInfo0.getClassName();
        org.junit.Assert.assertNotNull(callerInfo0);
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "invoke" + "'", str1, "invoke");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "sun.reflect.DelegatingMethodAccessorImpl" + "'", str2, "sun.reflect.DelegatingMethodAccessorImpl");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "sun.reflect.DelegatingMethodAccessorImpl" + "'", str3, "sun.reflect.DelegatingMethodAccessorImpl");
    }
	@Test
    public void test101_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        net.landzero.xlog.utils.CallerInfo callerInfo0 = net.landzero.xlog.utils.Reflections.getCallerInfo();
        java.lang.String str1 = callerInfo0.getMethodName();
        java.lang.String str2 = callerInfo0.getClassName();
        java.lang.String str3 = callerInfo0.getClassName();
        org.junit.Assert.assertNotNull(callerInfo0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "invoke" + "'", str1, "invoke");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "sun.reflect.DelegatingMethodAccessorImpl" + "'", str2, "sun.reflect.DelegatingMethodAccessorImpl");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "sun.reflect.DelegatingMethodAccessorImpl" + "'", str3, "sun.reflect.DelegatingMethodAccessorImpl");
    }
	@Test
    public void test101_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        net.landzero.xlog.utils.CallerInfo callerInfo0 = net.landzero.xlog.utils.Reflections.getCallerInfo();
        java.lang.String str1 = callerInfo0.getMethodName();
        java.lang.String str2 = callerInfo0.getClassName();
        java.lang.String str3 = callerInfo0.getClassName();
        org.junit.Assert.assertNotNull(callerInfo0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "invoke" + "'", str1, "invoke");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "sun.reflect.DelegatingMethodAccessorImpl" + "'", str2, "sun.reflect.DelegatingMethodAccessorImpl");
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "sun.reflect.DelegatingMethodAccessorImpl" + "'", str3, "sun.reflect.DelegatingMethodAccessorImpl");
    }
	@Test
    public void test104_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        net.landzero.xlog.utils.CallerInfo callerInfo0 = net.landzero.xlog.utils.Reflections.getCallerInfo();
        java.lang.String str1 = callerInfo0.getMethodName();
        java.lang.String str2 = callerInfo0.getClassName();
        java.lang.String str3 = callerInfo0.getMethodName();
        org.junit.Assert.assertNotNull(callerInfo0);
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "invoke" + "'", str1, "invoke");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "sun.reflect.DelegatingMethodAccessorImpl" + "'", str2, "sun.reflect.DelegatingMethodAccessorImpl");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "invoke" + "'", str3, "invoke");
    }
	@Test
    public void test104_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        net.landzero.xlog.utils.CallerInfo callerInfo0 = net.landzero.xlog.utils.Reflections.getCallerInfo();
        java.lang.String str1 = callerInfo0.getMethodName();
        java.lang.String str2 = callerInfo0.getClassName();
        java.lang.String str3 = callerInfo0.getMethodName();
        org.junit.Assert.assertNotNull(callerInfo0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "invoke" + "'", str1, "invoke");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "sun.reflect.DelegatingMethodAccessorImpl" + "'", str2, "sun.reflect.DelegatingMethodAccessorImpl");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "invoke" + "'", str3, "invoke");
    }
	@Test
    public void test104_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        net.landzero.xlog.utils.CallerInfo callerInfo0 = net.landzero.xlog.utils.Reflections.getCallerInfo();
        java.lang.String str1 = callerInfo0.getMethodName();
        java.lang.String str2 = callerInfo0.getClassName();
        java.lang.String str3 = callerInfo0.getMethodName();
        org.junit.Assert.assertNotNull(callerInfo0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "invoke" + "'", str1, "invoke");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "sun.reflect.DelegatingMethodAccessorImpl" + "'", str2, "sun.reflect.DelegatingMethodAccessorImpl");
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "invoke" + "'", str3, "invoke");
    }
	@Test
    public void test135_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("CRID[-]", "FORM");
        xPerfEventBuilder2.commit();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent4 = xPerfEventBuilder2.build();
        java.lang.String str5 = xPerfEvent4.getPath();
        org.junit.Assert.assertNotNull(xPerfEvent4);
         org.junit.Assert.assertNull(str5);
    }
	@Test
    public void test156_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPathDigest();
        java.lang.String str2 = xPerfEvent0.topic();
        java.lang.String str3 = xPerfEvent0.getPathDigest();
        java.util.Date date4 = net.landzero.xlog.utils.Dates.yesterday();
        xPerfEvent0.setTimestamp(date4);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x-perf" + "'", str2, "x-perf");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(date4);
         org.junit.Assert.assertEquals(date4.toString(), "Sun Nov 19 02:33:19 CST 2023");
    }
	@Test
    public void test173_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("CRID[-]", "FORM");
        xPerfEventBuilder2.commit();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent4 = xPerfEventBuilder2.build();
        java.util.Date date5 = xPerfEvent4.getTimestamp();
        xPerfEvent4.setProject("ff");
        org.junit.Assert.assertNotNull(xPerfEvent4);
        org.junit.Assert.assertNotNull(date5);
         org.junit.Assert.assertEquals(date5.toString(), "Mon Nov 20 02:33:20 CST 2023");
    }
	@Test
    public void test185_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("CRID[-]", "FORM");
        xPerfEventBuilder2.commit();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent4 = xPerfEventBuilder2.build();
        java.util.Date date5 = xPerfEvent4.getTimestamp();
        java.lang.String str6 = xPerfEvent4.getProject();
        java.lang.String str7 = xPerfEvent4.getMethodName();
        org.junit.Assert.assertNotNull(xPerfEvent4);
        org.junit.Assert.assertNotNull(date5);
         org.junit.Assert.assertEquals(date5.toString(), "Mon Nov 20 02:33:20 CST 2023");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FORM" + "'", str7, "FORM");
    }
	@Test
    public void test205_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder0 = new net.landzero.xlog.mybatis.TrackEventBuilder();
        trackEventBuilder0.commit();
        net.landzero.xlog.mybatis.TrackEvent trackEvent2 = trackEventBuilder0.build();
        trackEvent2.setError("DIGEST");
        long long5 = trackEvent2.getDuration();
        trackEvent2.setMethod("000000000000000a");
        java.lang.String str8 = trackEvent2.getSqlDigest();
        org.junit.Assert.assertNotNull(trackEvent2);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNull(str8);
    }
	@Test
    public void test217_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        net.landzero.xlog.utils.CallerInfo callerInfo0 = net.landzero.xlog.utils.Reflections.getCallerInfo();
        java.lang.String str1 = callerInfo0.getClassName();
        java.lang.String str2 = callerInfo0.getClassName();
        org.junit.Assert.assertNotNull(callerInfo0);
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "sun.reflect.DelegatingMethodAccessorImpl" + "'", str1, "sun.reflect.DelegatingMethodAccessorImpl");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "sun.reflect.DelegatingMethodAccessorImpl" + "'", str2, "sun.reflect.DelegatingMethodAccessorImpl");
    }
	@Test
    public void test217_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        net.landzero.xlog.utils.CallerInfo callerInfo0 = net.landzero.xlog.utils.Reflections.getCallerInfo();
        java.lang.String str1 = callerInfo0.getClassName();
        java.lang.String str2 = callerInfo0.getClassName();
        org.junit.Assert.assertNotNull(callerInfo0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "sun.reflect.DelegatingMethodAccessorImpl" + "'", str1, "sun.reflect.DelegatingMethodAccessorImpl");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "sun.reflect.DelegatingMethodAccessorImpl" + "'", str2, "sun.reflect.DelegatingMethodAccessorImpl");
    }
	@Test
    public void test223_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder0 = new net.landzero.xlog.mybatis.TrackEventBuilder();
        trackEventBuilder0.commit();
        net.landzero.xlog.mybatis.TrackEvent trackEvent2 = trackEventBuilder0.build();
        trackEvent2.setError("DIGEST");
        long long5 = trackEvent2.getDuration();
        java.lang.Class<?> wildcardClass6 = trackEvent2.getClass();
        org.junit.Assert.assertNotNull(trackEvent2);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
	@Test
    public void test249_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.util.ArrayList<java.lang.String> strList1 = accessEvent0.getHeaderAppInfo();
        long long2 = accessEvent0.getDuration();
        accessEvent0.setPathDigest("0");
        net.landzero.xlog.XLog.appendEvent(accessEvent0);
        accessEvent0.setMethod("100");
        java.lang.String str8 = accessEvent0.topic();
        java.util.Date date9 = net.landzero.xlog.utils.Dates.yesterday();
        accessEvent0.setTimestamp(date9);
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "x-access" + "'", str8, "x-access");
        org.junit.Assert.assertNotNull(date9);
         org.junit.Assert.assertEquals(date9.toString(), "Sun Nov 19 02:33:20 CST 2023");
    }
	@Test
    public void test262_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("cridMark", "BASIC");
        xPerfEventBuilder2.commit();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent4 = xPerfEventBuilder2.build();
        net.landzero.xlog.http.AccessEvent accessEvent5 = new net.landzero.xlog.http.AccessEvent();
        java.util.ArrayList<java.lang.String> strList6 = accessEvent5.getHeaderAppInfo();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent7 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str8 = xPerfEvent7.getPath();
        java.lang.String str9 = xPerfEvent7.getAction();
        net.landzero.xlog.http.AccessEvent accessEvent10 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str11 = accessEvent10.getHeaderUserToken();
        java.lang.String[] strArray21 = new java.lang.String[] { "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n", "crid", "0", "crid", "FORM", "DIGEST", "FORM", "", "-1" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        accessEvent10.setParams(strList22);
        xPerfEvent7.setArguments((java.util.List<java.lang.String>) strList22);
        accessEvent5.setHeaderAppInfo(strList22);
        xPerfEvent4.setArguments((java.util.List<java.lang.String>) strList22);
        long long28 = xPerfEvent4.getDuration();
        org.junit.Assert.assertNotNull(xPerfEvent4);
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
    }
}