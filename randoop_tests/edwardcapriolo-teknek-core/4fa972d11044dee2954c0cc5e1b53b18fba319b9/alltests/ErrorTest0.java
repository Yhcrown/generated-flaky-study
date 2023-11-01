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
        io.teknek.plan.FeedDesc feedDesc0 = new io.teknek.plan.FeedDesc();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.teknek.feed.Feed feed1 = io.teknek.driver.DriverFactory.buildFeed(feedDesc0);
    }
}

