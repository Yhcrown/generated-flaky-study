import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.testinfected.time.DaytimeDialect daytimeDialect1 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder2 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date3 = dateBuilder2.build();
        java.lang.String str4 = daytimeDialect1.encode(date3);
        org.testinfected.time.lib.DateBuilder dateBuilder5 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date6 = dateBuilder5.build();
        java.lang.String str7 = daytimeDialect1.encode(date6);
        org.testinfected.time.DaytimeServer daytimeServer8 = new org.testinfected.time.DaytimeServer((int) '#', daytimeDialect1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        daytimeServer8.stop();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.testinfected.time.DaytimeServer daytimeServer1 = new org.testinfected.time.DaytimeServer((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        daytimeServer1.stop();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        daytimeServer36.stop();
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        daytimeServer8.stop();
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        daytimeServer8.stop();
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        org.testinfected.time.DaytimeServer daytimeServer1 = new org.testinfected.time.DaytimeServer((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        daytimeServer1.stop();
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        org.testinfected.time.DaytimeDialect daytimeDialect3 = org.testinfected.time.nist.NISTDialect.INSTANCE;
        org.testinfected.time.lib.DateBuilder dateBuilder4 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date5 = dateBuilder4.build();
        java.lang.String str6 = daytimeDialect3.encode(date5);
        org.testinfected.time.lib.DateBuilder dateBuilder7 = new org.testinfected.time.lib.DateBuilder();
        java.util.Date date8 = dateBuilder7.build();
        java.lang.String str9 = daytimeDialect3.encode(date8);
        org.testinfected.time.DaytimeClient daytimeClient10 = new org.testinfected.time.DaytimeClient("", (int) (byte) 0, daytimeDialect3);
        org.testinfected.time.DaytimeServer daytimeServer11 = new org.testinfected.time.DaytimeServer((int) '4', daytimeDialect3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        daytimeServer11.stop();
    }
}

