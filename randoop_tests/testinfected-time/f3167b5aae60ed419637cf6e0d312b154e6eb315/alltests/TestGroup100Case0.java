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
        org.testinfected.time.DaytimeDialect daytimeDialect0 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = daytimeDialect0.decode("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 23");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder5 = dateBuilder0.atTime((int) 'a', (int) (byte) 10, (int) '4');
        java.lang.Class<?> wildcardClass6 = dateBuilder5.getClass();
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        org.testinfected.time.LaunchServer launchServer0 = new org.testinfected.time.LaunchServer();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder5 = dateBuilder0.atTime((int) 'a', (int) (byte) 10, (int) '4');
        java.lang.Class<?> wildcardClass6 = dateBuilder0.getClass();
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        java.lang.Class<?> wildcardClass2 = dateBuilder0.getClass();
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder3 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date4 = dateBuilder3.build();
        java.lang.String str5 = daytimeDialect2.encode(date4);
        org.testinfected.time.lib.DateBuilder dateBuilder6 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date7 = dateBuilder6.build();
        java.lang.String str8 = daytimeDialect2.encode(date7);
        org.testinfected.time.DaytimeClient daytimeClient9 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = daytimeDialect2.decode("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 23");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect2);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str5, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str8, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        org.testinfected.time.DaytimeDialect daytimeDialect0 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder1 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date2 = dateBuilder1.build();
        java.lang.String str3 = daytimeDialect0.encode(date2);
        org.testinfected.time.lib.DateBuilder dateBuilder4 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date5 = dateBuilder4.build();
        java.lang.String str6 = daytimeDialect0.encode(date5);
        java.lang.Class<?> wildcardClass7 = daytimeDialect0.getClass();
        org.junit.Assert.assertNotNull(daytimeDialect0);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str3, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str6, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        org.testinfected.time.lib.DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder2 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder6 = dateBuilder2.atTime((int) (short) -1, (int) (short) 1, 0);
        java.util.TimeZone timeZone7 = null;
        org.testinfected.time.lib.DateBuilder dateBuilder8 = dateBuilder6.in(timeZone7);
        org.junit.Assert.assertNotNull(dateBuilder1);
        org.junit.Assert.assertNotNull(dateBuilder2);
        org.junit.Assert.assertNotNull(dateBuilder6);
        org.junit.Assert.assertNotNull(dateBuilder8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder12 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date13 = dateBuilder12.build();
        java.lang.String str14 = daytimeDialect11.encode(date13);
        org.testinfected.time.lib.DateBuilder dateBuilder15 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date16 = dateBuilder15.build();
        java.lang.String str17 = daytimeDialect11.encode(date16);
        org.testinfected.time.DaytimeClient daytimeClient18 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient18);
        org.testinfected.time.ServerMonitor serverMonitor20 = null;
        daytimeServer8.addMonitor(serverMonitor20);
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect11);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str14, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str17, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = null;
        org.testinfected.time.DaytimeClient daytimeClient3 = new org.testinfected.time.DaytimeClient("hi!", (int) (short) -1, daytimeDialect2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = daytimeClient3.now();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.IllegalArgumentException: port out of range:-1");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.inZone("");
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.atTime((int) (byte) 100, (int) (short) -1, (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder11 = dateBuilder7.onCalendar((-1), (int) ' ', (int) (byte) -1);
        org.testinfected.time.lib.DateBuilder dateBuilder13 = dateBuilder11.fromMillis(100L);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder11);
        org.junit.Assert.assertNotNull(dateBuilder13);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.ServerMonitor serverMonitor9 = null;
        daytimeServer8.removeMonitor(serverMonitor9);
// flaky:         daytimeServer8.start();
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) 'a', (int) '#', (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = dateBuilder3.getClass();
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        org.testinfected.time.DaytimeServer daytimeServer1 = new org.testinfected.time.DaytimeServer((int) (byte) -1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder12 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date13 = dateBuilder12.build();
        java.lang.String str14 = daytimeDialect11.encode(date13);
        org.testinfected.time.lib.DateBuilder dateBuilder15 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date16 = dateBuilder15.build();
        java.lang.String str17 = daytimeDialect11.encode(date16);
        org.testinfected.time.DaytimeClient daytimeClient18 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient18);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date20 = daytimeClient18.now();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.net.NoRouteToHostException: Can't assign requested address (Address not available)");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect11);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str14, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str17, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (byte) 0, 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(dateBuilder3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = null;
        org.testinfected.time.DaytimeClient daytimeClient12 = new org.testinfected.time.DaytimeClient("hi!", (int) (short) -1, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient12);
        org.testinfected.time.ServerMonitor serverMonitor14 = null;
        daytimeServer8.addMonitor(serverMonitor14);
        org.testinfected.time.ServerMonitor serverMonitor16 = null;
        daytimeServer8.removeMonitor(serverMonitor16);
        org.testinfected.time.ServerMonitor serverMonitor18 = null;
        daytimeServer8.removeMonitor(serverMonitor18);
        java.lang.Class<?> wildcardClass20 = daytimeServer8.getClass();
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder3 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date4 = dateBuilder3.build();
        java.lang.String str5 = daytimeDialect2.encode(date4);
        org.testinfected.time.lib.DateBuilder dateBuilder6 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date7 = dateBuilder6.build();
        java.lang.String str8 = daytimeDialect2.encode(date7);
        org.testinfected.time.DaytimeClient daytimeClient9 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = daytimeDialect2.decode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 23");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect2);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str5, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str8, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.util.Date date0 = null;
        org.testinfected.time.Clock clock1 = org.testinfected.time.lib.BrokenClock.stoppedAt(date0);
        java.lang.Class<?> wildcardClass2 = clock1.getClass();
        org.junit.Assert.assertNotNull(clock1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder12 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date13 = dateBuilder12.build();
        java.lang.String str14 = daytimeDialect11.encode(date13);
        org.testinfected.time.lib.DateBuilder dateBuilder15 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date16 = dateBuilder15.build();
        java.lang.String str17 = daytimeDialect11.encode(date16);
        org.testinfected.time.DaytimeClient daytimeClient18 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient18);
        org.testinfected.time.DaytimeDialect daytimeDialect21 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder22 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date23 = dateBuilder22.build();
        java.lang.String str24 = daytimeDialect21.encode(date23);
        org.testinfected.time.lib.DateBuilder dateBuilder25 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date26 = dateBuilder25.build();
        java.lang.String str27 = daytimeDialect21.encode(date26);
        org.testinfected.time.DaytimeServer daytimeServer28 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect21);
        org.testinfected.time.DaytimeDialect daytimeDialect31 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder32 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date33 = dateBuilder32.build();
        java.lang.String str34 = daytimeDialect31.encode(date33);
        org.testinfected.time.lib.DateBuilder dateBuilder35 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date36 = dateBuilder35.build();
        java.lang.String str37 = daytimeDialect31.encode(date36);
        org.testinfected.time.DaytimeClient daytimeClient38 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect31);
        daytimeServer28.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date41 = daytimeClient38.now();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.net.NoRouteToHostException: Can't assign requested address (Address not available)");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect11);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str14, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str17, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect21);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str24, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str27, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect31);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str34, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str37, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = null;
        org.testinfected.time.DaytimeClient daytimeClient12 = new org.testinfected.time.DaytimeClient("hi!", (int) (short) -1, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient12);
        org.testinfected.time.ServerMonitor serverMonitor14 = null;
        daytimeServer8.addMonitor(serverMonitor14);
        org.testinfected.time.ServerMonitor serverMonitor16 = null;
        daytimeServer8.removeMonitor(serverMonitor16);
        org.testinfected.time.ServerMonitor serverMonitor18 = null;
        daytimeServer8.removeMonitor(serverMonitor18);
        // The following exception was thrown during execution in test generation
        try {
            daytimeServer8.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = null;
        org.testinfected.time.DaytimeClient daytimeClient3 = new org.testinfected.time.DaytimeClient("JJJJJ 23-11-20 08:46:42 TT L H msADV UTC(NIST) *", (int) '#', daytimeDialect2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.ServerMonitor serverMonitor9 = null;
        daytimeServer8.removeMonitor(serverMonitor9);
        // The following exception was thrown during execution in test generation
        try {
            daytimeServer8.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (short) 0, (int) ' ', 10);
        org.junit.Assert.assertNotNull(dateBuilder3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        org.testinfected.time.DaytimeServer daytimeServer1 = new org.testinfected.time.DaytimeServer((int) (byte) 1);
// flaky:         daytimeServer1.start();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        java.util.TimeZone timeZone2 = null;
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.in(timeZone2);
        org.testinfected.time.lib.DateBuilder dateBuilder8 = dateBuilder3.atTime(1, (int) (short) 1, (int) '#', (int) ' ');
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder8);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = org.testinfected.time.lib.DateBuilder.aDate();
        org.testinfected.time.lib.DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder6 = dateBuilder0.atTime((int) (short) -1, (int) (byte) 100, 10, 0);
        java.lang.Class<?> wildcardClass7 = dateBuilder6.getClass();
        org.junit.Assert.assertNotNull(dateBuilder0);
        org.junit.Assert.assertNotNull(dateBuilder1);
        org.junit.Assert.assertNotNull(dateBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder3 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date4 = dateBuilder3.build();
        java.lang.String str5 = daytimeDialect2.encode(date4);
        org.testinfected.time.lib.DateBuilder dateBuilder6 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date7 = dateBuilder6.build();
        java.lang.String str8 = daytimeDialect2.encode(date7);
        org.testinfected.time.DaytimeClient daytimeClient9 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect2);
        java.util.Date date11 = daytimeDialect2.decode("JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.testinfected.time.Clock clock12 = org.testinfected.time.lib.BrokenClock.stoppedAt(date11);
        org.junit.Assert.assertNotNull(daytimeDialect2);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str5, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str8, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Fri Nov 29 18:00:00 CST 2002");
        org.junit.Assert.assertNotNull(clock12);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        org.testinfected.time.DaytimeServer daytimeServer1 = new org.testinfected.time.DaytimeServer((int) (short) 100);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder12 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date13 = dateBuilder12.build();
        java.lang.String str14 = daytimeDialect11.encode(date13);
        org.testinfected.time.lib.DateBuilder dateBuilder15 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date16 = dateBuilder15.build();
        java.lang.String str17 = daytimeDialect11.encode(date16);
        org.testinfected.time.DaytimeClient daytimeClient18 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient18);
        org.testinfected.time.ServerMonitor serverMonitor20 = null;
        daytimeServer8.removeMonitor(serverMonitor20);
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect11);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str14, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str17, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = org.testinfected.time.lib.DateBuilder.aDate();
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.at(100, 1, 1, (int) (short) -1, (int) (byte) -1, (int) 'a');
        org.testinfected.time.lib.DateBuilder dateBuilder11 = dateBuilder7.atTime((int) (short) 10, (int) '#', (int) (byte) 0);
        org.testinfected.time.lib.DateBuilder dateBuilder13 = dateBuilder11.fromMillis((long) (byte) 10);
        java.util.Date date14 = dateBuilder11.build();
        org.junit.Assert.assertNotNull(dateBuilder0);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder11);
        org.junit.Assert.assertNotNull(dateBuilder13);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Dec 31 18:00:00 CST 1969");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.lib.SystemClock systemClock8 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date9 = systemClock8.now();
        java.util.Date date10 = systemClock8.now();
        java.util.Date date11 = systemClock8.now();
        java.lang.String str12 = daytimeDialect1.encode(date11);
        org.testinfected.time.DaytimeServer daytimeServer13 = new org.testinfected.time.DaytimeServer((int) (byte) 10, daytimeDialect1);
