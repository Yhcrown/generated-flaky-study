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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.fluentd.logger.FluentLogger fluentLogger5 = org.fluentd.logger.FluentLogger.getLogger("org.fluentd.logger.sender.NullSender", "fluentd.logger.sender.class", (int) (short) -1, (int) (byte) 0, 100);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.fluentd.logger.FluentLogger fluentLogger4 = fluentLoggerFactory0.getLogger("", "org.fluentd.logger.sender.NullSender", 10);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.fluentd.logger.sender.RawSocketSender rawSocketSender0 = new org.fluentd.logger.sender.RawSocketSender();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.fluentd.logger.FluentLogger fluentLogger4 = fluentLoggerFactory0.getLogger("org.fluentd.logger.FluentLogger{tagPrefix=hi!,sender=_10_-1_100}", "hi!", 10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("null", (int) '#');
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("", 100);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.fluentd.logger.sender.RawSocketSender rawSocketSender4 = new org.fluentd.logger.sender.RawSocketSender("", (int) (short) 1, (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.fluentd.logger.FluentLogger fluentLogger6 = fluentLoggerFactory0.getLogger("fluentd.logger.reconnector.class", "fluentd.logger.sender.class", (int) (byte) -1, (int) ' ', (int) (byte) 1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.fluentd.logger.FluentLoggerFactory fluentLoggerFactory0 = new org.fluentd.logger.FluentLoggerFactory();
        org.fluentd.logger.sender.ExponentialDelayReconnector exponentialDelayReconnector6 = new org.fluentd.logger.sender.ExponentialDelayReconnector();
        boolean boolean7 = exponentialDelayReconnector6.isErrorHistoryEmpty();
        exponentialDelayReconnector6.clearErrorHistory();
        exponentialDelayReconnector6.clearErrorHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.fluentd.logger.FluentLogger fluentLogger10 = fluentLoggerFactory0.getLogger("org.fluentd.logger.sender.NullSender", "_97_3000_8388608", (int) (short) 10, (int) (byte) 0, (int) (byte) 1, (org.fluentd.logger.sender.Reconnector) exponentialDelayReconnector6);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.fluentd.logger.sender.RawSocketSender rawSocketSender2 = new org.fluentd.logger.sender.RawSocketSender("null", 10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("", "", (int) '4');
        fluentLogger3.finalize();
        fluentLogger3.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = fluentLogger3.toString();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("", "", (int) '4');
        fluentLogger3.finalize();
        fluentLogger3.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = fluentLogger3.getName();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("", "", (int) '4');
        fluentLogger3.finalize();
        fluentLogger3.close();
        fluentLogger3.removeErrorHandler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = fluentLogger3.getName();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("_97_3000_8388608", "hi!", (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = fluentLogger3.getName();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.fluentd.logger.FluentLogger fluentLogger3 = org.fluentd.logger.FluentLogger.getLogger("", "", (int) '4');
        org.fluentd.logger.sender.NullSender nullSender10 = new org.fluentd.logger.sender.NullSender("_97_3000_8388608", 1, 1, 0);
        nullSender10.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = fluentLogger3.log("org.fluentd.logger.sender.NullSender", "_97_3000_8388608_hi!_10_-1_10", (java.lang.Object) nullSender10, (long) (short) -1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.fluentd.logger.FluentLogger fluentLogger5 = org.fluentd.logger.FluentLogger.getLogger("_97_3000_8388608", "hi!", (int) (short) 10, (int) (byte) -1, 10);
        org.fluentd.logger.FluentLogger fluentLogger11 = org.fluentd.logger.FluentLogger.getLogger("", "", (int) '4');
        fluentLogger11.finalize();
        fluentLogger11.close();
        fluentLogger11.removeErrorHandler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = fluentLogger5.log("org.fluentd.logger.FluentLogger{tagPrefix=,sender=null_10_3000_1048576}", "_97_3000_8388608_hi!_10_-1_10", (java.lang.Object) fluentLogger11, (long) (byte) 0);
    }
}

