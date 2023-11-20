import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTests{
    public static boolean debug = false;


    public void test006_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 100);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromDaysAgo((long) (short) 100);
        long long4 = interval3.getUntilTime();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1690154967698L + "'", long4 == 1690154967698L);
    }

    public void test075_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 10);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromMinutesAgo((long) (byte) 100);
        java.lang.String str4 = interval3.toString();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Interval{fromTime=1672491509360, untilTime=1698788969360}

    public void test109_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 100);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromMinutesAgo((-1L));
        long long4 = interval3.getFromTime();
        long long5 = interval3.getFromTime();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1435820430292L + "'", long4 == 1435820430292L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1435820430292L + "'", long5 == 1435820430292L);
    }

    public void test109_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 100);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromMinutesAgo((-1L));
        long long4 = interval3.getFromTime();
        long long5 = interval3.getFromTime();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1435820430292L + "'", long4 == 1435820430292L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1435820430292L + "'", long5 == 1435820430292L);
    }

    public void test129_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastDays((long) '4');
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromDaysAgo(0L);
        com.inspiring.pugtsdb.time.Interval interval4 = builder1.fromNow();
        long long5 = interval4.getFromTime();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(interval4);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1694302170624L + "'", long5 == 1694302170624L);
    }

    public void test136_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 100);
        com.inspiring.pugtsdb.time.Interval interval2 = builder1.fromNow();
        com.inspiring.pugtsdb.time.Interval interval4 = builder1.fromMonthsAgo((long) ' ');
        com.inspiring.pugtsdb.time.Interval interval6 = builder1.fromSecondsAgo(1690154967698L);
        java.lang.String str7 = interval6.toString();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval6);
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Interval{fromTime=-1688719147327133, untilTime=-1688456172727133}

    public void test179_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 10);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromMinutesAgo((long) (byte) 100);
        long long4 = interval3.getFromTime();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1672491512541L + "'", long4 == 1672491512541L);
    }
}