// flaky:         daytimeServer13.start();
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Nov 20 02:46:44 CST 2023");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Nov 20 02:46:44 CST 2023");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Nov 20 02:46:44 CST 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JJJJJ 23-11-20 08:46:44 TT L H msADV UTC(NIST) *" + "'", str12, "JJJJJ 23-11-20 08:46:44 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (short) 1, (int) (short) 100, (int) '#');
        org.junit.Assert.assertNotNull(dateBuilder3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        org.testinfected.time.DaytimeDialect daytimeDialect3 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder4 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date5 = dateBuilder4.build();
        java.lang.String str6 = daytimeDialect3.encode(date5);
        org.testinfected.time.lib.DateBuilder dateBuilder7 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date8 = dateBuilder7.build();
        java.lang.String str9 = daytimeDialect3.encode(date8);
        org.testinfected.time.DaytimeClient daytimeClient10 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect3);
        org.testinfected.time.DaytimeServer daytimeServer11 = new org.testinfected.time.DaytimeServer(100, daytimeDialect3);
        org.testinfected.time.ServerMonitor serverMonitor12 = null;
        daytimeServer11.removeMonitor(serverMonitor12);
        org.testinfected.time.ServerMonitor serverMonitor14 = null;
        daytimeServer11.removeMonitor(serverMonitor14);
        org.junit.Assert.assertNotNull(daytimeDialect3);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str6, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str9, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (short) 0, (int) '4', (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder3.onCalendar((int) (short) 10, 0, (int) (byte) 100);
        org.testinfected.time.lib.DateBuilder dateBuilder12 = dateBuilder3.atTime((int) 'a', (int) (byte) -1, (int) 'a', (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder14 = dateBuilder3.inZone("JJJJJ 23-11-20 08:46:42 TT L H msADV UTC(NIST) *");
        java.util.TimeZone timeZone15 = null;
        org.testinfected.time.lib.DateBuilder dateBuilder16 = dateBuilder14.in(timeZone15);
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder12);
        org.junit.Assert.assertNotNull(dateBuilder14);
        org.junit.Assert.assertNotNull(dateBuilder16);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        org.testinfected.time.lib.SystemClock systemClock0 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date1 = systemClock0.now();
        java.util.Date date2 = systemClock0.now();
        java.util.Date date3 = systemClock0.now();
        java.util.Date date4 = systemClock0.now();
        java.util.Date date5 = systemClock0.now();
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Nov 20 02:46:44 CST 2023");
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Mon Nov 20 02:46:44 CST 2023");
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Mon Nov 20 02:46:44 CST 2023");
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Nov 20 02:46:44 CST 2023");
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Nov 20 02:46:44 CST 2023");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        org.testinfected.time.DaytimeDialect daytimeDialect3 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder4 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date5 = dateBuilder4.build();
        java.lang.String str6 = daytimeDialect3.encode(date5);
        org.testinfected.time.lib.DateBuilder dateBuilder7 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date8 = dateBuilder7.build();
        java.lang.String str9 = daytimeDialect3.encode(date8);
        org.testinfected.time.DaytimeClient daytimeClient10 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect3);
        org.testinfected.time.DaytimeServer daytimeServer11 = new org.testinfected.time.DaytimeServer(100, daytimeDialect3);
        org.testinfected.time.ServerMonitor serverMonitor12 = null;
        daytimeServer11.removeMonitor(serverMonitor12);
// flaky:         daytimeServer11.start();
        org.junit.Assert.assertNotNull(daytimeDialect3);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str6, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str9, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.inZone("");
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.atTime((int) (byte) 100, (int) (short) -1, (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder14 = dateBuilder7.at((int) 'a', 1, 0, (int) (byte) -1, 10, (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder15 = dateBuilder14.atMidnight();
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder14);
        org.junit.Assert.assertNotNull(dateBuilder15);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = null;
        org.testinfected.time.DaytimeClient daytimeClient12 = new org.testinfected.time.DaytimeClient("hi!", (int) (short) -1, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient12);
        org.testinfected.time.ServerMonitor serverMonitor14 = null;
        daytimeServer8.addMonitor(serverMonitor14);
        org.testinfected.time.ServerMonitor serverMonitor16 = null;
        daytimeServer8.removeMonitor(serverMonitor16);
        // The following exception was thrown during execution in test generation
        try {
            daytimeServer8.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = org.testinfected.time.lib.DateBuilder.aDate();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.fromMillis(10L);
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder3.onCalendar(10, (int) (short) 0, 100);
        org.testinfected.time.lib.DateBuilder dateBuilder9 = dateBuilder3.inZone("JJJJJ 23-11-20 08:46:42 TT L H msADV UTC(NIST) *");
        java.lang.Class<?> wildcardClass10 = dateBuilder3.getClass();
        org.junit.Assert.assertNotNull(dateBuilder0);
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Nov 20 02:46:45 CST 2023");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = null;
        org.testinfected.time.DaytimeClient daytimeClient12 = new org.testinfected.time.DaytimeClient("hi!", (int) (short) -1, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = daytimeClient12.now();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.IllegalArgumentException: port out of range:-1");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate(100, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(dateBuilder3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        org.testinfected.time.lib.DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder2 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder6 = dateBuilder2.atTime((int) (short) -1, (int) (short) 1, 0);
        org.testinfected.time.lib.DateBuilder dateBuilder13 = dateBuilder2.at(0, (int) (short) -1, (int) '4', (int) 'a', 0, (int) 'a');
        org.junit.Assert.assertNotNull(dateBuilder1);
        org.junit.Assert.assertNotNull(dateBuilder2);
        org.junit.Assert.assertNotNull(dateBuilder6);
        org.junit.Assert.assertNotNull(dateBuilder13);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = org.testinfected.time.lib.DateBuilder.aDate();
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.at(100, 1, 1, (int) (short) -1, (int) (byte) -1, (int) 'a');
        org.testinfected.time.lib.DateBuilder dateBuilder9 = dateBuilder0.inZone("");
        org.testinfected.time.lib.DateBuilder dateBuilder16 = dateBuilder9.at((int) (short) 1, (-1), (int) (byte) 1, (int) (byte) 0, (int) (byte) 10, (int) (short) -1);
        org.testinfected.time.lib.DateBuilder dateBuilder21 = dateBuilder16.atTime((int) (byte) -1, (int) (byte) 100, (int) (short) -1, 0);
        org.junit.Assert.assertNotNull(dateBuilder0);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder9);
        org.junit.Assert.assertNotNull(dateBuilder16);
        org.junit.Assert.assertNotNull(dateBuilder21);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = org.testinfected.time.lib.DateBuilder.aDate();
        org.testinfected.time.lib.DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder6 = dateBuilder0.atTime((int) (short) -1, (int) (byte) 100, 10, 0);
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.atMidnight();
        java.util.TimeZone timeZone8 = null;
        org.testinfected.time.lib.DateBuilder dateBuilder9 = dateBuilder7.in(timeZone8);
        org.junit.Assert.assertNotNull(dateBuilder0);
        org.junit.Assert.assertNotNull(dateBuilder1);
        org.junit.Assert.assertNotNull(dateBuilder6);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        java.util.Date date10 = daytimeDialect1.decode("JJJJJ 23-11-20 08:46:44 TT L H msADV UTC(NIST) *");
        java.util.Date date12 = daytimeDialect1.decode("JJJJJ 23-11-20 08:46:43 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Mon Nov 20 02:46:44 CST 2023");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Mon Nov 20 02:46:43 CST 2023");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder3 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date4 = dateBuilder3.build();
        java.lang.String str5 = daytimeDialect2.encode(date4);
        org.testinfected.time.lib.DateBuilder dateBuilder6 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date7 = dateBuilder6.build();
        java.lang.String str8 = daytimeDialect2.encode(date7);
        org.testinfected.time.DaytimeClient daytimeClient9 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = daytimeClient9.now();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.net.NoRouteToHostException: Can't assign requested address (Address not available)");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect2);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str5, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str8, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = null;
        org.testinfected.time.DaytimeClient daytimeClient12 = new org.testinfected.time.DaytimeClient("hi!", (int) (short) -1, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient12);
        org.testinfected.time.ServerMonitor serverMonitor14 = null;
        daytimeServer8.addMonitor(serverMonitor14);
        org.testinfected.time.ServerMonitor serverMonitor16 = null;
        daytimeServer8.addMonitor(serverMonitor16);
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (byte) 100, 0, (int) '4');
        java.lang.Class<?> wildcardClass4 = dateBuilder3.getClass();
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer(0, daytimeDialect1);
        org.testinfected.time.lib.SystemClock systemClock9 = new org.testinfected.time.lib.SystemClock();
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) systemClock9);
        java.util.Date date11 = systemClock9.now();
        org.testinfected.time.Clock clock12 = org.testinfected.time.lib.BrokenClock.stoppedAt(date11);
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Nov 20 02:46:46 CST 2023");
        org.junit.Assert.assertNotNull(clock12);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        org.testinfected.time.DaytimeServer daytimeServer1 = new org.testinfected.time.DaytimeServer((int) ' ');
        java.lang.Class<?> wildcardClass2 = daytimeServer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        org.testinfected.time.DaytimeServer daytimeServer1 = new org.testinfected.time.DaytimeServer(0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.DaytimeServer daytimeServer2 = new org.testinfected.time.DaytimeServer((int) (short) 0, daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect3 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder4 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date5 = dateBuilder4.build();
        java.lang.String str6 = daytimeDialect3.encode(date5);
        org.testinfected.time.lib.DateBuilder dateBuilder7 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date8 = dateBuilder7.build();
        java.lang.String str9 = daytimeDialect3.encode(date8);
        org.testinfected.time.lib.SystemClock systemClock10 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date11 = systemClock10.now();
        java.util.Date date12 = systemClock10.now();
        java.util.Date date13 = systemClock10.now();
        java.lang.String str14 = daytimeDialect3.encode(date13);
        java.lang.String str15 = daytimeDialect1.encode(date13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = daytimeDialect1.decode("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 23");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(daytimeDialect3);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str6, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str9, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Nov 20 02:46:46 CST 2023");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Nov 20 02:46:46 CST 2023");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Mon Nov 20 02:46:46 CST 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JJJJJ 23-11-20 08:46:46 TT L H msADV UTC(NIST) *" + "'", str14, "JJJJJ 23-11-20 08:46:46 TT L H msADV UTC(NIST) *");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JJJJJ 23-11-20 08:46:46 TT L H msADV UTC(NIST) *" + "'", str15, "JJJJJ 23-11-20 08:46:46 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.DaytimeServer daytimeServer3 = new org.testinfected.time.DaytimeServer((int) (short) 0, daytimeDialect2);
        org.testinfected.time.DaytimeDialect daytimeDialect4 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect4.encode(date6);
        org.testinfected.time.lib.DateBuilder dateBuilder8 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date9 = dateBuilder8.build();
        java.lang.String str10 = daytimeDialect4.encode(date9);
        org.testinfected.time.lib.SystemClock systemClock11 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date12 = systemClock11.now();
        java.util.Date date13 = systemClock11.now();
        java.util.Date date14 = systemClock11.now();
        java.lang.String str15 = daytimeDialect4.encode(date14);
        java.lang.String str16 = daytimeDialect2.encode(date14);
        org.testinfected.time.DaytimeServer daytimeServer17 = new org.testinfected.time.DaytimeServer((int) ' ', daytimeDialect2);
// flaky:         daytimeServer17.start();
        org.junit.Assert.assertNotNull(daytimeDialect2);
        org.junit.Assert.assertNotNull(daytimeDialect4);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str10, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Nov 20 02:46:47 CST 2023");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Mon Nov 20 02:46:47 CST 2023");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Mon Nov 20 02:46:47 CST 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JJJJJ 23-11-20 08:46:47 TT L H msADV UTC(NIST) *" + "'", str15, "JJJJJ 23-11-20 08:46:47 TT L H msADV UTC(NIST) *");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JJJJJ 23-11-20 08:46:47 TT L H msADV UTC(NIST) *" + "'", str16, "JJJJJ 23-11-20 08:46:47 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.inZone("");
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.atTime((int) (byte) 100, (int) (short) -1, (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder9 = dateBuilder0.inZone("JJJJJ 23-11-20 08:46:42 TT L H msADV UTC(NIST) *");
        java.util.Date date10 = dateBuilder9.build();
        java.util.TimeZone timeZone11 = null;
        org.testinfected.time.lib.DateBuilder dateBuilder12 = dateBuilder9.in(timeZone11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = dateBuilder12.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Wed Dec 03 21:59:52 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder12);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = org.testinfected.time.lib.DateBuilder.aDate();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder2 = dateBuilder0.atMidnight();
        java.util.Date date3 = dateBuilder2.build();
        org.junit.Assert.assertNotNull(dateBuilder0);
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Nov 20 02:46:47 CST 2023");
        org.junit.Assert.assertNotNull(dateBuilder2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sun Nov 19 18:00:00 CST 2023");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        org.testinfected.time.lib.DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder5 = dateBuilder0.onCalendar((int) '#', 1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(dateBuilder1);
        org.junit.Assert.assertNotNull(dateBuilder5);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        org.testinfected.time.DaytimeDialect daytimeDialect3 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder4 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date5 = dateBuilder4.build();
        java.lang.String str6 = daytimeDialect3.encode(date5);
        org.testinfected.time.lib.DateBuilder dateBuilder7 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date8 = dateBuilder7.build();
        java.lang.String str9 = daytimeDialect3.encode(date8);
        org.testinfected.time.DaytimeServer daytimeServer10 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect3);
        java.util.Date date12 = daytimeDialect3.decode("JJJJJ 23-11-20 08:46:44 TT L H msADV UTC(NIST) *");
        org.testinfected.time.DaytimeClient daytimeClient13 = new org.testinfected.time.DaytimeClient("JJJJJ 23-11-20 08:46:44 TT L H msADV UTC(NIST) *", (int) (short) -1, daytimeDialect3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = daytimeClient13.now();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.IllegalArgumentException: port out of range:-1");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect3);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str6, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str9, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Mon Nov 20 02:46:44 CST 2023");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        org.testinfected.time.DaytimeDialect daytimeDialect5 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder6 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date7 = dateBuilder6.build();
        java.lang.String str8 = daytimeDialect5.encode(date7);
        org.testinfected.time.lib.DateBuilder dateBuilder9 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date10 = dateBuilder9.build();
        java.lang.String str11 = daytimeDialect5.encode(date10);
        org.testinfected.time.DaytimeClient daytimeClient12 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect5);
        org.testinfected.time.DaytimeServer daytimeServer13 = new org.testinfected.time.DaytimeServer(100, daytimeDialect5);
        org.testinfected.time.DaytimeClient daytimeClient14 = new org.testinfected.time.DaytimeClient("JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *", (int) (byte) 10, daytimeDialect5);
        org.testinfected.time.DaytimeDialect daytimeDialect15 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder16 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date17 = dateBuilder16.build();
        java.lang.String str18 = daytimeDialect15.encode(date17);
        org.testinfected.time.lib.DateBuilder dateBuilder19 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date20 = dateBuilder19.build();
        java.lang.String str21 = daytimeDialect15.encode(date20);
        org.testinfected.time.lib.SystemClock systemClock22 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date23 = systemClock22.now();
        java.util.Date date24 = systemClock22.now();
        java.util.Date date25 = systemClock22.now();
        java.lang.String str26 = daytimeDialect15.encode(date25);
        org.testinfected.time.Clock clock27 = org.testinfected.time.lib.BrokenClock.stoppedAt(date25);
        java.util.Date date28 = clock27.now();
        java.lang.String str29 = daytimeDialect5.encode(date28);
        org.junit.Assert.assertNotNull(daytimeDialect5);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str8, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str11, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect15);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str18, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str21, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Mon Nov 20 02:46:47 CST 2023");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Mon Nov 20 02:46:47 CST 2023");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Mon Nov 20 02:46:47 CST 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "JJJJJ 23-11-20 08:46:47 TT L H msADV UTC(NIST) *" + "'", str26, "JJJJJ 23-11-20 08:46:47 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(clock27);
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Mon Nov 20 02:46:47 CST 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "JJJJJ 23-11-20 08:46:47 TT L H msADV UTC(NIST) *" + "'", str29, "JJJJJ 23-11-20 08:46:47 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.inZone("");
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.atTime((int) (byte) 100, (int) (short) -1, (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder14 = dateBuilder7.at((int) 'a', 1, 0, (int) (byte) -1, 10, (int) '4');
        java.util.Date date15 = dateBuilder7.build();
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder14);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Fri Dec 30 17:10:52 CST 96");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        org.testinfected.time.DaytimeDialect daytimeDialect4 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.DaytimeServer daytimeServer5 = new org.testinfected.time.DaytimeServer((int) (short) 0, daytimeDialect4);
        org.testinfected.time.DaytimeClient daytimeClient6 = new org.testinfected.time.DaytimeClient("", (int) '4', daytimeDialect4);
        org.testinfected.time.DaytimeServer daytimeServer7 = new org.testinfected.time.DaytimeServer((int) (short) -1, daytimeDialect4);
        java.lang.Class<?> wildcardClass8 = daytimeDialect4.getClass();
        org.junit.Assert.assertNotNull(daytimeDialect4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (short) 0, (int) (byte) 10, 0);
        org.junit.Assert.assertNotNull(dateBuilder3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder12 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date13 = dateBuilder12.build();
        java.lang.String str14 = daytimeDialect11.encode(date13);
        org.testinfected.time.lib.DateBuilder dateBuilder15 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date16 = dateBuilder15.build();
        java.lang.String str17 = daytimeDialect11.encode(date16);
        org.testinfected.time.DaytimeClient daytimeClient18 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient18);
        org.testinfected.time.DaytimeDialect daytimeDialect21 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder22 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date23 = dateBuilder22.build();
        java.lang.String str24 = daytimeDialect21.encode(date23);
        org.testinfected.time.lib.DateBuilder dateBuilder25 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date26 = dateBuilder25.build();
        java.lang.String str27 = daytimeDialect21.encode(date26);
        org.testinfected.time.DaytimeServer daytimeServer28 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect21);
        org.testinfected.time.DaytimeDialect daytimeDialect31 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder32 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date33 = dateBuilder32.build();
        java.lang.String str34 = daytimeDialect31.encode(date33);
        org.testinfected.time.lib.DateBuilder dateBuilder35 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date36 = dateBuilder35.build();
        java.lang.String str37 = daytimeDialect31.encode(date36);
        org.testinfected.time.DaytimeClient daytimeClient38 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect31);
        daytimeServer28.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        org.testinfected.time.DaytimeDialect daytimeDialect42 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder43 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date44 = dateBuilder43.build();
        java.lang.String str45 = daytimeDialect42.encode(date44);
        org.testinfected.time.lib.DateBuilder dateBuilder46 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date47 = dateBuilder46.build();
        java.lang.String str48 = daytimeDialect42.encode(date47);
        org.testinfected.time.DaytimeServer daytimeServer49 = new org.testinfected.time.DaytimeServer(0, daytimeDialect42);
        org.testinfected.time.lib.SystemClock systemClock50 = new org.testinfected.time.lib.SystemClock();
        daytimeServer49.setInternalClock((org.testinfected.time.Clock) systemClock50);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) systemClock50);
        org.testinfected.time.ServerMonitor serverMonitor53 = null;
        daytimeServer8.removeMonitor(serverMonitor53);
        org.testinfected.time.ServerMonitor serverMonitor55 = null;
        daytimeServer8.removeMonitor(serverMonitor55);
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect11);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str14, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str17, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect21);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str24, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str27, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect31);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str34, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str37, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect42);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str45, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str48, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (short) 1, 1, (int) (byte) 1);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = dateBuilder3.fromMillis((long) (short) 1);
        org.testinfected.time.lib.DateBuilder dateBuilder10 = dateBuilder5.atTime(0, 0, (int) (short) 0, (int) ' ');
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder5);
        org.junit.Assert.assertNotNull(dateBuilder10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.inZone("");
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.atTime((int) (byte) 100, (int) (short) -1, (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder9 = dateBuilder0.inZone("JJJJJ 23-11-20 08:46:44 TT L H msADV UTC(NIST) *");
        java.util.Date date10 = dateBuilder0.build();
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Wed Dec 03 21:59:52 CST 2");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (short) 0, (int) '4', (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder3.onCalendar((int) (short) 10, 0, (int) (byte) 100);
        org.testinfected.time.lib.DateBuilder dateBuilder12 = dateBuilder3.atTime((int) 'a', (int) (byte) -1, (int) 'a', (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder14 = dateBuilder3.inZone("JJJJJ 23-11-20 08:46:42 TT L H msADV UTC(NIST) *");
        java.lang.Class<?> wildcardClass15 = dateBuilder14.getClass();
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder12);
        org.junit.Assert.assertNotNull(dateBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        org.testinfected.time.DaytimeServer daytimeServer1 = new org.testinfected.time.DaytimeServer((int) '4');
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = org.testinfected.time.lib.DateBuilder.aDate();
        org.testinfected.time.lib.DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder6 = dateBuilder0.atTime((int) (short) -1, (int) (byte) 100, 10, 0);
        org.testinfected.time.lib.DateBuilder dateBuilder8 = dateBuilder0.fromMillis((long) 10);
        org.testinfected.time.lib.DateBuilder dateBuilder10 = dateBuilder8.inZone("hi!");
        org.junit.Assert.assertNotNull(dateBuilder0);
        org.junit.Assert.assertNotNull(dateBuilder1);
        org.junit.Assert.assertNotNull(dateBuilder6);
        org.junit.Assert.assertNotNull(dateBuilder8);
        org.junit.Assert.assertNotNull(dateBuilder10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        org.testinfected.time.lib.DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder2 = dateBuilder1.atMidnight();
        org.junit.Assert.assertNotNull(dateBuilder1);
        org.junit.Assert.assertNotNull(dateBuilder2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = org.testinfected.time.lib.DateBuilder.aDate();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.fromMillis(10L);
        org.testinfected.time.lib.DateBuilder dateBuilder4 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder9 = dateBuilder0.atTime((int) (byte) 10, (int) '4', (int) ' ', 100);
        org.junit.Assert.assertNotNull(dateBuilder0);
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Nov 20 02:46:53 CST 2023");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder4);
        org.junit.Assert.assertNotNull(dateBuilder9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        org.testinfected.time.DaytimeDialect daytimeDialect3 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder4 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date5 = dateBuilder4.build();
        java.lang.String str6 = daytimeDialect3.encode(date5);
        org.testinfected.time.lib.DateBuilder dateBuilder7 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date8 = dateBuilder7.build();
        java.lang.String str9 = daytimeDialect3.encode(date8);
        org.testinfected.time.DaytimeServer daytimeServer10 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect3);
        org.testinfected.time.DaytimeDialect daytimeDialect13 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder14 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date15 = dateBuilder14.build();
        java.lang.String str16 = daytimeDialect13.encode(date15);
        org.testinfected.time.lib.DateBuilder dateBuilder17 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date18 = dateBuilder17.build();
        java.lang.String str19 = daytimeDialect13.encode(date18);
        org.testinfected.time.DaytimeClient daytimeClient20 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect13);
        java.util.Date date22 = daytimeDialect13.decode("JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.testinfected.time.DaytimeDialect daytimeDialect23 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder24 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date25 = dateBuilder24.build();
        java.lang.String str26 = daytimeDialect23.encode(date25);
        org.testinfected.time.lib.DateBuilder dateBuilder27 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date28 = dateBuilder27.build();
        java.lang.String str29 = daytimeDialect23.encode(date28);
        org.testinfected.time.lib.SystemClock systemClock30 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date31 = systemClock30.now();
        java.util.Date date32 = systemClock30.now();
        java.util.Date date33 = systemClock30.now();
        java.lang.String str34 = daytimeDialect23.encode(date33);
        java.lang.String str35 = daytimeDialect13.encode(date33);
        java.lang.String str36 = daytimeDialect3.encode(date33);
        org.testinfected.time.DaytimeClient daytimeClient37 = new org.testinfected.time.DaytimeClient("hi!", 1, daytimeDialect3);
        org.junit.Assert.assertNotNull(daytimeDialect3);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str6, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str9, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect13);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str16, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str19, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Fri Nov 29 18:00:00 CST 2002");
        org.junit.Assert.assertNotNull(daytimeDialect23);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str26, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str29, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Mon Nov 20 02:46:54 CST 2023");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Mon Nov 20 02:46:54 CST 2023");
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Mon Nov 20 02:46:54 CST 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "JJJJJ 23-11-20 08:46:54 TT L H msADV UTC(NIST) *" + "'", str34, "JJJJJ 23-11-20 08:46:54 TT L H msADV UTC(NIST) *");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "JJJJJ 23-11-20 08:46:54 TT L H msADV UTC(NIST) *" + "'", str35, "JJJJJ 23-11-20 08:46:54 TT L H msADV UTC(NIST) *");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "JJJJJ 23-11-20 08:46:54 TT L H msADV UTC(NIST) *" + "'", str36, "JJJJJ 23-11-20 08:46:54 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        org.testinfected.time.DaytimeDialect daytimeDialect3 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder4 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date5 = dateBuilder4.build();
        java.lang.String str6 = daytimeDialect3.encode(date5);
        org.testinfected.time.lib.DateBuilder dateBuilder7 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date8 = dateBuilder7.build();
        java.lang.String str9 = daytimeDialect3.encode(date8);
        org.testinfected.time.DaytimeClient daytimeClient10 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect3);
        org.testinfected.time.DaytimeServer daytimeServer11 = new org.testinfected.time.DaytimeServer(100, daytimeDialect3);
        org.testinfected.time.ServerMonitor serverMonitor12 = null;
        daytimeServer11.addMonitor(serverMonitor12);
        // The following exception was thrown during execution in test generation
        try {
            daytimeServer11.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect3);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str6, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str9, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        org.testinfected.time.lib.DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder6 = dateBuilder1.atTime(0, (int) (short) 100, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertNotNull(dateBuilder1);
        org.junit.Assert.assertNotNull(dateBuilder6);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (short) 0, 1, 100);
        java.util.Date date4 = dateBuilder3.build();
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Apr 08 18:00:00 CST 1");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (short) 0, (int) '4', (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder3.onCalendar((int) (short) 10, 0, (int) (byte) 100);
        org.testinfected.time.lib.DateBuilder dateBuilder12 = dateBuilder3.atTime((int) 'a', (int) (byte) -1, (int) 'a', (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder14 = dateBuilder3.inZone("JJJJJ 23-11-20 08:46:42 TT L H msADV UTC(NIST) *");
        java.lang.Class<?> wildcardClass15 = dateBuilder3.getClass();
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder12);
        org.junit.Assert.assertNotNull(dateBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (short) 1, 1, (int) (byte) 1);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = dateBuilder3.fromMillis((long) (short) 1);
        java.lang.Class<?> wildcardClass6 = dateBuilder3.getClass();
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        org.testinfected.time.DaytimeServer daytimeServer1 = new org.testinfected.time.DaytimeServer((int) (byte) 0);
        org.testinfected.time.ServerMonitor serverMonitor2 = null;
        daytimeServer1.addMonitor(serverMonitor2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder3 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date4 = dateBuilder3.build();
        java.lang.String str5 = daytimeDialect2.encode(date4);
        org.testinfected.time.lib.DateBuilder dateBuilder6 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date7 = dateBuilder6.build();
        java.lang.String str8 = daytimeDialect2.encode(date7);
        org.testinfected.time.DaytimeServer daytimeServer9 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect2);
        java.util.Date date11 = daytimeDialect2.decode("JJJJJ 23-11-20 08:46:44 TT L H msADV UTC(NIST) *");
        org.testinfected.time.DaytimeServer daytimeServer12 = new org.testinfected.time.DaytimeServer((int) ' ', daytimeDialect2);
        org.testinfected.time.lib.DateBuilder dateBuilder13 = org.testinfected.time.lib.DateBuilder.aDate();
        org.testinfected.time.lib.DateBuilder dateBuilder14 = dateBuilder13.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder19 = dateBuilder13.atTime((int) (short) -1, (int) (byte) 100, 10, 0);
        java.util.Date date20 = dateBuilder19.build();
        java.lang.String str21 = daytimeDialect2.encode(date20);
        org.junit.Assert.assertNotNull(daytimeDialect2);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str5, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str8, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Mon Nov 20 02:46:44 CST 2023");
        org.junit.Assert.assertNotNull(dateBuilder13);
        org.junit.Assert.assertNotNull(dateBuilder14);
        org.junit.Assert.assertNotNull(dateBuilder19);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Sun Nov 19 18:40:10 CST 2023");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "JJJJJ 23-11-20 00:40:10 TT L H msADV UTC(NIST) *" + "'", str21, "JJJJJ 23-11-20 00:40:10 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        org.testinfected.time.lib.DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder2 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.atTime((int) (byte) 100, 100, 10, (int) (short) 10);
        org.testinfected.time.lib.DateBuilder dateBuilder9 = dateBuilder7.inZone("JJJJJ 23-11-20 08:46:44 TT L H msADV UTC(NIST) *");
        org.testinfected.time.lib.DateBuilder dateBuilder10 = dateBuilder9.atMidnight();
        org.junit.Assert.assertNotNull(dateBuilder1);
        org.junit.Assert.assertNotNull(dateBuilder2);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder9);
        org.junit.Assert.assertNotNull(dateBuilder10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (byte) 10, (-1), (-1));
        org.junit.Assert.assertNotNull(dateBuilder3);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer(0, daytimeDialect1);
        daytimeServer8.start();
        daytimeServer8.start();
        daytimeServer8.stop();
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder3 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date4 = dateBuilder3.build();
        java.lang.String str5 = daytimeDialect2.encode(date4);
        org.testinfected.time.lib.DateBuilder dateBuilder6 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date7 = dateBuilder6.build();
        java.lang.String str8 = daytimeDialect2.encode(date7);
        org.testinfected.time.lib.SystemClock systemClock9 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date10 = systemClock9.now();
        java.util.Date date11 = systemClock9.now();
        java.util.Date date12 = systemClock9.now();
        java.lang.String str13 = daytimeDialect2.encode(date12);
        org.testinfected.time.DaytimeClient daytimeClient14 = new org.testinfected.time.DaytimeClient("JJJJJ 23-11-20 08:46:44 TT L H msADV UTC(NIST) *", 0, daytimeDialect2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = daytimeClient14.now();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.net.NoRouteToHostException: Can't assign requested address (Address not available)");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect2);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str5, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str8, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Nov 20 02:46:54 CST 2023");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Nov 20 02:46:54 CST 2023");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Nov 20 02:46:54 CST 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JJJJJ 23-11-20 08:46:54 TT L H msADV UTC(NIST) *" + "'", str13, "JJJJJ 23-11-20 08:46:54 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        org.testinfected.time.lib.DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder2 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder2.atTime((int) (short) 100, (int) (short) -1, 100, 0);
        org.junit.Assert.assertNotNull(dateBuilder1);
        org.junit.Assert.assertNotNull(dateBuilder2);
        org.junit.Assert.assertNotNull(dateBuilder7);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder12 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date13 = dateBuilder12.build();
        java.lang.String str14 = daytimeDialect11.encode(date13);
        org.testinfected.time.lib.DateBuilder dateBuilder15 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date16 = dateBuilder15.build();
        java.lang.String str17 = daytimeDialect11.encode(date16);
        org.testinfected.time.DaytimeClient daytimeClient18 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient18);
        org.testinfected.time.DaytimeDialect daytimeDialect21 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder22 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date23 = dateBuilder22.build();
        java.lang.String str24 = daytimeDialect21.encode(date23);
        org.testinfected.time.lib.DateBuilder dateBuilder25 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date26 = dateBuilder25.build();
        java.lang.String str27 = daytimeDialect21.encode(date26);
        org.testinfected.time.DaytimeServer daytimeServer28 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect21);
        org.testinfected.time.DaytimeDialect daytimeDialect31 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder32 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date33 = dateBuilder32.build();
        java.lang.String str34 = daytimeDialect31.encode(date33);
        org.testinfected.time.lib.DateBuilder dateBuilder35 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date36 = dateBuilder35.build();
        java.lang.String str37 = daytimeDialect31.encode(date36);
        org.testinfected.time.DaytimeClient daytimeClient38 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect31);
        daytimeServer28.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        org.testinfected.time.DaytimeDialect daytimeDialect42 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder43 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date44 = dateBuilder43.build();
        java.lang.String str45 = daytimeDialect42.encode(date44);
        org.testinfected.time.lib.DateBuilder dateBuilder46 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date47 = dateBuilder46.build();
        java.lang.String str48 = daytimeDialect42.encode(date47);
        org.testinfected.time.DaytimeServer daytimeServer49 = new org.testinfected.time.DaytimeServer(0, daytimeDialect42);
        org.testinfected.time.lib.SystemClock systemClock50 = new org.testinfected.time.lib.SystemClock();
        daytimeServer49.setInternalClock((org.testinfected.time.Clock) systemClock50);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) systemClock50);
        java.util.Date date53 = systemClock50.now();
        java.util.Date date54 = systemClock50.now();
        java.util.Date date55 = systemClock50.now();
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect11);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str14, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str17, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect21);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str24, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str27, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect31);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str34, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str37, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect42);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str45, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str48, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date53);
// flaky:         org.junit.Assert.assertEquals(date53.toString(), "Mon Nov 20 02:46:54 CST 2023");
        org.junit.Assert.assertNotNull(date54);
// flaky:         org.junit.Assert.assertEquals(date54.toString(), "Mon Nov 20 02:46:54 CST 2023");
        org.junit.Assert.assertNotNull(date55);
// flaky:         org.junit.Assert.assertEquals(date55.toString(), "Mon Nov 20 02:46:54 CST 2023");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = null;
        org.testinfected.time.DaytimeClient daytimeClient12 = new org.testinfected.time.DaytimeClient("hi!", (int) (short) -1, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient12);
        org.testinfected.time.ServerMonitor serverMonitor14 = null;
        daytimeServer8.addMonitor(serverMonitor14);
        // The following exception was thrown during execution in test generation
        try {
            daytimeServer8.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        org.testinfected.time.DaytimeDialect daytimeDialect5 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder6 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date7 = dateBuilder6.build();
        java.lang.String str8 = daytimeDialect5.encode(date7);
        org.testinfected.time.lib.DateBuilder dateBuilder9 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date10 = dateBuilder9.build();
        java.lang.String str11 = daytimeDialect5.encode(date10);
        org.testinfected.time.DaytimeClient daytimeClient12 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect5);
        org.testinfected.time.DaytimeServer daytimeServer13 = new org.testinfected.time.DaytimeServer(100, daytimeDialect5);
        org.testinfected.time.DaytimeClient daytimeClient14 = new org.testinfected.time.DaytimeClient("JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *", (int) (byte) 10, daytimeDialect5);
        org.testinfected.time.DaytimeDialect daytimeDialect15 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder16 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date17 = dateBuilder16.build();
        java.lang.String str18 = daytimeDialect15.encode(date17);
        java.lang.String str19 = daytimeDialect5.encode(date17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = daytimeDialect5.decode("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 23");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect5);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str8, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str11, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect15);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str18, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str19, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (short) -1, (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(dateBuilder3);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = null;
        org.testinfected.time.DaytimeClient daytimeClient12 = new org.testinfected.time.DaytimeClient("hi!", (int) (short) -1, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient12);
        java.lang.Class<?> wildcardClass14 = daytimeServer8.getClass();
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = null;
        org.testinfected.time.DaytimeClient daytimeClient12 = new org.testinfected.time.DaytimeClient("hi!", (int) (short) -1, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient12);
        org.testinfected.time.ServerMonitor serverMonitor14 = null;
        daytimeServer8.addMonitor(serverMonitor14);
        org.testinfected.time.lib.DateBuilder dateBuilder16 = new org.testinfected.time.lib.DateBuilder();
        org.testinfected.time.lib.DateBuilder dateBuilder17 = dateBuilder16.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder18 = dateBuilder16.atMidnight();
        java.util.Date date19 = dateBuilder18.build();
        org.testinfected.time.Clock clock20 = org.testinfected.time.lib.BrokenClock.stoppedAt(date19);
        daytimeServer8.setInternalClock(clock20);
        org.testinfected.time.ServerMonitor serverMonitor22 = null;
        daytimeServer8.removeMonitor(serverMonitor22);
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(dateBuilder17);
        org.junit.Assert.assertNotNull(dateBuilder18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(clock20);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate(1, (int) (short) 0, 0);
        org.junit.Assert.assertNotNull(dateBuilder3);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        org.testinfected.time.DaytimeServer daytimeServer1 = new org.testinfected.time.DaytimeServer((int) ' ');
        org.testinfected.time.ServerMonitor serverMonitor2 = null;
        daytimeServer1.removeMonitor(serverMonitor2);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder3 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date4 = dateBuilder3.build();
        java.lang.String str5 = daytimeDialect2.encode(date4);
        org.testinfected.time.lib.DateBuilder dateBuilder6 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date7 = dateBuilder6.build();
        java.lang.String str8 = daytimeDialect2.encode(date7);
        org.testinfected.time.DaytimeClient daytimeClient9 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect2);
        java.util.Date date11 = daytimeDialect2.decode("JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.testinfected.time.DaytimeDialect daytimeDialect12 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder13 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date14 = dateBuilder13.build();
        java.lang.String str15 = daytimeDialect12.encode(date14);
        org.testinfected.time.lib.DateBuilder dateBuilder16 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date17 = dateBuilder16.build();
        java.lang.String str18 = daytimeDialect12.encode(date17);
        org.testinfected.time.lib.SystemClock systemClock19 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date20 = systemClock19.now();
        java.util.Date date21 = systemClock19.now();
        java.util.Date date22 = systemClock19.now();
        java.lang.String str23 = daytimeDialect12.encode(date22);
        java.lang.String str24 = daytimeDialect2.encode(date22);
        java.util.Date date25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = daytimeDialect2.encode(date25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect2);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str5, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str8, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Fri Nov 29 18:00:00 CST 2002");
        org.junit.Assert.assertNotNull(daytimeDialect12);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str15, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str18, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Mon Nov 20 02:46:55 CST 2023");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Mon Nov 20 02:46:55 CST 2023");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Mon Nov 20 02:46:55 CST 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "JJJJJ 23-11-20 08:46:55 TT L H msADV UTC(NIST) *" + "'", str23, "JJJJJ 23-11-20 08:46:55 TT L H msADV UTC(NIST) *");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JJJJJ 23-11-20 08:46:55 TT L H msADV UTC(NIST) *" + "'", str24, "JJJJJ 23-11-20 08:46:55 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder12 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date13 = dateBuilder12.build();
        java.lang.String str14 = daytimeDialect11.encode(date13);
        org.testinfected.time.lib.DateBuilder dateBuilder15 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date16 = dateBuilder15.build();
        java.lang.String str17 = daytimeDialect11.encode(date16);
        org.testinfected.time.DaytimeClient daytimeClient18 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient18);
        org.testinfected.time.DaytimeDialect daytimeDialect21 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder22 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date23 = dateBuilder22.build();
        java.lang.String str24 = daytimeDialect21.encode(date23);
        org.testinfected.time.lib.DateBuilder dateBuilder25 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date26 = dateBuilder25.build();
        java.lang.String str27 = daytimeDialect21.encode(date26);
        org.testinfected.time.DaytimeServer daytimeServer28 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect21);
        org.testinfected.time.DaytimeDialect daytimeDialect31 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder32 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date33 = dateBuilder32.build();
        java.lang.String str34 = daytimeDialect31.encode(date33);
        org.testinfected.time.lib.DateBuilder dateBuilder35 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date36 = dateBuilder35.build();
        java.lang.String str37 = daytimeDialect31.encode(date36);
        org.testinfected.time.DaytimeClient daytimeClient38 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect31);
        daytimeServer28.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        org.testinfected.time.ServerMonitor serverMonitor41 = null;
        daytimeServer8.addMonitor(serverMonitor41);
        org.testinfected.time.lib.SystemClock systemClock43 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date44 = systemClock43.now();
        java.util.Date date45 = systemClock43.now();
        java.util.Date date46 = systemClock43.now();
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) systemClock43);
        org.testinfected.time.ServerMonitor serverMonitor48 = null;
        daytimeServer8.addMonitor(serverMonitor48);
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect11);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str14, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str17, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect21);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str24, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str27, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect31);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str34, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str37, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Mon Nov 20 02:46:55 CST 2023");
        org.junit.Assert.assertNotNull(date45);
