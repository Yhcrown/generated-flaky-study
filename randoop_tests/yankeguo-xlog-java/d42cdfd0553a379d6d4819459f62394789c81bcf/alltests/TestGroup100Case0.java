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
        java.lang.String str0 = net.landzero.xlog.utils.Dates.yesterday_yyyyMMdd();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "20231026" + "'", str0, "20231026");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.util.Map<java.lang.String, java.lang.String[]> strMap0 = null;
        java.util.ArrayList<java.lang.String> strList1 = net.landzero.xlog.utils.Flatten.flattenParameters(strMap0);
        org.junit.Assert.assertNull(strList1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.lang.String str0 = net.landzero.xlog.logback.XLogRedisAppender.LIST_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xlog" + "'", str0, "xlog");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.lang.String str0 = net.landzero.xlog.XLog.EMPTY_CRID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "-" + "'", str0, "-");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.lang.String str0 = net.landzero.xlog.logback.XLogBaseAppender.PLAIN_LAYOUT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %X{cridMark} [%thread] %-5level %logger{35} - %msg%n" + "'", str0, "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %X{cridMark} [%thread] %-5level %logger{35} - %msg%n");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        boolean boolean1 = net.landzero.xlog.utils.Strings.isEmpty("-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        net.landzero.xlog.utils.Hex hex0 = new net.landzero.xlog.utils.Hex();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.lang.String str0 = net.landzero.xlog.constants.Constants.MDC_CRID_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "crid" + "'", str0, "crid");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.safeNormalize("-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-" + "'", str1, "-");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        net.landzero.xlog.utils.Flatten flatten0 = new net.landzero.xlog.utils.Flatten();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.Object obj0 = null;
        java.lang.String str1 = net.landzero.xlog.utils.Strings.normalizeKeyword(obj0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null" + "'", str1, "null");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        ch.qos.logback.core.util.FileSize fileSize0 = net.landzero.xlog.logback.XLogFileAppender.BUFFER_SIZE;
        org.junit.Assert.assertNotNull(fileSize0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        net.landzero.xlog.utils.Strings strings0 = new net.landzero.xlog.utils.Strings();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.lang.String str0 = javax.servlet.http.HttpServletRequest.BASIC_AUTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "BASIC" + "'", str0, "BASIC");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        java.lang.String str0 = net.landzero.xlog.XLog.cridMark();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "CRID[-]" + "'", str0, "CRID[-]");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.lang.String str0 = net.landzero.xlog.logback.XLogBaseAppender.JSON_LAYOUT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n" + "'", str0, "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = net.landzero.xlog.utils.Requests.readBody(httpServletRequest0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.servlet.http.HttpServletRequest.getInputStream()\" because \"httpServletRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        net.landzero.xlog.XLog.clearCrid();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.normalizeKeyword("CRID[-]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CRID_-_" + "'", str1, "CRID_-_");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        int int0 = net.landzero.xlog.logback.XLogFileAppender.ROTATION_CHECK_INTERVAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 300000 + "'", int0 == 300000);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.lang.String str0 = net.landzero.xlog.XLog.crid();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "-" + "'", str0, "-");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        java.lang.String str0 = net.landzero.xlog.XLog.path();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        java.lang.String str0 = net.landzero.xlog.utils.Hex.randomHex16();
// flaky:         org.junit.Assert.assertEquals("'" + str0 + "' != '" + "e8b502965b188446" + "'", str0, "e8b502965b188446");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        net.landzero.xlog.utils.Requests requests0 = new net.landzero.xlog.utils.Requests();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        net.landzero.xlog.utils.Reflections reflections0 = new net.landzero.xlog.utils.Reflections();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.Context context2 = xLogRedisAppender0.getContext();
        xLogRedisAppender0.start();
        xLogRedisAppender0.addError("null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(context2);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        boolean boolean1 = net.landzero.xlog.utils.Strings.isEmpty("BASIC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        java.lang.String str0 = net.landzero.xlog.constants.Constants.HTTP_CRID_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "X-Correlation-ID" + "'", str0, "X-Correlation-ID");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        java.lang.String str1 = net.landzero.xlog.utils.Hex.md5("CRID[-]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "71c609df539c50766146d8d2ed1f5715" + "'", str1, "71c609df539c50766146d8d2ed1f5715");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.safeNormalize((java.lang.Object) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        net.landzero.xlog.perf.XPerf xPerf0 = new net.landzero.xlog.perf.XPerf();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        java.lang.Object[] objArray0 = null;
        java.lang.String str1 = net.landzero.xlog.XLog.K(objArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
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
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        net.landzero.xlog.utils.SignalFileChecker signalFileChecker1 = new net.landzero.xlog.utils.SignalFileChecker("20231026");
        long long2 = signalFileChecker1.getCachedLastModified();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.util.ArrayList<java.lang.String> strList1 = net.landzero.xlog.utils.Flatten.flattenJSON("crid");
        org.junit.Assert.assertNull(strList1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.Context context2 = xLogRedisAppender0.getContext();
        xLogRedisAppender0.start();
        ch.qos.logback.core.filter.Filter<ch.qos.logback.classic.spi.ILoggingEvent> iLoggingEventFilter4 = null;
        xLogRedisAppender0.addFilter(iLoggingEventFilter4);
        java.lang.String str6 = net.landzero.xlog.utils.Strings.normalize((java.lang.Object) iLoggingEventFilter4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(context2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.lang.String str0 = net.landzero.xlog.logback.XLogBaseAppender.MODE_PLAIN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "plain" + "'", str0, "plain");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        xLogRedisAppender0.addWarn("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        net.landzero.xlog.dubbo.XLogConsumerFilter xLogConsumerFilter0 = new net.landzero.xlog.dubbo.XLogConsumerFilter();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.Status status2 = null;
        xLogRedisAppender0.addStatus(status2);
        java.lang.Throwable throwable5 = null;
        xLogRedisAppender0.addInfo("", throwable5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.safeNormalize((java.lang.Object) "plain");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "plain" + "'", str1, "plain");
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
        java.lang.String str0 = javax.servlet.http.HttpServletRequest.CLIENT_CERT_AUTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "CLIENT_CERT" + "'", str0, "CLIENT_CERT");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        java.util.ArrayList<java.lang.String> strList1 = net.landzero.xlog.utils.Flatten.flattenJSON("BASIC");
        org.junit.Assert.assertNull(strList1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        java.lang.String str0 = net.landzero.xlog.logback.XLogBaseAppender.TOPIC_JSON;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "_json_" + "'", str0, "_json_");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        java.lang.Throwable throwable2 = null;
        xLogRedisAppender0.addWarn("X-Correlation-ID", throwable2);
        ch.qos.logback.classic.spi.ILoggingEvent iLoggingEvent4 = null;
        xLogRedisAppender0.doAppend(iLoggingEvent4);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        java.lang.String str0 = javax.servlet.http.HttpServletRequest.FORM_AUTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "FORM" + "'", str0, "FORM");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getClassName();
        java.lang.String str2 = xPerfEvent0.getPathDigest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        java.lang.String str1 = net.landzero.xlog.utils.Hex.toHex((byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ff" + "'", str1, "ff");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        java.lang.String str0 = net.landzero.xlog.constants.Constants.MDC_CRID_MARK_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "cridMark" + "'", str0, "cridMark");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        java.lang.String str1 = trackEvent0.getSql();
        java.lang.Class<?> wildcardClass2 = trackEvent0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getCrid();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        net.landzero.xlog.XLog.clearPath();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.Status status2 = null;
        xLogRedisAppender0.addStatus(status2);
        java.lang.String str4 = xLogRedisAppender0.getProject();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        net.landzero.xlog.mybatis.XLogInterceptor xLogInterceptor0 = new net.landzero.xlog.mybatis.XLogInterceptor();
        org.apache.ibatis.plugin.Invocation invocation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = xLogInterceptor0.intercept(invocation1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.ibatis.plugin.Invocation.getMethod()\" because \"invocation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getClassName();
        xPerfEvent0.setAction("-");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.normalizeKeyword("xlog");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xlog" + "'", str1, "xlog");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        java.lang.String str0 = net.landzero.xlog.constants.Constants.DUBBO_CRID_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "crid" + "'", str0, "crid");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = net.landzero.xlog.utils.Requests.hasJsonBody(httpServletRequest0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.servlet.http.HttpServletRequest.getMethod()\" because \"httpServletRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.normalize("BASIC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "BASIC" + "'", str1, "BASIC");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        boolean boolean1 = net.landzero.xlog.utils.Strings.isEmpty("x-mybatis-track");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        java.lang.String str0 = net.landzero.xlog.http.XLogFilter.CRID_HEADER_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "X-Correlation-ID" + "'", str0, "X-Correlation-ID");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.Status status2 = null;
        xLogRedisAppender0.addStatus(status2);
        boolean boolean4 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.StatusManager statusManager5 = xLogRedisAppender0.getStatusManager();
        xLogRedisAppender0.addInfo("-");
        xLogRedisAppender0.setProject("FORM");
        xLogRedisAppender0.addHost("BASIC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(statusManager5);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.normalizeKeyword("CLIENT_CERT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLIENT_CERT" + "'", str1, "CLIENT_CERT");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setDuration(1L);
        trackEvent0.setSql("plain");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.Status status2 = null;
        xLogRedisAppender0.addStatus(status2);
        xLogRedisAppender0.addWarn("null");
        xLogRedisAppender0.addError("net.landzero.xlog.logback.XLogRedisAppender[null]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        net.landzero.xlog.utils.SignalFileChecker signalFileChecker1 = new net.landzero.xlog.utils.SignalFileChecker(" K[10,-1.0,10,-1,-1.0]");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.classic.spi.ILoggingEvent iLoggingEvent2 = null;
        ch.qos.logback.core.spi.FilterReply filterReply3 = xLogRedisAppender0.getFilterChainDecision(iLoggingEvent2);
        java.lang.String str4 = xLogRedisAppender0.toString();
        xLogRedisAppender0.setEnv("71c609df539c50766146d8d2ed1f5715");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + filterReply3 + "' != '" + ch.qos.logback.core.spi.FilterReply.NEUTRAL + "'", filterReply3.equals(ch.qos.logback.core.spi.FilterReply.NEUTRAL));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "net.landzero.xlog.logback.XLogRedisAppender[null]" + "'", str4, "net.landzero.xlog.logback.XLogRedisAppender[null]");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        java.lang.String str1 = trackEvent0.getSql();
        trackEvent0.setError("CRID_-_");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder0 = new net.landzero.xlog.mybatis.TrackEventBuilder();
        net.landzero.xlog.mybatis.TrackEvent trackEvent1 = trackEventBuilder0.build();
        org.junit.Assert.assertNotNull(trackEvent1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        java.lang.String str1 = trackEvent0.getMethod();
        trackEvent0.setError("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.Status status2 = null;
        xLogRedisAppender0.addStatus(status2);
        boolean boolean4 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.Status status5 = null;
        xLogRedisAppender0.addStatus(status5);
        ch.qos.logback.core.status.Status status7 = null;
        xLogRedisAppender0.addStatus(status7);
        java.util.List<ch.qos.logback.core.filter.Filter<ch.qos.logback.classic.spi.ILoggingEvent>> iLoggingEventFilterList9 = xLogRedisAppender0.getCopyOfAttachedFiltersList();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iLoggingEventFilterList9);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setRawSql("null");
        long long3 = trackEvent0.getDuration();
        trackEvent0.setTopic("BASIC");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        xLogRedisAppender0.addError("-");
        java.lang.String str4 = xLogRedisAppender0.getMode();
        ch.qos.logback.core.Context context5 = null;
        xLogRedisAppender0.setContext(context5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "plain" + "'", str4, "plain");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.Status status2 = null;
        xLogRedisAppender0.addStatus(status2);
        boolean boolean4 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.StatusManager statusManager5 = xLogRedisAppender0.getStatusManager();
        xLogRedisAppender0.addInfo("-");
        xLogRedisAppender0.setProject("FORM");
        java.lang.String str10 = net.landzero.xlog.utils.Strings.safeNormalize((java.lang.Object) xLogRedisAppender0);
        xLogRedisAppender0.clearAllFilters();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(statusManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.landzero.xlog.logback.XLogRedisAppender[null]" + "'", str10, "net.landzero.xlog.logback.XLogRedisAppender[null]");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        java.lang.String str0 = net.landzero.xlog.logback.XLogFileAppender.SIGNAL_FILE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/tmp/xlog.reopen.txt" + "'", str0, "/tmp/xlog.reopen.txt");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        net.landzero.xlog.utils.CallerInfo callerInfo0 = net.landzero.xlog.utils.Reflections.getCallerInfo();
        callerInfo0.setClassName("BASIC");
        org.junit.Assert.assertNotNull(callerInfo0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        xLogRedisAppender0.addError("-");
        xLogRedisAppender0.setProject("/tmp/xlog.reopen.txt");
        xLogRedisAppender0.addHost("-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setDuration(1L);
        trackEvent0.setError("FORM");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        java.lang.String str0 = javax.servlet.http.HttpServletRequest.DIGEST_AUTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "DIGEST" + "'", str0, "DIGEST");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.classic.spi.ILoggingEvent iLoggingEvent2 = null;
        ch.qos.logback.core.spi.FilterReply filterReply3 = xLogRedisAppender0.getFilterChainDecision(iLoggingEvent2);
        java.lang.String str4 = xLogRedisAppender0.toString();
        java.lang.String str5 = xLogRedisAppender0.getEnv();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + filterReply3 + "' != '" + ch.qos.logback.core.spi.FilterReply.NEUTRAL + "'", filterReply3.equals(ch.qos.logback.core.spi.FilterReply.NEUTRAL));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "net.landzero.xlog.logback.XLogRedisAppender[null]" + "'", str4, "net.landzero.xlog.logback.XLogRedisAppender[null]");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("20231026", "-");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent3 = xPerfEventBuilder2.build();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent4 = xPerfEventBuilder2.build();
        java.lang.String str5 = xPerfEvent4.topic();
        org.junit.Assert.assertNotNull(xPerfEvent3);
        org.junit.Assert.assertNotNull(xPerfEvent4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "x-perf" + "'", str5, "x-perf");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        net.landzero.xlog.mybatis.XLogInterceptor xLogInterceptor0 = new net.landzero.xlog.mybatis.XLogInterceptor();
        java.lang.Object obj2 = xLogInterceptor0.plugin((java.lang.Object) (short) 100);
        org.apache.ibatis.plugin.Invocation invocation3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = xLogInterceptor0.intercept(invocation3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.ibatis.plugin.Invocation.getMethod()\" because \"invocation\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (short) 100 + "'", obj2, (short) 100);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        net.landzero.xlog.http.AccessEventBuilder accessEventBuilder0 = new net.landzero.xlog.http.AccessEventBuilder();
        javax.servlet.ServletResponse servletResponse1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.landzero.xlog.http.AccessEventBuilder accessEventBuilder2 = accessEventBuilder0.setServletResponse(servletResponse1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.toString()\" because \"response\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        net.landzero.xlog.utils.IntervalChecker intervalChecker1 = new net.landzero.xlog.utils.IntervalChecker((long) '#');
        boolean boolean2 = intervalChecker1.check();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        net.landzero.xlog.utils.CallerInfo callerInfo0 = net.landzero.xlog.utils.Reflections.getCallerInfo();
        java.lang.String str1 = net.landzero.xlog.utils.Strings.safeNormalize((java.lang.Object) callerInfo0);
        callerInfo0.setClassName("FORM");
        org.junit.Assert.assertNotNull(callerInfo0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.lang.String str1 = net.landzero.xlog.utils.Hex.toHex((byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "01" + "'", str1, "01");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        net.landzero.xlog.utils.CallerInfo callerInfo0 = net.landzero.xlog.utils.Reflections.getCallerInfo();
        callerInfo0.setMethodName("X-Correlation-ID");
        org.junit.Assert.assertNotNull(callerInfo0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.util.List<java.lang.String> strList1 = xPerfEvent0.getArguments();
        java.lang.String str2 = xPerfEvent0.getAction();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        java.lang.String str1 = net.landzero.xlog.utils.Hex.md5("01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "96a3be3cf272e017046d1b2674a52bd3" + "'", str1, "96a3be3cf272e017046d1b2674a52bd3");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        net.landzero.xlog.XLog.setPath("x-access");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        net.landzero.xlog.utils.SignalFileChecker signalFileChecker1 = new net.landzero.xlog.utils.SignalFileChecker("CRID_-_");
        boolean boolean2 = signalFileChecker1.check();
        signalFileChecker1.setCachedLastModified((long) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        java.lang.String str0 = net.landzero.xlog.XLog.LOGGER_NAME_STRUCTURED_EVENT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xlog.Event" + "'", str0, "xlog.Event");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("20231026", "-");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent3 = xPerfEventBuilder2.build();
        xPerfEventBuilder2.commit();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent5 = xPerfEventBuilder2.build();
        org.junit.Assert.assertNotNull(xPerfEvent3);
        org.junit.Assert.assertNotNull(xPerfEvent5);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPathDigest();
        java.lang.String str2 = xPerfEvent0.getCrid();
        java.lang.String[] strArray18 = new java.lang.String[] { "X-Correlation-ID", "_json_", "FORM", " K[true,-1,hi!,hi!]", "", "CLIENT_CERT", " K[10,-1.0,10,-1,-1.0]", "net.landzero.xlog.logback.XLogRedisAppender[null]", "X-Correlation-ID", "CRID_-_", "ff", "", "CRID[-]", "X-Correlation-ID", "71c609df539c50766146d8d2ed1f5715" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        xPerfEvent0.setArguments((java.util.List<java.lang.String>) strList19);
        xPerfEvent0.setMethodName("net.landzero.xlog.logback.XLogRedisAppender[null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = net.landzero.xlog.utils.Requests.hasBody(httpServletRequest0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.servlet.http.HttpServletRequest.getMethod()\" because \"httpServletRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.Context context2 = xLogRedisAppender0.getContext();
        xLogRedisAppender0.start();
        ch.qos.logback.core.filter.Filter<ch.qos.logback.classic.spi.ILoggingEvent> iLoggingEventFilter4 = null;
        xLogRedisAppender0.addFilter(iLoggingEventFilter4);
        java.lang.String str6 = xLogRedisAppender0.getMode();
        ch.qos.logback.core.status.Status status7 = null;
        xLogRedisAppender0.addStatus(status7);
        java.lang.String str9 = xLogRedisAppender0.getProject();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(context2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "plain" + "'", str6, "plain");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 10, (-1.0d), 10, (-1L), (-1.0d) };
        java.lang.String str8 = net.landzero.xlog.XLog.keyword(objArray7);
        net.landzero.xlog.XLogCommitter xLogCommitter9 = net.landzero.xlog.perf.XPerf.create("BASIC", objArray7);
        net.landzero.xlog.XLogCommitter xLogCommitter10 = net.landzero.xlog.perf.XPerf.create("", objArray7);
        java.lang.String str11 = net.landzero.xlog.XLog.K(objArray7);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, -1.0, 10, -1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, -1.0, 10, -1, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " K[10,-1.0,10,-1,-1.0]" + "'", str8, " K[10,-1.0,10,-1,-1.0]");
        org.junit.Assert.assertNotNull(xLogCommitter9);
        org.junit.Assert.assertNotNull(xLogCommitter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " K[10,-1.0,10,-1,-1.0]" + "'", str11, " K[10,-1.0,10,-1,-1.0]");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        xLogRedisAppender0.addError("-");
        java.lang.String str4 = xLogRedisAppender0.getMode();
        ch.qos.logback.classic.spi.ILoggingEvent iLoggingEvent5 = null;
        ch.qos.logback.core.spi.FilterReply filterReply6 = xLogRedisAppender0.getFilterChainDecision(iLoggingEvent5);
        java.lang.String str7 = xLogRedisAppender0.getMode();
        xLogRedisAppender0.addError("CLIENT_CERT");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "plain" + "'", str4, "plain");
        org.junit.Assert.assertTrue("'" + filterReply6 + "' != '" + ch.qos.logback.core.spi.FilterReply.NEUTRAL + "'", filterReply6.equals(ch.qos.logback.core.spi.FilterReply.NEUTRAL));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "plain" + "'", str7, "plain");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("20231026", "-");
        xPerfEventBuilder2.commit();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent4 = xPerfEventBuilder2.build();
        xPerfEventBuilder2.commit();
        org.junit.Assert.assertNotNull(xPerfEvent4);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        xLogRedisAppender0.addError("-");
        xLogRedisAppender0.setProject("/tmp/xlog.reopen.txt");
        java.lang.String str6 = xLogRedisAppender0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "net.landzero.xlog.logback.XLogRedisAppender[null]" + "'", str6, "net.landzero.xlog.logback.XLogRedisAppender[null]");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setRawSql("null");
        long long3 = trackEvent0.getDuration();
        trackEvent0.setDatabaseUrl("BASIC");
        java.lang.String str6 = trackEvent0.getError();
        trackEvent0.setError("net.landzero.xlog.logback.XLogRedisAppender[null]");
        java.lang.String str9 = trackEvent0.topic();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "x-mybatis-track" + "'", str9, "x-mybatis-track");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.Status status2 = null;
        xLogRedisAppender0.addStatus(status2);
        boolean boolean4 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.StatusManager statusManager5 = xLogRedisAppender0.getStatusManager();
        xLogRedisAppender0.addInfo("-");
        xLogRedisAppender0.setProject("FORM");
        java.lang.String str10 = net.landzero.xlog.utils.Strings.safeNormalize((java.lang.Object) xLogRedisAppender0);
        xLogRedisAppender0.start();
        xLogRedisAppender0.addError("null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(statusManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.landzero.xlog.logback.XLogRedisAppender[null]" + "'", str10, "net.landzero.xlog.logback.XLogRedisAppender[null]");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        net.landzero.xlog.http.AccessEventBuilder accessEventBuilder0 = new net.landzero.xlog.http.AccessEventBuilder();
        net.landzero.xlog.http.AccessEvent accessEvent1 = accessEventBuilder0.build();
        net.landzero.xlog.http.AccessEvent accessEvent2 = accessEventBuilder0.build();
        javax.servlet.ServletRequest servletRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.landzero.xlog.http.AccessEventBuilder accessEventBuilder4 = accessEventBuilder0.setServletRequest(servletRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.toString()\" because \"request\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(accessEvent1);
        org.junit.Assert.assertNotNull(accessEvent2);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        boolean boolean1 = net.landzero.xlog.utils.Strings.isEmpty("crid");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        java.util.ArrayList<java.lang.String> strList2 = xLogRedisAppender0.getHosts();
        boolean boolean3 = xLogRedisAppender0.isJsonMode();
        xLogRedisAppender0.setProject("crid");
        ch.qos.logback.core.status.StatusManager statusManager6 = xLogRedisAppender0.getStatusManager();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(statusManager6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        java.lang.Object[] objArray0 = null;
        java.lang.String str1 = net.landzero.xlog.XLog.keyword(objArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 10, (-1.0d), 10, (-1L), (-1.0d) };
        java.lang.String str7 = net.landzero.xlog.XLog.keyword(objArray6);
        net.landzero.xlog.XLogCommitter xLogCommitter8 = net.landzero.xlog.perf.XPerf.create("BASIC", objArray6);
        java.lang.String str9 = net.landzero.xlog.XLog.keyword(objArray6);
        java.lang.String str10 = net.landzero.xlog.XLog.K(objArray6);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1.0, 10, -1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1.0, 10, -1, -1.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " K[10,-1.0,10,-1,-1.0]" + "'", str7, " K[10,-1.0,10,-1,-1.0]");
        org.junit.Assert.assertNotNull(xLogCommitter8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " K[10,-1.0,10,-1,-1.0]" + "'", str9, " K[10,-1.0,10,-1,-1.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " K[10,-1.0,10,-1,-1.0]" + "'", str10, " K[10,-1.0,10,-1,-1.0]");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setDuration(1L);
        java.lang.String str3 = trackEvent0.topic();
        trackEvent0.setSql("net.landzero.xlog.logback.XLogRedisAppender[null]");
        java.lang.String str6 = net.landzero.xlog.utils.Strings.safeNormalize((java.lang.Object) "net.landzero.xlog.logback.XLogRedisAppender[null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "x-mybatis-track" + "'", str3, "x-mybatis-track");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "net.landzero.xlog.logback.XLogRedisAppender[null]" + "'", str6, "net.landzero.xlog.logback.XLogRedisAppender[null]");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.Status status2 = null;
        xLogRedisAppender0.addStatus(status2);
        ch.qos.logback.core.status.Status status4 = null;
        xLogRedisAppender0.addStatus(status4);
        java.lang.String str6 = xLogRedisAppender0.getTopic();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        net.landzero.xlog.http.AccessEventBuilder accessEventBuilder0 = new net.landzero.xlog.http.AccessEventBuilder();
        net.landzero.xlog.http.AccessEvent accessEvent1 = accessEventBuilder0.build();
        java.lang.String str2 = accessEvent1.getHeaderUserToken();
        java.lang.String str3 = accessEvent1.topic();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent4 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str5 = xPerfEvent4.getPathDigest();
        xPerfEvent4.setDuration((long) (short) 100);
        long long8 = xPerfEvent4.getDuration();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent9 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str10 = xPerfEvent9.getPathDigest();
        java.lang.String str11 = xPerfEvent9.getCrid();
        java.lang.String[] strArray27 = new java.lang.String[] { "X-Correlation-ID", "_json_", "FORM", " K[true,-1,hi!,hi!]", "", "CLIENT_CERT", " K[10,-1.0,10,-1,-1.0]", "net.landzero.xlog.logback.XLogRedisAppender[null]", "X-Correlation-ID", "CRID_-_", "ff", "", "CRID[-]", "X-Correlation-ID", "71c609df539c50766146d8d2ed1f5715" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        xPerfEvent9.setArguments((java.util.List<java.lang.String>) strList28);
        xPerfEvent4.setArguments((java.util.List<java.lang.String>) strList28);
        accessEvent1.setParams(strList28);
        org.junit.Assert.assertNotNull(accessEvent1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "x-access" + "'", str3, "x-access");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        net.landzero.xlog.XLog xLog0 = new net.landzero.xlog.XLog();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("20231026", "-");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent3 = xPerfEventBuilder2.build();
        java.lang.String str4 = net.landzero.xlog.utils.Strings.normalize((java.lang.Object) xPerfEvent3);
        org.junit.Assert.assertNotNull(xPerfEvent3);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getClassName();
        java.lang.String str2 = xPerfEvent0.getProject();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        net.landzero.xlog.utils.SignalFileChecker signalFileChecker1 = new net.landzero.xlog.utils.SignalFileChecker("20231026");
        signalFileChecker1.setCachedLastModified((long) 'a');
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setRawSql("null");
        long long3 = trackEvent0.getDuration();
        trackEvent0.setDatabaseUrl("BASIC");
        java.lang.String str6 = trackEvent0.getError();
        java.lang.String str7 = trackEvent0.getPathDigest();
        trackEvent0.setError("xlog.Event");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        java.util.ArrayList<java.lang.String> strList1 = net.landzero.xlog.utils.Flatten.flattenJSON(" K[10,-1.0,10,-1,-1.0]");
        org.junit.Assert.assertNull(strList1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        net.landzero.xlog.XLog.appendEvent(accessEvent0);
        java.lang.String[] strArray35 = new java.lang.String[] { "96a3be3cf272e017046d1b2674a52bd3", "DIGEST", "_json_", "_json_", "CRID_-_", "hi!", "FORM", "_json_", "X-Correlation-ID", "DIGEST", "FORM", "CRID[-]", "20231026", "FORM", "96a3be3cf272e017046d1b2674a52bd3", "x-mybatis-track", "plain", "DIGEST", "BASIC", "xlog.Event", "null", "", "xlog.Event", "X-Correlation-ID", "CLIENT_CERT", "96a3be3cf272e017046d1b2674a52bd3", "0", "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n", "/tmp/xlog.reopen.txt", "x-perf", "FORM", "xlog.Event", "ff" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        accessEvent0.setHeaderVerInfo(strList36);
        accessEvent0.setHeaderUserToken("0");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getQuery();
        accessEvent0.setStatus((int) (short) 100);
        accessEvent0.setStatus(100);
        java.util.ArrayList<java.lang.String> strList6 = accessEvent0.getHeaderAppInfo();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.normalizeKeyword((java.lang.Object) 0L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        java.lang.String str1 = trackEvent0.getSql();
        trackEvent0.setMethod("DIGEST");
        trackEvent0.setProject("01");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.normalize((java.lang.Object) "net.landzero.xlog.logback.XLogRedisAppender[null]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "net.landzero.xlog.logback.XLogRedisAppender[null]" + "'", str1, "net.landzero.xlog.logback.XLogRedisAppender[null]");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.Status status2 = null;
        xLogRedisAppender0.addStatus(status2);
        ch.qos.logback.core.status.Status status4 = null;
        xLogRedisAppender0.addStatus(status4);
        java.lang.String str6 = xLogRedisAppender0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "net.landzero.xlog.logback.XLogRedisAppender[null]" + "'", str6, "net.landzero.xlog.logback.XLogRedisAppender[null]");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setDuration(1L);
        java.lang.String str3 = trackEvent0.topic();
        java.util.Date date4 = trackEvent0.getTimestamp();
        trackEvent0.setRawSql("71c609df539c50766146d8d2ed1f5715");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "x-mybatis-track" + "'", str3, "x-mybatis-track");
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        net.landzero.xlog.utils.CallerInfo callerInfo0 = new net.landzero.xlog.utils.CallerInfo();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setRawSql("null");
        java.lang.String str3 = net.landzero.xlog.utils.Strings.normalize((java.lang.Object) trackEvent0);
        java.lang.String str4 = trackEvent0.getError();
        long long5 = trackEvent0.getDuration();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder0 = new net.landzero.xlog.mybatis.TrackEventBuilder();
        trackEventBuilder0.commit();
        net.landzero.xlog.mybatis.TrackEvent trackEvent2 = trackEventBuilder0.build();
        org.junit.Assert.assertNotNull(trackEvent2);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        boolean boolean1 = net.landzero.xlog.utils.Strings.isEmpty("net.landzero.xlog.logback.XLogRedisAppender[null]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        net.landzero.xlog.dubbo.XLogProviderFilter xLogProviderFilter0 = new net.landzero.xlog.dubbo.XLogProviderFilter();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("20231026", "-");
        xPerfEventBuilder2.commit();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setDuration(1L);
        java.lang.String str3 = trackEvent0.topic();
        java.util.Date date4 = trackEvent0.getTimestamp();
        java.lang.String str5 = trackEvent0.getRawSql();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "x-mybatis-track" + "'", str3, "x-mybatis-track");
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        xLogRedisAppender0.setName("CRID[-]");
        ch.qos.logback.core.filter.Filter<ch.qos.logback.classic.spi.ILoggingEvent> iLoggingEventFilter4 = null;
        xLogRedisAppender0.addFilter(iLoggingEventFilter4);
        xLogRedisAppender0.addWarn("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        net.landzero.xlog.utils.Dates dates0 = new net.landzero.xlog.utils.Dates();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.safeNormalize("CRID[-]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CRID[-]" + "'", str1, "CRID[-]");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        java.lang.String str1 = trackEvent0.getSqlDigest();
        trackEvent0.setCrid("0");
        trackEvent0.setDatabaseUrl("FORM");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.Status status2 = null;
        xLogRedisAppender0.addStatus(status2);
        boolean boolean4 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.StatusManager statusManager5 = xLogRedisAppender0.getStatusManager();
        boolean boolean6 = xLogRedisAppender0.isStarted();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(statusManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        java.lang.String str1 = trackEvent0.getSqlDigest();
        long long2 = trackEvent0.getDuration();
        java.lang.String str3 = trackEvent0.topic();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "x-mybatis-track" + "'", str3, "x-mybatis-track");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.Context context2 = xLogRedisAppender0.getContext();
        xLogRedisAppender0.start();
        ch.qos.logback.core.filter.Filter<ch.qos.logback.classic.spi.ILoggingEvent> iLoggingEventFilter4 = null;
        xLogRedisAppender0.addFilter(iLoggingEventFilter4);
        java.lang.String str6 = xLogRedisAppender0.getMode();
        ch.qos.logback.core.status.StatusManager statusManager7 = xLogRedisAppender0.getStatusManager();
        java.util.ArrayList<java.lang.String> strList8 = xLogRedisAppender0.getHosts();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(context2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "plain" + "'", str6, "plain");
        org.junit.Assert.assertNull(statusManager7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        java.util.ArrayList<java.lang.String> strList2 = xLogRedisAppender0.getHosts();
        xLogRedisAppender0.setName("FORM");
        ch.qos.logback.core.status.StatusManager statusManager5 = xLogRedisAppender0.getStatusManager();
        xLogRedisAppender0.stop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNull(statusManager5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        java.lang.String str1 = trackEvent0.getMethod();
        long long2 = trackEvent0.getDuration();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        xLogRedisAppender0.addError("-");
        xLogRedisAppender0.addInfo("net.landzero.xlog.logback.XLogRedisAppender[null]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.normalize("-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-" + "'", str1, "-");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.classic.spi.ILoggingEvent iLoggingEvent2 = null;
        ch.qos.logback.core.spi.FilterReply filterReply3 = xLogRedisAppender0.getFilterChainDecision(iLoggingEvent2);
        xLogRedisAppender0.start();
        xLogRedisAppender0.setEnv("/tmp/xlog.reopen.txt");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + filterReply3 + "' != '" + ch.qos.logback.core.spi.FilterReply.NEUTRAL + "'", filterReply3.equals(ch.qos.logback.core.spi.FilterReply.NEUTRAL));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.Status status2 = null;
        xLogRedisAppender0.addStatus(status2);
        boolean boolean4 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.StatusManager statusManager5 = xLogRedisAppender0.getStatusManager();
        xLogRedisAppender0.addInfo("-");
        xLogRedisAppender0.setProject("FORM");
        ch.qos.logback.classic.spi.ILoggingEvent iLoggingEvent10 = null;
        xLogRedisAppender0.doAppend(iLoggingEvent10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(statusManager5);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        net.landzero.xlog.http.AccessEventBuilder accessEventBuilder0 = new net.landzero.xlog.http.AccessEventBuilder();
        net.landzero.xlog.http.AccessEvent accessEvent1 = accessEventBuilder0.build();
        net.landzero.xlog.http.AccessEvent accessEvent2 = accessEventBuilder0.build();
        javax.servlet.ServletResponse servletResponse3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.landzero.xlog.http.AccessEventBuilder accessEventBuilder4 = accessEventBuilder0.setServletResponse(servletResponse3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.toString()\" because \"response\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(accessEvent1);
        org.junit.Assert.assertNotNull(accessEvent2);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        net.landzero.xlog.utils.CallerInfo callerInfo0 = net.landzero.xlog.utils.Reflections.getCallerInfo();
        java.lang.String str1 = net.landzero.xlog.utils.Strings.safeNormalize((java.lang.Object) callerInfo0);
        callerInfo0.setClassName("BASIC");
        org.junit.Assert.assertNotNull(callerInfo0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPathDigest();
        java.lang.String str2 = xPerfEvent0.getCrid();
        xPerfEvent0.setClassName("-");
        java.util.Date date5 = xPerfEvent0.getTimestamp();
        java.lang.String str6 = xPerfEvent0.getClassName();
        java.util.List<java.lang.String> strList7 = xPerfEvent0.getArguments();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        java.lang.String str0 = net.landzero.xlog.logback.XLogBaseAppender.MODE_JSON;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "json" + "'", str0, "json");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        java.lang.String str1 = trackEvent0.getMethod();
        java.lang.String str2 = trackEvent0.getCrid();
        java.lang.String str3 = trackEvent0.getSqlDigest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        java.util.ArrayList<java.lang.String> strList2 = xLogRedisAppender0.getHosts();
        boolean boolean3 = xLogRedisAppender0.isStarted();
        java.lang.String str4 = xLogRedisAppender0.toString();
        xLogRedisAppender0.setEnv("CLIENT_CERT");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "net.landzero.xlog.logback.XLogRedisAppender[null]" + "'", str4, "net.landzero.xlog.logback.XLogRedisAppender[null]");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.Status status2 = null;
        xLogRedisAppender0.addStatus(status2);
        xLogRedisAppender0.addWarn("null");
        java.lang.Throwable throwable7 = null;
        xLogRedisAppender0.addInfo("plain", throwable7);
        ch.qos.logback.core.Context context9 = xLogRedisAppender0.getContext();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(context9);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setRawSql("null");
        long long3 = trackEvent0.getDuration();
        trackEvent0.setDatabaseUrl("BASIC");
        java.lang.String str6 = trackEvent0.getError();
        java.lang.String str7 = trackEvent0.getPathDigest();
        java.lang.String str8 = trackEvent0.getMethod();
        java.lang.String str9 = trackEvent0.getError();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        java.lang.String str1 = trackEvent0.getSql();
        trackEvent0.setMethod("DIGEST");
        trackEvent0.setSqlDigest("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %X{cridMark} [%thread] %-5level %logger{35} - %msg%n");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = inputStream0.readNBytes(byteArray1, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"b\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        net.landzero.xlog.logback.XLogFileAppender xLogFileAppender0 = new net.landzero.xlog.logback.XLogFileAppender();
        java.lang.String str1 = xLogFileAppender0.getFilename();
        java.lang.String str2 = xLogFileAppender0.getFilename();
        xLogFileAppender0.setDir("/tmp/xlog.reopen.txt");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        xLogRedisAppender0.addError("-");
        java.lang.String str4 = xLogRedisAppender0.getMode();
        ch.qos.logback.core.filter.Filter<ch.qos.logback.classic.spi.ILoggingEvent> iLoggingEventFilter5 = null;
        xLogRedisAppender0.addFilter(iLoggingEventFilter5);
        boolean boolean7 = xLogRedisAppender0.isStarted();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "plain" + "'", str4, "plain");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = inputStream0.transferTo(outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        net.landzero.xlog.utils.CallerInfo callerInfo0 = net.landzero.xlog.utils.Reflections.getCallerInfo();
        java.lang.String str1 = net.landzero.xlog.utils.Strings.safeNormalize((java.lang.Object) callerInfo0);
        callerInfo0.setMethodName(" K[10,-1.0,10,-1,-1.0]");
        org.junit.Assert.assertNotNull(callerInfo0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.Status status2 = null;
        xLogRedisAppender0.addStatus(status2);
        xLogRedisAppender0.addWarn("null");
        ch.qos.logback.core.status.StatusManager statusManager6 = xLogRedisAppender0.getStatusManager();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(statusManager6);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        net.landzero.xlog.utils.IntervalChecker intervalChecker1 = new net.landzero.xlog.utils.IntervalChecker((long) (short) 10);
        long long2 = intervalChecker1.getInterval();
        long long3 = intervalChecker1.getChecked();
        intervalChecker1.setChecked(10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        net.landzero.xlog.XLog.appendEvent(accessEvent0);
        java.lang.String[] strArray35 = new java.lang.String[] { "96a3be3cf272e017046d1b2674a52bd3", "DIGEST", "_json_", "_json_", "CRID_-_", "hi!", "FORM", "_json_", "X-Correlation-ID", "DIGEST", "FORM", "CRID[-]", "20231026", "FORM", "96a3be3cf272e017046d1b2674a52bd3", "x-mybatis-track", "plain", "DIGEST", "BASIC", "xlog.Event", "null", "", "xlog.Event", "X-Correlation-ID", "CLIENT_CERT", "96a3be3cf272e017046d1b2674a52bd3", "0", "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n", "/tmp/xlog.reopen.txt", "x-perf", "FORM", "xlog.Event", "ff" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        accessEvent0.setHeaderVerInfo(strList36);
        accessEvent0.setTopic("0");
        accessEvent0.setStatus(0);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setDuration(1L);
        java.util.Date date3 = net.landzero.xlog.utils.Dates.yesterday();
        trackEvent0.setTimestamp(date3);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Thu Oct 26 23:34:45 CDT 2023");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        xLogRedisAppender0.addError("-");
        java.lang.String str4 = xLogRedisAppender0.getMode();
        xLogRedisAppender0.clearAllFilters();
        java.lang.String str6 = xLogRedisAppender0.getTopic();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "plain" + "'", str4, "plain");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        net.landzero.xlog.XLog.setCrid("01");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.util.List<java.lang.String> strList1 = xPerfEvent0.getArguments();
        java.lang.String str2 = xPerfEvent0.getMethodName();
        java.util.List<java.lang.String> strList3 = xPerfEvent0.getArguments();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strList3);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        java.lang.String str1 = trackEvent0.getSqlDigest();
        trackEvent0.setCrid("0");
        java.lang.String str4 = trackEvent0.getRawSql();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setRawSql("null");
        trackEvent0.setProject("");
        java.lang.String str5 = trackEvent0.getError();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPathDigest();
        xPerfEvent0.setDuration((long) (short) 100);
        java.lang.String str4 = xPerfEvent0.getPath();
        java.lang.String str5 = xPerfEvent0.getPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        java.lang.String str1 = net.landzero.xlog.utils.Hex.toHex((byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "64" + "'", str1, "64");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPathDigest();
        xPerfEvent0.setDuration((long) (short) 100);
        long long4 = xPerfEvent0.getDuration();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent5 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str6 = xPerfEvent5.getPathDigest();
        java.lang.String str7 = xPerfEvent5.getCrid();
        java.lang.String[] strArray23 = new java.lang.String[] { "X-Correlation-ID", "_json_", "FORM", " K[true,-1,hi!,hi!]", "", "CLIENT_CERT", " K[10,-1.0,10,-1,-1.0]", "net.landzero.xlog.logback.XLogRedisAppender[null]", "X-Correlation-ID", "CRID_-_", "ff", "", "CRID[-]", "X-Correlation-ID", "71c609df539c50766146d8d2ed1f5715" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        xPerfEvent5.setArguments((java.util.List<java.lang.String>) strList24);
        xPerfEvent0.setArguments((java.util.List<java.lang.String>) strList24);
        net.landzero.xlog.XLog.appendEvent(xPerfEvent0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPathDigest();
        xPerfEvent0.setDuration((long) (short) 100);
        java.lang.String str4 = xPerfEvent0.getPath();
        java.lang.String str5 = xPerfEvent0.getMethodName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        net.landzero.xlog.logback.XLogFileAppender xLogFileAppender0 = new net.landzero.xlog.logback.XLogFileAppender();
        xLogFileAppender0.start();
        java.lang.String str2 = xLogFileAppender0.getDir();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        int int1 = inputStream0.available();
        inputStream0.mark(1);
        inputStream0.mark(0);
        int int6 = inputStream0.available();
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        int int8 = inputStream7.available();
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) -1, (byte) -1 };
        int int13 = inputStream7.read(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = inputStream0.readNBytes(byteArray12, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [-1, -1 + 100) out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, -1, -1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getQuery();
        accessEvent0.setQuery(" K[true,-1,hi!,hi!]");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        net.landzero.xlog.utils.IntervalChecker intervalChecker1 = new net.landzero.xlog.utils.IntervalChecker((long) (short) 10);
        long long2 = intervalChecker1.getChecked();
        intervalChecker1.setChecked((-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        int int1 = inputStream0.available();
        inputStream0.mark(1);
        inputStream0.mark(0);
        byte[] byteArray6 = inputStream0.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.Status status2 = null;
        xLogRedisAppender0.addStatus(status2);
        boolean boolean4 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.StatusManager statusManager5 = xLogRedisAppender0.getStatusManager();
        xLogRedisAppender0.addInfo("-");
        xLogRedisAppender0.setProject("FORM");
        java.lang.String str10 = xLogRedisAppender0.getMode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(statusManager5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "plain" + "'", str10, "plain");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("_json_", "");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.normalizeKeyword("cridMark");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cridMark" + "'", str1, "cridMark");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setError("hi!");
        java.lang.String str3 = net.landzero.xlog.utils.Strings.safeNormalize((java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        int int1 = inputStream0.available();
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) -1 };
        int int6 = inputStream0.read(byteArray5);
        int int7 = inputStream0.available();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, -1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        java.util.ArrayList<java.lang.String> strList1 = net.landzero.xlog.utils.Flatten.flattenJSON("01");
        org.junit.Assert.assertNull(strList1);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("20231026", "-");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent3 = xPerfEventBuilder2.build();
        java.lang.String str4 = xPerfEvent3.topic();
        xPerfEvent3.setAction("CLIENT_CERT");
        java.lang.String str7 = xPerfEvent3.getPath();
        xPerfEvent3.setAction("_json_");
        org.junit.Assert.assertNotNull(xPerfEvent3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "x-perf" + "'", str4, "x-perf");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.Context context2 = xLogRedisAppender0.getContext();
        xLogRedisAppender0.start();
        ch.qos.logback.core.filter.Filter<ch.qos.logback.classic.spi.ILoggingEvent> iLoggingEventFilter4 = null;
        xLogRedisAppender0.addFilter(iLoggingEventFilter4);
        java.lang.String str6 = xLogRedisAppender0.getMode();
        ch.qos.logback.core.status.StatusManager statusManager7 = xLogRedisAppender0.getStatusManager();
        java.lang.Throwable throwable9 = null;
        xLogRedisAppender0.addInfo(" K[true,-1,hi!,hi!]", throwable9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(context2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "plain" + "'", str6, "plain");
        org.junit.Assert.assertNull(statusManager7);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        net.landzero.xlog.logback.XLogFileAppender xLogFileAppender0 = new net.landzero.xlog.logback.XLogFileAppender();
        java.lang.String str1 = xLogFileAppender0.getFilename();
        xLogFileAppender0.setDir(" K[10,-1.0,10,-1,-1.0]");
        java.lang.String str4 = xLogFileAppender0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setRawSql("null");
        long long3 = trackEvent0.getDuration();
        trackEvent0.setSql("FORM");
        trackEvent0.setTopic("hi!");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getQuery();
        accessEvent0.setStatus((int) (short) 100);
        java.lang.String str4 = accessEvent0.getQuery();
        java.lang.String str5 = accessEvent0.getHeaderUserToken();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getQuery();
        accessEvent0.setStatus((int) (short) 100);
        accessEvent0.setHeaderUserToken("CRID_-_");
        accessEvent0.setHost("X-Correlation-ID");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        java.lang.String str1 = trackEvent0.getSqlDigest();
        long long2 = trackEvent0.getDuration();
        java.lang.String str3 = trackEvent0.getPathDigest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        java.util.ArrayList<java.lang.String> strList2 = xLogRedisAppender0.getHosts();
        boolean boolean3 = xLogRedisAppender0.isJsonMode();
        xLogRedisAppender0.setProject("crid");
        java.lang.String str6 = xLogRedisAppender0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "net.landzero.xlog.logback.XLogRedisAppender[null]" + "'", str6, "net.landzero.xlog.logback.XLogRedisAppender[null]");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.Context context2 = xLogRedisAppender0.getContext();
        xLogRedisAppender0.start();
        boolean boolean4 = xLogRedisAppender0.isStarted();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(context2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        net.landzero.xlog.utils.SignalFileChecker signalFileChecker1 = new net.landzero.xlog.utils.SignalFileChecker("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n");
        boolean boolean2 = signalFileChecker1.check();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        net.landzero.xlog.XLog.setCrid(" K[true,-1,hi!,hi!]");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setDuration(1L);
        java.lang.String str3 = trackEvent0.topic();
        trackEvent0.setSql("net.landzero.xlog.logback.XLogRedisAppender[null]");
        java.lang.String str6 = trackEvent0.getPathDigest();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "x-mybatis-track" + "'", str3, "x-mybatis-track");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.util.List<java.lang.String> strList1 = xPerfEvent0.getArguments();
        java.lang.String str2 = xPerfEvent0.topic();
        java.lang.String str3 = xPerfEvent0.topic();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x-perf" + "'", str2, "x-perf");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "x-perf" + "'", str3, "x-perf");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        net.landzero.xlog.http.AccessEventBuilder accessEventBuilder0 = new net.landzero.xlog.http.AccessEventBuilder();
        net.landzero.xlog.http.AccessEvent accessEvent1 = accessEventBuilder0.build();
        java.lang.String str2 = accessEvent1.getHeaderUserToken();
        java.lang.String str3 = accessEvent1.topic();
        accessEvent1.setTopic("hi!");
        java.util.ArrayList<java.lang.String> strList6 = accessEvent1.getHeaderVerInfo();
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender7 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean8 = xLogRedisAppender7.isJsonMode();
        java.util.ArrayList<java.lang.String> strList9 = xLogRedisAppender7.getHosts();
        accessEvent1.setHeaderAppInfo(strList9);
        org.junit.Assert.assertNotNull(accessEvent1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "x-access" + "'", str3, "x-access");
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent1 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str2 = xPerfEvent1.getPathDigest();
        java.lang.String str3 = xPerfEvent1.getCrid();
        java.lang.String[] strArray19 = new java.lang.String[] { "X-Correlation-ID", "_json_", "FORM", " K[true,-1,hi!,hi!]", "", "CLIENT_CERT", " K[10,-1.0,10,-1,-1.0]", "net.landzero.xlog.logback.XLogRedisAppender[null]", "X-Correlation-ID", "CRID_-_", "ff", "", "CRID[-]", "X-Correlation-ID", "71c609df539c50766146d8d2ed1f5715" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        xPerfEvent1.setArguments((java.util.List<java.lang.String>) strList20);
        accessEvent0.setHeaderAppInfo(strList20);
        int int24 = accessEvent0.getStatus();
        java.util.ArrayList<java.lang.String> strList25 = accessEvent0.getHeaderVerInfo();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(strList25);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("20231026", "-");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent3 = xPerfEventBuilder2.build();
        java.lang.Object[] objArray11 = new java.lang.Object[] { (byte) 10, (-1.0d), 10, (-1L), (-1.0d) };
        java.lang.String str12 = net.landzero.xlog.XLog.keyword(objArray11);
        net.landzero.xlog.XLogCommitter xLogCommitter13 = net.landzero.xlog.perf.XPerf.create("BASIC", objArray11);
        java.lang.String str14 = net.landzero.xlog.XLog.keyword(objArray11);
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder15 = xPerfEventBuilder2.setCommand("-", objArray11);
        org.junit.Assert.assertNotNull(xPerfEvent3);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10, -1.0, 10, -1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10, -1.0, 10, -1, -1.0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " K[10,-1.0,10,-1,-1.0]" + "'", str12, " K[10,-1.0,10,-1,-1.0]");
        org.junit.Assert.assertNotNull(xLogCommitter13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " K[10,-1.0,10,-1,-1.0]" + "'", str14, " K[10,-1.0,10,-1,-1.0]");
        org.junit.Assert.assertNotNull(xPerfEventBuilder15);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        java.lang.String str1 = trackEvent0.getSqlDigest();
        trackEvent0.setSql("BASIC");
        java.lang.String str4 = trackEvent0.getRawSql();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        net.landzero.xlog.logback.XLogFileAppender xLogFileAppender0 = new net.landzero.xlog.logback.XLogFileAppender();
        java.lang.String str1 = xLogFileAppender0.getFilename();
        int int2 = xLogFileAppender0.getRotate();
        xLogFileAppender0.clearAllFilters();
        java.lang.String str4 = xLogFileAppender0.getFilename();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        int int0 = net.landzero.xlog.logback.XLogFileAppender.SIGNAL_FILE_CHECK_INTERVAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 30000 + "'", int0 == 30000);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        net.landzero.xlog.utils.SignalFileChecker signalFileChecker1 = new net.landzero.xlog.utils.SignalFileChecker("-");
        signalFileChecker1.setCachedLastModified(0L);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        net.landzero.xlog.utils.SignalFileChecker signalFileChecker1 = new net.landzero.xlog.utils.SignalFileChecker("null");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        boolean boolean1 = net.landzero.xlog.utils.Strings.isEmpty(" K[true,-1,hi!,hi!]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("01", "CRID[-]");
        java.lang.String str3 = net.landzero.xlog.utils.Strings.safeNormalize((java.lang.Object) "01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "01" + "'", str3, "01");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        xLogRedisAppender0.setName("CRID[-]");
        ch.qos.logback.core.filter.Filter<ch.qos.logback.classic.spi.ILoggingEvent> iLoggingEventFilter4 = null;
        xLogRedisAppender0.addFilter(iLoggingEventFilter4);
        xLogRedisAppender0.clearAllFilters();
        boolean boolean7 = xLogRedisAppender0.isStarted();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        java.util.ArrayList<java.lang.String> strList2 = xLogRedisAppender0.getHosts();
        boolean boolean3 = xLogRedisAppender0.isJsonMode();
        xLogRedisAppender0.setProject("crid");
        java.lang.Throwable throwable7 = null;
        xLogRedisAppender0.addError("hi!", throwable7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        net.landzero.xlog.logback.XLogFileAppender xLogFileAppender0 = new net.landzero.xlog.logback.XLogFileAppender();
        java.lang.String str1 = xLogFileAppender0.getFilename();
        xLogFileAppender0.setDir("x-perf");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        xLogRedisAppender0.addError("-");
        java.lang.String str4 = xLogRedisAppender0.getMode();
        ch.qos.logback.core.filter.Filter<ch.qos.logback.classic.spi.ILoggingEvent> iLoggingEventFilter5 = null;
        xLogRedisAppender0.addFilter(iLoggingEventFilter5);
        xLogRedisAppender0.setEnv("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "plain" + "'", str4, "plain");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        int int1 = inputStream0.available();
        inputStream0.mark(1);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setRawSql("null");
        long long3 = trackEvent0.getDuration();
        trackEvent0.setDatabaseUrl("BASIC");
        java.lang.String str6 = trackEvent0.getError();
        java.lang.String str7 = trackEvent0.getPathDigest();
        java.lang.String str8 = trackEvent0.getMethod();
        java.lang.String str9 = trackEvent0.getRawSql();
        trackEvent0.setDuration((long) (-1));
        trackEvent0.setPathDigest("_json_");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("20231026", "-");
        xPerfEventBuilder2.commit();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent4 = xPerfEventBuilder2.build();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent5 = xPerfEventBuilder2.build();
        xPerfEvent5.setMethodName("json");
        org.junit.Assert.assertNotNull(xPerfEvent4);
        org.junit.Assert.assertNotNull(xPerfEvent5);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        java.util.ArrayList<java.lang.String> strList2 = xLogRedisAppender0.getHosts();
        java.lang.String str3 = xLogRedisAppender0.getProject();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        java.lang.String str1 = net.landzero.xlog.utils.Strings.normalizeKeyword(" K[true,-1,hi!,hi!]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "K_true_-1_hi!_hi!_" + "'", str1, "K_true_-1_hi!_hi!_");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        net.landzero.xlog.XLog.appendEvent(accessEvent0);
        java.lang.String str2 = accessEvent0.getMethod();
        int int3 = accessEvent0.getStatus();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        net.landzero.xlog.XLog.appendEvent(accessEvent0);
        java.lang.String[] strArray35 = new java.lang.String[] { "96a3be3cf272e017046d1b2674a52bd3", "DIGEST", "_json_", "_json_", "CRID_-_", "hi!", "FORM", "_json_", "X-Correlation-ID", "DIGEST", "FORM", "CRID[-]", "20231026", "FORM", "96a3be3cf272e017046d1b2674a52bd3", "x-mybatis-track", "plain", "DIGEST", "BASIC", "xlog.Event", "null", "", "xlog.Event", "X-Correlation-ID", "CLIENT_CERT", "96a3be3cf272e017046d1b2674a52bd3", "0", "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n", "/tmp/xlog.reopen.txt", "x-perf", "FORM", "xlog.Event", "ff" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        accessEvent0.setHeaderVerInfo(strList36);
        java.lang.String str39 = net.landzero.xlog.utils.Strings.normalizeKeyword((java.lang.Object) accessEvent0);
        java.lang.String str40 = accessEvent0.topic();
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "x-access" + "'", str40, "x-access");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setRawSql("null");
        trackEvent0.setMethod("BASIC");
        trackEvent0.setDuration(1L);
        java.lang.String str7 = trackEvent0.getSqlDigest();
        trackEvent0.setTopic("crid");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        java.util.ArrayList<java.lang.String> strList2 = xLogRedisAppender0.getHosts();
        boolean boolean3 = xLogRedisAppender0.isJsonMode();
        xLogRedisAppender0.addHost("/tmp/xlog.reopen.txt");
        java.lang.String str6 = xLogRedisAppender0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        net.landzero.xlog.utils.SignalFileChecker signalFileChecker1 = new net.landzero.xlog.utils.SignalFileChecker("DIGEST");
        signalFileChecker1.setCachedLastModified((long) (byte) 10);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPathDigest();
        java.lang.String str2 = xPerfEvent0.getCrid();
        java.lang.String[] strArray18 = new java.lang.String[] { "X-Correlation-ID", "_json_", "FORM", " K[true,-1,hi!,hi!]", "", "CLIENT_CERT", " K[10,-1.0,10,-1,-1.0]", "net.landzero.xlog.logback.XLogRedisAppender[null]", "X-Correlation-ID", "CRID_-_", "ff", "", "CRID[-]", "X-Correlation-ID", "71c609df539c50766146d8d2ed1f5715" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        xPerfEvent0.setArguments((java.util.List<java.lang.String>) strList19);
        java.util.List<java.lang.String> strList22 = null;
        xPerfEvent0.setArguments(strList22);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setRawSql("null");
        long long3 = trackEvent0.getDuration();
        trackEvent0.setDatabaseUrl("BASIC");
        java.lang.String str6 = trackEvent0.getError();
        trackEvent0.setError("net.landzero.xlog.logback.XLogRedisAppender[null]");
        java.lang.String str9 = net.landzero.xlog.utils.Strings.safeNormalize((java.lang.Object) trackEvent0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setDuration(1L);
        java.lang.String str3 = trackEvent0.topic();
        java.util.Date date4 = trackEvent0.getTimestamp();
        trackEvent0.setError("x-mybatis-track");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "x-mybatis-track" + "'", str3, "x-mybatis-track");
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.Status status2 = null;
        xLogRedisAppender0.addStatus(status2);
        boolean boolean4 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.Status status5 = null;
        xLogRedisAppender0.addStatus(status5);
        java.lang.String str7 = xLogRedisAppender0.getEnv();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setRawSql("null");
        long long3 = trackEvent0.getDuration();
        trackEvent0.setDatabaseUrl("BASIC");
        java.lang.String str6 = trackEvent0.getError();
        java.lang.String str7 = trackEvent0.getPathDigest();
        java.lang.String str8 = trackEvent0.getMethod();
        java.lang.String str9 = trackEvent0.getRawSql();
        trackEvent0.setPath("X-Correlation-ID");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.Context context2 = xLogRedisAppender0.getContext();
        xLogRedisAppender0.setMode("xlog");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(context2);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        net.landzero.xlog.utils.IntervalChecker intervalChecker1 = new net.landzero.xlog.utils.IntervalChecker((long) '#');
        intervalChecker1.setChecked((long) '#');
        intervalChecker1.setChecked(10L);
        intervalChecker1.setChecked((long) (byte) -1);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        java.lang.String str1 = trackEvent0.getSqlDigest();
        trackEvent0.setMethod("0");
        java.lang.String str4 = net.landzero.xlog.utils.Strings.safeNormalize((java.lang.Object) trackEvent0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        net.landzero.xlog.utils.CallerInfo callerInfo0 = net.landzero.xlog.utils.Reflections.getCallerInfo();
        java.lang.String str1 = net.landzero.xlog.utils.Strings.safeNormalize((java.lang.Object) callerInfo0);
        callerInfo0.setMethodName("20231026");
        java.lang.String str4 = callerInfo0.getMethodName();
        java.lang.String str5 = callerInfo0.getClassName();
        org.junit.Assert.assertNotNull(callerInfo0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "20231026" + "'", str4, "20231026");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jdk.internal.reflect.DelegatingMethodAccessorImpl" + "'", str5, "jdk.internal.reflect.DelegatingMethodAccessorImpl");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setTopic("net.landzero.xlog.logback.XLogRedisAppender[null]");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        java.util.ArrayList<java.lang.String> strList1 = net.landzero.xlog.utils.Flatten.flattenJSON("plain");
        org.junit.Assert.assertNull(strList1);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        accessEvent0.setQuery("_json_");
        accessEvent0.setQuery("CRID_-_");
        accessEvent0.setStatus((int) (byte) 1);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getQuery();
        accessEvent0.setHost("x-access");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        java.lang.String str1 = trackEvent0.getSqlDigest();
        long long2 = trackEvent0.getDuration();
        java.lang.String str3 = trackEvent0.getRawSql();
        java.lang.String str4 = trackEvent0.getSqlDigest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        int int1 = inputStream0.available();
        inputStream0.mark(1);
        inputStream0.mark(0);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.skipNBytes((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        net.landzero.xlog.utils.SignalFileChecker signalFileChecker1 = new net.landzero.xlog.utils.SignalFileChecker("CRID_-_");
        boolean boolean2 = signalFileChecker1.check();
        signalFileChecker1.setCachedLastModified((long) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        net.landzero.xlog.logback.XLogFileAppender xLogFileAppender0 = new net.landzero.xlog.logback.XLogFileAppender();
        java.lang.String str1 = xLogFileAppender0.getFilename();
        xLogFileAppender0.setRotate((int) (short) -1);
        java.lang.String str4 = xLogFileAppender0.getDir();
        java.lang.String str5 = xLogFileAppender0.getProject();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        java.lang.String str1 = trackEvent0.getMethod();
        java.lang.String str2 = trackEvent0.getCrid();
        java.lang.String str3 = trackEvent0.topic();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "x-mybatis-track" + "'", str3, "x-mybatis-track");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("20231026", "-");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent3 = xPerfEventBuilder2.build();
        java.lang.String str4 = xPerfEvent3.topic();
        java.util.Date date5 = null;
        xPerfEvent3.setTimestamp(date5);
        xPerfEvent3.setCrid("e8b502965b188446");
        java.util.Date date9 = net.landzero.xlog.utils.Dates.yesterday();
        xPerfEvent3.setTimestamp(date9);
        org.junit.Assert.assertNotNull(xPerfEvent3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "x-perf" + "'", str4, "x-perf");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Thu Oct 26 23:34:46 CDT 2023");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        xLogRedisAppender0.addError("-");
        java.lang.String str4 = xLogRedisAppender0.getMode();
        xLogRedisAppender0.clearAllFilters();
        xLogRedisAppender0.addWarn("xlog");
        java.lang.String str8 = xLogRedisAppender0.getEnv();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "plain" + "'", str4, "plain");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        net.landzero.xlog.utils.SignalFileChecker signalFileChecker1 = new net.landzero.xlog.utils.SignalFileChecker("-");
        boolean boolean2 = signalFileChecker1.check();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        java.util.ArrayList<java.lang.String> strList2 = xLogRedisAppender0.getHosts();
        xLogRedisAppender0.setName("FORM");
        java.lang.String str5 = xLogRedisAppender0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FORM" + "'", str5, "FORM");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.Status status2 = null;
        xLogRedisAppender0.addStatus(status2);
        boolean boolean4 = xLogRedisAppender0.isJsonMode();
        xLogRedisAppender0.addWarn("FORM");
        xLogRedisAppender0.setTopic("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setRawSql("null");
        java.lang.String str3 = net.landzero.xlog.utils.Strings.normalize((java.lang.Object) trackEvent0);
        java.lang.String str4 = trackEvent0.getError();
        java.lang.String str5 = trackEvent0.getMethod();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        accessEvent0.setQuery("_json_");
        int int3 = accessEvent0.getStatus();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        inputStream0.close();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray3 = inputStream0.readNBytes(0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender1 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean2 = xLogRedisAppender1.isJsonMode();
        java.util.ArrayList<java.lang.String> strList3 = xLogRedisAppender1.getHosts();
        accessEvent0.setHeaderVerInfo(strList3);
        accessEvent0.setHeaderUserToken("CLIENT_CERT");
        accessEvent0.setHost("X-Correlation-ID");
        accessEvent0.setQuery("null");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        xLogRedisAppender0.addError("-");
        xLogRedisAppender0.setProject("/tmp/xlog.reopen.txt");
        xLogRedisAppender0.start();
        xLogRedisAppender0.addError("64");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent1 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str2 = xPerfEvent1.getPathDigest();
        java.lang.String str3 = xPerfEvent1.getCrid();
        java.lang.String[] strArray19 = new java.lang.String[] { "X-Correlation-ID", "_json_", "FORM", " K[true,-1,hi!,hi!]", "", "CLIENT_CERT", " K[10,-1.0,10,-1,-1.0]", "net.landzero.xlog.logback.XLogRedisAppender[null]", "X-Correlation-ID", "CRID_-_", "ff", "", "CRID[-]", "X-Correlation-ID", "71c609df539c50766146d8d2ed1f5715" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        xPerfEvent1.setArguments((java.util.List<java.lang.String>) strList20);
        accessEvent0.setHeaderAppInfo(strList20);
        int int24 = accessEvent0.getStatus();
        java.lang.String str25 = accessEvent0.getHeaderUserToken();
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender26 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean27 = xLogRedisAppender26.isJsonMode();
        java.util.ArrayList<java.lang.String> strList28 = xLogRedisAppender26.getHosts();
        boolean boolean29 = xLogRedisAppender26.isJsonMode();
        xLogRedisAppender26.addInfo("hi!");
        java.util.ArrayList<java.lang.String> strList32 = xLogRedisAppender26.getHosts();
        accessEvent0.setHeaderAppInfo(strList32);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.Status status2 = null;
        xLogRedisAppender0.addStatus(status2);
        ch.qos.logback.core.status.Status status4 = null;
        xLogRedisAppender0.addStatus(status4);
        xLogRedisAppender0.stop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.Status status2 = null;
        xLogRedisAppender0.addStatus(status2);
        boolean boolean4 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.StatusManager statusManager5 = xLogRedisAppender0.getStatusManager();
        java.lang.String str6 = xLogRedisAppender0.getEnv();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(statusManager5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender1 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean2 = xLogRedisAppender1.isJsonMode();
        java.util.ArrayList<java.lang.String> strList3 = xLogRedisAppender1.getHosts();
        accessEvent0.setHeaderVerInfo(strList3);
        java.lang.String str5 = accessEvent0.getMethod();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        net.landzero.xlog.utils.SignalFileChecker signalFileChecker1 = new net.landzero.xlog.utils.SignalFileChecker("20231026");
        java.lang.String str2 = net.landzero.xlog.utils.Strings.normalizeKeyword((java.lang.Object) "20231026");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "20231026" + "'", str2, "20231026");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        net.landzero.xlog.XLog.appendEvent(accessEvent0);
        java.lang.String[] strArray35 = new java.lang.String[] { "96a3be3cf272e017046d1b2674a52bd3", "DIGEST", "_json_", "_json_", "CRID_-_", "hi!", "FORM", "_json_", "X-Correlation-ID", "DIGEST", "FORM", "CRID[-]", "20231026", "FORM", "96a3be3cf272e017046d1b2674a52bd3", "x-mybatis-track", "plain", "DIGEST", "BASIC", "xlog.Event", "null", "", "xlog.Event", "X-Correlation-ID", "CLIENT_CERT", "96a3be3cf272e017046d1b2674a52bd3", "0", "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n", "/tmp/xlog.reopen.txt", "x-perf", "FORM", "xlog.Event", "ff" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        accessEvent0.setHeaderVerInfo(strList36);
        java.lang.String str39 = net.landzero.xlog.utils.Strings.normalizeKeyword((java.lang.Object) accessEvent0);
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder42 = new net.landzero.xlog.perf.XPerfEventBuilder("20231026", "-");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent43 = xPerfEventBuilder42.build();
        java.lang.String str44 = xPerfEvent43.topic();
        xPerfEvent43.setAction("CLIENT_CERT");
        java.lang.String str47 = xPerfEvent43.topic();
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder50 = new net.landzero.xlog.perf.XPerfEventBuilder("20231026", "-");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent51 = xPerfEventBuilder50.build();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent52 = xPerfEventBuilder50.build();
        net.landzero.xlog.http.AccessEvent accessEvent53 = new net.landzero.xlog.http.AccessEvent();
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender54 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean55 = xLogRedisAppender54.isJsonMode();
        java.util.ArrayList<java.lang.String> strList56 = xLogRedisAppender54.getHosts();
        accessEvent53.setHeaderVerInfo(strList56);
        xPerfEvent52.setArguments((java.util.List<java.lang.String>) strList56);
        xPerfEvent43.setArguments((java.util.List<java.lang.String>) strList56);
        accessEvent0.setHeaderVerInfo(strList56);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(xPerfEvent43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "x-perf" + "'", str44, "x-perf");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "x-perf" + "'", str47, "x-perf");
        org.junit.Assert.assertNotNull(xPerfEvent51);
        org.junit.Assert.assertNotNull(xPerfEvent52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strList56);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getQuery();
        accessEvent0.setStatus((int) (short) 100);
        accessEvent0.setStatus(100);
        accessEvent0.setHeaderUserToken("/tmp/xlog.reopen.txt");
        accessEvent0.setHost(" K[true,-1,hi!,hi!]");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        xLogRedisAppender0.addError("-");
        xLogRedisAppender0.start();
        boolean boolean5 = xLogRedisAppender0.isJsonMode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        int int1 = inputStream0.available();
        inputStream0.mark(1);
        boolean boolean4 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        int int1 = inputStream0.available();
        inputStream0.mark(1);
        java.io.InputStream inputStream4 = java.io.InputStream.nullInputStream();
        int int5 = inputStream4.available();
        inputStream4.mark(1);
        java.io.InputStream inputStream8 = java.io.InputStream.nullInputStream();
        int int9 = inputStream8.available();
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) -1, (byte) -1 };
        int int14 = inputStream8.read(byteArray13);
        int int15 = inputStream4.read(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = inputStream0.read(byteArray13, 30000, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [30000, 30000 + 35) out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, -1, -1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        boolean boolean1 = inputStream0.markSupported();
        byte[] byteArray3 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int6 = inputStream0.read(byteArray3, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [97, 97 + 100) out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100]");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        int int2 = inputStream1.available();
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) -1 };
        int int7 = inputStream1.read(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = inputStream0.readNBytes(byteArray6, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [-1, -1 + 35) out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender1 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean2 = xLogRedisAppender1.isJsonMode();
        java.util.ArrayList<java.lang.String> strList3 = xLogRedisAppender1.getHosts();
        accessEvent0.setHeaderVerInfo(strList3);
        accessEvent0.setHeaderUserToken("CLIENT_CERT");
        accessEvent0.setHost("X-Correlation-ID");
        java.lang.String str9 = net.landzero.xlog.utils.Strings.normalizeKeyword((java.lang.Object) "X-Correlation-ID");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "X-Correlation-ID" + "'", str9, "X-Correlation-ID");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder0 = new net.landzero.xlog.mybatis.TrackEventBuilder();
        trackEventBuilder0.commit();
        java.lang.Throwable throwable2 = null;
        net.landzero.xlog.mybatis.TrackEventBuilder trackEventBuilder3 = trackEventBuilder0.setThrowable(throwable2);
        org.junit.Assert.assertNotNull(trackEventBuilder3);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        java.lang.String str1 = trackEvent0.getMethod();
        java.lang.String str2 = trackEvent0.topic();
        java.lang.String str3 = trackEvent0.getSqlDigest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x-mybatis-track" + "'", str2, "x-mybatis-track");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        net.landzero.xlog.logback.XLogFileAppender xLogFileAppender0 = new net.landzero.xlog.logback.XLogFileAppender();
        java.lang.String str1 = xLogFileAppender0.getFilename();
        int int2 = xLogFileAppender0.getRotate();
        int int3 = xLogFileAppender0.getRotate();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("20231026", "-");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent3 = xPerfEventBuilder2.build();
        java.lang.String str4 = xPerfEvent3.topic();
        xPerfEvent3.setAction("CLIENT_CERT");
        java.lang.String str7 = xPerfEvent3.topic();
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder10 = new net.landzero.xlog.perf.XPerfEventBuilder("20231026", "-");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent11 = xPerfEventBuilder10.build();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent12 = xPerfEventBuilder10.build();
        net.landzero.xlog.http.AccessEvent accessEvent13 = new net.landzero.xlog.http.AccessEvent();
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender14 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean15 = xLogRedisAppender14.isJsonMode();
        java.util.ArrayList<java.lang.String> strList16 = xLogRedisAppender14.getHosts();
        accessEvent13.setHeaderVerInfo(strList16);
        xPerfEvent12.setArguments((java.util.List<java.lang.String>) strList16);
        xPerfEvent3.setArguments((java.util.List<java.lang.String>) strList16);
        net.landzero.xlog.http.AccessEvent accessEvent20 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str21 = accessEvent20.getQuery();
        accessEvent20.setStatus((int) (short) 100);
        java.lang.String str24 = accessEvent20.getQuery();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent25 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str26 = xPerfEvent25.getPathDigest();
        xPerfEvent25.setDuration((long) (short) 100);
        long long29 = xPerfEvent25.getDuration();
        net.landzero.xlog.perf.XPerfEvent xPerfEvent30 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str31 = xPerfEvent30.getPathDigest();
        java.lang.String str32 = xPerfEvent30.getCrid();
        java.lang.String[] strArray48 = new java.lang.String[] { "X-Correlation-ID", "_json_", "FORM", " K[true,-1,hi!,hi!]", "", "CLIENT_CERT", " K[10,-1.0,10,-1,-1.0]", "net.landzero.xlog.logback.XLogRedisAppender[null]", "X-Correlation-ID", "CRID_-_", "ff", "", "CRID[-]", "X-Correlation-ID", "71c609df539c50766146d8d2ed1f5715" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        xPerfEvent30.setArguments((java.util.List<java.lang.String>) strList49);
        xPerfEvent25.setArguments((java.util.List<java.lang.String>) strList49);
        accessEvent20.setHeaderVerInfo(strList49);
        xPerfEvent3.setArguments((java.util.List<java.lang.String>) strList49);
        org.junit.Assert.assertNotNull(xPerfEvent3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "x-perf" + "'", str4, "x-perf");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "x-perf" + "'", str7, "x-perf");
        org.junit.Assert.assertNotNull(xPerfEvent11);
        org.junit.Assert.assertNotNull(xPerfEvent12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        java.util.ArrayList<java.lang.String> strList2 = xLogRedisAppender0.getHosts();
        boolean boolean3 = xLogRedisAppender0.isJsonMode();
        xLogRedisAppender0.setProject("crid");
        java.lang.Throwable throwable7 = null;
        xLogRedisAppender0.addWarn("X-Correlation-ID", throwable7);
        xLogRedisAppender0.addWarn("xlog.Event");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        java.util.ArrayList<java.lang.String> strList2 = xLogRedisAppender0.getHosts();
        boolean boolean3 = xLogRedisAppender0.isJsonMode();
        java.lang.String str4 = xLogRedisAppender0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "net.landzero.xlog.logback.XLogRedisAppender[null]" + "'", str4, "net.landzero.xlog.logback.XLogRedisAppender[null]");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder2 = new net.landzero.xlog.perf.XPerfEventBuilder("20231026", "-");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent3 = xPerfEventBuilder2.build();
        xPerfEventBuilder2.commit();
        xPerfEventBuilder2.commit();
        org.junit.Assert.assertNotNull(xPerfEvent3);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder3 = new net.landzero.xlog.perf.XPerfEventBuilder("20231026", "-");
        xPerfEventBuilder3.commit();
        xPerfEventBuilder3.commit();
        java.lang.Object[] objArray12 = new java.lang.Object[] { true, (short) -1, "hi!", "hi!" };
        java.lang.String str13 = net.landzero.xlog.XLog.keyword(objArray12);
        java.lang.String str14 = net.landzero.xlog.XLog.keyword(objArray12);
        net.landzero.xlog.XLogCommitter xLogCommitter15 = net.landzero.xlog.perf.XPerf.create("CLIENT_CERT", objArray12);
        java.lang.String str16 = net.landzero.xlog.XLog.keyword(objArray12);
        net.landzero.xlog.perf.XPerfEventBuilder xPerfEventBuilder17 = xPerfEventBuilder3.setCommand("FORM", objArray12);
        net.landzero.xlog.XLogCommitter xLogCommitter18 = net.landzero.xlog.perf.XPerf.create("[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n", objArray12);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[true, -1, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[true, -1, hi!, hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " K[true,-1,hi!,hi!]" + "'", str13, " K[true,-1,hi!,hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " K[true,-1,hi!,hi!]" + "'", str14, " K[true,-1,hi!,hi!]");
        org.junit.Assert.assertNotNull(xLogCommitter15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " K[true,-1,hi!,hi!]" + "'", str16, " K[true,-1,hi!,hi!]");
        org.junit.Assert.assertNotNull(xPerfEventBuilder17);
        org.junit.Assert.assertNotNull(xLogCommitter18);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        net.landzero.xlog.logback.XLogRedisAppender xLogRedisAppender0 = new net.landzero.xlog.logback.XLogRedisAppender();
        boolean boolean1 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.Status status2 = null;
        xLogRedisAppender0.addStatus(status2);
        boolean boolean4 = xLogRedisAppender0.isJsonMode();
        ch.qos.logback.core.status.Status status5 = null;
        xLogRedisAppender0.addStatus(status5);
        xLogRedisAppender0.stop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        net.landzero.xlog.utils.IntervalChecker intervalChecker1 = new net.landzero.xlog.utils.IntervalChecker(1L);
        boolean boolean2 = intervalChecker1.check();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        net.landzero.xlog.http.XLogFilter xLogFilter0 = new net.landzero.xlog.http.XLogFilter();
        javax.servlet.FilterConfig filterConfig1 = null;
        xLogFilter0.init(filterConfig1);
        xLogFilter0.destroy();
        javax.servlet.ServletRequest servletRequest4 = null;
        javax.servlet.ServletResponse servletResponse5 = null;
        javax.servlet.FilterChain filterChain6 = null;
        // The following exception was thrown during execution in test generation
        try {
            xLogFilter0.doFilter(servletRequest4, servletResponse5, filterChain6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.toString()\" because \"request\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        net.landzero.xlog.logback.XLogFileAppender xLogFileAppender0 = new net.landzero.xlog.logback.XLogFileAppender();
        java.lang.String str1 = xLogFileAppender0.getFilename();
        int int2 = xLogFileAppender0.getRotate();
        xLogFileAppender0.clearAllFilters();
        int int4 = xLogFileAppender0.getRotate();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        net.landzero.xlog.XLog.appendEvent(accessEvent0);
        java.lang.String[] strArray35 = new java.lang.String[] { "96a3be3cf272e017046d1b2674a52bd3", "DIGEST", "_json_", "_json_", "CRID_-_", "hi!", "FORM", "_json_", "X-Correlation-ID", "DIGEST", "FORM", "CRID[-]", "20231026", "FORM", "96a3be3cf272e017046d1b2674a52bd3", "x-mybatis-track", "plain", "DIGEST", "BASIC", "xlog.Event", "null", "", "xlog.Event", "X-Correlation-ID", "CLIENT_CERT", "96a3be3cf272e017046d1b2674a52bd3", "0", "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n", "/tmp/xlog.reopen.txt", "x-perf", "FORM", "xlog.Event", "ff" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        accessEvent0.setHeaderVerInfo(strList36);
        java.lang.String str39 = net.landzero.xlog.utils.Strings.normalizeKeyword((java.lang.Object) accessEvent0);
        net.landzero.xlog.perf.XPerfEvent xPerfEvent40 = new net.landzero.xlog.perf.XPerfEvent();
        java.util.List<java.lang.String> strList41 = xPerfEvent40.getArguments();
        java.lang.String[] strArray64 = new java.lang.String[] { "crid", "FORM", "e8b502965b188446", "/tmp/xlog.reopen.txt", "null", "CLIENT_CERT", "CLIENT_CERT", "plain", "71c609df539c50766146d8d2ed1f5715", "BASIC", "_json_", " K[true,-1,hi!,hi!]", "hi!", "x-mybatis-track", "hi!", "CRID[-]", "", "x-mybatis-track", "e8b502965b188446", "x-perf", "cridMark", " K[true,-1,hi!,hi!]" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        xPerfEvent40.setArguments((java.util.List<java.lang.String>) strList65);
        accessEvent0.setHeaderAppInfo(strList65);
        long long69 = accessEvent0.getDuration();
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(strList41);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        net.landzero.xlog.http.AccessEvent accessEvent0 = new net.landzero.xlog.http.AccessEvent();
        java.lang.String str1 = accessEvent0.getQuery();
        accessEvent0.setStatus((int) (short) 100);
        accessEvent0.setHeaderUserToken("CRID_-_");
        accessEvent0.setQuery("ff");
        accessEvent0.setStatus((int) '4');
        accessEvent0.setHost("CRID[-]");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent12 = new net.landzero.xlog.perf.XPerfEvent();
        java.util.List<java.lang.String> strList13 = xPerfEvent12.getArguments();
        java.lang.String[] strArray36 = new java.lang.String[] { "crid", "FORM", "e8b502965b188446", "/tmp/xlog.reopen.txt", "null", "CLIENT_CERT", "CLIENT_CERT", "plain", "71c609df539c50766146d8d2ed1f5715", "BASIC", "_json_", " K[true,-1,hi!,hi!]", "hi!", "x-mybatis-track", "hi!", "CRID[-]", "", "x-mybatis-track", "e8b502965b188446", "x-perf", "cridMark", " K[true,-1,hi!,hi!]" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        xPerfEvent12.setArguments((java.util.List<java.lang.String>) strList37);
        accessEvent0.setHeaderAppInfo(strList37);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList13);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPathDigest();
        java.lang.String str2 = xPerfEvent0.getCrid();
        java.lang.String[] strArray18 = new java.lang.String[] { "X-Correlation-ID", "_json_", "FORM", " K[true,-1,hi!,hi!]", "", "CLIENT_CERT", " K[10,-1.0,10,-1,-1.0]", "net.landzero.xlog.logback.XLogRedisAppender[null]", "X-Correlation-ID", "CRID_-_", "ff", "", "CRID[-]", "X-Correlation-ID", "71c609df539c50766146d8d2ed1f5715" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        xPerfEvent0.setArguments((java.util.List<java.lang.String>) strList19);
        xPerfEvent0.setDuration((long) 100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 10, (-1.0d), 10, (-1L), (-1.0d) };
        java.lang.String str8 = net.landzero.xlog.XLog.keyword(objArray7);
        net.landzero.xlog.XLogCommitter xLogCommitter9 = net.landzero.xlog.perf.XPerf.create("BASIC", objArray7);
        net.landzero.xlog.XLogCommitter xLogCommitter10 = net.landzero.xlog.perf.XPerf.create("", objArray7);
        xLogCommitter10.commit();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, -1.0, 10, -1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, -1.0, 10, -1, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " K[10,-1.0,10,-1,-1.0]" + "'", str8, " K[10,-1.0,10,-1,-1.0]");
        org.junit.Assert.assertNotNull(xLogCommitter9);
        org.junit.Assert.assertNotNull(xLogCommitter10);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        java.lang.String str1 = trackEvent0.getSqlDigest();
        trackEvent0.setCrid("0");
        trackEvent0.setError("FORM");
        java.lang.String str6 = trackEvent0.getError();
        java.lang.String str7 = trackEvent0.topic();
        trackEvent0.setError("01");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FORM" + "'", str6, "FORM");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "x-mybatis-track" + "'", str7, "x-mybatis-track");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.util.List<java.lang.String> strList1 = xPerfEvent0.getArguments();
        java.lang.String str2 = xPerfEvent0.topic();
        java.lang.String str3 = xPerfEvent0.getMethodName();
        xPerfEvent0.setPathDigest("0");
        net.landzero.xlog.http.AccessEvent accessEvent6 = new net.landzero.xlog.http.AccessEvent();
        net.landzero.xlog.XLog.appendEvent(accessEvent6);
        java.lang.String[] strArray41 = new java.lang.String[] { "96a3be3cf272e017046d1b2674a52bd3", "DIGEST", "_json_", "_json_", "CRID_-_", "hi!", "FORM", "_json_", "X-Correlation-ID", "DIGEST", "FORM", "CRID[-]", "20231026", "FORM", "96a3be3cf272e017046d1b2674a52bd3", "x-mybatis-track", "plain", "DIGEST", "BASIC", "xlog.Event", "null", "", "xlog.Event", "X-Correlation-ID", "CLIENT_CERT", "96a3be3cf272e017046d1b2674a52bd3", "0", "[%d{yyyy/MM/dd HH:mm:ss.SSS}] %msg%n", "/tmp/xlog.reopen.txt", "x-perf", "FORM", "xlog.Event", "ff" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        accessEvent6.setHeaderVerInfo(strList42);
        xPerfEvent0.setArguments((java.util.List<java.lang.String>) strList42);
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x-perf" + "'", str2, "x-perf");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        boolean boolean1 = net.landzero.xlog.utils.Strings.isEmpty("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        inputStream0.close();
        boolean boolean2 = inputStream0.markSupported();
        boolean boolean3 = inputStream0.markSupported();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPathDigest();
        java.lang.String str2 = xPerfEvent0.getCrid();
        xPerfEvent0.setClassName("-");
        java.util.Date date5 = xPerfEvent0.getTimestamp();
        java.lang.String str6 = xPerfEvent0.getClassName();
        java.lang.String str7 = xPerfEvent0.getAction();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        int int1 = inputStream0.available();
        inputStream0.mark(1);
        long long5 = inputStream0.skip((long) (byte) 10);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int12 = inputStream0.readNBytes(byteArray9, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [1, 1 + 100) out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 0, 1]");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setRawSql("null");
        long long3 = trackEvent0.getDuration();
        trackEvent0.setDatabaseUrl("BASIC");
        trackEvent0.setMethod("plain");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        net.landzero.xlog.http.AccessEventBuilder accessEventBuilder0 = new net.landzero.xlog.http.AccessEventBuilder();
        net.landzero.xlog.http.AccessEvent accessEvent1 = accessEventBuilder0.build();
        long long2 = accessEvent1.getDuration();
        org.junit.Assert.assertNotNull(accessEvent1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        net.landzero.xlog.http.XLogFilter xLogFilter0 = new net.landzero.xlog.http.XLogFilter();
        javax.servlet.FilterConfig filterConfig1 = null;
        xLogFilter0.init(filterConfig1);
        javax.servlet.ServletRequest servletRequest3 = null;
        javax.servlet.ServletResponse servletResponse4 = null;
        javax.servlet.FilterChain filterChain5 = null;
        // The following exception was thrown during execution in test generation
        try {
            xLogFilter0.doFilter(servletRequest3, servletResponse4, filterChain5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.toString()\" because \"request\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        net.landzero.xlog.XLog.setPath("crid");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.landzero.xlog.XLogCommitter xLogCommitter2 = net.landzero.xlog.perf.XPerf.create("_json_", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"array\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        net.landzero.xlog.mybatis.TrackEvent trackEvent0 = new net.landzero.xlog.mybatis.TrackEvent();
        trackEvent0.setRawSql("null");
        trackEvent0.setMethod("BASIC");
        trackEvent0.setDuration(1L);
        java.lang.String str7 = trackEvent0.getTopic();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "x-mybatis-track" + "'", str7, "x-mybatis-track");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        java.lang.String str1 = net.landzero.xlog.utils.Hex.md5("e8b502965b188446");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "d5b5e71f721236a14ace01348a26cdbc" + "'", str1, "d5b5e71f721236a14ace01348a26cdbc");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPathDigest();
        java.lang.String str2 = xPerfEvent0.getCrid();
        java.lang.String[] strArray18 = new java.lang.String[] { "X-Correlation-ID", "_json_", "FORM", " K[true,-1,hi!,hi!]", "", "CLIENT_CERT", " K[10,-1.0,10,-1,-1.0]", "net.landzero.xlog.logback.XLogRedisAppender[null]", "X-Correlation-ID", "CRID_-_", "ff", "", "CRID[-]", "X-Correlation-ID", "71c609df539c50766146d8d2ed1f5715" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        xPerfEvent0.setArguments((java.util.List<java.lang.String>) strList19);
        java.util.List<java.lang.String> strList22 = xPerfEvent0.getArguments();
        xPerfEvent0.setPath("71c609df539c50766146d8d2ed1f5715");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strList22);
    }
}
