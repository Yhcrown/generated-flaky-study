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
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.util.logging.LogRecord logRecord1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = graylog2Handler0.isLoggable(logRecord1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.net.InetAddress inetAddress1 = me.moocar.logbackgelf.util.InternetUtils.getInetAddress("hi!");
        org.junit.Assert.assertNotNull(inetAddress1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.net.InetAddress inetAddress1 = null;
        me.moocar.logbackgelf.Transport transport2 = new me.moocar.logbackgelf.Transport((int) '4', inetAddress1);
        byte[] byteArray4 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory6 = new me.moocar.logbackgelf.ChunkFactory(byteArray4, true);
        // The following exception was thrown during execution in test generation
        try {
            transport2.send(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null buffer || null address");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        es.arcadiaconsulting.graylog2.jboss.SyslogLevel syslogLevel0 = es.arcadiaconsulting.graylog2.jboss.SyslogLevel.CRITICAL_SEVERITY;
        org.junit.Assert.assertTrue("'" + syslogLevel0 + "' != '" + es.arcadiaconsulting.graylog2.jboss.SyslogLevel.CRITICAL_SEVERITY + "'", syslogLevel0.equals(es.arcadiaconsulting.graylog2.jboss.SyslogLevel.CRITICAL_SEVERITY));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        es.arcadiaconsulting.graylog2.jboss.SyslogLevel syslogLevel0 = es.arcadiaconsulting.graylog2.jboss.SyslogLevel.INFO_SEVERITY;
        java.lang.String str1 = syslogLevel0.getNumericValueAsString();
        org.junit.Assert.assertTrue("'" + syslogLevel0 + "' != '" + es.arcadiaconsulting.graylog2.jboss.SyslogLevel.INFO_SEVERITY + "'", syslogLevel0.equals(es.arcadiaconsulting.graylog2.jboss.SyslogLevel.INFO_SEVERITY));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6" + "'", str1, "6");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        java.lang.String str0 = me.moocar.logbackgelf.util.InternetUtils.getLocalHostName();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Hengchens-MBP.attlocal.net" + "'", str0, "Hengchens-MBP.attlocal.net");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        java.util.logging.Filter filter5 = null;
        graylog2Handler0.setFilter(filter5);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.close();
        java.util.logging.Formatter formatter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setFormatter(formatter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.net.InetAddress inetAddress1 = null;
        me.moocar.logbackgelf.Transport transport2 = new me.moocar.logbackgelf.Transport((int) '4', inetAddress1);
        byte[] byteArray4 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory6 = new me.moocar.logbackgelf.ChunkFactory(byteArray4, false);
        byte[] byteArray8 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory10 = new me.moocar.logbackgelf.ChunkFactory(byteArray8, false);
        byte[][] byteArray11 = new byte[][] { byteArray4, byteArray8 };
        java.util.ArrayList<byte[]> byteArrayList12 = new java.util.ArrayList<byte[]>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<byte[]>) byteArrayList12, byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            transport2.send((java.util.List<byte[]>) byteArrayList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null buffer || null address");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.LogRecord logRecord3 = null;
        graylog2Handler0.publish(logRecord3);
        java.util.logging.ErrorManager errorManager5 = null;
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setErrorManager(errorManager5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.util.logging.Level level7 = graylog2Handler0.getLevel();
        java.lang.String str8 = graylog2Handler0.getGraylog2ServerVersion();
        java.util.logging.Filter filter9 = graylog2Handler0.getFilter();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.9.6" + "'", str8, "0.9.6");
        org.junit.Assert.assertNull(filter9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setUseLoggerName(false);
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.addStaticAdditionalField("Hengchens-MBP.attlocal.net");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: staticAdditionalField must be of the format key:value, where key is the additional field key (therefore should have a leading underscore), and value is a static string. e.g. _node_name:www013");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider2 = null;
        byte[] byteArray4 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory6 = new me.moocar.logbackgelf.ChunkFactory(byteArray4, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker7 = new me.moocar.logbackgelf.PayloadChunker((int) (byte) -1, 10, messageIdProvider2, chunkFactory6);
        java.lang.Class<?> wildcardClass8 = payloadChunker7.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.lang.String str2 = graylog2Handler0.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.addStaticAdditionalField("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: staticAdditionalField must be of the format key:value, where key is the additional field key (therefore should have a leading underscore), and value is a static string. e.g. _node_name:www013");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.util.logging.Formatter formatter2 = graylog2Handler0.getFormatter();
        java.lang.Class<?> wildcardClass3 = graylog2Handler0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(formatter2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.lang.String str2 = graylog2Handler0.getGraylog2ServerHost();
        java.util.logging.ErrorManager errorManager3 = null;
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setErrorManager(errorManager3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "localhost" + "'", str2, "localhost");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.close();
        graylog2Handler0.setFacility("0.9.6");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.security.MessageDigest messageDigest3 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider5 = new me.moocar.logbackgelf.MessageIdProvider(100, messageDigest3, "hi!");
        me.moocar.logbackgelf.ChunkFactory chunkFactory6 = null;
        me.moocar.logbackgelf.PayloadChunker payloadChunker7 = new me.moocar.logbackgelf.PayloadChunker((int) '#', (int) (byte) 100, messageIdProvider5, chunkFactory6);
        byte[] byteArray9 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory11 = new me.moocar.logbackgelf.ChunkFactory(byteArray9, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<byte[]> byteArrayList12 = payloadChunker7.chunkIt(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100]");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.util.logging.Formatter formatter2 = graylog2Handler0.getFormatter();
        java.lang.String str3 = graylog2Handler0.getHostName();
        int int4 = graylog2Handler0.getShortMessageLength();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(formatter2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 255 + "'", int4 == 255);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.util.logging.Level level7 = graylog2Handler0.getLevel();
        java.lang.Class<?> wildcardClass8 = level7.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setShortMessagePattern("0.9.6");
        java.util.logging.Filter filter6 = graylog2Handler0.getFilter();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(filter6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.util.logging.Level level7 = graylog2Handler0.getLevel();
        java.lang.String str8 = graylog2Handler0.getGraylog2ServerVersion();
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.addStaticAdditionalField("localhost");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: staticAdditionalField must be of the format key:value, where key is the additional field key (therefore should have a leading underscore), and value is a static string. e.g. _node_name:www013");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.9.6" + "'", str8, "0.9.6");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.LogRecord logRecord3 = null;
        graylog2Handler0.publish(logRecord3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = graylog2Handler0.getStaticAdditionalFields();
        graylog2Handler0.setShortMessagePattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        int int1 = graylog2Handler0.getShortMessageLength();
        java.lang.String str2 = graylog2Handler0.getFacility();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'", int1 == 255);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GELF" + "'", str2, "GELF");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.util.logging.Formatter formatter2 = graylog2Handler0.getFormatter();
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setHostName("hi!");
        java.util.logging.ErrorManager errorManager6 = null;
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setErrorManager(errorManager6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(formatter2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.net.InetAddress inetAddress1 = null;
        me.moocar.logbackgelf.Transport transport2 = new me.moocar.logbackgelf.Transport((int) '4', inetAddress1);
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider5 = null;
        byte[] byteArray7 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory9 = new me.moocar.logbackgelf.ChunkFactory(byteArray7, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker10 = new me.moocar.logbackgelf.PayloadChunker((int) (byte) -1, 10, messageIdProvider5, chunkFactory9);
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler14 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler14.setUseThreadName(true);
        java.util.logging.LogRecord logRecord17 = null;
        graylog2Handler14.publish(logRecord17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = graylog2Handler14.getStaticAdditionalFields();
        java.util.logging.Formatter formatter22 = null;
        java.util.logging.Formatter formatter23 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter24 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("0.9.6", false, true, strMap19, 1, "", formatter22, formatter23);
        me.moocar.logbackgelf.Zipper zipper25 = null;
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor27 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport2, payloadChunker10, gelfConverter24, zipper25, 255);
        java.security.MessageDigest messageDigest31 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider33 = new me.moocar.logbackgelf.MessageIdProvider(100, messageDigest31, "hi!");
        me.moocar.logbackgelf.ChunkFactory chunkFactory34 = null;
        me.moocar.logbackgelf.PayloadChunker payloadChunker35 = new me.moocar.logbackgelf.PayloadChunker((int) '#', (int) (byte) 100, messageIdProvider33, chunkFactory34);
        java.net.InetAddress inetAddress37 = null;
        me.moocar.logbackgelf.Transport transport38 = new me.moocar.logbackgelf.Transport((int) '4', inetAddress37);
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider41 = null;
        byte[] byteArray43 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory45 = new me.moocar.logbackgelf.ChunkFactory(byteArray43, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker46 = new me.moocar.logbackgelf.PayloadChunker((int) (byte) -1, 10, messageIdProvider41, chunkFactory45);
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler50 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler50.setUseThreadName(true);
        java.util.logging.LogRecord logRecord53 = null;
        graylog2Handler50.publish(logRecord53);
        java.util.Map<java.lang.String, java.lang.String> strMap55 = graylog2Handler50.getStaticAdditionalFields();
        java.util.logging.Formatter formatter58 = null;
        java.util.logging.Formatter formatter59 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter60 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("0.9.6", false, true, strMap55, 1, "", formatter58, formatter59);
        me.moocar.logbackgelf.Zipper zipper61 = null;
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor63 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport38, payloadChunker46, gelfConverter60, zipper61, 255);
        me.moocar.logbackgelf.Zipper zipper64 = new me.moocar.logbackgelf.Zipper();
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor66 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport2, payloadChunker35, gelfConverter60, zipper64, (int) (byte) -1);
        java.util.logging.LogRecord logRecord67 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str68 = gelfConverter60.toGelf(logRecord67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Error creating JSON message");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100]");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[100]");
        org.junit.Assert.assertNotNull(strMap55);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.security.MessageDigest messageDigest1 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider3 = new me.moocar.logbackgelf.MessageIdProvider((int) (byte) 0, messageDigest1, "GELF");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.util.logging.Level level7 = graylog2Handler0.getLevel();
        java.lang.String str8 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setChunkThreshold((int) '4');
        java.util.logging.ErrorManager errorManager11 = null;
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setErrorManager(errorManager11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "localhost" + "'", str8, "localhost");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.LogRecord logRecord3 = null;
        graylog2Handler0.publish(logRecord3);
        boolean boolean5 = graylog2Handler0.isIncludeFullMDC();
        java.lang.Class<?> wildcardClass6 = graylog2Handler0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.LogRecord logRecord3 = null;
        graylog2Handler0.publish(logRecord3);
        boolean boolean5 = graylog2Handler0.isIncludeFullMDC();
        java.util.logging.LogRecord logRecord6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = graylog2Handler0.isLoggable(logRecord6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.close();
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setEncoding("6");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 6");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.close();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = graylog2Handler0.getStaticAdditionalFields();
        java.util.logging.ErrorManager errorManager7 = null;
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setErrorManager(errorManager7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.close();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = graylog2Handler0.getStaticAdditionalFields();
        java.util.logging.Level level7 = graylog2Handler0.getLevel();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(level7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        java.net.InetAddress inetAddress1 = me.moocar.logbackgelf.util.InternetUtils.getInetAddress("Hengchens-MBP.attlocal.net");
        org.junit.Assert.assertNotNull(inetAddress1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.util.logging.Level level7 = graylog2Handler0.getLevel();
        java.lang.String str8 = graylog2Handler0.getGraylog2ServerHost();
        java.lang.Class<?> wildcardClass9 = graylog2Handler0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "localhost" + "'", str8, "localhost");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler1 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler1.setUseThreadName(true);
        java.lang.String str4 = graylog2Handler1.getHostName();
        java.lang.String str5 = graylog2Handler1.getGraylog2ServerHost();
        graylog2Handler1.close();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = graylog2Handler1.getStaticAdditionalFields();
        graylog2Handler0.setStaticAdditionalFields(strMap7);
        java.util.logging.Formatter formatter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setFormatter(formatter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "localhost" + "'", str5, "localhost");
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.close();
        boolean boolean6 = graylog2Handler0.isIncludeFullMDC();
        java.util.logging.ErrorManager errorManager7 = null;
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setErrorManager(errorManager7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.net.InetAddress inetAddress1 = null;
        me.moocar.logbackgelf.Transport transport2 = new me.moocar.logbackgelf.Transport((int) '4', inetAddress1);
        byte[] byteArray4 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory6 = new me.moocar.logbackgelf.ChunkFactory(byteArray4, false);
        byte[] byteArray8 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory10 = new me.moocar.logbackgelf.ChunkFactory(byteArray8, true);
        byte[] byteArray14 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory16 = new me.moocar.logbackgelf.ChunkFactory(byteArray14, true);
        byte[] byteArray17 = chunkFactory6.create(byteArray8, (byte) 10, (byte) 10, byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            transport2.send(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null buffer || null address");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, 100, 10, 10, 100]");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.net.InetAddress inetAddress1 = null;
        me.moocar.logbackgelf.Transport transport2 = new me.moocar.logbackgelf.Transport((int) '4', inetAddress1);
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider5 = null;
        byte[] byteArray7 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory9 = new me.moocar.logbackgelf.ChunkFactory(byteArray7, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker10 = new me.moocar.logbackgelf.PayloadChunker((int) (byte) -1, 10, messageIdProvider5, chunkFactory9);
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler14 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler14.setUseThreadName(true);
        java.util.logging.LogRecord logRecord17 = null;
        graylog2Handler14.publish(logRecord17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = graylog2Handler14.getStaticAdditionalFields();
        java.util.logging.Formatter formatter22 = null;
        java.util.logging.Formatter formatter23 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter24 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("0.9.6", false, true, strMap19, 1, "", formatter22, formatter23);
        me.moocar.logbackgelf.Zipper zipper25 = null;
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor27 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport2, payloadChunker10, gelfConverter24, zipper25, 255);
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            transport2.send(byteArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null buffer || null address");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100]");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[10, -1, -1, 100, 0]");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.net.InetAddress inetAddress1 = null;
        me.moocar.logbackgelf.Transport transport2 = new me.moocar.logbackgelf.Transport((int) '4', inetAddress1);
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider5 = null;
        byte[] byteArray7 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory9 = new me.moocar.logbackgelf.ChunkFactory(byteArray7, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker10 = new me.moocar.logbackgelf.PayloadChunker((int) (byte) -1, 10, messageIdProvider5, chunkFactory9);
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler14 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler14.setUseThreadName(true);
        java.util.logging.LogRecord logRecord17 = null;
        graylog2Handler14.publish(logRecord17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = graylog2Handler14.getStaticAdditionalFields();
        java.util.logging.Formatter formatter22 = null;
        java.util.logging.Formatter formatter23 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter24 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("0.9.6", false, true, strMap19, 1, "", formatter22, formatter23);
        me.moocar.logbackgelf.Zipper zipper25 = null;
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor27 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport2, payloadChunker10, gelfConverter24, zipper25, 255);
        byte[] byteArray29 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory31 = new me.moocar.logbackgelf.ChunkFactory(byteArray29, false);
        byte[] byteArray33 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory35 = new me.moocar.logbackgelf.ChunkFactory(byteArray33, true);
        byte[] byteArray39 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory41 = new me.moocar.logbackgelf.ChunkFactory(byteArray39, true);
        byte[] byteArray42 = chunkFactory31.create(byteArray33, (byte) 10, (byte) 10, byteArray39);
        // The following exception was thrown during execution in test generation
        try {
            transport2.send(byteArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null buffer || null address");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100]");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[100]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[100, 100, 10, 10, 100]");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setGraylog2ServerHost("6");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "localhost" + "'", str3, "localhost");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        es.arcadiaconsulting.graylog2.jboss.SyslogLevel syslogLevel0 = es.arcadiaconsulting.graylog2.jboss.SyslogLevel.EMERGENCY_SEVERITY;
        org.junit.Assert.assertTrue("'" + syslogLevel0 + "' != '" + es.arcadiaconsulting.graylog2.jboss.SyslogLevel.EMERGENCY_SEVERITY + "'", syslogLevel0.equals(es.arcadiaconsulting.graylog2.jboss.SyslogLevel.EMERGENCY_SEVERITY));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.lang.String str7 = graylog2Handler0.getGraylog2ServerHost();
        java.util.logging.Filter filter8 = graylog2Handler0.getFilter();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "localhost" + "'", str7, "localhost");
        org.junit.Assert.assertNull(filter8);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.util.logging.Level level7 = graylog2Handler0.getLevel();
        java.lang.String str8 = graylog2Handler0.getGraylog2ServerHost();
        boolean boolean9 = graylog2Handler0.isUseLoggerName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "localhost" + "'", str8, "localhost");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.close();
        graylog2Handler0.setUseLoggerName(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        java.security.MessageDigest messageDigest1 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider3 = new me.moocar.logbackgelf.MessageIdProvider(100, messageDigest1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray4 = messageIdProvider3.get();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setUseLoggerName(false);
        java.util.logging.LogRecord logRecord7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = graylog2Handler0.isLoggable(logRecord7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getGraylog2ServerHost();
        java.util.logging.LogRecord logRecord4 = null;
        graylog2Handler0.publish(logRecord4);
        java.util.logging.LogRecord logRecord6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = graylog2Handler0.isLoggable(logRecord6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "localhost" + "'", str3, "localhost");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.LogRecord logRecord3 = null;
        graylog2Handler0.publish(logRecord3);
        boolean boolean5 = graylog2Handler0.isIncludeFullMDC();
        boolean boolean6 = graylog2Handler0.isUseLoggerName();
        graylog2Handler0.setUseThreadName(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setShortMessagePattern("0.9.6");
        java.util.logging.Formatter formatter6 = graylog2Handler0.getFormatter();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(formatter6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        boolean boolean7 = graylog2Handler0.isIncludeFullMDC();
        graylog2Handler0.setGraylog2ServerPort(10);
        graylog2Handler0.setGraylog2ServerHost("0.9.6");
        int int12 = graylog2Handler0.getShortMessageLength();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        graylog2Handler0.setChunkThreshold((int) (short) -1);
        int int4 = graylog2Handler0.getChunkThreshold();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.util.logging.Level level7 = graylog2Handler0.getLevel();
        java.lang.String str8 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setChunkThreshold((int) '4');
        java.util.logging.Filter filter11 = graylog2Handler0.getFilter();
        java.util.logging.ErrorManager errorManager12 = null;
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setErrorManager(errorManager12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "localhost" + "'", str8, "localhost");
        org.junit.Assert.assertNull(filter11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        int int1 = graylog2Handler0.getShortMessageLength();
        java.lang.String str2 = graylog2Handler0.getShortMessagePattern();
        graylog2Handler0.setShortMessagePattern("Hengchens-MBP.attlocal.net");
        java.util.logging.Formatter formatter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setFormatter(formatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'", int1 == 255);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        boolean boolean7 = graylog2Handler0.isIncludeFullMDC();
        boolean boolean8 = graylog2Handler0.isUseThreadName();
        java.util.logging.ErrorManager errorManager9 = graylog2Handler0.getErrorManager();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(errorManager9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setShortMessagePattern("0.9.6");
        boolean boolean6 = graylog2Handler0.isUseLoggerName();
        graylog2Handler0.setUseLoggerName(false);
        graylog2Handler0.setHostName("0.9.6");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider2 = null;
        byte[] byteArray4 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory6 = new me.moocar.logbackgelf.ChunkFactory(byteArray4, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker7 = new me.moocar.logbackgelf.PayloadChunker(0, (int) 'a', messageIdProvider2, chunkFactory6);
        byte[] byteArray9 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory11 = new me.moocar.logbackgelf.ChunkFactory(byteArray9, false);
        byte[] byteArray13 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory15 = new me.moocar.logbackgelf.ChunkFactory(byteArray13, true);
        byte[] byteArray19 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory21 = new me.moocar.logbackgelf.ChunkFactory(byteArray19, true);
        byte[] byteArray22 = chunkFactory11.create(byteArray13, (byte) 10, (byte) 10, byteArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<byte[]> byteArrayList23 = payloadChunker7.chunkIt(byteArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, 100, 10, 10, 100]");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.util.logging.Level level7 = graylog2Handler0.getLevel();
        java.lang.String str8 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setChunkThreshold((int) '4');
        java.util.logging.Filter filter11 = graylog2Handler0.getFilter();
        graylog2Handler0.setFacility("localhost");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "localhost" + "'", str8, "localhost");
        org.junit.Assert.assertNull(filter11);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory3 = new me.moocar.logbackgelf.ChunkFactory(byteArray1, false);
        java.lang.Class<?> wildcardClass4 = chunkFactory3.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        int int1 = graylog2Handler0.getShortMessageLength();
        java.lang.String str2 = graylog2Handler0.getShortMessagePattern();
        java.util.logging.LogRecord logRecord3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = graylog2Handler0.isLoggable(logRecord3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'", int1 == 255);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory3 = new me.moocar.logbackgelf.ChunkFactory(byteArray1, false);
        byte[] byteArray5 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory7 = new me.moocar.logbackgelf.ChunkFactory(byteArray5, true);
        byte[] byteArray11 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory13 = new me.moocar.logbackgelf.ChunkFactory(byteArray11, true);
        byte[] byteArray14 = chunkFactory3.create(byteArray5, (byte) 10, (byte) 10, byteArray11);
        me.moocar.logbackgelf.ChunkFactory chunkFactory16 = new me.moocar.logbackgelf.ChunkFactory(byteArray11, false);
        byte[] byteArray17 = null;
        byte[] byteArray21 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory23 = new me.moocar.logbackgelf.ChunkFactory(byteArray21, false);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) 10 };
        byte[] byteArray33 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory35 = new me.moocar.logbackgelf.ChunkFactory(byteArray33, false);
        byte[] byteArray37 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory39 = new me.moocar.logbackgelf.ChunkFactory(byteArray37, true);
        byte[] byteArray43 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory45 = new me.moocar.logbackgelf.ChunkFactory(byteArray43, true);
        byte[] byteArray46 = chunkFactory35.create(byteArray37, (byte) 10, (byte) 10, byteArray43);
        byte[] byteArray47 = chunkFactory23.create(byteArray29, (byte) 10, (byte) 0, byteArray43);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray48 = chunkFactory16.create(byteArray17, (byte) 0, (byte) 1, byteArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 100, 10, 10, 100]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100, 10, 1, -1, 10]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[100]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[100]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[100, 100, 10, 10, 100]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[100, 100, 10, 1, -1, 10, 10, 0, 100]");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        es.arcadiaconsulting.graylog2.jboss.SyslogLevel syslogLevel0 = es.arcadiaconsulting.graylog2.jboss.SyslogLevel.WARNING_SEVERITY;
        int int1 = syslogLevel0.getNumericValue();
        org.junit.Assert.assertTrue("'" + syslogLevel0 + "' != '" + es.arcadiaconsulting.graylog2.jboss.SyslogLevel.WARNING_SEVERITY + "'", syslogLevel0.equals(es.arcadiaconsulting.graylog2.jboss.SyslogLevel.WARNING_SEVERITY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        java.net.InetAddress inetAddress2 = me.moocar.logbackgelf.util.InternetUtils.getInetAddress("");
        me.moocar.logbackgelf.Transport transport3 = new me.moocar.logbackgelf.Transport(1, inetAddress2);
        java.security.MessageDigest messageDigest7 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider9 = new me.moocar.logbackgelf.MessageIdProvider(100, messageDigest7, "hi!");
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider12 = null;
        byte[] byteArray14 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory16 = new me.moocar.logbackgelf.ChunkFactory(byteArray14, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker17 = new me.moocar.logbackgelf.PayloadChunker(0, (int) 'a', messageIdProvider12, chunkFactory16);
        me.moocar.logbackgelf.PayloadChunker payloadChunker18 = new me.moocar.logbackgelf.PayloadChunker((int) '4', 1, messageIdProvider9, chunkFactory16);
        byte[] byteArray20 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory22 = new me.moocar.logbackgelf.ChunkFactory(byteArray20, false);
        byte[] byteArray28 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) 10 };
        byte[] byteArray32 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory34 = new me.moocar.logbackgelf.ChunkFactory(byteArray32, false);
        byte[] byteArray36 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory38 = new me.moocar.logbackgelf.ChunkFactory(byteArray36, true);
        byte[] byteArray42 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory44 = new me.moocar.logbackgelf.ChunkFactory(byteArray42, true);
        byte[] byteArray45 = chunkFactory34.create(byteArray36, (byte) 10, (byte) 10, byteArray42);
        byte[] byteArray46 = chunkFactory22.create(byteArray28, (byte) 10, (byte) 0, byteArray42);
        byte[] byteArray50 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory52 = new me.moocar.logbackgelf.ChunkFactory(byteArray50, false);
        byte[] byteArray54 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory56 = new me.moocar.logbackgelf.ChunkFactory(byteArray54, true);
        byte[] byteArray60 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory62 = new me.moocar.logbackgelf.ChunkFactory(byteArray60, true);
        byte[] byteArray63 = chunkFactory52.create(byteArray54, (byte) 10, (byte) 10, byteArray60);
        byte[] byteArray64 = chunkFactory16.create(byteArray46, (byte) 1, (byte) -1, byteArray63);
        transport3.send(byteArray46);
        org.junit.Assert.assertNotNull(inetAddress2);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[100]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100, 10, 1, -1, 10]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[100]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[100]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[100]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[100, 100, 10, 10, 100]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[100, 100, 10, 1, -1, 10, 10, 0, 100]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[100]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[100]");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[100]");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[100, 100, 10, 10, 100]");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[100, 100, 100, 10, 1, -1, 10, 10, 0, 100, 0, 1, 0, -1, 100, 100, 10, 10, 100]");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.util.logging.Level level7 = graylog2Handler0.getLevel();
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setStaticAdditionalFieldsProperties("Hengchens-MBP.attlocal.net");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: staticAdditionalField must be of the format key:value, where key is the additional field key (therefore should have a leading underscore), and value is a static string. e.g. _node_name:www013");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(level7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.util.logging.Level level7 = graylog2Handler0.getLevel();
        java.lang.String str8 = graylog2Handler0.getGraylog2ServerVersion();
        java.util.logging.LogRecord logRecord9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = graylog2Handler0.isLoggable(logRecord9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.9.6" + "'", str8, "0.9.6");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        graylog2Handler0.setChunkThreshold((int) (byte) 10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        graylog2Handler0.setChunkThreshold((int) (short) -1);
        graylog2Handler0.flush();
        graylog2Handler0.setStaticAdditionalFieldsProperties("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setShortMessagePattern("0.9.6");
        boolean boolean6 = graylog2Handler0.isUseLoggerName();
        graylog2Handler0.setUseLoggerName(false);
        graylog2Handler0.setGraylog2ServerHost("7");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.lang.Class<?> wildcardClass2 = graylog2Handler0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        boolean boolean7 = graylog2Handler0.isIncludeFullMDC();
        graylog2Handler0.setGraylog2ServerPort(10);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = graylog2Handler0.getStaticAdditionalFields();
        graylog2Handler0.setFacility("5");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        java.net.InetAddress inetAddress3 = me.moocar.logbackgelf.util.InternetUtils.getInetAddress("GELF");
        me.moocar.logbackgelf.Transport transport4 = new me.moocar.logbackgelf.Transport(0, inetAddress3);
        me.moocar.logbackgelf.Transport transport5 = new me.moocar.logbackgelf.Transport(0, inetAddress3);
        org.junit.Assert.assertNotNull(inetAddress3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.security.MessageDigest messageDigest3 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider5 = new me.moocar.logbackgelf.MessageIdProvider(100, messageDigest3, "hi!");
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider8 = null;
        byte[] byteArray10 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory12 = new me.moocar.logbackgelf.ChunkFactory(byteArray10, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker13 = new me.moocar.logbackgelf.PayloadChunker(0, (int) 'a', messageIdProvider8, chunkFactory12);
        me.moocar.logbackgelf.PayloadChunker payloadChunker14 = new me.moocar.logbackgelf.PayloadChunker((int) '4', 1, messageIdProvider5, chunkFactory12);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = messageIdProvider5.get();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.LogRecord logRecord3 = null;
        graylog2Handler0.publish(logRecord3);
        java.lang.String str5 = graylog2Handler0.getGraylog2ServerVersion();
        graylog2Handler0.setGraylog2ServerVersion("Hengchens-MBP.attlocal.net");
        java.util.logging.LogRecord logRecord8 = null;
        graylog2Handler0.publish(logRecord8);
        java.util.logging.Filter filter10 = graylog2Handler0.getFilter();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.9.6" + "'", str5, "0.9.6");
        org.junit.Assert.assertNull(filter10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        java.net.InetAddress inetAddress1 = null;
        me.moocar.logbackgelf.Transport transport2 = new me.moocar.logbackgelf.Transport((int) '4', inetAddress1);
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider5 = null;
        byte[] byteArray7 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory9 = new me.moocar.logbackgelf.ChunkFactory(byteArray7, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker10 = new me.moocar.logbackgelf.PayloadChunker((int) (byte) -1, 10, messageIdProvider5, chunkFactory9);
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler14 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler14.setUseThreadName(true);
        java.util.logging.LogRecord logRecord17 = null;
        graylog2Handler14.publish(logRecord17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = graylog2Handler14.getStaticAdditionalFields();
        java.util.logging.Formatter formatter22 = null;
        java.util.logging.Formatter formatter23 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter24 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("0.9.6", false, true, strMap19, 1, "", formatter22, formatter23);
        me.moocar.logbackgelf.Zipper zipper25 = null;
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor27 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport2, payloadChunker10, gelfConverter24, zipper25, 255);
        java.security.MessageDigest messageDigest31 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider33 = new me.moocar.logbackgelf.MessageIdProvider(100, messageDigest31, "hi!");
        me.moocar.logbackgelf.ChunkFactory chunkFactory34 = null;
        me.moocar.logbackgelf.PayloadChunker payloadChunker35 = new me.moocar.logbackgelf.PayloadChunker((int) '#', (int) (byte) 100, messageIdProvider33, chunkFactory34);
        java.net.InetAddress inetAddress37 = null;
        me.moocar.logbackgelf.Transport transport38 = new me.moocar.logbackgelf.Transport((int) '4', inetAddress37);
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider41 = null;
        byte[] byteArray43 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory45 = new me.moocar.logbackgelf.ChunkFactory(byteArray43, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker46 = new me.moocar.logbackgelf.PayloadChunker((int) (byte) -1, 10, messageIdProvider41, chunkFactory45);
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler50 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler50.setUseThreadName(true);
        java.util.logging.LogRecord logRecord53 = null;
        graylog2Handler50.publish(logRecord53);
        java.util.Map<java.lang.String, java.lang.String> strMap55 = graylog2Handler50.getStaticAdditionalFields();
        java.util.logging.Formatter formatter58 = null;
        java.util.logging.Formatter formatter59 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter60 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("0.9.6", false, true, strMap55, 1, "", formatter58, formatter59);
        me.moocar.logbackgelf.Zipper zipper61 = null;
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor63 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport38, payloadChunker46, gelfConverter60, zipper61, 255);
        me.moocar.logbackgelf.Zipper zipper64 = new me.moocar.logbackgelf.Zipper();
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor66 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport2, payloadChunker35, gelfConverter60, zipper64, (int) (byte) -1);
        java.util.logging.LogRecord logRecord67 = null;
        // The following exception was thrown during execution in test generation
        try {
            appenderExecutor66.append(logRecord67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Error creating JSON message");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100]");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[100]");
        org.junit.Assert.assertNotNull(strMap55);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        graylog2Handler0.setChunkThreshold((int) (short) -1);
        graylog2Handler0.flush();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = graylog2Handler0.getStaticAdditionalFields();
        graylog2Handler0.setIncludeFullMDC(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.LogRecord logRecord3 = null;
        graylog2Handler0.publish(logRecord3);
        boolean boolean5 = graylog2Handler0.isIncludeFullMDC();
        int int6 = graylog2Handler0.getGraylog2ServerPort();
        java.lang.String str7 = graylog2Handler0.getGraylog2ServerVersion();
        graylog2Handler0.setShortMessagePattern("localhost");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12201 + "'", int6 == 12201);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.9.6" + "'", str7, "0.9.6");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setFacility("5");
        graylog2Handler0.setIncludeFullMDC(false);
        graylog2Handler0.setFacility("6");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.lang.String str7 = graylog2Handler0.getGraylog2ServerVersion();
        boolean boolean8 = graylog2Handler0.isIncludeFullMDC();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.9.6" + "'", str7, "0.9.6");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.LogRecord logRecord3 = null;
        graylog2Handler0.publish(logRecord3);
        java.lang.String str5 = graylog2Handler0.getGraylog2ServerVersion();
        java.lang.String str6 = graylog2Handler0.getGraylog2ServerVersion();
        java.util.logging.LogRecord logRecord7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = graylog2Handler0.isLoggable(logRecord7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.9.6" + "'", str5, "0.9.6");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.9.6" + "'", str6, "0.9.6");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.util.logging.Level level7 = graylog2Handler0.getLevel();
        java.lang.String str8 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setFacility("");
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.addStaticAdditionalField("7");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: staticAdditionalField must be of the format key:value, where key is the additional field key (therefore should have a leading underscore), and value is a static string. e.g. _node_name:www013");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "localhost" + "'", str8, "localhost");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        java.net.InetAddress inetAddress2 = me.moocar.logbackgelf.util.InternetUtils.getInetAddress("GELF");
        me.moocar.logbackgelf.Transport transport3 = new me.moocar.logbackgelf.Transport(0, inetAddress2);
        java.security.MessageDigest messageDigest7 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider9 = new me.moocar.logbackgelf.MessageIdProvider((int) (short) 0, messageDigest7, "hi!");
        me.moocar.logbackgelf.ChunkFactory chunkFactory10 = null;
        me.moocar.logbackgelf.PayloadChunker payloadChunker11 = new me.moocar.logbackgelf.PayloadChunker((-1), 10, messageIdProvider9, chunkFactory10);
        java.net.InetAddress inetAddress13 = null;
        me.moocar.logbackgelf.Transport transport14 = new me.moocar.logbackgelf.Transport((int) '4', inetAddress13);
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider17 = null;
        byte[] byteArray19 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory21 = new me.moocar.logbackgelf.ChunkFactory(byteArray19, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker22 = new me.moocar.logbackgelf.PayloadChunker((int) (byte) -1, 10, messageIdProvider17, chunkFactory21);
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler26 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler26.setUseThreadName(true);
        java.util.logging.LogRecord logRecord29 = null;
        graylog2Handler26.publish(logRecord29);
        java.util.Map<java.lang.String, java.lang.String> strMap31 = graylog2Handler26.getStaticAdditionalFields();
        java.util.logging.Formatter formatter34 = null;
        java.util.logging.Formatter formatter35 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter36 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("0.9.6", false, true, strMap31, 1, "", formatter34, formatter35);
        me.moocar.logbackgelf.Zipper zipper37 = null;
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor39 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport14, payloadChunker22, gelfConverter36, zipper37, 255);
        java.security.MessageDigest messageDigest43 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider45 = new me.moocar.logbackgelf.MessageIdProvider(100, messageDigest43, "hi!");
        me.moocar.logbackgelf.ChunkFactory chunkFactory46 = null;
        me.moocar.logbackgelf.PayloadChunker payloadChunker47 = new me.moocar.logbackgelf.PayloadChunker((int) '#', (int) (byte) 100, messageIdProvider45, chunkFactory46);
        java.net.InetAddress inetAddress49 = null;
        me.moocar.logbackgelf.Transport transport50 = new me.moocar.logbackgelf.Transport((int) '4', inetAddress49);
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider53 = null;
        byte[] byteArray55 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory57 = new me.moocar.logbackgelf.ChunkFactory(byteArray55, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker58 = new me.moocar.logbackgelf.PayloadChunker((int) (byte) -1, 10, messageIdProvider53, chunkFactory57);
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler62 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler62.setUseThreadName(true);
        java.util.logging.LogRecord logRecord65 = null;
        graylog2Handler62.publish(logRecord65);
        java.util.Map<java.lang.String, java.lang.String> strMap67 = graylog2Handler62.getStaticAdditionalFields();
        java.util.logging.Formatter formatter70 = null;
        java.util.logging.Formatter formatter71 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter72 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("0.9.6", false, true, strMap67, 1, "", formatter70, formatter71);
        me.moocar.logbackgelf.Zipper zipper73 = null;
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor75 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport50, payloadChunker58, gelfConverter72, zipper73, 255);
        me.moocar.logbackgelf.Zipper zipper76 = new me.moocar.logbackgelf.Zipper();
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor78 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport14, payloadChunker47, gelfConverter72, zipper76, (int) (byte) -1);
        me.moocar.logbackgelf.Zipper zipper79 = new me.moocar.logbackgelf.Zipper();
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor81 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport3, payloadChunker11, gelfConverter72, zipper79, (int) (short) 0);
        byte[] byteArray83 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory85 = new me.moocar.logbackgelf.ChunkFactory(byteArray83, false);
        byte[] byteArray87 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory89 = new me.moocar.logbackgelf.ChunkFactory(byteArray87, true);
        byte[] byteArray93 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory95 = new me.moocar.logbackgelf.ChunkFactory(byteArray93, true);
        byte[] byteArray96 = chunkFactory85.create(byteArray87, (byte) 10, (byte) 10, byteArray93);
        me.moocar.logbackgelf.ChunkFactory chunkFactory98 = new me.moocar.logbackgelf.ChunkFactory(byteArray93, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<byte[]> byteArrayList99 = payloadChunker11.chunkIt(byteArray93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inetAddress2);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100]");
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[100]");
        org.junit.Assert.assertNotNull(strMap67);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[100]");
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray87), "[100]");
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray93), "[100]");
        org.junit.Assert.assertNotNull(byteArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray96), "[100, 100, 10, 10, 100]");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.lang.String str2 = graylog2Handler0.getEncoding();
        graylog2Handler0.setChunkThreshold((-1));
        graylog2Handler0.setIncludeFullMDC(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        boolean boolean7 = graylog2Handler0.isIncludeFullMDC();
        graylog2Handler0.setGraylog2ServerPort(10);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = graylog2Handler0.getStaticAdditionalFields();
        java.util.logging.Level level11 = graylog2Handler0.getLevel();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(level11);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setShortMessagePattern("0.9.6");
        boolean boolean6 = graylog2Handler0.isUseLoggerName();
        java.lang.String str7 = graylog2Handler0.getFacility();
        java.util.logging.Formatter formatter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setFormatter(formatter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GELF" + "'", str7, "GELF");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        graylog2Handler0.setChunkThreshold((int) (short) -1);
        graylog2Handler0.flush();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = graylog2Handler0.getStaticAdditionalFields();
        java.util.logging.Filter filter6 = null;
        graylog2Handler0.setFilter(filter6);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        es.arcadiaconsulting.graylog2.jboss.SyslogLevel syslogLevel0 = es.arcadiaconsulting.graylog2.jboss.SyslogLevel.ERROR_SEVERITY;
        int int1 = syslogLevel0.getNumericValue();
        int int2 = syslogLevel0.getNumericValue();
        org.junit.Assert.assertTrue("'" + syslogLevel0 + "' != '" + es.arcadiaconsulting.graylog2.jboss.SyslogLevel.ERROR_SEVERITY + "'", syslogLevel0.equals(es.arcadiaconsulting.graylog2.jboss.SyslogLevel.ERROR_SEVERITY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.LogRecord logRecord3 = null;
        graylog2Handler0.publish(logRecord3);
        java.lang.String str5 = graylog2Handler0.getGraylog2ServerVersion();
        graylog2Handler0.setGraylog2ServerVersion("Hengchens-MBP.attlocal.net");
        java.util.logging.LogRecord logRecord8 = null;
        graylog2Handler0.publish(logRecord8);
        java.util.logging.Formatter formatter10 = graylog2Handler0.getFormatter();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.9.6" + "'", str5, "0.9.6");
        org.junit.Assert.assertNull(formatter10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.lang.String str2 = graylog2Handler0.getEncoding();
        java.util.logging.Filter filter3 = graylog2Handler0.getFilter();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(filter3);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        int int1 = graylog2Handler0.getShortMessageLength();
        java.lang.String str2 = graylog2Handler0.getShortMessagePattern();
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setEncoding("7");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 7");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'", int1 == 255);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider2 = null;
        byte[] byteArray4 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory6 = new me.moocar.logbackgelf.ChunkFactory(byteArray4, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker7 = new me.moocar.logbackgelf.PayloadChunker(0, (int) 'a', messageIdProvider2, chunkFactory6);
        byte[] byteArray9 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory11 = new me.moocar.logbackgelf.ChunkFactory(byteArray9, false);
        byte[] byteArray13 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory15 = new me.moocar.logbackgelf.ChunkFactory(byteArray13, true);
        byte[] byteArray19 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory21 = new me.moocar.logbackgelf.ChunkFactory(byteArray19, true);
        byte[] byteArray22 = chunkFactory11.create(byteArray13, (byte) 10, (byte) 10, byteArray19);
        me.moocar.logbackgelf.ChunkFactory chunkFactory24 = new me.moocar.logbackgelf.ChunkFactory(byteArray19, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<byte[]> byteArrayList25 = payloadChunker7.chunkIt(byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, 100, 10, 10, 100]");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setShortMessagePattern("0.9.6");
        boolean boolean6 = graylog2Handler0.isUseLoggerName();
        graylog2Handler0.setUseLoggerName(false);
        int int9 = graylog2Handler0.getGraylog2ServerPort();
        java.lang.String str10 = graylog2Handler0.getHostName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12201 + "'", int9 == 12201);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setGraylog2ServerHost("");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setFacility("5");
        graylog2Handler0.setIncludeFullMDC(false);
        java.lang.String str9 = graylog2Handler0.getHostName();
        java.lang.String str10 = graylog2Handler0.getEncoding();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.util.logging.Formatter formatter2 = graylog2Handler0.getFormatter();
        java.lang.String str3 = graylog2Handler0.getHostName();
        boolean boolean4 = graylog2Handler0.isIncludeFullMDC();
        java.lang.String str5 = graylog2Handler0.getGraylog2ServerVersion();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(formatter2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.9.6" + "'", str5, "0.9.6");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        java.net.InetAddress inetAddress1 = me.moocar.logbackgelf.util.InternetUtils.getInetAddress("5");
        org.junit.Assert.assertNotNull(inetAddress1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        graylog2Handler0.setUseLoggerName(false);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler3 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler3.setUseThreadName(true);
        java.util.logging.LogRecord logRecord6 = null;
        graylog2Handler3.publish(logRecord6);
        java.lang.String str8 = graylog2Handler3.getGraylog2ServerVersion();
        java.util.logging.Level level9 = graylog2Handler3.getLevel();
        graylog2Handler0.setLevel(level9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.9.6" + "'", str8, "0.9.6");
        org.junit.Assert.assertNotNull(level9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        int int1 = graylog2Handler0.getShortMessageLength();
        java.lang.String str2 = graylog2Handler0.getShortMessagePattern();
        graylog2Handler0.setShortMessagePattern("Hengchens-MBP.attlocal.net");
        java.util.logging.LogRecord logRecord5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = graylog2Handler0.isLoggable(logRecord5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'", int1 == 255);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setShortMessagePattern("0.9.6");
        boolean boolean6 = graylog2Handler0.isUseLoggerName();
        graylog2Handler0.setUseLoggerName(false);
        graylog2Handler0.setIncludeFullMDC(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler3 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler3.setUseThreadName(true);
        java.util.logging.LogRecord logRecord6 = null;
        graylog2Handler3.publish(logRecord6);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = graylog2Handler3.getStaticAdditionalFields();
        java.util.logging.Formatter formatter11 = null;
        java.util.logging.Formatter formatter12 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter13 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("0.9.6", false, true, strMap8, 1, "", formatter11, formatter12);
        java.util.logging.LogRecord logRecord14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = gelfConverter13.toGelf(logRecord14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Error creating JSON message");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        boolean boolean7 = graylog2Handler0.isIncludeFullMDC();
        boolean boolean8 = graylog2Handler0.isUseThreadName();
        java.util.logging.Filter filter9 = graylog2Handler0.getFilter();
        java.util.logging.LogRecord logRecord10 = null;
        graylog2Handler0.publish(logRecord10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(filter9);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        java.security.MessageDigest messageDigest5 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider7 = new me.moocar.logbackgelf.MessageIdProvider(100, messageDigest5, "hi!");
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider10 = null;
        byte[] byteArray12 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory14 = new me.moocar.logbackgelf.ChunkFactory(byteArray12, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker15 = new me.moocar.logbackgelf.PayloadChunker(0, (int) 'a', messageIdProvider10, chunkFactory14);
        me.moocar.logbackgelf.PayloadChunker payloadChunker16 = new me.moocar.logbackgelf.PayloadChunker((int) '4', 1, messageIdProvider7, chunkFactory14);
        byte[] byteArray18 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory20 = new me.moocar.logbackgelf.ChunkFactory(byteArray18, false);
        me.moocar.logbackgelf.PayloadChunker payloadChunker21 = new me.moocar.logbackgelf.PayloadChunker(255, (int) (byte) 100, messageIdProvider7, chunkFactory20);
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<byte[]> byteArrayList25 = payloadChunker21.chunkIt(byteArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 100]");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.lang.String str7 = graylog2Handler0.getGraylog2ServerHost();
        int int8 = graylog2Handler0.getShortMessageLength();
        graylog2Handler0.setStaticAdditionalFieldsProperties("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "localhost" + "'", str7, "localhost");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        es.arcadiaconsulting.graylog2.jboss.SyslogLevel syslogLevel0 = es.arcadiaconsulting.graylog2.jboss.SyslogLevel.DEBUG_SEVERITY;
        java.lang.String str1 = syslogLevel0.getNumericValueAsString();
        java.lang.String str2 = syslogLevel0.getNumericValueAsString();
        int int3 = syslogLevel0.getNumericValue();
        org.junit.Assert.assertTrue("'" + syslogLevel0 + "' != '" + es.arcadiaconsulting.graylog2.jboss.SyslogLevel.DEBUG_SEVERITY + "'", syslogLevel0.equals(es.arcadiaconsulting.graylog2.jboss.SyslogLevel.DEBUG_SEVERITY));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "7" + "'", str1, "7");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7" + "'", str2, "7");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler1 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler1.setUseThreadName(true);
        java.lang.String str4 = graylog2Handler1.getHostName();
        java.lang.String str5 = graylog2Handler1.getGraylog2ServerHost();
        graylog2Handler1.close();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = graylog2Handler1.getStaticAdditionalFields();
        graylog2Handler0.setStaticAdditionalFields(strMap7);
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler9 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler9.setUseThreadName(true);
        java.lang.String str12 = graylog2Handler9.getHostName();
        graylog2Handler9.setShortMessagePattern("0.9.6");
        boolean boolean15 = graylog2Handler9.isUseLoggerName();
        graylog2Handler9.setUseLoggerName(false);
        int int18 = graylog2Handler9.getGraylog2ServerPort();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = graylog2Handler9.getStaticAdditionalFields();
        graylog2Handler0.setStaticAdditionalFields(strMap19);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "localhost" + "'", str5, "localhost");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12201 + "'", int18 == 12201);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        graylog2Handler0.setChunkThreshold((int) (short) -1);
        boolean boolean4 = graylog2Handler0.isUseLoggerName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        boolean boolean7 = graylog2Handler0.isIncludeFullMDC();
        graylog2Handler0.setGraylog2ServerPort(10);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = graylog2Handler0.getStaticAdditionalFields();
        java.util.logging.Filter filter11 = null;
        graylog2Handler0.setFilter(filter11);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.lang.String str2 = graylog2Handler0.getEncoding();
        int int3 = graylog2Handler0.getShortMessageLength();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler4 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler4.setUseThreadName(true);
        java.util.logging.LogRecord logRecord7 = null;
        graylog2Handler4.publish(logRecord7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = graylog2Handler4.getStaticAdditionalFields();
        graylog2Handler0.setStaticAdditionalFields(strMap9);
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.addStaticAdditionalField("7");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: staticAdditionalField must be of the format key:value, where key is the additional field key (therefore should have a leading underscore), and value is a static string. e.g. _node_name:www013");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 255 + "'", int3 == 255);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.security.MessageDigest messageDigest1 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider3 = new me.moocar.logbackgelf.MessageIdProvider((int) '4', messageDigest1, "7");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        es.arcadiaconsulting.graylog2.jboss.SyslogLevel syslogLevel0 = es.arcadiaconsulting.graylog2.jboss.SyslogLevel.NOTICE_SEVERITY;
        java.lang.String str1 = syslogLevel0.getNumericValueAsString();
        java.lang.String str2 = syslogLevel0.getNumericValueAsString();
        int int3 = syslogLevel0.getNumericValue();
        org.junit.Assert.assertTrue("'" + syslogLevel0 + "' != '" + es.arcadiaconsulting.graylog2.jboss.SyslogLevel.NOTICE_SEVERITY + "'", syslogLevel0.equals(es.arcadiaconsulting.graylog2.jboss.SyslogLevel.NOTICE_SEVERITY));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5" + "'", str1, "5");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5" + "'", str2, "5");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.lang.String str2 = graylog2Handler0.getEncoding();
        graylog2Handler0.setChunkThreshold((-1));
        graylog2Handler0.setGraylog2ServerVersion("GELF");
        java.lang.String str7 = graylog2Handler0.getGraylog2ServerHost();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "localhost" + "'", str7, "localhost");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.util.logging.Formatter formatter2 = graylog2Handler0.getFormatter();
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setHostName("hi!");
        java.util.logging.LogRecord logRecord6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = graylog2Handler0.isLoggable(logRecord6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(formatter2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setShortMessagePattern("0.9.6");
        boolean boolean6 = graylog2Handler0.isUseLoggerName();
        graylog2Handler0.setUseLoggerName(false);
        int int9 = graylog2Handler0.getGraylog2ServerPort();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = graylog2Handler0.getStaticAdditionalFields();
        java.lang.String str11 = graylog2Handler0.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setEncoding("5");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 5");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12201 + "'", int9 == 12201);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory3 = new me.moocar.logbackgelf.ChunkFactory(byteArray1, false);
        me.moocar.logbackgelf.ChunkFactory chunkFactory5 = new me.moocar.logbackgelf.ChunkFactory(byteArray1, false);
        byte[] byteArray7 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory9 = new me.moocar.logbackgelf.ChunkFactory(byteArray7, true);
        byte[] byteArray11 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory13 = new me.moocar.logbackgelf.ChunkFactory(byteArray11, false);
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) 10 };
        byte[] byteArray23 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory25 = new me.moocar.logbackgelf.ChunkFactory(byteArray23, false);
        byte[] byteArray27 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory29 = new me.moocar.logbackgelf.ChunkFactory(byteArray27, true);
        byte[] byteArray33 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory35 = new me.moocar.logbackgelf.ChunkFactory(byteArray33, true);
        byte[] byteArray36 = chunkFactory25.create(byteArray27, (byte) 10, (byte) 10, byteArray33);
        byte[] byteArray37 = chunkFactory13.create(byteArray19, (byte) 10, (byte) 0, byteArray33);
        byte[] byteArray41 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory43 = new me.moocar.logbackgelf.ChunkFactory(byteArray41, false);
        byte[] byteArray49 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) 10 };
        byte[] byteArray53 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory55 = new me.moocar.logbackgelf.ChunkFactory(byteArray53, false);
        byte[] byteArray57 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory59 = new me.moocar.logbackgelf.ChunkFactory(byteArray57, true);
        byte[] byteArray63 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory65 = new me.moocar.logbackgelf.ChunkFactory(byteArray63, true);
        byte[] byteArray66 = chunkFactory55.create(byteArray57, (byte) 10, (byte) 10, byteArray63);
        byte[] byteArray67 = chunkFactory43.create(byteArray49, (byte) 10, (byte) 0, byteArray63);
        byte[] byteArray68 = chunkFactory9.create(byteArray19, (byte) -1, (byte) 100, byteArray67);
        me.moocar.logbackgelf.ChunkFactory chunkFactory70 = new me.moocar.logbackgelf.ChunkFactory(byteArray19, false);
        byte[] byteArray74 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory76 = new me.moocar.logbackgelf.ChunkFactory(byteArray74, false);
        byte[] byteArray77 = chunkFactory5.create(byteArray19, (byte) 0, (byte) 10, byteArray74);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100, 10, 1, -1, 10]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[100]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[100, 100, 10, 10, 100]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[100, 100, 10, 1, -1, 10, 10, 0, 100]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[100]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[100, 10, 1, -1, 10]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[100]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[100]");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[100]");
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[100, 100, 10, 10, 100]");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[100, 100, 10, 1, -1, 10, 10, 0, 100]");
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[100, 100, 10, 1, -1, 10, 0, -1, 0, 100, 100, 100, 10, 1, -1, 10, 10, 0, 100]");
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[100]");
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[100, 100, 10, 1, -1, 10, 0, 10, 100]");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.LogRecord logRecord3 = null;
        graylog2Handler0.publish(logRecord3);
        java.lang.String str5 = graylog2Handler0.getGraylog2ServerVersion();
        java.util.logging.LogRecord logRecord6 = null;
        graylog2Handler0.publish(logRecord6);
        graylog2Handler0.setChunkThreshold((int) (short) -1);
        java.lang.String str10 = graylog2Handler0.getGraylog2ServerVersion();
        java.util.logging.Filter filter11 = null;
        graylog2Handler0.setFilter(filter11);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.9.6" + "'", str5, "0.9.6");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.9.6" + "'", str10, "0.9.6");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setFacility("5");
        graylog2Handler0.setIncludeFullMDC(false);
        graylog2Handler0.setGraylog2ServerHost("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.util.logging.Level level7 = graylog2Handler0.getLevel();
        java.lang.String str8 = graylog2Handler0.getGraylog2ServerVersion();
        graylog2Handler0.setChunkThreshold((int) (short) 1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.9.6" + "'", str8, "0.9.6");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        java.net.InetAddress inetAddress2 = me.moocar.logbackgelf.util.InternetUtils.getInetAddress("");
        me.moocar.logbackgelf.Transport transport3 = new me.moocar.logbackgelf.Transport(1, inetAddress2);
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider6 = null;
        byte[] byteArray8 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory10 = new me.moocar.logbackgelf.ChunkFactory(byteArray8, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker11 = new me.moocar.logbackgelf.PayloadChunker(0, (int) 'a', messageIdProvider6, chunkFactory10);
        java.net.InetAddress inetAddress13 = null;
        me.moocar.logbackgelf.Transport transport14 = new me.moocar.logbackgelf.Transport((int) '4', inetAddress13);
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider17 = null;
        byte[] byteArray19 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory21 = new me.moocar.logbackgelf.ChunkFactory(byteArray19, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker22 = new me.moocar.logbackgelf.PayloadChunker((int) (byte) -1, 10, messageIdProvider17, chunkFactory21);
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler26 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler26.setUseThreadName(true);
        java.util.logging.LogRecord logRecord29 = null;
        graylog2Handler26.publish(logRecord29);
        java.util.Map<java.lang.String, java.lang.String> strMap31 = graylog2Handler26.getStaticAdditionalFields();
        java.util.logging.Formatter formatter34 = null;
        java.util.logging.Formatter formatter35 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter36 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("0.9.6", false, true, strMap31, 1, "", formatter34, formatter35);
        me.moocar.logbackgelf.Zipper zipper37 = null;
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor39 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport14, payloadChunker22, gelfConverter36, zipper37, 255);
        java.security.MessageDigest messageDigest43 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider45 = new me.moocar.logbackgelf.MessageIdProvider(100, messageDigest43, "hi!");
        me.moocar.logbackgelf.ChunkFactory chunkFactory46 = null;
        me.moocar.logbackgelf.PayloadChunker payloadChunker47 = new me.moocar.logbackgelf.PayloadChunker((int) '#', (int) (byte) 100, messageIdProvider45, chunkFactory46);
        java.net.InetAddress inetAddress49 = null;
        me.moocar.logbackgelf.Transport transport50 = new me.moocar.logbackgelf.Transport((int) '4', inetAddress49);
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider53 = null;
        byte[] byteArray55 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory57 = new me.moocar.logbackgelf.ChunkFactory(byteArray55, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker58 = new me.moocar.logbackgelf.PayloadChunker((int) (byte) -1, 10, messageIdProvider53, chunkFactory57);
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler62 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler62.setUseThreadName(true);
        java.util.logging.LogRecord logRecord65 = null;
        graylog2Handler62.publish(logRecord65);
        java.util.Map<java.lang.String, java.lang.String> strMap67 = graylog2Handler62.getStaticAdditionalFields();
        java.util.logging.Formatter formatter70 = null;
        java.util.logging.Formatter formatter71 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter72 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("0.9.6", false, true, strMap67, 1, "", formatter70, formatter71);
        me.moocar.logbackgelf.Zipper zipper73 = null;
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor75 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport50, payloadChunker58, gelfConverter72, zipper73, 255);
        me.moocar.logbackgelf.Zipper zipper76 = new me.moocar.logbackgelf.Zipper();
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor78 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport14, payloadChunker47, gelfConverter72, zipper76, (int) (byte) -1);
        me.moocar.logbackgelf.Zipper zipper79 = new me.moocar.logbackgelf.Zipper();
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor81 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport3, payloadChunker11, gelfConverter72, zipper79, (int) (byte) 10);
        java.util.logging.LogRecord logRecord82 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str83 = gelfConverter72.toGelf(logRecord82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Error creating JSON message");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inetAddress2);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100]");
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[100]");
        org.junit.Assert.assertNotNull(strMap67);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        es.arcadiaconsulting.graylog2.jboss.SyslogLevel syslogLevel0 = es.arcadiaconsulting.graylog2.jboss.SyslogLevel.DEBUG_SEVERITY;
        int int1 = syslogLevel0.getNumericValue();
        org.junit.Assert.assertTrue("'" + syslogLevel0 + "' != '" + es.arcadiaconsulting.graylog2.jboss.SyslogLevel.DEBUG_SEVERITY + "'", syslogLevel0.equals(es.arcadiaconsulting.graylog2.jboss.SyslogLevel.DEBUG_SEVERITY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.util.logging.Formatter formatter7 = graylog2Handler0.getFormatter();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNull(formatter7);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setShortMessagePattern("0.9.6");
        graylog2Handler0.setGraylog2ServerVersion("6");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.util.logging.Formatter formatter2 = graylog2Handler0.getFormatter();
        java.lang.String str3 = graylog2Handler0.getHostName();
        boolean boolean4 = graylog2Handler0.isIncludeFullMDC();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler5 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler5.setUseThreadName(true);
        java.lang.String str8 = graylog2Handler5.getHostName();
        java.lang.String str9 = graylog2Handler5.getGraylog2ServerHost();
        graylog2Handler5.close();
        boolean boolean11 = graylog2Handler5.isIncludeFullMDC();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler12 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler12.setUseThreadName(true);
        java.lang.String str15 = graylog2Handler12.getHostName();
        java.lang.String str16 = graylog2Handler12.getGraylog2ServerHost();
        graylog2Handler12.close();
        graylog2Handler12.setFacility("GELF");
        java.util.logging.ErrorManager errorManager20 = graylog2Handler12.getErrorManager();
        graylog2Handler5.setErrorManager(errorManager20);
        graylog2Handler0.setErrorManager(errorManager20);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(formatter2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "localhost" + "'", str9, "localhost");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "localhost" + "'", str16, "localhost");
        org.junit.Assert.assertNotNull(errorManager20);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        int int1 = graylog2Handler0.getShortMessageLength();
        java.lang.String str2 = graylog2Handler0.getShortMessagePattern();
        graylog2Handler0.setShortMessagePattern("Hengchens-MBP.attlocal.net");
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.addStaticAdditionalField("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: staticAdditionalField must be of the format key:value, where key is the additional field key (therefore should have a leading underscore), and value is a static string. e.g. _node_name:www013");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'", int1 == 255);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.lang.String str7 = graylog2Handler0.getGraylog2ServerVersion();
        java.lang.String str8 = graylog2Handler0.getShortMessagePattern();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.9.6" + "'", str7, "0.9.6");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        graylog2Handler0.setChunkThreshold((int) (short) -1);
        java.util.logging.LogRecord logRecord4 = null;
        graylog2Handler0.publish(logRecord4);
        java.lang.String str6 = graylog2Handler0.getGraylog2ServerVersion();
        java.util.logging.LogRecord logRecord7 = null;
        graylog2Handler0.publish(logRecord7);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.9.6" + "'", str6, "0.9.6");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setShortMessagePattern("0.9.6");
        boolean boolean6 = graylog2Handler0.isUseLoggerName();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler7 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str8 = graylog2Handler7.getHostName();
        java.lang.String str9 = graylog2Handler7.getEncoding();
        int int10 = graylog2Handler7.getShortMessageLength();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler11 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler11.setUseThreadName(true);
        java.util.logging.LogRecord logRecord14 = null;
        graylog2Handler11.publish(logRecord14);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = graylog2Handler11.getStaticAdditionalFields();
        graylog2Handler7.setStaticAdditionalFields(strMap16);
        graylog2Handler0.setStaticAdditionalFields(strMap16);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 255 + "'", int10 == 255);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        java.util.logging.Formatter formatter6 = null;
        java.util.logging.Formatter formatter7 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter8 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("", true, false, strMap3, (int) (byte) 10, "5", formatter6, formatter7);
        java.util.logging.LogRecord logRecord9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = gelfConverter8.toGelf(logRecord9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Error creating JSON message");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.lang.String str2 = graylog2Handler0.getEncoding();
        graylog2Handler0.setChunkThreshold((-1));
        graylog2Handler0.setGraylog2ServerPort((int) (short) 100);
        java.lang.String str7 = graylog2Handler0.getGraylog2ServerHost();
        java.lang.String str8 = graylog2Handler0.getGraylog2ServerHost();
        java.util.logging.LogRecord logRecord9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = graylog2Handler0.isLoggable(logRecord9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "localhost" + "'", str7, "localhost");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "localhost" + "'", str8, "localhost");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        java.net.InetAddress inetAddress2 = me.moocar.logbackgelf.util.InternetUtils.getInetAddress("GELF");
        me.moocar.logbackgelf.Transport transport3 = new me.moocar.logbackgelf.Transport(0, inetAddress2);
        byte[] byteArray5 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory7 = new me.moocar.logbackgelf.ChunkFactory(byteArray5, false);
        byte[] byteArray9 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory11 = new me.moocar.logbackgelf.ChunkFactory(byteArray9, true);
        byte[] byteArray15 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory17 = new me.moocar.logbackgelf.ChunkFactory(byteArray15, true);
        byte[] byteArray18 = chunkFactory7.create(byteArray9, (byte) 10, (byte) 10, byteArray15);
        transport3.send(byteArray15);
        java.net.InetAddress inetAddress22 = me.moocar.logbackgelf.util.InternetUtils.getInetAddress("");
        me.moocar.logbackgelf.Transport transport23 = new me.moocar.logbackgelf.Transport(1, inetAddress22);
        byte[] byteArray25 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory27 = new me.moocar.logbackgelf.ChunkFactory(byteArray25, false);
        byte[] byteArray29 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory31 = new me.moocar.logbackgelf.ChunkFactory(byteArray29, true);
        byte[] byteArray35 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory37 = new me.moocar.logbackgelf.ChunkFactory(byteArray35, true);
        byte[] byteArray38 = chunkFactory27.create(byteArray29, (byte) 10, (byte) 10, byteArray35);
        byte[] byteArray40 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory42 = new me.moocar.logbackgelf.ChunkFactory(byteArray40, true);
        byte[] byteArray44 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory46 = new me.moocar.logbackgelf.ChunkFactory(byteArray44, false);
        byte[] byteArray48 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory50 = new me.moocar.logbackgelf.ChunkFactory(byteArray48, true);
        byte[] byteArray54 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory56 = new me.moocar.logbackgelf.ChunkFactory(byteArray54, true);
        byte[] byteArray57 = chunkFactory46.create(byteArray48, (byte) 10, (byte) 10, byteArray54);
        byte[] byteArray59 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory61 = new me.moocar.logbackgelf.ChunkFactory(byteArray59, false);
        byte[] byteArray63 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory65 = new me.moocar.logbackgelf.ChunkFactory(byteArray63, true);
        byte[] byteArray69 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory71 = new me.moocar.logbackgelf.ChunkFactory(byteArray69, true);
        byte[] byteArray72 = chunkFactory61.create(byteArray63, (byte) 10, (byte) 10, byteArray69);
        byte[][] byteArray73 = new byte[][] { byteArray35, byteArray40, byteArray54, byteArray69 };
        java.util.ArrayList<byte[]> byteArrayList74 = new java.util.ArrayList<byte[]>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<byte[]>) byteArrayList74, byteArray73);
        transport23.send((java.util.List<byte[]>) byteArrayList74);
        transport3.send((java.util.List<byte[]>) byteArrayList74);
        org.junit.Assert.assertNotNull(inetAddress2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100, 100, 10, 10, 100]");
        org.junit.Assert.assertNotNull(inetAddress22);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[100]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[100, 100, 10, 10, 100]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[100]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[100]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[100]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[100]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[100, 100, 10, 10, 100]");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[100]");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[100]");
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[100]");
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[100, 100, 10, 10, 100]");
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.lang.String str2 = graylog2Handler0.getEncoding();
        graylog2Handler0.setChunkThreshold((-1));
        graylog2Handler0.setGraylog2ServerPort((int) (short) 100);
        java.lang.String str7 = graylog2Handler0.getGraylog2ServerHost();
        java.lang.String str8 = graylog2Handler0.getEncoding();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "localhost" + "'", str7, "localhost");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.lang.String str7 = graylog2Handler0.getGraylog2ServerVersion();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler8 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler8.setUseThreadName(true);
        java.util.logging.Level level11 = graylog2Handler8.getLevel();
        graylog2Handler0.setLevel(level11);
        graylog2Handler0.setShortMessageLength(5);
        java.util.logging.LogRecord logRecord15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = graylog2Handler0.isLoggable(logRecord15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.9.6" + "'", str7, "0.9.6");
        org.junit.Assert.assertNotNull(level11);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.lang.String str2 = graylog2Handler0.getEncoding();
        graylog2Handler0.setChunkThreshold((-1));
        graylog2Handler0.setGraylog2ServerPort((int) (short) 100);
        java.lang.String str7 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.close();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "localhost" + "'", str7, "localhost");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.lang.String str2 = graylog2Handler0.getEncoding();
        int int3 = graylog2Handler0.getShortMessageLength();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = graylog2Handler0.getStaticAdditionalFields();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 255 + "'", int3 == 255);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler1 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler1.setUseThreadName(true);
        java.lang.String str4 = graylog2Handler1.getHostName();
        java.lang.String str5 = graylog2Handler1.getGraylog2ServerHost();
        graylog2Handler1.close();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = graylog2Handler1.getStaticAdditionalFields();
        graylog2Handler0.setStaticAdditionalFields(strMap7);
        java.lang.String str9 = graylog2Handler0.getFacility();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "localhost" + "'", str5, "localhost");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GELF" + "'", str9, "GELF");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        boolean boolean7 = graylog2Handler0.isIncludeFullMDC();
        boolean boolean8 = graylog2Handler0.isUseThreadName();
        java.util.logging.Filter filter9 = graylog2Handler0.getFilter();
        java.lang.String str10 = graylog2Handler0.getHostName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(filter9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.lang.String str2 = graylog2Handler0.getEncoding();
        int int3 = graylog2Handler0.getShortMessageLength();
        java.util.logging.Level level4 = graylog2Handler0.getLevel();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 255 + "'", int3 == 255);
        org.junit.Assert.assertNotNull(level4);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.LogRecord logRecord3 = null;
        graylog2Handler0.publish(logRecord3);
        java.lang.String str5 = graylog2Handler0.getGraylog2ServerVersion();
        boolean boolean6 = graylog2Handler0.isUseThreadName();
        java.util.logging.Filter filter7 = null;
        graylog2Handler0.setFilter(filter7);
        graylog2Handler0.setUseLoggerName(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.9.6" + "'", str5, "0.9.6");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setFacility("5");
        graylog2Handler0.setIncludeFullMDC(false);
        java.lang.String str9 = graylog2Handler0.getHostName();
        graylog2Handler0.setShortMessagePattern("5");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler1 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler1.setUseThreadName(true);
        java.lang.String str4 = graylog2Handler1.getHostName();
        java.lang.String str5 = graylog2Handler1.getGraylog2ServerHost();
        graylog2Handler1.close();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = graylog2Handler1.getStaticAdditionalFields();
        graylog2Handler0.setStaticAdditionalFields(strMap7);
        int int9 = graylog2Handler0.getShortMessageLength();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "localhost" + "'", str5, "localhost");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 255 + "'", int9 == 255);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        java.security.MessageDigest messageDigest1 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider3 = new me.moocar.logbackgelf.MessageIdProvider((int) (short) 0, messageDigest1, "localhost");
        java.lang.Class<?> wildcardClass4 = messageIdProvider3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        int int1 = graylog2Handler0.getShortMessageLength();
        java.lang.String str2 = graylog2Handler0.getShortMessagePattern();
        graylog2Handler0.setShortMessagePattern("Hengchens-MBP.attlocal.net");
        java.lang.String str5 = graylog2Handler0.getGraylog2ServerVersion();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'", int1 == 255);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.9.6" + "'", str5, "0.9.6");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.LogRecord logRecord3 = null;
        graylog2Handler0.publish(logRecord3);
        java.lang.String str5 = graylog2Handler0.getGraylog2ServerVersion();
        java.util.logging.Formatter formatter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setFormatter(formatter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.9.6" + "'", str5, "0.9.6");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.net.InetAddress inetAddress2 = me.moocar.logbackgelf.util.InternetUtils.getInetAddress("GELF");
        me.moocar.logbackgelf.Transport transport3 = new me.moocar.logbackgelf.Transport(0, inetAddress2);
        java.security.MessageDigest messageDigest7 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider9 = new me.moocar.logbackgelf.MessageIdProvider((int) (short) 0, messageDigest7, "hi!");
        me.moocar.logbackgelf.ChunkFactory chunkFactory10 = null;
        me.moocar.logbackgelf.PayloadChunker payloadChunker11 = new me.moocar.logbackgelf.PayloadChunker((-1), 10, messageIdProvider9, chunkFactory10);
        java.net.InetAddress inetAddress13 = null;
        me.moocar.logbackgelf.Transport transport14 = new me.moocar.logbackgelf.Transport((int) '4', inetAddress13);
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider17 = null;
        byte[] byteArray19 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory21 = new me.moocar.logbackgelf.ChunkFactory(byteArray19, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker22 = new me.moocar.logbackgelf.PayloadChunker((int) (byte) -1, 10, messageIdProvider17, chunkFactory21);
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler26 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler26.setUseThreadName(true);
        java.util.logging.LogRecord logRecord29 = null;
        graylog2Handler26.publish(logRecord29);
        java.util.Map<java.lang.String, java.lang.String> strMap31 = graylog2Handler26.getStaticAdditionalFields();
        java.util.logging.Formatter formatter34 = null;
        java.util.logging.Formatter formatter35 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter36 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("0.9.6", false, true, strMap31, 1, "", formatter34, formatter35);
        me.moocar.logbackgelf.Zipper zipper37 = null;
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor39 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport14, payloadChunker22, gelfConverter36, zipper37, 255);
        java.security.MessageDigest messageDigest43 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider45 = new me.moocar.logbackgelf.MessageIdProvider(100, messageDigest43, "hi!");
        me.moocar.logbackgelf.ChunkFactory chunkFactory46 = null;
        me.moocar.logbackgelf.PayloadChunker payloadChunker47 = new me.moocar.logbackgelf.PayloadChunker((int) '#', (int) (byte) 100, messageIdProvider45, chunkFactory46);
        java.net.InetAddress inetAddress49 = null;
        me.moocar.logbackgelf.Transport transport50 = new me.moocar.logbackgelf.Transport((int) '4', inetAddress49);
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider53 = null;
        byte[] byteArray55 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory57 = new me.moocar.logbackgelf.ChunkFactory(byteArray55, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker58 = new me.moocar.logbackgelf.PayloadChunker((int) (byte) -1, 10, messageIdProvider53, chunkFactory57);
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler62 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler62.setUseThreadName(true);
        java.util.logging.LogRecord logRecord65 = null;
        graylog2Handler62.publish(logRecord65);
        java.util.Map<java.lang.String, java.lang.String> strMap67 = graylog2Handler62.getStaticAdditionalFields();
        java.util.logging.Formatter formatter70 = null;
        java.util.logging.Formatter formatter71 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter72 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("0.9.6", false, true, strMap67, 1, "", formatter70, formatter71);
        me.moocar.logbackgelf.Zipper zipper73 = null;
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor75 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport50, payloadChunker58, gelfConverter72, zipper73, 255);
        me.moocar.logbackgelf.Zipper zipper76 = new me.moocar.logbackgelf.Zipper();
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor78 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport14, payloadChunker47, gelfConverter72, zipper76, (int) (byte) -1);
        me.moocar.logbackgelf.Zipper zipper79 = new me.moocar.logbackgelf.Zipper();
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor81 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport3, payloadChunker11, gelfConverter72, zipper79, (int) (short) 0);
        java.util.logging.LogRecord logRecord82 = null;
        // The following exception was thrown during execution in test generation
        try {
            appenderExecutor81.append(logRecord82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Error creating JSON message");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inetAddress2);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100]");
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[100]");
        org.junit.Assert.assertNotNull(strMap67);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        java.net.InetAddress inetAddress2 = me.moocar.logbackgelf.util.InternetUtils.getInetAddress("");
        me.moocar.logbackgelf.Transport transport3 = new me.moocar.logbackgelf.Transport(1, inetAddress2);
        byte[] byteArray5 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory7 = new me.moocar.logbackgelf.ChunkFactory(byteArray5, false);
        byte[] byteArray9 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory11 = new me.moocar.logbackgelf.ChunkFactory(byteArray9, true);
        byte[] byteArray15 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory17 = new me.moocar.logbackgelf.ChunkFactory(byteArray15, true);
        byte[] byteArray18 = chunkFactory7.create(byteArray9, (byte) 10, (byte) 10, byteArray15);
        byte[] byteArray20 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory22 = new me.moocar.logbackgelf.ChunkFactory(byteArray20, true);
        byte[] byteArray24 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory26 = new me.moocar.logbackgelf.ChunkFactory(byteArray24, false);
        byte[] byteArray28 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory30 = new me.moocar.logbackgelf.ChunkFactory(byteArray28, true);
        byte[] byteArray34 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory36 = new me.moocar.logbackgelf.ChunkFactory(byteArray34, true);
        byte[] byteArray37 = chunkFactory26.create(byteArray28, (byte) 10, (byte) 10, byteArray34);
        byte[] byteArray39 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory41 = new me.moocar.logbackgelf.ChunkFactory(byteArray39, false);
        byte[] byteArray43 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory45 = new me.moocar.logbackgelf.ChunkFactory(byteArray43, true);
        byte[] byteArray49 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory51 = new me.moocar.logbackgelf.ChunkFactory(byteArray49, true);
        byte[] byteArray52 = chunkFactory41.create(byteArray43, (byte) 10, (byte) 10, byteArray49);
        byte[][] byteArray53 = new byte[][] { byteArray15, byteArray20, byteArray34, byteArray49 };
        java.util.ArrayList<byte[]> byteArrayList54 = new java.util.ArrayList<byte[]>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<byte[]>) byteArrayList54, byteArray53);
        transport3.send((java.util.List<byte[]>) byteArrayList54);
        byte[] byteArray57 = null;
        // The following exception was thrown during execution in test generation
        try {
            transport3.send(byteArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inetAddress2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100, 100, 10, 10, 100]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[100]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[100]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[100]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[100, 100, 10, 10, 100]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[100]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[100]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[100]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[100, 100, 10, 10, 100]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.close();
        graylog2Handler0.setFacility("GELF");
        java.util.logging.ErrorManager errorManager8 = graylog2Handler0.getErrorManager();
        int int9 = graylog2Handler0.getGraylog2ServerPort();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12201 + "'", int9 == 12201);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        int int1 = graylog2Handler0.getShortMessageLength();
        java.lang.String str2 = graylog2Handler0.getShortMessagePattern();
        graylog2Handler0.setShortMessagePattern("Hengchens-MBP.attlocal.net");
        graylog2Handler0.setFacility("5");
        graylog2Handler0.setGraylog2ServerHost("7");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'", int1 == 255);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.net.InetAddress inetAddress1 = null;
        me.moocar.logbackgelf.Transport transport2 = new me.moocar.logbackgelf.Transport((int) '4', inetAddress1);
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider5 = null;
        byte[] byteArray7 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory9 = new me.moocar.logbackgelf.ChunkFactory(byteArray7, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker10 = new me.moocar.logbackgelf.PayloadChunker((int) (byte) -1, 10, messageIdProvider5, chunkFactory9);
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler14 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler14.setUseThreadName(true);
        java.util.logging.LogRecord logRecord17 = null;
        graylog2Handler14.publish(logRecord17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = graylog2Handler14.getStaticAdditionalFields();
        java.util.logging.Formatter formatter22 = null;
        java.util.logging.Formatter formatter23 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter24 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("0.9.6", false, true, strMap19, 1, "", formatter22, formatter23);
        me.moocar.logbackgelf.Zipper zipper25 = null;
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor27 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport2, payloadChunker10, gelfConverter24, zipper25, 255);
        java.util.logging.LogRecord logRecord28 = null;
        // The following exception was thrown during execution in test generation
        try {
            appenderExecutor27.append(logRecord28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Error creating JSON message");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100]");
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.close();
        graylog2Handler0.setFacility("GELF");
        java.util.logging.ErrorManager errorManager8 = graylog2Handler0.getErrorManager();
        java.util.logging.LogRecord logRecord9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = graylog2Handler0.isLoggable(logRecord9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(errorManager8);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        graylog2Handler0.setChunkThreshold((int) (short) -1);
        java.util.logging.LogRecord logRecord4 = null;
        graylog2Handler0.publish(logRecord4);
        java.lang.String str6 = graylog2Handler0.getGraylog2ServerVersion();
        java.lang.String str7 = graylog2Handler0.getEncoding();
        graylog2Handler0.close();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.9.6" + "'", str6, "0.9.6");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setShortMessagePattern("0.9.6");
        java.lang.String str6 = graylog2Handler0.getGraylog2ServerVersion();
        java.lang.String str7 = graylog2Handler0.getGraylog2ServerHost();
        boolean boolean8 = graylog2Handler0.isUseLoggerName();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler9 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler9.setUseThreadName(true);
        java.lang.String str12 = graylog2Handler9.getGraylog2ServerHost();
        boolean boolean13 = graylog2Handler9.isUseLoggerName();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler14 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler14.setUseThreadName(true);
        java.lang.String str17 = graylog2Handler14.getHostName();
        graylog2Handler14.setShortMessagePattern("0.9.6");
        java.util.logging.ErrorManager errorManager20 = graylog2Handler14.getErrorManager();
        graylog2Handler9.setErrorManager(errorManager20);
        graylog2Handler0.setErrorManager(errorManager20);
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setStaticAdditionalFieldsProperties("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: staticAdditionalField must be of the format key:value, where key is the additional field key (therefore should have a leading underscore), and value is a static string. e.g. _node_name:www013");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.9.6" + "'", str6, "0.9.6");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "localhost" + "'", str7, "localhost");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "localhost" + "'", str12, "localhost");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(errorManager20);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        java.security.MessageDigest messageDigest5 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider7 = new me.moocar.logbackgelf.MessageIdProvider(100, messageDigest5, "hi!");
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider10 = null;
        byte[] byteArray12 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory14 = new me.moocar.logbackgelf.ChunkFactory(byteArray12, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker15 = new me.moocar.logbackgelf.PayloadChunker(0, (int) 'a', messageIdProvider10, chunkFactory14);
        me.moocar.logbackgelf.PayloadChunker payloadChunker16 = new me.moocar.logbackgelf.PayloadChunker((int) '4', 1, messageIdProvider7, chunkFactory14);
        byte[] byteArray18 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory20 = new me.moocar.logbackgelf.ChunkFactory(byteArray18, false);
        me.moocar.logbackgelf.PayloadChunker payloadChunker21 = new me.moocar.logbackgelf.PayloadChunker(255, (int) (byte) 100, messageIdProvider7, chunkFactory20);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray22 = messageIdProvider7.get();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100]");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        es.arcadiaconsulting.graylog2.jboss.SyslogLevel syslogLevel0 = es.arcadiaconsulting.graylog2.jboss.SyslogLevel.ALERT_SEVERITY;
        int int1 = syslogLevel0.getNumericValue();
        org.junit.Assert.assertTrue("'" + syslogLevel0 + "' != '" + es.arcadiaconsulting.graylog2.jboss.SyslogLevel.ALERT_SEVERITY + "'", syslogLevel0.equals(es.arcadiaconsulting.graylog2.jboss.SyslogLevel.ALERT_SEVERITY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.close();
        boolean boolean6 = graylog2Handler0.isIncludeFullMDC();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler7 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler7.setUseThreadName(true);
        java.lang.String str10 = graylog2Handler7.getHostName();
        java.lang.String str11 = graylog2Handler7.getGraylog2ServerHost();
        graylog2Handler7.close();
        graylog2Handler7.setFacility("GELF");
        java.util.logging.ErrorManager errorManager15 = graylog2Handler7.getErrorManager();
        graylog2Handler0.setErrorManager(errorManager15);
        graylog2Handler0.setGraylog2ServerHost("Hengchens-MBP.attlocal.net");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "localhost" + "'", str11, "localhost");
        org.junit.Assert.assertNotNull(errorManager15);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        java.security.MessageDigest messageDigest3 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider5 = new me.moocar.logbackgelf.MessageIdProvider((int) (short) 0, messageDigest3, "hi!");
        me.moocar.logbackgelf.ChunkFactory chunkFactory6 = null;
        me.moocar.logbackgelf.PayloadChunker payloadChunker7 = new me.moocar.logbackgelf.PayloadChunker((-1), 10, messageIdProvider5, chunkFactory6);
        byte[] byteArray9 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory11 = new me.moocar.logbackgelf.ChunkFactory(byteArray9, false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<byte[]> byteArrayList12 = payloadChunker7.chunkIt(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100]");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler1 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler1.setUseThreadName(true);
        java.lang.String str4 = graylog2Handler1.getHostName();
        java.lang.String str5 = graylog2Handler1.getGraylog2ServerHost();
        graylog2Handler1.close();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = graylog2Handler1.getStaticAdditionalFields();
        graylog2Handler0.setStaticAdditionalFields(strMap7);
        graylog2Handler0.setFacility("5");
        graylog2Handler0.setUseLoggerName(true);
        java.lang.String str13 = graylog2Handler0.getGraylog2ServerHost();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "localhost" + "'", str5, "localhost");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "localhost" + "'", str13, "localhost");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.lang.String str2 = graylog2Handler0.getEncoding();
        int int3 = graylog2Handler0.getShortMessageLength();
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setStaticAdditionalFieldsProperties("0.9.6");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: staticAdditionalField must be of the format key:value, where key is the additional field key (therefore should have a leading underscore), and value is a static string. e.g. _node_name:www013");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 255 + "'", int3 == 255);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        int int1 = graylog2Handler0.getShortMessageLength();
        java.lang.String str2 = graylog2Handler0.getShortMessagePattern();
        java.util.logging.Level level3 = graylog2Handler0.getLevel();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'", int1 == 255);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(level3);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.Level level3 = graylog2Handler0.getLevel();
        graylog2Handler0.close();
        java.lang.String str5 = graylog2Handler0.getShortMessagePattern();
        org.junit.Assert.assertNotNull(level3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setShortMessagePattern("0.9.6");
        java.util.logging.Level level6 = graylog2Handler0.getLevel();
        graylog2Handler0.setIncludeFullMDC(true);
        graylog2Handler0.setGraylog2ServerPort(1000);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(level6);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setShortMessagePattern("0.9.6");
        java.lang.String str6 = graylog2Handler0.getGraylog2ServerVersion();
        java.lang.String str7 = graylog2Handler0.getGraylog2ServerHost();
        java.util.logging.LogRecord logRecord8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = graylog2Handler0.isLoggable(logRecord8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.9.6" + "'", str6, "0.9.6");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "localhost" + "'", str7, "localhost");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        boolean boolean7 = graylog2Handler0.isIncludeFullMDC();
        graylog2Handler0.setGraylog2ServerPort(10);
        graylog2Handler0.setHostName("Hengchens-MBP.attlocal.net");
        int int12 = graylog2Handler0.getChunkThreshold();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        java.net.InetAddress inetAddress2 = me.moocar.logbackgelf.util.InternetUtils.getInetAddress("GELF");
        me.moocar.logbackgelf.Transport transport3 = new me.moocar.logbackgelf.Transport(0, inetAddress2);
        java.security.MessageDigest messageDigest7 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider9 = new me.moocar.logbackgelf.MessageIdProvider((int) (short) 0, messageDigest7, "hi!");
        me.moocar.logbackgelf.ChunkFactory chunkFactory10 = null;
        me.moocar.logbackgelf.PayloadChunker payloadChunker11 = new me.moocar.logbackgelf.PayloadChunker((-1), 10, messageIdProvider9, chunkFactory10);
        java.net.InetAddress inetAddress13 = null;
        me.moocar.logbackgelf.Transport transport14 = new me.moocar.logbackgelf.Transport((int) '4', inetAddress13);
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider17 = null;
        byte[] byteArray19 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory21 = new me.moocar.logbackgelf.ChunkFactory(byteArray19, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker22 = new me.moocar.logbackgelf.PayloadChunker((int) (byte) -1, 10, messageIdProvider17, chunkFactory21);
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler26 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler26.setUseThreadName(true);
        java.util.logging.LogRecord logRecord29 = null;
        graylog2Handler26.publish(logRecord29);
        java.util.Map<java.lang.String, java.lang.String> strMap31 = graylog2Handler26.getStaticAdditionalFields();
        java.util.logging.Formatter formatter34 = null;
        java.util.logging.Formatter formatter35 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter36 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("0.9.6", false, true, strMap31, 1, "", formatter34, formatter35);
        me.moocar.logbackgelf.Zipper zipper37 = null;
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor39 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport14, payloadChunker22, gelfConverter36, zipper37, 255);
        java.security.MessageDigest messageDigest43 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider45 = new me.moocar.logbackgelf.MessageIdProvider(100, messageDigest43, "hi!");
        me.moocar.logbackgelf.ChunkFactory chunkFactory46 = null;
        me.moocar.logbackgelf.PayloadChunker payloadChunker47 = new me.moocar.logbackgelf.PayloadChunker((int) '#', (int) (byte) 100, messageIdProvider45, chunkFactory46);
        java.net.InetAddress inetAddress49 = null;
        me.moocar.logbackgelf.Transport transport50 = new me.moocar.logbackgelf.Transport((int) '4', inetAddress49);
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider53 = null;
        byte[] byteArray55 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory57 = new me.moocar.logbackgelf.ChunkFactory(byteArray55, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker58 = new me.moocar.logbackgelf.PayloadChunker((int) (byte) -1, 10, messageIdProvider53, chunkFactory57);
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler62 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler62.setUseThreadName(true);
        java.util.logging.LogRecord logRecord65 = null;
        graylog2Handler62.publish(logRecord65);
        java.util.Map<java.lang.String, java.lang.String> strMap67 = graylog2Handler62.getStaticAdditionalFields();
        java.util.logging.Formatter formatter70 = null;
        java.util.logging.Formatter formatter71 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter72 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("0.9.6", false, true, strMap67, 1, "", formatter70, formatter71);
        me.moocar.logbackgelf.Zipper zipper73 = null;
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor75 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport50, payloadChunker58, gelfConverter72, zipper73, 255);
        me.moocar.logbackgelf.Zipper zipper76 = new me.moocar.logbackgelf.Zipper();
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor78 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport14, payloadChunker47, gelfConverter72, zipper76, (int) (byte) -1);
        me.moocar.logbackgelf.Zipper zipper79 = new me.moocar.logbackgelf.Zipper();
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor81 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport3, payloadChunker11, gelfConverter72, zipper79, (int) (short) 0);
        byte[] byteArray83 = zipper79.zip("hi!");
        me.moocar.logbackgelf.ChunkFactory chunkFactory85 = new me.moocar.logbackgelf.ChunkFactory(byteArray83, false);
        org.junit.Assert.assertNotNull(inetAddress2);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100]");
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[100]");
        org.junit.Assert.assertNotNull(strMap67);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -53, -56, 84, 4, 0, 58, -125, -45, 65, 3, 0, 0, 0]");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.util.logging.Level level7 = graylog2Handler0.getLevel();
        java.lang.String str8 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setChunkThreshold((int) '4');
        java.lang.String str11 = graylog2Handler0.getHostName();
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setStaticAdditionalFieldsProperties("6");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: staticAdditionalField must be of the format key:value, where key is the additional field key (therefore should have a leading underscore), and value is a static string. e.g. _node_name:www013");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "localhost" + "'", str8, "localhost");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.LogRecord logRecord3 = null;
        graylog2Handler0.publish(logRecord3);
        java.lang.String str5 = graylog2Handler0.getGraylog2ServerVersion();
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setStaticAdditionalFieldsProperties("0.9.6");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: staticAdditionalField must be of the format key:value, where key is the additional field key (therefore should have a leading underscore), and value is a static string. e.g. _node_name:www013");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.9.6" + "'", str5, "0.9.6");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        boolean boolean7 = graylog2Handler0.isIncludeFullMDC();
        graylog2Handler0.setGraylog2ServerPort(10);
        java.util.logging.ErrorManager errorManager10 = graylog2Handler0.getErrorManager();
        graylog2Handler0.setShortMessageLength(0);
        java.util.logging.Filter filter13 = null;
        graylog2Handler0.setFilter(filter13);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorManager10);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.LogRecord logRecord3 = null;
        graylog2Handler0.publish(logRecord3);
        boolean boolean5 = graylog2Handler0.isIncludeFullMDC();
        int int6 = graylog2Handler0.getGraylog2ServerPort();
        java.util.logging.LogRecord logRecord7 = null;
        graylog2Handler0.publish(logRecord7);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12201 + "'", int6 == 12201);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        me.moocar.logbackgelf.Zipper zipper0 = new me.moocar.logbackgelf.Zipper();
        byte[] byteArray2 = zipper0.zip("localhost");
        byte[] byteArray4 = zipper0.zip("5");
        byte[] byteArray6 = zipper0.zip("");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -53, -55, 79, 78, -52, -55, -56, 47, 46, 1, 0, 35, 8, -62, -98, 9, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[31, -117, 8, 0, 0, 0, 0, 0, 0, 0, 51, 5, 0, -82, 43, -79, -124, 1, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[31, -117, 8, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler3 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler3.setUseThreadName(true);
        java.util.logging.LogRecord logRecord6 = null;
        graylog2Handler3.publish(logRecord6);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = graylog2Handler3.getStaticAdditionalFields();
        java.util.logging.Formatter formatter11 = null;
        java.util.logging.Formatter formatter12 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter13 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("", false, false, strMap8, (int) (byte) 0, "", formatter11, formatter12);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.util.logging.Level level7 = graylog2Handler0.getLevel();
        java.lang.String str8 = graylog2Handler0.getGraylog2ServerVersion();
        int int9 = graylog2Handler0.getChunkThreshold();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.9.6" + "'", str8, "0.9.6");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        es.arcadiaconsulting.graylog2.jboss.SyslogLevel syslogLevel0 = es.arcadiaconsulting.graylog2.jboss.SyslogLevel.NOTICE_SEVERITY;
        java.lang.String str1 = syslogLevel0.getNumericValueAsString();
        java.lang.String str2 = syslogLevel0.getNumericValueAsString();
        java.lang.String str3 = syslogLevel0.getNumericValueAsString();
        int int4 = syslogLevel0.getNumericValue();
        org.junit.Assert.assertTrue("'" + syslogLevel0 + "' != '" + es.arcadiaconsulting.graylog2.jboss.SyslogLevel.NOTICE_SEVERITY + "'", syslogLevel0.equals(es.arcadiaconsulting.graylog2.jboss.SyslogLevel.NOTICE_SEVERITY));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5" + "'", str1, "5");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5" + "'", str2, "5");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5" + "'", str3, "5");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.LogRecord logRecord3 = null;
        graylog2Handler0.publish(logRecord3);
        java.util.logging.Formatter formatter5 = graylog2Handler0.getFormatter();
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.addStaticAdditionalField("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: staticAdditionalField must be of the format key:value, where key is the additional field key (therefore should have a leading underscore), and value is a static string. e.g. _node_name:www013");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatter5);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.util.logging.Formatter formatter2 = graylog2Handler0.getFormatter();
        int int3 = graylog2Handler0.getGraylog2ServerPort();
        java.util.logging.LogRecord logRecord4 = null;
        graylog2Handler0.publish(logRecord4);
        java.util.logging.Formatter formatter6 = graylog2Handler0.getFormatter();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(formatter2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12201 + "'", int3 == 12201);
        org.junit.Assert.assertNull(formatter6);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.util.logging.Formatter formatter2 = graylog2Handler0.getFormatter();
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setHostName("hi!");
        graylog2Handler0.setGraylog2ServerPort((int) (byte) 0);
        graylog2Handler0.setHostName("localhost");
        graylog2Handler0.close();
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.addStaticAdditionalField("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: staticAdditionalField must be of the format key:value, where key is the additional field key (therefore should have a leading underscore), and value is a static string. e.g. _node_name:www013");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(formatter2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        java.net.InetAddress inetAddress3 = me.moocar.logbackgelf.util.InternetUtils.getInetAddress("");
        me.moocar.logbackgelf.Transport transport4 = new me.moocar.logbackgelf.Transport(1, inetAddress3);
        me.moocar.logbackgelf.Transport transport5 = new me.moocar.logbackgelf.Transport((int) (byte) -1, inetAddress3);
        java.net.InetAddress inetAddress8 = me.moocar.logbackgelf.util.InternetUtils.getInetAddress("");
        me.moocar.logbackgelf.Transport transport9 = new me.moocar.logbackgelf.Transport(1, inetAddress8);
        byte[] byteArray11 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory13 = new me.moocar.logbackgelf.ChunkFactory(byteArray11, false);
        byte[] byteArray15 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory17 = new me.moocar.logbackgelf.ChunkFactory(byteArray15, true);
        byte[] byteArray21 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory23 = new me.moocar.logbackgelf.ChunkFactory(byteArray21, true);
        byte[] byteArray24 = chunkFactory13.create(byteArray15, (byte) 10, (byte) 10, byteArray21);
        byte[] byteArray26 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory28 = new me.moocar.logbackgelf.ChunkFactory(byteArray26, true);
        byte[] byteArray30 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory32 = new me.moocar.logbackgelf.ChunkFactory(byteArray30, false);
        byte[] byteArray34 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory36 = new me.moocar.logbackgelf.ChunkFactory(byteArray34, true);
        byte[] byteArray40 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory42 = new me.moocar.logbackgelf.ChunkFactory(byteArray40, true);
        byte[] byteArray43 = chunkFactory32.create(byteArray34, (byte) 10, (byte) 10, byteArray40);
        byte[] byteArray45 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory47 = new me.moocar.logbackgelf.ChunkFactory(byteArray45, false);
        byte[] byteArray49 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory51 = new me.moocar.logbackgelf.ChunkFactory(byteArray49, true);
        byte[] byteArray55 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory57 = new me.moocar.logbackgelf.ChunkFactory(byteArray55, true);
        byte[] byteArray58 = chunkFactory47.create(byteArray49, (byte) 10, (byte) 10, byteArray55);
        byte[][] byteArray59 = new byte[][] { byteArray21, byteArray26, byteArray40, byteArray55 };
        java.util.ArrayList<byte[]> byteArrayList60 = new java.util.ArrayList<byte[]>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<byte[]>) byteArrayList60, byteArray59);
        transport9.send((java.util.List<byte[]>) byteArrayList60);
        // The following exception was thrown during execution in test generation
        try {
            transport5.send((java.util.List<byte[]>) byteArrayList60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inetAddress3);
        org.junit.Assert.assertNotNull(inetAddress8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[100, 100, 10, 10, 100]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[100]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[100]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[100]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[100, 100, 10, 10, 100]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[100]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[100]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[100]");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[100, 100, 10, 10, 100]");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.lang.String str7 = graylog2Handler0.getGraylog2ServerVersion();
        int int8 = graylog2Handler0.getChunkThreshold();
        java.lang.String str9 = graylog2Handler0.getGraylog2ServerVersion();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.9.6" + "'", str7, "0.9.6");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.9.6" + "'", str9, "0.9.6");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.lang.String str2 = graylog2Handler0.getEncoding();
        graylog2Handler0.setChunkThreshold((-1));
        graylog2Handler0.setGraylog2ServerPort((int) (short) 100);
        graylog2Handler0.setGraylog2ServerPort((int) (byte) 100);
        graylog2Handler0.setIncludeFullMDC(false);
        int int11 = graylog2Handler0.getGraylog2ServerPort();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        es.arcadiaconsulting.graylog2.jboss.SyslogLevel syslogLevel0 = es.arcadiaconsulting.graylog2.jboss.SyslogLevel.ALERT_SEVERITY;
        java.lang.String str1 = syslogLevel0.getNumericValueAsString();
        org.junit.Assert.assertTrue("'" + syslogLevel0 + "' != '" + es.arcadiaconsulting.graylog2.jboss.SyslogLevel.ALERT_SEVERITY + "'", syslogLevel0.equals(es.arcadiaconsulting.graylog2.jboss.SyslogLevel.ALERT_SEVERITY));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        es.arcadiaconsulting.graylog2.jboss.SyslogLevel syslogLevel0 = es.arcadiaconsulting.graylog2.jboss.SyslogLevel.INFO_SEVERITY;
        int int1 = syslogLevel0.getNumericValue();
        org.junit.Assert.assertTrue("'" + syslogLevel0 + "' != '" + es.arcadiaconsulting.graylog2.jboss.SyslogLevel.INFO_SEVERITY + "'", syslogLevel0.equals(es.arcadiaconsulting.graylog2.jboss.SyslogLevel.INFO_SEVERITY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setGraylog2ServerPort((int) (byte) 0);
        graylog2Handler0.flush();
        graylog2Handler0.setUseLoggerName(true);
        boolean boolean10 = graylog2Handler0.isUseThreadName();
        graylog2Handler0.setGraylog2ServerPort(0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        byte[] byteArray0 = null;
        me.moocar.logbackgelf.ChunkFactory chunkFactory2 = new me.moocar.logbackgelf.ChunkFactory(byteArray0, true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.lang.String str2 = graylog2Handler0.getEncoding();
        graylog2Handler0.setChunkThreshold((-1));
        graylog2Handler0.setGraylog2ServerPort((int) (short) 100);
        java.lang.String str7 = graylog2Handler0.getGraylog2ServerHost();
        java.lang.String str8 = graylog2Handler0.getGraylog2ServerHost();
        java.util.logging.Formatter formatter9 = graylog2Handler0.getFormatter();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "localhost" + "'", str7, "localhost");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "localhost" + "'", str8, "localhost");
        org.junit.Assert.assertNull(formatter9);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        java.net.InetAddress inetAddress1 = me.moocar.logbackgelf.util.InternetUtils.getInetAddress("localhost");
        org.junit.Assert.assertNotNull(inetAddress1);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.lang.String str7 = graylog2Handler0.getGraylog2ServerVersion();
        int int8 = graylog2Handler0.getChunkThreshold();
        boolean boolean9 = graylog2Handler0.isUseThreadName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.9.6" + "'", str7, "0.9.6");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.close();
        graylog2Handler0.setFacility("GELF");
        graylog2Handler0.setGraylog2ServerPort((-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.util.logging.Level level7 = graylog2Handler0.getLevel();
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setStaticAdditionalFieldsProperties("5");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: staticAdditionalField must be of the format key:value, where key is the additional field key (therefore should have a leading underscore), and value is a static string. e.g. _node_name:www013");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(level7);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.util.logging.Level level7 = graylog2Handler0.getLevel();
        java.lang.String str8 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setChunkThreshold((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setStaticAdditionalFieldsProperties("7");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: staticAdditionalField must be of the format key:value, where key is the additional field key (therefore should have a leading underscore), and value is a static string. e.g. _node_name:www013");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "localhost" + "'", str8, "localhost");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getGraylog2ServerHost();
        boolean boolean4 = graylog2Handler0.isUseLoggerName();
        graylog2Handler0.setGraylog2ServerPort(255);
        boolean boolean7 = graylog2Handler0.isIncludeFullMDC();
        graylog2Handler0.setIncludeFullMDC(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "localhost" + "'", str3, "localhost");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setGraylog2ServerPort((int) (byte) 0);
        graylog2Handler0.flush();
        graylog2Handler0.setUseLoggerName(true);
        boolean boolean10 = graylog2Handler0.isUseThreadName();
        java.util.logging.LogRecord logRecord11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = graylog2Handler0.isLoggable(logRecord11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        java.security.MessageDigest messageDigest3 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider5 = new me.moocar.logbackgelf.MessageIdProvider((int) (short) 0, messageDigest3, "hi!");
        me.moocar.logbackgelf.ChunkFactory chunkFactory6 = null;
        me.moocar.logbackgelf.PayloadChunker payloadChunker7 = new me.moocar.logbackgelf.PayloadChunker((-1), 10, messageIdProvider5, chunkFactory6);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<byte[]> byteArrayList11 = payloadChunker7.chunkIt(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 100]");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setShortMessagePattern("0.9.6");
        boolean boolean6 = graylog2Handler0.isUseLoggerName();
        graylog2Handler0.setUseLoggerName(false);
        int int9 = graylog2Handler0.getGraylog2ServerPort();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = graylog2Handler0.getStaticAdditionalFields();
        java.lang.String str11 = graylog2Handler0.getEncoding();
        graylog2Handler0.setShortMessagePattern("Hengchens-MBP.attlocal.net");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12201 + "'", int9 == 12201);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.util.logging.Formatter formatter2 = graylog2Handler0.getFormatter();
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setHostName("hi!");
        graylog2Handler0.setGraylog2ServerPort((int) (byte) 0);
        graylog2Handler0.setHostName("");
        graylog2Handler0.setUseThreadName(false);
        int int12 = graylog2Handler0.getGraylog2ServerPort();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.ErrorManager errorManager15 = graylog2Handler0.getErrorManager();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(formatter2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(errorManager15);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.close();
        graylog2Handler0.setGraylog2ServerPort(10);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.LogRecord logRecord3 = null;
        graylog2Handler0.publish(logRecord3);
        java.lang.String str5 = graylog2Handler0.getGraylog2ServerVersion();
        java.lang.String str6 = graylog2Handler0.getGraylog2ServerVersion();
        graylog2Handler0.flush();
        java.util.logging.ErrorManager errorManager8 = graylog2Handler0.getErrorManager();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.9.6" + "'", str5, "0.9.6");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.9.6" + "'", str6, "0.9.6");
        org.junit.Assert.assertNotNull(errorManager8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.LogRecord logRecord3 = null;
        graylog2Handler0.publish(logRecord3);
        boolean boolean5 = graylog2Handler0.isIncludeFullMDC();
        boolean boolean6 = graylog2Handler0.isUseLoggerName();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = graylog2Handler0.getStaticAdditionalFields();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler1 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler1.setUseThreadName(true);
        java.lang.String str4 = graylog2Handler1.getHostName();
        java.lang.String str5 = graylog2Handler1.getGraylog2ServerHost();
        graylog2Handler1.close();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = graylog2Handler1.getStaticAdditionalFields();
        graylog2Handler0.setStaticAdditionalFields(strMap7);
        graylog2Handler0.setFacility("5");
        graylog2Handler0.setUseLoggerName(true);
        graylog2Handler0.setIncludeFullMDC(true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "localhost" + "'", str5, "localhost");
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setUseLoggerName(false);
        graylog2Handler0.close();
        graylog2Handler0.setGraylog2ServerVersion("6");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        java.security.MessageDigest messageDigest5 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider7 = new me.moocar.logbackgelf.MessageIdProvider(100, messageDigest5, "hi!");
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider10 = null;
        byte[] byteArray12 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory14 = new me.moocar.logbackgelf.ChunkFactory(byteArray12, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker15 = new me.moocar.logbackgelf.PayloadChunker(0, (int) 'a', messageIdProvider10, chunkFactory14);
        me.moocar.logbackgelf.PayloadChunker payloadChunker16 = new me.moocar.logbackgelf.PayloadChunker((int) '4', 1, messageIdProvider7, chunkFactory14);
        java.security.MessageDigest messageDigest20 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider22 = new me.moocar.logbackgelf.MessageIdProvider(100, messageDigest20, "hi!");
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider25 = null;
        byte[] byteArray27 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory29 = new me.moocar.logbackgelf.ChunkFactory(byteArray27, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker30 = new me.moocar.logbackgelf.PayloadChunker(0, (int) 'a', messageIdProvider25, chunkFactory29);
        me.moocar.logbackgelf.PayloadChunker payloadChunker31 = new me.moocar.logbackgelf.PayloadChunker((int) '4', 1, messageIdProvider22, chunkFactory29);
        me.moocar.logbackgelf.PayloadChunker payloadChunker32 = new me.moocar.logbackgelf.PayloadChunker((int) (short) 1, 255, messageIdProvider7, chunkFactory29);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[100]");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        java.net.InetAddress inetAddress1 = me.moocar.logbackgelf.util.InternetUtils.getInetAddress("1");
        org.junit.Assert.assertNotNull(inetAddress1);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.util.logging.Level level7 = graylog2Handler0.getLevel();
        java.util.logging.Level level8 = graylog2Handler0.getLevel();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler9 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler9.setUseThreadName(true);
        java.lang.String str12 = graylog2Handler9.getHostName();
        graylog2Handler9.setShortMessagePattern("0.9.6");
        java.util.logging.ErrorManager errorManager15 = graylog2Handler9.getErrorManager();
        graylog2Handler0.setErrorManager(errorManager15);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertNotNull(level8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(errorManager15);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.lang.String str2 = graylog2Handler0.getEncoding();
        graylog2Handler0.setChunkThreshold((-1));
        graylog2Handler0.setGraylog2ServerVersion("GELF");
        graylog2Handler0.flush();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        java.net.InetAddress inetAddress2 = me.moocar.logbackgelf.util.InternetUtils.getInetAddress("");
        me.moocar.logbackgelf.Transport transport3 = new me.moocar.logbackgelf.Transport(1, inetAddress2);
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider6 = null;
        byte[] byteArray8 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory10 = new me.moocar.logbackgelf.ChunkFactory(byteArray8, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker11 = new me.moocar.logbackgelf.PayloadChunker(0, (int) 'a', messageIdProvider6, chunkFactory10);
        java.net.InetAddress inetAddress13 = null;
        me.moocar.logbackgelf.Transport transport14 = new me.moocar.logbackgelf.Transport((int) '4', inetAddress13);
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider17 = null;
        byte[] byteArray19 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory21 = new me.moocar.logbackgelf.ChunkFactory(byteArray19, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker22 = new me.moocar.logbackgelf.PayloadChunker((int) (byte) -1, 10, messageIdProvider17, chunkFactory21);
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler26 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler26.setUseThreadName(true);
        java.util.logging.LogRecord logRecord29 = null;
        graylog2Handler26.publish(logRecord29);
        java.util.Map<java.lang.String, java.lang.String> strMap31 = graylog2Handler26.getStaticAdditionalFields();
        java.util.logging.Formatter formatter34 = null;
        java.util.logging.Formatter formatter35 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter36 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("0.9.6", false, true, strMap31, 1, "", formatter34, formatter35);
        me.moocar.logbackgelf.Zipper zipper37 = null;
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor39 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport14, payloadChunker22, gelfConverter36, zipper37, 255);
        java.security.MessageDigest messageDigest43 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider45 = new me.moocar.logbackgelf.MessageIdProvider(100, messageDigest43, "hi!");
        me.moocar.logbackgelf.ChunkFactory chunkFactory46 = null;
        me.moocar.logbackgelf.PayloadChunker payloadChunker47 = new me.moocar.logbackgelf.PayloadChunker((int) '#', (int) (byte) 100, messageIdProvider45, chunkFactory46);
        java.net.InetAddress inetAddress49 = null;
        me.moocar.logbackgelf.Transport transport50 = new me.moocar.logbackgelf.Transport((int) '4', inetAddress49);
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider53 = null;
        byte[] byteArray55 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory57 = new me.moocar.logbackgelf.ChunkFactory(byteArray55, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker58 = new me.moocar.logbackgelf.PayloadChunker((int) (byte) -1, 10, messageIdProvider53, chunkFactory57);
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler62 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler62.setUseThreadName(true);
        java.util.logging.LogRecord logRecord65 = null;
        graylog2Handler62.publish(logRecord65);
        java.util.Map<java.lang.String, java.lang.String> strMap67 = graylog2Handler62.getStaticAdditionalFields();
        java.util.logging.Formatter formatter70 = null;
        java.util.logging.Formatter formatter71 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter72 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("0.9.6", false, true, strMap67, 1, "", formatter70, formatter71);
        me.moocar.logbackgelf.Zipper zipper73 = null;
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor75 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport50, payloadChunker58, gelfConverter72, zipper73, 255);
        me.moocar.logbackgelf.Zipper zipper76 = new me.moocar.logbackgelf.Zipper();
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor78 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport14, payloadChunker47, gelfConverter72, zipper76, (int) (byte) -1);
        me.moocar.logbackgelf.Zipper zipper79 = new me.moocar.logbackgelf.Zipper();
        es.arcadiaconsulting.graylog2.jboss.AppenderExecutor appenderExecutor81 = new es.arcadiaconsulting.graylog2.jboss.AppenderExecutor(transport3, payloadChunker11, gelfConverter72, zipper79, (int) (byte) 10);
        java.util.logging.LogRecord logRecord82 = null;
        // The following exception was thrown during execution in test generation
        try {
            appenderExecutor81.append(logRecord82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Error creating JSON message");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inetAddress2);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100]");
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[100]");
        org.junit.Assert.assertNotNull(strMap67);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setShortMessagePattern("0.9.6");
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.addStaticAdditionalField("6");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: staticAdditionalField must be of the format key:value, where key is the additional field key (therefore should have a leading underscore), and value is a static string. e.g. _node_name:www013");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.Level level3 = graylog2Handler0.getLevel();
        graylog2Handler0.setGraylog2ServerPort((int) (short) 100);
        org.junit.Assert.assertNotNull(level3);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        es.arcadiaconsulting.graylog2.jboss.SyslogLevel syslogLevel0 = es.arcadiaconsulting.graylog2.jboss.SyslogLevel.DEBUG_SEVERITY;
        java.lang.String str1 = syslogLevel0.getNumericValueAsString();
        int int2 = syslogLevel0.getNumericValue();
        org.junit.Assert.assertTrue("'" + syslogLevel0 + "' != '" + es.arcadiaconsulting.graylog2.jboss.SyslogLevel.DEBUG_SEVERITY + "'", syslogLevel0.equals(es.arcadiaconsulting.graylog2.jboss.SyslogLevel.DEBUG_SEVERITY));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "7" + "'", str1, "7");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        graylog2Handler0.setChunkThreshold((int) (short) -1);
        java.lang.String str4 = graylog2Handler0.getHostName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.lang.String str2 = graylog2Handler0.getEncoding();
        graylog2Handler0.setChunkThreshold((-1));
        graylog2Handler0.setGraylog2ServerPort((int) (short) 100);
        java.lang.String str7 = graylog2Handler0.getGraylog2ServerHost();
        java.lang.String str8 = graylog2Handler0.getGraylog2ServerHost();
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.addStaticAdditionalField("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: staticAdditionalField must be of the format key:value, where key is the additional field key (therefore should have a leading underscore), and value is a static string. e.g. _node_name:www013");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "localhost" + "'", str7, "localhost");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "localhost" + "'", str8, "localhost");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.util.logging.Formatter formatter2 = graylog2Handler0.getFormatter();
        java.lang.String str3 = graylog2Handler0.getShortMessagePattern();
        graylog2Handler0.close();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(formatter2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.util.logging.Formatter formatter2 = graylog2Handler0.getFormatter();
        int int3 = graylog2Handler0.getGraylog2ServerPort();
        java.util.logging.LogRecord logRecord4 = null;
        graylog2Handler0.publish(logRecord4);
        java.util.logging.Level level6 = graylog2Handler0.getLevel();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(formatter2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12201 + "'", int3 == 12201);
        org.junit.Assert.assertNotNull(level6);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.lang.String str2 = graylog2Handler0.getEncoding();
        graylog2Handler0.setChunkThreshold((-1));
        graylog2Handler0.setGraylog2ServerPort((int) (short) 100);
        graylog2Handler0.setGraylog2ServerPort((int) (byte) 100);
        graylog2Handler0.setFacility("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.util.logging.Formatter formatter2 = graylog2Handler0.getFormatter();
        java.lang.String str3 = graylog2Handler0.getShortMessagePattern();
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setStaticAdditionalFieldsProperties("GELF");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: staticAdditionalField must be of the format key:value, where key is the additional field key (therefore should have a leading underscore), and value is a static string. e.g. _node_name:www013");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(formatter2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setShortMessagePattern("0.9.6");
        java.util.logging.ErrorManager errorManager6 = graylog2Handler0.getErrorManager();
        graylog2Handler0.setFacility("5");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.lang.String str2 = graylog2Handler0.getEncoding();
        graylog2Handler0.close();
        java.lang.String str4 = graylog2Handler0.getShortMessagePattern();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        java.security.MessageDigest messageDigest1 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider3 = new me.moocar.logbackgelf.MessageIdProvider((int) ' ', messageDigest1, "6");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        java.security.MessageDigest messageDigest3 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider5 = new me.moocar.logbackgelf.MessageIdProvider((int) (byte) 1, messageDigest3, "hi!");
        me.moocar.logbackgelf.Zipper zipper6 = new me.moocar.logbackgelf.Zipper();
        byte[] byteArray8 = zipper6.zip("localhost");
        byte[] byteArray10 = zipper6.zip("5");
        byte[] byteArray12 = zipper6.zip("0.9.6");
        me.moocar.logbackgelf.ChunkFactory chunkFactory14 = new me.moocar.logbackgelf.ChunkFactory(byteArray12, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker15 = new me.moocar.logbackgelf.PayloadChunker((int) (short) -1, 12201, messageIdProvider5, chunkFactory14);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -53, -55, 79, 78, -52, -55, -56, 47, 46, 1, 0, 35, 8, -62, -98, 9, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[31, -117, 8, 0, 0, 0, 0, 0, 0, 0, 51, 5, 0, -82, 43, -79, -124, 1, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[31, -117, 8, 0, 0, 0, 0, 0, 0, 0, 51, -48, -77, -44, 51, 3, 0, 60, -43, -23, -56, 5, 0, 0, 0]");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.LogRecord logRecord3 = null;
        graylog2Handler0.publish(logRecord3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = graylog2Handler0.getStaticAdditionalFields();
        java.util.logging.Filter filter6 = null;
        graylog2Handler0.setFilter(filter6);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.lang.String str2 = graylog2Handler0.getEncoding();
        graylog2Handler0.setChunkThreshold((-1));
        graylog2Handler0.setGraylog2ServerVersion("GELF");
        java.lang.String str7 = graylog2Handler0.getHostName();
        java.util.logging.ErrorManager errorManager8 = graylog2Handler0.getErrorManager();
        java.util.logging.LogRecord logRecord9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = graylog2Handler0.isLoggable(logRecord9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(errorManager8);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.util.logging.Formatter formatter2 = graylog2Handler0.getFormatter();
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setHostName("hi!");
        java.util.logging.Level level6 = graylog2Handler0.getLevel();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(formatter2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(level6);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.util.logging.Formatter formatter2 = graylog2Handler0.getFormatter();
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setHostName("hi!");
        boolean boolean6 = graylog2Handler0.isUseThreadName();
        graylog2Handler0.setIncludeFullMDC(true);
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler9 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler9.setUseThreadName(true);
        java.util.logging.Level level12 = graylog2Handler9.getLevel();
        graylog2Handler0.setLevel(level12);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(formatter2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(level12);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        java.util.logging.Formatter formatter6 = null;
        java.util.logging.Formatter formatter7 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter8 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("hi!", true, false, strMap3, (int) '#', "Hengchens-MBP.attlocal.net", formatter6, formatter7);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.LogRecord logRecord3 = null;
        graylog2Handler0.publish(logRecord3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = graylog2Handler0.getStaticAdditionalFields();
        graylog2Handler0.setShortMessagePattern("hi!");
        java.lang.String str8 = graylog2Handler0.getShortMessagePattern();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(100);
        java.lang.String str6 = graylog2Handler0.getShortMessagePattern();
        int int7 = graylog2Handler0.getShortMessageLength();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "localhost" + "'", str3, "localhost");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.close();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = graylog2Handler0.getStaticAdditionalFields();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.Filter filter9 = graylog2Handler0.getFilter();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler10 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler10.setUseThreadName(true);
        java.util.logging.LogRecord logRecord13 = null;
        graylog2Handler10.publish(logRecord13);
        boolean boolean15 = graylog2Handler10.isIncludeFullMDC();
        int int16 = graylog2Handler10.getGraylog2ServerPort();
        graylog2Handler10.setHostName("");
        java.util.logging.ErrorManager errorManager19 = graylog2Handler10.getErrorManager();
        graylog2Handler0.setErrorManager(errorManager19);
        graylog2Handler0.setGraylog2ServerVersion("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(filter9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12201 + "'", int16 == 12201);
        org.junit.Assert.assertNotNull(errorManager19);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.LogRecord logRecord3 = null;
        graylog2Handler0.publish(logRecord3);
        java.lang.String str5 = graylog2Handler0.getGraylog2ServerVersion();
        java.util.logging.Level level6 = graylog2Handler0.getLevel();
        java.lang.String str7 = graylog2Handler0.getHostName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.9.6" + "'", str5, "0.9.6");
        org.junit.Assert.assertNotNull(level6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hengchens-MBP.attlocal.net" + "'", str7, "Hengchens-MBP.attlocal.net");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        graylog2Handler0.setChunkThreshold((int) (short) -1);
        java.util.logging.LogRecord logRecord4 = null;
        graylog2Handler0.publish(logRecord4);
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler6 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str7 = graylog2Handler6.getHostName();
        java.util.logging.Formatter formatter8 = graylog2Handler6.getFormatter();
        java.lang.String str9 = graylog2Handler6.getHostName();
        graylog2Handler6.setHostName("hi!");
        graylog2Handler6.setGraylog2ServerPort((int) (byte) 0);
        graylog2Handler6.setHostName("");
        graylog2Handler6.setUseThreadName(false);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = graylog2Handler6.getStaticAdditionalFields();
        graylog2Handler0.setStaticAdditionalFields(strMap18);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(formatter8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.lang.String str2 = graylog2Handler0.getEncoding();
        graylog2Handler0.setChunkThreshold((-1));
        java.lang.String str5 = graylog2Handler0.getHostName();
        boolean boolean6 = graylog2Handler0.isIncludeFullMDC();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.LogRecord logRecord3 = null;
        graylog2Handler0.publish(logRecord3);
        java.lang.String str5 = graylog2Handler0.getGraylog2ServerVersion();
        java.util.logging.LogRecord logRecord6 = null;
        graylog2Handler0.publish(logRecord6);
        graylog2Handler0.setChunkThreshold((int) (short) -1);
        java.lang.String str10 = graylog2Handler0.getGraylog2ServerVersion();
        int int11 = graylog2Handler0.getChunkThreshold();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.9.6" + "'", str5, "0.9.6");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.9.6" + "'", str10, "0.9.6");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        boolean boolean7 = graylog2Handler0.isIncludeFullMDC();
        graylog2Handler0.close();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.util.logging.Level level7 = graylog2Handler0.getLevel();
        java.util.logging.Level level8 = graylog2Handler0.getLevel();
        java.util.logging.Filter filter9 = null;
        graylog2Handler0.setFilter(filter9);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertNotNull(level8);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        java.net.InetAddress inetAddress1 = me.moocar.logbackgelf.util.InternetUtils.getInetAddress("6");
        org.junit.Assert.assertNotNull(inetAddress1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setShortMessagePattern("0.9.6");
        java.lang.String str6 = graylog2Handler0.getGraylog2ServerVersion();
        java.lang.String str7 = graylog2Handler0.getGraylog2ServerHost();
        boolean boolean8 = graylog2Handler0.isUseLoggerName();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler9 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler9.setUseThreadName(true);
        java.lang.String str12 = graylog2Handler9.getGraylog2ServerHost();
        boolean boolean13 = graylog2Handler9.isUseLoggerName();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler14 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler14.setUseThreadName(true);
        java.lang.String str17 = graylog2Handler14.getHostName();
        graylog2Handler14.setShortMessagePattern("0.9.6");
        java.util.logging.ErrorManager errorManager20 = graylog2Handler14.getErrorManager();
        graylog2Handler9.setErrorManager(errorManager20);
        graylog2Handler0.setErrorManager(errorManager20);
        graylog2Handler0.close();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.9.6" + "'", str6, "0.9.6");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "localhost" + "'", str7, "localhost");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "localhost" + "'", str12, "localhost");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(errorManager20);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        java.security.MessageDigest messageDigest3 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider5 = new me.moocar.logbackgelf.MessageIdProvider(100, messageDigest3, "hi!");
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider8 = null;
        byte[] byteArray10 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory12 = new me.moocar.logbackgelf.ChunkFactory(byteArray10, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker13 = new me.moocar.logbackgelf.PayloadChunker(0, (int) 'a', messageIdProvider8, chunkFactory12);
        me.moocar.logbackgelf.PayloadChunker payloadChunker14 = new me.moocar.logbackgelf.PayloadChunker((int) '4', 1, messageIdProvider5, chunkFactory12);
        me.moocar.logbackgelf.Zipper zipper15 = new me.moocar.logbackgelf.Zipper();
        byte[] byteArray17 = zipper15.zip("localhost");
        byte[] byteArray19 = zipper15.zip("5");
        byte[] byteArray23 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory25 = new me.moocar.logbackgelf.ChunkFactory(byteArray23, false);
        byte[] byteArray26 = chunkFactory12.create(byteArray19, (byte) 10, (byte) 1, byteArray23);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -53, -55, 79, 78, -52, -55, -56, 47, 46, 1, 0, 35, 8, -62, -98, 9, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[31, -117, 8, 0, 0, 0, 0, 0, 0, 0, 51, 5, 0, -82, 43, -79, -124, 1, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, 51, 5, 0, -82, 43, -79, -124, 1, 0, 0, 0, 0, 10, 0, 1, 100]");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        java.security.MessageDigest messageDigest1 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider3 = new me.moocar.logbackgelf.MessageIdProvider((int) (byte) -1, messageDigest1, "0.9.6");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getGraylog2ServerHost();
        boolean boolean4 = graylog2Handler0.isUseLoggerName();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler5 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler5.setUseThreadName(true);
        java.lang.String str8 = graylog2Handler5.getHostName();
        graylog2Handler5.setShortMessagePattern("0.9.6");
        java.util.logging.ErrorManager errorManager11 = graylog2Handler5.getErrorManager();
        graylog2Handler0.setErrorManager(errorManager11);
        int int13 = graylog2Handler0.getShortMessageLength();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "localhost" + "'", str3, "localhost");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 255 + "'", int13 == 255);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        boolean boolean7 = graylog2Handler0.isIncludeFullMDC();
        graylog2Handler0.setGraylog2ServerPort(10);
        graylog2Handler0.setGraylog2ServerHost("0.9.6");
        graylog2Handler0.close();
        java.util.logging.LogRecord logRecord13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = graylog2Handler0.isLoggable(logRecord13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler1 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler1.setUseThreadName(true);
        java.lang.String str4 = graylog2Handler1.getHostName();
        java.lang.String str5 = graylog2Handler1.getGraylog2ServerHost();
        graylog2Handler1.close();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = graylog2Handler1.getStaticAdditionalFields();
        graylog2Handler0.setStaticAdditionalFields(strMap7);
        graylog2Handler0.setFacility("5");
        java.lang.String str11 = graylog2Handler0.getFacility();
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.addStaticAdditionalField("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: staticAdditionalField must be of the format key:value, where key is the additional field key (therefore should have a leading underscore), and value is a static string. e.g. _node_name:www013");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "localhost" + "'", str5, "localhost");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5" + "'", str11, "5");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler3 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str4 = graylog2Handler3.getHostName();
        java.lang.String str5 = graylog2Handler3.getEncoding();
        int int6 = graylog2Handler3.getShortMessageLength();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler7 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler7.setUseThreadName(true);
        java.util.logging.LogRecord logRecord10 = null;
        graylog2Handler7.publish(logRecord10);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = graylog2Handler7.getStaticAdditionalFields();
        graylog2Handler3.setStaticAdditionalFields(strMap12);
        java.util.logging.Formatter formatter16 = null;
        java.util.logging.Formatter formatter17 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter18 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("", false, true, strMap12, (int) ' ', "hi!", formatter16, formatter17);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 255 + "'", int6 == 255);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        boolean boolean7 = graylog2Handler0.isIncludeFullMDC();
        graylog2Handler0.setGraylog2ServerPort(10);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = graylog2Handler0.getStaticAdditionalFields();
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setStaticAdditionalFieldsProperties("localhost");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: staticAdditionalField must be of the format key:value, where key is the additional field key (therefore should have a leading underscore), and value is a static string. e.g. _node_name:www013");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.lang.String str2 = graylog2Handler0.getEncoding();
        graylog2Handler0.setChunkThreshold((-1));
        java.lang.String str5 = graylog2Handler0.getGraylog2ServerVersion();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.9.6" + "'", str5, "0.9.6");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.util.logging.Formatter formatter2 = graylog2Handler0.getFormatter();
        java.lang.String str3 = graylog2Handler0.getHostName();
        boolean boolean4 = graylog2Handler0.isUseThreadName();
        boolean boolean5 = graylog2Handler0.isIncludeFullMDC();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(formatter2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.LogRecord logRecord3 = null;
        graylog2Handler0.publish(logRecord3);
        java.lang.String str5 = graylog2Handler0.getGraylog2ServerVersion();
        graylog2Handler0.setGraylog2ServerVersion("Hengchens-MBP.attlocal.net");
        java.util.logging.LogRecord logRecord8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = graylog2Handler0.isLoggable(logRecord8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.9.6" + "'", str5, "0.9.6");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        java.security.MessageDigest messageDigest1 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider3 = new me.moocar.logbackgelf.MessageIdProvider((int) (short) 10, messageDigest1, "localhost");
        java.lang.Class<?> wildcardClass4 = messageIdProvider3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.util.logging.Level level7 = graylog2Handler0.getLevel();
        java.lang.String str8 = graylog2Handler0.getGraylog2ServerVersion();
        java.lang.String str9 = graylog2Handler0.getHostName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.9.6" + "'", str8, "0.9.6");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.util.logging.Formatter formatter2 = graylog2Handler0.getFormatter();
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setHostName("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = graylog2Handler0.getStaticAdditionalFields();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(formatter2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getGraylog2ServerHost();
        boolean boolean4 = graylog2Handler0.isUseLoggerName();
        boolean boolean5 = graylog2Handler0.isIncludeFullMDC();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "localhost" + "'", str3, "localhost");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setGraylog2ServerPort((int) (byte) 0);
        graylog2Handler0.flush();
        graylog2Handler0.setUseLoggerName(true);
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setStaticAdditionalFieldsProperties("Hengchens-MBP.attlocal.net");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: staticAdditionalField must be of the format key:value, where key is the additional field key (therefore should have a leading underscore), and value is a static string. e.g. _node_name:www013");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.util.logging.Formatter formatter2 = graylog2Handler0.getFormatter();
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.util.logging.ErrorManager errorManager4 = graylog2Handler0.getErrorManager();
        boolean boolean5 = graylog2Handler0.isUseThreadName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(formatter2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(errorManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.util.logging.Level level7 = graylog2Handler0.getLevel();
        graylog2Handler0.setShortMessageLength(0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(level7);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.close();
        graylog2Handler0.setFacility("GELF");
        java.util.logging.ErrorManager errorManager8 = graylog2Handler0.getErrorManager();
        java.util.logging.Formatter formatter9 = graylog2Handler0.getFormatter();
        java.util.logging.Formatter formatter10 = graylog2Handler0.getFormatter();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = graylog2Handler0.getStaticAdditionalFields();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNull(formatter9);
        org.junit.Assert.assertNull(formatter10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setGraylog2ServerVersion("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "localhost" + "'", str3, "localhost");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setShortMessagePattern("0.9.6");
        java.lang.String str6 = graylog2Handler0.getGraylog2ServerVersion();
        java.lang.String str7 = graylog2Handler0.getGraylog2ServerHost();
        boolean boolean8 = graylog2Handler0.isUseLoggerName();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler9 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler9.setUseThreadName(true);
        java.lang.String str12 = graylog2Handler9.getGraylog2ServerHost();
        boolean boolean13 = graylog2Handler9.isUseLoggerName();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler14 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler14.setUseThreadName(true);
        java.lang.String str17 = graylog2Handler14.getHostName();
        graylog2Handler14.setShortMessagePattern("0.9.6");
        java.util.logging.ErrorManager errorManager20 = graylog2Handler14.getErrorManager();
        graylog2Handler9.setErrorManager(errorManager20);
        graylog2Handler0.setErrorManager(errorManager20);
        graylog2Handler0.setGraylog2ServerVersion("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.9.6" + "'", str6, "0.9.6");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "localhost" + "'", str7, "localhost");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "localhost" + "'", str12, "localhost");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(errorManager20);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.util.logging.Level level7 = graylog2Handler0.getLevel();
        java.lang.String str8 = graylog2Handler0.getGraylog2ServerVersion();
        graylog2Handler0.close();
        java.util.logging.Formatter formatter10 = graylog2Handler0.getFormatter();
        int int11 = graylog2Handler0.getGraylog2ServerPort();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(level7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.9.6" + "'", str8, "0.9.6");
        org.junit.Assert.assertNull(formatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12201 + "'", int11 == 12201);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        int int1 = graylog2Handler0.getShortMessageLength();
        java.lang.String str2 = graylog2Handler0.getShortMessagePattern();
        graylog2Handler0.setShortMessagePattern("Hengchens-MBP.attlocal.net");
        graylog2Handler0.setFacility("5");
        java.lang.Class<?> wildcardClass7 = graylog2Handler0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'", int1 == 255);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.LogRecord logRecord3 = null;
        graylog2Handler0.publish(logRecord3);
        java.lang.String str5 = graylog2Handler0.getGraylog2ServerVersion();
        java.util.logging.LogRecord logRecord6 = null;
        graylog2Handler0.publish(logRecord6);
        graylog2Handler0.setChunkThreshold((int) (short) -1);
        java.util.logging.ErrorManager errorManager10 = graylog2Handler0.getErrorManager();
        graylog2Handler0.setGraylog2ServerVersion("GELF");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.9.6" + "'", str5, "0.9.6");
        org.junit.Assert.assertNotNull(errorManager10);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setShortMessageLength(0);
        java.lang.String str7 = graylog2Handler0.getGraylog2ServerVersion();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler8 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler8.setUseThreadName(true);
        java.util.logging.Level level11 = graylog2Handler8.getLevel();
        graylog2Handler0.setLevel(level11);
        java.util.logging.Level level13 = graylog2Handler0.getLevel();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.9.6" + "'", str7, "0.9.6");
        org.junit.Assert.assertNotNull(level11);
        org.junit.Assert.assertNotNull(level13);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setUseLoggerName(false);
        graylog2Handler0.close();
        graylog2Handler0.setUseLoggerName(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.LogRecord logRecord3 = null;
        graylog2Handler0.publish(logRecord3);
        java.lang.String str5 = graylog2Handler0.getGraylog2ServerVersion();
        java.util.logging.LogRecord logRecord6 = null;
        graylog2Handler0.publish(logRecord6);
        graylog2Handler0.setChunkThreshold((int) (short) -1);
        java.util.logging.ErrorManager errorManager10 = graylog2Handler0.getErrorManager();
        java.lang.String str11 = graylog2Handler0.getGraylog2ServerVersion();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.9.6" + "'", str5, "0.9.6");
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.9.6" + "'", str11, "0.9.6");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.util.logging.Formatter formatter2 = graylog2Handler0.getFormatter();
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setHostName("hi!");
        graylog2Handler0.setGraylog2ServerPort((int) (byte) 0);
        graylog2Handler0.setHostName("");
        java.lang.String str10 = graylog2Handler0.getEncoding();
        java.util.logging.ErrorManager errorManager11 = graylog2Handler0.getErrorManager();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(formatter2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(errorManager11);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler9 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler9.setUseThreadName(true);
        java.lang.String str12 = graylog2Handler9.getHostName();
        java.lang.String str13 = graylog2Handler9.getGraylog2ServerHost();
        graylog2Handler9.close();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = graylog2Handler9.getStaticAdditionalFields();
        java.util.logging.Formatter formatter18 = null;
        java.util.logging.Formatter formatter19 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter20 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("7", true, false, strMap15, 0, "localhost", formatter18, formatter19);
        java.util.logging.Formatter formatter23 = null;
        java.util.logging.Formatter formatter24 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter25 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("5", false, true, strMap15, (int) (short) -1, "localhost", formatter23, formatter24);
        java.util.logging.Formatter formatter28 = null;
        java.util.logging.Formatter formatter29 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter30 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("Hengchens-MBP.attlocal.net", false, false, strMap15, 6, "1", formatter28, formatter29);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "localhost" + "'", str13, "localhost");
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.Level level3 = graylog2Handler0.getLevel();
        java.util.logging.Level level4 = graylog2Handler0.getLevel();
        graylog2Handler0.close();
        org.junit.Assert.assertNotNull(level3);
        org.junit.Assert.assertNotNull(level4);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.close();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = graylog2Handler0.getStaticAdditionalFields();
        int int7 = graylog2Handler0.getShortMessageLength();
        boolean boolean8 = graylog2Handler0.isUseLoggerName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 255 + "'", int7 == 255);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setShortMessagePattern("0.9.6");
        boolean boolean6 = graylog2Handler0.isUseLoggerName();
        graylog2Handler0.setUseLoggerName(false);
        graylog2Handler0.setFacility("GELF");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setShortMessagePattern("0.9.6");
        java.util.logging.Level level6 = graylog2Handler0.getLevel();
        graylog2Handler0.setIncludeFullMDC(true);
        graylog2Handler0.setIncludeFullMDC(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(level6);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getGraylog2ServerHost();
        java.util.logging.LogRecord logRecord4 = null;
        graylog2Handler0.publish(logRecord4);
        graylog2Handler0.setChunkThreshold((int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "localhost" + "'", str3, "localhost");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.close();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = graylog2Handler0.getStaticAdditionalFields();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.Filter filter9 = graylog2Handler0.getFilter();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler10 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler10.setUseThreadName(true);
        java.util.logging.LogRecord logRecord13 = null;
        graylog2Handler10.publish(logRecord13);
        boolean boolean15 = graylog2Handler10.isIncludeFullMDC();
        int int16 = graylog2Handler10.getGraylog2ServerPort();
        graylog2Handler10.setHostName("");
        java.util.logging.ErrorManager errorManager19 = graylog2Handler10.getErrorManager();
        graylog2Handler0.setErrorManager(errorManager19);
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.setStaticAdditionalFieldsProperties("6");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: staticAdditionalField must be of the format key:value, where key is the additional field key (therefore should have a leading underscore), and value is a static string. e.g. _node_name:www013");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(filter9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12201 + "'", int16 == 12201);
        org.junit.Assert.assertNotNull(errorManager19);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.util.logging.Formatter formatter2 = graylog2Handler0.getFormatter();
        java.lang.String str3 = graylog2Handler0.getHostName();
        boolean boolean4 = graylog2Handler0.isUseThreadName();
        java.lang.String str5 = graylog2Handler0.getEncoding();
        graylog2Handler0.setFacility("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(formatter2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.util.logging.Formatter formatter2 = graylog2Handler0.getFormatter();
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setHostName("hi!");
        boolean boolean6 = graylog2Handler0.isUseThreadName();
        java.util.logging.ErrorManager errorManager7 = graylog2Handler0.getErrorManager();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(formatter2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(errorManager7);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.LogRecord logRecord3 = null;
        graylog2Handler0.publish(logRecord3);
        boolean boolean5 = graylog2Handler0.isIncludeFullMDC();
        int int6 = graylog2Handler0.getGraylog2ServerPort();
        java.lang.String str7 = graylog2Handler0.getGraylog2ServerVersion();
        java.lang.String str8 = graylog2Handler0.getGraylog2ServerVersion();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12201 + "'", int6 == 12201);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.9.6" + "'", str7, "0.9.6");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.9.6" + "'", str8, "0.9.6");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setFacility("5");
        graylog2Handler0.setIncludeFullMDC(false);
        int int9 = graylog2Handler0.getShortMessageLength();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 255 + "'", int9 == 255);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler3 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler3.setUseThreadName(true);
        java.lang.String str6 = graylog2Handler3.getHostName();
        java.lang.String str7 = graylog2Handler3.getGraylog2ServerHost();
        graylog2Handler3.setShortMessageLength(0);
        java.lang.String str10 = graylog2Handler3.getGraylog2ServerHost();
        int int11 = graylog2Handler3.getShortMessageLength();
        java.lang.String str12 = graylog2Handler3.getShortMessagePattern();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler16 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler16.setUseThreadName(true);
        java.lang.String str19 = graylog2Handler16.getHostName();
        java.lang.String str20 = graylog2Handler16.getGraylog2ServerHost();
        graylog2Handler16.close();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = graylog2Handler16.getStaticAdditionalFields();
        java.util.logging.Formatter formatter25 = null;
        java.util.logging.Formatter formatter26 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter27 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("7", true, false, strMap22, 0, "localhost", formatter25, formatter26);
        graylog2Handler3.setStaticAdditionalFields(strMap22);
        java.util.logging.Formatter formatter31 = null;
        java.util.logging.Formatter formatter32 = null;
        es.arcadiaconsulting.graylog2.jboss.GelfConverter gelfConverter33 = new es.arcadiaconsulting.graylog2.jboss.GelfConverter("hi!", true, false, strMap22, (int) ' ', "Hengchens-MBP.attlocal.net", formatter31, formatter32);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "localhost" + "'", str7, "localhost");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "localhost" + "'", str10, "localhost");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "localhost" + "'", str20, "localhost");
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.setFacility("5");
        graylog2Handler0.setUseThreadName(true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.util.logging.Level level3 = graylog2Handler0.getLevel();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = graylog2Handler0.getStaticAdditionalFields();
        java.util.logging.LogRecord logRecord5 = null;
        graylog2Handler0.publish(logRecord5);
        int int7 = graylog2Handler0.getChunkThreshold();
        org.junit.Assert.assertNotNull(level3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1000 + "'", int7 == 1000);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.lang.String str2 = graylog2Handler0.getEncoding();
        graylog2Handler0.setChunkThreshold((-1));
        graylog2Handler0.setGraylog2ServerVersion("GELF");
        // The following exception was thrown during execution in test generation
        try {
            graylog2Handler0.addStaticAdditionalField("6");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: staticAdditionalField must be of the format key:value, where key is the additional field key (therefore should have a leading underscore), and value is a static string. e.g. _node_name:www013");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        graylog2Handler0.setShortMessagePattern("0.9.6");
        java.util.logging.ErrorManager errorManager6 = graylog2Handler0.getErrorManager();
        java.lang.String str7 = graylog2Handler0.getEncoding();
        boolean boolean8 = graylog2Handler0.isUseLoggerName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.close();
        graylog2Handler0.setFacility("GELF");
        java.util.logging.ErrorManager errorManager8 = graylog2Handler0.getErrorManager();
        java.util.logging.Formatter formatter9 = graylog2Handler0.getFormatter();
        java.util.logging.Formatter formatter10 = graylog2Handler0.getFormatter();
        int int11 = graylog2Handler0.getGraylog2ServerPort();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNull(formatter9);
        org.junit.Assert.assertNull(formatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12201 + "'", int11 == 12201);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler1 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler1.setUseThreadName(true);
        java.lang.String str4 = graylog2Handler1.getHostName();
        java.lang.String str5 = graylog2Handler1.getGraylog2ServerHost();
        graylog2Handler1.close();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = graylog2Handler1.getStaticAdditionalFields();
        graylog2Handler0.setStaticAdditionalFields(strMap7);
        graylog2Handler0.setFacility("5");
        java.lang.String str11 = graylog2Handler0.getShortMessagePattern();
        graylog2Handler0.flush();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "localhost" + "'", str5, "localhost");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.setUseThreadName(true);
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getGraylog2ServerHost();
        graylog2Handler0.close();
        graylog2Handler0.setFacility("GELF");
        java.util.logging.ErrorManager errorManager8 = graylog2Handler0.getErrorManager();
        java.util.logging.Formatter formatter9 = graylog2Handler0.getFormatter();
        java.util.logging.Formatter formatter10 = graylog2Handler0.getFormatter();
        java.lang.String str11 = graylog2Handler0.getGraylog2ServerVersion();
        java.lang.String str12 = graylog2Handler0.getHostName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "localhost" + "'", str4, "localhost");
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNull(formatter9);
        org.junit.Assert.assertNull(formatter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.9.6" + "'", str11, "0.9.6");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        java.security.MessageDigest messageDigest3 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider5 = new me.moocar.logbackgelf.MessageIdProvider(100, messageDigest3, "hi!");
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider8 = null;
        byte[] byteArray10 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory12 = new me.moocar.logbackgelf.ChunkFactory(byteArray10, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker13 = new me.moocar.logbackgelf.PayloadChunker(0, (int) 'a', messageIdProvider8, chunkFactory12);
        me.moocar.logbackgelf.PayloadChunker payloadChunker14 = new me.moocar.logbackgelf.PayloadChunker((int) '4', 1, messageIdProvider5, chunkFactory12);
        byte[] byteArray16 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory18 = new me.moocar.logbackgelf.ChunkFactory(byteArray16, false);
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) 10 };
        byte[] byteArray28 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory30 = new me.moocar.logbackgelf.ChunkFactory(byteArray28, false);
        byte[] byteArray32 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory34 = new me.moocar.logbackgelf.ChunkFactory(byteArray32, true);
        byte[] byteArray38 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory40 = new me.moocar.logbackgelf.ChunkFactory(byteArray38, true);
        byte[] byteArray41 = chunkFactory30.create(byteArray32, (byte) 10, (byte) 10, byteArray38);
        byte[] byteArray42 = chunkFactory18.create(byteArray24, (byte) 10, (byte) 0, byteArray38);
        byte[] byteArray46 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory48 = new me.moocar.logbackgelf.ChunkFactory(byteArray46, false);
        byte[] byteArray50 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory52 = new me.moocar.logbackgelf.ChunkFactory(byteArray50, true);
        byte[] byteArray56 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory58 = new me.moocar.logbackgelf.ChunkFactory(byteArray56, true);
        byte[] byteArray59 = chunkFactory48.create(byteArray50, (byte) 10, (byte) 10, byteArray56);
        byte[] byteArray60 = chunkFactory12.create(byteArray42, (byte) 1, (byte) -1, byteArray59);
        me.moocar.logbackgelf.ChunkFactory chunkFactory62 = new me.moocar.logbackgelf.ChunkFactory(byteArray42, true);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[100, 10, 1, -1, 10]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[100]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[100]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[100, 100, 10, 10, 100]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[100, 100, 10, 1, -1, 10, 10, 0, 100]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[100]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[100]");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[100]");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[100, 100, 10, 10, 100]");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[100, 100, 100, 10, 1, -1, 10, 10, 0, 100, 0, 1, 0, -1, 100, 100, 10, 10, 100]");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        graylog2Handler0.close();
        graylog2Handler0.setChunkThreshold((int) '#');
        graylog2Handler0.setShortMessageLength(100);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getHostName();
        java.util.logging.Formatter formatter2 = graylog2Handler0.getFormatter();
        java.lang.String str3 = graylog2Handler0.getHostName();
        java.lang.String str4 = graylog2Handler0.getShortMessagePattern();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(formatter2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        java.security.MessageDigest messageDigest5 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider7 = new me.moocar.logbackgelf.MessageIdProvider((int) (byte) 10, messageDigest5, "0.9.6");
        byte[] byteArray9 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory11 = new me.moocar.logbackgelf.ChunkFactory(byteArray9, true);
        me.moocar.logbackgelf.ChunkFactory chunkFactory13 = new me.moocar.logbackgelf.ChunkFactory(byteArray9, false);
        me.moocar.logbackgelf.PayloadChunker payloadChunker14 = new me.moocar.logbackgelf.PayloadChunker(5, (int) (short) -1, messageIdProvider7, chunkFactory13);
        java.security.MessageDigest messageDigest20 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider22 = new me.moocar.logbackgelf.MessageIdProvider(100, messageDigest20, "hi!");
        me.moocar.logbackgelf.ChunkFactory chunkFactory23 = null;
        me.moocar.logbackgelf.PayloadChunker payloadChunker24 = new me.moocar.logbackgelf.PayloadChunker((int) '#', (int) (byte) 100, messageIdProvider22, chunkFactory23);
        java.security.MessageDigest messageDigest30 = null;
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider32 = new me.moocar.logbackgelf.MessageIdProvider(100, messageDigest30, "hi!");
        me.moocar.logbackgelf.MessageIdProvider messageIdProvider35 = null;
        byte[] byteArray37 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory39 = new me.moocar.logbackgelf.ChunkFactory(byteArray37, true);
        me.moocar.logbackgelf.PayloadChunker payloadChunker40 = new me.moocar.logbackgelf.PayloadChunker(0, (int) 'a', messageIdProvider35, chunkFactory39);
        me.moocar.logbackgelf.PayloadChunker payloadChunker41 = new me.moocar.logbackgelf.PayloadChunker((int) '4', 1, messageIdProvider32, chunkFactory39);
        byte[] byteArray43 = new byte[] { (byte) 100 };
        me.moocar.logbackgelf.ChunkFactory chunkFactory45 = new me.moocar.logbackgelf.ChunkFactory(byteArray43, false);
        me.moocar.logbackgelf.PayloadChunker payloadChunker46 = new me.moocar.logbackgelf.PayloadChunker(255, (int) (byte) 100, messageIdProvider32, chunkFactory45);
        me.moocar.logbackgelf.PayloadChunker payloadChunker47 = new me.moocar.logbackgelf.PayloadChunker((int) (short) 0, (int) (byte) 0, messageIdProvider22, chunkFactory45);
        me.moocar.logbackgelf.PayloadChunker payloadChunker48 = new me.moocar.logbackgelf.PayloadChunker((int) (short) 10, 255, messageIdProvider7, chunkFactory45);
        me.moocar.logbackgelf.Zipper zipper49 = new me.moocar.logbackgelf.Zipper();
        byte[] byteArray51 = zipper49.zip("localhost");
        byte[] byteArray53 = zipper49.zip("5");
        byte[] byteArray55 = zipper49.zip("0.9.6");
        byte[] byteArray58 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray59 = chunkFactory45.create(byteArray55, (byte) 10, (byte) -1, byteArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[100]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[100]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -53, -55, 79, 78, -52, -55, -56, 47, 46, 1, 0, 35, 8, -62, -98, 9, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[31, -117, 8, 0, 0, 0, 0, 0, 0, 0, 51, 5, 0, -82, 43, -79, -124, 1, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[31, -117, 8, 0, 0, 0, 0, 0, 0, 0, 51, -48, -77, -44, 51, 3, 0, 60, -43, -23, -56, 5, 0, 0, 0]");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        es.arcadiaconsulting.graylog2.jboss.Graylog2Handler graylog2Handler0 = new es.arcadiaconsulting.graylog2.jboss.Graylog2Handler();
        java.lang.String str1 = graylog2Handler0.getFacility();
        boolean boolean2 = graylog2Handler0.isIncludeFullMDC();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GELF" + "'", str1, "GELF");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