// flaky:         org.junit.Assert.assertEquals(date45.toString(), "Mon Nov 20 02:46:55 CST 2023");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Mon Nov 20 02:46:55 CST 2023");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder12 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date13 = dateBuilder12.build();
        java.lang.String str14 = daytimeDialect11.encode(date13);
        org.testinfected.time.lib.DateBuilder dateBuilder15 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date16 = dateBuilder15.build();
        java.lang.String str17 = daytimeDialect11.encode(date16);
        org.testinfected.time.DaytimeClient daytimeClient18 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient18);
        org.testinfected.time.DaytimeDialect daytimeDialect21 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder22 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date23 = dateBuilder22.build();
        java.lang.String str24 = daytimeDialect21.encode(date23);
        org.testinfected.time.lib.DateBuilder dateBuilder25 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date26 = dateBuilder25.build();
        java.lang.String str27 = daytimeDialect21.encode(date26);
        org.testinfected.time.DaytimeServer daytimeServer28 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect21);
        org.testinfected.time.DaytimeDialect daytimeDialect31 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder32 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date33 = dateBuilder32.build();
        java.lang.String str34 = daytimeDialect31.encode(date33);
        org.testinfected.time.lib.DateBuilder dateBuilder35 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date36 = dateBuilder35.build();
        java.lang.String str37 = daytimeDialect31.encode(date36);
        org.testinfected.time.DaytimeClient daytimeClient38 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect31);
        daytimeServer28.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        org.testinfected.time.ServerMonitor serverMonitor41 = null;
        daytimeServer8.addMonitor(serverMonitor41);
        org.testinfected.time.lib.SystemClock systemClock43 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date44 = systemClock43.now();
        java.util.Date date45 = systemClock43.now();
        java.util.Date date46 = systemClock43.now();
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) systemClock43);
        org.testinfected.time.DaytimeDialect daytimeDialect49 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder50 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date51 = dateBuilder50.build();
        java.lang.String str52 = daytimeDialect49.encode(date51);
        org.testinfected.time.lib.DateBuilder dateBuilder53 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date54 = dateBuilder53.build();
        java.lang.String str55 = daytimeDialect49.encode(date54);
        org.testinfected.time.DaytimeServer daytimeServer56 = new org.testinfected.time.DaytimeServer(0, daytimeDialect49);
        org.testinfected.time.lib.SystemClock systemClock57 = new org.testinfected.time.lib.SystemClock();
        daytimeServer56.setInternalClock((org.testinfected.time.Clock) systemClock57);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) systemClock57);
        org.testinfected.time.ServerMonitor serverMonitor60 = null;
        daytimeServer8.addMonitor(serverMonitor60);
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect11);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str14, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str17, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect21);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str24, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str27, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect31);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str34, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str37, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Mon Nov 20 02:46:55 CST 2023");
        org.junit.Assert.assertNotNull(date45);
// flaky:         org.junit.Assert.assertEquals(date45.toString(), "Mon Nov 20 02:46:55 CST 2023");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Mon Nov 20 02:46:55 CST 2023");
        org.junit.Assert.assertNotNull(daytimeDialect49);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str52, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str55, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        org.testinfected.time.DaytimeServer daytimeServer1 = new org.testinfected.time.DaytimeServer((int) (byte) 1);
        org.testinfected.time.ServerMonitor serverMonitor2 = null;
        daytimeServer1.addMonitor(serverMonitor2);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (short) 0, (int) '4', (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder3.onCalendar((int) (short) 10, 0, (int) (byte) 100);
        org.testinfected.time.lib.DateBuilder dateBuilder12 = dateBuilder3.atTime((int) 'a', (int) (byte) -1, (int) 'a', (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder14 = dateBuilder3.inZone("JJJJJ 23-11-20 08:46:42 TT L H msADV UTC(NIST) *");
        org.testinfected.time.lib.DateBuilder dateBuilder19 = dateBuilder3.atTime((int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        org.testinfected.time.lib.DateBuilder dateBuilder26 = dateBuilder3.at(10, 100, 0, (int) (byte) 100, 10, (int) (byte) -1);
        org.testinfected.time.lib.DateBuilder dateBuilder28 = dateBuilder3.inZone("JJJJJ 23-11-20 08:46:53 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder12);
        org.junit.Assert.assertNotNull(dateBuilder14);
        org.junit.Assert.assertNotNull(dateBuilder19);
        org.junit.Assert.assertNotNull(dateBuilder26);
        org.junit.Assert.assertNotNull(dateBuilder28);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder12 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date13 = dateBuilder12.build();
        java.lang.String str14 = daytimeDialect11.encode(date13);
        org.testinfected.time.lib.DateBuilder dateBuilder15 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date16 = dateBuilder15.build();
        java.lang.String str17 = daytimeDialect11.encode(date16);
        org.testinfected.time.DaytimeClient daytimeClient18 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient18);
        org.testinfected.time.DaytimeDialect daytimeDialect21 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder22 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date23 = dateBuilder22.build();
        java.lang.String str24 = daytimeDialect21.encode(date23);
        org.testinfected.time.lib.DateBuilder dateBuilder25 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date26 = dateBuilder25.build();
        java.lang.String str27 = daytimeDialect21.encode(date26);
        org.testinfected.time.DaytimeServer daytimeServer28 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect21);
        org.testinfected.time.DaytimeDialect daytimeDialect31 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder32 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date33 = dateBuilder32.build();
        java.lang.String str34 = daytimeDialect31.encode(date33);
        org.testinfected.time.lib.DateBuilder dateBuilder35 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date36 = dateBuilder35.build();
        java.lang.String str37 = daytimeDialect31.encode(date36);
        org.testinfected.time.DaytimeClient daytimeClient38 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect31);
        daytimeServer28.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        org.testinfected.time.ServerMonitor serverMonitor41 = null;
        daytimeServer8.addMonitor(serverMonitor41);
        org.testinfected.time.lib.SystemClock systemClock43 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date44 = systemClock43.now();
        java.util.Date date45 = systemClock43.now();
        java.util.Date date46 = systemClock43.now();
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) systemClock43);
        org.testinfected.time.DaytimeDialect daytimeDialect49 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder50 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date51 = dateBuilder50.build();
        java.lang.String str52 = daytimeDialect49.encode(date51);
        org.testinfected.time.lib.DateBuilder dateBuilder53 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date54 = dateBuilder53.build();
        java.lang.String str55 = daytimeDialect49.encode(date54);
        org.testinfected.time.DaytimeServer daytimeServer56 = new org.testinfected.time.DaytimeServer(0, daytimeDialect49);
        org.testinfected.time.lib.SystemClock systemClock57 = new org.testinfected.time.lib.SystemClock();
        daytimeServer56.setInternalClock((org.testinfected.time.Clock) systemClock57);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) systemClock57);
        org.testinfected.time.ServerMonitor serverMonitor60 = null;
        daytimeServer8.removeMonitor(serverMonitor60);
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect11);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str14, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str17, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect21);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str24, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str27, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect31);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str34, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str37, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Mon Nov 20 02:46:55 CST 2023");
        org.junit.Assert.assertNotNull(date45);
// flaky:         org.junit.Assert.assertEquals(date45.toString(), "Mon Nov 20 02:46:55 CST 2023");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Mon Nov 20 02:46:55 CST 2023");
        org.junit.Assert.assertNotNull(daytimeDialect49);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str52, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str55, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        org.testinfected.time.DaytimeServer daytimeServer1 = new org.testinfected.time.DaytimeServer((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            daytimeServer1.start();
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) ' ', (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(dateBuilder3);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = null;
        org.testinfected.time.DaytimeClient daytimeClient3 = new org.testinfected.time.DaytimeClient("JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *", 0, daytimeDialect2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = daytimeClient3.now();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.net.NoRouteToHostException: Can't assign requested address (Address not available)");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = org.testinfected.time.lib.DateBuilder.aDate();
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.at(100, 1, 1, (int) (short) -1, (int) (byte) -1, (int) 'a');
        org.testinfected.time.lib.DateBuilder dateBuilder11 = dateBuilder7.atTime((int) (short) 10, (int) '#', (int) (byte) 0);
        org.testinfected.time.lib.DateBuilder dateBuilder13 = dateBuilder7.fromMillis((long) (-1));
        org.testinfected.time.lib.DateBuilder dateBuilder15 = dateBuilder7.inZone("JJJJJ 23-11-20 08:46:43 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(dateBuilder0);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder11);
        org.junit.Assert.assertNotNull(dateBuilder13);
        org.junit.Assert.assertNotNull(dateBuilder15);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (short) 1, (int) (short) 0, (-1));
        org.testinfected.time.lib.DateBuilder dateBuilder8 = dateBuilder3.atTime((int) (short) -1, (-1), (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder8);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.DaytimeServer daytimeServer2 = new org.testinfected.time.DaytimeServer((int) (short) 0, daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect3 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder4 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date5 = dateBuilder4.build();
        java.lang.String str6 = daytimeDialect3.encode(date5);
        org.testinfected.time.lib.DateBuilder dateBuilder7 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date8 = dateBuilder7.build();
        java.lang.String str9 = daytimeDialect3.encode(date8);
        org.testinfected.time.lib.SystemClock systemClock10 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date11 = systemClock10.now();
        java.util.Date date12 = systemClock10.now();
        java.util.Date date13 = systemClock10.now();
        java.lang.String str14 = daytimeDialect3.encode(date13);
        java.lang.String str15 = daytimeDialect1.encode(date13);
        java.util.Date date17 = daytimeDialect1.decode("JJJJJ 23-11-20 08:46:54 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(daytimeDialect3);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str6, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str9, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Nov 20 02:46:55 CST 2023");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Nov 20 02:46:55 CST 2023");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Mon Nov 20 02:46:55 CST 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JJJJJ 23-11-20 08:46:55 TT L H msADV UTC(NIST) *" + "'", str14, "JJJJJ 23-11-20 08:46:55 TT L H msADV UTC(NIST) *");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JJJJJ 23-11-20 08:46:55 TT L H msADV UTC(NIST) *" + "'", str15, "JJJJJ 23-11-20 08:46:55 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Nov 20 02:46:54 CST 2023");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder12 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date13 = dateBuilder12.build();
        java.lang.String str14 = daytimeDialect11.encode(date13);
        org.testinfected.time.lib.DateBuilder dateBuilder15 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date16 = dateBuilder15.build();
        java.lang.String str17 = daytimeDialect11.encode(date16);
        org.testinfected.time.DaytimeClient daytimeClient18 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient18);
        org.testinfected.time.DaytimeDialect daytimeDialect21 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder22 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date23 = dateBuilder22.build();
        java.lang.String str24 = daytimeDialect21.encode(date23);
        org.testinfected.time.lib.DateBuilder dateBuilder25 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date26 = dateBuilder25.build();
        java.lang.String str27 = daytimeDialect21.encode(date26);
        org.testinfected.time.DaytimeServer daytimeServer28 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect21);
        org.testinfected.time.DaytimeDialect daytimeDialect31 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder32 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date33 = dateBuilder32.build();
        java.lang.String str34 = daytimeDialect31.encode(date33);
        org.testinfected.time.lib.DateBuilder dateBuilder35 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date36 = dateBuilder35.build();
        java.lang.String str37 = daytimeDialect31.encode(date36);
        org.testinfected.time.DaytimeClient daytimeClient38 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect31);
        daytimeServer28.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        org.testinfected.time.ServerMonitor serverMonitor41 = null;
        daytimeServer8.addMonitor(serverMonitor41);
        org.testinfected.time.lib.SystemClock systemClock43 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date44 = systemClock43.now();
        java.util.Date date45 = systemClock43.now();
        java.util.Date date46 = systemClock43.now();
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) systemClock43);
        // The following exception was thrown during execution in test generation
        try {
            daytimeServer8.start();
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect11);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str14, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str17, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect21);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str24, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str27, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect31);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str34, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str37, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Mon Nov 20 02:46:55 CST 2023");
        org.junit.Assert.assertNotNull(date45);
// flaky:         org.junit.Assert.assertEquals(date45.toString(), "Mon Nov 20 02:46:55 CST 2023");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Mon Nov 20 02:46:55 CST 2023");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        org.testinfected.time.DaytimeDialect daytimeDialect3 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder4 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date5 = dateBuilder4.build();
        java.lang.String str6 = daytimeDialect3.encode(date5);
        org.testinfected.time.lib.DateBuilder dateBuilder7 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date8 = dateBuilder7.build();
        java.lang.String str9 = daytimeDialect3.encode(date8);
        org.testinfected.time.DaytimeClient daytimeClient10 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect3);
        org.testinfected.time.DaytimeServer daytimeServer11 = new org.testinfected.time.DaytimeServer(100, daytimeDialect3);
        org.testinfected.time.ServerMonitor serverMonitor12 = null;
        daytimeServer11.removeMonitor(serverMonitor12);
        org.testinfected.time.ServerMonitor serverMonitor14 = null;
        daytimeServer11.addMonitor(serverMonitor14);
        // The following exception was thrown during execution in test generation
        try {
            daytimeServer11.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect3);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str6, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str9, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder3 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date4 = dateBuilder3.build();
        java.lang.String str5 = daytimeDialect2.encode(date4);
        org.testinfected.time.lib.DateBuilder dateBuilder6 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date7 = dateBuilder6.build();
        java.lang.String str8 = daytimeDialect2.encode(date7);
        org.testinfected.time.DaytimeDialect daytimeDialect9 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder10 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date11 = dateBuilder10.build();
        java.lang.String str12 = daytimeDialect9.encode(date11);
        org.testinfected.time.Clock clock13 = org.testinfected.time.lib.BrokenClock.stoppedAt(date11);
        java.lang.String str14 = daytimeDialect2.encode(date11);
        org.testinfected.time.DaytimeClient daytimeClient15 = new org.testinfected.time.DaytimeClient("", (int) (byte) 100, daytimeDialect2);
        java.util.Date date16 = daytimeClient15.now();
        org.junit.Assert.assertNotNull(daytimeDialect2);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str5, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str8, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect9);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str12, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(clock13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str14, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Mon Nov 20 02:46:55 CST 2023");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer(0, daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect9 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder10 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date11 = dateBuilder10.build();
        java.lang.String str12 = daytimeDialect9.encode(date11);
        org.testinfected.time.Clock clock13 = org.testinfected.time.lib.BrokenClock.stoppedAt(date11);
        java.lang.String str14 = daytimeDialect1.encode(date11);
        org.testinfected.time.lib.DateBuilder dateBuilder15 = org.testinfected.time.lib.DateBuilder.aDate();
        org.testinfected.time.lib.DateBuilder dateBuilder22 = dateBuilder15.at(100, 1, 1, (int) (short) -1, (int) (byte) -1, (int) 'a');
        org.testinfected.time.lib.DateBuilder dateBuilder24 = dateBuilder15.inZone("");
        java.util.Date date25 = dateBuilder24.build();
        org.testinfected.time.Clock clock26 = org.testinfected.time.lib.BrokenClock.stoppedAt(date25);
        java.lang.String str27 = daytimeDialect1.encode(date25);
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect9);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str12, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(clock13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str14, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(dateBuilder15);
        org.junit.Assert.assertNotNull(dateBuilder22);
        org.junit.Assert.assertNotNull(dateBuilder24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Tue Dec 31 17:00:37 CST 99");
        org.junit.Assert.assertNotNull(clock26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "JJJJJ 99-12-31 23:00:37 TT L H msADV UTC(NIST) *" + "'", str27, "JJJJJ 99-12-31 23:00:37 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        org.testinfected.time.DaytimeServer daytimeServer1 = new org.testinfected.time.DaytimeServer((int) (short) 10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder3 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date4 = dateBuilder3.build();
        java.lang.String str5 = daytimeDialect2.encode(date4);
        org.testinfected.time.lib.DateBuilder dateBuilder6 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date7 = dateBuilder6.build();
        java.lang.String str8 = daytimeDialect2.encode(date7);
        org.testinfected.time.DaytimeServer daytimeServer9 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect2);
        java.util.Date date11 = daytimeDialect2.decode("JJJJJ 23-11-20 08:46:44 TT L H msADV UTC(NIST) *");
        org.testinfected.time.DaytimeServer daytimeServer12 = new org.testinfected.time.DaytimeServer((int) ' ', daytimeDialect2);
        java.util.Date date14 = daytimeDialect2.decode("JJJJJ 23-11-20 08:46:45 TT L H msADV UTC(NIST) *");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = daytimeDialect2.decode("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 23");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect2);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str5, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str8, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Mon Nov 20 02:46:44 CST 2023");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Nov 20 02:46:45 CST 2023");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        org.testinfected.time.lib.SystemClock systemClock0 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date1 = systemClock0.now();
        java.util.Date date2 = systemClock0.now();
        java.util.Date date3 = systemClock0.now();
        java.util.Date date4 = systemClock0.now();
        java.lang.Class<?> wildcardClass5 = date4.getClass();
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Nov 20 02:46:56 CST 2023");
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Mon Nov 20 02:46:56 CST 2023");
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Mon Nov 20 02:46:56 CST 2023");
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Nov 20 02:46:56 CST 2023");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.inZone("");
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.atTime((int) (byte) 100, (int) (short) -1, (int) '4');
        java.util.TimeZone timeZone8 = null;
        org.testinfected.time.lib.DateBuilder dateBuilder9 = dateBuilder0.in(timeZone8);
        org.testinfected.time.lib.DateBuilder dateBuilder16 = dateBuilder0.at(1, (int) '#', 0, (int) (short) 100, (int) (short) 0, 1);
        java.util.TimeZone timeZone17 = null;
        org.testinfected.time.lib.DateBuilder dateBuilder18 = dateBuilder16.in(timeZone17);
        org.testinfected.time.lib.DateBuilder dateBuilder23 = dateBuilder16.atTime((-1), (int) (short) -1, 100, (int) '4');
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder9);
        org.junit.Assert.assertNotNull(dateBuilder16);
        org.junit.Assert.assertNotNull(dateBuilder18);
        org.junit.Assert.assertNotNull(dateBuilder23);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer(0, daytimeDialect1);
        org.testinfected.time.lib.SystemClock systemClock9 = new org.testinfected.time.lib.SystemClock();
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) systemClock9);
        org.testinfected.time.ServerMonitor serverMonitor11 = null;
        daytimeServer8.removeMonitor(serverMonitor11);
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = null;
        org.testinfected.time.DaytimeClient daytimeClient12 = new org.testinfected.time.DaytimeClient("hi!", (int) (short) -1, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient12);
        org.testinfected.time.ServerMonitor serverMonitor14 = null;
        daytimeServer8.addMonitor(serverMonitor14);
        org.testinfected.time.lib.DateBuilder dateBuilder16 = new org.testinfected.time.lib.DateBuilder();
        org.testinfected.time.lib.DateBuilder dateBuilder17 = dateBuilder16.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder18 = dateBuilder16.atMidnight();
        java.util.Date date19 = dateBuilder18.build();
        org.testinfected.time.Clock clock20 = org.testinfected.time.lib.BrokenClock.stoppedAt(date19);
        daytimeServer8.setInternalClock(clock20);
        org.testinfected.time.ServerMonitor serverMonitor22 = null;
        daytimeServer8.addMonitor(serverMonitor22);
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(dateBuilder17);
        org.junit.Assert.assertNotNull(dateBuilder18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(clock20);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        org.testinfected.time.lib.DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder2 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder4 = dateBuilder2.fromMillis((long) '#');
        org.testinfected.time.lib.DateBuilder dateBuilder9 = dateBuilder4.atTime((int) ' ', (int) (byte) 100, (int) (short) -1, (-1));
        java.util.TimeZone timeZone10 = null;
        org.testinfected.time.lib.DateBuilder dateBuilder11 = dateBuilder9.in(timeZone10);
        org.testinfected.time.lib.DateBuilder dateBuilder13 = dateBuilder9.inZone("JJJJJ 23-11-20 00:40:10 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(dateBuilder1);
        org.junit.Assert.assertNotNull(dateBuilder2);
        org.junit.Assert.assertNotNull(dateBuilder4);
        org.junit.Assert.assertNotNull(dateBuilder9);
        org.junit.Assert.assertNotNull(dateBuilder11);
        org.junit.Assert.assertNotNull(dateBuilder13);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        org.testinfected.time.DaytimeDialect daytimeDialect3 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder4 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date5 = dateBuilder4.build();
        java.lang.String str6 = daytimeDialect3.encode(date5);
        org.testinfected.time.lib.DateBuilder dateBuilder7 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date8 = dateBuilder7.build();
        java.lang.String str9 = daytimeDialect3.encode(date8);
        org.testinfected.time.DaytimeClient daytimeClient10 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect3);
        org.testinfected.time.DaytimeServer daytimeServer11 = new org.testinfected.time.DaytimeServer((int) '4', daytimeDialect3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = daytimeDialect3.decode("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 23");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect3);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str6, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str9, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (short) 0, 1, 100);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = dateBuilder3.inZone("JJJJJ 23-11-20 08:46:43 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder5);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        org.testinfected.time.DaytimeDialect daytimeDialect4 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.DaytimeClient daytimeClient5 = new org.testinfected.time.DaytimeClient("JJJJJ 23-11-20 08:46:42 TT L H msADV UTC(NIST) *", (int) (short) 10, daytimeDialect4);
        org.testinfected.time.DaytimeClient daytimeClient6 = new org.testinfected.time.DaytimeClient("JJJJJ 23-11-20 08:46:45 TT L H msADV UTC(NIST) *", (int) (short) 0, daytimeDialect4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = daytimeClient6.now();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.net.NoRouteToHostException: Can't assign requested address (Address not available)");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect4);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        org.testinfected.time.DaytimeDialect daytimeDialect5 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder6 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date7 = dateBuilder6.build();
        java.lang.String str8 = daytimeDialect5.encode(date7);
        org.testinfected.time.lib.DateBuilder dateBuilder9 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date10 = dateBuilder9.build();
        java.lang.String str11 = daytimeDialect5.encode(date10);
        org.testinfected.time.DaytimeClient daytimeClient12 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect5);
        org.testinfected.time.DaytimeServer daytimeServer13 = new org.testinfected.time.DaytimeServer(100, daytimeDialect5);
        org.testinfected.time.DaytimeClient daytimeClient14 = new org.testinfected.time.DaytimeClient("JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *", (int) (byte) 10, daytimeDialect5);
        java.util.Date date16 = daytimeDialect5.decode("JJJJJ 23-11-20 08:46:42 TT L H msADV UTC(NIST) *");
        java.util.Date date18 = daytimeDialect5.decode("JJJJJ 23-11-20 08:46:44 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect5);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str8, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str11, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Mon Nov 20 02:46:42 CST 2023");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Mon Nov 20 02:46:44 CST 2023");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.inZone("");
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.atTime((int) (byte) 100, (int) (short) -1, (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder9 = dateBuilder7.fromMillis((long) 100);
        java.util.TimeZone timeZone10 = null;
        org.testinfected.time.lib.DateBuilder dateBuilder11 = dateBuilder9.in(timeZone10);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder9);
        org.junit.Assert.assertNotNull(dateBuilder11);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = org.testinfected.time.lib.DateBuilder.aDate();
        org.testinfected.time.lib.DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder6 = dateBuilder0.atTime((int) (short) -1, (int) (byte) 100, 10, 0);
        java.util.Date date7 = dateBuilder6.build();
        org.testinfected.time.lib.DateBuilder dateBuilder11 = dateBuilder6.atTime((int) (short) 0, (int) '4', (int) (byte) 100);
        org.testinfected.time.lib.DateBuilder dateBuilder13 = dateBuilder6.inZone("JJJJJ 23-11-20 08:46:47 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(dateBuilder0);
        org.junit.Assert.assertNotNull(dateBuilder1);
        org.junit.Assert.assertNotNull(dateBuilder6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sun Nov 19 18:40:10 CST 2023");
        org.junit.Assert.assertNotNull(dateBuilder11);
        org.junit.Assert.assertNotNull(dateBuilder13);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder12 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date13 = dateBuilder12.build();
        java.lang.String str14 = daytimeDialect11.encode(date13);
        org.testinfected.time.lib.DateBuilder dateBuilder15 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date16 = dateBuilder15.build();
        java.lang.String str17 = daytimeDialect11.encode(date16);
        org.testinfected.time.DaytimeClient daytimeClient18 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient18);
        org.testinfected.time.DaytimeDialect daytimeDialect21 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder22 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date23 = dateBuilder22.build();
        java.lang.String str24 = daytimeDialect21.encode(date23);
        org.testinfected.time.lib.DateBuilder dateBuilder25 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date26 = dateBuilder25.build();
        java.lang.String str27 = daytimeDialect21.encode(date26);
        org.testinfected.time.DaytimeServer daytimeServer28 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect21);
        org.testinfected.time.DaytimeDialect daytimeDialect31 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder32 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date33 = dateBuilder32.build();
        java.lang.String str34 = daytimeDialect31.encode(date33);
        org.testinfected.time.lib.DateBuilder dateBuilder35 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date36 = dateBuilder35.build();
        java.lang.String str37 = daytimeDialect31.encode(date36);
        org.testinfected.time.DaytimeClient daytimeClient38 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect31);
        daytimeServer28.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        org.testinfected.time.ServerMonitor serverMonitor41 = null;
        daytimeServer8.addMonitor(serverMonitor41);
        org.testinfected.time.lib.SystemClock systemClock43 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date44 = systemClock43.now();
        java.util.Date date45 = systemClock43.now();
        java.util.Date date46 = systemClock43.now();
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) systemClock43);
        org.testinfected.time.DaytimeDialect daytimeDialect49 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder50 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date51 = dateBuilder50.build();
        java.lang.String str52 = daytimeDialect49.encode(date51);
        org.testinfected.time.lib.DateBuilder dateBuilder53 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date54 = dateBuilder53.build();
        java.lang.String str55 = daytimeDialect49.encode(date54);
        org.testinfected.time.DaytimeServer daytimeServer56 = new org.testinfected.time.DaytimeServer(0, daytimeDialect49);
        org.testinfected.time.lib.SystemClock systemClock57 = new org.testinfected.time.lib.SystemClock();
        daytimeServer56.setInternalClock((org.testinfected.time.Clock) systemClock57);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) systemClock57);
        java.util.Date date60 = systemClock57.now();
        java.util.Date date61 = systemClock57.now();
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect11);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str14, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str17, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect21);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str24, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str27, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect31);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str34, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str37, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Mon Nov 20 02:46:56 CST 2023");
        org.junit.Assert.assertNotNull(date45);
