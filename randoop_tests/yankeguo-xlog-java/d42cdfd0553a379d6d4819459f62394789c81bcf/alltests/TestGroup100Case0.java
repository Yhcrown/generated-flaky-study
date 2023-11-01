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
        java.lang.String str0 = net.landzero.xlog.logback.XLogBaseAppender.PLAIN_LAYOUT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %X{cridMark} [%thread] %-5level %logger{35} - %msg%n" + "'", str0, "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %X{cridMark} [%thread] %-5level %logger{35} - %msg%n");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        net.landzero.xlog.XLog.clearCrid();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        net.landzero.xlog.dubbo.XLogProviderFilter xLogProviderFilter0 = new net.landzero.xlog.dubbo.XLogProviderFilter();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.normalize((java.lang.Object) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1" + "'", str1, "-1");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.lang.String str0 = net.landzero.xlog.constants.Constants.MDC_CRID_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "crid" + "'", str0, "crid");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.normalizeKeyword((java.lang.Object) 0L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.lang.String str0 = net.landzero.xlog.XLog.path();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.lang.String str0 = net.landzero.xlog.http.XLogFilter.CRID_HEADER_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "X-Correlation-ID" + "'", str0, "X-Correlation-ID");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        ch.qos.logback.core.util.FileSize fileSize0 = net.landzero.xlog.logback.XLogFileAppender.BUFFER_SIZE;
        org.junit.Assert.assertNotNull(fileSize0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        java.lang.String str0 = net.landzero.xlog.XLog.cridMark();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "CRID[-]" + "'", str0, "CRID[-]");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.normalizeKeyword("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null" + "'", str1, "null");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.String str0 = net.landzero.xlog.logback.XLogBaseAppender.JSON_LAYOUT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n" + "'", str0, "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        net.landzero.xlog.XLog.setPath("X-Correlation-ID");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        net.landzero.xlog.utils.SignalFileChecker signalFileChecker1 = new net.landzero.xlog.utils.SignalFileChecker("");
        long long2 = signalFileChecker1.getCachedLastModified();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.lang.String str0 = javax.servlet.http.HttpServletRequest.FORM_AUTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "FORM" + "'", str0, "FORM");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        java.lang.String str0 = net.landzero.xlog.logback.XLogBaseAppender.MODE_PLAIN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "plain" + "'", str0, "plain");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.lang.String str0 = javax.servlet.http.HttpServletRequest.DIGEST_AUTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "DIGEST" + "'", str0, "DIGEST");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.lang.String str0 = javax.servlet.http.HttpServletRequest.BASIC_AUTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "BASIC" + "'", str0, "BASIC");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.safeNormalize((java.lang.Object) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100" + "'", str1, "100");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        net.landzero.xlog.mybatis.XLogInterceptor xLogInterceptor0 = new net.landzero.xlog.mybatis.XLogInterceptor();
        org.apache.ibatis.plugin.Invocation invocation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = xLogInterceptor0.intercept(invocation1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.normalize((java.lang.Object) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.lang.String str0 = net.landzero.xlog.XLog.EMPTY_CRID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "-" + "'", str0, "-");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        java.lang.String str1 = net.landzero.xlog.utils.Hex.md5("-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "336d5ebc5436534e61d16e63ddfca327" + "'", str1, "336d5ebc5436534e61d16e63ddfca327");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        net.landzero.xlog.utils.Requests requests0 = new net.landzero.xlog.utils.Requests();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        java.lang.String str0 = net.landzero.xlog.logback.XLogBaseAppender.TOPIC_JSON;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "_json_" + "'", str0, "_json_");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.lang.Object[] objArray0 = null;
        java.lang.String str1 = net.landzero.xlog.XLog.K(objArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.normalizeKeyword((java.lang.Object) "-1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1" + "'", str1, "-1");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        net.landzero.xlog.perf.XPerf xPerf0 = new net.landzero.xlog.perf.XPerf();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPath();
        java.util.Date date2 = xPerfEvent0.getTimestamp();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        int int0 = net.landzero.xlog.logback.XLogFileAppender.ROTATION_CHECK_INTERVAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 300000 + "'", int0 == 300000);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        java.lang.String str1 = net.landzero.xlog.utils.Hex.toHex((long) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0000000000000061" + "'", str1, "0000000000000061");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        java.lang.String str0 = net.landzero.xlog.logback.XLogBaseAppender.MODE_JSON;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "json" + "'", str0, "json");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        net.landzero.xlog.utils.Dates dates0 = new net.landzero.xlog.utils.Dates();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        net.landzero.xlog.XLog.setPath("plain");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        net.landzero.xlog.dubbo.XLogConsumerFilter xLogConsumerFilter0 = new net.landzero.xlog.dubbo.XLogConsumerFilter();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        boolean boolean1 = net.landzero.xlog.utils.Strings.isEmpty("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        java.lang.String str0 = net.landzero.xlog.constants.Constants.DUBBO_CRID_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "crid" + "'", str0, "crid");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        net.landzero.xlog.utils.CallerInfo callerInfo0 = new net.landzero.xlog.utils.CallerInfo();
        callerInfo0.setMethodName("336d5ebc5436534e61d16e63ddfca327");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = net.landzero.xlog.utils.Requests.hasJsonBody(httpServletRequest0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.landzero.xlog.http.XLogHttpServletRequestWrapper xLogHttpServletRequestWrapper1 = new net.landzero.xlog.http.XLogHttpServletRequestWrapper(httpServletRequest0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        java.lang.String str0 = net.landzero.xlog.utils.Hex.randomHex16();
// flaky:         org.junit.Assert.assertEquals("'" + str0 + "' != '" + "2b91ee34d8daadf5" + "'", str0, "2b91ee34d8daadf5");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPath();
        java.util.List<java.lang.String> strList2 = xPerfEvent0.getArguments();
        net.landzero.xlog.XLog.appendEvent((net.landzero.xlog.XLogEvent) xPerfEvent0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        net.landzero.xlog.constants.Constants constants0 = new net.landzero.xlog.constants.Constants();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        java.lang.String str1 = net.landzero.xlog.utils.Hex.md5("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "d41d8cd98f00b204e9800998ecf8427e" + "'", str1, "d41d8cd98f00b204e9800998ecf8427e");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getHeaderUserToken();
        accessEvent0.setHost("1");
        accessEvent0.setHost("plain");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        accessEvent0.setHeaderUserToken("336d5ebc5436534e61d16e63ddfca327");
        java.lang.Class<?> wildcardClass3 = accessEvent0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.util.ArrayList<java.lang.String> strList1 = accessEvent0.getHeaderAppInfo();
        int int2 = accessEvent0.getStatus();
        accessEvent0.setMethod("null");
        java.lang.String str5 = accessEvent0.getMethod();
        java.lang.String str6 = accessEvent0.topic();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "x-access" + "'", str6, "x-access");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder0 = new net.landzero.xlog.mybatis.TrackEventBuilder();
        java.lang.Throwable throwable1 = null;
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder2 = trackEventBuilder0.setThrowable(throwable1);
        java.lang.String str3 = net.landzero.xlog.utils.Strings.safeNormalize((java.lang.Object) trackEventBuilder0);
        org.junit.Assert.assertNotNull(trackEventBuilder2);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = net.landzero.xlog.utils.Requests.hasBody(httpServletRequest0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.util.ArrayList<java.lang.String> strList1 = null;
        accessEvent0.setHeaderAppInfo(strList1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        net.landzero.xlog.utils.SignalFileChecker signalFileChecker1 = new net.landzero.xlog.utils.SignalFileChecker("-1");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.normalizeKeyword("BASIC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "BASIC" + "'", str1, "BASIC");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder0 = new net.landzero.xlog.mybatis.TrackEventBuilder();
        java.lang.Throwable throwable1 = null;
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder2 = trackEventBuilder0.setThrowable(throwable1);
        org.apache.ibatis.plugin.Invocation invocation3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder4 = trackEventBuilder0.setInvocation(invocation3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(trackEventBuilder2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.safeNormalize((java.lang.Object) true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true" + "'", str1, "true");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPath();
        xPerfEvent0.setCrid("");
        xPerfEvent0.setPath("_json_");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        net.landzero.xlog.XLog.setCrid("FORM");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        net.landzero.xlog.utils.Strings strings0 = new net.landzero.xlog.utils.Strings();
        java.lang.String str1 = net.landzero.xlog.utils.Strings.normalize((java.lang.Object) strings0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        net.landzero.xlog.XLog.setPath("hi!");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        net.landzero.xlog.XLog.setPath("CRID[-]");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("CRID[-]", "FORM");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent3 = xPerfEventBuilder2.build();
        xPerfEvent3.setClassName("-1");
        java.lang.String str6 = xPerfEvent3.getClassName();
        java.lang.String str7 = xPerfEvent3.getClassName();
        xPerfEvent3.setClassName("-1");
        org.junit.Assert.assertNotNull(xPerfEvent3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        java.lang.String str1 = net.landzero.xlog.utils.Hex.toHex((long) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0000000000000000" + "'", str1, "0000000000000000");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.util.ArrayList<java.lang.String> strList1 = accessEvent0.getHeaderAppInfo();
        int int2 = accessEvent0.getStatus();
        accessEvent0.setMethod("null");
        accessEvent0.setQuery("BASIC");
        java.lang.String str7 = net.landzero.xlog.utils.Strings.safeNormalize((java.lang.Object) "BASIC");
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "BASIC" + "'", str7, "BASIC");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        boolean boolean1 = net.landzero.xlog.utils.Strings.isEmpty("x-access");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        java.lang.String str0 = net.landzero.xlog.XLog.LOGGER_NAME_STRUCTURED_EVENT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xlog.Event" + "'", str0, "xlog.Event");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.safeNormalize("json");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "json" + "'", str1, "json");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        java.lang.String str0 = net.landzero.xlog.constants.Constants.MDC_CRID_MARK_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "cridMark" + "'", str0, "cridMark");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("CRID[-]", "FORM");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent3 = xPerfEventBuilder2.build();
        xPerfEvent3.setMethodName("-");
        org.junit.Assert.assertNotNull(xPerfEvent3);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.lang.String str0 = net.landzero.xlog.utils.Dates.yesterday_yyyyMMdd();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "20231030" + "'", str0, "20231030");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("CRID[-]", "FORM");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent3 = xPerfEventBuilder2.build();
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        java.lang.String str7 = net.landzero.xlog.XLog.K(objArray6);
        net.landzero.xlog.XLogCommitter xLogCommitter8 = net.landzero.xlog.perf.XPerf.create("json", objArray6);
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder9 = xPerfEventBuilder2.setCommand("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n", objArray6);
        net.landzero.xlog.perf.XPerfEvent xPerfEvent10 = xPerfEventBuilder9.build();
        xPerfEventBuilder9.commit();
        org.junit.Assert.assertNotNull(xPerfEvent3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " K[]" + "'", str7, " K[]");
        org.junit.Assert.assertNotNull(xLogCommitter8);
        org.junit.Assert.assertNotNull(xPerfEventBuilder9);
        org.junit.Assert.assertNotNull(xPerfEvent10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        net.landzero.xlog.http.XLogHttpServletRequestWrapper xLogHttpServletRequestWrapper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.landzero.xlog.http.XLogHttpServletRequestWrapper.InputStreamWrapper inputStreamWrapper1 = xLogHttpServletRequestWrapper0.new InputStreamWrapper();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to net.landzero.xlog.http.XLogHttpServletRequestWrapper$InputStreamWrapper with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        java.lang.Object[] objArray0 = null;
        java.lang.String str1 = net.landzero.xlog.XLog.keyword(objArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        boolean boolean1 = net.landzero.xlog.utils.Strings.isEmpty("d41d8cd98f00b204e9800998ecf8427e");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.lang.String str1 = net.landzero.xlog.utils.Hex.toHex((long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000000000000000a" + "'", str1, "000000000000000a");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        net.landzero.xlog.utils.CallerInfo callerInfo0 = net.landzero.xlog.utils.Reflections.getCallerInfo();
        callerInfo0.setMethodName("json");
        org.junit.Assert.assertNotNull(callerInfo0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder0 = new net.landzero.xlog.mybatis.TrackEventBuilder();
        trackEventBuilder0.commit();
        net.landzero.xlog.mybatis.TrackEvent trackEvent2 = trackEventBuilder0.build();
        trackEvent2.setError("DIGEST");
        long long5 = trackEvent2.getDuration();
        java.lang.String str6 = trackEvent2.getMethod();
        org.junit.Assert.assertNotNull(trackEvent2);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder0 = new net.landzero.xlog.mybatis.TrackEventBuilder();
        org.apache.ibatis.plugin.Invocation invocation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder2 = trackEventBuilder0.setInvocation(invocation1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.normalize((java.lang.Object) 100.0f);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100.0" + "'", str1, "100.0");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        java.lang.String str0 = net.landzero.xlog.XLog.crid();
// flaky:         org.junit.Assert.assertEquals("'" + str0 + "' != '" + "-" + "'", str0, "-");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("CRID[-]", "FORM");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent3 = xPerfEventBuilder2.build();
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        java.lang.String str7 = net.landzero.xlog.XLog.K(objArray6);
        net.landzero.xlog.XLogCommitter xLogCommitter8 = net.landzero.xlog.perf.XPerf.create("json", objArray6);
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder9 = xPerfEventBuilder2.setCommand("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n", objArray6);
        xPerfEventBuilder9.commit();
        org.junit.Assert.assertNotNull(xPerfEvent3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " K[]" + "'", str7, " K[]");
        org.junit.Assert.assertNotNull(xLogCommitter8);
        org.junit.Assert.assertNotNull(xPerfEventBuilder9);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        net.landzero.xlog.XLog.setCrid("");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("CRID[-]", "FORM");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent3 = xPerfEventBuilder2.build();
        xPerfEvent3.setClassName("-1");
        xPerfEvent3.setProject("");
        org.junit.Assert.assertNotNull(xPerfEvent3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("CRID[-]", "FORM");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent3 = xPerfEventBuilder2.build();
        xPerfEventBuilder2.commit();
        org.junit.Assert.assertNotNull(xPerfEvent3);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        java.lang.String str0 = javax.servlet.http.HttpServletRequest.CLIENT_CERT_AUTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "CLIENT_CERT" + "'", str0, "CLIENT_CERT");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.normalizeKeyword("x-perf");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "x-perf" + "'", str1, "x-perf");
    }

    @Test
    public void test085() throws Throwable {
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
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Mon Oct 30 18:23:47 CDT 2023");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getHeaderUserToken();
        accessEvent0.setMethod("FORM");
        long long4 = accessEvent0.getDuration();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "BASIC", "x-access", "x-access", "0", "DIGEST", "true", "crid", "plain", "sun.reflect.DelegatingMethodAccessorImpl", "1", "1", "2b91ee34d8daadf5", "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %X{cridMark} [%thread] %-5level %logger{35} - %msg%n", "-1", "true", "-1", "json" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        accessEvent0.setParams(strList24);
        long long27 = accessEvent0.getDuration();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        int int0 = net.landzero.xlog.logback.XLogFileAppender.SIGNAL_FILE_CHECK_INTERVAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 30000 + "'", int0 == 30000);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPath();
        java.util.List<java.lang.String> strList2 = xPerfEvent0.getArguments();
        xPerfEvent0.setPathDigest(" K[]");
        net.landzero.xlog.XLog.appendEvent(xPerfEvent0);
        java.lang.String str6 = xPerfEvent0.getClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        xLogRedisAppender0.setTopic("sun.reflect.DelegatingMethodAccessorImpl");
        xLogRedisAppender0.setName("crid");
        boolean boolean5 = xLogRedisAppender0.isStarted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.normalize((java.lang.Object) " K[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "K[]" + "'", str1, "K[]");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        net.landzero.xlog.XLog.setCrid("x-perf");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        java.lang.Throwable throwable2 = null;
        xLogRedisAppender0.addWarn("", throwable2);
        xLogRedisAppender0.stop();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getHeaderUserToken();
        java.lang.String str2 = accessEvent0.topic();
        java.lang.String str3 = accessEvent0.getHost();
        java.lang.String str4 = accessEvent0.getHost();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x-access" + "'", str2, "x-access");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getTopic();
        java.lang.String str2 = xPerfEvent0.getMethodName();
        long long3 = xPerfEvent0.getDuration();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "x-perf" + "'", str1, "x-perf");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        net.landzero.xlog.XLog.setCrid("CLIENT_CERT");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder0 = new net.landzero.xlog.mybatis.TrackEventBuilder();
        java.lang.Throwable throwable1 = null;
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder2 = trackEventBuilder0.setThrowable(throwable1);
        trackEventBuilder0.commit();
        org.junit.Assert.assertNotNull(trackEventBuilder2);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        net.landzero.xlog.http.AccessEventBuilder accessEventBuilder0 = new net.landzero.xlog.http.AccessEventBuilder();
        javax.servlet.ServletResponse servletResponse1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.landzero.xlog.http.AccessEventBuilder accessEventBuilder2 = accessEventBuilder0.setServletResponse(servletResponse1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPath();
        java.util.List<java.lang.String> strList2 = xPerfEvent0.getArguments();
        xPerfEvent0.setPathDigest(" K[]");
        xPerfEvent0.setMethodName("DIGEST");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getHeaderUserToken();
        java.lang.String str2 = accessEvent0.getPath();
        accessEvent0.setQuery("d41d8cd98f00b204e9800998ecf8427e");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.util.ArrayList<java.lang.String> strList1 = accessEvent0.getHeaderAppInfo();
        int int2 = accessEvent0.getStatus();
        accessEvent0.setMethod("null");
        java.lang.String str5 = accessEvent0.getMethod();
        accessEvent0.setProject("true");
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        net.landzero.xlog.utils.CallerInfo callerInfo0 = net.landzero.xlog.utils.Reflections.getCallerInfo();
        java.lang.String str1 = callerInfo0.getMethodName();
        java.lang.String str2 = callerInfo0.getClassName();
        java.lang.String str3 = callerInfo0.getClassName();
        org.junit.Assert.assertNotNull(callerInfo0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "invoke" + "'", str1, "invoke");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "sun.reflect.DelegatingMethodAccessorImpl" + "'", str2, "sun.reflect.DelegatingMethodAccessorImpl");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "sun.reflect.DelegatingMethodAccessorImpl" + "'", str3, "sun.reflect.DelegatingMethodAccessorImpl");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.util.ArrayList<java.lang.String> strList1 = accessEvent0.getHeaderAppInfo();
        int int2 = accessEvent0.getStatus();
        accessEvent0.setMethod("null");
        java.util.ArrayList<java.lang.String> strList5 = accessEvent0.getParams();
        accessEvent0.setMethod("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %X{cridMark} [%thread] %-5level %logger{35} - %msg%n");
        java.lang.String str8 = accessEvent0.topic();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "x-access" + "'", str8, "x-access");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        accessEvent0.setHeaderUserToken("336d5ebc5436534e61d16e63ddfca327");
        accessEvent0.setPathDigest("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n");
        accessEvent0.setMethod("X-Correlation-ID");
        java.lang.String str7 = accessEvent0.topic();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "x-access" + "'", str7, "x-access");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        net.landzero.xlog.utils.CallerInfo callerInfo0 = net.landzero.xlog.utils.Reflections.getCallerInfo();
        java.lang.String str1 = callerInfo0.getMethodName();
        java.lang.String str2 = callerInfo0.getClassName();
        java.lang.String str3 = callerInfo0.getMethodName();
        org.junit.Assert.assertNotNull(callerInfo0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "invoke" + "'", str1, "invoke");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "sun.reflect.DelegatingMethodAccessorImpl" + "'", str2, "sun.reflect.DelegatingMethodAccessorImpl");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "invoke" + "'", str3, "invoke");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        xLogRedisAppender0.setTopic("sun.reflect.DelegatingMethodAccessorImpl");
        xLogRedisAppender0.setName("crid");
        ch.qos.logback.core.filter.Filter<ch.qos.logback.classic.spi.ILoggingEvent> iLoggingEventFilter5 = null;
        xLogRedisAppender0.addFilter(iLoggingEventFilter5);
        java.lang.String str7 = net.landzero.xlog.utils.Strings.safeNormalize((java.lang.Object) xLogRedisAppender0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "net.landzero.xlog.logback.XLogRedisAppender[crid]" + "'", str7, "net.landzero.xlog.logback.XLogRedisAppender[crid]");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getHeaderUserToken();
        java.lang.String str2 = accessEvent0.topic();
        accessEvent0.setDuration(100L);
        java.lang.String str5 = accessEvent0.getHost();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x-access" + "'", str2, "x-access");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        xPerfEvent0.setClassName("");
        xPerfEvent0.setDuration((long) (byte) 0);
        xPerfEvent0.setMethodName("1");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        xLogRedisAppender0.setTopic("sun.reflect.DelegatingMethodAccessorImpl");
        xLogRedisAppender0.setName("crid");
        xLogRedisAppender0.setName(" K[]");
        java.lang.String str7 = xLogRedisAppender0.getProject();
        ch.qos.logback.classic.spi.ILoggingEvent iLoggingEvent8 = null;
        xLogRedisAppender0.doAppend(iLoggingEvent8);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("CRID[-]", "FORM");
        xPerfEventBuilder2.commit();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent4 = xPerfEventBuilder2.build();
        xPerfEvent4.setAction("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n");
        org.junit.Assert.assertNotNull(xPerfEvent4);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        xLogRedisAppender0.setTopic("sun.reflect.DelegatingMethodAccessorImpl");
        ch.qos.logback.classic.spi.ILoggingEvent iLoggingEvent3 = null;
        ch.qos.logback.core.spi.FilterReply filterReply4 = xLogRedisAppender0.getFilterChainDecision(iLoggingEvent3);
        ch.qos.logback.core.filter.Filter<ch.qos.logback.classic.spi.ILoggingEvent> iLoggingEventFilter5 = null;
        xLogRedisAppender0.addFilter(iLoggingEventFilter5);
        org.junit.Assert.assertTrue("'" + filterReply4 + "' != '" + ch.qos.logback.core.spi.FilterReply.NEUTRAL + "'", filterReply4.equals(ch.qos.logback.core.spi.FilterReply.NEUTRAL));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        net.landzero.xlog.utils.IntervalChecker intervalChecker1 = new net.landzero.xlog.utils.IntervalChecker((long) '#');
        long long2 = intervalChecker1.getChecked();
        long long3 = intervalChecker1.getChecked();
        long long4 = intervalChecker1.getInterval();
        intervalChecker1.setChecked((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        net.landzero.xlog.utils.IntervalChecker intervalChecker1 = new net.landzero.xlog.utils.IntervalChecker((long) '#');
        long long2 = intervalChecker1.getChecked();
        intervalChecker1.setChecked((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.util.ArrayList<java.lang.String> strList1 = accessEvent0.getHeaderAppInfo();
        accessEvent0.setMethod("FORM");
        accessEvent0.setQuery("100");
        long long6 = accessEvent0.getDuration();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = net.landzero.xlog.utils.Requests.readBody(httpServletRequest0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        accessEvent0.setHeaderUserToken("336d5ebc5436534e61d16e63ddfca327");
        accessEvent0.setPathDigest("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n");
        java.lang.String str5 = accessEvent0.getHeaderUserToken();
        java.util.ArrayList<java.lang.String> strList6 = accessEvent0.getHeaderAppInfo();
        java.util.ArrayList<java.lang.String> strList7 = accessEvent0.getParams();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "336d5ebc5436534e61d16e63ddfca327" + "'", str5, "336d5ebc5436534e61d16e63ddfca327");
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getHeaderUserToken();
        accessEvent0.setMethod("FORM");
        long long4 = accessEvent0.getDuration();
        accessEvent0.setCrid("x-mybatis-track");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.lang.String str0 = net.landzero.xlog.constants.Constants.HTTP_CRID_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "X-Correlation-ID" + "'", str0, "X-Correlation-ID");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getTopic();
        xPerfEvent0.setDuration((long) (short) 0);
        xPerfEvent0.setCrid("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "x-perf" + "'", str1, "x-perf");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent2 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str3 = xPerfEvent2.getPathDigest();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 100, xPerfEvent2 };
        java.lang.String str5 = net.landzero.xlog.XLog.keyword(objArray4);
        java.lang.String str6 = net.landzero.xlog.XLog.K(objArray4);
        net.landzero.xlog.XLogCommitter xLogCommitter7 = net.landzero.xlog.perf.XPerf.create("0000000000000000", objArray4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(xLogCommitter7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.util.ArrayList<java.lang.String> strList1 = accessEvent0.getHeaderAppInfo();
        int int2 = accessEvent0.getStatus();
        accessEvent0.setMethod("null");
        java.util.ArrayList<java.lang.String> strList5 = accessEvent0.getParams();
        java.util.ArrayList<java.lang.String> strList6 = accessEvent0.getHeaderAppInfo();
        accessEvent0.setMethod("0");
        java.lang.String str9 = accessEvent0.topic();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "x-access" + "'", str9, "x-access");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPath();
        java.util.List<java.lang.String> strList2 = xPerfEvent0.getArguments();
        xPerfEvent0.setPathDigest(" K[]");
        java.lang.String str5 = xPerfEvent0.getMethodName();
        net.landzero.xlog.http.AccessEvent accessEvent6 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str7 = accessEvent6.getHeaderUserToken();
        java.lang.String[] strArray17 = new java.lang.String[] { "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n", "crid", "0", "crid", "FORM", "DIGEST", "FORM", "", "-1" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        accessEvent6.setParams(strList18);
        xPerfEvent0.setArguments((java.util.List<java.lang.String>) strList18);
        xPerfEvent0.setDuration((long) (byte) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPath();
        java.lang.String str2 = xPerfEvent0.getAction();
        java.util.List<java.lang.String> strList3 = xPerfEvent0.getArguments();
        xPerfEvent0.setDuration((long) (short) -1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strList3);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        java.lang.String str0 = net.landzero.xlog.logback.XLogFileAppender.SIGNAL_FILE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/tmp/xlog.reopen.txt" + "'", str0, "/tmp/xlog.reopen.txt");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        java.util.ArrayList<java.lang.String> strList1 = net.landzero.xlog.utils.Flatten.flattenJSON("");
        org.junit.Assert.assertNull(strList1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPath();
        java.util.List<java.lang.String> strList2 = xPerfEvent0.getArguments();
        xPerfEvent0.setPathDigest(" K[]");
        java.lang.String str5 = xPerfEvent0.getMethodName();
        net.landzero.xlog.http.AccessEvent accessEvent6 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str7 = accessEvent6.getHeaderUserToken();
        java.lang.String[] strArray17 = new java.lang.String[] { "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n", "crid", "0", "crid", "FORM", "DIGEST", "FORM", "", "-1" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        accessEvent6.setParams(strList18);
        xPerfEvent0.setArguments((java.util.List<java.lang.String>) strList18);
        xPerfEvent0.setDuration((long) 30000);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        net.landzero.xlog.utils.Hex hex0 = new net.landzero.xlog.utils.Hex();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        xLogRedisAppender0.setTopic("sun.reflect.DelegatingMethodAccessorImpl");
        xLogRedisAppender0.addInfo("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n");
        ch.qos.logback.core.status.Status status5 = null;
        xLogRedisAppender0.addStatus(status5);
        xLogRedisAppender0.stop();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        java.lang.Throwable throwable2 = null;
        xLogRedisAppender0.addInfo("DIGEST", throwable2);
        xLogRedisAppender0.start();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        java.lang.Throwable throwable2 = null;
        xLogRedisAppender0.addWarn("", throwable2);
        ch.qos.logback.core.status.Status status4 = null;
        xLogRedisAppender0.addStatus(status4);
        java.lang.Throwable throwable7 = null;
        xLogRedisAppender0.addWarn(" K[]", throwable7);
        ch.qos.logback.core.status.StatusManager statusManager9 = xLogRedisAppender0.getStatusManager();
        org.junit.Assert.assertNull(statusManager9);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.util.ArrayList<java.lang.String> strList1 = accessEvent0.getHeaderAppInfo();
        java.lang.String str2 = accessEvent0.topic();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x-access" + "'", str2, "x-access");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.normalizeKeyword("_json_");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_json_" + "'", str1, "_json_");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder0 = new net.landzero.xlog.mybatis.TrackEventBuilder();
        trackEventBuilder0.commit();
        net.landzero.xlog.mybatis.TrackEvent trackEvent2 = trackEventBuilder0.build();
        java.lang.String str3 = trackEvent2.getSql();
        org.junit.Assert.assertNotNull(trackEvent2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        java.lang.String str1 = trackEvent0.topic();
        java.lang.String str2 = trackEvent0.getDatabaseUrl();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "x-mybatis-track" + "'", str1, "x-mybatis-track");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.util.ArrayList<java.lang.String> strList1 = accessEvent0.getHeaderAppInfo();
        long long2 = accessEvent0.getDuration();
        accessEvent0.setPathDigest("0");
        net.landzero.xlog.XLog.appendEvent(accessEvent0);
        java.util.ArrayList<java.lang.String> strList6 = accessEvent0.getHeaderAppInfo();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("CRID[-]", "FORM");
        xPerfEventBuilder2.commit();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent4 = xPerfEventBuilder2.build();
        java.lang.String str5 = xPerfEvent4.getPath();
        org.junit.Assert.assertNotNull(xPerfEvent4);
// flaky:         org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPath();
        java.util.List<java.lang.String> strList2 = xPerfEvent0.getArguments();
        xPerfEvent0.setPathDigest(" K[]");
        java.lang.String str5 = xPerfEvent0.getMethodName();
        net.landzero.xlog.http.AccessEvent accessEvent6 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str7 = accessEvent6.getHeaderUserToken();
        java.lang.String[] strArray17 = new java.lang.String[] { "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n", "crid", "0", "crid", "FORM", "DIGEST", "FORM", "", "-1" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        accessEvent6.setParams(strList18);
        xPerfEvent0.setArguments((java.util.List<java.lang.String>) strList18);
        java.lang.String str22 = xPerfEvent0.getClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.util.ArrayList<java.lang.String> strList1 = accessEvent0.getHeaderAppInfo();
        int int2 = accessEvent0.getStatus();
        accessEvent0.setMethod("null");
        java.util.ArrayList<java.lang.String> strList5 = accessEvent0.getParams();
        accessEvent0.setMethod("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %X{cridMark} [%thread] %-5level %logger{35} - %msg%n");
        int int8 = accessEvent0.getStatus();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        net.landzero.xlog.utils.SignalFileChecker signalFileChecker1 = new net.landzero.xlog.utils.SignalFileChecker("");
        signalFileChecker1.setCachedLastModified((long) (byte) 100);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        java.lang.String str1 = trackEvent0.getRawSql();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        java.lang.Throwable throwable2 = null;
        xLogRedisAppender0.addInfo("DIGEST", throwable2);
        ch.qos.logback.core.status.Status status4 = null;
        xLogRedisAppender0.addStatus(status4);
        ch.qos.logback.core.status.Status status6 = null;
        xLogRedisAppender0.addStatus(status6);
        xLogRedisAppender0.stop();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        java.util.ArrayList<java.lang.String> strList1 = net.landzero.xlog.utils.Flatten.flattenJSON("d41d8cd98f00b204e9800998ecf8427e");
        org.junit.Assert.assertNull(strList1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        net.landzero.xlog.utils.SignalFileChecker signalFileChecker1 = new net.landzero.xlog.utils.SignalFileChecker("plain");
        boolean boolean2 = signalFileChecker1.check();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        xLogRedisAppender0.setTopic("sun.reflect.DelegatingMethodAccessorImpl");
        xLogRedisAppender0.start();
        xLogRedisAppender0.clearAllFilters();
        xLogRedisAppender0.stop();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        java.lang.Throwable throwable2 = null;
        xLogRedisAppender0.addWarn("", throwable2);
        ch.qos.logback.core.status.Status status4 = null;
        xLogRedisAppender0.addStatus(status4);
        ch.qos.logback.classic.spi.ILoggingEvent iLoggingEvent6 = null;
        ch.qos.logback.core.spi.FilterReply filterReply7 = xLogRedisAppender0.getFilterChainDecision(iLoggingEvent6);
        org.junit.Assert.assertTrue("'" + filterReply7 + "' != '" + ch.qos.logback.core.spi.FilterReply.NEUTRAL + "'", filterReply7.equals(ch.qos.logback.core.spi.FilterReply.NEUTRAL));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        net.landzero.xlog.XLog.clearPath();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        xLogRedisAppender0.setTopic("sun.reflect.DelegatingMethodAccessorImpl");
        xLogRedisAppender0.setName("crid");
        xLogRedisAppender0.setName(" K[]");
        xLogRedisAppender0.start();
        xLogRedisAppender0.clearAllFilters();
        java.lang.Throwable throwable10 = null;
        xLogRedisAppender0.addError("K[]", throwable10);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.lang.String str1 = net.landzero.xlog.utils.Hex.toHex((byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ff" + "'", str1, "ff");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        net.landzero.xlog.XLog xLog0 = new net.landzero.xlog.XLog();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getHeaderUserToken();
        java.lang.String str2 = accessEvent0.topic();
        java.lang.String str3 = accessEvent0.getHost();
        accessEvent0.setQuery("0000000000000061");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x-access" + "'", str2, "x-access");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getHeaderUserToken();
        accessEvent0.setMethod("FORM");
        long long4 = accessEvent0.getDuration();
        java.lang.String str5 = accessEvent0.getCrid();
        net.landzero.xlog.http.AccessEvent accessEvent6 = new net.landzero.xlog.http.AccessEvent();
        java.util.ArrayList<java.lang.String> strList7 = accessEvent6.getHeaderAppInfo();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent8 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str9 = xPerfEvent8.getPath();
        java.lang.String str10 = xPerfEvent8.getAction();
        net.landzero.xlog.http.AccessEvent accessEvent11 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str12 = accessEvent11.getHeaderUserToken();
        java.lang.String[] strArray22 = new java.lang.String[] { "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n", "crid", "0", "crid", "FORM", "DIGEST", "FORM", "", "-1" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        accessEvent11.setParams(strList23);
        xPerfEvent8.setArguments((java.util.List<java.lang.String>) strList23);
        accessEvent6.setHeaderAppInfo(strList23);
        accessEvent0.setParams(strList23);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        net.landzero.xlog.http.AccessEventBuilder accessEventBuilder0 = new net.landzero.xlog.http.AccessEventBuilder();
        javax.servlet.ServletRequest servletRequest1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.landzero.xlog.http.AccessEventBuilder accessEventBuilder2 = accessEventBuilder0.setServletRequest(servletRequest1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        net.landzero.xlog.utils.Flatten flatten0 = new net.landzero.xlog.utils.Flatten();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        java.lang.Throwable throwable2 = null;
        xLogRedisAppender0.addWarn("", throwable2);
        boolean boolean4 = xLogRedisAppender0.isStarted();
        xLogRedisAppender0.setName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getHeaderUserToken();
        java.lang.String str2 = accessEvent0.getPath();
        java.lang.String str3 = accessEvent0.topic();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "x-access" + "'", str3, "x-access");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test156() throws Throwable {
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
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Oct 30 18:23:48 CDT 2023");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        xLogRedisAppender0.setTopic("sun.reflect.DelegatingMethodAccessorImpl");
        xLogRedisAppender0.addInfo("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n");
        java.lang.String str5 = xLogRedisAppender0.getProject();
        xLogRedisAppender0.stop();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("CRID[-]", "FORM");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent3 = xPerfEventBuilder2.build();
        xPerfEvent3.setClassName("-1");
        java.lang.String str6 = xPerfEvent3.getClassName();
        long long7 = xPerfEvent3.getDuration();
        java.util.List<java.lang.String> strList8 = xPerfEvent3.getArguments();
        org.junit.Assert.assertNotNull(xPerfEvent3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(strList8);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        java.lang.String str1 = net.landzero.xlog.utils.Hex.toHex((long) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0000000000000000" + "'", str1, "0000000000000000");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("CRID[-]", "FORM");
        xPerfEventBuilder2.commit();
        java.lang.String str4 = net.landzero.xlog.utils.Strings.safeNormalize((java.lang.Object) xPerfEventBuilder2);
        xPerfEventBuilder2.commit();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        java.lang.Throwable throwable2 = null;
        xLogRedisAppender0.addWarn("", throwable2);
        xLogRedisAppender0.setName("invoke");
        ch.qos.logback.core.Context context6 = null;
        xLogRedisAppender0.setContext(context6);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getTopic();
        java.lang.String str2 = xPerfEvent0.getMethodName();
        java.lang.String str3 = net.landzero.xlog.utils.Strings.normalizeKeyword((java.lang.Object) str2);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "x-perf" + "'", str1, "x-perf");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("CRID[-]", "FORM");
        xPerfEventBuilder2.commit();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent4 = xPerfEventBuilder2.build();
        java.lang.String str5 = xPerfEvent4.topic();
        org.junit.Assert.assertNotNull(xPerfEvent4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "x-perf" + "'", str5, "x-perf");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        accessEvent0.setHeaderUserToken("336d5ebc5436534e61d16e63ddfca327");
        accessEvent0.setPathDigest("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n");
        java.lang.String str5 = accessEvent0.getHeaderUserToken();
        java.util.ArrayList<java.lang.String> strList6 = accessEvent0.getHeaderAppInfo();
        accessEvent0.setQuery("100.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "336d5ebc5436534e61d16e63ddfca327" + "'", str5, "336d5ebc5436534e61d16e63ddfca327");
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPath();
        java.util.List<java.lang.String> strList2 = xPerfEvent0.getArguments();
        xPerfEvent0.setPathDigest(" K[]");
        java.lang.String str5 = xPerfEvent0.getMethodName();
        java.lang.String str6 = xPerfEvent0.getPath();
        xPerfEvent0.setClassName("BASIC");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder0 = new net.landzero.xlog.mybatis.TrackEventBuilder();
        trackEventBuilder0.commit();
        net.landzero.xlog.mybatis.TrackEvent trackEvent2 = trackEventBuilder0.build();
        trackEvent2.setSql("sun.reflect.DelegatingMethodAccessorImpl");
        trackEvent2.setMethod("");
        java.lang.String str7 = trackEvent2.getMethod();
        java.lang.String str8 = trackEvent2.topic();
        java.lang.String str9 = trackEvent2.getRawSql();
        java.lang.String str10 = trackEvent2.getError();
        trackEvent2.setError("x-mybatis-track");
        java.lang.String str13 = trackEvent2.getDatabaseUrl();
        org.junit.Assert.assertNotNull(trackEvent2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "x-mybatis-track" + "'", str8, "x-mybatis-track");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("cridMark", "BASIC");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent3 = xPerfEventBuilder2.build();
        xPerfEventBuilder2.commit();
        org.junit.Assert.assertNotNull(xPerfEvent3);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        java.util.ArrayList<java.lang.String> strList1 = net.landzero.xlog.utils.Flatten.flattenJSON("CLIENT_CERT");
        org.junit.Assert.assertNull(strList1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        net.landzero.xlog.utils.SignalFileChecker signalFileChecker1 = new net.landzero.xlog.utils.SignalFileChecker("");
        signalFileChecker1.setCachedLastModified((long) '#');
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        xLogRedisAppender0.setTopic("sun.reflect.DelegatingMethodAccessorImpl");
        xLogRedisAppender0.setName("crid");
        xLogRedisAppender0.setName(" K[]");
        xLogRedisAppender0.start();
        xLogRedisAppender0.start();
        xLogRedisAppender0.setEnv("-1");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        boolean boolean1 = net.landzero.xlog.utils.Strings.isEmpty("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        boolean boolean1 = net.landzero.xlog.utils.Strings.isEmpty("invoke");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("CRID[-]", "FORM");
        xPerfEventBuilder2.commit();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent4 = xPerfEventBuilder2.build();
        java.util.Date date5 = xPerfEvent4.getTimestamp();
        xPerfEvent4.setProject("ff");
        org.junit.Assert.assertNotNull(xPerfEvent4);
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Tue Oct 31 18:23:48 CDT 2023");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.util.ArrayList<java.lang.String> strList1 = accessEvent0.getHeaderAppInfo();
        accessEvent0.setMethod("FORM");
        java.lang.String[] strArray16 = new java.lang.String[] { "BASIC", "0000000000000000", "-", "CRID[-]", "xlog.Event", "true", "FORM", "CRID[-]", "json", "x-perf", "cridMark", "0" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        accessEvent0.setParams(strList17);
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setMethod("true");
        java.lang.String str3 = trackEvent0.getError();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        ch.qos.logback.core.Context context1 = xLogRedisAppender0.getContext();
        java.util.List<ch.qos.logback.core.filter.Filter<ch.qos.logback.classic.spi.ILoggingEvent>> iLoggingEventFilterList2 = xLogRedisAppender0.getCopyOfAttachedFiltersList();
        java.lang.Throwable throwable4 = null;
        xLogRedisAppender0.addError("", throwable4);
        xLogRedisAppender0.clearAllFilters();
        org.junit.Assert.assertNull(context1);
        org.junit.Assert.assertNotNull(iLoggingEventFilterList2);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        net.landzero.xlog.utils.SignalFileChecker signalFileChecker1 = new net.landzero.xlog.utils.SignalFileChecker("");
        boolean boolean2 = signalFileChecker1.check();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        xLogRedisAppender0.setTopic("sun.reflect.DelegatingMethodAccessorImpl");
        xLogRedisAppender0.start();
        xLogRedisAppender0.clearAllFilters();
        ch.qos.logback.core.Context context5 = null;
        xLogRedisAppender0.setContext(context5);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getHeaderUserToken();
        java.lang.String str2 = accessEvent0.topic();
        java.util.ArrayList<java.lang.String> strList3 = accessEvent0.getHeaderVerInfo();
        java.util.ArrayList<java.lang.String> strList4 = accessEvent0.getHeaderAppInfo();
        java.util.ArrayList<java.lang.String> strList5 = accessEvent0.getParams();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x-access" + "'", str2, "x-access");
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNull(strList5);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getHeaderUserToken();
        java.lang.String[] strArray11 = new java.lang.String[] { "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n", "crid", "0", "crid", "FORM", "DIGEST", "FORM", "", "-1" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        accessEvent0.setParams(strList12);
        java.lang.String str15 = accessEvent0.topic();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "x-access" + "'", str15, "x-access");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        net.landzero.xlog.utils.IntervalChecker intervalChecker1 = new net.landzero.xlog.utils.IntervalChecker((long) '#');
        long long2 = intervalChecker1.getChecked();
        long long3 = intervalChecker1.getChecked();
        long long4 = intervalChecker1.getInterval();
        intervalChecker1.setChecked((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        xPerfEvent0.setClassName("");
        xPerfEvent0.setDuration((long) (byte) 0);
        java.lang.String str5 = xPerfEvent0.getClassName();
        java.lang.String str6 = xPerfEvent0.topic();
        xPerfEvent0.setAction("-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "x-perf" + "'", str6, "x-perf");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.normalize("FORM");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FORM" + "'", str1, "FORM");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder0 = new net.landzero.xlog.mybatis.TrackEventBuilder();
        trackEventBuilder0.commit();
        net.landzero.xlog.mybatis.TrackEvent trackEvent2 = trackEventBuilder0.build();
        trackEvent2.setSql("sun.reflect.DelegatingMethodAccessorImpl");
        trackEvent2.setMethod("");
        java.lang.String str7 = trackEvent2.getMethod();
        java.lang.String str8 = trackEvent2.topic();
        java.lang.String str9 = trackEvent2.getRawSql();
        trackEvent2.setTopic("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n");
        org.junit.Assert.assertNotNull(trackEvent2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "x-mybatis-track" + "'", str8, "x-mybatis-track");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test185() throws Throwable {
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
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Tue Oct 31 18:23:49 CDT 2023");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FORM" + "'", str7, "FORM");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        java.lang.Object obj0 = null;
        java.lang.String str1 = net.landzero.xlog.utils.Strings.normalizeKeyword(obj0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null" + "'", str1, "null");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        java.util.ArrayList<java.lang.String> strList1 = net.landzero.xlog.utils.Flatten.flattenJSON("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %X{cridMark} [%thread] %-5level %logger{35} - %msg%n");
        org.junit.Assert.assertNull(strList1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getHeaderUserToken();
        accessEvent0.setMethod("FORM");
        long long4 = accessEvent0.getDuration();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "BASIC", "x-access", "x-access", "0", "DIGEST", "true", "crid", "plain", "sun.reflect.DelegatingMethodAccessorImpl", "1", "1", "2b91ee34d8daadf5", "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %X{cridMark} [%thread] %-5level %logger{35} - %msg%n", "-1", "true", "-1", "json" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        accessEvent0.setParams(strList24);
        accessEvent0.setDuration((long) 'a');
        java.lang.String str29 = accessEvent0.getMethod();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "FORM" + "'", str29, "FORM");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        xLogRedisAppender0.start();
        java.util.List<ch.qos.logback.core.filter.Filter<ch.qos.logback.classic.spi.ILoggingEvent>> iLoggingEventFilterList2 = xLogRedisAppender0.getCopyOfAttachedFiltersList();
        xLogRedisAppender0.stop();
        org.junit.Assert.assertNotNull(iLoggingEventFilterList2);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        java.lang.Throwable throwable2 = null;
        xLogRedisAppender0.addWarn("", throwable2);
        boolean boolean4 = xLogRedisAppender0.isStarted();
        ch.qos.logback.core.status.StatusManager statusManager5 = xLogRedisAppender0.getStatusManager();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(statusManager5);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        ch.qos.logback.core.Context context1 = xLogRedisAppender0.getContext();
        java.util.List<ch.qos.logback.core.filter.Filter<ch.qos.logback.classic.spi.ILoggingEvent>> iLoggingEventFilterList2 = xLogRedisAppender0.getCopyOfAttachedFiltersList();
        java.lang.Throwable throwable4 = null;
        xLogRedisAppender0.addError("", throwable4);
        xLogRedisAppender0.addWarn(" K[]");
        org.junit.Assert.assertNull(context1);
        org.junit.Assert.assertNotNull(iLoggingEventFilterList2);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.util.ArrayList<java.lang.String> strList1 = accessEvent0.getHeaderAppInfo();
        int int2 = accessEvent0.getStatus();
        accessEvent0.setMethod("null");
        java.lang.String str5 = accessEvent0.getMethod();
        java.lang.String str6 = accessEvent0.getHost();
        net.landzero.xlog.http.AccessEvent accessEvent7 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str8 = accessEvent7.getHeaderUserToken();
        accessEvent7.setMethod("FORM");
        long long11 = accessEvent7.getDuration();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "BASIC", "x-access", "x-access", "0", "DIGEST", "true", "crid", "plain", "sun.reflect.DelegatingMethodAccessorImpl", "1", "1", "2b91ee34d8daadf5", "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %X{cridMark} [%thread] %-5level %logger{35} - %msg%n", "-1", "true", "-1", "json" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        accessEvent7.setParams(strList31);
        accessEvent0.setHeaderAppInfo(strList31);
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        accessEvent0.setHeaderUserToken("336d5ebc5436534e61d16e63ddfca327");
        accessEvent0.setPathDigest("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n");
        java.lang.String str5 = accessEvent0.getHeaderUserToken();
        accessEvent0.setQuery("336d5ebc5436534e61d16e63ddfca327");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "336d5ebc5436534e61d16e63ddfca327" + "'", str5, "336d5ebc5436534e61d16e63ddfca327");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder0 = new net.landzero.xlog.mybatis.TrackEventBuilder();
        trackEventBuilder0.commit();
        net.landzero.xlog.mybatis.TrackEvent trackEvent2 = trackEventBuilder0.build();
        trackEventBuilder0.commit();
        trackEventBuilder0.commit();
        org.junit.Assert.assertNotNull(trackEvent2);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        net.landzero.xlog.utils.SignalFileChecker signalFileChecker1 = new net.landzero.xlog.utils.SignalFileChecker("json");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        xLogRedisAppender0.setTopic("sun.reflect.DelegatingMethodAccessorImpl");
        xLogRedisAppender0.start();
        ch.qos.logback.core.Context context4 = null;
        xLogRedisAppender0.setContext(context4);
        ch.qos.logback.core.filter.Filter<ch.qos.logback.classic.spi.ILoggingEvent> iLoggingEventFilter6 = null;
        xLogRedisAppender0.addFilter(iLoggingEventFilter6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        java.lang.String str1 = net.landzero.xlog.utils.Hex.toHex((long) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0000000000000064" + "'", str1, "0000000000000064");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        xLogRedisAppender0.setTopic("sun.reflect.DelegatingMethodAccessorImpl");
        xLogRedisAppender0.setName("crid");
        xLogRedisAppender0.setName(" K[]");
        xLogRedisAppender0.start();
        xLogRedisAppender0.clearAllFilters();
        xLogRedisAppender0.setName("2b91ee34d8daadf5");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        net.landzero.xlog.XLog.setCrid("X-Correlation-ID");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPath();
        xPerfEvent0.setCrid("");
        xPerfEvent0.setAction("/tmp/xlog.reopen.txt");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("CRID[-]", "FORM");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent3 = xPerfEventBuilder2.build();
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        java.lang.String str7 = net.landzero.xlog.XLog.K(objArray6);
        net.landzero.xlog.XLogCommitter xLogCommitter8 = net.landzero.xlog.perf.XPerf.create("json", objArray6);
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder9 = xPerfEventBuilder2.setCommand("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n", objArray6);
        xPerfEventBuilder2.commit();
        org.junit.Assert.assertNotNull(xPerfEvent3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " K[]" + "'", str7, " K[]");
        org.junit.Assert.assertNotNull(xLogCommitter8);
        org.junit.Assert.assertNotNull(xPerfEventBuilder9);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getHeaderUserToken();
        accessEvent0.setHost("1");
        java.util.ArrayList<java.lang.String> strList4 = accessEvent0.getHeaderVerInfo();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent5 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str6 = xPerfEvent5.getPath();
        java.lang.String str7 = xPerfEvent5.getAction();
        net.landzero.xlog.http.AccessEvent accessEvent8 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str9 = accessEvent8.getHeaderUserToken();
        java.lang.String[] strArray19 = new java.lang.String[] { "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n", "crid", "0", "crid", "FORM", "DIGEST", "FORM", "", "-1" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        accessEvent8.setParams(strList20);
        xPerfEvent5.setArguments((java.util.List<java.lang.String>) strList20);
        accessEvent0.setHeaderAppInfo(strList20);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        xLogRedisAppender0.setTopic("sun.reflect.DelegatingMethodAccessorImpl");
        xLogRedisAppender0.start();
        xLogRedisAppender0.clearAllFilters();
        java.util.List<ch.qos.logback.core.filter.Filter<ch.qos.logback.classic.spi.ILoggingEvent>> iLoggingEventFilterList5 = xLogRedisAppender0.getCopyOfAttachedFiltersList();
        java.util.List<ch.qos.logback.core.filter.Filter<ch.qos.logback.classic.spi.ILoggingEvent>> iLoggingEventFilterList6 = xLogRedisAppender0.getCopyOfAttachedFiltersList();
        org.junit.Assert.assertNotNull(iLoggingEventFilterList5);
        org.junit.Assert.assertNotNull(iLoggingEventFilterList6);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        net.landzero.xlog.logback.XLogFileAppender xLogFileAppender0 = new net.landzero.xlog.logback.XLogFileAppender();
        xLogFileAppender0.setDir("CLIENT_CERT");
        xLogFileAppender0.setDir("BASIC");
        xLogFileAppender0.setRotate((int) 'a');
    }

    @Test
    public void test205() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPath();
        java.util.List<java.lang.String> strList2 = xPerfEvent0.getArguments();
        xPerfEvent0.setPathDigest(" K[]");
        java.lang.String str5 = xPerfEvent0.getMethodName();
        java.lang.String str6 = xPerfEvent0.getPath();
        java.lang.String str7 = xPerfEvent0.getClassName();
        xPerfEvent0.setMethodName("20231030");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        xLogRedisAppender0.setTopic("sun.reflect.DelegatingMethodAccessorImpl");
        xLogRedisAppender0.start();
        xLogRedisAppender0.clearAllFilters();
        ch.qos.logback.classic.spi.ILoggingEvent iLoggingEvent5 = null;
        ch.qos.logback.core.spi.FilterReply filterReply6 = xLogRedisAppender0.getFilterChainDecision(iLoggingEvent5);
        org.junit.Assert.assertTrue("'" + filterReply6 + "' != '" + ch.qos.logback.core.spi.FilterReply.NEUTRAL + "'", filterReply6.equals(ch.qos.logback.core.spi.FilterReply.NEUTRAL));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        net.landzero.xlog.logback.XLogFileAppender xLogFileAppender0 = new net.landzero.xlog.logback.XLogFileAppender();
        xLogFileAppender0.setDir("x-perf");
        xLogFileAppender0.setDir("_json_");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        java.lang.Throwable throwable2 = null;
        xLogRedisAppender0.addWarn("", throwable2);
        xLogRedisAppender0.setName("invoke");
        xLogRedisAppender0.addHost("-");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        java.lang.Throwable throwable2 = null;
        xLogRedisAppender0.addWarn("", throwable2);
        ch.qos.logback.core.status.Status status4 = null;
        xLogRedisAppender0.addStatus(status4);
        java.util.ArrayList<java.lang.String> strList6 = xLogRedisAppender0.getHosts();
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder0 = new net.landzero.xlog.mybatis.TrackEventBuilder();
        trackEventBuilder0.commit();
        net.landzero.xlog.mybatis.TrackEvent trackEvent2 = trackEventBuilder0.build();
        trackEventBuilder0.commit();
        java.lang.Throwable throwable4 = null;
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder5 = trackEventBuilder0.setThrowable(throwable4);
        org.junit.Assert.assertNotNull(trackEvent2);
        org.junit.Assert.assertNotNull(trackEventBuilder5);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        ch.qos.logback.core.Context context1 = xLogRedisAppender0.getContext();
        java.lang.String str2 = net.landzero.xlog.utils.Strings.normalize((java.lang.Object) context1);
        org.junit.Assert.assertNull(context1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.util.ArrayList<java.lang.String> strList1 = accessEvent0.getHeaderAppInfo();
        int int2 = accessEvent0.getStatus();
        accessEvent0.setMethod("null");
        java.lang.String str5 = accessEvent0.getMethod();
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder8 = new net.landzero.xlog.perf.XPerfEventBuilder("CRID[-]", "FORM");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent9 = xPerfEventBuilder8.build();
        xPerfEvent9.setClassName("-1");
        net.landzero.xlog.http.AccessEvent accessEvent12 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str13 = accessEvent12.getHeaderUserToken();
        java.lang.String[] strArray23 = new java.lang.String[] { "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n", "crid", "0", "crid", "FORM", "DIGEST", "FORM", "", "-1" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        accessEvent12.setParams(strList24);
        xPerfEvent9.setArguments((java.util.List<java.lang.String>) strList24);
        accessEvent0.setHeaderAppInfo(strList24);
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(xPerfEvent9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setMethod("X-Correlation-ID");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        net.landzero.xlog.utils.SignalFileChecker signalFileChecker1 = new net.landzero.xlog.utils.SignalFileChecker("invoke");
        signalFileChecker1.setCachedLastModified((long) (-1));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        java.lang.Throwable throwable2 = null;
        xLogRedisAppender0.addInfo("DIGEST", throwable2);
        ch.qos.logback.core.status.Status status4 = null;
        xLogRedisAppender0.addStatus(status4);
        ch.qos.logback.core.status.Status status6 = null;
        xLogRedisAppender0.addStatus(status6);
        xLogRedisAppender0.clearAllFilters();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        net.landzero.xlog.utils.CallerInfo callerInfo0 = net.landzero.xlog.utils.Reflections.getCallerInfo();
        java.lang.String str1 = callerInfo0.getClassName();
        java.lang.String str2 = callerInfo0.getClassName();
        org.junit.Assert.assertNotNull(callerInfo0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "sun.reflect.DelegatingMethodAccessorImpl" + "'", str1, "sun.reflect.DelegatingMethodAccessorImpl");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "sun.reflect.DelegatingMethodAccessorImpl" + "'", str2, "sun.reflect.DelegatingMethodAccessorImpl");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder0 = new net.landzero.xlog.mybatis.TrackEventBuilder();
        trackEventBuilder0.commit();
        net.landzero.xlog.mybatis.TrackEvent trackEvent2 = trackEventBuilder0.build();
        trackEvent2.setSql("sun.reflect.DelegatingMethodAccessorImpl");
        trackEvent2.setMethod("");
        java.lang.String str7 = trackEvent2.getMethod();
        java.lang.String str8 = trackEvent2.topic();
        java.lang.String str9 = trackEvent2.getDatabaseUrl();
        org.junit.Assert.assertNotNull(trackEvent2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "x-mybatis-track" + "'", str8, "x-mybatis-track");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        net.landzero.xlog.logback.XLogFileAppender xLogFileAppender0 = new net.landzero.xlog.logback.XLogFileAppender();
        xLogFileAppender0.start();
        java.lang.String str2 = xLogFileAppender0.getFilename();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        xLogRedisAppender0.setTopic("sun.reflect.DelegatingMethodAccessorImpl");
        xLogRedisAppender0.start();
        xLogRedisAppender0.clearAllFilters();
        java.util.List<ch.qos.logback.core.filter.Filter<ch.qos.logback.classic.spi.ILoggingEvent>> iLoggingEventFilterList5 = xLogRedisAppender0.getCopyOfAttachedFiltersList();
        xLogRedisAppender0.addHost("100");
        org.junit.Assert.assertNotNull(iLoggingEventFilterList5);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        net.landzero.xlog.logback.XLogFileAppender xLogFileAppender0 = new net.landzero.xlog.logback.XLogFileAppender();
        xLogFileAppender0.setDir("BASIC");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        xLogRedisAppender0.start();
        ch.qos.logback.classic.spi.ILoggingEvent iLoggingEvent2 = null;
        ch.qos.logback.core.spi.FilterReply filterReply3 = xLogRedisAppender0.getFilterChainDecision(iLoggingEvent2);
        org.junit.Assert.assertTrue("'" + filterReply3 + "' != '" + ch.qos.logback.core.spi.FilterReply.NEUTRAL + "'", filterReply3.equals(ch.qos.logback.core.spi.FilterReply.NEUTRAL));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder0 = new net.landzero.xlog.mybatis.TrackEventBuilder();
        trackEventBuilder0.commit();
        net.landzero.xlog.mybatis.TrackEvent trackEvent2 = trackEventBuilder0.build();
        trackEvent2.setError("DIGEST");
        long long5 = trackEvent2.getDuration();
        java.lang.Class<?> wildcardClass6 = trackEvent2.getClass();
        org.junit.Assert.assertNotNull(trackEvent2);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPath();
        java.lang.String str2 = xPerfEvent0.getAction();
        net.landzero.xlog.http.AccessEvent accessEvent3 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str4 = accessEvent3.getHeaderUserToken();
        java.lang.String[] strArray14 = new java.lang.String[] { "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n", "crid", "0", "crid", "FORM", "DIGEST", "FORM", "", "-1" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        accessEvent3.setParams(strList15);
        xPerfEvent0.setArguments((java.util.List<java.lang.String>) strList15);
        java.lang.String str19 = xPerfEvent0.getMethodName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getHeaderUserToken();
        java.lang.String str2 = accessEvent0.topic();
        java.lang.String str3 = accessEvent0.getHost();
        java.lang.String str4 = accessEvent0.getMethod();
        java.lang.String str5 = accessEvent0.getCrid();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x-access" + "'", str2, "x-access");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        net.landzero.xlog.logback.XLogFileAppender xLogFileAppender0 = new net.landzero.xlog.logback.XLogFileAppender();
        xLogFileAppender0.start();
        boolean boolean2 = xLogFileAppender0.isStarted();
        java.lang.String str3 = xLogFileAppender0.getFilename();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder0 = new net.landzero.xlog.mybatis.TrackEventBuilder();
        java.lang.Throwable throwable1 = null;
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder2 = trackEventBuilder0.setThrowable(throwable1);
        java.lang.Throwable throwable3 = null;
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder4 = trackEventBuilder0.setThrowable(throwable3);
        org.junit.Assert.assertNotNull(trackEventBuilder2);
        org.junit.Assert.assertNotNull(trackEventBuilder4);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPath();
        java.util.List<java.lang.String> strList2 = xPerfEvent0.getArguments();
        xPerfEvent0.setPathDigest(" K[]");
        java.lang.String str5 = xPerfEvent0.getMethodName();
        java.lang.String str6 = xPerfEvent0.getPath();
        xPerfEvent0.setMethodName("ff");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getHeaderUserToken();
        java.lang.String str2 = accessEvent0.topic();
        java.lang.String str3 = accessEvent0.getHost();
        accessEvent0.setProject("-");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x-access" + "'", str2, "x-access");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        xLogRedisAppender0.setTopic("sun.reflect.DelegatingMethodAccessorImpl");
        xLogRedisAppender0.setName("crid");
        xLogRedisAppender0.setName(" K[]");
        xLogRedisAppender0.start();
        xLogRedisAppender0.start();
        xLogRedisAppender0.addHost("100.0");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        xLogRedisAppender0.setTopic("sun.reflect.DelegatingMethodAccessorImpl");
        xLogRedisAppender0.start();
        ch.qos.logback.core.Context context4 = null;
        xLogRedisAppender0.setContext(context4);
        java.lang.String str6 = xLogRedisAppender0.getProject();
        java.lang.String str7 = xLogRedisAppender0.getProject();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        net.landzero.xlog.utils.Reflections reflections0 = new net.landzero.xlog.utils.Reflections();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.util.ArrayList<java.lang.String> strList1 = accessEvent0.getHeaderAppInfo();
        long long2 = accessEvent0.getDuration();
        accessEvent0.setPathDigest("0");
        net.landzero.xlog.XLog.appendEvent(accessEvent0);
        net.landzero.xlog.perf.XPerfEvent xPerfEvent6 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str7 = xPerfEvent6.getPath();
        java.lang.String str8 = xPerfEvent6.getAction();
        net.landzero.xlog.http.AccessEvent accessEvent9 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str10 = accessEvent9.getHeaderUserToken();
        java.lang.String[] strArray20 = new java.lang.String[] { "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n", "crid", "0", "crid", "FORM", "DIGEST", "FORM", "", "-1" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        accessEvent9.setParams(strList21);
        xPerfEvent6.setArguments((java.util.List<java.lang.String>) strList21);
        accessEvent0.setHeaderVerInfo(strList21);
        accessEvent0.setProject("0000000000000000");
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        java.lang.Throwable throwable2 = null;
        xLogRedisAppender0.addWarn("", throwable2);
        ch.qos.logback.classic.spi.ILoggingEvent iLoggingEvent4 = null;
        xLogRedisAppender0.doAppend(iLoggingEvent4);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getHeaderUserToken();
        accessEvent0.setMethod("FORM");
        long long4 = accessEvent0.getDuration();
        java.util.ArrayList<java.lang.String> strList5 = accessEvent0.getHeaderVerInfo();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(strList5);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder0 = new net.landzero.xlog.mybatis.TrackEventBuilder();
        trackEventBuilder0.commit();
        net.landzero.xlog.mybatis.TrackEvent trackEvent2 = trackEventBuilder0.build();
        trackEvent2.setSql("sun.reflect.DelegatingMethodAccessorImpl");
        trackEvent2.setMethod("");
        java.lang.String str7 = trackEvent2.getMethod();
        java.lang.String str8 = trackEvent2.topic();
        java.lang.String str9 = trackEvent2.getMethod();
        org.junit.Assert.assertNotNull(trackEvent2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "x-mybatis-track" + "'", str8, "x-mybatis-track");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder0 = new net.landzero.xlog.mybatis.TrackEventBuilder();
        trackEventBuilder0.commit();
        net.landzero.xlog.mybatis.TrackEvent trackEvent2 = trackEventBuilder0.build();
        trackEvent2.setSql("sun.reflect.DelegatingMethodAccessorImpl");
        trackEvent2.setMethod("");
        java.lang.String str7 = trackEvent2.getMethod();
        java.lang.String str8 = trackEvent2.getSql();
        trackEvent2.setDatabaseUrl("0000000000000061");
        org.junit.Assert.assertNotNull(trackEvent2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "sun.reflect.DelegatingMethodAccessorImpl" + "'", str8, "sun.reflect.DelegatingMethodAccessorImpl");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder0 = new net.landzero.xlog.mybatis.TrackEventBuilder();
        trackEventBuilder0.commit();
        net.landzero.xlog.mybatis.TrackEvent trackEvent2 = trackEventBuilder0.build();
        trackEvent2.setSql("sun.reflect.DelegatingMethodAccessorImpl");
        trackEvent2.setMethod("");
        trackEvent2.setDatabaseUrl("crid");
        trackEvent2.setMethod("x-perf");
        org.junit.Assert.assertNotNull(trackEvent2);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        net.landzero.xlog.logback.XLogFileAppender xLogFileAppender0 = new net.landzero.xlog.logback.XLogFileAppender();
        java.lang.String str1 = xLogFileAppender0.getFilename();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("CRID[-]", "FORM");
        xPerfEventBuilder2.commit();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent4 = xPerfEventBuilder2.build();
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        java.lang.String str7 = net.landzero.xlog.XLog.K(objArray6);
        java.lang.String str8 = net.landzero.xlog.XLog.K(objArray6);
        java.lang.String str9 = net.landzero.xlog.XLog.keyword(objArray6);
        java.lang.String str10 = net.landzero.xlog.XLog.keyword(objArray6);
        java.lang.String str11 = net.landzero.xlog.XLog.keyword(objArray6);
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder12 = xPerfEventBuilder2.setCommand("plain", objArray6);
        xPerfEventBuilder12.commit();
        xPerfEventBuilder12.commit();
        org.junit.Assert.assertNotNull(xPerfEvent4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " K[]" + "'", str7, " K[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " K[]" + "'", str8, " K[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " K[]" + "'", str9, " K[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " K[]" + "'", str10, " K[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " K[]" + "'", str11, " K[]");
        org.junit.Assert.assertNotNull(xPerfEventBuilder12);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        net.landzero.xlog.http.AccessEventBuilder accessEventBuilder0 = new net.landzero.xlog.http.AccessEventBuilder();
        accessEventBuilder0.commit();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("CRID[-]", "FORM");
        xPerfEventBuilder2.commit();
        java.lang.String str4 = net.landzero.xlog.utils.Strings.safeNormalize((java.lang.Object) xPerfEventBuilder2);
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder8 = new net.landzero.xlog.perf.XPerfEventBuilder("CRID[-]", "FORM");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent9 = xPerfEventBuilder8.build();
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        java.lang.String str13 = net.landzero.xlog.XLog.K(objArray12);
        net.landzero.xlog.XLogCommitter xLogCommitter14 = net.landzero.xlog.perf.XPerf.create("json", objArray12);
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder15 = xPerfEventBuilder8.setCommand("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n", objArray12);
        java.lang.String str16 = net.landzero.xlog.utils.Strings.normalizeKeyword((java.lang.Object) objArray12);
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder17 = xPerfEventBuilder2.setCommand("json", objArray12);
        org.junit.Assert.assertNotNull(xPerfEvent9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " K[]" + "'", str13, " K[]");
        org.junit.Assert.assertNotNull(xLogCommitter14);
        org.junit.Assert.assertNotNull(xPerfEventBuilder15);
        org.junit.Assert.assertNotNull(xPerfEventBuilder17);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        net.landzero.xlog.logback.XLogFileAppender xLogFileAppender0 = new net.landzero.xlog.logback.XLogFileAppender();
        xLogFileAppender0.setDir("CLIENT_CERT");
        xLogFileAppender0.setDir("BASIC");
        xLogFileAppender0.start();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        java.lang.String str1 = net.landzero.xlog.utils.Hex.md5("FORM");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "03c37111e264eee423ada395dd6474aa" + "'", str1, "03c37111e264eee423ada395dd6474aa");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        xLogRedisAppender0.setTopic("sun.reflect.DelegatingMethodAccessorImpl");
        xLogRedisAppender0.setName("crid");
        xLogRedisAppender0.addHost("-");
        xLogRedisAppender0.addInfo("sun.reflect.DelegatingMethodAccessorImpl");
        java.lang.String str9 = xLogRedisAppender0.getEnv();
        boolean boolean10 = xLogRedisAppender0.isStarted();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.safeNormalize("BASIC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "BASIC" + "'", str1, "BASIC");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        xLogRedisAppender0.setTopic("sun.reflect.DelegatingMethodAccessorImpl");
        xLogRedisAppender0.addInfo("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n");
        java.lang.String str5 = xLogRedisAppender0.getProject();
        ch.qos.logback.core.status.StatusManager statusManager6 = xLogRedisAppender0.getStatusManager();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(statusManager6);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        net.landzero.xlog.logback.XLogFileAppender xLogFileAppender0 = new net.landzero.xlog.logback.XLogFileAppender();
        xLogFileAppender0.start();
        boolean boolean2 = xLogFileAppender0.isStarted();
        xLogFileAppender0.stop();
        int int4 = xLogFileAppender0.getRotate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test249() throws Throwable {
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
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Oct 30 18:23:49 CDT 2023");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        xLogRedisAppender0.setTopic("sun.reflect.DelegatingMethodAccessorImpl");
        xLogRedisAppender0.start();
        ch.qos.logback.core.Context context4 = null;
        xLogRedisAppender0.setContext(context4);
        java.lang.String str6 = xLogRedisAppender0.getProject();
        java.lang.Throwable throwable8 = null;
        xLogRedisAppender0.addInfo("x-mybatis-track", throwable8);
        java.lang.Throwable throwable11 = null;
        xLogRedisAppender0.addInfo("ff", throwable11);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.util.ArrayList<java.lang.String> strList1 = accessEvent0.getHeaderAppInfo();
        long long2 = accessEvent0.getDuration();
        accessEvent0.setPathDigest("0");
        java.lang.String str5 = accessEvent0.getHost();
        java.lang.String str6 = accessEvent0.topic();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "x-access" + "'", str6, "x-access");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        net.landzero.xlog.utils.SignalFileChecker signalFileChecker1 = new net.landzero.xlog.utils.SignalFileChecker("20231030");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("CRID[-]", "FORM");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent3 = xPerfEventBuilder2.build();
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        java.lang.String str7 = net.landzero.xlog.XLog.K(objArray6);
        net.landzero.xlog.XLogCommitter xLogCommitter8 = net.landzero.xlog.perf.XPerf.create("json", objArray6);
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder9 = xPerfEventBuilder2.setCommand("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n", objArray6);
        java.lang.String str10 = net.landzero.xlog.XLog.keyword(objArray6);
        org.junit.Assert.assertNotNull(xPerfEvent3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " K[]" + "'", str7, " K[]");
        org.junit.Assert.assertNotNull(xLogCommitter8);
        org.junit.Assert.assertNotNull(xPerfEventBuilder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " K[]" + "'", str10, " K[]");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.util.ArrayList<java.lang.String> strList1 = accessEvent0.getHeaderAppInfo();
        long long2 = accessEvent0.getDuration();
        accessEvent0.setPathDigest("0");
        net.landzero.xlog.XLog.appendEvent(accessEvent0);
        java.lang.String str6 = accessEvent0.getHost();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getHeaderUserToken();
        java.lang.String str2 = accessEvent0.topic();
        java.lang.String str3 = accessEvent0.getHost();
        java.util.ArrayList<java.lang.String> strList4 = accessEvent0.getHeaderAppInfo();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x-access" + "'", str2, "x-access");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        java.lang.String str1 = trackEvent0.topic();
        trackEvent0.setMethod("CRID[-]");
        trackEvent0.setRawSql("");
        trackEvent0.setSqlDigest("CLIENT_CERT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "x-mybatis-track" + "'", str1, "x-mybatis-track");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        xLogRedisAppender0.setTopic("sun.reflect.DelegatingMethodAccessorImpl");
        xLogRedisAppender0.setName("crid");
        xLogRedisAppender0.setName(" K[]");
        xLogRedisAppender0.start();
        xLogRedisAppender0.clearAllFilters();
        xLogRedisAppender0.clearAllFilters();
        xLogRedisAppender0.setProject("net.landzero.xlog.logback.XLogRedisAppender[crid]");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        xPerfEvent0.setClassName("");
        xPerfEvent0.setTopic("x-perf");
        xPerfEvent0.setMethodName("100.0");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        net.landzero.xlog.logback.XLogFileAppender xLogFileAppender0 = new net.landzero.xlog.logback.XLogFileAppender();
        ch.qos.logback.core.Context context1 = xLogFileAppender0.getContext();
        java.lang.String str2 = xLogFileAppender0.getDir();
        org.junit.Assert.assertNull(context1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder0 = new net.landzero.xlog.mybatis.TrackEventBuilder();
        trackEventBuilder0.commit();
        net.landzero.xlog.mybatis.TrackEvent trackEvent2 = trackEventBuilder0.build();
        trackEvent2.setError("DIGEST");
        trackEvent2.setMethod("0");
        org.junit.Assert.assertNotNull(trackEvent2);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.String str2 = net.landzero.xlog.XLog.K(objArray1);
        java.lang.String str3 = net.landzero.xlog.XLog.K(objArray1);
        java.lang.String str4 = net.landzero.xlog.XLog.keyword(objArray1);
        java.lang.String str5 = net.landzero.xlog.XLog.keyword(objArray1);
        java.lang.String str6 = net.landzero.xlog.XLog.keyword(objArray1);
        net.landzero.xlog.XLogCommitter xLogCommitter7 = net.landzero.xlog.perf.XPerf.create("100.0", objArray1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " K[]" + "'", str2, " K[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " K[]" + "'", str3, " K[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " K[]" + "'", str4, " K[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " K[]" + "'", str5, " K[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " K[]" + "'", str6, " K[]");
        org.junit.Assert.assertNotNull(xLogCommitter7);
    }

    @Test
    public void test262() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getHeaderUserToken();
        java.lang.String str2 = accessEvent0.topic();
        net.landzero.xlog.http.AccessEvent accessEvent3 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str4 = accessEvent3.getHeaderUserToken();
        java.lang.String[] strArray14 = new java.lang.String[] { "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n", "crid", "0", "crid", "FORM", "DIGEST", "FORM", "", "-1" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        accessEvent3.setParams(strList15);
        java.lang.String str18 = net.landzero.xlog.utils.Strings.normalizeKeyword((java.lang.Object) strList15);
        accessEvent0.setParams(strList15);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x-access" + "'", str2, "x-access");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_%d{yyyy/MM/dd_HH:mm:ss.SSS}_%msg%n_crid_0_crid_FORM_DIGEST_FORM_-1_" + "'", str18, "_%d{yyyy/MM/dd_HH:mm:ss.SSS}_%msg%n_crid_0_crid_FORM_DIGEST_FORM_-1_");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        xLogRedisAppender0.setTopic("sun.reflect.DelegatingMethodAccessorImpl");
        xLogRedisAppender0.addInfo("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n");
        java.lang.String str5 = xLogRedisAppender0.getProject();
        xLogRedisAppender0.setName("100");
        ch.qos.logback.core.filter.Filter<ch.qos.logback.classic.spi.ILoggingEvent> iLoggingEventFilter8 = null;
        xLogRedisAppender0.addFilter(iLoggingEventFilter8);
        ch.qos.logback.core.Context context10 = null;
        xLogRedisAppender0.setContext(context10);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setMethod("true");
        java.lang.String str3 = trackEvent0.getMethod();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true" + "'", str3, "true");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("cridMark", "BASIC");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent3 = xPerfEventBuilder2.build();
        java.lang.String str4 = xPerfEvent3.getAction();
        org.junit.Assert.assertNotNull(xPerfEvent3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getHeaderUserToken();
        accessEvent0.setMethod("FORM");
        java.lang.String str4 = accessEvent0.topic();
        java.lang.String[] strArray45 = new java.lang.String[] { "_json_", "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %X{cridMark} [%thread] %-5level %logger{35} - %msg%n", "0", "0000000000000064", "FORM", "x-mybatis-track", "_json_", "invoke", "100", "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %X{cridMark} [%thread] %-5level %logger{35} - %msg%n", "0", "100", "BASIC", "336d5ebc5436534e61d16e63ddfca327", "xlog.Event", "null", "null", "0000000000000064", "_%d{yyyy/MM/dd_HH:mm:ss.SSS}_%msg%n_crid_0_crid_FORM_DIGEST_FORM_-1_", "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %X{cridMark} [%thread] %-5level %logger{35} - %msg%n", "ff", "20231030", "2b91ee34d8daadf5", "_%d{yyyy/MM/dd_HH:mm:ss.SSS}_%msg%n_crid_0_crid_FORM_DIGEST_FORM_-1_", "0000000000000064", "invoke", "hi!", "100", "K[]", "", "plain", "_json_", "DIGEST", "FORM", "-", "DIGEST", "03c37111e264eee423ada395dd6474aa", "plain", "x-mybatis-track", "1" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        accessEvent0.setHeaderAppInfo(strList46);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "x-access" + "'", str4, "x-access");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        accessEvent0.setHeaderUserToken("336d5ebc5436534e61d16e63ddfca327");
        java.lang.String str3 = accessEvent0.getMethod();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getHeaderUserToken();
        accessEvent0.setMethod("FORM");
        long long4 = accessEvent0.getDuration();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "BASIC", "x-access", "x-access", "0", "DIGEST", "true", "crid", "plain", "sun.reflect.DelegatingMethodAccessorImpl", "1", "1", "2b91ee34d8daadf5", "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %X{cridMark} [%thread] %-5level %logger{35} - %msg%n", "-1", "true", "-1", "json" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        accessEvent0.setParams(strList24);
        accessEvent0.setDuration((long) 'a');
        accessEvent0.setHost("100");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder0 = new net.landzero.xlog.mybatis.TrackEventBuilder();
        trackEventBuilder0.commit();
        net.landzero.xlog.mybatis.TrackEvent trackEvent2 = trackEventBuilder0.build();
        trackEvent2.setError("DIGEST");
        long long5 = trackEvent2.getDuration();
        trackEvent2.setProject("");
        java.lang.String str8 = trackEvent2.getTopic();
        org.junit.Assert.assertNotNull(trackEvent2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "x-mybatis-track" + "'", str8, "x-mybatis-track");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        boolean boolean1 = net.landzero.xlog.utils.Strings.isEmpty("true");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        net.landzero.xlog.utils.IntervalChecker intervalChecker1 = new net.landzero.xlog.utils.IntervalChecker((long) '#');
        long long2 = intervalChecker1.getChecked();
        long long3 = intervalChecker1.getChecked();
        intervalChecker1.setChecked((long) '#');
        boolean boolean6 = intervalChecker1.check();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("CRID[-]", "FORM");
        xPerfEventBuilder2.commit();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent4 = xPerfEventBuilder2.build();
        xPerfEventBuilder2.commit();
        org.junit.Assert.assertNotNull(xPerfEvent4);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        xLogRedisAppender0.setTopic("sun.reflect.DelegatingMethodAccessorImpl");
        xLogRedisAppender0.setName("crid");
        ch.qos.logback.core.filter.Filter<ch.qos.logback.classic.spi.ILoggingEvent> iLoggingEventFilter5 = null;
        xLogRedisAppender0.addFilter(iLoggingEventFilter5);
        java.lang.String str7 = xLogRedisAppender0.getTopic();
        java.lang.Throwable throwable9 = null;
        xLogRedisAppender0.addInfo("cridMark", throwable9);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "sun.reflect.DelegatingMethodAccessorImpl" + "'", str7, "sun.reflect.DelegatingMethodAccessorImpl");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        java.lang.Throwable throwable2 = null;
        xLogRedisAppender0.addWarn("", throwable2);
        ch.qos.logback.core.status.Status status4 = null;
        xLogRedisAppender0.addStatus(status4);
        xLogRedisAppender0.clearAllFilters();
        ch.qos.logback.core.status.Status status7 = null;
        xLogRedisAppender0.addStatus(status7);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        net.landzero.xlog.utils.IntervalChecker intervalChecker1 = new net.landzero.xlog.utils.IntervalChecker((long) '#');
        long long2 = intervalChecker1.getChecked();
        long long3 = intervalChecker1.getChecked();
        intervalChecker1.setChecked(0L);
        long long6 = intervalChecker1.getInterval();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getHeaderUserToken();
        java.lang.String str2 = accessEvent0.topic();
        java.util.ArrayList<java.lang.String> strList3 = accessEvent0.getHeaderVerInfo();
        java.util.Date date4 = accessEvent0.getTimestamp();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x-access" + "'", str2, "x-access");
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPathDigest();
        java.lang.String str2 = xPerfEvent0.getPath();
        java.lang.String str3 = xPerfEvent0.getClassName();
        java.lang.String str4 = xPerfEvent0.topic();
        java.lang.String str5 = xPerfEvent0.getClassName();
        java.lang.String str6 = xPerfEvent0.getPathDigest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "x-perf" + "'", str4, "x-perf");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder0 = new net.landzero.xlog.mybatis.TrackEventBuilder();
        trackEventBuilder0.commit();
        net.landzero.xlog.mybatis.TrackEvent trackEvent2 = trackEventBuilder0.build();
        trackEvent2.setError("DIGEST");
        trackEvent2.setDatabaseUrl("");
        net.landzero.xlog.XLog.appendEvent(trackEvent2);
        org.junit.Assert.assertNotNull(trackEvent2);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("CRID[-]", "FORM");
        xPerfEventBuilder2.commit();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent4 = xPerfEventBuilder2.build();
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        java.lang.String str7 = net.landzero.xlog.XLog.K(objArray6);
        java.lang.String str8 = net.landzero.xlog.XLog.K(objArray6);
        java.lang.String str9 = net.landzero.xlog.XLog.keyword(objArray6);
        java.lang.String str10 = net.landzero.xlog.XLog.keyword(objArray6);
        java.lang.String str11 = net.landzero.xlog.XLog.keyword(objArray6);
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder12 = xPerfEventBuilder2.setCommand("plain", objArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        java.lang.String str15 = net.landzero.xlog.XLog.K(objArray14);
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder16 = xPerfEventBuilder12.setCommand("plain", objArray14);
        org.junit.Assert.assertNotNull(xPerfEvent4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " K[]" + "'", str7, " K[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " K[]" + "'", str8, " K[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " K[]" + "'", str9, " K[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " K[]" + "'", str10, " K[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " K[]" + "'", str11, " K[]");
        org.junit.Assert.assertNotNull(xPerfEventBuilder12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " K[]" + "'", str15, " K[]");
        org.junit.Assert.assertNotNull(xPerfEventBuilder16);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        net.landzero.xlog.logback.XLogFileAppender xLogFileAppender0 = new net.landzero.xlog.logback.XLogFileAppender();
        xLogFileAppender0.setDir("CLIENT_CERT");
        int int3 = xLogFileAppender0.getRotate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getHeaderUserToken();
        accessEvent0.setMethod("FORM");
        java.util.ArrayList<java.lang.String> strList4 = accessEvent0.getParams();
        accessEvent0.setMethod("ff");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        java.lang.Throwable throwable2 = null;
        xLogRedisAppender0.addWarn("", throwable2);
        ch.qos.logback.core.status.Status status4 = null;
        xLogRedisAppender0.addStatus(status4);
        java.lang.Throwable throwable7 = null;
        xLogRedisAppender0.addWarn(" K[]", throwable7);
        java.lang.String str9 = net.landzero.xlog.utils.Strings.safeNormalize((java.lang.Object) xLogRedisAppender0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "net.landzero.xlog.logback.XLogRedisAppender[null]" + "'", str9, "net.landzero.xlog.logback.XLogRedisAppender[null]");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        xLogRedisAppender0.setTopic("sun.reflect.DelegatingMethodAccessorImpl");
        xLogRedisAppender0.addInfo("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n");
        ch.qos.logback.core.status.Status status5 = null;
        xLogRedisAppender0.addStatus(status5);
        ch.qos.logback.core.Context context7 = null;
        xLogRedisAppender0.setContext(context7);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        net.landzero.xlog.http.AccessEventBuilder accessEventBuilder0 = new net.landzero.xlog.http.AccessEventBuilder();
        net.landzero.xlog.http.AccessEvent accessEvent1 = accessEventBuilder0.build();
        accessEvent1.setPathDigest("plain");
        java.lang.String str4 = accessEvent1.getQuery();
        org.junit.Assert.assertNotNull(accessEvent1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder0 = new net.landzero.xlog.mybatis.TrackEventBuilder();
        trackEventBuilder0.commit();
        trackEventBuilder0.commit();
        trackEventBuilder0.commit();
        trackEventBuilder0.commit();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        ch.qos.logback.core.filter.Filter<ch.qos.logback.classic.spi.ILoggingEvent> iLoggingEventFilter1 = null;
        xLogRedisAppender0.addFilter(iLoggingEventFilter1);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        java.lang.String str0 = net.landzero.xlog.logback.XLogRedisAppender.LIST_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xlog" + "'", str0, "xlog");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        net.landzero.xlog.logback.XLogFileAppender xLogFileAppender0 = new net.landzero.xlog.logback.XLogFileAppender();
        xLogFileAppender0.setDir("x-perf");
        xLogFileAppender0.setEnv("true");
        xLogFileAppender0.setTopic("CLIENT_CERT");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("CRID[-]", "FORM");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent3 = xPerfEventBuilder2.build();
        xPerfEvent3.setAction("net.landzero.xlog.logback.XLogRedisAppender[crid]");
        xPerfEvent3.setMethodName("plain");
        org.junit.Assert.assertNotNull(xPerfEvent3);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPathDigest();
        xPerfEvent0.setPathDigest("DIGEST");
        java.util.List<java.lang.String> strList4 = xPerfEvent0.getArguments();
        xPerfEvent0.setAction("_json_");
        xPerfEvent0.setDuration((long) (byte) 0);
        java.lang.String str9 = xPerfEvent0.getCrid();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getHeaderUserToken();
        accessEvent0.setHost("1");
        accessEvent0.setProject("DIGEST");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getTopic();
        xPerfEvent0.setClassName("20231030");
        java.util.Date date4 = xPerfEvent0.getTimestamp();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "x-perf" + "'", str1, "x-perf");
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        net.landzero.xlog.utils.IntervalChecker intervalChecker1 = new net.landzero.xlog.utils.IntervalChecker((long) 'a');
    }
}
