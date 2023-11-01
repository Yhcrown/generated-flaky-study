import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestGroup100Case0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test1");
        com.pojo_unit.RandomObjectFactory randomObjectFactory0 = new com.pojo_unit.RandomObjectFactory();
        java.lang.reflect.Field field1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = randomObjectFactory0.getRandomValueForField(field1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test2");
        com.pojo_unit.RandomObjectFactory randomObjectFactory0 = new com.pojo_unit.RandomObjectFactory();
        java.lang.Class<?> wildcardClass1 = randomObjectFactory0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test4");
        com.pojo_unit.ExceptionTest exceptionTest0 = new com.pojo_unit.ExceptionTest();
        java.lang.Class<?> wildcardClass1 = exceptionTest0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

