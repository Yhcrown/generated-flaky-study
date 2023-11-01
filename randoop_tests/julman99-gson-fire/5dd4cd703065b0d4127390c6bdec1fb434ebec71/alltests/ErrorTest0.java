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
        io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter dateUnixtimeSecondsTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter(true);
        com.google.gson.JsonElement jsonElement2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.util.Date date3 = dateUnixtimeSecondsTypeAdapter1.fromJsonTree(jsonElement2);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat0 = new io.gsonfire.util.RFC3339DateFormat();
        boolean boolean2 = rFC3339DateFormat0.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on rFC3339DateFormat0 and rFC3339DateFormat0", rFC3339DateFormat0.equals(rFC3339DateFormat0) ? rFC3339DateFormat0.hashCode() == rFC3339DateFormat0.hashCode() : true);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat2 = new io.gsonfire.util.RFC3339DateFormat(true, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj3 = rFC3339DateFormat2.clone();
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat0 = new io.gsonfire.util.RFC3339DateFormat();
        java.util.Calendar calendar1 = rFC3339DateFormat0.getCalendar();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on rFC3339DateFormat0 and rFC3339DateFormat0", rFC3339DateFormat0.equals(rFC3339DateFormat0) ? rFC3339DateFormat0.hashCode() == rFC3339DateFormat0.hashCode() : true);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat1 = new io.gsonfire.util.RFC3339DateFormat(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj2 = rFC3339DateFormat1.clone();
    }
}

