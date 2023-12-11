package flaky; 

import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTest{
    public static boolean debug = false;

	@Test
    public void test073_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat1 = new io.gsonfire.util.RFC3339DateFormat(timeZone0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.util.Calendar calendar4 = dateFormat3.getCalendar();
        java.lang.StringBuffer stringBuffer5 = null;
        java.text.FieldPosition fieldPosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = rFC3339DateFormat1.format((java.lang.Object) dateFormat3, stringBuffer5, fieldPosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(calendar4);
         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=-824141123372,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Chicago\",offset=-21600000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/Chicago,offset=-21600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1943,MONTH=10,WEEK_OF_YEAR=47,WEEK_OF_MONTH=3,DAY_OF_MONTH=20,DAY_OF_YEAR=324,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=54,SECOND=36,MILLISECOND=628,ZONE_OFFSET=-21600000,DST_OFFSET=3600000]");
    }
	@Test
    public void test087_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dateFormat1.parseObject("null");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=-824141123045,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Chicago\",offset=-21600000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/Chicago,offset=-21600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1943,MONTH=10,WEEK_OF_YEAR=47,WEEK_OF_MONTH=3,DAY_OF_MONTH=20,DAY_OF_YEAR=324,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=54,SECOND=36,MILLISECOND=955,ZONE_OFFSET=-21600000,DST_OFFSET=3600000]");
    }
	@Test
    public void test117_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone3 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter5 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone3, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateRFC3339TypeAdapter5.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = dateRFC3339TypeAdapter5.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = dateFormat0.formatToCharacterIterator((java.lang.Object) dateRFC3339TypeAdapter5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(calendar2);
         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=-824141122088,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Chicago\",offset=-21600000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/Chicago,offset=-21600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1943,MONTH=10,WEEK_OF_YEAR=47,WEEK_OF_MONTH=3,DAY_OF_MONTH=20,DAY_OF_YEAR=324,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=54,SECOND=37,MILLISECOND=912,ZONE_OFFSET=-21600000,DST_OFFSET=3600000]");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
    }
	@Test
    public void test142_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.Calendar calendar3 = dateFormat1.getCalendar();
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=-824141121293,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Chicago\",offset=-21600000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/Chicago,offset=-21600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1943,MONTH=10,WEEK_OF_YEAR=47,WEEK_OF_MONTH=3,DAY_OF_MONTH=20,DAY_OF_YEAR=324,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=54,SECOND=38,MILLISECOND=707,ZONE_OFFSET=-21600000,DST_OFFSET=3600000]");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=-824141121293,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Chicago\",offset=-21600000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/Chicago,offset=-21600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1943,MONTH=10,WEEK_OF_YEAR=47,WEEK_OF_MONTH=3,DAY_OF_MONTH=20,DAY_OF_YEAR=324,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=54,SECOND=38,MILLISECOND=707,ZONE_OFFSET=-21600000,DST_OFFSET=3600000]");
    }
	@Test
    public void test142_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.Calendar calendar3 = dateFormat1.getCalendar();
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=-824141121293,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Chicago\",offset=-21600000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/Chicago,offset=-21600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1943,MONTH=10,WEEK_OF_YEAR=47,WEEK_OF_MONTH=3,DAY_OF_MONTH=20,DAY_OF_YEAR=324,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=54,SECOND=38,MILLISECOND=707,ZONE_OFFSET=-21600000,DST_OFFSET=3600000]");
        org.junit.Assert.assertNotNull(calendar3);
         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=-824141121293,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Chicago\",offset=-21600000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/Chicago,offset=-21600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1943,MONTH=10,WEEK_OF_YEAR=47,WEEK_OF_MONTH=3,DAY_OF_MONTH=20,DAY_OF_YEAR=324,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=54,SECOND=38,MILLISECOND=707,ZONE_OFFSET=-21600000,DST_OFFSET=3600000]");
    }
	@Test
    public void test171_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.lang.Class<?> wildcardClass5 = dateFormat4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateFormat0.format((java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(calendar2);
         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=-824141120249,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Chicago\",offset=-21600000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/Chicago,offset=-21600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1943,MONTH=10,WEEK_OF_YEAR=47,WEEK_OF_MONTH=3,DAY_OF_MONTH=20,DAY_OF_YEAR=324,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=54,SECOND=39,MILLISECOND=751,ZONE_OFFSET=-21600000,DST_OFFSET=3600000]");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
	@Test
    public void test294_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        java.text.NumberFormat numberFormat4 = dateFormat2.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.util.Calendar calendar8 = dateFormat7.getCalendar();
        dateFormat1.setCalendar(calendar8);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(calendar8);
         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=-824141112109,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Chicago\",offset=-21600000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/Chicago,offset=-21600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1943,MONTH=10,WEEK_OF_YEAR=47,WEEK_OF_MONTH=3,DAY_OF_MONTH=20,DAY_OF_YEAR=324,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=54,SECOND=47,MILLISECOND=891,ZONE_OFFSET=-21600000,DST_OFFSET=3600000]");
    }
	@Test
    public void test306_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        io.gsonfire.DateSerializationPolicy dateSerializationPolicy1 = io.gsonfire.DateSerializationPolicy.unixTimeSeconds;
        boolean boolean2 = dateFormat0.equals((java.lang.Object) dateSerializationPolicy1);
        java.util.Calendar calendar3 = dateFormat0.getCalendar();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateSerializationPolicy1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=-824141111957,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Chicago\",offset=-21600000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/Chicago,offset=-21600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1943,MONTH=10,WEEK_OF_YEAR=47,WEEK_OF_MONTH=3,DAY_OF_MONTH=20,DAY_OF_YEAR=324,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=54,SECOND=48,MILLISECOND=43,ZONE_OFFSET=-21600000,DST_OFFSET=3600000]");
    }
}
	@Test
    public void test306_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        io.gsonfire.DateSerializationPolicy dateSerializationPolicy1 = io.gsonfire.DateSerializationPolicy.unixTimeSeconds;
        boolean boolean2 = dateFormat0.equals((java.lang.Object) dateSerializationPolicy1);
        java.util.Calendar calendar3 = dateFormat0.getCalendar();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateSerializationPolicy1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=-824141111957,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Chicago\",offset=-21600000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/Chicago,offset=-21600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1943,MONTH=10,WEEK_OF_YEAR=47,WEEK_OF_MONTH=3,DAY_OF_MONTH=20,DAY_OF_YEAR=324,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=54,SECOND=48,MILLISECOND=43,ZONE_OFFSET=-21600000,DST_OFFSET=3600000]");
    }
}
}