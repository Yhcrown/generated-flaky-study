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
        edu.ksu.canvas.model.User user0 = new edu.ksu.canvas.model.User();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        edu.ksu.canvas.model.User user1 = new edu.ksu.canvas.model.User(user0);
    }
}

