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
        java.lang.ThreadLocal<java.lang.String> strThreadLocal0 = com.kjetland.dropwizard.activemq.ActiveMQBundle.correlationID;
        org.junit.Assert.assertNotNull(strThreadLocal0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        com.kjetland.dropwizard.activemq.ActiveMQUtils.RunnableThrowsAll runnableThrowsAll0 = null;
        com.kjetland.dropwizard.activemq.ActiveMQUtils.silent(runnableThrowsAll0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        com.kjetland.dropwizard.activemq.ActiveMQMultiBundle activeMQMultiBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQMultiBundle();
        com.kjetland.dropwizard.activemq.ActiveMQMultiConfigHolder activeMQMultiConfigHolder1 = null;
        io.dropwizard.setup.Environment environment2 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQMultiBundle0.run(activeMQMultiConfigHolder1, environment2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        com.kjetland.dropwizard.activemq.ActiveMQConfigHolder activeMQConfigHolder1 = null;
        io.dropwizard.setup.Environment environment2 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.run(activeMQConfigHolder1, environment2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Class<?> wildcardClass1 = activeMQPoolConfig0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        java.lang.Throwable throwable0 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError1 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable0);
        java.lang.Throwable throwable2 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError3 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable2);
        jsonError1.addSuppressed((java.lang.Throwable) jsonError3);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError5 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError3);
        java.lang.Throwable throwable6 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError7 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable6);
        jsonError3.addSuppressed((java.lang.Throwable) jsonError7);
        java.lang.Class<?> wildcardClass9 = jsonError3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        activeMQPoolConfig0.idleTimeoutMills = 100;
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        com.kjetland.dropwizard.activemq.ActiveMQUtils activeMQUtils0 = new com.kjetland.dropwizard.activemq.ActiveMQUtils();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        activeMQPoolConfig0.maxConnections = 1;
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList1 = activeMQConfig0.trustedPackages;
        activeMQConfig0.brokerUsername = "hi!";
        int int4 = activeMQConfig0.timeToLiveInSeconds;
        long long5 = activeMQConfig0.healthCheckMillisecondsToWait;
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2000L + "'", long5 == 2000L);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        java.lang.Throwable throwable0 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError1 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable0);
        java.lang.Throwable throwable2 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError3 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable2);
        jsonError1.addSuppressed((java.lang.Throwable) jsonError3);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError5 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError3);
        java.lang.Throwable throwable6 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError7 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable6);
        jsonError3.addSuppressed((java.lang.Throwable) jsonError7);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError9 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError7);
        java.lang.String str10 = jsonError9.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError" + "'", str10, "com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Long long3 = activeMQPoolConfig0.expiryTimeoutMills;
        java.lang.Long long4 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.lang.Throwable throwable0 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError1 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable0);
        java.lang.Throwable throwable2 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError3 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable2);
        jsonError1.addSuppressed((java.lang.Throwable) jsonError3);
        java.lang.String str5 = jsonError1.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.kjetland.dropwizard.activemq.errors.JsonError" + "'", str5, "com.kjetland.dropwizard.activemq.errors.JsonError");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender3 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true);
        com.kjetland.dropwizard.activemq.ActiveMQConfigHolder activeMQConfigHolder4 = null;
        io.dropwizard.setup.Environment environment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.run(activeMQConfigHolder4, environment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        java.util.Optional<java.lang.Integer> intOptional10 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender11 = activeMQBundle0.createSender("", true, intOptional10);
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.kjetland.dropwizard.activemq.ActiveMQMultiBundle activeMQMultiBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQMultiBundle();
        java.util.Map<java.lang.String, com.kjetland.dropwizard.activemq.ActiveMQBundle> strMap1 = activeMQMultiBundle0.getActiveMQBundleMap();
        java.util.Map<java.lang.String, com.kjetland.dropwizard.activemq.ActiveMQBundle> strMap2 = activeMQMultiBundle0.getActiveMQBundleMap();
        com.kjetland.dropwizard.activemq.ActiveMQMultiConfigHolder activeMQMultiConfigHolder3 = null;
        io.dropwizard.setup.Environment environment4 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQMultiBundle0.run(activeMQMultiConfigHolder3, environment4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(strMap2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.lang.Throwable throwable0 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError1 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable0);
        java.lang.Throwable throwable2 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError3 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable2);
        jsonError1.addSuppressed((java.lang.Throwable) jsonError3);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError5 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError3);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError6 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError5);
        java.lang.String str7 = jsonError6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError" + "'", str7, "com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQConfigHolder activeMQConfigHolder8 = null;
        io.dropwizard.setup.Environment environment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.run(activeMQConfigHolder8, environment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        activeMQConfig0.timeToLiveInSeconds = 'a';
        activeMQConfig0.brokerUrl = "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}";
        java.lang.Class<?> wildcardClass11 = activeMQConfig0.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        java.util.Optional<java.lang.Integer> intOptional10 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender11 = activeMQBundle0.createSender("", true, intOptional10);
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle12 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender15 = activeMQBundle12.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true);
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender11.send((java.lang.Object) activeMQBundle12);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender11);
        org.junit.Assert.assertNotNull(activeMQSender15);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig8 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList9 = activeMQConfig8.trustedPackages;
        int int10 = activeMQConfig8.shutdownWaitInSeconds;
        io.dropwizard.setup.Environment environment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.init(activeMQConfig8, environment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        activeMQPoolConfig0.timeBetweenExpirationCheckMillis = 10L;
        activeMQPoolConfig0.blockIfSessionPoolIsFull = false;
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender3 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true);
        com.kjetland.dropwizard.activemq.JMSFunction<javax.jms.Session, javax.jms.Message> sessionJMSFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender3.send(sessionJMSFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender7.sendJson("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender13 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", false);
        com.kjetland.dropwizard.activemq.JMSFunction<javax.jms.Session, javax.jms.Message> sessionJMSFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender13.send(sessionJMSFunction14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(activeMQSender13);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        activeMQPoolConfig0.maximumActiveSessionPerConnection = 100;
        java.lang.Long long5 = activeMQPoolConfig0.expiryTimeoutMills;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Long long3 = activeMQPoolConfig0.expiryTimeoutMills;
        java.lang.Integer int4 = activeMQPoolConfig0.maximumActiveSessionPerConnection;
        java.lang.Boolean boolean5 = activeMQPoolConfig0.createConnectionOnStartup;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", false);
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig8 = null;
        io.dropwizard.setup.Environment environment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.init(activeMQConfig8, environment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        activeMQPoolConfig0.timeBetweenExpirationCheckMillis = 10L;
        activeMQPoolConfig0.maximumActiveSessionPerConnection = 100;
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("hi!", true);
        java.util.Optional<java.lang.Integer> intOptional13 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender14 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", false, intOptional13);
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(activeMQSender14);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        java.util.Optional<java.lang.Integer> intOptional7 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender8 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true, intOptional7);
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender8.sendJson("ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender8);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList1 = activeMQConfig0.trustedPackages;
        activeMQConfig0.brokerUsername = "hi!";
        java.lang.String str4 = activeMQConfig0.brokerUrl;
        java.lang.String str5 = activeMQConfig0.brokerUrl;
        activeMQConfig0.shutdownWaitInSeconds = 10;
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Long long3 = activeMQPoolConfig0.expiryTimeoutMills;
        java.lang.Boolean boolean4 = activeMQPoolConfig0.blockIfSessionPoolIsFull;
        java.lang.Integer int5 = activeMQPoolConfig0.maximumActiveSessionPerConnection;
        activeMQPoolConfig0.blockIfSessionPoolIsFull = false;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = null;
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSenderImpl activeMQSenderImpl5 = new com.kjetland.dropwizard.activemq.ActiveMQSenderImpl(connectionFactory0, objectMapper1, "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}", intOptional3, true);
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig6 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        // The following exception was thrown during execution in test generation
        try {
            activeMQSenderImpl5.send((java.lang.Object) activeMQConfig6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = null;
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSenderImpl activeMQSenderImpl5 = new com.kjetland.dropwizard.activemq.ActiveMQSenderImpl(connectionFactory0, objectMapper1, "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}", intOptional3, true);
        com.kjetland.dropwizard.activemq.JMSFunction<javax.jms.Session, javax.jms.Message> sessionJMSFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQSenderImpl5.send(sessionJMSFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.kjetland.dropwizard.activemq.DestinationCreatorImpl destinationCreatorImpl0 = new com.kjetland.dropwizard.activemq.DestinationCreatorImpl();
        javax.jms.Session session1 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.jms.Destination destination3 = destinationCreatorImpl0.create(session1, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        com.kjetland.dropwizard.activemq.DestinationCreatorImpl destinationCreatorImpl0 = new com.kjetland.dropwizard.activemq.DestinationCreatorImpl();
        javax.jms.Session session1 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.jms.Destination destination3 = destinationCreatorImpl0.create(session1, "com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = null;
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSenderImpl activeMQSenderImpl5 = new com.kjetland.dropwizard.activemq.ActiveMQSenderImpl(connectionFactory0, objectMapper1, "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}", intOptional3, true);
        // The following exception was thrown during execution in test generation
        try {
            activeMQSenderImpl5.sendJson("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList1 = activeMQConfig0.trustedPackages;
        activeMQConfig0.brokerUsername = "hi!";
        int int4 = activeMQConfig0.timeToLiveInSeconds;
        java.util.List<java.lang.String> strList5 = activeMQConfig0.trustedPackages;
        activeMQConfig0.timeToLiveInSeconds = 0;
        java.lang.String str8 = activeMQConfig0.brokerUrl;
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", false);
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", false);
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = null;
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSenderImpl activeMQSenderImpl5 = new com.kjetland.dropwizard.activemq.ActiveMQSenderImpl(connectionFactory0, objectMapper1, "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}", intOptional3, true);
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle7 = new com.kjetland.dropwizard.activemq.ActiveMQBundle("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError");
        // The following exception was thrown during execution in test generation
        try {
            activeMQSenderImpl5.send((java.lang.Object) "com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        java.lang.Throwable throwable0 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError1 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable0);
        java.lang.Throwable throwable2 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError3 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable2);
        jsonError1.addSuppressed((java.lang.Throwable) jsonError3);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError5 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError3);
        java.lang.Throwable throwable6 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError7 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable6);
        jsonError3.addSuppressed((java.lang.Throwable) jsonError7);
        java.lang.Throwable[] throwableArray9 = jsonError3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig7 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        activeMQConfig7.trustedPackages = strList11;
        activeMQConfig0.trustedPackages = strList11;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig15 = activeMQConfig0.pool;
        java.lang.Class<?> wildcardClass16 = activeMQConfig0.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(activeMQPoolConfig15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Integer int3 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Integer int4 = activeMQPoolConfig0.maximumActiveSessionPerConnection;
        java.lang.Integer int5 = activeMQPoolConfig0.idleTimeoutMills;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        activeMQPoolConfig0.maxConnections = 100;
        java.lang.Integer int3 = activeMQPoolConfig0.maximumActiveSessionPerConnection;
        java.lang.Integer int4 = activeMQPoolConfig0.idleTimeoutMills;
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("hi!", true);
        java.util.Optional<java.lang.Integer> intOptional13 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender14 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", false, intOptional13);
        com.kjetland.dropwizard.activemq.ActiveMQConfigHolder activeMQConfigHolder15 = null;
        io.dropwizard.setup.Environment environment16 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.run(activeMQConfigHolder15, environment16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(activeMQSender14);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        activeMQConfig0.shutdownWaitInSeconds = '#';
        activeMQConfig0.brokerUrl = "hi!";
        java.lang.String str5 = activeMQConfig0.brokerPassword;
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        java.lang.Throwable throwable0 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError1 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable0);
        java.lang.Throwable throwable2 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError3 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable2);
        jsonError1.addSuppressed((java.lang.Throwable) jsonError3);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError5 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError3);
        java.lang.Throwable throwable6 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError7 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable6);
        jsonError3.addSuppressed((java.lang.Throwable) jsonError7);
        java.lang.Throwable[] throwableArray9 = jsonError7.getSuppressed();
        java.lang.String str10 = jsonError7.toString();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.kjetland.dropwizard.activemq.errors.JsonError" + "'", str10, "com.kjetland.dropwizard.activemq.errors.JsonError");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        java.lang.Class<?> wildcardClass7 = activeMQConfig0.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.lang.Throwable throwable0 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError1 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable0);
        java.lang.Throwable throwable2 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError3 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable2);
        jsonError1.addSuppressed((java.lang.Throwable) jsonError3);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError5 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError3);
        java.lang.Throwable throwable6 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError7 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable6);
        jsonError3.addSuppressed((java.lang.Throwable) jsonError7);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError9 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError7);
        java.lang.Throwable throwable10 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError11 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable10);
        java.lang.Throwable throwable12 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError13 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable12);
        jsonError11.addSuppressed((java.lang.Throwable) jsonError13);
        jsonError9.addSuppressed((java.lang.Throwable) jsonError13);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQConfigHolder activeMQConfigHolder11 = null;
        io.dropwizard.setup.Environment environment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.run(activeMQConfigHolder11, environment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        activeMQPoolConfig0.timeBetweenExpirationCheckMillis = 10L;
        activeMQPoolConfig0.idleTimeoutMills = 0;
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        java.util.Optional<java.lang.Integer> intOptional10 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender11 = activeMQBundle0.createSender("", true, intOptional10);
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig12 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        activeMQConfig12.trustedPackages = strList16;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig19 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        activeMQConfig19.trustedPackages = strList23;
        activeMQConfig12.trustedPackages = strList23;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig27 = activeMQConfig12.pool;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig28 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int29 = activeMQPoolConfig28.idleTimeoutMills;
        java.lang.Long long30 = activeMQPoolConfig28.timeBetweenExpirationCheckMillis;
        java.lang.Long long31 = activeMQPoolConfig28.expiryTimeoutMills;
        java.lang.Boolean boolean32 = activeMQPoolConfig28.blockIfSessionPoolIsFull;
        activeMQConfig12.pool = activeMQPoolConfig28;
        java.lang.String str34 = activeMQPoolConfig28.toString();
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender11.send((java.lang.Object) str34);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(activeMQPoolConfig27);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertNull(long31);
        org.junit.Assert.assertNull(boolean32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str34, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("", false);
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender10.send((java.lang.Object) 2000L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle1 = new com.kjetland.dropwizard.activemq.ActiveMQBundle("hi!");
        java.util.Optional<java.lang.Integer> intOptional4 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender5 = activeMQBundle1.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", false, intOptional4);
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender5);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig1 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList2 = activeMQConfig1.trustedPackages;
        activeMQConfig1.brokerUsername = "hi!";
        io.dropwizard.setup.Environment environment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.init(activeMQConfig1, environment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        com.kjetland.dropwizard.activemq.DestinationCreatorImpl destinationCreatorImpl0 = new com.kjetland.dropwizard.activemq.DestinationCreatorImpl();
        javax.jms.Session session1 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.jms.Destination destination3 = destinationCreatorImpl0.create(session1, "com.kjetland.dropwizard.activemq.errors.JsonError");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender3 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender6 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true);
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender6.sendJson("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=false, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender3);
        org.junit.Assert.assertNotNull(activeMQSender6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender13 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", false);
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig14 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList15 = activeMQConfig14.trustedPackages;
        activeMQConfig14.brokerUsername = "hi!";
        int int18 = activeMQConfig14.timeToLiveInSeconds;
        io.dropwizard.setup.Environment environment19 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.init(activeMQConfig14, environment19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(activeMQSender13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig7 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        activeMQConfig7.trustedPackages = strList11;
        activeMQConfig0.trustedPackages = strList11;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig15 = activeMQConfig0.pool;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig16 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int17 = activeMQPoolConfig16.idleTimeoutMills;
        java.lang.Long long18 = activeMQPoolConfig16.timeBetweenExpirationCheckMillis;
        java.lang.Long long19 = activeMQPoolConfig16.expiryTimeoutMills;
        java.lang.Boolean boolean20 = activeMQPoolConfig16.blockIfSessionPoolIsFull;
        activeMQConfig0.pool = activeMQPoolConfig16;
        java.lang.String str22 = activeMQPoolConfig16.toString();
        activeMQPoolConfig16.idleTimeoutMills = 0;
        activeMQPoolConfig16.expiryTimeoutMills = 1L;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(activeMQPoolConfig15);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(long19);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str22, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        java.lang.Throwable throwable0 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError1 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable0);
        java.lang.Throwable throwable2 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError3 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable2);
        jsonError1.addSuppressed((java.lang.Throwable) jsonError3);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError5 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError3);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError6 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError5);
        java.lang.Throwable throwable7 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError8 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable7);
        java.lang.Throwable throwable9 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError10 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable9);
        jsonError8.addSuppressed((java.lang.Throwable) jsonError10);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError12 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError10);
        jsonError5.addSuppressed((java.lang.Throwable) jsonError12);
        java.lang.String str14 = jsonError5.toString();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError" + "'", str14, "com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        java.util.Optional<java.lang.Integer> intOptional10 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender11 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", false, intOptional10);
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender11);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        activeMQPoolConfig0.blockIfSessionPoolIsFull = false;
        java.lang.Integer int5 = activeMQPoolConfig0.maxConnections;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        java.lang.Throwable throwable0 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError1 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable0);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError2 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError1);
        java.lang.Throwable[] throwableArray3 = jsonError2.getSuppressed();
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError4 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError2);
        java.lang.Throwable[] throwableArray5 = jsonError4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = null;
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSenderImpl activeMQSenderImpl5 = new com.kjetland.dropwizard.activemq.ActiveMQSenderImpl(connectionFactory0, objectMapper1, "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}", intOptional3, true);
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle6 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional9 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle6.createSender("hi!", true, intOptional9);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender13 = activeMQBundle6.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender16 = activeMQBundle6.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender19 = activeMQBundle6.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", false);
        // The following exception was thrown during execution in test generation
        try {
            activeMQSenderImpl5.send((java.lang.Object) activeMQSender19);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(activeMQSender13);
        org.junit.Assert.assertNotNull(activeMQSender16);
        org.junit.Assert.assertNotNull(activeMQSender19);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.lang.Throwable throwable0 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError1 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable0);
        java.lang.Throwable throwable2 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError3 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable2);
        jsonError1.addSuppressed((java.lang.Throwable) jsonError3);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError5 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError3);
        java.lang.Throwable throwable6 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError7 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable6);
        jsonError3.addSuppressed((java.lang.Throwable) jsonError7);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError9 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError7);
        java.lang.Throwable throwable10 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError11 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable10);
        java.lang.Throwable throwable12 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError13 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable12);
        jsonError11.addSuppressed((java.lang.Throwable) jsonError13);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError15 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError13);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError16 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError15);
        jsonError9.addSuppressed((java.lang.Throwable) jsonError16);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError18 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError9);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender3 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true);
        java.util.Optional<java.lang.Integer> intOptional6 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", true, intOptional6);
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle8 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender11 = activeMQBundle8.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender14 = activeMQBundle8.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true);
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender7.send((java.lang.Object) activeMQBundle8);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender3);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender11);
        org.junit.Assert.assertNotNull(activeMQSender14);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.kjetland.dropwizard.activemq.DestinationCreatorImpl destinationCreatorImpl0 = new com.kjetland.dropwizard.activemq.DestinationCreatorImpl();
        javax.jms.Session session1 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.jms.Destination destination3 = destinationCreatorImpl0.create(session1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", false);
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig8 = null;
        io.dropwizard.setup.Environment environment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.init(activeMQConfig8, environment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList1 = activeMQConfig0.trustedPackages;
        activeMQConfig0.brokerUsername = "hi!";
        int int4 = activeMQConfig0.timeToLiveInSeconds;
        java.util.List<java.lang.String> strList5 = activeMQConfig0.trustedPackages;
        activeMQConfig0.shutdownWaitInSeconds = (short) 0;
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        activeMQPoolConfig0.maximumActiveSessionPerConnection = 100;
        activeMQPoolConfig0.blockIfSessionPoolIsFull = true;
        java.lang.String str7 = activeMQPoolConfig0.toString();
        activeMQPoolConfig0.idleTimeoutMills = 0;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=100, blockIfSessionPoolIsFull=true, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str7, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=100, blockIfSessionPoolIsFull=true, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Integer int3 = activeMQPoolConfig0.idleTimeoutMills;
        activeMQPoolConfig0.maxConnections = (-1);
        activeMQPoolConfig0.timeBetweenExpirationCheckMillis = 10L;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle1 = new com.kjetland.dropwizard.activemq.ActiveMQBundle("hi!");
        java.util.Optional<java.lang.Integer> intOptional4 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender5 = activeMQBundle1.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", false, intOptional4);
        com.kjetland.dropwizard.activemq.JMSFunction<javax.jms.Session, javax.jms.Message> sessionJMSFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender5.send(sessionJMSFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.kjetland.dropwizard.activemq.ActiveMQHealthCheck activeMQHealthCheck2 = new com.kjetland.dropwizard.activemq.ActiveMQHealthCheck(connectionFactory0, (long) ' ');
        com.codahale.metrics.health.HealthCheck.Result result3 = activeMQHealthCheck2.execute();
        org.junit.Assert.assertNotNull(result3);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("", false);
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig11 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        activeMQConfig11.trustedPackages = strList15;
        activeMQConfig11.timeToLiveInSeconds = 'a';
        activeMQConfig11.timeToLiveInSeconds = (short) 1;
        int int22 = activeMQConfig11.timeToLiveInSeconds;
        int int23 = activeMQConfig11.shutdownWaitInSeconds;
        java.util.List<java.lang.String> strList24 = activeMQConfig11.trustedPackages;
        io.dropwizard.setup.Environment environment25 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.init(activeMQConfig11, environment25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20 + "'", int23 == 20);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        activeMQConfig0.timeToLiveInSeconds = 'a';
        activeMQConfig0.timeToLiveInSeconds = (short) 1;
        int int11 = activeMQConfig0.timeToLiveInSeconds;
        int int12 = activeMQConfig0.shutdownWaitInSeconds;
        activeMQConfig0.timeToLiveInSeconds = (byte) 10;
        java.lang.String str15 = activeMQConfig0.brokerUsername;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = null;
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSenderImpl activeMQSenderImpl5 = new com.kjetland.dropwizard.activemq.ActiveMQSenderImpl(connectionFactory0, objectMapper1, "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}", intOptional3, true);
        // The following exception was thrown during execution in test generation
        try {
            activeMQSenderImpl5.send((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        java.lang.Throwable throwable0 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError1 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable0);
        java.lang.String str2 = jsonError1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.kjetland.dropwizard.activemq.errors.JsonError" + "'", str2, "com.kjetland.dropwizard.activemq.errors.JsonError");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Long long3 = activeMQPoolConfig0.expiryTimeoutMills;
        activeMQPoolConfig0.idleTimeoutMills = 10;
        java.lang.Integer int6 = activeMQPoolConfig0.maxConnections;
        java.lang.Boolean boolean7 = activeMQPoolConfig0.blockIfSessionPoolIsFull;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.Class<?> wildcardClass1 = activeMQConfig0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        activeMQConfig0.shutdownWaitInSeconds = '#';
        activeMQConfig0.healthCheckMillisecondsToWait = (short) 0;
        int int5 = activeMQConfig0.shutdownWaitInSeconds;
        activeMQConfig0.shutdownWaitInSeconds = 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender13 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", false);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender16 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig17 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList18 = activeMQConfig17.trustedPackages;
        activeMQConfig17.brokerUsername = "hi!";
        int int21 = activeMQConfig17.timeToLiveInSeconds;
        java.util.List<java.lang.String> strList22 = activeMQConfig17.trustedPackages;
        activeMQConfig17.timeToLiveInSeconds = 0;
        activeMQConfig17.brokerUrl = "";
        java.lang.String str27 = activeMQConfig17.brokerUsername;
        java.lang.String str28 = activeMQConfig17.brokerUsername;
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender16.send((java.lang.Object) activeMQConfig17);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(activeMQSender13);
        org.junit.Assert.assertNotNull(activeMQSender16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        activeMQConfig0.timeToLiveInSeconds = 'a';
        activeMQConfig0.timeToLiveInSeconds = (short) 1;
        int int11 = activeMQConfig0.timeToLiveInSeconds;
        long long12 = activeMQConfig0.healthCheckMillisecondsToWait;
        activeMQConfig0.brokerUrl = "com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError";
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2000L + "'", long12 == 2000L);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        java.util.Optional<java.lang.Integer> intOptional10 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender11 = activeMQBundle0.createSender("", true, intOptional10);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender14 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", false);
        com.kjetland.dropwizard.activemq.JMSFunction<javax.jms.Session, javax.jms.Message> sessionJMSFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender14.send(sessionJMSFunction15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender11);
        org.junit.Assert.assertNotNull(activeMQSender14);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList1 = activeMQConfig0.trustedPackages;
        activeMQConfig0.brokerUsername = "hi!";
        java.util.List<java.lang.String> strList4 = activeMQConfig0.trustedPackages;
        activeMQConfig0.brokerUrl = "com.kjetland.dropwizard.activemq.errors.JsonError";
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig7 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        activeMQConfig7.trustedPackages = strList11;
        activeMQConfig0.trustedPackages = strList11;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig15 = activeMQConfig0.pool;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig16 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int17 = activeMQPoolConfig16.idleTimeoutMills;
        java.lang.Long long18 = activeMQPoolConfig16.timeBetweenExpirationCheckMillis;
        java.lang.Long long19 = activeMQPoolConfig16.expiryTimeoutMills;
        java.lang.Boolean boolean20 = activeMQPoolConfig16.blockIfSessionPoolIsFull;
        activeMQConfig0.pool = activeMQPoolConfig16;
        java.lang.String str22 = activeMQPoolConfig16.toString();
        activeMQPoolConfig16.idleTimeoutMills = 0;
        activeMQPoolConfig16.blockIfSessionPoolIsFull = false;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(activeMQPoolConfig15);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(long19);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str22, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle1 = new com.kjetland.dropwizard.activemq.ActiveMQBundle("hi!");
        com.kjetland.dropwizard.activemq.ActiveMQConfigHolder activeMQConfigHolder2 = null;
        io.dropwizard.setup.Environment environment3 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle1.run(activeMQConfigHolder2, environment3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        activeMQConfig0.timeToLiveInSeconds = 'a';
        activeMQConfig0.timeToLiveInSeconds = (short) 1;
        activeMQConfig0.shutdownWaitInSeconds = 20;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender3 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender6 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true);
        com.kjetland.dropwizard.activemq.ActiveMQConfigHolder activeMQConfigHolder7 = null;
        io.dropwizard.setup.Environment environment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.run(activeMQConfigHolder7, environment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender3);
        org.junit.Assert.assertNotNull(activeMQSender6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = null;
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSenderImpl activeMQSenderImpl5 = new com.kjetland.dropwizard.activemq.ActiveMQSenderImpl(connectionFactory0, objectMapper1, "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}", intOptional3, true);
        // The following exception was thrown during execution in test generation
        try {
            activeMQSenderImpl5.sendJson("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig7 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        activeMQConfig7.trustedPackages = strList11;
        activeMQConfig0.trustedPackages = strList11;
        java.lang.String str15 = activeMQConfig0.brokerPassword;
        activeMQConfig0.brokerUsername = "com.kjetland.dropwizard.activemq.errors.JsonError";
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList1 = activeMQConfig0.trustedPackages;
        activeMQConfig0.brokerUsername = "hi!";
        int int4 = activeMQConfig0.timeToLiveInSeconds;
        java.lang.String str5 = activeMQConfig0.brokerPassword;
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        activeMQConfig0.shutdownWaitInSeconds = '#';
        activeMQConfig0.brokerUrl = "hi!";
        long long5 = activeMQConfig0.healthCheckMillisecondsToWait;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig6 = activeMQConfig0.pool;
        activeMQConfig0.brokerUsername = "com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError";
        java.lang.String str9 = activeMQConfig0.brokerUsername;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2000L + "'", long5 == 2000L);
        org.junit.Assert.assertNull(activeMQPoolConfig6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError" + "'", str9, "com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        activeMQConfig0.timeToLiveInSeconds = 'a';
        activeMQConfig0.timeToLiveInSeconds = (byte) 1;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        activeMQConfig0.timeToLiveInSeconds = 'a';
        activeMQConfig0.timeToLiveInSeconds = (short) 1;
        int int11 = activeMQConfig0.timeToLiveInSeconds;
        int int12 = activeMQConfig0.shutdownWaitInSeconds;
        activeMQConfig0.timeToLiveInSeconds = 100;
        java.lang.String str15 = activeMQConfig0.toString();
        activeMQConfig0.brokerUrl = "com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError";
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=100, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}" + "'", str15, "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=100, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList1 = activeMQConfig0.trustedPackages;
        activeMQConfig0.brokerUsername = "hi!";
        java.util.List<java.lang.String> strList4 = activeMQConfig0.trustedPackages;
        activeMQConfig0.shutdownWaitInSeconds = 0;
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", false);
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig8 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        activeMQConfig8.trustedPackages = strList12;
        activeMQConfig8.timeToLiveInSeconds = 'a';
        activeMQConfig8.timeToLiveInSeconds = (short) 1;
        int int19 = activeMQConfig8.timeToLiveInSeconds;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig20 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        activeMQConfig20.trustedPackages = strList24;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig27 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList28 = activeMQConfig27.trustedPackages;
        activeMQConfig20.trustedPackages = strList28;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig30 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray33 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        activeMQConfig30.trustedPackages = strList34;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig37 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        activeMQConfig37.trustedPackages = strList41;
        activeMQConfig30.trustedPackages = strList41;
        activeMQConfig20.trustedPackages = strList41;
        activeMQConfig8.trustedPackages = strList41;
        io.dropwizard.setup.Environment environment47 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.init(activeMQConfig8, environment47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        activeMQConfig0.shutdownWaitInSeconds = '#';
        activeMQConfig0.brokerUrl = "hi!";
        activeMQConfig0.shutdownWaitInSeconds = (byte) 1;
        java.lang.Class<?> wildcardClass7 = activeMQConfig0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        activeMQConfig0.healthCheckMillisecondsToWait = (-1L);
        activeMQConfig0.brokerUsername = "hi!";
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = null;
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSenderImpl activeMQSenderImpl5 = new com.kjetland.dropwizard.activemq.ActiveMQSenderImpl(connectionFactory0, objectMapper1, "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}", intOptional3, true);
        // The following exception was thrown during execution in test generation
        try {
            activeMQSenderImpl5.sendJson("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=false, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender13 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", false);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender16 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle17 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional20 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender21 = activeMQBundle17.createSender("hi!", true, intOptional20);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender24 = activeMQBundle17.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender27 = activeMQBundle17.createSender("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender16.send((java.lang.Object) activeMQBundle17);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(activeMQSender13);
        org.junit.Assert.assertNotNull(activeMQSender16);
        org.junit.Assert.assertNotNull(activeMQSender21);
        org.junit.Assert.assertNotNull(activeMQSender24);
        org.junit.Assert.assertNotNull(activeMQSender27);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Long long3 = activeMQPoolConfig0.expiryTimeoutMills;
        java.lang.Integer int4 = activeMQPoolConfig0.idleTimeoutMills;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig7 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        activeMQConfig7.trustedPackages = strList11;
        activeMQConfig0.trustedPackages = strList11;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig15 = activeMQConfig0.pool;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig16 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int17 = activeMQPoolConfig16.idleTimeoutMills;
        java.lang.Long long18 = activeMQPoolConfig16.timeBetweenExpirationCheckMillis;
        java.lang.Long long19 = activeMQPoolConfig16.expiryTimeoutMills;
        java.lang.Boolean boolean20 = activeMQPoolConfig16.blockIfSessionPoolIsFull;
        activeMQConfig0.pool = activeMQPoolConfig16;
        activeMQConfig0.timeToLiveInSeconds = 1;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(activeMQPoolConfig15);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(long19);
        org.junit.Assert.assertNull(boolean20);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        java.lang.Throwable throwable0 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError1 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable0);
        java.lang.Throwable throwable2 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError3 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable2);
        jsonError1.addSuppressed((java.lang.Throwable) jsonError3);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError5 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError3);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError6 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError5);
        java.lang.Throwable[] throwableArray7 = jsonError6.getSuppressed();
        java.lang.String str8 = jsonError6.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError" + "'", str8, "com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList1 = activeMQConfig0.trustedPackages;
        activeMQConfig0.brokerUsername = "hi!";
        java.lang.String str4 = activeMQConfig0.brokerUrl;
        java.lang.String str5 = activeMQConfig0.brokerUrl;
        activeMQConfig0.shutdownWaitInSeconds = 20;
        java.lang.String str8 = activeMQConfig0.brokerUrl;
        int int9 = activeMQConfig0.timeToLiveInSeconds;
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig7 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        activeMQConfig7.trustedPackages = strList11;
        activeMQConfig0.trustedPackages = strList11;
        int int15 = activeMQConfig0.timeToLiveInSeconds;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Long long3 = activeMQPoolConfig0.expiryTimeoutMills;
        java.lang.Boolean boolean4 = activeMQPoolConfig0.blockIfSessionPoolIsFull;
        activeMQPoolConfig0.idleTimeoutMills = 20;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        java.lang.Throwable throwable0 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError1 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable0);
        java.lang.Throwable throwable2 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError3 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable2);
        jsonError1.addSuppressed((java.lang.Throwable) jsonError3);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError5 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError3);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError6 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError5);
        java.lang.Throwable throwable7 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError8 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable7);
        java.lang.Throwable throwable9 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError10 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable9);
        jsonError8.addSuppressed((java.lang.Throwable) jsonError10);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError12 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError10);
        jsonError5.addSuppressed((java.lang.Throwable) jsonError12);
        java.lang.String str14 = jsonError12.toString();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError" + "'", str14, "com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        activeMQConfig0.shutdownWaitInSeconds = '#';
        activeMQConfig0.healthCheckMillisecondsToWait = (short) 0;
        activeMQConfig0.shutdownWaitInSeconds = (short) 1;
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = null;
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSenderImpl activeMQSenderImpl5 = new com.kjetland.dropwizard.activemq.ActiveMQSenderImpl(connectionFactory0, objectMapper1, "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}", intOptional3, false);
        com.kjetland.dropwizard.activemq.JMSFunction<javax.jms.Session, javax.jms.Message> sessionJMSFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQSenderImpl5.send(sessionJMSFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        java.util.Optional<java.lang.Integer> intOptional7 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender8 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true, intOptional7);
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig9 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int10 = activeMQPoolConfig9.idleTimeoutMills;
        java.lang.Long long11 = activeMQPoolConfig9.timeBetweenExpirationCheckMillis;
        java.lang.Long long12 = activeMQPoolConfig9.expiryTimeoutMills;
        java.lang.Boolean boolean13 = activeMQPoolConfig9.blockIfSessionPoolIsFull;
        java.lang.String str14 = activeMQPoolConfig9.toString();
        activeMQPoolConfig9.maximumActiveSessionPerConnection = 0;
        java.lang.Long long17 = activeMQPoolConfig9.timeBetweenExpirationCheckMillis;
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender8.send((java.lang.Object) long17);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender8);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str14, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
        org.junit.Assert.assertNull(long17);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("hi!", true);
        java.util.Optional<java.lang.Integer> intOptional13 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender14 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", false, intOptional13);
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig15 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        io.dropwizard.setup.Environment environment16 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.init(activeMQConfig15, environment16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(activeMQSender14);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Long long3 = activeMQPoolConfig0.expiryTimeoutMills;
        activeMQPoolConfig0.idleTimeoutMills = 10;
        java.lang.Integer int6 = activeMQPoolConfig0.maxConnections;
        java.lang.Integer int7 = activeMQPoolConfig0.maximumActiveSessionPerConnection;
        activeMQPoolConfig0.expiryTimeoutMills = 100L;
        java.lang.Boolean boolean10 = activeMQPoolConfig0.blockIfSessionPoolIsFull;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(boolean10);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", false);
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig8 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList9 = activeMQConfig8.trustedPackages;
        activeMQConfig8.brokerUsername = "hi!";
        int int12 = activeMQConfig8.timeToLiveInSeconds;
        activeMQConfig8.healthCheckMillisecondsToWait = (short) 100;
        io.dropwizard.setup.Environment environment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.init(activeMQConfig8, environment15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        activeMQPoolConfig0.maximumActiveSessionPerConnection = 100;
        activeMQPoolConfig0.blockIfSessionPoolIsFull = true;
        java.lang.Boolean boolean7 = activeMQPoolConfig0.blockIfSessionPoolIsFull;
        java.lang.String str8 = activeMQPoolConfig0.toString();
        java.lang.Long long9 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=100, blockIfSessionPoolIsFull=true, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str8, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=100, blockIfSessionPoolIsFull=true, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig7 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        activeMQConfig7.trustedPackages = strList11;
        activeMQConfig0.trustedPackages = strList11;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig15 = activeMQConfig0.pool;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig16 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int17 = activeMQPoolConfig16.idleTimeoutMills;
        java.lang.Long long18 = activeMQPoolConfig16.timeBetweenExpirationCheckMillis;
        java.lang.Long long19 = activeMQPoolConfig16.expiryTimeoutMills;
        java.lang.Boolean boolean20 = activeMQPoolConfig16.blockIfSessionPoolIsFull;
        activeMQConfig0.pool = activeMQPoolConfig16;
        java.lang.String str22 = activeMQPoolConfig16.toString();
        activeMQPoolConfig16.maximumActiveSessionPerConnection = (-1);
        java.lang.Long long25 = activeMQPoolConfig16.timeBetweenExpirationCheckMillis;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(activeMQPoolConfig15);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(long19);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str22, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
        org.junit.Assert.assertNull(long25);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender13 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", false);
        com.kjetland.dropwizard.activemq.ActiveMQMultiBundle activeMQMultiBundle14 = new com.kjetland.dropwizard.activemq.ActiveMQMultiBundle();
        java.util.Map<java.lang.String, com.kjetland.dropwizard.activemq.ActiveMQBundle> strMap15 = activeMQMultiBundle14.getActiveMQBundleMap();
        java.util.Map<java.lang.String, com.kjetland.dropwizard.activemq.ActiveMQBundle> strMap16 = activeMQMultiBundle14.getActiveMQBundleMap();
        java.util.Map<java.lang.String, com.kjetland.dropwizard.activemq.ActiveMQBundle> strMap17 = activeMQMultiBundle14.getActiveMQBundleMap();
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender13.send((java.lang.Object) strMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(activeMQSender13);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.kjetland.dropwizard.activemq.ActiveMQHealthCheck activeMQHealthCheck2 = new com.kjetland.dropwizard.activemq.ActiveMQHealthCheck(connectionFactory0, (long) (short) 100);
        com.codahale.metrics.health.HealthCheck.Result result3 = activeMQHealthCheck2.execute();
        com.codahale.metrics.health.HealthCheck.Result result4 = activeMQHealthCheck2.execute();
        org.junit.Assert.assertNotNull(result3);
        org.junit.Assert.assertNotNull(result4);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        com.kjetland.dropwizard.activemq.ActiveMQMultiBundle activeMQMultiBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQMultiBundle();
        java.util.Map<java.lang.String, com.kjetland.dropwizard.activemq.ActiveMQBundle> strMap1 = activeMQMultiBundle0.getActiveMQBundleMap();
        java.util.Map<java.lang.String, com.kjetland.dropwizard.activemq.ActiveMQBundle> strMap2 = activeMQMultiBundle0.getActiveMQBundleMap();
        java.util.Map<java.lang.String, com.kjetland.dropwizard.activemq.ActiveMQBundle> strMap3 = activeMQMultiBundle0.getActiveMQBundleMap();
        java.util.Map<java.lang.String, com.kjetland.dropwizard.activemq.ActiveMQBundle> strMap4 = activeMQMultiBundle0.getActiveMQBundleMap();
        com.kjetland.dropwizard.activemq.ActiveMQMultiConfigHolder activeMQMultiConfigHolder5 = null;
        io.dropwizard.setup.Environment environment6 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQMultiBundle0.run(activeMQMultiConfigHolder5, environment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        activeMQConfig0.timeToLiveInSeconds = 'a';
        activeMQConfig0.brokerUrl = "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}";
        activeMQConfig0.brokerPassword = "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}";
        java.lang.String str13 = activeMQConfig0.brokerUrl;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str13, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender13 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", false);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender16 = activeMQBundle0.createSender("hi!", true);
        java.util.Optional<java.lang.Integer> intOptional19 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender20 = activeMQBundle0.createSender("hi!", true, intOptional19);
        java.util.Optional<java.lang.Integer> intOptional23 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender24 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", false, intOptional23);
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(activeMQSender13);
        org.junit.Assert.assertNotNull(activeMQSender16);
        org.junit.Assert.assertNotNull(activeMQSender20);
        org.junit.Assert.assertNotNull(activeMQSender24);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = null;
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSenderImpl activeMQSenderImpl5 = new com.kjetland.dropwizard.activemq.ActiveMQSenderImpl(connectionFactory0, objectMapper1, "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}", intOptional3, true);
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig6 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int7 = activeMQPoolConfig6.idleTimeoutMills;
        java.lang.Long long8 = activeMQPoolConfig6.timeBetweenExpirationCheckMillis;
        activeMQPoolConfig6.maximumActiveSessionPerConnection = 100;
        java.lang.Integer int11 = activeMQPoolConfig6.idleTimeoutMills;
        activeMQPoolConfig6.blockIfSessionPoolIsFull = false;
        java.lang.Integer int14 = activeMQPoolConfig6.maxConnections;
        // The following exception was thrown during execution in test generation
        try {
            activeMQSenderImpl5.send((java.lang.Object) activeMQPoolConfig6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int14);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = null;
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSenderImpl activeMQSenderImpl5 = new com.kjetland.dropwizard.activemq.ActiveMQSenderImpl(connectionFactory0, objectMapper1, "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}", intOptional3, true);
        // The following exception was thrown during execution in test generation
        try {
            activeMQSenderImpl5.sendJson("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Long long3 = activeMQPoolConfig0.expiryTimeoutMills;
        java.lang.Integer int4 = activeMQPoolConfig0.maximumActiveSessionPerConnection;
        java.lang.Integer int5 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Integer int6 = activeMQPoolConfig0.maximumActiveSessionPerConnection;
        activeMQPoolConfig0.maximumActiveSessionPerConnection = 0;
        activeMQPoolConfig0.expiryTimeoutMills = 2000L;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList1 = activeMQConfig0.trustedPackages;
        activeMQConfig0.brokerUsername = "hi!";
        java.lang.String str4 = activeMQConfig0.brokerUrl;
        long long5 = activeMQConfig0.healthCheckMillisecondsToWait;
        activeMQConfig0.brokerUsername = "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=-1, shutdownWaitInSeconds=20, timeToLiveInSeconds=-1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}";
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2000L + "'", long5 == 2000L);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Long long1 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle1 = new com.kjetland.dropwizard.activemq.ActiveMQBundle("com.kjetland.dropwizard.activemq.errors.JsonError");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", false);
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig11 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        activeMQConfig11.trustedPackages = strList15;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig18 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        activeMQConfig18.trustedPackages = strList22;
        activeMQConfig11.trustedPackages = strList22;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig26 = activeMQConfig11.pool;
        int int27 = activeMQConfig11.shutdownWaitInSeconds;
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender10.send((java.lang.Object) int27);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(activeMQPoolConfig26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20 + "'", int27 == 20);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = null;
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSenderImpl activeMQSenderImpl5 = new com.kjetland.dropwizard.activemq.ActiveMQSenderImpl(connectionFactory0, objectMapper1, "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}", intOptional3, false);
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle6 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional9 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle6.createSender("hi!", true, intOptional9);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender13 = activeMQBundle6.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender16 = activeMQBundle6.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", false);
        java.util.Optional<java.lang.Integer> intOptional19 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender20 = activeMQBundle6.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", true, intOptional19);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender23 = activeMQBundle6.createSender("", true);
        // The following exception was thrown during execution in test generation
        try {
            activeMQSenderImpl5.send((java.lang.Object) activeMQBundle6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(activeMQSender13);
        org.junit.Assert.assertNotNull(activeMQSender16);
        org.junit.Assert.assertNotNull(activeMQSender20);
        org.junit.Assert.assertNotNull(activeMQSender23);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Long long3 = activeMQPoolConfig0.expiryTimeoutMills;
        java.lang.Integer int4 = activeMQPoolConfig0.maximumActiveSessionPerConnection;
        java.lang.Integer int5 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Boolean boolean6 = activeMQPoolConfig0.createConnectionOnStartup;
        activeMQPoolConfig0.blockIfSessionPoolIsFull = true;
        java.lang.String str9 = activeMQPoolConfig0.toString();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=true, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str9, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=true, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        java.util.Optional<java.lang.Integer> intOptional10 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender11 = activeMQBundle0.createSender("", true, intOptional10);
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender11);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        java.util.Optional<java.lang.Integer> intOptional10 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender11 = activeMQBundle0.createSender("", true, intOptional10);
        com.kjetland.dropwizard.activemq.JMSFunction<javax.jms.Session, javax.jms.Message> sessionJMSFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender11.send(sessionJMSFunction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender11);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList1 = activeMQConfig0.trustedPackages;
        activeMQConfig0.brokerUsername = "hi!";
        java.util.List<java.lang.String> strList4 = activeMQConfig0.trustedPackages;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig5 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        activeMQConfig5.trustedPackages = strList9;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig12 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        activeMQConfig12.trustedPackages = strList16;
        activeMQConfig5.trustedPackages = strList16;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig20 = activeMQConfig5.pool;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig21 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int22 = activeMQPoolConfig21.idleTimeoutMills;
        java.lang.Long long23 = activeMQPoolConfig21.timeBetweenExpirationCheckMillis;
        java.lang.Long long24 = activeMQPoolConfig21.expiryTimeoutMills;
        java.lang.Boolean boolean25 = activeMQPoolConfig21.blockIfSessionPoolIsFull;
        activeMQConfig5.pool = activeMQPoolConfig21;
        java.lang.String str27 = activeMQPoolConfig21.toString();
        activeMQConfig0.pool = activeMQPoolConfig21;
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(activeMQPoolConfig20);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNull(long23);
        org.junit.Assert.assertNull(long24);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str27, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        activeMQPoolConfig0.blockIfSessionPoolIsFull = false;
        java.lang.String str5 = activeMQPoolConfig0.toString();
        activeMQPoolConfig0.blockIfSessionPoolIsFull = true;
        activeMQPoolConfig0.idleTimeoutMills = 20;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=false, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str5, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=false, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("hi!", true);
        java.util.Optional<java.lang.Integer> intOptional13 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender14 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", false, intOptional13);
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig15 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList16 = activeMQConfig15.trustedPackages;
        activeMQConfig15.brokerUsername = "hi!";
        int int19 = activeMQConfig15.timeToLiveInSeconds;
        java.util.List<java.lang.String> strList20 = activeMQConfig15.trustedPackages;
        activeMQConfig15.timeToLiveInSeconds = 0;
        activeMQConfig15.brokerUrl = "";
        io.dropwizard.setup.Environment environment25 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.init(activeMQConfig15, environment25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(activeMQSender14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        activeMQConfig0.shutdownWaitInSeconds = '#';
        activeMQConfig0.healthCheckMillisecondsToWait = (short) 0;
        int int5 = activeMQConfig0.shutdownWaitInSeconds;
        activeMQConfig0.brokerPassword = "com.kjetland.dropwizard.activemq.errors.JsonError";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList1 = activeMQConfig0.trustedPackages;
        activeMQConfig0.brokerUsername = "hi!";
        int int4 = activeMQConfig0.timeToLiveInSeconds;
        java.util.List<java.lang.String> strList5 = activeMQConfig0.trustedPackages;
        activeMQConfig0.timeToLiveInSeconds = 0;
        activeMQConfig0.brokerUrl = "";
        java.lang.String str10 = activeMQConfig0.brokerUsername;
        java.lang.String str11 = activeMQConfig0.brokerUsername;
        java.lang.String str12 = activeMQConfig0.brokerPassword;
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        activeMQConfig0.timeToLiveInSeconds = 'a';
        activeMQConfig0.brokerUrl = "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}";
        activeMQConfig0.brokerUrl = "";
        long long13 = activeMQConfig0.healthCheckMillisecondsToWait;
        activeMQConfig0.brokerUsername = "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}";
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2000L + "'", long13 == 2000L);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig7 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        activeMQConfig7.trustedPackages = strList11;
        activeMQConfig0.trustedPackages = strList11;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig15 = activeMQConfig0.pool;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig16 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int17 = activeMQPoolConfig16.idleTimeoutMills;
        java.lang.Long long18 = activeMQPoolConfig16.timeBetweenExpirationCheckMillis;
        java.lang.Long long19 = activeMQPoolConfig16.expiryTimeoutMills;
        java.lang.Boolean boolean20 = activeMQPoolConfig16.blockIfSessionPoolIsFull;
        activeMQConfig0.pool = activeMQPoolConfig16;
        java.lang.String str22 = activeMQPoolConfig16.toString();
        activeMQPoolConfig16.maximumActiveSessionPerConnection = (-1);
        java.lang.Integer int25 = activeMQPoolConfig16.idleTimeoutMills;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(activeMQPoolConfig15);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(long19);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str22, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
        org.junit.Assert.assertNull(int25);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig7 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        activeMQConfig7.trustedPackages = strList11;
        activeMQConfig0.trustedPackages = strList11;
        activeMQConfig0.healthCheckMillisecondsToWait = (byte) -1;
        int int17 = activeMQConfig0.timeToLiveInSeconds;
        java.lang.String str18 = activeMQConfig0.brokerPassword;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        activeMQConfig0.timeToLiveInSeconds = 'a';
        activeMQConfig0.timeToLiveInSeconds = (short) 1;
        int int11 = activeMQConfig0.timeToLiveInSeconds;
        activeMQConfig0.healthCheckMillisecondsToWait = '#';
        int int14 = activeMQConfig0.shutdownWaitInSeconds;
        activeMQConfig0.timeToLiveInSeconds = 20;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Integer int3 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Integer int4 = activeMQPoolConfig0.maximumActiveSessionPerConnection;
        java.lang.Integer int5 = activeMQPoolConfig0.maxConnections;
        java.lang.Boolean boolean6 = activeMQPoolConfig0.createConnectionOnStartup;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        activeMQConfig0.timeToLiveInSeconds = 'a';
        activeMQConfig0.timeToLiveInSeconds = (short) 1;
        int int11 = activeMQConfig0.timeToLiveInSeconds;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig12 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        activeMQConfig12.trustedPackages = strList16;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig19 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList20 = activeMQConfig19.trustedPackages;
        activeMQConfig12.trustedPackages = strList20;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig22 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        activeMQConfig22.trustedPackages = strList26;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig29 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray32 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        activeMQConfig29.trustedPackages = strList33;
        activeMQConfig22.trustedPackages = strList33;
        activeMQConfig12.trustedPackages = strList33;
        activeMQConfig0.trustedPackages = strList33;
        int int39 = activeMQConfig0.shutdownWaitInSeconds;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 20 + "'", int39 == 20);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = null;
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSenderImpl activeMQSenderImpl5 = new com.kjetland.dropwizard.activemq.ActiveMQSenderImpl(connectionFactory0, objectMapper1, "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}", intOptional3, false);
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle6 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender9 = activeMQBundle6.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true);
        java.util.Optional<java.lang.Integer> intOptional12 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender13 = activeMQBundle6.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", true, intOptional12);
        // The following exception was thrown during execution in test generation
        try {
            activeMQSenderImpl5.send((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender9);
        org.junit.Assert.assertNotNull(activeMQSender13);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig7 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        activeMQConfig7.trustedPackages = strList11;
        activeMQConfig0.trustedPackages = strList11;
        java.lang.String str15 = activeMQConfig0.brokerPassword;
        java.lang.String str16 = activeMQConfig0.brokerUsername;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig17 = activeMQConfig0.pool;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(activeMQPoolConfig17);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", false);
        java.util.Optional<java.lang.Integer> intOptional13 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender14 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", true, intOptional13);
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(activeMQSender14);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig7 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        activeMQConfig7.trustedPackages = strList11;
        activeMQConfig0.trustedPackages = strList11;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig15 = activeMQConfig0.pool;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig16 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int17 = activeMQPoolConfig16.idleTimeoutMills;
        java.lang.Long long18 = activeMQPoolConfig16.timeBetweenExpirationCheckMillis;
        java.lang.Long long19 = activeMQPoolConfig16.expiryTimeoutMills;
        java.lang.Boolean boolean20 = activeMQPoolConfig16.blockIfSessionPoolIsFull;
        activeMQConfig0.pool = activeMQPoolConfig16;
        java.lang.String str22 = activeMQPoolConfig16.toString();
        activeMQPoolConfig16.timeBetweenExpirationCheckMillis = (-1L);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(activeMQPoolConfig15);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(long19);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str22, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender13 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", false);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender16 = activeMQBundle0.createSender("hi!", true);
        java.util.Optional<java.lang.Integer> intOptional19 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender20 = activeMQBundle0.createSender("hi!", true, intOptional19);
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender20.sendJson("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(activeMQSender13);
        org.junit.Assert.assertNotNull(activeMQSender16);
        org.junit.Assert.assertNotNull(activeMQSender20);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle1 = new com.kjetland.dropwizard.activemq.ActiveMQBundle("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=true, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList1 = activeMQConfig0.trustedPackages;
        activeMQConfig0.brokerUsername = "hi!";
        java.lang.String str4 = activeMQConfig0.brokerUrl;
        java.lang.String str5 = activeMQConfig0.brokerUrl;
        activeMQConfig0.shutdownWaitInSeconds = 20;
        java.lang.String str8 = activeMQConfig0.brokerUrl;
        activeMQConfig0.timeToLiveInSeconds = (short) 10;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig11 = activeMQConfig0.pool;
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(activeMQPoolConfig11);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig7 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        activeMQConfig7.trustedPackages = strList11;
        activeMQConfig0.trustedPackages = strList11;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig15 = activeMQConfig0.pool;
        java.lang.String str16 = activeMQConfig0.brokerUrl;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(activeMQPoolConfig15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig7 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        activeMQConfig7.trustedPackages = strList11;
        activeMQConfig0.trustedPackages = strList11;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig15 = activeMQConfig0.pool;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig16 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int17 = activeMQPoolConfig16.idleTimeoutMills;
        java.lang.Long long18 = activeMQPoolConfig16.timeBetweenExpirationCheckMillis;
        java.lang.Long long19 = activeMQPoolConfig16.expiryTimeoutMills;
        java.lang.Boolean boolean20 = activeMQPoolConfig16.blockIfSessionPoolIsFull;
        activeMQConfig0.pool = activeMQPoolConfig16;
        java.lang.String str22 = activeMQPoolConfig16.toString();
        activeMQPoolConfig16.idleTimeoutMills = 0;
        activeMQPoolConfig16.maxConnections = 20;
        activeMQPoolConfig16.timeBetweenExpirationCheckMillis = 2000L;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(activeMQPoolConfig15);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(long19);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str22, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Long long3 = activeMQPoolConfig0.expiryTimeoutMills;
        java.lang.Integer int4 = activeMQPoolConfig0.maximumActiveSessionPerConnection;
        java.lang.Integer int5 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Integer int6 = activeMQPoolConfig0.maximumActiveSessionPerConnection;
        activeMQPoolConfig0.maximumActiveSessionPerConnection = 0;
        java.lang.Integer int9 = activeMQPoolConfig0.maxConnections;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = null;
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSenderImpl activeMQSenderImpl5 = new com.kjetland.dropwizard.activemq.ActiveMQSenderImpl(connectionFactory0, objectMapper1, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=false, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", intOptional3, true);
        // The following exception was thrown during execution in test generation
        try {
            activeMQSenderImpl5.send((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", false);
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender10.sendJson("");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle1 = new com.kjetland.dropwizard.activemq.ActiveMQBundle("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError");
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle1.createSender("", true);
        org.junit.Assert.assertNotNull(activeMQSender4);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList1 = activeMQConfig0.trustedPackages;
        activeMQConfig0.brokerUsername = "hi!";
        activeMQConfig0.brokerUrl = "com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError";
        int int6 = activeMQConfig0.timeToLiveInSeconds;
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle1 = new com.kjetland.dropwizard.activemq.ActiveMQBundle("");
        java.lang.Class<?> wildcardClass2 = activeMQBundle1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.kjetland.dropwizard.activemq.ActiveMQHealthCheck activeMQHealthCheck2 = new com.kjetland.dropwizard.activemq.ActiveMQHealthCheck(connectionFactory0, (long) 1);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        activeMQPoolConfig0.maxConnections = 20;
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle1 = new com.kjetland.dropwizard.activemq.ActiveMQBundle("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError");
        java.util.Optional<java.lang.Integer> intOptional4 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender5 = activeMQBundle1.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true, intOptional4);
        org.junit.Assert.assertNotNull(activeMQSender5);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList1 = activeMQConfig0.trustedPackages;
        activeMQConfig0.brokerUsername = "hi!";
        int int4 = activeMQConfig0.timeToLiveInSeconds;
        java.util.List<java.lang.String> strList5 = activeMQConfig0.trustedPackages;
        activeMQConfig0.timeToLiveInSeconds = 0;
        java.lang.Class<?> wildcardClass8 = activeMQConfig0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList1 = activeMQConfig0.trustedPackages;
        activeMQConfig0.brokerUsername = "hi!";
        java.lang.String str4 = activeMQConfig0.brokerUrl;
        long long5 = activeMQConfig0.healthCheckMillisecondsToWait;
        activeMQConfig0.timeToLiveInSeconds = (short) 1;
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2000L + "'", long5 == 2000L);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        activeMQConfig0.timeToLiveInSeconds = 'a';
        activeMQConfig0.timeToLiveInSeconds = (short) 1;
        int int11 = activeMQConfig0.timeToLiveInSeconds;
        int int12 = activeMQConfig0.shutdownWaitInSeconds;
        activeMQConfig0.timeToLiveInSeconds = 100;
        activeMQConfig0.brokerUrl = "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=100, blockIfSessionPoolIsFull=true, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}";
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String str1 = activeMQConfig0.brokerUsername;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig2 = activeMQConfig0.pool;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(activeMQPoolConfig2);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("", false);
        java.lang.Throwable throwable11 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError12 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable11);
        java.lang.Throwable throwable13 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError14 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable13);
        jsonError12.addSuppressed((java.lang.Throwable) jsonError14);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError16 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError14);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError17 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError16);
        java.lang.Throwable throwable18 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError19 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable18);
        java.lang.Throwable throwable20 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError21 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable20);
        jsonError19.addSuppressed((java.lang.Throwable) jsonError21);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError23 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError21);
        jsonError16.addSuppressed((java.lang.Throwable) jsonError23);
        java.lang.Throwable throwable25 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError26 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable25);
        java.lang.Throwable throwable27 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError28 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable27);
        jsonError26.addSuppressed((java.lang.Throwable) jsonError28);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError30 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError28);
        java.lang.Throwable throwable31 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError32 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable31);
        jsonError28.addSuppressed((java.lang.Throwable) jsonError32);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError34 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError32);
        java.lang.Throwable throwable35 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError36 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable35);
        java.lang.Throwable throwable37 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError38 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable37);
        jsonError36.addSuppressed((java.lang.Throwable) jsonError38);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError40 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError38);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError41 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError40);
        jsonError34.addSuppressed((java.lang.Throwable) jsonError41);
        java.lang.Throwable[] throwableArray43 = jsonError41.getSuppressed();
        jsonError23.addSuppressed((java.lang.Throwable) jsonError41);
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender10.send((java.lang.Object) jsonError41);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(throwableArray43);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        activeMQPoolConfig0.blockIfSessionPoolIsFull = false;
        java.lang.String str5 = activeMQPoolConfig0.toString();
        java.lang.Long long6 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=false, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str5, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=false, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList1 = activeMQConfig0.trustedPackages;
        activeMQConfig0.brokerUsername = "hi!";
        java.lang.String str4 = activeMQConfig0.brokerUrl;
        java.lang.String str5 = activeMQConfig0.brokerUrl;
        activeMQConfig0.shutdownWaitInSeconds = 20;
        java.lang.String str8 = activeMQConfig0.brokerUrl;
        java.lang.String str9 = activeMQConfig0.brokerUrl;
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Long long3 = activeMQPoolConfig0.expiryTimeoutMills;
        java.lang.Boolean boolean4 = activeMQPoolConfig0.blockIfSessionPoolIsFull;
        java.lang.String str5 = activeMQPoolConfig0.toString();
        java.lang.String str6 = activeMQPoolConfig0.toString();
        activeMQPoolConfig0.idleTimeoutMills = 1;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str5, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str6, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQMultiBundle activeMQMultiBundle8 = new com.kjetland.dropwizard.activemq.ActiveMQMultiBundle();
        java.lang.Class<?> wildcardClass9 = activeMQMultiBundle8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender7.send((java.lang.Object) activeMQMultiBundle8);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.kjetland.dropwizard.activemq.ActiveMQMultiBundle activeMQMultiBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQMultiBundle();
        java.util.Map<java.lang.String, com.kjetland.dropwizard.activemq.ActiveMQBundle> strMap1 = activeMQMultiBundle0.getActiveMQBundleMap();
        java.util.Map<java.lang.String, com.kjetland.dropwizard.activemq.ActiveMQBundle> strMap2 = activeMQMultiBundle0.getActiveMQBundleMap();
        java.util.Map<java.lang.String, com.kjetland.dropwizard.activemq.ActiveMQBundle> strMap3 = activeMQMultiBundle0.getActiveMQBundleMap();
        com.kjetland.dropwizard.activemq.ActiveMQMultiConfigHolder activeMQMultiConfigHolder4 = null;
        io.dropwizard.setup.Environment environment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQMultiBundle0.run(activeMQMultiConfigHolder4, environment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList1 = activeMQConfig0.trustedPackages;
        int int2 = activeMQConfig0.shutdownWaitInSeconds;
        java.lang.String str3 = activeMQConfig0.brokerUsername;
        java.util.List<java.lang.String> strList4 = activeMQConfig0.trustedPackages;
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = null;
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSenderImpl activeMQSenderImpl5 = new com.kjetland.dropwizard.activemq.ActiveMQSenderImpl(connectionFactory0, objectMapper1, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=true, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", intOptional3, true);
        javax.jms.ConnectionFactory connectionFactory6 = null;
        com.kjetland.dropwizard.activemq.ActiveMQHealthCheck activeMQHealthCheck8 = new com.kjetland.dropwizard.activemq.ActiveMQHealthCheck(connectionFactory6, (long) (short) 100);
        com.codahale.metrics.health.HealthCheck.Result result9 = activeMQHealthCheck8.execute();
        // The following exception was thrown during execution in test generation
        try {
            activeMQSenderImpl5.send((java.lang.Object) result9);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(result9);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        java.lang.Throwable throwable0 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError1 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable0);
        java.lang.Throwable throwable2 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError3 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable2);
        jsonError1.addSuppressed((java.lang.Throwable) jsonError3);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError5 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError3);
        java.lang.Throwable throwable6 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError7 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable6);
        jsonError3.addSuppressed((java.lang.Throwable) jsonError7);
        java.lang.String str9 = jsonError7.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "com.kjetland.dropwizard.activemq.errors.JsonError" + "'", str9, "com.kjetland.dropwizard.activemq.errors.JsonError");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        java.lang.Throwable throwable0 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError1 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable0);
        java.lang.Throwable throwable2 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError3 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable2);
        jsonError1.addSuppressed((java.lang.Throwable) jsonError3);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError5 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError3);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError6 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError5);
        java.lang.Throwable throwable7 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError8 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable7);
        java.lang.Throwable throwable9 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError10 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable9);
        jsonError8.addSuppressed((java.lang.Throwable) jsonError10);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError12 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError10);
        jsonError5.addSuppressed((java.lang.Throwable) jsonError12);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError14 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError5);
        java.lang.Throwable throwable15 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError16 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable15);
        java.lang.Throwable throwable17 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError18 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable17);
        jsonError16.addSuppressed((java.lang.Throwable) jsonError18);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError20 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError18);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError21 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError20);
        java.lang.Throwable throwable22 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError23 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable22);
        java.lang.Throwable throwable24 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError25 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable24);
        jsonError23.addSuppressed((java.lang.Throwable) jsonError25);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError27 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError25);
        jsonError20.addSuppressed((java.lang.Throwable) jsonError27);
        java.lang.Throwable throwable29 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError30 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable29);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError31 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError30);
        jsonError20.addSuppressed((java.lang.Throwable) jsonError30);
        java.lang.Throwable throwable33 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError34 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable33);
        java.lang.Throwable throwable35 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError36 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable35);
        jsonError34.addSuppressed((java.lang.Throwable) jsonError36);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError38 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError36);
        java.lang.Throwable throwable39 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError40 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable39);
        jsonError36.addSuppressed((java.lang.Throwable) jsonError40);
        java.lang.Throwable[] throwableArray42 = jsonError40.getSuppressed();
        java.lang.Throwable throwable43 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError44 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable43);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError45 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError44);
        java.lang.Throwable throwable46 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError47 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable46);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError48 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError47);
        jsonError44.addSuppressed((java.lang.Throwable) jsonError47);
        java.lang.Throwable throwable50 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError51 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable50);
        java.lang.Throwable throwable52 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError53 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable52);
        jsonError51.addSuppressed((java.lang.Throwable) jsonError53);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError55 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError53);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError56 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError55);
        java.lang.Throwable throwable57 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError58 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable57);
        java.lang.Throwable throwable59 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError60 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable59);
        jsonError58.addSuppressed((java.lang.Throwable) jsonError60);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError62 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError60);
        jsonError55.addSuppressed((java.lang.Throwable) jsonError62);
        java.lang.Throwable throwable64 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError65 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable64);
        java.lang.Throwable throwable66 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError67 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable66);
        jsonError65.addSuppressed((java.lang.Throwable) jsonError67);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError69 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError67);
        java.lang.Throwable throwable70 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError71 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable70);
        jsonError67.addSuppressed((java.lang.Throwable) jsonError71);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError73 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError71);
        jsonError62.addSuppressed((java.lang.Throwable) jsonError73);
        jsonError47.addSuppressed((java.lang.Throwable) jsonError73);
        jsonError40.addSuppressed((java.lang.Throwable) jsonError73);
        jsonError30.addSuppressed((java.lang.Throwable) jsonError73);
        jsonError5.addSuppressed((java.lang.Throwable) jsonError30);
        org.junit.Assert.assertNotNull(throwableArray42);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = null;
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSenderImpl activeMQSenderImpl5 = new com.kjetland.dropwizard.activemq.ActiveMQSenderImpl(connectionFactory0, objectMapper1, "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}", intOptional3, true);
        // The following exception was thrown during execution in test generation
        try {
            activeMQSenderImpl5.sendJson("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=100, blockIfSessionPoolIsFull=true, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Long long3 = activeMQPoolConfig0.expiryTimeoutMills;
        java.lang.Integer int4 = activeMQPoolConfig0.maximumActiveSessionPerConnection;
        java.lang.Integer int5 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Boolean boolean6 = activeMQPoolConfig0.createConnectionOnStartup;
        java.lang.Integer int7 = activeMQPoolConfig0.maxConnections;
        java.lang.Integer int8 = activeMQPoolConfig0.maxConnections;
        java.lang.Integer int9 = activeMQPoolConfig0.idleTimeoutMills;
        activeMQPoolConfig0.timeBetweenExpirationCheckMillis = (-1L);
        java.lang.Long long12 = activeMQPoolConfig0.expiryTimeoutMills;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        java.util.Optional<java.lang.Integer> intOptional10 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender11 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", false, intOptional10);
        java.util.Optional<java.lang.Integer> intOptional14 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender15 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=100, blockIfSessionPoolIsFull=true, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true, intOptional14);
        com.kjetland.dropwizard.activemq.ActiveMQConfigHolder activeMQConfigHolder16 = null;
        io.dropwizard.setup.Environment environment17 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.run(activeMQConfigHolder16, environment17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender11);
        org.junit.Assert.assertNotNull(activeMQSender15);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        activeMQPoolConfig0.maximumActiveSessionPerConnection = 100;
        activeMQPoolConfig0.blockIfSessionPoolIsFull = true;
        java.lang.Boolean boolean7 = activeMQPoolConfig0.blockIfSessionPoolIsFull;
        java.lang.String str8 = activeMQPoolConfig0.toString();
        activeMQPoolConfig0.maximumActiveSessionPerConnection = 35;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=100, blockIfSessionPoolIsFull=true, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str8, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=100, blockIfSessionPoolIsFull=true, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        java.lang.Throwable throwable0 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError1 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable0);
        java.lang.Throwable throwable2 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError3 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable2);
        jsonError1.addSuppressed((java.lang.Throwable) jsonError3);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError5 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError3);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError6 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError5);
        java.lang.Throwable throwable7 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError8 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable7);
        java.lang.Throwable throwable9 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError10 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable9);
        jsonError8.addSuppressed((java.lang.Throwable) jsonError10);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError12 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError10);
        jsonError5.addSuppressed((java.lang.Throwable) jsonError12);
        java.lang.Throwable throwable14 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError15 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable14);
        java.lang.Throwable throwable16 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError17 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable16);
        jsonError15.addSuppressed((java.lang.Throwable) jsonError17);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError19 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError17);
        java.lang.Throwable throwable20 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError21 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable20);
        jsonError17.addSuppressed((java.lang.Throwable) jsonError21);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError23 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError21);
        jsonError12.addSuppressed((java.lang.Throwable) jsonError23);
        java.lang.Throwable[] throwableArray25 = jsonError12.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray25);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        java.util.Optional<java.lang.Integer> intOptional10 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender11 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", false, intOptional10);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender14 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=false, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true);
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender11);
        org.junit.Assert.assertNotNull(activeMQSender14);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = null;
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSenderImpl activeMQSenderImpl5 = new com.kjetland.dropwizard.activemq.ActiveMQSenderImpl(connectionFactory0, objectMapper1, "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}", intOptional3, true);
        com.kjetland.dropwizard.activemq.JMSFunction<javax.jms.Session, javax.jms.Message> sessionJMSFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQSenderImpl5.send(sessionJMSFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Long long3 = activeMQPoolConfig0.expiryTimeoutMills;
        java.lang.Integer int4 = activeMQPoolConfig0.maximumActiveSessionPerConnection;
        activeMQPoolConfig0.createConnectionOnStartup = false;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        activeMQPoolConfig0.maximumActiveSessionPerConnection = 100;
        activeMQPoolConfig0.blockIfSessionPoolIsFull = true;
        java.lang.Boolean boolean7 = activeMQPoolConfig0.blockIfSessionPoolIsFull;
        java.lang.String str8 = activeMQPoolConfig0.toString();
        activeMQPoolConfig0.timeBetweenExpirationCheckMillis = 10L;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=100, blockIfSessionPoolIsFull=true, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str8, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=100, blockIfSessionPoolIsFull=true, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList1 = activeMQConfig0.trustedPackages;
        activeMQConfig0.brokerUsername = "hi!";
        activeMQConfig0.brokerUrl = "com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError";
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig6 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        activeMQConfig6.trustedPackages = strList10;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig13 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList14 = activeMQConfig13.trustedPackages;
        activeMQConfig6.trustedPackages = strList14;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig16 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        activeMQConfig16.trustedPackages = strList20;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig23 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        activeMQConfig23.trustedPackages = strList27;
        activeMQConfig16.trustedPackages = strList27;
        activeMQConfig6.trustedPackages = strList27;
        activeMQConfig0.trustedPackages = strList27;
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.JMSFunction<javax.jms.Session, javax.jms.Message> sessionJMSFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender4.send(sessionJMSFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender13 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", false);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender16 = activeMQBundle0.createSender("hi!", true);
        java.util.Optional<java.lang.Integer> intOptional19 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender20 = activeMQBundle0.createSender("hi!", true, intOptional19);
        com.kjetland.dropwizard.activemq.JMSFunction<javax.jms.Session, javax.jms.Message> sessionJMSFunction21 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender20.send(sessionJMSFunction21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(activeMQSender13);
        org.junit.Assert.assertNotNull(activeMQSender16);
        org.junit.Assert.assertNotNull(activeMQSender20);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", false);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender13 = activeMQBundle0.createSender("ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}", true);
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig14 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList15 = activeMQConfig14.trustedPackages;
        activeMQConfig14.brokerUsername = "hi!";
        int int18 = activeMQConfig14.timeToLiveInSeconds;
        java.util.List<java.lang.String> strList19 = activeMQConfig14.trustedPackages;
        activeMQConfig14.timeToLiveInSeconds = 0;
        activeMQConfig14.brokerUrl = "";
        java.lang.String str24 = activeMQConfig14.brokerUsername;
        io.dropwizard.setup.Environment environment25 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.init(activeMQConfig14, environment25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(activeMQSender13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        java.lang.Throwable throwable0 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError1 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable0);
        java.lang.Throwable throwable2 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError3 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable2);
        jsonError1.addSuppressed((java.lang.Throwable) jsonError3);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError5 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError3);
        java.lang.Throwable throwable6 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError7 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable6);
        jsonError3.addSuppressed((java.lang.Throwable) jsonError7);
        java.lang.Throwable[] throwableArray9 = jsonError7.getSuppressed();
        java.lang.Throwable[] throwableArray10 = jsonError7.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Long long3 = activeMQPoolConfig0.expiryTimeoutMills;
        java.lang.Integer int4 = activeMQPoolConfig0.maximumActiveSessionPerConnection;
        java.lang.Integer int5 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Boolean boolean6 = activeMQPoolConfig0.createConnectionOnStartup;
        java.lang.Integer int7 = activeMQPoolConfig0.maxConnections;
        activeMQPoolConfig0.idleTimeoutMills = 0;
        activeMQPoolConfig0.maximumActiveSessionPerConnection = (-1);
        java.lang.String str12 = activeMQPoolConfig0.toString();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=-1, blockIfSessionPoolIsFull=null, idleTimeoutMills=0, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str12, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=-1, blockIfSessionPoolIsFull=null, idleTimeoutMills=0, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender13 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", false);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender16 = activeMQBundle0.createSender("hi!", true);
        java.util.Optional<java.lang.Integer> intOptional19 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender20 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=100, blockIfSessionPoolIsFull=true, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true, intOptional19);
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig21 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList22 = activeMQConfig21.trustedPackages;
        activeMQConfig21.brokerUsername = "hi!";
        java.lang.String str25 = activeMQConfig21.brokerUrl;
        java.lang.String str26 = activeMQConfig21.brokerUrl;
        io.dropwizard.setup.Environment environment27 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.init(activeMQConfig21, environment27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(activeMQSender13);
        org.junit.Assert.assertNotNull(activeMQSender16);
        org.junit.Assert.assertNotNull(activeMQSender20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle1 = new com.kjetland.dropwizard.activemq.ActiveMQBundle("hi!");
        java.util.Optional<java.lang.Integer> intOptional4 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender5 = activeMQBundle1.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", false, intOptional4);
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender5.send(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender5);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig7 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList8 = activeMQConfig7.trustedPackages;
        activeMQConfig0.trustedPackages = strList8;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig10 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        activeMQConfig10.trustedPackages = strList14;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig17 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        activeMQConfig17.trustedPackages = strList21;
        activeMQConfig10.trustedPackages = strList21;
        activeMQConfig0.trustedPackages = strList21;
        long long26 = activeMQConfig0.healthCheckMillisecondsToWait;
        java.lang.String str27 = activeMQConfig0.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 2000L + "'", long26 == 2000L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=-1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}" + "'", str27, "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=-1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", false);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", true);
        java.util.Optional<java.lang.Integer> intOptional13 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender14 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=false, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true, intOptional13);
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(activeMQSender14);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        activeMQConfig0.timeToLiveInSeconds = 'a';
        activeMQConfig0.timeToLiveInSeconds = (short) 1;
        int int11 = activeMQConfig0.timeToLiveInSeconds;
        int int12 = activeMQConfig0.shutdownWaitInSeconds;
        activeMQConfig0.timeToLiveInSeconds = 100;
        java.lang.String str15 = activeMQConfig0.toString();
        java.util.List<java.lang.String> strList16 = activeMQConfig0.trustedPackages;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=100, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}" + "'", str15, "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=100, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.kjetland.dropwizard.activemq.ActiveMQHealthCheck activeMQHealthCheck2 = new com.kjetland.dropwizard.activemq.ActiveMQHealthCheck(connectionFactory0, (long) (-1));
        com.codahale.metrics.health.HealthCheck.Result result3 = activeMQHealthCheck2.execute();
        com.codahale.metrics.health.HealthCheck.Result result4 = activeMQHealthCheck2.execute();
        com.codahale.metrics.health.HealthCheck.Result result5 = activeMQHealthCheck2.execute();
        com.codahale.metrics.health.HealthCheck.Result result6 = activeMQHealthCheck2.execute();
        org.junit.Assert.assertNotNull(result3);
        org.junit.Assert.assertNotNull(result4);
        org.junit.Assert.assertNotNull(result5);
        org.junit.Assert.assertNotNull(result6);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        activeMQConfig0.shutdownWaitInSeconds = '#';
        activeMQConfig0.brokerUrl = "hi!";
        activeMQConfig0.timeToLiveInSeconds = (short) 0;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig7 = activeMQConfig0.pool;
        org.junit.Assert.assertNull(activeMQPoolConfig7);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.kjetland.dropwizard.activemq.ActiveMQMultiBundle activeMQMultiBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQMultiBundle();
        java.util.Map<java.lang.String, com.kjetland.dropwizard.activemq.ActiveMQBundle> strMap1 = activeMQMultiBundle0.getActiveMQBundleMap();
        java.util.Map<java.lang.String, com.kjetland.dropwizard.activemq.ActiveMQBundle> strMap2 = activeMQMultiBundle0.getActiveMQBundleMap();
        java.util.Map<java.lang.String, com.kjetland.dropwizard.activemq.ActiveMQBundle> strMap3 = activeMQMultiBundle0.getActiveMQBundleMap();
        java.util.Map<java.lang.String, com.kjetland.dropwizard.activemq.ActiveMQBundle> strMap4 = activeMQMultiBundle0.getActiveMQBundleMap();
        java.util.Map<java.lang.String, com.kjetland.dropwizard.activemq.ActiveMQBundle> strMap5 = activeMQMultiBundle0.getActiveMQBundleMap();
        com.kjetland.dropwizard.activemq.ActiveMQMultiConfigHolder activeMQMultiConfigHolder6 = null;
        io.dropwizard.setup.Environment environment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQMultiBundle0.run(activeMQMultiConfigHolder6, environment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        activeMQConfig0.timeToLiveInSeconds = 'a';
        activeMQConfig0.brokerUrl = "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}";
        activeMQConfig0.brokerUrl = "";
        long long13 = activeMQConfig0.healthCheckMillisecondsToWait;
        activeMQConfig0.brokerUrl = "com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError";
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2000L + "'", long13 == 2000L);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        activeMQConfig0.shutdownWaitInSeconds = '#';
        activeMQConfig0.brokerUrl = "hi!";
        activeMQConfig0.brokerUsername = "";
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList1 = activeMQConfig0.trustedPackages;
        activeMQConfig0.brokerUsername = "hi!";
        int int4 = activeMQConfig0.timeToLiveInSeconds;
        java.util.List<java.lang.String> strList5 = activeMQConfig0.trustedPackages;
        activeMQConfig0.timeToLiveInSeconds = 0;
        int int8 = activeMQConfig0.shutdownWaitInSeconds;
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender13 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", false);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender16 = activeMQBundle0.createSender("hi!", true);
        java.util.Optional<java.lang.Integer> intOptional19 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender20 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=100, blockIfSessionPoolIsFull=true, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true, intOptional19);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender23 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=-1, blockIfSessionPoolIsFull=null, idleTimeoutMills=0, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true);
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(activeMQSender13);
        org.junit.Assert.assertNotNull(activeMQSender16);
        org.junit.Assert.assertNotNull(activeMQSender20);
        org.junit.Assert.assertNotNull(activeMQSender23);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig7 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        activeMQConfig7.trustedPackages = strList11;
        activeMQConfig0.trustedPackages = strList11;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig15 = activeMQConfig0.pool;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig16 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int17 = activeMQPoolConfig16.idleTimeoutMills;
        java.lang.Long long18 = activeMQPoolConfig16.timeBetweenExpirationCheckMillis;
        java.lang.Long long19 = activeMQPoolConfig16.expiryTimeoutMills;
        java.lang.Boolean boolean20 = activeMQPoolConfig16.blockIfSessionPoolIsFull;
        activeMQConfig0.pool = activeMQPoolConfig16;
        java.lang.String str22 = activeMQPoolConfig16.toString();
        activeMQPoolConfig16.maximumActiveSessionPerConnection = (-1);
        activeMQPoolConfig16.maxConnections = 20;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(activeMQPoolConfig15);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(long19);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str22, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        activeMQConfig0.timeToLiveInSeconds = 'a';
        activeMQConfig0.timeToLiveInSeconds = (short) 1;
        int int11 = activeMQConfig0.timeToLiveInSeconds;
        int int12 = activeMQConfig0.shutdownWaitInSeconds;
        activeMQConfig0.timeToLiveInSeconds = 100;
        java.lang.String str15 = activeMQConfig0.toString();
        java.lang.String str16 = activeMQConfig0.brokerUsername;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=100, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}" + "'", str15, "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=100, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Long long3 = activeMQPoolConfig0.expiryTimeoutMills;
        java.lang.Boolean boolean4 = activeMQPoolConfig0.blockIfSessionPoolIsFull;
        java.lang.String str5 = activeMQPoolConfig0.toString();
        activeMQPoolConfig0.maximumActiveSessionPerConnection = 0;
        activeMQPoolConfig0.expiryTimeoutMills = 10L;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str5, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig7 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        activeMQConfig7.trustedPackages = strList11;
        activeMQConfig0.trustedPackages = strList11;
        java.lang.String str15 = activeMQConfig0.brokerPassword;
        java.lang.String str16 = activeMQConfig0.brokerUsername;
        activeMQConfig0.brokerPassword = "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=-1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}";
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        java.lang.Throwable throwable0 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError1 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable0);
        java.lang.Throwable throwable2 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError3 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable2);
        jsonError1.addSuppressed((java.lang.Throwable) jsonError3);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError5 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError3);
        java.lang.Throwable throwable6 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError7 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable6);
        jsonError3.addSuppressed((java.lang.Throwable) jsonError7);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError9 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError7);
        java.lang.Throwable throwable10 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError11 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable10);
        java.lang.Throwable throwable12 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError13 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable12);
        jsonError11.addSuppressed((java.lang.Throwable) jsonError13);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError15 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError13);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError16 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError15);
        jsonError9.addSuppressed((java.lang.Throwable) jsonError16);
        java.lang.Throwable[] throwableArray18 = jsonError16.getSuppressed();
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError19 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError16);
        java.lang.Throwable throwable20 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError21 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable20);
        java.lang.Throwable throwable22 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError23 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable22);
        jsonError21.addSuppressed((java.lang.Throwable) jsonError23);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError25 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError23);
        java.lang.Throwable throwable26 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError27 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable26);
        jsonError23.addSuppressed((java.lang.Throwable) jsonError27);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError29 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError27);
        java.lang.Throwable throwable30 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError31 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable30);
        java.lang.Throwable throwable32 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError33 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable32);
        jsonError31.addSuppressed((java.lang.Throwable) jsonError33);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError35 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError33);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError36 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError35);
        jsonError29.addSuppressed((java.lang.Throwable) jsonError36);
        java.lang.Throwable[] throwableArray38 = jsonError36.getSuppressed();
        jsonError16.addSuppressed((java.lang.Throwable) jsonError36);
        java.lang.Throwable[] throwableArray40 = jsonError36.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        java.util.Optional<java.lang.Integer> intOptional7 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender8 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true, intOptional7);
        com.kjetland.dropwizard.activemq.JMSFunction<javax.jms.Session, javax.jms.Message> sessionJMSFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender8.send(sessionJMSFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender8);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        activeMQPoolConfig0.maximumActiveSessionPerConnection = 100;
        java.lang.Integer int5 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.String str6 = activeMQPoolConfig0.toString();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=100, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str6, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=100, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", false);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", true);
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig7 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        activeMQConfig7.trustedPackages = strList11;
        activeMQConfig0.trustedPackages = strList11;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig15 = activeMQConfig0.pool;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig16 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int17 = activeMQPoolConfig16.idleTimeoutMills;
        java.lang.Long long18 = activeMQPoolConfig16.timeBetweenExpirationCheckMillis;
        java.lang.Long long19 = activeMQPoolConfig16.expiryTimeoutMills;
        java.lang.Boolean boolean20 = activeMQPoolConfig16.blockIfSessionPoolIsFull;
        activeMQConfig0.pool = activeMQPoolConfig16;
        java.lang.String str22 = activeMQPoolConfig16.toString();
        activeMQPoolConfig16.idleTimeoutMills = 0;
        activeMQPoolConfig16.maxConnections = 20;
        java.lang.Long long27 = activeMQPoolConfig16.timeBetweenExpirationCheckMillis;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(activeMQPoolConfig15);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(long19);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str22, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
        org.junit.Assert.assertNull(long27);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        activeMQPoolConfig0.maximumActiveSessionPerConnection = 100;
        activeMQPoolConfig0.blockIfSessionPoolIsFull = true;
        java.lang.Boolean boolean7 = activeMQPoolConfig0.blockIfSessionPoolIsFull;
        activeMQPoolConfig0.expiryTimeoutMills = (-1L);
        activeMQPoolConfig0.blockIfSessionPoolIsFull = false;
        activeMQPoolConfig0.timeBetweenExpirationCheckMillis = 1L;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender13 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", false);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender16 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig17 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList18 = activeMQConfig17.trustedPackages;
        activeMQConfig17.brokerUsername = "hi!";
        int int21 = activeMQConfig17.timeToLiveInSeconds;
        java.util.List<java.lang.String> strList22 = activeMQConfig17.trustedPackages;
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender16.send((java.lang.Object) strList22);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(activeMQSender13);
        org.junit.Assert.assertNotNull(activeMQSender16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        java.lang.Throwable throwable0 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError1 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable0);
        java.lang.Throwable throwable2 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError3 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable2);
        jsonError1.addSuppressed((java.lang.Throwable) jsonError3);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError5 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError3);
        java.lang.Throwable throwable6 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError7 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable6);
        jsonError3.addSuppressed((java.lang.Throwable) jsonError7);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError9 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError7);
        java.lang.Throwable throwable10 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError11 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable10);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError12 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError11);
        java.lang.Throwable[] throwableArray13 = jsonError12.getSuppressed();
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError14 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError12);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError15 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError14);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError16 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError15);
        java.lang.Throwable throwable17 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError18 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable17);
        java.lang.Throwable throwable19 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError20 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable19);
        jsonError18.addSuppressed((java.lang.Throwable) jsonError20);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError22 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError20);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError23 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError22);
        java.lang.Throwable throwable24 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError25 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable24);
        java.lang.Throwable throwable26 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError27 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable26);
        jsonError25.addSuppressed((java.lang.Throwable) jsonError27);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError29 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError27);
        jsonError22.addSuppressed((java.lang.Throwable) jsonError29);
        java.lang.Throwable throwable31 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError32 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable31);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError33 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError32);
        jsonError22.addSuppressed((java.lang.Throwable) jsonError32);
        jsonError15.addSuppressed((java.lang.Throwable) jsonError32);
        jsonError9.addSuppressed((java.lang.Throwable) jsonError32);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        activeMQPoolConfig0.expiryTimeoutMills = 2000L;
        java.lang.Boolean boolean4 = activeMQPoolConfig0.blockIfSessionPoolIsFull;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender3 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true);
        java.util.Optional<java.lang.Integer> intOptional6 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=false, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true, intOptional6);
        org.junit.Assert.assertNotNull(activeMQSender3);
        org.junit.Assert.assertNotNull(activeMQSender7);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("hi!", true);
        java.util.Optional<java.lang.Integer> intOptional13 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender14 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", false, intOptional13);
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig15 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        activeMQConfig15.trustedPackages = strList19;
        activeMQConfig15.timeToLiveInSeconds = 'a';
        activeMQConfig15.brokerUrl = "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}";
        activeMQConfig15.brokerUrl = "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=true, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}";
        io.dropwizard.setup.Environment environment28 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.init(activeMQConfig15, environment28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid broker URI: ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=true, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(activeMQSender14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        java.util.Optional<java.lang.Integer> intOptional10 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender11 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", false, intOptional10);
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle13 = new com.kjetland.dropwizard.activemq.ActiveMQBundle("ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=-1, shutdownWaitInSeconds=20, timeToLiveInSeconds=-1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}");
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender11.send((java.lang.Object) "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=-1, shutdownWaitInSeconds=20, timeToLiveInSeconds=-1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender11);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = null;
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSenderImpl activeMQSenderImpl5 = new com.kjetland.dropwizard.activemq.ActiveMQSenderImpl(connectionFactory0, objectMapper1, "", intOptional3, false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Long long3 = activeMQPoolConfig0.expiryTimeoutMills;
        java.lang.Boolean boolean4 = activeMQPoolConfig0.blockIfSessionPoolIsFull;
        java.lang.String str5 = activeMQPoolConfig0.toString();
        activeMQPoolConfig0.maximumActiveSessionPerConnection = 20;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str5, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        activeMQConfig0.timeToLiveInSeconds = 'a';
        activeMQConfig0.timeToLiveInSeconds = (short) 1;
        java.lang.String str11 = activeMQConfig0.toString();
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig12 = null;
        activeMQConfig0.pool = activeMQPoolConfig12;
        java.util.List<java.lang.String> strList14 = activeMQConfig0.trustedPackages;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}" + "'", str11, "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle1 = new com.kjetland.dropwizard.activemq.ActiveMQBundle("hi!");
        java.util.Optional<java.lang.Integer> intOptional4 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender5 = activeMQBundle1.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", false, intOptional4);
        com.kjetland.dropwizard.activemq.ActiveMQConfigHolder activeMQConfigHolder6 = null;
        io.dropwizard.setup.Environment environment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle1.run(activeMQConfigHolder6, environment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender5);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        java.util.Optional<java.lang.Integer> intOptional10 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender11 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=100, blockIfSessionPoolIsFull=true, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true, intOptional10);
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender11);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.kjetland.dropwizard.activemq.ActiveMQHealthCheck activeMQHealthCheck2 = new com.kjetland.dropwizard.activemq.ActiveMQHealthCheck(connectionFactory0, 10L);
        com.codahale.metrics.health.HealthCheck.Result result3 = activeMQHealthCheck2.execute();
        org.junit.Assert.assertNotNull(result3);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        int int1 = activeMQConfig0.timeToLiveInSeconds;
        java.util.List<java.lang.String> strList2 = activeMQConfig0.trustedPackages;
        activeMQConfig0.shutdownWaitInSeconds = 1;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig5 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int6 = activeMQPoolConfig5.idleTimeoutMills;
        java.lang.Long long7 = activeMQPoolConfig5.timeBetweenExpirationCheckMillis;
        java.lang.Long long8 = activeMQPoolConfig5.expiryTimeoutMills;
        java.lang.Integer int9 = activeMQPoolConfig5.maximumActiveSessionPerConnection;
        java.lang.Integer int10 = activeMQPoolConfig5.maxConnections;
        activeMQConfig0.pool = activeMQPoolConfig5;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        long long1 = activeMQConfig0.healthCheckMillisecondsToWait;
        java.lang.String str2 = activeMQConfig0.brokerPassword;
        java.lang.String[] strArray7 = new java.lang.String[] { "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=100, blockIfSessionPoolIsFull=true, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=100}", "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        activeMQConfig0.trustedPackages = strList8;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2000L + "'", long1 == 2000L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig7 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        activeMQConfig7.trustedPackages = strList11;
        activeMQConfig0.trustedPackages = strList11;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig15 = activeMQConfig0.pool;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig16 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int17 = activeMQPoolConfig16.idleTimeoutMills;
        java.lang.Long long18 = activeMQPoolConfig16.timeBetweenExpirationCheckMillis;
        java.lang.Long long19 = activeMQPoolConfig16.expiryTimeoutMills;
        java.lang.Boolean boolean20 = activeMQPoolConfig16.blockIfSessionPoolIsFull;
        activeMQConfig0.pool = activeMQPoolConfig16;
        java.lang.String str22 = activeMQPoolConfig16.toString();
        activeMQPoolConfig16.maximumActiveSessionPerConnection = (-1);
        activeMQPoolConfig16.maximumActiveSessionPerConnection = 10;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(activeMQPoolConfig15);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(long19);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str22, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        java.lang.Throwable throwable0 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError1 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable0);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError2 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError1);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError3 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError1);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig7 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        activeMQConfig7.trustedPackages = strList11;
        activeMQConfig0.trustedPackages = strList11;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig15 = activeMQConfig0.pool;
        activeMQConfig0.timeToLiveInSeconds = (short) 0;
        activeMQConfig0.brokerUrl = "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=100, blockIfSessionPoolIsFull=true, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}";
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(activeMQPoolConfig15);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", false);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender13 = activeMQBundle0.createSender("ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}", true);
        com.kjetland.dropwizard.activemq.JMSFunction<javax.jms.Session, javax.jms.Message> sessionJMSFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender13.send(sessionJMSFunction14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(activeMQSender13);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        activeMQPoolConfig0.maximumActiveSessionPerConnection = 100;
        activeMQPoolConfig0.blockIfSessionPoolIsFull = true;
        activeMQPoolConfig0.maxConnections = 0;
        activeMQPoolConfig0.timeBetweenExpirationCheckMillis = 2000L;
        activeMQPoolConfig0.timeBetweenExpirationCheckMillis = 2000L;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String str1 = activeMQConfig0.brokerUsername;
        activeMQConfig0.shutdownWaitInSeconds = (short) 10;
        java.util.List<java.lang.String> strList4 = activeMQConfig0.trustedPackages;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        activeMQConfig0.healthCheckMillisecondsToWait = (-1L);
        activeMQConfig0.brokerUsername = "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=false, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}";
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = null;
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSenderImpl activeMQSenderImpl5 = new com.kjetland.dropwizard.activemq.ActiveMQSenderImpl(connectionFactory0, objectMapper1, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=100}", intOptional3, true);
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle6 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional9 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle6.createSender("hi!", true, intOptional9);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender13 = activeMQBundle6.createSender("hi!", true);
        java.util.Optional<java.lang.Integer> intOptional16 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender17 = activeMQBundle6.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", false, intOptional16);
        // The following exception was thrown during execution in test generation
        try {
            activeMQSenderImpl5.send((java.lang.Object) intOptional16);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(activeMQSender13);
        org.junit.Assert.assertNotNull(activeMQSender17);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Integer int3 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Integer int4 = activeMQPoolConfig0.maximumActiveSessionPerConnection;
        java.lang.Integer int5 = activeMQPoolConfig0.maxConnections;
        java.lang.Integer int6 = activeMQPoolConfig0.maxConnections;
        activeMQPoolConfig0.expiryTimeoutMills = 2000L;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender3 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true);
        java.util.Optional<java.lang.Integer> intOptional6 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", true, intOptional6);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true);
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender10.sendJson("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender3);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        java.util.Optional<java.lang.Integer> intOptional10 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender11 = activeMQBundle0.createSender("", true, intOptional10);
        com.kjetland.dropwizard.activemq.ActiveMQConfigHolder activeMQConfigHolder12 = null;
        io.dropwizard.setup.Environment environment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQBundle0.run(activeMQConfigHolder12, environment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender11);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQMultiBundle activeMQMultiBundle11 = new com.kjetland.dropwizard.activemq.ActiveMQMultiBundle();
        java.util.Map<java.lang.String, com.kjetland.dropwizard.activemq.ActiveMQBundle> strMap12 = activeMQMultiBundle11.getActiveMQBundleMap();
        java.util.Map<java.lang.String, com.kjetland.dropwizard.activemq.ActiveMQBundle> strMap13 = activeMQMultiBundle11.getActiveMQBundleMap();
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender10.send((java.lang.Object) strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=-1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}", true, intOptional3);
        com.kjetland.dropwizard.activemq.JMSFunction<javax.jms.Session, javax.jms.Message> sessionJMSFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            activeMQSender4.send(sessionJMSFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender4);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.kjetland.dropwizard.activemq.ActiveMQHealthCheck activeMQHealthCheck2 = new com.kjetland.dropwizard.activemq.ActiveMQHealthCheck(connectionFactory0, (long) 100);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        java.lang.Throwable throwable0 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError1 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable0);
        java.lang.Throwable throwable2 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError3 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable2);
        jsonError1.addSuppressed((java.lang.Throwable) jsonError3);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError5 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError3);
        java.lang.Throwable throwable6 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError7 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable6);
        jsonError3.addSuppressed((java.lang.Throwable) jsonError7);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError9 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError7);
        java.lang.Throwable throwable10 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError11 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable10);
        java.lang.Throwable throwable12 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError13 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable12);
        jsonError11.addSuppressed((java.lang.Throwable) jsonError13);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError15 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError13);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError16 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError15);
        java.lang.Throwable throwable17 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError18 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable17);
        java.lang.Throwable throwable19 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError20 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable19);
        jsonError18.addSuppressed((java.lang.Throwable) jsonError20);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError22 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError20);
        jsonError15.addSuppressed((java.lang.Throwable) jsonError22);
        java.lang.Throwable throwable24 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError25 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable24);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError26 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError25);
        jsonError15.addSuppressed((java.lang.Throwable) jsonError25);
        jsonError9.addSuppressed((java.lang.Throwable) jsonError15);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        java.util.Optional<java.lang.Integer> intOptional10 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender11 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", false, intOptional10);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender14 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=false, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender17 = activeMQBundle0.createSender("hi!", true);
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender11);
        org.junit.Assert.assertNotNull(activeMQSender14);
        org.junit.Assert.assertNotNull(activeMQSender17);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        activeMQConfig0.timeToLiveInSeconds = 'a';
        activeMQConfig0.timeToLiveInSeconds = (short) 1;
        int int11 = activeMQConfig0.timeToLiveInSeconds;
        int int12 = activeMQConfig0.shutdownWaitInSeconds;
        activeMQConfig0.timeToLiveInSeconds = 100;
        activeMQConfig0.brokerUsername = "com.kjetland.dropwizard.activemq.errors.JsonError";
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig17 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        activeMQConfig17.trustedPackages = strList21;
        activeMQConfig17.timeToLiveInSeconds = 'a';
        activeMQConfig17.timeToLiveInSeconds = (short) 1;
        int int28 = activeMQConfig17.timeToLiveInSeconds;
        int int29 = activeMQConfig17.shutdownWaitInSeconds;
        java.util.List<java.lang.String> strList30 = activeMQConfig17.trustedPackages;
        activeMQConfig0.trustedPackages = strList30;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20 + "'", int29 == 20);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        java.lang.Throwable throwable0 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError1 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable0);
        java.lang.Throwable throwable2 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError3 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable2);
        jsonError1.addSuppressed((java.lang.Throwable) jsonError3);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError5 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError3);
        java.lang.Throwable throwable6 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError7 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable6);
        jsonError3.addSuppressed((java.lang.Throwable) jsonError7);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError9 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError7);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError10 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError9);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.kjetland.dropwizard.activemq.ActiveMQHealthCheck activeMQHealthCheck2 = new com.kjetland.dropwizard.activemq.ActiveMQHealthCheck(connectionFactory0, (long) (byte) 10);
        com.codahale.metrics.health.HealthCheck.Result result3 = activeMQHealthCheck2.execute();
        com.codahale.metrics.health.HealthCheck.Result result4 = activeMQHealthCheck2.execute();
        org.junit.Assert.assertNotNull(result3);
        org.junit.Assert.assertNotNull(result4);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Long long3 = activeMQPoolConfig0.expiryTimeoutMills;
        java.lang.Integer int4 = activeMQPoolConfig0.maximumActiveSessionPerConnection;
        java.lang.Integer int5 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Boolean boolean6 = activeMQPoolConfig0.createConnectionOnStartup;
        java.lang.Integer int7 = activeMQPoolConfig0.maxConnections;
        java.lang.Integer int8 = activeMQPoolConfig0.maxConnections;
        activeMQPoolConfig0.idleTimeoutMills = 100;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Long long3 = activeMQPoolConfig0.expiryTimeoutMills;
        java.lang.Integer int4 = activeMQPoolConfig0.maximumActiveSessionPerConnection;
        java.lang.Integer int5 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Boolean boolean6 = activeMQPoolConfig0.createConnectionOnStartup;
        java.lang.Integer int7 = activeMQPoolConfig0.maxConnections;
        activeMQPoolConfig0.expiryTimeoutMills = (-1L);
        java.lang.Class<?> wildcardClass10 = activeMQPoolConfig0.getClass();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Integer int3 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Integer int4 = activeMQPoolConfig0.maximumActiveSessionPerConnection;
        java.lang.Integer int5 = activeMQPoolConfig0.maxConnections;
        activeMQPoolConfig0.createConnectionOnStartup = false;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        activeMQConfig0.timeToLiveInSeconds = 'a';
        activeMQConfig0.timeToLiveInSeconds = (short) 1;
        int int11 = activeMQConfig0.timeToLiveInSeconds;
        long long12 = activeMQConfig0.healthCheckMillisecondsToWait;
        long long13 = activeMQConfig0.healthCheckMillisecondsToWait;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2000L + "'", long12 == 2000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2000L + "'", long13 == 2000L);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList1 = activeMQConfig0.trustedPackages;
        activeMQConfig0.brokerUsername = "hi!";
        java.lang.String str4 = activeMQConfig0.brokerUrl;
        java.lang.String str5 = activeMQConfig0.brokerUrl;
        activeMQConfig0.shutdownWaitInSeconds = 20;
        java.lang.String str8 = activeMQConfig0.brokerUrl;
        activeMQConfig0.timeToLiveInSeconds = (short) 10;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig11 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int12 = activeMQPoolConfig11.idleTimeoutMills;
        java.lang.Long long13 = activeMQPoolConfig11.timeBetweenExpirationCheckMillis;
        java.lang.Long long14 = activeMQPoolConfig11.expiryTimeoutMills;
        activeMQConfig0.pool = activeMQPoolConfig11;
        activeMQConfig0.timeToLiveInSeconds = (byte) 10;
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(long13);
        org.junit.Assert.assertNull(long14);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        activeMQPoolConfig0.maximumActiveSessionPerConnection = 100;
        activeMQPoolConfig0.blockIfSessionPoolIsFull = true;
        activeMQPoolConfig0.maximumActiveSessionPerConnection = 100;
        java.lang.Boolean boolean9 = activeMQPoolConfig0.blockIfSessionPoolIsFull;
        activeMQPoolConfig0.idleTimeoutMills = 20;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("hi!", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("hi!", true);
        java.util.Optional<java.lang.Integer> intOptional13 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender14 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", false, intOptional13);
        java.util.Optional<java.lang.Integer> intOptional17 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender18 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", false, intOptional17);
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(activeMQSender14);
        org.junit.Assert.assertNotNull(activeMQSender18);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle1 = new com.kjetland.dropwizard.activemq.ActiveMQBundle("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=-1, blockIfSessionPoolIsFull=null, idleTimeoutMills=0, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig7 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        activeMQConfig7.trustedPackages = strList11;
        activeMQConfig0.trustedPackages = strList11;
        java.lang.String str15 = activeMQConfig0.brokerPassword;
        activeMQConfig0.brokerUrl = "com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError";
        int int18 = activeMQConfig0.shutdownWaitInSeconds;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        java.lang.Throwable throwable0 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError1 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable0);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError2 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError1);
        java.lang.Throwable throwable3 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError4 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable3);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError5 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError4);
        jsonError1.addSuppressed((java.lang.Throwable) jsonError4);
        java.lang.Throwable throwable7 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError8 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable7);
        java.lang.Throwable throwable9 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError10 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable9);
        jsonError8.addSuppressed((java.lang.Throwable) jsonError10);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError12 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError10);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError13 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError12);
        java.lang.Throwable throwable14 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError15 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable14);
        java.lang.Throwable throwable16 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError17 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable16);
        jsonError15.addSuppressed((java.lang.Throwable) jsonError17);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError19 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError17);
        jsonError12.addSuppressed((java.lang.Throwable) jsonError19);
        jsonError1.addSuppressed((java.lang.Throwable) jsonError12);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Long long3 = activeMQPoolConfig0.expiryTimeoutMills;
        java.lang.Boolean boolean4 = activeMQPoolConfig0.blockIfSessionPoolIsFull;
        java.lang.String str5 = activeMQPoolConfig0.toString();
        activeMQPoolConfig0.timeBetweenExpirationCheckMillis = 100L;
        java.lang.String str8 = activeMQPoolConfig0.toString();
        java.lang.Integer int9 = activeMQPoolConfig0.maximumActiveSessionPerConnection;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str5, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=100}" + "'", str8, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=100}");
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = null;
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSenderImpl activeMQSenderImpl5 = new com.kjetland.dropwizard.activemq.ActiveMQSenderImpl(connectionFactory0, objectMapper1, "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=2000, shutdownWaitInSeconds=20, timeToLiveInSeconds=1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}", intOptional3, true);
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig6 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.util.List<java.lang.String> strList7 = activeMQConfig6.trustedPackages;
        int int8 = activeMQConfig6.shutdownWaitInSeconds;
        activeMQConfig6.timeToLiveInSeconds = 20;
        // The following exception was thrown during execution in test generation
        try {
            activeMQSenderImpl5.send((java.lang.Object) 20);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Long long3 = activeMQPoolConfig0.expiryTimeoutMills;
        java.lang.Boolean boolean4 = activeMQPoolConfig0.blockIfSessionPoolIsFull;
        java.lang.Integer int5 = activeMQPoolConfig0.maximumActiveSessionPerConnection;
        java.lang.Integer int6 = activeMQPoolConfig0.maximumActiveSessionPerConnection;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        activeMQConfig0.timeToLiveInSeconds = 'a';
        activeMQConfig0.timeToLiveInSeconds = (short) 1;
        int int11 = activeMQConfig0.timeToLiveInSeconds;
        activeMQConfig0.healthCheckMillisecondsToWait = '#';
        int int14 = activeMQConfig0.shutdownWaitInSeconds;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig15 = activeMQConfig0.pool;
        java.lang.String str16 = activeMQConfig0.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNull(activeMQPoolConfig15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=35, shutdownWaitInSeconds=20, timeToLiveInSeconds=1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}" + "'", str16, "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=35, shutdownWaitInSeconds=20, timeToLiveInSeconds=1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle1 = new com.kjetland.dropwizard.activemq.ActiveMQBundle("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError");
        java.util.Optional<java.lang.Integer> intOptional4 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender5 = activeMQBundle1.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", true, intOptional4);
        org.junit.Assert.assertNotNull(activeMQSender5);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender3 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true);
        java.util.Optional<java.lang.Integer> intOptional6 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", true, intOptional6);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender10 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender13 = activeMQBundle0.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=100, blockIfSessionPoolIsFull=true, idleTimeoutMills=null, expiryTimeoutMills=0, createConnectionOnStartup=true, timeBetweenExpirationCheckMillis=100}", true);
        org.junit.Assert.assertNotNull(activeMQSender3);
        org.junit.Assert.assertNotNull(activeMQSender7);
        org.junit.Assert.assertNotNull(activeMQSender10);
        org.junit.Assert.assertNotNull(activeMQSender13);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        java.lang.Throwable throwable0 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError1 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable0);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError2 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError1);
        java.lang.Throwable throwable3 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError4 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable3);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError5 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError4);
        jsonError1.addSuppressed((java.lang.Throwable) jsonError4);
        java.lang.Throwable throwable7 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError8 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable7);
        java.lang.Throwable throwable9 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError10 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable9);
        jsonError8.addSuppressed((java.lang.Throwable) jsonError10);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError12 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError10);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError13 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError12);
        java.lang.Throwable throwable14 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError15 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable14);
        java.lang.Throwable throwable16 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError17 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable16);
        jsonError15.addSuppressed((java.lang.Throwable) jsonError17);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError19 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError17);
        jsonError12.addSuppressed((java.lang.Throwable) jsonError19);
        java.lang.Throwable throwable21 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError22 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable21);
        java.lang.Throwable throwable23 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError24 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable23);
        jsonError22.addSuppressed((java.lang.Throwable) jsonError24);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError26 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError24);
        java.lang.Throwable throwable27 = null;
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError28 = new com.kjetland.dropwizard.activemq.errors.JsonError(throwable27);
        jsonError24.addSuppressed((java.lang.Throwable) jsonError28);
        com.kjetland.dropwizard.activemq.errors.JsonError jsonError30 = new com.kjetland.dropwizard.activemq.errors.JsonError((java.lang.Throwable) jsonError28);
        jsonError19.addSuppressed((java.lang.Throwable) jsonError30);
        jsonError4.addSuppressed((java.lang.Throwable) jsonError30);
        java.lang.String str33 = jsonError4.toString();
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "com.kjetland.dropwizard.activemq.errors.JsonError" + "'", str33, "com.kjetland.dropwizard.activemq.errors.JsonError");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Long long3 = activeMQPoolConfig0.expiryTimeoutMills;
        java.lang.Integer int4 = activeMQPoolConfig0.maximumActiveSessionPerConnection;
        java.lang.Integer int5 = activeMQPoolConfig0.idleTimeoutMills;
        activeMQPoolConfig0.idleTimeoutMills = 20;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = null;
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSenderImpl activeMQSenderImpl5 = new com.kjetland.dropwizard.activemq.ActiveMQSenderImpl(connectionFactory0, objectMapper1, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=false, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", intOptional3, false);
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle6 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender9 = activeMQBundle6.createSender("ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}", true);
        java.util.Optional<java.lang.Integer> intOptional12 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender13 = activeMQBundle6.createSender("com.kjetland.dropwizard.activemq.errors.JsonError", true, intOptional12);
        // The following exception was thrown during execution in test generation
        try {
            activeMQSenderImpl5.send((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Error sending to jms");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(activeMQSender9);
        org.junit.Assert.assertNotNull(activeMQSender13);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        java.util.Optional<java.lang.Integer> intOptional3 = null;
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender4 = activeMQBundle0.createSender("hi!", true, intOptional3);
        com.kjetland.dropwizard.activemq.ActiveMQSender activeMQSender7 = activeMQBundle0.createSender("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError", false);
        org.junit.Assert.assertNotNull(activeMQSender4);
        org.junit.Assert.assertNotNull(activeMQSender7);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig7 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        activeMQConfig7.trustedPackages = strList11;
        activeMQConfig0.trustedPackages = strList11;
        activeMQConfig0.healthCheckMillisecondsToWait = (byte) -1;
        java.lang.String str17 = activeMQConfig0.toString();
        activeMQConfig0.healthCheckMillisecondsToWait = 1;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=-1, shutdownWaitInSeconds=20, timeToLiveInSeconds=-1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}" + "'", str17, "ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=-1, shutdownWaitInSeconds=20, timeToLiveInSeconds=-1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        activeMQConfig0.shutdownWaitInSeconds = '#';
        activeMQConfig0.brokerUrl = "hi!";
        activeMQConfig0.shutdownWaitInSeconds = (byte) 1;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig7 = activeMQConfig0.pool;
        org.junit.Assert.assertNull(activeMQPoolConfig7);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int1 = activeMQPoolConfig0.idleTimeoutMills;
        java.lang.Long long2 = activeMQPoolConfig0.timeBetweenExpirationCheckMillis;
        java.lang.Long long3 = activeMQPoolConfig0.expiryTimeoutMills;
        activeMQPoolConfig0.idleTimeoutMills = 10;
        java.lang.Integer int6 = activeMQPoolConfig0.maxConnections;
        java.lang.Boolean boolean7 = activeMQPoolConfig0.createConnectionOnStartup;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig0 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        activeMQConfig0.trustedPackages = strList4;
        com.kjetland.dropwizard.activemq.ActiveMQConfig activeMQConfig7 = new com.kjetland.dropwizard.activemq.ActiveMQConfig();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        activeMQConfig7.trustedPackages = strList11;
        activeMQConfig0.trustedPackages = strList11;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig15 = activeMQConfig0.pool;
        com.kjetland.dropwizard.activemq.ActiveMQPoolConfig activeMQPoolConfig16 = new com.kjetland.dropwizard.activemq.ActiveMQPoolConfig();
        java.lang.Integer int17 = activeMQPoolConfig16.idleTimeoutMills;
        java.lang.Long long18 = activeMQPoolConfig16.timeBetweenExpirationCheckMillis;
        java.lang.Long long19 = activeMQPoolConfig16.expiryTimeoutMills;
        java.lang.Boolean boolean20 = activeMQPoolConfig16.blockIfSessionPoolIsFull;
        activeMQConfig0.pool = activeMQPoolConfig16;
        java.lang.String str22 = activeMQPoolConfig16.toString();
        activeMQPoolConfig16.idleTimeoutMills = 35;
        java.lang.Long long25 = activeMQPoolConfig16.expiryTimeoutMills;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(activeMQPoolConfig15);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(long18);
        org.junit.Assert.assertNull(long19);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}" + "'", str22, "ActiveMQPoolConfig{maxConnections=null, maximumActiveSessionPerConnection=null, blockIfSessionPoolIsFull=null, idleTimeoutMills=null, expiryTimeoutMills=null, createConnectionOnStartup=null, timeBetweenExpirationCheckMillis=null}");
        org.junit.Assert.assertNull(long25);
    }
}