// flaky:         org.junit.Assert.assertEquals(date45.toString(), "Mon Nov 20 02:46:56 CST 2023");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Mon Nov 20 02:46:56 CST 2023");
        org.junit.Assert.assertNotNull(daytimeDialect49);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str52, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str55, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date60);
// flaky:         org.junit.Assert.assertEquals(date60.toString(), "Mon Nov 20 02:46:56 CST 2023");
        org.junit.Assert.assertNotNull(date61);
// flaky:         org.junit.Assert.assertEquals(date61.toString(), "Mon Nov 20 02:46:56 CST 2023");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = org.testinfected.time.lib.DateBuilder.aDate();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder2 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder6 = dateBuilder2.onCalendar((int) (short) 1, (int) (byte) 10, 0);
        org.testinfected.time.lib.DateBuilder dateBuilder10 = dateBuilder6.onCalendar((int) 'a', (int) (short) 10, 0);
        org.junit.Assert.assertNotNull(dateBuilder0);
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Nov 20 02:46:56 CST 2023");
        org.junit.Assert.assertNotNull(dateBuilder2);
        org.junit.Assert.assertNotNull(dateBuilder6);
        org.junit.Assert.assertNotNull(dateBuilder10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        org.testinfected.time.DaytimeDialect daytimeDialect3 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.DaytimeServer daytimeServer4 = new org.testinfected.time.DaytimeServer((int) (short) 0, daytimeDialect3);
        org.testinfected.time.DaytimeClient daytimeClient5 = new org.testinfected.time.DaytimeClient("", (int) '4', daytimeDialect3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = daytimeClient5.now();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.net.ConnectException: Connection refused (Connection refused)");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect3);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        org.testinfected.time.lib.DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder2 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.atTime((int) (byte) 100, 100, 10, (int) (short) 10);
        org.testinfected.time.lib.DateBuilder dateBuilder9 = dateBuilder7.inZone("JJJJJ 23-11-20 08:46:44 TT L H msADV UTC(NIST) *");
        org.testinfected.time.lib.DateBuilder dateBuilder14 = dateBuilder9.atTime((int) ' ', (int) (byte) 10, (int) 'a', 1);
        org.testinfected.time.lib.DateBuilder dateBuilder15 = dateBuilder9.atMidnight();
        org.junit.Assert.assertNotNull(dateBuilder1);
        org.junit.Assert.assertNotNull(dateBuilder2);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder9);
        org.junit.Assert.assertNotNull(dateBuilder14);
        org.junit.Assert.assertNotNull(dateBuilder15);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.lib.SystemClock systemClock8 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date9 = systemClock8.now();
        java.util.Date date10 = systemClock8.now();
        java.util.Date date11 = systemClock8.now();
        java.lang.String str12 = daytimeDialect1.encode(date11);
        org.testinfected.time.DaytimeServer daytimeServer13 = new org.testinfected.time.DaytimeServer((int) (byte) 10, daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect15 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder16 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date17 = dateBuilder16.build();
        java.lang.String str18 = daytimeDialect15.encode(date17);
        org.testinfected.time.lib.DateBuilder dateBuilder19 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date20 = dateBuilder19.build();
        java.lang.String str21 = daytimeDialect15.encode(date20);
        org.testinfected.time.DaytimeServer daytimeServer22 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect15);
        org.testinfected.time.DaytimeDialect daytimeDialect25 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder26 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date27 = dateBuilder26.build();
        java.lang.String str28 = daytimeDialect25.encode(date27);
        org.testinfected.time.lib.DateBuilder dateBuilder29 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date30 = dateBuilder29.build();
        java.lang.String str31 = daytimeDialect25.encode(date30);
        org.testinfected.time.DaytimeClient daytimeClient32 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect25);
        daytimeServer22.setInternalClock((org.testinfected.time.Clock) daytimeClient32);
        org.testinfected.time.DaytimeDialect daytimeDialect35 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder36 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date37 = dateBuilder36.build();
        java.lang.String str38 = daytimeDialect35.encode(date37);
        org.testinfected.time.lib.DateBuilder dateBuilder39 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date40 = dateBuilder39.build();
        java.lang.String str41 = daytimeDialect35.encode(date40);
        org.testinfected.time.DaytimeServer daytimeServer42 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect35);
        org.testinfected.time.DaytimeDialect daytimeDialect45 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder46 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date47 = dateBuilder46.build();
        java.lang.String str48 = daytimeDialect45.encode(date47);
        org.testinfected.time.lib.DateBuilder dateBuilder49 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date50 = dateBuilder49.build();
        java.lang.String str51 = daytimeDialect45.encode(date50);
        org.testinfected.time.DaytimeClient daytimeClient52 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect45);
        daytimeServer42.setInternalClock((org.testinfected.time.Clock) daytimeClient52);
        daytimeServer22.setInternalClock((org.testinfected.time.Clock) daytimeClient52);
        org.testinfected.time.lib.SystemClock systemClock55 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date56 = systemClock55.now();
        daytimeServer22.setInternalClock((org.testinfected.time.Clock) systemClock55);
        daytimeServer13.setInternalClock((org.testinfected.time.Clock) systemClock55);
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Nov 20 02:46:56 CST 2023");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Nov 20 02:46:56 CST 2023");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Nov 20 02:46:56 CST 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JJJJJ 23-11-20 08:46:56 TT L H msADV UTC(NIST) *" + "'", str12, "JJJJJ 23-11-20 08:46:56 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect15);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str18, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str21, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect25);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str28, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str31, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect35);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str38, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str41, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect45);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str48, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str51, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date56);
// flaky:         org.junit.Assert.assertEquals(date56.toString(), "Mon Nov 20 02:46:56 CST 2023");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        org.testinfected.time.DaytimeDialect daytimeDialect7 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder8 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date9 = dateBuilder8.build();
        java.lang.String str10 = daytimeDialect7.encode(date9);
        org.testinfected.time.lib.DateBuilder dateBuilder11 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date12 = dateBuilder11.build();
        java.lang.String str13 = daytimeDialect7.encode(date12);
        org.testinfected.time.DaytimeClient daytimeClient14 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect7);
        org.testinfected.time.DaytimeServer daytimeServer15 = new org.testinfected.time.DaytimeServer(100, daytimeDialect7);
        org.testinfected.time.DaytimeClient daytimeClient16 = new org.testinfected.time.DaytimeClient("JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *", (int) (byte) 10, daytimeDialect7);
        org.testinfected.time.DaytimeClient daytimeClient17 = new org.testinfected.time.DaytimeClient("JJJJJ 23-11-20 08:46:54 TT L H msADV UTC(NIST) *", (int) (short) 10, daytimeDialect7);
        org.junit.Assert.assertNotNull(daytimeDialect7);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str10, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str13, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = null;
        org.testinfected.time.DaytimeClient daytimeClient12 = new org.testinfected.time.DaytimeClient("hi!", (int) (short) -1, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = daytimeClient12.now();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.IllegalArgumentException: port out of range:-1");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = org.testinfected.time.lib.DateBuilder.aDate();
        org.testinfected.time.lib.DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder6 = dateBuilder0.atTime((int) (short) -1, (int) (byte) 100, 10, 0);
        java.util.TimeZone timeZone7 = null;
        org.testinfected.time.lib.DateBuilder dateBuilder8 = dateBuilder6.in(timeZone7);
        java.lang.Class<?> wildcardClass9 = dateBuilder8.getClass();
        org.junit.Assert.assertNotNull(dateBuilder0);
        org.junit.Assert.assertNotNull(dateBuilder1);
        org.junit.Assert.assertNotNull(dateBuilder6);
        org.junit.Assert.assertNotNull(dateBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder12 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date13 = dateBuilder12.build();
        java.lang.String str14 = daytimeDialect11.encode(date13);
        org.testinfected.time.lib.DateBuilder dateBuilder15 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date16 = dateBuilder15.build();
        java.lang.String str17 = daytimeDialect11.encode(date16);
        org.testinfected.time.DaytimeClient daytimeClient18 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient18);
        org.testinfected.time.DaytimeDialect daytimeDialect21 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder22 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date23 = dateBuilder22.build();
        java.lang.String str24 = daytimeDialect21.encode(date23);
        org.testinfected.time.lib.DateBuilder dateBuilder25 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date26 = dateBuilder25.build();
        java.lang.String str27 = daytimeDialect21.encode(date26);
        org.testinfected.time.DaytimeServer daytimeServer28 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect21);
        org.testinfected.time.DaytimeDialect daytimeDialect31 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder32 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date33 = dateBuilder32.build();
        java.lang.String str34 = daytimeDialect31.encode(date33);
        org.testinfected.time.lib.DateBuilder dateBuilder35 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date36 = dateBuilder35.build();
        java.lang.String str37 = daytimeDialect31.encode(date36);
        org.testinfected.time.DaytimeClient daytimeClient38 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect31);
        daytimeServer28.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        org.testinfected.time.DaytimeDialect daytimeDialect42 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder43 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date44 = dateBuilder43.build();
        java.lang.String str45 = daytimeDialect42.encode(date44);
        org.testinfected.time.lib.DateBuilder dateBuilder46 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date47 = dateBuilder46.build();
        java.lang.String str48 = daytimeDialect42.encode(date47);
        org.testinfected.time.DaytimeServer daytimeServer49 = new org.testinfected.time.DaytimeServer(0, daytimeDialect42);
        org.testinfected.time.lib.SystemClock systemClock50 = new org.testinfected.time.lib.SystemClock();
        daytimeServer49.setInternalClock((org.testinfected.time.Clock) systemClock50);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) systemClock50);
        org.testinfected.time.ServerMonitor serverMonitor53 = null;
        daytimeServer8.removeMonitor(serverMonitor53);
        // The following exception was thrown during execution in test generation
        try {
            daytimeServer8.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect11);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str14, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str17, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect21);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str24, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str27, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect31);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str34, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str37, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect42);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str45, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str48, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.testinfected.time.DaytimeDialect daytimeDialect7 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder8 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date9 = dateBuilder8.build();
        java.lang.String str10 = daytimeDialect7.encode(date9);
        org.testinfected.time.lib.DateBuilder dateBuilder11 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date12 = dateBuilder11.build();
        java.lang.String str13 = daytimeDialect7.encode(date12);
        org.testinfected.time.DaytimeClient daytimeClient14 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect7);
        org.testinfected.time.DaytimeServer daytimeServer15 = new org.testinfected.time.DaytimeServer(100, daytimeDialect7);
        org.testinfected.time.DaytimeClient daytimeClient16 = new org.testinfected.time.DaytimeClient("JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *", (int) (byte) 10, daytimeDialect7);
        org.testinfected.time.DaytimeClient daytimeClient17 = new org.testinfected.time.DaytimeClient("JJJJJ 23-11-20 08:46:43 TT L H msADV UTC(NIST) *", (int) (short) 0, daytimeDialect7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = daytimeClient17.now();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.net.NoRouteToHostException: Can't assign requested address (Address not available)");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect7);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str10, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str13, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        org.testinfected.time.lib.DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder2 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder6 = dateBuilder2.atTime((int) (short) -1, (int) (short) 1, 0);
        org.testinfected.time.lib.DateBuilder dateBuilder10 = dateBuilder2.atTime((int) (short) 0, (int) (byte) 100, (int) (short) 100);
        java.util.TimeZone timeZone11 = null;
        org.testinfected.time.lib.DateBuilder dateBuilder12 = dateBuilder2.in(timeZone11);
        org.junit.Assert.assertNotNull(dateBuilder1);
        org.junit.Assert.assertNotNull(dateBuilder2);
        org.junit.Assert.assertNotNull(dateBuilder6);
        org.junit.Assert.assertNotNull(dateBuilder10);
        org.junit.Assert.assertNotNull(dateBuilder12);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder12 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date13 = dateBuilder12.build();
        java.lang.String str14 = daytimeDialect11.encode(date13);
        org.testinfected.time.lib.DateBuilder dateBuilder15 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date16 = dateBuilder15.build();
        java.lang.String str17 = daytimeDialect11.encode(date16);
        org.testinfected.time.DaytimeClient daytimeClient18 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient18);
        org.testinfected.time.DaytimeDialect daytimeDialect21 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder22 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date23 = dateBuilder22.build();
        java.lang.String str24 = daytimeDialect21.encode(date23);
        org.testinfected.time.lib.DateBuilder dateBuilder25 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date26 = dateBuilder25.build();
        java.lang.String str27 = daytimeDialect21.encode(date26);
        org.testinfected.time.DaytimeServer daytimeServer28 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect21);
        org.testinfected.time.DaytimeDialect daytimeDialect31 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder32 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date33 = dateBuilder32.build();
        java.lang.String str34 = daytimeDialect31.encode(date33);
        org.testinfected.time.lib.DateBuilder dateBuilder35 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date36 = dateBuilder35.build();
        java.lang.String str37 = daytimeDialect31.encode(date36);
        org.testinfected.time.DaytimeClient daytimeClient38 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect31);
        daytimeServer28.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        org.testinfected.time.DaytimeDialect daytimeDialect42 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder43 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date44 = dateBuilder43.build();
        java.lang.String str45 = daytimeDialect42.encode(date44);
        org.testinfected.time.lib.DateBuilder dateBuilder46 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date47 = dateBuilder46.build();
        java.lang.String str48 = daytimeDialect42.encode(date47);
        org.testinfected.time.DaytimeServer daytimeServer49 = new org.testinfected.time.DaytimeServer(0, daytimeDialect42);
        org.testinfected.time.lib.SystemClock systemClock50 = new org.testinfected.time.lib.SystemClock();
        daytimeServer49.setInternalClock((org.testinfected.time.Clock) systemClock50);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) systemClock50);
        // The following exception was thrown during execution in test generation
        try {
            daytimeServer8.start();
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect11);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str14, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str17, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect21);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str24, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str27, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect31);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str34, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str37, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect42);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str45, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str48, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        org.testinfected.time.DaytimeServer daytimeServer1 = new org.testinfected.time.DaytimeServer((int) (short) -1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = org.testinfected.time.lib.DateBuilder.aDate();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.fromMillis(10L);
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder3.onCalendar((int) (byte) 10, (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(dateBuilder0);
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Nov 20 02:46:57 CST 2023");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        org.testinfected.time.DaytimeDialect daytimeDialect4 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.DaytimeClient daytimeClient5 = new org.testinfected.time.DaytimeClient("JJJJJ 23-11-20 08:46:42 TT L H msADV UTC(NIST) *", (int) (short) 10, daytimeDialect4);
        org.testinfected.time.DaytimeClient daytimeClient6 = new org.testinfected.time.DaytimeClient("hi!", (int) (short) 1, daytimeDialect4);
        org.junit.Assert.assertNotNull(daytimeDialect4);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder3 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date4 = dateBuilder3.build();
        java.lang.String str5 = daytimeDialect2.encode(date4);
        org.testinfected.time.lib.DateBuilder dateBuilder6 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date7 = dateBuilder6.build();
        java.lang.String str8 = daytimeDialect2.encode(date7);
        org.testinfected.time.DaytimeServer daytimeServer9 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect2);
        java.util.Date date11 = daytimeDialect2.decode("JJJJJ 23-11-20 08:46:44 TT L H msADV UTC(NIST) *");
        org.testinfected.time.DaytimeServer daytimeServer12 = new org.testinfected.time.DaytimeServer((int) ' ', daytimeDialect2);
        org.testinfected.time.ServerMonitor serverMonitor13 = null;
        daytimeServer12.addMonitor(serverMonitor13);
        // The following exception was thrown during execution in test generation
        try {
            daytimeServer12.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect2);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str5, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str8, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Mon Nov 20 02:46:44 CST 2023");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (short) 0, (int) '4', (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder3.onCalendar((int) (short) 10, 0, (int) (byte) 100);
        org.testinfected.time.lib.DateBuilder dateBuilder12 = dateBuilder3.atTime((int) 'a', (int) (byte) -1, (int) 'a', (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder17 = dateBuilder12.atTime(0, 1, (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder12);
        org.junit.Assert.assertNotNull(dateBuilder17);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder12 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date13 = dateBuilder12.build();
        java.lang.String str14 = daytimeDialect11.encode(date13);
        org.testinfected.time.lib.DateBuilder dateBuilder15 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date16 = dateBuilder15.build();
        java.lang.String str17 = daytimeDialect11.encode(date16);
        org.testinfected.time.DaytimeClient daytimeClient18 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient18);
        org.testinfected.time.DaytimeDialect daytimeDialect21 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder22 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date23 = dateBuilder22.build();
        java.lang.String str24 = daytimeDialect21.encode(date23);
        org.testinfected.time.lib.DateBuilder dateBuilder25 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date26 = dateBuilder25.build();
        java.lang.String str27 = daytimeDialect21.encode(date26);
        org.testinfected.time.DaytimeServer daytimeServer28 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect21);
        org.testinfected.time.DaytimeDialect daytimeDialect31 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder32 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date33 = dateBuilder32.build();
        java.lang.String str34 = daytimeDialect31.encode(date33);
        org.testinfected.time.lib.DateBuilder dateBuilder35 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date36 = dateBuilder35.build();
        java.lang.String str37 = daytimeDialect31.encode(date36);
        org.testinfected.time.DaytimeClient daytimeClient38 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect31);
        daytimeServer28.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        org.testinfected.time.DaytimeDialect daytimeDialect42 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder43 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date44 = dateBuilder43.build();
        java.lang.String str45 = daytimeDialect42.encode(date44);
        org.testinfected.time.lib.DateBuilder dateBuilder46 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date47 = dateBuilder46.build();
        java.lang.String str48 = daytimeDialect42.encode(date47);
        org.testinfected.time.DaytimeServer daytimeServer49 = new org.testinfected.time.DaytimeServer(0, daytimeDialect42);
        org.testinfected.time.lib.SystemClock systemClock50 = new org.testinfected.time.lib.SystemClock();
        daytimeServer49.setInternalClock((org.testinfected.time.Clock) systemClock50);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) systemClock50);
        java.util.Date date53 = systemClock50.now();
        java.util.Date date54 = systemClock50.now();
        java.util.Date date55 = systemClock50.now();
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect11);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str14, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str17, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect21);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str24, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str27, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect31);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str34, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str37, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect42);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str45, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str48, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date53);
// flaky:         org.junit.Assert.assertEquals(date53.toString(), "Mon Nov 20 02:46:57 CST 2023");
        org.junit.Assert.assertNotNull(date54);
// flaky:         org.junit.Assert.assertEquals(date54.toString(), "Mon Nov 20 02:46:57 CST 2023");
        org.junit.Assert.assertNotNull(date55);
