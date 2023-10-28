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
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.APPLICATION_VND_APPLE_INSTALLER_XML;
        io.muserver.Headers headers1 = resourceType0.headers();
        org.junit.Assert.assertTrue("Contract failed: headers1.equals(headers1)", headers1.equals(headers1));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        io.muserver.Headers headers0 = io.muserver.Headers.http2Headers();
        org.junit.Assert.assertTrue("Contract failed: headers0.equals(headers0)", headers0.equals(headers0));
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.TEXT_PLAIN;
        io.muserver.Headers headers1 = resourceType0.headers();
        org.junit.Assert.assertTrue("Contract failed: headers1.equals(headers1)", headers1.equals(headers1));
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        io.muserver.Headers headers0 = io.muserver.handlers.ResourceType.noCache();
        org.junit.Assert.assertTrue("Contract failed: headers0.equals(headers0)", headers0.equals(headers0));
    }
}

