package flaky; 

import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class RandoopTest{


    public static boolean debug = false;



    @Test

    public void test001() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test001");

        com.alipay.sofa.common.profile.diagnostic.Profiler.Message message0 = null;

        com.alipay.sofa.common.profile.diagnostic.Profiler.start(message0);

    }



    @Test

    public void test002() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test002");

        int int2 = com.alipay.sofa.common.utils.StringUtil.lastIndexOf("hi!", 'a');

        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));

    }



    @Test

    public void test003() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test003");

        boolean boolean2 = com.alipay.sofa.common.utils.StringUtil.containsOnly("hi!", "");

        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);

    }



    @Test

    public void test004() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test004");

        java.lang.String str1 = com.alipay.sofa.common.utils.ObjectUtil.toString((java.lang.Object) 10L);

        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10" + "'", str1, "10");

    }



    @Test

    public void test005() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test005");

        java.lang.String str2 = com.alipay.sofa.common.utils.StringUtil.trim("10", "");

        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");

    }



    @Test

    public void test006() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test006");

        java.lang.Class class0 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.profile.enumeration.Enum enum2 = com.alipay.sofa.common.profile.enumeration.EnumUtil.getEnumByName(class0, "");

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test007() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test007");

        boolean boolean0 = com.alipay.sofa.common.security.SensitiveDataUtil.needHide();

        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);

    }



    @Test

    public void test008() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test008");

        java.lang.String str3 = com.alipay.sofa.common.utils.StringUtil.substringBetween("", "10", "10");

        org.junit.Assert.assertNull(str3);

    }



    @Test

    public void test009() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test009");

        java.lang.String str0 = com.alipay.sofa.common.log.Constants.LOG_XML_CONFIG_FILE_NAME;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "log-conf.xml" + "'", str0, "log-conf.xml");

    }



    @Test

    public void test010() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test010");

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.utils.AssertUtil.isTrue(false, "10");

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

    }



    @Test

    public void test011() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test011");

        com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler sofaThreadPoolTaskScheduler1 = new com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler();

        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler2 = null;

        java.util.concurrent.TimeUnit timeUnit7 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor sofaScheduledThreadPoolExecutor8 = new com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor((int) (byte) 10, (java.util.concurrent.ThreadFactory) sofaThreadPoolTaskScheduler1, rejectedExecutionHandler2, "log-conf.xml", "", (long) (short) -1, (long) (byte) 10, timeUnit7);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test012() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test012");

        boolean boolean1 = com.alipay.sofa.common.utils.StringUtil.isAlpha("");

        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);

    }



    @Test

    public void test013() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test013");

        java.lang.String str3 = com.alipay.sofa.common.utils.StringUtil.mid("10", 10, (int) '4');

        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");

    }



    @Test

    public void test014() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test014");

        com.alipay.sofa.common.space.SpaceId spaceId0 = null;

        com.alipay.sofa.common.log.SpaceInfo spaceInfo1 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.log.factory.LoggerSpaceFactory4LogbackBuilder loggerSpaceFactory4LogbackBuilder2 = new com.alipay.sofa.common.log.factory.LoggerSpaceFactory4LogbackBuilder(spaceId0, spaceInfo1);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - this argument is required; it must not be null");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

    }



    @Test

    public void test015() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test015");

        java.lang.String str2 = com.alipay.sofa.common.utils.StringUtil.reverseDelimited("log-conf.xml", '#');

        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "log-conf.xml" + "'", str2, "log-conf.xml");

    }



    @Test

    public void test016() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test016");

        float[] floatArray5 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray6 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray5);

        int int8 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray5, (float) (short) 10);

        org.junit.Assert.assertNotNull(floatArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);

    }



    @Test

    public void test017() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test017");

        java.lang.String str1 = com.alipay.sofa.common.utils.ObjectUtil.identityToString((java.lang.Object) 10);

    }



    @Test

    public void test018() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test018");

        com.alipay.sofa.common.log.SpaceId spaceId0 = null;

        // The following exception was thrown during execution in test generation

        try {

            boolean boolean1 = com.alipay.sofa.common.log.MultiAppLoggerSpaceManager.isSpaceInitialized(spaceId0);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test019() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test019");

        com.alipay.sofa.common.space.SpaceId spaceId0 = null;

        com.alipay.sofa.common.log.LogSpace logSpace1 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.log.factory.LoggerSpaceFactory4Log4jBuilder loggerSpaceFactory4Log4jBuilder2 = new com.alipay.sofa.common.log.factory.LoggerSpaceFactory4Log4jBuilder(spaceId0, logSpace1);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - this argument is required; it must not be null");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

    }



    @Test

    public void test020() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test020");

        java.lang.Throwable throwable1 = null;

        com.alipay.sofa.common.utils.ReportUtil.reportError("10", throwable1);

    }



    @Test

    public void test021() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test021");

        short[] shortArray0 = null;

        short[] shortArray5 = new short[] { (byte) 1, (byte) -1, (byte) 10, (byte) 100 };

        short[] shortArray10 = new short[] { (short) -1, (short) -1, (byte) 10, (byte) 10 };

        int int12 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(shortArray5, shortArray10, (int) (byte) 100);

        int int13 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(shortArray0, shortArray10);

        org.junit.Assert.assertNotNull(shortArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, -1, 10, 100]");

        org.junit.Assert.assertNotNull(shortArray10);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[-1, -1, 10, 10]");

        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));

        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));

    }



    @Test

    public void test022() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test022");

        java.lang.Class class0 = null;

        java.lang.Class class1 = null;

        boolean boolean2 = com.alipay.sofa.common.utils.ClassUtil.isAssignable(class0, class1);

        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);

    }



    @Test

    public void test023() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test023");

        int int0 = com.alipay.sofa.common.log.Constants.DEFAULT_PRIORITY;

        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);

    }



    @Test

    public void test024() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test024");

        java.lang.String str3 = com.alipay.sofa.common.utils.StringUtil.abbreviate("10", (int) 'a', (int) '#');

        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");

    }



    @Test

    public void test025() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test025");

        java.lang.String str2 = com.alipay.sofa.common.profile.diagnostic.Profiler.dump("10", "hi!");

// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");

    }



    @Test

    public void test026() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test026");

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.log.adapter.level.AdapterLevel adapterLevel1 = com.alipay.sofa.common.log.adapter.level.AdapterLevel.getAdapterLevel("");

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Input Param of AdapterLevel Type can't be blank!");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

    }



    @Test

    public void test027() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test027");

        com.alipay.sofa.common.profile.diagnostic.Profiler.reset();

    }



    @Test

    public void test028() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test028");

        java.lang.Class class0 = null;

        java.lang.String str1 = com.alipay.sofa.common.utils.ClassUtil.getPackageName(class0);

        org.junit.Assert.assertNull(str1);

    }



    @Test

    public void test029() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test029");

        java.lang.String str0 = com.alipay.sofa.common.log.Constants.SOFA_MIDDLEWARE_SINGLE_LOG_CONSOLE_LEVEL;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "sofa.middleware.log.%s.console.level" + "'", str0, "sofa.middleware.log.%s.console.level");

    }



    @Test

    public void test030() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test030");

        java.util.Collection collection0 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.utils.AssertUtil.notEmpty(collection0, "");

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

    }



    @Test

    public void test031() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test031");

        java.lang.String str0 = com.alipay.sofa.common.profile.enumeration.internal.EnumConstant.FLAT_SET_VALUE_IS_NULL;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "FlagSet value must not be null" + "'", str0, "FlagSet value must not be null");

    }



    @Test

    public void test032() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test032");

        com.alipay.sofa.common.space.SpaceId spaceId0 = null;

        org.slf4j.ILoggerFactory iLoggerFactory1 = com.alipay.sofa.common.log.LoggerSpaceManager.removeILoggerFactoryBySpaceId(spaceId0);

        org.junit.Assert.assertNull(iLoggerFactory1);

    }



    @Test

    public void test033() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test033");

        int int0 = com.alipay.sofa.common.utils.Ordered.HIGHEST_PRECEDENCE;

        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2147483648) + "'", int0 == (-2147483648));

    }



    @Test

    public void test034() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test034");

        java.lang.String[] strArray1 = new java.lang.String[] {};

        java.util.concurrent.ThreadFactory threadFactory2 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.config.ConfigKey<java.util.concurrent.ThreadFactory> threadFactoryConfigKey5 = new com.alipay.sofa.common.config.ConfigKey<java.util.concurrent.ThreadFactory>("hi!", strArray1, threadFactory2, true, "log-conf.xml");

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"defaultValue\" of ConfigKey cannot be null,please check it");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(strArray1);

    }



    @Test

    public void test035() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test035");

        com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler sofaThreadPoolTaskScheduler1 = new com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler();

        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler2 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor sofaScheduledThreadPoolExecutor3 = new com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor((-1), (java.util.concurrent.ThreadFactory) sofaThreadPoolTaskScheduler1, rejectedExecutionHandler2);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

    }



    @Test

    public void test036() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test036");

        java.lang.ClassLoader classLoader1 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.log.proxy.TemporaryILoggerFactory temporaryILoggerFactory2 = com.alipay.sofa.common.log.proxy.TemporaryILoggerFactoryPool.get("log-conf.xml", classLoader1);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - this argument is required; it must not be null");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

    }



    @Test

    public void test037() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test037");

        java.lang.String str4 = com.alipay.sofa.common.utils.StringUtil.overlay("10", "log-conf.xml", 0, 5);

        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "log-conf.xml" + "'", str4, "log-conf.xml");

    }



    @Test

    public void test038() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test038");

        java.lang.Class class1 = null;

        java.net.URL[] uRLArray2 = com.alipay.sofa.common.utils.ClassLoaderUtil.whichClasses("10", class1);

        org.junit.Assert.assertNotNull(uRLArray2);

    }



    @Test

    public void test039() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test039");

        com.alipay.sofa.common.space.SpaceId spaceId0 = null;

        java.lang.ClassLoader classLoader1 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.log.proxy.TemporaryILoggerFactory temporaryILoggerFactory2 = com.alipay.sofa.common.log.proxy.TemporaryILoggerFactoryPool.get(spaceId0, classLoader1);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - this argument is required; it must not be null");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

    }



    @Test

    public void test040() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test040");

        java.lang.Class class0 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.profile.enumeration.Enum enum2 = com.alipay.sofa.common.profile.enumeration.EnumUtil.getEnumByValue(class0, (java.lang.Number) 5);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test041() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test041");

        long[] longArray0 = new long[] {};

        long[] longArray7 = new long[] { (byte) 10, (-1), 0L, 0L, (short) 0, (short) 1 };

        int int9 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(longArray0, longArray7, 100);

        long[] longArray10 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfEmpty(longArray0);

        com.alipay.sofa.common.utils.ArrayUtil.reverse(longArray10);

        org.junit.Assert.assertNotNull(longArray0);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");

        org.junit.Assert.assertNotNull(longArray7);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[10, -1, 0, 0, 0, 1]");

        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));

        org.junit.Assert.assertNotNull(longArray10);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[]");

    }



    @Test

    public void test042() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test042");

        int int0 = com.alipay.sofa.common.profile.enumeration.internal.NumberType.RADIX_OCT;

        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);

    }



    @Test

    public void test043() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test043");

        java.lang.Class class0 = null;

        java.lang.String str1 = com.alipay.sofa.common.utils.ClassUtil.getClassNameAsResource(class0);

        org.junit.Assert.assertNull(str1);

    }



    @Test

    public void test044() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test044");

        com.alipay.sofa.common.config.source.SystemEnvConfigSource systemEnvConfigSource0 = new com.alipay.sofa.common.config.source.SystemEnvConfigSource();

        com.google.common.cache.CacheBuilder<java.lang.String, java.lang.String> strCacheBuilder1 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.config.source.ConfigSourceCacheWrapper configSourceCacheWrapper2 = new com.alipay.sofa.common.config.source.ConfigSourceCacheWrapper((com.alipay.sofa.common.config.source.AbstractConfigSource) systemEnvConfigSource0, strCacheBuilder1);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test045() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test045");

        java.lang.String str1 = com.alipay.sofa.common.security.SensitiveDataUtil.alipayLogonIdHide("10");

        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10" + "'", str1, "10");

    }



    @Test

    public void test046() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test046");

        boolean boolean1 = com.alipay.sofa.common.utils.StringUtil.isNumeric("FlagSet value must not be null");

        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);

    }



    @Test

    public void test047() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test047");

        java.lang.String str0 = com.alipay.sofa.common.log.Constants.LOG_CONFIG_PREFIX;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "logging.config." + "'", str0, "logging.config.");

    }



    @Test

    public void test048() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test048");

        java.lang.String str1 = com.alipay.sofa.common.utils.StringUtil.toCamelCase("AdapterLevel{logLevelMsg='info'}");

        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "adapterLevel{logLevelMsg='info'}" + "'", str1, "adapterLevel{logLevelMsg='info'}");

    }



    @Test

    public void test049() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test049");

        java.net.URL uRL0 = null;

        // The following exception was thrown during execution in test generation

        try {

            java.io.File file2 = com.alipay.sofa.common.utils.ResourceUtil.getFile(uRL0, "\u63a7\u5236\u7ebf\u7a0b\u4fe1\u606f\u6253\u5370\u95f4\u9694");

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Resource URL must not be null");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

    }



    @Test

    public void test050() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test050");

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.utils.AssertUtil.isTrue(false, "FlagSet value must not be null");

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: FlagSet value must not be null");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

    }



    @Test

    public void test051() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test051");

        java.util.Collection collection0 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.utils.AssertUtil.notEmpty(collection0);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - this collection must not be empty: it must contain at least 1 element");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

    }



    @Test

    public void test052() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test052");

        com.alipay.sofa.common.space.SpaceId spaceId0 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.code.LogCode2Description logCode2Description1 = com.alipay.sofa.common.code.LogCode2Description.create(spaceId0);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test053() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test053");

        java.lang.String str0 = com.alipay.sofa.common.log.Constants.SOFA_MIDDLEWARE_LOG_INTERNAL_LEVEL;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "sofa.middleware.log.internal.level" + "'", str0, "sofa.middleware.log.internal.level");

    }



    @Test

    public void test054() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test054");

        java.lang.String str0 = com.alipay.sofa.common.profile.enumeration.internal.EnumConstant.FLAG_SET_INNER_CLASS_NAME;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "FlagSet" + "'", str0, "FlagSet");

    }



    @Test

    public void test055() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test055");

        java.net.URL[] uRLArray1 = com.alipay.sofa.common.utils.ClassLoaderUtil.whichClasses("FlagSet");

        org.junit.Assert.assertNotNull(uRLArray1);

    }



    @Test

    public void test056() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test056");

        java.lang.Class class1 = null;

        // The following exception was thrown during execution in test generation

        try {

            java.lang.Object obj2 = com.alipay.sofa.common.utils.ClassLoaderUtil.newServiceInstance("sofa.middleware.log.internal.level", class1);

            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Could not find META-INF/services/sofa.middleware.log.internal.level");

        } catch (java.lang.RuntimeException e) {

            // Expected exception.

        }

    }



    @Test

    public void test057() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test057");

        java.lang.String str0 = com.alipay.sofa.common.profile.enumeration.internal.EnumConstant.ENUM_VALUE_IS_NULL;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "The Enum value must not be null" + "'", str0, "The Enum value must not be null");

    }



    @Test

    public void test058() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test058");

        java.util.Iterator iterator0 = null;

        java.lang.String str2 = com.alipay.sofa.common.utils.StringUtil.join(iterator0, '#');

        org.junit.Assert.assertNull(str2);

    }



    @Test

    public void test059() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test059");

        java.lang.String str2 = com.alipay.sofa.common.utils.StringUtil.trimEnd("", "log-conf.xml");

        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");

    }



    @Test

    public void test060() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test060");

        int[] intArray3 = new int[] { (short) 10, '4', (byte) 0 };

        int[] intArray6 = new int[] { (byte) 1, (byte) 1 };

        boolean boolean7 = com.alipay.sofa.common.utils.ArrayUtil.contains(intArray3, intArray6);

        boolean boolean9 = com.alipay.sofa.common.utils.ArrayUtil.contains(intArray6, (int) (short) 0);

        com.alipay.sofa.common.utils.AssertUtil.notNull((java.lang.Object) intArray6, "FlagSet");

        org.junit.Assert.assertNotNull(intArray3);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 52, 0]");

        org.junit.Assert.assertNotNull(intArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");

        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);

        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);

    }



    @Test

    public void test061() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test061");

        java.lang.ClassLoader classLoader2 = null;

        // The following exception was thrown during execution in test generation

        try {

            org.slf4j.Logger logger3 = com.alipay.sofa.common.log.LoggerSpaceManager.getLoggerBySpace("logging.config.", "logging.config.", classLoader2);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - this argument is required; it must not be null");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

    }



    @Test

    public void test062() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test062");

        boolean boolean0 = com.alipay.sofa.common.log.Constants.LOG4J_MIDDLEWARE_LOG_DISABLE;

        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);

    }



    @Test

    public void test063() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test063");

        java.lang.ClassLoader classLoader1 = null;

        // The following exception was thrown during execution in test generation

        try {

            java.lang.Object obj2 = com.alipay.sofa.common.utils.ClassLoaderUtil.newInstance("AdapterLevel{logLevelMsg='info'}", classLoader1);

            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: AdapterLevel{logLevelMsg='info'}");

        } catch (java.lang.ClassNotFoundException e) {

            // Expected exception.

        }

    }



    @Test

    public void test064() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test064");

        java.lang.String str1 = com.alipay.sofa.common.utils.ClassUtil.getClassNameAsResource("adapterLevel{logLevelMsg='info'}");

        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "adapterLevel{logLevelMsg='info'}.class" + "'", str1, "adapterLevel{logLevelMsg='info'}.class");

    }



    @Test

    public void test065() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test065");

        java.lang.String str2 = com.alipay.sofa.common.utils.StringUtil.center("FlagSet value must not be null", 5);

        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FlagSet value must not be null" + "'", str2, "FlagSet value must not be null");

    }



    @Test

    public void test066() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test066");

        com.alipay.sofa.common.config.DefaultConfigManager defaultConfigManager2 = new com.alipay.sofa.common.config.DefaultConfigManager((long) (short) 0, (long) 8);

    }



    @Test

    public void test067() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test067");

        com.alipay.sofa.common.utils.AssertUtil.state(true);

    }



    @Test

    public void test068() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test068");

        boolean boolean2 = com.alipay.sofa.common.utils.StringUtil.contains("log-conf.xml", '#');

        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);

    }



    @Test

    public void test069() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test069");

        java.lang.String str4 = com.alipay.sofa.common.utils.StringUtil.replace("FlagSet value must not be null", "sofa.middleware.log.%s.console.level", "logging.config.", 0);

        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FlagSet value must not be null" + "'", str4, "FlagSet value must not be null");

    }



    @Test

    public void test070() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test070");

        java.util.Map map0 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.utils.AssertUtil.notEmpty(map0, "10");

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

    }



    @Test

    public void test071() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test071");

        int int0 = com.alipay.sofa.common.security.SensitiveDataUtil.PHONENO_DATA;

        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);

    }



    @Test

    public void test072() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test072");

        com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler sofaThreadPoolTaskScheduler0 = new com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler();

        java.lang.Runnable runnable1 = null;

        // The following exception was thrown during execution in test generation

        try {

            org.springframework.util.concurrent.ListenableFuture<?> wildcardListenableFuture2 = sofaThreadPoolTaskScheduler0.submitListenable(runnable1);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ThreadPoolTaskScheduler not initialized");

        } catch (java.lang.IllegalStateException e) {

            // Expected exception.

        }

    }



    @Test

    public void test073() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test073");

        java.lang.Class class0 = null;

        // The following exception was thrown during execution in test generation

        try {

            boolean boolean2 = com.alipay.sofa.common.profile.enumeration.EnumUtil.isValueDefined(class0, (java.lang.Number) (short) 10);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test074() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test074");

        java.net.URL uRL1 = com.alipay.sofa.common.utils.ClassLoaderUtil.whichClass("sofa.middleware.log.internal.level");

        org.junit.Assert.assertNull(uRL1);

    }



    @Test

    public void test075() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test075");

        com.alipay.sofa.common.space.SpaceId spaceId0 = null;

        com.alipay.sofa.common.log.LogSpace logSpace1 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.log.factory.LoggerSpaceFactory4CommonsLoggingBuilder loggerSpaceFactory4CommonsLoggingBuilder2 = new com.alipay.sofa.common.log.factory.LoggerSpaceFactory4CommonsLoggingBuilder(spaceId0, logSpace1);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - this argument is required; it must not be null");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

    }



    @Test

    public void test076() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test076");

        java.lang.String str0 = com.alipay.sofa.common.log.Constants.LOG_START;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "*" + "'", str0, "*");

    }



    @Test

    public void test077() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test077");

        com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel messageLevel0 = com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel.BRIEF_MESSAGE;

        long long1 = messageLevel0.longValue();

        org.junit.Assert.assertNotNull(messageLevel0);

        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);

    }



    @Test

    public void test078() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test078");

        java.lang.String str0 = com.alipay.sofa.common.log.Constants.LOG_ENV_SUFFIX;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "log.env.suffix" + "'", str0, "log.env.suffix");

    }



    @Test

    public void test079() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test079");

        com.alipay.sofa.common.space.SpaceId spaceId0 = null;

        org.slf4j.ILoggerFactory iLoggerFactory1 = com.alipay.sofa.common.log.MultiAppLoggerSpaceManager.removeILoggerFactoryBySpaceId(spaceId0);

        org.junit.Assert.assertNull(iLoggerFactory1);

    }



    @Test

    public void test080() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test080");

        boolean[] booleanArray0 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_BOOLEAN_ARRAY;

        int int2 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(booleanArray0, false);

        org.junit.Assert.assertNotNull(booleanArray0);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");

        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));

    }



    @Test

    public void test081() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test081");

        com.alipay.sofa.common.utils.ObjectUtil objectUtil0 = new com.alipay.sofa.common.utils.ObjectUtil();

    }



    @Test

    public void test082() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test082");

        int int2 = com.alipay.sofa.common.utils.StringUtil.getLevenshteinDistance("10", "sofa.middleware.log.%s.console.level");

        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);

    }



    @Test

    public void test083() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test083");

        java.lang.String str2 = com.alipay.sofa.common.utils.StringUtil.center("\u63a7\u5236\u7ebf\u7a0b\u4fe1\u606f\u6253\u5370\u95f4\u9694", (int) '#');

// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u63a7\u5236\u7ebf\u7a0b\u4fe1\u606f\u6253\u5370\u95f4\u9694             " + "'", str2, "\u63a7\u5236\u7ebf\u7a0b\u4fe1\u606f\u6253\u5370\u95f4\u9694             ");

    }



    @Test

    public void test084() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test084");

        java.lang.Class class1 = null;

        java.net.URL[] uRLArray2 = com.alipay.sofa.common.utils.ClassLoaderUtil.whichClasses("AdapterLevel{logLevelMsg='info'}", class1);

        org.junit.Assert.assertNotNull(uRLArray2);

    }



    @Test

    public void test085() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test085");

        java.lang.Object obj0 = null;

        com.alipay.sofa.common.utils.AssertUtil.isNull(obj0);

    }



    @Test

    public void test086() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test086");

        com.alipay.sofa.common.thread.ThreadPoolConfig.SofaThreadConfigBuilder sofaThreadConfigBuilder3 = com.alipay.sofa.common.thread.ThreadPoolConfig.newBuilder();

        com.alipay.sofa.common.thread.ThreadPoolConfig threadPoolConfig4 = sofaThreadConfigBuilder3.build();

        threadPoolConfig4.setTaskTimeoutMilli((long) (short) 0);

        java.util.concurrent.TimeUnit timeUnit7 = threadPoolConfig4.getTimeUnit();

        java.util.concurrent.BlockingQueue<java.lang.Runnable> runnableQueue8 = null;

        com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler sofaThreadPoolTaskScheduler9 = new com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler();

        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler10 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.thread.SofaThreadPoolExecutor sofaThreadPoolExecutor13 = new com.alipay.sofa.common.thread.SofaThreadPoolExecutor((int) (byte) 0, 2, 10L, timeUnit7, runnableQueue8, (java.util.concurrent.ThreadFactory) sofaThreadPoolTaskScheduler9, rejectedExecutionHandler10, "The Enum value must not be null", "sofa.middleware.log.internal.level");

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(sofaThreadConfigBuilder3);

        org.junit.Assert.assertNotNull(threadPoolConfig4);

        org.junit.Assert.assertNotNull(timeUnit7);

    }



    @Test

    public void test087() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test087");

        com.alipay.sofa.common.thread.ThreadPoolConfig.SofaThreadConfigBuilder sofaThreadConfigBuilder3 = com.alipay.sofa.common.thread.ThreadPoolConfig.newBuilder();

        com.alipay.sofa.common.thread.ThreadPoolConfig threadPoolConfig4 = sofaThreadConfigBuilder3.build();

        threadPoolConfig4.setTaskTimeoutMilli((long) (short) 0);

        java.util.concurrent.TimeUnit timeUnit7 = threadPoolConfig4.getTimeUnit();

        java.util.concurrent.BlockingQueue<java.lang.Runnable> runnableQueue8 = null;

        com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler sofaThreadPoolTaskScheduler9 = new com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler();

        sofaThreadPoolTaskScheduler9.setThreadPoolName("FlagSet");

        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler12 = null;

        com.alipay.sofa.common.thread.ThreadPoolConfig.SofaThreadConfigBuilder sofaThreadConfigBuilder17 = com.alipay.sofa.common.thread.ThreadPoolConfig.newBuilder();

        com.alipay.sofa.common.thread.ThreadPoolConfig threadPoolConfig18 = sofaThreadConfigBuilder17.build();

        threadPoolConfig18.setTaskTimeoutMilli((long) (short) 0);

        java.util.concurrent.TimeUnit timeUnit21 = threadPoolConfig18.getTimeUnit();

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.thread.SofaThreadPoolExecutor sofaThreadPoolExecutor22 = new com.alipay.sofa.common.thread.SofaThreadPoolExecutor((int) ' ', 4, (long) (short) 10, timeUnit7, runnableQueue8, (java.util.concurrent.ThreadFactory) sofaThreadPoolTaskScheduler9, rejectedExecutionHandler12, "hi!", "adapterLevel{logLevelMsg='info'}", (long) 10, (-1L), timeUnit21);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(sofaThreadConfigBuilder3);

        org.junit.Assert.assertNotNull(threadPoolConfig4);

        org.junit.Assert.assertNotNull(timeUnit7);

        org.junit.Assert.assertNotNull(sofaThreadConfigBuilder17);

        org.junit.Assert.assertNotNull(threadPoolConfig18);

        org.junit.Assert.assertNotNull(timeUnit21);

    }



    @Test

    public void test088() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test088");

        boolean boolean1 = com.alipay.sofa.common.utils.StringUtil.isAlphanumericSpace("FlagSet");

        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);

    }



    @Test

    public void test089() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test089");

        java.lang.Class class0 = null;

        java.lang.String str1 = com.alipay.sofa.common.utils.ClassUtil.getClassName(class0);

        org.junit.Assert.assertNull(str1);

    }



    @Test

    public void test090() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test090");

        java.lang.String str0 = com.alipay.sofa.common.utils.ProcessIdUtil.DEFAULT_PROCESSID;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "-" + "'", str0, "-");

    }



    @Test

    public void test091() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test091");

        com.alipay.sofa.common.log.SpaceId spaceId1 = null;

        com.alipay.sofa.common.log.adapter.level.AdapterLevel adapterLevel2 = null;

        // The following exception was thrown during execution in test generation

        try {

            org.slf4j.Logger logger3 = com.alipay.sofa.common.log.LoggerSpaceManager.setLoggerLevel("sofa.middleware.log.internal.level", spaceId1, adapterLevel2);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test092() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test092");

        byte[] byteArray0 = null;

        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1 };

        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 1 };

        boolean boolean12 = com.alipay.sofa.common.utils.ArrayUtil.isEmpty(byteArray11);

        byte[] byteArray13 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfEmpty(byteArray5, byteArray11);

        int int14 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(byteArray0, byteArray13);

        org.junit.Assert.assertNotNull(byteArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 1, 1, 1]");

        org.junit.Assert.assertNotNull(byteArray11);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 100, 10, -1, 1]");

        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);

        org.junit.Assert.assertNotNull(byteArray13);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 1, 1, 1]");

        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));

    }



    @Test

    public void test093() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test093");

        java.lang.String str0 = com.alipay.sofa.common.profile.enumeration.internal.EnumConstant.ENUM_IS_NOT_A_FLAG;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "The Enum class \"{0}\" is not an implementation of Flags" + "'", str0, "The Enum class \"{0}\" is not an implementation of Flags");

    }



    @Test

    public void test094() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test094");

        java.lang.Class class0 = null;

        // The following exception was thrown during execution in test generation

        try {

            java.lang.Class class1 = com.alipay.sofa.common.profile.enumeration.EnumUtil.getUnderlyingClass(class0);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test095() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test095");

        com.alipay.sofa.common.tracer.TracerIdAdapter tracerIdAdapter0 = com.alipay.sofa.common.tracer.TracerIdAdapter.getInstance();

        java.lang.Thread thread1 = null;

        java.lang.String str2 = tracerIdAdapter0.traceIdSafari(thread1);

        org.junit.Assert.assertNotNull(tracerIdAdapter0);

        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "sampleTraceId" + "'", str2, "sampleTraceId");

    }



    @Test

    public void test096() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test096");

        org.slf4j.Logger logger0 = com.alipay.sofa.common.config.log.ConfigLoggerFactory.CONFIG_COMMON_DIGEST_LOGGER;

        org.junit.Assert.assertNotNull(logger0);

    }



    @Test

    public void test097() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test097");

        java.lang.String str3 = com.alipay.sofa.common.utils.StringUtil.alignRight("hi!", (int) (byte) 1, "log-conf.xml");

        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");

    }



    @Test

    public void test098() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test098");

        java.lang.ClassLoader classLoader1 = null;

        java.net.URL[] uRLArray2 = com.alipay.sofa.common.utils.ClassLoaderUtil.whichClasses("\u63a7\u5236\u7ebf\u7a0b\u4fe1\u606f\u6253\u5370\u95f4\u9694", classLoader1);

        org.junit.Assert.assertNotNull(uRLArray2);

    }



    @Test

    public void test099() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test099");

        com.alipay.sofa.common.code.LogCode2Description.removeCodeSpace("\u63a7\u5236\u7ebf\u7a0b\u4fe1\u606f\u6253\u5370\u95f4\u9694");

    }



    @Test

    public void test100() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test100");

        long[] longArray0 = new long[] {};

        long[] longArray7 = new long[] { (byte) 10, (-1), 0L, 0L, (short) 0, (short) 1 };

        int int9 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(longArray0, longArray7, 100);

        long[] longArray10 = new long[] {};

        long[] longArray17 = new long[] { (byte) 10, (-1), 0L, 0L, (short) 0, (short) 1 };

        int int19 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(longArray10, longArray17, 100);

        long[] longArray20 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfEmpty(longArray10);

        long[] longArray21 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfEmpty(longArray0, longArray10);

        long[] longArray22 = new long[] {};

        int int24 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(longArray0, longArray22, (int) (byte) 0);

        org.junit.Assert.assertNotNull(longArray0);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");

        org.junit.Assert.assertNotNull(longArray7);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[10, -1, 0, 0, 0, 1]");

        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));

        org.junit.Assert.assertNotNull(longArray10);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[]");

        org.junit.Assert.assertNotNull(longArray17);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[10, -1, 0, 0, 0, 1]");

        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));

        org.junit.Assert.assertNotNull(longArray20);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[]");

        org.junit.Assert.assertNotNull(longArray21);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[]");

        org.junit.Assert.assertNotNull(longArray22);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[]");

        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);

    }



    @Test

    public void test101() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test101");

        java.net.URL uRL1 = com.alipay.sofa.common.utils.ClassLoaderUtil.getResource("sampleTraceId");

        org.junit.Assert.assertNull(uRL1);

    }



    @Test

    public void test102() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test102");

        java.lang.String str0 = com.alipay.sofa.common.profile.enumeration.internal.EnumConstant.ILLEGAL_FLAGS_OBJECT;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Flags must be of \"{0}\" or \"{1}\"" + "'", str0, "Flags must be of \"{0}\" or \"{1}\"");

    }



    @Test

    public void test103() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test103");

        int int2 = com.alipay.sofa.common.utils.StringUtil.countMatches("FlagSet", "AdapterLevel{logLevelMsg='info'}");

        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);

    }



    @Test

    public void test104() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test104");

        float[] floatArray5 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray6 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray5);

        float[] floatArray12 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray13 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray12);

        int int15 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray6, floatArray12, (int) (byte) 0);

        float[] floatArray21 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray22 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray21);

        int int24 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(floatArray12, floatArray21, (float) 5);

        java.lang.String str27 = com.alipay.sofa.common.utils.ArrayUtil.toString((java.lang.Object) floatArray12, "The Enum value must not be null", "10");

        org.junit.Assert.assertNotNull(floatArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray12);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray13);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);

        org.junit.Assert.assertNotNull(floatArray21);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray22);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);

        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[10.0, 0.0, 1.0, 100.0, 35.0]" + "'", str27, "[10.0, 0.0, 1.0, 100.0, 35.0]");

    }



    @Test

    public void test105() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test105");

        java.lang.String str0 = com.alipay.sofa.common.log.Constants.SOFA_MIDDLEWARE_ALL_LOG_CONSOLE_LEVEL;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "sofa.middleware.log.console.level" + "'", str0, "sofa.middleware.log.console.level");

    }



    @Test

    public void test106() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test106");

        java.lang.String str0 = org.slf4j.Logger.ROOT_LOGGER_NAME;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ROOT" + "'", str0, "ROOT");

    }



    @Test

    public void test107() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test107");

        java.lang.Runnable runnable0 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.thread.ExecutingRunnable executingRunnable1 = new com.alipay.sofa.common.thread.ExecutingRunnable(runnable0);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test108() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test108");

        com.alipay.sofa.common.profile.enumeration.EnumUtil enumUtil0 = new com.alipay.sofa.common.profile.enumeration.EnumUtil();

    }



    @Test

    public void test109() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test109");

        int int0 = com.alipay.sofa.common.profile.enumeration.internal.NumberType.RADIX_HEX;

        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);

    }



    @Test

    public void test110() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test110");

        int int0 = com.alipay.sofa.common.config.source.ConfigSourceOrder.SYSTEM_ENV;

        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 200 + "'", int0 == 200);

    }



    @Test

    public void test111() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test111");

        float[] floatArray5 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray6 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray5);

        float[] floatArray12 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray13 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray12);

        int int15 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray6, floatArray12, (int) (byte) 0);

        float[] floatArray21 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray22 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray21);

        float[] floatArray28 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray29 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray28);

        int int31 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray22, floatArray28, (int) (byte) 0);

        float[] floatArray37 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray38 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray37);

        float[] floatArray44 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray45 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray44);

        int int47 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray38, floatArray44, (int) (byte) 0);

        float[] floatArray48 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray28, floatArray44);

        float[] floatArray54 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray55 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray54);

        float[] floatArray56 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray48, floatArray54);

        boolean boolean58 = com.alipay.sofa.common.utils.ArrayUtil.contains(floatArray12, floatArray54, (float) 1L);

        org.junit.Assert.assertNotNull(floatArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray12);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray13);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);

        org.junit.Assert.assertNotNull(floatArray21);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray22);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray28);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray29);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);

        org.junit.Assert.assertNotNull(floatArray37);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray38);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray44);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray45);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray45), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);

        org.junit.Assert.assertNotNull(floatArray48);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray48), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray54);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray55);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray55), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray56);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray56), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);

    }



    @Test

    public void test112() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test112");

        com.alipay.sofa.common.thread.ThreadPoolConfig.SofaThreadConfigBuilder sofaThreadConfigBuilder3 = com.alipay.sofa.common.thread.ThreadPoolConfig.newBuilder();

        com.alipay.sofa.common.thread.ThreadPoolConfig threadPoolConfig4 = sofaThreadConfigBuilder3.build();

        threadPoolConfig4.setTaskTimeoutMilli((long) (short) 0);

        java.util.concurrent.TimeUnit timeUnit7 = threadPoolConfig4.getTimeUnit();

        java.util.concurrent.BlockingQueue<java.lang.Runnable> runnableQueue8 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.thread.SofaThreadPoolExecutor sofaThreadPoolExecutor11 = new com.alipay.sofa.common.thread.SofaThreadPoolExecutor((int) (byte) 10, 5, (long) (short) 100, timeUnit7, runnableQueue8, "The Enum class \"{0}\" is not an implementation of Flags", "Flags must be of \"{0}\" or \"{1}\"");

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(sofaThreadConfigBuilder3);

        org.junit.Assert.assertNotNull(threadPoolConfig4);

        org.junit.Assert.assertNotNull(timeUnit7);

    }



    @Test

    public void test113() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test113");

        com.alipay.sofa.common.utils.ReportUtil.report("10");

    }



    @Test

    public void test114() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test114");

        java.lang.Class class0 = null;

        // The following exception was thrown during execution in test generation

        try {

            java.util.Map map1 = com.alipay.sofa.common.profile.enumeration.EnumUtil.getEnumMap(class0);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test115() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test115");

        java.lang.String str0 = com.alipay.sofa.common.log.Constants.LOG_PATH_PREFIX;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "logging.path." + "'", str0, "logging.path.");

    }



    @Test

    public void test116() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test116");

        com.alipay.sofa.common.space.SpaceId spaceId1 = null;

        java.lang.ClassLoader classLoader2 = null;

        // The following exception was thrown during execution in test generation

        try {

            org.slf4j.Logger logger3 = com.alipay.sofa.common.log.MultiAppLoggerSpaceManager.getLoggerBySpace("", spaceId1, classLoader2);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test117() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test117");

        java.lang.Class class1 = null;

        java.net.URL uRL2 = com.alipay.sofa.common.utils.ClassLoaderUtil.getResource("[10.0, 0.0, 1.0, 100.0, 35.0]", class1);

        org.junit.Assert.assertNull(uRL2);

    }



    @Test

    public void test118() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test118");

        java.lang.Class class0 = null;

        java.lang.Class class1 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.utils.AssertUtil.isAssignable(class0, class1, "adapterLevel{logLevelMsg='info'}");

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type to check against must not be null");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

    }



    @Test

    public void test119() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test119");

        com.alipay.sofa.common.config.DefaultConfigManager defaultConfigManager2 = new com.alipay.sofa.common.config.DefaultConfigManager((long) (byte) 1, (long) 200);

    }



    @Test

    public void test120() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test120");

        java.lang.String str2 = com.alipay.sofa.common.utils.StringUtil.substringBefore("\u63a7\u5236\u7ebf\u7a0b\u4fe1\u606f\u6253\u5370\u95f4\u9694             ", "The Enum value must not be null");

        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u63a7\u5236\u7ebf\u7a0b\u4fe1\u606f\u6253\u5370\u95f4\u9694             " + "'", str2, "\u63a7\u5236\u7ebf\u7a0b\u4fe1\u606f\u6253\u5370\u95f4\u9694             ");

    }



    @Test

    public void test121() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test121");

        org.slf4j.Logger logger0 = com.alipay.sofa.common.thread.log.ThreadLogger.WARN_THREAD_LOGGER;

        org.junit.Assert.assertNotNull(logger0);

    }



    @Test

    public void test122() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test122");

        com.alipay.sofa.common.space.SpaceId spaceId0 = null;

        ch.qos.logback.classic.LoggerContext loggerContext1 = null;

        java.util.Properties properties2 = null;

        java.net.URL uRL3 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.log.factory.LogbackLoggerSpaceFactory logbackLoggerSpaceFactory5 = new com.alipay.sofa.common.log.factory.LogbackLoggerSpaceFactory(spaceId0, loggerContext1, properties2, uRL3, "1");

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test123() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test123");

        java.lang.Class class1 = null;

        java.net.URL uRL2 = com.alipay.sofa.common.utils.ClassLoaderUtil.getResource("sofa.middleware.log.console.level", class1);

        org.junit.Assert.assertNull(uRL2);

    }



    @Test

    public void test124() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test124");

        float[] floatArray0 = null;

        boolean boolean3 = com.alipay.sofa.common.utils.ArrayUtil.contains(floatArray0, (float) (byte) 0, (float) 100L);

        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);

    }



    @Test

    public void test125() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test125");

        java.lang.Class class0 = null;

        java.lang.Class class2 = com.alipay.sofa.common.utils.ClassUtil.getArrayClass(class0, (int) (short) 1);

        org.junit.Assert.assertNull(class2);

    }



    @Test

    public void test126() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test126");

        int[] intArray3 = new int[] { (short) 10, '4', (byte) 0 };

        int[] intArray6 = new int[] { (byte) 1, (byte) 1 };

        boolean boolean7 = com.alipay.sofa.common.utils.ArrayUtil.contains(intArray3, intArray6);

        int int9 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(intArray3, (int) (byte) 10);

        int int11 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(intArray3, 200);

        org.junit.Assert.assertNotNull(intArray3);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 52, 0]");

        org.junit.Assert.assertNotNull(intArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");

        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);

        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);

        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));

    }



    @Test

    public void test127() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test127");

        java.lang.ClassLoader classLoader1 = null;

        // The following exception was thrown during execution in test generation

        try {

            java.lang.Class<?> wildcardClass2 = com.alipay.sofa.common.utils.ClassLoaderUtil.loadClass("adapterLevel{logLevelMsg='info'}.class", classLoader1);

            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: adapterLevel{logLevelMsg='info'}.class");

        } catch (java.lang.ClassNotFoundException e) {

            // Expected exception.

        }

    }



    @Test

    public void test128() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test128");

        org.slf4j.ILoggerFactory iLoggerFactory1 = com.alipay.sofa.common.log.LoggerSpaceManager.removeILoggerFactoryBySpaceName("10");

        org.junit.Assert.assertNull(iLoggerFactory1);

    }



    @Test

    public void test129() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test129");

        com.alipay.sofa.common.space.SpaceId spaceId0 = null;

        java.util.Map<java.lang.String, java.lang.String> strMap1 = com.alipay.sofa.common.log.CommonLoggingConfigurations.getExternalConfigurations();

        java.lang.ClassLoader classLoader2 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.log.MultiAppLoggerSpaceManager.init(spaceId0, strMap1, classLoader2);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(strMap1);

    }



    @Test

    public void test130() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test130");

        java.lang.String str0 = com.alipay.sofa.common.log.Constants.LOG_LEVEL_PREFIX;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "logging.level." + "'", str0, "logging.level.");

    }



    @Test

    public void test131() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test131");

        java.lang.String str1 = com.alipay.sofa.common.utils.StringUtil.toCamelCase("sofa.middleware.log.internal.level");

        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "sofa.middleware.log.internal.level" + "'", str1, "sofa.middleware.log.internal.level");

    }



    @Test

    public void test132() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test132");

        com.alipay.sofa.common.log.SpaceId spaceId0 = null;

        org.slf4j.ILoggerFactory iLoggerFactory1 = com.alipay.sofa.common.log.LoggerSpaceManager.removeILoggerFactoryBySpaceId(spaceId0);

        org.junit.Assert.assertNull(iLoggerFactory1);

    }



    @Test

    public void test133() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test133");

        long long0 = org.springframework.core.task.AsyncTaskExecutor.TIMEOUT_IMMEDIATE;

        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 0L + "'", long0 == 0L);

    }



    @Test

    public void test134() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test134");

        com.alipay.sofa.common.config.converter.GlobalConverterHolder globalConverterHolder0 = new com.alipay.sofa.common.config.converter.GlobalConverterHolder();

    }



    @Test

    public void test135() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test135");

        java.net.URL uRL0 = null;

        // The following exception was thrown during execution in test generation

        try {

            java.io.File file2 = com.alipay.sofa.common.utils.ResourceUtil.getFile(uRL0, "log-conf.xml");

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Resource URL must not be null");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

    }



    @Test

    public void test136() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test136");

        com.alipay.sofa.common.log.MultiAppLoggerSpaceManager multiAppLoggerSpaceManager0 = new com.alipay.sofa.common.log.MultiAppLoggerSpaceManager();

    }



    @Test

    public void test137() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test137");

        java.lang.String str0 = com.alipay.sofa.common.profile.enumeration.internal.EnumConstant.COMPARE_TYPE_MISMATCH;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Could not compare object of \"{0}\" with object of \"{1}\"" + "'", str0, "Could not compare object of \"{0}\" with object of \"{1}\"");

    }



    @Test

    public void test138() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test138");

        com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel messageLevel0 = com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel.NO_MESSAGE;

        java.lang.String str1 = messageLevel0.getName();

        java.lang.String str2 = messageLevel0.toString();

        org.junit.Assert.assertNotNull(messageLevel0);

        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NO_MESSAGE" + "'", str1, "NO_MESSAGE");

        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NO_MESSAGE" + "'", str2, "NO_MESSAGE");

    }



    @Test

    public void test139() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test139");

        java.lang.String str0 = com.alipay.sofa.common.log.Constants.UTF8_STR;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "UTF-8" + "'", str0, "UTF-8");

    }



    @Test

    public void test140() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test140");

        java.lang.Object obj0 = null;

        int int1 = com.alipay.sofa.common.utils.ObjectUtil.identityHashCode(obj0);

        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);

    }



    @Test

    public void test141() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test141");

        com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel messageLevel0 = com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel.BRIEF_MESSAGE;

        java.lang.String str1 = messageLevel0.toBinaryString();

        // The following exception was thrown during execution in test generation

        try {

            java.lang.Object obj2 = com.alipay.sofa.common.utils.ObjectUtil.clone((java.lang.Object) str1);

            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Object of class java.lang.String is not Cloneable");

        } catch (java.lang.RuntimeException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(messageLevel0);

        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");

    }



    @Test

    public void test142() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test142");

        java.lang.Class class0 = null;

        java.lang.Class class1 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.utils.AssertUtil.isAssignable(class0, class1, "hi!");

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type to check against must not be null");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

    }



    @Test

    public void test143() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test143");

        java.io.OutputStream outputStream0 = null;

        long[] longArray1 = new long[] {};

        long[] longArray8 = new long[] { (byte) 10, (-1), 0L, 0L, (short) 0, (short) 1 };

        int int10 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(longArray1, longArray8, 100);

        long[] longArray11 = new long[] {};

        long[] longArray18 = new long[] { (byte) 10, (-1), 0L, 0L, (short) 0, (short) 1 };

        int int20 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(longArray11, longArray18, 100);

        long[] longArray21 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfEmpty(longArray11);

        long[] longArray22 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfEmpty(longArray1, longArray11);

        int int24 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(longArray22, (long) (byte) 1);

        java.io.OutputStream outputStream25 = com.alipay.sofa.common.utils.StreamUtil.synchronizedOutputStream(outputStream0, (java.lang.Object) longArray22);

        org.junit.Assert.assertNotNull(longArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");

        org.junit.Assert.assertNotNull(longArray8);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[10, -1, 0, 0, 0, 1]");

        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));

        org.junit.Assert.assertNotNull(longArray11);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[]");

        org.junit.Assert.assertNotNull(longArray18);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[10, -1, 0, 0, 0, 1]");

        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));

        org.junit.Assert.assertNotNull(longArray21);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[]");

        org.junit.Assert.assertNotNull(longArray22);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[]");

        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));

        org.junit.Assert.assertNotNull(outputStream25);

    }



    @Test

    public void test144() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test144");

        short[] shortArray5 = new short[] { (byte) 1, (byte) -1, (byte) 10, (byte) 100 };

        short[] shortArray10 = new short[] { (short) -1, (short) -1, (byte) 10, (byte) 10 };

        int int12 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(shortArray5, shortArray10, (int) (byte) 100);

        java.lang.Object[] objArray13 = new java.lang.Object[] { 100, int12 };

        java.lang.Float[] floatArray14 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_FLOAT_OBJECT_ARRAY;

        java.lang.Object[] objArray15 = null;

        int int16 = com.alipay.sofa.common.utils.ArrayUtil.indexOf((java.lang.Object[]) floatArray14, objArray15);

        int int18 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(objArray13, objArray15, (int) (short) 0);

        java.util.Map<java.lang.String, java.lang.String> strMap19 = com.alipay.sofa.common.log.CommonLoggingConfigurations.getExternalConfigurations();

        // The following exception was thrown during execution in test generation

        try {

            java.util.Map map20 = com.alipay.sofa.common.utils.ArrayUtil.toMap(objArray13, (java.util.Map) strMap19);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '100', is neither of type Map.Entry nor an Array");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(shortArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, -1, 10, 100]");

        org.junit.Assert.assertNotNull(shortArray10);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[-1, -1, 10, 10]");

        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));

        org.junit.Assert.assertNotNull(objArray13);

        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100, -1]");

        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100, -1]");

        org.junit.Assert.assertNotNull(floatArray14);

        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));

        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));

        org.junit.Assert.assertNotNull(strMap19);

    }



    @Test

    public void test145() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test145");

        float[] floatArray5 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray6 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray5);

        float[] floatArray12 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray13 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray12);

        int int15 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray6, floatArray12, (int) (byte) 0);

        float[] floatArray21 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray22 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray21);

        float[] floatArray28 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray29 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray28);

        int int31 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray22, floatArray28, (int) (byte) 0);

        float[] floatArray32 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray12, floatArray28);

        float[] floatArray38 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray39 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray38);

        float[] floatArray40 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray32, floatArray38);

        com.alipay.sofa.common.utils.ArrayUtil.reverse(floatArray32);

        org.junit.Assert.assertNotNull(floatArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray12);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[35.0, 100.0, 1.0, 0.0, 10.0]");

        org.junit.Assert.assertNotNull(floatArray13);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[35.0, 100.0, 1.0, 0.0, 10.0]");

        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);

        org.junit.Assert.assertNotNull(floatArray21);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray22);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray28);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray29);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);

        org.junit.Assert.assertNotNull(floatArray32);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[35.0, 100.0, 1.0, 0.0, 10.0]");

        org.junit.Assert.assertNotNull(floatArray38);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray39);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray40);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[35.0, 100.0, 1.0, 0.0, 10.0]");

    }



    @Test

    public void test146() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test146");

        boolean[] booleanArray0 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_BOOLEAN_ARRAY;

        boolean[] booleanArray1 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_BOOLEAN_ARRAY;

        boolean[] booleanArray2 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfEmpty(booleanArray0, booleanArray1);

        boolean boolean3 = com.alipay.sofa.common.utils.ArrayUtil.isEmpty(booleanArray0);

        boolean[] booleanArray4 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_BOOLEAN_ARRAY;

        boolean[] booleanArray5 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_BOOLEAN_ARRAY;

        boolean[] booleanArray6 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfEmpty(booleanArray4, booleanArray5);

        boolean[] booleanArray7 = com.alipay.sofa.common.utils.ArrayUtil.clone(booleanArray5);

        boolean[] booleanArray8 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_BOOLEAN_ARRAY;

        boolean[] booleanArray9 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_BOOLEAN_ARRAY;

        boolean[] booleanArray10 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfEmpty(booleanArray8, booleanArray9);

        boolean[] booleanArray11 = com.alipay.sofa.common.utils.ArrayUtil.clone(booleanArray9);

        int int13 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(booleanArray5, booleanArray11, (-2147483648));

        int int14 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(booleanArray0, booleanArray5);

        org.junit.Assert.assertNotNull(booleanArray0);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");

        org.junit.Assert.assertNotNull(booleanArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[]");

        org.junit.Assert.assertNotNull(booleanArray2);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[]");

        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);

        org.junit.Assert.assertNotNull(booleanArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[]");

        org.junit.Assert.assertNotNull(booleanArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[]");

        org.junit.Assert.assertNotNull(booleanArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[]");

        org.junit.Assert.assertNotNull(booleanArray7);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[]");

        org.junit.Assert.assertNotNull(booleanArray8);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[]");

        org.junit.Assert.assertNotNull(booleanArray9);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[]");

        org.junit.Assert.assertNotNull(booleanArray10);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[]");

        org.junit.Assert.assertNotNull(booleanArray11);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[]");

        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));

        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);

    }



    @Test

    public void test147() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test147");

        com.alipay.sofa.common.space.SpaceId spaceId0 = null;

        com.alipay.sofa.common.code.LogCode2Description.removeCodeSpace(spaceId0);

    }



    @Test

    public void test148() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test148");

        int int0 = com.alipay.sofa.common.security.SensitiveDataUtil.IDCARDNO_DATA;

        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);

    }



    @Test

    public void test149() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test149");

        java.lang.String str0 = com.alipay.sofa.common.profile.enumeration.internal.EnumConstant.FLAG_SET_IS_IMMUTABLE;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "FlagSet is immutable" + "'", str0, "FlagSet is immutable");

    }



    @Test

    public void test150() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test150");

        java.lang.String str1 = com.alipay.sofa.common.utils.StringUtil.toLowerCaseWithUnderscores("sofa.middleware.log.%s.console.level");

        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "sofa.middleware.log.%s.console.level" + "'", str1, "sofa.middleware.log.%s.console.level");

    }



    @Test

    public void test151() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test151");

        com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler sofaThreadPoolTaskScheduler0 = new com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler();

        int int1 = sofaThreadPoolTaskScheduler0.getThreadPriority();

        java.lang.ThreadGroup threadGroup2 = null;

        sofaThreadPoolTaskScheduler0.setThreadGroup(threadGroup2);

        int int4 = sofaThreadPoolTaskScheduler0.getPoolSize();

        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);

        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);

    }



    @Test

    public void test152() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test152");

        com.alipay.sofa.common.thread.ThreadPoolConfig.SofaThreadConfigBuilder sofaThreadConfigBuilder0 = com.alipay.sofa.common.thread.ThreadPoolConfig.newBuilder();

        com.alipay.sofa.common.thread.ThreadPoolConfig threadPoolConfig1 = sofaThreadConfigBuilder0.build();

        com.alipay.sofa.common.thread.ThreadPoolConfig.SofaThreadConfigBuilder sofaThreadConfigBuilder3 = sofaThreadConfigBuilder0.period((long) (short) -1);

        org.junit.Assert.assertNotNull(sofaThreadConfigBuilder0);

        org.junit.Assert.assertNotNull(threadPoolConfig1);

        org.junit.Assert.assertNotNull(sofaThreadConfigBuilder3);

    }



    @Test

    public void test153() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test153");

        com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler sofaThreadPoolTaskScheduler0 = new com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler();

        int int1 = sofaThreadPoolTaskScheduler0.getThreadPriority();

        org.springframework.util.ErrorHandler errorHandler2 = null;

        sofaThreadPoolTaskScheduler0.setErrorHandler(errorHandler2);

        com.alipay.sofa.common.thread.ThreadPoolConfig threadPoolConfig4 = null;

        com.alipay.sofa.common.thread.ThreadPoolStatistics threadPoolStatistics5 = null;

        com.alipay.sofa.common.thread.ThreadPoolMonitorRunner threadPoolMonitorRunner6 = new com.alipay.sofa.common.thread.ThreadPoolMonitorRunner(threadPoolConfig4, threadPoolStatistics5);

        java.util.Date date7 = null;

        // The following exception was thrown during execution in test generation

        try {

            java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture8 = sofaThreadPoolTaskScheduler0.schedule((java.lang.Runnable) threadPoolMonitorRunner6, date7);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ThreadPoolTaskScheduler not initialized");

        } catch (java.lang.IllegalStateException e) {

            // Expected exception.

        }

        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);

    }



    @Test

    public void test154() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test154");

        java.lang.String str3 = com.alipay.sofa.common.utils.StringUtil.abbreviate("logging.path.", 0, (int) (short) 10);

        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "logging..." + "'", str3, "logging...");

    }



    @Test

    public void test155() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test155");

        com.alipay.sofa.common.space.SpaceId spaceId1 = null;

        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;

        // The following exception was thrown during execution in test generation

        try {

            org.slf4j.Logger logger3 = com.alipay.sofa.common.log.LoggerSpaceManager.getLoggerBySpace("FlagSet is immutable", spaceId1, strMap2);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test156() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test156");

        com.alipay.sofa.common.log.ReportUtil reportUtil0 = new com.alipay.sofa.common.log.ReportUtil();

    }



    @Test

    public void test157() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test157");

        java.lang.String str0 = com.alipay.sofa.common.log.Constants.LOG4J2_MIDDLEWARE_LOG_DISABLE_PROP_KEY;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "log4j2.middleware.log.disable" + "'", str0, "log4j2.middleware.log.disable");

    }



    @Test

    public void test158() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test158");

        java.lang.String str2 = com.alipay.sofa.common.utils.StringUtil.center("Flags must be of \"{0}\" or \"{1}\"", (int) ' ');

        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Flags must be of \"{0}\" or \"{1}\" " + "'", str2, "Flags must be of \"{0}\" or \"{1}\" ");

    }



    @Test

    public void test159() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test159");

        float[] floatArray5 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray6 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray5);

        float[] floatArray12 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray13 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray12);

        int int15 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray6, floatArray12, (int) (byte) 0);

        float[] floatArray21 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray22 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray21);

        float[] floatArray28 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray29 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray28);

        int int31 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray22, floatArray28, (int) (byte) 0);

        float[] floatArray32 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray12, floatArray28);

        int int35 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray32, 0.0f, (float) '#');

        org.junit.Assert.assertNotNull(floatArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray12);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray13);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);

        org.junit.Assert.assertNotNull(floatArray21);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray22);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray28);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray29);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);

        org.junit.Assert.assertNotNull(floatArray32);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);

    }



    @Test

    public void test160() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test160");

        boolean boolean1 = com.alipay.sofa.common.log.MultiAppLoggerSpaceManager.isSpaceInitialized("FlagSet value must not be null");

        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);

    }



    @Test

    public void test161() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test161");

        com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel messageLevel0 = com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel.NO_MESSAGE;

        long long1 = messageLevel0.longValue();

        org.junit.Assert.assertNotNull(messageLevel0);

        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);

    }



    @Test

    public void test162() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test162");

        boolean[] booleanArray0 = null;

        int int3 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(booleanArray0, false, (int) (short) 0);

        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));

    }



    @Test

    public void test163() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test163");

        java.lang.String[] strArray1 = com.alipay.sofa.common.utils.StringUtil.split("hi!");

        org.junit.Assert.assertNotNull(strArray1);

    }



    @Test

    public void test164() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test164");

        java.lang.String str4 = com.alipay.sofa.common.utils.StringUtil.overlay("adapterLevel{logLevelMsg='info'}.class", "ROOT", (int) (short) 1, (int) (byte) 1);

        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aROOTdapterLevel{logLevelMsg='info'}.class" + "'", str4, "aROOTdapterLevel{logLevelMsg='info'}.class");

    }



    @Test

    public void test165() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test165");

        java.lang.Class class1 = null;

        java.net.URL[] uRLArray2 = com.alipay.sofa.common.utils.ClassLoaderUtil.getResources("[0x64, 64, 0A, FF, 01]", class1);

        org.junit.Assert.assertNotNull(uRLArray2);

    }



    @Test

    public void test166() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test166");

        org.slf4j.ILoggerFactory iLoggerFactory1 = com.alipay.sofa.common.log.LoggerSpaceManager.removeILoggerFactoryBySpaceName("log-conf.xml");

        org.junit.Assert.assertNull(iLoggerFactory1);

    }



    @Test

    public void test167() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test167");

        com.alipay.sofa.common.config.source.SystemEnvConfigSource systemEnvConfigSource0 = new com.alipay.sofa.common.config.source.SystemEnvConfigSource();

        com.alipay.sofa.common.config.ConfigKey<java.lang.Long> longConfigKey1 = com.alipay.sofa.common.CommonToolConfigKeys.COMMON_THREAD_LOG_PERIOD;

        java.lang.Long long2 = systemEnvConfigSource0.getConfig(longConfigKey1);

        com.alipay.sofa.common.config.source.ConfigSourceCacheWrapper configSourceCacheWrapper4 = new com.alipay.sofa.common.config.source.ConfigSourceCacheWrapper((com.alipay.sofa.common.config.source.AbstractConfigSource) systemEnvConfigSource0, (long) 100);

        org.junit.Assert.assertNotNull(longConfigKey1);

        org.junit.Assert.assertNull(long2);

    }



    @Test

    public void test168() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test168");

        com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel messageLevel0 = com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel.BRIEF_MESSAGE;

        boolean boolean2 = messageLevel0.equals((java.lang.Object) 10L);

        org.junit.Assert.assertNotNull(messageLevel0);

        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);

    }



    @Test

    public void test169() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test169");

        com.alipay.sofa.common.code.LogCode2Description logCode2Description1 = com.alipay.sofa.common.code.LogCode2Description.create("sofa.middleware.log.%s.console.level");

        // The following exception was thrown during execution in test generation

        try {

            java.lang.String str3 = logCode2Description1.convert("AdapterLevel{logLevelMsg='info'}");

            org.junit.Assert.fail("Expected exception of type java.util.MissingFormatArgumentException; message: Format specifier '%s'");

        } catch (java.util.MissingFormatArgumentException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(logCode2Description1);

    }



    @Test

    public void test170() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test170");

        java.lang.String str1 = com.alipay.sofa.common.security.SensitiveDataUtil.cellphoneHideSMS("log-conf.xml");

        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "log-*.xml" + "'", str1, "log-*.xml");

    }



    @Test

    public void test171() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test171");

        com.alipay.sofa.common.config.log.ConfigLoggerFactory configLoggerFactory0 = new com.alipay.sofa.common.config.log.ConfigLoggerFactory();

    }



    @Test

    public void test172() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test172");

        float[] floatArray5 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray6 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray5);

        float[] floatArray12 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray13 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray12);

        int int15 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray6, floatArray12, (int) (byte) 0);

        float[] floatArray21 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray22 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray21);

        int int24 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(floatArray12, floatArray21, (float) 5);

        float[] floatArray31 = new float[] { 100.0f, (-1), 0.0f, (-1.0f), 5, (-1L) };

        boolean boolean32 = com.alipay.sofa.common.utils.ArrayUtil.isNotEmpty(floatArray31);

        int int33 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray21, floatArray31);

        org.junit.Assert.assertNotNull(floatArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray12);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray13);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);

        org.junit.Assert.assertNotNull(floatArray21);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray22);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);

        org.junit.Assert.assertNotNull(floatArray31);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[100.0, -1.0, 0.0, -1.0, 5.0, -1.0]");

        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);

        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));

    }



    @Test

    public void test173() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test173");

        java.lang.String str0 = com.alipay.sofa.common.utils.StringUtil.EMPTY_STRING;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");

    }



    @Test

    public void test174() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test174");

        com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler sofaThreadPoolTaskScheduler0 = new com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler();

        com.alipay.sofa.common.thread.ThreadPoolConfig threadPoolConfig1 = null;

        com.alipay.sofa.common.thread.ThreadPoolStatistics threadPoolStatistics2 = null;

        com.alipay.sofa.common.thread.ThreadPoolMonitorRunner threadPoolMonitorRunner3 = new com.alipay.sofa.common.thread.ThreadPoolMonitorRunner(threadPoolConfig1, threadPoolStatistics2);

        java.util.Date date4 = null;

        // The following exception was thrown during execution in test generation

        try {

            java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture5 = sofaThreadPoolTaskScheduler0.schedule((java.lang.Runnable) threadPoolMonitorRunner3, date4);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ThreadPoolTaskScheduler not initialized");

        } catch (java.lang.IllegalStateException e) {

            // Expected exception.

        }

    }



    @Test

    public void test175() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test175");

        com.alipay.sofa.common.utils.ProcessIdUtil processIdUtil0 = new com.alipay.sofa.common.utils.ProcessIdUtil();

    }



    @Test

    public void test176() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test176");

        com.alipay.sofa.common.space.SpaceId spaceId1 = null;

        com.alipay.sofa.common.log.adapter.level.AdapterLevel adapterLevel4 = com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO;

        java.lang.String str5 = com.alipay.sofa.common.utils.ArrayUtil.toString((java.lang.Object) adapterLevel4);

        org.slf4j.Logger logger6 = com.alipay.sofa.common.log.MultiAppLoggerSpaceManager.setLoggerLevel("ROOT", "log4j2.middleware.log.disable", adapterLevel4);

        // The following exception was thrown during execution in test generation

        try {

            org.slf4j.Logger logger7 = com.alipay.sofa.common.log.LoggerSpaceManager.setLoggerLevel("-", spaceId1, adapterLevel4);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertTrue("'" + adapterLevel4 + "' != '" + com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO + "'", adapterLevel4.equals(com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO));

        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AdapterLevel{logLevelMsg='info'}" + "'", str5, "AdapterLevel{logLevelMsg='info'}");

        org.junit.Assert.assertNotNull(logger6);

    }



    @Test

    public void test177() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test177");

        org.slf4j.Logger logger0 = com.alipay.sofa.common.thread.log.ThreadLogger.INFO_THREAD_LOGGER;

        org.junit.Assert.assertNotNull(logger0);

    }



    @Test

    public void test178() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test178");

        float[] floatArray5 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray6 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray5);

        float[] floatArray12 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray13 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray12);

        int int15 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray6, floatArray12, (int) (byte) 0);

        float[] floatArray21 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray22 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray21);

        int int24 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(floatArray12, floatArray21, (float) 5);

        int int28 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray12, (float) (short) 0, (int) '#', (float) 8);

        org.junit.Assert.assertNotNull(floatArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray12);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray13);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);

        org.junit.Assert.assertNotNull(floatArray21);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray22);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);

        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));

    }



    @Test

    public void test179() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test179");

        com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler sofaThreadPoolTaskScheduler1 = new com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler();

        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler2 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor sofaScheduledThreadPoolExecutor5 = new com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor((int) (short) 0, (java.util.concurrent.ThreadFactory) sofaThreadPoolTaskScheduler1, rejectedExecutionHandler2, "ROOT", "log-conf.xml");

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test180() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test180");

        java.lang.String str1 = com.alipay.sofa.common.utils.StringUtil.toLowerCaseWithUnderscores("UTF-8");

        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "utf-8" + "'", str1, "utf-8");

    }



    @Test

    public void test181() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test181");

        int[] intArray0 = new int[] {};

        int[] intArray1 = com.alipay.sofa.common.utils.ArrayUtil.clone(intArray0);

        boolean boolean3 = com.alipay.sofa.common.utils.ArrayUtil.contains(intArray0, (int) (byte) 10);

        org.junit.Assert.assertNotNull(intArray0);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");

        org.junit.Assert.assertNotNull(intArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");

        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);

    }



    @Test

    public void test182() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test182");

        com.alipay.sofa.common.utils.Ordered[] orderedArray0 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.utils.OrderComparator.sort(orderedArray0);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test183() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test183");

        com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel messageLevel0 = com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel.NO_MESSAGE;

        float float1 = messageLevel0.floatValue();

        java.lang.String str2 = messageLevel0.toBinaryString();

        org.junit.Assert.assertNotNull(messageLevel0);

        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);

        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");

    }



    @Test

    public void test184() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test184");

        java.lang.Float[] floatArray0 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_FLOAT_OBJECT_ARRAY;

        java.lang.Object[] objArray1 = null;

        int int2 = com.alipay.sofa.common.utils.ArrayUtil.indexOf((java.lang.Object[]) floatArray0, objArray1);

        com.alipay.sofa.common.utils.ArrayUtil.reverse(objArray1);

        org.junit.Assert.assertNotNull(floatArray0);

        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));

    }



    @Test

    public void test185() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test185");

        com.alipay.sofa.common.utils.ResourceUtil resourceUtil0 = new com.alipay.sofa.common.utils.ResourceUtil();

    }



    @Test

    public void test186() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test186");

        com.alipay.sofa.common.thread.ThreadPoolConfig.SofaThreadConfigBuilder sofaThreadConfigBuilder0 = com.alipay.sofa.common.thread.ThreadPoolConfig.newBuilder();

        com.alipay.sofa.common.thread.ThreadPoolConfig threadPoolConfig1 = sofaThreadConfigBuilder0.build();

        com.alipay.sofa.common.thread.ThreadPoolConfig threadPoolConfig2 = sofaThreadConfigBuilder0.build();

        org.junit.Assert.assertNotNull(sofaThreadConfigBuilder0);

        org.junit.Assert.assertNotNull(threadPoolConfig1);

        org.junit.Assert.assertNotNull(threadPoolConfig2);

    }



    @Test

    public void test187() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test187");

        java.lang.String str0 = com.alipay.sofa.common.log.Constants.PRIORITY_KEY;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "priority" + "'", str0, "priority");

    }



    @Test

    public void test188() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test188");

        java.lang.Throwable throwable1 = null;

        com.alipay.sofa.common.utils.ReportUtil.reportWarn("logging.path.", throwable1);

    }



    @Test

    public void test189() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test189");

        byte[] byteArray0 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_BYTE_ARRAY;

        org.junit.Assert.assertNotNull(byteArray0);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");

    }



    @Test

    public void test190() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test190");

        java.lang.String str1 = com.alipay.sofa.common.profile.diagnostic.Profiler.dump("log-conf.xml");

        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");

    }



    @Test

    public void test191() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test191");

        java.lang.String str2 = com.alipay.sofa.common.security.SensitiveDataUtil.idCardNoHide("adapterLevel{logLevelMsg='info'}", false);

        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a******************************}" + "'", str2, "a******************************}");

    }



    @Test

    public void test192() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test192");

        java.lang.Integer[] intArray0 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_INTEGER_OBJECT_ARRAY;

        org.junit.Assert.assertNotNull(intArray0);

    }



    @Test

    public void test193() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test193");

        java.lang.String[] strArray1 = com.alipay.sofa.common.utils.StringUtil.split("log-conf.xml");

        java.lang.Float[] floatArray2 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_FLOAT_OBJECT_ARRAY;

        java.lang.Object[] objArray3 = null;

        int int4 = com.alipay.sofa.common.utils.ArrayUtil.indexOf((java.lang.Object[]) floatArray2, objArray3);

        int int6 = com.alipay.sofa.common.utils.ArrayUtil.indexOf((java.lang.Object[]) strArray1, objArray3, 5);

        org.junit.Assert.assertNotNull(strArray1);

        org.junit.Assert.assertNotNull(floatArray2);

        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));

        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));

    }



    @Test

    public void test194() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test194");

        com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel messageLevel0 = com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel.NO_MESSAGE;

        float float1 = messageLevel0.floatValue();

        long long2 = messageLevel0.longValue();

        org.junit.Assert.assertNotNull(messageLevel0);

        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);

        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);

    }



    @Test

    public void test195() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test195");

        com.alipay.sofa.common.thread.ThreadPoolConfig.SofaThreadConfigBuilder sofaThreadConfigBuilder0 = com.alipay.sofa.common.thread.ThreadPoolConfig.newBuilder();

        com.alipay.sofa.common.thread.ThreadPoolConfig threadPoolConfig1 = sofaThreadConfigBuilder0.build();

        threadPoolConfig1.setTaskTimeoutMilli((long) (short) 0);

        java.util.concurrent.TimeUnit timeUnit4 = threadPoolConfig1.getTimeUnit();

        long long5 = threadPoolConfig1.getPeriod();

        long long6 = threadPoolConfig1.getPeriod();

        org.junit.Assert.assertNotNull(sofaThreadConfigBuilder0);

        org.junit.Assert.assertNotNull(threadPoolConfig1);

        org.junit.Assert.assertNotNull(timeUnit4);

        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);

        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);

    }



    @Test

    public void test196() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test196");

        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 1 };

        boolean boolean6 = com.alipay.sofa.common.utils.ArrayUtil.isEmpty(byteArray5);

        java.lang.String str7 = com.alipay.sofa.common.utils.ArrayUtil.toString((java.lang.Object) byteArray5);

        boolean boolean9 = com.alipay.sofa.common.utils.ArrayUtil.contains(byteArray5, (byte) 1);

        org.junit.Assert.assertNotNull(byteArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 100, 10, -1, 1]");

        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);

        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[0x64, 64, 0A, FF, 01]" + "'", str7, "[0x64, 64, 0A, FF, 01]");

        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);

    }



    @Test

    public void test197() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test197");

        com.alipay.sofa.common.log.adapter.level.AdapterLevel adapterLevel2 = com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO;

        java.lang.String str3 = com.alipay.sofa.common.utils.ArrayUtil.toString((java.lang.Object) adapterLevel2);

        java.lang.String str4 = adapterLevel2.getLogLevelMsg();

        org.slf4j.Logger logger5 = com.alipay.sofa.common.log.MultiAppLoggerSpaceManager.setLoggerLevel("NO_MESSAGE", "logging...", adapterLevel2);

        org.junit.Assert.assertTrue("'" + adapterLevel2 + "' != '" + com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO + "'", adapterLevel2.equals(com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO));

        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AdapterLevel{logLevelMsg='info'}" + "'", str3, "AdapterLevel{logLevelMsg='info'}");

        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "info" + "'", str4, "info");

        org.junit.Assert.assertNotNull(logger5);

    }



    @Test

    public void test198() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test198");

        float[] floatArray3 = new float[] { '4', 0.0f, (short) 10 };

        boolean boolean4 = com.alipay.sofa.common.utils.ArrayUtil.isEmpty(floatArray3);

        org.junit.Assert.assertNotNull(floatArray3);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[52.0, 0.0, 10.0]");

        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);

    }



    @Test

    public void test199() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test199");

        com.alipay.sofa.common.thread.ThreadPoolConfig.SofaThreadConfigBuilder sofaThreadConfigBuilder0 = com.alipay.sofa.common.thread.ThreadPoolConfig.newBuilder();

        com.alipay.sofa.common.thread.ThreadPoolConfig threadPoolConfig1 = sofaThreadConfigBuilder0.build();

        threadPoolConfig1.setTaskTimeoutMilli((long) (short) 0);

        java.util.concurrent.TimeUnit timeUnit4 = threadPoolConfig1.getTimeUnit();

        long long5 = threadPoolConfig1.getPeriod();

        threadPoolConfig1.setPeriod((long) 'a');

        long long8 = threadPoolConfig1.getPeriod();

        org.junit.Assert.assertNotNull(sofaThreadConfigBuilder0);

        org.junit.Assert.assertNotNull(threadPoolConfig1);

        org.junit.Assert.assertNotNull(timeUnit4);

        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);

        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);

    }



    @Test

    public void test200() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test200");

        short[] shortArray0 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_SHORT_ARRAY;

        boolean boolean2 = com.alipay.sofa.common.utils.ArrayUtil.contains(shortArray0, (short) (byte) -1);

        org.junit.Assert.assertNotNull(shortArray0);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");

        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);

    }



    @Test

    public void test201() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test201");

        short[] shortArray5 = new short[] { (byte) 1, (byte) -1, (byte) 10, (byte) 100 };

        short[] shortArray10 = new short[] { (short) -1, (short) -1, (byte) 10, (byte) 10 };

        int int12 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(shortArray5, shortArray10, (int) (byte) 100);

        java.lang.Object[] objArray13 = new java.lang.Object[] { 100, int12 };

        java.lang.Float[] floatArray14 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_FLOAT_OBJECT_ARRAY;

        java.lang.Object[] objArray15 = null;

        int int16 = com.alipay.sofa.common.utils.ArrayUtil.indexOf((java.lang.Object[]) floatArray14, objArray15);

        int int18 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(objArray13, objArray15, (int) (short) 0);

        java.lang.String str20 = com.alipay.sofa.common.utils.StringUtil.join(objArray15, '4');

        org.junit.Assert.assertNotNull(shortArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, -1, 10, 100]");

        org.junit.Assert.assertNotNull(shortArray10);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[-1, -1, 10, 10]");

        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));

        org.junit.Assert.assertNotNull(objArray13);

        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100, -1]");

        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100, -1]");

        org.junit.Assert.assertNotNull(floatArray14);

        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));

        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));

        org.junit.Assert.assertNull(str20);

    }



    @Test

    public void test202() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test202");

        com.alipay.sofa.common.utils.ClassLoaderUtil classLoaderUtil0 = new com.alipay.sofa.common.utils.ClassLoaderUtil();

    }



    @Test

    public void test203() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test203");

        java.net.URL[] uRLArray1 = com.alipay.sofa.common.utils.ClassLoaderUtil.whichClasses("The Enum class \"{0}\" is not an implementation of Flags");

        org.junit.Assert.assertNotNull(uRLArray1);

    }



    @Test

    public void test204() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test204");

        com.alipay.sofa.common.log.CommonLoggingConfigurations.appendConsoleLoggerName("*");

    }



    @Test

    public void test205() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test205");

        com.alipay.sofa.common.config.ConfigKey<java.lang.String> strConfigKey0 = com.alipay.sofa.common.CommonToolConfigKeys.COMMON_LOG_FILE;

        org.junit.Assert.assertNotNull(strConfigKey0);

    }



    @Test

    public void test206() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test206");

        java.lang.String str1 = com.alipay.sofa.common.utils.StringUtil.trimToNull("FlagSet is immutable");

        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FlagSet is immutable" + "'", str1, "FlagSet is immutable");

    }



    @Test

    public void test207() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test207");

        char[] charArray4 = new char[] { 'a', ' ', '4' };

        int int5 = com.alipay.sofa.common.utils.StringUtil.indexOfAny("FlagSet value must not be null", charArray4);

        char[] charArray6 = com.alipay.sofa.common.utils.ArrayUtil.clone(charArray4);

        int int9 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(charArray6, '#', (int) (short) 1);

        com.alipay.sofa.common.utils.ArrayUtil.reverse(charArray6);

        org.junit.Assert.assertNotNull(charArray4);

        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a 4");

        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a 4");

        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a,  , 4]");

        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);

        org.junit.Assert.assertNotNull(charArray6);

        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4 a");

        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4 a");

        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4,  , a]");

        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));

    }



    @Test

    public void test208() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test208");

        long long0 = com.alipay.sofa.common.thread.SofaThreadPoolConstants.DEFAULT_GOVERNOR_INTERVAL;

        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 30L + "'", long0 == 30L);

    }



    @Test

    public void test209() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test209");

        java.lang.ClassLoader classLoader1 = null;

        // The following exception was thrown during execution in test generation

        try {

            java.lang.Class class2 = com.alipay.sofa.common.utils.ClassLoaderUtil.loadServiceClass("Flags must be of \"{0}\" or \"{1}\" ", classLoader1);

            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Could not find META-INF/services/Flags must be of \"{0}\" or \"{1}\" ");

        } catch (java.lang.RuntimeException e) {

            // Expected exception.

        }

    }



    @Test

    public void test210() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test210");

        int[] intArray3 = new int[] { (short) 10, '4', (byte) 0 };

        int[] intArray6 = new int[] { (byte) 1, (byte) 1 };

        boolean boolean7 = com.alipay.sofa.common.utils.ArrayUtil.contains(intArray3, intArray6);

        boolean boolean9 = com.alipay.sofa.common.utils.ArrayUtil.contains(intArray6, (int) (short) 0);

        int[] intArray12 = new int[] { (short) 10, (byte) 10 };

        int int14 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(intArray6, intArray12, (int) (byte) -1);

        int int16 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(intArray12, (int) (short) 1);

        int[] intArray20 = new int[] { (short) 10, '4', (byte) 0 };

        int[] intArray23 = new int[] { (byte) 1, (byte) 1 };

        boolean boolean24 = com.alipay.sofa.common.utils.ArrayUtil.contains(intArray20, intArray23);

        boolean boolean25 = com.alipay.sofa.common.utils.ArrayUtil.contains(intArray12, intArray23);

        org.junit.Assert.assertNotNull(intArray3);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 52, 0]");

        org.junit.Assert.assertNotNull(intArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");

        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);

        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);

        org.junit.Assert.assertNotNull(intArray12);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 10]");

        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));

        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));

        org.junit.Assert.assertNotNull(intArray20);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 52, 0]");

        org.junit.Assert.assertNotNull(intArray23);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");

        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);

        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);

    }



    @Test

    public void test211() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test211");

        int int0 = com.alipay.sofa.common.config.source.ConfigSourceOrder.SYSTEM_PROPERTY;

        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);

    }



    @Test

    public void test212() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test212");

        char[] charArray4 = new char[] { 'a', '4', 'a', '4' };

        int int6 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(charArray4, '4');

        int int8 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(charArray4, 'a');

        org.junit.Assert.assertNotNull(charArray4);

        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a4a4");

        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a4a4");

        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4, a, 4]");

        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);

        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);

    }



    @Test

    public void test213() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test213");

        com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel messageLevel0 = com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel.BRIEF_MESSAGE;

        long long1 = messageLevel0.longValue();

        byte byte2 = messageLevel0.byteValue();

        org.junit.Assert.assertNotNull(messageLevel0);

        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);

        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);

    }



    @Test

    public void test214() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test214");

        java.lang.String str2 = com.alipay.sofa.common.utils.StringUtil.alignLeft("priority", (int) ' ');

        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "priority                        " + "'", str2, "priority                        ");

    }



    @Test

    public void test215() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test215");

        com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel messageLevel0 = com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel.NO_MESSAGE;

        java.lang.String str1 = messageLevel0.getName();

        double double2 = messageLevel0.doubleValue();

        org.junit.Assert.assertNotNull(messageLevel0);

        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NO_MESSAGE" + "'", str1, "NO_MESSAGE");

        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);

    }



    @Test

    public void test216() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test216");

        com.alipay.sofa.common.config.DefaultConfigManager defaultConfigManager2 = new com.alipay.sofa.common.config.DefaultConfigManager((long) (byte) 1, (long) 200);

        java.lang.Object[] objArray4 = new java.lang.Object[] { 200, "info" };

        boolean boolean6 = com.alipay.sofa.common.utils.ArrayUtil.contains(objArray4, (java.lang.Object) "priority");

        org.junit.Assert.assertNotNull(objArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[200, info]");

        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[200, info]");

        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);

    }



    @Test

    public void test217() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test217");

        com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel messageLevel0 = com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel.NO_MESSAGE;

        java.lang.String str1 = messageLevel0.getName();

        java.lang.String str2 = messageLevel0.toBinaryString();

        org.junit.Assert.assertNotNull(messageLevel0);

        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NO_MESSAGE" + "'", str1, "NO_MESSAGE");

        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");

    }



    @Test

    public void test218() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test218");

        int int2 = com.alipay.sofa.common.utils.StringUtil.indexOf("The Enum value must not be null", ' ');

        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);

    }



    @Test

    public void test219() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test219");

        com.alipay.sofa.common.log.adapter.level.AdapterLevel adapterLevel2 = com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO;

        java.lang.String str3 = com.alipay.sofa.common.utils.ArrayUtil.toString((java.lang.Object) adapterLevel2);

        java.lang.String str4 = adapterLevel2.getLogLevelMsg();

        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, ' ', str4 };

        // The following exception was thrown during execution in test generation

        try {

            java.util.Map map6 = com.alipay.sofa.common.utils.ArrayUtil.toMap(objArray5);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '10', is neither of type Map.Entry nor an Array");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

        org.junit.Assert.assertTrue("'" + adapterLevel2 + "' != '" + com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO + "'", adapterLevel2.equals(com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO));

        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AdapterLevel{logLevelMsg='info'}" + "'", str3, "AdapterLevel{logLevelMsg='info'}");

        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "info" + "'", str4, "info");

        org.junit.Assert.assertNotNull(objArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10,  , info]");

        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10,  , info]");

    }



    @Test

    public void test220() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test220");

        com.alipay.sofa.common.space.SpaceId spaceId0 = null;

        // The following exception was thrown during execution in test generation

        try {

            boolean boolean1 = com.alipay.sofa.common.log.MultiAppLoggerSpaceManager.isSpaceInitialized(spaceId0);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test221() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test221");

        boolean[] booleanArray0 = null;

        int int3 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(booleanArray0, false, 0);

        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));

    }



    @Test

    public void test222() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test222");

        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1 };

        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 1 };

        boolean boolean11 = com.alipay.sofa.common.utils.ArrayUtil.isEmpty(byteArray10);

        byte[] byteArray12 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfEmpty(byteArray4, byteArray10);

        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1 };

        byte[] byteArray23 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 1 };

        boolean boolean24 = com.alipay.sofa.common.utils.ArrayUtil.isEmpty(byteArray23);

        byte[] byteArray25 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfEmpty(byteArray17, byteArray23);

        int int26 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(byteArray12, byteArray23);

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 1, 1, 1]");

        org.junit.Assert.assertNotNull(byteArray10);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 100, 10, -1, 1]");

        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);

        org.junit.Assert.assertNotNull(byteArray12);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 1, 1, 1]");

        org.junit.Assert.assertNotNull(byteArray17);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, 1, 1, 1]");

        org.junit.Assert.assertNotNull(byteArray23);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100, 100, 10, -1, 1]");

        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);

        org.junit.Assert.assertNotNull(byteArray25);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, 1, 1, 1]");

        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));

    }



    @Test

    public void test223() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test223");

        com.alipay.sofa.common.config.source.SystemEnvConfigSource systemEnvConfigSource0 = new com.alipay.sofa.common.config.source.SystemEnvConfigSource();

        boolean boolean2 = systemEnvConfigSource0.hasKey("10");

        java.lang.String str4 = systemEnvConfigSource0.doGetConfig("FlagSet value must not be null");

        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);

        org.junit.Assert.assertNull(str4);

    }



    @Test

    public void test224() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test224");

        com.alipay.sofa.common.config.source.SystemEnvConfigSource systemEnvConfigSource0 = new com.alipay.sofa.common.config.source.SystemEnvConfigSource();

        boolean boolean2 = systemEnvConfigSource0.hasKey("10");

        com.google.common.cache.CacheBuilder<java.lang.String, java.lang.String> strCacheBuilder3 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.config.source.ConfigSourceCacheWrapper configSourceCacheWrapper4 = new com.alipay.sofa.common.config.source.ConfigSourceCacheWrapper((com.alipay.sofa.common.config.source.AbstractConfigSource) systemEnvConfigSource0, strCacheBuilder3);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);

    }



    @Test

    public void test225() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test225");

        com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler sofaThreadPoolTaskScheduler0 = new com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler();

        int int1 = sofaThreadPoolTaskScheduler0.getThreadPriority();

        org.springframework.util.ErrorHandler errorHandler2 = null;

        sofaThreadPoolTaskScheduler0.setErrorHandler(errorHandler2);

        sofaThreadPoolTaskScheduler0.setThreadPriority(0);

        sofaThreadPoolTaskScheduler0.setBeanName("-");

        sofaThreadPoolTaskScheduler0.setThreadGroupName("a******************************}");

        java.lang.String str10 = sofaThreadPoolTaskScheduler0.getSpaceName();

        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);

        org.junit.Assert.assertNull(str10);

    }



    @Test

    public void test226() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test226");

        java.util.Iterator iterator0 = null;

        java.lang.String str2 = com.alipay.sofa.common.utils.StringUtil.join(iterator0, '4');

        org.junit.Assert.assertNull(str2);

    }



    @Test

    public void test227() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test227");

        java.lang.String str0 = com.alipay.sofa.common.profile.enumeration.internal.EnumConstant.CREATE_ENUM_TYPE_METHOD_NAME;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "createEnumType" + "'", str0, "createEnumType");

    }



    @Test

    public void test228() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test228");

        java.lang.ClassLoader classLoader1 = null;

        java.net.URL uRL2 = com.alipay.sofa.common.utils.ClassLoaderUtil.whichClass("priority                        ", classLoader1);

        org.junit.Assert.assertNull(uRL2);

    }



    @Test

    public void test229() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test229");

        boolean boolean1 = com.alipay.sofa.common.utils.StringUtil.isEmpty("log-conf.xml");

        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);

    }



    @Test

    public void test230() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test230");

        java.lang.String str3 = com.alipay.sofa.common.utils.StringUtil.center("0", 3, 'a');

        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a0a" + "'", str3, "a0a");

    }



    @Test

    public void test231() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test231");

        java.lang.String str2 = com.alipay.sofa.common.profile.diagnostic.Profiler.dump("Could not compare object of \"{0}\" with object of \"{1}\"", "ROOT");

        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");

    }



    @Test

    public void test232() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test232");

        float[] floatArray5 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray6 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray5);

        float[] floatArray12 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray13 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray12);

        int int15 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray6, floatArray12, (int) (byte) 0);

        float[] floatArray21 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray22 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray21);

        float[] floatArray28 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray29 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray28);

        int int31 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray22, floatArray28, (int) (byte) 0);

        float[] floatArray32 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray12, floatArray28);

        float[] floatArray38 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray39 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray38);

        float[] floatArray40 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray32, floatArray38);

        float[] floatArray46 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray47 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray46);

        float[] floatArray53 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray54 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray53);

        int int56 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray47, floatArray53, (int) (byte) 0);

        float[] floatArray62 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray63 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray62);

        float[] floatArray69 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray70 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray69);

        int int72 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray63, floatArray69, (int) (byte) 0);

        float[] floatArray73 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray53, floatArray69);

        int int75 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(floatArray32, floatArray69, (float) 2);

        org.junit.Assert.assertNotNull(floatArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray12);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray13);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);

        org.junit.Assert.assertNotNull(floatArray21);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray22);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray28);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray29);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);

        org.junit.Assert.assertNotNull(floatArray32);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray38);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray39);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray40);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray46);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray46), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray47);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray47), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray53);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray54);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);

        org.junit.Assert.assertNotNull(floatArray62);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray62), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray63);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray63), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray69);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray69), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray70);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray70), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);

        org.junit.Assert.assertNotNull(floatArray73);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray73), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);

    }



    @Test

    public void test233() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test233");

        com.alipay.sofa.common.utils.ReportUtil.report("com.alipay.sofa.common.log.proxy.LoggerProxy");

    }



    @Test

    public void test234() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test234");

        com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel messageLevel0 = com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel.NO_MESSAGE;

        java.lang.String str1 = messageLevel0.toBinaryString();

        org.junit.Assert.assertNotNull(messageLevel0);

        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");

    }



    @Test

    public void test235() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test235");

        java.lang.String str0 = com.alipay.sofa.common.log.Constants.LOG_XML_CONFIG_FILE_ENV_PATTERN;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "log-conf-%s.xml" + "'", str0, "log-conf-%s.xml");

    }



    @Test

    public void test236() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test236");

        java.lang.String str2 = com.alipay.sofa.common.utils.StringUtil.center("Flags must be of \"{0}\" or \"{1}\"", 0);

        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Flags must be of \"{0}\" or \"{1}\"" + "'", str2, "Flags must be of \"{0}\" or \"{1}\"");

    }



    @Test

    public void test237() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test237");

        boolean boolean2 = com.alipay.sofa.common.utils.StringUtil.equals("-", "\u63a7\u5236\u7ebf\u7a0b\u4fe1\u606f\u6253\u5370\u95f4\u9694");

        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);

    }



    @Test

    public void test238() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test238");

        java.lang.String str2 = com.alipay.sofa.common.utils.StringUtil.defaultIfEmpty("Flags must be of \"{0}\" or \"{1}\"", "0");

        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Flags must be of \"{0}\" or \"{1}\"" + "'", str2, "Flags must be of \"{0}\" or \"{1}\"");

    }



    @Test

    public void test239() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test239");

        boolean boolean0 = com.alipay.sofa.common.log.env.LogEnvUtils.isLogStarterExist();

        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);

    }



    @Test

    public void test240() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test240");

        org.slf4j.ILoggerFactory iLoggerFactory1 = com.alipay.sofa.common.log.MultiAppLoggerSpaceManager.removeILoggerFactoryBySpaceName("[0x64, 64, 0A, FF, 01]");

        org.junit.Assert.assertNull(iLoggerFactory1);

    }



    @Test

    public void test241() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test241");

        com.alipay.sofa.common.log.adapter.level.AdapterLevel adapterLevel0 = com.alipay.sofa.common.log.adapter.level.AdapterLevel.ERROR;

        org.junit.Assert.assertTrue("'" + adapterLevel0 + "' != '" + com.alipay.sofa.common.log.adapter.level.AdapterLevel.ERROR + "'", adapterLevel0.equals(com.alipay.sofa.common.log.adapter.level.AdapterLevel.ERROR));

    }



    @Test

    public void test242() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test242");

        java.lang.String str0 = com.alipay.sofa.common.profile.enumeration.internal.EnumConstant.ENUM_NAME_IS_EMPTY;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "The Enum name must not be empty" + "'", str0, "The Enum name must not be empty");

    }



    @Test

    public void test243() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test243");

        com.alipay.sofa.common.thread.SofaThreadPoolTaskExecutor sofaThreadPoolTaskExecutor0 = new com.alipay.sofa.common.thread.SofaThreadPoolTaskExecutor();

        sofaThreadPoolTaskExecutor0.setPeriod((-1L));

        sofaThreadPoolTaskExecutor0.setCorePoolSize(16);

    }



    @Test

    public void test244() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test244");

        com.alipay.sofa.common.config.source.ConfigSourceOrder configSourceOrder0 = new com.alipay.sofa.common.config.source.ConfigSourceOrder();

    }



    @Test

    public void test245() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test245");

        com.alipay.sofa.common.thread.ThreadPoolConfig.SofaThreadConfigBuilder sofaThreadConfigBuilder0 = com.alipay.sofa.common.thread.ThreadPoolConfig.newBuilder();

        com.alipay.sofa.common.thread.ThreadPoolConfig threadPoolConfig1 = sofaThreadConfigBuilder0.build();

        threadPoolConfig1.setTaskTimeoutMilli((long) (short) 0);

        java.lang.String str4 = threadPoolConfig1.toString();

        threadPoolConfig1.setPeriod(0L);

        org.junit.Assert.assertNotNull(sofaThreadConfigBuilder0);

        org.junit.Assert.assertNotNull(threadPoolConfig1);

        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ThreadPoolConfig{threadPoolName='null', spaceName='null', taskTimeout=30000, period=5000, timeUnit=MILLISECONDS, taskTimeoutMilli=0, identity='null'}" + "'", str4, "ThreadPoolConfig{threadPoolName='null', spaceName='null', taskTimeout=30000, period=5000, timeUnit=MILLISECONDS, taskTimeoutMilli=0, identity='null'}");

    }



    @Test

    public void test246() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test246");

        com.alipay.sofa.common.log.SpaceId spaceId1 = null;

        com.alipay.sofa.common.log.adapter.level.AdapterLevel adapterLevel6 = com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO;

        java.lang.String str7 = com.alipay.sofa.common.utils.ArrayUtil.toString((java.lang.Object) adapterLevel6);

        org.slf4j.Logger logger8 = com.alipay.sofa.common.log.MultiAppLoggerSpaceManager.setLoggerLevel("ROOT", "log4j2.middleware.log.disable", adapterLevel6);

        org.slf4j.Logger logger9 = com.alipay.sofa.common.log.MultiAppLoggerSpaceManager.setLoggerLevel("ROOT", "-", adapterLevel6);

        // The following exception was thrown during execution in test generation

        try {

            org.slf4j.Logger logger10 = com.alipay.sofa.common.log.LoggerSpaceManager.setLoggerLevel("The Enum class \"{0}\" is not an implementation of Flags", spaceId1, adapterLevel6);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertTrue("'" + adapterLevel6 + "' != '" + com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO + "'", adapterLevel6.equals(com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO));

        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AdapterLevel{logLevelMsg='info'}" + "'", str7, "AdapterLevel{logLevelMsg='info'}");

        org.junit.Assert.assertNotNull(logger8);

        org.junit.Assert.assertNotNull(logger9);

    }



    @Test

    public void test247() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test247");

        com.alipay.sofa.common.log.LogLog.warn("\u63a7\u5236\u7ebf\u7a0b\u4fe1\u606f\u6253\u5370\u95f4\u9694             ");

    }



    @Test

    public void test248() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test248");

        boolean[] booleanArray0 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_BOOLEAN_ARRAY;

        boolean[] booleanArray1 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_BOOLEAN_ARRAY;

        boolean[] booleanArray2 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfEmpty(booleanArray0, booleanArray1);

        boolean[] booleanArray3 = com.alipay.sofa.common.utils.ArrayUtil.clone(booleanArray1);

        boolean[] booleanArray4 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_BOOLEAN_ARRAY;

        boolean[] booleanArray5 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_BOOLEAN_ARRAY;

        boolean[] booleanArray6 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfEmpty(booleanArray4, booleanArray5);

        boolean boolean7 = com.alipay.sofa.common.utils.ArrayUtil.isSameLength(booleanArray1, booleanArray6);

        org.junit.Assert.assertNotNull(booleanArray0);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");

        org.junit.Assert.assertNotNull(booleanArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[]");

        org.junit.Assert.assertNotNull(booleanArray2);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[]");

        org.junit.Assert.assertNotNull(booleanArray3);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[]");

        org.junit.Assert.assertNotNull(booleanArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[]");

        org.junit.Assert.assertNotNull(booleanArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[]");

        org.junit.Assert.assertNotNull(booleanArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[]");

        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);

    }



    @Test

    public void test249() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test249");

        short[] shortArray0 = new short[] {};

        short[] shortArray1 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_SHORT_ARRAY;

        boolean boolean2 = com.alipay.sofa.common.utils.ArrayUtil.isSameLength(shortArray0, shortArray1);

        int int4 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(shortArray1, (short) (byte) 10);

        int int7 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(shortArray1, (short) 0, (int) (byte) 0);

        org.junit.Assert.assertNotNull(shortArray0);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");

        org.junit.Assert.assertNotNull(shortArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");

        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);

        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));

        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));

    }



    @Test

    public void test250() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test250");

        char[] charArray4 = new char[] { 'a', ' ', '4' };

        int int5 = com.alipay.sofa.common.utils.StringUtil.indexOfAny("FlagSet value must not be null", charArray4);

        char[] charArray6 = com.alipay.sofa.common.utils.ArrayUtil.clone(charArray4);

        com.alipay.sofa.common.utils.ArrayUtil.reverse(charArray6);

        org.junit.Assert.assertNotNull(charArray4);

        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a 4");

        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a 4");

        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a,  , 4]");

        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);

        org.junit.Assert.assertNotNull(charArray6);

        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4 a");

        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4 a");

        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4,  , a]");

    }



    @Test

    public void test251() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test251");

        java.lang.String str3 = com.alipay.sofa.common.utils.StringUtil.alignLeft("ThreadPoolConfig{threadPoolName='null', spaceName='null', taskTimeout=30000, period=5000, timeUnit=MILLISECONDS, taskTimeoutMilli=0, identity='null'}", (int) 'a', 'a');

        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ThreadPoolConfig{threadPoolName='null', spaceName='null', taskTimeout=30000, period=5000, timeUnit=MILLISECONDS, taskTimeoutMilli=0, identity='null'}" + "'", str3, "ThreadPoolConfig{threadPoolName='null', spaceName='null', taskTimeout=30000, period=5000, timeUnit=MILLISECONDS, taskTimeoutMilli=0, identity='null'}");

    }



    @Test

    public void test252() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test252");

        boolean boolean1 = com.alipay.sofa.common.utils.StringUtil.isAlpha("UTF-8");

        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);

    }



    @Test

    public void test253() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test253");

        char[] charArray5 = new char[] { 'a', ' ', '4' };

        int int6 = com.alipay.sofa.common.utils.StringUtil.indexOfAny("FlagSet value must not be null", charArray5);

        boolean boolean7 = com.alipay.sofa.common.utils.StringUtil.containsNone("The Enum value must not be null", charArray5);

        org.junit.Assert.assertNotNull(charArray5);

        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a 4");

        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a 4");

        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a,  , 4]");

        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);

        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);

    }



    @Test

    public void test254() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test254");

        com.alipay.sofa.common.log.CommonLoggingConfigurations.loadExternalConfiguration("FlagSet is immutable", "logging.config.");

    }



    @Test

    public void test255() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test255");

        com.alipay.sofa.common.config.source.SystemPropertyConfigSource systemPropertyConfigSource0 = new com.alipay.sofa.common.config.source.SystemPropertyConfigSource();

        int int1 = systemPropertyConfigSource0.getOrder();

        java.lang.String str3 = systemPropertyConfigSource0.doGetConfig("hi!");

        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);

        org.junit.Assert.assertNull(str3);

    }



    @Test

    public void test256() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test256");

        com.alipay.sofa.common.code.LogCode2Description logCode2Description1 = com.alipay.sofa.common.code.LogCode2Description.create("sofa.middleware.log.%s.console.level");

        java.lang.Class class3 = null;

        java.lang.Class[] classArray4 = new java.lang.Class[] { class3 };

        java.lang.Class[] classArray5 = new java.lang.Class[] {};

        boolean boolean6 = com.alipay.sofa.common.utils.ClassUtil.isAssignable(classArray4, classArray5);

        // The following exception was thrown during execution in test generation

        try {

            java.lang.String str7 = logCode2Description1.convert("", (java.lang.Object[]) classArray4);

            org.junit.Assert.fail("Expected exception of type java.util.MissingFormatArgumentException; message: Format specifier '%s'");

        } catch (java.util.MissingFormatArgumentException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(logCode2Description1);

        org.junit.Assert.assertNotNull(classArray4);

        org.junit.Assert.assertNotNull(classArray5);

        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);

    }



    @Test

    public void test257() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test257");

        com.alipay.sofa.common.thread.ThreadPoolConfig.SofaThreadConfigBuilder sofaThreadConfigBuilder0 = com.alipay.sofa.common.thread.ThreadPoolConfig.newBuilder();

        com.alipay.sofa.common.thread.ThreadPoolConfig threadPoolConfig1 = sofaThreadConfigBuilder0.build();

        threadPoolConfig1.setTaskTimeoutMilli((long) (short) 0);

        java.util.concurrent.TimeUnit timeUnit4 = threadPoolConfig1.getTimeUnit();

        long long5 = threadPoolConfig1.getPeriod();

        java.lang.String str6 = threadPoolConfig1.getSpaceName();

        org.junit.Assert.assertNotNull(sofaThreadConfigBuilder0);

        org.junit.Assert.assertNotNull(threadPoolConfig1);

        org.junit.Assert.assertNotNull(timeUnit4);

        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);

        org.junit.Assert.assertNull(str6);

    }



    @Test

    public void test258() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test258");

        char[] charArray4 = new char[] { 'a', '4', 'a', '4' };

        int int6 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(charArray4, '4');

        char[] charArray11 = new char[] { 'a', '4', 'a', '4' };

        int int13 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(charArray11, '4');

        int int15 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(charArray4, charArray11, (int) (short) 0);

        org.junit.Assert.assertNotNull(charArray4);

        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a4a4");

        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a4a4");

        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4, a, 4]");

        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);

        org.junit.Assert.assertNotNull(charArray11);

        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a4a4");

        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a4a4");

        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, a, 4]");

        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);

        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);

    }



    @Test

    public void test259() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test259");

        java.lang.Float[] floatArray0 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_FLOAT_OBJECT_ARRAY;

        java.lang.Object[] objArray1 = null;

        int int2 = com.alipay.sofa.common.utils.ArrayUtil.indexOf((java.lang.Object[]) floatArray0, objArray1);

        java.lang.Object[] objArray4 = new java.lang.Object[] { "" };

        boolean boolean5 = com.alipay.sofa.common.utils.ArrayUtil.contains(objArray1, objArray4);

        java.lang.String str7 = com.alipay.sofa.common.utils.StringUtil.join(objArray4, 'a');

        org.junit.Assert.assertNotNull(floatArray0);

        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));

        org.junit.Assert.assertNotNull(objArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");

        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");

        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);

        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");

    }



    @Test

    public void test260() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test260");

        com.alipay.sofa.common.space.SpaceId spaceId0 = null;

        com.alipay.sofa.common.log.LogSpace logSpace1 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.log.factory.LoggerSpaceFactory4Log4j2Builder loggerSpaceFactory4Log4j2Builder2 = new com.alipay.sofa.common.log.factory.LoggerSpaceFactory4Log4j2Builder(spaceId0, logSpace1);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - this argument is required; it must not be null");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

    }



    @Test

    public void test261() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test261");

        java.lang.Byte[] byteArray0 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_BYTE_OBJECT_ARRAY;

        com.alipay.sofa.common.utils.ArrayUtil.reverse((java.lang.Object[]) byteArray0);

        java.lang.Object[] objArray2 = null;

        java.util.Map map3 = com.alipay.sofa.common.log.MultiAppLoggerSpaceManager.getSpacesMap();

        java.util.Map map4 = com.alipay.sofa.common.utils.ArrayUtil.toMap(objArray2, map3);

        java.util.Map map5 = com.alipay.sofa.common.utils.ArrayUtil.toMap((java.lang.Object[]) byteArray0, map3);

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.utils.AssertUtil.notEmpty(map5, "a0a");

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a0a");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray0);

        org.junit.Assert.assertNotNull(map3);

        org.junit.Assert.assertNotNull(map4);

        org.junit.Assert.assertNotNull(map5);

    }



    @Test

    public void test262() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test262");

        java.lang.String str2 = com.alipay.sofa.common.security.SensitiveDataUtil.emailHide("aROOTdapterLevel{logLevelMsg='info'}.class", false);

        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aROOTdapterLevel{logLevelMsg='info'}.class" + "'", str2, "aROOTdapterLevel{logLevelMsg='info'}.class");

    }



    @Test

    public void test263() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test263");

        java.lang.String str2 = com.alipay.sofa.common.utils.StringUtil.repeat("*", (int) (short) 100);

        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "****************************************************************************************************" + "'", str2, "****************************************************************************************************");

    }



    @Test

    public void test264() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test264");

        java.lang.String str0 = com.alipay.sofa.common.profile.enumeration.internal.EnumConstant.ENUM_CLASS_IS_NULL;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "The Enum class must not be null" + "'", str0, "The Enum class must not be null");

    }



    @Test

    public void test265() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test265");

        short[] shortArray5 = new short[] { (byte) 1, (byte) -1, (byte) 10, (byte) 100 };

        short[] shortArray10 = new short[] { (short) -1, (short) -1, (byte) 10, (byte) 10 };

        int int12 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(shortArray5, shortArray10, (int) (byte) 100);

        java.lang.Object[] objArray13 = new java.lang.Object[] { 100, int12 };

        java.lang.Float[] floatArray14 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_FLOAT_OBJECT_ARRAY;

        java.lang.Object[] objArray15 = null;

        int int16 = com.alipay.sofa.common.utils.ArrayUtil.indexOf((java.lang.Object[]) floatArray14, objArray15);

        int int18 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(objArray13, objArray15, (int) (short) 0);

        com.alipay.sofa.common.utils.AssertUtil.notEmpty(objArray13, "logging.config.");

        java.lang.Float[] floatArray22 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_FLOAT_OBJECT_ARRAY;

        java.lang.Object[] objArray23 = null;

        int int24 = com.alipay.sofa.common.utils.ArrayUtil.indexOf((java.lang.Object[]) floatArray22, objArray23);

        java.lang.Object[] objArray26 = new java.lang.Object[] { "" };

        boolean boolean27 = com.alipay.sofa.common.utils.ArrayUtil.contains(objArray23, objArray26);

        com.alipay.sofa.common.thread.log.ThreadLogger.error("FlagSet value must not be null", objArray26);

        java.lang.Float[] floatArray29 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_FLOAT_OBJECT_ARRAY;

        com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel messageLevel30 = com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel.NO_MESSAGE;

        java.lang.String str31 = messageLevel30.getName();

        java.lang.String str32 = messageLevel30.toString();

        int[] intArray36 = new int[] { (short) 10, '4', (byte) 0 };

        int[] intArray39 = new int[] { (byte) 1, (byte) 1 };

        boolean boolean40 = com.alipay.sofa.common.utils.ArrayUtil.contains(intArray36, intArray39);

        boolean boolean42 = com.alipay.sofa.common.utils.ArrayUtil.contains(intArray39, (int) (short) 0);

        int[] intArray45 = new int[] { (short) 10, (byte) 10 };

        int int47 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(intArray39, intArray45, (int) (byte) -1);

        float[] floatArray53 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray54 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray53);

        float[] floatArray60 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray61 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray60);

        int int63 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray54, floatArray60, (int) (byte) 0);

        float[] floatArray69 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray70 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray69);

        int int72 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(floatArray60, floatArray69, (float) 5);

        float[] floatArray79 = new float[] { 100.0f, (-1), 0.0f, (-1.0f), 5, (-1L) };

        boolean boolean80 = com.alipay.sofa.common.utils.ArrayUtil.isNotEmpty(floatArray79);

        int int81 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray69, floatArray79);

        java.lang.Object[] objArray82 = new java.lang.Object[] { floatArray29, str32, intArray45, floatArray79 };

        int int84 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(objArray26, (java.lang.Object[]) floatArray29, (int) (short) 100);

        int int86 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(objArray13, (java.lang.Object[]) floatArray29, 0);

        org.junit.Assert.assertNotNull(shortArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, -1, 10, 100]");

        org.junit.Assert.assertNotNull(shortArray10);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[-1, -1, 10, 10]");

        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));

        org.junit.Assert.assertNotNull(objArray13);

        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100, -1]");

        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100, -1]");

        org.junit.Assert.assertNotNull(floatArray14);

        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));

        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));

        org.junit.Assert.assertNotNull(floatArray22);

        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));

        org.junit.Assert.assertNotNull(objArray26);

        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");

        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");

        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);

        org.junit.Assert.assertNotNull(floatArray29);

        org.junit.Assert.assertNotNull(messageLevel30);

        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "NO_MESSAGE" + "'", str31, "NO_MESSAGE");

        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "NO_MESSAGE" + "'", str32, "NO_MESSAGE");

        org.junit.Assert.assertNotNull(intArray36);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[10, 52, 0]");

        org.junit.Assert.assertNotNull(intArray39);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 1]");

        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);

        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);

        org.junit.Assert.assertNotNull(intArray45);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[10, 10]");

        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));

        org.junit.Assert.assertNotNull(floatArray53);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray54);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray60);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray60), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray61);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray61), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);

        org.junit.Assert.assertNotNull(floatArray69);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray69), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray70);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray70), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);

        org.junit.Assert.assertNotNull(floatArray79);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray79), "[100.0, -1.0, 0.0, -1.0, 5.0, -1.0]");

        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);

        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));

        org.junit.Assert.assertNotNull(objArray82);

        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[[], NO_MESSAGE, [10, 10], [100.0, -1.0, 0.0, -1.0, 5.0, -1.0]]");

        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);

        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);

    }



    @Test

    public void test266() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test266");

        java.lang.String str0 = com.alipay.sofa.common.log.Constants.LOGBACK_MIDDLEWARE_LOG_DISABLE_PROP_KEY;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "logback.middleware.log.disable" + "'", str0, "logback.middleware.log.disable");

    }



    @Test

    public void test267() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test267");

        java.lang.String str0 = com.alipay.sofa.common.log.Constants.LOG_DIRECTORY;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "log" + "'", str0, "log");

    }



    @Test

    public void test268() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test268");

        java.net.URL[] uRLArray1 = com.alipay.sofa.common.utils.ClassLoaderUtil.getResources("");

        com.alipay.sofa.common.utils.AssertUtil.noNullElements((java.lang.Object[]) uRLArray1);

        org.junit.Assert.assertNotNull(uRLArray1);

    }



    @Test

    public void test269() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test269");

        char[] charArray4 = new char[] { 'a', '4', 'a', '4' };

        int int6 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(charArray4, '4');

        char[] charArray11 = new char[] { 'a', ' ', '4' };

        int int12 = com.alipay.sofa.common.utils.StringUtil.indexOfAny("FlagSet value must not be null", charArray11);

        char[] charArray13 = com.alipay.sofa.common.utils.ArrayUtil.clone(charArray11);

        int int16 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(charArray13, '#', (int) (short) 1);

        int int18 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(charArray4, charArray13, 100);

        org.junit.Assert.assertNotNull(charArray4);

        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a4a4");

        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a4a4");

        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4, a, 4]");

        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);

        org.junit.Assert.assertNotNull(charArray11);

        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a 4");

        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a 4");

        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a,  , 4]");

        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);

        org.junit.Assert.assertNotNull(charArray13);

        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a 4");

        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a 4");

        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a,  , 4]");

        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));

        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));

    }



    @Test

    public void test270() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test270");

        java.lang.String str1 = com.alipay.sofa.common.security.SensitiveDataUtil.taobaoNickHide("log-conf.xml");

        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "l**l" + "'", str1, "l**l");

    }



    @Test

    public void test271() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test271");

        int[] intArray0 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_INT_ARRAY;

        org.junit.Assert.assertNotNull(intArray0);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");

    }



    @Test

    public void test272() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test272");

        java.lang.Throwable throwable1 = null;

        com.alipay.sofa.common.log.LogLog.warn("", throwable1);

    }



    @Test

    public void test273() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test273");

        boolean boolean0 = com.alipay.sofa.common.log.Constants.LOGBACK_MIDDLEWARE_LOG_DISABLE;

        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);

    }



    @Test

    public void test274() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test274");

        short[] shortArray0 = new short[] {};

        short[] shortArray1 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_SHORT_ARRAY;

        boolean boolean2 = com.alipay.sofa.common.utils.ArrayUtil.isSameLength(shortArray0, shortArray1);

        int int4 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(shortArray1, (short) (byte) 10);

        short[] shortArray9 = new short[] { (byte) 1, (byte) -1, (byte) 10, (byte) 100 };

        short[] shortArray14 = new short[] { (short) -1, (short) -1, (byte) 10, (byte) 10 };

        int int16 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(shortArray9, shortArray14, (int) (byte) 100);

        boolean boolean17 = com.alipay.sofa.common.utils.ArrayUtil.contains(shortArray1, shortArray9);

        short[] shortArray22 = new short[] { (byte) 1, (byte) -1, (byte) 10, (byte) 100 };

        short[] shortArray27 = new short[] { (short) -1, (short) -1, (byte) 10, (byte) 10 };

        int int29 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(shortArray22, shortArray27, (int) (byte) 100);

        int int30 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(shortArray9, shortArray22);

        int int32 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(shortArray22, (short) (byte) 1);

        org.junit.Assert.assertNotNull(shortArray0);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");

        org.junit.Assert.assertNotNull(shortArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");

        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);

        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));

        org.junit.Assert.assertNotNull(shortArray9);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[1, -1, 10, 100]");

        org.junit.Assert.assertNotNull(shortArray14);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[-1, -1, 10, 10]");

        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));

        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);

        org.junit.Assert.assertNotNull(shortArray22);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[1, -1, 10, 100]");

        org.junit.Assert.assertNotNull(shortArray27);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[-1, -1, 10, 10]");

        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));

        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);

        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);

    }



    @Test

    public void test275() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test275");

        java.lang.String str1 = com.alipay.sofa.common.utils.ClassUtil.getClassNameAsResource("The Enum name must not be empty");

        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "The Enum name must not be empty.class" + "'", str1, "The Enum name must not be empty.class");

    }



    @Test

    public void test276() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test276");

        com.alipay.sofa.common.thread.ThreadPoolConfig.SofaThreadConfigBuilder sofaThreadConfigBuilder0 = com.alipay.sofa.common.thread.ThreadPoolConfig.newBuilder();

        com.alipay.sofa.common.thread.ThreadPoolConfig threadPoolConfig1 = sofaThreadConfigBuilder0.build();

        threadPoolConfig1.setTaskTimeoutMilli((long) (short) 0);

        java.lang.String str4 = threadPoolConfig1.getSpaceName();

        org.junit.Assert.assertNotNull(sofaThreadConfigBuilder0);

        org.junit.Assert.assertNotNull(threadPoolConfig1);

        org.junit.Assert.assertNull(str4);

    }



    @Test

    public void test277() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test277");

        java.lang.Class class0 = null;

        java.lang.Class[] classArray1 = new java.lang.Class[] { class0 };

        java.lang.Class[] classArray2 = new java.lang.Class[] {};

        boolean boolean3 = com.alipay.sofa.common.utils.ClassUtil.isAssignable(classArray1, classArray2);

        java.lang.Class class4 = null;

        java.lang.Class[] classArray5 = new java.lang.Class[] { class4 };

        java.lang.Class[] classArray6 = new java.lang.Class[] {};

        boolean boolean7 = com.alipay.sofa.common.utils.ClassUtil.isAssignable(classArray5, classArray6);

        boolean boolean8 = com.alipay.sofa.common.utils.ClassUtil.isAssignable(classArray1, classArray5);

        java.lang.String str10 = com.alipay.sofa.common.utils.StringUtil.join((java.lang.Object[]) classArray1, ' ');

        org.junit.Assert.assertNotNull(classArray1);

        org.junit.Assert.assertNotNull(classArray2);

        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);

        org.junit.Assert.assertNotNull(classArray5);

        org.junit.Assert.assertNotNull(classArray6);

        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);

        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);

        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");

    }



    @Test

    public void test278() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test278");

        com.alipay.sofa.common.space.SpaceId spaceId0 = null;

        com.alipay.sofa.common.log.SpaceInfo spaceInfo1 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.log.factory.LoggerSpaceFactory4Log4jBuilder loggerSpaceFactory4Log4jBuilder2 = new com.alipay.sofa.common.log.factory.LoggerSpaceFactory4Log4jBuilder(spaceId0, spaceInfo1);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - this argument is required; it must not be null");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

    }



    @Test

    public void test279() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test279");

        java.io.InputStream inputStream1 = com.alipay.sofa.common.utils.ClassLoaderUtil.getResourceAsStream("FlagSet is immutable");

        org.junit.Assert.assertNull(inputStream1);

    }



    @Test

    public void test280() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test280");

        int int2 = com.alipay.sofa.common.utils.StringUtil.indexOfDifference("[0x64, 64, 0A, FF, 01]", "ThreadPoolConfig{threadPoolName='null', spaceName='null', taskTimeout=30000, period=5000, timeUnit=MILLISECONDS, taskTimeoutMilli=0, identity='null'}");

        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);

    }



    @Test

    public void test281() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test281");

        float[] floatArray5 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray6 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray5);

        float[] floatArray12 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray13 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray12);

        float[] floatArray19 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray20 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray19);

        int int22 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray13, floatArray19, (int) (byte) 0);

        float[] floatArray28 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray29 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray28);

        float[] floatArray35 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray36 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray35);

        int int38 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray29, floatArray35, (int) (byte) 0);

        float[] floatArray39 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray19, floatArray35);

        float[] floatArray40 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray5, floatArray35);

        org.junit.Assert.assertNotNull(floatArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray12);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray13);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray19);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray20);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);

        org.junit.Assert.assertNotNull(floatArray28);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray29);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray35);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray36);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);

        org.junit.Assert.assertNotNull(floatArray39);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray40);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[10.0, 0.0, 1.0, 100.0, 35.0]");

    }



    @Test

    public void test282() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test282");

        com.alipay.sofa.common.log.adapter.level.AdapterLevel adapterLevel4 = com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO;

        java.lang.String str5 = com.alipay.sofa.common.utils.ArrayUtil.toString((java.lang.Object) adapterLevel4);

        org.slf4j.Logger logger6 = com.alipay.sofa.common.log.MultiAppLoggerSpaceManager.setLoggerLevel("ROOT", "log4j2.middleware.log.disable", adapterLevel4);

        org.slf4j.Logger logger7 = com.alipay.sofa.common.log.MultiAppLoggerSpaceManager.setLoggerLevel("ROOT", "-", adapterLevel4);

        java.lang.Class<?> wildcardClass8 = logger7.getClass();

        // The following exception was thrown during execution in test generation

        try {

            java.util.Iterator iterator9 = com.alipay.sofa.common.profile.enumeration.EnumUtil.getEnumIterator((java.lang.Class) wildcardClass8);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Class \"com.alipay.sofa.common.log.proxy.LoggerProxy\" is not a subclass of Enum");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

        org.junit.Assert.assertTrue("'" + adapterLevel4 + "' != '" + com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO + "'", adapterLevel4.equals(com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO));

        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AdapterLevel{logLevelMsg='info'}" + "'", str5, "AdapterLevel{logLevelMsg='info'}");

        org.junit.Assert.assertNotNull(logger6);

        org.junit.Assert.assertNotNull(logger7);

        org.junit.Assert.assertNotNull(wildcardClass8);

    }



    @Test

    public void test283() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test283");

        com.alipay.sofa.common.log.adapter.level.AdapterLevel adapterLevel5 = com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO;

        java.lang.String str6 = com.alipay.sofa.common.utils.ArrayUtil.toString((java.lang.Object) adapterLevel5);

        org.slf4j.Logger logger7 = com.alipay.sofa.common.log.MultiAppLoggerSpaceManager.setLoggerLevel("ROOT", "log4j2.middleware.log.disable", adapterLevel5);

        org.slf4j.Logger logger8 = com.alipay.sofa.common.log.MultiAppLoggerSpaceManager.setLoggerLevel("ROOT", "-", adapterLevel5);

        java.lang.Class<?> wildcardClass9 = logger8.getClass();

        // The following exception was thrown during execution in test generation

        try {

            java.lang.Object obj10 = com.alipay.sofa.common.utils.ClassLoaderUtil.newServiceInstance("NO_MESSAGE", (java.lang.Class) wildcardClass9);

            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Could not find META-INF/services/NO_MESSAGE");

        } catch (java.lang.RuntimeException e) {

            // Expected exception.

        }

        org.junit.Assert.assertTrue("'" + adapterLevel5 + "' != '" + com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO + "'", adapterLevel5.equals(com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO));

        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AdapterLevel{logLevelMsg='info'}" + "'", str6, "AdapterLevel{logLevelMsg='info'}");

        org.junit.Assert.assertNotNull(logger7);

        org.junit.Assert.assertNotNull(logger8);

        org.junit.Assert.assertNotNull(wildcardClass9);

    }



    @Test

    public void test284() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test284");

        java.lang.Class class1 = null;

        java.lang.Class[] classArray2 = new java.lang.Class[] { class1 };

        java.lang.Class[] classArray3 = new java.lang.Class[] {};

        boolean boolean4 = com.alipay.sofa.common.utils.ClassUtil.isAssignable(classArray2, classArray3);

        java.util.List list5 = com.alipay.sofa.common.utils.ArrayUtil.toFixedList((java.lang.Object[]) classArray3);

        // The following exception was thrown during execution in test generation

        try {

            java.util.List list6 = com.alipay.sofa.common.utils.ArrayUtil.toList((java.lang.Object) "aROOTdapterLevel{logLevelMsg='info'}.class", list5);

            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");

        } catch (java.lang.UnsupportedOperationException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(classArray2);

        org.junit.Assert.assertNotNull(classArray3);

        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);

        org.junit.Assert.assertNotNull(list5);

    }



    @Test

    public void test285() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test285");

        boolean boolean1 = com.alipay.sofa.common.utils.StringUtil.isAlpha("[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);

    }



    @Test

    public void test286() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test286");

        com.alipay.sofa.common.config.source.SystemEnvConfigSource systemEnvConfigSource0 = new com.alipay.sofa.common.config.source.SystemEnvConfigSource();

        com.alipay.sofa.common.config.source.ConfigSourceCacheWrapper configSourceCacheWrapper2 = new com.alipay.sofa.common.config.source.ConfigSourceCacheWrapper((com.alipay.sofa.common.config.source.AbstractConfigSource) systemEnvConfigSource0, (long) 5);

        com.google.common.cache.CacheBuilder<java.lang.String, java.lang.String> strCacheBuilder3 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.config.source.ConfigSourceCacheWrapper configSourceCacheWrapper4 = new com.alipay.sofa.common.config.source.ConfigSourceCacheWrapper((com.alipay.sofa.common.config.source.AbstractConfigSource) systemEnvConfigSource0, strCacheBuilder3);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test287() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test287");

        java.lang.Short[] shortArray0 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_SHORT_OBJECT_ARRAY;

        org.junit.Assert.assertNotNull(shortArray0);

    }



    @Test

    public void test288() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test288");

        java.util.Map map0 = com.alipay.sofa.common.log.MultiAppLoggerSpaceManager.getSpacesMap();

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.utils.AssertUtil.notEmpty(map0, "UTF-8");

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: UTF-8");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(map0);

    }



    @Test

    public void test289() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test289");

        double[] doubleArray4 = new double[] { 100L, 10, (byte) 100, 0 };

        int int7 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(doubleArray4, 0.0d, (double) (short) 100);

        double[] doubleArray11 = new double[] { 100.0f, (-1.0d), 100.0d };

        int int14 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(doubleArray4, doubleArray11, (int) (byte) 100, (double) 10.0f);

        boolean boolean16 = com.alipay.sofa.common.utils.ArrayUtil.contains(doubleArray11, (double) 8);

        boolean boolean19 = com.alipay.sofa.common.utils.ArrayUtil.contains(doubleArray11, (double) '4', (double) '#');

        boolean boolean22 = com.alipay.sofa.common.utils.ArrayUtil.contains(doubleArray11, (double) 97L, (double) (short) 1);

        org.junit.Assert.assertNotNull(doubleArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0, 10.0, 100.0, 0.0]");

        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);

        org.junit.Assert.assertNotNull(doubleArray11);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, -1.0, 100.0]");

        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));

        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);

        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);

        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);

    }



    @Test

    public void test290() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test290");

        java.lang.Class class2 = null;

        // The following exception was thrown during execution in test generation

        try {

            java.lang.Object obj3 = com.alipay.sofa.common.utils.ClassLoaderUtil.newServiceInstance("logging.level.", "log-*.xml", class2);

            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.ClassNotFoundException: logging.level.");

        } catch (java.lang.RuntimeException e) {

            // Expected exception.

        }

    }



    @Test

    public void test291() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test291");

        java.lang.ClassLoader classLoader1 = null;

        // The following exception was thrown during execution in test generation

        try {

            java.lang.Object obj2 = com.alipay.sofa.common.utils.ClassLoaderUtil.newServiceInstance("priority                        ", classLoader1);

            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Could not find META-INF/services/priority                        ");

        } catch (java.lang.RuntimeException e) {

            // Expected exception.

        }

    }



    @Test

    public void test292() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test292");

        // The following exception was thrown during execution in test generation

        try {

            java.lang.String str1 = com.alipay.sofa.common.security.SensitiveDataUtil.emailHideSMS("The Enum value must not be null");

            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");

        } catch (java.lang.StringIndexOutOfBoundsException e) {

            // Expected exception.

        }

    }



    @Test

    public void test293() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test293");

        com.alipay.sofa.common.log.SpaceId spaceId1 = null;

        com.alipay.sofa.common.log.adapter.level.AdapterLevel adapterLevel4 = com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO;

        org.slf4j.Logger logger5 = com.alipay.sofa.common.log.LoggerSpaceManager.setLoggerLevel("10", "log-conf.xml", adapterLevel4);

        // The following exception was thrown during execution in test generation

        try {

            org.slf4j.Logger logger6 = com.alipay.sofa.common.log.MultiAppLoggerSpaceManager.setLoggerLevel("log-conf.xml", spaceId1, adapterLevel4);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertTrue("'" + adapterLevel4 + "' != '" + com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO + "'", adapterLevel4.equals(com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO));

        org.junit.Assert.assertNotNull(logger5);

    }



    @Test

    public void test294() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test294");

        com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler sofaThreadPoolTaskScheduler4 = new com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler();

        com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor sofaScheduledThreadPoolExecutor6 = new com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor((int) '#');

        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler7 = sofaScheduledThreadPoolExecutor6.getRejectedExecutionHandler();

        com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor sofaScheduledThreadPoolExecutor10 = new com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor(5, (java.util.concurrent.ThreadFactory) sofaThreadPoolTaskScheduler4, rejectedExecutionHandler7, "The Enum class \"{0}\" is not an implementation of Flags", "logging...");

        com.alipay.sofa.common.thread.ThreadPoolConfig threadPoolConfig11 = null;

        com.alipay.sofa.common.thread.ThreadPoolStatistics threadPoolStatistics12 = null;

        com.alipay.sofa.common.thread.ThreadPoolMonitorRunner threadPoolMonitorRunner13 = new com.alipay.sofa.common.thread.ThreadPoolMonitorRunner(threadPoolConfig11, threadPoolStatistics12);

        com.alipay.sofa.common.thread.ThreadPoolConfig.SofaThreadConfigBuilder sofaThreadConfigBuilder16 = com.alipay.sofa.common.thread.ThreadPoolConfig.newBuilder();

        com.alipay.sofa.common.thread.ThreadPoolConfig threadPoolConfig17 = sofaThreadConfigBuilder16.build();

        threadPoolConfig17.setTaskTimeoutMilli((long) (short) 0);

        java.util.concurrent.TimeUnit timeUnit20 = threadPoolConfig17.getTimeUnit();

        java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture21 = sofaScheduledThreadPoolExecutor10.scheduleWithFixedDelay((java.lang.Runnable) threadPoolMonitorRunner13, (long) (byte) -1, (long) 36, timeUnit20);

        java.util.concurrent.BlockingQueue<java.lang.Runnable> runnableQueue22 = null;

        com.alipay.sofa.common.thread.SofaThreadPoolTaskExecutor sofaThreadPoolTaskExecutor23 = new com.alipay.sofa.common.thread.SofaThreadPoolTaskExecutor();

        sofaThreadPoolTaskExecutor23.setPeriod((-1L));

        int int26 = sofaThreadPoolTaskExecutor23.getActiveCount();

        java.util.concurrent.TimeUnit timeUnit27 = sofaThreadPoolTaskExecutor23.getTimeUnit();

        sofaThreadPoolTaskExecutor23.setWaitForTasksToCompleteOnShutdown(false);

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.thread.SofaThreadPoolExecutor sofaThreadPoolExecutor30 = new com.alipay.sofa.common.thread.SofaThreadPoolExecutor((int) (byte) 100, (int) (short) 0, 0L, timeUnit20, runnableQueue22, (java.util.concurrent.ThreadFactory) sofaThreadPoolTaskExecutor23);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(rejectedExecutionHandler7);

        org.junit.Assert.assertNotNull(sofaThreadConfigBuilder16);

        org.junit.Assert.assertNotNull(threadPoolConfig17);

        org.junit.Assert.assertNotNull(timeUnit20);

        org.junit.Assert.assertNotNull(wildcardScheduledFuture21);

        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);

        org.junit.Assert.assertNotNull(timeUnit27);

    }



    @Test

    public void test295() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test295");

        com.alipay.sofa.common.space.SpaceId spaceId1 = null;

        com.alipay.sofa.common.log.adapter.level.AdapterLevel adapterLevel2 = null;

        // The following exception was thrown during execution in test generation

        try {

            org.slf4j.Logger logger3 = com.alipay.sofa.common.log.LoggerSpaceManager.setLoggerLevel("logging.path.", spaceId1, adapterLevel2);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test296() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test296");

        com.alipay.sofa.common.log.adapter.level.AdapterLevel adapterLevel4 = com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO;

        java.lang.String str5 = com.alipay.sofa.common.utils.ArrayUtil.toString((java.lang.Object) adapterLevel4);

        org.slf4j.Logger logger6 = com.alipay.sofa.common.log.MultiAppLoggerSpaceManager.setLoggerLevel("ROOT", "log4j2.middleware.log.disable", adapterLevel4);

        org.slf4j.Logger logger7 = com.alipay.sofa.common.log.LoggerSpaceManager.setLoggerLevel("[10.0, 0.0, 1.0, 100.0, 35.0]", "createEnumType", adapterLevel4);

        org.junit.Assert.assertTrue("'" + adapterLevel4 + "' != '" + com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO + "'", adapterLevel4.equals(com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO));

        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AdapterLevel{logLevelMsg='info'}" + "'", str5, "AdapterLevel{logLevelMsg='info'}");

        org.junit.Assert.assertNotNull(logger6);

        org.junit.Assert.assertNotNull(logger7);

    }



    @Test

    public void test297() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test297");

        java.net.URI uRI1 = com.alipay.sofa.common.utils.ResourceUtil.toURI("\u63a7\u5236\u7ebf\u7a0b\u4fe1\u606f\u6253\u5370\u95f4\u9694             ");

        org.junit.Assert.assertNotNull(uRI1);

    }



    @Test

    public void test298() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test298");

        java.lang.Class class1 = null;

        java.lang.Class[] classArray2 = new java.lang.Class[] { class1 };

        java.lang.Class[] classArray3 = new java.lang.Class[] {};

        boolean boolean4 = com.alipay.sofa.common.utils.ClassUtil.isAssignable(classArray2, classArray3);

        java.lang.Class class5 = null;

        java.lang.Class[] classArray6 = new java.lang.Class[] { class5 };

        java.lang.Class[] classArray7 = new java.lang.Class[] {};

        boolean boolean8 = com.alipay.sofa.common.utils.ClassUtil.isAssignable(classArray6, classArray7);

        boolean boolean9 = com.alipay.sofa.common.utils.ClassUtil.isAssignable(classArray2, classArray6);

        com.alipay.sofa.common.thread.log.ThreadLogger.warn("Flags must be of \"{0}\" or \"{1}\"", (java.lang.Object[]) classArray2);

        org.junit.Assert.assertNotNull(classArray2);

        org.junit.Assert.assertNotNull(classArray3);

        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);

        org.junit.Assert.assertNotNull(classArray6);

        org.junit.Assert.assertNotNull(classArray7);

        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);

        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);

    }



    @Test

    public void test299() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test299");

        java.lang.Object[] objArray0 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_OBJECT_ARRAY;

        org.junit.Assert.assertNotNull(objArray0);

        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");

        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");

    }



    @Test

    public void test300() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test300");

        java.lang.String[] strArray45 = new java.lang.String[] { "log-conf.xml", "\u63a7\u5236\u7ebf\u7a0b\u4fe1\u606f\u6253\u5370\u95f4\u9694", "1", "*", "adapterLevel{logLevelMsg='info'}.class", "sofa.middleware.log.console.level", "log-*.xml", "adapterLevel{logLevelMsg='info'}.class", "log-conf-%s.xml", "adapterLevel{logLevelMsg='info'}.class", "logging.config.", "sofa.middleware.log.console.level", "Flags must be of \"{0}\" or \"{1}\"", "aROOTdapterLevel{logLevelMsg='info'}.class", "logging...", "[0x64, 64, 0A, FF, 01]", "Flags must be of \"{0}\" or \"{1}\" ", "AdapterLevel{logLevelMsg='info'}", "sofa.middleware.log.console.level", "[10.0, 0.0, 1.0, 100.0, 35.0]", "UTF-8", "ROOT", "The Enum name must not be empty", "Flags must be of \"{0}\" or \"{1}\" ", "NO_MESSAGE", "sofa.middleware.log.internal.level", "The Enum value must not be null", "", "utf-8", "aROOTdapterLevel{logLevelMsg='info'}.class", "priority", "com.alipay.sofa.common.log.proxy.LoggerProxy", "l**l", "*", "Could not compare object of \"{0}\" with object of \"{1}\"", "adapterLevel{logLevelMsg='info'}", "ROOT", "log-*.xml", "NO_MESSAGE", "The Enum class \"{0}\" is not an implementation of Flags", "log-*.xml", "Could not compare object of \"{0}\" with object of \"{1}\"", "adapterLevel{logLevelMsg='info'}", "", "log-*.xml" };

        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();

        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);

        com.alipay.sofa.common.log.CommonLoggingConfigurations.setLoggerConsoleWhiteSet((java.util.Set<java.lang.String>) strSet46);

        org.junit.Assert.assertNotNull(strArray45);

        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);

    }



    @Test

    public void test301() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test301");

        com.alipay.sofa.common.config.ConfigKey<java.lang.Long> longConfigKey0 = com.alipay.sofa.common.CommonToolConfigKeys.COMMON_THREAD_LOG_PERIOD;

        java.lang.String str1 = longConfigKey0.getDescription();

        java.lang.Class<java.lang.Long> longClass2 = longConfigKey0.getType();

        java.lang.Class class3 = com.alipay.sofa.common.utils.ClassUtil.getPrimitiveType((java.lang.Class) longClass2);

        org.junit.Assert.assertNotNull(longConfigKey0);

        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u63a7\u5236\u7ebf\u7a0b\u4fe1\u606f\u6253\u5370\u95f4\u9694" + "'", str1, "\u63a7\u5236\u7ebf\u7a0b\u4fe1\u606f\u6253\u5370\u95f4\u9694");

        org.junit.Assert.assertNotNull(longClass2);

        org.junit.Assert.assertNotNull(class3);

    }



    @Test

    public void test302() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test302");

        boolean boolean2 = com.alipay.sofa.common.utils.StringUtil.equalsIgnoreCase("sofa.middleware.log.console.level", "The Enum name must not be empty");

        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);

    }



    @Test

    public void test303() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test303");

        boolean boolean1 = com.alipay.sofa.common.utils.StringUtil.isAlpha("adapterLevel{logLevelMsg='info'}.class");

        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);

    }



    @Test

    public void test304() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test304");

        java.lang.Object obj0 = null;

        java.lang.Class class1 = null;

        java.lang.Class[] classArray2 = new java.lang.Class[] { class1 };

        java.lang.Class[] classArray3 = new java.lang.Class[] {};

        boolean boolean4 = com.alipay.sofa.common.utils.ClassUtil.isAssignable(classArray2, classArray3);

        java.util.List list5 = com.alipay.sofa.common.utils.ArrayUtil.toFixedList((java.lang.Object[]) classArray3);

        java.util.List list6 = com.alipay.sofa.common.utils.ArrayUtil.toList(obj0, list5);

        org.junit.Assert.assertNotNull(classArray2);

        org.junit.Assert.assertNotNull(classArray3);

        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);

        org.junit.Assert.assertNotNull(list5);

        org.junit.Assert.assertNotNull(list6);

    }



    @Test

    public void test305() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test305");

        java.lang.String[] strArray2 = com.alipay.sofa.common.utils.StringUtil.split("1", "NO_MESSAGE");

        org.junit.Assert.assertNotNull(strArray2);

    }



    @Test

    public void test306() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test306");

        com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler sofaThreadPoolTaskScheduler1 = new com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler();

        com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor sofaScheduledThreadPoolExecutor3 = new com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor((int) '#');

        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler4 = sofaScheduledThreadPoolExecutor3.getRejectedExecutionHandler();

        com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor sofaScheduledThreadPoolExecutor7 = new com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor(5, (java.util.concurrent.ThreadFactory) sofaThreadPoolTaskScheduler1, rejectedExecutionHandler4, "The Enum class \"{0}\" is not an implementation of Flags", "logging...");

        // The following exception was thrown during execution in test generation

        try {

            java.util.concurrent.ScheduledExecutorService scheduledExecutorService8 = sofaThreadPoolTaskScheduler1.getScheduledExecutor();

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ThreadPoolTaskScheduler not initialized");

        } catch (java.lang.IllegalStateException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(rejectedExecutionHandler4);

    }



    @Test

    public void test307() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test307");

        float[] floatArray5 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray6 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray5);

        float[] floatArray12 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray13 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray12);

        int int15 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray6, floatArray12, (int) (byte) 0);

        float[] floatArray21 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray22 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray21);

        float[] floatArray28 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray29 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray28);

        int int31 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray22, floatArray28, (int) (byte) 0);

        float[] floatArray32 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray12, floatArray28);

        float[] floatArray38 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray39 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray38);

        float[] floatArray40 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray32, floatArray38);

        boolean boolean41 = com.alipay.sofa.common.utils.ArrayUtil.isEmpty(floatArray38);

        float[] floatArray42 = com.alipay.sofa.common.utils.ArrayUtil.clone(floatArray38);

        org.junit.Assert.assertNotNull(floatArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray12);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray13);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);

        org.junit.Assert.assertNotNull(floatArray21);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray22);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray28);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray29);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);

        org.junit.Assert.assertNotNull(floatArray32);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray38);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray39);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray40);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);

        org.junit.Assert.assertNotNull(floatArray42);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray42), "[10.0, 0.0, 1.0, 100.0, 35.0]");

    }



    @Test

    public void test308() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test308");

        float[] floatArray5 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray6 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray5);

        float[] floatArray7 = com.alipay.sofa.common.utils.ArrayUtil.clone(floatArray6);

        float[] floatArray8 = new float[] {};

        boolean boolean10 = com.alipay.sofa.common.utils.ArrayUtil.contains(floatArray7, floatArray8, (float) (byte) 100);

        com.alipay.sofa.common.utils.ArrayUtil.reverse(floatArray8);

        org.junit.Assert.assertNotNull(floatArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray7);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray8);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");

        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);

    }



    @Test

    public void test309() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test309");

        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1 };

        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 1 };

        boolean boolean11 = com.alipay.sofa.common.utils.ArrayUtil.isEmpty(byteArray10);

        byte[] byteArray12 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfEmpty(byteArray4, byteArray10);

        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 1 };

        boolean boolean19 = com.alipay.sofa.common.utils.ArrayUtil.isEmpty(byteArray18);

        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) -1, (byte) 0 };

        int int27 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(byteArray25, (byte) 0);

        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1 };

        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 1 };

        boolean boolean39 = com.alipay.sofa.common.utils.ArrayUtil.isEmpty(byteArray38);

        byte[] byteArray40 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfEmpty(byteArray32, byteArray38);

        int int41 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(byteArray25, byteArray32);

        int int43 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(byteArray18, byteArray32, (int) (short) -1);

        boolean boolean44 = com.alipay.sofa.common.utils.ArrayUtil.contains(byteArray4, byteArray32);

        byte[] byteArray49 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1 };

        byte[] byteArray55 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 1 };

        boolean boolean56 = com.alipay.sofa.common.utils.ArrayUtil.isEmpty(byteArray55);

        byte[] byteArray57 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfEmpty(byteArray49, byteArray55);

        byte[] byteArray63 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 1 };

        boolean boolean64 = com.alipay.sofa.common.utils.ArrayUtil.isEmpty(byteArray63);

        byte[] byteArray70 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) -1, (byte) 0 };

        int int72 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(byteArray70, (byte) 0);

        byte[] byteArray77 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1 };

        byte[] byteArray83 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 1 };

        boolean boolean84 = com.alipay.sofa.common.utils.ArrayUtil.isEmpty(byteArray83);

        byte[] byteArray85 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfEmpty(byteArray77, byteArray83);

        int int86 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(byteArray70, byteArray77);

        int int88 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(byteArray63, byteArray77, (int) (short) -1);

        boolean boolean89 = com.alipay.sofa.common.utils.ArrayUtil.contains(byteArray49, byteArray77);

        int int91 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(byteArray32, byteArray49, 0);

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 1, 1, 1]");

        org.junit.Assert.assertNotNull(byteArray10);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 100, 10, -1, 1]");

        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);

        org.junit.Assert.assertNotNull(byteArray12);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 1, 1, 1]");

        org.junit.Assert.assertNotNull(byteArray18);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100, 100, 10, -1, 1]");

        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);

        org.junit.Assert.assertNotNull(byteArray25);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 0, 0, -1, 0]");

        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);

        org.junit.Assert.assertNotNull(byteArray32);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1, 1, 1, 1]");

        org.junit.Assert.assertNotNull(byteArray38);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[100, 100, 10, -1, 1]");

        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);

        org.junit.Assert.assertNotNull(byteArray40);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1, 1, 1, 1]");

        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));

        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));

        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);

        org.junit.Assert.assertNotNull(byteArray49);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[1, 1, 1, 1]");

        org.junit.Assert.assertNotNull(byteArray55);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[100, 100, 10, -1, 1]");

        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);

        org.junit.Assert.assertNotNull(byteArray57);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[1, 1, 1, 1]");

        org.junit.Assert.assertNotNull(byteArray63);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[100, 100, 10, -1, 1]");

        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);

        org.junit.Assert.assertNotNull(byteArray70);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[10, 0, 0, -1, 0]");

        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 4 + "'", int72 == 4);

        org.junit.Assert.assertNotNull(byteArray77);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[1, 1, 1, 1]");

        org.junit.Assert.assertNotNull(byteArray83);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[100, 100, 10, -1, 1]");

        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);

        org.junit.Assert.assertNotNull(byteArray85);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[1, 1, 1, 1]");

        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));

        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));

        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);

        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);

    }



    @Test

    public void test310() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test310");

        com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler sofaThreadPoolTaskScheduler0 = new com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler();

        java.lang.ThreadGroup threadGroup1 = null;

        sofaThreadPoolTaskScheduler0.setThreadGroup(threadGroup1);

        long long3 = sofaThreadPoolTaskScheduler0.getPeriod();

        sofaThreadPoolTaskScheduler0.setAwaitTerminationSeconds(8);

        sofaThreadPoolTaskScheduler0.setAwaitTerminationSeconds(16);

        com.alipay.sofa.common.thread.ThreadPoolConfig threadPoolConfig8 = null;

        com.alipay.sofa.common.thread.ThreadPoolStatistics threadPoolStatistics9 = null;

        com.alipay.sofa.common.thread.ThreadPoolMonitorRunner threadPoolMonitorRunner10 = new com.alipay.sofa.common.thread.ThreadPoolMonitorRunner(threadPoolConfig8, threadPoolStatistics9);

        // The following exception was thrown during execution in test generation

        try {

            java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture12 = sofaThreadPoolTaskScheduler0.scheduleAtFixedRate((java.lang.Runnable) threadPoolMonitorRunner10, (long) '#');

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ThreadPoolTaskScheduler not initialized");

        } catch (java.lang.IllegalStateException e) {

            // Expected exception.

        }

        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);

    }



    @Test

    public void test311() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test311");

        double[] doubleArray4 = new double[] { 100L, 10, (byte) 100, 0 };

        int int7 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(doubleArray4, 0.0d, (double) (short) 100);

        double[] doubleArray11 = new double[] { 100.0f, (-1.0d), 100.0d };

        int int14 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(doubleArray4, doubleArray11, (int) (byte) 100, (double) 10.0f);

        int int16 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(doubleArray11, (double) (-1L));

        int int20 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(doubleArray11, (double) (byte) 0, 0, (double) (-1L));

        org.junit.Assert.assertNotNull(doubleArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0, 10.0, 100.0, 0.0]");

        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);

        org.junit.Assert.assertNotNull(doubleArray11);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, -1.0, 100.0]");

        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));

        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);

        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));

    }



    @Test

    public void test312() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test312");

        int int0 = com.alipay.sofa.common.security.SensitiveDataUtil.EMAIL_DATA;

        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);

    }



    @Test

    public void test313() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test313");

        com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor sofaScheduledThreadPoolExecutor1 = new com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor((int) '#');

        boolean boolean2 = sofaScheduledThreadPoolExecutor1.allowsCoreThreadTimeOut();

        sofaScheduledThreadPoolExecutor1.shutdown();

        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);

    }



    @Test

    public void test314() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test314");

        com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler sofaThreadPoolTaskScheduler4 = new com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler();

        com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor sofaScheduledThreadPoolExecutor6 = new com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor((int) '#');

        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler7 = sofaScheduledThreadPoolExecutor6.getRejectedExecutionHandler();

        com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor sofaScheduledThreadPoolExecutor10 = new com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor(5, (java.util.concurrent.ThreadFactory) sofaThreadPoolTaskScheduler4, rejectedExecutionHandler7, "The Enum class \"{0}\" is not an implementation of Flags", "logging...");

        com.alipay.sofa.common.thread.ThreadPoolConfig threadPoolConfig11 = null;

        com.alipay.sofa.common.thread.ThreadPoolStatistics threadPoolStatistics12 = null;

        com.alipay.sofa.common.thread.ThreadPoolMonitorRunner threadPoolMonitorRunner13 = new com.alipay.sofa.common.thread.ThreadPoolMonitorRunner(threadPoolConfig11, threadPoolStatistics12);

        com.alipay.sofa.common.thread.ThreadPoolConfig.SofaThreadConfigBuilder sofaThreadConfigBuilder16 = com.alipay.sofa.common.thread.ThreadPoolConfig.newBuilder();

        com.alipay.sofa.common.thread.ThreadPoolConfig threadPoolConfig17 = sofaThreadConfigBuilder16.build();

        threadPoolConfig17.setTaskTimeoutMilli((long) (short) 0);

        java.util.concurrent.TimeUnit timeUnit20 = threadPoolConfig17.getTimeUnit();

        java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture21 = sofaScheduledThreadPoolExecutor10.scheduleWithFixedDelay((java.lang.Runnable) threadPoolMonitorRunner13, (long) (byte) -1, (long) 36, timeUnit20);

        java.util.concurrent.BlockingQueue<java.lang.Runnable> runnableQueue22 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.thread.SofaThreadPoolExecutor sofaThreadPoolExecutor24 = new com.alipay.sofa.common.thread.SofaThreadPoolExecutor((int) (short) -1, (int) ' ', (-1L), timeUnit20, runnableQueue22, "");

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(rejectedExecutionHandler7);

        org.junit.Assert.assertNotNull(sofaThreadConfigBuilder16);

        org.junit.Assert.assertNotNull(threadPoolConfig17);

        org.junit.Assert.assertNotNull(timeUnit20);

        org.junit.Assert.assertNotNull(wildcardScheduledFuture21);

    }



    @Test

    public void test315() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test315");

        java.lang.Class class0 = null;

        java.lang.Class[] classArray1 = new java.lang.Class[] { class0 };

        java.lang.Class[] classArray2 = new java.lang.Class[] {};

        boolean boolean3 = com.alipay.sofa.common.utils.ClassUtil.isAssignable(classArray1, classArray2);

        java.util.List list4 = com.alipay.sofa.common.utils.ArrayUtil.toFixedList((java.lang.Object[]) classArray2);

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.utils.AssertUtil.notEmpty((java.util.Collection) list4);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - this collection must not be empty: it must contain at least 1 element");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(classArray1);

        org.junit.Assert.assertNotNull(classArray2);

        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);

        org.junit.Assert.assertNotNull(list4);

    }



    @Test

    public void test316() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test316");

        java.lang.Class class0 = null;

        java.lang.Class[] classArray1 = new java.lang.Class[] { class0 };

        java.lang.Class[] classArray2 = new java.lang.Class[] {};

        boolean boolean3 = com.alipay.sofa.common.utils.ClassUtil.isAssignable(classArray1, classArray2);

        java.net.URL[] uRLArray5 = com.alipay.sofa.common.utils.ClassLoaderUtil.getResources("\u63a7\u5236\u7ebf\u7a0b\u4fe1\u606f\u6253\u5370\u95f4\u9694             ");

        boolean boolean6 = com.alipay.sofa.common.utils.ArrayUtil.contains((java.lang.Object[]) classArray2, (java.lang.Object[]) uRLArray5);

        org.junit.Assert.assertNotNull(classArray1);

        org.junit.Assert.assertNotNull(classArray2);

        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);

        org.junit.Assert.assertNotNull(uRLArray5);

        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);

    }



    @Test

    public void test317() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test317");

        boolean boolean0 = com.alipay.sofa.common.thread.SofaThreadPoolConstants.DEFAULT_GOVERNOR_LOGGER_ENABLE;

        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);

    }



    @Test

    public void test318() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test318");

        java.util.List<java.util.HashMap<java.lang.Object, java.lang.Object>> objMapList1 = com.alipay.sofa.common.config.converter.DefaultConverter.paresJson2ListMap("logging.config.");

        org.junit.Assert.assertNotNull(objMapList1);

    }



    @Test

    public void test319() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test319");

        com.alipay.sofa.common.utils.ReportUtil.reportWarn("FlagSet value must not be null");

    }



    @Test

    public void test320() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test320");

        // The following exception was thrown during execution in test generation

        try {

            java.lang.Object obj1 = com.alipay.sofa.common.utils.ClassLoaderUtil.newInstance("sofa.middleware.log.%s.console.level");

            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: sofa.middleware.log.%s.console.level");

        } catch (java.lang.ClassNotFoundException e) {

            // Expected exception.

        }

    }



    @Test

    public void test321() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test321");

        float[] floatArray5 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray6 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray5);

        float[] floatArray12 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray13 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray12);

        int int15 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray6, floatArray12, (int) (byte) 0);

        float[] floatArray21 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray22 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray21);

        float[] floatArray28 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray29 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray28);

        int int31 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray22, floatArray28, (int) (byte) 0);

        float[] floatArray32 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray12, floatArray28);

        float[] floatArray38 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray39 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray38);

        float[] floatArray40 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray32, floatArray38);

        boolean boolean41 = com.alipay.sofa.common.utils.ArrayUtil.isEmpty(floatArray38);

        float[] floatArray47 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray48 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray47);

        float[] floatArray54 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray55 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray54);

        int int57 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray48, floatArray54, (int) (byte) 0);

        float[] floatArray63 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray64 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray63);

        float[] floatArray70 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray71 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray70);

        int int73 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray64, floatArray70, (int) (byte) 0);

        float[] floatArray74 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray54, floatArray70);

        float[] floatArray80 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray81 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray80);

        float[] floatArray82 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray74, floatArray80);

        boolean boolean83 = com.alipay.sofa.common.utils.ArrayUtil.isEmpty(floatArray80);

        boolean boolean85 = com.alipay.sofa.common.utils.ArrayUtil.contains(floatArray80, (float) (-1));

        int int87 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(floatArray38, floatArray80, (float) 36);

        org.junit.Assert.assertNotNull(floatArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray12);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray13);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);

        org.junit.Assert.assertNotNull(floatArray21);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray22);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray28);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray29);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);

        org.junit.Assert.assertNotNull(floatArray32);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray38);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray39);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray40);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);

        org.junit.Assert.assertNotNull(floatArray47);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray47), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray48);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray48), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray54);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray55);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray55), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);

        org.junit.Assert.assertNotNull(floatArray63);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray63), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray64);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray64), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray70);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray70), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray71);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray71), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);

        org.junit.Assert.assertNotNull(floatArray74);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray74), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray80);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray80), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray81);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray81), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray82);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray82), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);

        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);

        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);

    }



    @Test

    public void test322() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test322");

        com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel messageLevel0 = com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel.NO_MESSAGE;

        java.lang.String str1 = messageLevel0.getName();

        java.lang.Number number2 = messageLevel0.getValue();

        java.lang.String str3 = messageLevel0.toOctalString();

        org.junit.Assert.assertNotNull(messageLevel0);

        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NO_MESSAGE" + "'", str1, "NO_MESSAGE");

        org.junit.Assert.assertEquals("'" + number2 + "' != '" + 0 + "'", number2, 0);

        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");

    }



    @Test

    public void test323() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test323");

        double[] doubleArray4 = new double[] { 100L, 10, (byte) 100, 0 };

        int int7 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(doubleArray4, 0.0d, (double) (short) 100);

        double[] doubleArray11 = new double[] { 100.0f, (-1.0d), 100.0d };

        int int14 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(doubleArray4, doubleArray11, (int) (byte) 100, (double) 10.0f);

        boolean boolean16 = com.alipay.sofa.common.utils.ArrayUtil.contains(doubleArray11, (double) 8);

        int int19 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(doubleArray11, (double) (-1L), (double) (short) 10);

        double[] doubleArray24 = new double[] { 100L, 10, (byte) 100, 0 };

        int int27 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(doubleArray24, 0.0d, (double) (short) 100);

        double[] doubleArray31 = new double[] { 100.0f, (-1.0d), 100.0d };

        int int34 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(doubleArray24, doubleArray31, (int) (byte) 100, (double) 10.0f);

        int int37 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(doubleArray24, 0.0d, (int) '4');

        int int38 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(doubleArray11, doubleArray24);

        boolean boolean39 = com.alipay.sofa.common.utils.ArrayUtil.isEmpty(doubleArray11);

        org.junit.Assert.assertNotNull(doubleArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0, 10.0, 100.0, 0.0]");

        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);

        org.junit.Assert.assertNotNull(doubleArray11);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, -1.0, 100.0]");

        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));

        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);

        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);

        org.junit.Assert.assertNotNull(doubleArray24);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 10.0, 100.0, 0.0]");

        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);

        org.junit.Assert.assertNotNull(doubleArray31);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, -1.0, 100.0]");

        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));

        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));

        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));

        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);

    }



    @Test

    public void test324() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test324");

        com.alipay.sofa.common.thread.log.ThreadLogger threadLogger0 = new com.alipay.sofa.common.thread.log.ThreadLogger();

    }



    @Test

    public void test325() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test325");

        long[] longArray0 = new long[] {};

        long[] longArray7 = new long[] { (byte) 10, (-1), 0L, 0L, (short) 0, (short) 1 };

        int int9 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(longArray0, longArray7, 100);

        long[] longArray10 = new long[] {};

        long[] longArray17 = new long[] { (byte) 10, (-1), 0L, 0L, (short) 0, (short) 1 };

        int int19 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(longArray10, longArray17, 100);

        long[] longArray20 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfEmpty(longArray10);

        long[] longArray21 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfEmpty(longArray0, longArray10);

        int int23 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(longArray21, (long) (byte) 1);

        int int26 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(longArray21, 10L, (int) (short) 0);

        org.junit.Assert.assertNotNull(longArray0);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");

        org.junit.Assert.assertNotNull(longArray7);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[10, -1, 0, 0, 0, 1]");

        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));

        org.junit.Assert.assertNotNull(longArray10);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[]");

        org.junit.Assert.assertNotNull(longArray17);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[10, -1, 0, 0, 0, 1]");

        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));

        org.junit.Assert.assertNotNull(longArray20);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[]");

        org.junit.Assert.assertNotNull(longArray21);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[]");

        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));

        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));

    }



    @Test

    public void test326() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test326");

        java.lang.String str0 = com.alipay.sofa.common.log.Constants.SOFA_MIDDLEWARE_LOG_CONSOLE_LOGBACK_PATTERN;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "sofa.middleware.log.console.logback.pattern" + "'", str0, "sofa.middleware.log.console.logback.pattern");

    }



    @Test

    public void test327() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test327");

        java.lang.ClassLoader classLoader2 = null;

        // The following exception was thrown during execution in test generation

        try {

            org.slf4j.Logger logger3 = com.alipay.sofa.common.log.LoggerSpaceManager.getLoggerBySpace("log-*.xml", "log", classLoader2);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - this argument is required; it must not be null");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

    }



    @Test

    public void test328() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test328");

        boolean[] booleanArray0 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_BOOLEAN_ARRAY;

        boolean[] booleanArray1 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_BOOLEAN_ARRAY;

        boolean[] booleanArray2 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfEmpty(booleanArray0, booleanArray1);

        boolean[] booleanArray3 = com.alipay.sofa.common.utils.ArrayUtil.clone(booleanArray1);

        boolean[] booleanArray4 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_BOOLEAN_ARRAY;

        boolean[] booleanArray5 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_BOOLEAN_ARRAY;

        boolean[] booleanArray6 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfEmpty(booleanArray4, booleanArray5);

        boolean[] booleanArray7 = com.alipay.sofa.common.utils.ArrayUtil.clone(booleanArray5);

        int int9 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(booleanArray1, booleanArray7, (-2147483648));

        int int11 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(booleanArray7, true);

        org.junit.Assert.assertNotNull(booleanArray0);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");

        org.junit.Assert.assertNotNull(booleanArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[]");

        org.junit.Assert.assertNotNull(booleanArray2);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[]");

        org.junit.Assert.assertNotNull(booleanArray3);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[]");

        org.junit.Assert.assertNotNull(booleanArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[]");

        org.junit.Assert.assertNotNull(booleanArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[]");

        org.junit.Assert.assertNotNull(booleanArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[]");

        org.junit.Assert.assertNotNull(booleanArray7);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[]");

        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));

        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));

    }



    @Test

    public void test329() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test329");

        boolean[] booleanArray0 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_BOOLEAN_ARRAY;

        boolean[] booleanArray1 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_BOOLEAN_ARRAY;

        boolean[] booleanArray2 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfEmpty(booleanArray0, booleanArray1);

        boolean[] booleanArray6 = new boolean[] { true, false, true };

        boolean[] booleanArray7 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(booleanArray6);

        boolean boolean8 = com.alipay.sofa.common.utils.ArrayUtil.contains(booleanArray0, booleanArray7);

        boolean[] booleanArray9 = com.alipay.sofa.common.utils.ArrayUtil.clone(booleanArray7);

        org.junit.Assert.assertNotNull(booleanArray0);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");

        org.junit.Assert.assertNotNull(booleanArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[]");

        org.junit.Assert.assertNotNull(booleanArray2);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[]");

        org.junit.Assert.assertNotNull(booleanArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, true]");

        org.junit.Assert.assertNotNull(booleanArray7);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, false, true]");

        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);

        org.junit.Assert.assertNotNull(booleanArray9);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[true, false, true]");

    }



    @Test

    public void test330() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test330");

        java.net.URL uRL0 = null;

        // The following exception was thrown during execution in test generation

        try {

            java.io.File file1 = com.alipay.sofa.common.utils.ResourceUtil.getFile(uRL0);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Resource URL must not be null");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

    }



    @Test

    public void test331() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test331");

        com.alipay.sofa.common.utils.ClassUtil classUtil0 = new com.alipay.sofa.common.utils.ClassUtil();

    }



    @Test

    public void test332() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test332");

        com.alipay.sofa.common.thread.ThreadPoolConfig.SofaThreadConfigBuilder sofaThreadConfigBuilder0 = com.alipay.sofa.common.thread.ThreadPoolConfig.newBuilder();

        com.alipay.sofa.common.thread.ThreadPoolConfig threadPoolConfig1 = sofaThreadConfigBuilder0.build();

        com.alipay.sofa.common.thread.ThreadPoolConfig.SofaThreadConfigBuilder sofaThreadConfigBuilder3 = sofaThreadConfigBuilder0.threadPoolName("FlagSet is immutable");

        com.alipay.sofa.common.utils.AssertUtil.notNull((java.lang.Object) "FlagSet is immutable", "UTF-8");

        org.junit.Assert.assertNotNull(sofaThreadConfigBuilder0);

        org.junit.Assert.assertNotNull(threadPoolConfig1);

        org.junit.Assert.assertNotNull(sofaThreadConfigBuilder3);

    }



    @Test

    public void test333() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test333");

        java.lang.Byte[] byteArray0 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_BYTE_OBJECT_ARRAY;

        com.alipay.sofa.common.utils.ArrayUtil.reverse((java.lang.Object[]) byteArray0);

        java.lang.Object[] objArray2 = null;

        java.util.Map map3 = com.alipay.sofa.common.log.MultiAppLoggerSpaceManager.getSpacesMap();

        java.util.Map map4 = com.alipay.sofa.common.utils.ArrayUtil.toMap(objArray2, map3);

        java.util.Map map5 = com.alipay.sofa.common.utils.ArrayUtil.toMap((java.lang.Object[]) byteArray0, map3);

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.utils.AssertUtil.notEmpty(map5);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - this map must not be empty; it must contain at least one entry");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray0);

        org.junit.Assert.assertNotNull(map3);

        org.junit.Assert.assertNotNull(map4);

        org.junit.Assert.assertNotNull(map5);

    }



    @Test

    public void test334() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test334");

        java.lang.String str0 = com.alipay.sofa.common.config.SofaConfigs.DEFAULT_EXPIRE_AFTER_SECOND;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "5" + "'", str0, "5");

    }



    @Test

    public void test335() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test335");

        com.alipay.sofa.common.thread.SofaThreadPoolTaskExecutor sofaThreadPoolTaskExecutor0 = new com.alipay.sofa.common.thread.SofaThreadPoolTaskExecutor();

        sofaThreadPoolTaskExecutor0.setPeriod((-1L));

        int int3 = sofaThreadPoolTaskExecutor0.getActiveCount();

        java.util.concurrent.TimeUnit timeUnit4 = sofaThreadPoolTaskExecutor0.getTimeUnit();

        sofaThreadPoolTaskExecutor0.setQueueCapacity(2);

        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);

        org.junit.Assert.assertNotNull(timeUnit4);

    }



    @Test

    public void test336() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test336");

        com.alipay.sofa.common.thread.SofaThreadPoolTaskExecutor sofaThreadPoolTaskExecutor1 = new com.alipay.sofa.common.thread.SofaThreadPoolTaskExecutor();

        com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler sofaThreadPoolTaskScheduler3 = new com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler();

        com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor sofaScheduledThreadPoolExecutor5 = new com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor((int) '#');

        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler6 = sofaScheduledThreadPoolExecutor5.getRejectedExecutionHandler();

        com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor sofaScheduledThreadPoolExecutor9 = new com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor(5, (java.util.concurrent.ThreadFactory) sofaThreadPoolTaskScheduler3, rejectedExecutionHandler6, "The Enum class \"{0}\" is not an implementation of Flags", "logging...");

        com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor sofaScheduledThreadPoolExecutor10 = new com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor(2, (java.util.concurrent.ThreadFactory) sofaThreadPoolTaskExecutor1, rejectedExecutionHandler6);

        sofaScheduledThreadPoolExecutor10.setCorePoolSize(0);

        org.junit.Assert.assertNotNull(rejectedExecutionHandler6);

    }



    @Test

    public void test337() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test337");

        com.alipay.sofa.common.utils.AssertUtil.hasText("logging...", "The Enum name must not be empty.class");

    }



    @Test

    public void test338() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test338");

        com.alipay.sofa.common.log.adapter.level.AdapterLevel adapterLevel0 = com.alipay.sofa.common.log.adapter.level.AdapterLevel.TRACE;

        org.junit.Assert.assertTrue("'" + adapterLevel0 + "' != '" + com.alipay.sofa.common.log.adapter.level.AdapterLevel.TRACE + "'", adapterLevel0.equals(com.alipay.sofa.common.log.adapter.level.AdapterLevel.TRACE));

    }



    @Test

    public void test339() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test339");

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.utils.AssertUtil.isNull((java.lang.Object) (short) -1);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - the object argument must be null");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

    }



    @Test

    public void test340() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test340");

        java.lang.String str3 = com.alipay.sofa.common.utils.StringUtil.alignRight("log.env.suffix", 0, "hi!");

        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "log.env.suffix" + "'", str3, "log.env.suffix");

    }



    @Test

    public void test341() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test341");

        com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler sofaThreadPoolTaskScheduler1 = new com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler();

        com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor sofaScheduledThreadPoolExecutor3 = new com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor((int) '#');

        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler4 = sofaScheduledThreadPoolExecutor3.getRejectedExecutionHandler();

        com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor sofaScheduledThreadPoolExecutor7 = new com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor(5, (java.util.concurrent.ThreadFactory) sofaThreadPoolTaskScheduler1, rejectedExecutionHandler4, "The Enum class \"{0}\" is not an implementation of Flags", "logging...");

        com.alipay.sofa.common.thread.ThreadPoolConfig threadPoolConfig8 = null;

        com.alipay.sofa.common.thread.ThreadPoolStatistics threadPoolStatistics9 = null;

        com.alipay.sofa.common.thread.ThreadPoolMonitorRunner threadPoolMonitorRunner10 = new com.alipay.sofa.common.thread.ThreadPoolMonitorRunner(threadPoolConfig8, threadPoolStatistics9);

        com.alipay.sofa.common.thread.ThreadPoolConfig.SofaThreadConfigBuilder sofaThreadConfigBuilder13 = com.alipay.sofa.common.thread.ThreadPoolConfig.newBuilder();

        com.alipay.sofa.common.thread.ThreadPoolConfig threadPoolConfig14 = sofaThreadConfigBuilder13.build();

        threadPoolConfig14.setTaskTimeoutMilli((long) (short) 0);

        java.util.concurrent.TimeUnit timeUnit17 = threadPoolConfig14.getTimeUnit();

        java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture18 = sofaScheduledThreadPoolExecutor7.scheduleWithFixedDelay((java.lang.Runnable) threadPoolMonitorRunner10, (long) (byte) -1, (long) 36, timeUnit17);

        com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor sofaScheduledThreadPoolExecutor20 = new com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor((int) '#');

        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler21 = sofaScheduledThreadPoolExecutor20.getRejectedExecutionHandler();

        sofaScheduledThreadPoolExecutor7.setRejectedExecutionHandler(rejectedExecutionHandler21);

        org.junit.Assert.assertNotNull(rejectedExecutionHandler4);

        org.junit.Assert.assertNotNull(sofaThreadConfigBuilder13);

        org.junit.Assert.assertNotNull(threadPoolConfig14);

        org.junit.Assert.assertNotNull(timeUnit17);

        org.junit.Assert.assertNotNull(wildcardScheduledFuture18);

        org.junit.Assert.assertNotNull(rejectedExecutionHandler21);

    }



    @Test

    public void test342() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test342");

        com.alipay.sofa.common.log.CommonLoggingConfigurations.appendConsolePrefixWhiteLoggerName("hi!");

    }



    @Test

    public void test343() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test343");

        org.slf4j.Logger logger1 = com.alipay.sofa.common.utils.ThreadLoggerFactory.getLogger("\u63a7\u5236\u7ebf\u7a0b\u4fe1\u606f\u6253\u5370\u95f4\u9694");

        org.junit.Assert.assertNotNull(logger1);

    }



    @Test

    public void test344() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test344");

        long[] longArray0 = new long[] {};

        long[] longArray7 = new long[] { (byte) 10, (-1), 0L, 0L, (short) 0, (short) 1 };

        int int9 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(longArray0, longArray7, 100);

        boolean boolean10 = com.alipay.sofa.common.utils.ArrayUtil.isEmpty(longArray0);

        long[] longArray11 = new long[] {};

        long[] longArray18 = new long[] { (byte) 10, (-1), 0L, 0L, (short) 0, (short) 1 };

        int int20 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(longArray11, longArray18, 100);

        long[] longArray21 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfEmpty(longArray11);

        int int22 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(longArray0, longArray21);

        org.junit.Assert.assertNotNull(longArray0);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");

        org.junit.Assert.assertNotNull(longArray7);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[10, -1, 0, 0, 0, 1]");

        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));

        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);

        org.junit.Assert.assertNotNull(longArray11);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[]");

        org.junit.Assert.assertNotNull(longArray18);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[10, -1, 0, 0, 0, 1]");

        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));

        org.junit.Assert.assertNotNull(longArray21);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[]");

        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);

    }



    @Test

    public void test345() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test345");

        java.lang.String str0 = com.alipay.sofa.common.profile.enumeration.internal.EnumConstant.ILLEGAL_CLASS;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Class \"{0}\" is not a subclass of \"{1}\"" + "'", str0, "Class \"{0}\" is not a subclass of \"{1}\"");

    }



    @Test

    public void test346() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test346");

        boolean boolean1 = com.alipay.sofa.common.log.MultiAppLoggerSpaceManager.isSpaceInitialized("sampleTraceId");

        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);

    }



    @Test

    public void test347() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test347");

        com.alipay.sofa.common.log.adapter.level.AdapterLevel adapterLevel4 = com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO;

        java.lang.String str5 = com.alipay.sofa.common.utils.ArrayUtil.toString((java.lang.Object) adapterLevel4);

        org.slf4j.Logger logger6 = com.alipay.sofa.common.log.MultiAppLoggerSpaceManager.setLoggerLevel("ROOT", "log4j2.middleware.log.disable", adapterLevel4);

        org.slf4j.Logger logger7 = com.alipay.sofa.common.log.MultiAppLoggerSpaceManager.setLoggerLevel("ROOT", "-", adapterLevel4);

        java.lang.Class<?> wildcardClass8 = logger7.getClass();

        java.lang.String str9 = com.alipay.sofa.common.utils.ClassUtil.getPackageName((java.lang.Class) wildcardClass8);

        org.junit.Assert.assertTrue("'" + adapterLevel4 + "' != '" + com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO + "'", adapterLevel4.equals(com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO));

        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AdapterLevel{logLevelMsg='info'}" + "'", str5, "AdapterLevel{logLevelMsg='info'}");

        org.junit.Assert.assertNotNull(logger6);

        org.junit.Assert.assertNotNull(logger7);

        org.junit.Assert.assertNotNull(wildcardClass8);

        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.alipay.sofa.common.log.proxy" + "'", str9, "com.alipay.sofa.common.log.proxy");

    }



    @Test

    public void test348() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test348");

        java.lang.String str3 = com.alipay.sofa.common.utils.StringUtil.replaceChars("The Enum name must not be empty", "adapterLevel{logLevelMsg='info'}.class", "0");

        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Th Eum 0m mu  b my" + "'", str3, "Th Eum 0m mu  b my");

    }



    @Test

    public void test349() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test349");

        com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel messageLevel0 = com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel.NO_MESSAGE;

        java.lang.String str1 = messageLevel0.toOctalString();

        org.junit.Assert.assertNotNull(messageLevel0);

        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");

    }



    @Test

    public void test350() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test350");

        com.alipay.sofa.common.space.SpaceId spaceId1 = null;

        java.util.Map<java.lang.String, java.lang.String> strMap2 = com.alipay.sofa.common.log.env.LogEnvUtils.processGlobalSystemLogProperties();

        // The following exception was thrown during execution in test generation

        try {

            org.slf4j.Logger logger3 = com.alipay.sofa.common.log.LoggerSpaceManager.getLoggerBySpace("ROOT", spaceId1, strMap2);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(strMap2);

    }



    @Test

    public void test351() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test351");

        java.lang.Throwable throwable1 = null;

        com.alipay.sofa.common.log.LogLog.warn("ThreadPoolConfig{threadPoolName='null', spaceName='null', taskTimeout=30000, period=5000, timeUnit=MILLISECONDS, taskTimeoutMilli=0, identity='null'}", throwable1);

    }



    @Test

    public void test352() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test352");

        float[] floatArray5 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray6 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray5);

        float[] floatArray12 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray13 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray12);

        int int15 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray6, floatArray12, (int) (byte) 0);

        java.lang.String str16 = com.alipay.sofa.common.utils.ClassUtil.getClassNameForObjectAsResource((java.lang.Object) (byte) 0);

        org.junit.Assert.assertNotNull(floatArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray12);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray13);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);

        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/lang/Byte.class" + "'", str16, "java/lang/Byte.class");

    }



    @Test

    public void test353() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test353");

        float[] floatArray5 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray6 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray5);

        float[] floatArray12 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray13 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray12);

        int int15 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(floatArray6, floatArray12, (int) (byte) 0);

        float[] floatArray21 = new float[] { 10L, 0L, 1, 100.0f, '#' };

        float[] floatArray22 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfNull(floatArray21);

        int int24 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(floatArray12, floatArray21, (float) 5);

        float[] floatArray31 = new float[] { 100.0f, (-1), 0.0f, (-1.0f), 5, (-1L) };

        boolean boolean32 = com.alipay.sofa.common.utils.ArrayUtil.isNotEmpty(floatArray31);

        int int35 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(floatArray31, (float) 5, (float) (byte) -1);

        boolean boolean36 = com.alipay.sofa.common.utils.ArrayUtil.contains(floatArray21, floatArray31);

        org.junit.Assert.assertNotNull(floatArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray12);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray13);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);

        org.junit.Assert.assertNotNull(floatArray21);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertNotNull(floatArray22);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, 0.0, 1.0, 100.0, 35.0]");

        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);

        org.junit.Assert.assertNotNull(floatArray31);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[100.0, -1.0, 0.0, -1.0, 5.0, -1.0]");

        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);

        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));

        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);

    }



    @Test

    public void test354() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test354");

        java.util.LinkedHashSet<java.lang.String> strSet2 = com.alipay.sofa.common.utils.ClassUtil.getField("sofa.middleware.log.internal.level", (java.lang.Object) 10.0d);

        org.junit.Assert.assertNull(strSet2);

    }



    @Test

    public void test355() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test355");

        com.alipay.sofa.common.thread.space.SpaceNamedThreadFactory spaceNamedThreadFactory3 = new com.alipay.sofa.common.thread.space.SpaceNamedThreadFactory("*", "l**l", false);

    }



    @Test

    public void test356() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test356");

        java.lang.ClassLoader classLoader1 = null;

        // The following exception was thrown during execution in test generation

        try {

            com.alipay.sofa.common.log.proxy.TemporaryILoggerFactory temporaryILoggerFactory2 = com.alipay.sofa.common.log.proxy.TemporaryILoggerFactoryPool.get("Th Eum 0m mu  b my", classLoader1);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [Assertion failed] - this argument is required; it must not be null");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

    }



    @Test

    public void test357() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test357");

        com.alipay.sofa.common.config.ConfigKey<java.lang.Long> longConfigKey0 = com.alipay.sofa.common.CommonToolConfigKeys.COMMON_THREAD_LOG_PERIOD;

        java.lang.String str1 = longConfigKey0.getDescription();

        java.lang.Class<java.lang.Long> longClass2 = longConfigKey0.getType();

        java.lang.Class class3 = null;

        java.lang.Class[] classArray4 = new java.lang.Class[] { class3 };

        java.lang.Class[] classArray5 = new java.lang.Class[] {};

        boolean boolean6 = com.alipay.sofa.common.utils.ClassUtil.isAssignable(classArray4, classArray5);

        java.util.List list7 = com.alipay.sofa.common.utils.ArrayUtil.toFixedList((java.lang.Object[]) classArray5);

        // The following exception was thrown during execution in test generation

        try {

            java.util.List list8 = com.alipay.sofa.common.utils.ArrayUtil.toList((java.lang.Object) longConfigKey0, list7);

            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");

        } catch (java.lang.UnsupportedOperationException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(longConfigKey0);

        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u63a7\u5236\u7ebf\u7a0b\u4fe1\u606f\u6253\u5370\u95f4\u9694" + "'", str1, "\u63a7\u5236\u7ebf\u7a0b\u4fe1\u606f\u6253\u5370\u95f4\u9694");

        org.junit.Assert.assertNotNull(longClass2);

        org.junit.Assert.assertNotNull(classArray4);

        org.junit.Assert.assertNotNull(classArray5);

        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);

        org.junit.Assert.assertNotNull(list7);

    }



    @Test

    public void test358() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test358");

        com.alipay.sofa.common.thread.ThreadPoolConfig.SofaThreadConfigBuilder sofaThreadConfigBuilder0 = com.alipay.sofa.common.thread.ThreadPoolConfig.newBuilder();

        com.alipay.sofa.common.thread.ThreadPoolConfig threadPoolConfig1 = sofaThreadConfigBuilder0.build();

        threadPoolConfig1.setTaskTimeoutMilli((long) (short) 0);

        java.util.concurrent.TimeUnit timeUnit4 = threadPoolConfig1.getTimeUnit();

        long long5 = threadPoolConfig1.getPeriod();

        java.lang.String str6 = threadPoolConfig1.getIdentity();

        threadPoolConfig1.setSpaceName("com.alipay.sofa.common.log.proxy.LoggerProxy");

        org.junit.Assert.assertNotNull(sofaThreadConfigBuilder0);

        org.junit.Assert.assertNotNull(threadPoolConfig1);

        org.junit.Assert.assertNotNull(timeUnit4);

        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);

        org.junit.Assert.assertNull(str6);

    }



    @Test

    public void test359() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test359");

        com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel messageLevel0 = com.alipay.sofa.common.profile.diagnostic.Profiler.MessageLevel.NO_MESSAGE;

        short short1 = messageLevel0.shortValue();

        org.junit.Assert.assertNotNull(messageLevel0);

        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);

    }



    @Test

    public void test360() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test360");

        java.lang.Character[] charArray0 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_CHARACTER_OBJECT_ARRAY;

        com.alipay.sofa.common.log.adapter.level.AdapterLevel adapterLevel5 = com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO;

        java.lang.String str6 = com.alipay.sofa.common.utils.ArrayUtil.toString((java.lang.Object) adapterLevel5);

        org.slf4j.Logger logger7 = com.alipay.sofa.common.log.MultiAppLoggerSpaceManager.setLoggerLevel("ROOT", "log4j2.middleware.log.disable", adapterLevel5);

        org.slf4j.Logger logger8 = com.alipay.sofa.common.log.MultiAppLoggerSpaceManager.setLoggerLevel("ROOT", "-", adapterLevel5);

        java.lang.Class<?> wildcardClass9 = logger8.getClass();

        java.lang.String str10 = com.alipay.sofa.common.utils.ClassUtil.getClassName((java.lang.Class) wildcardClass9);

        java.lang.Object[] objArray11 = com.alipay.sofa.common.utils.ArrayUtil.defaultIfEmpty((java.lang.Object[]) charArray0, (java.lang.Class) wildcardClass9);

        org.junit.Assert.assertNotNull(charArray0);

        org.junit.Assert.assertTrue("'" + adapterLevel5 + "' != '" + com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO + "'", adapterLevel5.equals(com.alipay.sofa.common.log.adapter.level.AdapterLevel.INFO));

        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AdapterLevel{logLevelMsg='info'}" + "'", str6, "AdapterLevel{logLevelMsg='info'}");

        org.junit.Assert.assertNotNull(logger7);

        org.junit.Assert.assertNotNull(logger8);

        org.junit.Assert.assertNotNull(wildcardClass9);

        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.alipay.sofa.common.log.proxy.LoggerProxy" + "'", str10, "com.alipay.sofa.common.log.proxy.LoggerProxy");

        org.junit.Assert.assertNotNull(objArray11);

        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");

        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");

    }



    @Test

    public void test361() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test361");

        java.lang.String str3 = com.alipay.sofa.common.utils.StringUtil.substringBetween("Flags must be of \"{0}\" or \"{1}\" ", "a0a", "0");

        org.junit.Assert.assertNull(str3);

    }



    @Test

    public void test362() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test362");

        com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler sofaThreadPoolTaskScheduler1 = new com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler();

        com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor sofaScheduledThreadPoolExecutor3 = new com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor((int) '#');

        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler4 = sofaScheduledThreadPoolExecutor3.getRejectedExecutionHandler();

        com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor sofaScheduledThreadPoolExecutor7 = new com.alipay.sofa.common.thread.SofaScheduledThreadPoolExecutor(5, (java.util.concurrent.ThreadFactory) sofaThreadPoolTaskScheduler1, rejectedExecutionHandler4, "The Enum class \"{0}\" is not an implementation of Flags", "logging...");

        com.alipay.sofa.common.thread.ThreadPoolConfig threadPoolConfig8 = null;

        com.alipay.sofa.common.thread.ThreadPoolStatistics threadPoolStatistics9 = null;

        com.alipay.sofa.common.thread.ThreadPoolMonitorRunner threadPoolMonitorRunner10 = new com.alipay.sofa.common.thread.ThreadPoolMonitorRunner(threadPoolConfig8, threadPoolStatistics9);

        com.alipay.sofa.common.thread.ThreadPoolConfig.SofaThreadConfigBuilder sofaThreadConfigBuilder13 = com.alipay.sofa.common.thread.ThreadPoolConfig.newBuilder();

        com.alipay.sofa.common.thread.ThreadPoolConfig threadPoolConfig14 = sofaThreadConfigBuilder13.build();

        threadPoolConfig14.setTaskTimeoutMilli((long) (short) 0);

        java.util.concurrent.TimeUnit timeUnit17 = threadPoolConfig14.getTimeUnit();

        java.util.concurrent.ScheduledFuture<?> wildcardScheduledFuture18 = sofaScheduledThreadPoolExecutor7.scheduleWithFixedDelay((java.lang.Runnable) threadPoolMonitorRunner10, (long) (byte) -1, (long) 36, timeUnit17);

        com.alipay.sofa.common.thread.ExecutingRunnable executingRunnable19 = new com.alipay.sofa.common.thread.ExecutingRunnable((java.lang.Runnable) threadPoolMonitorRunner10);

        org.junit.Assert.assertNotNull(rejectedExecutionHandler4);

        org.junit.Assert.assertNotNull(sofaThreadConfigBuilder13);

        org.junit.Assert.assertNotNull(threadPoolConfig14);

        org.junit.Assert.assertNotNull(timeUnit17);

        org.junit.Assert.assertNotNull(wildcardScheduledFuture18);

    }



    @Test

    public void test363() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test363");

        short[] shortArray0 = new short[] {};

        short[] shortArray1 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_SHORT_ARRAY;

        boolean boolean2 = com.alipay.sofa.common.utils.ArrayUtil.isSameLength(shortArray0, shortArray1);

        int int4 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(shortArray1, (short) (byte) 10);

        short[] shortArray5 = new short[] {};

        short[] shortArray6 = com.alipay.sofa.common.utils.ArrayUtil.EMPTY_SHORT_ARRAY;

        boolean boolean7 = com.alipay.sofa.common.utils.ArrayUtil.isSameLength(shortArray5, shortArray6);

        int int9 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(shortArray6, (short) (byte) 10);

        short[] shortArray14 = new short[] { (byte) 1, (byte) -1, (byte) 10, (byte) 100 };

        short[] shortArray19 = new short[] { (short) -1, (short) -1, (byte) 10, (byte) 10 };

        int int21 = com.alipay.sofa.common.utils.ArrayUtil.indexOf(shortArray14, shortArray19, (int) (byte) 100);

        boolean boolean22 = com.alipay.sofa.common.utils.ArrayUtil.contains(shortArray6, shortArray14);

        int int24 = com.alipay.sofa.common.utils.ArrayUtil.lastIndexOf(shortArray1, shortArray14, (int) (byte) -1);

        org.junit.Assert.assertNotNull(shortArray0);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");

        org.junit.Assert.assertNotNull(shortArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");

        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);

        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));

        org.junit.Assert.assertNotNull(shortArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[]");

        org.junit.Assert.assertNotNull(shortArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[]");

        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);

        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));

        org.junit.Assert.assertNotNull(shortArray14);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[1, -1, 10, 100]");

        org.junit.Assert.assertNotNull(shortArray19);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[-1, -1, 10, 10]");

        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));

        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);

        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));

    }



    @Test

    public void test364() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test364");

        com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler sofaThreadPoolTaskScheduler0 = new com.alipay.sofa.common.thread.SofaThreadPoolTaskScheduler();

        java.lang.ThreadGroup threadGroup1 = null;

        sofaThreadPoolTaskScheduler0.setThreadGroup(threadGroup1);

        long long3 = sofaThreadPoolTaskScheduler0.getPeriod();

        boolean boolean4 = sofaThreadPoolTaskScheduler0.prefersShortLivedTasks();

        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);

        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);

    }



    @Test

    public void test365() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test365");

        java.lang.String str0 = com.alipay.sofa.common.log.Constants.LOGGER_CONSOLE_WHITE_SET_KEY;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "console" + "'", str0, "console");

    }

}