// flaky:         org.junit.Assert.assertEquals(date55.toString(), "Mon Nov 20 02:46:57 CST 2023");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (short) -1, 10, (int) (short) 1);
        org.testinfected.time.lib.DateBuilder dateBuilder8 = dateBuilder3.atTime((int) (short) 1, (int) (byte) 10, (-1), (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder15 = dateBuilder3.at((-1), (int) '#', (int) (short) 1, (int) ' ', (-1), 0);
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder8);
        org.junit.Assert.assertNotNull(dateBuilder15);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = org.testinfected.time.lib.DateBuilder.aDate();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder2 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder6 = dateBuilder0.onCalendar((int) (short) 0, 100, (int) (byte) -1);
        org.testinfected.time.lib.DateBuilder dateBuilder10 = dateBuilder0.onCalendar(0, (int) (short) 1, 10);
        org.junit.Assert.assertNotNull(dateBuilder0);
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Nov 20 02:46:57 CST 2023");
        org.junit.Assert.assertNotNull(dateBuilder2);
        org.junit.Assert.assertNotNull(dateBuilder6);
        org.junit.Assert.assertNotNull(dateBuilder10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        org.testinfected.time.DaytimeServer daytimeServer1 = new org.testinfected.time.DaytimeServer((-1));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        // The following exception was thrown during execution in test generation
        try {
            daytimeServer8.start();
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (byte) 0, (int) (byte) 10, 100);
        org.junit.Assert.assertNotNull(dateBuilder3);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.inZone("");
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.atTime((int) (byte) 100, (int) (short) -1, (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder11 = dateBuilder0.atTime(0, (int) '#', (int) (byte) 1);
        java.util.TimeZone timeZone12 = null;
        org.testinfected.time.lib.DateBuilder dateBuilder13 = dateBuilder11.in(timeZone12);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder11);
        org.junit.Assert.assertNotNull(dateBuilder13);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder12 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date13 = dateBuilder12.build();
        java.lang.String str14 = daytimeDialect11.encode(date13);
        org.testinfected.time.lib.DateBuilder dateBuilder15 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date16 = dateBuilder15.build();
        java.lang.String str17 = daytimeDialect11.encode(date16);
        org.testinfected.time.DaytimeClient daytimeClient18 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient18);
        // The following exception was thrown during execution in test generation
        try {
            daytimeServer8.start();
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect11);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str14, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str17, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        org.testinfected.time.DaytimeDialect daytimeDialect3 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder4 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date5 = dateBuilder4.build();
        java.lang.String str6 = daytimeDialect3.encode(date5);
        org.testinfected.time.lib.DateBuilder dateBuilder7 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date8 = dateBuilder7.build();
        java.lang.String str9 = daytimeDialect3.encode(date8);
        org.testinfected.time.DaytimeClient daytimeClient10 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect3);
        org.testinfected.time.DaytimeServer daytimeServer11 = new org.testinfected.time.DaytimeServer((int) '4', daytimeDialect3);
        org.testinfected.time.ServerMonitor serverMonitor12 = null;
        daytimeServer11.removeMonitor(serverMonitor12);
        org.junit.Assert.assertNotNull(daytimeDialect3);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str6, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str9, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder12 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date13 = dateBuilder12.build();
        java.lang.String str14 = daytimeDialect11.encode(date13);
        org.testinfected.time.lib.DateBuilder dateBuilder15 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date16 = dateBuilder15.build();
        java.lang.String str17 = daytimeDialect11.encode(date16);
        org.testinfected.time.DaytimeClient daytimeClient18 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient18);
        org.testinfected.time.DaytimeDialect daytimeDialect21 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder22 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date23 = dateBuilder22.build();
        java.lang.String str24 = daytimeDialect21.encode(date23);
        org.testinfected.time.lib.DateBuilder dateBuilder25 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date26 = dateBuilder25.build();
        java.lang.String str27 = daytimeDialect21.encode(date26);
        org.testinfected.time.DaytimeServer daytimeServer28 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect21);
        org.testinfected.time.DaytimeDialect daytimeDialect31 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder32 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date33 = dateBuilder32.build();
        java.lang.String str34 = daytimeDialect31.encode(date33);
        org.testinfected.time.lib.DateBuilder dateBuilder35 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date36 = dateBuilder35.build();
        java.lang.String str37 = daytimeDialect31.encode(date36);
        org.testinfected.time.DaytimeClient daytimeClient38 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect31);
        daytimeServer28.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        org.testinfected.time.ServerMonitor serverMonitor41 = null;
        daytimeServer8.removeMonitor(serverMonitor41);
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect11);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str14, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str17, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect21);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str24, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str27, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect31);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str34, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str37, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder5 = dateBuilder0.atTime((int) (byte) 100, (int) '#', 100);
        java.util.Date date6 = dateBuilder0.build();
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Wed Dec 03 22:36:40 CST 2");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.inZone("");
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.atTime((int) (byte) 100, (int) (short) -1, (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder11 = dateBuilder7.onCalendar((-1), (int) ' ', (int) (byte) -1);
        org.testinfected.time.lib.DateBuilder dateBuilder18 = dateBuilder7.at(0, (int) (byte) 100, (int) (byte) 100, 10, 0, (int) (byte) -1);
        java.util.Date date19 = dateBuilder18.build();
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder11);
        org.junit.Assert.assertNotNull(dateBuilder18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Jul 09 03:59:59 CST 8");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder12 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date13 = dateBuilder12.build();
        java.lang.String str14 = daytimeDialect11.encode(date13);
        org.testinfected.time.lib.DateBuilder dateBuilder15 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date16 = dateBuilder15.build();
        java.lang.String str17 = daytimeDialect11.encode(date16);
        org.testinfected.time.DaytimeClient daytimeClient18 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient18);
        org.testinfected.time.DaytimeDialect daytimeDialect21 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder22 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date23 = dateBuilder22.build();
        java.lang.String str24 = daytimeDialect21.encode(date23);
        org.testinfected.time.lib.DateBuilder dateBuilder25 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date26 = dateBuilder25.build();
        java.lang.String str27 = daytimeDialect21.encode(date26);
        org.testinfected.time.DaytimeServer daytimeServer28 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect21);
        org.testinfected.time.DaytimeDialect daytimeDialect31 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder32 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date33 = dateBuilder32.build();
        java.lang.String str34 = daytimeDialect31.encode(date33);
        org.testinfected.time.lib.DateBuilder dateBuilder35 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date36 = dateBuilder35.build();
        java.lang.String str37 = daytimeDialect31.encode(date36);
        org.testinfected.time.DaytimeClient daytimeClient38 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect31);
        daytimeServer28.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        org.testinfected.time.lib.SystemClock systemClock41 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date42 = systemClock41.now();
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) systemClock41);
        org.testinfected.time.ServerMonitor serverMonitor44 = null;
        daytimeServer8.addMonitor(serverMonitor44);
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect11);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str14, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str17, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect21);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str24, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str27, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect31);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str34, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str37, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Mon Nov 20 02:47:03 CST 2023");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = null;
        org.testinfected.time.DaytimeClient daytimeClient12 = new org.testinfected.time.DaytimeClient("hi!", (int) (short) -1, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient12);
        org.testinfected.time.ServerMonitor serverMonitor14 = null;
        daytimeServer8.addMonitor(serverMonitor14);
        org.testinfected.time.ServerMonitor serverMonitor16 = null;
        daytimeServer8.removeMonitor(serverMonitor16);
        org.testinfected.time.DaytimeDialect daytimeDialect20 = null;
        org.testinfected.time.DaytimeClient daytimeClient21 = new org.testinfected.time.DaytimeClient("JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *", 0, daytimeDialect20);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date23 = daytimeClient21.now();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.net.NoRouteToHostException: Can't assign requested address (Address not available)");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.inZone("");
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.atTime((int) (byte) 100, (int) (short) -1, (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder11 = dateBuilder7.onCalendar((-1), (int) ' ', (int) (byte) -1);
        org.testinfected.time.lib.DateBuilder dateBuilder13 = dateBuilder11.fromMillis((long) (-1));
        org.testinfected.time.lib.DateBuilder dateBuilder17 = dateBuilder11.onCalendar(10, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder11);
        org.junit.Assert.assertNotNull(dateBuilder13);
        org.junit.Assert.assertNotNull(dateBuilder17);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = org.testinfected.time.lib.DateBuilder.aDate();
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.at(100, 1, 1, (int) (short) -1, (int) (byte) -1, (int) 'a');
        org.testinfected.time.lib.DateBuilder dateBuilder11 = dateBuilder7.atTime((int) (short) 10, (int) '#', (int) (byte) 0);
        org.testinfected.time.lib.DateBuilder dateBuilder13 = dateBuilder11.fromMillis((long) (byte) 10);
        org.testinfected.time.lib.DateBuilder dateBuilder17 = dateBuilder11.atTime((int) (short) 10, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertNotNull(dateBuilder0);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder11);
        org.junit.Assert.assertNotNull(dateBuilder13);
        org.junit.Assert.assertNotNull(dateBuilder17);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        org.testinfected.time.DaytimeDialect daytimeDialect0 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder1 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date2 = dateBuilder1.build();
        java.lang.String str3 = daytimeDialect0.encode(date2);
        org.testinfected.time.lib.DateBuilder dateBuilder4 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date5 = dateBuilder4.build();
        java.lang.String str6 = daytimeDialect0.encode(date5);
        org.testinfected.time.lib.SystemClock systemClock7 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date8 = systemClock7.now();
        java.util.Date date9 = systemClock7.now();
        java.util.Date date10 = systemClock7.now();
        java.lang.String str11 = daytimeDialect0.encode(date10);
        java.util.Date date13 = daytimeDialect0.decode("JJJJJ 23-11-20 08:46:55 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect0);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str3, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str6, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Nov 20 02:47:03 CST 2023");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Nov 20 02:47:03 CST 2023");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Nov 20 02:47:03 CST 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JJJJJ 23-11-20 08:47:03 TT L H msADV UTC(NIST) *" + "'", str11, "JJJJJ 23-11-20 08:47:03 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Mon Nov 20 02:46:55 CST 2023");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder3 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date4 = dateBuilder3.build();
        java.lang.String str5 = daytimeDialect2.encode(date4);
        org.testinfected.time.lib.DateBuilder dateBuilder6 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date7 = dateBuilder6.build();
        java.lang.String str8 = daytimeDialect2.encode(date7);
        org.testinfected.time.DaytimeServer daytimeServer9 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect2);
        java.util.Date date11 = daytimeDialect2.decode("JJJJJ 23-11-20 08:46:44 TT L H msADV UTC(NIST) *");
        org.testinfected.time.DaytimeServer daytimeServer12 = new org.testinfected.time.DaytimeServer((int) ' ', daytimeDialect2);
        java.util.Date date14 = daytimeDialect2.decode("JJJJJ 23-11-20 08:46:57 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect2);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str5, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str8, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Mon Nov 20 02:46:44 CST 2023");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Nov 20 02:46:57 CST 2023");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        org.testinfected.time.DaytimeServer daytimeServer1 = new org.testinfected.time.DaytimeServer((int) (byte) 100);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = null;
        org.testinfected.time.DaytimeClient daytimeClient12 = new org.testinfected.time.DaytimeClient("hi!", (int) (short) -1, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient12);
        org.testinfected.time.ServerMonitor serverMonitor14 = null;
        daytimeServer8.addMonitor(serverMonitor14);
        org.testinfected.time.ServerMonitor serverMonitor16 = null;
        daytimeServer8.removeMonitor(serverMonitor16);
        org.testinfected.time.DaytimeDialect daytimeDialect20 = null;
        org.testinfected.time.DaytimeClient daytimeClient21 = new org.testinfected.time.DaytimeClient("JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *", 0, daytimeDialect20);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date23 = daytimeClient21.now();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.net.NoRouteToHostException: Can't assign requested address (Address not available)");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate(10, 1, (-1));
        org.junit.Assert.assertNotNull(dateBuilder3);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.inZone("");
        org.testinfected.time.lib.DateBuilder dateBuilder8 = dateBuilder3.atTime((int) (short) -1, (-1), (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder8);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        org.testinfected.time.lib.DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder2 = dateBuilder0.atMidnight();
        java.util.Date date3 = dateBuilder2.build();
        java.util.TimeZone timeZone4 = null;
        org.testinfected.time.lib.DateBuilder dateBuilder5 = dateBuilder2.in(timeZone4);
        org.testinfected.time.lib.DateBuilder dateBuilder6 = dateBuilder2.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder11 = dateBuilder2.atTime((int) (byte) 1, 1, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertNotNull(dateBuilder1);
        org.junit.Assert.assertNotNull(dateBuilder2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder5);
        org.junit.Assert.assertNotNull(dateBuilder6);
        org.junit.Assert.assertNotNull(dateBuilder11);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.inZone("");
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.atTime((int) (byte) 100, (int) (short) -1, (int) '4');
        java.util.TimeZone timeZone8 = null;
        org.testinfected.time.lib.DateBuilder dateBuilder9 = dateBuilder7.in(timeZone8);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder9);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeDialect daytimeDialect8 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder9 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date10 = dateBuilder9.build();
        java.lang.String str11 = daytimeDialect8.encode(date10);
        org.testinfected.time.Clock clock12 = org.testinfected.time.lib.BrokenClock.stoppedAt(date10);
        java.lang.String str13 = daytimeDialect1.encode(date10);
        org.testinfected.time.DaytimeServer daytimeServer14 = new org.testinfected.time.DaytimeServer((int) (byte) -1, daytimeDialect1);
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect8);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str11, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(clock12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str13, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = org.testinfected.time.lib.DateBuilder.aDate();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder2 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder6 = dateBuilder2.onCalendar((int) (short) 1, (int) (byte) 10, 0);
        org.testinfected.time.lib.DateBuilder dateBuilder13 = dateBuilder6.at((int) (short) 0, (-1), (-1), (-1), 10, (int) '4');
        org.junit.Assert.assertNotNull(dateBuilder0);
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Nov 20 02:47:03 CST 2023");
        org.junit.Assert.assertNotNull(dateBuilder2);
        org.junit.Assert.assertNotNull(dateBuilder6);
        org.junit.Assert.assertNotNull(dateBuilder13);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = org.testinfected.time.lib.DateBuilder.aDate();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.fromMillis(10L);
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder3.onCalendar(10, (int) (short) 0, 100);
        org.testinfected.time.lib.DateBuilder dateBuilder9 = dateBuilder3.inZone("JJJJJ 23-11-20 08:46:42 TT L H msADV UTC(NIST) *");
        org.testinfected.time.lib.DateBuilder dateBuilder13 = dateBuilder9.atTime((int) '#', (int) '#', 10);
        org.junit.Assert.assertNotNull(dateBuilder0);
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Nov 20 02:47:03 CST 2023");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder9);
        org.junit.Assert.assertNotNull(dateBuilder13);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (short) -1, 10, (int) (short) 1);
        org.testinfected.time.lib.DateBuilder dateBuilder8 = dateBuilder3.atTime((int) (short) 1, (int) (byte) 10, (-1), (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder9 = dateBuilder3.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder13 = dateBuilder3.onCalendar((int) (short) 0, (-1), 10);
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder8);
        org.junit.Assert.assertNotNull(dateBuilder9);
        org.junit.Assert.assertNotNull(dateBuilder13);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = null;
        org.testinfected.time.DaytimeClient daytimeClient12 = new org.testinfected.time.DaytimeClient("hi!", (int) (short) -1, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient12);
        java.lang.Class<?> wildcardClass14 = daytimeClient12.getClass();
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.inZone("");
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.atTime((int) (byte) 100, (int) (short) -1, (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder11 = dateBuilder7.onCalendar((-1), (int) ' ', (int) (byte) -1);
        org.testinfected.time.lib.DateBuilder dateBuilder13 = dateBuilder11.fromMillis((long) (-1));
        org.testinfected.time.lib.DateBuilder dateBuilder14 = dateBuilder13.atMidnight();
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder11);
        org.junit.Assert.assertNotNull(dateBuilder13);
        org.junit.Assert.assertNotNull(dateBuilder14);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (short) 0, (int) '4', (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder3.onCalendar((int) (short) 10, 0, (int) (byte) 100);
        org.testinfected.time.lib.DateBuilder dateBuilder12 = dateBuilder3.atTime((int) 'a', (int) (byte) -1, (int) 'a', (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder14 = dateBuilder3.inZone("JJJJJ 23-11-20 08:46:42 TT L H msADV UTC(NIST) *");
        org.testinfected.time.lib.DateBuilder dateBuilder19 = dateBuilder3.atTime((int) '4', (int) (byte) 0, (int) (byte) -1, 0);
        org.testinfected.time.lib.DateBuilder dateBuilder23 = dateBuilder3.onCalendar((int) (byte) 1, (int) (short) 10, (int) '4');
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder12);
        org.junit.Assert.assertNotNull(dateBuilder14);
        org.junit.Assert.assertNotNull(dateBuilder19);
        org.junit.Assert.assertNotNull(dateBuilder23);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder12 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date13 = dateBuilder12.build();
        java.lang.String str14 = daytimeDialect11.encode(date13);
        org.testinfected.time.lib.DateBuilder dateBuilder15 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date16 = dateBuilder15.build();
        java.lang.String str17 = daytimeDialect11.encode(date16);
        org.testinfected.time.DaytimeClient daytimeClient18 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient18);
        org.testinfected.time.DaytimeDialect daytimeDialect21 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder22 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date23 = dateBuilder22.build();
        java.lang.String str24 = daytimeDialect21.encode(date23);
        org.testinfected.time.lib.DateBuilder dateBuilder25 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date26 = dateBuilder25.build();
        java.lang.String str27 = daytimeDialect21.encode(date26);
        org.testinfected.time.DaytimeServer daytimeServer28 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect21);
        org.testinfected.time.DaytimeDialect daytimeDialect31 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder32 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date33 = dateBuilder32.build();
        java.lang.String str34 = daytimeDialect31.encode(date33);
        org.testinfected.time.lib.DateBuilder dateBuilder35 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date36 = dateBuilder35.build();
        java.lang.String str37 = daytimeDialect31.encode(date36);
        org.testinfected.time.DaytimeClient daytimeClient38 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect31);
        daytimeServer28.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        org.testinfected.time.ServerMonitor serverMonitor41 = null;
        daytimeServer8.addMonitor(serverMonitor41);
        org.testinfected.time.lib.SystemClock systemClock43 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date44 = systemClock43.now();
        java.util.Date date45 = systemClock43.now();
        java.util.Date date46 = systemClock43.now();
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) systemClock43);
        java.util.Date date48 = systemClock43.now();
        java.util.Date date49 = systemClock43.now();
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect11);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str14, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str17, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect21);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str24, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str27, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect31);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str34, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str37, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Mon Nov 20 02:47:03 CST 2023");
        org.junit.Assert.assertNotNull(date45);
// flaky:         org.junit.Assert.assertEquals(date45.toString(), "Mon Nov 20 02:47:03 CST 2023");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Mon Nov 20 02:47:03 CST 2023");
        org.junit.Assert.assertNotNull(date48);
// flaky:         org.junit.Assert.assertEquals(date48.toString(), "Mon Nov 20 02:47:03 CST 2023");
        org.junit.Assert.assertNotNull(date49);
// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Mon Nov 20 02:47:03 CST 2023");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        org.testinfected.time.lib.DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder2 = dateBuilder0.atMidnight();
        java.util.Date date3 = dateBuilder2.build();
        org.testinfected.time.Clock clock4 = org.testinfected.time.lib.BrokenClock.stoppedAt(date3);
        java.lang.Class<?> wildcardClass5 = clock4.getClass();
        org.junit.Assert.assertNotNull(dateBuilder1);
        org.junit.Assert.assertNotNull(dateBuilder2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(clock4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        org.testinfected.time.lib.SystemClock systemClock0 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date1 = systemClock0.now();
        java.util.Date date2 = systemClock0.now();
        java.util.Date date3 = systemClock0.now();
        java.util.Date date4 = systemClock0.now();
        org.testinfected.time.Clock clock5 = org.testinfected.time.lib.BrokenClock.stoppedAt(date4);
        java.util.Date date6 = clock5.now();
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Nov 20 02:47:09 CST 2023");
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Mon Nov 20 02:47:09 CST 2023");
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Mon Nov 20 02:47:09 CST 2023");
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Nov 20 02:47:09 CST 2023");
        org.junit.Assert.assertNotNull(clock5);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Nov 20 02:47:09 CST 2023");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        org.testinfected.time.DaytimeDialect daytimeDialect0 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder1 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date2 = dateBuilder1.build();
        java.lang.String str3 = daytimeDialect0.encode(date2);
        java.util.Date date5 = daytimeDialect0.decode("JJJJJ 23-11-20 08:46:47 TT L H msADV UTC(NIST) *");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = daytimeDialect0.decode("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 23");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect0);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str3, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Mon Nov 20 02:46:47 CST 2023");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer(0, daytimeDialect1);
        daytimeServer8.start();
        daytimeServer8.start();
        org.testinfected.time.ServerMonitor serverMonitor11 = null;
        daytimeServer8.removeMonitor(serverMonitor11);
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        org.testinfected.time.lib.DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder2 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder2.atTime((int) (byte) 0, (int) (byte) -1, (-1), (int) (short) -1);
        java.util.TimeZone timeZone8 = null;
        org.testinfected.time.lib.DateBuilder dateBuilder9 = dateBuilder2.in(timeZone8);
        org.junit.Assert.assertNotNull(dateBuilder1);
        org.junit.Assert.assertNotNull(dateBuilder2);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder9);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        org.testinfected.time.lib.DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder2 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder2.atTime((int) (byte) 0, (int) (byte) -1, (-1), (int) (short) -1);
        org.testinfected.time.lib.DateBuilder dateBuilder11 = dateBuilder2.onCalendar((int) (byte) 10, 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass12 = dateBuilder11.getClass();
        org.junit.Assert.assertNotNull(dateBuilder1);
        org.junit.Assert.assertNotNull(dateBuilder2);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = org.testinfected.time.lib.DateBuilder.aDate();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder2 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder6 = dateBuilder0.onCalendar((int) (short) 0, 100, (int) (byte) -1);
        org.testinfected.time.lib.DateBuilder dateBuilder10 = dateBuilder0.onCalendar((int) (short) 10, (int) (byte) 1, (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder12 = dateBuilder10.inZone("JJJJJ 23-11-20 08:47:03 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(dateBuilder0);
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Nov 20 02:47:14 CST 2023");
        org.junit.Assert.assertNotNull(dateBuilder2);
        org.junit.Assert.assertNotNull(dateBuilder6);
        org.junit.Assert.assertNotNull(dateBuilder10);
        org.junit.Assert.assertNotNull(dateBuilder12);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (short) 0, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(dateBuilder3);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.DaytimeServer daytimeServer3 = new org.testinfected.time.DaytimeServer((int) (short) 0, daytimeDialect2);
        org.testinfected.time.DaytimeServer daytimeServer4 = new org.testinfected.time.DaytimeServer((int) '4', daytimeDialect2);
        org.testinfected.time.DaytimeDialect daytimeDialect6 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder7 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date8 = dateBuilder7.build();
        java.lang.String str9 = daytimeDialect6.encode(date8);
        org.testinfected.time.lib.DateBuilder dateBuilder10 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date11 = dateBuilder10.build();
        java.lang.String str12 = daytimeDialect6.encode(date11);
        org.testinfected.time.DaytimeServer daytimeServer13 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect6);
        org.testinfected.time.DaytimeDialect daytimeDialect16 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder17 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date18 = dateBuilder17.build();
        java.lang.String str19 = daytimeDialect16.encode(date18);
        org.testinfected.time.lib.DateBuilder dateBuilder20 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date21 = dateBuilder20.build();
        java.lang.String str22 = daytimeDialect16.encode(date21);
        org.testinfected.time.DaytimeClient daytimeClient23 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect16);
        daytimeServer13.setInternalClock((org.testinfected.time.Clock) daytimeClient23);
        org.testinfected.time.DaytimeDialect daytimeDialect26 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder27 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date28 = dateBuilder27.build();
        java.lang.String str29 = daytimeDialect26.encode(date28);
        org.testinfected.time.lib.DateBuilder dateBuilder30 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date31 = dateBuilder30.build();
        java.lang.String str32 = daytimeDialect26.encode(date31);
        org.testinfected.time.DaytimeServer daytimeServer33 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect26);
        org.testinfected.time.DaytimeDialect daytimeDialect36 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder37 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date38 = dateBuilder37.build();
        java.lang.String str39 = daytimeDialect36.encode(date38);
        org.testinfected.time.lib.DateBuilder dateBuilder40 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date41 = dateBuilder40.build();
        java.lang.String str42 = daytimeDialect36.encode(date41);
        org.testinfected.time.DaytimeClient daytimeClient43 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect36);
        daytimeServer33.setInternalClock((org.testinfected.time.Clock) daytimeClient43);
        daytimeServer13.setInternalClock((org.testinfected.time.Clock) daytimeClient43);
        org.testinfected.time.lib.SystemClock systemClock46 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date47 = systemClock46.now();
        daytimeServer13.setInternalClock((org.testinfected.time.Clock) systemClock46);
        java.util.Date date49 = systemClock46.now();
        daytimeServer4.setInternalClock((org.testinfected.time.Clock) systemClock46);
        org.testinfected.time.ServerMonitor serverMonitor51 = null;
        daytimeServer4.addMonitor(serverMonitor51);
        org.junit.Assert.assertNotNull(daytimeDialect2);
        org.junit.Assert.assertNotNull(daytimeDialect6);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str9, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str12, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect16);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str19, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str22, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect26);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str29, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str32, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect36);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str39, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str42, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date47);
// flaky:         org.junit.Assert.assertEquals(date47.toString(), "Mon Nov 20 02:47:14 CST 2023");
        org.junit.Assert.assertNotNull(date49);
// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Mon Nov 20 02:47:14 CST 2023");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.DaytimeServer daytimeServer2 = new org.testinfected.time.DaytimeServer((int) (short) 0, daytimeDialect1);
        org.testinfected.time.lib.SystemClock systemClock3 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date4 = systemClock3.now();
        java.util.Date date5 = systemClock3.now();
        java.lang.String str6 = daytimeDialect1.encode(date5);
        java.util.Date date8 = daytimeDialect1.decode("JJJJJ 23-11-20 08:46:53 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Nov 20 02:47:14 CST 2023");
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Nov 20 02:47:14 CST 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JJJJJ 23-11-20 08:47:14 TT L H msADV UTC(NIST) *" + "'", str6, "JJJJJ 23-11-20 08:47:14 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Mon Nov 20 02:46:53 CST 2023");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.inZone("");
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.atTime((int) (byte) 100, (int) (short) -1, (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder11 = dateBuilder7.onCalendar((-1), (int) ' ', (int) (byte) -1);
        org.testinfected.time.lib.DateBuilder dateBuilder13 = dateBuilder11.fromMillis((long) (-1));
        org.testinfected.time.lib.DateBuilder dateBuilder20 = dateBuilder11.at((int) (byte) 0, 0, (int) (short) 10, 1, (int) ' ', (-1));
        org.testinfected.time.lib.DateBuilder dateBuilder25 = dateBuilder11.atTime((int) (byte) -1, (int) (short) -1, 10, (int) 'a');
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder11);
        org.junit.Assert.assertNotNull(dateBuilder13);
        org.junit.Assert.assertNotNull(dateBuilder20);
        org.junit.Assert.assertNotNull(dateBuilder25);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (short) -1, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(dateBuilder3);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.DaytimeServer daytimeServer2 = new org.testinfected.time.DaytimeServer((int) (short) 0, daytimeDialect1);
        org.testinfected.time.lib.SystemClock systemClock3 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date4 = systemClock3.now();
        java.util.Date date5 = systemClock3.now();
        java.lang.String str6 = daytimeDialect1.encode(date5);
        org.testinfected.time.Clock clock7 = org.testinfected.time.lib.BrokenClock.stoppedAt(date5);
        java.util.Date date8 = clock7.now();
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Nov 20 02:47:14 CST 2023");
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Nov 20 02:47:14 CST 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JJJJJ 23-11-20 08:47:14 TT L H msADV UTC(NIST) *" + "'", str6, "JJJJJ 23-11-20 08:47:14 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(clock7);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Nov 20 02:47:14 CST 2023");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder3 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date4 = dateBuilder3.build();
        java.lang.String str5 = daytimeDialect2.encode(date4);
        org.testinfected.time.lib.DateBuilder dateBuilder6 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date7 = dateBuilder6.build();
        java.lang.String str8 = daytimeDialect2.encode(date7);
        org.testinfected.time.DaytimeClient daytimeClient9 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect2);
        java.util.Date date11 = daytimeDialect2.decode("JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.testinfected.time.DaytimeDialect daytimeDialect12 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder13 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date14 = dateBuilder13.build();
        java.lang.String str15 = daytimeDialect12.encode(date14);
        org.testinfected.time.lib.DateBuilder dateBuilder16 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date17 = dateBuilder16.build();
        java.lang.String str18 = daytimeDialect12.encode(date17);
        java.lang.String str19 = daytimeDialect2.encode(date17);
        org.testinfected.time.DaytimeDialect daytimeDialect21 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.DaytimeServer daytimeServer22 = new org.testinfected.time.DaytimeServer((int) (short) 0, daytimeDialect21);
        org.testinfected.time.lib.SystemClock systemClock23 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date24 = systemClock23.now();
        java.util.Date date25 = systemClock23.now();
        java.lang.String str26 = daytimeDialect21.encode(date25);
        org.testinfected.time.Clock clock27 = org.testinfected.time.lib.BrokenClock.stoppedAt(date25);
        org.testinfected.time.Clock clock28 = org.testinfected.time.lib.BrokenClock.stoppedAt(date25);
        java.lang.String str29 = daytimeDialect2.encode(date25);
        org.junit.Assert.assertNotNull(daytimeDialect2);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str5, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str8, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Fri Nov 29 18:00:00 CST 2002");
        org.junit.Assert.assertNotNull(daytimeDialect12);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str15, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str18, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str19, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect21);
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Mon Nov 20 02:47:14 CST 2023");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Mon Nov 20 02:47:14 CST 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "JJJJJ 23-11-20 08:47:14 TT L H msADV UTC(NIST) *" + "'", str26, "JJJJJ 23-11-20 08:47:14 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(clock27);
        org.junit.Assert.assertNotNull(clock28);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "JJJJJ 23-11-20 08:47:14 TT L H msADV UTC(NIST) *" + "'", str29, "JJJJJ 23-11-20 08:47:14 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer(0, daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect10 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder11 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date12 = dateBuilder11.build();
        java.lang.String str13 = daytimeDialect10.encode(date12);
        org.testinfected.time.lib.DateBuilder dateBuilder14 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date15 = dateBuilder14.build();
        java.lang.String str16 = daytimeDialect10.encode(date15);
        org.testinfected.time.DaytimeServer daytimeServer17 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect10);
        org.testinfected.time.DaytimeDialect daytimeDialect20 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder21 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date22 = dateBuilder21.build();
        java.lang.String str23 = daytimeDialect20.encode(date22);
        org.testinfected.time.lib.DateBuilder dateBuilder24 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date25 = dateBuilder24.build();
        java.lang.String str26 = daytimeDialect20.encode(date25);
        org.testinfected.time.DaytimeClient daytimeClient27 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect20);
        daytimeServer17.setInternalClock((org.testinfected.time.Clock) daytimeClient27);
        org.testinfected.time.DaytimeDialect daytimeDialect30 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder31 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date32 = dateBuilder31.build();
        java.lang.String str33 = daytimeDialect30.encode(date32);
        org.testinfected.time.lib.DateBuilder dateBuilder34 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date35 = dateBuilder34.build();
        java.lang.String str36 = daytimeDialect30.encode(date35);
        org.testinfected.time.DaytimeServer daytimeServer37 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect30);
        org.testinfected.time.DaytimeDialect daytimeDialect40 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder41 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date42 = dateBuilder41.build();
        java.lang.String str43 = daytimeDialect40.encode(date42);
        org.testinfected.time.lib.DateBuilder dateBuilder44 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date45 = dateBuilder44.build();
        java.lang.String str46 = daytimeDialect40.encode(date45);
        org.testinfected.time.DaytimeClient daytimeClient47 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect40);
        daytimeServer37.setInternalClock((org.testinfected.time.Clock) daytimeClient47);
        daytimeServer17.setInternalClock((org.testinfected.time.Clock) daytimeClient47);
        org.testinfected.time.DaytimeDialect daytimeDialect51 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder52 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date53 = dateBuilder52.build();
        java.lang.String str54 = daytimeDialect51.encode(date53);
        org.testinfected.time.lib.DateBuilder dateBuilder55 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date56 = dateBuilder55.build();
        java.lang.String str57 = daytimeDialect51.encode(date56);
        org.testinfected.time.DaytimeServer daytimeServer58 = new org.testinfected.time.DaytimeServer(0, daytimeDialect51);
        org.testinfected.time.lib.SystemClock systemClock59 = new org.testinfected.time.lib.SystemClock();
        daytimeServer58.setInternalClock((org.testinfected.time.Clock) systemClock59);
        daytimeServer17.setInternalClock((org.testinfected.time.Clock) systemClock59);
        java.util.Date date62 = systemClock59.now();
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) systemClock59);
        daytimeServer8.start();
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect10);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str13, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str16, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect20);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str23, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str26, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect30);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str33, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str36, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect40);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str43, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str46, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect51);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str54, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str57, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date62);
// flaky:         org.junit.Assert.assertEquals(date62.toString(), "Mon Nov 20 02:47:14 CST 2023");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.DaytimeServer daytimeServer2 = new org.testinfected.time.DaytimeServer((int) (short) 0, daytimeDialect1);
        java.util.Date date4 = daytimeDialect1.decode("JJJJJ 23-11-20 08:46:43 TT L H msADV UTC(NIST) *");
        java.util.Date date6 = daytimeDialect1.decode("JJJJJ 23-11-20 00:40:10 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Mon Nov 20 02:46:43 CST 2023");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Nov 19 18:40:10 CST 2023");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) ' ', (-1), (int) '#');
        org.junit.Assert.assertNotNull(dateBuilder3);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.ServerMonitor serverMonitor9 = null;
        daytimeServer8.addMonitor(serverMonitor9);
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        org.testinfected.time.DaytimeDialect daytimeDialect3 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder4 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date5 = dateBuilder4.build();
        java.lang.String str6 = daytimeDialect3.encode(date5);
        org.testinfected.time.lib.DateBuilder dateBuilder7 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date8 = dateBuilder7.build();
        java.lang.String str9 = daytimeDialect3.encode(date8);
        org.testinfected.time.DaytimeClient daytimeClient10 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect3);
        org.testinfected.time.DaytimeServer daytimeServer11 = new org.testinfected.time.DaytimeServer(100, daytimeDialect3);
        org.testinfected.time.DaytimeDialect daytimeDialect12 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder13 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date14 = dateBuilder13.build();
        java.lang.String str15 = daytimeDialect12.encode(date14);
        org.testinfected.time.Clock clock16 = org.testinfected.time.lib.BrokenClock.stoppedAt(date14);
        org.testinfected.time.Clock clock17 = org.testinfected.time.lib.BrokenClock.stoppedAt(date14);
        java.lang.String str18 = daytimeDialect3.encode(date14);
        java.util.Date date20 = daytimeDialect3.decode("JJJJJ 23-11-20 08:46:44 TT L H msADV UTC(NIST) *");
        org.testinfected.time.Clock clock21 = org.testinfected.time.lib.BrokenClock.stoppedAt(date20);
        org.junit.Assert.assertNotNull(daytimeDialect3);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str6, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str9, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect12);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str15, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(clock16);
        org.junit.Assert.assertNotNull(clock17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str18, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Mon Nov 20 02:46:44 CST 2023");
        org.junit.Assert.assertNotNull(clock21);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder3 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date4 = dateBuilder3.build();
        java.lang.String str5 = daytimeDialect2.encode(date4);
        org.testinfected.time.lib.DateBuilder dateBuilder6 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date7 = dateBuilder6.build();
        java.lang.String str8 = daytimeDialect2.encode(date7);
        org.testinfected.time.DaytimeServer daytimeServer9 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect2);
        org.testinfected.time.DaytimeDialect daytimeDialect12 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder13 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date14 = dateBuilder13.build();
        java.lang.String str15 = daytimeDialect12.encode(date14);
        org.testinfected.time.lib.DateBuilder dateBuilder16 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date17 = dateBuilder16.build();
        java.lang.String str18 = daytimeDialect12.encode(date17);
        org.testinfected.time.DaytimeClient daytimeClient19 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect12);
        java.util.Date date21 = daytimeDialect12.decode("JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.testinfected.time.DaytimeDialect daytimeDialect22 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder23 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date24 = dateBuilder23.build();
        java.lang.String str25 = daytimeDialect22.encode(date24);
        org.testinfected.time.lib.DateBuilder dateBuilder26 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date27 = dateBuilder26.build();
        java.lang.String str28 = daytimeDialect22.encode(date27);
        org.testinfected.time.lib.SystemClock systemClock29 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date30 = systemClock29.now();
        java.util.Date date31 = systemClock29.now();
        java.util.Date date32 = systemClock29.now();
        java.lang.String str33 = daytimeDialect22.encode(date32);
        java.lang.String str34 = daytimeDialect12.encode(date32);
        java.lang.String str35 = daytimeDialect2.encode(date32);
        org.testinfected.time.DaytimeServer daytimeServer36 = new org.testinfected.time.DaytimeServer((int) (byte) 1, daytimeDialect2);
        org.testinfected.time.ServerMonitor serverMonitor37 = null;
        daytimeServer36.addMonitor(serverMonitor37);
        // The following exception was thrown during execution in test generation
        try {
            daytimeServer36.start();
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect2);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str5, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str8, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect12);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str15, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str18, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Fri Nov 29 18:00:00 CST 2002");
        org.junit.Assert.assertNotNull(daytimeDialect22);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str25, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str28, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Mon Nov 20 02:47:15 CST 2023");
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Mon Nov 20 02:47:15 CST 2023");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Mon Nov 20 02:47:15 CST 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "JJJJJ 23-11-20 08:47:15 TT L H msADV UTC(NIST) *" + "'", str33, "JJJJJ 23-11-20 08:47:15 TT L H msADV UTC(NIST) *");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "JJJJJ 23-11-20 08:47:15 TT L H msADV UTC(NIST) *" + "'", str34, "JJJJJ 23-11-20 08:47:15 TT L H msADV UTC(NIST) *");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "JJJJJ 23-11-20 08:47:15 TT L H msADV UTC(NIST) *" + "'", str35, "JJJJJ 23-11-20 08:47:15 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.DaytimeServer daytimeServer3 = new org.testinfected.time.DaytimeServer((int) (short) 0, daytimeDialect2);
        org.testinfected.time.DaytimeServer daytimeServer4 = new org.testinfected.time.DaytimeServer((int) '4', daytimeDialect2);
