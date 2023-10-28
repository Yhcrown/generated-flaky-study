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
        com.pojo_unit.RandomObjectFactory randomObjectFactory0 = new com.pojo_unit.RandomObjectFactory();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.Object obj2 = randomObjectFactory0.getRandomValueForBasicNamedType("hi!");
    }
}

