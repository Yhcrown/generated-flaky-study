package flaky; 

import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTest{
    public static boolean debug = false;

	@Test
    public void test118_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_TIME_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_MINUS = timeFormatBuilder0;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder2 = timeFormatBuilder0.day();
        java.lang.String str4 = timeFormatBuilder2.format((long) 1970);
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder2);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969-12-31 18:0031-01- 01120118120001_01181200:01:-31" + "'", str4, "1969-12-31 18:0031-01- 01120118120001_01181200:01:-31");
    }
	@Test
    public void test152_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.junit.Assert.assertNotNull(calendar0);
         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1700471593451,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Chicago\",offset=-21600000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/Chicago,offset=-21600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2023,MONTH=10,WEEK_OF_YEAR=47,WEEK_OF_MONTH=4,DAY_OF_MONTH=20,DAY_OF_YEAR=324,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=3,HOUR_OF_DAY=3,MINUTE=13,SECOND=13,MILLISECOND=451,ZONE_OFFSET=-21600000,DST_OFFSET=0]");
    }
	@Test
    public void test196_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_SECOND_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder1 = timeFormatBuilder0.minus();
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder2 = timeFormatBuilder1.year();
        java.lang.String str4 = timeFormatBuilder2.format((long) (-336));
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder1);
        org.junit.Assert.assertNotNull(timeFormatBuilder2);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969-12-31 17:5931-59- 59125917125959_59171259:59:-3112591759-1259:17 1217591759:59_59-19691259:1712_::5912591969-12-31 18:0031-01- 01120118120001_01181200:01:-31-1969" + "'", str4, "1969-12-31 17:5931-59- 59125917125959_59171259:59:-3112591759-1259:17 1217591759:59_59-19691259:1712_::5912591969-12-31 18:0031-01- 01120118120001_01181200:01:-31-1969");
    }
	@Test
    public void test226_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_TIME_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_MINUS = timeFormatBuilder0;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder2 = timeFormatBuilder0.month();
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder3 = timeFormatBuilder0.minute();
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder5 = timeFormatBuilder0.separator("1969-12-31 18:0031-01- 01120118120001_01181200:01:-31");
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        int int11 = time7.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time12 = time7.increaseDate();
        com.github.swiftech.swifttime.Time time14 = time7.increaseDates((int) '#');
        time7.setTime(0, 23504, 4);
        time7.setTimeInMillis((long) 52);
        java.util.Date date21 = time7.getGregorianChange();
        java.lang.String str22 = timeFormatBuilder5.format(date21);
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder2);
        org.junit.Assert.assertNotNull(timeFormatBuilder3);
        org.junit.Assert.assertNotNull(timeFormatBuilder5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(time12);
        org.junit.Assert.assertNotNull(time14);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Oct 04 18:00:00 CST 1582");
         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1582-10-04 18:0004-00- 00100018100000_00181000:00:-0410001800-1000:18 1018001800:00_00-15821000:1810_::0010001969-12-31 18:0031-01- 01120118120001_01181200:01:-31-15820010001969-12-31 18:0031-01- 01120118120001_01181200:01:-31" + "'", str22, "1582-10-04 18:0004-00- 00100018100000_00181000:00:-0410001800-1000:18 1018001800:00_00-15821000:1810_::0010001969-12-31 18:0031-01- 01120118120001_01181200:01:-31-15820010001969-12-31 18:0031-01- 01120118120001_01181200:01:-31");
    }
}