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
        net.landzero.xlog.perf.XPerfEvent xPerfEvent0 = new net.landzero.xlog.perf.XPerfEvent();
        java.lang.String str1 = xPerfEvent0.getPath();
        xPerfEvent0.setCrid("");
        xPerfEvent0.setAction("/tmp/xlog.reopen.txt");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        xPerfEvent0.setTopic("");
    }
}

