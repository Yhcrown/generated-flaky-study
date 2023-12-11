package flaky; 

import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTest{
    public static boolean debug = false;

	@Test
    public void test006_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 100);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromDaysAgo((long) (short) 100);
        long long4 = interval3.getUntilTime();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1691829528911L + "'", long4 == 1691829528911L);
    }
	@Test
    public void test075_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 10);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromMinutesAgo((long) (byte) 100);
        java.lang.String str4 = interval3.toString();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Interval{fromTime=1674166070495, untilTime=1700463530495}" + "'", str4, "Interval{fromTime=1674166070495, untilTime=1700463530495}");
    }
	@Test
    public void test109_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 100);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromMinutesAgo((-1L));
        long long4 = interval3.getFromTime();
        long long5 = interval3.getFromTime();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1437494991460L + "'", long4 == 1437494991460L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1437494991460L + "'", long5 == 1437494991460L);
    }
	@Test
    public void test109_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 100);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromMinutesAgo((-1L));
        long long4 = interval3.getFromTime();
        long long5 = interval3.getFromTime();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1437494991460L + "'", long4 == 1437494991460L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1437494991460L + "'", long5 == 1437494991460L);
    }
	@Test
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1695976731791L + "'", long5 == 1695976731791L);
    }
	@Test
    public void test136_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 100);
        com.inspiring.pugtsdb.time.Interval interval2 = builder1.fromNow();
        com.inspiring.pugtsdb.time.Interval interval4 = builder1.fromMonthsAgo((long) ' ');
        com.inspiring.pugtsdb.time.Interval interval6 = builder1.fromSecondsAgo(1691829528911L);
        java.lang.String str7 = interval6.toString();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval6);
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Interval{fromTime=-1690392033978951, untilTime=-1690129059378951}" + "'", str7, "Interval{fromTime=-1690392033978951, untilTime=-1690129059378951}");
    }
	@Test
    public void test179_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.inspiring.pugtsdb.time.Interval.Builder builder1 = com.inspiring.pugtsdb.time.Interval.ofLastMonths((long) (byte) 10);
        com.inspiring.pugtsdb.time.Interval interval3 = builder1.fromMinutesAgo((long) (byte) 100);
        long long4 = interval3.getFromTime();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(interval3);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1674166073724L + "'", long4 == 1674166073724L);
    }
}