// flaky:         daytimeServer4.start();
        org.junit.Assert.assertNotNull(daytimeDialect2);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder3 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date4 = dateBuilder3.build();
        java.lang.String str5 = daytimeDialect2.encode(date4);
        org.testinfected.time.lib.DateBuilder dateBuilder6 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date7 = dateBuilder6.build();
        java.lang.String str8 = daytimeDialect2.encode(date7);
        java.util.Date date10 = daytimeDialect2.decode("JJJJJ 23-11-20 08:46:53 TT L H msADV UTC(NIST) *");
        org.testinfected.time.lib.DateBuilder dateBuilder11 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date12 = dateBuilder11.build();
        java.lang.String str13 = daytimeDialect2.encode(date12);
        org.testinfected.time.DaytimeClient daytimeClient14 = new org.testinfected.time.DaytimeClient("JJJJJ 23-11-20 08:46:56 TT L H msADV UTC(NIST) *", 100, daytimeDialect2);
        org.junit.Assert.assertNotNull(daytimeDialect2);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str5, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str8, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Mon Nov 20 02:46:53 CST 2023");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str13, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        java.util.TimeZone timeZone2 = null;
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.in(timeZone2);
        org.testinfected.time.lib.DateBuilder dateBuilder10 = dateBuilder0.at((int) (short) -1, (int) (byte) 10, (int) (short) 1, 100, (int) (byte) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = dateBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder10);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.DaytimeServer daytimeServer3 = new org.testinfected.time.DaytimeServer((int) (short) 0, daytimeDialect2);
        org.testinfected.time.DaytimeServer daytimeServer4 = new org.testinfected.time.DaytimeServer((int) '4', daytimeDialect2);
        java.util.Date date6 = daytimeDialect2.decode("JJJJJ 23-11-20 08:46:53 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect2);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Mon Nov 20 02:46:53 CST 2023");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = org.testinfected.time.lib.DateBuilder.aDate();
        org.testinfected.time.lib.DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder6 = dateBuilder0.atTime((int) (short) -1, (int) (byte) 100, 10, 0);
        org.testinfected.time.lib.DateBuilder dateBuilder8 = dateBuilder0.fromMillis((long) 10);
        org.testinfected.time.lib.DateBuilder dateBuilder9 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder14 = dateBuilder9.atTime((int) (byte) 100, 0, (int) (short) -1, (-1));
        java.util.TimeZone timeZone15 = null;
        org.testinfected.time.lib.DateBuilder dateBuilder16 = dateBuilder9.in(timeZone15);
        org.junit.Assert.assertNotNull(dateBuilder0);
        org.junit.Assert.assertNotNull(dateBuilder1);
        org.junit.Assert.assertNotNull(dateBuilder6);
        org.junit.Assert.assertNotNull(dateBuilder8);
        org.junit.Assert.assertNotNull(dateBuilder9);
        org.junit.Assert.assertNotNull(dateBuilder14);
        org.junit.Assert.assertNotNull(dateBuilder16);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder3 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date4 = dateBuilder3.build();
        java.lang.String str5 = daytimeDialect2.encode(date4);
        org.testinfected.time.lib.DateBuilder dateBuilder6 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date7 = dateBuilder6.build();
        java.lang.String str8 = daytimeDialect2.encode(date7);
        org.testinfected.time.DaytimeServer daytimeServer9 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect2);
        java.util.Date date11 = daytimeDialect2.decode("JJJJJ 23-11-20 08:46:44 TT L H msADV UTC(NIST) *");
        org.testinfected.time.DaytimeServer daytimeServer12 = new org.testinfected.time.DaytimeServer((int) ' ', daytimeDialect2);
        org.testinfected.time.DaytimeDialect daytimeDialect17 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.DaytimeServer daytimeServer18 = new org.testinfected.time.DaytimeServer((int) (short) 0, daytimeDialect17);
        org.testinfected.time.DaytimeClient daytimeClient19 = new org.testinfected.time.DaytimeClient("", (int) '4', daytimeDialect17);
        org.testinfected.time.DaytimeServer daytimeServer20 = new org.testinfected.time.DaytimeServer((int) (short) -1, daytimeDialect17);
        org.testinfected.time.lib.DateBuilder dateBuilder21 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date22 = dateBuilder21.build();
        org.testinfected.time.lib.DateBuilder dateBuilder24 = dateBuilder21.inZone("");
        org.testinfected.time.lib.DateBuilder dateBuilder28 = dateBuilder21.atTime((int) (byte) 100, (int) (short) -1, (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder30 = dateBuilder28.fromMillis((long) 100);
        java.util.Date date31 = dateBuilder30.build();
        java.lang.String str32 = daytimeDialect17.encode(date31);
        java.lang.String str33 = daytimeDialect2.encode(date31);
        org.junit.Assert.assertNotNull(daytimeDialect2);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str5, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str8, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Mon Nov 20 02:46:44 CST 2023");
        org.junit.Assert.assertNotNull(daytimeDialect17);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder24);
        org.junit.Assert.assertNotNull(dateBuilder28);
        org.junit.Assert.assertNotNull(dateBuilder30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "JJJJJ 70-01-01 00:00:00 TT L H msADV UTC(NIST) *" + "'", str32, "JJJJJ 70-01-01 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "JJJJJ 70-01-01 00:00:00 TT L H msADV UTC(NIST) *" + "'", str33, "JJJJJ 70-01-01 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate(0, 1, 10);
        org.junit.Assert.assertNotNull(dateBuilder3);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (short) 0, (int) '4', (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder3.onCalendar((int) (short) 10, 0, (int) (byte) 100);
        org.testinfected.time.lib.DateBuilder dateBuilder9 = dateBuilder3.inZone("JJJJJ 23-11-20 08:46:42 TT L H msADV UTC(NIST) *");
        org.testinfected.time.lib.DateBuilder dateBuilder13 = dateBuilder3.atTime((int) (byte) -1, (int) (short) 1, (int) '4');
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder9);
        org.junit.Assert.assertNotNull(dateBuilder13);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate(1, (int) ' ', (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = dateBuilder3.getClass();
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        org.testinfected.time.DaytimeDialect daytimeDialect3 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder4 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date5 = dateBuilder4.build();
        java.lang.String str6 = daytimeDialect3.encode(date5);
        org.testinfected.time.lib.DateBuilder dateBuilder7 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date8 = dateBuilder7.build();
        java.lang.String str9 = daytimeDialect3.encode(date8);
        org.testinfected.time.DaytimeServer daytimeServer10 = new org.testinfected.time.DaytimeServer(0, daytimeDialect3);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder12 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date13 = dateBuilder12.build();
        java.lang.String str14 = daytimeDialect11.encode(date13);
        org.testinfected.time.Clock clock15 = org.testinfected.time.lib.BrokenClock.stoppedAt(date13);
        java.lang.String str16 = daytimeDialect3.encode(date13);
        org.testinfected.time.DaytimeClient daytimeClient17 = new org.testinfected.time.DaytimeClient("", 0, daytimeDialect3);
        java.lang.Class<?> wildcardClass18 = daytimeDialect3.getClass();
        org.junit.Assert.assertNotNull(daytimeDialect3);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str6, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str9, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect11);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str14, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(clock15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str16, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        org.testinfected.time.lib.DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder1.inZone("hi!");
        org.junit.Assert.assertNotNull(dateBuilder1);
        org.junit.Assert.assertNotNull(dateBuilder3);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.DaytimeServer daytimeServer2 = new org.testinfected.time.DaytimeServer((int) (short) 0, daytimeDialect1);
        daytimeServer2.start();
        daytimeServer2.stop();
        daytimeServer2.stop();
        org.junit.Assert.assertNotNull(daytimeDialect1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.lib.SystemClock systemClock8 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date9 = systemClock8.now();
        java.util.Date date10 = systemClock8.now();
        java.util.Date date11 = systemClock8.now();
        java.lang.String str12 = daytimeDialect1.encode(date11);
        org.testinfected.time.DaytimeServer daytimeServer13 = new org.testinfected.time.DaytimeServer((int) (byte) 10, daytimeDialect1);
        org.testinfected.time.ServerMonitor serverMonitor14 = null;
        daytimeServer13.removeMonitor(serverMonitor14);
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Nov 20 02:47:20 CST 2023");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Nov 20 02:47:20 CST 2023");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Nov 20 02:47:20 CST 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JJJJJ 23-11-20 08:47:20 TT L H msADV UTC(NIST) *" + "'", str12, "JJJJJ 23-11-20 08:47:20 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.inZone("");
        java.util.Date date4 = dateBuilder3.build();
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sat Nov 29 18:00:00 CST 2");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        org.testinfected.time.DaytimeServer daytimeServer1 = new org.testinfected.time.DaytimeServer((int) '#');
        org.testinfected.time.ServerMonitor serverMonitor2 = null;
        daytimeServer1.removeMonitor(serverMonitor2);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = org.testinfected.time.lib.DateBuilder.aDate();
        org.testinfected.time.lib.DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder6 = dateBuilder0.atTime((int) (short) -1, (int) (byte) 100, 10, 0);
        org.testinfected.time.lib.DateBuilder dateBuilder8 = dateBuilder0.fromMillis((long) 10);
        org.testinfected.time.lib.DateBuilder dateBuilder9 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder16 = dateBuilder0.at((int) '4', (int) (byte) -1, 0, (int) (byte) -1, (int) (byte) 100, (int) ' ');
        org.testinfected.time.lib.DateBuilder dateBuilder21 = dateBuilder16.atTime((int) (byte) 0, (int) '#', 100, (int) (short) 10);
        org.junit.Assert.assertNotNull(dateBuilder0);
        org.junit.Assert.assertNotNull(dateBuilder1);
        org.junit.Assert.assertNotNull(dateBuilder6);
        org.junit.Assert.assertNotNull(dateBuilder8);
        org.junit.Assert.assertNotNull(dateBuilder9);
        org.junit.Assert.assertNotNull(dateBuilder16);
        org.junit.Assert.assertNotNull(dateBuilder21);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = org.testinfected.time.lib.DateBuilder.aDate();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder2 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder6 = dateBuilder0.atTime((int) (short) 10, (int) (byte) 1, (-1));
        org.junit.Assert.assertNotNull(dateBuilder0);
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Nov 20 02:47:20 CST 2023");
        org.junit.Assert.assertNotNull(dateBuilder2);
        org.junit.Assert.assertNotNull(dateBuilder6);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer(0, daytimeDialect1);
        org.testinfected.time.lib.SystemClock systemClock9 = new org.testinfected.time.lib.SystemClock();
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) systemClock9);
        java.util.Date date11 = systemClock9.now();
        java.util.Date date12 = systemClock9.now();
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Nov 20 02:47:20 CST 2023");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Nov 20 02:47:20 CST 2023");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder3 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date4 = dateBuilder3.build();
        java.lang.String str5 = daytimeDialect2.encode(date4);
        org.testinfected.time.lib.DateBuilder dateBuilder6 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date7 = dateBuilder6.build();
        java.lang.String str8 = daytimeDialect2.encode(date7);
        org.testinfected.time.lib.SystemClock systemClock9 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date10 = systemClock9.now();
        java.util.Date date11 = systemClock9.now();
        java.util.Date date12 = systemClock9.now();
        java.lang.String str13 = daytimeDialect2.encode(date12);
        org.testinfected.time.DaytimeDialect daytimeDialect14 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder15 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date16 = dateBuilder15.build();
        java.lang.String str17 = daytimeDialect14.encode(date16);
        org.testinfected.time.lib.DateBuilder dateBuilder18 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date19 = dateBuilder18.build();
        java.lang.String str20 = daytimeDialect14.encode(date19);
        org.testinfected.time.lib.SystemClock systemClock21 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date22 = systemClock21.now();
        java.util.Date date23 = systemClock21.now();
        java.util.Date date24 = systemClock21.now();
        java.lang.String str25 = daytimeDialect14.encode(date24);
        java.lang.String str26 = daytimeDialect2.encode(date24);
        org.testinfected.time.DaytimeClient daytimeClient27 = new org.testinfected.time.DaytimeClient("JJJJJ 23-11-20 08:46:47 TT L H msADV UTC(NIST) *", 10, daytimeDialect2);
        java.util.Date date29 = daytimeDialect2.decode("JJJJJ 23-11-20 08:46:44 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect2);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str5, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str8, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Nov 20 02:47:20 CST 2023");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Nov 20 02:47:20 CST 2023");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Nov 20 02:47:20 CST 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JJJJJ 23-11-20 08:47:20 TT L H msADV UTC(NIST) *" + "'", str13, "JJJJJ 23-11-20 08:47:20 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect14);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str17, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str20, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Mon Nov 20 02:47:20 CST 2023");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Mon Nov 20 02:47:20 CST 2023");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Mon Nov 20 02:47:20 CST 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "JJJJJ 23-11-20 08:47:20 TT L H msADV UTC(NIST) *" + "'", str25, "JJJJJ 23-11-20 08:47:20 TT L H msADV UTC(NIST) *");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "JJJJJ 23-11-20 08:47:20 TT L H msADV UTC(NIST) *" + "'", str26, "JJJJJ 23-11-20 08:47:20 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Mon Nov 20 02:46:44 CST 2023");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        org.testinfected.time.lib.DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder2 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.atTime((int) (byte) 100, 100, 10, (int) (short) 10);
        org.testinfected.time.lib.DateBuilder dateBuilder9 = dateBuilder7.inZone("JJJJJ 23-11-20 08:46:44 TT L H msADV UTC(NIST) *");
        org.testinfected.time.lib.DateBuilder dateBuilder14 = dateBuilder9.atTime((int) (byte) 0, (int) ' ', (int) '#', (int) (byte) 1);
        org.junit.Assert.assertNotNull(dateBuilder1);
        org.junit.Assert.assertNotNull(dateBuilder2);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder9);
        org.junit.Assert.assertNotNull(dateBuilder14);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = org.testinfected.time.lib.DateBuilder.aDate();
        org.testinfected.time.lib.DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder6 = dateBuilder0.atTime((int) (short) -1, (int) (byte) 100, 10, 0);
        org.testinfected.time.lib.DateBuilder dateBuilder8 = dateBuilder0.fromMillis((long) 10);
        org.testinfected.time.lib.DateBuilder dateBuilder9 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder16 = dateBuilder0.at((int) '4', (int) (byte) -1, 0, (int) (byte) -1, (int) (byte) 100, (int) ' ');
        org.testinfected.time.lib.DateBuilder dateBuilder18 = dateBuilder16.inZone("JJJJJ 70-01-01 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(dateBuilder0);
        org.junit.Assert.assertNotNull(dateBuilder1);
        org.junit.Assert.assertNotNull(dateBuilder6);
        org.junit.Assert.assertNotNull(dateBuilder8);
        org.junit.Assert.assertNotNull(dateBuilder9);
        org.junit.Assert.assertNotNull(dateBuilder16);
        org.junit.Assert.assertNotNull(dateBuilder18);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.inZone("");
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.atTime((int) (byte) 100, (int) (short) -1, (int) '4');
        java.util.TimeZone timeZone8 = null;
        org.testinfected.time.lib.DateBuilder dateBuilder9 = dateBuilder0.in(timeZone8);
        org.testinfected.time.lib.DateBuilder dateBuilder10 = dateBuilder9.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder14 = dateBuilder9.onCalendar((-1), (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder9);
        org.junit.Assert.assertNotNull(dateBuilder10);
        org.junit.Assert.assertNotNull(dateBuilder14);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        org.testinfected.time.DaytimeDialect daytimeDialect4 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.DaytimeClient daytimeClient5 = new org.testinfected.time.DaytimeClient("JJJJJ 23-11-20 08:46:42 TT L H msADV UTC(NIST) *", (int) (short) 10, daytimeDialect4);
        org.testinfected.time.DaytimeClient daytimeClient6 = new org.testinfected.time.DaytimeClient("JJJJJ 23-11-20 08:46:45 TT L H msADV UTC(NIST) *", (int) (short) 0, daytimeDialect4);
        java.util.Date date8 = daytimeDialect4.decode("JJJJJ 23-11-20 08:47:03 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect4);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Mon Nov 20 02:47:03 CST 2023");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder3 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date4 = dateBuilder3.build();
        java.lang.String str5 = daytimeDialect2.encode(date4);
        org.testinfected.time.lib.DateBuilder dateBuilder6 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date7 = dateBuilder6.build();
        java.lang.String str8 = daytimeDialect2.encode(date7);
        org.testinfected.time.DaytimeClient daytimeClient9 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect2);
        java.util.Date date11 = daytimeDialect2.decode("JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.testinfected.time.DaytimeDialect daytimeDialect13 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder14 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date15 = dateBuilder14.build();
        java.lang.String str16 = daytimeDialect13.encode(date15);
        org.testinfected.time.lib.DateBuilder dateBuilder17 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date18 = dateBuilder17.build();
        java.lang.String str19 = daytimeDialect13.encode(date18);
        org.testinfected.time.DaytimeServer daytimeServer20 = new org.testinfected.time.DaytimeServer(0, daytimeDialect13);
        org.testinfected.time.lib.SystemClock systemClock21 = new org.testinfected.time.lib.SystemClock();
        daytimeServer20.setInternalClock((org.testinfected.time.Clock) systemClock21);
        java.util.Date date23 = systemClock21.now();
        java.util.Date date24 = systemClock21.now();
        java.util.Date date25 = systemClock21.now();
        java.lang.String str26 = daytimeDialect2.encode(date25);
        org.junit.Assert.assertNotNull(daytimeDialect2);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str5, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str8, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Fri Nov 29 18:00:00 CST 2002");
        org.junit.Assert.assertNotNull(daytimeDialect13);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str16, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str19, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Mon Nov 20 02:47:20 CST 2023");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Mon Nov 20 02:47:20 CST 2023");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Mon Nov 20 02:47:20 CST 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "JJJJJ 23-11-20 08:47:20 TT L H msADV UTC(NIST) *" + "'", str26, "JJJJJ 23-11-20 08:47:20 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder12 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date13 = dateBuilder12.build();
        java.lang.String str14 = daytimeDialect11.encode(date13);
        org.testinfected.time.lib.DateBuilder dateBuilder15 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date16 = dateBuilder15.build();
        java.lang.String str17 = daytimeDialect11.encode(date16);
        org.testinfected.time.DaytimeClient daytimeClient18 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient18);
        org.testinfected.time.DaytimeDialect daytimeDialect21 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder22 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date23 = dateBuilder22.build();
        java.lang.String str24 = daytimeDialect21.encode(date23);
        org.testinfected.time.lib.DateBuilder dateBuilder25 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date26 = dateBuilder25.build();
        java.lang.String str27 = daytimeDialect21.encode(date26);
        org.testinfected.time.DaytimeServer daytimeServer28 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect21);
        org.testinfected.time.DaytimeDialect daytimeDialect31 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder32 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date33 = dateBuilder32.build();
        java.lang.String str34 = daytimeDialect31.encode(date33);
        org.testinfected.time.lib.DateBuilder dateBuilder35 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date36 = dateBuilder35.build();
        java.lang.String str37 = daytimeDialect31.encode(date36);
        org.testinfected.time.DaytimeClient daytimeClient38 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect31);
        daytimeServer28.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        org.testinfected.time.DaytimeDialect daytimeDialect42 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder43 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date44 = dateBuilder43.build();
        java.lang.String str45 = daytimeDialect42.encode(date44);
        org.testinfected.time.lib.DateBuilder dateBuilder46 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date47 = dateBuilder46.build();
        java.lang.String str48 = daytimeDialect42.encode(date47);
        org.testinfected.time.DaytimeServer daytimeServer49 = new org.testinfected.time.DaytimeServer(0, daytimeDialect42);
        org.testinfected.time.lib.SystemClock systemClock50 = new org.testinfected.time.lib.SystemClock();
        daytimeServer49.setInternalClock((org.testinfected.time.Clock) systemClock50);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) systemClock50);
        org.testinfected.time.ServerMonitor serverMonitor53 = null;
        daytimeServer8.removeMonitor(serverMonitor53);
        org.testinfected.time.DaytimeDialect daytimeDialect62 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder63 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date64 = dateBuilder63.build();
        java.lang.String str65 = daytimeDialect62.encode(date64);
        org.testinfected.time.lib.DateBuilder dateBuilder66 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date67 = dateBuilder66.build();
        java.lang.String str68 = daytimeDialect62.encode(date67);
        org.testinfected.time.DaytimeClient daytimeClient69 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect62);
        org.testinfected.time.DaytimeServer daytimeServer70 = new org.testinfected.time.DaytimeServer(100, daytimeDialect62);
        org.testinfected.time.DaytimeClient daytimeClient71 = new org.testinfected.time.DaytimeClient("JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *", (int) (byte) 10, daytimeDialect62);
        org.testinfected.time.DaytimeClient daytimeClient72 = new org.testinfected.time.DaytimeClient("JJJJJ 23-11-20 08:46:43 TT L H msADV UTC(NIST) *", (int) (short) 0, daytimeDialect62);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient72);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date74 = daytimeClient72.now();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.net.NoRouteToHostException: Can't assign requested address (Address not available)");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect11);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str14, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str17, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect21);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str24, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str27, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect31);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str34, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str37, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect42);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str45, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str48, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect62);
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str65, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str68, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (byte) 100, (int) (short) -1, 0);
        org.junit.Assert.assertNotNull(dateBuilder3);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        org.testinfected.time.DaytimeServer daytimeServer1 = new org.testinfected.time.DaytimeServer((int) (byte) 1);
        org.testinfected.time.ServerMonitor serverMonitor2 = null;
        daytimeServer1.removeMonitor(serverMonitor2);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = org.testinfected.time.lib.DateBuilder.aDate();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder2 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder6 = dateBuilder0.atTime((int) 'a', 0, (int) 'a');
        java.util.TimeZone timeZone7 = null;
        org.testinfected.time.lib.DateBuilder dateBuilder8 = dateBuilder6.in(timeZone7);
        org.junit.Assert.assertNotNull(dateBuilder0);
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Nov 20 02:47:20 CST 2023");
        org.junit.Assert.assertNotNull(dateBuilder2);
        org.junit.Assert.assertNotNull(dateBuilder6);
        org.junit.Assert.assertNotNull(dateBuilder8);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.inZone("");
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.atTime((int) (byte) 100, (int) (short) -1, (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder11 = dateBuilder7.onCalendar((-1), (int) ' ', (int) (byte) -1);
        org.testinfected.time.lib.DateBuilder dateBuilder15 = dateBuilder11.atTime(100, (int) (byte) 0, 10);
        org.testinfected.time.lib.DateBuilder dateBuilder17 = dateBuilder15.fromMillis((-1L));
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder11);
        org.junit.Assert.assertNotNull(dateBuilder15);
        org.junit.Assert.assertNotNull(dateBuilder17);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder5 = dateBuilder0.atTime((int) (byte) 100, (int) '#', 100);
        org.testinfected.time.lib.DateBuilder dateBuilder10 = dateBuilder5.atTime((int) (byte) 10, (-1), 1, (int) '4');
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder5);
        org.junit.Assert.assertNotNull(dateBuilder10);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (short) 0, (int) '4', (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder3.onCalendar((int) (short) 10, 0, (int) (byte) 100);
        org.testinfected.time.lib.DateBuilder dateBuilder12 = dateBuilder3.atTime((int) 'a', (int) (byte) -1, (int) 'a', (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder14 = dateBuilder3.inZone("JJJJJ 23-11-20 08:46:42 TT L H msADV UTC(NIST) *");
        org.testinfected.time.lib.DateBuilder dateBuilder18 = dateBuilder14.onCalendar((int) (short) 1, (-1), (-1));
        org.testinfected.time.lib.DateBuilder dateBuilder20 = dateBuilder18.fromMillis(0L);
        org.testinfected.time.lib.DateBuilder dateBuilder24 = dateBuilder18.atTime((int) (short) 10, 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder12);
        org.junit.Assert.assertNotNull(dateBuilder14);
        org.junit.Assert.assertNotNull(dateBuilder18);
        org.junit.Assert.assertNotNull(dateBuilder20);
        org.junit.Assert.assertNotNull(dateBuilder24);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.Clock clock2 = org.testinfected.time.lib.BrokenClock.stoppedAt(date1);
        org.testinfected.time.Clock clock3 = org.testinfected.time.lib.BrokenClock.stoppedAt(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(clock2);
        org.junit.Assert.assertNotNull(clock3);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        org.testinfected.time.DaytimeDialect daytimeDialect3 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder4 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date5 = dateBuilder4.build();
        java.lang.String str6 = daytimeDialect3.encode(date5);
        org.testinfected.time.lib.DateBuilder dateBuilder7 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date8 = dateBuilder7.build();
        java.lang.String str9 = daytimeDialect3.encode(date8);
        org.testinfected.time.DaytimeClient daytimeClient10 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect3);
        org.testinfected.time.DaytimeServer daytimeServer11 = new org.testinfected.time.DaytimeServer(100, daytimeDialect3);
        org.testinfected.time.ServerMonitor serverMonitor12 = null;
        daytimeServer11.removeMonitor(serverMonitor12);
        org.testinfected.time.ServerMonitor serverMonitor14 = null;
        daytimeServer11.addMonitor(serverMonitor14);
        // The following exception was thrown during execution in test generation
        try {
            daytimeServer11.start();
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect3);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str6, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str9, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        org.testinfected.time.DaytimeDialect daytimeDialect0 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder1 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date2 = dateBuilder1.build();
        java.lang.String str3 = daytimeDialect0.encode(date2);
        java.util.Date date5 = daytimeDialect0.decode("JJJJJ 23-11-20 00:40:10 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect0);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str3, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sun Nov 19 18:40:10 CST 2023");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        org.testinfected.time.DaytimeServer daytimeServer1 = new org.testinfected.time.DaytimeServer((int) (byte) 0);
        org.testinfected.time.DaytimeDialect daytimeDialect3 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder4 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date5 = dateBuilder4.build();
        java.lang.String str6 = daytimeDialect3.encode(date5);
        org.testinfected.time.lib.DateBuilder dateBuilder7 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date8 = dateBuilder7.build();
        java.lang.String str9 = daytimeDialect3.encode(date8);
        org.testinfected.time.DaytimeServer daytimeServer10 = new org.testinfected.time.DaytimeServer(0, daytimeDialect3);
        org.testinfected.time.lib.SystemClock systemClock11 = new org.testinfected.time.lib.SystemClock();
        daytimeServer10.setInternalClock((org.testinfected.time.Clock) systemClock11);
        java.util.Date date13 = systemClock11.now();
        daytimeServer1.setInternalClock((org.testinfected.time.Clock) systemClock11);
        org.testinfected.time.ServerMonitor serverMonitor15 = null;
        daytimeServer1.addMonitor(serverMonitor15);
        org.testinfected.time.ServerMonitor serverMonitor17 = null;
        daytimeServer1.addMonitor(serverMonitor17);
        org.junit.Assert.assertNotNull(daytimeDialect3);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str6, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str9, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Mon Nov 20 02:47:20 CST 2023");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (short) 1, 1, (int) (byte) 1);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = dateBuilder3.fromMillis((long) (short) 1);
        java.lang.Class<?> wildcardClass6 = dateBuilder5.getClass();
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder3 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date4 = dateBuilder3.build();
        java.lang.String str5 = daytimeDialect2.encode(date4);
        org.testinfected.time.lib.DateBuilder dateBuilder6 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date7 = dateBuilder6.build();
        java.lang.String str8 = daytimeDialect2.encode(date7);
        org.testinfected.time.DaytimeServer daytimeServer9 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect2);
        java.util.Date date11 = daytimeDialect2.decode("JJJJJ 23-11-20 08:46:44 TT L H msADV UTC(NIST) *");
        org.testinfected.time.DaytimeServer daytimeServer12 = new org.testinfected.time.DaytimeServer((int) ' ', daytimeDialect2);
        java.lang.Class<?> wildcardClass13 = daytimeDialect2.getClass();
        org.junit.Assert.assertNotNull(daytimeDialect2);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str5, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str8, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Mon Nov 20 02:46:44 CST 2023");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        org.testinfected.time.DaytimeDialect daytimeDialect5 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder6 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date7 = dateBuilder6.build();
        java.lang.String str8 = daytimeDialect5.encode(date7);
        org.testinfected.time.lib.DateBuilder dateBuilder9 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date10 = dateBuilder9.build();
        java.lang.String str11 = daytimeDialect5.encode(date10);
        org.testinfected.time.DaytimeClient daytimeClient12 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect5);
        org.testinfected.time.DaytimeServer daytimeServer13 = new org.testinfected.time.DaytimeServer(100, daytimeDialect5);
        org.testinfected.time.DaytimeClient daytimeClient14 = new org.testinfected.time.DaytimeClient("JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *", (int) (byte) 10, daytimeDialect5);
        java.util.Date date16 = daytimeDialect5.decode("JJJJJ 23-11-20 08:46:42 TT L H msADV UTC(NIST) *");
        org.testinfected.time.lib.DateBuilder dateBuilder17 = org.testinfected.time.lib.DateBuilder.aDate();
        org.testinfected.time.lib.DateBuilder dateBuilder24 = dateBuilder17.at(100, 1, 1, (int) (short) -1, (int) (byte) -1, (int) 'a');
        org.testinfected.time.lib.DateBuilder dateBuilder28 = dateBuilder24.atTime((int) (short) 10, (int) '#', (int) (byte) 0);
        org.testinfected.time.lib.DateBuilder dateBuilder30 = dateBuilder24.fromMillis((long) (-1));
        java.util.Date date31 = dateBuilder24.build();
        org.testinfected.time.lib.DateBuilder dateBuilder36 = dateBuilder24.atTime((int) (byte) 10, (int) ' ', (int) (byte) 1, (int) (short) 10);
        java.util.Date date37 = dateBuilder24.build();
        java.lang.String str38 = daytimeDialect5.encode(date37);
        org.junit.Assert.assertNotNull(daytimeDialect5);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str8, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str11, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Mon Nov 20 02:46:42 CST 2023");
        org.junit.Assert.assertNotNull(dateBuilder17);
        org.junit.Assert.assertNotNull(dateBuilder24);
        org.junit.Assert.assertNotNull(dateBuilder28);
        org.junit.Assert.assertNotNull(dateBuilder30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Dec 31 17:59:59 CST 1969");
        org.junit.Assert.assertNotNull(dateBuilder36);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Wed Dec 31 04:32:01 CST 1969");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "JJJJJ 69-12-31 10:32:01 TT L H msADV UTC(NIST) *" + "'", str38, "JJJJJ 69-12-31 10:32:01 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        org.testinfected.time.DaytimeDialect daytimeDialect5 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder6 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date7 = dateBuilder6.build();
        java.lang.String str8 = daytimeDialect5.encode(date7);
        org.testinfected.time.lib.DateBuilder dateBuilder9 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date10 = dateBuilder9.build();
        java.lang.String str11 = daytimeDialect5.encode(date10);
        org.testinfected.time.DaytimeServer daytimeServer12 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect5);
        java.util.Date date14 = daytimeDialect5.decode("JJJJJ 23-11-20 08:46:44 TT L H msADV UTC(NIST) *");
        org.testinfected.time.DaytimeClient daytimeClient15 = new org.testinfected.time.DaytimeClient("JJJJJ 23-11-20 08:46:47 TT L H msADV UTC(NIST) *", (int) '#', daytimeDialect5);
        org.testinfected.time.DaytimeClient daytimeClient16 = new org.testinfected.time.DaytimeClient("JJJJJ 23-11-20 08:46:43 TT L H msADV UTC(NIST) *", (int) (byte) -1, daytimeDialect5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = daytimeClient16.now();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.IllegalArgumentException: port out of range:-1");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect5);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str8, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str11, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Nov 20 02:46:44 CST 2023");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.inZone("");
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.atTime((int) (byte) 100, (int) (short) -1, (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder9 = dateBuilder0.inZone("JJJJJ 23-11-20 08:46:42 TT L H msADV UTC(NIST) *");
        java.util.Date date10 = dateBuilder9.build();
        java.util.TimeZone timeZone11 = null;
        org.testinfected.time.lib.DateBuilder dateBuilder12 = dateBuilder9.in(timeZone11);
        org.testinfected.time.lib.DateBuilder dateBuilder16 = dateBuilder9.atTime((int) (byte) -1, (int) (byte) 0, (int) '#');
        org.testinfected.time.lib.DateBuilder dateBuilder23 = dateBuilder16.at((int) (byte) 0, (int) (byte) 0, (int) '#', 10, (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Wed Dec 03 21:59:52 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder12);
        org.junit.Assert.assertNotNull(dateBuilder16);
        org.junit.Assert.assertNotNull(dateBuilder23);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer(0, daytimeDialect1);
        org.testinfected.time.lib.SystemClock systemClock9 = new org.testinfected.time.lib.SystemClock();
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) systemClock9);
        org.testinfected.time.DaytimeDialect daytimeDialect12 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.DaytimeServer daytimeServer13 = new org.testinfected.time.DaytimeServer((int) (short) 0, daytimeDialect12);
        java.util.Date date15 = daytimeDialect12.decode("JJJJJ 23-11-20 08:46:43 TT L H msADV UTC(NIST) *");
        org.testinfected.time.Clock clock16 = org.testinfected.time.lib.BrokenClock.stoppedAt(date15);
        daytimeServer8.setInternalClock(clock16);
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect12);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Mon Nov 20 02:46:43 CST 2023");
        org.junit.Assert.assertNotNull(clock16);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = org.testinfected.time.lib.DateBuilder.aDate();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder2 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder6 = dateBuilder2.onCalendar((int) (short) 1, (int) (byte) 10, 0);
        org.testinfected.time.lib.DateBuilder dateBuilder8 = dateBuilder6.inZone("JJJJJ 23-11-20 08:46:46 TT L H msADV UTC(NIST) *");
        java.util.Date date9 = dateBuilder6.build();
        org.junit.Assert.assertNotNull(dateBuilder0);
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Nov 20 02:47:21 CST 2023");
        org.junit.Assert.assertNotNull(dateBuilder2);
        org.junit.Assert.assertNotNull(dateBuilder6);
        org.junit.Assert.assertNotNull(dateBuilder8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Sep 29 18:00:00 CST 1");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        org.testinfected.time.DaytimeDialect daytimeDialect7 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder8 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date9 = dateBuilder8.build();
        java.lang.String str10 = daytimeDialect7.encode(date9);
        org.testinfected.time.lib.DateBuilder dateBuilder11 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date12 = dateBuilder11.build();
        java.lang.String str13 = daytimeDialect7.encode(date12);
        org.testinfected.time.DaytimeClient daytimeClient14 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect7);
        org.testinfected.time.DaytimeServer daytimeServer15 = new org.testinfected.time.DaytimeServer(100, daytimeDialect7);
        java.util.Date date17 = daytimeDialect7.decode("JJJJJ 23-11-20 08:46:44 TT L H msADV UTC(NIST) *");
        org.testinfected.time.DaytimeClient daytimeClient18 = new org.testinfected.time.DaytimeClient("JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *", (int) (byte) 10, daytimeDialect7);
        org.testinfected.time.DaytimeClient daytimeClient19 = new org.testinfected.time.DaytimeClient("", (int) (byte) 100, daytimeDialect7);
        org.junit.Assert.assertNotNull(daytimeDialect7);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str10, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str13, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Nov 20 02:46:44 CST 2023");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder3 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date4 = dateBuilder3.build();
        java.lang.String str5 = daytimeDialect2.encode(date4);
        org.testinfected.time.lib.DateBuilder dateBuilder6 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date7 = dateBuilder6.build();
        java.lang.String str8 = daytimeDialect2.encode(date7);
        org.testinfected.time.DaytimeServer daytimeServer9 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect2);
        java.util.Date date11 = daytimeDialect2.decode("JJJJJ 23-11-20 08:46:44 TT L H msADV UTC(NIST) *");
        org.testinfected.time.DaytimeServer daytimeServer12 = new org.testinfected.time.DaytimeServer((int) ' ', daytimeDialect2);
        java.util.Date date14 = daytimeDialect2.decode("JJJJJ 23-11-20 08:46:45 TT L H msADV UTC(NIST) *");
        org.testinfected.time.DaytimeDialect daytimeDialect16 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder17 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date18 = dateBuilder17.build();
        java.lang.String str19 = daytimeDialect16.encode(date18);
        org.testinfected.time.lib.DateBuilder dateBuilder20 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date21 = dateBuilder20.build();
        java.lang.String str22 = daytimeDialect16.encode(date21);
        org.testinfected.time.DaytimeServer daytimeServer23 = new org.testinfected.time.DaytimeServer(0, daytimeDialect16);
        org.testinfected.time.lib.SystemClock systemClock24 = new org.testinfected.time.lib.SystemClock();
        daytimeServer23.setInternalClock((org.testinfected.time.Clock) systemClock24);
        java.util.Date date26 = systemClock24.now();
        java.util.Date date27 = systemClock24.now();
        java.util.Date date28 = systemClock24.now();
        java.util.Date date29 = systemClock24.now();
        java.util.Date date30 = systemClock24.now();
        java.lang.String str31 = daytimeDialect2.encode(date30);
        org.junit.Assert.assertNotNull(daytimeDialect2);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str5, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str8, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Mon Nov 20 02:46:44 CST 2023");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Nov 20 02:46:45 CST 2023");
        org.junit.Assert.assertNotNull(daytimeDialect16);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str19, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str22, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Mon Nov 20 02:47:21 CST 2023");
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Mon Nov 20 02:47:21 CST 2023");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Mon Nov 20 02:47:21 CST 2023");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Mon Nov 20 02:47:21 CST 2023");
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Mon Nov 20 02:47:21 CST 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "JJJJJ 23-11-20 08:47:21 TT L H msADV UTC(NIST) *" + "'", str31, "JJJJJ 23-11-20 08:47:21 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        org.testinfected.time.DaytimeDialect daytimeDialect4 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect4.encode(date6);
        org.testinfected.time.lib.DateBuilder dateBuilder8 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date9 = dateBuilder8.build();
        java.lang.String str10 = daytimeDialect4.encode(date9);
        org.testinfected.time.DaytimeClient daytimeClient11 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect4);
        org.testinfected.time.DaytimeServer daytimeServer12 = new org.testinfected.time.DaytimeServer((int) '4', daytimeDialect4);
        org.testinfected.time.DaytimeServer daytimeServer13 = new org.testinfected.time.DaytimeServer((int) (byte) 1, daytimeDialect4);
        org.testinfected.time.lib.DateBuilder dateBuilder14 = org.testinfected.time.lib.DateBuilder.aDate();
        org.testinfected.time.lib.DateBuilder dateBuilder15 = dateBuilder14.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder20 = dateBuilder14.atTime((int) (short) -1, (int) (byte) 100, 10, 0);
        java.util.Date date21 = dateBuilder20.build();
        java.lang.String str22 = daytimeDialect4.encode(date21);
        org.junit.Assert.assertNotNull(daytimeDialect4);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str10, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(dateBuilder14);
        org.junit.Assert.assertNotNull(dateBuilder15);
        org.junit.Assert.assertNotNull(dateBuilder20);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sun Nov 19 18:40:10 CST 2023");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "JJJJJ 23-11-20 00:40:10 TT L H msADV UTC(NIST) *" + "'", str22, "JJJJJ 23-11-20 00:40:10 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.inZone("");
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.atTime((int) (byte) 100, (int) (short) -1, (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder14 = dateBuilder7.at((int) 'a', 1, 0, (int) (byte) -1, 10, (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder16 = dateBuilder14.fromMillis((long) (-1));
        org.testinfected.time.lib.DateBuilder dateBuilder17 = dateBuilder14.atMidnight();
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder14);
        org.junit.Assert.assertNotNull(dateBuilder16);
        org.junit.Assert.assertNotNull(dateBuilder17);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.TimeZone timeZone1 = null;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = dateBuilder0.in(timeZone1);
        org.junit.Assert.assertNotNull(dateBuilder2);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        org.testinfected.time.DaytimeServer daytimeServer1 = new org.testinfected.time.DaytimeServer(1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer(0, daytimeDialect1);
        org.testinfected.time.lib.SystemClock systemClock9 = new org.testinfected.time.lib.SystemClock();
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) systemClock9);
        java.util.Date date11 = systemClock9.now();
        java.util.Date date12 = systemClock9.now();
        java.util.Date date13 = systemClock9.now();
        org.testinfected.time.Clock clock14 = org.testinfected.time.lib.BrokenClock.stoppedAt(date13);
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Nov 20 02:47:21 CST 2023");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Nov 20 02:47:21 CST 2023");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Mon Nov 20 02:47:21 CST 2023");
        org.junit.Assert.assertNotNull(clock14);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = org.testinfected.time.lib.DateBuilder.aDate();
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.at(100, 1, 1, (int) (short) -1, (int) (byte) -1, (int) 'a');
        org.testinfected.time.lib.DateBuilder dateBuilder11 = dateBuilder7.atTime((int) (short) 10, (int) '#', (int) (byte) 0);
        org.testinfected.time.lib.DateBuilder dateBuilder13 = dateBuilder7.fromMillis((long) (-1));
        org.testinfected.time.lib.DateBuilder dateBuilder15 = dateBuilder13.inZone("JJJJJ 23-11-20 08:46:45 TT L H msADV UTC(NIST) *");
        org.testinfected.time.lib.DateBuilder dateBuilder17 = dateBuilder15.inZone("JJJJJ 23-11-20 08:46:47 TT L H msADV UTC(NIST) *");
        org.testinfected.time.lib.DateBuilder dateBuilder22 = dateBuilder17.atTime((int) (byte) 1, 0, (int) (short) 0, 10);
        org.junit.Assert.assertNotNull(dateBuilder0);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder11);
        org.junit.Assert.assertNotNull(dateBuilder13);
        org.junit.Assert.assertNotNull(dateBuilder15);
        org.junit.Assert.assertNotNull(dateBuilder17);
        org.junit.Assert.assertNotNull(dateBuilder22);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.ServerMonitor serverMonitor9 = null;
        daytimeServer8.removeMonitor(serverMonitor9);
        org.testinfected.time.lib.DateBuilder dateBuilder11 = org.testinfected.time.lib.DateBuilder.aDate();
        org.testinfected.time.lib.DateBuilder dateBuilder18 = dateBuilder11.at(100, 1, 1, (int) (short) -1, (int) (byte) -1, (int) 'a');
        org.testinfected.time.lib.DateBuilder dateBuilder20 = dateBuilder11.inZone("");
        java.util.Date date21 = dateBuilder20.build();
        org.testinfected.time.Clock clock22 = org.testinfected.time.lib.BrokenClock.stoppedAt(date21);
        daytimeServer8.setInternalClock(clock22);
        org.testinfected.time.ServerMonitor serverMonitor24 = null;
        daytimeServer8.removeMonitor(serverMonitor24);
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(dateBuilder11);
        org.junit.Assert.assertNotNull(dateBuilder18);
        org.junit.Assert.assertNotNull(dateBuilder20);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Dec 31 17:00:37 CST 99");
        org.junit.Assert.assertNotNull(clock22);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = null;
        org.testinfected.time.DaytimeClient daytimeClient12 = new org.testinfected.time.DaytimeClient("hi!", (int) (short) -1, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient12);
        org.testinfected.time.ServerMonitor serverMonitor14 = null;
        daytimeServer8.addMonitor(serverMonitor14);
        org.testinfected.time.lib.DateBuilder dateBuilder16 = new org.testinfected.time.lib.DateBuilder();
        org.testinfected.time.lib.DateBuilder dateBuilder17 = dateBuilder16.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder18 = dateBuilder16.atMidnight();
        java.util.Date date19 = dateBuilder18.build();
        org.testinfected.time.Clock clock20 = org.testinfected.time.lib.BrokenClock.stoppedAt(date19);
        daytimeServer8.setInternalClock(clock20);
        // The following exception was thrown during execution in test generation
        try {
            daytimeServer8.start();
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(dateBuilder17);
        org.junit.Assert.assertNotNull(dateBuilder18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(clock20);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        org.testinfected.time.lib.DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder2 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.atTime((int) (byte) 100, 100, 10, (int) (short) 10);
        java.util.TimeZone timeZone8 = null;
        org.testinfected.time.lib.DateBuilder dateBuilder9 = dateBuilder7.in(timeZone8);
        org.junit.Assert.assertNotNull(dateBuilder1);
        org.junit.Assert.assertNotNull(dateBuilder2);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder9);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.inZone("");
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.atTime((int) (byte) 100, (int) (short) -1, (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder11 = dateBuilder7.onCalendar((-1), (int) ' ', (int) (byte) -1);
        org.testinfected.time.lib.DateBuilder dateBuilder16 = dateBuilder11.atTime((int) (short) 10, (int) (byte) 1, (-1), 10);
        org.testinfected.time.lib.DateBuilder dateBuilder20 = dateBuilder16.onCalendar((int) (short) 0, (int) (byte) -1, (int) (byte) 1);
        org.testinfected.time.lib.DateBuilder dateBuilder25 = dateBuilder16.atTime((int) '4', (int) (byte) 10, (int) (byte) 10, 100);
        java.util.Date date26 = dateBuilder16.build();
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder11);
        org.junit.Assert.assertNotNull(dateBuilder16);
        org.junit.Assert.assertNotNull(dateBuilder20);
        org.junit.Assert.assertNotNull(dateBuilder25);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sun Nov 02 22:10:10 CST 2");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = null;
        org.testinfected.time.DaytimeClient daytimeClient12 = new org.testinfected.time.DaytimeClient("hi!", (int) (short) -1, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient12);
        org.testinfected.time.ServerMonitor serverMonitor14 = null;
        daytimeServer8.addMonitor(serverMonitor14);
        org.testinfected.time.ServerMonitor serverMonitor16 = null;
        daytimeServer8.removeMonitor(serverMonitor16);
        org.testinfected.time.DaytimeDialect daytimeDialect20 = null;
        org.testinfected.time.DaytimeClient daytimeClient21 = new org.testinfected.time.DaytimeClient("JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *", 0, daytimeDialect20);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient21);
        org.testinfected.time.ServerMonitor serverMonitor23 = null;
        daytimeServer8.addMonitor(serverMonitor23);
        // The following exception was thrown during execution in test generation
        try {
            daytimeServer8.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (byte) -1, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(dateBuilder3);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        org.testinfected.time.DaytimeDialect daytimeDialect3 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder4 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date5 = dateBuilder4.build();
        java.lang.String str6 = daytimeDialect3.encode(date5);
        org.testinfected.time.DaytimeClient daytimeClient7 = new org.testinfected.time.DaytimeClient("hi!", (int) (short) 10, daytimeDialect3);
        java.util.Date date9 = daytimeDialect3.decode("JJJJJ 23-11-20 08:46:44 TT L H msADV UTC(NIST) *");
        org.testinfected.time.DaytimeServer daytimeServer10 = new org.testinfected.time.DaytimeServer(1, daytimeDialect3);
        org.testinfected.time.lib.DateBuilder dateBuilder11 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date12 = dateBuilder11.build();
        org.testinfected.time.lib.DateBuilder dateBuilder16 = dateBuilder11.atTime((int) 'a', (int) (byte) 10, (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder23 = dateBuilder16.at(0, (int) (byte) 10, (int) ' ', 0, 0, (int) (short) 1);
        java.util.Date date24 = dateBuilder16.build();
        java.lang.String str25 = daytimeDialect3.encode(date24);
        org.junit.Assert.assertNotNull(daytimeDialect3);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str6, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Mon Nov 20 02:46:44 CST 2023");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder16);
        org.junit.Assert.assertNotNull(dateBuilder23);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Oct 31 18:00:01 CST 1");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "JJJJJ 01-11-01 00:00:01 TT L H msADV UTC(NIST) *" + "'", str25, "JJJJJ 01-11-01 00:00:01 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        org.testinfected.time.DaytimeDialect daytimeDialect3 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.DaytimeServer daytimeServer4 = new org.testinfected.time.DaytimeServer((int) (short) 0, daytimeDialect3);
        org.testinfected.time.DaytimeDialect daytimeDialect5 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder6 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date7 = dateBuilder6.build();
        java.lang.String str8 = daytimeDialect5.encode(date7);
        org.testinfected.time.lib.DateBuilder dateBuilder9 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date10 = dateBuilder9.build();
        java.lang.String str11 = daytimeDialect5.encode(date10);
        org.testinfected.time.lib.SystemClock systemClock12 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date13 = systemClock12.now();
        java.util.Date date14 = systemClock12.now();
        java.util.Date date15 = systemClock12.now();
        java.lang.String str16 = daytimeDialect5.encode(date15);
        java.lang.String str17 = daytimeDialect3.encode(date15);
        org.testinfected.time.DaytimeClient daytimeClient18 = new org.testinfected.time.DaytimeClient("JJJJJ 23-11-20 08:46:42 TT L H msADV UTC(NIST) *", 0, daytimeDialect3);
        org.testinfected.time.DaytimeDialect daytimeDialect20 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder21 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date22 = dateBuilder21.build();
        java.lang.String str23 = daytimeDialect20.encode(date22);
        org.testinfected.time.lib.DateBuilder dateBuilder24 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date25 = dateBuilder24.build();
        java.lang.String str26 = daytimeDialect20.encode(date25);
        org.testinfected.time.DaytimeServer daytimeServer27 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect20);
        org.testinfected.time.DaytimeDialect daytimeDialect30 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder31 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date32 = dateBuilder31.build();
        java.lang.String str33 = daytimeDialect30.encode(date32);
        org.testinfected.time.lib.DateBuilder dateBuilder34 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date35 = dateBuilder34.build();
        java.lang.String str36 = daytimeDialect30.encode(date35);
        org.testinfected.time.DaytimeClient daytimeClient37 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect30);
        daytimeServer27.setInternalClock((org.testinfected.time.Clock) daytimeClient37);
        org.testinfected.time.DaytimeDialect daytimeDialect40 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder41 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date42 = dateBuilder41.build();
        java.lang.String str43 = daytimeDialect40.encode(date42);
        org.testinfected.time.lib.DateBuilder dateBuilder44 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date45 = dateBuilder44.build();
        java.lang.String str46 = daytimeDialect40.encode(date45);
        org.testinfected.time.DaytimeServer daytimeServer47 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect40);
        org.testinfected.time.DaytimeDialect daytimeDialect50 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder51 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date52 = dateBuilder51.build();
        java.lang.String str53 = daytimeDialect50.encode(date52);
        org.testinfected.time.lib.DateBuilder dateBuilder54 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date55 = dateBuilder54.build();
        java.lang.String str56 = daytimeDialect50.encode(date55);
        org.testinfected.time.DaytimeClient daytimeClient57 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect50);
        daytimeServer47.setInternalClock((org.testinfected.time.Clock) daytimeClient57);
        daytimeServer27.setInternalClock((org.testinfected.time.Clock) daytimeClient57);
        org.testinfected.time.lib.SystemClock systemClock60 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date61 = systemClock60.now();
        daytimeServer27.setInternalClock((org.testinfected.time.Clock) systemClock60);
        java.util.Date date63 = systemClock60.now();
        org.testinfected.time.Clock clock64 = org.testinfected.time.lib.BrokenClock.stoppedAt(date63);
        org.testinfected.time.Clock clock65 = org.testinfected.time.lib.BrokenClock.stoppedAt(date63);
        java.lang.String str66 = daytimeDialect3.encode(date63);
        org.junit.Assert.assertNotNull(daytimeDialect3);
        org.junit.Assert.assertNotNull(daytimeDialect5);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str8, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str11, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Mon Nov 20 02:47:21 CST 2023");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Mon Nov 20 02:47:21 CST 2023");
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Mon Nov 20 02:47:21 CST 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JJJJJ 23-11-20 08:47:21 TT L H msADV UTC(NIST) *" + "'", str16, "JJJJJ 23-11-20 08:47:21 TT L H msADV UTC(NIST) *");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JJJJJ 23-11-20 08:47:21 TT L H msADV UTC(NIST) *" + "'", str17, "JJJJJ 23-11-20 08:47:21 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect20);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str23, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str26, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect30);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str33, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str36, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect40);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str43, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str46, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect50);
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str53, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str56, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date61);
// flaky:         org.junit.Assert.assertEquals(date61.toString(), "Mon Nov 20 02:47:21 CST 2023");
        org.junit.Assert.assertNotNull(date63);
