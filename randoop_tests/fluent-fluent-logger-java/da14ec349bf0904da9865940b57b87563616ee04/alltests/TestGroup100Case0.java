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
        double double0 = org.fluentd.logger.sender.ExponentialDelayReconnector.WAIT_MILLIS;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 500.0d + "'", double0 == 500.0d);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        org.fluentd.logger.FluentLogger fluentLogger5 = org.fluentd.logger.FluentLogger.getLogger("_97_3000_8388608", "hi!", (int) (short) 10, (int) (byte) -1, 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = fluentLogger5.log("", strMap7, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector5 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        org.fluentd.logger.FluentLogger fluentLogger6 = org.fluentd.logger.FluentLogger.getLogger("hi!", "", (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, (org.fluentd.logger.sender.Reconnector) exponentialDelayReconnector5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = fluentLogger6.log("hi!", "hi!", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        java.lang.String str3 = rawSocketSender2.getName();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = rawSocketSender2.emit("hi!", 0L, strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_97_3000_8388608" + "'", str3, "_97_3000_8388608");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        // The following exception was thrown during execution in test generation
        try {
            org.fluentd.logger.FluentLogger.closeAll();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        java.lang.String str3 = rawSocketSender2.getName();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = rawSocketSender2.emit("_97_3000_8388608", strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_97_3000_8388608" + "'", str3, "_97_3000_8388608");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("", "", (int) '4');
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = fluentLogger3.log("hi!", strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        org.fluentd.logger.sender.Event event0 = new org.fluentd.logger.sender.Event();
        java.lang.Class<?> wildcardClass1 = event0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        // The following exception was thrown during execution in test generation
        try {
            org.fluentd.logger.FluentLogger.flushAll();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        rawSocketSender2.flush();
        rawSocketSender2.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = rawSocketSender2.emit("hi!", strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender4.close();
        nullSender4.flush();
        nullSender4.flush();
        java.lang.String str8 = nullSender4.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.fluentd.logger.sender.Event event3 = new org.fluentd.logger.sender.Event("hi!", (long) 0, strMap2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = event3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector0 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        boolean boolean1 = exponentialDelayReconnector0.isErrorHistoryEmpty();
        exponentialDelayReconnector0.clearErrorHistory();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        rawSocketSender2.flush();
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rawSocketSender2.setErrorHandler(errorHandler4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: errorHandler is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector0 = new org.fluentd.logger.sender.ConstantDelayReconnector();
        constantDelayReconnector0.clearErrorHistory();
        constantDelayReconnector0.clearErrorHistory();
        boolean boolean3 = constantDelayReconnector0.isErrorHistoryEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector5 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        org.fluentd.logger.FluentLogger fluentLogger6 = org.fluentd.logger.FluentLogger.getLogger("hi!", "", (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, (org.fluentd.logger.sender.Reconnector) exponentialDelayReconnector5);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = fluentLogger6.log("_97_3000_8388608", strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        org.fluentd.logger.Config config0 = new org.fluentd.logger.Config();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        rawSocketSender2.flush();
        rawSocketSender2.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = rawSocketSender2.emit("org.fluentd.logger.sender.NullSender", strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("null", (int) (byte) 10);
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler3 = null;
        // The following exception was thrown during execution in test generation
        try {
            rawSocketSender2.setErrorHandler(errorHandler3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: errorHandler is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        java.lang.String str3 = rawSocketSender2.getName();
        rawSocketSender2.close();
        rawSocketSender2.flush();
        rawSocketSender2.removeErrorHandler();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_97_3000_8388608" + "'", str3, "_97_3000_8388608");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("", "", (int) '4');
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = fluentLogger3.log("org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", strMap5, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("null", (int) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = rawSocketSender2.emit("_97_3000_8388608", (-1L), strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        java.lang.String str0 = org.fluentd.logger.Constants.FLUENT_SENDER_CLASS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fluentd.logger.sender.class" + "'", str0, "fluentd.logger.sender.class");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        org.fluentd.logger.sender.Event.EventTemplate eventTemplate0 = org.fluentd.logger.sender.Event.EventTemplate.INSTANCE;
        org.msgpack.packer.Packer packer1 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        org.fluentd.logger.sender.Event event5 = new org.fluentd.logger.sender.Event("hi!", (long) 0, strMap4);
        // The following exception was thrown during execution in test generation
        try {
            eventTemplate0.write(packer1, event5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(eventTemplate0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("", "", (int) '4');
        boolean boolean4 = fluentLogger3.isConnected();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = fluentLogger3.log("null", strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        boolean boolean5 = nullSender4.isConnected();
        nullSender4.flush();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        org.fluentd.logger.sender.Event.EventTemplate eventTemplate0 = null;
        org.fluentd.logger.sender.Event.EventTemplate.INSTANCE = eventTemplate0;
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector1 = new org.fluentd.logger.sender.ConstantDelayReconnector((int) (short) 1);
        constantDelayReconnector1.addErrorHistory(0L);
        constantDelayReconnector1.clearErrorHistory();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender4.close();
        nullSender4.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        boolean boolean10 = nullSender4.emit("null", 1L, strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        org.fluentd.logger.sender.Event event0 = new org.fluentd.logger.sender.Event();
        event0.tag = "org.fluentd.logger.sender.NullSender";
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector5 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        org.fluentd.logger.FluentLogger fluentLogger6 = null; // flaky: org.fluentd.logger.FluentLogger.getLogger("hi!", "", (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, (org.fluentd.logger.sender.Reconnector) exponentialDelayReconnector5);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             fluentLogger6.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender4.close();
        nullSender4.flush();
        nullSender4.flush();
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler8 = null;
        nullSender4.setErrorHandler(errorHandler8);
        boolean boolean10 = nullSender4.isConnected();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        java.lang.String str0 = org.fluentd.logger.Constants.FLUENT_RECONNECTOR_CLASS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fluentd.logger.reconnector.class" + "'", str0, "fluentd.logger.reconnector.class");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        org.fluentd.logger.sender.Event.EventTemplate eventTemplate0 = org.fluentd.logger.sender.Event.EventTemplate.INSTANCE;
        org.msgpack.packer.Packer packer1 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        org.fluentd.logger.sender.Event event5 = new org.fluentd.logger.sender.Event("hi!", (long) 0, strMap4);
        // The following exception was thrown during execution in test generation
        try {
            eventTemplate0.write(packer1, event5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(eventTemplate0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        org.fluentd.logger.FluentLogger fluentLogger3 = null; // flaky: org.fluentd.logger.FluentLogger.getLogger("_97_3000_8388608", "hi!", (int) (short) 1);
// flaky:         fluentLogger3.finalize();
        boolean boolean9 = fluentLogger3.log("org.fluentd.logger.sender.NullSender", "null", (java.lang.Object) (-1L), (long) (short) 100);
        org.junit.Assert.assertNotNull(fluentLogger3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender4.close();
        nullSender4.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        boolean boolean9 = nullSender4.emit("fluentd.logger.sender.class", strMap8);
        boolean boolean10 = nullSender4.isConnected();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector5 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        org.fluentd.logger.FluentLogger fluentLogger6 = null; // flaky: org.fluentd.logger.FluentLogger.getLogger("hi!", "", (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, (org.fluentd.logger.sender.Reconnector) exponentialDelayReconnector5);
        java.lang.String str7 = null; // flaky: fluentLogger6.toString();
        org.fluentd.logger.sender.Sender sender8 = fluentLogger6.getSender();
        // The following exception was thrown during execution in test generation
        try {
            sender8.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}" + "'", str7, "org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}");
        org.junit.Assert.assertNotNull(sender8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("", "", (int) '4');
        boolean boolean4 = fluentLogger3.isConnected();
        org.fluentd.logger.sender.Sender sender5 = fluentLogger3.getSender();
        org.junit.Assert.assertNotNull(fluentLogger3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertNull(sender5);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        org.fluentd.logger.sender.Event event2 = new org.fluentd.logger.sender.Event("hi!", strMap1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = null; // flaky: new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        java.lang.String str3 = null; // flaky: rawSocketSender2.getName();
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rawSocketSender2.setErrorHandler(errorHandler4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: errorHandler is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_97_3000_8388608" + "'", str3, "_97_3000_8388608");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = null; // flaky: new org.fluentd.logger.sender.RawSocketSender("_97_3000_8388608", (int) (byte) 100);
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler3 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             rawSocketSender2.setErrorHandler(errorHandler3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: errorHandler is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        org.fluentd.logger.sender.Event.EventTemplate eventTemplate0 = new org.fluentd.logger.sender.Event.EventTemplate();
        org.fluentd.logger.sender.Event.EventTemplate.INSTANCE = eventTemplate0;
        org.msgpack.unpacker.Unpacker unpacker2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        org.fluentd.logger.sender.Event event6 = new org.fluentd.logger.sender.Event("hi!", (long) 0, strMap5);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = event6.data;
        // The following exception was thrown during execution in test generation
        try {
            org.fluentd.logger.sender.Event event9 = eventTemplate0.read(unpacker2, event6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Don't need the operation");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = rawSocketSender2.emit("null", (long) (short) -1, strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", 10);
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler3 = null;
        // The following exception was thrown during execution in test generation
        try {
            rawSocketSender2.setErrorHandler(errorHandler3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: errorHandler is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        org.fluentd.logger.sender.Event.EventTemplate eventTemplate0 = org.fluentd.logger.sender.Event.EventTemplate.INSTANCE;
        org.msgpack.unpacker.Unpacker unpacker1 = null;
        org.fluentd.logger.sender.Event event2 = new org.fluentd.logger.sender.Event();
        event2.timestamp = (byte) 100;
        java.lang.String str5 = event2.tag;
        event2.tag = "org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}";
        // The following exception was thrown during execution in test generation
        try {
            org.fluentd.logger.sender.Event event9 = eventTemplate0.read(unpacker1, event2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Don't need the operation");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(eventTemplate0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender4.close();
        nullSender4.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        boolean boolean9 = nullSender4.emit("fluentd.logger.sender.class", strMap8);
        nullSender4.removeErrorHandler();
        nullSender4.close();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        java.lang.String str3 = rawSocketSender2.getName();
        boolean boolean4 = rawSocketSender2.isConnected();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = rawSocketSender2.emit("fluentd.logger.sender.class", (long) (short) 1, strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_97_3000_8388608" + "'", str3, "_97_3000_8388608");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector5 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        org.fluentd.logger.FluentLogger fluentLogger6 = org.fluentd.logger.FluentLogger.getLogger("hi!", "", (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, (org.fluentd.logger.sender.Reconnector) exponentialDelayReconnector5);
        // The following exception was thrown during execution in test generation
        try {
            fluentLogger6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("fluentd.logger.sender.class", (int) (byte) 100, 100, 10);
        java.lang.String str5 = nullSender4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        org.fluentd.logger.sender.Event event0 = new org.fluentd.logger.sender.Event();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = event0.data;
        event0.timestamp = (short) -1;
        org.junit.Assert.assertNull(strMap1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        org.fluentd.logger.FluentLogger fluentLogger5 = org.fluentd.logger.FluentLogger.getLogger("fluentd.logger.sender.class", "_97_3000_8388608", (int) (byte) 10, (int) (short) -1, (int) (byte) 0);
        fluentLogger5.finalize();
        org.junit.Assert.assertNotNull(fluentLogger5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector5 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        boolean boolean7 = exponentialDelayReconnector5.enableReconnection((long) ' ');
        exponentialDelayReconnector5.addErrorHistory(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.fluentd.logger.FluentLogger fluentLogger10 = org.fluentd.logger.FluentLogger.getLogger("null", "_97_3000_8388608", (int) (short) -1, (int) (short) 10, (-1), (org.fluentd.logger.sender.Reconnector) exponentialDelayReconnector5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        org.fluentd.logger.FluentLogger fluentLogger1 = org.fluentd.logger.FluentLogger.getLogger("_97_3000_8388608_97_0_100");
        org.junit.Assert.assertNotNull(fluentLogger1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        org.fluentd.logger.FluentLogger fluentLogger5 = org.fluentd.logger.FluentLogger.getLogger("_97_3000_8388608", "hi!", (int) (short) 10, (int) (byte) -1, 10);
        java.lang.String str6 = fluentLogger5.getName();
        org.junit.Assert.assertNotNull(fluentLogger5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_97_3000_8388608_hi!_10_-1_10" + "'", str6, "_97_3000_8388608_hi!_10_-1_10");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        java.lang.String str3 = rawSocketSender2.getName();
        rawSocketSender2.close();
        rawSocketSender2.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = rawSocketSender2.emit("fluentd.logger.reconnector.class", strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_97_3000_8388608" + "'", str3, "_97_3000_8388608");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.fluentd.logger.sender.Event event3 = new org.fluentd.logger.sender.Event("hi!", (long) (short) 100, strMap2);
        java.lang.String str4 = event3.tag;
        java.lang.String str5 = event3.tag;
        long long6 = event3.timestamp;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector1 = new org.fluentd.logger.sender.ConstantDelayReconnector((int) (short) 1);
        constantDelayReconnector1.addErrorHistory((long) (short) 1);
        constantDelayReconnector1.addErrorHistory((long) (short) 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender4.close();
        nullSender4.flush();
        boolean boolean7 = nullSender4.isConnected();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        java.lang.String str3 = rawSocketSender2.getName();
        boolean boolean4 = rawSocketSender2.isConnected();
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rawSocketSender2.setErrorHandler(errorHandler5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: errorHandler is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_97_3000_8388608" + "'", str3, "_97_3000_8388608");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        java.lang.String str5 = nullSender4.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        boolean boolean8 = nullSender4.emit("null", strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        boolean boolean12 = nullSender4.emit("_97_3000_8388608", (long) 10, strMap11);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.fluentd.logger.sender.NullSender" + "'", str5, "org.fluentd.logger.sender.NullSender");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("_97_3000_8388608", "hi!", (int) (short) 1);
        org.fluentd.logger.sender.Sender sender4 = fluentLogger3.getSender();
        org.junit.Assert.assertNotNull(fluentLogger3);
        org.junit.Assert.assertNotNull(sender4);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector5 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        boolean boolean7 = exponentialDelayReconnector5.enableReconnection((long) 1);
        org.fluentd.logger.FluentLogger fluentLogger8 = org.fluentd.logger.FluentLogger.getLogger("null", "org.fluentd.logger.sender.NullSender", (int) (byte) 1, (int) (short) 1, (int) (short) 1, (org.fluentd.logger.sender.Reconnector) exponentialDelayReconnector5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fluentLogger8);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender4.close();
        nullSender4.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        boolean boolean9 = nullSender4.emit("fluentd.logger.sender.class", strMap8);
        boolean boolean10 = nullSender4.isConnected();
        nullSender4.removeErrorHandler();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("_97_3000_8388608", "hi!", (int) (short) 1);
        fluentLogger3.finalize();
        java.lang.String str5 = fluentLogger3.getName();
        org.fluentd.logger.sender.Sender sender6 = fluentLogger3.getSender();
        sender6.flush();
        org.junit.Assert.assertNotNull(fluentLogger3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_97_3000_8388608_hi!_1_3000_1048576" + "'", str5, "_97_3000_8388608_hi!_1_3000_1048576");
        org.junit.Assert.assertNotNull(sender6);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector0 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        boolean boolean2 = exponentialDelayReconnector0.enableReconnection((long) ' ');
        exponentialDelayReconnector0.addErrorHistory((long) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("", "", (int) '4');
        boolean boolean4 = fluentLogger3.isConnected();
        fluentLogger3.removeErrorHandler();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = fluentLogger3.log("fluentd.logger.sender.class", strMap7, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        java.lang.String str3 = rawSocketSender2.getName();
        rawSocketSender2.close();
        rawSocketSender2.flush();
        rawSocketSender2.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = rawSocketSender2.emit("_97_3000_8388608_hi!_10_-1_10", (long) ' ', strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_97_3000_8388608" + "'", str3, "_97_3000_8388608");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        org.fluentd.logger.sender.Event.EventTemplate eventTemplate0 = new org.fluentd.logger.sender.Event.EventTemplate();
        org.msgpack.packer.Packer packer1 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        org.fluentd.logger.sender.Event event5 = new org.fluentd.logger.sender.Event("hi!", (long) 0, strMap4);
        java.lang.String str6 = event5.tag;
        // The following exception was thrown during execution in test generation
        try {
            eventTemplate0.write(packer1, event5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        // The following exception was thrown during execution in test generation
        try {
            org.fluentd.logger.FluentLogger fluentLogger5 = org.fluentd.logger.FluentLogger.getLogger("_97_3000_8388608_97_0_100", "_97_3000_8388608_hi!_10_-1_10", 1, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.fluentd.logger.sender.Event event3 = new org.fluentd.logger.sender.Event("hi!", (long) 0, strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = event3.data;
        event3.tag = "_97_3000_8388608";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = event3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector5 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        org.fluentd.logger.FluentLogger fluentLogger6 = org.fluentd.logger.FluentLogger.getLogger("hi!", "", (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, (org.fluentd.logger.sender.Reconnector) exponentialDelayReconnector5);
        fluentLogger6.removeErrorHandler();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = fluentLogger6.log("_97_3000_8388608", strMap9, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.fluentd.logger.sender.Event event3 = new org.fluentd.logger.sender.Event("org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", 1L, strMap2);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector1 = new org.fluentd.logger.sender.ConstantDelayReconnector((int) (short) 1);
        constantDelayReconnector1.addErrorHistory((long) (short) 1);
        boolean boolean4 = constantDelayReconnector1.isErrorHistoryEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        org.fluentd.logger.sender.Event.EventTemplate eventTemplate0 = org.fluentd.logger.sender.Event.EventTemplate.INSTANCE;
        org.fluentd.logger.sender.Event.EventTemplate.INSTANCE = eventTemplate0;
        org.msgpack.unpacker.Unpacker unpacker2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        org.fluentd.logger.sender.Event event6 = new org.fluentd.logger.sender.Event("hi!", (long) 0, strMap5);
        event6.tag = "org.fluentd.logger.sender.NullSender";
        // The following exception was thrown during execution in test generation
        try {
            org.fluentd.logger.sender.Event event10 = eventTemplate0.read(unpacker2, event6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Don't need the operation");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(eventTemplate0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        fluentLoggerFactory0.closeAll();
        org.fluentd.logger.FluentLogger fluentLogger7 = fluentLoggerFactory0.getLogger("org.fluentd.logger.sender.NullSender", "org.fluentd.logger.sender.NullSender", (int) (byte) 0, (int) ' ', (int) ' ');
        fluentLogger7.flush();
        java.lang.String str9 = fluentLogger7.toString();
        org.fluentd.logger.sender.Sender sender10 = fluentLogger7.getSender();
        org.junit.Assert.assertNotNull(fluentLogger7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.fluentd.logger.FluentLogger{tagPrefix=org.fluentd.logger.sender.NullSender,sender=org.fluentd.logger.sender.NullSender_0_32_32}" + "'", str9, "org.fluentd.logger.FluentLogger{tagPrefix=org.fluentd.logger.sender.NullSender,sender=org.fluentd.logger.sender.NullSender_0_32_32}");
        org.junit.Assert.assertNotNull(sender10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("fluentd.logger.sender.class", "_97_3000_8388608_hi!_1_3000_1048576", 100);
        org.junit.Assert.assertNotNull(fluentLogger3);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        java.lang.String str3 = rawSocketSender2.getName();
        rawSocketSender2.close();
        rawSocketSender2.removeErrorHandler();
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rawSocketSender2.setErrorHandler(errorHandler6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: errorHandler is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_97_3000_8388608" + "'", str3, "_97_3000_8388608");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender4.close();
        nullSender4.flush();
        java.lang.String str7 = nullSender4.toString();
        boolean boolean8 = nullSender4.isConnected();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.fluentd.logger.sender.NullSender" + "'", str7, "org.fluentd.logger.sender.NullSender");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender4 = new org.fluentd.logger.sender.RawSocketSender("_97_3000_8388608", (int) 'a', (int) (short) 0, (int) (byte) 100);
        java.lang.String str5 = rawSocketSender4.getName();
        rawSocketSender4.close();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_97_3000_8388608_97_0_100" + "'", str5, "_97_3000_8388608_97_0_100");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender4 = new org.fluentd.logger.sender.RawSocketSender("_97_3000_8388608", (int) 'a', (int) (short) 0, (int) (byte) 100);
        rawSocketSender4.removeErrorHandler();
        boolean boolean6 = rawSocketSender4.isConnected();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("", "", (int) '4');
        boolean boolean4 = fluentLogger3.isConnected();
        fluentLogger3.close();
        org.junit.Assert.assertNotNull(fluentLogger3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        org.fluentd.logger.FluentLogger fluentLogger5 = org.fluentd.logger.FluentLogger.getLogger("_97_3000_8388608", "hi!", (int) (short) 10, (int) (byte) -1, 10);
        org.fluentd.logger.sender.NullSender nullSender12 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        boolean boolean13 = nullSender12.isConnected();
        java.lang.String str14 = nullSender12.getName();
        boolean boolean15 = nullSender12.isConnected();
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler16 = null;
        nullSender12.setErrorHandler(errorHandler16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = fluentLogger5.log("_97_3000_8388608_hi!_1_3000_1048576", "_97_3000_8388608", (java.lang.Object) nullSender12, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null" + "'", str14, "null");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector0 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        boolean boolean1 = exponentialDelayReconnector0.isErrorHistoryEmpty();
        exponentialDelayReconnector0.clearErrorHistory();
        boolean boolean3 = exponentialDelayReconnector0.isErrorHistoryEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector0 = new org.fluentd.logger.sender.ConstantDelayReconnector();
        constantDelayReconnector0.addErrorHistory((long) (byte) 10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        org.fluentd.logger.sender.Event event2 = new org.fluentd.logger.sender.Event("org.fluentd.logger.FluentLogger{tagPrefix=org.fluentd.logger.sender.NullSender,sender=org.fluentd.logger.sender.NullSender_0_32_32}", strMap1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector0 = new org.fluentd.logger.sender.ConstantDelayReconnector();
        constantDelayReconnector0.clearErrorHistory();
        boolean boolean2 = constantDelayReconnector0.isErrorHistoryEmpty();
        constantDelayReconnector0.clearErrorHistory();
        constantDelayReconnector0.addErrorHistory((long) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        java.lang.String str3 = rawSocketSender2.getName();
        rawSocketSender2.close();
        rawSocketSender2.removeErrorHandler();
        java.lang.String str6 = rawSocketSender2.getName();
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rawSocketSender2.setErrorHandler(errorHandler7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: errorHandler is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_97_3000_8388608" + "'", str3, "_97_3000_8388608");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_97_3000_8388608" + "'", str6, "_97_3000_8388608");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        org.fluentd.logger.sender.Event event2 = new org.fluentd.logger.sender.Event("null", strMap1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector6 = new org.fluentd.logger.sender.ConstantDelayReconnector();
        constantDelayReconnector6.clearErrorHistory();
        constantDelayReconnector6.clearErrorHistory();
        org.fluentd.logger.FluentLogger fluentLogger9 = fluentLoggerFactory0.getLogger("", "org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", (int) (byte) 100, (int) '#', (int) (short) 100, (org.fluentd.logger.sender.Reconnector) constantDelayReconnector6);
        org.fluentd.logger.FluentLogger fluentLogger13 = fluentLoggerFactory0.getLogger("_97_3000_8388608", "org.fluentd.logger.sender.NullSender", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fluentLoggerFactory0.flushAll();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger9);
        org.junit.Assert.assertNotNull(fluentLogger13);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.fluentd.logger.sender.Event event3 = new org.fluentd.logger.sender.Event("hi!", (long) 0, strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = event3.data;
        long long5 = event3.timestamp;
        event3.timestamp = (short) 10;
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector6 = new org.fluentd.logger.sender.ConstantDelayReconnector();
        constantDelayReconnector6.clearErrorHistory();
        constantDelayReconnector6.clearErrorHistory();
        org.fluentd.logger.FluentLogger fluentLogger9 = fluentLoggerFactory0.getLogger("", "org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", (int) (byte) 100, (int) '#', (int) (short) 100, (org.fluentd.logger.sender.Reconnector) constantDelayReconnector6);
        org.fluentd.logger.FluentLogger fluentLogger13 = fluentLoggerFactory0.getLogger("_97_3000_8388608", "org.fluentd.logger.sender.NullSender", (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = fluentLogger13.log("org.fluentd.logger.sender.NullSender_org.fluentd.logger.sender.NullSender_0_32_32", strMap15, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger9);
        org.junit.Assert.assertNotNull(fluentLogger13);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        org.fluentd.logger.sender.Event.EventTemplate eventTemplate0 = org.fluentd.logger.sender.Event.EventTemplate.INSTANCE;
        org.fluentd.logger.sender.Event.EventTemplate.INSTANCE = eventTemplate0;
        org.msgpack.unpacker.Unpacker unpacker2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        org.fluentd.logger.sender.Event event6 = new org.fluentd.logger.sender.Event("hi!", (long) (short) 100, strMap5);
        java.lang.String str7 = event6.tag;
        java.lang.String str8 = event6.tag;
        // The following exception was thrown during execution in test generation
        try {
            org.fluentd.logger.sender.Event event10 = eventTemplate0.read(unpacker2, event6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Don't need the operation");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(eventTemplate0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("_97_3000_8388608", "hi!", (int) (short) 1);
        fluentLogger3.flush();
        org.fluentd.logger.sender.Sender sender5 = fluentLogger3.getSender();
        org.junit.Assert.assertNotNull(fluentLogger3);
        org.junit.Assert.assertNotNull(sender5);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender4.close();
        nullSender4.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        boolean boolean9 = nullSender4.emit("fluentd.logger.sender.class", strMap8);
        nullSender4.flush();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender4.close();
        nullSender4.close();
        java.lang.String str7 = nullSender4.getName();
        nullSender4.removeErrorHandler();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.fluentd.logger.sender.Event event3 = new org.fluentd.logger.sender.Event("hi!", (long) 0, strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = event3.data;
        event3.timestamp = '4';
        event3.timestamp = 1;
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        org.fluentd.logger.sender.Event.EventTemplate eventTemplate0 = org.fluentd.logger.sender.Event.EventTemplate.INSTANCE;
        org.msgpack.unpacker.Unpacker unpacker1 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        org.fluentd.logger.sender.Event event5 = new org.fluentd.logger.sender.Event("hi!", (long) (short) 100, strMap4);
        java.lang.String str6 = event5.tag;
        java.lang.String str7 = event5.tag;
        // The following exception was thrown during execution in test generation
        try {
            org.fluentd.logger.sender.Event event8 = eventTemplate0.read(unpacker1, event5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Don't need the operation");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(eventTemplate0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.fluentd.logger.sender.Event event3 = new org.fluentd.logger.sender.Event("hi!", (long) 0, strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = event3.data;
        long long5 = event3.timestamp;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = event3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("_97_3000_8388608", "hi!", (int) (short) 1);
        fluentLogger3.finalize();
        java.lang.String str5 = fluentLogger3.getName();
        fluentLogger3.flush();
        org.fluentd.logger.sender.Sender sender7 = fluentLogger3.getSender();
        java.lang.String str8 = sender7.getName();
        org.junit.Assert.assertNotNull(fluentLogger3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_97_3000_8388608_hi!_1_3000_1048576" + "'", str5, "_97_3000_8388608_hi!_1_3000_1048576");
        org.junit.Assert.assertNotNull(sender7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!_1_3000_1048576" + "'", str8, "hi!_1_3000_1048576");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector5 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        org.fluentd.logger.FluentLogger fluentLogger6 = org.fluentd.logger.FluentLogger.getLogger("hi!", "", (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, (org.fluentd.logger.sender.Reconnector) exponentialDelayReconnector5);
        java.lang.String str7 = fluentLogger6.toString();
        org.fluentd.logger.sender.Sender sender8 = fluentLogger6.getSender();
        sender8.removeErrorHandler();
        sender8.removeErrorHandler();
        org.junit.Assert.assertNotNull(fluentLogger6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}" + "'", str7, "org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}");
        org.junit.Assert.assertNotNull(sender8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        org.fluentd.logger.sender.Event.EventTemplate eventTemplate0 = org.fluentd.logger.sender.Event.EventTemplate.INSTANCE;
        org.msgpack.unpacker.Unpacker unpacker1 = null;
        org.fluentd.logger.sender.Event event2 = new org.fluentd.logger.sender.Event();
        // The following exception was thrown during execution in test generation
        try {
            org.fluentd.logger.sender.Event event3 = eventTemplate0.read(unpacker1, event2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Don't need the operation");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(eventTemplate0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        org.fluentd.logger.sender.Event.EventTemplate eventTemplate0 = org.fluentd.logger.sender.Event.EventTemplate.INSTANCE;
        org.msgpack.unpacker.Unpacker unpacker1 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        org.fluentd.logger.sender.Event event5 = new org.fluentd.logger.sender.Event("hi!", (long) 0, strMap4);
        event5.tag = "org.fluentd.logger.sender.NullSender";
        // The following exception was thrown during execution in test generation
        try {
            org.fluentd.logger.sender.Event event8 = eventTemplate0.read(unpacker1, event5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Don't need the operation");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(eventTemplate0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector6 = new org.fluentd.logger.sender.ConstantDelayReconnector();
        constantDelayReconnector6.clearErrorHistory();
        constantDelayReconnector6.clearErrorHistory();
        org.fluentd.logger.FluentLogger fluentLogger9 = fluentLoggerFactory0.getLogger("", "org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", (int) (byte) 100, (int) '#', (int) (short) 100, (org.fluentd.logger.sender.Reconnector) constantDelayReconnector6);
        org.fluentd.logger.FluentLogger fluentLogger13 = fluentLoggerFactory0.getLogger("", "null", (int) (byte) 10);
        org.fluentd.logger.sender.Sender sender14 = fluentLogger13.getSender();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = fluentLogger13.log("hi!_100_1_52", strMap16, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger9);
        org.junit.Assert.assertNotNull(fluentLogger13);
        org.junit.Assert.assertNotNull(sender14);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("org.fluentd.logger.sender.NullSender", "hi!_100_1_52", (int) (short) 100);
        org.junit.Assert.assertNotNull(fluentLogger3);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector1 = new org.fluentd.logger.sender.ConstantDelayReconnector((int) (byte) -1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender4 = new org.fluentd.logger.sender.RawSocketSender("fluentd.logger.reconnector.class", (int) '#', (-1), (int) (byte) 1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector5 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        org.fluentd.logger.FluentLogger fluentLogger6 = org.fluentd.logger.FluentLogger.getLogger("hi!", "", (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, (org.fluentd.logger.sender.Reconnector) exponentialDelayReconnector5);
        java.lang.String str7 = fluentLogger6.toString();
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = fluentLogger6.log("_97_3000_8388608", "org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", obj10, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}" + "'", str7, "org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector6 = new org.fluentd.logger.sender.ConstantDelayReconnector();
        constantDelayReconnector6.clearErrorHistory();
        constantDelayReconnector6.clearErrorHistory();
        org.fluentd.logger.FluentLogger fluentLogger9 = fluentLoggerFactory0.getLogger("", "org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", (int) (byte) 100, (int) '#', (int) (short) 100, (org.fluentd.logger.sender.Reconnector) constantDelayReconnector6);
        org.fluentd.logger.FluentLogger fluentLogger13 = fluentLoggerFactory0.getLogger("", "null", (int) (byte) 10);
        java.lang.String str14 = fluentLogger13.toString();
        org.junit.Assert.assertNotNull(fluentLogger9);
        org.junit.Assert.assertNotNull(fluentLogger13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.fluentd.logger.FluentLogger{tagPrefix=,sender=null_10_3000_1048576}" + "'", str14, "org.fluentd.logger.FluentLogger{tagPrefix=,sender=null_10_3000_1048576}");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        fluentLoggerFactory0.closeAll();
        fluentLoggerFactory0.closeAll();
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector9 = new org.fluentd.logger.sender.ConstantDelayReconnector((int) ' ');
        constantDelayReconnector9.clearErrorHistory();
        org.fluentd.logger.FluentLogger fluentLogger11 = fluentLoggerFactory0.getLogger("_97_3000_8388608", "org.fluentd.logger.FluentLogger{tagPrefix=org.fluentd.logger.sender.NullSender,sender=org.fluentd.logger.sender.NullSender_0_32_32}", (int) (byte) 0, 1, 10, (org.fluentd.logger.sender.Reconnector) constantDelayReconnector9);
        org.junit.Assert.assertNotNull(fluentLogger11);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("_97_3000_8388608", "hi!", (int) (short) 1);
        fluentLogger3.finalize();
        boolean boolean5 = fluentLogger3.isConnected();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = fluentLogger3.log("org.fluentd.logger.FluentLogger{tagPrefix=org.fluentd.logger.sender.NullSender,sender=org.fluentd.logger.sender.NullSender_0_32_32}", strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector6 = new org.fluentd.logger.sender.ConstantDelayReconnector((int) (short) 1);
        constantDelayReconnector6.addErrorHistory((long) (short) 1);
        org.fluentd.logger.FluentLogger fluentLogger9 = org.fluentd.logger.FluentLogger.getLogger("_97_3000_8388608_hi!_10_-1_10", "fluentd.logger.sender.class", (int) (byte) 100, (int) '4', 0, (org.fluentd.logger.sender.Reconnector) constantDelayReconnector6);
        fluentLogger9.flush();
        org.junit.Assert.assertNotNull(fluentLogger9);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector6 = new org.fluentd.logger.sender.ConstantDelayReconnector();
        constantDelayReconnector6.clearErrorHistory();
        constantDelayReconnector6.clearErrorHistory();
        org.fluentd.logger.FluentLogger fluentLogger9 = fluentLoggerFactory0.getLogger("", "org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", (int) (byte) 100, (int) '#', (int) (short) 100, (org.fluentd.logger.sender.Reconnector) constantDelayReconnector6);
        org.fluentd.logger.FluentLogger fluentLogger15 = fluentLoggerFactory0.getLogger("hi!_100_1_52", "", 0, (int) (short) 1, (int) (short) 1);
        fluentLoggerFactory0.flushAll();
        org.junit.Assert.assertNotNull(fluentLogger9);
        org.junit.Assert.assertNotNull(fluentLogger15);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        java.lang.String str3 = rawSocketSender2.getName();
        rawSocketSender2.close();
        rawSocketSender2.removeErrorHandler();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = rawSocketSender2.emit("_97_3000_8388608_97_0_100", strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_97_3000_8388608" + "'", str3, "_97_3000_8388608");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        boolean boolean3 = rawSocketSender2.isConnected();
        rawSocketSender2.close();
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rawSocketSender2.setErrorHandler(errorHandler5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: errorHandler is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender4.close();
        nullSender4.close();
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler7 = null;
        nullSender4.setErrorHandler(errorHandler7);
        nullSender4.close();
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler10 = null;
        nullSender4.setErrorHandler(errorHandler10);
        nullSender4.removeErrorHandler();
        nullSender4.close();
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler14 = null;
        nullSender4.setErrorHandler(errorHandler14);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        java.lang.String str3 = rawSocketSender2.getName();
        rawSocketSender2.close();
        rawSocketSender2.removeErrorHandler();
        java.lang.String str6 = rawSocketSender2.getName();
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rawSocketSender2.setErrorHandler(errorHandler7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: errorHandler is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_97_3000_8388608" + "'", str3, "_97_3000_8388608");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_97_3000_8388608" + "'", str6, "_97_3000_8388608");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector1 = new org.fluentd.logger.sender.ConstantDelayReconnector((int) (short) -1);
        java.lang.Class<?> wildcardClass2 = constantDelayReconnector1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        java.lang.String str5 = nullSender4.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        boolean boolean8 = nullSender4.emit("null", strMap7);
        nullSender4.flush();
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler10 = null;
        nullSender4.setErrorHandler(errorHandler10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.fluentd.logger.sender.NullSender" + "'", str5, "org.fluentd.logger.sender.NullSender");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector1 = new org.fluentd.logger.sender.ConstantDelayReconnector((int) (short) 1);
        boolean boolean3 = constantDelayReconnector1.enableReconnection((-1L));
        constantDelayReconnector1.clearErrorHistory();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender4 = new org.fluentd.logger.sender.RawSocketSender("fluentd.logger.sender.class", (int) '4', 0, (int) '#');
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rawSocketSender4.setErrorHandler(errorHandler5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: errorHandler is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("fluentd.logger.sender.class", (int) (byte) 100, 100, 10);
        nullSender4.removeErrorHandler();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        boolean boolean5 = nullSender4.isConnected();
        java.lang.String str6 = nullSender4.getName();
        boolean boolean7 = nullSender4.isConnected();
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler8 = null;
        nullSender4.setErrorHandler(errorHandler8);
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler10 = null;
        nullSender4.setErrorHandler(errorHandler10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        fluentLoggerFactory0.closeAll();
        org.fluentd.logger.FluentLogger fluentLogger7 = fluentLoggerFactory0.getLogger("org.fluentd.logger.sender.NullSender", "org.fluentd.logger.sender.NullSender", (int) (byte) 0, (int) ' ', (int) ' ');
        java.lang.String str8 = fluentLogger7.getName();
        fluentLogger7.removeErrorHandler();
        org.junit.Assert.assertNotNull(fluentLogger7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.fluentd.logger.sender.NullSender_org.fluentd.logger.sender.NullSender_0_32_32" + "'", str8, "org.fluentd.logger.sender.NullSender_org.fluentd.logger.sender.NullSender_0_32_32");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender4.close();
        nullSender4.close();
        java.lang.String str7 = nullSender4.getName();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        boolean boolean10 = nullSender4.emit("org.fluentd.logger.sender.NullSender", strMap9);
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler11 = null;
        nullSender4.setErrorHandler(errorHandler11);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender4.close();
        nullSender4.removeErrorHandler();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        boolean boolean10 = nullSender4.emit("fluentd.logger.reconnector.class", (long) (short) -1, strMap9);
        java.lang.String str11 = nullSender4.getName();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null" + "'", str11, "null");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector0 = new org.fluentd.logger.sender.ConstantDelayReconnector();
        constantDelayReconnector0.clearErrorHistory();
        constantDelayReconnector0.clearErrorHistory();
        constantDelayReconnector0.clearErrorHistory();
        constantDelayReconnector0.addErrorHistory((long) '4');
        constantDelayReconnector0.addErrorHistory(100L);
        boolean boolean8 = constantDelayReconnector0.isErrorHistoryEmpty();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("fluentd.logger.reconnector.class", "", 10);
        org.junit.Assert.assertNotNull(fluentLogger3);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        org.fluentd.logger.sender.Event.EventTemplate eventTemplate0 = new org.fluentd.logger.sender.Event.EventTemplate();
        org.fluentd.logger.sender.Event.EventTemplate.INSTANCE = eventTemplate0;
        org.msgpack.packer.Packer packer2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        org.fluentd.logger.sender.Event event6 = new org.fluentd.logger.sender.Event("hi!", (long) 0, strMap5);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = event6.data;
        java.lang.String str8 = event6.tag;
        long long9 = event6.timestamp;
        long long10 = event6.timestamp;
        // The following exception was thrown during execution in test generation
        try {
            eventTemplate0.write(packer2, event6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender4.close();
        nullSender4.removeErrorHandler();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        boolean boolean10 = nullSender4.emit("fluentd.logger.reconnector.class", (long) (short) -1, strMap9);
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler11 = null;
        nullSender4.setErrorHandler(errorHandler11);
        nullSender4.removeErrorHandler();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.fluentd.logger.sender.Event event3 = new org.fluentd.logger.sender.Event("hi!", (long) (short) 100, strMap2);
        java.lang.String str4 = event3.tag;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        event3.data = strMap5;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        event3.data = strMap7;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("_97_3000_8388608", "hi!", (int) (short) 1);
        fluentLogger3.flush();
        fluentLogger3.close();
        org.junit.Assert.assertNotNull(fluentLogger3);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        rawSocketSender2.flush();
        rawSocketSender2.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = rawSocketSender2.emit("org.fluentd.logger.sender.NullSender", (long) 'a', strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector9 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        org.fluentd.logger.FluentLogger fluentLogger10 = org.fluentd.logger.FluentLogger.getLogger("hi!", "", (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, (org.fluentd.logger.sender.Reconnector) exponentialDelayReconnector9);
        boolean boolean11 = exponentialDelayReconnector9.isErrorHistoryEmpty();
        boolean boolean12 = exponentialDelayReconnector9.isErrorHistoryEmpty();
        org.fluentd.logger.sender.RawSocketSender rawSocketSender13 = new org.fluentd.logger.sender.RawSocketSender("hi!", (int) (short) 100, 1, (int) '4', (org.fluentd.logger.sender.Reconnector) exponentialDelayReconnector9);
        java.lang.String str14 = rawSocketSender13.toString();
        rawSocketSender13.removeErrorHandler();
        rawSocketSender13.removeErrorHandler();
        org.junit.Assert.assertNotNull(fluentLogger10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!_100_1_52" + "'", str14, "hi!_100_1_52");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        java.lang.String str3 = rawSocketSender2.getName();
        rawSocketSender2.close();
        rawSocketSender2.flush();
        rawSocketSender2.close();
        rawSocketSender2.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = rawSocketSender2.emit("org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_97_3000_8388608" + "'", str3, "_97_3000_8388608");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector6 = new org.fluentd.logger.sender.ConstantDelayReconnector();
        constantDelayReconnector6.clearErrorHistory();
        constantDelayReconnector6.clearErrorHistory();
        org.fluentd.logger.FluentLogger fluentLogger9 = fluentLoggerFactory0.getLogger("", "org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", (int) (byte) 100, (int) '#', (int) (short) 100, (org.fluentd.logger.sender.Reconnector) constantDelayReconnector6);
        org.fluentd.logger.FluentLogger fluentLogger15 = fluentLoggerFactory0.getLogger("hi!_100_1_52", "", 0, (int) (short) 1, (int) (short) 1);
        fluentLogger15.finalize();
        boolean boolean17 = fluentLogger15.isConnected();
        org.junit.Assert.assertNotNull(fluentLogger9);
        org.junit.Assert.assertNotNull(fluentLogger15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector1 = new org.fluentd.logger.sender.ConstantDelayReconnector((int) (short) 100);
        constantDelayReconnector1.addErrorHistory((long) (byte) -1);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector0 = new org.fluentd.logger.sender.ConstantDelayReconnector();
        constantDelayReconnector0.clearErrorHistory();
        constantDelayReconnector0.clearErrorHistory();
        constantDelayReconnector0.clearErrorHistory();
        constantDelayReconnector0.addErrorHistory((long) '4');
        constantDelayReconnector0.addErrorHistory(100L);
        constantDelayReconnector0.clearErrorHistory();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector6 = new org.fluentd.logger.sender.ConstantDelayReconnector();
        constantDelayReconnector6.clearErrorHistory();
        constantDelayReconnector6.clearErrorHistory();
        org.fluentd.logger.FluentLogger fluentLogger9 = fluentLoggerFactory0.getLogger("", "org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", (int) (byte) 100, (int) '#', (int) (short) 100, (org.fluentd.logger.sender.Reconnector) constantDelayReconnector6);
        org.fluentd.logger.FluentLogger fluentLogger13 = fluentLoggerFactory0.getLogger("", "null", (int) (byte) 10);
        fluentLoggerFactory0.closeAll();
        org.junit.Assert.assertNotNull(fluentLogger9);
        org.junit.Assert.assertNotNull(fluentLogger13);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        java.lang.String str3 = rawSocketSender2.toString();
        rawSocketSender2.flush();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_97_3000_8388608" + "'", str3, "_97_3000_8388608");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.fluentd.logger.sender.Event event3 = new org.fluentd.logger.sender.Event("fluentd.logger.sender.class", (long) (byte) -1, strMap2);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.fluentd.logger.sender.Event event3 = new org.fluentd.logger.sender.Event("org.fluentd.logger.sender.NullSender_org.fluentd.logger.sender.NullSender_0_32_32", (long) (short) 0, strMap2);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        org.fluentd.logger.sender.Event.EventTemplate eventTemplate0 = new org.fluentd.logger.sender.Event.EventTemplate();
        org.fluentd.logger.sender.Event.EventTemplate.INSTANCE = eventTemplate0;
        org.msgpack.unpacker.Unpacker unpacker2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        org.fluentd.logger.sender.Event event5 = new org.fluentd.logger.sender.Event("fluentd.logger.sender.class", strMap4);
        event5.timestamp = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            org.fluentd.logger.sender.Event event8 = eventTemplate0.read(unpacker2, event5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Don't need the operation");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender4.close();
        nullSender4.flush();
        nullSender4.flush();
        java.lang.String str8 = nullSender4.toString();
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler9 = null;
        nullSender4.setErrorHandler(errorHandler9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.fluentd.logger.sender.NullSender" + "'", str8, "org.fluentd.logger.sender.NullSender");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        org.fluentd.logger.sender.Event.EventTemplate eventTemplate0 = org.fluentd.logger.sender.Event.EventTemplate.INSTANCE;
        org.msgpack.packer.Packer packer1 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        org.fluentd.logger.sender.Event event5 = new org.fluentd.logger.sender.Event("hi!", (long) (short) 100, strMap4);
        java.lang.String str6 = event5.tag;
        // The following exception was thrown during execution in test generation
        try {
            eventTemplate0.write(packer1, event5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(eventTemplate0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector6 = new org.fluentd.logger.sender.ConstantDelayReconnector();
        constantDelayReconnector6.clearErrorHistory();
        constantDelayReconnector6.clearErrorHistory();
        org.fluentd.logger.FluentLogger fluentLogger9 = fluentLoggerFactory0.getLogger("", "org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", (int) (byte) 100, (int) '#', (int) (short) 100, (org.fluentd.logger.sender.Reconnector) constantDelayReconnector6);
        fluentLoggerFactory0.closeAll();
        fluentLoggerFactory0.closeAll();
        org.junit.Assert.assertNotNull(fluentLogger9);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("_97_3000_8388608_hi!_1_3000_1048576", "org.fluentd.logger.FluentLogger{tagPrefix=org.fluentd.logger.sender.NullSender,sender=org.fluentd.logger.sender.NullSender_0_32_32}", 1);
        org.junit.Assert.assertNotNull(fluentLogger3);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        org.fluentd.logger.sender.Event.EventTemplate eventTemplate0 = new org.fluentd.logger.sender.Event.EventTemplate();
        org.msgpack.unpacker.Unpacker unpacker1 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        org.fluentd.logger.sender.Event event5 = new org.fluentd.logger.sender.Event("hi!", (long) 0, strMap4);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = event5.data;
        java.lang.String str7 = event5.tag;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = event5.data;
        // The following exception was thrown during execution in test generation
        try {
            org.fluentd.logger.sender.Event event10 = eventTemplate0.read(unpacker1, event5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Don't need the operation");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        boolean boolean3 = rawSocketSender2.isConnected();
        java.lang.String str4 = rawSocketSender2.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_97_3000_8388608" + "'", str4, "_97_3000_8388608");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("", "", (int) '4');
        fluentLogger3.finalize();
        fluentLogger3.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = fluentLogger3.log("org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", strMap7, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger3);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        java.lang.String str5 = nullSender4.toString();
        nullSender4.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        boolean boolean9 = nullSender4.emit("fluentd.logger.reconnector.class", strMap8);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.fluentd.logger.sender.NullSender" + "'", str5, "org.fluentd.logger.sender.NullSender");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.fluentd.logger.sender.Event event3 = new org.fluentd.logger.sender.Event("hi!", (long) 0, strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = event3.data;
        long long5 = event3.timestamp;
        long long6 = event3.timestamp;
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("_97_3000_8388608_hi!_10_-1_10", (int) (short) 1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender4.close();
        nullSender4.close();
        java.lang.String str7 = nullSender4.getName();
        boolean boolean8 = nullSender4.isConnected();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("", "", (int) '4');
        fluentLogger3.finalize();
        fluentLogger3.close();
        fluentLogger3.removeErrorHandler();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = fluentLogger3.log("org.fluentd.logger.FluentLogger{tagPrefix=,sender=null_10_3000_1048576}", strMap8, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger3);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender4 = new org.fluentd.logger.sender.RawSocketSender("", 0, (int) (short) -1, (int) '#');
        java.lang.String str5 = rawSocketSender4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_0_-1_35" + "'", str5, "_0_-1_35");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        org.fluentd.logger.sender.Event.EventTemplate eventTemplate0 = org.fluentd.logger.sender.Event.EventTemplate.INSTANCE;
        org.msgpack.packer.Packer packer1 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        org.fluentd.logger.sender.Event event4 = new org.fluentd.logger.sender.Event("fluentd.logger.sender.class", strMap3);
        event4.timestamp = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            eventTemplate0.write(packer1, event4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(eventTemplate0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector0 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        boolean boolean2 = exponentialDelayReconnector0.enableReconnection((long) ' ');
        boolean boolean3 = exponentialDelayReconnector0.isErrorHistoryEmpty();
        exponentialDelayReconnector0.clearErrorHistory();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector6 = new org.fluentd.logger.sender.ConstantDelayReconnector();
        constantDelayReconnector6.clearErrorHistory();
        constantDelayReconnector6.clearErrorHistory();
        org.fluentd.logger.FluentLogger fluentLogger9 = fluentLoggerFactory0.getLogger("", "org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", (int) (byte) 100, (int) '#', (int) (short) 100, (org.fluentd.logger.sender.Reconnector) constantDelayReconnector6);
        org.fluentd.logger.FluentLogger fluentLogger13 = fluentLoggerFactory0.getLogger("", "null", (int) (byte) 10);
        org.fluentd.logger.FluentLogger fluentLogger15 = fluentLoggerFactory0.getLogger("org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}");
        org.junit.Assert.assertNotNull(fluentLogger9);
        org.junit.Assert.assertNotNull(fluentLogger13);
        org.junit.Assert.assertNotNull(fluentLogger15);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.fluentd.logger.sender.Event event3 = new org.fluentd.logger.sender.Event("_97_3000_8388608_hi!_10_-1_10", (long) 1, strMap2);
        java.lang.String str4 = event3.tag;
        java.lang.String str5 = event3.tag;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_97_3000_8388608_hi!_10_-1_10" + "'", str4, "_97_3000_8388608_hi!_10_-1_10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_97_3000_8388608_hi!_10_-1_10" + "'", str5, "_97_3000_8388608_hi!_10_-1_10");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.fluentd.logger.sender.Event event3 = new org.fluentd.logger.sender.Event("hi!", (long) (short) 100, strMap2);
        java.lang.String str4 = event3.tag;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = event3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        org.fluentd.logger.FluentLogger fluentLogger1 = org.fluentd.logger.FluentLogger.getLogger("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = fluentLogger1.log("fluentd.logger.reconnector.class", strMap3, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger1);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector6 = new org.fluentd.logger.sender.ConstantDelayReconnector((int) ' ');
        constantDelayReconnector6.clearErrorHistory();
        org.fluentd.logger.FluentLogger fluentLogger8 = org.fluentd.logger.FluentLogger.getLogger("org.fluentd.logger.FluentLogger{tagPrefix=,sender=null_10_3000_1048576}", "_97_3000_8388608", (int) (byte) 0, (int) 'a', (int) (short) 10, (org.fluentd.logger.sender.Reconnector) constantDelayReconnector6);
        boolean boolean10 = constantDelayReconnector6.enableReconnection(10L);
        org.junit.Assert.assertNotNull(fluentLogger8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender4.close();
        nullSender4.close();
        java.lang.String str7 = nullSender4.getName();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        boolean boolean10 = nullSender4.emit("org.fluentd.logger.sender.NullSender", strMap9);
        boolean boolean11 = nullSender4.isConnected();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector5 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        boolean boolean6 = exponentialDelayReconnector5.isErrorHistoryEmpty();
        exponentialDelayReconnector5.clearErrorHistory();
        exponentialDelayReconnector5.clearErrorHistory();
        boolean boolean9 = exponentialDelayReconnector5.isErrorHistoryEmpty();
        org.fluentd.logger.FluentLogger fluentLogger10 = org.fluentd.logger.FluentLogger.getLogger("_97_3000_8388608_hi!_1_3000_1048576", "_97_3000_8388608_hi!_1_3000_1048576", (int) (byte) 10, (int) (short) -1, (int) ' ', (org.fluentd.logger.sender.Reconnector) exponentialDelayReconnector5);
        boolean boolean12 = exponentialDelayReconnector5.enableReconnection(10L);
        java.lang.Class<?> wildcardClass13 = exponentialDelayReconnector5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(fluentLogger10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector6 = new org.fluentd.logger.sender.ConstantDelayReconnector((int) ' ');
        constantDelayReconnector6.clearErrorHistory();
        boolean boolean9 = constantDelayReconnector6.enableReconnection((long) (short) 100);
        constantDelayReconnector6.addErrorHistory((long) (short) 10);
        org.fluentd.logger.FluentLogger fluentLogger12 = org.fluentd.logger.FluentLogger.getLogger("org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", "_97_3000_8388608", 0, 0, (int) (byte) 10, (org.fluentd.logger.sender.Reconnector) constantDelayReconnector6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(fluentLogger12);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        java.lang.String str3 = rawSocketSender2.getName();
        rawSocketSender2.close();
        rawSocketSender2.flush();
        rawSocketSender2.close();
        rawSocketSender2.flush();
        java.lang.Class<?> wildcardClass8 = rawSocketSender2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_97_3000_8388608" + "'", str3, "_97_3000_8388608");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector0 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        boolean boolean1 = exponentialDelayReconnector0.isErrorHistoryEmpty();
        exponentialDelayReconnector0.clearErrorHistory();
        boolean boolean4 = exponentialDelayReconnector0.enableReconnection(10L);
        boolean boolean6 = exponentialDelayReconnector0.enableReconnection((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        org.fluentd.logger.sender.Event.EventTemplate eventTemplate0 = org.fluentd.logger.sender.Event.EventTemplate.INSTANCE;
        org.msgpack.packer.Packer packer1 = null;
        org.fluentd.logger.sender.Event event2 = new org.fluentd.logger.sender.Event();
        // The following exception was thrown during execution in test generation
        try {
            eventTemplate0.write(packer1, event2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(eventTemplate0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender4 = new org.fluentd.logger.sender.RawSocketSender("_0_-1_35", 1, (int) (short) 10, (int) (short) 100);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender4.close();
        nullSender4.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        boolean boolean10 = nullSender4.emit("org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", (long) (short) -1, strMap9);
        nullSender4.removeErrorHandler();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        org.fluentd.logger.sender.Event.EventTemplate eventTemplate0 = org.fluentd.logger.sender.Event.EventTemplate.INSTANCE;
        org.fluentd.logger.sender.Event.EventTemplate.INSTANCE = eventTemplate0;
        org.msgpack.packer.Packer packer2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        org.fluentd.logger.sender.Event event6 = new org.fluentd.logger.sender.Event("hi!", (long) 0, strMap5);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = event6.data;
        java.lang.String str8 = event6.tag;
        long long9 = event6.timestamp;
        // The following exception was thrown during execution in test generation
        try {
            eventTemplate0.write(packer2, event6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(eventTemplate0);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        java.lang.String str3 = rawSocketSender2.getName();
        rawSocketSender2.close();
        rawSocketSender2.flush();
        rawSocketSender2.close();
        rawSocketSender2.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = rawSocketSender2.emit("", strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_97_3000_8388608" + "'", str3, "_97_3000_8388608");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        org.fluentd.logger.FluentLogger fluentLogger1 = org.fluentd.logger.FluentLogger.getLogger("_97_3000_8388608");
        org.junit.Assert.assertNotNull(fluentLogger1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        org.fluentd.logger.sender.Event.EventTemplate eventTemplate0 = new org.fluentd.logger.sender.Event.EventTemplate();
        org.fluentd.logger.sender.Event.EventTemplate.INSTANCE = eventTemplate0;
        org.fluentd.logger.sender.Event.EventTemplate.INSTANCE = eventTemplate0;
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("org.fluentd.logger.FluentLogger{tagPrefix=org.fluentd.logger.sender.NullSender,sender=org.fluentd.logger.sender.NullSender_0_32_32}", (int) (byte) 0, (int) (byte) 10, (int) (short) 1);
        boolean boolean5 = nullSender4.isConnected();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        org.fluentd.logger.sender.Event event2 = new org.fluentd.logger.sender.Event("fluentd.logger.sender.class", strMap1);
        event2.timestamp = (short) 100;
        event2.timestamp = 0;
        java.lang.String str7 = event2.tag;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fluentd.logger.sender.class" + "'", str7, "fluentd.logger.sender.class");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector0 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        boolean boolean1 = exponentialDelayReconnector0.isErrorHistoryEmpty();
        exponentialDelayReconnector0.clearErrorHistory();
        boolean boolean3 = exponentialDelayReconnector0.isErrorHistoryEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.fluentd.logger.sender.Event event3 = new org.fluentd.logger.sender.Event("hi!", (long) 0, strMap2);
        event3.tag = "org.fluentd.logger.sender.NullSender";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = event3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        org.fluentd.logger.sender.Event event2 = new org.fluentd.logger.sender.Event("_0_-1_35", strMap1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("", "", (int) '4');
        fluentLogger3.finalize();
        fluentLogger3.close();
        org.fluentd.logger.sender.Sender sender6 = fluentLogger3.getSender();
        org.junit.Assert.assertNotNull(fluentLogger3);
        org.junit.Assert.assertNull(sender6);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender4.close();
        nullSender4.removeErrorHandler();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        boolean boolean10 = nullSender4.emit("fluentd.logger.reconnector.class", (long) (short) -1, strMap9);
        nullSender4.flush();
        nullSender4.flush();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        fluentLoggerFactory0.flushAll();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector4 = new org.fluentd.logger.sender.ConstantDelayReconnector();
        constantDelayReconnector4.clearErrorHistory();
        constantDelayReconnector4.clearErrorHistory();
        constantDelayReconnector4.clearErrorHistory();
        org.fluentd.logger.sender.RawSocketSender rawSocketSender8 = new org.fluentd.logger.sender.RawSocketSender("org.fluentd.logger.sender.NullSender", (int) (short) -1, (-1), (int) (byte) 1, (org.fluentd.logger.sender.Reconnector) constantDelayReconnector4);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector1 = new org.fluentd.logger.sender.ConstantDelayReconnector((int) ' ');
        constantDelayReconnector1.clearErrorHistory();
        boolean boolean4 = constantDelayReconnector1.enableReconnection((long) (short) 100);
        boolean boolean6 = constantDelayReconnector1.enableReconnection((long) (short) 0);
        constantDelayReconnector1.addErrorHistory(10L);
        boolean boolean10 = constantDelayReconnector1.enableReconnection((long) (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        org.fluentd.logger.sender.Event event2 = new org.fluentd.logger.sender.Event("_97_3000_8388608_hi!_1_3000_1048576", strMap1);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("org.fluentd.logger.FluentLogger{tagPrefix=org.fluentd.logger.sender.NullSender,sender=org.fluentd.logger.sender.NullSender_0_32_32}", (int) (byte) 0, (int) (byte) 10, (int) (short) 1);
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler5 = null;
        nullSender4.setErrorHandler(errorHandler5);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        boolean boolean5 = nullSender4.isConnected();
        java.lang.String str6 = nullSender4.getName();
        boolean boolean7 = nullSender4.isConnected();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector0 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        boolean boolean2 = exponentialDelayReconnector0.enableReconnection((long) ' ');
        boolean boolean4 = exponentialDelayReconnector0.enableReconnection(1L);
        boolean boolean5 = exponentialDelayReconnector0.isErrorHistoryEmpty();
        boolean boolean6 = exponentialDelayReconnector0.isErrorHistoryEmpty();
        boolean boolean7 = exponentialDelayReconnector0.isErrorHistoryEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector1 = new org.fluentd.logger.sender.ConstantDelayReconnector((int) ' ');
        constantDelayReconnector1.addErrorHistory((long) (byte) 100);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        org.fluentd.logger.FluentLogger fluentLogger1 = org.fluentd.logger.FluentLogger.getLogger("org.fluentd.logger.FluentLogger{tagPrefix=,sender=null_10_3000_1048576}");
        org.junit.Assert.assertNotNull(fluentLogger1);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("", "", (int) '4');
        fluentLogger3.finalize();
        boolean boolean5 = fluentLogger3.isConnected();
        fluentLogger3.removeErrorHandler();
        org.junit.Assert.assertNotNull(fluentLogger3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        java.lang.String str3 = rawSocketSender2.getName();
        rawSocketSender2.close();
        rawSocketSender2.flush();
        rawSocketSender2.close();
        java.lang.String str7 = rawSocketSender2.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = rawSocketSender2.emit("org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_97_3000_8388608" + "'", str3, "_97_3000_8388608");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_97_3000_8388608" + "'", str7, "_97_3000_8388608");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector1 = new org.fluentd.logger.sender.ConstantDelayReconnector((int) ' ');
        constantDelayReconnector1.clearErrorHistory();
        boolean boolean4 = constantDelayReconnector1.enableReconnection((long) (short) 100);
        boolean boolean6 = constantDelayReconnector1.enableReconnection((long) (short) 0);
        boolean boolean8 = constantDelayReconnector1.enableReconnection((-1L));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector14 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        org.fluentd.logger.FluentLogger fluentLogger15 = org.fluentd.logger.FluentLogger.getLogger("hi!", "", (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, (org.fluentd.logger.sender.Reconnector) exponentialDelayReconnector14);
        boolean boolean16 = exponentialDelayReconnector14.isErrorHistoryEmpty();
        boolean boolean17 = exponentialDelayReconnector14.isErrorHistoryEmpty();
        org.fluentd.logger.sender.RawSocketSender rawSocketSender18 = new org.fluentd.logger.sender.RawSocketSender("hi!", (int) (short) 100, 1, (int) '4', (org.fluentd.logger.sender.Reconnector) exponentialDelayReconnector14);
        org.fluentd.logger.FluentLogger fluentLogger19 = org.fluentd.logger.FluentLogger.getLogger("_97_3000_8388608", "hi!_1_3000_1048576", (int) (byte) 0, (int) (byte) 100, 10, (org.fluentd.logger.sender.Reconnector) exponentialDelayReconnector14);
        exponentialDelayReconnector14.clearErrorHistory();
        boolean boolean21 = exponentialDelayReconnector14.isErrorHistoryEmpty();
        org.junit.Assert.assertNotNull(fluentLogger15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fluentLogger19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector4 = new org.fluentd.logger.sender.ConstantDelayReconnector();
        constantDelayReconnector4.clearErrorHistory();
        boolean boolean6 = constantDelayReconnector4.isErrorHistoryEmpty();
        org.fluentd.logger.sender.RawSocketSender rawSocketSender7 = new org.fluentd.logger.sender.RawSocketSender("org.fluentd.logger.sender.NullSender", (int) (short) 1, (int) (short) 1, (int) '#', (org.fluentd.logger.sender.Reconnector) constantDelayReconnector4);
        rawSocketSender7.close();
        boolean boolean9 = rawSocketSender7.isConnected();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        org.fluentd.logger.FluentLogger fluentLogger1 = org.fluentd.logger.FluentLogger.getLogger("org.fluentd.logger.sender.NullSender");
        org.junit.Assert.assertNotNull(fluentLogger1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector1 = new org.fluentd.logger.sender.ConstantDelayReconnector((int) ' ');
        constantDelayReconnector1.clearErrorHistory();
        boolean boolean4 = constantDelayReconnector1.enableReconnection((long) (short) 100);
        constantDelayReconnector1.addErrorHistory((long) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("", "", (int) '4');
        boolean boolean4 = fluentLogger3.isConnected();
        java.lang.Class<?> wildcardClass5 = fluentLogger3.getClass();
        org.junit.Assert.assertNotNull(fluentLogger3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector0 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        boolean boolean2 = exponentialDelayReconnector0.enableReconnection((long) ' ');
        boolean boolean4 = exponentialDelayReconnector0.enableReconnection(1L);
        boolean boolean5 = exponentialDelayReconnector0.isErrorHistoryEmpty();
        boolean boolean7 = exponentialDelayReconnector0.enableReconnection((long) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        fluentLoggerFactory0.closeAll();
        fluentLoggerFactory0.closeAll();
        fluentLoggerFactory0.closeAll();
        fluentLoggerFactory0.closeAll();
        fluentLoggerFactory0.flushAll();
        org.fluentd.logger.FluentLogger fluentLogger11 = fluentLoggerFactory0.getLogger("fluentd.logger.sender.class", "fluentd.logger.sender.class", (int) (short) -1, (int) (byte) 1, 10);
        java.lang.String str12 = fluentLogger11.toString();
        org.junit.Assert.assertNotNull(fluentLogger11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.fluentd.logger.FluentLogger{tagPrefix=fluentd.logger.sender.class,sender=fluentd.logger.sender.class_-1_1_10}" + "'", str12, "org.fluentd.logger.FluentLogger{tagPrefix=fluentd.logger.sender.class,sender=fluentd.logger.sender.class_-1_1_10}");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector0 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        boolean boolean1 = exponentialDelayReconnector0.isErrorHistoryEmpty();
        exponentialDelayReconnector0.clearErrorHistory();
        exponentialDelayReconnector0.clearErrorHistory();
        boolean boolean4 = exponentialDelayReconnector0.isErrorHistoryEmpty();
        boolean boolean6 = exponentialDelayReconnector0.enableReconnection((long) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        fluentLoggerFactory0.closeAll();
        fluentLoggerFactory0.closeAll();
        fluentLoggerFactory0.closeAll();
        org.fluentd.logger.FluentLogger fluentLogger7 = fluentLoggerFactory0.getLogger("org.fluentd.logger.sender.NullSender", "_97_3000_8388608", (int) (short) 1);
        org.fluentd.logger.FluentLogger fluentLogger13 = fluentLoggerFactory0.getLogger("_97_3000_8388608_97_0_100", "hi!_1_3000_1048576", (int) (byte) 100, (int) (byte) 10, 0);
        org.junit.Assert.assertNotNull(fluentLogger7);
        org.junit.Assert.assertNotNull(fluentLogger13);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector6 = new org.fluentd.logger.sender.ConstantDelayReconnector();
        constantDelayReconnector6.clearErrorHistory();
        constantDelayReconnector6.clearErrorHistory();
        org.fluentd.logger.FluentLogger fluentLogger9 = fluentLoggerFactory0.getLogger("", "org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", (int) (byte) 100, (int) '#', (int) (short) 100, (org.fluentd.logger.sender.Reconnector) constantDelayReconnector6);
        fluentLoggerFactory0.closeAll();
        org.fluentd.logger.FluentLogger fluentLogger12 = fluentLoggerFactory0.getLogger("org.fluentd.logger.FluentLogger{tagPrefix=org.fluentd.logger.sender.NullSender,sender=org.fluentd.logger.sender.NullSender_0_32_32}");
        org.junit.Assert.assertNotNull(fluentLogger9);
        org.junit.Assert.assertNotNull(fluentLogger12);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        fluentLoggerFactory0.closeAll();
        org.fluentd.logger.FluentLogger fluentLogger7 = fluentLoggerFactory0.getLogger("org.fluentd.logger.sender.NullSender", "org.fluentd.logger.sender.NullSender", (int) (byte) 0, (int) ' ', (int) ' ');
        fluentLogger7.flush();
        java.lang.String str9 = fluentLogger7.toString();
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fluentLogger7.setErrorHandler(errorHandler10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: errorHandler is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.fluentd.logger.FluentLogger{tagPrefix=org.fluentd.logger.sender.NullSender,sender=org.fluentd.logger.sender.NullSender_0_32_32}" + "'", str9, "org.fluentd.logger.FluentLogger{tagPrefix=org.fluentd.logger.sender.NullSender,sender=org.fluentd.logger.sender.NullSender_0_32_32}");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector4 = new org.fluentd.logger.sender.ConstantDelayReconnector();
        constantDelayReconnector4.clearErrorHistory();
        boolean boolean6 = constantDelayReconnector4.isErrorHistoryEmpty();
        org.fluentd.logger.sender.RawSocketSender rawSocketSender7 = new org.fluentd.logger.sender.RawSocketSender("org.fluentd.logger.sender.NullSender", (int) (short) 1, (int) (short) 1, (int) '#', (org.fluentd.logger.sender.Reconnector) constantDelayReconnector4);
        rawSocketSender7.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = rawSocketSender7.emit("_0_-1_35", strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        java.lang.String str3 = rawSocketSender2.getName();
        rawSocketSender2.close();
        rawSocketSender2.flush();
        rawSocketSender2.close();
        rawSocketSender2.flush();
        rawSocketSender2.removeErrorHandler();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = rawSocketSender2.emit("org.fluentd.logger.FluentLogger{tagPrefix=org.fluentd.logger.sender.NullSender,sender=org.fluentd.logger.sender.NullSender_0_32_32}", (long) 100, strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_97_3000_8388608" + "'", str3, "_97_3000_8388608");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector1 = new org.fluentd.logger.sender.ConstantDelayReconnector((int) (short) 1);
        boolean boolean3 = constantDelayReconnector1.enableReconnection((long) (-1));
        boolean boolean5 = constantDelayReconnector1.enableReconnection((-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector6 = new org.fluentd.logger.sender.ConstantDelayReconnector();
        constantDelayReconnector6.clearErrorHistory();
        constantDelayReconnector6.clearErrorHistory();
        org.fluentd.logger.FluentLogger fluentLogger9 = fluentLoggerFactory0.getLogger("", "org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", (int) (byte) 100, (int) '#', (int) (short) 100, (org.fluentd.logger.sender.Reconnector) constantDelayReconnector6);
        org.fluentd.logger.FluentLogger fluentLogger15 = fluentLoggerFactory0.getLogger("hi!_100_1_52", "", 0, (int) (short) 1, (int) (short) 1);
        java.lang.String str16 = fluentLogger15.toString();
        org.junit.Assert.assertNotNull(fluentLogger9);
        org.junit.Assert.assertNotNull(fluentLogger15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.fluentd.logger.FluentLogger{tagPrefix=hi!_100_1_52,sender=_0_1_1}" + "'", str16, "org.fluentd.logger.FluentLogger{tagPrefix=hi!_100_1_52,sender=_0_1_1}");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        boolean boolean7 = nullSender4.emit("fluentd.logger.sender.class", strMap6);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        boolean boolean10 = nullSender4.emit("_0_-1_35", strMap9);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        boolean boolean13 = nullSender4.emit("fluentd.logger.sender.class", strMap12);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector9 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        org.fluentd.logger.FluentLogger fluentLogger10 = org.fluentd.logger.FluentLogger.getLogger("hi!", "", (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, (org.fluentd.logger.sender.Reconnector) exponentialDelayReconnector9);
        boolean boolean11 = exponentialDelayReconnector9.isErrorHistoryEmpty();
        boolean boolean12 = exponentialDelayReconnector9.isErrorHistoryEmpty();
        org.fluentd.logger.sender.RawSocketSender rawSocketSender13 = new org.fluentd.logger.sender.RawSocketSender("hi!", (int) (short) 100, 1, (int) '4', (org.fluentd.logger.sender.Reconnector) exponentialDelayReconnector9);
        java.lang.String str14 = rawSocketSender13.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = rawSocketSender13.emit("org.fluentd.logger.FluentLogger{tagPrefix=fluentd.logger.sender.class,sender=fluentd.logger.sender.class_-1_1_10}", (long) (-1), strMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!_100_1_52" + "'", str14, "hi!_100_1_52");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        java.lang.String str3 = rawSocketSender2.getName();
        rawSocketSender2.close();
        rawSocketSender2.removeErrorHandler();
        java.lang.String str6 = rawSocketSender2.getName();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = rawSocketSender2.emit("_97_3000_8388608_97_0_100", 100L, strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_97_3000_8388608" + "'", str3, "_97_3000_8388608");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_97_3000_8388608" + "'", str6, "_97_3000_8388608");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        java.lang.String str3 = rawSocketSender2.toString();
        boolean boolean4 = rawSocketSender2.isConnected();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = rawSocketSender2.emit("hi!", strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_97_3000_8388608" + "'", str3, "_97_3000_8388608");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender4 = new org.fluentd.logger.sender.RawSocketSender("hi!", (int) '4', (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        rawSocketSender2.flush();
        rawSocketSender2.close();
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rawSocketSender2.setErrorHandler(errorHandler5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: errorHandler is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector1 = new org.fluentd.logger.sender.ConstantDelayReconnector((int) ' ');
        boolean boolean3 = constantDelayReconnector1.enableReconnection((long) 1);
        constantDelayReconnector1.clearErrorHistory();
        boolean boolean6 = constantDelayReconnector1.enableReconnection((long) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        org.fluentd.logger.FluentLogger fluentLogger1 = org.fluentd.logger.FluentLogger.getLogger("fluentd.logger.reconnector.class");
        fluentLogger1.finalize();
        org.junit.Assert.assertNotNull(fluentLogger1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector1 = new org.fluentd.logger.sender.ConstantDelayReconnector((int) ' ');
        boolean boolean3 = constantDelayReconnector1.enableReconnection((long) 1);
        constantDelayReconnector1.clearErrorHistory();
        constantDelayReconnector1.addErrorHistory((long) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        org.fluentd.logger.FluentLogger fluentLogger5 = org.fluentd.logger.FluentLogger.getLogger("_97_3000_8388608_hi!_10_-1_10", "", (int) (byte) 1, 10, (int) (short) 0);
        fluentLogger5.flush();
        org.fluentd.logger.sender.Sender sender7 = fluentLogger5.getSender();
        org.junit.Assert.assertNotNull(fluentLogger5);
        org.junit.Assert.assertNotNull(sender7);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        fluentLoggerFactory0.closeAll();
        fluentLoggerFactory0.closeAll();
        fluentLoggerFactory0.closeAll();
        org.fluentd.logger.FluentLogger fluentLogger7 = fluentLoggerFactory0.getLogger("org.fluentd.logger.sender.NullSender", "_97_3000_8388608", (int) (short) 1);
        org.fluentd.logger.FluentLogger fluentLogger11 = fluentLoggerFactory0.getLogger("fluentd.logger.sender.class", "org.fluentd.logger.FluentLogger{tagPrefix=org.fluentd.logger.sender.NullSender,sender=org.fluentd.logger.sender.NullSender_0_32_32}", (int) (byte) 0);
        java.lang.String str12 = fluentLogger11.getName();
        org.junit.Assert.assertNotNull(fluentLogger7);
        org.junit.Assert.assertNotNull(fluentLogger11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fluentd.logger.sender.class_org.fluentd.logger.FluentLogger{tagPrefix=org.fluentd.logger.sender.NullSender,sender=org.fluentd.logger.sender.NullSender_0_32_32}_0_3000_1048576" + "'", str12, "fluentd.logger.sender.class_org.fluentd.logger.FluentLogger{tagPrefix=org.fluentd.logger.sender.NullSender,sender=org.fluentd.logger.sender.NullSender_0_32_32}_0_3000_1048576");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector10 = new org.fluentd.logger.sender.ConstantDelayReconnector((int) (short) 1);
        constantDelayReconnector10.addErrorHistory(0L);
        constantDelayReconnector10.addErrorHistory((long) (byte) 100);
        org.fluentd.logger.FluentLogger fluentLogger15 = org.fluentd.logger.FluentLogger.getLogger("org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", "hi!", 0, 0, 1, (org.fluentd.logger.sender.Reconnector) constantDelayReconnector10);
        org.fluentd.logger.sender.RawSocketSender rawSocketSender16 = new org.fluentd.logger.sender.RawSocketSender("", (int) (byte) 100, (int) (byte) 1, 0, (org.fluentd.logger.sender.Reconnector) constantDelayReconnector10);
        org.junit.Assert.assertNotNull(fluentLogger15);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        org.fluentd.logger.sender.Event event2 = new org.fluentd.logger.sender.Event("fluentd.logger.sender.class", strMap1);
        event2.timestamp = (short) 100;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        event2.data = strMap5;
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender4.close();
        nullSender4.flush();
        nullSender4.flush();
        java.lang.String str8 = nullSender4.toString();
        boolean boolean9 = nullSender4.isConnected();
        nullSender4.removeErrorHandler();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.fluentd.logger.sender.NullSender" + "'", str8, "org.fluentd.logger.sender.NullSender");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector6 = new org.fluentd.logger.sender.ConstantDelayReconnector((int) (short) -1);
        org.fluentd.logger.FluentLogger fluentLogger7 = org.fluentd.logger.FluentLogger.getLogger("_97_3000_8388608_97_0_100", "", (int) ' ', (int) (byte) 1, 0, (org.fluentd.logger.sender.Reconnector) constantDelayReconnector6);
        org.junit.Assert.assertNotNull(fluentLogger7);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector1 = new org.fluentd.logger.sender.ConstantDelayReconnector(10);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("org.fluentd.logger.sender.NullSender_org.fluentd.logger.sender.NullSender_0_32_32", "org.fluentd.logger.FluentLogger{tagPrefix=org.fluentd.logger.sender.NullSender,sender=org.fluentd.logger.sender.NullSender_0_32_32}", (int) (byte) 0);
        org.junit.Assert.assertNotNull(fluentLogger3);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender4.close();
        nullSender4.flush();
        nullSender4.flush();
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler8 = null;
        nullSender4.setErrorHandler(errorHandler8);
        java.lang.String str10 = nullSender4.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        boolean boolean13 = nullSender4.emit("", strMap12);
        nullSender4.removeErrorHandler();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.fluentd.logger.sender.NullSender" + "'", str10, "org.fluentd.logger.sender.NullSender");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("org.fluentd.logger.sender.NullSender_org.fluentd.logger.sender.NullSender_0_32_32", "_97_3000_8388608_hi!_10_-1_10", 10);
        boolean boolean4 = fluentLogger3.isConnected();
        org.junit.Assert.assertNotNull(fluentLogger3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        rawSocketSender2.flush();
        rawSocketSender2.close();
        java.lang.String str5 = rawSocketSender2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_97_3000_8388608" + "'", str5, "_97_3000_8388608");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.fluentd.logger.sender.Event event3 = new org.fluentd.logger.sender.Event("hi!", (long) 0, strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = event3.data;
        event3.timestamp = '4';
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        event3.data = strMap7;
        java.lang.String str9 = event3.tag;
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("", "", (int) '4');
        fluentLogger3.finalize();
        fluentLogger3.close();
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fluentLogger3.setErrorHandler(errorHandler6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: errorHandler is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger3);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender4.close();
        nullSender4.close();
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler7 = null;
        nullSender4.setErrorHandler(errorHandler7);
        nullSender4.close();
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler10 = null;
        nullSender4.setErrorHandler(errorHandler10);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        boolean boolean14 = nullSender4.emit("", strMap13);
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler15 = null;
        nullSender4.setErrorHandler(errorHandler15);
        java.lang.String str17 = nullSender4.getName();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null" + "'", str17, "null");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        java.lang.String str3 = rawSocketSender2.getName();
        rawSocketSender2.close();
        rawSocketSender2.flush();
        rawSocketSender2.close();
        rawSocketSender2.flush();
        java.lang.String str8 = rawSocketSender2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_97_3000_8388608" + "'", str3, "_97_3000_8388608");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_97_3000_8388608" + "'", str8, "_97_3000_8388608");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("org.fluentd.logger.FluentLogger{tagPrefix=,sender=null_10_3000_1048576}", "_97_3000_8388608_hi!_10_-1_10", (int) (short) 100);
        org.junit.Assert.assertNotNull(fluentLogger3);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.fluentd.logger.sender.Event event3 = new org.fluentd.logger.sender.Event("_97_3000_8388608_hi!_10_-1_10", (-1L), strMap2);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender4.close();
        nullSender4.close();
        boolean boolean7 = nullSender4.isConnected();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        boolean boolean5 = nullSender4.isConnected();
        java.lang.String str6 = nullSender4.getName();
        boolean boolean7 = nullSender4.isConnected();
        java.lang.String str8 = nullSender4.getName();
        boolean boolean9 = nullSender4.isConnected();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector0 = new org.fluentd.logger.sender.ConstantDelayReconnector();
        boolean boolean2 = constantDelayReconnector0.enableReconnection(0L);
        constantDelayReconnector0.clearErrorHistory();
        constantDelayReconnector0.addErrorHistory((long) (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        org.fluentd.logger.sender.Event event2 = new org.fluentd.logger.sender.Event("org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", strMap1);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        org.fluentd.logger.FluentLogger fluentLogger1 = org.fluentd.logger.FluentLogger.getLogger("null");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = fluentLogger1.log("_0_-1_35", strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger1);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        rawSocketSender2.removeErrorHandler();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = rawSocketSender2.emit("org.fluentd.logger.FluentLogger{tagPrefix=,sender=null_10_3000_1048576}", strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector6 = new org.fluentd.logger.sender.ConstantDelayReconnector();
        constantDelayReconnector6.clearErrorHistory();
        constantDelayReconnector6.clearErrorHistory();
        org.fluentd.logger.FluentLogger fluentLogger9 = fluentLoggerFactory0.getLogger("", "org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", (int) (byte) 100, (int) '#', (int) (short) 100, (org.fluentd.logger.sender.Reconnector) constantDelayReconnector6);
        org.fluentd.logger.FluentLogger fluentLogger15 = fluentLoggerFactory0.getLogger("hi!_100_1_52", "", 0, (int) (short) 1, (int) (short) 1);
        fluentLogger15.removeErrorHandler();
        fluentLogger15.removeErrorHandler();
        org.junit.Assert.assertNotNull(fluentLogger9);
        org.junit.Assert.assertNotNull(fluentLogger15);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector5 = new org.fluentd.logger.sender.ConstantDelayReconnector((int) (short) 1);
        boolean boolean7 = constantDelayReconnector5.enableReconnection((-1L));
        org.fluentd.logger.sender.RawSocketSender rawSocketSender8 = new org.fluentd.logger.sender.RawSocketSender("org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", 1, (int) '4', 1, (org.fluentd.logger.sender.Reconnector) constantDelayReconnector5);
        boolean boolean9 = rawSocketSender8.isConnected();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        org.fluentd.logger.sender.Event event2 = new org.fluentd.logger.sender.Event("fluentd.logger.sender.class", strMap1);
        event2.timestamp = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = event2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("", "", (int) '4');
        fluentLogger3.finalize();
        boolean boolean5 = fluentLogger3.isConnected();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        org.fluentd.logger.sender.Event event10 = new org.fluentd.logger.sender.Event("fluentd.logger.sender.class", strMap9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = fluentLogger3.log("_97_3000_8388608", "fluentd.logger.reconnector.class", (java.lang.Object) event10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector0 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        boolean boolean2 = exponentialDelayReconnector0.enableReconnection((long) ' ');
        boolean boolean3 = exponentialDelayReconnector0.isErrorHistoryEmpty();
        exponentialDelayReconnector0.addErrorHistory((long) (byte) 10);
        boolean boolean6 = exponentialDelayReconnector0.isErrorHistoryEmpty();
        exponentialDelayReconnector0.clearErrorHistory();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        // The following exception was thrown during execution in test generation
        try {
            org.fluentd.logger.sender.RawSocketSender rawSocketSender4 = new org.fluentd.logger.sender.RawSocketSender("", (int) (byte) 0, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector1 = new org.fluentd.logger.sender.ConstantDelayReconnector((int) ' ');
        constantDelayReconnector1.clearErrorHistory();
        boolean boolean4 = constantDelayReconnector1.enableReconnection((long) (short) 100);
        constantDelayReconnector1.addErrorHistory((long) (short) 10);
        constantDelayReconnector1.addErrorHistory(100L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.fluentd.logger.sender.Event event3 = new org.fluentd.logger.sender.Event("hi!", (long) 0, strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = event3.data;
        java.lang.String str5 = event3.tag;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = event3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender4 = new org.fluentd.logger.sender.RawSocketSender("", 0, (int) (short) -1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            rawSocketSender4.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender4.close();
        nullSender4.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        boolean boolean9 = nullSender4.emit("fluentd.logger.sender.class", strMap8);
        nullSender4.removeErrorHandler();
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler11 = null;
        nullSender4.setErrorHandler(errorHandler11);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("", "", (int) '4');
        fluentLogger3.finalize();
        boolean boolean5 = fluentLogger3.isConnected();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = fluentLogger3.log("hi!_100_1_52", strMap7, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector5 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        boolean boolean6 = exponentialDelayReconnector5.isErrorHistoryEmpty();
        exponentialDelayReconnector5.clearErrorHistory();
        exponentialDelayReconnector5.clearErrorHistory();
        boolean boolean9 = exponentialDelayReconnector5.isErrorHistoryEmpty();
        org.fluentd.logger.FluentLogger fluentLogger10 = org.fluentd.logger.FluentLogger.getLogger("_97_3000_8388608_hi!_1_3000_1048576", "_97_3000_8388608_hi!_1_3000_1048576", (int) (byte) 10, (int) (short) -1, (int) ' ', (org.fluentd.logger.sender.Reconnector) exponentialDelayReconnector5);
        boolean boolean12 = exponentialDelayReconnector5.enableReconnection((long) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(fluentLogger10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", (int) 'a');
        java.lang.String str3 = rawSocketSender2.getName();
        rawSocketSender2.flush();
        rawSocketSender2.removeErrorHandler();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_97_3000_8388608" + "'", str3, "_97_3000_8388608");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        fluentLoggerFactory0.closeAll();
        fluentLoggerFactory0.closeAll();
        fluentLoggerFactory0.closeAll();
        org.fluentd.logger.FluentLogger fluentLogger7 = fluentLoggerFactory0.getLogger("org.fluentd.logger.sender.NullSender", "_97_3000_8388608", (int) (short) 1);
        fluentLogger7.close();
        org.junit.Assert.assertNotNull(fluentLogger7);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector6 = new org.fluentd.logger.sender.ConstantDelayReconnector();
        constantDelayReconnector6.clearErrorHistory();
        constantDelayReconnector6.clearErrorHistory();
        org.fluentd.logger.FluentLogger fluentLogger9 = fluentLoggerFactory0.getLogger("", "org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", (int) (byte) 100, (int) '#', (int) (short) 100, (org.fluentd.logger.sender.Reconnector) constantDelayReconnector6);
        org.fluentd.logger.FluentLogger fluentLogger13 = fluentLoggerFactory0.getLogger("_97_3000_8388608", "org.fluentd.logger.sender.NullSender", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fluentLoggerFactory0.closeAll();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger9);
        org.junit.Assert.assertNotNull(fluentLogger13);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.fluentd.logger.sender.Event event3 = new org.fluentd.logger.sender.Event("_97_3000_8388608", (long) 10, strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        event3.data = strMap4;
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        fluentLoggerFactory0.closeAll();
        org.fluentd.logger.FluentLogger fluentLogger7 = fluentLoggerFactory0.getLogger("org.fluentd.logger.sender.NullSender", "org.fluentd.logger.sender.NullSender", (int) (byte) 0, (int) ' ', (int) ' ');
        fluentLogger7.flush();
        fluentLogger7.finalize();
        org.junit.Assert.assertNotNull(fluentLogger7);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector6 = new org.fluentd.logger.sender.ConstantDelayReconnector((int) (short) 1);
        constantDelayReconnector6.addErrorHistory(0L);
        constantDelayReconnector6.addErrorHistory((long) (byte) 100);
        org.fluentd.logger.FluentLogger fluentLogger11 = org.fluentd.logger.FluentLogger.getLogger("org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", "hi!", 0, 0, 1, (org.fluentd.logger.sender.Reconnector) constantDelayReconnector6);
        boolean boolean12 = fluentLogger11.isConnected();
        org.junit.Assert.assertNotNull(fluentLogger11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.fluentd.logger.sender.Event event3 = new org.fluentd.logger.sender.Event("hi!", (long) (short) 100, strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        event3.data = strMap4;
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        org.fluentd.logger.sender.Event.EventTemplate eventTemplate0 = new org.fluentd.logger.sender.Event.EventTemplate();
        org.fluentd.logger.sender.Event.EventTemplate.INSTANCE = eventTemplate0;
        org.msgpack.unpacker.Unpacker unpacker2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        org.fluentd.logger.sender.Event event6 = new org.fluentd.logger.sender.Event("hi!", (long) 0, strMap5);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = event6.data;
        java.lang.String str8 = event6.tag;
        // The following exception was thrown during execution in test generation
        try {
            org.fluentd.logger.sender.Event event10 = eventTemplate0.read(unpacker2, event6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Don't need the operation");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector6 = new org.fluentd.logger.sender.ConstantDelayReconnector((int) ' ');
        constantDelayReconnector6.clearErrorHistory();
        org.fluentd.logger.FluentLogger fluentLogger8 = org.fluentd.logger.FluentLogger.getLogger("org.fluentd.logger.FluentLogger{tagPrefix=,sender=null_10_3000_1048576}", "_97_3000_8388608", (int) (byte) 0, (int) 'a', (int) (short) 10, (org.fluentd.logger.sender.Reconnector) constantDelayReconnector6);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = fluentLogger8.log("hi!_100_1_52", strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger8);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender4.close();
        nullSender4.flush();
        nullSender4.flush();
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler8 = null;
        nullSender4.setErrorHandler(errorHandler8);
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler10 = null;
        nullSender4.setErrorHandler(errorHandler10);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        org.fluentd.logger.sender.NullSender nullSender4 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender4.close();
        nullSender4.close();
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler7 = null;
        nullSender4.setErrorHandler(errorHandler7);
        nullSender4.close();
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler10 = null;
        nullSender4.setErrorHandler(errorHandler10);
        nullSender4.removeErrorHandler();
        nullSender4.close();
        nullSender4.close();
        java.lang.String str15 = nullSender4.getName();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        fluentLoggerFactory0.closeAll();
        org.fluentd.logger.FluentLogger fluentLogger7 = fluentLoggerFactory0.getLogger("org.fluentd.logger.sender.NullSender", "org.fluentd.logger.sender.NullSender", (int) (byte) 0, (int) ' ', (int) ' ');
        fluentLogger7.flush();
        java.lang.String str9 = fluentLogger7.getName();
        org.junit.Assert.assertNotNull(fluentLogger7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.fluentd.logger.sender.NullSender_org.fluentd.logger.sender.NullSender_0_32_32" + "'", str9, "org.fluentd.logger.sender.NullSender_org.fluentd.logger.sender.NullSender_0_32_32");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        org.fluentd.logger.sender.ConstantDelayReconnector constantDelayReconnector10 = new org.fluentd.logger.sender.ConstantDelayReconnector((int) (short) 1);
        boolean boolean12 = constantDelayReconnector10.enableReconnection((-1L));
        org.fluentd.logger.sender.RawSocketSender rawSocketSender13 = new org.fluentd.logger.sender.RawSocketSender("org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", 1, (int) '4', 1, (org.fluentd.logger.sender.Reconnector) constantDelayReconnector10);
        org.fluentd.logger.FluentLogger fluentLogger14 = org.fluentd.logger.FluentLogger.getLogger("fluentd.logger.sender.class", "org.fluentd.logger.sender.NullSender", (int) (byte) 0, (int) '#', (int) (short) 10, (org.fluentd.logger.sender.Reconnector) constantDelayReconnector10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(fluentLogger14);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        org.fluentd.logger.FluentLogger fluentLogger1 = org.fluentd.logger.FluentLogger.getLogger("org.fluentd.logger.FluentLogger{tagPrefix=fluentd.logger.sender.class,sender=fluentd.logger.sender.class_-1_1_10}");
        org.fluentd.logger.errorhandler.ErrorHandler errorHandler2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fluentLogger1.setErrorHandler(errorHandler2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: errorHandler is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger1);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        org.fluentd.logger.sender.Event.EventTemplate eventTemplate0 = new org.fluentd.logger.sender.Event.EventTemplate();
        org.fluentd.logger.sender.Event.EventTemplate.INSTANCE = eventTemplate0;
        org.msgpack.unpacker.Unpacker unpacker2 = null;
        org.fluentd.logger.sender.Event event3 = new org.fluentd.logger.sender.Event();
        event3.timestamp = (byte) 100;
        java.lang.String str6 = event3.tag;
        event3.tag = "org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}";
        // The following exception was thrown during execution in test generation
        try {
            org.fluentd.logger.sender.Event event10 = eventTemplate0.read(unpacker2, event3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Don't need the operation");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector5 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        org.fluentd.logger.FluentLogger fluentLogger6 = org.fluentd.logger.FluentLogger.getLogger("hi!", "", (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, (org.fluentd.logger.sender.Reconnector) exponentialDelayReconnector5);
        exponentialDelayReconnector5.clearErrorHistory();
        boolean boolean8 = exponentialDelayReconnector5.isErrorHistoryEmpty();
        org.junit.Assert.assertNotNull(fluentLogger6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("_97_3000_8388608", "hi!", (int) (short) 1);
        fluentLogger3.finalize();
        fluentLogger3.close();
        org.junit.Assert.assertNotNull(fluentLogger3);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        fluentLoggerFactory0.closeAll();
        fluentLoggerFactory0.closeAll();
        fluentLoggerFactory0.closeAll();
        fluentLoggerFactory0.closeAll();
        fluentLoggerFactory0.flushAll();
        org.fluentd.logger.FluentLogger fluentLogger11 = fluentLoggerFactory0.getLogger("fluentd.logger.sender.class", "fluentd.logger.sender.class", (int) (short) -1, (int) (byte) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            fluentLoggerFactory0.flushAll();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fluentLogger11);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        org.fluentd.logger.sender.Event.EventTemplate eventTemplate0 = org.fluentd.logger.sender.Event.EventTemplate.INSTANCE;
        org.msgpack.unpacker.Unpacker unpacker1 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        org.fluentd.logger.sender.Event event5 = new org.fluentd.logger.sender.Event("hi!", (long) 0, strMap4);
        java.lang.String str6 = event5.tag;
        // The following exception was thrown during execution in test generation
        try {
            org.fluentd.logger.sender.Event event8 = eventTemplate0.read(unpacker1, event5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Don't need the operation");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(eventTemplate0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        org.fluentd.logger.sender.Event.EventTemplate eventTemplate0 = org.fluentd.logger.sender.Event.EventTemplate.INSTANCE;
        org.msgpack.unpacker.Unpacker unpacker1 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        org.fluentd.logger.sender.Event event5 = new org.fluentd.logger.sender.Event("hi!", (long) 0, strMap4);
        // The following exception was thrown during execution in test generation
        try {
            org.fluentd.logger.sender.Event event6 = eventTemplate0.read(unpacker1, event5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Don't need the operation");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(eventTemplate0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        org.fluentd.logger.sender.Event.EventTemplate eventTemplate0 = org.fluentd.logger.sender.Event.EventTemplate.INSTANCE;
        org.fluentd.logger.sender.Event.EventTemplate.INSTANCE = eventTemplate0;
        org.fluentd.logger.sender.Event.EventTemplate.INSTANCE = eventTemplate0;
        org.junit.Assert.assertNotNull(eventTemplate0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.fluentd.logger.sender.Event event3 = new org.fluentd.logger.sender.Event("_97_3000_8388608_hi!_10_-1_10", (long) 1, strMap2);
        java.lang.String str4 = event3.tag;
        event3.timestamp = (byte) 10;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_97_3000_8388608_hi!_10_-1_10" + "'", str4, "_97_3000_8388608_hi!_10_-1_10");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.fluentd.logger.sender.Event event3 = new org.fluentd.logger.sender.Event("hi!", (long) (short) 100, strMap2);
        java.lang.String str4 = event3.tag;
        java.lang.String str5 = event3.tag;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        event3.data = strMap6;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }
}
