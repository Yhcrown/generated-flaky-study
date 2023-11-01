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
        java.util.Locale locale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time(locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        int int0 = java.util.Calendar.TUESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        int int0 = java.util.Calendar.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.util.TimeZone timeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar1 = java.util.Calendar.getInstance(timeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        int int0 = java.util.Calendar.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        int int0 = java.util.Calendar.UNDECIMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        int int0 = java.util.GregorianCalendar.BC;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        int int0 = java.util.Calendar.MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap5 = time1.getDisplayNames(0, (int) '4', locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        int int0 = java.util.Calendar.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        int int0 = java.util.Calendar.JUNE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap16 = time7.getDisplayNames(3, 8, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        int int0 = java.util.Calendar.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        time1.add(4, 100);
        time1.setTime(0, (int) (byte) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = time1.getActualMinimum((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time1.increaseWeek();
        int int8 = time1.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        int int0 = java.util.Calendar.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        time1.add(4, 100);
        // The following exception was thrown during execution in test generation
        try {
            time1.roll((int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        int int0 = java.util.Calendar.THURSDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time1.increaseWeek();
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            time1.setGregorianChange(date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time((long) (-1));
        time5.setLenient(true);
        com.github.swiftech.swifttime.Time time8 = null;
        int int9 = time5.getYearIntervalFrom(time8);
        com.github.swiftech.swifttime.Time time11 = new com.github.swiftech.swifttime.Time((long) (-1));
        time11.setLenient(true);
        com.github.swiftech.swifttime.Time time14 = null;
        int int15 = time11.getYearIntervalFrom(time14);
        int int16 = time5.getHourIntervalTo(time11);
        int int17 = time1.getDayIntervalFrom(time11);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = time11.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time1.getMonthIntervalFrom(time21);
        com.github.swiftech.swifttime.Time time29 = time21.truncateAtDate();
        com.github.swiftech.swifttime.Time time30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = time21.getMonthIntervalFrom(time30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-23505) + "'", int28 == (-23505));
        org.junit.Assert.assertNotNull(time29);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        boolean boolean8 = time6.isLeapYear(2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        int int0 = java.util.Calendar.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        time1.setSecond(2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(time6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        time1.add(4, 100);
        int int7 = time1.getDate();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        int int0 = java.util.Calendar.DST_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        java.util.Locale locale22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = time1.getDisplayName((int) (byte) 0, 52, locale22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        int int0 = java.util.Calendar.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time1.increaseWeek();
        int int8 = time7.getFirstDayOfWeek();
        boolean boolean9 = time7.isLenient();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder1 = timeFormatBuilder0.blank();
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        int int0 = java.util.Calendar.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        int int0 = java.util.Calendar.FIELD_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        int int0 = java.util.Calendar.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        time1.add(4, 100);
        int int7 = time1.getMonth();
        time1.set(100, 23504, (int) '#');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time1.getMonthIntervalFrom(time21);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = time1.getGreatestMinimum((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-23505) + "'", int28 == (-23505));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        int int0 = java.util.Calendar.LONG_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32770 + "'", int0 == 32770);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time1.getMonthIntervalFrom(time21);
        java.lang.String str29 = time1.getCalendarType();
        com.github.swiftech.swifttime.Time time30 = time1.truncateAtHour();
        // The following exception was thrown during execution in test generation
        try {
            time1.setWeekDate((-4), (int) 'a', (-23505));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: -23505");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-23505) + "'", int28 == (-23505));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "gregory" + "'", str29, "gregory");
        org.junit.Assert.assertNotNull(time30);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time1.increaseWeek();
        com.github.swiftech.swifttime.Time time9 = new com.github.swiftech.swifttime.Time((long) (-1));
        time9.setLenient(true);
        com.github.swiftech.swifttime.Time time12 = null;
        int int13 = time9.getYearIntervalFrom(time12);
        com.github.swiftech.swifttime.Time time15 = new com.github.swiftech.swifttime.Time((long) (-1));
        time15.setLenient(true);
        com.github.swiftech.swifttime.Time time18 = null;
        int int19 = time15.getYearIntervalFrom(time18);
        int int20 = time9.getHourIntervalTo(time15);
        time9.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        int int28 = time1.getMinuteIntervalTo(time9);
        time1.setHour(1);
        boolean boolean31 = time1.isLenient();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1030177009) + "'", int28 == (-1030177009));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        java.util.Locale locale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        time1.setFirstDayOfWeek((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            time1.setWeekDate(4, 16, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time7.clear(11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        time1.add(4, 100);
        time1.setTime(0, (int) (byte) 1, (int) '#');
        time1.setSecond(11);
        java.util.Date date13 = null;
        // The following exception was thrown during execution in test generation
        try {
            time1.setGregorianChange(date13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(10, (int) (short) -1, 11, (-1030177009), 4);
        com.github.swiftech.swifttime.Time time7 = time5.increaseHours((int) (short) 100);
        int int9 = time5.getMaximum(0);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time1.increaseWeek();
        com.github.swiftech.swifttime.Time time9 = new com.github.swiftech.swifttime.Time((long) (-1));
        time9.setLenient(true);
        com.github.swiftech.swifttime.Time time12 = null;
        int int13 = time9.getYearIntervalFrom(time12);
        com.github.swiftech.swifttime.Time time15 = new com.github.swiftech.swifttime.Time((long) (-1));
        time15.setLenient(true);
        com.github.swiftech.swifttime.Time time18 = null;
        int int19 = time15.getYearIntervalFrom(time18);
        int int20 = time9.getHourIntervalTo(time15);
        time9.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        int int28 = time1.getMinuteIntervalTo(time9);
        time1.setHour(1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = time1.getGreatestMinimum((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1030177009) + "'", int28 == (-1030177009));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        int int0 = java.util.Calendar.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        int int0 = java.util.Calendar.DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        int int0 = java.util.GregorianCalendar.AD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        time1.clear(8);
        time1.setMonth(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        int int0 = java.util.Calendar.NARROW_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32772 + "'", int0 == 32772);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_TIME_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_SECOND_MINUS = timeFormatBuilder0;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder2 = timeFormatBuilder0.second();
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder3 = timeFormatBuilder2.underscore();
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder2);
        org.junit.Assert.assertNotNull(timeFormatBuilder3);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time6.truncateAtSecond();
        com.github.swiftech.swifttime.Time time9 = time7.increaseSeconds((-85846102));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertNotNull(time9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        int int0 = java.util.Calendar.SHORT_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = new com.github.swiftech.swifttime.TimeFormatBuilder();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        int int0 = java.util.Calendar.WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        int int0 = java.util.Calendar.DAY_OF_WEEK_IN_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time1.increaseWeek();
        com.github.swiftech.swifttime.Time time9 = new com.github.swiftech.swifttime.Time((long) (-1));
        time9.setLenient(true);
        com.github.swiftech.swifttime.Time time12 = null;
        int int13 = time9.getYearIntervalFrom(time12);
        com.github.swiftech.swifttime.Time time15 = new com.github.swiftech.swifttime.Time((long) (-1));
        time15.setLenient(true);
        com.github.swiftech.swifttime.Time time18 = null;
        int int19 = time15.getYearIntervalFrom(time18);
        int int20 = time9.getHourIntervalTo(time15);
        time9.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        int int28 = time1.getMinuteIntervalTo(time9);
        boolean boolean29 = time1.isWeekDateSupported();
        int int30 = time1.getWeekYear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1030177009) + "'", int28 == (-1030177009));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_TIME_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_SECOND_MINUS = timeFormatBuilder0;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder2 = timeFormatBuilder0.second();
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder3 = timeFormatBuilder2.hour();
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = timeFormatBuilder3.format(date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder2);
        org.junit.Assert.assertNotNull(timeFormatBuilder3);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(10, (int) (short) -1, 11, (-1030177009), 4);
        com.github.swiftech.swifttime.Time time7 = time5.increaseHours((int) (short) 100);
        int int8 = time5.getDate();
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time1.increaseWeek();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = time1.getLeastMaximum((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_TIME_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_MINUS = timeFormatBuilder0;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder2 = timeFormatBuilder0.second();
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder3 = timeFormatBuilder0.colon();
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder2);
        org.junit.Assert.assertNotNull(timeFormatBuilder3);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time1.getMonthIntervalFrom(time21);
        java.lang.String str29 = time1.getCalendarType();
        com.github.swiftech.swifttime.Time time30 = time1.truncateAtHour();
        // The following exception was thrown during execution in test generation
        try {
            time1.roll(59, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-23505) + "'", int28 == (-23505));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "gregory" + "'", str29, "gregory");
        org.junit.Assert.assertNotNull(time30);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        int int0 = java.util.Calendar.ALL_STYLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        com.github.swiftech.swifttime.Time time4 = new com.github.swiftech.swifttime.Time((-1030177009), 100, 59, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = time4.getDaysOfCurrentMonth();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        time1.add(4, 100);
        time1.setTime(0, (int) (byte) 1, (int) '#');
        int int11 = time1.getDate();
        com.github.swiftech.swifttime.Time time12 = time1.getFirstDayOfCurrentWeek();
        time12.setDate(12);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(time12);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time1.getMonthIntervalFrom(time21);
        java.lang.String str29 = time1.getCalendarType();
        com.github.swiftech.swifttime.Time time30 = time1.truncateAtHour();
        com.github.swiftech.swifttime.Time time32 = new com.github.swiftech.swifttime.Time((long) (-1));
        time32.setLenient(true);
        com.github.swiftech.swifttime.Time time35 = null;
        int int36 = time32.getYearIntervalFrom(time35);
        int int37 = time1.getMonthIntervalTo(time32);
        time32.setSecond(2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-23505) + "'", int28 == (-23505));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "gregory" + "'", str29, "gregory");
        org.junit.Assert.assertNotNull(time30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 23504 + "'", int37 == 23504);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        com.github.swiftech.swifttime.Time time13 = time7.truncateAtWeek();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time13);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time((long) (-1));
        time5.setLenient(true);
        com.github.swiftech.swifttime.Time time8 = null;
        int int9 = time5.getYearIntervalFrom(time8);
        com.github.swiftech.swifttime.Time time11 = new com.github.swiftech.swifttime.Time((long) (-1));
        time11.setLenient(true);
        com.github.swiftech.swifttime.Time time14 = null;
        int int15 = time11.getYearIntervalFrom(time14);
        int int16 = time5.getHourIntervalTo(time11);
        int int17 = time1.getDayIntervalFrom(time11);
        java.time.ZonedDateTime zonedDateTime18 = time1.toZonedDateTime();
        java.lang.String str19 = time1.getCalendarType();
        long long20 = time1.getTimeInMillis();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "gregory" + "'", str19, "gregory");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        time1.add(4, 100);
        time1.setTime(0, (int) (byte) 1, (int) '#');
        time1.setSecond(11);
        int int13 = time1.getMinimalDaysInFirstWeek();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time1.increaseWeek();
        boolean boolean8 = time7.isLenient();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.swiftech.swifttime.Time time2 = new com.github.swiftech.swifttime.Time(timeZone0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(1, (int) 'a', (-1030177009), (int) (byte) 0, 8);
        time5.setTime(14, (-1030177009), 100);
        com.github.swiftech.swifttime.Time time10 = new com.github.swiftech.swifttime.Time((java.util.Calendar) time5);
        int int11 = time10.getMinute();
        com.github.swiftech.swifttime.Time time17 = new com.github.swiftech.swifttime.Time(10, (int) (short) -1, 11, (-1030177009), 4);
        com.github.swiftech.swifttime.Time time19 = time17.increaseHours((int) (short) 100);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time27.getFirstDayOfWeek();
        int int29 = time19.getSecondIntervalFrom(time27);
        int int30 = time27.getWeekYear();
        int int31 = time10.getSecondIntervalFrom(time27);
        com.github.swiftech.swifttime.Time time32 = time27.getLastDayOfCurrentWeek();
        // The following exception was thrown during execution in test generation
        try {
            int int34 = time32.getMinimum(28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(time19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 487564929 + "'", int29 == 487564929);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1202077121 + "'", int31 == 1202077121);
        org.junit.Assert.assertNotNull(time32);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        time1.add(4, 100);
        int int7 = time1.getMonth();
        boolean boolean9 = time1.isSet(2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        int int0 = java.util.Calendar.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        int int0 = java.util.Calendar.WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        int int8 = time6.getGreatestMinimum(0);
        time6.clear();
        time6.setMinute((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(1, (int) 'a', (-1030177009), (int) (byte) 0, 8);
        time5.setTime(14, (-1030177009), 100);
        com.github.swiftech.swifttime.Time time10 = new com.github.swiftech.swifttime.Time((java.util.Calendar) time5);
        int int11 = time10.getMinute();
        boolean boolean12 = time10.isLenient();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        int int0 = java.util.Calendar.MAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        int int0 = java.util.Calendar.AM_PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        int int0 = java.util.Calendar.MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time1.getMonthIntervalFrom(time21);
        java.lang.String str29 = time1.getCalendarType();
        boolean boolean30 = time1.isWeekDateSupported();
        boolean boolean32 = time1.isLeapYear((-23505));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-23505) + "'", int28 == (-23505));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "gregory" + "'", str29, "gregory");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = time7.getDaysOfCurrentMonth();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(1, (int) 'a', (-1030177009), (int) (byte) 0, 8);
        time5.setTime(14, (-1030177009), 100);
        com.github.swiftech.swifttime.Time time10 = new com.github.swiftech.swifttime.Time((java.util.Calendar) time5);
        int int11 = time10.getMinute();
        com.github.swiftech.swifttime.Time time17 = new com.github.swiftech.swifttime.Time(10, (int) (short) -1, 11, (-1030177009), 4);
        com.github.swiftech.swifttime.Time time19 = time17.increaseHours((int) (short) 100);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time27.getFirstDayOfWeek();
        int int29 = time19.getSecondIntervalFrom(time27);
        int int30 = time27.getWeekYear();
        int int31 = time10.getSecondIntervalFrom(time27);
        com.github.swiftech.swifttime.Time time32 = time27.getLastDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time34 = new com.github.swiftech.swifttime.Time((long) (-1));
        time34.setLenient(true);
        com.github.swiftech.swifttime.Time time37 = null;
        int int38 = time34.getYearIntervalFrom(time37);
        com.github.swiftech.swifttime.Time time40 = new com.github.swiftech.swifttime.Time((long) (-1));
        time40.setLenient(true);
        com.github.swiftech.swifttime.Time time43 = null;
        int int44 = time40.getYearIntervalFrom(time43);
        int int45 = time34.getHourIntervalTo(time40);
        time34.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time54 = new com.github.swiftech.swifttime.Time((long) (-1));
        time54.setLenient(true);
        int int58 = time54.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time59 = time54.increaseDate();
        com.github.swiftech.swifttime.Time time60 = time54.increaseWeek();
        int int61 = time34.getMonthIntervalFrom(time54);
        java.lang.String str62 = time34.getCalendarType();
        int int63 = time27.getYearIntervalTo(time34);
        int int65 = time34.get((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(time19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 487564929 + "'", int29 == 487564929);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1202077121 + "'", int31 == 1202077121);
        org.junit.Assert.assertNotNull(time32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertNotNull(time59);
        org.junit.Assert.assertNotNull(time60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-23505) + "'", int61 == (-23505));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "gregory" + "'", str62, "gregory");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1959) + "'", int63 == (-1959));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 11 + "'", int65 == 11);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        time1.add(4, 100);
        time1.setTime(0, (int) (byte) 1, (int) '#');
        int int11 = time1.getDate();
        com.github.swiftech.swifttime.Time time12 = time1.truncateAtHour();
        com.github.swiftech.swifttime.Time time14 = new com.github.swiftech.swifttime.Time((long) (-1));
        time14.setLenient(true);
        int int18 = time14.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time19 = time14.increaseDate();
        com.github.swiftech.swifttime.Time time20 = time14.increaseWeek();
        int int21 = time20.getWeeksInWeekYear();
        com.github.swiftech.swifttime.Time time22 = time20.increaseHour();
        com.github.swiftech.swifttime.Time time23 = time20.clone();
        int int24 = time12.getWeekIntervalFrom(time20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(time12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(time19);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(time22);
        org.junit.Assert.assertNotNull(time23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-102786) + "'", int24 == (-102786));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        int int0 = java.util.Calendar.SUNDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time1.increaseWeek();
        int int8 = time7.getWeeksInWeekYear();
        com.github.swiftech.swifttime.Time time9 = time7.increaseHour();
        java.util.Date date10 = null;
        // The following exception was thrown during execution in test generation
        try {
            time7.setGregorianChange(date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(time9);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        java.util.Set<java.lang.String> strSet0 = java.util.Calendar.getAvailableCalendarTypes();
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(1, (int) 'a', (-1030177009), (int) (byte) 0, 8);
        time5.setTime(14, (-1030177009), 100);
        com.github.swiftech.swifttime.Time time10 = new com.github.swiftech.swifttime.Time((java.util.Calendar) time5);
        time10.setHour(1202077121);
        int int14 = time10.getLeastMaximum(0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time1.getMonthIntervalFrom(time21);
        com.github.swiftech.swifttime.Time time29 = time21.truncateAtDate();
        com.github.swiftech.swifttime.Time time30 = time21.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time31 = time21.getLastDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time33 = time31.increaseYears((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-23505) + "'", int28 == (-23505));
        org.junit.Assert.assertNotNull(time29);
        org.junit.Assert.assertNotNull(time30);
        org.junit.Assert.assertNotNull(time31);
        org.junit.Assert.assertNotNull(time33);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(1, (int) 'a', (-1030177009), (int) (byte) 0, 8);
        time5.setTime(14, (-1030177009), 100);
        com.github.swiftech.swifttime.Time time10 = new com.github.swiftech.swifttime.Time((java.util.Calendar) time5);
        int int11 = time10.getMinute();
        com.github.swiftech.swifttime.Time time17 = new com.github.swiftech.swifttime.Time(10, (int) (short) -1, 11, (-1030177009), 4);
        com.github.swiftech.swifttime.Time time19 = time17.increaseHours((int) (short) 100);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time27.getFirstDayOfWeek();
        int int29 = time19.getSecondIntervalFrom(time27);
        int int30 = time27.getWeekYear();
        int int31 = time10.getSecondIntervalFrom(time27);
        com.github.swiftech.swifttime.Time time32 = time27.getLastDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time34 = new com.github.swiftech.swifttime.Time((long) (-1));
        time34.setLenient(true);
        com.github.swiftech.swifttime.Time time37 = null;
        int int38 = time34.getYearIntervalFrom(time37);
        com.github.swiftech.swifttime.Time time40 = new com.github.swiftech.swifttime.Time((long) (-1));
        time40.setLenient(true);
        com.github.swiftech.swifttime.Time time43 = null;
        int int44 = time40.getYearIntervalFrom(time43);
        int int45 = time34.getHourIntervalTo(time40);
        time34.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time54 = new com.github.swiftech.swifttime.Time((long) (-1));
        time54.setLenient(true);
        int int58 = time54.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time59 = time54.increaseDate();
        com.github.swiftech.swifttime.Time time60 = time54.increaseWeek();
        int int61 = time34.getMonthIntervalFrom(time54);
        java.lang.String str62 = time34.getCalendarType();
        int int63 = time27.getYearIntervalTo(time34);
        int int65 = time27.getActualMaximum(10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(time19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 487564929 + "'", int29 == 487564929);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1202077121 + "'", int31 == 1202077121);
        org.junit.Assert.assertNotNull(time32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertNotNull(time59);
        org.junit.Assert.assertNotNull(time60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-23505) + "'", int61 == (-23505));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "gregory" + "'", str62, "gregory");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1959) + "'", int63 == (-1959));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 11 + "'", int65 == 11);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time1.getMonthIntervalFrom(time21);
        java.lang.String str29 = time1.getCalendarType();
        com.github.swiftech.swifttime.Time time30 = time1.truncateAtHour();
        // The following exception was thrown during execution in test generation
        try {
            int int32 = time1.getLeastMaximum(59);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 59");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-23505) + "'", int28 == (-23505));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "gregory" + "'", str29, "gregory");
        org.junit.Assert.assertNotNull(time30);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        time1.add(4, 100);
        time1.setTime(0, (int) (byte) 1, (int) '#');
        int int11 = time1.getDate();
        com.github.swiftech.swifttime.Time time12 = time1.truncateAtHour();
        int int13 = time12.getWeekYear();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(time12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        int int0 = java.util.Calendar.ZONE_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_TIME_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_MINUS = timeFormatBuilder0;
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_MINUS = timeFormatBuilder0;
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_TIME_STAMP = timeFormatBuilder0;
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        int int0 = java.util.Calendar.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(10, (int) (short) -1, 11, (-1030177009), 4);
        com.github.swiftech.swifttime.Time time7 = time5.increaseHours((int) (short) 100);
        java.lang.String str8 = time5.toString();
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Fri Apr 02 03:04:00 CST 117511" + "'", str8, "Fri Apr 02 03:04:00 CST 117511");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_SECOND_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder1 = timeFormatBuilder0.minus();
        java.util.Date date2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = timeFormatBuilder1.format(date2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time1.increaseWeek();
        com.github.swiftech.swifttime.Time time9 = new com.github.swiftech.swifttime.Time((long) (-1));
        time9.setLenient(true);
        com.github.swiftech.swifttime.Time time12 = null;
        int int13 = time9.getYearIntervalFrom(time12);
        com.github.swiftech.swifttime.Time time15 = new com.github.swiftech.swifttime.Time((long) (-1));
        time15.setLenient(true);
        com.github.swiftech.swifttime.Time time18 = null;
        int int19 = time15.getYearIntervalFrom(time18);
        int int20 = time9.getHourIntervalTo(time15);
        time9.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        int int28 = time1.getMinuteIntervalTo(time9);
        com.github.swiftech.swifttime.Time time30 = new com.github.swiftech.swifttime.Time((long) (-1));
        time30.setLenient(true);
        com.github.swiftech.swifttime.Time time34 = new com.github.swiftech.swifttime.Time((long) (-1));
        time34.setLenient(true);
        com.github.swiftech.swifttime.Time time37 = null;
        int int38 = time34.getYearIntervalFrom(time37);
        com.github.swiftech.swifttime.Time time40 = new com.github.swiftech.swifttime.Time((long) (-1));
        time40.setLenient(true);
        com.github.swiftech.swifttime.Time time43 = null;
        int int44 = time40.getYearIntervalFrom(time43);
        int int45 = time34.getHourIntervalTo(time40);
        int int46 = time30.getDayIntervalFrom(time40);
        int int47 = time9.getMinuteIntervalFrom(time40);
        java.time.ZonedDateTime zonedDateTime48 = time40.toZonedDateTime();
        time40.setYear(32772);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1030177009) + "'", int28 == (-1030177009));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1030165489) + "'", int47 == (-1030165489));
        org.junit.Assert.assertNotNull(zonedDateTime48);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time((long) (-1));
        time5.setLenient(true);
        com.github.swiftech.swifttime.Time time8 = null;
        int int9 = time5.getYearIntervalFrom(time8);
        com.github.swiftech.swifttime.Time time11 = new com.github.swiftech.swifttime.Time((long) (-1));
        time11.setLenient(true);
        com.github.swiftech.swifttime.Time time14 = null;
        int int15 = time11.getYearIntervalFrom(time14);
        int int16 = time5.getHourIntervalTo(time11);
        int int17 = time1.getDayIntervalFrom(time11);
        java.time.ZonedDateTime zonedDateTime18 = time1.toZonedDateTime();
        java.util.GregorianCalendar gregorianCalendar19 = java.util.GregorianCalendar.from(zonedDateTime18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertNotNull(gregorianCalendar19);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time1.increaseWeek();
        com.github.swiftech.swifttime.Time time9 = new com.github.swiftech.swifttime.Time((long) (-1));
        time9.setLenient(true);
        com.github.swiftech.swifttime.Time time12 = null;
        int int13 = time9.getYearIntervalFrom(time12);
        com.github.swiftech.swifttime.Time time15 = new com.github.swiftech.swifttime.Time((long) (-1));
        time15.setLenient(true);
        com.github.swiftech.swifttime.Time time18 = null;
        int int19 = time15.getYearIntervalFrom(time18);
        int int20 = time9.getHourIntervalTo(time15);
        time9.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        int int28 = time1.getMinuteIntervalTo(time9);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = time1.getMinimum(32770);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32770");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1030177009) + "'", int28 == (-1030177009));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time21 = time1.truncateAtSecond();
        com.github.swiftech.swifttime.Time time23 = new com.github.swiftech.swifttime.Time((long) (-1));
        time23.setLenient(true);
        int int27 = time23.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time28 = time23.increaseDate();
        int int29 = time21.getYearIntervalFrom(time28);
        com.github.swiftech.swifttime.Time time30 = time28.increaseYear();
        int int31 = time28.getFirstDayOfWeek();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(time21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(time28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1959) + "'", int29 == (-1959));
        org.junit.Assert.assertNotNull(time30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time21 = time1.truncateAtSecond();
        com.github.swiftech.swifttime.Time time23 = new com.github.swiftech.swifttime.Time((long) (-1));
        time23.setLenient(true);
        int int27 = time23.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time28 = time23.increaseDate();
        int int29 = time21.getYearIntervalFrom(time28);
        com.github.swiftech.swifttime.Time time30 = time28.increaseYear();
        time28.setHour((-85846102));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(time21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(time28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1959) + "'", int29 == (-1959));
        org.junit.Assert.assertNotNull(time30);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        int int21 = time1.getDayOfWeek();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        time1.setFirstDayOfWeek((int) '#');
        com.github.swiftech.swifttime.Time time23 = time1.truncateAtDate();
        int int24 = time1.getMinimalDaysInFirstWeek();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(time23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.github.swiftech.swifttime.Time time2 = new com.github.swiftech.swifttime.Time((int) 'a', 17);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = time1.getGreatestMinimum((-1959));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1959");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time1.increaseWeek();
        com.github.swiftech.swifttime.Time time9 = new com.github.swiftech.swifttime.Time((long) (-1));
        time9.setLenient(true);
        com.github.swiftech.swifttime.Time time12 = null;
        int int13 = time9.getYearIntervalFrom(time12);
        com.github.swiftech.swifttime.Time time15 = new com.github.swiftech.swifttime.Time((long) (-1));
        time15.setLenient(true);
        com.github.swiftech.swifttime.Time time18 = null;
        int int19 = time15.getYearIntervalFrom(time18);
        int int20 = time9.getHourIntervalTo(time15);
        time9.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        int int28 = time1.getMinuteIntervalTo(time9);
        time1.setHour(1);
        com.github.swiftech.swifttime.Time time32 = time1.increaseMinutes(32769);
        com.github.swiftech.swifttime.Time time34 = new com.github.swiftech.swifttime.Time((long) (-1));
        time34.setLenient(true);
        int int38 = time34.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time39 = time34.increaseDate();
        com.github.swiftech.swifttime.Time time40 = time34.increaseWeek();
        com.github.swiftech.swifttime.Time time42 = new com.github.swiftech.swifttime.Time((long) (-1));
        time42.setLenient(true);
        com.github.swiftech.swifttime.Time time45 = null;
        int int46 = time42.getYearIntervalFrom(time45);
        com.github.swiftech.swifttime.Time time48 = new com.github.swiftech.swifttime.Time((long) (-1));
        time48.setLenient(true);
        com.github.swiftech.swifttime.Time time51 = null;
        int int52 = time48.getYearIntervalFrom(time51);
        int int53 = time42.getHourIntervalTo(time48);
        time42.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        int int61 = time34.getMinuteIntervalTo(time42);
        com.github.swiftech.swifttime.Time time63 = time42.increaseDates((int) (short) 100);
        int int64 = time1.getYearIntervalTo(time63);
        time63.set(1202077121, 32772, 59);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1030177009) + "'", int28 == (-1030177009));
        org.junit.Assert.assertNotNull(time32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(time39);
        org.junit.Assert.assertNotNull(time40);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1030177009) + "'", int61 == (-1030177009));
        org.junit.Assert.assertNotNull(time63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1959) + "'", int64 == (-1959));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_TIME_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_MINUS = timeFormatBuilder0;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder2 = timeFormatBuilder0.day();
        java.lang.String str4 = timeFormatBuilder2.format((long) 1970);
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969-12-31 18:0031-01- 01120118120001_01181200:01:-31" + "'", str4, "1969-12-31 18:0031-01- 01120118120001_01181200:01:-31");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.github.swiftech.swifttime.Time time2 = new com.github.swiftech.swifttime.Time(6, 487564929);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time1.getMonthIntervalFrom(time21);
        time21.clear((int) (byte) 1);
        time21.setHour((int) (short) 1);
        com.github.swiftech.swifttime.Time time33 = new com.github.swiftech.swifttime.Time();
        com.github.swiftech.swifttime.Time time34 = time33.truncateAtHour();
        boolean boolean35 = time21.after((java.lang.Object) time33);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-23505) + "'", int28 == (-23505));
        org.junit.Assert.assertNotNull(time34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time1.increaseWeek();
        int int8 = time7.getWeeksInWeekYear();
        boolean boolean10 = time7.isSet((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(10, (int) (short) -1, 11, (-1030177009), 4);
        com.github.swiftech.swifttime.Time time7 = time5.increaseHours((int) (short) 100);
        time5.setYear(32770);
        time5.setLenient(false);
        org.junit.Assert.assertNotNull(time7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time1.getMonthIntervalFrom(time21);
        time21.clear((int) (byte) 1);
        int int31 = time21.getMinute();
        com.github.swiftech.swifttime.Time time33 = new com.github.swiftech.swifttime.Time((long) (-1));
        time33.setLenient(true);
        int int37 = time33.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time38 = time33.increaseDate();
        com.github.swiftech.swifttime.Time time40 = time33.increaseDates((int) '#');
        int int41 = time21.getWeekIntervalFrom(time40);
        boolean boolean43 = time40.isLeapYear((-23505));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-23505) + "'", int28 == (-23505));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 59 + "'", int31 == 59);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(time38);
        org.junit.Assert.assertNotNull(time40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-4) + "'", int41 == (-4));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_TIME_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_MINUS = timeFormatBuilder0;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder2 = timeFormatBuilder0.minus();
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder2);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time1.getMonthIntervalFrom(time21);
        com.github.swiftech.swifttime.Time time29 = time21.truncateAtDate();
        com.github.swiftech.swifttime.Time time30 = time21.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time31 = time21.getLastDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time32 = time21.increaseSecond();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-23505) + "'", int28 == (-23505));
        org.junit.Assert.assertNotNull(time29);
        org.junit.Assert.assertNotNull(time30);
        org.junit.Assert.assertNotNull(time31);
        org.junit.Assert.assertNotNull(time32);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time21 = time1.truncateAtSecond();
        com.github.swiftech.swifttime.Time time23 = new com.github.swiftech.swifttime.Time((long) (-1));
        time23.setLenient(true);
        int int27 = time23.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time28 = time23.increaseDate();
        int int29 = time21.getYearIntervalFrom(time28);
        com.github.swiftech.swifttime.Time time30 = time28.increaseYear();
        com.github.swiftech.swifttime.Time time32 = new com.github.swiftech.swifttime.Time((long) (-1));
        time32.setLenient(true);
        int int36 = time32.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time37 = time32.increaseDate();
        com.github.swiftech.swifttime.Time time38 = time32.increaseWeek();
        com.github.swiftech.swifttime.Time time40 = new com.github.swiftech.swifttime.Time((long) (-1));
        time40.setLenient(true);
        com.github.swiftech.swifttime.Time time43 = null;
        int int44 = time40.getYearIntervalFrom(time43);
        com.github.swiftech.swifttime.Time time46 = new com.github.swiftech.swifttime.Time((long) (-1));
        time46.setLenient(true);
        com.github.swiftech.swifttime.Time time49 = null;
        int int50 = time46.getYearIntervalFrom(time49);
        int int51 = time40.getHourIntervalTo(time46);
        time40.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        int int59 = time32.getMinuteIntervalTo(time40);
        time32.setHour(1);
        com.github.swiftech.swifttime.Time time63 = time32.increaseMinutes(32769);
        com.github.swiftech.swifttime.Time time65 = new com.github.swiftech.swifttime.Time((long) (-1));
        time65.setLenient(true);
        int int69 = time65.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time70 = time65.increaseDate();
        com.github.swiftech.swifttime.Time time71 = time65.increaseWeek();
        com.github.swiftech.swifttime.Time time73 = new com.github.swiftech.swifttime.Time((long) (-1));
        time73.setLenient(true);
        com.github.swiftech.swifttime.Time time76 = null;
        int int77 = time73.getYearIntervalFrom(time76);
        com.github.swiftech.swifttime.Time time79 = new com.github.swiftech.swifttime.Time((long) (-1));
        time79.setLenient(true);
        com.github.swiftech.swifttime.Time time82 = null;
        int int83 = time79.getYearIntervalFrom(time82);
        int int84 = time73.getHourIntervalTo(time79);
        time73.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        int int92 = time65.getMinuteIntervalTo(time73);
        com.github.swiftech.swifttime.Time time94 = time73.increaseDates((int) (short) 100);
        int int95 = time32.getYearIntervalTo(time94);
        int int96 = time28.getDayIntervalTo(time32);
        com.github.swiftech.swifttime.Time time97 = time32.increaseYear();
        com.github.swiftech.swifttime.Time time99 = time32.increaseDates(604800);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(time21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(time28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1959) + "'", int29 == (-1959));
        org.junit.Assert.assertNotNull(time30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(time37);
        org.junit.Assert.assertNotNull(time38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1030177009) + "'", int59 == (-1030177009));
        org.junit.Assert.assertNotNull(time63);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
        org.junit.Assert.assertNotNull(time70);
        org.junit.Assert.assertNotNull(time71);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1030177009) + "'", int92 == (-1030177009));
        org.junit.Assert.assertNotNull(time94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1959) + "'", int95 == (-1959));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-336) + "'", int96 == (-336));
        org.junit.Assert.assertNotNull(time97);
        org.junit.Assert.assertNotNull(time99);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_TIME_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_MINUS = timeFormatBuilder0;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder2 = timeFormatBuilder0.blank();
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder2);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time1.increaseWeek();
        int int8 = time7.getWeeksInWeekYear();
        com.github.swiftech.swifttime.Time time9 = time7.increaseHour();
        com.github.swiftech.swifttime.Time time10 = time7.clone();
        boolean boolean11 = time10.isWeekDateSupported();
        com.github.swiftech.swifttime.Time time13 = new com.github.swiftech.swifttime.Time((long) (-1));
        time13.setLenient(true);
        time13.add(4, 100);
        time13.setTime(0, (int) (byte) 1, (int) '#');
        int int23 = time13.getDate();
        com.github.swiftech.swifttime.Time time24 = time13.truncateAtHour();
        com.github.swiftech.swifttime.Time time25 = time24.truncateAtSecond();
        int int26 = time10.getWeekIntervalFrom(time24);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(time9);
        org.junit.Assert.assertNotNull(time10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(time24);
        org.junit.Assert.assertNotNull(time25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 102786 + "'", int26 == 102786);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time1.increaseWeek();
        int int8 = time7.getWeeksInWeekYear();
        com.github.swiftech.swifttime.Time time9 = time7.increaseHour();
        com.github.swiftech.swifttime.Time time10 = time7.clone();
        time7.set(4, 1970, 487564929);
        com.github.swiftech.swifttime.Time time15 = time7.truncateAtWeek();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(time9);
        org.junit.Assert.assertNotNull(time10);
        org.junit.Assert.assertNotNull(time15);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int3 = time1.getMinimum(23504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 23504");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        java.time.Instant instant7 = time1.toInstant();
        com.github.swiftech.swifttime.Time time9 = time1.increaseHours(0);
        com.github.swiftech.swifttime.Time time11 = time1.increaseDates((int) (byte) 10);
        int int12 = time1.getYear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(time9);
        org.junit.Assert.assertNotNull(time11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time((long) (-1));
        time5.setLenient(true);
        com.github.swiftech.swifttime.Time time8 = null;
        int int9 = time5.getYearIntervalFrom(time8);
        com.github.swiftech.swifttime.Time time11 = new com.github.swiftech.swifttime.Time((long) (-1));
        time11.setLenient(true);
        com.github.swiftech.swifttime.Time time14 = null;
        int int15 = time11.getYearIntervalFrom(time14);
        int int16 = time5.getHourIntervalTo(time11);
        int int17 = time1.getDayIntervalFrom(time11);
        com.github.swiftech.swifttime.Time time18 = time1.setToFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time19 = time1.increaseYear();
        boolean boolean21 = time1.isSet(9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(time18);
        org.junit.Assert.assertNotNull(time19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        time1.add(4, 100);
        time1.setTime(0, (int) (byte) 1, (int) '#');
        time1.set((int) (byte) 0, (int) (short) 0, 2, (int) '4', 32772);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time1.increaseWeek();
        int int8 = time7.getFirstDayOfWeek();
        com.github.swiftech.swifttime.Time time9 = time7.clone();
        int int10 = time7.getDayOfWeek();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(time9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time1.getMonthIntervalFrom(time21);
        java.lang.String str29 = time1.getCalendarType();
        com.github.swiftech.swifttime.Time time30 = time1.truncateAtHour();
        com.github.swiftech.swifttime.Time time32 = new com.github.swiftech.swifttime.Time((long) (-1));
        time32.setLenient(true);
        com.github.swiftech.swifttime.Time time35 = null;
        int int36 = time32.getYearIntervalFrom(time35);
        int int37 = time1.getMonthIntervalTo(time32);
        com.github.swiftech.swifttime.Time time39 = new com.github.swiftech.swifttime.Time((long) (-1));
        time39.setLenient(true);
        int int43 = time39.getLeastMaximum(4);
        boolean boolean44 = time1.equals((java.lang.Object) time39);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = time39.getMinimum(1202077121);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1202077121");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-23505) + "'", int28 == (-23505));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "gregory" + "'", str29, "gregory");
        org.junit.Assert.assertNotNull(time30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 23504 + "'", int37 == 23504);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(1, (int) 'a', (-1030177009), (int) (byte) 0, 8);
        time5.setTime(14, (-1030177009), 100);
        com.github.swiftech.swifttime.Time time10 = new com.github.swiftech.swifttime.Time((java.util.Calendar) time5);
        time10.clear();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time1.getMonthIntervalFrom(time21);
        time21.clear((int) (byte) 1);
        int int31 = time21.getMinute();
        com.github.swiftech.swifttime.Time time33 = new com.github.swiftech.swifttime.Time((long) (-1));
        time33.setLenient(true);
        int int37 = time33.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time38 = time33.increaseDate();
        com.github.swiftech.swifttime.Time time40 = time33.increaseDates((int) '#');
        int int41 = time21.getWeekIntervalFrom(time40);
        int int42 = time21.getWeeksInWeekYear();
        com.github.swiftech.swifttime.Time time44 = new com.github.swiftech.swifttime.Time((long) (-1));
        time44.setLenient(true);
        com.github.swiftech.swifttime.Time time47 = null;
        int int48 = time44.getYearIntervalFrom(time47);
        com.github.swiftech.swifttime.Time time50 = new com.github.swiftech.swifttime.Time((long) (-1));
        time50.setLenient(true);
        com.github.swiftech.swifttime.Time time53 = null;
        int int54 = time50.getYearIntervalFrom(time53);
        int int55 = time44.getHourIntervalTo(time50);
        time44.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time63 = time44.getFirstDayOfCurrentWeek();
        time44.setFirstDayOfWeek((int) '#');
        com.github.swiftech.swifttime.Time time66 = time44.truncateAtMinute();
        time44.setDate(17);
        int int69 = time21.getMonthIntervalTo(time44);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-23505) + "'", int28 == (-23505));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 59 + "'", int31 == 59);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(time38);
        org.junit.Assert.assertNotNull(time40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-4) + "'", int41 == (-4));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(time63);
        org.junit.Assert.assertNotNull(time66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-23504) + "'", int69 == (-23504));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time1.increaseWeek();
        int int8 = time7.getWeeksInWeekYear();
        com.github.swiftech.swifttime.Time time14 = new com.github.swiftech.swifttime.Time(1, (int) 'a', (-1030177009), (int) (byte) 0, 8);
        time14.setTime(14, (-1030177009), 100);
        com.github.swiftech.swifttime.Time time19 = new com.github.swiftech.swifttime.Time((java.util.Calendar) time14);
        int int20 = time19.getMinute();
        com.github.swiftech.swifttime.Time time26 = new com.github.swiftech.swifttime.Time(10, (int) (short) -1, 11, (-1030177009), 4);
        com.github.swiftech.swifttime.Time time28 = time26.increaseHours((int) (short) 100);
        com.github.swiftech.swifttime.Time time30 = new com.github.swiftech.swifttime.Time((long) (-1));
        time30.setLenient(true);
        int int34 = time30.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time35 = time30.increaseDate();
        com.github.swiftech.swifttime.Time time36 = time30.increaseWeek();
        int int37 = time36.getFirstDayOfWeek();
        int int38 = time28.getSecondIntervalFrom(time36);
        int int39 = time36.getWeekYear();
        int int40 = time19.getSecondIntervalFrom(time36);
        com.github.swiftech.swifttime.Time time41 = time36.getLastDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time43 = new com.github.swiftech.swifttime.Time((long) (-1));
        time43.setLenient(true);
        com.github.swiftech.swifttime.Time time46 = null;
        int int47 = time43.getYearIntervalFrom(time46);
        com.github.swiftech.swifttime.Time time49 = new com.github.swiftech.swifttime.Time((long) (-1));
        time49.setLenient(true);
        com.github.swiftech.swifttime.Time time52 = null;
        int int53 = time49.getYearIntervalFrom(time52);
        int int54 = time43.getHourIntervalTo(time49);
        time43.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time63 = new com.github.swiftech.swifttime.Time((long) (-1));
        time63.setLenient(true);
        int int67 = time63.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time68 = time63.increaseDate();
        com.github.swiftech.swifttime.Time time69 = time63.increaseWeek();
        int int70 = time43.getMonthIntervalFrom(time63);
        java.lang.String str71 = time43.getCalendarType();
        int int72 = time36.getYearIntervalTo(time43);
        int int73 = time7.compareTo((java.util.Calendar) time36);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertNotNull(time28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(time35);
        org.junit.Assert.assertNotNull(time36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 487564929 + "'", int38 == 487564929);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1970 + "'", int39 == 1970);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1202077121 + "'", int40 == 1202077121);
        org.junit.Assert.assertNotNull(time41);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 3 + "'", int67 == 3);
        org.junit.Assert.assertNotNull(time68);
        org.junit.Assert.assertNotNull(time69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-23505) + "'", int70 == (-23505));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "gregory" + "'", str71, "gregory");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1959) + "'", int72 == (-1959));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time1.getMonthIntervalFrom(time21);
        com.github.swiftech.swifttime.Time time29 = time21.truncateAtDate();
        com.github.swiftech.swifttime.Time time31 = new com.github.swiftech.swifttime.Time((long) (-1));
        time31.setLenient(true);
        int int35 = time31.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time36 = time31.increaseDate();
        com.github.swiftech.swifttime.Time time37 = time31.increaseWeek();
        int int38 = time37.getWeeksInWeekYear();
        com.github.swiftech.swifttime.Time time39 = time37.increaseHour();
        boolean boolean40 = time21.before((java.lang.Object) time39);
        com.github.swiftech.swifttime.Time time41 = time21.setToFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time42 = time41.increaseMinute();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-23505) + "'", int28 == (-23505));
        org.junit.Assert.assertNotNull(time29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(time36);
        org.junit.Assert.assertNotNull(time37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertNotNull(time39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(time41);
        org.junit.Assert.assertNotNull(time42);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time1.increaseWeek();
        com.github.swiftech.swifttime.Time time9 = new com.github.swiftech.swifttime.Time((long) (-1));
        time9.setLenient(true);
        com.github.swiftech.swifttime.Time time12 = null;
        int int13 = time9.getYearIntervalFrom(time12);
        com.github.swiftech.swifttime.Time time15 = new com.github.swiftech.swifttime.Time((long) (-1));
        time15.setLenient(true);
        com.github.swiftech.swifttime.Time time18 = null;
        int int19 = time15.getYearIntervalFrom(time18);
        int int20 = time9.getHourIntervalTo(time15);
        time9.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        int int28 = time1.getMinuteIntervalTo(time9);
        time1.setHour(1);
        com.github.swiftech.swifttime.Time time32 = time1.increaseMinutes(32769);
        com.github.swiftech.swifttime.Time time34 = new com.github.swiftech.swifttime.Time((long) (-1));
        time34.setLenient(true);
        int int38 = time34.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time39 = time34.increaseDate();
        com.github.swiftech.swifttime.Time time40 = time34.increaseWeek();
        com.github.swiftech.swifttime.Time time42 = new com.github.swiftech.swifttime.Time((long) (-1));
        time42.setLenient(true);
        com.github.swiftech.swifttime.Time time45 = null;
        int int46 = time42.getYearIntervalFrom(time45);
        com.github.swiftech.swifttime.Time time48 = new com.github.swiftech.swifttime.Time((long) (-1));
        time48.setLenient(true);
        com.github.swiftech.swifttime.Time time51 = null;
        int int52 = time48.getYearIntervalFrom(time51);
        int int53 = time42.getHourIntervalTo(time48);
        time42.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        int int61 = time34.getMinuteIntervalTo(time42);
        com.github.swiftech.swifttime.Time time63 = time42.increaseDates((int) (short) 100);
        int int64 = time1.getYearIntervalTo(time63);
        // The following exception was thrown during execution in test generation
        try {
            int int66 = time63.getActualMinimum((-1030165489));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1030165489");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1030177009) + "'", int28 == (-1030177009));
        org.junit.Assert.assertNotNull(time32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(time39);
        org.junit.Assert.assertNotNull(time40);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1030177009) + "'", int61 == (-1030177009));
        org.junit.Assert.assertNotNull(time63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1959) + "'", int64 == (-1959));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time21 = time1.truncateAtSecond();
        com.github.swiftech.swifttime.Time time23 = new com.github.swiftech.swifttime.Time((long) (-1));
        time23.setLenient(true);
        int int27 = time23.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time28 = time23.increaseDate();
        int int29 = time21.getYearIntervalFrom(time28);
        com.github.swiftech.swifttime.Time time30 = time28.increaseYear();
        com.github.swiftech.swifttime.Time time32 = new com.github.swiftech.swifttime.Time((long) (-1));
        time32.setLenient(true);
        int int36 = time32.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time37 = time32.increaseDate();
        com.github.swiftech.swifttime.Time time38 = time32.increaseWeek();
        com.github.swiftech.swifttime.Time time40 = new com.github.swiftech.swifttime.Time((long) (-1));
        time40.setLenient(true);
        com.github.swiftech.swifttime.Time time43 = null;
        int int44 = time40.getYearIntervalFrom(time43);
        com.github.swiftech.swifttime.Time time46 = new com.github.swiftech.swifttime.Time((long) (-1));
        time46.setLenient(true);
        com.github.swiftech.swifttime.Time time49 = null;
        int int50 = time46.getYearIntervalFrom(time49);
        int int51 = time40.getHourIntervalTo(time46);
        time40.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        int int59 = time32.getMinuteIntervalTo(time40);
        time32.setHour(1);
        com.github.swiftech.swifttime.Time time63 = time32.increaseMinutes(32769);
        com.github.swiftech.swifttime.Time time65 = new com.github.swiftech.swifttime.Time((long) (-1));
        time65.setLenient(true);
        int int69 = time65.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time70 = time65.increaseDate();
        com.github.swiftech.swifttime.Time time71 = time65.increaseWeek();
        com.github.swiftech.swifttime.Time time73 = new com.github.swiftech.swifttime.Time((long) (-1));
        time73.setLenient(true);
        com.github.swiftech.swifttime.Time time76 = null;
        int int77 = time73.getYearIntervalFrom(time76);
        com.github.swiftech.swifttime.Time time79 = new com.github.swiftech.swifttime.Time((long) (-1));
        time79.setLenient(true);
        com.github.swiftech.swifttime.Time time82 = null;
        int int83 = time79.getYearIntervalFrom(time82);
        int int84 = time73.getHourIntervalTo(time79);
        time73.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        int int92 = time65.getMinuteIntervalTo(time73);
        com.github.swiftech.swifttime.Time time94 = time73.increaseDates((int) (short) 100);
        int int95 = time32.getYearIntervalTo(time94);
        int int96 = time28.getDayIntervalTo(time32);
        java.lang.String str97 = time32.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(time21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(time28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1959) + "'", int29 == (-1959));
        org.junit.Assert.assertNotNull(time30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(time37);
        org.junit.Assert.assertNotNull(time38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1030177009) + "'", int59 == (-1030177009));
        org.junit.Assert.assertNotNull(time63);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
        org.junit.Assert.assertNotNull(time70);
        org.junit.Assert.assertNotNull(time71);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1030177009) + "'", int92 == (-1030177009));
        org.junit.Assert.assertNotNull(time94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1959) + "'", int95 == (-1959));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-336) + "'", int96 == (-336));
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "Fri Jan 30 20:08:59 CST 1970" + "'", str97, "Fri Jan 30 20:08:59 CST 1970");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.github.swiftech.swifttime.Time time0 = new com.github.swiftech.swifttime.Time();
        com.github.swiftech.swifttime.Time time1 = time0.truncateAtHour();
        com.github.swiftech.swifttime.Time time3 = new com.github.swiftech.swifttime.Time((long) (-1));
        time3.setLenient(true);
        com.github.swiftech.swifttime.Time time6 = null;
        int int7 = time3.getYearIntervalFrom(time6);
        com.github.swiftech.swifttime.Time time9 = new com.github.swiftech.swifttime.Time((long) (-1));
        time9.setLenient(true);
        com.github.swiftech.swifttime.Time time12 = null;
        int int13 = time9.getYearIntervalFrom(time12);
        int int14 = time3.getHourIntervalTo(time9);
        time3.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time23 = new com.github.swiftech.swifttime.Time((long) (-1));
        time23.setLenient(true);
        int int27 = time23.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time28 = time23.increaseDate();
        com.github.swiftech.swifttime.Time time29 = time23.increaseWeek();
        int int30 = time3.getMonthIntervalFrom(time23);
        com.github.swiftech.swifttime.Time time31 = time23.truncateAtDate();
        com.github.swiftech.swifttime.Time time32 = time23.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time33 = time23.getLastDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time34 = time33.getLastDayOfCurrentWeek();
        int int35 = time1.getMinuteIntervalTo(time33);
        org.junit.Assert.assertNotNull(time1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(time28);
        org.junit.Assert.assertNotNull(time29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-23505) + "'", int30 == (-23505));
        org.junit.Assert.assertNotNull(time31);
        org.junit.Assert.assertNotNull(time32);
        org.junit.Assert.assertNotNull(time33);
        org.junit.Assert.assertNotNull(time34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-28299900) + "'", int35 == (-28299900));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        int int0 = java.util.Calendar.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.github.swiftech.swifttime.Time time0 = new com.github.swiftech.swifttime.Time();
        int int1 = time0.getMonth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time1.getMonthIntervalFrom(time21);
        com.github.swiftech.swifttime.Time time29 = time21.truncateAtDate();
        int int30 = com.github.swiftech.swifttime.Time.getDaysOfMonth(time21);
        time21.setMinute(32770);
        time21.set((int) (byte) 100, (-4), 487564929, (-85846102), (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-23505) + "'", int28 == (-23505));
        org.junit.Assert.assertNotNull(time29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 28 + "'", int30 == 28);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        time1.clear(8);
        com.github.swiftech.swifttime.Time time8 = time1.truncateAtMinute();
        com.github.swiftech.swifttime.Time time9 = time8.increaseYear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(time8);
        org.junit.Assert.assertNotNull(time9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        time1.setFirstDayOfWeek((int) '#');
        com.github.swiftech.swifttime.Time time23 = time1.truncateAtMinute();
        int int24 = time23.getSecond();
        time23.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(time23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time21 = time1.truncateAtSecond();
        com.github.swiftech.swifttime.Time time23 = new com.github.swiftech.swifttime.Time((long) (-1));
        time23.setLenient(true);
        int int27 = time23.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time28 = time23.increaseDate();
        int int29 = time21.getYearIntervalFrom(time28);
        com.github.swiftech.swifttime.Time time30 = time28.increaseYear();
        time28.setHour(52);
        com.github.swiftech.swifttime.Time time34 = new com.github.swiftech.swifttime.Time((long) (-1));
        time34.setLenient(true);
        int int38 = time34.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time39 = time34.increaseDate();
        com.github.swiftech.swifttime.Time time40 = time34.increaseWeek();
        int int41 = time40.getWeeksInWeekYear();
        com.github.swiftech.swifttime.Time time42 = time40.increaseHour();
        boolean boolean43 = time28.after((java.lang.Object) time42);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(time21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(time28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1959) + "'", int29 == (-1959));
        org.junit.Assert.assertNotNull(time30);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(time39);
        org.junit.Assert.assertNotNull(time40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 52 + "'", int41 == 52);
        org.junit.Assert.assertNotNull(time42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time21 = time1.truncateAtSecond();
        com.github.swiftech.swifttime.Time time23 = new com.github.swiftech.swifttime.Time((long) (-1));
        time23.setLenient(true);
        int int27 = time23.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time28 = time23.increaseDate();
        int int29 = time21.getYearIntervalFrom(time28);
        com.github.swiftech.swifttime.Time time30 = time28.increaseYear();
        time28.setFirstDayOfWeek(10);
        int int33 = time28.getMonth();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(time21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(time28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1959) + "'", int29 == (-1959));
        org.junit.Assert.assertNotNull(time30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(1, (int) 'a', (-1030177009), (int) (byte) 0, 8);
        time5.setTime(14, (-1030177009), 100);
        com.github.swiftech.swifttime.Time time10 = new com.github.swiftech.swifttime.Time((java.util.Calendar) time5);
        int int11 = time10.getMinute();
        long long12 = time10.getTimeInMillis();
        com.github.swiftech.swifttime.Time time13 = time10.increaseMinute();
        boolean boolean14 = time10.isRestDay();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-2709221217875520000L) + "'", long12 == (-2709221217875520000L));
        org.junit.Assert.assertNotNull(time13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1698796569430,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Chicago\",offset=-21600000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/Chicago,offset=-21600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2023,MONTH=9,WEEK_OF_YEAR=44,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=304,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=56,SECOND=9,MILLISECOND=430,ZONE_OFFSET=-21600000,DST_OFFSET=3600000]");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_TIME_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder1 = timeFormatBuilder0.month();
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder2 = timeFormatBuilder1.hour();
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder1);
        org.junit.Assert.assertNotNull(timeFormatBuilder2);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_TIME_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_SECOND_MINUS = timeFormatBuilder0;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder2 = timeFormatBuilder0.second();
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder3 = timeFormatBuilder2.hour();
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder4 = timeFormatBuilder2.minute();
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder5 = timeFormatBuilder2.colon();
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder2);
        org.junit.Assert.assertNotNull(timeFormatBuilder3);
        org.junit.Assert.assertNotNull(timeFormatBuilder4);
        org.junit.Assert.assertNotNull(timeFormatBuilder5);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(10, (int) (short) -1, 11, (-1030177009), 4);
        com.github.swiftech.swifttime.Time time7 = time5.increaseHours((int) (short) 100);
        time5.setYear(32770);
        int int10 = time5.getDayOfWeek();
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(1, (int) 'a', (-1030177009), (int) (byte) 0, 8);
        time5.setTime(14, (-1030177009), 100);
        com.github.swiftech.swifttime.Time time10 = new com.github.swiftech.swifttime.Time((java.util.Calendar) time5);
        int int11 = time10.getMinute();
        com.github.swiftech.swifttime.Time time17 = new com.github.swiftech.swifttime.Time(10, (int) (short) -1, 11, (-1030177009), 4);
        com.github.swiftech.swifttime.Time time19 = time17.increaseHours((int) (short) 100);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time27.getFirstDayOfWeek();
        int int29 = time19.getSecondIntervalFrom(time27);
        int int30 = time27.getWeekYear();
        int int31 = time10.getSecondIntervalFrom(time27);
        com.github.swiftech.swifttime.Time time33 = new com.github.swiftech.swifttime.Time((long) (-1));
        time33.setLenient(true);
        com.github.swiftech.swifttime.Time time36 = null;
        int int37 = time33.getYearIntervalFrom(time36);
        com.github.swiftech.swifttime.Time time39 = new com.github.swiftech.swifttime.Time((long) (-1));
        time39.setLenient(true);
        com.github.swiftech.swifttime.Time time42 = null;
        int int43 = time39.getYearIntervalFrom(time42);
        int int44 = time33.getHourIntervalTo(time39);
        com.github.swiftech.swifttime.Time time46 = time33.increaseDates((-1));
        int int47 = time10.getYearIntervalTo(time33);
        com.github.swiftech.swifttime.Time time49 = new com.github.swiftech.swifttime.Time((long) (-1));
        time49.setLenient(true);
        com.github.swiftech.swifttime.Time time52 = null;
        int int53 = time49.getYearIntervalFrom(time52);
        com.github.swiftech.swifttime.Time time55 = new com.github.swiftech.swifttime.Time((long) (-1));
        time55.setLenient(true);
        com.github.swiftech.swifttime.Time time58 = null;
        int int59 = time55.getYearIntervalFrom(time58);
        int int60 = time49.getHourIntervalTo(time55);
        time49.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time68 = time49.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time69 = time49.truncateAtSecond();
        com.github.swiftech.swifttime.Time time71 = new com.github.swiftech.swifttime.Time((long) (-1));
        time71.setLenient(true);
        int int75 = time71.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time76 = time71.increaseDate();
        int int77 = time69.getYearIntervalFrom(time76);
        com.github.swiftech.swifttime.Time time78 = time76.increaseYear();
        com.github.swiftech.swifttime.Time time80 = time78.increaseWeeks((int) 'a');
        int int81 = time33.getMonthIntervalFrom(time78);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(time19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 487564929 + "'", int29 == 487564929);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1202077121 + "'", int31 == 1202077121);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(time46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-85846102) + "'", int47 == (-85846102));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(time68);
        org.junit.Assert.assertNotNull(time69);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 3 + "'", int75 == 3);
        org.junit.Assert.assertNotNull(time76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1959) + "'", int77 == (-1959));
        org.junit.Assert.assertNotNull(time78);
        org.junit.Assert.assertNotNull(time80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-35) + "'", int81 == (-35));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(1, (int) 'a', (-1030177009), (int) (byte) 0, 8);
        time5.setTime(14, (-1030177009), 100);
        com.github.swiftech.swifttime.Time time10 = new com.github.swiftech.swifttime.Time((java.util.Calendar) time5);
        int int11 = time10.getMinute();
        com.github.swiftech.swifttime.Time time17 = new com.github.swiftech.swifttime.Time(10, (int) (short) -1, 11, (-1030177009), 4);
        com.github.swiftech.swifttime.Time time19 = time17.increaseHours((int) (short) 100);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time27.getFirstDayOfWeek();
        int int29 = time19.getSecondIntervalFrom(time27);
        int int30 = time27.getWeekYear();
        int int31 = time10.getSecondIntervalFrom(time27);
        com.github.swiftech.swifttime.Time time32 = time27.getLastDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time33 = time27.truncateAtHour();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(time19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 487564929 + "'", int29 == 487564929);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1202077121 + "'", int31 == 1202077121);
        org.junit.Assert.assertNotNull(time32);
        org.junit.Assert.assertNotNull(time33);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time8 = time1.increaseDates((int) '#');
        com.github.swiftech.swifttime.Time time9 = time1.truncateAtWeek();
        com.github.swiftech.swifttime.Time time11 = new com.github.swiftech.swifttime.Time((long) (-1));
        time11.setLenient(true);
        time11.add(4, 100);
        time11.setTime(0, (int) (byte) 1, (int) '#');
        int int21 = time11.getDate();
        int int23 = time11.getGreatestMinimum((int) (byte) 0);
        int int24 = time1.getWeekIntervalFrom(time11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time8);
        org.junit.Assert.assertNotNull(time9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 102790 + "'", int24 == 102790);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time1.getMonthIntervalFrom(time21);
        com.github.swiftech.swifttime.Time time29 = time21.truncateAtDate();
        com.github.swiftech.swifttime.Time time31 = new com.github.swiftech.swifttime.Time((long) (-1));
        time31.setLenient(true);
        com.github.swiftech.swifttime.Time time34 = null;
        int int35 = time31.getYearIntervalFrom(time34);
        com.github.swiftech.swifttime.Time time37 = new com.github.swiftech.swifttime.Time((long) (-1));
        time37.setLenient(true);
        com.github.swiftech.swifttime.Time time40 = null;
        int int41 = time37.getYearIntervalFrom(time40);
        int int42 = time31.getHourIntervalTo(time37);
        com.github.swiftech.swifttime.Time time44 = time31.increaseDates((-1));
        int int45 = time21.getMonthIntervalFrom(time44);
        time44.setLenient(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-23505) + "'", int28 == (-23505));
        org.junit.Assert.assertNotNull(time29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(time44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time((long) (-1));
        time5.setLenient(true);
        com.github.swiftech.swifttime.Time time8 = null;
        int int9 = time5.getYearIntervalFrom(time8);
        com.github.swiftech.swifttime.Time time11 = new com.github.swiftech.swifttime.Time((long) (-1));
        time11.setLenient(true);
        com.github.swiftech.swifttime.Time time14 = null;
        int int15 = time11.getYearIntervalFrom(time14);
        int int16 = time5.getHourIntervalTo(time11);
        int int17 = time1.getDayIntervalFrom(time11);
        time1.setMinute(5);
        java.time.ZonedDateTime zonedDateTime20 = time1.toZonedDateTime();
        time1.setDate(1202077121);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(zonedDateTime20);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        time1.setFirstDayOfWeek((int) (byte) 100);
        time1.setWeekDate((int) (byte) 0, 23504, 2);
        com.github.swiftech.swifttime.Time time13 = new com.github.swiftech.swifttime.Time((long) (-1));
        time13.setLenient(true);
        com.github.swiftech.swifttime.Time time16 = null;
        int int17 = time13.getYearIntervalFrom(time16);
        com.github.swiftech.swifttime.Time time19 = new com.github.swiftech.swifttime.Time((long) (-1));
        time19.setLenient(true);
        com.github.swiftech.swifttime.Time time22 = null;
        int int23 = time19.getYearIntervalFrom(time22);
        int int24 = time13.getHourIntervalTo(time19);
        time13.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time32 = time13.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time33 = time13.truncateAtSecond();
        com.github.swiftech.swifttime.Time time35 = new com.github.swiftech.swifttime.Time((long) (-1));
        time35.setLenient(true);
        int int39 = time35.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time40 = time35.increaseDate();
        int int41 = time33.getYearIntervalFrom(time40);
        com.github.swiftech.swifttime.Time time42 = time40.increaseYear();
        com.github.swiftech.swifttime.Time time44 = time42.increaseWeeks((int) 'a');
        boolean boolean45 = time42.isWeekDateSupported();
        int int46 = time1.getYearIntervalFrom(time42);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(time32);
        org.junit.Assert.assertNotNull(time33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(time40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1959) + "'", int41 == (-1959));
        org.junit.Assert.assertNotNull(time42);
        org.junit.Assert.assertNotNull(time44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1522) + "'", int46 == (-1522));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        boolean boolean3 = time1.before((java.lang.Object) false);
        java.lang.String str4 = time1.getCalendarType();
        com.github.swiftech.swifttime.Time time6 = time1.increaseWeeks(0);
        com.github.swiftech.swifttime.Time time7 = time6.truncateAtYear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gregory" + "'", str4, "gregory");
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(10, (int) (short) -1, 11, (-1030177009), 4);
        com.github.swiftech.swifttime.Time time7 = time5.increaseHours((int) (short) 100);
        time5.setYear(32770);
        com.github.swiftech.swifttime.Time time11 = time5.increaseYears((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = time5.getMaximum((-1030165489));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1030165489");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertNotNull(time11);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        java.util.TimeZone timeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time(timeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        int int0 = java.util.Calendar.PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time1.increaseWeek();
        com.github.swiftech.swifttime.Time time9 = new com.github.swiftech.swifttime.Time((long) (-1));
        time9.setLenient(true);
        com.github.swiftech.swifttime.Time time12 = null;
        int int13 = time9.getYearIntervalFrom(time12);
        com.github.swiftech.swifttime.Time time15 = new com.github.swiftech.swifttime.Time((long) (-1));
        time15.setLenient(true);
        com.github.swiftech.swifttime.Time time18 = null;
        int int19 = time15.getYearIntervalFrom(time18);
        int int20 = time9.getHourIntervalTo(time15);
        time9.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        int int28 = time1.getMinuteIntervalTo(time9);
        com.github.swiftech.swifttime.Time time30 = new com.github.swiftech.swifttime.Time((long) (-1));
        time30.setLenient(true);
        com.github.swiftech.swifttime.Time time33 = null;
        int int34 = time30.getYearIntervalFrom(time33);
        com.github.swiftech.swifttime.Time time35 = time30.increaseDate();
        int int36 = time1.getSecondIntervalFrom(time30);
        int int38 = time1.get(7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1030177009) + "'", int28 == (-1030177009));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(time35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 604800 + "'", int36 == 604800);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(1, (int) 'a', (-1030177009), (int) (byte) 0, 8);
        time5.setTime(14, (-1030177009), 100);
        com.github.swiftech.swifttime.Time time10 = new com.github.swiftech.swifttime.Time((java.util.Calendar) time5);
        int int11 = time10.getMinute();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = time10.isSet((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(10, (int) (short) -1, 11, (-1030177009), 4);
        com.github.swiftech.swifttime.Time time7 = time5.increaseHours((int) (short) 100);
        com.github.swiftech.swifttime.Time time9 = new com.github.swiftech.swifttime.Time((long) (-1));
        time9.setLenient(true);
        int int13 = time9.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time14 = time9.increaseDate();
        com.github.swiftech.swifttime.Time time15 = time9.increaseWeek();
        int int16 = time15.getSecond();
        int int17 = time5.getDayIntervalTo(time15);
        com.github.swiftech.swifttime.Time time19 = time5.increaseYears(102790);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(time14);
        org.junit.Assert.assertNotNull(time15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 59 + "'", int16 == 59);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 43639973 + "'", int17 == 43639973);
        org.junit.Assert.assertNotNull(time19);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time1.getMonthIntervalFrom(time21);
        com.github.swiftech.swifttime.Time time29 = time21.truncateAtDate();
        com.github.swiftech.swifttime.Time time31 = new com.github.swiftech.swifttime.Time((long) (-1));
        time31.setLenient(true);
        com.github.swiftech.swifttime.Time time34 = null;
        int int35 = time31.getYearIntervalFrom(time34);
        com.github.swiftech.swifttime.Time time37 = new com.github.swiftech.swifttime.Time((long) (-1));
        time37.setLenient(true);
        com.github.swiftech.swifttime.Time time40 = null;
        int int41 = time37.getYearIntervalFrom(time40);
        int int42 = time31.getHourIntervalTo(time37);
        com.github.swiftech.swifttime.Time time44 = time31.increaseDates((-1));
        int int45 = time21.getMonthIntervalFrom(time44);
        com.github.swiftech.swifttime.Time time47 = new com.github.swiftech.swifttime.Time((long) (-1));
        time47.setLenient(true);
        int int51 = time47.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time52 = time47.increaseDate();
        com.github.swiftech.swifttime.Time time53 = time47.increaseWeek();
        int int54 = time53.getFirstDayOfWeek();
        int int55 = time44.getDayIntervalFrom(time53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-23505) + "'", int28 == (-23505));
        org.junit.Assert.assertNotNull(time29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(time44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertNotNull(time52);
        org.junit.Assert.assertNotNull(time53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-9) + "'", int55 == (-9));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.github.swiftech.swifttime.Time time6 = new com.github.swiftech.swifttime.Time((int) (short) 0, (-35), 9, (int) (byte) -1, (int) '#', 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        time1.setFirstDayOfWeek((int) (byte) 100);
        boolean boolean8 = time1.isWorkingDay();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time1.increaseWeek();
        int int8 = time7.getFirstDayOfWeek();
        com.github.swiftech.swifttime.Time time9 = time7.truncateAtMinute();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(time9);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time1.increaseWeek();
        com.github.swiftech.swifttime.Time time9 = new com.github.swiftech.swifttime.Time((long) (-1));
        time9.setLenient(true);
        com.github.swiftech.swifttime.Time time12 = null;
        int int13 = time9.getYearIntervalFrom(time12);
        com.github.swiftech.swifttime.Time time15 = new com.github.swiftech.swifttime.Time((long) (-1));
        time15.setLenient(true);
        com.github.swiftech.swifttime.Time time18 = null;
        int int19 = time15.getYearIntervalFrom(time18);
        int int20 = time9.getHourIntervalTo(time15);
        time9.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        int int28 = time1.getMinuteIntervalTo(time9);
        time1.setHour(1);
        time1.setDate(32772);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1030177009) + "'", int28 == (-1030177009));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        int int0 = java.util.Calendar.LONG_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        com.github.swiftech.swifttime.Time time2 = time1.clone();
        org.junit.Assert.assertNotNull(time2);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_SECOND_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder1 = timeFormatBuilder0.underscore();
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder2 = timeFormatBuilder0.colon();
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder1);
        org.junit.Assert.assertNotNull(timeFormatBuilder2);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(10, (int) (short) -1, 11, (-1030177009), 4);
        com.github.swiftech.swifttime.Time time7 = time5.increaseHours((int) (short) 100);
        com.github.swiftech.swifttime.Time time8 = time5.setToFirstDayOfCurrentWeek();
        time8.roll((int) (byte) 10, 8);
        com.github.swiftech.swifttime.Time time12 = time8.clone();
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertNotNull(time8);
        org.junit.Assert.assertNotNull(time12);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        int int0 = java.util.Calendar.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time8 = time1.increaseDates((int) '#');
        time1.setTime(0, 23504, 4);
        time1.set((-28299900), (-35), (int) (byte) 10, 2, 12);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time8);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        int int0 = java.util.Calendar.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        int int0 = java.util.Calendar.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time21 = time1.truncateAtSecond();
        com.github.swiftech.swifttime.Time time23 = new com.github.swiftech.swifttime.Time((long) (-1));
        time23.setLenient(true);
        int int27 = time23.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time28 = time23.increaseDate();
        int int29 = time21.getYearIntervalFrom(time28);
        com.github.swiftech.swifttime.Time time30 = time28.increaseYear();
        com.github.swiftech.swifttime.Time time32 = new com.github.swiftech.swifttime.Time((long) (-1));
        time32.setLenient(true);
        com.github.swiftech.swifttime.Time time35 = null;
        int int36 = time32.getYearIntervalFrom(time35);
        com.github.swiftech.swifttime.Time time38 = new com.github.swiftech.swifttime.Time((long) (-1));
        time38.setLenient(true);
        com.github.swiftech.swifttime.Time time41 = null;
        int int42 = time38.getYearIntervalFrom(time41);
        int int43 = time32.getHourIntervalTo(time38);
        time32.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time51 = time32.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time52 = time32.truncateAtSecond();
        com.github.swiftech.swifttime.Time time54 = new com.github.swiftech.swifttime.Time((long) (-1));
        time54.setLenient(true);
        int int58 = time54.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time59 = time54.increaseDate();
        int int60 = time52.getYearIntervalFrom(time59);
        com.github.swiftech.swifttime.Time time62 = time52.increaseSeconds((int) '#');
        int int63 = time30.getWeekIntervalFrom(time52);
        com.github.swiftech.swifttime.Time time64 = time52.truncateAtMonth();
        com.github.swiftech.swifttime.Time time66 = new com.github.swiftech.swifttime.Time((long) (-1));
        time66.setLenient(true);
        int int70 = time66.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time71 = time66.increaseDate();
        com.github.swiftech.swifttime.Time time72 = time66.increaseWeek();
        com.github.swiftech.swifttime.Time time74 = new com.github.swiftech.swifttime.Time((long) (-1));
        time74.setLenient(true);
        com.github.swiftech.swifttime.Time time77 = null;
        int int78 = time74.getYearIntervalFrom(time77);
        com.github.swiftech.swifttime.Time time80 = new com.github.swiftech.swifttime.Time((long) (-1));
        time80.setLenient(true);
        com.github.swiftech.swifttime.Time time83 = null;
        int int84 = time80.getYearIntervalFrom(time83);
        int int85 = time74.getHourIntervalTo(time80);
        time74.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        int int93 = time66.getMinuteIntervalTo(time74);
        com.github.swiftech.swifttime.Time time95 = time74.increaseDates((int) (short) 100);
        int int96 = time52.getHourIntervalFrom(time74);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(time21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(time28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1959) + "'", int29 == (-1959));
        org.junit.Assert.assertNotNull(time30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(time51);
        org.junit.Assert.assertNotNull(time52);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertNotNull(time59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1959) + "'", int60 == (-1959));
        org.junit.Assert.assertNotNull(time62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 102251 + "'", int63 == 102251);
        org.junit.Assert.assertNotNull(time64);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 3 + "'", int70 == 3);
        org.junit.Assert.assertNotNull(time71);
        org.junit.Assert.assertNotNull(time72);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1030177009) + "'", int93 == (-1030177009));
        org.junit.Assert.assertNotNull(time95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-3097) + "'", int96 == (-3097));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(1, (int) 'a', (-1030177009), (int) (byte) 0, 8);
        time5.setTime(14, (-1030177009), 100);
        com.github.swiftech.swifttime.Time time10 = new com.github.swiftech.swifttime.Time((java.util.Calendar) time5);
        int int11 = time10.getMinute();
        long long12 = time10.getTimeInMillis();
        com.github.swiftech.swifttime.Time time13 = time10.increaseMinute();
        time13.setTimeInMillis((long) 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-2709221217875520000L) + "'", long12 == (-2709221217875520000L));
        org.junit.Assert.assertNotNull(time13);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_TIME_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_MINUS = timeFormatBuilder0;
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_SECOND_MINUS = timeFormatBuilder0;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder3 = timeFormatBuilder0.colon();
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder3);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        time1.add(4, 100);
        int int7 = time1.getMonth();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = time1.getActualMinimum(174);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 174");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time((-23505), 32769, 1202077121, 0, (int) '4');
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(1, (int) 'a', (-1030177009), (int) (byte) 0, 8);
        time5.setTime(14, (-1030177009), 100);
        com.github.swiftech.swifttime.Time time10 = new com.github.swiftech.swifttime.Time((java.util.Calendar) time5);
        com.github.swiftech.swifttime.Time time11 = time10.truncateAtMonth();
        org.junit.Assert.assertNotNull(time11);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time21 = time1.truncateAtSecond();
        time1.setTime((-23505), 32770, (-9));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(time21);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time21 = time1.truncateAtSecond();
        time21.set(14, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            time21.roll((int) (byte) 100, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(time21);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_TIME_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_MINUS = timeFormatBuilder0;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder2 = timeFormatBuilder0.second();
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_TIME_MINUS = timeFormatBuilder0;
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_MINUS = timeFormatBuilder0;
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder2);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time1.increaseWeek();
        com.github.swiftech.swifttime.Time time9 = new com.github.swiftech.swifttime.Time((long) (-1));
        time9.setLenient(true);
        com.github.swiftech.swifttime.Time time12 = null;
        int int13 = time9.getYearIntervalFrom(time12);
        com.github.swiftech.swifttime.Time time15 = new com.github.swiftech.swifttime.Time((long) (-1));
        time15.setLenient(true);
        com.github.swiftech.swifttime.Time time18 = null;
        int int19 = time15.getYearIntervalFrom(time18);
        int int20 = time9.getHourIntervalTo(time15);
        time9.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        int int28 = time1.getMinuteIntervalTo(time9);
        com.github.swiftech.swifttime.Time time30 = time9.increaseDates((int) (short) 100);
        time30.setHour(100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1030177009) + "'", int28 == (-1030177009));
        org.junit.Assert.assertNotNull(time30);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time21 = time1.truncateAtSecond();
        com.github.swiftech.swifttime.Time time23 = new com.github.swiftech.swifttime.Time((long) (-1));
        time23.setLenient(true);
        int int27 = time23.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time28 = time23.increaseDate();
        int int29 = time21.getYearIntervalFrom(time28);
        com.github.swiftech.swifttime.Time time30 = time28.increaseYear();
        com.github.swiftech.swifttime.Time time32 = new com.github.swiftech.swifttime.Time((long) (-1));
        time32.setLenient(true);
        int int36 = time32.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time37 = time32.increaseDate();
        com.github.swiftech.swifttime.Time time38 = time32.increaseWeek();
        com.github.swiftech.swifttime.Time time40 = new com.github.swiftech.swifttime.Time((long) (-1));
        time40.setLenient(true);
        com.github.swiftech.swifttime.Time time43 = null;
        int int44 = time40.getYearIntervalFrom(time43);
        com.github.swiftech.swifttime.Time time46 = new com.github.swiftech.swifttime.Time((long) (-1));
        time46.setLenient(true);
        com.github.swiftech.swifttime.Time time49 = null;
        int int50 = time46.getYearIntervalFrom(time49);
        int int51 = time40.getHourIntervalTo(time46);
        time40.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        int int59 = time32.getMinuteIntervalTo(time40);
        time32.setHour(1);
        com.github.swiftech.swifttime.Time time63 = time32.increaseMinutes(32769);
        com.github.swiftech.swifttime.Time time65 = new com.github.swiftech.swifttime.Time((long) (-1));
        time65.setLenient(true);
        int int69 = time65.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time70 = time65.increaseDate();
        com.github.swiftech.swifttime.Time time71 = time65.increaseWeek();
        com.github.swiftech.swifttime.Time time73 = new com.github.swiftech.swifttime.Time((long) (-1));
        time73.setLenient(true);
        com.github.swiftech.swifttime.Time time76 = null;
        int int77 = time73.getYearIntervalFrom(time76);
        com.github.swiftech.swifttime.Time time79 = new com.github.swiftech.swifttime.Time((long) (-1));
        time79.setLenient(true);
        com.github.swiftech.swifttime.Time time82 = null;
        int int83 = time79.getYearIntervalFrom(time82);
        int int84 = time73.getHourIntervalTo(time79);
        time73.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        int int92 = time65.getMinuteIntervalTo(time73);
        com.github.swiftech.swifttime.Time time94 = time73.increaseDates((int) (short) 100);
        int int95 = time32.getYearIntervalTo(time94);
        int int96 = time28.getDayIntervalTo(time32);
        com.github.swiftech.swifttime.Time time97 = time32.increaseYear();
        com.github.swiftech.swifttime.Time time98 = time97.increaseMinute();
        java.util.Date date99 = time97.getTime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(time21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(time28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1959) + "'", int29 == (-1959));
        org.junit.Assert.assertNotNull(time30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(time37);
        org.junit.Assert.assertNotNull(time38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1030177009) + "'", int59 == (-1030177009));
        org.junit.Assert.assertNotNull(time63);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
        org.junit.Assert.assertNotNull(time70);
        org.junit.Assert.assertNotNull(time71);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1030177009) + "'", int92 == (-1030177009));
        org.junit.Assert.assertNotNull(time94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1959) + "'", int95 == (-1959));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-336) + "'", int96 == (-336));
        org.junit.Assert.assertNotNull(time97);
        org.junit.Assert.assertNotNull(time98);
        org.junit.Assert.assertNotNull(date99);
        org.junit.Assert.assertEquals(date99.toString(), "Sat Jan 30 20:09:59 CST 1971");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        java.time.Instant instant7 = time1.toInstant();
        com.github.swiftech.swifttime.Time time9 = time1.increaseHours(0);
        time9.setHour((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(time9);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time21 = time1.truncateAtSecond();
        com.github.swiftech.swifttime.Time time23 = new com.github.swiftech.swifttime.Time((long) (-1));
        time23.setLenient(true);
        int int27 = time23.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time28 = time23.increaseDate();
        int int29 = time21.getYearIntervalFrom(time28);
        com.github.swiftech.swifttime.Time time30 = time28.increaseYear();
        com.github.swiftech.swifttime.Time time32 = time30.increaseWeeks((int) 'a');
        com.github.swiftech.swifttime.Time time33 = time32.increaseDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(time21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(time28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1959) + "'", int29 == (-1959));
        org.junit.Assert.assertNotNull(time30);
        org.junit.Assert.assertNotNull(time32);
        org.junit.Assert.assertNotNull(time33);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        java.util.Date date21 = time20.getTime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sun Apr 26 01:10:05 CST 11");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_SECOND_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder1 = timeFormatBuilder0.minus();
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder2 = timeFormatBuilder1.year();
        java.lang.String str4 = timeFormatBuilder2.format((long) (-336));
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder1);
        org.junit.Assert.assertNotNull(timeFormatBuilder2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969-12-31 17:5931-59- 59125917125959_59171259:59:-3112591759-1259:17 1217591759:59_59-19691259:1712_::5912591969-12-31 18:0031-01- 01120118120001_01181200:01:-31-1969" + "'", str4, "1969-12-31 17:5931-59- 59125917125959_59171259:59:-3112591759-1259:17 1217591759:59_59-19691259:1712_::5912591969-12-31 18:0031-01- 01120118120001_01181200:01:-31-1969");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.github.swiftech.swifttime.Time time0 = new com.github.swiftech.swifttime.Time();
        com.github.swiftech.swifttime.Time time1 = time0.truncateAtHour();
        // The following exception was thrown during execution in test generation
        try {
            time1.add((int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(time1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        time1.setFirstDayOfWeek((int) '#');
        com.github.swiftech.swifttime.Time time23 = time1.truncateAtMinute();
        com.github.swiftech.swifttime.Time time24 = time1.increaseSecond();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(time23);
        org.junit.Assert.assertNotNull(time24);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        time1.setFirstDayOfWeek((int) '#');
        com.github.swiftech.swifttime.Time time23 = time1.truncateAtMinute();
        time1.setDate(17);
        int int26 = time1.getMinimalDaysInFirstWeek();
        int int27 = time1.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(time23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 17 + "'", int27 == 17);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_TIME_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_MINUS = timeFormatBuilder0;
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_SECOND_MINUS = timeFormatBuilder0;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder3 = timeFormatBuilder0.second();
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder3);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        com.github.swiftech.swifttime.Time time14 = time1.increaseDates((-1));
        com.github.swiftech.swifttime.Time time16 = new com.github.swiftech.swifttime.Time((long) (-1));
        time16.setLenient(true);
        com.github.swiftech.swifttime.Time time19 = null;
        int int20 = time16.getYearIntervalFrom(time19);
        com.github.swiftech.swifttime.Time time22 = new com.github.swiftech.swifttime.Time((long) (-1));
        time22.setLenient(true);
        com.github.swiftech.swifttime.Time time25 = null;
        int int26 = time22.getYearIntervalFrom(time25);
        int int27 = time16.getHourIntervalTo(time22);
        time16.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time35 = time16.getFirstDayOfCurrentWeek();
        time16.setFirstDayOfWeek((int) '#');
        com.github.swiftech.swifttime.Time time38 = time16.truncateAtMinute();
        int int40 = time16.getMaximum((int) (short) 0);
        com.github.swiftech.swifttime.Time time41 = time16.truncateAtMonth();
        int int42 = time14.getMinuteIntervalTo(time41);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(time35);
        org.junit.Assert.assertNotNull(time38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(time41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1030162679) + "'", int42 == (-1030162679));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(10, (int) (short) -1, 11, (-1030177009), 4);
        time5.roll(14, true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time((long) (-1));
        time5.setLenient(true);
        com.github.swiftech.swifttime.Time time8 = null;
        int int9 = time5.getYearIntervalFrom(time8);
        com.github.swiftech.swifttime.Time time11 = new com.github.swiftech.swifttime.Time((long) (-1));
        time11.setLenient(true);
        com.github.swiftech.swifttime.Time time14 = null;
        int int15 = time11.getYearIntervalFrom(time14);
        int int16 = time5.getHourIntervalTo(time11);
        int int17 = time1.getDayIntervalFrom(time11);
        com.github.swiftech.swifttime.Time time18 = time1.setToFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time19 = time1.increaseYear();
        com.github.swiftech.swifttime.Time time25 = new com.github.swiftech.swifttime.Time(10, (int) (short) -1, 11, (-1030177009), 4);
        com.github.swiftech.swifttime.Time time27 = time25.increaseHours((int) (short) 100);
        com.github.swiftech.swifttime.Time time28 = time25.setToFirstDayOfCurrentWeek();
        int int29 = time19.getDayIntervalTo(time28);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(time18);
        org.junit.Assert.assertNotNull(time19);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertNotNull(time28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-43640332) + "'", int29 == (-43640332));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time1.getMonthIntervalFrom(time21);
        java.lang.String str29 = time1.getCalendarType();
        boolean boolean30 = time1.isWeekDateSupported();
        com.github.swiftech.swifttime.Time time31 = time1.setToLastDayOfCurrentWeek();
        java.util.Locale locale34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap35 = time1.getDisplayNames((-2034566656), 16, locale34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-23505) + "'", int28 == (-23505));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "gregory" + "'", str29, "gregory");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(time31);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        boolean boolean7 = time1.isWorkingDay();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(1, (int) 'a', (-1030177009), (int) (byte) 0, 8);
        time5.setTime(14, (-1030177009), 100);
        com.github.swiftech.swifttime.Time time10 = new com.github.swiftech.swifttime.Time((java.util.Calendar) time5);
        com.github.swiftech.swifttime.Time time11 = time5.increaseWeek();
        com.github.swiftech.swifttime.Time time13 = time5.increaseSeconds(10);
        org.junit.Assert.assertNotNull(time11);
        org.junit.Assert.assertNotNull(time13);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time1.getMonthIntervalFrom(time21);
        com.github.swiftech.swifttime.Time time29 = time21.truncateAtDate();
        com.github.swiftech.swifttime.Time time30 = time21.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time31 = time21.getLastDayOfCurrentWeek();
        int int32 = time21.getDayOfWeek();
        com.github.swiftech.swifttime.Time time34 = time21.increaseSeconds((-23505));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-23505) + "'", int28 == (-23505));
        org.junit.Assert.assertNotNull(time29);
        org.junit.Assert.assertNotNull(time30);
        org.junit.Assert.assertNotNull(time31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertNotNull(time34);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time1.increaseWeek();
        int int8 = time7.getWeeksInWeekYear();
        com.github.swiftech.swifttime.Time time9 = time7.increaseHour();
        com.github.swiftech.swifttime.Time time10 = time7.increaseWeek();
        com.github.swiftech.swifttime.Time time12 = time10.increaseMinutes((-4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(time9);
        org.junit.Assert.assertNotNull(time10);
        org.junit.Assert.assertNotNull(time12);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.github.swiftech.swifttime.Time time4 = new com.github.swiftech.swifttime.Time(1, 12, (-1030165489), 23504);
        // The following exception was thrown during execution in test generation
        try {
            time4.roll(15, 23504);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(1, (int) 'a', (-1030177009), (int) (byte) 0, 8);
        time5.setTime(14, (-1030177009), 100);
        com.github.swiftech.swifttime.Time time10 = new com.github.swiftech.swifttime.Time((java.util.Calendar) time5);
        time10.setHour(1202077121);
        com.github.swiftech.swifttime.Time time14 = new com.github.swiftech.swifttime.Time((long) (-1));
        time14.setLenient(true);
        com.github.swiftech.swifttime.Time time17 = null;
        int int18 = time14.getYearIntervalFrom(time17);
        com.github.swiftech.swifttime.Time time20 = new com.github.swiftech.swifttime.Time((long) (-1));
        time20.setLenient(true);
        com.github.swiftech.swifttime.Time time23 = null;
        int int24 = time20.getYearIntervalFrom(time23);
        int int25 = time14.getHourIntervalTo(time20);
        time14.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time33 = time14.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time34 = time14.truncateAtSecond();
        com.github.swiftech.swifttime.Time time36 = new com.github.swiftech.swifttime.Time((long) (-1));
        time36.setLenient(true);
        int int40 = time36.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time41 = time36.increaseDate();
        int int42 = time34.getYearIntervalFrom(time41);
        com.github.swiftech.swifttime.Time time43 = time41.increaseYear();
        time41.setHour(52);
        int int46 = time10.getSecondIntervalFrom(time41);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(time33);
        org.junit.Assert.assertNotNull(time34);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertNotNull(time41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1959) + "'", int42 == (-1959));
        org.junit.Assert.assertNotNull(time43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-678378847) + "'", int46 == (-678378847));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        time1.add(4, 100);
        time1.setTime(0, (int) (byte) 1, (int) '#');
        int int11 = time1.getDate();
        com.github.swiftech.swifttime.Time time12 = time1.truncateAtHour();
        time1.setHour((-1030165489));
        com.github.swiftech.swifttime.Time time15 = time1.increaseYear();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(time12);
        org.junit.Assert.assertNotNull(time15);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time21 = time1.truncateAtSecond();
        com.github.swiftech.swifttime.Time time23 = new com.github.swiftech.swifttime.Time((long) (-1));
        time23.setLenient(true);
        int int27 = time23.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time28 = time23.increaseDate();
        int int29 = time21.getYearIntervalFrom(time28);
        com.github.swiftech.swifttime.Time time30 = time28.increaseYear();
        com.github.swiftech.swifttime.Time time32 = new com.github.swiftech.swifttime.Time((long) (-1));
        time32.setLenient(true);
        int int36 = time32.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time37 = time32.increaseDate();
        com.github.swiftech.swifttime.Time time38 = time32.increaseWeek();
        com.github.swiftech.swifttime.Time time40 = new com.github.swiftech.swifttime.Time((long) (-1));
        time40.setLenient(true);
        com.github.swiftech.swifttime.Time time43 = null;
        int int44 = time40.getYearIntervalFrom(time43);
        com.github.swiftech.swifttime.Time time46 = new com.github.swiftech.swifttime.Time((long) (-1));
        time46.setLenient(true);
        com.github.swiftech.swifttime.Time time49 = null;
        int int50 = time46.getYearIntervalFrom(time49);
        int int51 = time40.getHourIntervalTo(time46);
        time40.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        int int59 = time32.getMinuteIntervalTo(time40);
        time32.setHour(1);
        com.github.swiftech.swifttime.Time time63 = time32.increaseMinutes(32769);
        com.github.swiftech.swifttime.Time time65 = new com.github.swiftech.swifttime.Time((long) (-1));
        time65.setLenient(true);
        int int69 = time65.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time70 = time65.increaseDate();
        com.github.swiftech.swifttime.Time time71 = time65.increaseWeek();
        com.github.swiftech.swifttime.Time time73 = new com.github.swiftech.swifttime.Time((long) (-1));
        time73.setLenient(true);
        com.github.swiftech.swifttime.Time time76 = null;
        int int77 = time73.getYearIntervalFrom(time76);
        com.github.swiftech.swifttime.Time time79 = new com.github.swiftech.swifttime.Time((long) (-1));
        time79.setLenient(true);
        com.github.swiftech.swifttime.Time time82 = null;
        int int83 = time79.getYearIntervalFrom(time82);
        int int84 = time73.getHourIntervalTo(time79);
        time73.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        int int92 = time65.getMinuteIntervalTo(time73);
        com.github.swiftech.swifttime.Time time94 = time73.increaseDates((int) (short) 100);
        int int95 = time32.getYearIntervalTo(time94);
        int int96 = time28.getDayIntervalTo(time32);
        com.github.swiftech.swifttime.Time time97 = time32.getFirstDayOfCurrentWeek();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(time21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(time28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1959) + "'", int29 == (-1959));
        org.junit.Assert.assertNotNull(time30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(time37);
        org.junit.Assert.assertNotNull(time38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1030177009) + "'", int59 == (-1030177009));
        org.junit.Assert.assertNotNull(time63);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
        org.junit.Assert.assertNotNull(time70);
        org.junit.Assert.assertNotNull(time71);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1030177009) + "'", int92 == (-1030177009));
        org.junit.Assert.assertNotNull(time94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1959) + "'", int95 == (-1959));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-336) + "'", int96 == (-336));
        org.junit.Assert.assertNotNull(time97);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(10, (int) (short) -1, 11, (-1030177009), 4);
        time5.setHour(3);
        time5.setTime(102790, 0, 487564929, 0, (int) 'a', (-1030177009));
        time5.setMinimalDaysInFirstWeek(0);
        // The following exception was thrown during execution in test generation
        try {
            time5.roll((-43640332), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(1, (int) 'a', (-1030177009), (int) (byte) 0, 8);
        time5.setTime(14, (-1030177009), 100);
        com.github.swiftech.swifttime.Time time10 = new com.github.swiftech.swifttime.Time((java.util.Calendar) time5);
        java.util.TimeZone timeZone11 = time5.getTimeZone();
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Central Standard Time");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(1, (int) 'a', (-1030177009), (int) (byte) 0, 8);
        time5.setTime(14, (-1030177009), 100);
        com.github.swiftech.swifttime.Time time10 = new com.github.swiftech.swifttime.Time((java.util.Calendar) time5);
        com.github.swiftech.swifttime.Time time11 = time5.increaseWeek();
        time11.setLenient(false);
        org.junit.Assert.assertNotNull(time11);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        time1.setFirstDayOfWeek((int) '#');
        com.github.swiftech.swifttime.Time time23 = time1.truncateAtMinute();
        int int25 = time1.getMaximum((int) (short) 0);
        com.github.swiftech.swifttime.Time time27 = new com.github.swiftech.swifttime.Time((long) (-1));
        time27.setLenient(true);
        com.github.swiftech.swifttime.Time time30 = null;
        int int31 = time27.getYearIntervalFrom(time30);
        com.github.swiftech.swifttime.Time time33 = new com.github.swiftech.swifttime.Time((long) (-1));
        time33.setLenient(true);
        com.github.swiftech.swifttime.Time time36 = null;
        int int37 = time33.getYearIntervalFrom(time36);
        int int38 = time27.getHourIntervalTo(time33);
        time27.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time47 = new com.github.swiftech.swifttime.Time((long) (-1));
        time47.setLenient(true);
        int int51 = time47.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time52 = time47.increaseDate();
        com.github.swiftech.swifttime.Time time53 = time47.increaseWeek();
        int int54 = time27.getMonthIntervalFrom(time47);
        time47.clear((int) (byte) 1);
        int int57 = time1.getSecondIntervalTo(time47);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(time23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertNotNull(time52);
        org.junit.Assert.assertNotNull(time53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-23505) + "'", int54 == (-23505));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1681078455 + "'", int57 == 1681078455);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        time1.add(4, 100);
        time1.setTime(0, (int) (byte) 1, (int) '#');
        long long11 = time1.getTimeInMillis();
        com.github.swiftech.swifttime.Time time13 = new com.github.swiftech.swifttime.Time((long) (-1));
        time13.setLenient(true);
        time13.add(4, 100);
        time13.setTime(0, (int) (byte) 1, (int) '#');
        int int23 = time13.getSecond();
        int int24 = time1.getMonthIntervalFrom(time13);
        com.github.swiftech.swifttime.Time time30 = new com.github.swiftech.swifttime.Time(10, (int) (short) -1, 11, (-1030177009), 4);
        com.github.swiftech.swifttime.Time time32 = time30.increaseHours((int) (short) 100);
        com.github.swiftech.swifttime.Time time34 = new com.github.swiftech.swifttime.Time((long) (-1));
        time34.setLenient(true);
        int int38 = time34.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time39 = time34.increaseDate();
        com.github.swiftech.swifttime.Time time40 = time34.increaseWeek();
        int int41 = time40.getFirstDayOfWeek();
        int int42 = time32.getSecondIntervalFrom(time40);
        int int43 = time13.getSecondIntervalFrom(time40);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-62164368000001L) + "'", long11 == (-62164368000001L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 59 + "'", int23 == 59);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(time32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(time39);
        org.junit.Assert.assertNotNull(time40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 487564929 + "'", int42 == 487564929);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-2035517056) + "'", int43 == (-2035517056));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time1.increaseWeek();
        com.github.swiftech.swifttime.Time time9 = new com.github.swiftech.swifttime.Time((long) (-1));
        time9.setLenient(true);
        com.github.swiftech.swifttime.Time time12 = null;
        int int13 = time9.getYearIntervalFrom(time12);
        com.github.swiftech.swifttime.Time time15 = new com.github.swiftech.swifttime.Time((long) (-1));
        time15.setLenient(true);
        com.github.swiftech.swifttime.Time time18 = null;
        int int19 = time15.getYearIntervalFrom(time18);
        int int20 = time9.getHourIntervalTo(time15);
        time9.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        int int28 = time1.getMinuteIntervalTo(time9);
        com.github.swiftech.swifttime.Time time30 = new com.github.swiftech.swifttime.Time((long) (-1));
        time30.setLenient(true);
        com.github.swiftech.swifttime.Time time34 = new com.github.swiftech.swifttime.Time((long) (-1));
        time34.setLenient(true);
        com.github.swiftech.swifttime.Time time37 = null;
        int int38 = time34.getYearIntervalFrom(time37);
        com.github.swiftech.swifttime.Time time40 = new com.github.swiftech.swifttime.Time((long) (-1));
        time40.setLenient(true);
        com.github.swiftech.swifttime.Time time43 = null;
        int int44 = time40.getYearIntervalFrom(time43);
        int int45 = time34.getHourIntervalTo(time40);
        int int46 = time30.getDayIntervalFrom(time40);
        int int47 = time9.getMinuteIntervalFrom(time40);
        java.time.ZonedDateTime zonedDateTime48 = time40.toZonedDateTime();
        java.util.GregorianCalendar gregorianCalendar49 = java.util.GregorianCalendar.from(zonedDateTime48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1030177009) + "'", int28 == (-1030177009));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1030165489) + "'", int47 == (-1030165489));
        org.junit.Assert.assertNotNull(zonedDateTime48);
        org.junit.Assert.assertNotNull(gregorianCalendar49);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.github.swiftech.swifttime.Time time4 = new com.github.swiftech.swifttime.Time((int) (byte) 1, 6, (int) (byte) 10, (-3097));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(10, (int) (short) -1, 11, (-1030177009), 4);
        com.github.swiftech.swifttime.Time time7 = time5.increaseHours((int) (short) 100);
        com.github.swiftech.swifttime.Time time8 = time5.setToFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time10 = new com.github.swiftech.swifttime.Time((long) (-1));
        time10.setLenient(true);
        com.github.swiftech.swifttime.Time time13 = null;
        int int14 = time10.getYearIntervalFrom(time13);
        com.github.swiftech.swifttime.Time time16 = new com.github.swiftech.swifttime.Time((long) (-1));
        time16.setLenient(true);
        com.github.swiftech.swifttime.Time time19 = null;
        int int20 = time16.getYearIntervalFrom(time19);
        int int21 = time10.getHourIntervalTo(time16);
        time10.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time29 = time10.getFirstDayOfCurrentWeek();
        time10.setFirstDayOfWeek((int) '#');
        com.github.swiftech.swifttime.Time time32 = time10.truncateAtDate();
        time10.clear();
        com.github.swiftech.swifttime.Time time35 = new com.github.swiftech.swifttime.Time((long) (-1));
        time35.setLenient(true);
        com.github.swiftech.swifttime.Time time38 = null;
        int int39 = time35.getYearIntervalFrom(time38);
        com.github.swiftech.swifttime.Time time41 = new com.github.swiftech.swifttime.Time((long) (-1));
        time41.setLenient(true);
        com.github.swiftech.swifttime.Time time44 = null;
        int int45 = time41.getYearIntervalFrom(time44);
        int int46 = time35.getHourIntervalTo(time41);
        time35.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time55 = new com.github.swiftech.swifttime.Time((long) (-1));
        time55.setLenient(true);
        int int59 = time55.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time60 = time55.increaseDate();
        com.github.swiftech.swifttime.Time time61 = time55.increaseWeek();
        int int62 = time35.getMonthIntervalFrom(time55);
        com.github.swiftech.swifttime.Time time63 = time55.truncateAtDate();
        com.github.swiftech.swifttime.Time time65 = new com.github.swiftech.swifttime.Time((long) (-1));
        time65.setLenient(true);
        int int69 = time65.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time70 = time65.increaseDate();
        com.github.swiftech.swifttime.Time time71 = time65.increaseWeek();
        int int72 = time71.getWeeksInWeekYear();
        com.github.swiftech.swifttime.Time time73 = time71.increaseHour();
        boolean boolean74 = time55.before((java.lang.Object) time73);
        time55.setHour(6);
        int int77 = time10.getHourIntervalTo(time55);
        int int78 = time5.getHourIntervalFrom(time10);
        com.github.swiftech.swifttime.Time time79 = new com.github.swiftech.swifttime.Time();
        com.github.swiftech.swifttime.Time time80 = time79.truncateAtHour();
        com.github.swiftech.swifttime.Time time82 = time79.increaseWeeks(0);
        int int83 = time5.getMinuteIntervalFrom(time79);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertNotNull(time8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(time29);
        org.junit.Assert.assertNotNull(time32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 3 + "'", int59 == 3);
        org.junit.Assert.assertNotNull(time60);
        org.junit.Assert.assertNotNull(time61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-23505) + "'", int62 == (-23505));
        org.junit.Assert.assertNotNull(time63);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
        org.junit.Assert.assertNotNull(time70);
        org.junit.Assert.assertNotNull(time71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 52 + "'", int72 == 52);
        org.junit.Assert.assertNotNull(time73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 174 + "'", int77 == 174);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1047359301) + "'", int78 == (-1047359301));
        org.junit.Assert.assertNotNull(time80);
        org.junit.Assert.assertNotNull(time82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1554638524 + "'", int83 == 1554638524);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(10, (int) (short) -1, 11, (-1030177009), 4);
        com.github.swiftech.swifttime.Time time7 = time5.increaseHours((int) (short) 100);
        com.github.swiftech.swifttime.Time time9 = new com.github.swiftech.swifttime.Time((long) (-1));
        time9.setLenient(true);
        int int13 = time9.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time14 = time9.increaseDate();
        com.github.swiftech.swifttime.Time time15 = time9.increaseWeek();
        int int16 = time15.getSecond();
        int int17 = time5.getDayIntervalTo(time15);
        com.github.swiftech.swifttime.Time time18 = time15.increaseYear();
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(time14);
        org.junit.Assert.assertNotNull(time15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 59 + "'", int16 == 59);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 43639973 + "'", int17 == 43639973);
        org.junit.Assert.assertNotNull(time18);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(1, (int) 'a', (-1030177009), (int) (byte) 0, 8);
        time5.setTime(14, (-1030177009), 100);
        com.github.swiftech.swifttime.Time time10 = new com.github.swiftech.swifttime.Time((java.util.Calendar) time5);
        com.github.swiftech.swifttime.Time time11 = time5.increaseWeek();
        time11.set((-35), (int) (byte) 100, 7);
        org.junit.Assert.assertNotNull(time11);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time21 = time1.truncateAtSecond();
        com.github.swiftech.swifttime.Time time22 = time21.getFirstDayOfCurrentWeek();
        java.time.Instant instant23 = time21.toInstant();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(time21);
        org.junit.Assert.assertNotNull(time22);
        org.junit.Assert.assertNotNull(instant23);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.github.swiftech.swifttime.Time time6 = new com.github.swiftech.swifttime.Time(23504, (int) (short) 1, (int) (short) -1, (-1030165489), 13, 7);
        int int7 = time6.getHour();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 23 + "'", int7 == 23);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.github.swiftech.swifttime.Time time6 = new com.github.swiftech.swifttime.Time((-28299900), 8, (-28299900), 14, 12, 43639973);
    }

    @Test
    public void test226() throws Throwable {
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
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1582-10-04 18:0004-00- 00100018100000_00181000:00:-0410001800-1000:18 1018001800:00_00-15821000:1810_::0010001969-12-31 18:0031-01- 01120118120001_01181200:01:-31-15820010001969-12-31 18:0031-01- 01120118120001_01181200:01:-31" + "'", str22, "1582-10-04 18:0004-00- 00100018100000_00181000:00:-0410001800-1000:18 1018001800:00_00-15821000:1810_::0010001969-12-31 18:0031-01- 01120118120001_01181200:01:-31-15820010001969-12-31 18:0031-01- 01120118120001_01181200:01:-31");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.github.swiftech.swifttime.Time time3 = new com.github.swiftech.swifttime.Time((-1030165489), 604800, 32769);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time21 = time1.truncateAtSecond();
        com.github.swiftech.swifttime.Time time23 = new com.github.swiftech.swifttime.Time((long) (-1));
        time23.setLenient(true);
        int int27 = time23.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time28 = time23.increaseDate();
        int int29 = time21.getYearIntervalFrom(time28);
        com.github.swiftech.swifttime.Time time30 = time28.increaseYear();
        com.github.swiftech.swifttime.Time time32 = new com.github.swiftech.swifttime.Time((long) (-1));
        time32.setLenient(true);
        com.github.swiftech.swifttime.Time time35 = null;
        int int36 = time32.getYearIntervalFrom(time35);
        com.github.swiftech.swifttime.Time time38 = new com.github.swiftech.swifttime.Time((long) (-1));
        time38.setLenient(true);
        com.github.swiftech.swifttime.Time time41 = null;
        int int42 = time38.getYearIntervalFrom(time41);
        int int43 = time32.getHourIntervalTo(time38);
        time32.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time51 = time32.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time52 = time32.truncateAtSecond();
        com.github.swiftech.swifttime.Time time54 = new com.github.swiftech.swifttime.Time((long) (-1));
        time54.setLenient(true);
        int int58 = time54.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time59 = time54.increaseDate();
        int int60 = time52.getYearIntervalFrom(time59);
        com.github.swiftech.swifttime.Time time62 = time52.increaseSeconds((int) '#');
        int int63 = time30.getWeekIntervalFrom(time52);
        com.github.swiftech.swifttime.Time time64 = time52.truncateAtMonth();
        com.github.swiftech.swifttime.Time time65 = null;
        int int66 = time52.getHourIntervalTo(time65);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(time21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(time28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1959) + "'", int29 == (-1959));
        org.junit.Assert.assertNotNull(time30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(time51);
        org.junit.Assert.assertNotNull(time52);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertNotNull(time59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1959) + "'", int60 == (-1959));
        org.junit.Assert.assertNotNull(time62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 102251 + "'", int63 == 102251);
        org.junit.Assert.assertNotNull(time64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        java.time.Instant instant6 = time1.toInstant();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(instant6);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time6.truncateAtSecond();
        int int8 = time7.getDate();
        time7.setDate((-3097));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(1, (int) 'a', (-1030177009), (int) (byte) 0, 8);
        time5.setTime(14, (-1030177009), 100);
        com.github.swiftech.swifttime.Time time10 = new com.github.swiftech.swifttime.Time((java.util.Calendar) time5);
        com.github.swiftech.swifttime.Time time11 = time5.increaseWeek();
        com.github.swiftech.swifttime.Time time12 = time5.truncateAtWeek();
        com.github.swiftech.swifttime.Time time13 = time12.setToLastDayOfCurrentWeek();
        time12.setMinimalDaysInFirstWeek(0);
        org.junit.Assert.assertNotNull(time11);
        org.junit.Assert.assertNotNull(time12);
        org.junit.Assert.assertNotNull(time13);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time8 = time1.increaseDates((int) '#');
        com.github.swiftech.swifttime.Time time9 = time1.truncateAtWeek();
        int int10 = time1.getMonth();
        time1.clear();
        int int12 = time1.getDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time8);
        org.junit.Assert.assertNotNull(time9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        int int7 = time1.getActualMaximum(0);
        long long8 = time1.getTimeInMillis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time21 = time1.truncateAtSecond();
        com.github.swiftech.swifttime.Time time23 = new com.github.swiftech.swifttime.Time((long) (-1));
        time23.setLenient(true);
        int int27 = time23.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time28 = time23.increaseDate();
        int int29 = time21.getYearIntervalFrom(time28);
        com.github.swiftech.swifttime.Time time30 = time28.increaseYear();
        com.github.swiftech.swifttime.Time time32 = new com.github.swiftech.swifttime.Time((long) (-1));
        time32.setLenient(true);
        com.github.swiftech.swifttime.Time time35 = null;
        int int36 = time32.getYearIntervalFrom(time35);
        com.github.swiftech.swifttime.Time time38 = new com.github.swiftech.swifttime.Time((long) (-1));
        time38.setLenient(true);
        com.github.swiftech.swifttime.Time time41 = null;
        int int42 = time38.getYearIntervalFrom(time41);
        int int43 = time32.getHourIntervalTo(time38);
        time32.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time51 = time32.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time52 = time32.truncateAtSecond();
        com.github.swiftech.swifttime.Time time54 = new com.github.swiftech.swifttime.Time((long) (-1));
        time54.setLenient(true);
        int int58 = time54.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time59 = time54.increaseDate();
        int int60 = time52.getYearIntervalFrom(time59);
        com.github.swiftech.swifttime.Time time62 = time52.increaseSeconds((int) '#');
        int int63 = time30.getWeekIntervalFrom(time52);
        com.github.swiftech.swifttime.Time time64 = time52.getLastDayOfCurrentWeek();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(time21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(time28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1959) + "'", int29 == (-1959));
        org.junit.Assert.assertNotNull(time30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(time51);
        org.junit.Assert.assertNotNull(time52);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertNotNull(time59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1959) + "'", int60 == (-1959));
        org.junit.Assert.assertNotNull(time62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 102251 + "'", int63 == 102251);
        org.junit.Assert.assertNotNull(time64);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time1.getMonthIntervalFrom(time21);
        com.github.swiftech.swifttime.Time time29 = time21.truncateAtDate();
        int int30 = com.github.swiftech.swifttime.Time.getDaysOfMonth(time21);
        int int31 = time21.getHour();
        boolean boolean32 = time21.isWorkingDay();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-23505) + "'", int28 == (-23505));
        org.junit.Assert.assertNotNull(time29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 28 + "'", int30 == 28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        int int21 = time1.getWeekYear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11 + "'", int21 == 11);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time8 = new com.github.swiftech.swifttime.Time((long) (-1));
        time8.setLenient(true);
        com.github.swiftech.swifttime.Time time11 = null;
        int int12 = time8.getYearIntervalFrom(time11);
        com.github.swiftech.swifttime.Time time14 = new com.github.swiftech.swifttime.Time((long) (-1));
        time14.setLenient(true);
        com.github.swiftech.swifttime.Time time17 = null;
        int int18 = time14.getYearIntervalFrom(time17);
        int int19 = time8.getHourIntervalTo(time14);
        time8.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time28 = new com.github.swiftech.swifttime.Time((long) (-1));
        time28.setLenient(true);
        int int32 = time28.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time33 = time28.increaseDate();
        com.github.swiftech.swifttime.Time time34 = time28.increaseWeek();
        int int35 = time8.getMonthIntervalFrom(time28);
        time28.clear((int) (byte) 1);
        com.github.swiftech.swifttime.Time time38 = time28.getLastDayOfCurrentWeek();
        int int39 = time6.compareTo((java.util.Calendar) time28);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(time33);
        org.junit.Assert.assertNotNull(time34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-23505) + "'", int35 == (-23505));
        org.junit.Assert.assertNotNull(time38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_SECOND_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder1 = timeFormatBuilder0.minus();
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_SECOND_MINUS = timeFormatBuilder0;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder3 = timeFormatBuilder0.hour();
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder1);
        org.junit.Assert.assertNotNull(timeFormatBuilder3);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time((long) (-1));
        time5.setLenient(true);
        com.github.swiftech.swifttime.Time time8 = null;
        int int9 = time5.getYearIntervalFrom(time8);
        com.github.swiftech.swifttime.Time time11 = new com.github.swiftech.swifttime.Time((long) (-1));
        time11.setLenient(true);
        com.github.swiftech.swifttime.Time time14 = null;
        int int15 = time11.getYearIntervalFrom(time14);
        int int16 = time5.getHourIntervalTo(time11);
        int int17 = time1.getDayIntervalFrom(time11);
        com.github.swiftech.swifttime.Time time18 = time1.setToFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time19 = time1.increaseYear();
        boolean boolean21 = time19.equals((java.lang.Object) 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(time18);
        org.junit.Assert.assertNotNull(time19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time1.getMonthIntervalFrom(time21);
        com.github.swiftech.swifttime.Time time29 = time21.truncateAtDate();
        com.github.swiftech.swifttime.Time time31 = new com.github.swiftech.swifttime.Time((long) (-1));
        time31.setLenient(true);
        int int35 = time31.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time36 = time31.increaseDate();
        com.github.swiftech.swifttime.Time time37 = time31.increaseWeek();
        int int38 = time37.getWeeksInWeekYear();
        com.github.swiftech.swifttime.Time time39 = time37.increaseHour();
        boolean boolean40 = time21.before((java.lang.Object) time39);
        time21.setHour(6);
        int int43 = time21.getMonth();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-23505) + "'", int28 == (-23505));
        org.junit.Assert.assertNotNull(time29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(time36);
        org.junit.Assert.assertNotNull(time37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertNotNull(time39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_TIME_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_SECOND_MINUS = timeFormatBuilder0;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder2 = timeFormatBuilder0.second();
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder3 = timeFormatBuilder0.second();
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder2);
        org.junit.Assert.assertNotNull(timeFormatBuilder3);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        boolean boolean4 = time1.isWorkingDay();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time1.getMonthIntervalFrom(time21);
        java.lang.String str29 = time1.getCalendarType();
        boolean boolean30 = time1.isWeekDateSupported();
        com.github.swiftech.swifttime.Time time31 = time1.setToLastDayOfCurrentWeek();
        time1.setLenient(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-23505) + "'", int28 == (-23505));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "gregory" + "'", str29, "gregory");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(time31);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time21 = time1.truncateAtSecond();
        com.github.swiftech.swifttime.Time time23 = new com.github.swiftech.swifttime.Time((long) (-1));
        time23.setLenient(true);
        int int27 = time23.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time28 = time23.increaseDate();
        int int29 = time21.getYearIntervalFrom(time28);
        com.github.swiftech.swifttime.Time time30 = time28.increaseYear();
        com.github.swiftech.swifttime.Time time32 = time30.increaseWeeks((int) 'a');
        time30.add(7, 32772);
        time30.clear(10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(time21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(time28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1959) + "'", int29 == (-1959));
        org.junit.Assert.assertNotNull(time30);
        org.junit.Assert.assertNotNull(time32);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time1.getMonthIntervalFrom(time21);
        java.lang.String str29 = time1.getCalendarType();
        com.github.swiftech.swifttime.Time time30 = time1.truncateAtHour();
        com.github.swiftech.swifttime.Time time32 = new com.github.swiftech.swifttime.Time((long) (-1));
        boolean boolean34 = time32.before((java.lang.Object) false);
        boolean boolean35 = time32.isRestDay();
        int int36 = time1.getYearIntervalFrom(time32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-23505) + "'", int28 == (-23505));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "gregory" + "'", str29, "gregory");
        org.junit.Assert.assertNotNull(time30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1958) + "'", int36 == (-1958));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(10, (int) (short) -1, 11, (-1030177009), 4);
        time5.setMonth(3);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        com.github.swiftech.swifttime.Time time4 = new com.github.swiftech.swifttime.Time(1, 12, (-1030165489), 23504);
        com.github.swiftech.swifttime.Time time5 = time4.getLastDayOfCurrentWeek();
        org.junit.Assert.assertNotNull(time5);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time1.getMonthIntervalFrom(time21);
        java.lang.String str29 = time1.getCalendarType();
        com.github.swiftech.swifttime.Time time30 = time1.truncateAtHour();
        com.github.swiftech.swifttime.Time time32 = new com.github.swiftech.swifttime.Time((long) (-1));
        time32.setLenient(true);
        com.github.swiftech.swifttime.Time time35 = null;
        int int36 = time32.getYearIntervalFrom(time35);
        int int37 = time1.getMonthIntervalTo(time32);
        com.github.swiftech.swifttime.Time time39 = new com.github.swiftech.swifttime.Time((long) (-1));
        time39.setLenient(true);
        int int43 = time39.getLeastMaximum(4);
        boolean boolean44 = time1.equals((java.lang.Object) time39);
        boolean boolean45 = time39.isLenient();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-23505) + "'", int28 == (-23505));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "gregory" + "'", str29, "gregory");
        org.junit.Assert.assertNotNull(time30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 23504 + "'", int37 == 23504);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(1, (int) 'a', (-1030177009), (int) (byte) 0, 8);
        time5.setTime(14, (-1030177009), 100);
        com.github.swiftech.swifttime.Time time10 = new com.github.swiftech.swifttime.Time((java.util.Calendar) time5);
        com.github.swiftech.swifttime.Time time11 = time5.increaseWeek();
        com.github.swiftech.swifttime.Time time12 = time5.truncateAtWeek();
        com.github.swiftech.swifttime.Time time13 = time12.setToLastDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time19 = new com.github.swiftech.swifttime.Time(10, (int) (short) -1, 11, (-1030177009), 4);
        com.github.swiftech.swifttime.Time time21 = time19.increaseHours((int) (short) 100);
        int int22 = time13.getHourIntervalFrom(time21);
        org.junit.Assert.assertNotNull(time11);
        org.junit.Assert.assertNotNull(time12);
        org.junit.Assert.assertNotNull(time13);
        org.junit.Assert.assertNotNull(time21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 105186781 + "'", int22 == 105186781);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.github.swiftech.swifttime.Time time3 = new com.github.swiftech.swifttime.Time(1202077121, (int) (byte) 1, 102786);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        time1.add(4, 100);
        int int7 = time1.getMonth();
        java.lang.String str8 = time1.toString();
        com.github.swiftech.swifttime.Time time9 = time1.getFirstDayOfCurrentWeek();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Wed Dec 01 17:59:59 CST 1971" + "'", str8, "Wed Dec 01 17:59:59 CST 1971");
        org.junit.Assert.assertNotNull(time9);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(1, (int) 'a', (-1030177009), (int) (byte) 0, 8);
        time5.setTime(14, (-1030177009), 100);
        com.github.swiftech.swifttime.Time time10 = new com.github.swiftech.swifttime.Time((java.util.Calendar) time5);
        int int11 = time10.getMinute();
        com.github.swiftech.swifttime.Time time17 = new com.github.swiftech.swifttime.Time(10, (int) (short) -1, 11, (-1030177009), 4);
        com.github.swiftech.swifttime.Time time19 = time17.increaseHours((int) (short) 100);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time27.getFirstDayOfWeek();
        int int29 = time19.getSecondIntervalFrom(time27);
        int int30 = time27.getWeekYear();
        int int31 = time10.getSecondIntervalFrom(time27);
        com.github.swiftech.swifttime.Time time32 = time27.getLastDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time34 = new com.github.swiftech.swifttime.Time((long) (-1));
        time34.setLenient(true);
        com.github.swiftech.swifttime.Time time37 = null;
        int int38 = time34.getYearIntervalFrom(time37);
        com.github.swiftech.swifttime.Time time40 = new com.github.swiftech.swifttime.Time((long) (-1));
        time40.setLenient(true);
        com.github.swiftech.swifttime.Time time43 = null;
        int int44 = time40.getYearIntervalFrom(time43);
        int int45 = time34.getHourIntervalTo(time40);
        time34.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time54 = new com.github.swiftech.swifttime.Time((long) (-1));
        time54.setLenient(true);
        int int58 = time54.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time59 = time54.increaseDate();
        com.github.swiftech.swifttime.Time time60 = time54.increaseWeek();
        int int61 = time34.getMonthIntervalFrom(time54);
        java.lang.String str62 = time34.getCalendarType();
        int int63 = time27.getYearIntervalTo(time34);
        time34.set(52, (int) (byte) -1, 0, 52, 1);
        int int70 = time34.getMonth();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(time19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 487564929 + "'", int29 == 487564929);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1202077121 + "'", int31 == 1202077121);
        org.junit.Assert.assertNotNull(time32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertNotNull(time59);
        org.junit.Assert.assertNotNull(time60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-23505) + "'", int61 == (-23505));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "gregory" + "'", str62, "gregory");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1959) + "'", int63 == (-1959));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 12 + "'", int70 == 12);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_TIME_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_SECOND_MINUS = timeFormatBuilder0;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder2 = timeFormatBuilder0.underscore();
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder2);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_TIME_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_MINUS = timeFormatBuilder0;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder2 = timeFormatBuilder0.month();
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder3 = timeFormatBuilder2.year();
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder2);
        org.junit.Assert.assertNotNull(timeFormatBuilder3);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time((long) (-1));
        time5.setLenient(true);
        time5.add(4, 100);
        time5.setTime(0, (int) (byte) 1, (int) '#');
        long long15 = time5.getTimeInMillis();
        com.github.swiftech.swifttime.Time time16 = time5.setToLastDayOfCurrentWeek();
        int int17 = time1.getSecondIntervalTo(time16);
        com.github.swiftech.swifttime.Time time18 = time16.getFirstDayOfCurrentWeek();
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-62164368000001L) + "'", long15 == (-62164368000001L));
        org.junit.Assert.assertNotNull(time16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2034566656) + "'", int17 == (-2034566656));
        org.junit.Assert.assertNotNull(time18);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        time1.add(4, 100);
        time1.setTime(0, (int) (byte) 1, (int) '#');
        int int11 = time1.getDate();
        com.github.swiftech.swifttime.Time time12 = time1.truncateAtHour();
        com.github.swiftech.swifttime.Time time14 = time1.increaseMinutes(12960);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(time12);
        org.junit.Assert.assertNotNull(time14);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        time1.setFirstDayOfWeek((int) '#');
        com.github.swiftech.swifttime.Time time23 = time1.truncateAtMinute();
        time1.setDate(17);
        time1.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(time23);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        time1.clear(8);
        com.github.swiftech.swifttime.Time time8 = time1.truncateAtMinute();
        com.github.swiftech.swifttime.Time time10 = time8.increaseDates(0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = time10.getActualMinimum((-336));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -336");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(time8);
        org.junit.Assert.assertNotNull(time10);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_TIME_STAMP;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder1 = timeFormatBuilder0.minute();
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder2 = timeFormatBuilder1.month();
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder1);
        org.junit.Assert.assertNotNull(timeFormatBuilder2);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time1.getMonthIntervalFrom(time21);
        java.lang.String str29 = time1.getCalendarType();
        com.github.swiftech.swifttime.Time time30 = time1.getLastDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time31 = new com.github.swiftech.swifttime.Time((java.util.Calendar) time1);
        boolean boolean32 = time31.isWeekDateSupported();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-23505) + "'", int28 == (-23505));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "gregory" + "'", str29, "gregory");
        org.junit.Assert.assertNotNull(time30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(1, (int) 'a', (-1030177009), (int) (byte) 0, 8);
        time5.setTime(14, (-1030177009), 100);
        com.github.swiftech.swifttime.Time time10 = new com.github.swiftech.swifttime.Time((java.util.Calendar) time5);
        time10.setHour(1202077121);
        com.github.swiftech.swifttime.Time time14 = new com.github.swiftech.swifttime.Time((long) (-1));
        time14.setLenient(true);
        com.github.swiftech.swifttime.Time time17 = null;
        int int18 = time14.getYearIntervalFrom(time17);
        com.github.swiftech.swifttime.Time time20 = new com.github.swiftech.swifttime.Time((long) (-1));
        time20.setLenient(true);
        com.github.swiftech.swifttime.Time time23 = null;
        int int24 = time20.getYearIntervalFrom(time23);
        int int25 = time14.getHourIntervalTo(time20);
        time14.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time34 = new com.github.swiftech.swifttime.Time((long) (-1));
        time34.setLenient(true);
        int int38 = time34.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time39 = time34.increaseDate();
        com.github.swiftech.swifttime.Time time40 = time34.increaseWeek();
        int int41 = time14.getMonthIntervalFrom(time34);
        time34.clear((int) (byte) 1);
        int int44 = time34.getMinute();
        com.github.swiftech.swifttime.Time time46 = new com.github.swiftech.swifttime.Time((long) (-1));
        time46.setLenient(true);
        int int50 = time46.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time51 = time46.increaseDate();
        com.github.swiftech.swifttime.Time time53 = time46.increaseDates((int) '#');
        int int54 = time34.getWeekIntervalFrom(time53);
        int int55 = time10.getMonthIntervalFrom(time53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(time39);
        org.junit.Assert.assertNotNull(time40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-23505) + "'", int41 == (-23505));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 59 + "'", int44 == 59);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertNotNull(time51);
        org.junit.Assert.assertNotNull(time53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-4) + "'", int54 == (-4));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1028507670 + "'", int55 == 1028507670);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time21 = time1.truncateAtSecond();
        com.github.swiftech.swifttime.Time time23 = new com.github.swiftech.swifttime.Time((long) (-1));
        time23.setLenient(true);
        int int27 = time23.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time28 = time23.increaseDate();
        int int29 = time21.getYearIntervalFrom(time28);
        com.github.swiftech.swifttime.Time time30 = time28.increaseYear();
        com.github.swiftech.swifttime.Time time31 = time30.increaseMinute();
        time30.setLenient(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(time21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(time28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1959) + "'", int29 == (-1959));
        org.junit.Assert.assertNotNull(time30);
        org.junit.Assert.assertNotNull(time31);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time21 = time1.truncateAtSecond();
        com.github.swiftech.swifttime.Time time22 = time1.increaseMinute();
        int int23 = time1.getHour();
        com.github.swiftech.swifttime.Time time24 = time1.increaseSecond();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = time24.getMinimum((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(time21);
        org.junit.Assert.assertNotNull(time22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(time24);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(1, (int) 'a', (-1030177009), (int) (byte) 0, 8);
        time5.setTime(14, (-1030177009), 100);
        com.github.swiftech.swifttime.Time time10 = new com.github.swiftech.swifttime.Time((java.util.Calendar) time5);
        int int11 = time10.getMinute();
        long long12 = time10.getTimeInMillis();
        com.github.swiftech.swifttime.Time time13 = time10.increaseMinute();
        boolean boolean14 = time10.isWorkingDay();
        long long15 = time10.getTimeInMillis();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-2709221217875520000L) + "'", long12 == (-2709221217875520000L));
        org.junit.Assert.assertNotNull(time13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-2709221217875460000L) + "'", long15 == (-2709221217875460000L));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        int int8 = time6.getGreatestMinimum(0);
        int int9 = time6.getDaysOfCurrentMonth();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 28 + "'", int9 == 28);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        time1.setFirstDayOfWeek((int) '#');
        com.github.swiftech.swifttime.Time time23 = time1.truncateAtMinute();
        int int25 = time1.getMaximum((int) (short) 0);
        com.github.swiftech.swifttime.Time time26 = time1.truncateAtMonth();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = time1.isSet(1681078455);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1681078455");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(time23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(time26);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        java.time.ZonedDateTime zonedDateTime7 = time6.toZonedDateTime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(zonedDateTime7);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        com.github.swiftech.swifttime.Time time6 = new com.github.swiftech.swifttime.Time(9, (-678378847), (-1047359301), 13, (int) (short) -1, 5);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_TIME_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_SECOND_MINUS = timeFormatBuilder0;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder2 = timeFormatBuilder0.second();
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder3 = timeFormatBuilder2.hour();
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder4 = timeFormatBuilder2.minute();
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder5 = timeFormatBuilder4.day();
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder2);
        org.junit.Assert.assertNotNull(timeFormatBuilder3);
        org.junit.Assert.assertNotNull(timeFormatBuilder4);
        org.junit.Assert.assertNotNull(timeFormatBuilder5);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time20 = time1.getFirstDayOfCurrentWeek();
        time1.setFirstDayOfWeek((int) '#');
        com.github.swiftech.swifttime.Time time23 = time1.truncateAtMinute();
        int int25 = time1.getMaximum((int) (short) 0);
        com.github.swiftech.swifttime.Time time26 = time1.truncateAtMonth();
        com.github.swiftech.swifttime.Time time27 = time26.truncateAtSecond();
        int int28 = time27.getHour();
        int int29 = time27.getDaysOfCurrentMonth();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(time20);
        org.junit.Assert.assertNotNull(time23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 30 + "'", int29 == 30);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        com.github.swiftech.swifttime.Time time4 = new com.github.swiftech.swifttime.Time(100, 0, (-85846102), (-4));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        time1.add(4, 100);
        time1.setTime(0, (int) (byte) 1, (int) '#');
        int int11 = time1.getDate();
        com.github.swiftech.swifttime.Time time12 = time1.truncateAtHour();
        com.github.swiftech.swifttime.Time time14 = new com.github.swiftech.swifttime.Time((long) (-1));
        time14.setLenient(true);
        int int18 = time14.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time19 = time14.increaseDate();
        com.github.swiftech.swifttime.Time time21 = time14.increaseDates((int) '#');
        time14.setTime(0, 23504, 4);
        time14.setTimeInMillis((long) 52);
        java.util.Date date28 = time14.getGregorianChange();
        time1.setTime(date28);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(time12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(time19);
        org.junit.Assert.assertNotNull(time21);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Oct 04 18:00:00 CST 1582");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(1, (int) 'a', (-1030177009), (int) (byte) 0, 8);
        time5.setTime(14, (-1030177009), 100);
        com.github.swiftech.swifttime.Time time10 = new com.github.swiftech.swifttime.Time((java.util.Calendar) time5);
        int int11 = time10.getMinute();
        com.github.swiftech.swifttime.Time time17 = new com.github.swiftech.swifttime.Time(10, (int) (short) -1, 11, (-1030177009), 4);
        com.github.swiftech.swifttime.Time time19 = time17.increaseHours((int) (short) 100);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time27.getFirstDayOfWeek();
        int int29 = time19.getSecondIntervalFrom(time27);
        int int30 = time27.getWeekYear();
        int int31 = time10.getSecondIntervalFrom(time27);
        com.github.swiftech.swifttime.Time time32 = time27.getLastDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time34 = new com.github.swiftech.swifttime.Time((long) (-1));
        time34.setLenient(true);
        com.github.swiftech.swifttime.Time time37 = null;
        int int38 = time34.getYearIntervalFrom(time37);
        com.github.swiftech.swifttime.Time time40 = new com.github.swiftech.swifttime.Time((long) (-1));
        time40.setLenient(true);
        com.github.swiftech.swifttime.Time time43 = null;
        int int44 = time40.getYearIntervalFrom(time43);
        int int45 = time34.getHourIntervalTo(time40);
        time34.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time54 = new com.github.swiftech.swifttime.Time((long) (-1));
        time54.setLenient(true);
        int int58 = time54.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time59 = time54.increaseDate();
        com.github.swiftech.swifttime.Time time60 = time54.increaseWeek();
        int int61 = time34.getMonthIntervalFrom(time54);
        java.lang.String str62 = time34.getCalendarType();
        int int63 = time27.getYearIntervalTo(time34);
        boolean boolean64 = time27.isWorkingDay();
        com.github.swiftech.swifttime.Time time66 = new com.github.swiftech.swifttime.Time((long) (-1));
        time66.setLenient(true);
        com.github.swiftech.swifttime.Time time69 = null;
        int int70 = time66.getYearIntervalFrom(time69);
        com.github.swiftech.swifttime.Time time72 = new com.github.swiftech.swifttime.Time((long) (-1));
        time72.setLenient(true);
        com.github.swiftech.swifttime.Time time75 = null;
        int int76 = time72.getYearIntervalFrom(time75);
        int int77 = time66.getHourIntervalTo(time72);
        com.github.swiftech.swifttime.Time time79 = time66.increaseDates((-1));
        int int80 = time27.getMinuteIntervalFrom(time66);
        int int82 = time66.getLeastMaximum(8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(time19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 487564929 + "'", int29 == 487564929);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1202077121 + "'", int31 == 1202077121);
        org.junit.Assert.assertNotNull(time32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertNotNull(time59);
        org.junit.Assert.assertNotNull(time60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-23505) + "'", int61 == (-23505));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "gregory" + "'", str62, "gregory");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1959) + "'", int63 == (-1959));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(time79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 12960 + "'", int80 == 12960);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 3 + "'", int82 == 3);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        com.github.swiftech.swifttime.Time time6 = new com.github.swiftech.swifttime.Time(0, 12, (-23505), (int) '4', (int) '#', 487564929);
        com.github.swiftech.swifttime.Time time8 = time6.increaseMinutes(31);
        org.junit.Assert.assertNotNull(time8);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time((long) (-1));
        time5.setLenient(true);
        com.github.swiftech.swifttime.Time time8 = null;
        int int9 = time5.getYearIntervalFrom(time8);
        com.github.swiftech.swifttime.Time time11 = new com.github.swiftech.swifttime.Time((long) (-1));
        time11.setLenient(true);
        com.github.swiftech.swifttime.Time time14 = null;
        int int15 = time11.getYearIntervalFrom(time14);
        int int16 = time5.getHourIntervalTo(time11);
        int int17 = time1.getDayIntervalFrom(time11);
        com.github.swiftech.swifttime.Time time18 = time1.setToFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time19 = time1.clone();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(time18);
        org.junit.Assert.assertNotNull(time19);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_TIME_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_MINUS = timeFormatBuilder0;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder2 = timeFormatBuilder0.month();
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder3 = timeFormatBuilder0.minute();
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder4 = timeFormatBuilder3.colon();
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder5 = timeFormatBuilder4.hour();
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder6 = timeFormatBuilder4.month();
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder7 = timeFormatBuilder6.day();
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder2);
        org.junit.Assert.assertNotNull(timeFormatBuilder3);
        org.junit.Assert.assertNotNull(timeFormatBuilder4);
        org.junit.Assert.assertNotNull(timeFormatBuilder5);
        org.junit.Assert.assertNotNull(timeFormatBuilder6);
        org.junit.Assert.assertNotNull(timeFormatBuilder7);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        com.github.swiftech.swifttime.Time time6 = new com.github.swiftech.swifttime.Time((int) (short) 0, 1202077121, 604800, 52, (-1), 32770);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((java.lang.Long) 100L);
        int int2 = time1.getDate();
        // The following exception was thrown during execution in test generation
        try {
            time1.clear((-3097));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -3097");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        time1.clear(8);
        com.github.swiftech.swifttime.Time time8 = time1.increaseMinute();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(time8);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time((long) (-1));
        time5.setLenient(true);
        com.github.swiftech.swifttime.Time time9 = new com.github.swiftech.swifttime.Time((long) (-1));
        time9.setLenient(true);
        com.github.swiftech.swifttime.Time time12 = null;
        int int13 = time9.getYearIntervalFrom(time12);
        com.github.swiftech.swifttime.Time time15 = new com.github.swiftech.swifttime.Time((long) (-1));
        time15.setLenient(true);
        com.github.swiftech.swifttime.Time time18 = null;
        int int19 = time15.getYearIntervalFrom(time18);
        int int20 = time9.getHourIntervalTo(time15);
        int int21 = time5.getDayIntervalFrom(time15);
        time5.setMinute(5);
        java.time.ZonedDateTime zonedDateTime24 = time5.toZonedDateTime();
        int int25 = time1.getWeekIntervalFrom(time5);
        com.github.swiftech.swifttime.Time time27 = new com.github.swiftech.swifttime.Time((long) (-1));
        time27.setLenient(true);
        int int31 = time27.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time32 = time27.increaseDate();
        com.github.swiftech.swifttime.Time time33 = time27.increaseWeek();
        time27.setTime(1970, 8, (int) (byte) -1, (int) (short) -1, 12, 16);
        int int41 = time1.getMinuteIntervalFrom(time27);
        com.github.swiftech.swifttime.Time time43 = new com.github.swiftech.swifttime.Time((long) (-1));
        time43.setLenient(true);
        com.github.swiftech.swifttime.Time time47 = new com.github.swiftech.swifttime.Time((long) (-1));
        time47.setLenient(true);
        com.github.swiftech.swifttime.Time time50 = null;
        int int51 = time47.getYearIntervalFrom(time50);
        com.github.swiftech.swifttime.Time time53 = new com.github.swiftech.swifttime.Time((long) (-1));
        time53.setLenient(true);
        com.github.swiftech.swifttime.Time time56 = null;
        int int57 = time53.getYearIntervalFrom(time56);
        int int58 = time47.getHourIntervalTo(time53);
        int int59 = time43.getDayIntervalFrom(time53);
        com.github.swiftech.swifttime.Time time60 = time43.setToFirstDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time61 = time43.increaseYear();
        int int62 = time1.getSecondIntervalTo(time43);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(zonedDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(time32);
        org.junit.Assert.assertNotNull(time33);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-347293) + "'", int41 == (-347293));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(time60);
        org.junit.Assert.assertNotNull(time61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 31276800 + "'", int62 == 31276800);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time1.increaseWeek();
        com.github.swiftech.swifttime.Time time9 = new com.github.swiftech.swifttime.Time((long) (-1));
        time9.setLenient(true);
        com.github.swiftech.swifttime.Time time12 = null;
        int int13 = time9.getYearIntervalFrom(time12);
        com.github.swiftech.swifttime.Time time15 = new com.github.swiftech.swifttime.Time((long) (-1));
        time15.setLenient(true);
        com.github.swiftech.swifttime.Time time18 = null;
        int int19 = time15.getYearIntervalFrom(time18);
        int int20 = time9.getHourIntervalTo(time15);
        time9.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        int int28 = time1.getMinuteIntervalTo(time9);
        com.github.swiftech.swifttime.Time time30 = new com.github.swiftech.swifttime.Time((long) (-1));
        time30.setLenient(true);
        com.github.swiftech.swifttime.Time time34 = new com.github.swiftech.swifttime.Time((long) (-1));
        time34.setLenient(true);
        com.github.swiftech.swifttime.Time time37 = null;
        int int38 = time34.getYearIntervalFrom(time37);
        com.github.swiftech.swifttime.Time time40 = new com.github.swiftech.swifttime.Time((long) (-1));
        time40.setLenient(true);
        com.github.swiftech.swifttime.Time time43 = null;
        int int44 = time40.getYearIntervalFrom(time43);
        int int45 = time34.getHourIntervalTo(time40);
        int int46 = time30.getDayIntervalFrom(time40);
        int int47 = time9.getMinuteIntervalFrom(time40);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = time9.get((-1030162679));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1030162679");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1030177009) + "'", int28 == (-1030177009));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1030165489) + "'", int47 == (-1030165489));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        time1.add(4, 100);
        com.github.swiftech.swifttime.Time time7 = time1.truncateAtYear();
        java.util.Date date8 = time7.getTime();
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Fri Jan 01 00:00:00 CST 1971");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time7 = new com.github.swiftech.swifttime.Time((long) (-1));
        time7.setLenient(true);
        com.github.swiftech.swifttime.Time time10 = null;
        int int11 = time7.getYearIntervalFrom(time10);
        int int12 = time1.getHourIntervalTo(time7);
        time1.set(3, (int) (short) 100, 0, 1, (int) (byte) 10, 5);
        com.github.swiftech.swifttime.Time time21 = new com.github.swiftech.swifttime.Time((long) (-1));
        time21.setLenient(true);
        int int25 = time21.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time26 = time21.increaseDate();
        com.github.swiftech.swifttime.Time time27 = time21.increaseWeek();
        int int28 = time1.getMonthIntervalFrom(time21);
        com.github.swiftech.swifttime.Time time29 = null;
        int int30 = time21.getWeekIntervalTo(time29);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(time26);
        org.junit.Assert.assertNotNull(time27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-23505) + "'", int28 == (-23505));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_TIME_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_MINUS = timeFormatBuilder0;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder2 = timeFormatBuilder0.month();
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_TIME_MINUS = timeFormatBuilder0;
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder2);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        com.github.swiftech.swifttime.Time time5 = new com.github.swiftech.swifttime.Time(1, (int) 'a', (-1030177009), (int) (byte) 0, 8);
        time5.setTime(14, (-1030177009), 100);
        com.github.swiftech.swifttime.Time time10 = new com.github.swiftech.swifttime.Time((java.util.Calendar) time5);
        com.github.swiftech.swifttime.Time time11 = time5.increaseWeek();
        com.github.swiftech.swifttime.Time time12 = time5.truncateAtSecond();
        com.github.swiftech.swifttime.Time time14 = time5.increaseMonths((-102786));
        java.time.ZonedDateTime zonedDateTime15 = time14.toZonedDateTime();
        org.junit.Assert.assertNotNull(time11);
        org.junit.Assert.assertNotNull(time12);
        org.junit.Assert.assertNotNull(time14);
        org.junit.Assert.assertNotNull(zonedDateTime15);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder0 = com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_TIME_MINUS;
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_MINUS = timeFormatBuilder0;
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder2 = timeFormatBuilder0.month();
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder3 = timeFormatBuilder0.minute();
        com.github.swiftech.swifttime.TimeFormatBuilder timeFormatBuilder4 = timeFormatBuilder3.colon();
        com.github.swiftech.swifttime.TimeFormatBuilder.TIME_FORMAT_BUILDER_DATE_TIME_MINUS = timeFormatBuilder3;
        org.junit.Assert.assertNotNull(timeFormatBuilder0);
        org.junit.Assert.assertNotNull(timeFormatBuilder2);
        org.junit.Assert.assertNotNull(timeFormatBuilder3);
        org.junit.Assert.assertNotNull(timeFormatBuilder4);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time7 = time1.increaseWeek();
        int int8 = time7.getFirstDayOfWeek();
        com.github.swiftech.swifttime.Time time9 = time7.clone();
        com.github.swiftech.swifttime.Time time10 = time9.setToLastDayOfCurrentWeek();
        com.github.swiftech.swifttime.Time time12 = time10.increaseYears((-85846102));
        int int13 = time10.getSecond();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(time9);
        org.junit.Assert.assertNotNull(time10);
        org.junit.Assert.assertNotNull(time12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 59 + "'", int13 == 59);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        com.github.swiftech.swifttime.Time time4 = null;
        int int5 = time1.getYearIntervalFrom(time4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        java.time.Instant instant7 = time1.toInstant();
        com.github.swiftech.swifttime.Time time9 = time1.increaseHours(0);
        com.github.swiftech.swifttime.Time time11 = time1.increaseDates((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = time1.isSet(604800);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(time9);
        org.junit.Assert.assertNotNull(time11);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        com.github.swiftech.swifttime.Time time1 = new com.github.swiftech.swifttime.Time((long) (-1));
        time1.setLenient(true);
        int int5 = time1.getLeastMaximum(4);
        com.github.swiftech.swifttime.Time time6 = time1.increaseDate();
        com.github.swiftech.swifttime.Time time8 = time1.increaseDates((int) '#');
        time1.setTime(0, 23504, 4);
        time1.setTimeInMillis((long) 52);
        java.util.Date date15 = time1.getGregorianChange();
        com.github.swiftech.swifttime.Time time16 = time1.increaseMinute();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(time6);
        org.junit.Assert.assertNotNull(time8);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Oct 04 18:00:00 CST 1582");
        org.junit.Assert.assertNotNull(time16);
    }
}