// flaky:         org.junit.Assert.assertEquals(date63.toString(), "Mon Nov 20 02:47:21 CST 2023");
        org.junit.Assert.assertNotNull(clock64);
        org.junit.Assert.assertNotNull(clock65);
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "JJJJJ 23-11-20 08:47:21 TT L H msADV UTC(NIST) *" + "'", str66, "JJJJJ 23-11-20 08:47:21 TT L H msADV UTC(NIST) *");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        org.testinfected.time.lib.DateBuilder dateBuilder1 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder2 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder6 = dateBuilder2.atTime((int) (short) -1, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass7 = dateBuilder2.getClass();
        org.junit.Assert.assertNotNull(dateBuilder1);
        org.junit.Assert.assertNotNull(dateBuilder2);
        org.junit.Assert.assertNotNull(dateBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        org.testinfected.time.DaytimeDialect daytimeDialect0 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder1 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date2 = dateBuilder1.build();
        java.lang.String str3 = daytimeDialect0.encode(date2);
        java.util.Date date5 = daytimeDialect0.decode("JJJJJ 23-11-20 08:46:47 TT L H msADV UTC(NIST) *");
        java.util.Date date7 = daytimeDialect0.decode("JJJJJ 23-11-20 08:46:46 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect0);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str3, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Mon Nov 20 02:46:47 CST 2023");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Mon Nov 20 02:46:46 CST 2023");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = org.testinfected.time.lib.DateBuilder.aDate();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder2 = dateBuilder0.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder6 = dateBuilder0.onCalendar((int) (short) 0, 100, (int) (byte) -1);
        org.testinfected.time.lib.DateBuilder dateBuilder10 = dateBuilder0.onCalendar((int) (short) 10, (int) (byte) 1, (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder12 = dateBuilder10.fromMillis((long) (byte) 0);
        org.junit.Assert.assertNotNull(dateBuilder0);
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Nov 20 02:47:22 CST 2023");
        org.junit.Assert.assertNotNull(dateBuilder2);
        org.junit.Assert.assertNotNull(dateBuilder6);
        org.junit.Assert.assertNotNull(dateBuilder10);
        org.junit.Assert.assertNotNull(dateBuilder12);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) 'a', (int) '#', (int) (short) 1);
        org.testinfected.time.lib.DateBuilder dateBuilder10 = dateBuilder3.at((int) (byte) -1, (int) (short) 1, (int) '4', 0, (int) (short) -1, 100);
        org.testinfected.time.lib.DateBuilder dateBuilder12 = dateBuilder10.fromMillis((long) (short) 100);
        java.util.TimeZone timeZone13 = null;
        org.testinfected.time.lib.DateBuilder dateBuilder14 = dateBuilder12.in(timeZone13);
        org.testinfected.time.lib.DateBuilder dateBuilder16 = dateBuilder12.inZone("JJJJJ 23-11-20 08:46:53 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder10);
        org.junit.Assert.assertNotNull(dateBuilder12);
        org.junit.Assert.assertNotNull(dateBuilder14);
        org.junit.Assert.assertNotNull(dateBuilder16);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (short) -1, 10, (int) (short) 1);
        org.testinfected.time.lib.DateBuilder dateBuilder8 = dateBuilder3.atTime((int) (short) 1, (int) (byte) 10, (-1), (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder9 = dateBuilder3.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder11 = dateBuilder9.inZone("JJJJJ 23-11-20 08:46:53 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder8);
        org.junit.Assert.assertNotNull(dateBuilder9);
        org.junit.Assert.assertNotNull(dateBuilder11);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder12 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date13 = dateBuilder12.build();
        java.lang.String str14 = daytimeDialect11.encode(date13);
        org.testinfected.time.lib.DateBuilder dateBuilder15 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date16 = dateBuilder15.build();
        java.lang.String str17 = daytimeDialect11.encode(date16);
        org.testinfected.time.DaytimeClient daytimeClient18 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect11);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient18);
        org.testinfected.time.DaytimeDialect daytimeDialect21 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder22 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date23 = dateBuilder22.build();
        java.lang.String str24 = daytimeDialect21.encode(date23);
        org.testinfected.time.lib.DateBuilder dateBuilder25 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date26 = dateBuilder25.build();
        java.lang.String str27 = daytimeDialect21.encode(date26);
        org.testinfected.time.DaytimeServer daytimeServer28 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect21);
        org.testinfected.time.DaytimeDialect daytimeDialect31 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder32 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date33 = dateBuilder32.build();
        java.lang.String str34 = daytimeDialect31.encode(date33);
        org.testinfected.time.lib.DateBuilder dateBuilder35 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date36 = dateBuilder35.build();
        java.lang.String str37 = daytimeDialect31.encode(date36);
        org.testinfected.time.DaytimeClient daytimeClient38 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect31);
        daytimeServer28.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) daytimeClient38);
        org.testinfected.time.DaytimeDialect daytimeDialect42 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder43 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date44 = dateBuilder43.build();
        java.lang.String str45 = daytimeDialect42.encode(date44);
        org.testinfected.time.lib.DateBuilder dateBuilder46 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date47 = dateBuilder46.build();
        java.lang.String str48 = daytimeDialect42.encode(date47);
        org.testinfected.time.DaytimeServer daytimeServer49 = new org.testinfected.time.DaytimeServer(0, daytimeDialect42);
        org.testinfected.time.lib.SystemClock systemClock50 = new org.testinfected.time.lib.SystemClock();
        daytimeServer49.setInternalClock((org.testinfected.time.Clock) systemClock50);
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) systemClock50);
        java.util.Date date53 = systemClock50.now();
        org.testinfected.time.Clock clock54 = org.testinfected.time.lib.BrokenClock.stoppedAt(date53);
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect11);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str14, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str17, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect21);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str24, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str27, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect31);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str34, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str37, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect42);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str45, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str48, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date53);
// flaky:         org.junit.Assert.assertEquals(date53.toString(), "Mon Nov 20 02:47:27 CST 2023");
        org.junit.Assert.assertNotNull(clock54);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (short) 1, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(dateBuilder3);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (short) 1, (int) 'a', (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder5 = dateBuilder3.fromMillis((long) 100);
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder5);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.inZone("");
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.atTime((int) (byte) 100, (int) (short) -1, (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder14 = dateBuilder7.at((int) 'a', 1, 0, (int) (byte) -1, 10, (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder18 = dateBuilder7.atTime((int) 'a', (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder14);
        org.junit.Assert.assertNotNull(dateBuilder18);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        org.testinfected.time.DaytimeDialect daytimeDialect2 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.DaytimeServer daytimeServer3 = new org.testinfected.time.DaytimeServer((int) (short) 0, daytimeDialect2);
        org.testinfected.time.DaytimeServer daytimeServer4 = new org.testinfected.time.DaytimeServer((int) '4', daytimeDialect2);
        org.testinfected.time.DaytimeDialect daytimeDialect6 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder7 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date8 = dateBuilder7.build();
        java.lang.String str9 = daytimeDialect6.encode(date8);
        org.testinfected.time.lib.DateBuilder dateBuilder10 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date11 = dateBuilder10.build();
        java.lang.String str12 = daytimeDialect6.encode(date11);
        org.testinfected.time.DaytimeServer daytimeServer13 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect6);
        org.testinfected.time.DaytimeDialect daytimeDialect16 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder17 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date18 = dateBuilder17.build();
        java.lang.String str19 = daytimeDialect16.encode(date18);
        org.testinfected.time.lib.DateBuilder dateBuilder20 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date21 = dateBuilder20.build();
        java.lang.String str22 = daytimeDialect16.encode(date21);
        org.testinfected.time.DaytimeClient daytimeClient23 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect16);
        daytimeServer13.setInternalClock((org.testinfected.time.Clock) daytimeClient23);
        org.testinfected.time.DaytimeDialect daytimeDialect26 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder27 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date28 = dateBuilder27.build();
        java.lang.String str29 = daytimeDialect26.encode(date28);
        org.testinfected.time.lib.DateBuilder dateBuilder30 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date31 = dateBuilder30.build();
        java.lang.String str32 = daytimeDialect26.encode(date31);
        org.testinfected.time.DaytimeServer daytimeServer33 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect26);
        org.testinfected.time.DaytimeDialect daytimeDialect36 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder37 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date38 = dateBuilder37.build();
        java.lang.String str39 = daytimeDialect36.encode(date38);
        org.testinfected.time.lib.DateBuilder dateBuilder40 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date41 = dateBuilder40.build();
        java.lang.String str42 = daytimeDialect36.encode(date41);
        org.testinfected.time.DaytimeClient daytimeClient43 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect36);
        daytimeServer33.setInternalClock((org.testinfected.time.Clock) daytimeClient43);
        daytimeServer13.setInternalClock((org.testinfected.time.Clock) daytimeClient43);
        org.testinfected.time.lib.SystemClock systemClock46 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date47 = systemClock46.now();
        daytimeServer13.setInternalClock((org.testinfected.time.Clock) systemClock46);
        java.util.Date date49 = systemClock46.now();
        daytimeServer4.setInternalClock((org.testinfected.time.Clock) systemClock46);
        // The following exception was thrown during execution in test generation
        try {
            daytimeServer4.start();
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(daytimeDialect2);
        org.junit.Assert.assertNotNull(daytimeDialect6);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str9, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str12, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect16);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str19, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str22, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect26);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str29, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str32, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect36);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str39, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str42, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date47);
