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
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = futureSocketChannel0.getPort();
    }
}

