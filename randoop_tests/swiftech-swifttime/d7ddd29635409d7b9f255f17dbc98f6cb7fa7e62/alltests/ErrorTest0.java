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
        time1.setFirstDayOfWeek((int) ' ');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on time1 and time5", (time1.compareTo(time5) == 0) == time1.equals(time5));
    }
}