// flaky:         org.junit.Assert.assertEquals(date47.toString(), "Mon Nov 20 02:47:32 CST 2023");
        org.junit.Assert.assertNotNull(date49);
// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Mon Nov 20 02:47:32 CST 2023");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.inZone("");
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.atTime((int) (byte) 100, (int) (short) -1, (int) '4');
        java.util.TimeZone timeZone8 = null;
        org.testinfected.time.lib.DateBuilder dateBuilder9 = dateBuilder0.in(timeZone8);
        org.testinfected.time.lib.DateBuilder dateBuilder10 = dateBuilder9.atMidnight();
        org.testinfected.time.lib.DateBuilder dateBuilder12 = dateBuilder10.inZone("JJJJJ 23-11-20 08:46:57 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder9);
        org.junit.Assert.assertNotNull(dateBuilder10);
        org.junit.Assert.assertNotNull(dateBuilder12);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer(0, daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect10 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder11 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date12 = dateBuilder11.build();
        java.lang.String str13 = daytimeDialect10.encode(date12);
        org.testinfected.time.lib.DateBuilder dateBuilder14 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date15 = dateBuilder14.build();
        java.lang.String str16 = daytimeDialect10.encode(date15);
        org.testinfected.time.DaytimeServer daytimeServer17 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect10);
        org.testinfected.time.DaytimeDialect daytimeDialect20 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder21 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date22 = dateBuilder21.build();
        java.lang.String str23 = daytimeDialect20.encode(date22);
        org.testinfected.time.lib.DateBuilder dateBuilder24 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date25 = dateBuilder24.build();
        java.lang.String str26 = daytimeDialect20.encode(date25);
        org.testinfected.time.DaytimeClient daytimeClient27 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect20);
        daytimeServer17.setInternalClock((org.testinfected.time.Clock) daytimeClient27);
        org.testinfected.time.DaytimeDialect daytimeDialect30 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder31 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date32 = dateBuilder31.build();
        java.lang.String str33 = daytimeDialect30.encode(date32);
        org.testinfected.time.lib.DateBuilder dateBuilder34 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date35 = dateBuilder34.build();
        java.lang.String str36 = daytimeDialect30.encode(date35);
        org.testinfected.time.DaytimeServer daytimeServer37 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect30);
        org.testinfected.time.DaytimeDialect daytimeDialect40 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder41 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date42 = dateBuilder41.build();
        java.lang.String str43 = daytimeDialect40.encode(date42);
        org.testinfected.time.lib.DateBuilder dateBuilder44 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date45 = dateBuilder44.build();
        java.lang.String str46 = daytimeDialect40.encode(date45);
        org.testinfected.time.DaytimeClient daytimeClient47 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect40);
        daytimeServer37.setInternalClock((org.testinfected.time.Clock) daytimeClient47);
        daytimeServer17.setInternalClock((org.testinfected.time.Clock) daytimeClient47);
        org.testinfected.time.DaytimeDialect daytimeDialect51 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder52 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date53 = dateBuilder52.build();
        java.lang.String str54 = daytimeDialect51.encode(date53);
        org.testinfected.time.lib.DateBuilder dateBuilder55 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date56 = dateBuilder55.build();
        java.lang.String str57 = daytimeDialect51.encode(date56);
        org.testinfected.time.DaytimeServer daytimeServer58 = new org.testinfected.time.DaytimeServer(0, daytimeDialect51);
        org.testinfected.time.lib.SystemClock systemClock59 = new org.testinfected.time.lib.SystemClock();
        daytimeServer58.setInternalClock((org.testinfected.time.Clock) systemClock59);
        daytimeServer17.setInternalClock((org.testinfected.time.Clock) systemClock59);
        java.util.Date date62 = systemClock59.now();
        daytimeServer8.setInternalClock((org.testinfected.time.Clock) systemClock59);
        org.testinfected.time.ServerMonitor serverMonitor64 = null;
        daytimeServer8.addMonitor(serverMonitor64);
        org.testinfected.time.ServerMonitor serverMonitor66 = null;
        daytimeServer8.addMonitor(serverMonitor66);
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect10);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str13, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str16, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect20);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str23, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str26, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect30);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str33, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str36, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect40);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str43, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str46, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect51);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str54, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str57, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date62);
// flaky:         org.junit.Assert.assertEquals(date62.toString(), "Mon Nov 20 02:47:32 CST 2023");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        org.testinfected.time.lib.DateBuilder dateBuilder0 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date1 = dateBuilder0.build();
        org.testinfected.time.lib.DateBuilder dateBuilder3 = dateBuilder0.inZone("");
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder0.atTime((int) (byte) 100, (int) (short) -1, (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder9 = dateBuilder0.inZone("JJJJJ 23-11-20 08:46:42 TT L H msADV UTC(NIST) *");
        java.util.Date date10 = dateBuilder9.build();
        java.util.TimeZone timeZone11 = null;
        org.testinfected.time.lib.DateBuilder dateBuilder12 = dateBuilder9.in(timeZone11);
        org.testinfected.time.lib.DateBuilder dateBuilder14 = dateBuilder9.inZone("JJJJJ 70-01-01 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Wed Dec 03 21:59:52 CST 2");
        org.junit.Assert.assertNotNull(dateBuilder12);
        org.junit.Assert.assertNotNull(dateBuilder14);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        org.testinfected.time.DaytimeDialect daytimeDialect11 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder12 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date13 = dateBuilder12.build();
        java.lang.String str14 = daytimeDialect11.encode(date13);
        org.testinfected.time.lib.DateBuilder dateBuilder15 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date16 = dateBuilder15.build();
        java.lang.String str17 = daytimeDialect11.encode(date16);
        org.testinfected.time.DaytimeClient daytimeClient18 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect11);
        java.util.Date date20 = daytimeDialect11.decode("JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.testinfected.time.DaytimeDialect daytimeDialect21 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder22 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date23 = dateBuilder22.build();
        java.lang.String str24 = daytimeDialect21.encode(date23);
        org.testinfected.time.lib.DateBuilder dateBuilder25 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date26 = dateBuilder25.build();
        java.lang.String str27 = daytimeDialect21.encode(date26);
        org.testinfected.time.lib.SystemClock systemClock28 = new org.testinfected.time.lib.SystemClock();
        java.util.Date date29 = systemClock28.now();
        java.util.Date date30 = systemClock28.now();
        java.util.Date date31 = systemClock28.now();
        java.lang.String str32 = daytimeDialect21.encode(date31);
        java.lang.String str33 = daytimeDialect11.encode(date31);
        java.lang.String str34 = daytimeDialect1.encode(date31);
        org.testinfected.time.Clock clock35 = org.testinfected.time.lib.BrokenClock.stoppedAt(date31);
        org.junit.Assert.assertNotNull(daytimeDialect1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str4, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str7, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(daytimeDialect11);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str14, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str17, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Fri Nov 29 18:00:00 CST 2002");
        org.junit.Assert.assertNotNull(daytimeDialect21);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str24, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Nov 29 18:00:00 CST 2");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *" + "'", str27, "JJJJJ 02-11-30 00:00:00 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Mon Nov 20 02:47:32 CST 2023");
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Mon Nov 20 02:47:32 CST 2023");
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Mon Nov 20 02:47:32 CST 2023");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "JJJJJ 23-11-20 08:47:32 TT L H msADV UTC(NIST) *" + "'", str32, "JJJJJ 23-11-20 08:47:32 TT L H msADV UTC(NIST) *");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "JJJJJ 23-11-20 08:47:32 TT L H msADV UTC(NIST) *" + "'", str33, "JJJJJ 23-11-20 08:47:32 TT L H msADV UTC(NIST) *");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "JJJJJ 23-11-20 08:47:32 TT L H msADV UTC(NIST) *" + "'", str34, "JJJJJ 23-11-20 08:47:32 TT L H msADV UTC(NIST) *");
        org.junit.Assert.assertNotNull(clock35);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        org.testinfected.time.lib.DateBuilder dateBuilder3 = org.testinfected.time.lib.DateBuilder.calendarDate((int) (short) 0, (int) '4', (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder7 = dateBuilder3.onCalendar((int) (short) 10, 0, (int) (byte) 100);
        org.testinfected.time.lib.DateBuilder dateBuilder12 = dateBuilder3.atTime((int) 'a', (int) (byte) -1, (int) 'a', (int) '4');
        org.testinfected.time.lib.DateBuilder dateBuilder14 = dateBuilder3.inZone("JJJJJ 23-11-20 08:46:42 TT L H msADV UTC(NIST) *");
        org.testinfected.time.lib.DateBuilder dateBuilder18 = dateBuilder14.onCalendar((int) (short) 1, (-1), (-1));
        org.testinfected.time.lib.DateBuilder dateBuilder20 = dateBuilder18.fromMillis(0L);
        org.testinfected.time.lib.DateBuilder dateBuilder24 = dateBuilder20.atTime((int) (byte) 10, (int) (byte) 100, 1);
        org.testinfected.time.lib.DateBuilder dateBuilder31 = dateBuilder24.at(100, (int) (short) 1, (int) (byte) 0, (int) (byte) 0, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(dateBuilder3);
        org.junit.Assert.assertNotNull(dateBuilder7);
        org.junit.Assert.assertNotNull(dateBuilder12);
        org.junit.Assert.assertNotNull(dateBuilder14);
        org.junit.Assert.assertNotNull(dateBuilder18);
        org.junit.Assert.assertNotNull(dateBuilder20);
        org.junit.Assert.assertNotNull(dateBuilder24);
        org.junit.Assert.assertNotNull(dateBuilder31);
    }
}
