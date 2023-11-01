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
        htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor defaultHtmlToJavaHtmlFlowNodeVisitor1 = new htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultHtmlToJavaHtmlFlowNodeVisitor1.appendFooter();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor defaultHtmlToJavaHtmlFlowNodeVisitor0 = new htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultHtmlToJavaHtmlFlowNodeVisitor0.appendFooter();
    }
}

